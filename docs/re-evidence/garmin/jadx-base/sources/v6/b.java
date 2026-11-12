package v6;

import o6.l;
import o6.n;
import o6.o;
import w6.p;

/* JADX INFO: loaded from: classes.dex */
public class b extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f175778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f175779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f175780c;

    public b() {
        o oVar = new o();
        this.f175778a = oVar;
        this.f175780c = oVar;
    }

    @Override // w6.p
    public final float a() {
        return this.f175780c.a();
    }

    public final void b(float f14, float f15, float f16, float f17, float f18, float f19) {
        o oVar = this.f175778a;
        this.f175780c = oVar;
        oVar.f129529l = f14;
        boolean z14 = f14 > f15;
        oVar.f129528k = z14;
        if (z14) {
            oVar.d(-f16, f14 - f15, f18, f19, f17);
        } else {
            oVar.d(f16, f15 - f14, f18, f19, f17);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f14) {
        return this.f175780c.getInterpolation(f14);
    }
}
