package defpackage;

import kotlin.Metadata;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: zfr, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001\u001a \u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001¨\u0006\u000b"}, d2 = {"toTimeUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "toDurationUnit", "convertDurationUnit", "", "value", "sourceUnit", "targetUnit", "convertDurationUnitOverflow", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class toTimeUnit {
    public static final double a(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
        zcp.c(durationUnit, "");
        zcp.c(durationUnit2, "");
        long jConvert = durationUnit2.getTimeUnit().convert(1L, durationUnit.getTimeUnit());
        return jConvert > 0 ? d * jConvert : d / durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
    }

    public static final long c(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        zcp.c(durationUnit, "");
        zcp.c(durationUnit2, "");
        return durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
    }

    public static final long a(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        zcp.c(durationUnit, "");
        zcp.c(durationUnit2, "");
        return durationUnit2.getTimeUnit().convert(j, durationUnit.getTimeUnit());
    }
}
