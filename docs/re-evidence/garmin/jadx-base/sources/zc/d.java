package zc;

import kotlin.r0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.c2;
import p3.p0;
import r53.d2;
import r53.i;
import yc.a3;
import yc.b1;
import yc.g3;
import yc.s;
import yc.v2;
import yc.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzc/d;", "", "T", "Lr53/i;", "Lyc/v2;", "flow", "<init>", "(Lr53/i;)V", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<v2<T>> f203904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f203905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f203906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f203907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f203908e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"zc/d$a", "Lyc/a3;", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends a3<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d<T> f203909m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<T> dVar, t13.g gVar, v2<T> v2Var) {
            super(gVar, v2Var);
            this.f203909m = dVar;
        }

        @Override // yc.a3
        public final Object c(z2 z2Var, v13.c cVar) {
            d<T> dVar = this.f203909m;
            dVar.f203907d.setValue(dVar.f203906c.d());
            return Unit.INSTANCE;
        }
    }

    public d(i<v2<T>> iVar) {
        iVar.getClass();
        this.f203904a = iVar;
        r0.f91409k.getClass();
        t13.g gVar = (t13.g) r0.f91410l.getValue();
        this.f203905b = gVar;
        a aVar = new a(this, gVar, iVar instanceof d2 ? (v2) h0.d0(((d2) iVar).a()) : null);
        this.f203906c = aVar;
        this.f203907d = p0.n(aVar.d());
        s sVar = (s) aVar.f195746k.f150540a.getValue();
        if (sVar == null) {
            b1 b1Var = g.f203920a;
            sVar = new s(b1Var.f195769a, b1Var.f195770b, b1Var.f195771c, b1Var, null, 16, null);
        }
        this.f203908e = p0.n(sVar);
    }

    public final T a(int i14) {
        this.f203906c.b(i14);
        return c().get(i14);
    }

    public final int b() {
        return c().getF168272d();
    }

    public final yc.r0<T> c() {
        return (yc.r0) this.f203907d.getF182175a();
    }

    public final s d() {
        return (s) this.f203908e.getF182175a();
    }

    public final void e() {
        a aVar = this.f203906c;
        aVar.getClass();
        g3.f195987a.getClass();
        g3.a(3);
        aVar.f195738c.a();
    }

    public final void f() {
        a aVar = this.f203906c;
        aVar.getClass();
        g3.f195987a.getClass();
        g3.a(3);
        aVar.f195738c.retry();
    }
}
