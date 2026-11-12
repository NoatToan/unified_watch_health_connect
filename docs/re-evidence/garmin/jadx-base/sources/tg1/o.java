package tg1;

import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sg1.c f164531a;

        public a(sg1.c cVar) {
            this.f164531a = cVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = p3.n.f135158a;
                sg1.c cVar = this.f164531a;
                String str = cVar.f159203a;
                String str2 = cVar.f159204b;
                g6.f.a aVar = g6.f.f75994b;
                jf.r.b(str, str2, x2.q(h4.r.S, 72), n5.c.a(2131231499, mVar2, 0), n5.c.a(2131231499, mVar2, 0), null, null, null, null, null, null, null, mVar2, 384, 0, 32736);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f164532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sg1.c f164533b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Long, Unit> lVar, sg1.c cVar) {
            this.f164532a = lVar;
            this.f164533b = cVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f164532a.invoke(Long.valueOf(this.f164533b.f159207e));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f164534a = new c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f164535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f164536b;

        public d(e23.l lVar, List list) {
            this.f164535a = lVar;
            this.f164536b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f164535a.invoke(this.f164536b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f164537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f164538b;

        public e(List list, e23.l lVar) {
            this.f164537a = list;
            this.f164538b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0087  */
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
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                sg1.c cVar = (sg1.c) this.f164537a.get(iIntValue);
                mVar2.C(696516679);
                p2 p2Var = p2.f111205a;
                String str = cVar.f159204b;
                String str2 = cVar.f159205c;
                z3.e eVarC = z3.f.c(477440926, new a(cVar), mVar2);
                e23.l lVar = this.f164538b;
                boolean zB = mVar2.B(lVar) | mVar2.r(cVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new b(lVar, cVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b(lVar, cVar);
                        mVar2.K(objQ);
                    }
                }
                p2Var.h(str, str2, null, null, null, false, false, eVarC, null, null, (e23.a) objQ, mVar2, 12582912, 0, 892);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1524731140);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(uVar.c(aVar2, h4.d.a.f81528f), 0.75f);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarF, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_device_backups_no_backups);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(aVar2, aVar3);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarB, eVar2.f97918c);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_device_backups_no_backups_caption);
            h4.r rVarB2 = b0Var.b(aVar2, aVar3);
            bVar2.getClass();
            h4.r rVarY2 = c2.l.y(rVarB2, eVar2.f97918c);
            fVar2.getClass();
            mh.c(strQ2, rVarY2, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    public static final void b(List<sg1.c> list, e23.l<? super Long, Unit> lVar, sg1.d dVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1740441777);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(list) | ((i15 & 112) == 32) | o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new rp.b(list, 21, lVar, dVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rp.b(list, 21, lVar, dVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 511);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h((Object) list, (e23.l) lVar, (Object) dVar, i14, 2);
        }
    }

    public static final void c(sg1.d dVar, e23.l lVar, e23.a aVar, e23.a aVar2, pg1.d dVar2, p3.m mVar, int i14) {
        int i15;
        e23.l lVar2;
        dVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(461631074);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 32 : 16;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(dVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(1558891175, new nw0.l(aVar2, aVar, 13), o0VarE), null, null, null, z3.f.c(1818620331, new n(dVar, dVar2, dVar.f159213c, lVar2, 0), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(dVar, lVar, aVar, aVar2, dVar2, i14);
        }
    }
}
