package com.huawei.ucd.medal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.huawei.ucd.gles.engine.android.StageView;
import com.huawei.ucd.helper.gles.Obj3DBufferLoadAider;
import defpackage.qid;
import defpackage.qim;
import defpackage.qit;
import defpackage.qiu;

/* JADX INFO: loaded from: classes43.dex */
public class MedalView extends StageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qim f23252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qim f23253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qim f23254c;
    private qim e;
    private qit f;
    private Context g;
    private TimeInterpolator h;
    private qim i;
    private long j;
    private GestureDetector k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Medal3D o;
    private qim p;
    private ValueAnimator q;
    private qim r;
    private Rect s;

    public MedalView(Context context) {
        super(context);
        this.m = false;
        this.j = 800L;
        this.f = new qit();
        this.n = false;
        this.l = false;
        c(context);
    }

    public MedalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.j = 800L;
        this.f = new qit();
        this.n = false;
        this.l = false;
        c(context);
    }

    private void c(Context context) {
        this.g = context;
        this.k = new GestureDetector(this.g, new GestureDetector.SimpleOnGestureListener() { // from class: com.huawei.ucd.medal.MedalView.5
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (MedalView.this.o != null) {
                    MedalView.this.o.b(f);
                }
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                qid.e("MedalView", qid.a());
                return super.onDoubleTap(motionEvent);
            }
        });
        requestFocus();
        setFocusableInTouchMode(true);
        setTranslucent(new qiu());
        d();
        c();
    }

    private void c() {
        Medal3D medal3D = new Medal3D(this.g);
        this.o = medal3D;
        medal3D.setMaterialFromAssets("medal/medal.mat");
        this.o.e(-30.0f, 20.0f, 10.0f);
        this.o.a(0.5f, 0.3f, 0.4f, 93.0f);
        this.o.d(100.0f, -50.0f, 10.0f);
        this.o.c(0.1f, 0.2f, 0.4f, 91.0f);
        this.d.a(this.o);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            Rect rect = this.s;
            this.m = rect == null || (rawX > ((float) rect.left) && rawX < ((float) this.s.right) && rawY > ((float) this.s.top) && rawY < ((float) this.s.bottom));
        }
        if (this.m) {
            this.k.onTouchEvent(motionEvent);
            Medal3D medal3D = this.o;
            if (medal3D != null) {
                medal3D.d(motionEvent);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.m = false;
        }
        return this.m;
    }

    public void setTexture(Bitmap bitmap) {
        Medal3D medal3D = this.o;
        if (medal3D == null) {
            return;
        }
        medal3D.setTexture(bitmap);
    }

    public void setTexture(Bitmap bitmap, MedalViewCallback medalViewCallback) {
        Medal3D medal3D = this.o;
        if (medal3D == null) {
            medalViewCallback.onResponse(-1, "medal3D is null!");
        } else {
            medal3D.setTexture(bitmap, medalViewCallback);
        }
    }

    public void setTexture(Bitmap bitmap, boolean z) {
        Medal3D medal3D = this.o;
        if (medal3D == null) {
            return;
        }
        medal3D.setTexture(bitmap, z);
    }

    public void setObjData(Obj3DBufferLoadAider.b bVar) {
        Medal3D medal3D = this.o;
        if (medal3D == null) {
            return;
        }
        medal3D.e(bVar.d(), bVar.a(), bVar.c());
    }

    @Override // com.huawei.ucd.gles.engine.android.StageView, android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        Medal3D medal3D = this.o;
        if (medal3D != null) {
            medal3D.onResume();
        }
    }

    @Override // com.huawei.ucd.gles.engine.android.StageView, android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        Medal3D medal3D = this.o;
        if (medal3D != null) {
            medal3D.onPause();
        }
    }

    @Override // com.huawei.ucd.gles.engine.android.StageView
    public void e() {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.q.end();
            this.q = null;
        }
        Medal3D medal3D = this.o;
        if (medal3D != null) {
            medal3D.onDestroy();
            this.o = null;
        }
        this.s = null;
        qit qitVar = this.f;
        if (qitVar != null) {
            qitVar.c();
            this.f = null;
        }
        this.e = null;
        this.i = null;
        this.f23252a = null;
        this.f23254c = null;
        this.f23253b = null;
        this.p = null;
        this.r = null;
        this.h = null;
        super.e();
    }

    public void setTouchRect(Rect rect) {
        this.s = rect;
    }

    public void setAnimatorScaleX(float f, float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            qid.e("MedalView", qid.a() + " mShowAnimator is running");
            return;
        }
        this.e = new qim(f, f2);
    }

    public void setAnimatorScaleY(float f, float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            qid.e("MedalView", qid.a() + " mShowAnimator is running");
            return;
        }
        this.i = new qim(f, f2);
    }

    public void setAnimatorRotationY(float f, float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.f23252a = new qim(f, f2);
        }
    }

    public void setAnimatorPositionX(float f, float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.f23254c = new qim(f, f2);
        }
    }

    public void setAnimatorPositionY(float f, float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.f23253b = new qim(f, f2);
        }
    }

    public void setAnimatorDuration(long j) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.j = j;
        }
    }

    public void setAnimatorInterpolator(TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.h = timeInterpolator;
        }
    }

    public void b() {
        this.o.runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.MedalView.1
            @Override // java.lang.Runnable
            public void run() {
                float f;
                float f2;
                float f3;
                float f4 = 0.0f;
                if (MedalView.this.f23254c != null) {
                    f = MedalView.this.f23254c.d;
                    f2 = MedalView.this.f23254c.f46273c;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                if (MedalView.this.f23253b != null) {
                    f4 = MedalView.this.f23253b.d;
                    f3 = MedalView.this.f23253b.f46273c;
                } else {
                    f3 = 0.0f;
                }
                if (MedalView.this.o == null) {
                    return;
                }
                MedalView medalView = MedalView.this;
                medalView.p = medalView.o.d(f, f4);
                MedalView medalView2 = MedalView.this;
                medalView2.r = medalView2.o.d(f2, f3);
            }
        });
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.q.cancel();
        }
        this.q = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f.b();
        this.q.setDuration(this.j);
        this.q.setInterpolator(this.h);
        this.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ucd.medal.MedalView.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (MedalView.this.o == null) {
                    return;
                }
                final float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                MedalView.this.o.runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.MedalView.4.3
                    @Override // java.lang.Runnable
                    public void run() {
                        float f = MedalView.this.e != null ? MedalView.this.e.d + ((MedalView.this.e.f46273c - MedalView.this.e.d) * fFloatValue) : 0.1f;
                        float f2 = MedalView.this.i != null ? MedalView.this.i.d + ((MedalView.this.i.f46273c - MedalView.this.i.d) * fFloatValue) : 0.1f;
                        float f3 = MedalView.this.f23252a != null ? MedalView.this.f23252a.d + ((MedalView.this.f23252a.f46273c - MedalView.this.f23252a.d) * fFloatValue) : 0.0f;
                        float f4 = MedalView.this.p != null ? MedalView.this.p.d + ((MedalView.this.r.d - MedalView.this.p.d) * fFloatValue) : 0.0f;
                        float f5 = MedalView.this.r != null ? MedalView.this.p.f46273c + ((MedalView.this.r.f46273c - MedalView.this.p.f46273c) * fFloatValue) : 0.0f;
                        if (MedalView.this.o == null) {
                            return;
                        }
                        MedalView.this.o.c(f, f2, 0.1f);
                        if (!MedalView.this.n) {
                            MedalView.this.o.c(f3);
                            float fAbs = Math.abs((Math.abs(0.5f - fFloatValue) * 2.0f) - 1.0f);
                            MedalView.this.o.a(12.0f * fAbs);
                            MedalView.this.o.d(fAbs * (-6.0f));
                        }
                        MedalView.this.o.b(f4, f5, -80.0f);
                    }
                });
                MedalView.this.o.requestRender();
            }
        });
        this.q.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.ucd.medal.MedalView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (MedalView.this.o == null) {
                    return;
                }
                MedalView.this.o.runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.MedalView.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MedalView.this.o.c(0.0f);
                        MedalView.this.o.a(0.0f);
                        MedalView.this.o.d(0.0f);
                    }
                });
                MedalView.this.o.requestRender();
            }
        });
        this.n = false;
        this.q.start();
    }

    public void setAutoRotate(final boolean z) {
        setRenderMode(z ? 1 : 0);
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.o.b(z);
        } else {
            this.q.addListener(new AnimatorListenerAdapter() { // from class: com.huawei.ucd.medal.MedalView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (MedalView.this.o == null) {
                        return;
                    }
                    MedalView.this.o.b(z);
                }
            });
        }
    }

    public void setFrameRotationYAngle(float f) {
        this.o.e(f);
    }

    public void setBackContent(MedalBackContent medalBackContent) {
        Medal3D medal3D = this.o;
        if (medal3D != null) {
            medal3D.b(medalBackContent);
        }
    }

    public void setBackContent(String[] strArr, Bitmap bitmap, MedalBackType.ModelType modelType, MedalBackType.ColorType colorType) {
        setBackContent(new MedalBackContent.Builder(this.g).a(modelType).c(colorType).b(bitmap).c(strArr).c());
    }

    public void setBackContent(String[] strArr, MedalBackType.ModelType modelType, MedalBackType.ColorType colorType) {
        setBackContent(strArr, null, modelType, colorType);
    }

    public void setBackContentTest(String[] strArr, Bitmap bitmap, MedalBackType.ModelType modelType, MedalBackType.ColorType colorType) {
        this.o.a(new MedalBackContent.Builder(this.g).a(modelType).c(colorType).b(bitmap).c(strArr).c(), bitmap);
    }
}
