package j70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj70/j;", "ServerData", "RealtimeData", "", "Lyz1/d;", "serverDataStatus", "serverData", "realTimeData", "<init>", "(Lyz1/d;Ljava/lang/Object;Ljava/lang/Object;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j<ServerData, RealtimeData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f97542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServerData f97543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RealtimeData f97544c;

    public j(yz1.d dVar, ServerData serverdata, RealtimeData realtimedata) {
        dVar.getClass();
        this.f97542a = dVar;
        this.f97543b = serverdata;
        this.f97544c = realtimedata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f97542a.equals(jVar.f97542a) && p005kotlin.jvm.internal.s.g(this.f97543b, jVar.f97543b) && p005kotlin.jvm.internal.s.g(this.f97544c, jVar.f97544c);
    }

    public final int hashCode() {
        int iHashCode = this.f97542a.hashCode() * 31;
        ServerData serverdata = this.f97543b;
        int iHashCode2 = (iHashCode + (serverdata == null ? 0 : serverdata.hashCode())) * 31;
        RealtimeData realtimedata = this.f97544c;
        return iHashCode2 + (realtimedata != null ? realtimedata.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DashboardRealtimeCardData(serverDataStatus=");
        sb3.append(this.f97542a);
        sb3.append(", serverData=");
        sb3.append(this.f97543b);
        sb3.append(", realTimeData=");
        return am.j.k(this.f97544c, ")", sb3);
    }
}
