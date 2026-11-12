package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@ExperimentalTime
public abstract class AbstractDoubleTimeSource implements TimeSource {

    @NotNull
    private final DurationUnit a;

    public static final class a extends TimeMark {
        private final double a;

        @NotNull
        private final AbstractDoubleTimeSource b;
        private final long c;

        private a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j) {
            this.a = d;
            this.b = abstractDoubleTimeSource;
            this.c = j;
        }

        public /* synthetic */ a(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, abstractDoubleTimeSource, j);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo4315elapsedNowUwyO8pc() {
            return Duration.m4349minusLRDsOJo(DurationKt.toDuration(this.b.read() - this.a, this.b.getUnit()), this.c);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public TimeMark mo4316plusLRDsOJo(long j) {
            return new a(this.a, this.b, Duration.m4350plusLRDsOJo(this.c, j), null);
        }
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit durationUnit) {
        this.a = durationUnit;
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.a;
    }

    @Override // kotlin.time.TimeSource
    @NotNull
    public TimeMark markNow() {
        return new a(read(), this, Duration.Companion.m4395getZEROUwyO8pc(), null);
    }

    public abstract double read();
}
