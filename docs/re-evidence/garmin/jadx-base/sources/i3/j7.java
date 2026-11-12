package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/j7;", "", "Lo4/d0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f88531f;

    private j7(long j8, long j14, long j15, long j16, long j17, long j18) {
        this.f88526a = j8;
        this.f88527b = j14;
        this.f88528c = j15;
        this.f88529d = j16;
        this.f88530e = j17;
        this.f88531f = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return o4.d0.d(this.f88526a, j7Var.f88526a) && o4.d0.d(this.f88527b, j7Var.f88527b) && o4.d0.d(this.f88528c, j7Var.f88528c) && o4.d0.d(this.f88529d, j7Var.f88529d) && o4.d0.d(this.f88530e, j7Var.f88530e) && o4.d0.d(this.f88531f, j7Var.f88531f);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f88531f) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f88526a) * 31, 31, this.f88527b), 31, this.f88528c), 31, this.f88529d), 31, this.f88530e);
    }

    public /* synthetic */ j7(long j8, long j14, long j15, long j16, long j17, long j18, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18);
    }
}
