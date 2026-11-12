package eu0;

import androidx.room.i0;
import com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase_Impl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import md.n;
import oe2.f;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/b;", "Landroidx/room/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LiveEventDatabase_Impl f66092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LiveEventDatabase_Impl liveEventDatabase_Impl) {
        super(1, "dcfee18b7cc66a6919c194245bf23a51", "c793d65f33d05b8c8836d9d002135206");
        this.f66092d = liveEventDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `live_event_settings` (`device_id` INTEGER NOT NULL, `live_event_sharing_on` INTEGER, `live_event_end_time_stamp` INTEGER, `livetrack_enabled` INTEGER, `message_triggers` TEXT, `message_contents` TEXT, `est_target_distance` INTEGER, `msg_trigger_distance` INTEGER, `msg_trigger_time` INTEGER, PRIMARY KEY(`device_id`))", aVar, "CREATE TABLE IF NOT EXISTS `live_event_contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `first_name` TEXT, `last_name` TEXT, `phones` TEXT)");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS `transitions_counter` (`device_id` INTEGER NOT NULL, `counter` INTEGER NOT NULL, PRIMARY KEY(`device_id`))");
        f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dcfee18b7cc66a6919c194245bf23a51')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        h.v(aVar, aVar, "DROP TABLE IF EXISTS `live_event_settings`", aVar, "DROP TABLE IF EXISTS `live_event_contacts`");
        f.o(aVar, "DROP TABLE IF EXISTS `transitions_counter`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        int i14 = LiveEventDatabase_Impl.f38502f;
        this.f66092d.internalInitInvalidationTracker(aVar);
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
        linkedHashMap.put("device_id", new n.a("device_id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("live_event_sharing_on", new n.a("live_event_sharing_on", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("live_event_end_time_stamp", new n.a("live_event_end_time_stamp", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("livetrack_enabled", new n.a("livetrack_enabled", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("message_triggers", new n.a("message_triggers", "TEXT", false, 0, null, 1));
        linkedHashMap.put("message_contents", new n.a("message_contents", "TEXT", false, 0, null, 1));
        linkedHashMap.put("est_target_distance", new n.a("est_target_distance", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("msg_trigger_distance", new n.a("msg_trigger_distance", "INTEGER", false, 0, null, 1));
        n nVar = new n("live_event_settings", linkedHashMap, h.j(linkedHashMap, "msg_trigger_time", new n.a("msg_trigger_time", "INTEGER", false, 0, null, 1)), new LinkedHashSet());
        n.f117868e.getClass();
        n nVarA = n.b.a(aVar, "live_event_settings");
        if (!nVar.equals(nVarA)) {
            return new i0.a(false, h.i("live_event_settings(com.garmin.android.apps.connectmobile.liveeventsharing.database.entities.LiveEventSettingsRecord).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(TtmlNode.ATTR_ID, new n.a(TtmlNode.ATTR_ID, "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("first_name", new n.a("first_name", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("last_name", new n.a("last_name", "TEXT", false, 0, null, 1));
        n nVar2 = new n("live_event_contacts", linkedHashMap2, h.j(linkedHashMap2, "phones", new n.a("phones", "TEXT", false, 0, null, 1)), new LinkedHashSet());
        n nVarA2 = n.b.a(aVar, "live_event_contacts");
        if (!nVar2.equals(nVarA2)) {
            return new i0.a(false, h.i("live_event_contacts(com.garmin.android.apps.connectmobile.liveeventsharing.database.entities.LiveEventContactRecord).\n Expected:\n", nVar2, "\n Found:\n", nVarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("device_id", new n.a("device_id", "INTEGER", true, 1, null, 1));
        n nVar3 = new n("transitions_counter", linkedHashMap3, h.j(linkedHashMap3, "counter", new n.a("counter", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        n nVarA3 = n.b.a(aVar, "transitions_counter");
        return !nVar3.equals(nVarA3) ? new i0.a(false, h.i("transitions_counter(com.garmin.android.apps.connectmobile.liveeventsharing.database.entities.TransitionCounterRecord).\n Expected:\n", nVar3, "\n Found:\n", nVarA3)) : new i0.a(true, null);
    }
}
