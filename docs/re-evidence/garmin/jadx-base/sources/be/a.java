package be;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f17672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17673b;

    public a(Context context) {
        super(context);
        float f14 = getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(ae.a.f2795a);
        this.f17673b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setElevation(f14 * 4.0f);
        shapeDrawable.getPaint().setColor(this.f17673b);
        setBackground(shapeDrawable);
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f17672a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f17672a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i14) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i14);
            this.f17673b = i14;
        }
    }
}
