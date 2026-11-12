package zd2;

import androidx.room.b0;
import com.google.gson.Gson;
import java.util.Map;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import xd2.s0;
import xd2.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzd2/e;", "Lzd2/d;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f204232d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f204233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f204234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be2.d f204235c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zd2/e$a", "Landroidx/room/g;", "Lbe2/f;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<be2.f> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, be2.f fVar) {
            be2.f fVar2 = fVar;
            cVar.getClass();
            fVar2.getClass();
            Map<Long, be2.f.a> map = fVar2.f17751a;
            be2.d dVar = e.this.f204235c;
            dVar.getClass();
            String json = new Gson().toJson(map);
            if (json == null) {
                cVar.u(1);
            } else {
                cVar.q3(1, json);
            }
            Boolean bool = fVar2.f17752b;
            Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                cVar.u(2);
            } else {
                cVar.h(2, numValueOf.intValue());
            }
            Boolean bool2 = fVar2.f17753c;
            Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
            if (numValueOf2 == null) {
                cVar.u(3);
            } else {
                cVar.h(3, numValueOf2.intValue());
            }
            Boolean bool3 = fVar2.f17754d;
            Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
            if (numValueOf3 == null) {
                cVar.u(4);
            } else {
                cVar.h(4, numValueOf3.intValue());
            }
            Boolean bool4 = fVar2.f17755e;
            Integer numValueOf4 = bool4 != null ? Integer.valueOf(bool4.booleanValue() ? 1 : 0) : null;
            if (numValueOf4 == null) {
                cVar.u(5);
            } else {
                cVar.h(5, numValueOf4.intValue());
            }
            Period period = fVar2.f17756f;
            dVar.getClass();
            cVar.h(6, period != null ? period.getSeconds() : 0);
            String json2 = new Gson().toJson(fVar2.f17757g);
            if (json2 == null) {
                cVar.u(7);
            } else {
                cVar.q3(7, json2);
            }
            cVar.h(8, fVar2.f17758h);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `general_settings` (`device_settings`,`email_enabled`,`extend_live_track`,`group_track_all_connections`,`group_track_enabled`,`post_track_point_frequency_seconds`,`profile_settings`,`uid`) VALUES (?,?,?,?,?,?,?,nullif(?, 0))";
        }
    }

    public e(b0 b0Var) {
        b0Var.getClass();
        this.f204235c = new be2.d();
        this.f204233a = b0Var;
        this.f204234b = new a();
    }

    @Override // zd2.d
    public final Object a(be2.f fVar, u0 u0Var) throws Throwable {
        Object objQ = gl1.d.Q(this.f204233a, false, true, new yt.f(14, this, fVar), u0Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.d
    public final Object b(v13.c cVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f204233a, false, true, new z81.b(8), cVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.d
    public final Object c(s0 s0Var) {
        return gl1.d.Q(this.f204233a, true, false, new yw2.h(this, 10), s0Var);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd2/e$b;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
