package n82;

import b63.o;
import b63.z;
import h2.j0;
import j23.t;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln82/f;", "", "Lm82/f;", "pagerState", "Ln82/b;", "pagerConfig", "Ln82/g;", "cache", "<init>", "(Lm82/f;Ln82/b;Ln82/g;)V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m82.f f124960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f124961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f124962c;

    public f(m82.f fVar, b bVar, g gVar) {
        fVar.getClass();
        bVar.getClass();
        this.f124960a = fVar;
        this.f124961b = bVar;
        this.f124962c = gVar;
    }

    public final Object a(o oVar, v13.c cVar) {
        b bVar = this.f124961b;
        o82.g gVarA = bVar.a();
        oVar.getClass();
        gVarA.getClass();
        g gVar = this.f124962c;
        if (gVar != null) {
            gVar.f124966a.put(gVarA, oVar);
        }
        int iA = bVar.f124952e.a(oVar);
        j0 j0Var = this.f124960a.f117196a;
        if (iA < 0) {
            iA = 0;
        }
        Object objG = j0.g(j0Var, iA, null, cVar, 6);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objG != aVar) {
            objG = Unit.INSTANCE;
        }
        return objG == aVar ? objG : Unit.INSTANCE;
    }

    public final o82.a b() {
        e eVar = this.f124961b.f124952e;
        return eVar.f124959b.a(eVar.f124958a, this.f124960a.f117196a.l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c() {
        b bVar = this.f124961b;
        e eVar = bVar.f124952e;
        o oVar = ((o82.a) bVar.f124950c.getF182175a()).f130844b;
        g gVar = this.f124962c;
        if (gVar != null) {
            o82.g gVarA = bVar.a();
            gVarA.getClass();
            oVar.getClass();
            Map<o82.g, o> map = gVar.f124966a;
            o oVar2 = map.get(gVarA);
            if (oVar2 == null) {
                map.put(gVarA, oVar);
            } else {
                oVar = oVar2;
            }
            oVar = oVar;
        }
        return eVar.a(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(o82.g gVar) {
        gVar.getClass();
        b bVar = this.f124961b;
        bVar.f124948a.setValue(gVar);
        c2 c2Var = bVar.f124949b;
        o oVar = ((o82.a) c2Var.getF182175a()).f130844b;
        o82.a aVar = new o82.a(bVar.a().f130862a.f(((o82.a) c2Var.getF182175a()).f130843a, oVar), oVar);
        c2 c2Var2 = bVar.f124950c;
        c2Var2.setValue(aVar);
        bVar.f124952e = new e(((o82.a) c2Var2.getF182175a()).f130843a, bVar.a().f130862a);
        bVar.f124951d.t(t.e((int) bVar.a().f130862a.e(((o82.a) c2Var2.getF182175a()).f130843a, ((o82.a) c2Var2.getF182175a()).f130844b), 1, Integer.MAX_VALUE));
        int iC = c();
        j0 j0Var = this.f124960a.f117196a;
        if (iC < 0) {
            iC = 0;
        }
        j0.u(j0Var, iC);
    }

    public final void e(o82.g gVar, o oVar) {
        gVar.getClass();
        oVar.getClass();
        g gVar2 = this.f124962c;
        if (gVar2 != null) {
            gVar2.f124966a.put(gVar, oVar);
        }
        d(gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        f fVar = (f) obj;
        if (this.f124960a.equals(fVar.f124960a) && this.f124961b.equals(fVar.f124961b)) {
            return s.g(this.f124962c, fVar.f124962c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(o82.a aVar) {
        b bVar = this.f124961b;
        c2 c2Var = bVar.f124949b;
        c2Var.setValue(aVar);
        o oVar = ((o82.a) c2Var.getF182175a()).f130844b;
        o82.a aVar2 = new o82.a(bVar.a().f130862a.f(((o82.a) c2Var.getF182175a()).f130843a, oVar), oVar);
        c2 c2Var2 = bVar.f124950c;
        c2Var2.setValue(aVar2);
        bVar.f124952e = new e(((o82.a) c2Var2.getF182175a()).f130843a, bVar.a().f130862a);
        bVar.f124951d.t(t.e((int) bVar.a().f130862a.e(((o82.a) c2Var2.getF182175a()).f130843a, ((o82.a) c2Var2.getF182175a()).f130844b), 1, Integer.MAX_VALUE));
        int iC = c();
        j0 j0Var = this.f124960a.f117196a;
        if (iC < 0) {
            iC = 0;
        }
        j0.u(j0Var, iC);
    }

    public final int hashCode() {
        int iHashCode = (this.f124961b.hashCode() + (this.f124960a.f117196a.hashCode() * 31)) * 31;
        g gVar = this.f124962c;
        return iHashCode + (gVar != null ? gVar.f124966a.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln82/f$a;", "", "Lo82/g;", "initialIntervalType", "Lo82/a;", "initialPagerInterval", "Lb63/o;", "initialIntervalTypeDate", "<init>", "(Lo82/g;Lo82/a;Lb63/o;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o82.g f124963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o82.a f124964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f124965c;

        public a(o82.g gVar, o82.a aVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
            gVar = (i14 & 1) != 0 ? o82.g.f130850c : gVar;
            if ((i14 & 2) != 0) {
                o.INSTANCE.getClass();
                o oVarA = o.Companion.a(0);
                b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
                z.INSTANCE.getClass();
                aVar = new o82.a(oVarA, b63.b.f(c0229a, z.Companion.a()));
            }
            this(gVar, aVar, (i14 & 4) != 0 ? aVar.f130844b : oVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f124963a == aVar.f124963a && s.g(this.f124964b, aVar.f124964b) && s.g(this.f124965c, aVar.f124965c);
        }

        public final int hashCode() {
            return this.f124965c.f16206a.hashCode() + ((this.f124964b.hashCode() + (this.f124963a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "InitialValues(initialIntervalType=" + this.f124963a + ", initialPagerInterval=" + this.f124964b + ", initialIntervalTypeDate=" + this.f124965c + ")";
        }

        public a(o82.g gVar, o82.a aVar, o oVar) {
            gVar.getClass();
            aVar.getClass();
            oVar.getClass();
            this.f124963a = gVar;
            this.f124964b = aVar;
            this.f124965c = oVar;
        }

        public a() {
            this(null, null, null, 7, null);
        }
    }
}
