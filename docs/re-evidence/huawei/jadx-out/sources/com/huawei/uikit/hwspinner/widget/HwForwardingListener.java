package com.huawei.uikit.hwspinner.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;
import defpackage.xeh;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HwForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private static final int h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f29712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29714c;
    private final View d;
    private Runnable e;
    private Runnable f;
    private int g;
    protected boolean mIstransmitting;

    class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = HwForwardingListener.this.d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwForwardingListener.this.b();
        }
    }

    public HwForwardingListener(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f29712a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f29713b = tapTimeout;
        this.f29714c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract ShowableListMenu getPopup();

    protected boolean onForwardingStarted() {
        ShowableListMenu popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.mIstransmitting;
        if (z2) {
            z = a(motionEvent) || !onForwardingStopped();
        } else {
            z = b(motionEvent) && onForwardingStarted();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.mIstransmitting = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.mIstransmitting = false;
        this.g = -1;
        Runnable runnable = this.e;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
        }
    }

    private void a() {
        Runnable runnable = this.f;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            this.d.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    private boolean b(MotionEvent motionEvent) {
        View view = this.d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = motionEvent.getPointerId(0);
            if (this.e == null) {
                this.e = new b();
            }
            view.postDelayed(this.e, this.f29713b);
            if (this.f == null) {
                this.f = new c();
            }
            view.postDelayed(this.f, this.f29714c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.g);
            if (iFindPointerIndex >= 0) {
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                Class cls = Float.TYPE;
                Object objB = xeh.b(view, "pointInView", new Class[]{cls, cls, cls}, new Object[]{Float.valueOf(x), Float.valueOf(y), Float.valueOf(this.f29712a)}, View.class);
                if (!(objB instanceof Boolean) || !((Boolean) objB).booleanValue()) {
                    a();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private boolean a(MotionEvent motionEvent) {
        HwDropDownListView hwDropDownListView;
        ShowableListMenu popup = getPopup();
        if (popup != null && popup.isShowing() && (popup.getListView() instanceof HwDropDownListView) && (hwDropDownListView = (HwDropDownListView) popup.getListView()) != null && hwDropDownListView.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            xeh.b(this.d, "toGlobalMotionEvent", new Class[]{MotionEvent.class}, new Object[]{motionEventObtainNoHistory}, View.class);
            xeh.b(hwDropDownListView, "toLocalMotionEvent", new Class[]{MotionEvent.class}, new Object[]{motionEventObtainNoHistory}, View.class);
            boolean zC = hwDropDownListView.c(motionEventObtainNoHistory, this.g);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zC && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        View view = this.d;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.mIstransmitting = true;
        }
    }
}
