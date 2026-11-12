package kz0;

import androidx.room.b0;
import androidx.room.g;
import hz0.a0;
import hz0.r;
import kn1.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkz0/b;", "Lkz0/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements kz0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2069b f107780b = new C2069b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f107781a;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kz0/b$a", "Landroidx/room/g;", "Llz0/a;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<lz0.a> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, lz0.a aVar) {
            lz0.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            cVar.h(1, aVar2.f115392a);
            cVar.h(2, aVar2.f115393b ? 1L : 0L);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `edited_connections` (`profilePk`,`disconnected`) VALUES (?,?)";
        }
    }

    public b(b0 b0Var) {
        b0Var.getClass();
        this.f107781a = b0Var;
        new a();
    }

    @Override // kz0.a
    public final Object a(a0 a0Var) throws Throwable {
        Object objQ = gl1.d.Q(this.f107781a, false, true, new m(15), a0Var);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : Unit.INSTANCE;
    }

    @Override // kz0.a
    public final Object b(int i14, r rVar) {
        return gl1.d.Q(this.f107781a, true, false, new cf.a0(i14, 5), rVar);
    }

    /* JADX INFO: renamed from: kz0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkz0/b$b;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2069b {
        public /* synthetic */ C2069b(j jVar) {
            this();
        }

        private C2069b() {
        }
    }
}
