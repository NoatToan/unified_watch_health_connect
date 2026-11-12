package w6;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class x implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o6.c f183079a;

    public x(y yVar, o6.c cVar) {
        this.f183079a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f14) {
        return (float) this.f183079a.a(f14);
    }
}
