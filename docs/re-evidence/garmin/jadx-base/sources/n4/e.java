package n4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ln4/e;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "Ln4/a;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/j;)V", "a", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f123551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f123552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f123553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f123554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f123555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f123556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f123557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f123558h;

    static {
        new a(null);
        n4.a.f123535b.getClass();
        f.c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(float f14, float f15, float f16, float f17, long j8, long j14, long j15, long j16, int i14, j jVar) {
        long j17;
        long j18;
        long j19;
        long j24;
        if ((i14 & 16) != 0) {
            n4.a.f123535b.getClass();
            j17 = 0;
        } else {
            j17 = j8;
        }
        if ((i14 & 32) != 0) {
            n4.a.f123535b.getClass();
            j18 = 0;
        } else {
            j18 = j14;
        }
        if ((i14 & 64) != 0) {
            n4.a.f123535b.getClass();
            j19 = 0;
        } else {
            j19 = j15;
        }
        if ((i14 & 128) != 0) {
            n4.a.f123535b.getClass();
            j24 = 0;
        } else {
            j24 = j16;
        }
        this(f14, f15, f16, f17, j17, j18, j19, j24, null);
    }

    public final float a() {
        return this.f123554d - this.f123552b;
    }

    public final float b() {
        return this.f123553c - this.f123551a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f123551a, eVar.f123551a) == 0 && Float.compare(this.f123552b, eVar.f123552b) == 0 && Float.compare(this.f123553c, eVar.f123553c) == 0 && Float.compare(this.f123554d, eVar.f123554d) == 0 && n4.a.a(this.f123555e, eVar.f123555e) && n4.a.a(this.f123556f, eVar.f123556f) && n4.a.a(this.f123557g, eVar.f123557g) && n4.a.a(this.f123558h, eVar.f123558h);
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f123554d, q6.f.d(this.f123553c, q6.f.d(this.f123552b, Float.hashCode(this.f123551a) * 31, 31), 31), 31);
        n4.a.C2318a c2318a = n4.a.f123535b;
        return Long.hashCode(this.f123558h) + q6.f.e(q6.f.e(q6.f.e(iD, 31, this.f123555e), 31, this.f123556f), 31, this.f123557g);
    }

    public final String toString() {
        String str = gl1.d.d0(this.f123551a) + ", " + gl1.d.d0(this.f123552b) + ", " + gl1.d.d0(this.f123553c) + ", " + gl1.d.d0(this.f123554d);
        long j8 = this.f123555e;
        long j14 = this.f123556f;
        boolean zA = n4.a.a(j8, j14);
        long j15 = this.f123557g;
        long j16 = this.f123558h;
        if (!zA || !n4.a.a(j14, j15) || !n4.a.a(j15, j16)) {
            StringBuilder sbL = hb.a.l("RoundRect(rect=", str, ", topLeft=");
            sbL.append((Object) n4.a.b(j8));
            sbL.append(", topRight=");
            sbL.append((Object) n4.a.b(j14));
            sbL.append(", bottomRight=");
            sbL.append((Object) n4.a.b(j15));
            sbL.append(", bottomLeft=");
            sbL.append((Object) n4.a.b(j16));
            sbL.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbL.toString();
        }
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i14) == Float.intBitsToFloat(i15)) {
            StringBuilder sbL2 = hb.a.l("RoundRect(rect=", str, ", radius=");
            sbL2.append(gl1.d.d0(Float.intBitsToFloat(i14)));
            sbL2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbL2.toString();
        }
        StringBuilder sbL3 = hb.a.l("RoundRect(rect=", str, ", x=");
        sbL3.append(gl1.d.d0(Float.intBitsToFloat(i14)));
        sbL3.append(", y=");
        sbL3.append(gl1.d.d0(Float.intBitsToFloat(i15)));
        sbL3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbL3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln4/e$a;", "", "<init>", "()V", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private e(float f14, float f15, float f16, float f17, long j8, long j14, long j15, long j16) {
        this.f123551a = f14;
        this.f123552b = f15;
        this.f123553c = f16;
        this.f123554d = f17;
        this.f123555e = j8;
        this.f123556f = j14;
        this.f123557g = j15;
        this.f123558h = j16;
    }

    public /* synthetic */ e(float f14, float f15, float f16, float f17, long j8, long j14, long j15, long j16, j jVar) {
        this(f14, f15, f16, f17, j8, j14, j15, j16);
    }
}
