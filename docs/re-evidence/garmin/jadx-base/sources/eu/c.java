package eu;

import a03.n0;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.a0;
import b5.h0;
import b5.s0;
import c2.j;
import c2.l2;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import d50.i;
import e11.c0;
import e11.f0;
import e23.l;
import e23.p;
import f5.z0;
import h4.k;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.q1;
import i3.r1;
import i3.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l72.w;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import p3.b4;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Leu/c;", "", "<init>", "()V", "", "isChecked", "isShareEnabled", "isShowBlockingDialog", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f66055a = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<h, Boolean, Unit> f66056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f66057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f66058c;

        /* JADX INFO: renamed from: eu.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.share.AnnualReportMultipleShareComposable$SelectableImageView$1$1$1", f = "AnnualReportMultipleShareComposable.kt", l = {130, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
        public static final class C1388a extends v13.h implements p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a0 f66059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f66060b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f66061c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f66062d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f66063e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<h, Boolean, Unit> f66064f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ h f66065g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f66066h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1388a(p<? super h, ? super Boolean, Unit> pVar, h hVar, p1<Boolean> p1Var, t13.d<? super C1388a> dVar) {
                super(2, dVar);
                this.f66064f = pVar;
                this.f66065g = hVar;
                this.f66066h = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1388a c1388a = new C1388a(this.f66064f, this.f66065g, this.f66066h, dVar);
                c1388a.f66063e = obj;
                return c1388a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C1388a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0028  */
            /* JADX WARN: Code duplicated, block: B:14:0x0037 A[PHI: r13
              0x0037: PHI (r13v1 java.lang.Object) = (r13v10 java.lang.Object), (r13v0 java.lang.Object) binds: [B:12:0x0034, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0041 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:24:0x0069). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = r12.f66063e
                    b5.c r0 = (b5.c) r0
                    u13.a r1 = u13.a.COROUTINE_SUSPENDED
                    int r2 = r12.f66062d
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L25
                    if (r2 == r4) goto L21
                    if (r2 != r3) goto L1b
                    long r6 = r12.f66061c
                    long r8 = r12.f66060b
                    b5.a0 r2 = r12.f66059a
                    o13.r.b(r13)
                    goto L69
                L1b:
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r13)
                    return r5
                L21:
                    o13.r.b(r13)
                    goto L37
                L25:
                    o13.r.b(r13)
                L28:
                    r12.f66063e = r0
                    r12.f66059a = r5
                    r12.f66062d = r4
                    b5.s r13 = b5.s.Main
                    java.lang.Object r13 = r0.W0(r13, r12)
                    if (r13 != r1) goto L37
                    goto L68
                L37:
                    b5.q r13 = (b5.q) r13
                    java.util.List<b5.a0> r13 = r13.f15870a
                    java.lang.Object r13 = p13.h0.d0(r13)
                    b5.a0 r13 = (b5.a0) r13
                    if (r13 == 0) goto L28
                    boolean r2 = b5.r.b(r13)
                    if (r2 == 0) goto L4b
                    r2 = r13
                    goto L4c
                L4b:
                    r2 = r5
                L4c:
                    if (r2 == 0) goto L28
                    long r8 = java.lang.System.currentTimeMillis()
                    long r6 = r2.f15750c
                    r12.f66063e = r0
                    r12.f66059a = r2
                    r12.f66060b = r8
                    r12.f66061c = r6
                    r12.f66062d = r3
                    y1.k3$a r13 = p008y1.k3.f193358a
                    b5.s r13 = b5.s.Main
                    java.lang.Object r13 = p008y1.k3.j(r0, r13, r12)
                    if (r13 != r1) goto L69
                L68:
                    return r1
                L69:
                    b5.a0 r13 = (b5.a0) r13
                    if (r13 != 0) goto L6e
                    goto L28
                L6e:
                    long r10 = java.lang.System.currentTimeMillis()
                    long r10 = r10 - r8
                    r8 = 200(0xc8, double:9.9E-322)
                    int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                    if (r8 >= 0) goto L28
                    long r8 = r13.f15750c
                    long r6 = n4.c.i(r8, r6)
                    float r6 = n4.c.f(r6)
                    r7 = 1120403456(0x42c80000, float:100.0)
                    int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                    if (r6 >= 0) goto L28
                    r2.a()
                    r13.a()
                    eu.c r13 = eu.c.f66055a
                    p3.p1<java.lang.Boolean> r13 = r12.f66066h
                    java.lang.Object r2 = r13.getF182175a()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    r2 = r2 ^ r4
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    r13.setValue(r2)
                    java.lang.Object r13 = r13.getF182175a()
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    r13.getClass()
                    e23.p<eu.h, java.lang.Boolean, kotlin.Unit> r2 = r12.f66064f
                    eu.h r6 = r12.f66065g
                    r2.invoke(r6, r13)
                    goto L28
                */
                throw new UnsupportedOperationException("Method not decompiled: eu.c.a.C1388a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.share.AnnualReportMultipleShareComposable$SelectableImageView$1$1", f = "AnnualReportMultipleShareComposable.kt", l = {128}, m = "invoke", v = 2)
        public static final class b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public h0 f66067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f66068b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f66070d;

            public b(t13.d<? super b> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f66068b = obj;
                this.f66070d |= Integer.MIN_VALUE;
                return a.this.invoke(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super h, ? super Boolean, Unit> pVar, h hVar, p1<Boolean> p1Var) {
            this.f66056a = pVar;
            this.f66057b = hVar;
            this.f66058c = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i14 = bVar.f66070d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f66070d = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f66068b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f66070d;
            try {
                if (i15 == 0) {
                    r.b(obj);
                    C1388a c1388a = new C1388a(this.f66056a, this.f66057b, this.f66058c, null);
                    bVar.f66067a = h0Var;
                    bVar.f66070d = 1;
                    if (h0Var.R(c1388a, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                String strN = fb1.c.n("Error during pointer event processing: ", e4.getMessage());
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "AnnualReportMultipleShareActivity", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements p<h, Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<h, Boolean, Unit> f66071a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super h, ? super Boolean, Unit> pVar) {
            this.f66071a = pVar;
        }

        @Override // e23.p
        public final Unit invoke(h hVar, Boolean bool) {
            h hVar2 = hVar;
            Boolean bool2 = bool;
            bool2.booleanValue();
            hVar2.getClass();
            this.f66071a.invoke(hVar2, bool2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: eu.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1389c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1389c f66072a = new C1389c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f66073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f66074b;

        public d(l lVar, List list) {
            this.f66073a = lVar;
            this.f66074b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f66073a.invoke(this.f66074b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<f2.r, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f66075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f66076b;

        public e(List list, p pVar) {
            this.f66075a = list;
            this.f66076b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0068  */
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
        public final Unit invoke(f2.r rVar, Integer num, m mVar, Integer num2) {
            int i14;
            f2.r rVar2 = rVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
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
                x1 x1Var = n.f135158a;
                h hVar = (h) this.f66075a.get(iIntValue);
                mVar2.C(1110246359);
                c cVar = c.f66055a;
                p pVar = this.f66076b;
                boolean zB = mVar2.B(pVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new b(pVar);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new b(pVar);
                        mVar2.K(objQ);
                    }
                }
                cVar.a(hVar, (p) objQ, mVar2, 384);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(h hVar, p<? super h, ? super Boolean, Unit> pVar, m mVar, int i14) {
        hVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-2141313269);
        int i15 = (o0VarE.r(hVar) ? 4 : 2) | i14 | (o0VarE.r(pVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(hVar.f66089c, o0VarE);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarG = c2.l.g(x2.f(aVar, 1.0f), 1.0f);
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i15 & 112) == 32) | o0VarE.r(hVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(pVar, hVar, p1Var);
                o0VarE.K(objQ2);
            }
            h4.r rVarB = s0.b(rVarG, unit, (PointerInputEventHandler) objQ2);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarB, o0VarE);
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
            h4.r rVarD = x2.d(aVar, 1.0f);
            wf.f.a aVar3 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar3.f184930c = hVar.f66087a;
            wf.c cVar = wf.c.DISABLED;
            aVar3.f184942o = cVar;
            aVar3.f184943p = cVar;
            jf.r.a(aVar3.a(), "", rVarD, null, null, null, null, o0VarE, 432, 2040);
            float fQ = gl.b.q(o0VarE, R.dimen.icon_medium);
            r1 r1Var = r1.f89474a;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).f().a();
            r1Var.getClass();
            q1 q1VarA = r1.a(jA, 0L, o0VarE, 62);
            h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81532j);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarR = x2.r(c2.l.y(rVarC2, eVar.f97917b), fQ, fQ);
            bVar2.getClass();
            s1.a(((Boolean) p1Var.getF182175a()).booleanValue(), null, c2.l.y(rVarR, eVar.f97918c), false, q1VarA, o0VarE, 48, 40);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(this, hVar, pVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void b(List list, int i14, e23.a aVar, m mVar, int i15) {
        Object obj;
        list.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(555465528);
        int i16 = (i15 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            int i17 = 6;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            boolean zC = ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).c();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                int i18 = 0;
                for (Object obj2 : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        x.q();
                        throw null;
                    }
                    g gVar = (g) obj2;
                    arrayList.add(new h(gVar.f66085b, gVar.f66084a, i18 == i14));
                    i18 = i19;
                }
                h[] hVarArr = (h[]) arrayList.toArray(new h[0]);
                Object[] objArrCopyOf = Arrays.copyOf(hVarArr, hVarArr.length);
                f4.s sVar = new f4.s();
                sVar.addAll(p13.u.i0(objArrCopyOf));
                o0VarE.K(sVar);
                obj = sVar;
            } else {
                obj = objQ4;
            }
            f4.s sVar2 = (f4.s) obj;
            String strQ = gl1.y.Q(o0VarE, R.string.annual_report_share_image_sheet_title);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_share);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-631939777);
                Object objQ5 = o0VarE.q();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new et1.a2(p1Var2, 2);
                    o0VarE.K(objQ5);
                }
                c((e23.a) objQ5, o0VarE, ((i16 >> 6) & 112) | 6);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-631836950);
                o0VarE.g0(false);
            }
            w wVar = w.f111301a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.annual_report_intro_rundown);
            z3.e eVarC = z3.f.c(-1273615569, new defpackage.d(strQ2, zC, context, strQ, p1Var, sVar2, p1Var2), o0VarE);
            int i24 = i16 & 896;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | (i24 == 256);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == m.a.f135155b) {
                objQ6 = new eu.b(b0Var, aVar, mcVarF, 0);
                o0VarE.K(objQ6);
            }
            wVar.d(strQ3, eVarC, (e23.a) objQ6, mcVarF, null, null, z3.f.c(-1989794694, new c0(i17, sVar2, p1Var), o0VarE), o0VarE, 1572912, 48);
            boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | (i24 == 256) | o0VarE.r(context);
            Object objQ7 = o0VarE.q();
            if (zR2 || objQ7 == m.a.f135155b) {
                n0 n0Var = new n0(context, b0Var, aVar, mcVarF, 29);
                o0VarE.K(n0Var);
                objQ7 = n0Var;
            }
            l0.b(context, "com.garmin.android.apps.connectmobile.SHARE_FILTER", (l) objQ7, o0VarE);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(this, list, i14, aVar, i15, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    public final void c(e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(361279213);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 0;
        char c14 = 29;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            g82.c cVar = g82.c.f76436a;
            String strQ = gl1.y.Q(o0VarE, R.string.annual_report_entrance_testing_hint);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            int i17 = i15 & 14;
            boolean z14 = i17 == 4;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new e52.c(aVar, 29);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e52.c(aVar, 29);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z15 = i17 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new eu.a(aVar, i16);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new eu.a(aVar, i16);
                    o0VarE.K(objQ2);
                }
            }
            cVar.c(null, null, strQ, 0, strQ2, aVar3, null, null, false, (e23.a) objQ2, o0VarE, 0, 459);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(this, aVar, i14, c14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    public final void d(String str, List<h> list, p<? super h, ? super Boolean, Unit> pVar, m mVar, int i14) {
        str.getClass();
        list.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(600450983);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            f2.b.C1415b c1415b = new f2.b.C1415b(2);
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97918c;
            l2 l2VarA = c2.l.a(f14);
            j jVar = j.f22691a;
            bVar.getClass();
            jVar.getClass();
            j.i iVarI = j.i(f15);
            bVar.getClass();
            j.i iVarI2 = j.i(f15);
            boolean zR = o0VarE.r(list) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ci0.b(list, 19, str, pVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ci0.b(list, 19, str, pVar);
                    o0VarE.K(objQ);
                }
            }
            f2.j.a(c1415b, rVarD, null, l2VarA, iVarI2, iVarI, null, false, null, (l) objQ, o0VarE, 48, 0, 916);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, str, list, pVar, i14, 17);
        }
    }
}
