package xp1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxp1/b;", "", "Li53/c;", "Lxp1/c;", "dailySleeps", "", "localConnectDate", "Lxp1/d;", "solarInputReadings", "Lxp1/a;", "activities", "<init>", "(Li53/c;Ljava/lang/String;Li53/c;Li53/c;)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<c> f191853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<d> f191855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<a> f191856d;

    public /* synthetic */ b(i53.c cVar, String str, i53.c cVar2, i53.c cVar3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : cVar2, (i14 & 8) != 0 ? null : cVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f191853a, bVar.f191853a) && s.g(this.f191854b, bVar.f191854b) && s.g(this.f191855c, bVar.f191855c) && s.g(this.f191856d, bVar.f191856d);
    }

    public final int hashCode() {
        i53.c<c> cVar = this.f191853a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.f191854b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i53.c<d> cVar2 = this.f191855c;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        i53.c<a> cVar3 = this.f191856d;
        return iHashCode3 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    public final String toString() {
        return "DailySolarIntensityState(dailySleeps=" + this.f191853a + ", localConnectDate=" + this.f191854b + ", solarInputReadings=" + this.f191855c + ", activities=" + this.f191856d + ")";
    }

    public b(i53.c<c> cVar, String str, i53.c<d> cVar2, i53.c<a> cVar3) {
        this.f191853a = cVar;
        this.f191854b = str;
        this.f191855c = cVar2;
        this.f191856d = cVar3;
    }

    public b() {
        this(null, null, null, null, 15, null);
    }
}
