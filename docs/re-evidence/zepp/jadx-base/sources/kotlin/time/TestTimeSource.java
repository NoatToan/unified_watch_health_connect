package kotlin.time;

import kotlin.SinceKotlin;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@ExperimentalTime
public final class TestTimeSource extends AbstractLongTimeSource {
    private long b;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    private final void a(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.b + "ns is advanced by " + ((Object) Duration.m4363toStringimpl(j)) + '.');
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m4418plusAssignLRDsOJo(long j) {
        long j2;
        long jM4360toLongimpl = Duration.m4360toLongimpl(j, getUnit());
        if (jM4360toLongimpl == Long.MIN_VALUE || jM4360toLongimpl == Long.MAX_VALUE) {
            double dM4357toDoubleimpl = this.b + Duration.m4357toDoubleimpl(j, getUnit());
            if (dM4357toDoubleimpl > 9.223372036854776E18d || dM4357toDoubleimpl < -9.223372036854776E18d) {
                a(j);
            }
            j2 = (long) dM4357toDoubleimpl;
        } else {
            long j3 = this.b;
            j2 = j3 + jM4360toLongimpl;
            if ((jM4360toLongimpl ^ j3) >= 0 && (j3 ^ j2) < 0) {
                a(j);
            }
        }
        this.b = j2;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.b;
    }
}
