#Orientation Changes Sand Pit

Rod Bailey
7 September 2016

#Summary

This is a toy Android application developed to investigate the way that Fragments are destroyed and recreated across changes in device orienation.

It was motivated by a bug I was experiencing in `SonicDx` whereby a dialog (`BlueDialogFragment`), positioned on top of another Fragment (`RedBaseFragment`) would disappear when the device orientation changed. Note that this way of implementing dialogs does **not** make use of nested Fragments. Rather, the dialog fragment and the fragment underneath it (the base Fragment) are both children of the same layout. It's just that the order of definition of the `RedBaseFragment` and `BlueDialogFragment` in the layout file results in the 'BlueDialogFragment' appearing on top of the `RedBaseFragment`. 

##Alernative Approach to Dialogs

An alternative approach (not shown here) is to make the dialog fragment a child of the base fragment, which involves:

* Changing the layout of the app so that the `RedBaseFragment` layout can contain the `BlueBaseFragment`
* Adding the `BlueChildFragment` to the `RedBaseFragment` using `RedBaseFragment.getChildFragmentManager`

We **don't** take that approach here, simply because that is not what was done in `SonicDx`.

##Output
When you press the `Dump` button in the UI, you will get the state of the `FragmentManager` dumped to the console. Doing this before and after a device orientation change gives you some idea of how the various Fragments are being destroyed and recreated across orientation changes.