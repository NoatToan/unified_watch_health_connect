package gf2;

import e23.q;
import ff2.o;
import java.util.List;
import o13.p;
import o13.r;
import o4.v0;
import o70.f;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lj70/d;", "Lo13/p;", "Lff2/a;", "Lo4/v0;", "data", "", "", "dismissedCards", "Lgf2/a;", "<anonymous>", "(Lj70/d;Ljava/util/List;)Lgf2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.domain.dashboard.GetActiveCampaignDataUseCase$invoke$1", f = "GetActiveCampaignDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements q<j70.d<p<? extends ff2.a, ? extends v0>>, List<? extends String>, t13.d<? super a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.d f77085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f77086b;

    public b(t13.d<? super b> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.d<p<? extends ff2.a, ? extends v0>> dVar, List<? extends String> list, t13.d<? super a> dVar2) {
        b bVar = new b(dVar2);
        bVar.f77085a = dVar;
        bVar.f77086b = list;
        return bVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o offerPayload;
        o offerPayload2;
        o offerPayload3;
        o offerPayload4;
        j70.d dVar = this.f77085a;
        List list = this.f77086b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        boolean zContains = list.contains(f.CAMPAIGN.f129989a);
        String offerViewDetailsButtonText = null;
        if (zContains) {
            return null;
        }
        p pVar = (p) dVar.f97521b;
        ff2.a aVar2 = pVar != null ? (ff2.a) pVar.f128594a : null;
        v0 v0Var = pVar != null ? (v0) pVar.f128595b : null;
        yz1.d dVar2 = dVar.f97520a;
        Long l14 = aVar2 != null ? new Long(aVar2.getCampaignId()) : null;
        String offerType = aVar2 != null ? aVar2.getOfferType() : null;
        String offerHeaderText = (aVar2 == null || (offerPayload4 = aVar2.getOfferPayload()) == null) ? null : offerPayload4.getOfferHeaderText();
        String offerTitleText = (aVar2 == null || (offerPayload3 = aVar2.getOfferPayload()) == null) ? null : offerPayload3.getOfferTitleText();
        String offerBodyText = (aVar2 == null || (offerPayload2 = aVar2.getOfferPayload()) == null) ? null : offerPayload2.getOfferBodyText();
        if (aVar2 != null && (offerPayload = aVar2.getOfferPayload()) != null) {
            offerViewDetailsButtonText = offerPayload.getOfferViewDetailsButtonText();
        }
        return new a(dVar2, l14, offerType, v0Var, offerHeaderText, offerTitleText, offerBodyText, offerViewDetailsButtonText);
    }
}
