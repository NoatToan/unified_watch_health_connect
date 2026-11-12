package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import defpackage.bdo;
import defpackage.cm8;
import defpackage.cqd;
import defpackage.exh;
import defpackage.exk;
import defpackage.i3j;
import defpackage.pd8;
import defpackage.rhh;
import defpackage.sk1;
import defpackage.yi4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ReactModalHostView extends ViewGroup implements LifecycleEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dialog f7524b;
    public boolean c;
    public String d;
    public boolean e;
    public boolean f;
    public DialogInterface.OnShowListener g;
    public c h;

    public class a implements DialogInterface.OnKeyListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i == 4) {
                sk1.d(ReactModalHostView.this.h, "setOnRequestCloseListener must be called by the manager");
                ReactModalHostView.this.h.a(dialogInterface);
                return true;
            }
            Activity currentActivity = ((ReactContext) ReactModalHostView.this.getContext()).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i, keyEvent);
            }
            return false;
        }
    }

    public static class b extends ReactViewGroup implements exk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7527b;
        public int c;
        public bdo d;
        public final cqd e;

        public class a extends GuardedRunnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f7528a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ReactContext reactContext, int i) {
                super(reactContext);
                this.f7528a = i;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                ((UIManagerModule) b.this.f().getNativeModule(UIManagerModule.class)).updateNodeSize(this.f7528a, b.this.f7527b, b.this.c);
            }
        }

        public b(Context context) {
            super(context);
            this.f7526a = false;
            this.e = new cqd(this);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            if (this.f7526a) {
                g();
            }
        }

        @Override // defpackage.exk
        public void c(MotionEvent motionEvent) {
            this.e.d(motionEvent, e());
        }

        public final pd8 e() {
            return ((UIManagerModule) f().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        public final ReactContext f() {
            return (ReactContext) getContext();
        }

        public final void g() {
            if (getChildCount() <= 0) {
                this.f7526a = true;
                return;
            }
            this.f7526a = false;
            int id = getChildAt(0).getId();
            bdo bdoVar = this.d;
            if (bdoVar != null) {
                h(bdoVar, this.f7527b, this.c);
            } else {
                ReactContext reactContextF = f();
                reactContextF.runOnNativeModulesQueueThread(new a(reactContextF, id));
            }
        }

        public void h(bdo bdoVar, int i, int i2) {
            this.d = bdoVar;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", exh.a(i));
            writableNativeMap.putDouble("screenHeight", exh.a(i2));
            bdoVar.a(writableNativeMap);
        }

        @Override // defpackage.exk
        public void handleException(Throwable th) {
            f().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.e.c(motionEvent, e());
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.f7527b = i;
            this.c = i2;
            g();
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.e.c(motionEvent, e());
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    public interface c {
        void a(DialogInterface dialogInterface);
    }

    public ReactModalHostView(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f7523a = new b(context);
    }

    private View getContentView() {
        View viewE;
        if (rhh.a().g() && (viewE = rhh.a().e(this.f7524b, this.f7523a, getCurrentActivity())) != null) {
            return viewE;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f7523a);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        this.f7523a.addView(view, i);
    }

    public final void b() {
        Activity activity;
        Dialog dialog = this.f7524b;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) yi4.a(this.f7524b.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.f7524b.dismiss();
            }
            this.f7524b = null;
            ((ViewGroup) this.f7523a.getParent()).removeViewAt(0);
        }
    }

    public void c() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        b();
    }

    public void d() {
        if (this.f7524b != null) {
            if (!this.f) {
                e();
                return;
            }
            b();
        }
        this.f = false;
        int i = i3j.f20743b;
        if (this.d.equals("fade")) {
            i = i3j.c;
        } else if (this.d.equals("slide")) {
            i = i3j.d;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity == null ? getContext() : currentActivity;
        Dialog dialog = new Dialog(context, i);
        this.f7524b = dialog;
        dialog.getWindow().setFlags(8, 8);
        this.f7524b.setContentView(getContentView());
        e();
        this.f7524b.setOnShowListener(this.g);
        this.f7524b.setOnKeyListener(new a());
        this.f7524b.getWindow().setSoftInputMode(16);
        if (this.e) {
            this.f7524b.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        try {
            this.f7524b.show();
            if (context instanceof Activity) {
                this.f7524b.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f7524b.getWindow().clearFlags(8);
        } catch (WindowManager.BadTokenException e) {
            cm8.z(ReactModalHostView.class, "mDialog.show error:", e);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f7523a.dispatchProvideStructure(viewStructure);
    }

    public final void e() {
        sk1.d(this.f7524b, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        Window window = this.f7524b.getWindow();
        if (currentActivity == null || currentActivity.isFinishing() || !window.isActive()) {
            return;
        }
        if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
            window.addFlags(1024);
        } else {
            window.clearFlags(1024);
        }
        if (this.c) {
            window.clearFlags(2);
        } else {
            window.setDimAmount(0.5f);
            window.setFlags(2, 2);
        }
    }

    public void f(bdo bdoVar, int i, int i2) {
        this.f7523a.h(bdoVar, i, i2);
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        return this.f7523a.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        b bVar = this.f7523a;
        if (bVar == null) {
            return 0;
        }
        return bVar.getChildCount();
    }

    public Dialog getDialog() {
        return this.f7524b;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.f7523a.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.f7523a.removeView(getChildAt(i));
    }

    public void setAnimationType(String str) {
        this.d = str;
        this.f = true;
    }

    public void setHardwareAccelerated(boolean z) {
        this.e = z;
        this.f = true;
    }

    public void setOnRequestCloseListener(c cVar) {
        this.h = cVar;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.g = onShowListener;
    }

    public void setTransparent(boolean z) {
        this.c = z;
    }
}
