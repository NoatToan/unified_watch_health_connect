package nr;

import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/i;", "", "Lnr/t;", "mainDetailsState", "", "isRefreshing", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Lnr/w0;", "events", "<init>", "(Lnr/t;ZZLjava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f127191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<w0> f127194d;

    public i(t tVar, boolean z14, boolean z15, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : tVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? p13.j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f127191a, iVar.f127191a) && this.f127192b == iVar.f127192b && this.f127193c == iVar.f127193c && p005kotlin.jvm.internal.s.g(this.f127194d, iVar.f127194d);
    }

    public final int hashCode() {
        t tVar = this.f127191a;
        return this.f127194d.hashCode() + q6.f.g(q6.f.g((tVar == null ? 0 : tVar.hashCode()) * 31, 31, this.f127192b), 31, this.f127193c);
    }

    public final String toString() {
        return "ActivityDetailsState(mainDetailsState=" + this.f127191a + ", isRefreshing=" + this.f127192b + ", error=" + this.f127193c + ", events=" + this.f127194d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(t tVar, boolean z14, boolean z15, List<? extends w0> list) {
        list.getClass();
        this.f127191a = tVar;
        this.f127192b = z14;
        this.f127193c = z15;
        this.f127194d = list;
    }

    public i() {
        this(null, false, false, null, 15, null);
    }
}
