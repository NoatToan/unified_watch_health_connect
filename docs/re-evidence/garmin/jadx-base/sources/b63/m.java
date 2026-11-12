package b63;

import com.google.android.exoplayer2.C;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlinx.datetime.DateTimeArithmeticException;
import p005kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static final e53.j a(e53.j jVar, long j8, i.e eVar) throws Exception {
        long j14;
        jVar.getClass();
        eVar.getClass();
        try {
            j14 = j8;
            try {
                d63.b bVarB = d63.c.b(j14, eVar.f16196h, C.NANOS_PER_SECOND);
                long j15 = bVarB.f58077a;
                long j16 = bVarB.f58078b;
                e53.c.a aVar = e53.c.f63094b;
                return jVar.b(e53.e.f(j15, e53.f.SECONDS)).b(e53.e.f(j16, e53.f.NANOSECONDS));
            } catch (Exception e4) {
                e = e4;
                Exception exc = e;
                if (!(exc instanceof DateTimeException) && !(exc instanceof ArithmeticException)) {
                    throw exc;
                }
                e53.j.a aVar2 = e53.j.f63112c;
                long j17 = j14 > 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
                aVar2.getClass();
                return e53.j.a.b(j17, 0L);
            }
        } catch (Exception e14) {
            e = e14;
            j14 = j8;
        }
    }

    public static final e53.j b(e53.j jVar, long j8, i iVar, z zVar) throws Exception {
        Instant instant;
        jVar.getClass();
        iVar.getClass();
        zVar.getClass();
        ZoneId zoneId = zVar.f16227a;
        try {
            try {
                ZonedDateTime zonedDateTimeAtZone = f53.a.a(jVar).atZone(zoneId);
                zonedDateTimeAtZone.getClass();
                if (iVar instanceof i.e) {
                    instant = f53.a.a(a(jVar, j8, (i.e) iVar));
                    instant.atZone(zoneId);
                } else if (iVar instanceof i.c) {
                    instant = zonedDateTimeAtZone.plusDays(Math.multiplyExact(j8, ((i.c) iVar).f16194h)).toInstant();
                } else {
                    if (!(iVar instanceof i.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    instant = zonedDateTimeAtZone.plusMonths(Math.multiplyExact(j8, ((i.d) iVar).f16195h)).toInstant();
                }
                instant.getClass();
                return f53.a.b(instant);
            } catch (DateTimeException e4) {
                throw new DateTimeArithmeticException(e4);
            }
        } catch (Exception e14) {
            if (!(e14 instanceof DateTimeException) && !(e14 instanceof ArithmeticException)) {
                throw e14;
            }
            throw new DateTimeArithmeticException("Instant " + jVar + " cannot be represented as local date when adding " + j8 + ' ' + iVar + " to it", e14);
        }
    }

    public static final e53.j c(e53.j jVar, i iVar, z zVar) {
        jVar.getClass();
        iVar.getClass();
        zVar.getClass();
        return b(jVar, 90, iVar, zVar);
    }
}
