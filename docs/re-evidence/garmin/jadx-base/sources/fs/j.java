package fs;

import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.p;
import e23.r;
import et1.b2;
import f21.a0;
import f5.z0;
import gl1.y;
import h4.k;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.ua;
import java.util.List;
import l72.w;
import o53.b0;
import o53.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<u0> f73403a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.a<? extends u0> aVar) {
            this.f73403a = aVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f73403a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f73404a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f73405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f73406b;

        public c(l lVar, List list) {
            this.f73405a = lVar;
            this.f73406b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f73405a.invoke(this.f73406b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f73407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f73408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f73409c;

        public d(List list, l lVar, e23.a aVar) {
            this.f73407a = list;
            this.f73408b = lVar;
            this.f73409c = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            int i14 = (iIntValue2 & 6) == 0 ? (mVar2.B(dVar2) ? 4 : 2) | iIntValue2 : iIntValue2;
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                List list = (List) this.f73407a.get(iIntValue);
                mVar2.C(-263229277);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC = k.c(rVarF, mVar2);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                u2 u2Var = u2.f22900a;
                mVar2.C(-1958652563);
                for (int i15 = 0; i15 < 4; i15++) {
                    if (i15 < list.size()) {
                        mVar2.C(-588624439);
                        h4.r rVarA = u2Var.a(h4.r.S, 1.0f, true);
                        fs.e eVar = (fs.e) list.get(i15);
                        e23.a aVar2 = this.f73409c;
                        boolean zB = mVar2.B(aVar2);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new a(aVar2);
                            mVar2.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new a(aVar2);
                                mVar2.K(objQ);
                            }
                        }
                        j.b(rVarA, eVar, this.f73408b, (e23.a) objQ, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-588410508);
                        q.a(c2.l.g(u2Var.a(h4.r.S, 1.0f, true), 1.0f), mVar2, 0);
                        mVar2.f();
                    }
                }
                mVar2.f();
                mVar2.y();
                mVar2.f();
                x1 x1Var2 = n.f135158a;
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.stickers.StickersBottomSheetKt$StickerBottomSheet$onDismiss$1$1$1", f = "StickersBottomSheet.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f73411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f73411b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f73411b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73410a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f73410a = 1;
                if (this.f73411b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73412a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73412a = iArr;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(g3<? extends List<fs.e>> g3Var, l<? super Boolean, Unit> lVar, l<? super fs.e, Unit> lVar2, m mVar, int i14) {
        int i15;
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-214015037);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(g3Var) : o0VarE.r(g3Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i15 & 112) == 32);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new h(b0Var, mcVarF, lVar);
                o0VarE.K(objQ3);
            }
            e23.a aVar = (e23.a) objQ3;
            w wVar = w.f111301a;
            String strQ = y.Q(o0VarE, R.string.social_photo_sharing_stickers);
            z3.e eVarC = z3.f.c(-684726750, new cq0.p(aVar, 21), o0VarE);
            boolean zB = o0VarE.B(aVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new eu.a(aVar, 18);
                o0VarE.K(objQ4);
            }
            wVar.f(strQ, null, null, eVarC, (e23.a) objQ4, mcVarF, false, null, z3.f.c(1389318988, new fb0.b(g3Var, lVar2, aVar, p1Var), o0VarE), o0VarE, 805309440, 454);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(g3Var, lVar, lVar2, i14, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, fs.e eVar, l lVar, e23.a aVar, m mVar, int i14) {
        p1 p1Var;
        boolean z14;
        eVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(2010693346);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            h4.r rVarG = c2.l.g(rVar, 1.0f);
            boolean zR = ((i15 & 7168) == 2048) | ((i15 & 896) == 256) | o0VarE.r(eVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new fk0.a(lVar, 4, eVar, aVar);
                o0VarE.K(objQ2);
            }
            h4.r rVarD = u1.w.d(rVarG, false, null, null, (e23.a) objQ2, 15);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-2021990813);
                p1Var = p1Var2;
                z14 = true;
                ua.a(0.0f, 0.0f, 0, 0, 60, hb.a.d(d92.b.f58623a, o0VarE), 0L, uVar.c(h4.r.S, h4.d.a.f81528f), o0VarE);
                o0VarE.g0(false);
            } else {
                p1Var = p1Var2;
                z14 = true;
                o0VarE.C(-2021803418);
                o0VarE.g0(false);
            }
            String str = eVar.f73382c.get(eVar.f73381b).f73394b;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new b2(p1Var, 16);
                o0VarE.K(objQ3);
            }
            jf.r.b(str, null, null, null, null, null, null, (l) objQ3, null, null, null, null, o0VarE, 12582960, 0, 32636);
            o0VarE = o0VarE;
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i(rVar, eVar, lVar, aVar, i14);
        }
    }
}
