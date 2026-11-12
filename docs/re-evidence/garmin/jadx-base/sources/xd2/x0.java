package xd2;

import com.garmin.android.library.livetrack.data.LocalDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd2/x0;", "Lxd2/f1;", "Lcom/garmin/android/library/livetrack/data/LocalDatabase;", "database", "Lxd2/b1;", "sharedPreferences", "<init>", "(Lcom/garmin/android/library/livetrack/data/LocalDatabase;Lxd2/b1;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDatabase f190390a;

    public x0(LocalDatabase localDatabase, b1 b1Var) {
        localDatabase.getClass();
        b1Var.getClass();
        this.f190390a = localDatabase;
    }

    @Override // xd2.f1
    public final Object a(long j8, Boolean bool, Long l14, String str, List list, v13.c cVar) throws Throwable {
        x53.c cVar2 = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new w0(this, j8, bool, l14, str, list, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // xd2.f1
    public final Object b(long j8, v13.c cVar) throws Throwable {
        x53.c cVar2 = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new p0(this, j8, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // xd2.f1
    public final Object c(long j8, fe2.a0.b bVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new t0(this, j8, null), bVar);
    }

    @Override // xd2.f1
    public final Object d(long j8, v13.c cVar) {
        Object objA = this.f190390a.f().a(j8, cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // xd2.f1
    public final Object e(be2.g gVar, v13.c cVar) throws Throwable {
        x53.c cVar2 = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new v0(this, gVar, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // xd2.f1
    public final Object f(v13.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new s0(this, null), cVar);
    }

    @Override // xd2.f1
    public final Object g(long j8, s sVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new r0(this, j8, null), sVar);
    }

    @Override // xd2.f1
    public final Object h(be2.f fVar, v13.c cVar) throws Throwable {
        x53.c cVar2 = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new u0(this, fVar, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // xd2.f1
    public final Object i(v13.i iVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new q0(this, null), iVar);
    }

    @Override // xd2.f1
    public final Object j(be2.e eVar, s sVar) {
        Object objC = this.f190390a.f().c(eVar, sVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // xd2.f1
    public final void k(Map<Long, be2.f.a> map) {
        Iterator<Long> it = map.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            be2.f.a aVar = map.get(Long.valueOf(jLongValue));
            if (aVar != null) {
                Boolean bool = aVar.f17759a;
                if (bool != null) {
                    b1.b(b1.a(jLongValue, "KEY_AUTO_START"), bool.booleanValue());
                }
                Boolean bool2 = aVar.f17760b;
                if (bool2 != null) {
                    b1.b(b1.a(jLongValue, "KEY_COURSE_SHARING_ENABLED"), bool2.booleanValue());
                }
                Boolean bool3 = aVar.f17761c;
                if (bool3 != null) {
                    b1.b(b1.a(jLongValue, "KEY_COURSE_SHARING_ENABLED"), bool3.booleanValue());
                }
            }
        }
    }
}
