package nr;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/d;", "", "", "Lnr/u;", "devicesAndAppsList", "<init>", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u> f127004a;

    public d(List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f127004a, ((d) obj).f127004a);
    }

    public final int hashCode() {
        return this.f127004a.hashCode();
    }

    public final String toString() {
        return tn.k.h("DevicesAndApps(devicesAndAppsList=", ")", this.f127004a);
    }

    public d() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends u> list) {
        list.getClass();
        this.f127004a = list;
    }
}
