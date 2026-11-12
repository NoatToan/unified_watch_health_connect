package pu0;

import com.garmin.android.apps.connectmobile.f3;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpu0/c;", "", "", "userId", "", "profileImageUrlMedium", "profileImageUrlSmall", FirebaseAnalytics.Param.LOCATION, "fullName", "displayName", "", "userLevel", "profileVisibility", "connectionRequestId", "connectionRequestorId", "connectionStatus", "", "userRoles", "mutualConnectionsCount", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f141199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f141203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f141204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f141205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f141206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f141207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f141208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f141209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<String> f141210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f141211m;

    public c(Long l14, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l15, Long l16, Integer num3, List<String> list, Integer num4) {
        this.f141199a = l14;
        this.f141200b = str;
        this.f141201c = str2;
        this.f141202d = str3;
        this.f141203e = str4;
        this.f141204f = str5;
        this.f141205g = num;
        this.f141206h = num2;
        this.f141207i = l15;
        this.f141208j = l16;
        this.f141209k = num3;
        this.f141210l = list;
        this.f141211m = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f141199a, cVar.f141199a) && s.g(this.f141200b, cVar.f141200b) && s.g(this.f141201c, cVar.f141201c) && s.g(this.f141202d, cVar.f141202d) && s.g(this.f141203e, cVar.f141203e) && s.g(this.f141204f, cVar.f141204f) && s.g(this.f141205g, cVar.f141205g) && s.g(this.f141206h, cVar.f141206h) && s.g(this.f141207i, cVar.f141207i) && s.g(this.f141208j, cVar.f141208j) && s.g(this.f141209k, cVar.f141209k) && s.g(this.f141210l, cVar.f141210l) && s.g(this.f141211m, cVar.f141211m);
    }

    public final int hashCode() {
        Long l14 = this.f141199a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f141200b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141201c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141202d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141203e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141204f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f141205g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f141206h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l15 = this.f141207i;
        int iHashCode9 = (iHashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f141208j;
        int iHashCode10 = (iHashCode9 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Integer num3 = this.f141209k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.f141210l;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.f141211m;
        return iHashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("ContactSocialProfile(userId=", ", profileImageUrlMedium=", this.f141200b, this.f141199a, ", profileImageUrlSmall=");
        sn.a.t(sbJ, this.f141201c, ", location=", this.f141202d, ", fullName=");
        sn.a.t(sbJ, this.f141203e, ", displayName=", this.f141204f, ", userLevel=");
        x.m(sbJ, this.f141205g, ", profileVisibility=", this.f141206h, ", connectionRequestId=");
        kg.f.s(sbJ, this.f141207i, ", connectionRequestorId=", this.f141208j, ", connectionStatus=");
        sbJ.append(this.f141209k);
        sbJ.append(", userRoles=");
        sbJ.append(this.f141210l);
        sbJ.append(", mutualConnectionsCount=");
        return f3.i(sbJ, this.f141211m, ")");
    }
}
