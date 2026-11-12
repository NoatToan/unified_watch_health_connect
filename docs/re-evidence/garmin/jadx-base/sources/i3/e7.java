package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/e7;", "", "Lo4/d0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f87960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f87961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f87962d;

    private e7(long j8, long j14, long j15, long j16) {
        this.f87959a = j8;
        this.f87960b = j14;
        this.f87961c = j15;
        this.f87962d = j16;
    }

    public static e7 a(e7 e7Var, long j8, long j14, int i14) {
        long j15 = e7Var.f87960b;
        long j16 = e7Var.f87959a;
        if ((i14 & 2) != 0) {
            j8 = j15;
        }
        long j17 = e7Var.f87961c;
        if (j8 != 16) {
            j15 = j8;
        }
        return new e7(j16, j15, j17, j14 != 16 ? j14 : e7Var.f87962d, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return o4.d0.d(this.f87959a, e7Var.f87959a) && o4.d0.d(this.f87960b, e7Var.f87960b) && o4.d0.d(this.f87961c, e7Var.f87961c) && o4.d0.d(this.f87962d, e7Var.f87962d);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f87962d) + q6.f.e(q6.f.e(Long.hashCode(this.f87959a) * 31, 31, this.f87960b), 31, this.f87961c);
    }

    public /* synthetic */ e7(long j8, long j14, long j15, long j16, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16);
    }
}
