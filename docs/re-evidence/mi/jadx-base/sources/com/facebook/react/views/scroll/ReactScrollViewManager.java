package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import androidx.core.view.c;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.d2a;
import defpackage.e4f;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.iz6;
import defpackage.j0s;
import defpackage.jej;
import defpackage.ndj;
import defpackage.nej;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactScrollViewManager.REACT_CLASS)
public class ReactScrollViewManager extends ViewGroupManager<ReactScrollView> implements a.InterfaceC0172a<ReactScrollView> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private d2a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return e4f.a().b(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), e4f.d("registrationName", "onScroll")).b(ScrollEventType.getJSEventName(ScrollEventType.BEGIN_DRAG), e4f.d("registrationName", "onScrollBeginDrag")).b(ScrollEventType.getJSEventName(ScrollEventType.END_DRAG), e4f.d("registrationName", "onScrollEndDrag")).b(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), e4f.d("registrationName", "onMomentumScrollBegin")).b(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_END), e4f.d("registrationName", "onMomentumScrollEnd")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return a.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @jej(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactScrollView reactScrollView, int i, Integer num) {
        reactScrollView.p(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactScrollView reactScrollView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        if (i == 0) {
            reactScrollView.setBorderRadius(f);
        } else {
            reactScrollView.q(f, i - 1);
        }
    }

    @iej(name = "borderStyle")
    public void setBorderStyle(ReactScrollView reactScrollView, String str) {
        reactScrollView.setBorderStyle(str);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactScrollView reactScrollView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        reactScrollView.r(SPACING_TYPES[i], f);
    }

    @iej(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactScrollView reactScrollView, int i) {
        reactScrollView.setEndFillColor(i);
    }

    @iej(name = "decelerationRate")
    public void setDecelerationRate(ReactScrollView reactScrollView, float f) {
        reactScrollView.setDecelerationRate(f);
    }

    @iej(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactScrollView reactScrollView, boolean z) {
        c.G0(reactScrollView, z);
    }

    @iej(name = "overScrollMode")
    public void setOverScrollMode(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverScrollMode(nej.h(str));
    }

    @iej(name = "overflow")
    public void setOverflow(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverflow(str);
    }

    @iej(name = "pagingEnabled")
    public void setPagingEnabled(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setPagingEnabled(z);
    }

    @iej(name = "persistentScrollbar")
    public void setPersistentScrollbar(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setScrollbarFadingEnabled(!z);
    }

    @iej(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setRemoveClippedSubviews(z);
    }

    @iej(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setScrollEnabled(z);
        reactScrollView.setFocusable(z);
    }

    @iej(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactScrollView reactScrollView, String str) {
        reactScrollView.setScrollPerfTag(str);
    }

    @iej(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSendMomentumEvents(z);
    }

    @iej(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setVerticalScrollBarEnabled(z);
    }

    @iej(name = "snapToEnd")
    public void setSnapToEnd(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSnapToEnd(z);
    }

    @iej(name = "snapToInterval")
    public void setSnapToInterval(ReactScrollView reactScrollView, float f) {
        reactScrollView.setSnapInterval((int) (f * iz6.e().density));
    }

    @iej(name = "snapToOffsets")
    public void setSnapToOffsets(ReactScrollView reactScrollView, ReadableArray readableArray) {
        DisplayMetrics displayMetricsE = iz6.e();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * ((double) displayMetricsE.density))));
        }
        reactScrollView.setSnapOffsets(arrayList);
    }

    @iej(name = "snapToStart")
    public void setSnapToStart(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSnapToStart(z);
    }

    public ReactScrollViewManager(d2a d2aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactScrollView createViewInstance(g9p g9pVar) {
        return new ReactScrollView(g9pVar, null);
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0172a
    public void flashScrollIndicators(ReactScrollView reactScrollView) {
        reactScrollView.j();
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0172a
    public void scrollTo(ReactScrollView reactScrollView, a.b bVar) {
        if (bVar.c) {
            reactScrollView.smoothScrollTo(bVar.f7550a, bVar.f7551b);
        } else {
            reactScrollView.scrollTo(bVar.f7550a, bVar.f7551b);
        }
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0172a
    public void scrollToEnd(ReactScrollView reactScrollView, a.c cVar) {
        int height = reactScrollView.getChildAt(0).getHeight() + reactScrollView.getPaddingBottom();
        if (cVar.f7552a) {
            reactScrollView.smoothScrollTo(reactScrollView.getScrollX(), height);
        } else {
            reactScrollView.scrollTo(reactScrollView.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView reactScrollView, int i, ReadableArray readableArray) {
        a.b(this, reactScrollView, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView reactScrollView, String str, ReadableArray readableArray) {
        a.c(this, reactScrollView, str, readableArray);
    }
}
