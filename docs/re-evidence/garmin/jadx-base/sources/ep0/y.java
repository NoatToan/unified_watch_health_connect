package ep0;

import am.x0;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lep0/y;", "", "", "value", "valueContentDescription", "value2", "value2ContentDescription", Constants.ScionAnalytics.PARAM_LABEL, "Lep0/b0;", "statType", "", "itemCount", "Lam/x0;", "activityType", "extraData", "Lu4/d;", "iconRes", "colorRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lep0/b0;ILam/x0;Ljava/lang/Object;Lu4/d;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f64909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f64910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f64911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f64912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u4.d f64913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f64914k;

    public /* synthetic */ y(String str, String str2, String str3, String str4, String str5, b0 b0Var, int i14, x0 x0Var, Object obj, u4.d dVar, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, (i16 & 2) != 0 ? null : str2, (i16 & 4) != 0 ? null : str3, (i16 & 8) != 0 ? null : str4, str5, b0Var, i14, (i16 & 128) != 0 ? null : x0Var, (i16 & 256) != 0 ? null : obj, dVar, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.f64904a, yVar.f64904a) && p005kotlin.jvm.internal.s.g(this.f64905b, yVar.f64905b) && p005kotlin.jvm.internal.s.g(this.f64906c, yVar.f64906c) && p005kotlin.jvm.internal.s.g(this.f64907d, yVar.f64907d) && p005kotlin.jvm.internal.s.g(this.f64908e, yVar.f64908e) && p005kotlin.jvm.internal.s.g(this.f64909f, yVar.f64909f) && this.f64910g == yVar.f64910g && this.f64911h == yVar.f64911h && p005kotlin.jvm.internal.s.g(this.f64912i, yVar.f64912i) && p005kotlin.jvm.internal.s.g(this.f64913j, yVar.f64913j) && this.f64914k == yVar.f64914k;
    }

    public final int hashCode() {
        int iHashCode = this.f64904a.hashCode() * 31;
        String str = this.f64905b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64906c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64907d;
        int iD = q2.d(this.f64910g, (this.f64909f.hashCode() + wr.g.j((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f64908e)) * 31, 31);
        x0 x0Var = this.f64911h;
        int iHashCode4 = (iD + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        Object obj = this.f64912i;
        int iHashCode5 = (iHashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        u4.d dVar = this.f64913j;
        return Integer.hashCode(this.f64914k) + ((iHashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("LastSevenDaysItem(value=", this.f64904a, ", valueContentDescription=", this.f64905b, ", value2=");
        sn.a.t(sbI, this.f64906c, ", value2ContentDescription=", this.f64907d, ", label=");
        sbI.append(this.f64908e);
        sbI.append(", statType=");
        sbI.append(this.f64909f);
        sbI.append(", itemCount=");
        sbI.append(this.f64910g);
        sbI.append(", activityType=");
        sbI.append(this.f64911h);
        sbI.append(", extraData=");
        sbI.append(this.f64912i);
        sbI.append(", iconRes=");
        sbI.append(this.f64913j);
        sbI.append(", colorRes=");
        return am.j.q(sbI, this.f64914k, ")");
    }

    public y(String str, String str2, String str3, String str4, String str5, b0 b0Var, int i14, x0 x0Var, Object obj, u4.d dVar, int i15) {
        str.getClass();
        str5.getClass();
        b0Var.getClass();
        this.f64904a = str;
        this.f64905b = str2;
        this.f64906c = str3;
        this.f64907d = str4;
        this.f64908e = str5;
        this.f64909f = b0Var;
        this.f64910g = i14;
        this.f64911h = x0Var;
        this.f64912i = obj;
        this.f64913j = dVar;
        this.f64914k = i15;
    }
}
