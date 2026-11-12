package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes4.dex */
public class vah extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36665b;
    public final float c;
    public final float d;

    public static class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f36666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f36667b = false;

        public a(View view) {
            this.f36666a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f36667b) {
                this.f36666a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f36666a.hasOverlappingRendering() && this.f36666a.getLayerType() == 0) {
                this.f36667b = true;
                this.f36666a.setLayerType(2, null);
            }
        }
    }

    public vah(View view, float f, float f2) {
        this.f36664a = view;
        this.f36665b = f;
        this.c = f2 - f;
        this.d = f2;
        setAnimationListener(new a(view));
    }

    public float a() {
        return this.d;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f36664a.setAlpha(this.f36665b + (this.c * f));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}
