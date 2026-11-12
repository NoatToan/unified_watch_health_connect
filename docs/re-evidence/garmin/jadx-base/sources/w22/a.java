package w22;

import android.animation.ValueAnimator;
import com.garmin.android.apps.connectmobile.view.gcmx.ProgressImageView;

/* JADX INFO: loaded from: classes10.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressImageView f181560a;

    public a(ProgressImageView progressImageView) {
        this.f181560a = progressImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ProgressImageView progressImageView = this.f181560a;
        progressImageView.f47664o = fFloatValue;
        progressImageView.invalidate();
    }
}
