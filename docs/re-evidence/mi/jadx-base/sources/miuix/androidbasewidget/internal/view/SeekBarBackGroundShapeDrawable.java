package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.RequiresApi;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 24)
public class SeekBarBackGroundShapeDrawable extends miuix.androidbasewidget.internal.view.a {
    public SpringAnimation d;
    public SpringAnimation e;
    public GradientDrawable f;
    public float g;
    public FloatProperty<SeekBarBackGroundShapeDrawable> h;

    public class a extends FloatProperty<SeekBarBackGroundShapeDrawable> {
        public a(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable) {
            return seekBarBackGroundShapeDrawable.f();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable, float f) {
            seekBarBackGroundShapeDrawable.j(f);
        }
    }

    public class b implements DynamicAnimation.OnAnimationUpdateListener {
        public b() {
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
            SeekBarBackGroundShapeDrawable.this.invalidateSelf();
        }
    }

    public static class c extends miuix.androidbasewidget.internal.view.a.C1019a {
        @Override // miuix.androidbasewidget.internal.view.a.C1019a
        public Drawable a(Resources resources, Resources.Theme theme, miuix.androidbasewidget.internal.view.a.C1019a c1019a) {
            return new SeekBarBackGroundShapeDrawable(resources, theme, c1019a);
        }
    }

    public SeekBarBackGroundShapeDrawable() {
        this.g = 0.0f;
        this.h = new a("BlackAlpha");
        g();
        h();
    }

    @Override // miuix.androidbasewidget.internal.view.a
    public miuix.androidbasewidget.internal.view.a.C1019a a() {
        return new c();
    }

    @Override // miuix.androidbasewidget.internal.view.a
    public void b() {
        this.e.cancel();
        this.d.start();
    }

    @Override // miuix.androidbasewidget.internal.view.a
    public void c() {
        this.d.cancel();
        this.e.start();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        e(canvas);
    }

    public final void e(Canvas canvas) {
        this.f.setBounds(getBounds());
        this.f.setAlpha((int) (this.g * 255.0f));
        this.f.setCornerRadius(getCornerRadius());
        this.f.draw(canvas);
    }

    public float f() {
        return this.g;
    }

    public final void g() {
        SpringAnimation springAnimation = new SpringAnimation(this, this.h, 0.05f);
        this.d = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.d.getSpring().setDampingRatio(0.99f);
        this.d.setMinimumVisibleChange(0.00390625f);
        this.d.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: zql
            @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                this.f41581a.i(dynamicAnimation, f, f2);
            }
        });
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.h, 0.0f);
        this.e = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.e.getSpring().setDampingRatio(0.99f);
        this.e.setMinimumVisibleChange(0.00390625f);
        this.e.addUpdateListener(new b());
    }

    public final void h() {
        GradientDrawable gradientDrawable = new GradientDrawable(getOrientation(), getColors());
        this.f = gradientDrawable;
        gradientDrawable.setCornerRadius(getCornerRadius());
        this.f.setShape(getShape());
        this.f.setColor(-16777216);
    }

    public final /* synthetic */ void i(DynamicAnimation dynamicAnimation, float f, float f2) {
        invalidateSelf();
    }

    public void j(float f) {
        this.g = f;
    }

    public SeekBarBackGroundShapeDrawable(Resources resources, Resources.Theme theme, miuix.androidbasewidget.internal.view.a.C1019a c1019a) {
        super(resources, theme, c1019a);
        this.g = 0.0f;
        this.h = new a("BlackAlpha");
        g();
        h();
    }
}
