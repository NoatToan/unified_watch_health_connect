package w22;

import android.animation.ValueAnimator;
import com.garmin.android.apps.connectmobile.view.gcmx.ProgressImageView;

/* JADX INFO: loaded from: classes10.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressImageView f181563a;

    public d(ProgressImageView progressImageView) {
        this.f181563a = progressImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ProgressImageView progressImageView = this.f181563a;
        progressImageView.B = iIntValue;
        progressImageView.invalidate();
    }
}
