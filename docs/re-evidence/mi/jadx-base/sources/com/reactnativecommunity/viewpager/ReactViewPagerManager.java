package com.reactnativecommunity.viewpager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.reactnativepagerview.event.PageScrollEvent;
import com.reactnativepagerview.event.PageScrollStateChangedEvent;
import com.reactnativepagerview.event.PageSelectedEvent;
import defpackage.e4f;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.sk1;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ReactViewPagerManager extends ViewGroupManager<ReactViewPager> {
    private static final int COMMAND_SET_PAGE = 1;
    private static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    private static final String REACT_CLASS = "RNCViewPager";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return e4f.e("setPage", 1, "setPageWithoutAnimation", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.f(PageScrollEvent.EVENT_NAME, e4f.d("registrationName", "onPageScroll"), PageScrollStateChangedEvent.EVENT_NAME, e4f.d("registrationName", "onPageScrollStateChanged"), PageSelectedEvent.EVENT_NAME, e4f.d("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @iej(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, float f) {
        reactViewPager.setPageMargin((int) exh.c(f));
    }

    @iej(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ReactViewPager reactViewPager, View view, int i) {
        reactViewPager.V(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewPager createViewInstance(g9p g9pVar) {
        return new ReactViewPager(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.W(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewPager reactViewPager, int i, ReadableArray readableArray) {
        sk1.c(reactViewPager);
        sk1.c(readableArray);
        if (i == 1) {
            reactViewPager.Y(readableArray.getInt(0), true);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
            }
            reactViewPager.Y(readableArray.getInt(0), false);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        reactViewPager.X(i);
    }
}
