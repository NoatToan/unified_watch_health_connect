package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,202:1\n80#2:203\n80#2:204\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n176#1:203\n183#1:204\n*E\n"})
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m2346overflowLRDsOJo(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m2281toStringimpl(j)) + '.');
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m2347plusAssignLRDsOJo(long j) {
        long jM2280toLongimpl = Duration.m2280toLongimpl(j, getUnit());
        if (((jM2280toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j2 = this.reading;
            long j3 = j2 + jM2280toLongimpl;
            if ((jM2280toLongimpl ^ j2) >= 0 && (j2 ^ j3) < 0) {
                m2346overflowLRDsOJo(j);
            }
            this.reading = j3;
            return;
        }
        long jM2244divUwyO8pc = Duration.m2244divUwyO8pc(j, 2);
        if ((1 | (Duration.m2280toLongimpl(jM2244divUwyO8pc, getUnit()) - 1)) == Long.MAX_VALUE) {
            m2346overflowLRDsOJo(j);
            return;
        }
        long j4 = this.reading;
        try {
            m2347plusAssignLRDsOJo(jM2244divUwyO8pc);
            m2347plusAssignLRDsOJo(Duration.m2269minusLRDsOJo(j, jM2244divUwyO8pc));
        } catch (IllegalStateException e) {
            this.reading = j4;
            throw e;
        }
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }
}
