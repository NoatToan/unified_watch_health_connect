package gf2;

import i3.e5;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgf2/a;", "", "Lyz1/d;", "status", "", "campaignId", "", "offerType", "Lo4/v0;", "offerImage", "headerText", "titleText", "bodyText", "buttonText", "<init>", "(Lyz1/d;Ljava/lang/Long;Ljava/lang/String;Lo4/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f77077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f77078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f77080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f77081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f77082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f77083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77084h;

    public /* synthetic */ a(yz1.d dVar, Long l14, String str, v0 v0Var, String str2, String str3, String str4, String str5, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : l14, str, (i14 & 8) != 0 ? null : v0Var, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f77077a, aVar.f77077a) && s.g(this.f77078b, aVar.f77078b) && s.g(this.f77079c, aVar.f77079c) && s.g(this.f77080d, aVar.f77080d) && s.g(this.f77081e, aVar.f77081e) && s.g(this.f77082f, aVar.f77082f) && s.g(this.f77083g, aVar.f77083g) && s.g(this.f77084h, aVar.f77084h);
    }

    public final int hashCode() {
        int iHashCode = this.f77077a.hashCode() * 31;
        Long l14 = this.f77078b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f77079c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        v0 v0Var = this.f77080d;
        int iHashCode4 = (iHashCode3 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        String str2 = this.f77081e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77082f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f77083g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f77084h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CampaignCardData(status=");
        sb3.append(this.f77077a);
        sb3.append(", campaignId=");
        sb3.append(this.f77078b);
        sb3.append(", offerType=");
        sb3.append(this.f77079c);
        sb3.append(", offerImage=");
        sb3.append(this.f77080d);
        sb3.append(", headerText=");
        sn.a.t(sb3, this.f77081e, ", titleText=", this.f77082f, ", bodyText=");
        return e5.h(sb3, this.f77083g, ", buttonText=", this.f77084h, ")");
    }

    public a(yz1.d dVar, Long l14, String str, v0 v0Var, String str2, String str3, String str4, String str5) {
        dVar.getClass();
        this.f77077a = dVar;
        this.f77078b = l14;
        this.f77079c = str;
        this.f77080d = v0Var;
        this.f77081e = str2;
        this.f77082f = str3;
        this.f77083g = str4;
        this.f77084h = str5;
    }
}
