package zd2;

import androidx.room.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import wd2.n;
import xd2.r0;
import xd2.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzd2/c;", "Lzd2/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements zd2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f204229c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f204230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f204231b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zd2/c$a", "Landroidx/room/g;", "Lbe2/e;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<be2.e> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, be2.e eVar) {
            be2.e eVar2 = eVar;
            cVar.getClass();
            eVar2.getClass();
            cVar.h(1, eVar2.f17748a);
            cVar.q3(2, eVar2.f17749b);
            cVar.q3(3, eVar2.f17750c);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `livetrack_publishers` (`device_unit_id`,`publisher_id`,`publisher_type`) VALUES (?,?,?)";
        }
    }

    public c(b0 b0Var) {
        b0Var.getClass();
        this.f204230a = b0Var;
        this.f204231b = new a();
    }

    @Override // zd2.a
    public final Object a(long j8, v13.c cVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f204230a, false, true, new zd2.b(j8, 0), cVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.a
    public final Object b(n nVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f204230a, false, true, new z81.b(7), nVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.a
    public final Object c(be2.e eVar, s sVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f204230a, false, true, new yt.f(13, this, eVar), sVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // zd2.a
    public final Object d(long j8, r0 r0Var) {
        return gl1.d.Q(this.f204230a, true, false, new zd2.b(j8, 1), r0Var);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd2/c$b;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
