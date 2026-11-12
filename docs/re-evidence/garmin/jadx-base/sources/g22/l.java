package g22;

import b63.u;
import b63.v;
import b63.z;
import java.time.LocalDateTime;
import org.joda.time.LocalDate;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static boolean a(b63.o oVar) {
        z.INSTANCE.getClass();
        z zVarA = z.Companion.a();
        oVar.getClass();
        return oVar.equals(c(b63.o.INSTANCE, zVarA));
    }

    public static final int b(u uVar) {
        if (uVar == null) {
            return 0;
        }
        LocalDateTime localDateTime = uVar.f16216a;
        return localDateTime.getMinute() + (localDateTime.getHour() * 60);
    }

    public static final b63.o c(b63.o.Companion aVar, z zVar) {
        aVar.getClass();
        zVar.getClass();
        u.INSTANCE.getClass();
        return b63.b.d(b63.a.C0229a.f16171a.a(), zVar).b();
    }

    public static /* synthetic */ b63.o d(b63.o.Companion aVar) {
        z.INSTANCE.getClass();
        return c(aVar, z.Companion.a());
    }

    public static u e(u.Companion aVar) {
        z.INSTANCE.getClass();
        z zVarA = z.Companion.a();
        aVar.getClass();
        return b63.b.d(b63.a.C0229a.f16171a.a(), zVarA);
    }

    public static v f(v.Companion aVar) {
        z.INSTANCE.getClass();
        z zVarA = z.Companion.a();
        aVar.getClass();
        u.INSTANCE.getClass();
        return b63.b.d(b63.a.C0229a.f16171a.a(), zVarA).c();
    }

    public static final u g(u uVar) {
        uVar.getClass();
        z.INSTANCE.getClass();
        return b63.b.e(b63.b.c(uVar, z.Companion.a()), z.f16226b);
    }

    public static final LocalDate h(b63.o oVar) {
        oVar.getClass();
        java.time.LocalDate localDate = oVar.f16206a;
        return new LocalDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    public static final org.joda.time.LocalDateTime i(u uVar) {
        uVar.getClass();
        return new org.joda.time.LocalDateTime(uVar.b().f16206a.getYear(), uVar.b().f16206a.getMonthValue(), uVar.b().f16206a.getDayOfMonth(), uVar.c().f16219a.getHour(), uVar.c().f16219a.getMinute(), uVar.c().f16219a.getSecond(), MathKt.b(((double) uVar.c().f16219a.getNano()) / ((double) 1000000)));
    }

    public static final u j(u uVar) {
        uVar.getClass();
        z.INSTANCE.getClass();
        return b63.b.e(b63.b.c(uVar, z.f16226b), z.Companion.a());
    }
}
