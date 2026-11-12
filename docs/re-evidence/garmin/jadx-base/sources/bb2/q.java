package bb2;

import androidx.room.b0;
import androidx.room.p0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbb2/q;", "Lbb2/p;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f17382c = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f17383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17384b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/q$a", "Landroidx/room/g;", "Lbb2/r;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.room.g<r> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, r rVar) {
            r rVar2 = rVar;
            cVar.getClass();
            rVar2.getClass();
            String str = rVar2.f17385a;
            str.getClass();
            cVar.q3(1, str);
            String str2 = rVar2.f17386b;
            if (str2 == null) {
                cVar.u(2);
            } else {
                cVar.q3(2, str2);
            }
            cVar.h(3, rVar2.f17387c);
            cVar.h(4, rVar2.f17388d);
            cVar.h(5, rVar2.f17389e);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `response_cache` (`requestUrl`,`response`,`lastUpdate`,`maxAge`,`maxStale`) VALUES (?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"bb2/q$b", "Landroidx/room/e;", "Lbb2/r;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.room.e<r> {
        @Override // androidx.room.e
        public final void a(ud.c cVar, r rVar) {
            r rVar2 = rVar;
            cVar.getClass();
            rVar2.getClass();
            String str = rVar2.f17385a;
            str.getClass();
            cVar.q3(1, str);
        }

        @Override // androidx.room.e
        public final String b() {
            return "DELETE FROM `response_cache` WHERE `requestUrl` = ?";
        }
    }

    public q(b0 b0Var) {
        b0Var.getClass();
        this.f17383a = b0Var;
        this.f17384b = new a();
        new b();
    }

    @Override // bb2.p
    public final void a(String str) {
        gl1.d.O(this.f17383a, false, true, new defpackage.b(str, 20));
    }

    @Override // bb2.p
    public final void b() {
        gl1.d.O(this.f17383a, false, true, new b71.o(13));
    }

    @Override // bb2.p
    public final r c(String str) {
        str.getClass();
        return (r) gl1.d.O(this.f17383a, true, false, new defpackage.b(str, 18));
    }

    @Override // bb2.p
    public final jd.g d(String str) {
        str.getClass();
        defpackage.b bVar = new defpackage.b(str, 22);
        return gl.b.n(this.f17383a, false, new String[]{"response_cache"}, bVar);
    }

    @Override // bb2.p
    public final d13.c e(String str) {
        str.getClass();
        p0.a aVar = p0.f10917a;
        defpackage.b bVar = new defpackage.b(str, 21);
        aVar.getClass();
        return p0.a.a(this.f17383a, new String[]{"response_cache"}, bVar);
    }

    @Override // bb2.p
    public final r f(String str) {
        str.getClass();
        return (r) gl1.d.O(this.f17383a, true, false, new defpackage.b(str, 19));
    }

    @Override // bb2.p
    public final void g(r rVar) {
        gl1.d.O(this.f17383a, false, true, new a42.i(27, this, rVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb2/q$c;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
