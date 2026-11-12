package rv;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends dv.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f154586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f154587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f154588d;

    /* JADX INFO: renamed from: rv.a$a, reason: collision with other inner class name */
    public class C2929a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f154589a;

        public C2929a(a aVar, b bVar) {
            this.f154589a = bVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f154589a.c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public interface b {
        void c();
    }

    public final void A6(b bVar) {
        if (this.f154588d.isRunning()) {
            return;
        }
        this.f154588d.removeAllListeners();
        this.f154588d.addListener(new C2929a(this, bVar));
        this.f154588d.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f154587c.start();
        if (getView() == null) {
            return;
        }
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new com.garmin.android.gncs.settings.e(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f154586b = v6();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f154587c = animatorSet;
        animatorSet.setStartDelay(300L);
        this.f154587c.playTogether(w6(y6()));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f154588d = animatorSet2;
        animatorSet2.playTogether(w6(z6()));
    }

    public abstract ImageView v6();

    public final ArrayList w6(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i14 : iArr) {
            if (i14 == 0) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.SCALE_X, 0.8f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.SCALE_Y, 0.8f, 1.0f);
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.setInterpolator(new i32.a());
                objectAnimatorOfFloat2.setDuration(1000L);
                objectAnimatorOfFloat2.setInterpolator(new i32.a());
                arrayList.add(objectAnimatorOfFloat);
                arrayList.add(objectAnimatorOfFloat2);
            } else if (i14 == 1) {
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.SCALE_X, 1.0f, 0.8f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.8f);
                objectAnimatorOfFloat3.setDuration(500L);
                objectAnimatorOfFloat4.setDuration(500L);
                arrayList.add(objectAnimatorOfFloat3);
                arrayList.add(objectAnimatorOfFloat4);
            } else if (i14 == 2) {
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat5.setDuration(500L);
                arrayList.add(objectAnimatorOfFloat5);
            } else if (i14 == 3) {
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat6.setDuration(500L);
                arrayList.add(objectAnimatorOfFloat6);
            } else if (i14 == 4) {
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f154586b, (Property<View, Float>) View.ROTATION, 0.0f, 360.0f);
                objectAnimatorOfFloat7.setDuration(500L);
                arrayList.add(objectAnimatorOfFloat7);
            }
        }
        return arrayList;
    }

    public abstract int[] y6();

    public abstract int[] z6();
}
