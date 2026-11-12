package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/k1;", "", "Lo4/d0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88657d;

    private k1(long j8, long j14, long j15, long j16) {
        this.f88654a = j8;
        this.f88655b = j14;
        this.f88656c = j15;
        this.f88657d = j16;
    }

    public final k1 a(long j8, long j14, long j15, long j16) {
        return new k1(j8 != 16 ? j8 : this.f88654a, j14 != 16 ? j14 : this.f88655b, j15 != 16 ? j15 : this.f88656c, j16 != 16 ? j16 : this.f88657d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return o4.d0.d(this.f88654a, k1Var.f88654a) && o4.d0.d(this.f88655b, k1Var.f88655b) && o4.d0.d(this.f88656c, k1Var.f88656c) && o4.d0.d(this.f88657d, k1Var.f88657d);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f88657d) + q6.f.e(q6.f.e(Long.hashCode(this.f88654a) * 31, 31, this.f88655b), 31, this.f88656c);
    }

    public /* synthetic */ k1(long j8, long j14, long j15, long j16, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16);
    }
}
