package fu0;

import androidx.room.b0;
import androidx.room.g;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfu0/d;", "Lfu0/c;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f73497d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f73498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f73499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eu0.c f73500c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fu0/d$a", "Landroidx/room/g;", "Lgu0/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<gu0.b> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, gu0.b bVar) {
            gu0.b bVar2 = bVar;
            cVar.getClass();
            bVar2.getClass();
            cVar.h(1, bVar2.f79036a);
            Boolean bool = bVar2.f79037b;
            String strK0 = null;
            Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                cVar.u(2);
            } else {
                cVar.h(2, numValueOf.intValue());
            }
            Long l14 = bVar2.f79038c;
            if (l14 == null) {
                cVar.u(3);
            } else {
                cVar.h(3, l14.longValue());
            }
            Boolean bool2 = bVar2.f79039d;
            Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
            if (numValueOf2 == null) {
                cVar.u(4);
            } else {
                cVar.h(4, numValueOf2.intValue());
            }
            List<ju0.c> list = bVar2.f79040e;
            d dVar = d.this;
            dVar.f73500c.getClass();
            String strK1 = (list == null || list.isEmpty()) ? null : h0.k0(list, ",", null, null, new ep0.a(18), 30);
            if (strK1 == null) {
                cVar.u(5);
            } else {
                cVar.q3(5, strK1);
            }
            List<ju0.b> list2 = bVar2.f79041f;
            dVar.f73500c.getClass();
            if (list2 != null && !list2.isEmpty()) {
                strK0 = h0.k0(list2, ",", null, null, new ep0.a(17), 30);
            }
            if (strK0 == null) {
                cVar.u(6);
            } else {
                cVar.q3(6, strK0);
            }
            Integer num = bVar2.f79042g;
            if (num == null) {
                cVar.u(7);
            } else {
                cVar.h(7, num.intValue());
            }
            Integer num2 = bVar2.f79043h;
            if (num2 == null) {
                cVar.u(8);
            } else {
                cVar.h(8, num2.intValue());
            }
            Integer num3 = bVar2.f79044i;
            if (num3 == null) {
                cVar.u(9);
            } else {
                cVar.h(9, num3.intValue());
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `live_event_settings` (`device_id`,`live_event_sharing_on`,`live_event_end_time_stamp`,`livetrack_enabled`,`message_triggers`,`message_contents`,`est_target_distance`,`msg_trigger_distance`,`msg_trigger_time`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public d(b0 b0Var) {
        b0Var.getClass();
        this.f73500c = new eu0.c();
        this.f73498a = b0Var;
        this.f73499b = new a();
    }

    @Override // fu0.c
    public final gu0.b b(long j8) {
        return (gu0.b) gl1.d.O(this.f73498a, true, false, new bb2.b(j8, this, 3));
    }

    @Override // fu0.c
    public final void c(gu0.b bVar) {
        gl1.d.O(this.f73498a, false, true, new e52.b(25, this, bVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu0/d$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
