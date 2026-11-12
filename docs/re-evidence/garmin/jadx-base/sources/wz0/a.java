package wz0;

import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwz0/a;", "", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "requestItems", "activityItems", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "socialProfileMap", "totalAuthorizedViewerInvites", "", "nextCursor", "", "useCache", "refreshRequestsOnly", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILjava/lang/String;ZZ)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<NotificationItem> f188129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<NotificationItem> f188130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, l> f188131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f188132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f188133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f188134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f188135g;

    public /* synthetic */ a(List list, List list2, Map map, int i14, String str, boolean z14, boolean z15, int i15, j jVar) {
        this((i15 & 1) != 0 ? new ArrayList() : list, (i15 & 2) != 0 ? new ArrayList() : list2, (i15 & 4) != 0 ? new LinkedHashMap() : map, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? null : str, (i15 & 32) != 0 ? false : z14, (i15 & 64) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f188129a, aVar.f188129a) && s.g(this.f188130b, aVar.f188130b) && s.g(this.f188131c, aVar.f188131c) && this.f188132d == aVar.f188132d && s.g(this.f188133e, aVar.f188133e) && this.f188134f == aVar.f188134f && this.f188135g == aVar.f188135g;
    }

    public final int hashCode() {
        int iD = q2.d(this.f188132d, am.j.b(this.f188131c, u0.b(this.f188129a.hashCode() * 31, 31, this.f188130b), 31), 31);
        String str = this.f188133e;
        return Boolean.hashCode(this.f188135g) + q6.f.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f188134f);
    }

    public final String toString() {
        int i14 = this.f188132d;
        String str = this.f188133e;
        boolean z14 = this.f188134f;
        boolean z15 = this.f188135g;
        StringBuilder sbK = f3.k("NotificationDataSourceCache(requestItems=", ", activityItems=", ", socialProfileMap=", this.f188129a, this.f188130b);
        sbK.append(this.f188131c);
        sbK.append(", totalAuthorizedViewerInvites=");
        sbK.append(i14);
        sbK.append(", nextCursor=");
        h.C(str, ", useCache=", ", refreshRequestsOnly=", sbK, z14);
        return hb.a.k(sbK, z15, ")");
    }

    public a(List<NotificationItem> list, List<NotificationItem> list2, Map<Integer, l> map, int i14, String str, boolean z14, boolean z15) {
        list.getClass();
        list2.getClass();
        map.getClass();
        this.f188129a = list;
        this.f188130b = list2;
        this.f188131c = map;
        this.f188132d = i14;
        this.f188133e = str;
        this.f188134f = z14;
        this.f188135g = z15;
    }

    public a() {
        this(null, null, null, 0, null, false, false, 127, null);
    }
}
