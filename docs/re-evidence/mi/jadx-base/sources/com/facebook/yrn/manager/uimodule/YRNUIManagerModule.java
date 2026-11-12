package com.facebook.yrn.manager.uimodule;

import android.view.View;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.c;
import com.facebook.yrn.manager.YRNReactContainerView;
import com.facebook.yrn.manager.utils.YRNReflectUtils;
import defpackage.ndj;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = UIManagerModule.NAME)
public class YRNUIManagerModule extends UIManagerModule {
    private YRNViewTagMappingManager mManager;
    private YRNEventDispatcher mYRNEventDispatcher;

    public YRNUIManagerModule(YRNViewTagMappingManager yRNViewTagMappingManager, YRNEventDispatcher yRNEventDispatcher, ReactApplicationContext reactApplicationContext, UIManagerModule.f fVar, int i) {
        this(yRNViewTagMappingManager, yRNEventDispatcher, reactApplicationContext, fVar, new YRNUIImplementationProvider(yRNEventDispatcher), i);
    }

    private void init(YRNViewTagMappingManager yRNViewTagMappingManager, YRNEventDispatcher yRNEventDispatcher) {
        this.mManager = yRNViewTagMappingManager;
        if (yRNEventDispatcher != null) {
            YRNReflectUtils.modifyPrivateObjectByReflect(UIManagerModule.class, "mEventDispatcher", this, yRNEventDispatcher);
        }
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        int iAddRootView = super.addRootView(t, writableMap, str);
        if (this.mManager != null && (t instanceof ReactRootView) && (t.getParent() instanceof YRNReactContainerView)) {
            this.mManager.setBizInstanceForViewTag(iAddRootView, ((YRNReactContainerView) t.getParent()).getYRNBizInstance());
        }
        return iAddRootView;
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void clearJSResponder() {
        super.clearJSResponder();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.configureNextLayoutAnimation(readableMap, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        try {
            super.createView(i, str, i2, readableMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        YRNViewTagMappingManager yRNViewTagMappingManager = this.mManager;
        if (yRNViewTagMappingManager != null) {
            this.mManager.setBizInstanceForViewTag(i, yRNViewTagMappingManager.getBizInstanceForViewTag(i2));
            this.mManager.setViewTagForRootTag(i2, i);
        }
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void dismissPopupMenu() {
        super.dismissPopupMenu();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        super.dispatchViewManagerCommand(i, dynamic, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        super.findSubviewIn(i, readableArray, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        return super.getConstantsForViewManager(str);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return super.getDefaultEventTypes();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.manageChildren(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measure(int i, Callback callback) {
        super.measure(i, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        super.measureInWindow(i, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        super.measureLayout(i, i2, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        super.measureLayoutRelativeToParent(i, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        YRNViewTagMappingManager yRNViewTagMappingManager = this.mManager;
        if (yRNViewTagMappingManager != null) {
            yRNViewTagMappingManager.clear();
        }
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void playTouchSound() {
        super.playTouchSound();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void removeRootView(int i) {
        super.removeRootView(i);
        unregisterRootViewTag(i);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        super.removeSubviewsFromContainerWithID(i);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        super.replaceExistingNonRootView(i, i2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        super.sendAccessibilityEvent(i, i2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        super.setChildren(i, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        super.setJSResponder(i, z);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        super.setLayoutAnimationEnabledExperimental(z);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        super.showPopupMenu(i, readableArray, callback, callback2);
    }

    public void unregisterRootViewTag(int i) {
        HashSet<Integer> viewTagsForRootTag;
        YRNViewTagMappingManager yRNViewTagMappingManager = this.mManager;
        if (yRNViewTagMappingManager == null || (viewTagsForRootTag = yRNViewTagMappingManager.getViewTagsForRootTag(i)) == null) {
            return;
        }
        this.mManager.removeViewTagsForRootTag(i);
        this.mManager.removeBizInstanceForViewTags(viewTagsForRootTag);
        this.mManager.removeBizInstanceForViewTag(i);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        super.updateView(i, str, readableMap);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        super.viewIsDescendantOf(i, i2, callback);
    }

    public YRNUIManagerModule(YRNViewTagMappingManager yRNViewTagMappingManager, YRNEventDispatcher yRNEventDispatcher, ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(yRNViewTagMappingManager, yRNEventDispatcher, reactApplicationContext, list, new YRNUIImplementationProvider(yRNEventDispatcher), i);
    }

    public YRNUIManagerModule(YRNViewTagMappingManager yRNViewTagMappingManager, YRNEventDispatcher yRNEventDispatcher, ReactApplicationContext reactApplicationContext, UIManagerModule.f fVar, c cVar, int i) {
        super(reactApplicationContext, fVar, cVar, i);
        init(yRNViewTagMappingManager, yRNEventDispatcher);
    }

    public YRNUIManagerModule(YRNViewTagMappingManager yRNViewTagMappingManager, YRNEventDispatcher yRNEventDispatcher, ReactApplicationContext reactApplicationContext, List<ViewManager> list, c cVar, int i) {
        super(reactApplicationContext, list, cVar, i);
        init(yRNViewTagMappingManager, yRNEventDispatcher);
    }
}
