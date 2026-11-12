package be;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f17674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17675b;

    public b(d dVar, d.a aVar) {
        this.f17675b = dVar;
        this.f17674a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f17675b;
        dVar.getClass();
        d.a aVar = this.f17674a;
        d.d(fFloatValue, aVar);
        dVar.a(fFloatValue, aVar, false);
        dVar.invalidateSelf();
    }
}
