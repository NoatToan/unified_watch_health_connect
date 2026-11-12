package cf;

import androidx.room.g0;
import ca0.d2;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import ue.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcf/b0;", "Lcf/u;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f26898d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.b0 f26899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f26901c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/b0$a", "Landroidx/room/g;", "Lcf/t;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.g<t> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, t tVar) {
            int i14;
            t tVar2 = tVar;
            cVar.getClass();
            tVar2.getClass();
            int i15 = 1;
            cVar.q3(1, tVar2.f26941a);
            cVar.h(2, f0.i(tVar2.f26942b));
            cVar.q3(3, tVar2.f26943c);
            cVar.q3(4, tVar2.f26944d);
            androidx.work.c.b bVar = androidx.work.c.f11464b;
            androidx.work.c cVar2 = tVar2.f26945e;
            bVar.getClass();
            cVar.t(5, androidx.work.c.b.c(cVar2));
            cVar.t(6, androidx.work.c.b.c(tVar2.f26946f));
            cVar.h(7, tVar2.f26947g);
            cVar.h(8, tVar2.f26948h);
            cVar.h(9, tVar2.f26949i);
            cVar.h(10, tVar2.f26951k);
            ue.a aVar = tVar2.f26952l;
            aVar.getClass();
            int i16 = f0.a.f26916b[aVar.ordinal()];
            if (i16 == 1) {
                i14 = 0;
            } else {
                if (i16 != 2) {
                    u0.r();
                    return;
                }
                i14 = 1;
            }
            cVar.h(11, i14);
            cVar.h(12, tVar2.f26953m);
            cVar.h(13, tVar2.f26954n);
            cVar.h(14, tVar2.f26955o);
            cVar.h(15, tVar2.f26956p);
            cVar.h(16, tVar2.f26957q ? 1L : 0L);
            ue.b0 b0Var = tVar2.f26958r;
            b0Var.getClass();
            int i17 = f0.a.f26918d[b0Var.ordinal()];
            if (i17 == 1) {
                i15 = 0;
            } else if (i17 != 2) {
                u0.r();
                return;
            }
            cVar.h(17, i15);
            cVar.h(18, tVar2.f26959s);
            cVar.h(19, tVar2.f26960t);
            cVar.h(20, tVar2.f26961u);
            cVar.h(21, tVar2.f26962v);
            cVar.h(22, tVar2.f26963w);
            String str = tVar2.f26964x;
            if (str == null) {
                cVar.u(23);
            } else {
                cVar.q3(23, str);
            }
            Boolean bool = tVar2.f26965y;
            Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                cVar.u(24);
            } else {
                cVar.h(24, numValueOf.intValue());
            }
            ue.f fVar = tVar2.f26950j;
            cVar.h(25, f0.g(fVar.f170043a));
            cVar.t(26, f0.b(fVar.f170044b));
            cVar.h(27, fVar.f170045c ? 1L : 0L);
            cVar.h(28, fVar.f170046d ? 1L : 0L);
            cVar.h(29, fVar.f170047e ? 1L : 0L);
            cVar.h(30, fVar.f170048f ? 1L : 0L);
            cVar.h(31, fVar.f170049g);
            cVar.h(32, fVar.f170050h);
            cVar.t(33, f0.h(fVar.f170051i));
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cf/b0$b", "Landroidx/room/e;", "Lcf/t;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends androidx.room.e<t> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, t tVar) {
            int i14;
            t tVar2 = tVar;
            cVar.getClass();
            tVar2.getClass();
            String str = tVar2.f26941a;
            int i15 = 1;
            cVar.q3(1, str);
            cVar.h(2, f0.i(tVar2.f26942b));
            cVar.q3(3, tVar2.f26943c);
            cVar.q3(4, tVar2.f26944d);
            androidx.work.c.b bVar = androidx.work.c.f11464b;
            androidx.work.c cVar2 = tVar2.f26945e;
            bVar.getClass();
            cVar.t(5, androidx.work.c.b.c(cVar2));
            cVar.t(6, androidx.work.c.b.c(tVar2.f26946f));
            cVar.h(7, tVar2.f26947g);
            cVar.h(8, tVar2.f26948h);
            cVar.h(9, tVar2.f26949i);
            cVar.h(10, tVar2.f26951k);
            ue.a aVar = tVar2.f26952l;
            aVar.getClass();
            int i16 = f0.a.f26916b[aVar.ordinal()];
            if (i16 == 1) {
                i14 = 0;
            } else {
                if (i16 != 2) {
                    u0.r();
                    return;
                }
                i14 = 1;
            }
            cVar.h(11, i14);
            cVar.h(12, tVar2.f26953m);
            cVar.h(13, tVar2.f26954n);
            cVar.h(14, tVar2.f26955o);
            cVar.h(15, tVar2.f26956p);
            cVar.h(16, tVar2.f26957q ? 1L : 0L);
            ue.b0 b0Var = tVar2.f26958r;
            b0Var.getClass();
            int i17 = f0.a.f26918d[b0Var.ordinal()];
            if (i17 == 1) {
                i15 = 0;
            } else if (i17 != 2) {
                u0.r();
                return;
            }
            cVar.h(17, i15);
            cVar.h(18, tVar2.f26959s);
            cVar.h(19, tVar2.f26960t);
            cVar.h(20, tVar2.f26961u);
            cVar.h(21, tVar2.f26962v);
            cVar.h(22, tVar2.f26963w);
            String str2 = tVar2.f26964x;
            if (str2 == null) {
                cVar.u(23);
            } else {
                cVar.q3(23, str2);
            }
            Boolean bool = tVar2.f26965y;
            Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                cVar.u(24);
            } else {
                cVar.h(24, numValueOf.intValue());
            }
            ue.f fVar = tVar2.f26950j;
            cVar.h(25, f0.g(fVar.f170043a));
            cVar.t(26, f0.b(fVar.f170044b));
            cVar.h(27, fVar.f170045c ? 1L : 0L);
            cVar.h(28, fVar.f170046d ? 1L : 0L);
            cVar.h(29, fVar.f170047e ? 1L : 0L);
            cVar.h(30, fVar.f170048f ? 1L : 0L);
            cVar.h(31, fVar.f170049g);
            cVar.h(32, fVar.f170050h);
            cVar.t(33, f0.h(fVar.f170051i));
            cVar.q3(34, str);
        }

        @Override // androidx.room.e
        public final String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public b0(androidx.room.b0 b0Var) {
        b0Var.getClass();
        this.f26899a = b0Var;
        this.f26900b = new a();
        this.f26901c = new b();
    }

    @Override // cf.u
    public final jd.g A() {
        d2 d2Var = new d2(25);
        return gl.b.n(this.f26899a, false, new String[]{"workspec"}, d2Var);
    }

    @Override // cf.u
    public final List<t> B(int i14) {
        return (List) gl1.d.O(this.f26899a, true, false, new a0(i14, 0));
    }

    @Override // cf.u
    public final int C(String str) {
        str.getClass();
        return ((Number) gl1.d.O(this.f26899a, false, true, new c82.b(str, 20))).intValue();
    }

    public final void D(ud.a aVar, p1.a<String, List<androidx.work.c>> aVar2) {
        p1.a.c cVar = (p1.a.c) aVar2.keySet();
        p1.a aVar3 = p1.a.this;
        if (aVar3.isEmpty()) {
            return;
        }
        if (aVar2.f134761c > 999) {
            gl1.y.G(aVar2, new z(this, aVar, 0));
            return;
        }
        StringBuilder sbK = e5.k("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        gg.b.n(aVar3.f134761c, sbK);
        sbK.append(")");
        ud.c cVarM0 = aVar.M0(sbK.toString());
        Iterator it = cVar.iterator();
        int i14 = 1;
        while (true) {
            p1.h hVar = (p1.h) it;
            if (!hVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            }
            cVarM0.q3(i14, (String) hVar.next());
            i14++;
        }
        cVarM0.getClass();
        int iN = ge1.b.n(cVarM0, "work_spec_id");
        if (iN == -1) {
            cVarM0.close();
            return;
        }
        while (cVarM0.J0()) {
            List<androidx.work.c> list = aVar2.get(cVarM0.M1(iN));
            if (list != null) {
                byte[] blob = cVarM0.getBlob(0);
                androidx.work.c.f11464b.getClass();
                list.add(androidx.work.c.b.a(blob));
            }
        }
        cVarM0.close();
    }

    public final void E(ud.a aVar, p1.a<String, List<String>> aVar2) {
        p1.a.c cVar = (p1.a.c) aVar2.keySet();
        p1.a aVar3 = p1.a.this;
        if (aVar3.isEmpty()) {
            return;
        }
        if (aVar2.f134761c > 999) {
            gl1.y.G(aVar2, new z(this, aVar, 1));
            return;
        }
        StringBuilder sbK = e5.k("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        gg.b.n(aVar3.f134761c, sbK);
        sbK.append(")");
        ud.c cVarM0 = aVar.M0(sbK.toString());
        Iterator it = cVar.iterator();
        int i14 = 1;
        while (true) {
            p1.h hVar = (p1.h) it;
            if (!hVar.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            }
            cVarM0.q3(i14, (String) hVar.next());
            i14++;
        }
        cVarM0.getClass();
        int iN = ge1.b.n(cVarM0, "work_spec_id");
        if (iN == -1) {
            cVarM0.close();
            return;
        }
        while (cVarM0.J0()) {
            List<String> list = aVar2.get(cVarM0.M1(iN));
            if (list != null) {
                list.add(cVarM0.M1(0));
            }
        }
        cVarM0.close();
    }

    @Override // cf.u
    public final void a(String str) {
        gl1.d.O(this.f26899a, false, true, new c82.b(str, 11));
    }

    @Override // cf.u
    public final jd.g b(List list) {
        StringBuilder sbK = e5.k("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        gg.b.n(list.size(), sbK);
        sbK.append(")");
        y yVar = new y(sbK.toString(), list, this, 1);
        return gl.b.n(this.f26899a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, yVar);
    }

    @Override // cf.u
    public final h0.c c(String str) {
        str.getClass();
        return (h0.c) gl1.d.O(this.f26899a, true, false, new c82.b(str, 13));
    }

    @Override // cf.u
    public final int d(String str) {
        str.getClass();
        return ((Number) gl1.d.O(this.f26899a, false, true, new c82.b(str, 15))).intValue();
    }

    @Override // cf.u
    public final List<androidx.work.c> e(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f26899a, true, false, new c82.b(str, 19));
    }

    @Override // cf.u
    public final void f(t tVar) {
        gl1.d.O(this.f26899a, false, true, new w(this, tVar, 0));
    }

    @Override // cf.u
    public final int g(String str) {
        str.getClass();
        return ((Number) gl1.d.O(this.f26899a, false, true, new c82.b(str, 16))).intValue();
    }

    @Override // cf.u
    public final int h(String str, h0.c cVar) {
        cVar.getClass();
        str.getClass();
        return ((Number) gl1.d.O(this.f26899a, false, true, new bp.h(28, cVar, str))).intValue();
    }

    @Override // cf.u
    public final t i(String str) {
        str.getClass();
        return (t) gl1.d.O(this.f26899a, true, false, new c82.b(str, 10));
    }

    @Override // cf.u
    public final int j() {
        return ((Number) gl1.d.O(this.f26899a, false, true, new d2(23))).intValue();
    }

    @Override // cf.u
    public final void k(String str, androidx.work.c cVar) {
        str.getClass();
        gl1.d.O(this.f26899a, false, true, new bp.h(27, cVar, str));
    }

    @Override // cf.u
    public final void l(t tVar) {
        gl1.d.O(this.f26899a, false, true, new w(this, tVar, 1));
    }

    @Override // cf.u
    public final List<t> m() {
        return (List) gl1.d.O(this.f26899a, true, false, new d2(28));
    }

    @Override // cf.u
    public final List<String> n(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f26899a, true, false, new c82.b(str, 14));
    }

    @Override // cf.u
    public final List<String> o(String str) {
        return (List) gl1.d.O(this.f26899a, true, false, new c82.b(str, 18));
    }

    @Override // cf.u
    public final void p(long j8, String str) {
        str.getClass();
        gl1.d.O(this.f26899a, false, true, new x(j8, str, 0));
    }

    @Override // cf.u
    public final List<t> q() {
        return (List) gl1.d.O(this.f26899a, true, false, new d2(24));
    }

    @Override // cf.u
    public final g0 r(List list) {
        list.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        gg.b.n(list.size(), sb3);
        sb3.append(")");
        return this.f26899a.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new y(sb3.toString(), list, this, 0));
    }

    @Override // cf.u
    public final int s() {
        return ((Number) gl1.d.O(this.f26899a, true, false, new d2(22))).intValue();
    }

    @Override // cf.u
    public final void setStopReason(String str, int i14) {
        str.getClass();
        gl1.d.O(this.f26899a, false, true, new k(i14, str));
    }

    @Override // cf.u
    public final void t(String str) {
        str.getClass();
        gl1.d.O(this.f26899a, false, true, new c82.b(str, 17));
    }

    @Override // cf.u
    public final int u(long j8, String str) {
        str.getClass();
        return ((Number) gl1.d.O(this.f26899a, false, true, new x(j8, str, 1))).intValue();
    }

    @Override // cf.u
    public final List<t> v(long j8) {
        return (List) gl1.d.O(this.f26899a, true, false, new a02.a(j8, 9));
    }

    @Override // cf.u
    public final void w(int i14, String str) {
        str.getClass();
        gl1.d.O(this.f26899a, false, true, new k(str, i14, 1));
    }

    @Override // cf.u
    public final List<t> x() {
        return (List) gl1.d.O(this.f26899a, true, false, new d2(27));
    }

    @Override // cf.u
    public final List y() {
        return (List) gl1.d.O(this.f26899a, true, false, new d2(26));
    }

    @Override // cf.u
    public final List<t.b> z(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f26899a, true, false, new c82.b(str, 12));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/b0$c;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
