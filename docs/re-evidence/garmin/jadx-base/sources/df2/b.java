package df2;

import androidx.room.i0;
import com.garmin.android.library.promotionlibrary.database.CampaignDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldf2/b;", "Landroidx/room/i0;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CampaignDatabase_Impl f59443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CampaignDatabase_Impl campaignDatabase_Impl) {
        super(2, "b6d1f3ef7bc091f6f0a15a26aa5877db", "81088313cabb2f8ae0aacd21add246ef");
        this.f59443d = campaignDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `campaigns` (`campaignId` INTEGER NOT NULL, `offerType` TEXT NOT NULL, `campaignBeginTimestamp` INTEGER NOT NULL, `campaignEndTimestamp` INTEGER NOT NULL, `updateTimestamp` INTEGER NOT NULL, `offerBodyText` TEXT NOT NULL, `offerHeaderText` TEXT NOT NULL, `offerImageUrl` TEXT NOT NULL, `offerImageName` TEXT NOT NULL, `offerShopNowButtonText` TEXT NOT NULL, `offerTitleText` TEXT NOT NULL, `offerViewDetailsButtonText` TEXT NOT NULL, `detailEmailOfferButtonText` TEXT NOT NULL, `detailImageUrl` TEXT NOT NULL, `detailImageName` TEXT NOT NULL, `detailPromoCode` TEXT NOT NULL, `detailPromoCodeDetailText` TEXT NOT NULL, `detailPromoCodeExpirationDate` INTEGER NOT NULL, `detailShopNowUrl` TEXT NOT NULL, `detailTitleText` TEXT NOT NULL, `detailBodyText` TEXT NOT NULL, `detailBodyDetailText` TEXT NOT NULL, PRIMARY KEY(`campaignId`))", aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b6d1f3ef7bc091f6f0a15a26aa5877db')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        aVar.getClass();
        f.o(aVar, "DROP TABLE IF EXISTS `campaigns`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = CampaignDatabase_Impl.f50539e;
        this.f59443d.internalInitInvalidationTracker(aVar);
    }

    @Override // androidx.room.i0
    public final void e(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void f(ud.a aVar) {
        aVar.getClass();
        gl1.d.s(aVar);
    }

    @Override // androidx.room.i0
    public final i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("campaignId", new n.a("campaignId", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("offerType", new n.a("offerType", "TEXT", true, 0, null, 1));
        linkedHashMap.put("campaignBeginTimestamp", new n.a("campaignBeginTimestamp", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("campaignEndTimestamp", new n.a("campaignEndTimestamp", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("updateTimestamp", new n.a("updateTimestamp", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("offerBodyText", new n.a("offerBodyText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("offerHeaderText", new n.a("offerHeaderText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("offerImageUrl", new n.a("offerImageUrl", "TEXT", true, 0, null, 1));
        linkedHashMap.put("offerImageName", new n.a("offerImageName", "TEXT", true, 0, null, 1));
        linkedHashMap.put("offerShopNowButtonText", new n.a("offerShopNowButtonText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("offerTitleText", new n.a("offerTitleText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("offerViewDetailsButtonText", new n.a("offerViewDetailsButtonText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailEmailOfferButtonText", new n.a("detailEmailOfferButtonText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailImageUrl", new n.a("detailImageUrl", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailImageName", new n.a("detailImageName", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailPromoCode", new n.a("detailPromoCode", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailPromoCodeDetailText", new n.a("detailPromoCodeDetailText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailPromoCodeExpirationDate", new n.a("detailPromoCodeExpirationDate", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("detailShopNowUrl", new n.a("detailShopNowUrl", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailTitleText", new n.a("detailTitleText", "TEXT", true, 0, null, 1));
        linkedHashMap.put("detailBodyText", new n.a("detailBodyText", "TEXT", true, 0, null, 1));
        n nVar = new n("campaigns", linkedHashMap, h.j(linkedHashMap, "detailBodyDetailText", new n.a("detailBodyDetailText", "TEXT", true, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "campaigns");
        return !nVar.equals(nVarA) ? new i0.a(false, h.i("campaigns(com.garmin.android.library.promotionlibrary.database.CampaignEntity).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new i0.a(true, null);
    }
}
