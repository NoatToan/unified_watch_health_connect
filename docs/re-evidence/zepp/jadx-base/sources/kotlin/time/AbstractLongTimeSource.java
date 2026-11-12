package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@ExperimentalTime
public abstract class AbstractLongTimeSource implements TimeSource {

    @NotNull
    private final DurationUnit a;

    public static final class a extends TimeMark {
        private final long a;

        @NotNull
        private final AbstractLongTimeSource b;
        private final long c;

        private a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2) {
            this.a = j;
            this.b = abstractLongTimeSource;
            this.c = j2;
        }

        public /* synthetic */ a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo4315elapsedNowUwyO8pc() {
            return Duration.m4349minusLRDsOJo(DurationKt.toDuration(this.b.read() - this.a, this.b.getUnit()), this.c);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public TimeMark mo4316plusLRDsOJo(long j) {
            return new a(this.a, this.b, Duration.m4350plusLRDsOJo(this.c, j), null);
        }
    }

    public AbstractLongTimeSource(@NotNull DurationUnit durationUnit) {
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

    public abstract long read();
}
