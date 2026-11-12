package ff2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import i3.e5;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lff2/a;", "", "", "campaignBeginTimestamp", "campaignEndTimestamp", "campaignId", "", "offerType", "updateTimestamp", "Lff2/o;", "offerPayload", "Lff2/n;", "detailPayload", "<init>", "(JJJLjava/lang/String;JLff2/o;Lff2/n;)V", "Ldf2/c;", "databaseEntity", "(Ldf2/c;)V", "a", "J", "()J", "b", "c", "d", "Ljava/lang/String;", "f", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "g", "Lff2/o;", "()Lff2/o;", "Lff2/n;", "()Lff2/n;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("campaignBeginTimestamp")
    private final long campaignBeginTimestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("campaignEndTimestamp")
    private final long campaignEndTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("campaignId")
    private final long campaignId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerType")
    private final String offerType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateTimestamp")
    private final long updateTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("offerPayload")
    private final o offerPayload;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailPayload")
    private final n detailPayload;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(df2.c cVar) {
        this(cVar.f59446c, cVar.f59447d, cVar.f59444a, cVar.f59445b, cVar.f59448e, new o(cVar.f59449f, cVar.f59450g, cVar.f59451h, cVar.f59453j, cVar.f59454k, cVar.f59455l), new n(cVar.f59464u, cVar.f59465v, cVar.f59456m, cVar.f59457n, cVar.f59459p, cVar.f59460q, Long.valueOf(cVar.f59461r), cVar.f59462s, cVar.f59463t));
        cVar.getClass();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCampaignBeginTimestamp() {
        return this.campaignBeginTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCampaignEndTimestamp() {
        return this.campaignEndTimestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getDetailPayload() {
        return this.detailPayload;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getOfferPayload() {
        return this.offerPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.campaignBeginTimestamp == aVar.campaignBeginTimestamp && this.campaignEndTimestamp == aVar.campaignEndTimestamp && this.campaignId == aVar.campaignId && s.g(this.offerType, aVar.offerType) && this.updateTimestamp == aVar.updateTimestamp && s.g(this.offerPayload, aVar.offerPayload) && s.g(this.detailPayload, aVar.detailPayload);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOfferType() {
        return this.offerType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int hashCode() {
        return this.detailPayload.hashCode() + ((this.offerPayload.hashCode() + q6.f.e(wr.g.j(q6.f.e(q6.f.e(Long.hashCode(this.campaignBeginTimestamp) * 31, 31, this.campaignEndTimestamp), 31, this.campaignId), 31, this.offerType), 31, this.updateTimestamp)) * 31);
    }

    public final String toString() {
        long j8 = this.campaignBeginTimestamp;
        long j14 = this.campaignEndTimestamp;
        long j15 = this.campaignId;
        String str = this.offerType;
        long j16 = this.updateTimestamp;
        o oVar = this.offerPayload;
        n nVar = this.detailPayload;
        StringBuilder sbK = e0.k(j8, "CampaignDTO(campaignBeginTimestamp=", ", campaignEndTimestamp=");
        sbK.append(j14);
        x.j(j15, ", campaignId=", ", offerType=", sbK);
        e5.s(j16, str, ", updateTimestamp=", sbK);
        sbK.append(", offerPayload=");
        sbK.append(oVar);
        sbK.append(", detailPayload=");
        sbK.append(nVar);
        sbK.append(")");
        return sbK.toString();
    }

    public a(long j8, long j14, long j15, String str, long j16, o oVar, n nVar) {
        str.getClass();
        oVar.getClass();
        nVar.getClass();
        this.campaignBeginTimestamp = j8;
        this.campaignEndTimestamp = j14;
        this.campaignId = j15;
        this.offerType = str;
        this.updateTimestamp = j16;
        this.offerPayload = oVar;
        this.detailPayload = nVar;
    }
}
