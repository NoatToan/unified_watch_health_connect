package cf0;

import com.google.firebase.analytics.FirebaseAnalytics;
import ds.e0;
import fb1.c;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcf0/a;", "", "", "startTime", "endTime", "", "heartRateValue", "heartRateUnit", "heartRateLabel", "colorResId", "zoneValue", "zoneLabel", FirebaseAnalytics.Param.INDEX, "accumulatedValue", "alertType", "alertString", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f27008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27014l;

    public /* synthetic */ a(String str, String str2, int i14, String str3, String str4, Integer num, String str5, String str6, int i15, int i16, String str7, String str8, int i17, j jVar) {
        this(str, str2, i14, str3, str4, (i17 & 32) != 0 ? null : num, str5, str6, i15, i16, (i17 & 1024) != 0 ? null : str7, (i17 & 2048) != 0 ? null : str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f27003a, aVar.f27003a) && s.g(this.f27004b, aVar.f27004b) && this.f27005c == aVar.f27005c && s.g(this.f27006d, aVar.f27006d) && s.g(this.f27007e, aVar.f27007e) && s.g(this.f27008f, aVar.f27008f) && s.g(this.f27009g, aVar.f27009g) && s.g(this.f27010h, aVar.f27010h) && this.f27011i == aVar.f27011i && this.f27012j == aVar.f27012j && s.g(this.f27013k, aVar.f27013k) && s.g(this.f27014l, aVar.f27014l);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(q2.d(this.f27005c, g.j(this.f27003a.hashCode() * 31, 31, this.f27004b), 31), 31, this.f27006d), 31, this.f27007e);
        Integer num = this.f27008f;
        int iD = q2.d(this.f27012j, q2.d(this.f27011i, g.j(g.j((iJ + (num == null ? 0 : num.hashCode())) * 31, 31, this.f27009g), 31, this.f27010h), 31), 31);
        String str = this.f27013k;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27014l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i14 = this.f27005c;
        Integer num = this.f27008f;
        String str = this.f27013k;
        String str2 = this.f27014l;
        StringBuilder sbI = b.i("HeartRateMarkerData(startTime=", this.f27003a, ", endTime=", this.f27004b, ", heartRateValue=");
        g.t(i14, ", heartRateUnit=", this.f27006d, ", heartRateLabel=", sbI);
        c.u(num, this.f27007e, ", colorResId=", ", zoneValue=", sbI);
        sn.a.t(sbI, this.f27009g, ", zoneLabel=", this.f27010h, ", index=");
        e0.m(this.f27011i, this.f27012j, ", accumulatedValue=", ", alertType=", sbI);
        return e5.h(sbI, str, ", alertString=", str2, ")");
    }

    public a(String str, String str2, int i14, String str3, String str4, Integer num, String str5, String str6, int i15, int i16, String str7, String str8) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.f27003a = str;
        this.f27004b = str2;
        this.f27005c = i14;
        this.f27006d = str3;
        this.f27007e = str4;
        this.f27008f = num;
        this.f27009g = str5;
        this.f27010h = str6;
        this.f27011i = i15;
        this.f27012j = i16;
        this.f27013k = str7;
        this.f27014l = str8;
    }
}
