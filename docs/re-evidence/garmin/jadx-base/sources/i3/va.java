package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/va;", "", "Lo4/d0;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90007d;

    private va(long j8, long j14, long j15, long j16) {
        this.f90004a = j8;
        this.f90005b = j14;
        this.f90006c = j15;
        this.f90007d = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return o4.d0.d(this.f90004a, vaVar.f90004a) && o4.d0.d(this.f90005b, vaVar.f90005b) && o4.d0.d(this.f90006c, vaVar.f90006c) && o4.d0.d(this.f90007d, vaVar.f90007d);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f90007d) + q6.f.e(q6.f.e(Long.hashCode(this.f90004a) * 31, 31, this.f90005b), 31, this.f90006c);
    }

    public /* synthetic */ va(long j8, long j14, long j15, long j16, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16);
    }
}
