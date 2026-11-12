package n4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln4/d;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(FFFF)V", "a", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f123545e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f123546f = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f123547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f123548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f123549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f123550d;

    public d(float f14, float f15, float f16, float f17) {
        this.f123547a = f14;
        this.f123548b = f15;
        this.f123549c = f16;
        this.f123550d = f17;
    }

    public static d b(d dVar, float f14, float f15, float f16, int i14) {
        if ((i14 & 1) != 0) {
            f14 = dVar.f123547a;
        }
        float f17 = (i14 & 2) != 0 ? dVar.f123548b : Float.NEGATIVE_INFINITY;
        if ((i14 & 4) != 0) {
            f15 = dVar.f123549c;
        }
        if ((i14 & 8) != 0) {
            f16 = dVar.f123550d;
        }
        dVar.getClass();
        return new d(f14, f17, f15, f16);
    }

    public final boolean a(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (fIntBitsToFloat >= this.f123547a) & (fIntBitsToFloat < this.f123549c) & (fIntBitsToFloat2 >= this.f123548b) & (fIntBitsToFloat2 < this.f123550d);
    }

    public final long c() {
        float f14 = this.f123549c;
        float f15 = this.f123547a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(q6.f.c(f14, f15, 2.0f, f15))) << 32) | (((long) Float.floatToRawIntBits(this.f123550d)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final long d() {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f123547a)) << 32) | (((long) Float.floatToRawIntBits(this.f123550d)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final long e() {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f123549c)) << 32) | (((long) Float.floatToRawIntBits(this.f123550d)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f123547a, dVar.f123547a) == 0 && Float.compare(this.f123548b, dVar.f123548b) == 0 && Float.compare(this.f123549c, dVar.f123549c) == 0 && Float.compare(this.f123550d, dVar.f123550d) == 0;
    }

    public final long f() {
        float f14 = this.f123549c;
        float f15 = this.f123547a;
        float fC = q6.f.c(f14, f15, 2.0f, f15);
        float f16 = this.f123548b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(q6.f.c(this.f123550d, f16, 2.0f, f16))) & 4294967295L) | (Float.floatToRawIntBits(fC) << 32);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final long g() {
        float f14 = this.f123549c - this.f123547a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f123550d - this.f123548b)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        g.a aVar = g.f123559b;
        return jFloatToRawIntBits;
    }

    public final long h() {
        float f14 = this.f123549c;
        float f15 = this.f123547a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(q6.f.c(f14, f15, 2.0f, f15))) << 32) | (((long) Float.floatToRawIntBits(this.f123548b)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final int hashCode() {
        return Float.hashCode(this.f123550d) + q6.f.d(this.f123549c, q6.f.d(this.f123548b, Float.hashCode(this.f123547a) * 31, 31), 31);
    }

    public final long i() {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f123547a)) << 32) | (((long) Float.floatToRawIntBits(this.f123548b)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final long j() {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f123549c)) << 32) | (((long) Float.floatToRawIntBits(this.f123548b)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public final d k(d dVar) {
        return new d(Math.max(this.f123547a, dVar.f123547a), Math.max(this.f123548b, dVar.f123548b), Math.min(this.f123549c, dVar.f123549c), Math.min(this.f123550d, dVar.f123550d));
    }

    public final boolean l() {
        return (this.f123547a >= this.f123549c) | (this.f123548b >= this.f123550d);
    }

    public final boolean m(d dVar) {
        return (this.f123547a < dVar.f123549c) & (dVar.f123547a < this.f123549c) & (this.f123548b < dVar.f123550d) & (dVar.f123548b < this.f123550d);
    }

    public final d n(float f14, float f15) {
        return new d(this.f123547a + f14, this.f123548b + f15, this.f123549c + f14, this.f123550d + f15);
    }

    public final d o(long j8) {
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        return new d(Float.intBitsToFloat(i14) + this.f123547a, Float.intBitsToFloat(i15) + this.f123548b, Float.intBitsToFloat(i14) + this.f123549c, Float.intBitsToFloat(i15) + this.f123550d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + gl1.d.d0(this.f123547a) + ", " + gl1.d.d0(this.f123548b) + ", " + gl1.d.d0(this.f123549c) + ", " + gl1.d.d0(this.f123550d) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln4/d$a;", "", "<init>", "()V", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
