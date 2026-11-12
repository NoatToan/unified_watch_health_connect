package q4;

import o4.f1;
import o4.y;
import o4.y0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq4/b;", "Lq4/h;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f142553a;

    public b(d dVar) {
        this.f142553a = dVar;
    }

    @Override // q4.h
    public final void a(float f14, float f15, float f16, float f17, int i14) {
        this.f142553a.a().a(f14, f15, f16, f17, i14);
    }

    @Override // q4.h
    public final long b() {
        return this.f142553a.b();
    }

    public final void d(f1 f1Var, int i14) {
        this.f142553a.a().s(f1Var, i14);
    }

    public final void e(float f14, float f15, float f16, float f17) {
        d dVar = this.f142553a;
        y yVarA = dVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32)) - (f16 + f14);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) - (f17 + f15))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        n4.g.a aVar = n4.g.f123559b;
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            y0.a("Width and height must be greater than or equal to zero");
        }
        dVar.c(jFloatToRawIntBits);
        yVarA.q(f14, f15);
    }

    public final void f(float f14, long j8) {
        y yVarA = this.f142553a.a();
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        yVarA.q(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
        yVarA.u(f14);
        yVarA.q(-Float.intBitsToFloat(i14), -Float.intBitsToFloat(i15));
    }

    public final void g(float f14, float f15, long j8) {
        y yVarA = this.f142553a.a();
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        yVarA.q(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
        yVarA.g(f14, f15);
        yVarA.q(-Float.intBitsToFloat(i14), -Float.intBitsToFloat(i15));
    }

    public final void h(float f14, float f15) {
        this.f142553a.a().q(f14, f15);
    }
}
