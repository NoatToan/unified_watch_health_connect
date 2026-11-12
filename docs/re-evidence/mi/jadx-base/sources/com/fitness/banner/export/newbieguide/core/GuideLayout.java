package com.fitness.banner.export.newbieguide.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fitness.banner.export.newbieguide.model.HighLight;
import defpackage.mhk;
import defpackage.rc1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GuideLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fitness.banner.export.newbieguide.core.a f7737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f7738b;
    public com.fitness.banner.export.newbieguide.model.a c;
    public d d;
    public float e;
    public float f;
    public int g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GuideLayout.this.c.j()) {
                GuideLayout.this.j();
            }
        }
    }

    public class b extends rc1 {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            GuideLayout.this.d();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7741a;

        static {
            int[] iArr = new int[HighLight.Shape.values().length];
            f7741a = iArr;
            try {
                iArr[HighLight.Shape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7741a[HighLight.Shape.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7741a[HighLight.Shape.ROUND_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7741a[HighLight.Shape.RECTANGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(GuideLayout guideLayout);
    }

    public GuideLayout(Context context, com.fitness.banner.export.newbieguide.model.a aVar, com.fitness.banner.export.newbieguide.core.a aVar2) {
        super(context);
        f();
        setGuidePage(aVar);
        this.f7737a = aVar2;
    }

    private void setGuidePage(com.fitness.banner.export.newbieguide.model.a aVar) {
        this.c = aVar;
        setOnClickListener(new a());
    }

    public final void c(com.fitness.banner.export.newbieguide.model.a aVar) {
        removeAllViews();
        int iG = aVar.g();
        if (iG != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(iG, (ViewGroup) this, false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int[] iArrC = aVar.c();
            if (iArrC != null && iArrC.length > 0) {
                for (int i : iArrC) {
                    View viewFindViewById = viewInflate.findViewById(i);
                    if (viewFindViewById != null) {
                        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: c6b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f4980a.g(view);
                            }
                        });
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("can't find the view by id : ");
                        sb.append(i);
                        sb.append(" which used to remove guide page");
                    }
                }
            }
            aVar.h();
            addView(viewInflate, layoutParams);
        }
        List<mhk> listI = aVar.i();
        if (listI.size() > 0) {
            Iterator<mhk> it = listI.iterator();
            while (it.hasNext()) {
                addView(it.next().a((ViewGroup) getParent(), this.f7737a));
            }
        }
    }

    public final void d() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
            d dVar = this.d;
            if (dVar != null) {
                dVar.a(this);
            }
        }
    }

    public final void e(Canvas canvas) {
        List<HighLight> listF = this.c.f();
        if (listF != null) {
            for (HighLight highLight : listF) {
                RectF rectFB = highLight.b((ViewGroup) getParent());
                int i = c.f7741a[highLight.a().ordinal()];
                if (i == 1) {
                    canvas.drawCircle(rectFB.centerX(), rectFB.centerY(), highLight.d(), this.f7738b);
                } else if (i == 2) {
                    canvas.drawOval(rectFB, this.f7738b);
                } else if (i != 3) {
                    canvas.drawRect(rectFB, this.f7738b);
                } else {
                    canvas.drawRoundRect(rectFB, highLight.c(), highLight.c(), this.f7738b);
                }
                i(canvas, highLight, rectFB);
            }
        }
    }

    public final void f() {
        Paint paint = new Paint();
        this.f7738b = paint;
        paint.setAntiAlias(true);
        this.f7738b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
        setWillNotDraw(false);
        this.g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final /* synthetic */ void g(View view) {
        j();
    }

    public final void h(HighLight highLight) {
        View.OnClickListener onClickListener;
        com.fitness.banner.export.newbieguide.model.b bVarI = highLight.i();
        if (bVarI == null || (onClickListener = bVarI.f7750a) == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    public final void i(Canvas canvas, HighLight highLight, RectF rectF) {
        highLight.i();
    }

    public void j() {
        Animation animationE = this.c.e();
        if (animationE == null) {
            d();
        } else {
            animationE.setAnimationListener(new b());
            startAnimation(animationE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(this.c);
        Animation animationD = this.c.d();
        if (animationD != null) {
            startAnimation(animationD);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iB = this.c.b();
        if (iB == 0) {
            iB = -1308622848;
        }
        canvas.drawColor(iB);
        e(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = motionEvent.getX();
            this.f = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Math.abs(x - this.e) < this.g && Math.abs(y - this.f) < this.g) {
                for (HighLight highLight : this.c.f()) {
                    if (highLight.b((ViewGroup) getParent()).contains(x, y)) {
                        h(highLight);
                        return true;
                    }
                }
                performClick();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setOnGuideLayoutDismissListener(d dVar) {
        this.d = dVar;
    }
}
