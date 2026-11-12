package com.huawei.ui.commonui.floatview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hmf.tasks.OnCompleteListener;
import defpackage.qqp;
import defpackage.qrs;

/* JADX INFO: loaded from: classes16.dex */
public class FloatingSidingView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f23506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View.OnClickListener f23507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23508c;
    private Context e;

    public FloatingSidingView(Context context) {
        this(context, null);
    }

    public FloatingSidingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingSidingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, 0, 0);
    }

    public FloatingSidingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f23508c = 0L;
        this.e = context;
        b();
    }

    private void b() {
        this.f23506a = new e();
        setClickable(true);
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.f23507b = onClickListener;
    }

    public void e() {
        this.f23506a.c(qrs.i(BaseApplication.b()), getY());
    }

    public void a() {
        this.f23506a.c(qrs.i(BaseApplication.b()) - qqp.a(this.e, 80.0f), getY());
    }

    public void setCompleteListener(OnCompleteListener onCompleteListener) {
        e eVar = this.f23506a;
        if (eVar != null) {
            eVar.c(onCompleteListener);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 1 && !d()) {
            c();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void c() {
        View.OnClickListener onClickListener = this.f23507b;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    private boolean d() {
        boolean z = SystemClock.elapsedRealtime() - this.f23508c < 150;
        if (!z) {
            this.f23508c = SystemClock.elapsedRealtime();
        }
        return z;
    }

    public class e implements Runnable {
        private float d;
        private float e;
        private long f;
        private OnCompleteListener j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f23510b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23509a = 500;

        public e() {
        }

        public void c(float f, float f2) {
            this.d = f;
            this.e = f2;
            this.f = System.currentTimeMillis();
            this.f23510b.post(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(OnCompleteListener onCompleteListener) {
            this.j = onCompleteListener;
        }

        public void a() {
            Handler handler = this.f23510b;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FloatingSidingView.this.getRootView() == null || FloatingSidingView.this.getRootView().getParent() == null) {
                return;
            }
            float fMin = Math.min(1.0f, (System.currentTimeMillis() - this.f) / (this.f23509a * 1.0f));
            FloatingSidingView.this.b((this.d - FloatingSidingView.this.getX()) * fMin, (this.e - FloatingSidingView.this.getY()) * fMin);
            if (fMin < 1.0f) {
                this.f23510b.post(this);
                return;
            }
            OnCompleteListener onCompleteListener = this.j;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f, float f2) {
        setX(getX() + f);
        setY(getY() + f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e eVar = this.f23506a;
        if (eVar != null) {
            eVar.a();
        }
        super.onDetachedFromWindow();
    }
}
