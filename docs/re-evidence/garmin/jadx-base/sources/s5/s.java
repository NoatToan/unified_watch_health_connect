package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls5/s;", "", "Ls5/r;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Ls5/r;IIIIFF)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f157290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f157292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f157293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f157294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f157295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f157296g;

    public /* synthetic */ s(r rVar, int i14, int i15, int i16, int i17, float f14, float f15, int i18, p005kotlin.jvm.internal.j jVar) {
        this(rVar, i14, i15, (i18 & 8) != 0 ? -1 : i16, (i18 & 16) != 0 ? -1 : i17, (i18 & 32) != 0 ? -1.0f : f14, (i18 & 64) != 0 ? -1.0f : f15);
    }

    public final n4.d a(n4.d dVar) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f157295f)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return dVar.o(jFloatToRawIntBits);
    }

    public final long b(long j8, boolean z14) {
        if (z14) {
            w0.f157315b.getClass();
            long j14 = w0.f157316c;
            if (w0.d(j8, j14)) {
                return j14;
            }
        }
        w0.a aVar = w0.f157315b;
        int i14 = (int) (j8 >> 32);
        int i15 = this.f157291b;
        return og.a.l(i14 + i15, ((int) (j8 & 4294967295L)) + i15);
    }

    public final n4.d c(n4.d dVar) {
        float f14 = -this.f157295f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return dVar.o(jFloatToRawIntBits);
    }

    public final int d(int i14) {
        int i15 = this.f157292c;
        int i16 = this.f157291b;
        return j23.t.e(i14, i16, i15) - i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f157290a, sVar.f157290a) && this.f157291b == sVar.f157291b && this.f157292c == sVar.f157292c && this.f157293d == sVar.f157293d && this.f157294e == sVar.f157294e && Float.compare(this.f157295f, sVar.f157295f) == 0 && Float.compare(this.f157296g, sVar.f157296g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f157296g) + q6.f.d(this.f157295f, q2.d(this.f157294e, q2.d(this.f157293d, q2.d(this.f157292c, q2.d(this.f157291b, this.f157290a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParagraphInfo(paragraph=");
        sb3.append(this.f157290a);
        sb3.append(", startIndex=");
        sb3.append(this.f157291b);
        sb3.append(", endIndex=");
        sb3.append(this.f157292c);
        sb3.append(", startLineIndex=");
        sb3.append(this.f157293d);
        sb3.append(", endLineIndex=");
        sb3.append(this.f157294e);
        sb3.append(", top=");
        sb3.append(this.f157295f);
        sb3.append(", bottom=");
        return q6.f.p(sb3, this.f157296g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public s(r rVar, int i14, int i15, int i16, int i17, float f14, float f15) {
        this.f157290a = rVar;
        this.f157291b = i14;
        this.f157292c = i15;
        this.f157293d = i16;
        this.f157294e = i17;
        this.f157295f = f14;
        this.f157296g = f15;
    }
}
