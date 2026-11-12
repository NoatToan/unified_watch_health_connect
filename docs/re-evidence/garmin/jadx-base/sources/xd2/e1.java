package xd2;

import com.garmin.android.library.livetrack.data.LocalDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxd2/e1;", "Landroidx/room/i0;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends androidx.room.i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDatabase_Impl f190118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(LocalDatabase_Impl localDatabase_Impl) {
        super(17, "6eec83c887ce296f87232bb3bbeb86d0", "3e3b6930ed3b4b8dee6167a0ff35d716");
        this.f190118d = localDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        vb.h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `general_settings` (`device_settings` TEXT, `email_enabled` INTEGER, `extend_live_track` INTEGER, `group_track_all_connections` INTEGER, `group_track_enabled` INTEGER, `post_track_point_frequency_seconds` INTEGER, `profile_settings` TEXT, `uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)", aVar, "CREATE TABLE IF NOT EXISTS `session_info` (`device_unit_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `publisher_id` TEXT NOT NULL, `publisher_type` TEXT NOT NULL, `device_driven` INTEGER NOT NULL, `should_stop_on_device` INTEGER NOT NULL, `group_track_session_id` TEXT, `activity_type` TEXT, `activity_created_time` INTEGER, `sharing_errors` TEXT, PRIMARY KEY(`device_unit_id`))");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `livetrack_publishers` (`device_unit_id` INTEGER NOT NULL, `publisher_id` TEXT NOT NULL, `publisher_type` TEXT NOT NULL, PRIMARY KEY(`device_unit_id`))");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oe2.f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6eec83c887ce296f87232bb3bbeb86d0')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        vb.h.v(aVar, aVar, "DROP TABLE IF EXISTS `general_settings`", aVar, "DROP TABLE IF EXISTS `session_info`");
        oe2.f.o(aVar, "DROP TABLE IF EXISTS `livetrack_publishers`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = LocalDatabase_Impl.f50201g;
        this.f190118d.internalInitInvalidationTracker(aVar);
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
    public final androidx.room.i0.a g(ud.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("device_settings", new md.n.a("device_settings", "TEXT", false, 0, null, 1));
        linkedHashMap.put("email_enabled", new md.n.a("email_enabled", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("extend_live_track", new md.n.a("extend_live_track", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("group_track_all_connections", new md.n.a("group_track_all_connections", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("group_track_enabled", new md.n.a("group_track_enabled", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("post_track_point_frequency_seconds", new md.n.a("post_track_point_frequency_seconds", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("profile_settings", new md.n.a("profile_settings", "TEXT", false, 0, null, 1));
        md.n nVar = new md.n("general_settings", linkedHashMap, vb.h.j(linkedHashMap, "uid", new md.n.a("uid", "INTEGER", true, 1, null, 1)), new LinkedHashSet());
        md.n.f117868e.getClass();
        md.n nVarA = md.n.b.a(aVar, "general_settings");
        if (!nVar.equals(nVarA)) {
            return new androidx.room.i0.a(false, vb.h.i("general_settings(com.garmin.android.library.livetrack.data.entity.LivetrackSettings).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("device_unit_id", new md.n.a("device_unit_id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("name", new md.n.a("name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("publisher_id", new md.n.a("publisher_id", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("publisher_type", new md.n.a("publisher_type", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("device_driven", new md.n.a("device_driven", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("should_stop_on_device", new md.n.a("should_stop_on_device", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("group_track_session_id", new md.n.a("group_track_session_id", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("activity_type", new md.n.a("activity_type", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("activity_created_time", new md.n.a("activity_created_time", "INTEGER", false, 0, null, 1));
        md.n nVar2 = new md.n("session_info", linkedHashMap2, vb.h.j(linkedHashMap2, "sharing_errors", new md.n.a("sharing_errors", "TEXT", false, 0, null, 1)), new LinkedHashSet());
        md.n nVarA2 = md.n.b.a(aVar, "session_info");
        if (!nVar2.equals(nVarA2)) {
            return new androidx.room.i0.a(false, vb.h.i("session_info(com.garmin.android.library.livetrack.data.entity.SessionInfo).\n Expected:\n", nVar2, "\n Found:\n", nVarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("device_unit_id", new md.n.a("device_unit_id", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("publisher_id", new md.n.a("publisher_id", "TEXT", true, 0, null, 1));
        md.n nVar3 = new md.n("livetrack_publishers", linkedHashMap3, vb.h.j(linkedHashMap3, "publisher_type", new md.n.a("publisher_type", "TEXT", true, 0, null, 1)), new LinkedHashSet());
        md.n nVarA3 = md.n.b.a(aVar, "livetrack_publishers");
        return !nVar3.equals(nVarA3) ? new androidx.room.i0.a(false, vb.h.i("livetrack_publishers(com.garmin.android.library.livetrack.data.entity.LivetrackPublisher).\n Expected:\n", nVar3, "\n Found:\n", nVarA3)) : new androidx.room.i0.a(true, null);
    }
}
