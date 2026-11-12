package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private n() {
    }

    public static int a(int i14, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i14});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f7302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f7303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7306e;

        public b(Animation animation, ViewGroup viewGroup, View view2) {
            super(false);
            this.f7306e = true;
            this.f7302a = viewGroup;
            this.f7303b = view2;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j8, Transformation transformation) {
            this.f7306e = true;
            if (this.f7304c) {
                return !this.f7305d;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f7304c = true;
                androidx.core.view.c0.a(this.f7302a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z14 = this.f7304c;
            ViewGroup viewGroup = this.f7302a;
            if (z14 || !this.f7306e) {
                viewGroup.endViewTransition(this.f7303b);
                this.f7305d = true;
            } else {
                this.f7306e = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j8, Transformation transformation, float f14) {
            this.f7306e = true;
            if (this.f7304c) {
                return !this.f7305d;
            }
            if (!super.getTransformation(j8, transformation, f14)) {
                this.f7304c = true;
                androidx.core.view.c0.a(this.f7302a, this);
            }
            return true;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f7300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f7301b;

        public a(Animator animator) {
            this.f7300a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7301b = animatorSet;
            animatorSet.play(animator);
            if (animator != null) {
                return;
            }
            vb.h.z("Animator cannot be null");
            throw null;
        }

        public a(Animation animation) {
            this.f7300a = animation;
            this.f7301b = null;
            if (animation != null) {
                return;
            }
            vb.h.z("Animation cannot be null");
            throw null;
        }
    }
}
