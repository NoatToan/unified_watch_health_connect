package y10;

import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly10/m0;", "", "Ly10/g0;", "status", "", "responseCode", "", "Lo10/b;", "apps", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lo10/a;", "appIcons", "<init>", "(Ly10/g0;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f193947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f193948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o10.b> f193949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f193950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<o10.a> f193951e;

    public /* synthetic */ m0(g0 g0Var, Integer num, List list, String str, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(g0Var, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f193947a == m0Var.f193947a && p005kotlin.jvm.internal.s.g(this.f193948b, m0Var.f193948b) && p005kotlin.jvm.internal.s.g(this.f193949c, m0Var.f193949c) && p005kotlin.jvm.internal.s.g(this.f193950d, m0Var.f193950d) && p005kotlin.jvm.internal.s.g(this.f193951e, m0Var.f193951e);
    }

    public final int hashCode() {
        int iHashCode = this.f193947a.hashCode() * 31;
        Integer num = this.f193948b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<o10.b> list = this.f193949c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f193950d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<o10.a> list2 = this.f193951e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectIqUiResource(status=");
        sb3.append(this.f193947a);
        sb3.append(", responseCode=");
        sb3.append(this.f193948b);
        sb3.append(", apps=");
        o2.c.n(", error=", this.f193950d, ", appIcons=", sb3, this.f193949c);
        return u62.z.c(sb3, this.f193951e, ")");
    }

    public m0(g0 g0Var, Integer num, List<o10.b> list, String str, List<o10.a> list2) {
        g0Var.getClass();
        this.f193947a = g0Var;
        this.f193948b = num;
        this.f193949c = list;
        this.f193950d = str;
        this.f193951e = list2;
    }
}
