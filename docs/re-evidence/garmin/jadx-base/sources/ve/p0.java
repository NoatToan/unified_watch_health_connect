package ve;

import androidx.work.impl.WorkDatabase_Impl;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lve/p0;", "Landroidx/room/i0;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 extends androidx.room.i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase_Impl f177592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f177592d = workDatabase_Impl;
    }

    @Override // androidx.room.i0
    public final void a(ud.a aVar) {
        vb.h.v(aVar, aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        oe2.f.o(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        oe2.f.o(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        oe2.f.o(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oe2.f.o(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oe2.f.o(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        oe2.f.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oe2.f.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // androidx.room.i0
    public final void b(ud.a aVar) {
        vb.h.v(aVar, aVar, "DROP TABLE IF EXISTS `Dependency`", aVar, "DROP TABLE IF EXISTS `WorkSpec`");
        oe2.f.o(aVar, "DROP TABLE IF EXISTS `WorkTag`");
        oe2.f.o(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        oe2.f.o(aVar, "DROP TABLE IF EXISTS `WorkName`");
        oe2.f.o(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
        oe2.f.o(aVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // androidx.room.i0
    public final void c(ud.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.room.i0
    public final void d(ud.a aVar) {
        aVar.getClass();
        oe2.f.o(aVar, "PRAGMA foreign_keys = ON");
        int i14 = WorkDatabase_Impl.f11476i;
        this.f177592d.internalInitInvalidationTracker(aVar);
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
        linkedHashMap.put("work_spec_id", new md.n.a("work_spec_id", "TEXT", true, 1, null, 1));
        LinkedHashSet linkedHashSetJ = vb.h.j(linkedHashMap, "prerequisite_id", new md.n.a("prerequisite_id", "TEXT", true, 2, null, 1));
        linkedHashSetJ.add(new md.n.c("WorkSpec", "CASCADE", "CASCADE", p13.w.c("work_spec_id"), p13.w.c(TtmlNode.ATTR_ID)));
        linkedHashSetJ.add(new md.n.c("WorkSpec", "CASCADE", "CASCADE", p13.w.c("prerequisite_id"), p13.w.c(TtmlNode.ATTR_ID)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new md.n.d("index_Dependency_work_spec_id", false, p13.w.c("work_spec_id"), p13.w.c("ASC")));
        linkedHashSet.add(new md.n.d("index_Dependency_prerequisite_id", false, p13.w.c("prerequisite_id"), p13.w.c("ASC")));
        md.n nVar = new md.n("Dependency", linkedHashMap, linkedHashSetJ, linkedHashSet);
        md.n.f117868e.getClass();
        md.n nVarA = md.n.b.a(aVar, "Dependency");
        if (!nVar.equals(nVarA)) {
            return new androidx.room.i0.a(false, vb.h.i("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", nVar, "\n Found:\n", nVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(TtmlNode.ATTR_ID, new md.n.a(TtmlNode.ATTR_ID, "TEXT", true, 1, null, 1));
        linkedHashMap2.put(RemoteConfigConstants.ResponseFieldKey.STATE, new md.n.a(RemoteConfigConstants.ResponseFieldKey.STATE, "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new md.n.a("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new md.n.a("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new md.n.a("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new md.n.a("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new md.n.a("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new md.n.a("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new md.n.a("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new md.n.a("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new md.n.a("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new md.n.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new md.n.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new md.n.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new md.n.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new md.n.a("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new md.n.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new md.n.a("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new md.n.a("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new md.n.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new md.n.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put(DownloadService.KEY_STOP_REASON, new md.n.a(DownloadService.KEY_STOP_REASON, "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new md.n.a("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new md.n.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new md.n.a("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new md.n.a("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new md.n.a("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new md.n.a("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new md.n.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new md.n.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new md.n.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new md.n.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSetJ2 = vb.h.j(linkedHashMap2, "content_uri_triggers", new md.n.a("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new md.n.d("index_WorkSpec_schedule_requested_at", false, p13.w.c("schedule_requested_at"), p13.w.c("ASC")));
        linkedHashSet2.add(new md.n.d("index_WorkSpec_last_enqueue_time", false, p13.w.c("last_enqueue_time"), p13.w.c("ASC")));
        md.n nVar2 = new md.n("WorkSpec", linkedHashMap2, linkedHashSetJ2, linkedHashSet2);
        md.n nVarA2 = md.n.b.a(aVar, "WorkSpec");
        if (!nVar2.equals(nVarA2)) {
            return new androidx.room.i0.a(false, vb.h.i("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", nVar2, "\n Found:\n", nVarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(HeaderParameterNames.AUTHENTICATION_TAG, new md.n.a(HeaderParameterNames.AUTHENTICATION_TAG, "TEXT", true, 1, null, 1));
        LinkedHashSet linkedHashSetJ3 = vb.h.j(linkedHashMap3, "work_spec_id", new md.n.a("work_spec_id", "TEXT", true, 2, null, 1));
        linkedHashSetJ3.add(new md.n.c("WorkSpec", "CASCADE", "CASCADE", p13.w.c("work_spec_id"), p13.w.c(TtmlNode.ATTR_ID)));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new md.n.d("index_WorkTag_work_spec_id", false, p13.w.c("work_spec_id"), p13.w.c("ASC")));
        md.n nVar3 = new md.n("WorkTag", linkedHashMap3, linkedHashSetJ3, linkedHashSet3);
        md.n nVarA3 = md.n.b.a(aVar, "WorkTag");
        if (!nVar3.equals(nVarA3)) {
            return new androidx.room.i0.a(false, vb.h.i("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", nVar3, "\n Found:\n", nVarA3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new md.n.a("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new md.n.a("generation", "INTEGER", true, 2, "0", 1));
        LinkedHashSet linkedHashSetJ4 = vb.h.j(linkedHashMap4, "system_id", new md.n.a("system_id", "INTEGER", true, 0, null, 1));
        linkedHashSetJ4.add(new md.n.c("WorkSpec", "CASCADE", "CASCADE", p13.w.c("work_spec_id"), p13.w.c(TtmlNode.ATTR_ID)));
        md.n nVar4 = new md.n("SystemIdInfo", linkedHashMap4, linkedHashSetJ4, new LinkedHashSet());
        md.n nVarA4 = md.n.b.a(aVar, "SystemIdInfo");
        if (!nVar4.equals(nVarA4)) {
            return new androidx.room.i0.a(false, vb.h.i("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", nVar4, "\n Found:\n", nVarA4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new md.n.a("name", "TEXT", true, 1, null, 1));
        LinkedHashSet linkedHashSetJ5 = vb.h.j(linkedHashMap5, "work_spec_id", new md.n.a("work_spec_id", "TEXT", true, 2, null, 1));
        linkedHashSetJ5.add(new md.n.c("WorkSpec", "CASCADE", "CASCADE", p13.w.c("work_spec_id"), p13.w.c(TtmlNode.ATTR_ID)));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new md.n.d("index_WorkName_work_spec_id", false, p13.w.c("work_spec_id"), p13.w.c("ASC")));
        md.n nVar5 = new md.n("WorkName", linkedHashMap5, linkedHashSetJ5, linkedHashSet4);
        md.n nVarA5 = md.n.b.a(aVar, "WorkName");
        if (!nVar5.equals(nVarA5)) {
            return new androidx.room.i0.a(false, vb.h.i("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", nVar5, "\n Found:\n", nVarA5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new md.n.a("work_spec_id", "TEXT", true, 1, null, 1));
        LinkedHashSet linkedHashSetJ6 = vb.h.j(linkedHashMap6, "progress", new md.n.a("progress", "BLOB", true, 0, null, 1));
        linkedHashSetJ6.add(new md.n.c("WorkSpec", "CASCADE", "CASCADE", p13.w.c("work_spec_id"), p13.w.c(TtmlNode.ATTR_ID)));
        md.n nVar6 = new md.n("WorkProgress", linkedHashMap6, linkedHashSetJ6, new LinkedHashSet());
        md.n nVarA6 = md.n.b.a(aVar, "WorkProgress");
        if (!nVar6.equals(nVarA6)) {
            return new androidx.room.i0.a(false, vb.h.i("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", nVar6, "\n Found:\n", nVarA6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put(Action.KEY_ATTRIBUTE, new md.n.a(Action.KEY_ATTRIBUTE, "TEXT", true, 1, null, 1));
        md.n nVar7 = new md.n("Preference", linkedHashMap7, vb.h.j(linkedHashMap7, "long_value", new md.n.a("long_value", "INTEGER", false, 0, null, 1)), new LinkedHashSet());
        md.n nVarA7 = md.n.b.a(aVar, "Preference");
        return !nVar7.equals(nVarA7) ? new androidx.room.i0.a(false, vb.h.i("Preference(androidx.work.impl.model.Preference).\n Expected:\n", nVar7, "\n Found:\n", nVarA7)) : new androidx.room.i0.a(true, null);
    }
}
