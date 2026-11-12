package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.saturatingAdd;
import defpackage.toDuration;
import defpackage.yyp;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcz;
import defpackage.zfk;
import defpackage.zfm;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH$J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "zero", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    /* JADX INFO: renamed from: zero$delegate, reason: from kotlin metadata */
    private final Lazy zero;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long read();

    public AbstractLongTimeSource(DurationUnit durationUnit) {
        zcp.c(durationUnit, "");
        this.unit = durationUnit;
        this.zero = yyp.c(new Function0() { // from class: zfo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.d.read());
            }
        });
    }

    protected final DurationUnit getUnit() {
        return this.unit;
    }

    private final long getZero() {
        return ((Number) this.zero.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", RequestOptions.AD_CONTENT_CLASSIFICATION_J, "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", WatchFaceConstant.HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class b implements ComparableTimeMark {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractLongTimeSource f39337c;
        private final long d;
        private final long e;

        private b(long j, AbstractLongTimeSource abstractLongTimeSource, long j2) {
            zcp.c(abstractLongTimeSource, "");
            this.e = j;
            this.f39337c = abstractLongTimeSource;
            this.d = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.e.d(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.e.a(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.e.e(this);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo1953minusLRDsOJo(long j) {
            return ComparableTimeMark.e.c(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo1952elapsedNowUwyO8pc() {
            return zfm.d(saturatingAdd.c(this.f39337c.adjustedRead(), this.e, this.f39337c.getUnit()), this.d);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo1955plusLRDsOJo(long duration) {
            DurationUnit unit = this.f39337c.getUnit();
            if (zfm.l(duration)) {
                return new b(saturatingAdd.e(this.e, unit, duration), this.f39337c, zfm.d.c(), null);
            }
            long jC = zfm.c(duration, unit);
            long jE = zfm.e(zfm.d(duration, jC), this.d);
            long jE2 = saturatingAdd.e(this.e, unit, jC);
            long jC2 = zfm.c(jE, unit);
            long jE3 = saturatingAdd.e(jE2, unit, jC2);
            long jD = zfm.d(jE, jC2);
            long jF = zfm.f(jD);
            if (jE3 != 0 && jF != 0 && (jE3 ^ jF) < 0) {
                long jE4 = toDuration.e(zcz.e(jF), unit);
                jE3 = saturatingAdd.e(jE3, unit, jE4);
                jD = zfm.d(jD, jE4);
            }
            if ((1 | (jE3 - 1)) == Long.MAX_VALUE) {
                jD = zfm.d.c();
            }
            return new b(jE3, this.f39337c, jD, null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo1954minusUwyO8pc(ComparableTimeMark other) {
            zcp.c(other, "");
            if (other instanceof b) {
                b bVar = (b) other;
                if (zcp.b(this.f39337c, bVar.f39337c)) {
                    return zfm.e(saturatingAdd.c(this.e, bVar.e, this.f39337c.getUnit()), zfm.d(this.d, bVar.d));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object other) {
            return (other instanceof b) && zcp.b(this.f39337c, ((b) other).f39337c) && zfm.a(mo1954minusUwyO8pc((ComparableTimeMark) other), zfm.d.c());
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (zfm.m(this.d) * 37) + Long.hashCode(this.e);
        }

        public String toString() {
            return "LongTimeMark(" + this.e + zfk.d(this.f39337c.getUnit()) + " + " + ((Object) zfm.q(this.d)) + ", " + this.f39337c + g4.l;
        }

        public /* synthetic */ b(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, zcm zcmVar) {
            this(j, abstractLongTimeSource, j2);
        }
    }

    @Override // kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new b(adjustedRead(), this, zfm.d.c(), null);
    }
}
