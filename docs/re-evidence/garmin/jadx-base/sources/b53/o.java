package b53;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n23.p4;
import p005kotlin.Metadata;
import p13.k0;
import p13.y;
import p43.n0;
import p43.q0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lb53/o;", "", "", "Lk23/q;", "Lk23/r;", "substitution", "<init>", "(Ljava/util/Map;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16137b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f16138c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<k23.q, k23.r> f16139a;

    static {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        f16138c = new o(k0Var);
    }

    public o(Map<k23.q, k23.r> map) {
        map.getClass();
        this.f16139a = map;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    public final k23.r a(k23.p pVar) {
        k23.r rVarA;
        k23.p pVarA;
        b53.a f16134c;
        b53.a f16133b;
        pVar.getClass();
        boolean z14 = pVar instanceof b53.a;
        b53.a aVar = z14 ? (b53.a) pVar : null;
        b53.a f16133b2 = aVar != null ? aVar.getF16133b() : null;
        b53.a aVar2 = z14 ? (b53.a) pVar : null;
        b53.a f16134c2 = aVar2 != null ? aVar2.getF16134c() : null;
        boolean z15 = false;
        if (f16133b2 != null && f16134c2 != null) {
            k23.r rVarA2 = a(f16133b2);
            k23.p pVar2 = rVarA2.f102464b;
            b53.a aVar3 = pVar2 instanceof b53.a ? (b53.a) pVar2 : null;
            if (aVar3 != null && (f16133b = aVar3.getF16133b()) != null) {
                rVarA2 = new k23.r(rVarA2.f102463a, f16133b);
            }
            k23.r rVarA3 = a(f16134c2);
            k23.p pVar3 = rVarA3.f102464b;
            b53.a aVar4 = pVar3 instanceof b53.a ? (b53.a) pVar3 : null;
            if (aVar4 != null && (f16134c = aVar4.getF16134c()) != null) {
                rVarA3 = new k23.r(rVarA3.f102463a, f16134c);
            }
            k23.s sVar = rVarA2.f102463a;
            k23.p pVar4 = rVarA2.f102464b;
            pVar4.getClass();
            k23.p pVar5 = rVarA3.f102464b;
            pVar5.getClass();
            if (p4.f122570a) {
                n0 n0Var = ((l) pVar4).f16127b;
                n0Var.getClass();
                n0 n0Var2 = ((l) pVar5).f16127b;
                n0Var2.getClass();
                pVarA = new l(q0.b((v0) n0Var, (v0) n0Var2), null, 2, null);
            } else {
                m.f16132e.getClass();
                pVarA = m.a.a((b53.a) pVar4, (b53.a) pVar5, false, null);
            }
            return new k23.r(sVar, pVarA);
        }
        k23.e f105782a = pVar.getF105782a();
        if (f105782a == null) {
            k23.r.f102461c.getClass();
            return k23.r.a.a(pVar);
        }
        k23.r rVar = this.f16139a.get(f105782a);
        if (rVar == null) {
            k23.r.a aVar5 = k23.r.f102461c;
            if (!pVar.h().isEmpty()) {
                List<k23.r> listH = pVar.h();
                ArrayList arrayList = new ArrayList(y.r(listH, 10));
                Iterator<T> it = listH.iterator();
                while (it.hasNext()) {
                    k23.p pVar6 = ((k23.r) it.next()).f102464b;
                    if (pVar6 != null) {
                        rVarA = a(pVar6);
                    } else {
                        k23.r.f102461c.getClass();
                        rVarA = k23.r.f102462d;
                    }
                    arrayList.add(rVarA);
                }
                boolean f16114d = pVar.getF16114d();
                List<Annotation> annotations = pVar.getAnnotations();
                b53.a aVar6 = z14 ? (b53.a) pVar : null;
                pVar = l23.g.d(f105782a, arrayList, f16114d, annotations, aVar6 != null ? aVar6.e() : null);
            }
            aVar5.getClass();
            return k23.r.a.a(pVar);
        }
        k23.s sVar2 = rVar.f102463a;
        k23.p pVar7 = rVar.f102464b;
        if (pVar7 == null) {
            return rVar;
        }
        t43.i iVar = (t43.i) pVar7;
        u uVar = u.f16150a;
        boolean z16 = pVar.getF16114d() || pVar7.getF16114d();
        uVar.getClass();
        b53.a aVarG = ((b53.a) iVar).G(z16);
        b53.a aVar7 = z14 ? (b53.a) pVar : null;
        if (aVar7 == null || !aVar7.getF16158g()) {
            b53.a aVar8 = iVar instanceof b53.a ? (b53.a) iVar : null;
            if (aVar8 != null && aVar8.getF16158g() && !pVar.getF16114d()) {
                z15 = true;
            }
        } else {
            z15 = true;
        }
        return new k23.r(sVar2, aVarG.F(z15));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb53/o$a;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
