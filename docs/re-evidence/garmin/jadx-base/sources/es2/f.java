package es2;

import androidx.room.b0;
import androidx.room.g;
import androidx.room.g0;
import androidx.room.p0;
import cf.x;
import cq.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Les2/f;", "Les2/a;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements es2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f65227d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f65228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f65229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs2.a f65230c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"es2/f$a", "Landroidx/room/g;", "Lfs2/a;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g<fs2.a> {
        public a() {
        }

        @Override // androidx.room.g
        public final void a(ud.c cVar, fs2.a aVar) {
            fs2.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            cVar.q3(1, aVar2.f73426a);
            is2.b bVar = aVar2.f73427b;
            gs2.a aVar3 = f.this.f65230c;
            aVar3.getClass();
            String strName = bVar != null ? bVar.name() : null;
            if (strName == null) {
                cVar.u(2);
            } else {
                cVar.q3(2, strName);
            }
            qs2.a aVar4 = aVar2.f73428c;
            aVar3.getClass();
            String strName2 = aVar4 != null ? aVar4.name() : null;
            if (strName2 == null) {
                cVar.u(3);
            } else {
                cVar.q3(3, strName2);
            }
            cVar.q3(4, aVar2.f73429d);
            cVar.h(5, aVar2.f73430e);
            cVar.h(6, aVar2.f73431f);
            qs2.g gVar = aVar2.f73432g;
            String strName3 = gVar != null ? gVar.name() : null;
            if (strName3 == null) {
                cVar.u(7);
            } else {
                cVar.q3(7, strName3);
            }
            qs2.f fVar = aVar2.f73433h;
            String strName4 = fVar != null ? fVar.name() : null;
            if (strName4 == null) {
                cVar.u(8);
            } else {
                cVar.q3(8, strName4);
            }
            cVar.q3(9, aVar2.f73434i);
            cVar.q3(10, aVar2.f73435j);
            cVar.h(11, aVar2.f73436k);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `wallet_items` (`item_id`,`provider_type`,`business_operator`,`display_name`,`id`,`unit_id`,`type`,`status`,`provider_specific_id`,`json_string`,`last_update_time`) VALUES (?,?,?,?,nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    public f(b0 b0Var) {
        b0Var.getClass();
        this.f65230c = new gs2.a();
        this.f65228a = b0Var;
        this.f65229b = new a();
    }

    @Override // es2.a
    public final g0 a(String str) {
        str.getClass();
        return this.f65228a.getInvalidationTracker().b(new String[]{"wallet_items"}, false, new c(str, this, 0));
    }

    @Override // es2.a
    public final List<fs2.a> b(long j8) {
        return (List) gl1.d.O(this.f65228a, true, false, new es2.b(j8, this, 1));
    }

    @Override // es2.a
    public final void c(long j8, String str) {
        str.getClass();
        gl1.d.O(this.f65228a, false, true, new x(j8, str, 3));
    }

    @Override // es2.a
    public final void d(fs2.a aVar) {
        gl1.d.O(this.f65228a, false, true, new e52.b(3, this, aVar));
    }

    @Override // es2.a
    public final void deleteAll() {
        gl1.d.O(this.f65228a, false, true, new ep0.a(8));
    }

    @Override // es2.a
    public final q03.g e(long j8, String str) {
        str.getClass();
        p0.a aVar = p0.f10917a;
        d dVar = new d(j8, str, this, 0);
        aVar.getClass();
        b0 b0Var = this.f65228a;
        b0Var.getClass();
        return p0.a.a(b0Var, new String[]{"wallet_items"}, dVar).h(q03.a.LATEST);
    }

    @Override // es2.a
    public final g0 f() {
        return this.f65228a.getInvalidationTracker().b(new String[]{"wallet_items"}, false, new e(this, 0));
    }

    @Override // es2.a
    public final void g(long j8) {
        gl1.d.O(this.f65228a, false, true, new a02.a(j8, 17));
    }

    @Override // es2.a
    public final List<fs2.a> h() {
        return (List) gl1.d.O(this.f65228a, true, false, new e(this, 1));
    }

    @Override // es2.a
    public final fs2.a i(long j8, String str) {
        str.getClass();
        return (fs2.a) gl1.d.O(this.f65228a, true, false, new d(str, j8, this));
    }

    @Override // es2.a
    public final List j(long j8, String str) {
        str.getClass();
        return (List) gl1.d.O(this.f65228a, true, false, new d(j8, str, this, 1));
    }

    @Override // es2.a
    public final List<fs2.a> k(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f65228a, true, false, new c(str, this, 2));
    }

    @Override // es2.a
    public final g0 l(long j8) {
        return this.f65228a.getInvalidationTracker().b(new String[]{"wallet_items"}, false, new es2.b(j8, this, 0));
    }

    @Override // es2.a
    public final List<fs2.a> m(String str) {
        str.getClass();
        return (List) gl1.d.O(this.f65228a, true, false, new c(str, this, 1));
    }

    @Override // es2.a
    public final void n(String str) {
        str.getClass();
        gl1.d.O(this.f65228a, false, true, new t(str, 21));
    }

    @Override // es2.a
    public final void o(long j8, String str) {
        str.getClass();
        gl1.d.O(this.f65228a, false, true, new x(str, j8));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Les2/f$b;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
