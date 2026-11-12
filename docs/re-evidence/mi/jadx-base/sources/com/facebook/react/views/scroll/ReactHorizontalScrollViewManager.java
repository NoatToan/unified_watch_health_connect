package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import androidx.core.view.c;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.d2a;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;
import defpackage.iz6;
import defpackage.j0s;
import defpackage.jej;
import defpackage.ndj;
import defpackage.nej;
import java.util.ArrayList;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactHorizontalScrollViewManager.REACT_CLASS)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<ReactHorizontalScrollView> implements a.InterfaceC0172a<ReactHorizontalScrollView> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private d2a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @jej(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ReactHorizontalScrollView reactHorizontalScrollView, int i, Integer num) {
        reactHorizontalScrollView.t(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactHorizontalScrollView reactHorizontalScrollView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        if (i == 0) {
            reactHorizontalScrollView.setBorderRadius(f);
        } else {
            reactHorizontalScrollView.u(f, i - 1);
        }
    }

    @iej(name = "borderStyle")
    public void setBorderStyle(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setBorderStyle(str);
    }

    @jej(defaultFloat = FloatCompanionObject.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ReactHorizontalScrollView reactHorizontalScrollView, int i, float f) {
        if (!j0s.a(f)) {
            f = exh.c(f);
        }
        reactHorizontalScrollView.v(SPACING_TYPES[i], f);
    }

    @iej(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactHorizontalScrollView reactHorizontalScrollView, int i) {
        reactHorizontalScrollView.setEndFillColor(i);
    }

    @iej(name = "decelerationRate")
    public void setDecelerationRate(ReactHorizontalScrollView reactHorizontalScrollView, float f) {
        reactHorizontalScrollView.setDecelerationRate(f);
    }

    @iej(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setDisableIntervalMomentum(z);
    }

    @iej(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        c.G0(reactHorizontalScrollView, z);
    }

    @iej(name = "overScrollMode")
    public void setOverScrollMode(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setOverScrollMode(nej.h(str));
    }

    @iej(name = "overflow")
    public void setOverflow(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setOverflow(str);
    }

    @iej(name = "pagingEnabled")
    public void setPagingEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setPagingEnabled(z);
    }

    @iej(name = "persistentScrollbar")
    public void setPersistentScrollbar(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setScrollbarFadingEnabled(!z);
    }

    @iej(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setRemoveClippedSubviews(z);
    }

    @iej(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setScrollEnabled(z);
    }

    @iej(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setScrollPerfTag(str);
    }

    @iej(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setSendMomentumEvents(z);
    }

    @iej(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setHorizontalScrollBarEnabled(z);
    }

    @iej(name = "snapToEnd")
    public void setSnapToEnd(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setSnapToEnd(z);
    }

    @iej(name = "snapToInterval")
    public void setSnapToInterval(ReactHorizontalScrollView reactHorizontalScrollView, float f) {
        reactHorizontalScrollView.setSnapInterval((int) (f * iz6.e().density));
    }

    @iej(name = "snapToOffsets")
    public void setSnapToOffsets(ReactHorizontalScrollView reactHorizontalScrollView, ReadableArray readableArray) {
        DisplayMetrics displayMetricsE = iz6.e();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i) * ((double) displayMetricsE.density))));
        }
        reactHorizontalScrollView.setSnapOffsets(arrayList);
    }

    @iej(name = "snapToStart")
    public void setSnapToStart(ReactHorizontalScrollView reactHorizontalScrollView, boolean z) {
        reactHorizontalScrollView.setSnapToStart(z);
    }

    public ReactHorizontalScrollViewManager(d2a d2aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollView createViewInstance(g9p g9pVar) {
        return new ReactHorizontalScrollView(g9pVar, null);
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0172a
    public void flashScrollIndicators(ReactHorizontalScrollView reactHorizontalScrollView) {
        reactHorizontalScrollView.j();
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0172a
    public void scrollTo(ReactHorizontalScrollView reactHorizontalScrollView, a.b bVar) {
        if (bVar.c) {
            reactHorizontalScrollView.smoothScrollTo(bVar.f7550a, bVar.f7551b);
        } else {
            reactHorizontalScrollView.scrollTo(bVar.f7550a, bVar.f7551b);
        }
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0172a
    public void scrollToEnd(ReactHorizontalScrollView reactHorizontalScrollView, a.c cVar) {
        int width = reactHorizontalScrollView.getChildAt(0).getWidth() + reactHorizontalScrollView.getPaddingRight();
        if (cVar.f7552a) {
            reactHorizontalScrollView.smoothScrollTo(width, reactHorizontalScrollView.getScrollY());
        } else {
            reactHorizontalScrollView.scrollTo(width, reactHorizontalScrollView.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView reactHorizontalScrollView, int i, ReadableArray readableArray) {
        a.b(this, reactHorizontalScrollView, i, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView reactHorizontalScrollView, String str, ReadableArray readableArray) {
        a.c(this, reactHorizontalScrollView, str, readableArray);
    }
}
