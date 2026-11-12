package com.huawei.uikit.hwadvancedcardview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import com.huawei.uikit.hwadvancedcardview.R;
import defpackage.xeb;
import defpackage.xet;
import defpackage.xfs;
import defpackage.xft;

/* JADX INFO: loaded from: classes20.dex */
public class HwAdvancedCardView extends CardView {
    private static final int q = 7;
    private static final String r = "HwAdvancedCardView";
    private static final float s = 0.5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29231c;
    private int d;
    private boolean e;
    private boolean f;
    private Context g;
    private AnimatorSet h;
    private AnimatorSet i;
    private xet j;
    private Path k;
    private Paint l;
    private boolean m;
    private Paint n;
    private Path o;
    private boolean p;

    public HwAdvancedCardView(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.hwAdvancedCardView, i, R.style.Widget_Emui_HwAdvancedCardView);
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.hwAdvancedCardView_hwAdvancedCardViewClickAnimationEnable, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.hwAdvancedCardView_hwForceClipRoundCorner, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.hwAdvancedCardView_hwShadowEnabled, false);
        this.f29229a = typedArrayObtainStyledAttributes.getInt(R.styleable.hwAdvancedCardView_hwWidgetStyle, 0);
        this.f29230b = typedArrayObtainStyledAttributes.getInt(R.styleable.hwAdvancedCardView_hwShadowSize, 4);
        typedArrayObtainStyledAttributes.recycle();
        xet xetVar = new xet(this.g, this, this.f29230b, this.f29229a);
        this.j = xetVar;
        xetVar.c(this.e);
    }

    public static HwAdvancedCardView instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwAdvancedCardView.class, xft.d(context, 7, 1)), HwAdvancedCardView.class);
        if (objC instanceof HwAdvancedCardView) {
            return (HwAdvancedCardView) objC;
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (!this.p) {
            super.draw(canvas);
        } else {
            if (this.k == null) {
                return;
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            super.draw(canvas);
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.k, this.l);
            canvas.restoreToCount(iSaveLayer);
            this.l.setXfermode(null);
        }
        if (this.m) {
            canvas.drawPath(this.o, this.n);
        }
    }

    public boolean getClickAnimationEnable() {
        return this.f;
    }

    public int getClickAnimationType() {
        return this.d;
    }

    public boolean getForceClipRoundCorner() {
        return this.p;
    }

    public int getShadowSize() {
        return this.j == null ? this.f29231c : this.f29230b;
    }

    public int getShadowStyle() {
        return this.j == null ? this.f29231c : this.f29229a;
    }

    public boolean isShadowEnabled() {
        return this.e;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.p) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            float radius = super.getRadius();
            Path path = new Path();
            path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
            Path path2 = new Path();
            this.k = path2;
            path2.addRect(rectF, Path.Direction.CW);
            this.k.op(path, Path.Op.DIFFERENCE);
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
        a(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w(r, "onTouchEvent: MotionEvent motionEvent is null!");
            return false;
        }
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSetA = xeb.a(this, this.d);
            this.h = animatorSetA;
            animatorSetA.start();
        } else if (action == 1 || action == 3) {
            AnimatorSet animatorSet2 = this.h;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSetB = xeb.b(this, this.d);
            this.i = animatorSetB;
            animatorSetB.start();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClickAnimationEnable(boolean z) {
        this.f = z;
    }

    public void setClickAnimationType(int i) {
        this.d = i;
    }

    public void setForceClipRoundCorner(boolean z) {
        this.p = z;
    }

    public void setInsideShadowClip(boolean z) {
        xet xetVar = this.j;
        if (xetVar != null) {
            xetVar.d(z);
        }
    }

    public void setShadowEnabled(boolean z) {
        this.e = z;
        if (this.j == null) {
            this.j = new xet(this.g, this, this.f29230b, this.f29229a);
        }
        this.j.c(this.e);
    }

    public void setShadowSize(int i) {
        if (this.f29230b == i) {
            return;
        }
        this.f29230b = i;
        xet xetVar = this.j;
        if (xetVar != null) {
            xetVar.e(i);
            if (this.e) {
                this.j.c();
            }
        }
    }

    public void setShadowStyle(int i) {
        if (this.f29229a == i) {
            return;
        }
        this.f29229a = i;
        xet xetVar = this.j;
        if (xetVar != null) {
            xetVar.c(i);
            if (this.e) {
                this.j.c();
            }
        }
    }

    public HwAdvancedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwAdvancedCardViewStyle);
    }

    public HwAdvancedCardView(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        this.f29231c = -1;
        this.d = 1;
        this.e = false;
        this.f = true;
        this.h = null;
        this.i = null;
        this.m = false;
        this.p = false;
        this.g = super.getContext();
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        this.l.setColor(-1);
        a(this.g, attributeSet, i);
        boolean z = this.g.getResources().getBoolean(R.bool.emui_stroke_enable);
        this.m = z;
        if (z) {
            int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.emui_background_type_stroke_width) + a(context, 0.5f);
            if (dimensionPixelSize > 0) {
                Paint paint2 = new Paint(5);
                this.n = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.n.setColor(getContext().getResources().getColor(R.color.emui_stroke_color));
                this.n.setStrokeWidth(dimensionPixelSize);
                return;
            }
            this.m = false;
        }
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwAdvancedCardView);
    }

    private void a(int i, int i2) {
        if (this.m) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            float radius = super.getRadius();
            Path path = new Path();
            this.o = path;
            path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
        }
    }

    private int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
