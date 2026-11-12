package e82;

import b82.f0;
import b82.u0;
import b82.w0;
import c2.h2;
import c2.j;
import c2.t0;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e23.l;
import e23.p;
import e23.q;
import e23.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import l72.j0;
import l72.n0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: e82.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1336a implements l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f63443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i53.c<j0> f63444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f82.c f63445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<List<j0>, Integer, Unit> f63446d;

        /* JADX WARN: Multi-variable type inference failed */
        public C1336a(j0 j0Var, i53.c<j0> cVar, f82.c cVar2, p<? super List<j0>, ? super Integer, Unit> pVar) {
            this.f63443a = j0Var;
            this.f63444b = cVar;
            this.f63445c = cVar2;
            this.f63446d = pVar;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.getClass();
            j0 j0Var = this.f63443a;
            if (j0Var.f111075d) {
                ArrayList arrayList = new ArrayList();
                i53.c<j0> cVar = this.f63444b;
                for (j0 j0Var2 : cVar) {
                    if (j0Var2.f111075d) {
                        arrayList.add(j0Var2);
                    }
                }
                int iIndexOf = cVar.indexOf(j0Var);
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(cVar.indexOf((j0) it.next())));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((j0) obj).f111076e) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Integer.valueOf(cVar.indexOf((j0) it3.next())));
                }
                ArrayList arrayListA = this.f63445c.a(arrayList2, arrayList4, iIndexOf);
                ArrayList arrayList5 = new ArrayList(y.r(cVar, 10));
                int i14 = 0;
                for (j0 j0Var3 : cVar) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    j0 j0Var4 = j0Var3;
                    arrayList5.add(j0.a(j0Var4, null, j0Var4.f111075d && arrayListA.contains(Integer.valueOf(i14)), 15));
                    i14 = i15;
                }
                this.f63446d.invoke(arrayList5, Integer.valueOf(iIndexOf));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f63447a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f63448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f63449b;

        public c(l lVar, List list) {
            this.f63448a = lVar;
            this.f63449b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f63448a.invoke(this.f63449b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f63450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i53.c f63451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f82.c f63452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f63453d;

        public d(List list, i53.c cVar, f82.c cVar2, p pVar) {
            this.f63450a = list;
            this.f63451b = cVar;
            this.f63452c = cVar2;
            this.f63453d = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008f  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
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
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                j0 j0Var = (j0) this.f63450a.get(iIntValue);
                mVar2.C(18901021);
                g6.f.a aVar = g6.f.f75994b;
                h4.r rVarC = c2.l.C(h4.r.S, 0.0f, 0.0f, 8, 0.0f, 11);
                boolean zR = mVar2.r(j0Var);
                i53.c cVar = this.f63451b;
                boolean zR2 = zR | mVar2.r(cVar);
                f82.c cVar2 = this.f63452c;
                boolean zR3 = zR2 | mVar2.r(cVar2);
                p pVar = this.f63453d;
                boolean zB = zR3 | mVar2.B(pVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new C1336a(j0Var, cVar, cVar2, pVar);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new C1336a(j0Var, cVar, cVar2, pVar);
                        mVar2.K(objQ);
                    }
                }
                n0.a(rVarC, j0Var, 0L, (l) objQ, mVar2, 6, 4);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<T, Unit> f63454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f63455b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(l<? super T, Unit> lVar, T t7) {
            this.f63454a = lVar;
            this.f63455b = t7;
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
        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            this.f63454a.invoke(this.f63455b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f63456a = new f();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f63457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f63458b;

        public g(l lVar, List list) {
            this.f63457a = lVar;
            this.f63458b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f63457a.invoke(this.f63458b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f63459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f63460b;

        public h(l lVar, List list) {
            this.f63459a = lVar;
            this.f63460b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f63459a.invoke(this.f63460b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f63461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f63462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f63463c;

        public i(List list, q qVar, l lVar) {
            this.f63461a = list;
            this.f63462b = qVar;
            this.f63463c = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
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
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                Object obj = this.f63461a.get(iIntValue);
                mVar2.C(-1542716453);
                j0 j0Var = (j0) this.f63462b.invoke(obj, mVar2, 0);
                h4.r rVarC = e2.d.c(dVar2, h4.r.S);
                l lVar = this.f63463c;
                boolean zB = mVar2.B(lVar) | mVar2.r(obj);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new e(lVar, obj);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new e(lVar, obj);
                        mVar2.K(objQ);
                    }
                }
                n0.d(rVarC, j0Var, (l) objQ, mVar2, 0, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void a(i53.c<j0> cVar, h4.r rVar, f82.c cVar2, p<? super List<j0>, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        boolean z14;
        h4.r rVar3;
        p2 p2VarI0;
        h4.r rVar4;
        j.l lVarI;
        int i17;
        boolean zR;
        int i18;
        cVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(915455022);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i19 = i15 & 2;
        if (i19 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i14 & 512) == 0) {
                    zR = o0VarE.B(cVar2);
                } else {
                    zR = o0VarE.r(cVar2);
                }
                if (zR) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(pVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    rVar2 = rVar4;
                } else {
                    o0VarE.e();
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                if (((double) ((g6.c) o0VarE.A(t1.f91490h)).getF94882b()) >= 1.5d) {
                    j jVar = j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    jVar.getClass();
                    lVarI = j.i(f14);
                } else {
                    j.f22691a.getClass();
                    lVarI = j.f22694d;
                }
                t0.a(rVar2, null, lVarI, null, 0, 0, z3.f.c(1855785747, new a42.a(cVar, 22, cVar2, pVar), o0VarE), o0VarE, ((i16 >> 3) & 14) | 1572864, 58);
            } else {
                o0VarE.e();
            }
            rVar3 = rVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(cVar, rVar3, cVar2, pVar, i14, i15, 6);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        if ((i14 & 384) == 0) {
            if ((i14 & 512) == 0) {
                zR = o0VarE.B(cVar2);
            } else {
                zR = o0VarE.r(cVar2);
            }
            if (zR) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i16 |= i18;
        }
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(pVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                rVar2 = rVar4;
            } else {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                rVar2 = rVar4;
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            if (((double) ((g6.c) o0VarE.A(t1.f91490h)).getF94882b()) >= 1.5d) {
                j jVar2 = j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f15 = j92.b.f97899b.f97918c;
                jVar2.getClass();
                lVarI = j.i(f15);
            } else {
                j.f22691a.getClass();
                lVarI = j.f22694d;
            }
            t0.a(rVar2, null, lVarI, null, 0, 0, z3.f.c(1855785747, new a42.a(cVar, 22, cVar2, pVar), o0VarE), o0VarE, ((i16 >> 3) & 14) | 1572864, 58);
        } else {
            o0VarE.e();
        }
        rVar3 = rVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(cVar, rVar3, cVar2, pVar, i14, i15, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0190  */
    /* JADX WARN: Code duplicated, block: B:121:0x019e  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    public static final void b(i53.c<j0> cVar, f82.c cVar2, i0 i0Var, h4.r rVar, h2 h2Var, p<? super List<j0>, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        h2 h2Var2;
        boolean z14;
        o0 o0Var;
        h4.r rVar3;
        h2 h2Var3;
        Object obj;
        p2 p2VarI0;
        h4.r rVar4;
        h4.r rVar5;
        h2 h2VarC;
        boolean z15;
        boolean z16;
        Object objQ;
        int i17;
        int i18;
        Object bVar = cVar2;
        cVar.getClass();
        i0Var.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(1170267470);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) != 0) {
                i18 = 16;
            } else {
                if ((i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
            }
            i16 |= i18;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(i0Var) ? 256 : 128;
        }
        int i19 = i15 & 8;
        if (i19 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    h2Var2 = h2Var;
                    int i24 = o0VarE.B(h2Var2) ? 16384 : 8192;
                    i16 |= i24;
                } else {
                    h2Var2 = h2Var;
                }
                i16 |= i24;
            } else {
                h2Var2 = h2Var;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(pVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i16 |= i17;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 2) != 0) {
                        bVar = new f82.b();
                        i16 &= -113;
                    }
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i15 & 16) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i16 &= -57345;
                        rVar5 = rVar4;
                        h2VarC = c2.l.c(j92.b.f97899b.f97920e, 0.0f, 2);
                    } else {
                        rVar5 = rVar4;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    if ((i16 & 14) != 4 || ((i16 & 8) != 0 && o0VarE.r(cVar))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.r(bVar)) || (i16 & 48) == 32) | ((458752 & i16) == 131072);
                    objQ = o0VarE.q();
                    if (z16) {
                        objQ = new ci0.b(cVar, 15, bVar, pVar);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ci0.b(cVar, 15, bVar, pVar);
                            o0VarE.K(objQ);
                        }
                    }
                    o0Var = o0VarE;
                    e2.c.c(rVar5, i0Var, h2VarC, null, null, null, false, null, (l) objQ, o0Var, ((i16 >> 9) & 14) | ((i16 >> 3) & 112) | ((i16 >> 6) & 896), 504);
                    rVar3 = rVar5;
                    h2Var3 = h2VarC;
                } else {
                    o0VarE.e();
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                    }
                    rVar5 = rVar2;
                }
                h2VarC = h2Var2;
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                if ((i16 & 14) != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z16 = z15 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.r(bVar)) || (i16 & 48) == 32) | ((458752 & i16) == 131072);
                objQ = o0VarE.q();
                if (z16) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ci0.b(cVar, 15, bVar, pVar);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new ci0.b(cVar, 15, bVar, pVar);
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                e2.c.c(rVar5, i0Var, h2VarC, null, null, null, false, null, (l) objQ, o0Var, ((i16 >> 9) & 14) | ((i16 >> 3) & 112) | ((i16 >> 6) & 896), 504);
                rVar3 = rVar5;
                h2Var3 = h2VarC;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                h2Var3 = h2Var2;
            }
            obj = bVar;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0((Object) cVar, obj, (Object) i0Var, (Object) rVar3, (Object) h2Var3, (p) pVar, i14, i15, 3);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                h2Var2 = h2Var;
                if (o0VarE.B(h2Var2)) {
                }
                i16 |= i24;
            } else {
                h2Var2 = h2Var;
            }
            i16 |= i24;
        } else {
            h2Var2 = h2Var;
        }
        if ((196608 & i14) == 0) {
            if (o0VarE.r(pVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i16 |= i17;
        }
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 2) != 0) {
                    bVar = new f82.b();
                    i16 &= -113;
                }
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 16) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i16 &= -57345;
                    rVar5 = rVar4;
                    h2VarC = c2.l.c(j92.b.f97899b.f97920e, 0.0f, 2);
                } else {
                    rVar5 = rVar4;
                    h2VarC = h2Var2;
                }
            } else {
                if ((i15 & 2) != 0) {
                    bVar = new f82.b();
                    i16 &= -113;
                }
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 16) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i16 &= -57345;
                    rVar5 = rVar4;
                    h2VarC = c2.l.c(j92.b.f97899b.f97920e, 0.0f, 2);
                } else {
                    rVar5 = rVar4;
                    h2VarC = h2Var2;
                }
            }
            o0VarE.h0();
            x1 x1Var3 = n.f135158a;
            if ((i16 & 14) != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            z16 = z15 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.r(bVar)) || (i16 & 48) == 32) | ((458752 & i16) == 131072);
            objQ = o0VarE.q();
            if (z16) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ci0.b(cVar, 15, bVar, pVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ci0.b(cVar, 15, bVar, pVar);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            e2.c.c(rVar5, i0Var, h2VarC, null, null, null, false, null, (l) objQ, o0Var, ((i16 >> 9) & 14) | ((i16 >> 3) & 112) | ((i16 >> 6) & 896), 504);
            rVar3 = rVar5;
            h2Var3 = h2VarC;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            h2Var3 = h2Var2;
        }
        obj = bVar;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0((Object) cVar, obj, (Object) i0Var, (Object) rVar3, (Object) h2Var3, (p) pVar, i14, i15, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:104:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x013f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0142  */
    /* JADX WARN: Code duplicated, block: B:99:0x014c  */
    public static final <T> void c(i53.c<? extends T> cVar, q<? super T, ? super m, ? super Integer, j0> qVar, i0 i0Var, h4.r rVar, l<? super T, ? extends Object> lVar, h2 h2Var, l<? super T, Unit> lVar2, m mVar, int i14, int i15) {
        int i16;
        Object obj;
        Object obj2;
        h2 h2VarC;
        Object obj3;
        o0 o0Var;
        h2 h2Var2;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objQ;
        cVar.getClass();
        i0Var.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1632717507);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = qVar;
            i16 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = qVar;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(i0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj2 = lVar;
            i16 |= o0VarE.r(obj2) ? 16384 : 8192;
        } else {
            obj2 = lVar;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                h2VarC = h2Var;
                int i18 = o0VarE.B(h2VarC) ? 131072 : 65536;
                i16 |= i18;
            } else {
                h2VarC = h2Var;
            }
            i16 |= i18;
        } else {
            h2VarC = h2Var;
        }
        if ((1572864 & i14) == 0) {
            obj3 = lVar2;
            i16 |= o0VarE.r(obj3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            obj3 = lVar2;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 32) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i17 = i16 & (-458753);
                    h2VarC = c2.l.c(j92.b.f97899b.f97920e, 0.0f, 2);
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                h4.r rVarF = x2.f(rVar, 1.0f);
                j jVar = j.f22691a;
                g6.f.a aVar = g6.f.f75994b;
                jVar.getClass();
                j.i iVarI = j.i(8);
                if ((i17 & 14) != 4 || ((i17 & 8) != 0 && o0VarE.r(cVar))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((57344 & i17) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z18 = z14 | z15;
                if ((i17 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z18 | z16 | ((3670016 & i17) == 1048576);
                objQ = o0VarE.q();
                if (z17) {
                    a03.n0 n0Var = new a03.n0(cVar, obj2, obj, obj3, 27);
                    o0VarE.K(n0Var);
                    objQ = n0Var;
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        a03.n0 n0Var2 = new a03.n0(cVar, obj2, obj, obj3, 27);
                        o0VarE.K(n0Var2);
                        objQ = n0Var2;
                    }
                }
                h2Var2 = h2VarC;
                o0Var = o0VarE;
                e2.c.c(rVarF, i0Var, h2Var2, iVarI, null, null, false, null, (l) objQ, o0Var, ((i17 >> 3) & 112) | 24576 | ((i17 >> 9) & 896), 488);
            } else {
                o0VarE.e();
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                }
            }
            i17 = i16;
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            h4.r rVarF2 = x2.f(rVar, 1.0f);
            j jVar2 = j.f22691a;
            g6.f.a aVar2 = g6.f.f75994b;
            jVar2.getClass();
            j.i iVarI2 = j.i(8);
            if ((i17 & 14) != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            if ((57344 & i17) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z19 = z14 | z15;
            if ((i17 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z19 | z16 | ((3670016 & i17) == 1048576);
            objQ = o0VarE.q();
            if (z17) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    a03.n0 n0Var3 = new a03.n0(cVar, obj2, obj, obj3, 27);
                    o0VarE.K(n0Var3);
                    objQ = n0Var3;
                }
            } else {
                a03.n0 n0Var4 = new a03.n0(cVar, obj2, obj, obj3, 27);
                o0VarE.K(n0Var4);
                objQ = n0Var4;
            }
            h2Var2 = h2VarC;
            o0Var = o0VarE;
            e2.c.c(rVarF2, i0Var, h2Var2, iVarI2, null, null, false, null, (l) objQ, o0Var, ((i17 >> 3) & 112) | 24576 | ((i17 >> 9) & 896), 488);
        } else {
            o0Var = o0VarE;
            o0Var.e();
            h2Var2 = h2VarC;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w0(cVar, qVar, i0Var, rVar, lVar, h2Var2, lVar2, i14, i15, 2);
        }
    }
}
