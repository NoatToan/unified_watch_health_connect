package ds2;

import androidx.room.i0;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.garminpay.database.GarminPayCoreDatabase_Impl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import gl1.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import p13.x;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lds2/a;", "Landroidx/room/i0;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GarminPayCoreDatabase_Impl f61096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GarminPayCoreDatabase_Impl garminPayCoreDatabase_Impl) {
        super(5, "49f2d31a4053c78c77e0751ea8a825fe", "0806c7392954db74f5f8e393c2c6b2f2");
        this.f61096d = garminPayCoreDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `wallet_items` (`item_id` TEXT NOT NULL, `provider_type` TEXT, `business_operator` TEXT, `display_name` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `unit_id` INTEGER NOT NULL, `type` TEXT, `status` TEXT, `provider_specific_id` TEXT NOT NULL, `json_string` TEXT NOT NULL, `last_update_time` INTEGER NOT NULL)", aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_wallet_items_item_id_unit_id` ON `wallet_items` (`item_id`, `unit_id`)");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '49f2d31a4053c78c77e0751ea8a825fe')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        aVar.getClass();
        f.o(aVar, "DROP TABLE IF EXISTS `wallet_items`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = GarminPayCoreDatabase_Impl.f52320f;
        this.f61096d.internalInitInvalidationTracker(aVar);
    }

    @Override // androidx.room.i0
    public final void e(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void f(ud.a aVar) {
        aVar.getClass();
        d.s(aVar);
    }

    @Override // androidx.room.i0
    public final i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FirebaseAnalytics.Param.ITEM_ID, new n.a(FirebaseAnalytics.Param.ITEM_ID, "TEXT", true, 0, null, 1));
        linkedHashMap.put("provider_type", new n.a("provider_type", "TEXT", false, 0, null, 1));
        linkedHashMap.put("business_operator", new n.a("business_operator", "TEXT", false, 0, null, 1));
        linkedHashMap.put("display_name", new n.a("display_name", "TEXT", true, 0, null, 1));
        linkedHashMap.put(TtmlNode.ATTR_ID, new n.a(TtmlNode.ATTR_ID, "INTEGER", true, 1, null, 1));
        linkedHashMap.put("unit_id", new n.a("unit_id", "INTEGER", true, 0, null, 1));
        linkedHashMap.put(NotificationConstants.KEY_DATA_MIME_TYPE, new n.a(NotificationConstants.KEY_DATA_MIME_TYPE, "TEXT", false, 0, null, 1));
        linkedHashMap.put("status", new n.a("status", "TEXT", false, 0, null, 1));
        linkedHashMap.put("provider_specific_id", new n.a("provider_specific_id", "TEXT", true, 0, null, 1));
        linkedHashMap.put("json_string", new n.a("json_string", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSetJ = h.j(linkedHashMap, "last_update_time", new n.a("last_update_time", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new n.d("index_wallet_items_item_id_unit_id", true, x.k(FirebaseAnalytics.Param.ITEM_ID, "unit_id"), x.k("ASC", "ASC")));
        n nVar = new n("wallet_items", linkedHashMap, linkedHashSetJ, linkedHashSet);
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "wallet_items");
        return !nVar.equals(nVarA) ? new i0.a(false, h.i("wallet_items(com.garmin.garminpay.database.dto.DeviceWalletItem).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new i0.a(true, null);
    }
}
