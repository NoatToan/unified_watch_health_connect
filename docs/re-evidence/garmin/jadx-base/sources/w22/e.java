package w22;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.garmin.android.apps.connectmobile.view.gcmx.ProgressImageView;

/* JADX INFO: loaded from: classes10.dex */
public class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressImageView f181564a;

    public e(ProgressImageView progressImageView) {
        this.f181564a = progressImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f181564a.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f181564a.f47664o = 0.0f;
    }
}
