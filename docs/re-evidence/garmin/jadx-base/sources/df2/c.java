package df2;

import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Ldf2/c;", "", "", "campaignId", "", "offerType", "campaignBeginTimestamp", "campaignEndTimestamp", "updateTimestamp", "offerBodyText", "offerHeaderText", "offerImageUrl", "offerImageName", "offerShopNowButtonText", "offerTitleText", "offerViewDetailsButtonText", "detailEmailOfferButtonText", "detailImageUrl", "detailImageName", "detailPromoCode", "detailPromoCodeDetailText", "detailPromoCodeExpirationDate", "detailShopNowUrl", "detailTitleText", "detailBodyText", "detailBodyDetailText", "<init>", "(JLjava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lff2/a;", "campaignDTO", "(Lff2/a;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f59448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f59449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f59450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f59451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f59452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f59453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f59454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f59455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f59456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f59457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f59458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f59459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f59460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f59461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f59462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f59463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f59464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f59465v;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(ff2.a aVar) {
        aVar.getClass();
        long campaignId = aVar.getCampaignId();
        String offerType = aVar.getOfferType();
        long campaignBeginTimestamp = aVar.getCampaignBeginTimestamp();
        long campaignEndTimestamp = aVar.getCampaignEndTimestamp();
        long updateTimestamp = aVar.getUpdateTimestamp();
        String strA = aVar.getOfferPayload().getOfferBodyText();
        String strB = aVar.getOfferPayload().getOfferHeaderText();
        String strC = aVar.getOfferPayload().getOfferImageUrl();
        String strD = aVar.getOfferPayload().getOfferShopNowButtonText();
        String strE = aVar.getOfferPayload().getOfferTitleText();
        String strF = aVar.getOfferPayload().getOfferViewDetailsButtonText();
        String strC2 = aVar.getDetailPayload().getDetailEmailOfferButtonText();
        String strD2 = aVar.getDetailPayload().getDetailImageUrl();
        String strE2 = aVar.getDetailPayload().getDetailPromoCode();
        String str = strE2 == null ? "" : strE2;
        String strF2 = aVar.getDetailPayload().getDetailPromoCodeDetailText();
        String str2 = strF2 == null ? "" : strF2;
        Long lG = aVar.getDetailPayload().getDetailPromoCodeExpirationDate();
        long jLongValue = lG != null ? lG.longValue() : 0L;
        String strH = aVar.getDetailPayload().getDetailShopNowUrl();
        String strI = aVar.getDetailPayload().getDetailTitleText();
        String strB2 = aVar.getDetailPayload().getDetailBodyText();
        String strA2 = aVar.getDetailPayload().getDetailBodyDetailText();
        this(campaignId, offerType, campaignBeginTimestamp, campaignEndTimestamp, updateTimestamp, strA, strB, strC, "", strD, strE, strF, strC2, strD2, "", str, str2, jLongValue, strH, strI, strB2, strA2 == null ? "" : strA2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59444a == cVar.f59444a && s.g(this.f59445b, cVar.f59445b) && this.f59446c == cVar.f59446c && this.f59447d == cVar.f59447d && this.f59448e == cVar.f59448e && s.g(this.f59449f, cVar.f59449f) && s.g(this.f59450g, cVar.f59450g) && s.g(this.f59451h, cVar.f59451h) && s.g(this.f59452i, cVar.f59452i) && s.g(this.f59453j, cVar.f59453j) && s.g(this.f59454k, cVar.f59454k) && s.g(this.f59455l, cVar.f59455l) && s.g(this.f59456m, cVar.f59456m) && s.g(this.f59457n, cVar.f59457n) && s.g(this.f59458o, cVar.f59458o) && s.g(this.f59459p, cVar.f59459p) && s.g(this.f59460q, cVar.f59460q) && this.f59461r == cVar.f59461r && s.g(this.f59462s, cVar.f59462s) && s.g(this.f59463t, cVar.f59463t) && s.g(this.f59464u, cVar.f59464u) && s.g(this.f59465v, cVar.f59465v);
    }

    public final int hashCode() {
        return this.f59465v.hashCode() + g.j(g.j(g.j(f.e(g.j(g.j(g.j(g.j(g.j(g.j(g.j(g.j(g.j(g.j(g.j(g.j(f.e(f.e(f.e(g.j(Long.hashCode(this.f59444a) * 31, 31, this.f59445b), 31, this.f59446c), 31, this.f59447d), 31, this.f59448e), 31, this.f59449f), 31, this.f59450g), 31, this.f59451h), 31, this.f59452i), 31, this.f59453j), 31, this.f59454k), 31, this.f59455l), 31, this.f59456m), 31, this.f59457n), 31, this.f59458o), 31, this.f59459p), 31, this.f59460q), 31, this.f59461r), 31, this.f59462s), 31, this.f59463t), 31, this.f59464u);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f59444a, "CampaignEntity(campaignId=", ", offerType=", this.f59445b);
        x.j(this.f59446c, ", campaignBeginTimestamp=", ", campaignEndTimestamp=", sbK);
        sbK.append(this.f59447d);
        x.j(this.f59448e, ", updateTimestamp=", ", offerBodyText=", sbK);
        sn.a.t(sbK, this.f59449f, ", offerHeaderText=", this.f59450g, ", offerImageUrl=");
        sn.a.t(sbK, this.f59451h, ", offerImageName=", this.f59452i, ", offerShopNowButtonText=");
        sn.a.t(sbK, this.f59453j, ", offerTitleText=", this.f59454k, ", offerViewDetailsButtonText=");
        sn.a.t(sbK, this.f59455l, ", detailEmailOfferButtonText=", this.f59456m, ", detailImageUrl=");
        sn.a.t(sbK, this.f59457n, ", detailImageName=", this.f59458o, ", detailPromoCode=");
        sn.a.t(sbK, this.f59459p, ", detailPromoCodeDetailText=", this.f59460q, ", detailPromoCodeExpirationDate=");
        p6.b.k(this.f59461r, ", detailShopNowUrl=", this.f59462s, sbK);
        sn.a.t(sbK, ", detailTitleText=", this.f59463t, ", detailBodyText=", this.f59464u);
        return e0.h(sbK, ", detailBodyDetailText=", this.f59465v, ")");
    }

    public c(long j8, String str, long j14, long j15, long j16, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j17, String str14, String str15, String str16, String str17) {
        hb.a.p(str, str2, str3, str4, str5);
        hb.a.p(str6, str7, str8, str9, str10);
        hb.a.p(str11, str12, str13, str14, str15);
        str16.getClass();
        str17.getClass();
        this.f59444a = j8;
        this.f59445b = str;
        this.f59446c = j14;
        this.f59447d = j15;
        this.f59448e = j16;
        this.f59449f = str2;
        this.f59450g = str3;
        this.f59451h = str4;
        this.f59452i = str5;
        this.f59453j = str6;
        this.f59454k = str7;
        this.f59455l = str8;
        this.f59456m = str9;
        this.f59457n = str10;
        this.f59458o = str11;
        this.f59459p = str12;
        this.f59460q = str13;
        this.f59461r = j17;
        this.f59462s = str14;
        this.f59463t = str15;
        this.f59464u = str16;
        this.f59465v = str17;
    }
}
