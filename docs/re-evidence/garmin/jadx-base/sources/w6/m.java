package w6;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class m implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o6.c f182887a;

    public m(o6.c cVar) {
        this.f182887a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f14) {
        return (float) this.f182887a.a(f14);
    }
}
