package bg2;

import am.i1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import b82.v1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.v5;
import java.util.List;
import l72.v2;
import mg2.w;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.msnworkouts.ExerciseInformationViewKt$ExerciseInformationView$1$1", f = "ExerciseInformationView.kt", l = {56}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0 f17853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f17854c;

        /* JADX INFO: renamed from: bg2.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0258a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f17855a;

            /* JADX INFO: renamed from: bg2.c$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0259a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f17856a;

                static {
                    int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
                    try {
                        iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f17856a = iArr;
                }
            }

            public C0258a(e23.a<Unit> aVar) {
                this.f17855a = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                if (C0259a.f17856a[((androidx.lifecycle.b0.a) obj).ordinal()] == 1) {
                    this.f17855a.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f17853b = n0Var;
            this.f17854c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f17853b, this.f17854c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f17852a;
            if (i14 == 0) {
                r.b(obj);
                r53.i<androidx.lifecycle.b0.a> iVarA = l0.a(this.f17853b.getF158016a());
                C0258a c0258a = new C0258a(this.f17854c);
                this.f17852a = 1;
                if (iVarA.collect(c0258a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        String str3 = str;
        str3.getClass();
        o0 o0VarE = mVar.E(-574257359);
        int i16 = i14 | (o0VarE.B(str3) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97918c);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b71.o(14);
                o0VarE.K(objQ);
            }
            h4.r rVarC = v.c((e23.l) objQ, rVarY, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar.getClass();
            float f14 = eVar.f97918c;
            bVar.getClass();
            mh.c(str2, c2.l.C(aVar, f14, eVar.f97918c, 0.0f, 0.0f, 12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i16 >> 3) & 14, 0, 131068);
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            str3 = str;
            mh.c(str3, c2.l.C(aVar, f15, 0.0f, 0.0f, eVar.f97918c, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i16 & 14, 0, 131068);
            o0Var = o0VarE;
            i15 = 1;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str3, str2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:111:0x030d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0347  */
    /* JADX WARN: Code duplicated, block: B:119:0x034d  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:134:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x0438  */
    /* JADX WARN: Code duplicated, block: B:141:0x044f  */
    /* JADX WARN: Code duplicated, block: B:142:0x045c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0468  */
    /* JADX WARN: Code duplicated, block: B:145:0x049f  */
    /* JADX WARN: Code duplicated, block: B:149:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:154:0x04df  */
    /* JADX WARN: Code duplicated, block: B:158:0x051e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0525  */
    /* JADX WARN: Code duplicated, block: B:161:0x0529  */
    /* JADX WARN: Code duplicated, block: B:166:0x0544  */
    /* JADX WARN: Code duplicated, block: B:169:0x0550  */
    /* JADX WARN: Code duplicated, block: B:170:0x055b  */
    /* JADX WARN: Code duplicated, block: B:173:0x056c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0574  */
    /* JADX WARN: Code duplicated, block: B:177:0x057c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0587  */
    /* JADX WARN: Code duplicated, block: B:185:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:187:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:189:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:191:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:193:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:195:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:205:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01da  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x022c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0233  */
    /* JADX WARN: Code duplicated, block: B:84:0x0237  */
    /* JADX WARN: Code duplicated, block: B:89:0x0252  */
    /* JADX WARN: Code duplicated, block: B:93:0x026b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0273  */
    /* JADX WARN: Code duplicated, block: B:97:0x027b  */
    /* JADX WARN: Code duplicated, block: B:98:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v44, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    public static final void b(h hVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        Object objO;
        int i15;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        n1 n1Var;
        int i16;
        z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        Throwable th3;
        o0 o0Var2;
        h4.r.a aVar2;
        h4.g.a aVar3;
        z zVarA2;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        e0.a aVar4;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar2;
        String difficulty;
        h4.r.a aVar5;
        boolean z15;
        boolean z16;
        String bodyParts;
        o0 o0Var3;
        boolean z17;
        o0 o0Var4;
        ?? r14;
        String equipment;
        z zVarA3;
        int iHashCode4;
        i2 i2VarA3;
        h4.r rVarC4;
        List<d> listG;
        int i17;
        ?? r15;
        int i18;
        String instructions;
        List<String> listH;
        s2 s2VarA2;
        int iHashCode5;
        i2 i2VarA4;
        h4.r rVarC5;
        int i19;
        o0 o0Var5;
        int i24;
        String thumbnail;
        boolean zK;
        n1 n1Var2;
        Object obj;
        boolean z18;
        Object objQ;
        Object obj2;
        o0 o0Var6;
        hVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1648366457);
        p3.c<?> cVar = o0VarE.f135177b;
        int i25 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i25 & 1, (i25 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj3 = p3.m.a.f135155b;
            if (objQ2 == obj3) {
                objO = objQ2;
                objO = e5.o(0, o0VarE);
            }
            objO = objQ2;
            n1 n1Var3 = (n1) objO;
            List<o> listI = hVar.i();
            if (listI == null) {
                listI = j0.f134944a;
            }
            o oVar = (o) h0.e0(n1Var3.getIntValue(), listI);
            String video = oVar != null ? oVar.getCom.google.android.exoplayer2.util.MimeTypes.BASE_TYPE_VIDEO java.lang.String() : null;
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(n0Var) | ((i25 & 896) == 256);
            Object objQ3 = o0VarE.q();
            Object obj4 = objQ3;
            if (zR || objQ3 == obj3) {
                Object aVar6 = new a(n0Var, aVar, null);
                o0VarE.K(aVar6);
                obj4 = aVar6;
            }
            p3.l0.e((p) obj4, unit, o0VarE);
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarB = a2.b(aVar7, a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar8 = h4.d.a.f81536n;
            z zVarA4 = y.a(kVar, aVar8, o0VarE, 0);
            int iHashCode6 = Long.hashCode(o0VarE.U);
            i2 i2VarA5 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar9 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA4, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA5, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i25;
            } else {
                i15 = i25;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode6))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC6, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (video == null) {
                    o0VarE.C(-1225839458);
                    i16 = 0;
                    o0VarE.g0(false);
                    n1Var = n1Var3;
                } else {
                    o0VarE.C(-1225839457);
                    w.f118432a.getClass();
                    h4.r rVarH = x2.h(aVar7, w.f118434c);
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarH, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    n1Var = n1Var3;
                    if (o0VarE.T) {
                        o0VarE.M(aVar9);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, s2VarA, o0VarE);
                    b4.c(c1623g2, i2VarA0, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    u2 u2Var = u2.f22900a;
                    g.a(video, true, z14, o0VarE, ((i15 << 3) & 896) | 48);
                    o0VarE.g0(true);
                    i16 = 0;
                    o0VarE.g0(false);
                }
                h4.r rVarF = x2.f(aVar7, 1.0f);
                zVarA = y.a(kVar, aVar8, o0VarE, i16);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g2, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (listI.isEmpty()) {
                    o0 o0Var7 = o0VarE;
                    th3 = null;
                    o0Var7.C(-1354484319);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar7, j92.b.f97899b.f97917b, o0Var7, false);
                    o0Var2 = o0Var7;
                } else {
                    o0VarE.C(-1356069163);
                    h4.r rVarB2 = a2.b(aVar7, a2.a(o0VarE), false);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    bVar3.getClass();
                    h4.r rVarZ = c2.l.z(rVarB2, f14, eVar3.f97921f);
                    bVar3.getClass();
                    s2VarA2 = q2.a(c2.j.i(eVar3.f97920e), h4.d.a.f81533k, o0VarE, 0);
                    iHashCode5 = Long.hashCode(o0VarE.U);
                    i2VarA4 = o0VarE.a0();
                    rVarC5 = h4.k.c(rVarZ, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar9);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, s2VarA2, o0VarE);
                    b4.c(c1623g2, i2VarA4, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                        v.h.A(iHashCode5, o0VarE, iHashCode5, bVar2);
                    }
                    b4.c(fVar, rVarC5, o0VarE);
                    u2 u2Var2 = u2.f22900a;
                    o0VarE.C(-323534927);
                    i19 = 0;
                    o0Var5 = o0VarE;
                    for (Object obj5 : listI) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            x.q();
                            throw null;
                        }
                        thumbnail = ((o) obj5).getThumbnail();
                        if (thumbnail == null) {
                            o0Var5.C(-1745449373);
                            o0Var5.g0(false);
                            o0Var6 = o0Var5;
                            n1Var2 = n1Var;
                        } else {
                            o0Var5.C(-1745449372);
                            wf.f.a aVar10 = new wf.f.a((Context) o0Var5.A(AndroidCompositionLocals_androidKt.f6042b));
                            aVar10.f184930c = "https://connectvideo.garmin.com/".concat(thumbnail);
                            wf.g.a(aVar10);
                            wf.f fVarA = aVar10.a();
                            h4.r.a aVar11 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarU = x2.u(aVar11, j92.b.f97901d.f97908g);
                            zK = o0Var5.k(i19);
                            Object objQ4 = o0Var5.q();
                            if (!zK || objQ4 == p3.m.a.f135155b) {
                                n1Var2 = n1Var;
                                Object v1Var = new v1(i19, n1Var2, 1);
                                o0Var5.K(v1Var);
                                obj = v1Var;
                            } else {
                                n1Var2 = n1Var;
                                obj = objQ4;
                            }
                            h4.r rVarD = u1.w.d(rVarU, false, null, null, (e23.a) obj, 15);
                            if (i19 == n1Var2.getIntValue()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            h4.r rVarA = v2.a(rVarD, z18, new defpackage.a(29), o0Var5, 0);
                            objQ = o0Var5.q();
                            obj2 = objQ;
                            if (objQ == p3.m.a.f135155b) {
                                Object oVar2 = new b71.o(15);
                                o0Var5.K(oVar2);
                                obj2 = oVar2;
                            }
                            o0Var6 = o0Var5;
                            jf.r.a(fVarA, null, v.c((e23.l) obj2, rVarA, false), null, null, null, null, o0Var6, 48, 2040);
                            Unit unit2 = Unit.INSTANCE;
                            o0Var6.g0(false);
                        }
                        n1Var = n1Var2;
                        o0Var5 = o0Var6;
                        i19 = i24;
                    }
                    o0 o0Var8 = o0Var5;
                    th3 = null;
                    e5.u(o0Var8, false, true, false);
                    o0Var2 = o0Var8;
                }
                aVar2 = h4.r.S;
                h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), am.j.B(d92.b.f58623a, o0Var2), m1.f128891a);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                aVar3 = h4.d.a.f81536n;
                zVarA2 = y.a(kVar2, aVar3, o0Var2, 0);
                x1 x1Var2 = p3.n.f135158a;
                iHashCode3 = Long.hashCode(o0Var2.U);
                i2VarA2 = o0Var2.a0();
                rVarC3 = h4.k.c(rVarE, o0Var2);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA2, o0Var2);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA2, o0Var2);
                bVar = h5.g.a.f81813j;
                if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0Var2, iHashCode3, bVar);
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC3, o0Var2);
                c2.b0 b0Var2 = c2.b0.f22601a;
                difficulty = hVar.getDifficulty();
                if (difficulty == null) {
                    o0Var2.C(781529597);
                    o0Var2.g0(false);
                    aVar5 = aVar2;
                    fVar2 = fVar2;
                    bVar = bVar;
                    z16 = false;
                } else {
                    o0Var2.C(781529598);
                    if (d53.w.J(difficulty)) {
                        aVar5 = aVar2;
                        z15 = false;
                        o0Var2.C(-1911548765);
                        o0Var2.g0(false);
                    } else {
                        o0Var2.C(-1911770756);
                        a(gl1.y.Q(o0Var2, R.string.difficulty), difficulty, o0Var2, 0);
                        d92.b.f58625c.getClass();
                        aVar5 = aVar2;
                        v5.a(0.0f, 0, 6, 0L, c2.l.C(aVar5, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), o0Var2);
                        z15 = false;
                        o0Var2.g0(false);
                    }
                    o0Var2.g0(z15);
                    z16 = z15;
                }
                bodyParts = hVar.getBodyParts();
                if (bodyParts == null) {
                    o0Var2.C(781867962);
                    o0Var2.g0(z16);
                    o0Var4 = o0Var2;
                    aVar5 = aVar5;
                    r14 = z16;
                } else {
                    o0Var2.C(781867963);
                    if (d53.w.J(bodyParts)) {
                        o0 o0Var9 = o0Var2;
                        o0Var9.C(612963180);
                        o0Var9.g0(z16);
                        z17 = z16;
                        o0Var3 = o0Var9;
                    } else {
                        o0Var2.C(612738306);
                        a(gl1.y.Q(o0Var2, R.string.muscle_groups), bodyParts, o0Var2, z16 ? 1 : 0);
                        d92.b.f58625c.getClass();
                        o0 o0Var10 = o0Var2;
                        v5.a(0.0f, 0, 6, 0L, c2.l.C(aVar5, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), o0Var10);
                        z17 = false;
                        o0Var10.g0(false);
                        o0Var3 = o0Var10;
                    }
                    o0Var3.g0(z17);
                    r14 = z17;
                    o0Var4 = o0Var3;
                }
                equipment = hVar.getEquipment();
                if (equipment == null) {
                    o0Var4.C(782205831);
                    o0Var4.g0(r14);
                } else {
                    o0Var4.C(782205832);
                    if (d53.w.J(equipment)) {
                        o0Var4.C(-505325461);
                        o0Var4.g0(r14);
                    } else {
                        o0Var4.C(-505445586);
                        a(gl1.y.Q(o0Var4, R.string.equipment), equipment, o0Var4, r14);
                        o0Var4.g0(r14);
                    }
                    o0Var4.g0(r14);
                }
                o0Var4.g0(true);
                h4.r rVarF2 = x2.f(aVar5, 1.0f);
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar4 = j92.b.f97899b;
                h4.r rVarY = c2.l.y(rVarF2, eVar4.f97918c);
                bVar4.getClass();
                zVarA3 = y.a(c2.j.i(eVar4.f97918c), aVar3, o0Var4, 0);
                iHashCode4 = Long.hashCode(o0Var4.U);
                i2VarA3 = o0Var4.a0();
                rVarC4 = h4.k.c(rVarY, o0Var4);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0Var4.z();
                if (o0Var4.T) {
                    o0Var4.M(aVar4);
                } else {
                    o0Var4.c();
                }
                b4.c(eVar, zVarA3, o0Var4);
                b4.c(c1623g, i2VarA3, o0Var4);
                if (o0Var4.T || !s.g(o0Var4.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0Var4, iHashCode4, bVar);
                }
                b4.c(fVar2, rVarC4, o0Var4);
                listG = hVar.g();
                if (listG == null) {
                    o0Var4.C(235332739);
                    r15 = 0;
                    o0Var4.g0(false);
                } else {
                    o0Var4.C(235332740);
                    i17 = 0;
                    for (Object obj6 : listG) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            x.q();
                            throw th3;
                        }
                        instructions = ((d) obj6).getInstructions();
                        if (instructions == null) {
                            o0Var4.C(191911823);
                            o0Var4.g0(false);
                        } else {
                            o0Var4.C(191911824);
                            c(i18, 0, instructions, o0Var4);
                            o0Var4.g0(false);
                        }
                        i17 = i18;
                    }
                    r15 = 0;
                    o0Var4.g0(false);
                    Unit unit3 = Unit.INSTANCE;
                }
                listH = hVar.h();
                if (listH == null) {
                    o0Var4.C(235569796);
                    o0Var4.g0(r15);
                } else {
                    o0Var4.C(235569797);
                    d(listH, o0Var4, r15);
                    o0Var4.g0(r15);
                }
                e5.u(o0Var4, true, true, true);
                x1 x1Var3 = p3.n.f135158a;
                o0Var = o0Var4;
            }
            v.h.A(iHashCode6, o0VarE, iHashCode6, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC6, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            if (video == null) {
                o0VarE.C(-1225839458);
                i16 = 0;
                o0VarE.g0(false);
                n1Var = n1Var3;
            } else {
                o0VarE.C(-1225839457);
                w.f118432a.getClass();
                h4.r rVarH2 = x2.h(aVar7, w.f118434c);
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarH2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                n1Var = n1Var3;
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g2, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var3 = u2.f22900a;
                g.a(video, true, z14, o0VarE, ((i15 << 3) & 896) | 48);
                o0VarE.g0(true);
                i16 = 0;
                o0VarE.g0(false);
            }
            h4.r rVarF3 = x2.f(aVar7, 1.0f);
            zVarA = y.a(kVar, aVar8, o0VarE, i16);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarF3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar9);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g2, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (listI.isEmpty()) {
                o0VarE.C(-1356069163);
                h4.r rVarB3 = a2.b(aVar7, a2.a(o0VarE), false);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f15 = eVar5.f97920e;
                bVar5.getClass();
                h4.r rVarZ2 = c2.l.z(rVarB3, f15, eVar5.f97921f);
                bVar5.getClass();
                s2VarA2 = q2.a(c2.j.i(eVar5.f97920e), h4.d.a.f81533k, o0VarE, 0);
                iHashCode5 = Long.hashCode(o0VarE.U);
                i2VarA4 = o0VarE.a0();
                rVarC5 = h4.k.c(rVarZ2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g2, i2VarA4, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar2);
                } else {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar2);
                }
                b4.c(fVar, rVarC5, o0VarE);
                u2 u2Var4 = u2.f22900a;
                o0VarE.C(-323534927);
                i19 = 0;
                o0Var5 = o0VarE;
                while (r0.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        x.q();
                        throw null;
                    }
                    thumbnail = ((o) obj5).getThumbnail();
                    if (thumbnail == null) {
                        o0Var5.C(-1745449373);
                        o0Var5.g0(false);
                        o0Var6 = o0Var5;
                        n1Var2 = n1Var;
                    } else {
                        o0Var5.C(-1745449372);
                        wf.f.a aVar12 = new wf.f.a((Context) o0Var5.A(AndroidCompositionLocals_androidKt.f6042b));
                        aVar12.f184930c = "https://connectvideo.garmin.com/".concat(thumbnail);
                        wf.g.a(aVar12);
                        wf.f fVarA2 = aVar12.a();
                        h4.r.a aVar13 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarU2 = x2.u(aVar13, j92.b.f97901d.f97908g);
                        zK = o0Var5.k(i19);
                        Object objQ5 = o0Var5.q();
                        if (zK) {
                            n1Var2 = n1Var;
                            Object v1Var2 = new v1(i19, n1Var2, 1);
                            o0Var5.K(v1Var2);
                            obj = v1Var2;
                        } else {
                            n1Var2 = n1Var;
                            Object v1Var3 = new v1(i19, n1Var2, 1);
                            o0Var5.K(v1Var3);
                            obj = v1Var3;
                        }
                        h4.r rVarD2 = u1.w.d(rVarU2, false, null, null, (e23.a) obj, 15);
                        if (i19 == n1Var2.getIntValue()) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        h4.r rVarA2 = v2.a(rVarD2, z18, new defpackage.a(29), o0Var5, 0);
                        objQ = o0Var5.q();
                        obj2 = objQ;
                        if (objQ == p3.m.a.f135155b) {
                            Object oVar3 = new b71.o(15);
                            o0Var5.K(oVar3);
                            obj2 = oVar3;
                        }
                        o0Var6 = o0Var5;
                        jf.r.a(fVarA2, null, v.c((e23.l) obj2, rVarA2, false), null, null, null, null, o0Var6, 48, 2040);
                        Unit unit4 = Unit.INSTANCE;
                        o0Var6.g0(false);
                    }
                    n1Var = n1Var2;
                    o0Var5 = o0Var6;
                    i19 = i24;
                }
                o0 o0Var11 = o0Var5;
                th3 = null;
                e5.u(o0Var11, false, true, false);
                o0Var2 = o0Var11;
            } else {
                o0 o0Var12 = o0VarE;
                th3 = null;
                o0Var12.C(-1354484319);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar7, j92.b.f97899b.f97917b, o0Var12, false);
                o0Var2 = o0Var12;
            }
            aVar2 = h4.r.S;
            h4.r rVarE2 = u1.n.e(x2.f(aVar2, 1.0f), am.j.B(d92.b.f58623a, o0Var2), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            aVar3 = h4.d.a.f81536n;
            zVarA2 = y.a(kVar3, aVar3, o0Var2, 0);
            x1 x1Var4 = p3.n.f135158a;
            iHashCode3 = Long.hashCode(o0Var2.U);
            i2VarA2 = o0Var2.a0();
            rVarC3 = h4.k.c(rVarE2, o0Var2);
            h5.g.V.getClass();
            aVar4 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar4);
            } else {
                o0Var2.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0Var2);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0Var2);
            bVar = h5.g.a.f81813j;
            if (o0Var2.T) {
                v.h.A(iHashCode3, o0Var2, iHashCode3, bVar);
            } else {
                v.h.A(iHashCode3, o0Var2, iHashCode3, bVar);
            }
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC3, o0Var2);
            c2.b0 b0Var4 = c2.b0.f22601a;
            difficulty = hVar.getDifficulty();
            if (difficulty == null) {
                o0Var2.C(781529597);
                o0Var2.g0(false);
                aVar5 = aVar2;
                fVar2 = fVar2;
                bVar = bVar;
                z16 = false;
            } else {
                o0Var2.C(781529598);
                if (d53.w.J(difficulty)) {
                    o0Var2.C(-1911770756);
                    a(gl1.y.Q(o0Var2, R.string.difficulty), difficulty, o0Var2, 0);
                    d92.b.f58625c.getClass();
                    aVar5 = aVar2;
                    v5.a(0.0f, 0, 6, 0L, c2.l.C(aVar5, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), o0Var2);
                    z15 = false;
                    o0Var2.g0(false);
                } else {
                    aVar5 = aVar2;
                    z15 = false;
                    o0Var2.C(-1911548765);
                    o0Var2.g0(false);
                }
                o0Var2.g0(z15);
                z16 = z15;
            }
            bodyParts = hVar.getBodyParts();
            if (bodyParts == null) {
                o0Var2.C(781867962);
                o0Var2.g0(z16);
                o0Var4 = o0Var2;
                aVar5 = aVar5;
                r14 = z16;
            } else {
                o0Var2.C(781867963);
                if (d53.w.J(bodyParts)) {
                    o0Var2.C(612738306);
                    a(gl1.y.Q(o0Var2, R.string.muscle_groups), bodyParts, o0Var2, z16 ? 1 : 0);
                    d92.b.f58625c.getClass();
                    o0 o0Var13 = o0Var2;
                    v5.a(0.0f, 0, 6, 0L, c2.l.C(aVar5, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), o0Var13);
                    z17 = false;
                    o0Var13.g0(false);
                    o0Var3 = o0Var13;
                } else {
                    o0 o0Var14 = o0Var2;
                    o0Var14.C(612963180);
                    o0Var14.g0(z16);
                    z17 = z16;
                    o0Var3 = o0Var14;
                }
                o0Var3.g0(z17);
                r14 = z17;
                o0Var4 = o0Var3;
            }
            equipment = hVar.getEquipment();
            if (equipment == null) {
                o0Var4.C(782205831);
                o0Var4.g0(r14);
            } else {
                o0Var4.C(782205832);
                if (d53.w.J(equipment)) {
                    o0Var4.C(-505445586);
                    a(gl1.y.Q(o0Var4, R.string.equipment), equipment, o0Var4, r14);
                    o0Var4.g0(r14);
                } else {
                    o0Var4.C(-505325461);
                    o0Var4.g0(r14);
                }
                o0Var4.g0(r14);
            }
            o0Var4.g0(true);
            h4.r rVarF4 = x2.f(aVar5, 1.0f);
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar6 = j92.b.f97899b;
            h4.r rVarY2 = c2.l.y(rVarF4, eVar6.f97918c);
            bVar6.getClass();
            zVarA3 = y.a(c2.j.i(eVar6.f97918c), aVar3, o0Var4, 0);
            iHashCode4 = Long.hashCode(o0Var4.U);
            i2VarA3 = o0Var4.a0();
            rVarC4 = h4.k.c(rVarY2, o0Var4);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0Var4.z();
            if (o0Var4.T) {
                o0Var4.M(aVar4);
            } else {
                o0Var4.c();
            }
            b4.c(eVar, zVarA3, o0Var4);
            b4.c(c1623g, i2VarA3, o0Var4);
            if (o0Var4.T) {
                v.h.A(iHashCode4, o0Var4, iHashCode4, bVar);
            } else {
                v.h.A(iHashCode4, o0Var4, iHashCode4, bVar);
            }
            b4.c(fVar2, rVarC4, o0Var4);
            listG = hVar.g();
            if (listG == null) {
                o0Var4.C(235332739);
                r15 = 0;
                o0Var4.g0(false);
            } else {
                o0Var4.C(235332740);
                i17 = 0;
                while (r0.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        x.q();
                        throw th3;
                    }
                    instructions = ((d) obj6).getInstructions();
                    if (instructions == null) {
                        o0Var4.C(191911823);
                        o0Var4.g0(false);
                    } else {
                        o0Var4.C(191911824);
                        c(i18, 0, instructions, o0Var4);
                        o0Var4.g0(false);
                    }
                    i17 = i18;
                }
                r15 = 0;
                o0Var4.g0(false);
                Unit unit5 = Unit.INSTANCE;
            }
            listH = hVar.h();
            if (listH == null) {
                o0Var4.C(235569796);
                o0Var4.g0(r15);
            } else {
                o0Var4.C(235569797);
                d(listH, o0Var4, r15);
                o0Var4.g0(r15);
            }
            e5.u(o0Var4, true, true, true);
            x1 x1Var5 = p3.n.f135158a;
            o0Var = o0Var4;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(hVar, z14, aVar, i14, 1);
        }
    }

    public static final void c(int i14, int i15, String str, p3.m mVar) {
        o0 o0Var;
        o0 o0VarE = mVar.E(2075261183);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strP = gl1.y.P(R.string.step_x, new Object[]{Integer.valueOf(i14)}, o0VarE);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            mh.c(strP, c2.l.C(aVar, f14, f15, eVar.f97918c, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            fVar.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
            bVar.getClass();
            float f16 = eVar.f97918c;
            bVar.getClass();
            float f17 = eVar.f97918c;
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(str, c2.l.C(aVar, f16, 0.0f, eVar.f97918c, f17, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, (i16 >> 3) & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(i14, str, i15);
        }
    }

    public static final void d(List<String> list, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-855762117);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (list.isEmpty()) {
                o0Var = o0VarE;
                o0Var.C(917448007);
                o0Var.g0(false);
            } else {
                o0VarE.C(916736867);
                String strQ = gl1.y.Q(o0VarE, R.string.tips);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
                h4.r.a aVar = h4.r.S;
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                bVar.getClass();
                float f15 = eVar.f97918c;
                bVar.getClass();
                mh.c(strQ, c2.l.C(aVar, f14, f15, eVar.f97918c, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                float f16 = eVar.f97917b;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f16);
                h4.d.f81522a.getClass();
                z zVarA = y.a(iVarI, h4.d.a.f81536n, o0Var, 0);
                int iHashCode = Long.hashCode(o0Var.U);
                i2 i2VarA0 = o0Var.a0();
                h4.r rVarC = h4.k.c(aVar, o0Var);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0Var.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0Var);
                b4.c(h5.g.a.f81809f, i2VarA0, o0Var);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0Var);
                c2.b0 b0Var = c2.b0.f22601a;
                o0Var.C(1889731765);
                for (String str : list) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97931h, o0Var);
                    h4.r.a aVar3 = h4.r.S;
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f17 = eVar2.f97918c;
                    bVar3.getClass();
                    o0 o0Var2 = o0Var;
                    mh.c(str, c2.l.C(aVar3, f17, 0.0f, eVar2.f97918c, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var2, 0, 0, 131068);
                    o0Var = o0Var2;
                }
                e5.u(o0Var, false, true, false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 4);
        }
    }
}
