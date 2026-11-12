package lo;

import android.animation.Animator;
import com.garmin.android.apps.connectmobile.activities.manual.ActivityDiveEditGasesActivity;

/* JADX INFO: loaded from: classes7.dex */
public class g implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityDiveEditGasesActivity f113863a;

    public g(ActivityDiveEditGasesActivity activityDiveEditGasesActivity) {
        this.f113863a = activityDiveEditGasesActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f113863a.f29133g.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f113863a.f29133g.setVisibility(0);
    }
}
