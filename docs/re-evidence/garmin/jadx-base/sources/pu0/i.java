package pu0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpu0/i;", "", "", "contactId", "", FirebaseAnalytics.Param.CONTENT, "Lpu0/g;", "flag", "", "isPrimary", "", "labelType", "localId", "emergencyContactMethod", "Lpu0/j;", "smsOptInLiveTrackStatus", "", "Lqu0/c;", "features", "isValid", "isEmsValue", "isSmsOptionAware", "confirmationStatus", "phoneUUID", "validationDate", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lpu0/g;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Boolean;Lpu0/j;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f141260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f141262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f141263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f141264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f141265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f141266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f141267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<qu0.c> f141268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f141269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f141270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f141271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f141272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f141273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f141274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f141275p;

    public /* synthetic */ i(Long l14, String str, g gVar, Boolean bool, Integer num, int i14, Boolean bool2, j jVar, List list, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4, String str5, int i15, p005kotlin.jvm.internal.j jVar2) {
        this((i15 & 1) != 0 ? null : l14, str, (i15 & 4) != 0 ? null : gVar, (i15 & 8) != 0 ? null : bool, (i15 & 16) != 0 ? null : num, (i15 & 32) != 0 ? -1 : i14, (i15 & 64) != 0 ? null : bool2, (i15 & 128) != 0 ? null : jVar, (i15 & 256) != 0 ? null : list, (i15 & 512) != 0 ? null : bool3, (i15 & 1024) != 0 ? null : bool4, (i15 & 2048) != 0 ? null : bool5, (i15 & 4096) != 0 ? null : str2, (i15 & 8192) != 0 ? null : str3, (i15 & 16384) != 0 ? null : str4, (i15 & 32768) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f141260a, iVar.f141260a) && s.g(this.f141261b, iVar.f141261b) && s.g(this.f141262c, iVar.f141262c) && s.g(this.f141263d, iVar.f141263d) && s.g(this.f141264e, iVar.f141264e) && this.f141265f == iVar.f141265f && s.g(this.f141266g, iVar.f141266g) && this.f141267h == iVar.f141267h && s.g(this.f141268i, iVar.f141268i) && s.g(this.f141269j, iVar.f141269j) && s.g(this.f141270k, iVar.f141270k) && s.g(this.f141271l, iVar.f141271l) && s.g(this.f141272m, iVar.f141272m) && s.g(this.f141273n, iVar.f141273n) && s.g(this.f141274o, iVar.f141274o) && s.g(this.f141275p, iVar.f141275p);
    }

    public final int hashCode() {
        Long l14 = this.f141260a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f141261b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f141262c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f141263d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f141264e;
        int iD = q2.d(this.f141265f, (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Boolean bool2 = this.f141266g;
        int iHashCode5 = (iD + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        j jVar = this.f141267h;
        int iHashCode6 = (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List<qu0.c> list = this.f141268i;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.f141269j;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f141270k;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f141271l;
        int iHashCode10 = (iHashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f141272m;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141273n;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141274o;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141275p;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        g gVar = this.f141262c;
        StringBuilder sbJ = b71.i.j("Phone(contactId=", ", content=", this.f141261b, this.f141260a, ", flag=");
        sbJ.append(gVar);
        sbJ.append(", isPrimary=");
        sbJ.append(this.f141263d);
        sbJ.append(", labelType=");
        sbJ.append(this.f141264e);
        sbJ.append(", localId=");
        sbJ.append(this.f141265f);
        sbJ.append(", emergencyContactMethod=");
        sbJ.append(this.f141266g);
        sbJ.append(", smsOptInLiveTrackStatus=");
        sbJ.append(this.f141267h);
        sbJ.append(", features=");
        sbJ.append(this.f141268i);
        sbJ.append(", isValid=");
        sbJ.append(this.f141269j);
        sbJ.append(", isEmsValue=");
        b71.i.o(this.f141270k, this.f141271l, ", isSmsOptionAware=", ", confirmationStatus=", sbJ);
        sn.a.t(sbJ, this.f141272m, ", phoneUUID=", this.f141273n, ", validationDate=");
        return e5.h(sbJ, this.f141274o, ", countryCode=", this.f141275p, ")");
    }

    public i(Long l14, String str, g gVar, Boolean bool, Integer num, int i14, Boolean bool2, j jVar, List<qu0.c> list, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4, String str5) {
        this.f141260a = l14;
        this.f141261b = str;
        this.f141262c = gVar;
        this.f141263d = bool;
        this.f141264e = num;
        this.f141265f = i14;
        this.f141266g = bool2;
        this.f141267h = jVar;
        this.f141268i = list;
        this.f141269j = bool3;
        this.f141270k = bool4;
        this.f141271l = bool5;
        this.f141272m = str2;
        this.f141273n = str3;
        this.f141274o = str4;
        this.f141275p = str5;
    }
}
