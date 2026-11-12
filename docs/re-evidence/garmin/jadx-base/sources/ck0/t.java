package ck0;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lck0/t;", "", "", "identifier", "shopUrl", "name", "title", "description", "offer", "Lck0/c;", FirebaseAnalytics.Param.COUPON, "Lck0/d;", "couponRevealLimit", "couponUsageDisclaimer", "Lck0/q;", "resources", "Lb63/o;", "expiresOn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lck0/c;Lck0/d;Ljava/lang/String;Lck0/q;Lb63/o;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f27889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f27890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f27892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b63.o f27893k;

    public t(String str, String str2, String str3, String str4, String str5, String str6, c cVar, d dVar, String str7, q qVar, b63.o oVar) {
        hb.a.p(str, str3, str4, str5, str6);
        qVar.getClass();
        this.f27883a = str;
        this.f27884b = str2;
        this.f27885c = str3;
        this.f27886d = str4;
        this.f27887e = str5;
        this.f27888f = str6;
        this.f27889g = cVar;
        this.f27890h = dVar;
        this.f27891i = str7;
        this.f27892j = qVar;
        this.f27893k = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f27883a.equals(tVar.f27883a) && p005kotlin.jvm.internal.s.g(this.f27884b, tVar.f27884b) && this.f27885c.equals(tVar.f27885c) && this.f27886d.equals(tVar.f27886d) && this.f27887e.equals(tVar.f27887e) && this.f27888f.equals(tVar.f27888f) && p005kotlin.jvm.internal.s.g(this.f27889g, tVar.f27889g) && p005kotlin.jvm.internal.s.g(this.f27890h, tVar.f27890h) && p005kotlin.jvm.internal.s.g(this.f27891i, tVar.f27891i) && this.f27892j.equals(tVar.f27892j) && p005kotlin.jvm.internal.s.g(this.f27893k, tVar.f27893k);
    }

    public final int hashCode() {
        int iHashCode = this.f27883a.hashCode() * 31;
        String str = this.f27884b;
        int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27885c), 31, this.f27886d), 31, this.f27887e), 31, this.f27888f);
        c cVar = this.f27889g;
        int iHashCode2 = (iJ + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f27890h;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f27891i;
        int iHashCode4 = (this.f27892j.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        b63.o oVar = this.f27893k;
        return iHashCode4 + (oVar != null ? oVar.f16206a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ExclusiveOffersScreenData(identifier=", this.f27883a, ", shopUrl=", this.f27884b, ", name=");
        sn.a.t(sbI, this.f27885c, ", title=", this.f27886d, ", description=");
        sn.a.t(sbI, this.f27887e, ", offer=", this.f27888f, ", coupon=");
        sbI.append(this.f27889g);
        sbI.append(", couponRevealLimit=");
        sbI.append(this.f27890h);
        sbI.append(", couponUsageDisclaimer=");
        sbI.append(this.f27891i);
        sbI.append(", resources=");
        sbI.append(this.f27892j);
        sbI.append(", expiresOn=");
        sbI.append(this.f27893k);
        sbI.append(")");
        return sbI.toString();
    }
}
