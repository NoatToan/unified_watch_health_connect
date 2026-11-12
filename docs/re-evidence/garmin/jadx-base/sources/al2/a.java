package al2;

import o13.t;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lal2/a;", "", "Lrs2/c;", "device", "Lok2/g0;", "transferType", "", "bytesTransferred", "totalBytes", "", "previousPercent", "", "hasPendingUploads", "maxPercent", "<init>", "(Lrs2/c;Lok2/g0;JJFZF)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0065a f3758i = new C0065a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f3759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f3760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f3766h;

    public /* synthetic */ a(rs2.c cVar, g0 g0Var, long j8, long j14, float f14, boolean z14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, g0Var, j8, j14, (i14 & 16) != 0 ? 0.0f : f14, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? 100.0f : f15);
    }

    public final float a() {
        return ((Number) this.f3766h.getValue()).floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f3759a, aVar.f3759a) && this.f3760b == aVar.f3760b && this.f3761c == aVar.f3761c && this.f3762d == aVar.f3762d && Float.compare(this.f3763e, aVar.f3763e) == 0 && this.f3764f == aVar.f3764f && Float.compare(this.f3765g, aVar.f3765g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3765g) + q6.f.g(q6.f.d(this.f3763e, q6.f.e(q6.f.e((this.f3760b.hashCode() + (this.f3759a.hashCode() * 31)) * 31, 31, this.f3761c), 31, this.f3762d), 31), 31, this.f3764f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BatchProgress(");
        sb3.append(cl2.c.p(this.f3759a));
        sb3.append(", " + this.f3760b);
        sb3.append(", " + MathKt.c(a()) + "%");
        StringBuilder sb4 = new StringBuilder(", sentBytes=");
        sb4.append(this.f3761c);
        sb3.append(sb4.toString());
        sb3.append(", totalBytes=" + this.f3762d);
        sb3.append(", previousPercent" + MathKt.c(this.f3763e) + "%");
        StringBuilder sb5 = new StringBuilder(", hasPendingUploads=");
        sb5.append(this.f3764f);
        sb3.append(sb5.toString());
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: al2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal2/a$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0065a {
        public /* synthetic */ C0065a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0065a() {
        }
    }

    public a(rs2.c cVar, g0 g0Var, long j8, long j14, float f14, boolean z14, float f15) {
        cVar.getClass();
        g0Var.getClass();
        this.f3759a = cVar;
        this.f3760b = g0Var;
        this.f3761c = j8;
        this.f3762d = j14;
        this.f3763e = f14;
        this.f3764f = z14;
        this.f3765g = f15;
        this.f3766h = o13.m.b(new a03.e(this, 13));
    }
}
