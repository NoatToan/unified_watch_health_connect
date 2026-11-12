package km0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkm0/b;", "", "", "groupName", "Lkm0/e;", "groupPhoto", "groupDescription", FirebaseAnalytics.Param.LOCATION, "facebookUrl", "twitterUsername", "websiteUrl", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$e;", "groupVisibility", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$d;", "groupPrivacy", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/e;", "groupActivities", "groupOtherActivity", "<init>", "(Ljava/lang/String;Lkm0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$e;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$d;Ljava/util/Set;Ljava/lang/String;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f105298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f105300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f105301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f105302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f105303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GroupDTO.e f105304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GroupDTO.d f105305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<com.garmin.android.apps.connectmobile.connections.groups.services.model.e> f105306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f105307k;

    public b(String str, e eVar, String str2, String str3, String str4, String str5, String str6, GroupDTO.e eVar2, GroupDTO.d dVar, Set set, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? GroupDTO.e.VISIBLE : eVar2, (i14 & 256) != 0 ? GroupDTO.d.PUBLIC : dVar, (i14 & 512) != 0 ? l0.f134950a : set, (i14 & 1024) != 0 ? null : str7);
    }

    public static b a(b bVar, String str, e eVar, String str2, String str3, String str4, String str5, String str6, GroupDTO.e eVar2, GroupDTO.d dVar, LinkedHashSet linkedHashSet, String str7, int i14) {
        if ((i14 & 1) != 0) {
            str = bVar.f105297a;
        }
        String str8 = str;
        if ((i14 & 2) != 0) {
            eVar = bVar.f105298b;
        }
        e eVar3 = eVar;
        if ((i14 & 4) != 0) {
            str2 = bVar.f105299c;
        }
        String str9 = str2;
        String str10 = (i14 & 8) != 0 ? bVar.f105300d : str3;
        String str11 = (i14 & 16) != 0 ? bVar.f105301e : str4;
        String str12 = (i14 & 32) != 0 ? bVar.f105302f : str5;
        String str13 = (i14 & 64) != 0 ? bVar.f105303g : str6;
        GroupDTO.e eVar4 = (i14 & 128) != 0 ? bVar.f105304h : eVar2;
        GroupDTO.d dVar2 = (i14 & 256) != 0 ? bVar.f105305i : dVar;
        Set<com.garmin.android.apps.connectmobile.connections.groups.services.model.e> set = (i14 & 512) != 0 ? bVar.f105306j : linkedHashSet;
        String str14 = (i14 & 1024) != 0 ? bVar.f105307k : str7;
        bVar.getClass();
        str8.getClass();
        eVar4.getClass();
        dVar2.getClass();
        set.getClass();
        return new b(str8, eVar3, str9, str10, str11, str12, str13, eVar4, dVar2, set, str14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f105297a, bVar.f105297a) && s.g(this.f105298b, bVar.f105298b) && s.g(this.f105299c, bVar.f105299c) && s.g(this.f105300d, bVar.f105300d) && s.g(this.f105301e, bVar.f105301e) && s.g(this.f105302f, bVar.f105302f) && s.g(this.f105303g, bVar.f105303g) && this.f105304h == bVar.f105304h && this.f105305i == bVar.f105305i && s.g(this.f105306j, bVar.f105306j) && s.g(this.f105307k, bVar.f105307k);
    }

    public final int hashCode() {
        int iHashCode = this.f105297a.hashCode() * 31;
        e eVar = this.f105298b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f105299c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f105300d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f105301e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f105302f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f105303g;
        int iHashCode7 = (this.f105306j.hashCode() + ((this.f105305i.hashCode() + ((this.f105304h.hashCode() + ((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str6 = this.f105307k;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GroupCreationData(groupName=");
        sb3.append(this.f105297a);
        sb3.append(", groupPhoto=");
        sb3.append(this.f105298b);
        sb3.append(", groupDescription=");
        sn.a.t(sb3, this.f105299c, ", location=", this.f105300d, ", facebookUrl=");
        sn.a.t(sb3, this.f105301e, ", twitterUsername=", this.f105302f, ", websiteUrl=");
        sb3.append(this.f105303g);
        sb3.append(", groupVisibility=");
        sb3.append(this.f105304h);
        sb3.append(", groupPrivacy=");
        sb3.append(this.f105305i);
        sb3.append(", groupActivities=");
        sb3.append(this.f105306j);
        sb3.append(", groupOtherActivity=");
        return am.j.o(this.f105307k, ")", sb3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, e eVar, String str2, String str3, String str4, String str5, String str6, GroupDTO.e eVar2, GroupDTO.d dVar, Set<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.e> set, String str7) {
        str.getClass();
        eVar2.getClass();
        dVar.getClass();
        set.getClass();
        this.f105297a = str;
        this.f105298b = eVar;
        this.f105299c = str2;
        this.f105300d = str3;
        this.f105301e = str4;
        this.f105302f = str5;
        this.f105303g = str6;
        this.f105304h = eVar2;
        this.f105305i = dVar;
        this.f105306j = set;
        this.f105307k = str7;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
