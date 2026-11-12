package ny0;

import a42.d0;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bq0.k;
import c2.a0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import ds.g0;
import e23.l;
import e23.p;
import gl1.y;
import h2.j0;
import h2.u;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.List;
import l72.f0;
import o13.r;
import o53.b0;
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
import p3.p2;
import p3.x1;
import r53.c2;
import r53.j;
import v13.i;
import v62.b8;
import v62.k6;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.summary.MultiDayActivitySummaryKt$SummaryActivityCharts$2$1", f = "MultiDayActivitySummary.kt", l = {281}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f128330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Unit> f128331c;

        /* JADX INFO: renamed from: ny0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2463a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l<Integer, Unit> f128332a;

            /* JADX WARN: Multi-variable type inference failed */
            public C2463a(l<? super Integer, Unit> lVar) {
                this.f128332a = lVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f128332a.invoke(new Integer(((Number) obj).intValue()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j0 j0Var, l<? super Integer, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f128330b = j0Var;
            this.f128331c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f128330b, this.f128331c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128329a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new g0(this.f128330b, 9));
                C2463a c2463a = new C2463a(this.f128331c);
                this.f128329a = 1;
                if (c2VarS.collect(c2463a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public static final void a(int i14, boolean z14, e23.a<Unit> aVar, l<? super List<k>, Unit> lVar, m mVar, int i15) {
        o0 o0VarE = mVar.E(1106872743);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i17 = 10 - i14;
            boolean z15 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new na0.l(lVar, 4);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 4);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVarF = y22.e.f((l) objQ, o0VarE, i17, 0);
            if (z14) {
                o0VarE.C(-1912447246);
                if (i14 >= 10) {
                    o0VarE.C(-1912289704);
                    Toast.makeText(context, y.Q(o0VarE, R.string.activities_photo_limit_message), 0).show();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1912351704);
                    o0VarE.g0(false);
                    aVarF.invoke();
                }
                aVar.invoke();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1912038821);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(i14, z14, aVar, lVar, i15);
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
    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(1309904787);
        int i15 = (o0VarE.r(aVar2) ? 32 : 16) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            g.V.getClass();
            e0.a aVar4 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            f0.a aVar5 = f0.a.f111000a;
            String strQ = y.Q(o0VarE, R.string.social_photo);
            s62.a.f157643a.getClass();
            t62.b bVar2 = t62.b.f162798a;
            aVar5.h(24576, 8, aVar, u2Var.a(aVar3, 0.5f, true), strQ, o0VarE, k6.a(bVar2), false);
            if (s3.b()) {
                o0VarE.C(1049821555);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1049494815);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.u(aVar3, j92.b.f97899b.f97920e), o0VarE);
                aVar5.h((i15 << 9) & 57344, 8, aVar2, u2Var.a(aVar3, 0.5f, true), y.Q(o0VarE, R.string.lbl_share), o0VarE, b8.a(bVar2), false);
                o0VarE.g0(false);
            }
            o0VarE.g0(i16);
        } else {
            i16 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    public static final void c(final a0 a0Var, final i53.c<cy0.n> cVar, final iy0.f fVar, final sy0.l lVar, final int i14, final l<? super Integer, Unit> lVar2, m mVar, final int i15) {
        a0 a0Var2;
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(-340934693);
        int i16 = i15 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(fVar) ? 256 : 128) | (o0VarE.B(lVar) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            boolean z14 = fVar != null && (fVar.f95790a.isEmpty() ^ true);
            i53.c<cy0.f> cVar2 = lVar != null ? lVar.f161249a : null;
            boolean z15 = cVar2 == null || cVar2.isEmpty();
            if (z14 || !z15) {
                ArrayList arrayList = new ArrayList();
                if (z14) {
                    arrayList.add(f.a.f128341a);
                }
                if (!z15) {
                    arrayList.add(f.b.f128342a);
                }
                i53.f fVarJ = i53.a.j(arrayList);
                int size = fVarJ.size();
                boolean zK = o0VarE.k(size);
                Object objQ = o0VarE.q();
                m.a aVar = m.f135153a;
                if (zK) {
                    objQ = new a51.c(size, 12);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a51.c(size, 12);
                        o0VarE.K(objQ);
                    }
                }
                h2.b bVarB = h2.o0.b(i14, (e23.a) objQ, o0VarE, (i16 >> 12) & 14, 2);
                boolean zB = o0VarE.B(bVarB) | ((i16 & 458752) == 131072);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new a(bVarB, lVar2, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new a(bVarB, lVar2, null);
                        o0VarE.K(objQ2);
                    }
                }
                l0.e((p) objQ2, bVarB, o0VarE);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                float f15 = eVar.f97920e;
                bVar.getClass();
                o0Var = o0VarE;
                u.a(bVarB, null, c2.l.e(0.0f, 0.0f, 0.0f, f15, 7), null, 0, f14, null, null, false, null, null, null, null, z3.f.c(-327448198, new d0(fVarJ, fVar, lVar, cVar, 28), o0VarE), o0Var, 0, 24576, 16346);
                if (size > 1) {
                    o0Var.C(814074236);
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    a0Var2 = a0Var;
                    h4.r rVarB = a0Var2.b(aVar2, h4.d.a.f81537o);
                    bVar.getClass();
                    h4.r rVarA = c2.l.A(rVarB, f15, 0.0f, 2);
                    bVar.getClass();
                    l02.f.a(bVarB, rVarA, size, i14, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0Var, (i16 >> 3) & 7168, 944);
                    o0Var.g0(false);
                } else {
                    a0Var2 = a0Var;
                    o0Var.C(814429031);
                    o0Var.g0(false);
                }
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p(a0Var, cVar, fVar, lVar, i14, lVar2, i15, i17) { // from class: ny0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f128322a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a0 f128323b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ i53.c f128324c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ iy0.f f128325d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ sy0.l f128326e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f128327f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ l f128328g;

                    {
                        this.f128322a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f128322a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(7);
                                c.c(this.f128323b, this.f128324c, this.f128325d, this.f128326e, this.f128327f, this.f128328g, (m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(7);
                                c.c(this.f128323b, this.f128324c, this.f128325d, this.f128326e, this.f128327f, this.f128328g, (m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        a0Var2 = a0Var;
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            final a0 a0Var3 = a0Var2;
            pVar = new p(a0Var3, cVar, fVar, lVar, i14, lVar2, i15, i18) { // from class: ny0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f128322a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0 f128323b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i53.c f128324c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ iy0.f f128325d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ sy0.l f128326e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f128327f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l f128328g;

                {
                    this.f128322a = i18;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f128322a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(7);
                            c.c(this.f128323b, this.f128324c, this.f128325d, this.f128326e, this.f128327f, this.f128328g, (m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(7);
                            c.c(this.f128323b, this.f128324c, this.f128325d, this.f128326e, this.f128327f, this.f128328g, (m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
