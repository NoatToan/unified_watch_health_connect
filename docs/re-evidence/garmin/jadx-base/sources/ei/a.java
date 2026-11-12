package ei;

import com.apollographql.apollo3.exception.CacheMissException;
import p005kotlin.Metadata;
import r53.c2;
import vh.e0;
import vh.g0;
import vh.n0;
import vh.s0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lei/a;", "Lki/a;", "Lbi/a;", "store", "<init>", "(Lbi/a;)V", "a", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements ki.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1358a f64079b = new C1358a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bi.a f64080a;

    public a(bi.a aVar) {
        aVar.getClass();
        this.f64080a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(a aVar, vh.e eVar, z zVar, v13.c cVar) {
        e eVar2;
        vh.e eVar3;
        n0 n0Var;
        CacheMissException e4;
        long j8;
        g0 g0Var;
        bi.e eVar4;
        boolean z14;
        aVar.getClass();
        if (cVar instanceof e) {
            eVar2 = (e) cVar;
            int i14 = eVar2.f64101f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar2.f64101f = i14 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(aVar, cVar);
            }
        } else {
            eVar2 = new e(aVar, cVar);
        }
        Object obj = eVar2.f64099d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f64101f;
        if (i15 == 0) {
            o13.r.b(obj);
            n0 n0Var2 = eVar.f178288a;
            int i16 = mi.a.f118679a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                bi.a aVar3 = aVar.f64080a;
                bi.b bVar = (bi.b) eVar.f178290c.b(bi.b.f17921c);
                ci.a aVar4 = bVar != null ? bVar.f17922b : ci.a.f27591c;
                eVar2.f64096a = eVar;
                eVar2.f64097b = n0Var2;
                eVar2.f64098c = jCurrentTimeMillis;
                eVar2.f64101f = 1;
                Object objC = aVar3.c(n0Var2, zVar, aVar4);
                if (objC == aVar2) {
                    return aVar2;
                }
                eVar3 = eVar;
                n0Var = n0Var2;
                obj = objC;
                j8 = jCurrentTimeMillis;
            } catch (CacheMissException e14) {
                eVar3 = eVar;
                n0Var = n0Var2;
                e4 = e14;
                j8 = jCurrentTimeMillis;
                eVar3.getClass();
                g0Var = eVar3.f178290c;
                eVar4 = (bi.e) g0Var.b(bi.e.f17939c);
                if (eVar4 != null) {
                    z14 = eVar4.f17940b;
                } else {
                    z14 = false;
                }
                if (z14) {
                    throw e4;
                }
                vh.f.a aVar5 = new vh.f.a(n0Var, eVar3.f178289b, null);
                aVar5.a(g0Var);
                bi.c.a aVar6 = new bi.c.a();
                aVar6.f17930a = j8;
                int i17 = mi.a.f118679a;
                aVar6.f17931b = System.currentTimeMillis();
                aVar6.f17934e = false;
                aVar6.f17935f = e4;
                aVar5.a(aVar6.a());
                aVar5.f178320g = true;
                return aVar5.b();
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = eVar2.f64098c;
            n0Var = eVar2.f64097b;
            eVar3 = eVar2.f64096a;
            try {
                o13.r.b(obj);
            } catch (CacheMissException e15) {
                e4 = e15;
                eVar3.getClass();
                g0Var = eVar3.f178290c;
                eVar4 = (bi.e) g0Var.b(bi.e.f17939c);
                if (eVar4 != null) {
                    z14 = eVar4.f17940b;
                } else {
                    z14 = false;
                }
                if (z14) {
                    throw e4;
                }
                vh.f.a aVar7 = new vh.f.a(n0Var, eVar3.f178289b, null);
                aVar7.a(g0Var);
                bi.c.a aVar8 = new bi.c.a();
                aVar8.f17930a = j8;
                int i18 = mi.a.f118679a;
                aVar8.f17931b = System.currentTimeMillis();
                aVar8.f17934e = false;
                aVar8.f17935f = e4;
                aVar7.a(aVar8.a());
                aVar7.f178320g = true;
                return aVar7.b();
            }
        }
        vh.f.a aVar9 = new vh.f.a(n0Var, eVar3.f178289b, (s0.a) obj);
        aVar9.a(eVar3.f178290c);
        bi.c.a aVar10 = new bi.c.a();
        aVar10.f17930a = j8;
        int i19 = mi.a.f118679a;
        aVar10.f17931b = System.currentTimeMillis();
        aVar10.f17934e = true;
        aVar9.a(aVar10.a());
        aVar9.f178320g = true;
        return aVar9.b();
    }

    @Override // ki.a
    public final r53.i a(vh.e eVar, ki.c cVar) {
        eVar.getClass();
        g0 g0Var = eVar.f178290c;
        e0 e0Var = eVar.f178288a;
        if (!(e0Var instanceof s0)) {
            ds.e0.t(e0Var, "Unknown operation ");
            return null;
        }
        g0.b bVarB = g0Var.b(z.f178396e);
        bVarB.getClass();
        z zVar = (z) bVarB;
        bi.f fVar = (bi.f) g0Var.b(bi.f.f17941c);
        c2 c2Var = new c2(new b(fVar != null ? fVar.f17942b : false, this, eVar, zVar, cVar, null));
        g0.b bVarB2 = g0Var.b(uh.c.f171122d);
        bVarB2.getClass();
        return r53.s.A(c2Var, ((uh.c) bVarB2).f171123b);
    }

    /* JADX INFO: renamed from: ei.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lei/a$a;", "", "<init>", "()V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class C1358a {
        public /* synthetic */ C1358a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1358a() {
        }
    }
}
