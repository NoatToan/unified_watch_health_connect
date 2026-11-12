package s5;

import ch.qos.logback.core.CoreConstants;
import o4.r1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ls5/h;", "Ls5/c$a;", "Lo4/r1;", "shape", "Lg6/q;", "width", "height", "padding", "Lo4/w;", "brush", "", "alpha", "Lq4/g;", "drawStyle", "<init>", "(Lo4/r1;JJJLo4/w;FLq4/g;Lkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f157198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f157199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f157200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f157201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.w f157202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f157203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q4.g f157204g;

    static {
        new a(null);
        o53.f0.H(1, 8589934592L);
        float f14 = (float) 0.25d;
        long jH = o53.f0.H(f14, 8589934592L);
        new h(j.f157227a, jH, jH, o53.f0.H(f14, 8589934592L), null, 0.0f, null, 112, null);
    }

    public /* synthetic */ h(r1 r1Var, long j8, long j14, long j15, o4.w wVar, float f14, q4.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(r1Var, j8, j14, j15, (i14 & 16) != 0 ? null : wVar, (i14 & 32) != 0 ? Float.NaN : f14, (i14 & 64) != 0 ? q4.j.f142560a : gVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f157198a, hVar.f157198a) && g6.q.b(this.f157199b, hVar.f157199b) && g6.q.b(this.f157200c, hVar.f157200c) && g6.q.b(this.f157201d, hVar.f157201d) && p005kotlin.jvm.internal.s.g(this.f157202e, hVar.f157202e) && this.f157203f == hVar.f157203f && p005kotlin.jvm.internal.s.g(this.f157204g, hVar.f157204g);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f157198a.hashCode() * 31;
        g6.q.a aVar = g6.q.f76018b;
        int iE = q6.f.e(q6.f.e(q6.f.e(iHashCode, 31, this.f157199b), 31, this.f157200c), 31, this.f157201d);
        o4.w wVar = this.f157202e;
        return this.f157204g.hashCode() + q6.f.d(this.f157203f, (iE + (wVar != null ? wVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Bullet(shape=" + this.f157198a + ", size=(" + ((Object) g6.q.f(this.f157199b)) + ", " + ((Object) g6.q.f(this.f157200c)) + "), padding=" + ((Object) g6.q.f(this.f157201d)) + ", brush=" + this.f157202e + ", alpha=" + this.f157203f + ", drawStyle=" + this.f157204g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/h$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private h(r1 r1Var, long j8, long j14, long j15, o4.w wVar, float f14, q4.g gVar) {
        this.f157198a = r1Var;
        this.f157199b = j8;
        this.f157200c = j14;
        this.f157201d = j15;
        this.f157202e = wVar;
        this.f157203f = f14;
        this.f157204g = gVar;
    }

    public /* synthetic */ h(r1 r1Var, long j8, long j14, long j15, o4.w wVar, float f14, q4.g gVar, p005kotlin.jvm.internal.j jVar) {
        this(r1Var, j8, j14, j15, wVar, f14, gVar);
    }
}
