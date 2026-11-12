package j1;

import android.animation.ValueAnimator;
import b0.l0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r implements l0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f96306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f96307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f96308c;

    public r(t tVar) {
        this.f96308c = tVar;
    }

    @Override // b0.l0.j
    public final void a(long j8, l0.k kVar) {
        t tVar = this.f96308c;
        this.f96306a = tVar.getBrightness();
        tVar.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.f96307b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(kVar);
        eh2.b bVar = new eh2.b(kVar, 23);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(tVar.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.motion.a(tVar, 4));
        valueAnimatorOfFloat.addListener(new s(tVar, bVar));
        valueAnimatorOfFloat.start();
        this.f96307b = valueAnimatorOfFloat;
    }

    @Override // b0.l0.j
    public final void clear() {
        ValueAnimator valueAnimator = this.f96307b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f96307b = null;
        }
        t tVar = this.f96308c;
        tVar.setAlpha(0.0f);
        tVar.setBrightness(this.f96306a);
    }
}
