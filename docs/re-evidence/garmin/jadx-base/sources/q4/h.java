package q4;

import o4.c0;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    static void c(h hVar, float f14, float f15, int i14) {
        if ((i14 & 4) != 0) {
            f14 = Float.intBitsToFloat((int) (hVar.b() >> 32));
        }
        float f16 = f14;
        if ((i14 & 8) != 0) {
            f15 = Float.intBitsToFloat((int) (hVar.b() & 4294967295L));
        }
        c0.f128819b.getClass();
        hVar.a(0.0f, 0.0f, f16, f15, c0.f128820c);
    }

    void a(float f14, float f15, float f16, float f17, int i14);

    long b();
}
