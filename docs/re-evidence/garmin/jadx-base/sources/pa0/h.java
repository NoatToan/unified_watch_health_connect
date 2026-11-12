package pa0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpa0/h;", "", "", "Lj90/g;", "transferDevices", "Lpa0/m;", "transferStatus", "", "pendingJobId", "<init>", "(Ljava/util/List;Lpa0/m;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j90.g> f136732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f136733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136734c;

    public h(List list, m mVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? m.d.f136762a : mVar, (i14 & 4) != 0 ? null : str);
    }

    public static h a(h hVar, List list, m mVar, String str, int i14) {
        if ((i14 & 1) != 0) {
            list = hVar.f136732a;
        }
        if ((i14 & 4) != 0) {
            str = hVar.f136734c;
        }
        hVar.getClass();
        list.getClass();
        mVar.getClass();
        return new h(list, mVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f136732a, hVar.f136732a) && s.g(this.f136733b, hVar.f136733b) && s.g(this.f136734c, hVar.f136734c);
    }

    public final int hashCode() {
        int iHashCode = (this.f136733b.hashCode() + (this.f136732a.hashCode() * 31)) * 31;
        String str = this.f136734c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LteSubscriptionUiState(transferDevices=");
        sb3.append(this.f136732a);
        sb3.append(", transferStatus=");
        sb3.append(this.f136733b);
        sb3.append(", pendingJobId=");
        return am.j.o(this.f136734c, ")", sb3);
    }

    public h(List<j90.g> list, m mVar, String str) {
        list.getClass();
        mVar.getClass();
        this.f136732a = list;
        this.f136733b = mVar;
        this.f136734c = str;
    }

    public h() {
        this(null, null, null, 7, null);
    }
}
