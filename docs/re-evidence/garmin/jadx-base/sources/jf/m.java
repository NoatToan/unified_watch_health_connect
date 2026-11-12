package jf;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljf/m;", "Lt4/d;", "Lhf/h;", "image", "<init>", "(Lhf/h;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends t4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.h f98675a;

    public m(hf.h hVar) {
        this.f98675a = hVar;
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF98674l() {
        hf.h hVar = this.f98675a;
        int f196858c = hVar.getF196858c();
        float f14 = f196858c > 0 ? f196858c : Float.NaN;
        int f196859d = hVar.getF196859d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f196859d > 0 ? f196859d : Float.NaN)) & 4294967295L);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }

    @Override // t4.d
    public final void onDraw(q4.f fVar) {
        hf.h hVar = this.f98675a;
        int f196858c = hVar.getF196858c();
        float fIntBitsToFloat = f196858c > 0 ? Float.intBitsToFloat((int) (fVar.b() >> 32)) / f196858c : 1.0f;
        int f196859d = hVar.getF196859d();
        float fIntBitsToFloat2 = f196859d > 0 ? Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f196859d : 1.0f;
        n4.c.f123541b.getClass();
        q4.a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        try {
            f142543b.f142550a.g(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            hVar.draw(o4.d.a(fVar.getF142543b().a()));
        } finally {
            tn.k.p(f142543b, jB);
        }
    }
}
