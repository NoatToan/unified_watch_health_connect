package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalTime
final class a extends TimeMark {

    @NotNull
    private final TimeMark a;
    private final long b;

    private a(TimeMark timeMark, long j) {
        this.a = timeMark;
        this.b = j;
    }

    public /* synthetic */ a(TimeMark timeMark, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j);
    }

    public final long a() {
        return this.b;
    }

    @NotNull
    public final TimeMark b() {
        return this.a;
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo4315elapsedNowUwyO8pc() {
        return Duration.m4349minusLRDsOJo(this.a.mo4315elapsedNowUwyO8pc(), a());
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo4316plusLRDsOJo(long j) {
        return new a(this.a, Duration.m4350plusLRDsOJo(a(), j), null);
    }
}
