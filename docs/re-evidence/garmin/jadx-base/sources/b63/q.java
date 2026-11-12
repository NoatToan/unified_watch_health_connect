package b63;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class q {
    public static final u a(o oVar, v vVar) {
        oVar.getClass();
        vVar.getClass();
        return new u(oVar, vVar);
    }

    public static u b(o oVar, int i14, int i15) {
        LocalDate localDate = oVar.f16206a;
        return new u(localDate.getYear(), oVar.c(), localDate.getDayOfMonth(), i14, i15, 0, 0);
    }

    public static final o c(o oVar, int i14, i.b bVar) {
        oVar.getClass();
        bVar.getClass();
        return p.b(oVar, -i14, bVar);
    }

    public static final o d(o oVar, d dVar) {
        int i14 = dVar.f16179b;
        if (i14 != Integer.MIN_VALUE) {
            long j8 = 12;
            if (((int) (dVar.getF16178a() % j8)) != Integer.MIN_VALUE) {
                return p.c(oVar, new d(-((int) (dVar.getF16178a() / j8)), -((int) (dVar.getF16178a() % j8)), -i14));
            }
        }
        long j14 = 12;
        int f16178a = (int) (dVar.getF16178a() / j14);
        i.INSTANCE.getClass();
        return c(c(c(oVar, f16178a, i.f16193g), (int) (dVar.getF16178a() % j14), i.f16192f), i14, i.f16190d);
    }

    public static final o e(o oVar, int i14, i.b bVar) {
        oVar.getClass();
        bVar.getClass();
        return p.b(oVar, i14, bVar);
    }
}
