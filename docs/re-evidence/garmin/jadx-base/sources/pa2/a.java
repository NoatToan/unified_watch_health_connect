package pa2;

import com.garmin.android.apps.connectmobile.R;
import fb1.c;
import java.sql.Date;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B}\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpa2/a;", "", "", "reportsFeatureName", "reportsFeatureAPIId", "baseURL", "Lokhttp3/OkHttpClient;", "httpClient", "", "loadingViewResourceId", "", "isActionBarDividerLineRequired", "userLocale", "Ljava/sql/Date;", "reportStartDate", "reportEndDate", "reportsPrefixName", "reportsOptionalBody", "reportsPreviewScreenTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/OkHttpClient;IZLjava/lang/String;Ljava/sql/Date;Ljava/sql/Date;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OkHttpClient f136772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f136773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f136774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f136775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Date f136776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Date f136777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f136778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f136779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f136780l;

    public /* synthetic */ a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, boolean z14, String str4, Date date, Date date2, String str5, Object obj, String str6, int i15, j jVar) {
        this(str, str2, str3, okHttpClient, (i15 & 16) != 0 ? R.layout.er_loading_view : i14, (i15 & 32) != 0 ? true : z14, str4, (i15 & 128) != 0 ? null : date, (i15 & 256) != 0 ? null : date2, str5, (i15 & 1024) != 0 ? null : obj, (i15 & 2048) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f136769a, aVar.f136769a) && s.g(this.f136770b, aVar.f136770b) && s.g(this.f136771c, aVar.f136771c) && s.g(this.f136772d, aVar.f136772d) && this.f136773e == aVar.f136773e && this.f136774f == aVar.f136774f && s.g(this.f136775g, aVar.f136775g) && s.g(this.f136776h, aVar.f136776h) && s.g(this.f136777i, aVar.f136777i) && s.g(this.f136778j, aVar.f136778j) && s.g(this.f136779k, aVar.f136779k) && s.g(this.f136780l, aVar.f136780l);
    }

    public final int hashCode() {
        int iJ = g.j(f.g(q2.d(this.f136773e, (this.f136772d.hashCode() + g.j(g.j(this.f136769a.hashCode() * 31, 31, this.f136770b), 31, this.f136771c)) * 31, 31), 31, this.f136774f), 31, this.f136775g);
        Date date = this.f136776h;
        int iHashCode = (iJ + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f136777i;
        int iJ2 = g.j((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.f136778j);
        Object obj = this.f136779k;
        int iHashCode2 = (iJ2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f136780l;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ExportableReportsConfiguration(reportsFeatureName=", this.f136769a, ", reportsFeatureAPIId=", this.f136770b, ", baseURL=");
        sbI.append(this.f136771c);
        sbI.append(", httpClient=");
        sbI.append(this.f136772d);
        sbI.append(", loadingViewResourceId=");
        c.x(sbI, this.f136773e, ", isActionBarDividerLineRequired=", this.f136774f, ", userLocale=");
        sbI.append(this.f136775g);
        sbI.append(", reportStartDate=");
        sbI.append(this.f136776h);
        sbI.append(", reportEndDate=");
        sbI.append(this.f136777i);
        sbI.append(", reportsPrefixName=");
        sbI.append(this.f136778j);
        sbI.append(", reportsOptionalBody=");
        sbI.append(this.f136779k);
        sbI.append(", reportsPreviewScreenTitle=");
        sbI.append(this.f136780l);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, boolean z14, String str4, String str5) {
        this(str, str2, str3, okHttpClient, i14, z14, str4, null, null, str5, null, null, 3456, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, boolean z14, String str4, Date date, String str5) {
        this(str, str2, str3, okHttpClient, i14, z14, str4, date, null, str5, null, null, 3328, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, boolean z14, String str4, Date date, Date date2, String str5) {
        this(str, str2, str3, okHttpClient, i14, z14, str4, date, date2, str5, null, null, 3072, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, boolean z14, String str4, Date date, Date date2, String str5, Object obj) {
        this(str, str2, str3, okHttpClient, i14, z14, str4, date, date2, str5, obj, null, 2048, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, OkHttpClient okHttpClient, String str4, String str5) {
        this(str, str2, str3, okHttpClient, 0, false, str4, null, null, str5, null, null, 3504, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
    }

    public a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, boolean z14, String str4, Date date, Date date2, String str5, Object obj, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
        this.f136769a = str;
        this.f136770b = str2;
        this.f136771c = str3;
        this.f136772d = okHttpClient;
        this.f136773e = i14;
        this.f136774f = z14;
        this.f136775g = str4;
        this.f136776h = date;
        this.f136777i = date2;
        this.f136778j = str5;
        this.f136779k = obj;
        this.f136780l = str6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, OkHttpClient okHttpClient, int i14, String str4, String str5) {
        this(str, str2, str3, okHttpClient, i14, false, str4, null, null, str5, null, null, 3488, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        okHttpClient.getClass();
        str4.getClass();
        str5.getClass();
    }
}
