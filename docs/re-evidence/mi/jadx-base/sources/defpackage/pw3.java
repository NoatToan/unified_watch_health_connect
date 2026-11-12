package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public class pw3 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f30843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30844b;
    public int c;

    public static class a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Paint f30845a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30846b;
        public pw3 c;

        public a(pw3 pw3Var, int i) {
            this.c = pw3Var;
            this.f30846b = i;
            a((int) rect().width());
        }

        public final void a(int i) {
            float f = i / 2;
            this.f30845a.setShader(new RadialGradient(f, f, this.f30846b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.c.getWidth() / 2;
            float f = width;
            float height = this.c.getHeight() / 2;
            canvas.drawCircle(f, height, f, this.f30845a);
            canvas.drawCircle(f, height, width - this.f30846b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            a((int) f);
        }
    }

    public pw3(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f30844b = (int) (3.5f * f);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(r3j.f);
        this.c = typedArrayObtainStyledAttributes.getColor(r3j.g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            c.z0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f30844b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f30844b, i2, i, 503316480);
            int i3 = this.f30844b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.c);
        c.v0(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f30843a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f30843a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f30843a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f30844b * 2), getMeasuredHeight() + (this.f30844b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.c = i;
        }
    }
}
