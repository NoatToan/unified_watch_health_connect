package w22;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.garmin.android.apps.connectmobile.view.gcmx.ProgressImageView;

/* JADX INFO: loaded from: classes10.dex */
public class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressImageView f181561a;

    public b(ProgressImageView progressImageView) {
        this.f181561a = progressImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ProgressImageView progressImageView = this.f181561a;
        if (progressImageView.f47664o >= 100.0f) {
            if (progressImageView.f47665p.isRunning()) {
                progressImageView.f47665p.cancel();
            }
            progressImageView.C = new AnimatorSet();
            if (progressImageView.f47664o >= 100.0f) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                valueAnimatorOfInt.addUpdateListener(new c(progressImageView));
                valueAnimatorOfInt.setDuration(300L);
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
                valueAnimatorOfInt2.addUpdateListener(new d(progressImageView));
                valueAnimatorOfInt2.addListener(new e(progressImageView));
                valueAnimatorOfInt2.setDuration(300L);
                valueAnimatorOfInt2.setStartDelay(600L);
                progressImageView.C.play(valueAnimatorOfInt);
                progressImageView.C.play(valueAnimatorOfInt2).after(valueAnimatorOfInt);
            }
            progressImageView.C.start();
        }
    }
}
