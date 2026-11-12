package nc;

import androidx.lifecycle.k0;
import f4.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.l2;
import mt0.s1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.h0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc.v f125286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f125287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d4.c f125288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f4.s<lc.v> f125289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k.b f125290e;

        public a(lc.v vVar, k kVar, d4.c cVar, f4.s<lc.v> sVar, k.b bVar) {
            this.f125286a = vVar;
            this.f125287b = kVar;
            this.f125288c = cVar;
            this.f125289d = sVar;
            this.f125290e = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0036  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            if ((num.intValue() & 3) == 2 && mVar2.b()) {
                mVar2.e();
            } else {
                x1 x1Var = p3.n.f135158a;
                lc.v vVar = this.f125286a;
                boolean zR = mVar2.r(vVar);
                k kVar = this.f125287b;
                boolean zR2 = zR | mVar2.r(kVar);
                Object objQ = mVar2.q();
                if (zR2) {
                    objQ = new ls0.h(this.f125289d, 12, vVar, kVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ls0.h(this.f125289d, 12, vVar, kVar);
                        mVar2.K(objQ);
                    }
                }
                l0.a(vVar, (e23.l) objQ, mVar2);
                gl1.d.c(vVar, this.f125288c, z3.f.c(-497631156, new h(this.f125290e, vVar), mVar2), mVar2, 384);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<Set<lc.v>> f125291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f125292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f4.s<lc.v> f125293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x3<? extends Set<lc.v>> x3Var, k kVar, f4.s<lc.v> sVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f125291a = x3Var;
            this.f125292b = kVar;
            this.f125293c = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f125291a, this.f125292b, this.f125293c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            for (lc.v vVar : this.f125291a.getF182175a()) {
                k kVar = this.f125292b;
                if (!((List) kVar.b().f111900e.f150540a.getValue()).contains(vVar) && !this.f125293c.contains(vVar)) {
                    kVar.b().b(vVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nc/j$c", "Lp3/h0;", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc.v f125294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f125295b;

        public c(lc.v vVar, k0 k0Var) {
            this.f125294a = vVar;
            this.f125295b = k0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f125294a.f111888h.f144302j.d(this.f125295b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006e A[SYNTHETIC] */
    public static final void a(k kVar, p3.m mVar, int i14) {
        ArrayList arrayList;
        lc.v vVar;
        boolean zA;
        Object obj;
        o0 o0VarE = mVar.E(294589392);
        if ((((o0VarE.r(kVar) ? 4 : 2) | i14) & 3) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            d4.d dVarA = d4.e.a(o0VarE);
            p1 p1VarC = p0.c(kVar.b().f111900e, o0VarE, 0);
            List list = (List) p1VarC.getF182175a();
            boolean zBooleanValue = ((Boolean) o0VarE.A(l2.f91259a)).booleanValue();
            boolean zB = o0VarE.B(list);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                obj = objQ;
                f4.s sVar = new f4.s();
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    vVar = (lc.v) obj2;
                    if (zBooleanValue) {
                        zA = true;
                    } else {
                        zA = vVar.f111888h.f144302j.f7973d.a(androidx.lifecycle.b0.b.STARTED);
                    }
                    if (zA) {
                        arrayList.add(obj2);
                    }
                }
                sVar.addAll(arrayList);
                o0VarE.K(sVar);
                obj = sVar;
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    obj = objQ;
                    f4.s sVar2 = new f4.s();
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        vVar = (lc.v) obj2;
                        if (zBooleanValue) {
                            zA = true;
                        } else {
                            zA = vVar.f111888h.f144302j.f7973d.a(androidx.lifecycle.b0.b.STARTED);
                        }
                        if (zA) {
                            arrayList.add(obj2);
                        }
                    }
                    sVar2.addAll(arrayList);
                    o0VarE.K(sVar2);
                    obj = sVar2;
                }
            }
            obj = objQ;
            f4.s sVar3 = (f4.s) obj;
            x1 x1Var2 = p3.n.f135158a;
            b(sVar3, (List) p1VarC.getF182175a(), o0VarE, 0);
            p1 p1VarC2 = p0.c(kVar.b().f111901f, o0VarE, 0);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new f4.s();
                o0VarE.K(objQ2);
            }
            f4.s sVar4 = (f4.s) objQ2;
            o0VarE.C(-367418626);
            ListIterator listIterator = sVar3.listIterator();
            while (true) {
                z zVar = (z) listIterator;
                if (!zVar.hasNext()) {
                    break;
                }
                lc.v vVar2 = (lc.v) zVar.next();
                lc.h0 h0Var = vVar2.f111882b;
                h0Var.getClass();
                k.b bVar = (k.b) h0Var;
                boolean zR = o0VarE.r(kVar) | o0VarE.r(vVar2);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new s1(11, kVar, vVar2);
                    o0VarE.K(objQ3);
                }
                p004k6.c.a((e23.a) objQ3, bVar.f125296g, z3.f.c(1129586364, new a(vVar2, kVar, dVarA, sVar4, bVar), o0VarE), o0VarE, 384, 0);
            }
            o0VarE.g0(false);
            Set set = (Set) p1VarC2.getF182175a();
            boolean zB2 = o0VarE.B(p1VarC2) | o0VarE.r(kVar);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == p3.m.a.f135155b) {
                objQ4 = new b(p1VarC2, kVar, sVar4, null);
                o0VarE.K(objQ4);
            }
            l0.f(set, sVar4, (e23.p) objQ4, o0VarE);
            x1 x1Var3 = p3.n.f135158a;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m92.f(kVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    public static final void b(List<lc.v> list, Collection<lc.v> collection, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1537894851);
        int i15 = 4;
        if ((((o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(collection) ? 32 : 16)) & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) o0VarE.A(l2.f91259a)).booleanValue();
            for (lc.v vVar : collection) {
                androidx.lifecycle.o0 o0Var = vVar.f111888h.f144302j;
                boolean zH = o0VarE.h(zBooleanValue) | o0VarE.r(list) | o0VarE.r(vVar);
                Object objQ = o0VarE.q();
                if (zH) {
                    objQ = new ad0.f(vVar, zBooleanValue, list, 14);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ad0.f(vVar, zBooleanValue, list, 14);
                        o0VarE.K(objQ);
                    }
                }
                l0.a(o0Var, (e23.l) objQ, o0VarE);
            }
            x1 x1Var2 = p3.n.f135158a;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(list, collection, i14, i15);
        }
    }
}
