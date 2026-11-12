package pu0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpu0/f;", "", "", "contactId", "", FirebaseAnalytics.Param.CONTENT, "Lpu0/g;", "flag", "", "isPrimary", "", "labelType", "localId", "emergencyContactMethod", "", "Lqu0/c;", "features", "isValid", "isEmsValue", "isSmsOptionAware", "confirmationStatus", "validationDate", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lpu0/g;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f141220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f141222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f141223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f141224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f141225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f141226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<qu0.c> f141227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f141228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f141229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f141230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f141231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f141232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f141233n;

    public /* synthetic */ f(Long l14, String str, g gVar, Boolean bool, Integer num, int i14, Boolean bool2, List list, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : l14, str, (i15 & 4) != 0 ? null : gVar, (i15 & 8) != 0 ? null : bool, (i15 & 16) != 0 ? null : num, (i15 & 32) != 0 ? -1 : i14, (i15 & 64) != 0 ? null : bool2, (i15 & 128) != 0 ? null : list, (i15 & 256) != 0 ? null : bool3, (i15 & 512) != 0 ? null : bool4, (i15 & 1024) != 0 ? null : bool5, (i15 & 2048) != 0 ? null : str2, (i15 & 4096) != 0 ? null : str3, (i15 & 8192) != 0 ? null : str4);
    }

    public static f a(f fVar, g gVar) {
        Long l14 = fVar.f141220a;
        String str = fVar.f141221b;
        Boolean bool = fVar.f141223d;
        Integer num = fVar.f141224e;
        int i14 = fVar.f141225f;
        Boolean bool2 = fVar.f141226g;
        List<qu0.c> list = fVar.f141227h;
        Boolean bool3 = fVar.f141228i;
        Boolean bool4 = fVar.f141229j;
        Boolean bool5 = fVar.f141230k;
        String str2 = fVar.f141231l;
        String str3 = fVar.f141232m;
        String str4 = fVar.f141233n;
        fVar.getClass();
        return new f(l14, str, gVar, bool, num, i14, bool2, list, bool3, bool4, bool5, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f141220a, fVar.f141220a) && s.g(this.f141221b, fVar.f141221b) && s.g(this.f141222c, fVar.f141222c) && s.g(this.f141223d, fVar.f141223d) && s.g(this.f141224e, fVar.f141224e) && this.f141225f == fVar.f141225f && s.g(this.f141226g, fVar.f141226g) && s.g(this.f141227h, fVar.f141227h) && s.g(this.f141228i, fVar.f141228i) && s.g(this.f141229j, fVar.f141229j) && s.g(this.f141230k, fVar.f141230k) && s.g(this.f141231l, fVar.f141231l) && s.g(this.f141232m, fVar.f141232m) && s.g(this.f141233n, fVar.f141233n);
    }

    public final int hashCode() {
        Long l14 = this.f141220a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f141221b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f141222c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f141223d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f141224e;
        int iD = q2.d(this.f141225f, (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        Boolean bool2 = this.f141226g;
        int iHashCode5 = (iD + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<qu0.c> list = this.f141227h;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.f141228i;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f141229j;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f141230k;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f141231l;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141232m;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f141233n;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        g gVar = this.f141222c;
        StringBuilder sbJ = b71.i.j("Email(contactId=", ", content=", this.f141221b, this.f141220a, ", flag=");
        sbJ.append(gVar);
        sbJ.append(", isPrimary=");
        sbJ.append(this.f141223d);
        sbJ.append(", labelType=");
        sbJ.append(this.f141224e);
        sbJ.append(", localId=");
        sbJ.append(this.f141225f);
        sbJ.append(", emergencyContactMethod=");
        sbJ.append(this.f141226g);
        sbJ.append(", features=");
        sbJ.append(this.f141227h);
        sbJ.append(", isValid=");
        b71.i.o(this.f141228i, this.f141229j, ", isEmsValue=", ", isSmsOptionAware=", sbJ);
        b71.i.s(sbJ, this.f141230k, ", confirmationStatus=", this.f141231l, ", validationDate=");
        return e5.h(sbJ, this.f141232m, ", countryCode=", this.f141233n, ")");
    }

    public f(Long l14, String str, g gVar, Boolean bool, Integer num, int i14, Boolean bool2, List<qu0.c> list, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, String str4) {
        this.f141220a = l14;
        this.f141221b = str;
        this.f141222c = gVar;
        this.f141223d = bool;
        this.f141224e = num;
        this.f141225f = i14;
        this.f141226g = bool2;
        this.f141227h = list;
        this.f141228i = bool3;
        this.f141229j = bool4;
        this.f141230k = bool5;
        this.f141231l = str2;
        this.f141232m = str3;
        this.f141233n = str4;
    }
}
