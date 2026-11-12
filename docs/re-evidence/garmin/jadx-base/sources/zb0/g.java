package zb0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzb0/g;", "Lkj1/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends kj1.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f203483h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gj1.c f203486f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f203484d = o13.m.b(new z41.j(24));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f203485e = o13.m.b(new z41.j(25));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f203487g = new f();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzb0/g$a;", "", "", "available", "completed", "<init>", "(ZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f203488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f203489b;

        public a(boolean z14, boolean z15) {
            this.f203488a = z14;
            this.f203489b = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f203488a == aVar.f203488a && this.f203489b == aVar.f203489b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f203489b) + (Boolean.hashCode(this.f203488a) * 31);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.e("EcgState(available=", ", completed=", ")", this.f203488a, this.f203489b);
        }
    }

    public final boolean A4(u0 u0Var, long j8) {
        gj1.a aVarT;
        u0Var.getClass();
        gj1.f fVar = this.f104965b;
        List<gj1.a> listF = fVar != null ? fVar.f() : null;
        this.f203487g.getClass();
        if (u0Var != u0.P5 || listF == null || (aVarT = gl.b.t(Long.valueOf(j8), listF)) == null) {
            return false;
        }
        Integer currentFirmwareVersionMajor = aVarT.getCurrentFirmwareVersionMajor();
        Boolean isPrimaryUser = aVarT.getIsPrimaryUser();
        return currentFirmwareVersionMajor != null && currentFirmwareVersionMajor.intValue() < 3 && isPrimaryUser != null && isPrimaryUser.booleanValue();
    }
}
