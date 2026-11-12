package j3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj3/e;", "", "", "isTabletop", "", "Lj3/d;", "hingeList", "<init>", "(ZLjava/util/List;)V", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f96833b;

    public e(boolean z14, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f96832a == eVar.f96832a && s.g(this.f96833b, eVar.f96833b);
    }

    public final int hashCode() {
        return this.f96833b.hashCode() + (Boolean.hashCode(this.f96832a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Posture(isTabletop=");
        sb3.append(this.f96832a);
        sb3.append(", hinges=[");
        return am.j.o(h0.k0(this.f96833b, ", ", null, null, null, 62), "])", sb3);
    }

    public e(boolean z14, List<d> list) {
        this.f96832a = z14;
        this.f96833b = list;
    }

    public e() {
        this(false, null, 3, null);
    }
}
