package b63;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlinx.datetime.DateTimeArithmeticException;
import p005kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f16209a = LocalDate.MIN.toEpochDay();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f16210b = LocalDate.MAX.toEpochDay();

    public static final int a(o oVar, o oVar2) {
        oVar.getClass();
        oVar2.getClass();
        return d63.c.a(oVar.f16206a.until(oVar2.f16206a, ChronoUnit.DAYS));
    }

    public static final o b(o oVar, long j8, i.b bVar) throws Exception {
        LocalDate localDatePlusMonths;
        oVar.getClass();
        LocalDate localDate = oVar.f16206a;
        bVar.getClass();
        try {
            if (bVar instanceof i.c) {
                long jAddExact = Math.addExact(localDate.toEpochDay(), Math.multiplyExact(j8, ((i.c) bVar).f16194h));
                long j14 = f16209a;
                if (jAddExact > f16210b || j14 > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                localDatePlusMonths = LocalDate.ofEpochDay(jAddExact);
                localDatePlusMonths.getClass();
            } else {
                if (!(bVar instanceof i.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = localDate.plusMonths(Math.multiplyExact(j8, ((i.d) bVar).f16195h));
            }
            return new o(localDatePlusMonths);
        } catch (Exception e4) {
            if (!(e4 instanceof DateTimeException) && !(e4 instanceof ArithmeticException)) {
                throw e4;
            }
            throw new DateTimeArithmeticException("The result of adding " + j8 + " of " + bVar + " to " + oVar + " is out of LocalDate range.", e4);
        }
    }

    public static final o c(o oVar, d dVar) {
        oVar.getClass();
        LocalDate localDate = oVar.f16206a;
        try {
            long j8 = dVar.f16178a;
            LocalDate localDatePlusMonths = j8 != 0 ? localDate.plusMonths(j8) : localDate;
            int i14 = dVar.f16179b;
            if (i14 != 0) {
                localDatePlusMonths = localDatePlusMonths.plusDays(i14);
            }
            return new o(localDatePlusMonths);
        } catch (DateTimeException unused) {
            throw new DateTimeArithmeticException("The result of adding " + localDate + " to " + oVar + " is out of LocalDate range.");
        }
    }
}
