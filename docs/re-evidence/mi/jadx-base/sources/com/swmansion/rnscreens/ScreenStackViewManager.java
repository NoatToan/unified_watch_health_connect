package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.g9p;
import defpackage.ndj;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = ScreenStackViewManager.REACT_CLASS)
public class ScreenStackViewManager extends ViewGroupManager<ScreenStack> {
    protected static final String REACT_CLASS = "RNSScreenStack";

    private void prepareOutTransition(Screen screen) {
        startTransitionRecursive(screen);
    }

    private void startTransitionRecursive(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            viewGroup.startViewTransition(childAt);
            if (childAt instanceof ViewGroup) {
                startTransitionRecursive((ViewGroup) childAt);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ScreenStack screenStack, View view, int i) {
        if (!(view instanceof Screen)) {
            throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen");
        }
        screenStack.d((Screen) view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ScreenStack createViewInstance(g9p g9pVar) {
        return new ScreenStack(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ScreenStack screenStack, int i) {
        return screenStack.h(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ScreenStack screenStack) {
        return screenStack.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ScreenStack screenStack, int i) {
        prepareOutTransition(screenStack.h(i));
        screenStack.n(i);
    }
}
