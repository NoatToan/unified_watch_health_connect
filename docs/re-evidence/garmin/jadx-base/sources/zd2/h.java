package zd2;

import androidx.room.b0;
import com.google.gson.Gson;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;
import xd2.c1;
import xd2.p0;
import xd2.v0;
import xd2.w0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzd2/h;", "Lzd2/f;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f204240e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f204241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f204242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be2.d f204243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f204244d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zd2/h$a", "Landroidx/room/g;", "Lbe2/g;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<be2.g> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, be2.g gVar) {
            be2.g gVar2 = gVar;
            cVar.getClass();
            gVar2.getClass();
            cVar.h(1, gVar2.f17765a);
            cVar.q3(2, gVar2.f17766b);
            cVar.q3(3, gVar2.f17767c);
            cVar.q3(4, gVar2.f17768d);
            cVar.h(5, gVar2.f17769e ? 1L : 0L);
            cVar.h(6, gVar2.f17770f ? 1L : 0L);
            String str = gVar2.f17771g;
            if (str == null) {
                cVar.u(7);
            } else {
                cVar.q3(7, str);
            }
            String str2 = gVar2.f17772h;
            if (str2 == null) {
                cVar.u(8);
            } else {
                cVar.q3(8, str2);
            }
            Long l14 = gVar2.f17773i;
            if (l14 == null) {
                cVar.u(9);
            } else {
                cVar.h(9, l14.longValue());
            }
            List<be2.g.a> list = gVar2.f17774j;
            h.this.f204243c.getClass();
            String json = new Gson().toJson(list);
            if (json == null) {
                cVar.u(10);
            } else {
                cVar.q3(10, json);
            }
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `session_info` (`device_unit_id`,`name`,`publisher_id`,`publisher_type`,`device_driven`,`should_stop_on_device`,`group_track_session_id`,`activity_type`,`activity_created_time`,`sharing_errors`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zd2/h$b", "Landroidx/room/e;", "Lbe2/g;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.room.e<be2.g> {
        public b() {
        }

        @Override // androidx.room.e
        public final void a(ud.c cVar, be2.g gVar) {
            be2.g gVar2 = gVar;
            cVar.getClass();
            gVar2.getClass();
            long j8 = gVar2.f17765a;
            cVar.h(1, j8);
            cVar.q3(2, gVar2.f17766b);
            cVar.q3(3, gVar2.f17767c);
            cVar.q3(4, gVar2.f17768d);
            cVar.h(5, gVar2.f17769e ? 1L : 0L);
            cVar.h(6, gVar2.f17770f ? 1L : 0L);
            String str = gVar2.f17771g;
            if (str == null) {
                cVar.u(7);
            } else {
                cVar.q3(7, str);
            }
            String str2 = gVar2.f17772h;
            if (str2 == null) {
                cVar.u(8);
            } else {
                cVar.q3(8, str2);
            }
            Long l14 = gVar2.f17773i;
            if (l14 == null) {
                cVar.u(9);
            } else {
                cVar.h(9, l14.longValue());
            }
            List<be2.g.a> list = gVar2.f17774j;
            h.this.f204243c.getClass();
            String json = new Gson().toJson(list);
            if (json == null) {
                cVar.u(10);
            } else {
                cVar.q3(10, json);
            }
            cVar.h(11, j8);
        }

        @Override // androidx.room.e
        public final String b() {
            return "UPDATE OR ABORT `session_info` SET `device_unit_id` = ?,`name` = ?,`publisher_id` = ?,`publisher_type` = ?,`device_driven` = ?,`should_stop_on_device` = ?,`group_track_session_id` = ?,`activity_type` = ?,`activity_created_time` = ?,`sharing_errors` = ? WHERE `device_unit_id` = ?";
        }
    }

    public h(b0 b0Var) {
        b0Var.getClass();
        this.f204243c = new be2.d();
        this.f204241a = b0Var;
        this.f204242b = new a();
        this.f204244d = new b();
    }

    @Override // zd2.f
    public final Object a(long j8, p0 p0Var) throws Throwable {
        Object objQ = gl1.d.Q(this.f204241a, false, true, new zd2.b(j8, 2), p0Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.f
    public final Object b(c1 c1Var) throws Throwable {
        Object objQ = gl1.d.Q(this.f204241a, false, true, new z81.b(9), c1Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.f
    public final Object c(long j8, i iVar) {
        return gl1.d.Q(this.f204241a, true, false, new bb2.b(j8, this, 15), iVar);
    }

    @Override // zd2.f
    public final Object d(be2.g gVar, v0 v0Var) throws Throwable {
        Object objQ = gl1.d.Q(this.f204241a, false, true, new g(this, gVar, 0), v0Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.f
    public final Object e(be2.g gVar, w0 w0Var) {
        return gl1.d.Q(this.f204241a, false, true, new g(this, gVar, 1), w0Var);
    }

    @Override // zd2.f
    public final List<be2.g> getAll() {
        return (List) gl1.d.O(this.f204241a, true, false, new yw2.h(this, 11));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd2/h$c;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }
}
