package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/b1;", "", "Lo4/d0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f87532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f87533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f87534d;

    private b1(long j8, long j14, long j15, long j16) {
        this.f87531a = j8;
        this.f87532b = j14;
        this.f87533c = j15;
        this.f87534d = j16;
    }

    public final b1 a(long j8, long j14, long j15, long j16) {
        return new b1(j8 != 16 ? j8 : this.f87531a, j14 != 16 ? j14 : this.f87532b, j15 != 16 ? j15 : this.f87533c, j16 != 16 ? j16 : this.f87534d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return o4.d0.d(this.f87531a, b1Var.f87531a) && o4.d0.d(this.f87532b, b1Var.f87532b) && o4.d0.d(this.f87533c, b1Var.f87533c) && o4.d0.d(this.f87534d, b1Var.f87534d);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f87534d) + q6.f.e(q6.f.e(Long.hashCode(this.f87531a) * 31, 31, this.f87532b), 31, this.f87533c);
    }

    public /* synthetic */ b1(long j8, long j14, long j15, long j16, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16);
    }
}
