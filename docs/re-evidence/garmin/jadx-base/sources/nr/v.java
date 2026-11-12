package nr;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/v;", "", "", "Lr80/b;", "deviceInfo", "Lps/c0;", "ciqApps", "Lto/k;", "thirdPartyUploaderDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/d0;", "sensors", "<init>", "(Ljava/util/List;Ljava/util/List;Lto/k;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r80.b> f127378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ps.c0> f127379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to.k f127380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.d0> f127381d;

    public v(List list, List list2, to.k kVar, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : kVar, (i14 & 8) != 0 ? p13.j0.f134944a : list3);
    }

    public static v a(v vVar, to.k kVar, List list, int i14) {
        List<r80.b> list2 = vVar.f127378a;
        List<ps.c0> list3 = vVar.f127379b;
        if ((i14 & 4) != 0) {
            kVar = vVar.f127380c;
        }
        if ((i14 & 8) != 0) {
            list = vVar.f127381d;
        }
        list.getClass();
        return new v(list2, list3, kVar, list);
    }

    public final r80.b b() {
        List<r80.b> list = this.f127378a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (list.size() == 1 || ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).g(list.get(0).getApplicationKey())) ? list.get(0) : list.get(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f127378a, vVar.f127378a) && p005kotlin.jvm.internal.s.g(this.f127379b, vVar.f127379b) && p005kotlin.jvm.internal.s.g(this.f127380c, vVar.f127380c) && p005kotlin.jvm.internal.s.g(this.f127381d, vVar.f127381d);
    }

    public final int hashCode() {
        List<r80.b> list = this.f127378a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ps.c0> list2 = this.f127379b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        to.k kVar = this.f127380c;
        return this.f127381d.hashCode() + ((iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("DeviceData(deviceInfo=", ", ciqApps=", ", thirdPartyUploaderDTO=", this.f127378a, this.f127379b);
        sbK.append(this.f127380c);
        sbK.append(", sensors=");
        sbK.append(this.f127381d);
        sbK.append(")");
        return sbK.toString();
    }

    public v(List<r80.b> list, List<ps.c0> list2, to.k kVar, List<com.garmin.android.apps.connectmobile.activities.newmodel.d0> list3) {
        list3.getClass();
        this.f127378a = list;
        this.f127379b = list2;
        this.f127380c = kVar;
        this.f127381d = list3;
    }

    public v() {
        this(null, null, null, null, 15, null);
    }
}
