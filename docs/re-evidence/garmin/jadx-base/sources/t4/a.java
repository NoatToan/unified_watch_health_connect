package t4;

import ch.qos.logback.core.CoreConstants;
import g6.k;
import g6.m;
import g6.n;
import o4.e0;
import o4.o0;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt4/a;", "Lt4/d;", "Lo4/v0;", "image", "Lg6/k;", "srcOffset", "Lg6/m;", "srcSize", "<init>", "(Lo4/v0;JJLkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f162250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f162251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f162252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f162253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f162254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f162255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f162256g;

    private a(v0 v0Var, long j8, long j14) {
        int i14;
        int i15;
        this.f162250a = v0Var;
        this.f162251b = j8;
        this.f162252c = j14;
        o0.f128897b.getClass();
        this.f162253d = o0.f128898c;
        k.a aVar = k.f76003b;
        if (((int) (j8 >> 32)) < 0 || ((int) (j8 & 4294967295L)) < 0 || (i14 = (int) (j14 >> 32)) < 0 || (i15 = (int) (j14 & 4294967295L)) < 0 || i14 > v0Var.getWidth() || i15 > v0Var.getHeight()) {
            h.s("Failed requirement.");
            throw null;
        }
        this.f162254e = j14;
        this.f162255f = 1.0f;
    }

    @Override // t4.d
    public final boolean applyAlpha(float f14) {
        this.f162255f = f14;
        return true;
    }

    @Override // t4.d
    public final boolean applyColorFilter(e0 e0Var) {
        this.f162256g = e0Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!s.g(this.f162250a, aVar.f162250a) || !k.c(this.f162251b, aVar.f162251b) || !m.c(this.f162252c, aVar.f162252c)) {
            return false;
        }
        int i14 = this.f162253d;
        int i15 = aVar.f162253d;
        o0.a aVar2 = o0.f128897b;
        return i14 == i15;
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo54getIntrinsicSizeNHjbRc() {
        return n.c(this.f162254e);
    }

    public final int hashCode() {
        int iHashCode = this.f162250a.hashCode() * 31;
        k.a aVar = k.f76003b;
        int iE = f.e(iHashCode, 31, this.f162251b);
        m.a aVar2 = m.f76012b;
        int iE2 = f.e(iE, 31, this.f162252c);
        int i14 = this.f162253d;
        o0.a aVar3 = o0.f128897b;
        return Integer.hashCode(i14) + iE2;
    }

    @Override // t4.d
    public final void onDraw(q4.f fVar) {
        long jRound = (((long) Math.round(Float.intBitsToFloat((int) (fVar.b() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)))) & 4294967295L);
        m.a aVar = m.f76012b;
        q4.f.B0(fVar, this.f162250a, this.f162251b, this.f162252c, 0L, jRound, this.f162255f, null, this.f162256g, 0, this.f162253d, 328);
    }

    public final String toString() {
        return "BitmapPainter(image=" + this.f162250a + ", srcOffset=" + ((Object) k.f(this.f162251b)) + ", srcSize=" + ((Object) m.d(this.f162252c)) + ", filterQuality=" + ((Object) o0.b(this.f162253d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a(v0 v0Var, long j8, long j14, j jVar) {
        this(v0Var, j8, j14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(v0 v0Var, long j8, long j14, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            k.f76003b.getClass();
            j8 = 0;
        }
        long j15 = j8;
        if ((i14 & 4) != 0) {
            j14 = (((long) v0Var.getWidth()) << 32) | (((long) v0Var.getHeight()) & 4294967295L);
            m.a aVar = m.f76012b;
        }
        this(v0Var, j15, j14, null);
    }
}
