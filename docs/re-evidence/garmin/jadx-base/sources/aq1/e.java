package aq1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laq1/e;", "", "", "Lq92/x;", "pendingConsentsIds", "", "showError", "<init>", "(Ljava/util/List;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q92.x> f12364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12365b;

    public e(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list, (i14 & 2) != 0 ? false : z14);
    }

    public static e a(e eVar, List list, int i14) {
        if ((i14 & 1) != 0) {
            list = eVar.f12364a;
        }
        boolean z14 = (i14 & 2) != 0 ? eVar.f12365b : false;
        eVar.getClass();
        list.getClass();
        return new e(list, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f12364a, eVar.f12364a) && this.f12365b == eVar.f12365b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12365b) + (this.f12364a.hashCode() * 31);
    }

    public final String toString() {
        return "GraduationUIState(pendingConsentsIds=" + this.f12364a + ", showError=" + this.f12365b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends q92.x> list, boolean z14) {
        list.getClass();
        this.f12364a = list;
        this.f12365b = z14;
    }

    public e() {
        this(null, false, 3, null);
    }
}
