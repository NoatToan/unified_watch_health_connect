package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.Systrace;
import defpackage.cm8;
import defpackage.cqd;
import defpackage.exh;
import defpackage.exk;
import defpackage.iz6;
import defpackage.lcj;
import defpackage.lej;
import defpackage.q7q;
import defpackage.rhh;
import defpackage.sk1;

/* JADX INFO: loaded from: classes4.dex */
public class ReactRootView extends SizeMonitoringFrameLayout implements exk, lej {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.facebook.react.a f7146b;
    public String c;
    public Bundle d;
    public String e;
    public a f;
    public int g;
    public boolean h;
    public boolean i;
    public cqd j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lcj f7147k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7148r;
    public b s;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f7149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7150b;
        public int c = 0;
        public int d = 0;
        public DisplayMetrics e = new DisplayMetrics();
        public DisplayMetrics f = new DisplayMetrics();

        public a() {
            iz6.h(ReactRootView.this.getContext().getApplicationContext());
            this.f7149a = new Rect();
            this.f7150b = (int) exh.c(60.0f);
        }

        public final boolean a(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            return displayMetrics.equals(displayMetrics2);
        }

        public final void b() {
            iz6.g(ReactRootView.this.getContext());
            if (a(this.e, iz6.f()) && a(this.f, iz6.e())) {
                return;
            }
            this.e.setTo(iz6.f());
            this.f.setTo(iz6.e());
            g();
        }

        public final void c() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.d == rotation) {
                return;
            }
            this.d = rotation;
            f(rotation);
        }

        public final void d() {
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.f7149a);
            int iB = rhh.a().g() ? rhh.a().b(ReactRootView.this, this.f7149a.bottom) : iz6.f().heightPixels - this.f7149a.bottom;
            int i = this.c;
            if (i != iB && iB > this.f7150b) {
                this.c = iB;
                ReactRootView.this.m("keyboardDidShow", e(exh.a(this.f7149a.bottom), exh.a(this.f7149a.left), exh.a(this.f7149a.width()), exh.a(this.c)));
            } else {
                if (i == 0 || iB > this.f7150b) {
                    return;
                }
                this.c = 0;
                ReactRootView.this.m("keyboardDidHide", e(exh.a(this.f7149a.height()), 0.0d, exh.a(this.f7149a.width()), 0.0d));
            }
        }

        public final WritableMap e(double d, double d2, double d3, double d4) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("height", d4);
            writableMapCreateMap2.putDouble("screenX", d2);
            writableMapCreateMap2.putDouble("width", d3);
            writableMapCreateMap2.putDouble("screenY", d);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble("duration", 0.0d);
            return writableMapCreateMap;
        }

        public final void f(int i) {
            String str;
            double d;
            boolean z = false;
            if (i != 0) {
                if (i == 1) {
                    str = "landscape-primary";
                    d = -90.0d;
                } else if (i == 2) {
                    str = "portrait-secondary";
                    d = 180.0d;
                } else {
                    if (i != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d = 90.0d;
                }
                z = true;
            } else {
                str = "portrait-primary";
                d = 0.0d;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("name", str);
            writableMapCreateMap.putDouble("rotationDegrees", d);
            writableMapCreateMap.putBoolean("isLandscape", z);
            ReactRootView.this.m("namedOrientationDidChange", writableMapCreateMap);
        }

        public final void g() {
            ((DeviceInfoModule) ReactRootView.this.f7146b.C().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ReactRootView.this.f7146b == null || !ReactRootView.this.h || ReactRootView.this.f7146b.C() == null) {
                return;
            }
            d();
            c();
            b();
        }
    }

    public interface b {
        void a();
    }

    public interface c {
    }

    public ReactRootView(Context context) {
        super(context);
        this.f7147k = new lcj(this);
        this.l = false;
        this.m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.o = 0;
        this.p = 0;
        this.q = 1;
        this.f7148r = false;
        i();
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    private void i() {
        setClipChildren(false);
    }

    @Override // defpackage.lej
    public void a(int i) {
        if (i != 101) {
            return;
        }
        j();
    }

    @Override // defpackage.lej
    public void b() {
        Systrace.c(0L, "ReactRootView.runApplication");
        try {
            com.facebook.react.a aVar = this.f7146b;
            if (aVar != null && this.h) {
                ReactContext reactContextC = aVar.C();
                if (reactContextC == null) {
                    return;
                }
                CatalystInstance catalystInstance = reactContextC.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (!this.f7148r) {
                    if (this.l) {
                        r(this.m, this.n);
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.i = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                }
            }
        } finally {
            Systrace.g(0L);
        }
    }

    @Override // defpackage.exk
    public void c(MotionEvent motionEvent) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null || !this.h || aVar.C() == null) {
            cm8.C("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.j == null) {
            cm8.C("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.j.d(motionEvent, ((UIManagerModule) this.f7146b.C().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            handleException(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null || !this.h || aVar.C() == null) {
            cm8.C("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f7147k.d(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public void f(b bVar) {
        this.s = bVar;
    }

    public void finalize() throws Throwable {
        super.finalize();
        sk1.b(!this.h, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public final void g() {
        Systrace.c(0L, "attachToReactInstanceManager");
        try {
            if (this.h) {
                return;
            }
            this.h = true;
            ((com.facebook.react.a) sk1.c(this.f7146b)).r(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            Systrace.g(0L);
        }
    }

    @Override // defpackage.lej
    public Bundle getAppProperties() {
        return this.d;
    }

    @Override // defpackage.lej
    public int getHeightMeasureSpec() {
        return this.n;
    }

    @Override // defpackage.lej
    public String getInitialUITemplate() {
        return this.e;
    }

    public String getJSModuleName() {
        return (String) sk1.c(this.c);
    }

    public com.facebook.react.a getReactInstanceManager() {
        return this.f7146b;
    }

    @Override // defpackage.lej
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // defpackage.lej
    public int getRootViewTag() {
        return this.g;
    }

    @Override // defpackage.lej
    public int getUIManagerType() {
        return this.q;
    }

    @Override // defpackage.lej
    public int getWidthMeasureSpec() {
        return this.m;
    }

    public final void h(MotionEvent motionEvent) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null || !this.h || aVar.C() == null) {
            cm8.C("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.j == null) {
            cm8.C("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.j.c(motionEvent, ((UIManagerModule) this.f7146b.C().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    @Override // defpackage.exk
    public void handleException(Throwable th) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null || aVar.C() == null) {
            throw new RuntimeException(th);
        }
        this.f7146b.C().handleException(new IllegalViewOperationException(th.getMessage(), this, th));
    }

    public void j() {
        this.j = new cqd(this);
    }

    public void k(b bVar) {
        this.s = null;
    }

    public final void l() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    public void m(String str, WritableMap writableMap) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) aVar.C().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    public void n(com.facebook.react.a aVar, String str) {
        o(aVar, str, null);
    }

    public void o(com.facebook.react.a aVar, String str, Bundle bundle) {
        p(aVar, str, bundle, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h) {
            l();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h) {
            l();
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null || !this.h || aVar.C() == null) {
            cm8.C("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
        } else {
            this.f7147k.a();
            super.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f7148r) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int iMax2;
        if (this.f7148r) {
            super.onMeasure(i, i2);
            return;
        }
        Systrace.c(0L, "ReactRootView.onMeasure");
        try {
            boolean z = (i == this.m && i2 == this.n) ? false : true;
            this.m = i;
            this.n = i2;
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i2);
            }
            setMeasuredDimension(iMax, iMax2);
            this.l = true;
            if (this.f7146b != null && !this.h) {
                g();
            } else if (z || this.o != iMax || this.p != iMax2) {
                r(this.m, this.n);
            }
            this.o = iMax;
            this.p = iMax2;
        } finally {
            Systrace.g(0L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.i) {
            this.i = false;
            String str = this.c;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.g);
            }
        }
        b bVar = this.s;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void p(com.facebook.react.a aVar, String str, Bundle bundle, String str2) {
        Systrace.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            sk1.b(this.f7146b == null, "This root view has already been attached to a catalyst instance manager");
            this.f7146b = aVar;
            this.c = str;
            this.d = bundle;
            this.e = str2;
            aVar.x();
            g();
        } finally {
            Systrace.g(0L);
        }
    }

    public void q() {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar != null && this.h) {
            aVar.A(this);
            this.f7146b = null;
            this.h = false;
        }
        this.i = false;
    }

    public final void r(int i, int i2) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null) {
            cm8.C("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext reactContextC = aVar.C();
        if (reactContextC != null) {
            q7q.a(reactContextC, getUIManagerType()).updateRootLayoutSpecs(getRootViewTag(), i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        com.facebook.react.a aVar = this.f7146b;
        if (aVar == null || !this.h || aVar.C() == null) {
            cm8.C("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        } else {
            this.f7147k.e(view2);
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.d = bundle;
        if (getRootViewTag() != 0) {
            b();
        }
    }

    public void setEventListener(c cVar) {
    }

    public void setIsFabric(boolean z) {
        this.q = z ? 2 : 1;
    }

    @Override // defpackage.lej
    public void setRootViewTag(int i) {
        this.g = i;
    }

    @Override // defpackage.lej
    public void setShouldLogContentAppeared(boolean z) {
        this.i = z;
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7147k = new lcj(this);
        this.l = false;
        this.m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.o = 0;
        this.p = 0;
        this.q = 1;
        this.f7148r = false;
        i();
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7147k = new lcj(this);
        this.l = false;
        this.m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.o = 0;
        this.p = 0;
        this.q = 1;
        this.f7148r = false;
        i();
    }
}
