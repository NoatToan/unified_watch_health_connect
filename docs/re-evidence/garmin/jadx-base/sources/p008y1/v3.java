package p008y1;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import n4.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly1/v3;", "", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "Ln4/c;", "initialPositionChange", "<init>", "(Ly1/b2;JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2 f193688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f193689b;

    /* JADX WARN: Illegal instructions before constructor call */
    public v3(b2 b2Var, long j8, int i14, j jVar) {
        j jVar2 = null;
        b2Var = (i14 & 1) != 0 ? null : b2Var;
        if ((i14 & 2) != 0) {
            c.f123541b.getClass();
            j8 = 0;
        }
        this(b2Var, j8, jVar2);
    }

    public static void c(v3 v3Var) {
        c.f123541b.getClass();
        v3Var.f193689b = 0L;
    }

    public final long a(long j8, long j14, float f14) {
        long j15 = c.j(this.f193689b, c.i(j8, j14));
        this.f193689b = j15;
        if ((this.f193688a == null ? c.e(j15) : Math.abs(b(j15))) < f14) {
            c.f123541b.getClass();
            return c.f123543d;
        }
        b2 b2Var = this.f193688a;
        long j16 = this.f193689b;
        if (b2Var == null) {
            return c.i(this.f193689b, c.k(f14, c.c(c.e(j16), j16)));
        }
        float fB = b(j16) - (Math.signum(b(this.f193689b)) * f14);
        long j17 = this.f193689b;
        b2 b2Var2 = this.f193688a;
        b2 b2Var3 = b2.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b2Var2 == b2Var3 ? j17 & 4294967295L : j17 >> 32));
        if (this.f193688a != b2Var3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fB)) << 32);
    }

    public final float b(long j8) {
        return Float.intBitsToFloat((int) (this.f193688a == b2.Horizontal ? j8 >> 32 : j8 & 4294967295L));
    }

    private v3(b2 b2Var, long j8) {
        this.f193688a = b2Var;
        this.f193689b = j8;
    }

    public /* synthetic */ v3(b2 b2Var, long j8, j jVar) {
        this(b2Var, j8);
    }
}
