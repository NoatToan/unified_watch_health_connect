package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.toDuration;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zfk;
import defpackage.zfm;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "markNow", "Lkotlin/time/ComparableTimeMark;", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    protected abstract double read();

    public AbstractDoubleTimeSource(DurationUnit durationUnit) {
        zcp.c(durationUnit, "");
        this.unit = durationUnit;
    }

    protected final DurationUnit getUnit() {
        return this.unit;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", RequestOptions.AD_CONTENT_CLASSIFICATION_J, "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", WatchFaceConstant.HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class a implements ComparableTimeMark {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractDoubleTimeSource f39336b;
        private final double d;
        private final long e;

        private a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j) {
            zcp.c(abstractDoubleTimeSource, "");
            this.d = d;
            this.f39336b = abstractDoubleTimeSource;
            this.e = j;
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
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo1953minusLRDsOJo(long j) {
            return ComparableTimeMark.e.c(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo1952elapsedNowUwyO8pc() {
            return zfm.d(toDuration.c(this.f39336b.read() - this.d, this.f39336b.getUnit()), this.e);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo1955plusLRDsOJo(long duration) {
            return new a(this.d, this.f39336b, zfm.e(this.e, duration), null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo1954minusUwyO8pc(ComparableTimeMark other) {
            zcp.c(other, "");
            if (other instanceof a) {
                a aVar = (a) other;
                if (zcp.b(this.f39336b, aVar.f39336b)) {
                    if (zfm.a(this.e, aVar.e) && zfm.l(this.e)) {
                        return zfm.d.c();
                    }
                    long jD = zfm.d(this.e, aVar.e);
                    long jC = toDuration.c(this.d - aVar.d, this.f39336b.getUnit());
                    return zfm.a(jC, zfm.s(jD)) ? zfm.d.c() : zfm.e(jC, jD);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object other) {
            return (other instanceof a) && zcp.b(this.f39336b, ((a) other).f39336b) && zfm.a(mo1954minusUwyO8pc((ComparableTimeMark) other), zfm.d.c());
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return zfm.m(zfm.e(toDuration.c(this.d, this.f39336b.getUnit()), this.e));
        }

        public String toString() {
            return "DoubleTimeMark(" + this.d + zfk.d(this.f39336b.getUnit()) + " + " + ((Object) zfm.q(this.e)) + ", " + this.f39336b + g4.l;
        }

        public /* synthetic */ a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, zcm zcmVar) {
            this(d, abstractDoubleTimeSource, j);
        }
    }

    @Override // kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new a(read(), this, zfm.d.c(), null);
    }
}
