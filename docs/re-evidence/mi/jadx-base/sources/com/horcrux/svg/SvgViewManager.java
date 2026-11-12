package com.horcrux.svg;

import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import defpackage.g9p;
import defpackage.iej;

/* JADX INFO: loaded from: classes5.dex */
class SvgViewManager extends ReactViewManager {
    private static final String REACT_CLASS = "RNSVGSvgView";
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    public static void setSvgView(int i, SvgView svgView) {
        mTagToSvgView.put(i, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @iej(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @iej(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @iej(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @iej(customType = "Color", name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @iej(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i) {
        svgView.setMeetOrSlice(i);
    }

    @iej(name = "minX")
    public void setMinX(SvgView svgView, float f) {
        svgView.setMinX(f);
    }

    @iej(name = "minY")
    public void setMinY(SvgView svgView, float f) {
        svgView.setMinY(f);
    }

    @iej(customType = "Color", name = "tintColor")
    public void setTintColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @iej(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f) {
        svgView.setVbHeight(f);
    }

    @iej(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f) {
        svgView.setVbWidth(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactViewGroup reactViewGroup) {
        super.onDropViewInstance(reactViewGroup);
        mTagToSvgView.remove(reactViewGroup.getId());
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SvgView createViewInstance(g9p g9pVar) {
        return new SvgView(g9pVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(ReactViewGroup reactViewGroup, Object obj) {
        super.updateExtraData(reactViewGroup, obj);
        reactViewGroup.invalidate();
    }
}
