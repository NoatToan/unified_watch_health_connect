package defpackage;

import kotlin.Metadata;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: zfv, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", "duration", "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class saturatingAdd {
    public static final long e(long j, DurationUnit durationUnit, long j2) {
        zcp.c(durationUnit, "");
        long jD = zfm.d(j2, durationUnit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return c(j, j2, jD);
        }
        if ((1 | (jD - 1)) == Long.MAX_VALUE) {
            return a(j, durationUnit, j2);
        }
        long j3 = j + jD;
        if (((j ^ j3) & (jD ^ j3)) < 0) {
            return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j3;
    }

    private static final long c(long j, long j2, long j3) {
        if (!zfm.l(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long a(long j, DurationUnit durationUnit, long j2) {
        long jA = zfm.a(j2, 2);
        long jD = zfm.d(jA, durationUnit);
        return (1 | (jD - 1)) == Long.MAX_VALUE ? jD : e(e(j, durationUnit, jA), durationUnit, zfm.d(j2, jA));
    }

    private static final long e(long j) {
        return j < 0 ? zfm.d.a() : zfm.d.b();
    }

    public static final long c(long j, long j2, DurationUnit durationUnit) {
        zcp.c(durationUnit, "");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return zfm.d.c();
            }
            return zfm.s(e(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return e(j);
        }
        return a(j, j2, durationUnit);
    }

    private static final long a(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            if (durationUnit.compareTo(DurationUnit.MILLISECONDS) < 0) {
                long jA = zfk.a(1L, DurationUnit.MILLISECONDS, durationUnit);
                zfm.b bVar = zfm.d;
                return zfm.e(toDuration.b((j / jA) - (j2 / jA), DurationUnit.MILLISECONDS), toDuration.b((j % jA) - (j2 % jA), durationUnit));
            }
            return zfm.s(e(j3));
        }
        return toDuration.b(j3, durationUnit);
    }
}
