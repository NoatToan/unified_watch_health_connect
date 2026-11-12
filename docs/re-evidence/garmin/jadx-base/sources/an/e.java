package an;

import com.google.firebase.messaging.Constants;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lan/e;", "", "Lu4/d;", "icon", "Lo4/d0;", "iconColor", "iconBackgroundColor", "", "title", Constants.ScionAnalytics.PARAM_LABEL, "metric1", "metric2", "metric3", "titleContentDescription", "labelContentDescription", "metric1ContentDescription", "metric2ContentDescription", "metric3ContentDescription", "buttonIcon1", "buttonIcon2", "button1ContentDescription", "button2ContentDescription", "", "isStale", "<init>", "(Lu4/d;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu4/d;Lu4/d;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/j;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f4438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f4450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u4.d f4451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u4.d f4452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f4453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f4455r;

    public /* synthetic */ e(u4.d dVar, long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, u4.d dVar2, u4.d dVar3, String str11, String str12, boolean z14, int i14, j jVar) {
        this(dVar, j8, j14, str, str2, str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : str8, (i14 & 2048) != 0 ? null : str9, (i14 & 4096) != 0 ? null : str10, (i14 & 8192) != 0 ? null : dVar2, (i14 & 16384) != 0 ? null : dVar3, (32768 & i14) != 0 ? null : str11, (65536 & i14) != 0 ? null : str12, (i14 & 131072) != 0 ? false : z14, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f4438a, eVar.f4438a) && d0.d(this.f4439b, eVar.f4439b) && d0.d(this.f4440c, eVar.f4440c) && s.g(this.f4441d, eVar.f4441d) && s.g(this.f4442e, eVar.f4442e) && s.g(this.f4443f, eVar.f4443f) && s.g(this.f4444g, eVar.f4444g) && s.g(this.f4445h, eVar.f4445h) && s.g(this.f4446i, eVar.f4446i) && s.g(this.f4447j, eVar.f4447j) && s.g(this.f4448k, eVar.f4448k) && s.g(this.f4449l, eVar.f4449l) && s.g(this.f4450m, eVar.f4450m) && s.g(this.f4451n, eVar.f4451n) && s.g(this.f4452o, eVar.f4452o) && s.g(this.f4453p, eVar.f4453p) && s.g(this.f4454q, eVar.f4454q) && this.f4455r == eVar.f4455r;
    }

    public final int hashCode() {
        int iHashCode = this.f4438a.hashCode() * 31;
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        int iJ = g.j(g.j(g.j(f.e(f.e(iHashCode, 31, this.f4439b), 31, this.f4440c), 31, this.f4441d), 31, this.f4442e), 31, this.f4443f);
        String str = this.f4444g;
        int iHashCode2 = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4445h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4446i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4447j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4448k;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f4449l;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4450m;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        u4.d dVar = this.f4451n;
        int iHashCode9 = (iHashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        u4.d dVar2 = this.f4452o;
        int iHashCode10 = (iHashCode9 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str8 = this.f4453p;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4454q;
        return Boolean.hashCode(this.f4455r) + ((iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strJ = d0.j(this.f4439b);
        String strJ2 = d0.j(this.f4440c);
        StringBuilder sb3 = new StringBuilder("PendingActivityUiState(icon=");
        sb3.append(this.f4438a);
        sb3.append(", iconColor=");
        sb3.append(strJ);
        sb3.append(", iconBackgroundColor=");
        sn.a.t(sb3, strJ2, ", title=", this.f4441d, ", label=");
        sn.a.t(sb3, this.f4442e, ", metric1=", this.f4443f, ", metric2=");
        sn.a.t(sb3, this.f4444g, ", metric3=", this.f4445h, ", titleContentDescription=");
        sn.a.t(sb3, this.f4446i, ", labelContentDescription=", this.f4447j, ", metric1ContentDescription=");
        sn.a.t(sb3, this.f4448k, ", metric2ContentDescription=", this.f4449l, ", metric3ContentDescription=");
        sb3.append(this.f4450m);
        sb3.append(", buttonIcon1=");
        sb3.append(this.f4451n);
        sb3.append(", buttonIcon2=");
        sb3.append(this.f4452o);
        sb3.append(", button1ContentDescription=");
        sb3.append(this.f4453p);
        sb3.append(", button2ContentDescription=");
        return am.j.n(this.f4454q, ", isStale=", ")", sb3, this.f4455r);
    }

    private e(u4.d dVar, long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, u4.d dVar2, u4.d dVar3, String str11, String str12, boolean z14) {
        dVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f4438a = dVar;
        this.f4439b = j8;
        this.f4440c = j14;
        this.f4441d = str;
        this.f4442e = str2;
        this.f4443f = str3;
        this.f4444g = str4;
        this.f4445h = str5;
        this.f4446i = str6;
        this.f4447j = str7;
        this.f4448k = str8;
        this.f4449l = str9;
        this.f4450m = str10;
        this.f4451n = dVar2;
        this.f4452o = dVar3;
        this.f4453p = str11;
        this.f4454q = str12;
        this.f4455r = z14;
    }

    public /* synthetic */ e(u4.d dVar, long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, u4.d dVar2, u4.d dVar3, String str11, String str12, boolean z14, j jVar) {
        this(dVar, j8, j14, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, dVar2, dVar3, str11, str12, z14);
    }
}
