package r22;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lr22/p;", "", "", "value", "unit", Constants.ScionAnalytics.PARAM_LABEL, "Lu4/d;", "valueIcon", "", "iconTintRes", "iconContentDescription", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu4/d;ILjava/lang/String;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.d f149777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f149779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f149780g;

    public /* synthetic */ p(String str, String str2, String str3, u4.d dVar, int i14, String str4, String str5, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? null : str2, str3, (i15 & 8) != 0 ? null : dVar, (i15 & 16) != 0 ? -1 : i14, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f149774a, pVar.f149774a) && p005kotlin.jvm.internal.s.g(this.f149775b, pVar.f149775b) && p005kotlin.jvm.internal.s.g(this.f149776c, pVar.f149776c) && p005kotlin.jvm.internal.s.g(this.f149777d, pVar.f149777d) && this.f149778e == pVar.f149778e && p005kotlin.jvm.internal.s.g(this.f149779f, pVar.f149779f) && p005kotlin.jvm.internal.s.g(this.f149780g, pVar.f149780g);
    }

    public final int hashCode() {
        int iHashCode = this.f149774a.hashCode() * 31;
        String str = this.f149775b;
        int iJ = wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f149776c);
        u4.d dVar = this.f149777d;
        int iD = q2.d(this.f149778e, (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        String str2 = this.f149779f;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f149780g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("BrickData(value=", this.f149774a, ", unit=", this.f149775b, ", label=");
        sbI.append(this.f149776c);
        sbI.append(", valueIcon=");
        sbI.append(this.f149777d);
        sbI.append(", iconTintRes=");
        wr.g.t(this.f149778e, ", iconContentDescription=", this.f149779f, ", contentDescription=", sbI);
        return am.j.o(this.f149780g, ")", sbI);
    }

    public p(String str, String str2, String str3, u4.d dVar, int i14, String str4, String str5) {
        str.getClass();
        str3.getClass();
        this.f149774a = str;
        this.f149775b = str2;
        this.f149776c = str3;
        this.f149777d = dVar;
        this.f149778e = i14;
        this.f149779f = str4;
        this.f149780g = str5;
    }
}
