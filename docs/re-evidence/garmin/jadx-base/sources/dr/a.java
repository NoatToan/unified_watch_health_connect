package dr;

import c2.b0;
import c2.j;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.r;
import h4.k;
import h5.e0;
import h5.g;
import i3.mh;
import j92.e;
import j92.f;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import nr.z0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: dr.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1292a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f60816a;

        public C1292a(e23.a<Unit> aVar) {
            this.f60816a = aVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f60816a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Unit> f60817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z0 f60818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f60819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<List<z0>> f60820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f60821e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Integer, Unit> lVar, z0 z0Var, p1<Boolean> p1Var, p1<List<z0>> p1Var2, int i14) {
            this.f60817a = lVar;
            this.f60818b = z0Var;
            this.f60819c = p1Var;
            this.f60820d = p1Var2;
            this.f60821e = i14;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f60819c.setValue(Boolean.TRUE);
            z0 z0Var = this.f60818b;
            this.f60817a.invoke(z0Var.f127605d ? null : Integer.valueOf(z0Var.f127602a));
            p1<List<z0>> p1Var = this.f60820d;
            List<z0> f182175a = p1Var.getF182175a();
            ArrayList arrayList = new ArrayList(y.r(f182175a, 10));
            int i14 = 0;
            for (Object obj : f182175a) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                z0 z0Var2 = (z0) obj;
                arrayList.add(this.f60821e == i14 ? z0.b(z0Var2, !z0Var2.f127605d, false, 23) : z0.b(z0Var2, false, false, 23));
                i14 = i15;
            }
            p1Var.setValue(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f60822a;

        public c(List list) {
            this.f60822a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f60822a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f60823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f60824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1 f60825c;

        public d(List list, l lVar, p1 p1Var) {
            this.f60823a = list;
            this.f60824b = lVar;
            this.f60825c = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x012f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0152  */
        /* JADX WARN: Code duplicated, block: B:46:0x0176  */
        /* JADX WARN: Code duplicated, block: B:47:0x0189  */
        /* JADX WARN: Code duplicated, block: B:53:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:65:0x01df  */
        /* JADX WARN: Code duplicated, block: B:70:0x0221  */
        /* JADX WARN: Code duplicated, block: B:72:0x022a  */
        /* JADX WARN: Code duplicated, block: B:74:0x0230  */
        /* JADX WARN: Code duplicated, block: B:79:0x0250  */
        /* JADX WARN: Code duplicated, block: B:83:0x0290  */
        /* JADX WARN: Code duplicated, block: B:85:0x036b  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) throws FileNotFoundException {
            int i14;
            Integer num3;
            g.a.f fVar;
            b0 b0Var;
            h4.r.a aVar;
            Integer num4;
            m.a.C2565a c2565a;
            g.a.C1623g c1623g;
            g.a.b bVar;
            LottieClipSpec.Frame frame;
            LottieClipSpec.Frame frame2;
            LottieClipSpec.Frame frame3;
            boolean z14;
            boolean z15;
            Object bVar2;
            z0 z0Var;
            m.a.C2565a c2565a2;
            b0 b0Var2;
            boolean z16;
            g.a.f fVar2;
            e23.a aVar2;
            f5.z0 z0VarD;
            int iHashCode;
            i2 i2VarX;
            h4.r rVarC;
            boolean zB;
            Object objQ;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            boolean z17 = true;
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                z0 z0Var2 = (z0) this.f60823a.get(iIntValue);
                mVar2.C(1962590920);
                int i15 = z0Var2.f127604c;
                boolean z18 = z0Var2.f127605d;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(i15)), null, null, null, null, null, mVar2, 0, 62);
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(R.raw.icon_checkmark)), null, null, null, null, null, mVar2, 0, 62);
                Object objQ2 = mVar2.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a3 = m.a.f135155b;
                if (objQ2 == c2565a3) {
                    objQ2 = p0.n(Boolean.FALSE);
                    mVar2.K(objQ2);
                }
                p1 p1Var = (p1) objQ2;
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81537o;
                h4.r.a aVar4 = h4.r.S;
                j.f22691a.getClass();
                z zVarA = c2.y.a(j.f22694d, aVar3, mVar2, 48);
                int iHashCode2 = Long.hashCode(mVar2.getU());
                i2 i2VarX2 = mVar2.x();
                h4.r rVarC2 = k.c(aVar4, mVar2);
                g.V.getClass();
                e0.a aVar5 = g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar5);
                } else {
                    mVar2.c();
                }
                int i16 = i14;
                g.a.e eVar = g.a.f81810g;
                b4.c(eVar, zVarA, mVar2);
                g.a.C1623g c1623g2 = g.a.f81809f;
                b4.c(c1623g2, i2VarX2, mVar2);
                g.a.b bVar3 = g.a.f81813j;
                if (mVar2.getT()) {
                    num3 = 60;
                } else {
                    num3 = 60;
                    if (!s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    b0Var = b0.f22601a;
                    if (z18) {
                        aVar = aVar4;
                        c2565a = c2565a3;
                        bVar = bVar3;
                        c1623g = c1623g2;
                        frame = new LottieClipSpec.Frame(0, num3, false, 4, null);
                        num4 = 0;
                    } else {
                        aVar = aVar4;
                        num4 = 0;
                        c2565a = c2565a3;
                        c1623g = c1623g2;
                        bVar = bVar3;
                        frame = new LottieClipSpec.Frame(num3, 72, false, 4, null);
                    }
                    frame2 = frame;
                    if (z18) {
                        frame3 = new LottieClipSpec.Frame(num4, 20, false, 4, null);
                    } else {
                        frame3 = new LottieClipSpec.Frame(40, 53, false, 4, null);
                    }
                    if (!z18 || ((Boolean) p1Var.getF182175a()).booleanValue()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zB2 = mVar2.B(this.f60824b) | mVar2.r(z0Var2);
                    if ((((i16 & 112) ^ 48) > 32 || !mVar2.k(iIntValue)) && (i16 & 48) != 32) {
                    }
                    z15 = zB2 | z17;
                    Object objQ3 = mVar2.q();
                    if (!z15 || objQ3 == c2565a) {
                        m.a.C2565a c2565a4 = c2565a;
                        z0Var = z0Var2;
                        c2565a2 = c2565a4;
                        b0Var2 = b0Var;
                        z16 = false;
                        fVar2 = fVar;
                        bVar2 = new b(this.f60824b, z0Var, p1Var, this.f60825c, iIntValue);
                        mVar2.K(bVar2);
                    } else {
                        m.a.C2565a c2565a5 = c2565a;
                        z0Var = z0Var2;
                        c2565a2 = c2565a5;
                        fVar2 = fVar;
                        bVar2 = objQ3;
                        b0Var2 = b0Var;
                        z16 = false;
                    }
                    aVar2 = (e23.a) bVar2;
                    z0VarD = q.d(h4.d.a.f81524b, z16);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = k.c(aVar, mVar2);
                    if (mVar2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, z0VarD, mVar2);
                    b4.c(c1623g, i2VarX, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(fVar2, rVarC, mVar2);
                    u uVar = u.f22885a;
                    mVar2.N(-1370905295, Boolean.valueOf(z18));
                    h4.r rVarC3 = uVar.c(aVar, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    h4.r rVarQ = x2.q(rVarC3, cVar.f97907f);
                    e eVar2 = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarQ, eVar2.f97918c);
                    zB = mVar2.B(aVar2);
                    objQ = mVar2.q();
                    if (zB || objQ == c2565a2) {
                        objQ = new C1292a(aVar2);
                        mVar2.K(objQ);
                    }
                    h4.r rVarD = w.d(rVarY, false, null, null, (e23.a) objQ, 15);
                    LottieComposition f182175a = lottieCompositionResultRememberLottieComposition.getF182175a();
                    int i17 = LottieClipSpec.Frame.$stable << 12;
                    LottieAnimationKt.LottieAnimation(f182175a, rVarD, z14, false, frame2, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, mVar2, i17, 0, 0, 2097128);
                    float f14 = eVar2.f97918c;
                    h4.r.a aVar6 = aVar;
                    LottieAnimationKt.LottieAnimation(lottieCompositionResultRememberLottieComposition2.getF182175a(), x2.q(uVar.c(c2.l.C(aVar6, 0.0f, 0.0f, f14, f14, 3), h4.d.a.f81532j), cVar.f97903b), z14, false, frame3, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, mVar2, i17, 0, 0, 2097128);
                    mVar2.Q();
                    mVar2.y();
                    String strQ = gl1.y.Q(mVar2, z0Var.f127603b);
                    d92.b.f58624b.getClass();
                    x0 x0Var = f.f97933j;
                    long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar2);
                    h4.r rVarB = b0Var2.b(aVar6, aVar3);
                    float f15 = eVar2.f97917b;
                    mh.c(strQ, c2.l.C(rVarB, f15, f15, f15, 0.0f, 8), jX, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131064);
                    mVar2.y();
                    mVar2.f();
                }
                h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC2, mVar2);
                b0Var = b0.f22601a;
                if (z18) {
                    aVar = aVar4;
                    c2565a = c2565a3;
                    bVar = bVar3;
                    c1623g = c1623g2;
                    frame = new LottieClipSpec.Frame(0, num3, false, 4, null);
                    num4 = 0;
                } else {
                    aVar = aVar4;
                    num4 = 0;
                    c2565a = c2565a3;
                    c1623g = c1623g2;
                    bVar = bVar3;
                    frame = new LottieClipSpec.Frame(num3, 72, false, 4, null);
                }
                frame2 = frame;
                if (z18) {
                    frame3 = new LottieClipSpec.Frame(num4, 20, false, 4, null);
                } else {
                    frame3 = new LottieClipSpec.Frame(40, 53, false, 4, null);
                }
                if (z18) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                boolean zB3 = mVar2.B(this.f60824b) | mVar2.r(z0Var2);
                z17 = ((i16 & 112) ^ 48) > 32 ? false : false;
                z15 = zB3 | z17;
                Object objQ4 = mVar2.q();
                if (z15) {
                    m.a.C2565a c2565a6 = c2565a;
                    z0Var = z0Var2;
                    c2565a2 = c2565a6;
                    b0Var2 = b0Var;
                    z16 = false;
                    fVar2 = fVar;
                    bVar2 = new b(this.f60824b, z0Var, p1Var, this.f60825c, iIntValue);
                    mVar2.K(bVar2);
                } else {
                    m.a.C2565a c2565a7 = c2565a;
                    z0Var = z0Var2;
                    c2565a2 = c2565a7;
                    b0Var2 = b0Var;
                    z16 = false;
                    fVar2 = fVar;
                    bVar2 = new b(this.f60824b, z0Var, p1Var, this.f60825c, iIntValue);
                    mVar2.K(bVar2);
                }
                aVar2 = (e23.a) bVar2;
                z0VarD = q.d(h4.d.a.f81524b, z16);
                iHashCode = Long.hashCode(mVar2.getU());
                i2VarX = mVar2.x();
                rVarC = k.c(aVar, mVar2);
                if (mVar2.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar5);
                } else {
                    mVar2.c();
                }
                b4.c(eVar, z0VarD, mVar2);
                b4.c(c1623g, i2VarX, mVar2);
                if (mVar2.getT()) {
                    h.z(iHashCode, mVar2, iHashCode, bVar);
                } else {
                    h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                b4.c(fVar2, rVarC, mVar2);
                u uVar2 = u.f22885a;
                mVar2.N(-1370905295, Boolean.valueOf(z18));
                h4.r rVarC4 = uVar2.c(aVar, h4.d.a.f81528f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.c cVar2 = j92.b.f97901d;
                h4.r rVarQ2 = x2.q(rVarC4, cVar2.f97907f);
                e eVar3 = j92.b.f97899b;
                h4.r rVarY2 = c2.l.y(rVarQ2, eVar3.f97918c);
                zB = mVar2.B(aVar2);
                objQ = mVar2.q();
                if (zB) {
                    objQ = new C1292a(aVar2);
                    mVar2.K(objQ);
                } else {
                    objQ = new C1292a(aVar2);
                    mVar2.K(objQ);
                }
                h4.r rVarD2 = w.d(rVarY2, false, null, null, (e23.a) objQ, 15);
                LottieComposition f182175a2 = lottieCompositionResultRememberLottieComposition.getF182175a();
                int i18 = LottieClipSpec.Frame.$stable << 12;
                LottieAnimationKt.LottieAnimation(f182175a2, rVarD2, z14, false, frame2, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, mVar2, i18, 0, 0, 2097128);
                float f16 = eVar3.f97918c;
                h4.r.a aVar7 = aVar;
                LottieAnimationKt.LottieAnimation(lottieCompositionResultRememberLottieComposition2.getF182175a(), x2.q(uVar2.c(c2.l.C(aVar7, 0.0f, 0.0f, f16, f16, 3), h4.d.a.f81532j), cVar2.f97903b), z14, false, frame3, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, mVar2, i18, 0, 0, 2097128);
                mVar2.Q();
                mVar2.y();
                String strQ2 = gl1.y.Q(mVar2, z0Var.f127603b);
                d92.b.f58624b.getClass();
                x0 x0Var2 = f.f97933j;
                long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar2);
                h4.r rVarB2 = b0Var2.b(aVar7, aVar3);
                float f17 = eVar3.f97917b;
                mh.c(strQ2, c2.l.C(rVarB2, f17, f17, f17, 0.0f, 8), jX2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar2, 0, 0, 131064);
                mVar2.y();
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(Integer num, l<? super Integer, Unit> lVar, m mVar, int i14) {
        l<? super Integer, Unit> lVar2;
        lVar.getClass();
        o0 o0VarE = mVar.E(1608064233);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                z0.f127601f.getClass();
                objQ = p0.n(z0.a.a(num));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_workout_feel);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var = f.f97931h;
            long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            bVar.getClass();
            float f16 = eVar.f97920e;
            bVar.getClass();
            mh.c(strQ, c2.l.C(aVar, f14, eVar.f97920e, f16, 0.0f, 8), jD, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0VarE = o0VarE;
            j.f22691a.getClass();
            j.h hVar = j.f22697g;
            h4.r rVarF = x2.f(aVar, 1.0f);
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            h4.r rVarB = c2.l.B(rVarF, f15, f15, f15, eVar.f97920e);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                lVar2 = lVar;
                objQ2 = new a11.b0(p1Var, lVar2, 9);
                o0VarE.K(objQ2);
            } else {
                lVar2 = lVar;
            }
            e2.c.c(rVarB, null, null, hVar, null, null, false, null, (l) objQ2, o0VarE, 24576, 494);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(num, lVar2, i14, 11);
        }
    }
}
