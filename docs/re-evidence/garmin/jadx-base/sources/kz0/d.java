package kz0;

import androidx.room.b0;
import androidx.room.g;
import fo1.v0;
import hz0.s;
import hz0.z;
import kn1.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkz0/d;", "Lkz0/c;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f107782c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f107783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f107784b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kz0/d$a", "Landroidx/room/g;", "Llz0/b;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<lz0.b> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, lz0.b bVar) {
            lz0.b bVar2 = bVar;
            cVar.getClass();
            bVar2.getClass();
            cVar.h(1, bVar2.f115394a);
            cVar.h(2, bVar2.f115395b);
            cVar.h(3, bVar2.f115396c ? 1L : 0L);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `edited_posts` (`activityId`,`local_timestamp`,`deleted`) VALUES (?,?,?)";
        }
    }

    public d(b0 b0Var) {
        b0Var.getClass();
        this.f107783a = b0Var;
        this.f107784b = new a();
    }

    @Override // kz0.c
    public final Object a(lz0.b bVar, v13.c cVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f107783a, false, true, new jt1.d(21, this, bVar), cVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // kz0.c
    public final Object b(i iVar) throws Throwable {
        Object objQ = gl1.d.Q(this.f107783a, false, true, new m(16), iVar);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // kz0.c
    public final Object c(long j8, s sVar) {
        return gl1.d.Q(this.f107783a, true, false, new j82.d(j8, 5), sVar);
    }

    @Override // kz0.c
    public final Object d(z zVar) {
        return gl1.d.Q(this.f107783a, true, false, new m(17), zVar);
    }

    @Override // kz0.c
    public final Object e(long j8, v0 v0Var) {
        return gl1.d.Q(this.f107783a, true, false, new j82.d(j8, 6), v0Var);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkz0/d$b;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
