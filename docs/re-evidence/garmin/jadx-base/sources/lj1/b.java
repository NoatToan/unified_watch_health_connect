package lj1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llj1/b;", "", "Lej1/b;", "deviceType", "", "Lgj1/b;", "listDevices", "", "ptdDeviceID", "pwdDeviceID", "", "hasNotCompatibleDevices", "", "notCompatibleDevices", "hasAnyOneNotLHACapable", "<init>", "(Lej1/b;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Z)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej1.b f113042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<gj1.b> f113043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f113044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f113045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f113046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f113048g;

    public /* synthetic */ b(ej1.b bVar, List list, Long l14, Long l15, boolean z14, String str, boolean z15, int i14, j jVar) {
        this((i14 & 1) != 0 ? ej1.b.WEARABLE_DEVICE : bVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : l15, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f113042a == bVar.f113042a && s.g(this.f113043b, bVar.f113043b) && s.g(this.f113044c, bVar.f113044c) && s.g(this.f113045d, bVar.f113045d) && this.f113046e == bVar.f113046e && s.g(this.f113047f, bVar.f113047f) && this.f113048g == bVar.f113048g;
    }

    public final int hashCode() {
        int iHashCode = this.f113042a.hashCode() * 31;
        List<gj1.b> list = this.f113043b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l14 = this.f113044c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f113045d;
        int iG = f.g((iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.f113046e);
        String str = this.f113047f;
        return Boolean.hashCode(this.f113048g) + ((iG + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrimaryDeviceMainUIModel(deviceType=");
        sb3.append(this.f113042a);
        sb3.append(", listDevices=");
        sb3.append(this.f113043b);
        sb3.append(", ptdDeviceID=");
        kg.f.s(sb3, this.f113044c, ", pwdDeviceID=", this.f113045d, ", hasNotCompatibleDevices=");
        fb1.c.w(", notCompatibleDevices=", this.f113047f, ", hasAnyOneNotLHACapable=", sb3, this.f113046e);
        return hb.a.k(sb3, this.f113048g, ")");
    }

    public b(ej1.b bVar, List<gj1.b> list, Long l14, Long l15, boolean z14, String str, boolean z15) {
        bVar.getClass();
        this.f113042a = bVar;
        this.f113043b = list;
        this.f113044c = l14;
        this.f113045d = l15;
        this.f113046e = z14;
        this.f113047f = str;
        this.f113048g = z15;
    }

    public b() {
        this(null, null, null, null, false, null, false, 127, null);
    }
}
