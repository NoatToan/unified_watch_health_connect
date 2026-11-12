package e53;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final long a(long j8) {
        if (j8 < 0) {
            c.f63094b.getClass();
            return c.f63096d;
        }
        c.f63094b.getClass();
        return c.f63095c;
    }

    public static final long b(long j8, long j14, f fVar) {
        long j15 = j8 - j14;
        if (((j15 ^ j8) & (~(j15 ^ j14))) >= 0) {
            return e.f(j15, fVar);
        }
        f fVar2 = f.MILLISECONDS;
        if (fVar.compareTo(fVar2) >= 0) {
            return c.l(a(j15));
        }
        fVar2.getClass();
        long jConvert = fVar.f63109a.convert(1L, fVar2.f63109a);
        long j16 = (j8 / jConvert) - (j14 / jConvert);
        long j17 = (j8 % jConvert) - (j14 % jConvert);
        c.a aVar = c.f63094b;
        return c.h(e.f(j16, fVar2), e.f(j17, fVar));
    }
}
