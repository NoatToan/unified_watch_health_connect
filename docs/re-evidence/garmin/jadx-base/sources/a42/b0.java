package a42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.y1;
import c2.x2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.composables.screen.VO2MaxReportScreenKt$VO2MaxReportScreen$1$3$1$1$1", f = "VO2MaxReportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<q71.e, Unit> f976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q71.e f977b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super q71.e, Unit> lVar, q71.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f976a = lVar;
            this.f977b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f976a, this.f977b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f976a.invoke(this.f977b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(q71.c cVar, d42.a aVar, q71.e eVar, h4.r rVar, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z14;
        o0 o0Var;
        h4.r rVar3;
        p2 p2VarI0;
        h4.r rVar4;
        String str;
        int i18;
        o0 o0VarE = mVar.E(1902509197);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 256 : 128;
        }
        int i19 = i15 & 8;
        if (i19 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(aVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            i17 = i16;
            if ((i17 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                z32.d.a(eVar, cVar, c2.l.A(rVar4, eVar2.f97920e, 0.0f, 2), 0.0f, 0.0f, 0, 0.0f, o0VarE, ((i17 >> 6) & 14) | ((i17 << 3) & 112));
                h4.r.a aVar3 = h4.r.S;
                bVar.getClass();
                c2.l.f(x2.q(aVar3, eVar2.f97922g), o0VarE);
                bVar.getClass();
                h4.r rVarA = c2.l.A(aVar3, eVar2.f97921f, 0.0f, 2);
                if (aVar != null) {
                    str = aVar.f57474d;
                } else {
                    str = null;
                }
                y32.a.a(rVarA, str, aVar != null ? aVar.f57475e : null, aVar2, o0VarE, (i17 >> 3) & 7168, 0);
                o0Var = o0VarE;
                rVar3 = rVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0(cVar, aVar, eVar, rVar3, aVar2, i14, i15, 0);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(aVar2)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i16 |= i18;
        }
        i17 = i16;
        if ((i17 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            if (i19 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            z32.d.a(eVar, cVar, c2.l.A(rVar4, eVar3.f97920e, 0.0f, 2), 0.0f, 0.0f, 0, 0.0f, o0VarE, ((i17 >> 6) & 14) | ((i17 << 3) & 112));
            h4.r.a aVar4 = h4.r.S;
            bVar2.getClass();
            c2.l.f(x2.q(aVar4, eVar3.f97922g), o0VarE);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(aVar4, eVar3.f97921f, 0.0f, 2);
            if (aVar != null) {
                str = aVar.f57474d;
            } else {
                str = null;
            }
            y32.a.a(rVarA2, str, aVar != null ? aVar.f57475e : null, aVar2, o0VarE, (i17 >> 3) & 7168, 0);
            o0Var = o0VarE;
            rVar3 = rVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(cVar, aVar, eVar, rVar3, aVar2, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0253  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [int] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r9v10 */
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
    public static final void b(q71.d dVar, d42.b bVar, q71.e eVar, e23.a<Unit> aVar, e23.l<? super q71.e, Unit> lVar, p3.m mVar, int i14) {
        boolean z14;
        String strT;
        i53.d<q71.e, d42.a> dVar2;
        i53.e eVar2;
        boolean z15;
        Iterable iterable;
        ?? r17;
        i53.d<q71.e, d42.a> dVar3;
        i53.e eVar3;
        ?? r14;
        i53.d<q71.e, d42.a> dVar4;
        i53.d<q71.e, d42.a> dVar5;
        q71.d dVar6 = dVar;
        d42.b bVar2 = bVar;
        o0 o0VarO = androidx.room.a0.o(aVar, lVar, mVar, -2071827841);
        int i15 = i14 | (o0VarO.B(dVar6) ? 4 : 2) | (o0VarO.B(bVar2) ? 32 : 16) | (o0VarO.k(eVar == null ? -1 : eVar.ordinal()) ? 256 : 128) | (o0VarO.r(aVar) ? 2048 : 1024) | (o0VarO.r(lVar) ? 16384 : 8192);
        if (o0VarO.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarO, 48);
            int iHashCode = Long.hashCode(o0VarO.U);
            i2 i2VarA0 = o0VarO.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarO);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarO.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarO.z();
            if (o0VarO.T) {
                o0VarO.M(aVar4);
            } else {
                o0VarO.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarO);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarO);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarO.T || !p005kotlin.jvm.internal.s.g(o0VarO.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarO, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarO);
            c2.b0 b0Var = c2.b0.f22601a;
            if (((bVar2 == null || (dVar5 = bVar2.f57477a) == null) ? 0 : dVar5.size()) > 1) {
                o0VarO.C(1407903983);
                y1 y1Var = y1.f16902a;
                i53.e eVar4 = (bVar2 == null || (dVar4 = bVar2.f57477a) == null) ? null : (i53.e) dVar4.keySet();
                if (eVar4 == null) {
                    o0VarO.C(1407990131);
                    o0VarO.g0(false);
                    iterable = null;
                    z15 = false;
                } else {
                    o0VarO.C(1407990132);
                    ArrayList arrayList = new ArrayList(p13.y.r(eVar4, 10));
                    Iterator it = eVar4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gl1.y.Q(o0VarO, ((q71.e) it.next()).f143244a));
                    }
                    z15 = false;
                    o0VarO.g0(false);
                    iterable = arrayList;
                }
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                i53.c<String> cVarE = i53.a.e(iterable);
                if (bVar2 == null || (dVar3 = bVar2.f57477a) == null || (eVar3 = (i53.e) dVar3.keySet()) == null) {
                    r17 = z15;
                } else {
                    Iterator it3 = eVar3.iterator();
                    ?? r18 = z15;
                    while (true) {
                        if (!it3.hasNext()) {
                            r14 = -1;
                            break;
                        }
                        Object next = it3.next();
                        if (r18 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        if (((q71.e) next) == eVar ? true : z15) {
                            r14 = r18;
                            break;
                        }
                        r18++;
                    }
                    if (r14 < 0) {
                        r17 = z15;
                    } else {
                        r17 = r14;
                    }
                }
                y yVar = new y(bVar2, dVar6, aVar, lVar, 0);
                bVar2 = bVar2;
                dVar6 = dVar6;
                z3.e eVarC = z3.f.c(-206361946, yVar, o0VarO);
                y1 y1Var2 = y1.f16902a;
                z14 = true;
                y1Var.c(cVarE, r17 == true ? 1 : 0, false, true, true, 0L, 0L, eVarC, o0VarO, 12610560, 100);
                o0VarO = o0VarO;
                o0VarO.g0(z15);
            } else {
                z14 = true;
                o0VarO.C(1409219003);
                q71.e eVar5 = (bVar2 == null || (dVar2 = bVar2.f57477a) == null || (eVar2 = (i53.e) dVar2.keySet()) == null) ? null : (q71.e) p13.h0.c0(eVar2);
                if (eVar5 == null) {
                    o0VarO.C(1409323596);
                    o0VarO.g0(false);
                    strT = null;
                } else {
                    o0VarO.C(1409323597);
                    strT = gl1.d.T(eVar5.f143245b, o0VarO, 0);
                    o0VarO.g0(false);
                }
                if (strT == null) {
                    o0VarO.C(1409411233);
                    o0VarO.g0(false);
                } else {
                    o0VarO.C(1409411234);
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    h4.r rVarC2 = c2.l.C(rVarF, 0.0f, eVar6.f97918c, 0.0f, 0.0f, 13);
                    bVar4.getClass();
                    h4.r rVarA = c2.l.A(rVarC2, eVar6.f97920e, 0.0f, 2);
                    boolean zB = o0VarO.B(strT) | o0VarO.r(context);
                    Object objQ = o0VarO.q();
                    if (zB) {
                        objQ = new b(strT, context, 1);
                        o0VarO.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b(strT, context, 1);
                            o0VarO.K(objQ);
                        }
                    }
                    h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarA, false);
                    d92.b.f58624b.getClass();
                    g02.c.a(strT, rVarC3, 0L, null, 0, false, 2, d92.c.b(d92.c.e(j92.f.f97931h), o0VarO), 0.0d, o0VarO, 1572864, 316);
                    o0VarO = o0VarO;
                    o0VarO.g0(false);
                }
                a(dVar6 != null ? dVar6.f143238a.get(eVar5) : null, bVar2 != null ? bVar2.f57477a.get(eVar5) : null, eVar5, null, aVar, o0VarO, (i15 << 3) & 57344, 8);
                o0VarO.g0(false);
            }
            o0VarO.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) dVar6, (Object) bVar2, (Object) eVar, (Object) aVar, (Object) lVar, i14, 0);
        }
    }
}
