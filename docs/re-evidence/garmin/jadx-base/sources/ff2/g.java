package ff2;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f71153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f71154c;

    public /* synthetic */ g(i iVar, a aVar, int i14) {
        this.f71152a = i14;
        this.f71153b = iVar;
        this.f71154c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f71152a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i14) {
            case 0:
                i iVar = this.f71153b;
                a aVar = this.f71154c;
                if (zBooleanValue) {
                    iVar.b().debug("Success, downloading offer image: ");
                    hf2.a.C1650a c1650a = hf2.a.f83640a;
                    Context context = iVar.f71157a;
                    String offerImageUrl = aVar.getOfferPayload().getOfferImageUrl();
                    long campaignId = aVar.getCampaignId();
                    kf2.c cVar = kf2.c.OFFER_TYPE;
                    g gVar = new g(iVar, aVar, 1);
                    c1650a.getClass();
                    hf2.a.C1650a.d(context, offerImageUrl, campaignId, cVar, gVar);
                } else {
                    iVar.c(aVar, "Detail image download failed for campaign " + aVar.getCampaignId());
                }
                break;
            default:
                i iVar2 = this.f71153b;
                a aVar2 = this.f71154c;
                if (zBooleanValue) {
                    iVar2.b().debug("Success, inserting campaign " + aVar2.getCampaignId() + " into database:");
                    ge1.b.T(iVar2, null, null, new l(iVar2, aVar2, null), 3);
                } else {
                    iVar2.c(aVar2, "Offer image download failed for campaign " + aVar2.getCampaignId());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
