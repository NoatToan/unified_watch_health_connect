package cb2;

import androidx.room.i0;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase_Impl;
import gl1.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcb2/b;", "Landroidx/room/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CacheDatabase_Impl f26647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CacheDatabase_Impl cacheDatabase_Impl) {
        super(111, "6d84211128c06a7f41695f89af0bfd7c", "eed344f105a5a4fafc8e4d184aaed558");
        this.f26647d = cacheDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `activity_polyline` (`activityId` INTEGER, `numberOfPoints` INTEGER, `encodedSamples` TEXT, `encodedLevels` TEXT, `maxLat` REAL, `maxLon` REAL, `minLat` REAL, `minLon` REAL, `startLat` REAL, `startLon` REAL, `endLat` REAL, `endLon` REAL, `trackLog` TEXT, PRIMARY KEY(`activityId`))", aVar, "CREATE TABLE IF NOT EXISTS `activity_summaries` (`activityId` INTEGER NOT NULL, `displayName` TEXT, `startTimeGMT` INTEGER NOT NULL, `json` TEXT, `lastUpdate` INTEGER NOT NULL, PRIMARY KEY(`activityId`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS `response_cache` (`requestUrl` TEXT NOT NULL, `response` TEXT, `lastUpdate` INTEGER NOT NULL, `maxAge` INTEGER NOT NULL, `maxStale` INTEGER NOT NULL, PRIMARY KEY(`requestUrl`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS `device_work_input` (`inputTimestamp` INTEGER NOT NULL, `inputAction` TEXT NOT NULL, `unitId` INTEGER NOT NULL, `remoteDeviceProfile` TEXT NOT NULL, `deviceXML` BLOB, PRIMARY KEY(`inputTimestamp`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS `device_needs_bond` (`device_unit_id` INTEGER NOT NULL, `device_mac_address` TEXT NOT NULL, `device_product_number` TEXT NOT NULL, `device_name` TEXT NOT NULL, `device_image_url` TEXT NOT NULL, `device_dialog_shown` INTEGER NOT NULL, PRIMARY KEY(`device_unit_id`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6d84211128c06a7f41695f89af0bfd7c')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        h.v(aVar, aVar, "DROP TABLE IF EXISTS `activity_polyline`", aVar, "DROP TABLE IF EXISTS `activity_summaries`");
        f.o(aVar, "DROP TABLE IF EXISTS `response_cache`");
        f.o(aVar, "DROP TABLE IF EXISTS `device_work_input`");
        f.o(aVar, "DROP TABLE IF EXISTS `device_needs_bond`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = CacheDatabase_Impl.f49879g;
        this.f26647d.internalInitInvalidationTracker(aVar);
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
        linkedHashMap.put("activityId", new n.a("activityId", "INTEGER", false, 1, null, 1));
        linkedHashMap.put("numberOfPoints", new n.a("numberOfPoints", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("encodedSamples", new n.a("encodedSamples", "TEXT", false, 0, null, 1));
        linkedHashMap.put("encodedLevels", new n.a("encodedLevels", "TEXT", false, 0, null, 1));
        linkedHashMap.put("maxLat", new n.a("maxLat", "REAL", false, 0, null, 1));
        linkedHashMap.put("maxLon", new n.a("maxLon", "REAL", false, 0, null, 1));
        linkedHashMap.put("minLat", new n.a("minLat", "REAL", false, 0, null, 1));
        linkedHashMap.put("minLon", new n.a("minLon", "REAL", false, 0, null, 1));
        linkedHashMap.put("startLat", new n.a("startLat", "REAL", false, 0, null, 1));
        linkedHashMap.put("startLon", new n.a("startLon", "REAL", false, 0, null, 1));
        linkedHashMap.put("endLat", new n.a("endLat", "REAL", false, 0, null, 1));
        linkedHashMap.put("endLon", new n.a("endLon", "REAL", false, 0, null, 1));
        n nVar = new n("activity_polyline", linkedHashMap, h.j(linkedHashMap, "trackLog", new n.a("trackLog", "TEXT", false, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "activity_polyline");
        if (!nVar.equals(nVarA)) {
            return new i0.a(false, h.i("activity_polyline(com.garmin.android.apps.connectmobile.activity.model.ActivityPolylineDMO).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("activityId", new n.a("activityId", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("displayName", new n.a("displayName", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("startTimeGMT", new n.a("startTimeGMT", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("json", new n.a("json", "TEXT", false, 0, null, 1));
        n nVar2 = new n("activity_summaries", linkedHashMap2, h.j(linkedHashMap2, "lastUpdate", new n.a("lastUpdate", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA2 = n.b.a(aVar, "activity_summaries");
        if (!nVar2.equals(nVarA2)) {
            return new i0.a(false, h.i("activity_summaries(com.garmin.android.framework.datamanagement.dao.ActivitySummaryDMO).\n Expected:\n", nVar2, "\n Found:\n", nVarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("requestUrl", new n.a("requestUrl", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("response", new n.a("response", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("lastUpdate", new n.a("lastUpdate", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("maxAge", new n.a("maxAge", "INTEGER", true, 0, null, 1));
        n nVar3 = new n("response_cache", linkedHashMap3, h.j(linkedHashMap3, "maxStale", new n.a("maxStale", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA3 = n.b.a(aVar, "response_cache");
        if (!nVar3.equals(nVarA3)) {
            return new i0.a(false, h.i("response_cache(com.garmin.android.framework.datamanagement.dao.ResponseCacheDMO).\n Expected:\n", nVar3, "\n Found:\n", nVarA3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("inputTimestamp", new n.a("inputTimestamp", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("inputAction", new n.a("inputAction", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("unitId", new n.a("unitId", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("remoteDeviceProfile", new n.a("remoteDeviceProfile", "TEXT", true, 0, null, 1));
        n nVar4 = new n("device_work_input", linkedHashMap4, h.j(linkedHashMap4, "deviceXML", new n.a("deviceXML", "BLOB", false, 0, null, 1)), new LinkedHashSet());
        n nVarA4 = n.b.a(aVar, "device_work_input");
        if (!nVar4.equals(nVarA4)) {
            return new i0.a(false, h.i("device_work_input(com.garmin.android.framework.datamanagement.dao.DeviceWorkInput).\n Expected:\n", nVar4, "\n Found:\n", nVarA4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("device_unit_id", new n.a("device_unit_id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("device_mac_address", new n.a("device_mac_address", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("device_product_number", new n.a("device_product_number", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("device_name", new n.a("device_name", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("device_image_url", new n.a("device_image_url", "TEXT", true, 0, null, 1));
        n nVar5 = new n("device_needs_bond", linkedHashMap5, h.j(linkedHashMap5, "device_dialog_shown", new n.a("device_dialog_shown", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA5 = n.b.a(aVar, "device_needs_bond");
        return !nVar5.equals(nVarA5) ? new i0.a(false, h.i("device_needs_bond(com.garmin.android.framework.datamanagement.dao.DeviceNeedsBond).\n Expected:\n", nVar5, "\n Found:\n", nVarA5)) : new i0.a(true, null);
    }
}
