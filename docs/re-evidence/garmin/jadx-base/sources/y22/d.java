package y22;

import android.net.Uri;
import c2.b0;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f2.r0;
import f5.z0;
import h5.e0;
import i3.h7;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.f0;
import l72.v2;
import lc.u0;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import s5.x0;
import v62.k6;
import v62.m6;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<c2.t, Boolean, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f194244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<x, Unit> f194245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i53.c<x> f194246c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x xVar, e23.l<? super x, Unit> lVar, i53.c<x> cVar) {
            this.f194244a = xVar;
            this.f194245b = lVar;
            this.f194246c = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x01c0  */
        @Override // e23.r
        public final Unit invoke(c2.t tVar, Boolean bool, p3.m mVar, Integer num) {
            bool.getClass();
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            tVar.getClass();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.r.a aVar = h4.r.S;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(aVar, mVar2);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA, mVar2);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, mVar2);
                b0 b0Var = b0.f22601a;
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode2 = Long.hashCode(mVar2.getU());
                i2 i2VarX2 = mVar2.x();
                h4.r rVarC2 = h4.k.c(aVar, mVar2);
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                b4.c(eVar2, z0VarD, mVar2);
                b4.c(c1623g, i2VarX2, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar2);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarG = c2.l.g(x2.f(aVar, 1.0f), 1.0f);
                x xVar = this.f194244a;
                boolean z14 = xVar.f194331c;
                h4.r rVarA = v2.a(v2.a(rVarG, z14, y22.a.f194240a, mVar2, 6), z14, y22.b.f194241a, mVar2, 0);
                Uri uri = xVar.f194329a;
                f5.k.f68985a.getClass();
                jf.r.a(uri, null, rVarA, null, null, f5.k.a.f68987b, null, mVar2, 1572912, 1976);
                if (z14) {
                    mVar2.C(555296558);
                    i7.a(n5.c.a(R.drawable.ic_exclamation, mVar2, 0), gl1.y.Q(mVar2, R.string.social_group_upload_failed), u1.n.e(l4.k.b(x2.q(uVar.c(aVar, h4.d.a.f81528f), j92.b.f97901d.f97905d), k2.i.f102406a), d92.b.a(mVar2).e().h(), m1.f128891a), 0L, mVar2, 0, 8);
                    mVar2.f();
                } else {
                    mVar2.C(555950255);
                    mVar2.f();
                }
                h4.r rVarC3 = uVar.c(aVar, h4.d.a.f81526d);
                float f15 = eVar.f97918c;
                h4.r rVarC4 = c2.l.C(rVarC3, 0.0f, f15, f15, 0.0f, 9);
                j92.c cVar = j92.b.f97901d;
                h4.r rVarQ = x2.q(rVarC4, cVar.f97905d);
                e23.l<x, Unit> lVar = this.f194245b;
                boolean zB = mVar2.B(lVar) | mVar2.r(xVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new y22.c(lVar, xVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y22.c(lVar, xVar);
                        mVar2.K(objQ);
                    }
                }
                g.f194254a.getClass();
                h7.a((e23.a) objQ, rVarQ, false, null, null, g.f194255b, mVar2, 1572864, 60);
                if (this.f194246c.size() > 1) {
                    mVar2.C(557304211);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.h7.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_reorder);
                    long jF = u0.f(mVar2);
                    h4.r rVarC5 = uVar.c(aVar, h4.d.a.f81530h);
                    float f16 = eVar.f97918c;
                    i7.b(dVarA, strQ, c2.l.y(u1.n.e(x2.q(c2.l.C(rVarC5, f16, 0.0f, 0.0f, f16, 6), cVar.f97905d), d92.b.a(mVar2).e().d(), k2.i.f102406a), eVar.f97917b), jF, mVar2, 0, 0);
                    mVar2.f();
                } else {
                    mVar2.C(558168367);
                    mVar2.f();
                }
                mVar2.y();
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f194247a;

        public b(List list) {
            this.f194247a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f194247a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.r<f2.r, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f194248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k02.d f194249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f194250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i53.c f194251d;

        public c(List list, k02.d dVar, e23.l lVar, i53.c cVar) {
            this.f194248a = list;
            this.f194249b = dVar;
            this.f194250c = lVar;
            this.f194251d = cVar;
        }

        @Override // e23.r
        public final Unit invoke(f2.r rVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            f2.r rVar2 = rVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(rVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                x xVar = (x) this.f194248a.get(iIntValue);
                mVar2.C(-455107311);
                k02.b.a(rVar2, this.f194249b, iIntValue, h4.r.S, z3.f.c(937302871, new a(xVar, this.f194250c, this.f194251d), mVar2), mVar2, (i14 & 14) | 27712 | (((i14 & 126) << 3) & 896));
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0294  */
    /* JADX WARN: Code duplicated, block: B:103:0x0296  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:120:0x0326  */
    /* JADX WARN: Code duplicated, block: B:121:0x0328  */
    /* JADX WARN: Code duplicated, block: B:127:0x033a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0377  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:149:0x0406  */
    /* JADX WARN: Code duplicated, block: B:151:0x040a  */
    /* JADX WARN: Code duplicated, block: B:152:0x040d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0416 A[PHI: r42
      0x0416: PHI (r42v2 p3.m$a$a) = (r42v1 p3.m$a$a), (r42v5 p3.m$a$a) binds: [B:148:0x0404, B:151:0x040a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0457  */
    /* JADX WARN: Code duplicated, block: B:157:0x0459  */
    /* JADX WARN: Code duplicated, block: B:163:0x046e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0495  */
    /* JADX WARN: Code duplicated, block: B:167:0x0498  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:176:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:182:0x051d  */
    /* JADX WARN: Code duplicated, block: B:184:0x059c  */
    /* JADX WARN: Code duplicated, block: B:188:0x063a  */
    /* JADX WARN: Code duplicated, block: B:190:0x063e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[LOOP:0: B:168:0x049c->B:201:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x0176  */
    /* JADX WARN: Code duplicated, block: B:89:0x024d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0254  */
    /* JADX WARN: Code duplicated, block: B:92:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(String str, i53.c<x> cVar, int i14, e23.l<? super List<x>, Unit> lVar, e23.p<? super Integer, ? super Integer, Unit> pVar, e23.l<? super x, Unit> lVar2, p3.m mVar, int i15) {
        int i16;
        e23.l<? super x, Unit> lVar3;
        p3.m.a.C2565a c2565a;
        h5.g.a.f fVar;
        b0 b0Var;
        int i17;
        j92.b bVar;
        float f14;
        float f15;
        p3.m.a.C2565a c2565a2;
        int i18;
        o0 o0Var;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        float f16;
        boolean z14;
        int i19;
        Throwable th3;
        i53.c<x> cVar2;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        int i24;
        boolean z15;
        boolean zB;
        Object objQ;
        Object kVar;
        p1 p1Var;
        o0 o0Var2;
        boolean z16;
        boolean z17;
        boolean zB2;
        Object objQ2;
        o0 o0Var3;
        Iterator<x> it;
        j92.b bVar2;
        h4.r.a aVar;
        s2 s2VarA2;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        e0.a aVar2;
        h5.g.a.b bVar3;
        p3.m.a.C2565a c2565a3;
        boolean z18;
        Object objQ3;
        k02.d dVarV;
        boolean z19;
        boolean zR;
        Object objQ4;
        boolean z24;
        boolean z25;
        Object objQ5;
        int i25 = i14;
        str.getClass();
        cVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1645715422);
        p3.c<?> cVar3 = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i25) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ6 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a4 = p3.m.a.f135155b;
            if (objQ6 == c2565a4) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var2 = (p1) objQ6;
            int size = i25 - cVar.size();
            int i26 = i16 & 7168;
            boolean z26 = i26 == 2048;
            Object objQ7 = o0VarE.q();
            if (z26 || objQ7 == c2565a4) {
                objQ7 = new wr1.d(lVar, 6);
                o0VarE.K(objQ7);
            }
            e23.a aVarF = e.f((e23.l) objQ7, o0VarE, size, 0);
            boolean z27 = i26 == 2048;
            Object objQ8 = o0VarE.q();
            if (z27 || objQ8 == c2565a4) {
                objQ8 = new wr1.d(lVar, 7);
                o0VarE.K(objQ8);
            }
            ug2.k kVarE = e.e((e23.l) objQ8, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar2, aVar4, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA3, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                c2565a = c2565a4;
            } else {
                c2565a = c2565a4;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                b0Var = b0.f22601a;
                if (i25 > 1) {
                    i17 = R.string.title_photos;
                } else {
                    i17 = R.string.social_photo;
                }
                String upperCase = gl1.y.Q(o0VarE, i17).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f17 = eVar2.f97920e;
                f14 = eVar2.f97920e;
                f15 = eVar2.f97918c;
                bVar.getClass();
                c2565a2 = c2565a;
                i18 = i16;
                mh.c(upperCase, c2.l.z(aVar3, f17, eVar2.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                h4.r rVarE = u1.n.e(aVar3, p6.b.b(o0Var), m1.f128891a);
                bVar.getClass();
                h4.r rVarA = c2.l.A(rVarE, f14, 0.0f, 2);
                bVar.getClass();
                float f18 = eVar2.f97920e;
                bVar.getClass();
                h4.r rVarF = x2.f(c2.l.C(rVarA, 0.0f, eVar2.f97918c, 0.0f, f18, 5), 1.0f);
                zVarA = c2.y.a(kVar2, aVar4, o0Var, 0);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarF, o0Var);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar5);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, zVarA, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0Var);
                if (cVar.isEmpty()) {
                    lVar3 = lVar2;
                    f16 = f15;
                    z14 = true;
                    i19 = 0;
                    th3 = null;
                    cVar2 = cVar;
                    o0Var.C(-1293189196);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1298713985);
                    f2.p0 p0VarA = r0.a(0, o0Var, 3);
                    if ((i18 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objQ3 = o0Var.q();
                    c2565a2 = c2565a2;
                    if (z18 || objQ3 == c2565a2) {
                        objQ3 = new uj1.y(pVar, 14);
                        o0Var.K(objQ3);
                    }
                    dVarV = g8.i.V(p0VarA, (e23.p) objQ3, o0Var);
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarJ = x2.j(aVar3, 0.0f, 1000, 1);
                    if (cVar.size() > 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zR = o0Var.r(dVarV);
                    objQ4 = o0Var.q();
                    if (zR || objQ4 == c2565a2) {
                        objQ4 = new k02.a(dVarV, 3);
                        o0Var.K(objQ4);
                    }
                    h4.r rVarA2 = wz1.i.a((e23.l) objQ4, rVarJ, z19);
                    f2.b.a aVar7 = new f2.b.a(100, null);
                    bVar.getClass();
                    l2 l2VarE = c2.l.e(0.0f, f15, 0.0f, 0.0f, 13);
                    bVar.getClass();
                    c2.j.i iVarI = c2.j.i(f15);
                    bVar.getClass();
                    c2.j.i iVarI2 = c2.j.i(f15);
                    f16 = f15;
                    cVar2 = cVar;
                    boolean zR2 = o0Var.r(cVar2) | o0Var.r(dVarV);
                    if ((i18 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zR2 | z24;
                    objQ5 = o0Var.q();
                    if (!z25 || objQ5 == c2565a2) {
                        lVar3 = lVar2;
                        z14 = true;
                        objQ5 = new ht1.p(cVar2, dVarV, lVar3, 1);
                        o0Var.K(objQ5);
                    } else {
                        lVar3 = lVar2;
                        z14 = true;
                    }
                    th3 = null;
                    f2.j.a(aVar7, rVarA2, p0VarA, l2VarE, iVarI2, iVarI, null, false, null, (e23.l) objQ5, o0Var, 0, 0, 912);
                    o0Var = o0Var;
                    bVar.getClass();
                    c2.l.f(x2.h(aVar3, f14), o0Var);
                    i19 = 0;
                    o0Var.g0(false);
                }
                bVar.getClass();
                s2VarA = q2.a(c2.j.i(f16), h4.d.a.f81533k, o0Var, i19);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(aVar3, o0Var);
                if (cVar3 != null) {
                    p0.l();
                    throw th3;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar5);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, s2VarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0Var);
                u2 u2Var = u2.f22900a;
                f0.a aVar8 = f0.a.f111000a;
                s62.a.f157643a.getClass();
                t62.b bVar5 = t62.b.f162798a;
                u4.d dVarA = k6.a(bVar5);
                boolean zR3 = o0Var.r(cVar2);
                i24 = i18 & 896;
                if (i24 == 256) {
                    z15 = z14;
                } else {
                    z15 = false;
                }
                zB = zR3 | z15 | o0Var.B(aVarF);
                objQ = o0Var.q();
                if (zB) {
                    p1Var = p1Var2;
                    kVar = new b21.k(cVar2, i14, aVarF, p1Var, 10);
                    o0Var.K(kVar);
                } else {
                    c2565a3 = c2565a2;
                    if (objQ == c2565a3) {
                        c2565a2 = c2565a3;
                        p1Var = p1Var2;
                        kVar = new b21.k(cVar2, i14, aVarF, p1Var, 10);
                        o0Var.K(kVar);
                    } else {
                        c2565a2 = c2565a3;
                        kVar = objQ;
                        p1Var = p1Var2;
                    }
                }
                e23.a aVar9 = (e23.a) kVar;
                o0Var2 = o0Var;
                z16 = z14;
                p3.m.a.C2565a c2565a5 = c2565a2;
                aVar8.h(((i18 << 3) & 112) | 384, 8, aVar9, aVar3, str, o0Var2, dVarA, false);
                u4.d dVarA2 = m6.a(bVar5);
                String strQ = gl1.y.Q(o0Var2, R.string.permission_camera);
                boolean zR4 = o0Var2.r(cVar2);
                if (i24 == 256) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                zB2 = z17 | zR4 | o0Var2.B(kVarE);
                objQ2 = o0Var2.q();
                if (!zB2 || objQ2 == c2565a5) {
                    i25 = i14;
                    b21.k kVar3 = new b21.k(cVar2, i25, kVarE, p1Var, 11);
                    o0Var2.K(kVar3);
                    objQ2 = kVar3;
                } else {
                    i25 = i14;
                }
                aVar8.h(384, 8, (e23.a) objQ2, aVar3, strQ, o0Var2, dVarA2, false);
                o0Var3 = o0Var2;
                o0Var3.g0(z16);
                if (cVar.isEmpty()) {
                    o0Var3.C(-1291191308);
                    o0Var3.g0(false);
                } else {
                    it = cVar.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o0Var3.C(-1291191308);
                            o0Var3.g0(false);
                        } else if (it.next().f194331c) {
                            o0Var3.C(-1291966308);
                            h4.d.f81522a.getClass();
                            h4.g.b bVar6 = h4.d.a.f81534l;
                            c2.j jVar = c2.j.f22691a;
                            d92.b.f58623a.getClass();
                            bVar2 = d92.b.f58625c;
                            bVar2.getClass();
                            float f19 = j92.b.f97899b.f97917b;
                            jVar.getClass();
                            c2.j.i iVarI3 = c2.j.i(f19);
                            aVar = h4.r.S;
                            s2VarA2 = q2.a(iVarI3, bVar6, o0Var3, 48);
                            x1 x1Var2 = p3.n.f135158a;
                            iHashCode3 = Long.hashCode(o0Var3.U);
                            i2VarA2 = o0Var3.a0();
                            rVarC3 = h4.k.c(aVar, o0Var3);
                            h5.g.V.getClass();
                            aVar2 = h5.g.a.f81805b;
                            if (cVar3 != null) {
                                p0.l();
                                throw th3;
                            }
                            o0Var3.z();
                            if (o0Var3.T) {
                                o0Var3.M(aVar2);
                            } else {
                                o0Var3.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA2, o0Var3);
                            b4.c(h5.g.a.f81809f, i2VarA2, o0Var3);
                            bVar3 = h5.g.a.f81813j;
                            if (o0Var3.T || !p005kotlin.jvm.internal.s.g(o0Var3.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC3, o0Var3);
                            u2 u2Var2 = u2.f22900a;
                            bVar2.getClass();
                            i7.a(n5.c.a(R.drawable.ic_exclamation, o0Var3, 0), null, u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97903b), k2.i.f102406a), d92.b.a(o0Var3).e().h(), m1.f128891a), 0L, o0Var3, 48, 8);
                            String strQ2 = gl1.y.Q(o0Var3, R.string.upload_image_failed);
                            d92.b.f58624b.getClass();
                            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var3), o0Var3, 0, 0, 131070);
                            o0Var3 = o0Var3;
                            o0Var3.g0(z16);
                            o0Var3.g0(false);
                        }
                    }
                }
                h4.r.a aVar10 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar10, j92.b.f97899b.f97918c), o0Var3);
                String strP = gl1.y.P(R.string.photo_limit_value, new Object[]{Integer.valueOf(cVar.size()), Integer.valueOf(i25)}, o0Var3);
                d92.b.f58624b.getClass();
                o0 o0Var4 = o0Var3;
                mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var3), o0Var4, 0, 0, 131070);
                o0Var4.g0(z16);
                c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-1770622608, new af1.l(i25, p1Var, 9), o0Var4), o0Var4, 1572870, 30);
                o0VarE = o0Var4;
                o0VarE.g0(z16);
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.A(iHashCode4, o0VarE, iHashCode4, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            b0Var = b0.f22601a;
            if (i25 > 1) {
                i17 = R.string.title_photos;
            } else {
                i17 = R.string.social_photo;
            }
            String upperCase2 = gl1.y.Q(o0VarE, i17).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97934k, o0VarE);
            bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f110 = eVar3.f97920e;
            f14 = eVar3.f97920e;
            f15 = eVar3.f97918c;
            bVar.getClass();
            c2565a2 = c2565a;
            i18 = i16;
            mh.c(upperCase2, c2.l.z(aVar3, f110, eVar3.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            h4.r rVarE2 = u1.n.e(aVar3, p6.b.b(o0Var), m1.f128891a);
            bVar.getClass();
            h4.r rVarA3 = c2.l.A(rVarE2, f14, 0.0f, 2);
            bVar.getClass();
            float f111 = eVar3.f97920e;
            bVar.getClass();
            h4.r rVarF2 = x2.f(c2.l.C(rVarA3, 0.0f, eVar3.f97918c, 0.0f, f111, 5), 1.0f);
            zVarA = c2.y.a(kVar2, aVar4, o0Var, 0);
            iHashCode = Long.hashCode(o0Var.U);
            i2VarA0 = o0Var.a0();
            rVarC = h4.k.c(rVarF2, o0Var);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar5);
            } else {
                o0Var.c();
            }
            b4.c(eVar, zVarA, o0Var);
            b4.c(c1623g, i2VarA0, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0Var, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0Var);
            if (cVar.isEmpty()) {
                o0Var.C(-1298713985);
                f2.p0 p0VarA2 = r0.a(0, o0Var, 3);
                if ((i18 & 57344) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ3 = o0Var.q();
                c2565a2 = c2565a2;
                if (z18) {
                    objQ3 = new uj1.y(pVar, 14);
                    o0Var.K(objQ3);
                } else {
                    objQ3 = new uj1.y(pVar, 14);
                    o0Var.K(objQ3);
                }
                dVarV = g8.i.V(p0VarA2, (e23.p) objQ3, o0Var);
                g6.f.a aVar11 = g6.f.f75994b;
                h4.r rVarJ2 = x2.j(aVar3, 0.0f, 1000, 1);
                if (cVar.size() > 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zR = o0Var.r(dVarV);
                objQ4 = o0Var.q();
                if (zR) {
                    objQ4 = new k02.a(dVarV, 3);
                    o0Var.K(objQ4);
                } else {
                    objQ4 = new k02.a(dVarV, 3);
                    o0Var.K(objQ4);
                }
                h4.r rVarA4 = wz1.i.a((e23.l) objQ4, rVarJ2, z19);
                f2.b.a aVar12 = new f2.b.a(100, null);
                bVar.getClass();
                l2 l2VarE2 = c2.l.e(0.0f, f15, 0.0f, 0.0f, 13);
                bVar.getClass();
                c2.j.i iVarI4 = c2.j.i(f15);
                bVar.getClass();
                c2.j.i iVarI5 = c2.j.i(f15);
                f16 = f15;
                cVar2 = cVar;
                boolean zR5 = o0Var.r(cVar2) | o0Var.r(dVarV);
                if ((i18 & 458752) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zR5 | z24;
                objQ5 = o0Var.q();
                if (z25) {
                    lVar3 = lVar2;
                    z14 = true;
                    objQ5 = new ht1.p(cVar2, dVarV, lVar3, 1);
                    o0Var.K(objQ5);
                } else {
                    lVar3 = lVar2;
                    z14 = true;
                    objQ5 = new ht1.p(cVar2, dVarV, lVar3, 1);
                    o0Var.K(objQ5);
                }
                th3 = null;
                f2.j.a(aVar12, rVarA4, p0VarA2, l2VarE2, iVarI5, iVarI4, null, false, null, (e23.l) objQ5, o0Var, 0, 0, 912);
                o0Var = o0Var;
                bVar.getClass();
                c2.l.f(x2.h(aVar3, f14), o0Var);
                i19 = 0;
                o0Var.g0(false);
            } else {
                lVar3 = lVar2;
                f16 = f15;
                z14 = true;
                i19 = 0;
                th3 = null;
                cVar2 = cVar;
                o0Var.C(-1293189196);
                o0Var.g0(false);
            }
            bVar.getClass();
            s2VarA = q2.a(c2.j.i(f16), h4.d.a.f81533k, o0Var, i19);
            iHashCode2 = Long.hashCode(o0Var.U);
            i2VarA1 = o0Var.a0();
            rVarC2 = h4.k.c(aVar3, o0Var);
            if (cVar3 != null) {
                p0.l();
                throw th3;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar5);
            } else {
                o0Var.c();
            }
            b4.c(eVar, s2VarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
            } else {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC2, o0Var);
            u2 u2Var3 = u2.f22900a;
            f0.a aVar13 = f0.a.f111000a;
            s62.a.f157643a.getClass();
            t62.b bVar7 = t62.b.f162798a;
            u4.d dVarA3 = k6.a(bVar7);
            boolean zR6 = o0Var.r(cVar2);
            i24 = i18 & 896;
            if (i24 == 256) {
                z15 = z14;
            } else {
                z15 = false;
            }
            zB = zR6 | z15 | o0Var.B(aVarF);
            objQ = o0Var.q();
            if (zB) {
                p1Var = p1Var2;
                kVar = new b21.k(cVar2, i14, aVarF, p1Var, 10);
                o0Var.K(kVar);
            } else {
                c2565a3 = c2565a2;
                if (objQ == c2565a3) {
                    c2565a2 = c2565a3;
                    p1Var = p1Var2;
                    kVar = new b21.k(cVar2, i14, aVarF, p1Var, 10);
                    o0Var.K(kVar);
                } else {
                    c2565a2 = c2565a3;
                    kVar = objQ;
                    p1Var = p1Var2;
                }
            }
            e23.a aVar14 = (e23.a) kVar;
            o0Var2 = o0Var;
            z16 = z14;
            p3.m.a.C2565a c2565a6 = c2565a2;
            aVar13.h(((i18 << 3) & 112) | 384, 8, aVar14, aVar3, str, o0Var2, dVarA3, false);
            u4.d dVarA4 = m6.a(bVar7);
            String strQ3 = gl1.y.Q(o0Var2, R.string.permission_camera);
            boolean zR7 = o0Var2.r(cVar2);
            if (i24 == 256) {
                z17 = z16;
            } else {
                z17 = false;
            }
            zB2 = z17 | zR7 | o0Var2.B(kVarE);
            objQ2 = o0Var2.q();
            if (zB2) {
                i25 = i14;
                b21.k kVar4 = new b21.k(cVar2, i25, kVarE, p1Var, 11);
                o0Var2.K(kVar4);
                objQ2 = kVar4;
            } else {
                i25 = i14;
                b21.k kVar5 = new b21.k(cVar2, i25, kVarE, p1Var, 11);
                o0Var2.K(kVar5);
                objQ2 = kVar5;
            }
            aVar13.h(384, 8, (e23.a) objQ2, aVar3, strQ3, o0Var2, dVarA4, false);
            o0Var3 = o0Var2;
            o0Var3.g0(z16);
            if (cVar.isEmpty()) {
                o0Var3.C(-1291191308);
                o0Var3.g0(false);
            } else {
                it = cVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        o0Var3.C(-1291191308);
                        o0Var3.g0(false);
                    } else if (it.next().f194331c) {
                        o0Var3.C(-1291966308);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar8 = h4.d.a.f81534l;
                        c2.j jVar2 = c2.j.f22691a;
                        d92.b.f58623a.getClass();
                        bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        float f112 = j92.b.f97899b.f97917b;
                        jVar2.getClass();
                        c2.j.i iVarI6 = c2.j.i(f112);
                        aVar = h4.r.S;
                        s2VarA2 = q2.a(iVarI6, bVar8, o0Var3, 48);
                        x1 x1Var4 = p3.n.f135158a;
                        iHashCode3 = Long.hashCode(o0Var3.U);
                        i2VarA2 = o0Var3.a0();
                        rVarC3 = h4.k.c(aVar, o0Var3);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (cVar3 != null) {
                            p0.l();
                            throw th3;
                        }
                        o0Var3.z();
                        if (o0Var3.T) {
                            o0Var3.M(aVar2);
                        } else {
                            o0Var3.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA2, o0Var3);
                        b4.c(h5.g.a.f81809f, i2VarA2, o0Var3);
                        bVar3 = h5.g.a.f81813j;
                        if (o0Var3.T) {
                            v.h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                        } else {
                            v.h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, o0Var3);
                        u2 u2Var4 = u2.f22900a;
                        bVar2.getClass();
                        i7.a(n5.c.a(R.drawable.ic_exclamation, o0Var3, 0), null, u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97903b), k2.i.f102406a), d92.b.a(o0Var3).e().h(), m1.f128891a), 0L, o0Var3, 48, 8);
                        String strQ4 = gl1.y.Q(o0Var3, R.string.upload_image_failed);
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var3), o0Var3, 0, 0, 131070);
                        o0Var3 = o0Var3;
                        o0Var3.g0(z16);
                        o0Var3.g0(false);
                    }
                }
            }
            h4.r.a aVar15 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar15, j92.b.f97899b.f97918c), o0Var3);
            String strP2 = gl1.y.P(R.string.photo_limit_value, new Object[]{Integer.valueOf(cVar.size()), Integer.valueOf(i25)}, o0Var3);
            d92.b.f58624b.getClass();
            o0 o0Var5 = o0Var3;
            mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var3), o0Var5, 0, 0, 131070);
            o0Var5.g0(z16);
            c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-1770622608, new af1.l(i25, p1Var, 9), o0Var5), o0Var5, 1572870, 30);
            o0VarE = o0Var5;
            o0VarE.g0(z16);
            x1 x1Var5 = p3.n.f135158a;
        } else {
            lVar3 = lVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wx1.i(str, cVar, i25, lVar, pVar, lVar3, i15);
        }
    }
}
