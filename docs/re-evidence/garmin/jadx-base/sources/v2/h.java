package v2;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import kotlin.a4;
import kotlin.b3;
import kotlin.g3;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {127}, m = "invokeSuspend", v = 1)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<?>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f175004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.y1<Unit> f175005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f175006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2 f175007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f175008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g3 f175009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x5.q f175010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w1.a f175011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.l<x5.p, Unit> f175012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f175013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a4 f175014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f175015m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2 f175017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f175018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h2 h2Var, q qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f175017b = h2Var;
            this.f175018c = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f175017b, this.f175018c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [v2.g] */
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
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175016a;
            if (i14 == 0) {
                o13.r.b(obj);
                final q qVar = this.f175018c;
                ?? r14 = new u2.h.a() { // from class: v2.g
                    @Override // u2.h.a
                    public final void a(u2.e eVar, u2.e eVar2, boolean z14) {
                        long j8 = eVar.f167840d;
                        s5.w0 w0Var = eVar.f167841e;
                        long j14 = eVar2.f167840d;
                        s5.w0 w0Var2 = eVar2.f167841e;
                        q qVar2 = qVar;
                        if (z14) {
                            qVar2.b();
                        } else {
                            if (s5.w0.d(j8, j14) && p005kotlin.jvm.internal.s.g(w0Var, w0Var2)) {
                                return;
                            }
                            qVar2.a(s5.w0.h(j14), s5.w0.g(j14), w0Var2 != null ? s5.w0.h(w0Var2.f157317a) : -1, w0Var2 != null ? s5.w0.g(w0Var2.f157317a) : -1);
                        }
                    }
                };
                this.f175016a = 1;
                if (this.f175017b.b(r14, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", l = {114, 115}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.y1<Unit> f175020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f175021c;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f175022a;

            public a(q qVar) {
                this.f175022a = qVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f175022a.c();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r53.y1<Unit> y1Var, q qVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f175020b = y1Var;
            this.f175021c = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f175020b, this.f175021c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r4.f175020b.collect(r5, r4) == r0) goto L16;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175019a;
            if (i14 == 0) {
                o13.r.b(obj);
                uu.o oVar = new uu.o(7);
                this.f175019a = 1;
                if (p3.g1.b(oVar, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
            a aVar2 = new a(this.f175021c);
            this.f175019a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"v2/h$c", "Lv2/f2;", "Lv2/p0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements f2, p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f175023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2 f175024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f175025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<x5.p, Unit> f175026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ w1.a f175027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c0 f175028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g2 f175029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f175030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ a4 f175031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f175032j;

        /* JADX WARN: Multi-variable type inference failed */
        public c(f0 f0Var, h2 h2Var, q qVar, e23.l<? super x5.p, Unit> lVar, w1.a aVar, c0 c0Var, g2 g2Var, e23.a<Unit> aVar2, a4 a4Var, e23.l<? super Boolean, Unit> lVar2) {
            this.f175024b = h2Var;
            this.f175025c = qVar;
            this.f175026d = lVar;
            this.f175027e = aVar;
            this.f175028f = c0Var;
            this.f175029g = g2Var;
            this.f175030h = aVar2;
            this.f175031i = a4Var;
            this.f175032j = lVar2;
            this.f175023a = f0Var;
        }

        @Override // v2.f2
        public final void a(int i14) {
            e23.l<x5.p, Unit> lVar = this.f175026d;
            if (lVar != null) {
                lVar.invoke(x5.p.a(i14));
            }
        }

        @Override // v2.f2
        public final int b(HandwritingGesture handwritingGesture) {
            int i14;
            s5.o oVar;
            s5.q0 q0VarC;
            s5.o oVar2;
            if (Build.VERSION.SDK_INT < 34) {
                return 2;
            }
            m0.f175086a.getClass();
            boolean zU = t8.n.u(handwritingGesture);
            h2 h2Var = this.f175024b;
            g2 g2Var = this.f175029g;
            e23.a<Unit> aVar = this.f175030h;
            if (zU) {
                SelectGesture selectGestureR = k0.r(handwritingGesture);
                n4.d dVarK = o4.l1.k(selectGestureR.getSelectionArea());
                int iE = m0.e(selectGestureR.getGranularity());
                s5.n0.f157248u0.getClass();
                long jK = o0.k(g2Var, dVarK, iE, s5.n0.a.f157251c);
                if (s5.w0.e(jK)) {
                    return m0.a(h2Var, k0.n(selectGestureR));
                }
                h2Var.j(jK);
                if (aVar != null) {
                    aVar.invoke();
                    return 1;
                }
            } else {
                if (k0.C(handwritingGesture)) {
                    DeleteGesture deleteGestureL = k0.l(handwritingGesture);
                    int iE2 = m0.e(deleteGestureL.getGranularity());
                    n4.d dVarK2 = o4.l1.k(deleteGestureL.getDeletionArea());
                    s5.n0.f157248u0.getClass();
                    long jK2 = o0.k(g2Var, dVarK2, iE2, s5.n0.a.f157251c);
                    if (s5.w0.e(jK2)) {
                        return m0.a(h2Var, k0.n(deleteGestureL));
                    }
                    s5.m0.f157245b.getClass();
                    if (iE2 == s5.m0.f157246c) {
                        jK2 = o0.a(jK2, h2Var.d());
                    }
                    h2.i(h2Var, "", jK2, false, 12);
                    return 1;
                }
                if (!k0.D(handwritingGesture)) {
                    if (k0.v(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM = k0.m(handwritingGesture);
                        int iE3 = m0.e(deleteRangeGestureM.getGranularity());
                        n4.d dVarK3 = o4.l1.k(deleteRangeGestureM.getDeletionStartArea());
                        n4.d dVarK4 = o4.l1.k(deleteRangeGestureM.getDeletionEndArea());
                        s5.n0.f157248u0.getClass();
                        long jD = o0.d(g2Var, dVarK3, dVarK4, iE3, s5.n0.a.f157251c);
                        if (s5.w0.e(jD)) {
                            return m0.a(h2Var, k0.n(deleteRangeGestureM));
                        }
                        s5.m0.f157245b.getClass();
                        if (iE3 == s5.m0.f157246c) {
                            jD = o0.a(jD, h2Var.d());
                        }
                        h2.i(h2Var, "", jD, false, 12);
                        return 1;
                    }
                    boolean z14 = k0.z(handwritingGesture);
                    a4 a4Var = this.f175031i;
                    if (z14) {
                        JoinOrSplitGesture joinOrSplitGestureP = k0.p(handwritingGesture);
                        if (h2Var.f175039a.b() != h2Var.f175039a.b()) {
                            return 3;
                        }
                        long jG = o0.g(joinOrSplitGestureP.getJoinOrSplitPoint());
                        s5.q0 q0VarC2 = g2Var.c();
                        int i15 = (q0VarC2 == null || (oVar2 = q0VarC2.f157281b) == null) ? -1 : o0.i(oVar2, jG, g2Var.e(), a4Var);
                        if (i15 == -1 || ((q0VarC = g2Var.c()) != null && o0.e(q0VarC, i15))) {
                            return m0.a(h2Var, k0.n(joinOrSplitGestureP));
                        }
                        long jF = o0.f(i15, h2Var.d());
                        if (s5.w0.e(jF)) {
                            h2.i(h2Var, StringUtils.SPACE, jF, false, 12);
                            return 1;
                        }
                        h2.i(h2Var, "", jF, false, 12);
                        return 1;
                    }
                    if (k0.A(handwritingGesture)) {
                        InsertGesture insertGestureO = k0.o(handwritingGesture);
                        long jG2 = o0.g(insertGestureO.getInsertionPoint());
                        s5.q0 q0VarC3 = g2Var.c();
                        int i16 = (q0VarC3 == null || (oVar = q0VarC3.f157281b) == null) ? -1 : o0.i(oVar, jG2, g2Var.e(), a4Var);
                        if (i16 == -1) {
                            return m0.a(h2Var, k0.n(insertGestureO));
                        }
                        h2.i(h2Var, insertGestureO.getTextToInsert(), og.a.l(i16, i16), false, 12);
                        return 1;
                    }
                    if (!k0.B(handwritingGesture)) {
                        return 2;
                    }
                    RemoveSpaceGesture removeSpaceGestureQ = k0.q(handwritingGesture);
                    long jB = o0.b(g2Var.c(), o0.g(removeSpaceGestureQ.getStartPoint()), o0.g(removeSpaceGestureQ.getEndPoint()), g2Var.e(), a4Var);
                    if (s5.w0.e(jB)) {
                        return m0.a(h2Var, k0.n(removeSpaceGestureQ));
                    }
                    p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                    p0Var.f105807a = -1;
                    p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
                    p0Var2.f105807a = -1;
                    String strE = new d53.k("\\s+").e(new l0(p0Var, p0Var2, 1), og.a.b0(jB, h2Var.d()));
                    int i17 = p0Var.f105807a;
                    if (i17 == -1 || (i14 = p0Var2.f105807a) == -1) {
                        return m0.a(h2Var, k0.n(removeSpaceGestureQ));
                    }
                    int i18 = (int) (jB >> 32);
                    h2.i(h2Var, strE.substring(p0Var.f105807a, strE.length() - (s5.w0.f(jB) - p0Var2.f105807a)), og.a.l(i17 + i18, i18 + i14), false, 12);
                    return 1;
                }
                SelectRangeGesture selectRangeGestureS = k0.s(handwritingGesture);
                n4.d dVarK5 = o4.l1.k(selectRangeGestureS.getSelectionStartArea());
                n4.d dVarK6 = o4.l1.k(selectRangeGestureS.getSelectionEndArea());
                int iE4 = m0.e(selectRangeGestureS.getGranularity());
                s5.n0.f157248u0.getClass();
                long jD2 = o0.d(g2Var, dVarK5, dVarK6, iE4, s5.n0.a.f157251c);
                if (s5.w0.e(jD2)) {
                    return m0.a(h2Var, k0.n(selectRangeGestureS));
                }
                h2Var.j(jD2);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return 1;
        }

        @Override // v2.p0
        public final void beginBatchEdit() {
            this.f175023a.beginBatchEdit();
        }

        @Override // v2.p0
        public final long c(long j8) {
            return this.f175023a.f174987a.f(j8);
        }

        @Override // v2.p0
        public final long d(long j8) {
            return this.f175023a.f174987a.e(j8);
        }

        @Override // v2.f2
        public final void e() {
            this.f175032j.invoke(Boolean.FALSE);
        }

        @Override // v2.p0
        public final boolean endBatchEdit() {
            return this.f175023a.endBatchEdit();
        }

        @Override // v2.f2
        public final void f() {
            w1.a aVar = this.f175027e;
            if (aVar == null) {
                return;
            }
            aVar.a();
            throw null;
        }

        @Override // v2.p0
        public final void g(e23.l<? super u2.d, Unit> lVar) {
            this.f175023a.g(lVar);
        }

        @Override // v2.f2
        public final u2.e getText() {
            return this.f175024b.d();
        }

        @Override // v2.f2
        public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
            if (Build.VERSION.SDK_INT >= 34) {
                m0.f175086a.getClass();
                boolean zU = t8.n.u(previewableHandwritingGesture);
                h2 h2Var = this.f175024b;
                g2 g2Var = this.f175029g;
                if (zU) {
                    SelectGesture selectGestureR = k0.r(previewableHandwritingGesture);
                    n4.d dVarK = o4.l1.k(selectGestureR.getSelectionArea());
                    int iE = m0.e(selectGestureR.getGranularity());
                    s5.n0.f157248u0.getClass();
                    long jK = o0.k(g2Var, dVarK, iE, s5.n0.a.f157251c);
                    u2.j.f167854b.getClass();
                    m0.c(h2Var, jK, 0);
                } else if (k0.C(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureL = k0.l(previewableHandwritingGesture);
                    n4.d dVarK2 = o4.l1.k(deleteGestureL.getDeletionArea());
                    int iE2 = m0.e(deleteGestureL.getGranularity());
                    s5.n0.f157248u0.getClass();
                    long jK2 = o0.k(g2Var, dVarK2, iE2, s5.n0.a.f157251c);
                    u2.j.f167854b.getClass();
                    m0.c(h2Var, jK2, u2.j.f167855c);
                } else if (k0.D(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureS = k0.s(previewableHandwritingGesture);
                    n4.d dVarK3 = o4.l1.k(selectRangeGestureS.getSelectionStartArea());
                    n4.d dVarK4 = o4.l1.k(selectRangeGestureS.getSelectionEndArea());
                    int iE3 = m0.e(selectRangeGestureS.getGranularity());
                    s5.n0.f157248u0.getClass();
                    long jD = o0.d(g2Var, dVarK3, dVarK4, iE3, s5.n0.a.f157251c);
                    u2.j.f167854b.getClass();
                    m0.c(h2Var, jD, 0);
                } else if (k0.v(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM = k0.m(previewableHandwritingGesture);
                    n4.d dVarK5 = o4.l1.k(deleteRangeGestureM.getDeletionStartArea());
                    n4.d dVarK6 = o4.l1.k(deleteRangeGestureM.getDeletionEndArea());
                    int iE4 = m0.e(deleteRangeGestureM.getGranularity());
                    s5.n0.f157248u0.getClass();
                    long jD2 = o0.d(g2Var, dVarK5, dVarK6, iE4, s5.n0.a.f157251c);
                    u2.j.f167854b.getClass();
                    m0.c(h2Var, jD2, u2.j.f167855c);
                }
                if (cancellationSignal == null) {
                    return true;
                }
                cancellationSignal.setOnCancelListener(new f7.a(h2Var, 2));
                return true;
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x006b  */
        /* JADX WARN: Code duplicated, block: B:53:0x0084 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:54:0x0086  */
        @Override // v2.f2
        public final void requestCursorUpdates(int i14) {
            boolean z14;
            boolean z15;
            boolean z16;
            o53.c2 c2Var;
            CursorAnchorInfo cursorAnchorInfoA;
            c0 c0Var = this.f175028f;
            c0Var.getClass();
            boolean z17 = false;
            boolean z18 = (i14 & 1) != 0;
            boolean z19 = (i14 & 2) != 0;
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33) {
                z15 = (i14 & 16) != 0;
                z16 = (i14 & 8) != 0;
                boolean z24 = (i14 & 4) != 0;
                if (i15 >= 34 && (i14 & 32) != 0) {
                    z17 = true;
                }
                if (z15 || z16 || z24 || z17) {
                    z14 = z17;
                    z17 = z24;
                } else {
                    if (i15 >= 34) {
                        z14 = true;
                        z17 = true;
                    } else {
                        z14 = z17;
                        z17 = true;
                    }
                    z15 = z17;
                }
                c0Var.f174901f = z15;
                c0Var.f174902g = z16;
                c0Var.f174903h = z17;
                c0Var.f174904i = z14;
                if (z18 && (cursorAnchorInfoA = c0Var.a()) != null) {
                    c0Var.f174898c.updateCursorAnchorInfo(cursorAnchorInfoA);
                }
                c2Var = c0Var.f174900e;
                if (!z19) {
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    c0Var.f174900e = null;
                } else {
                    if (c2Var == null && c2Var.isActive()) {
                        return;
                    }
                    c0Var.f174900e = ge1.b.T(c0Var.f174899d, null, o53.d0.UNDISPATCHED, new b0(c0Var, null), 1);
                }
            }
            z14 = false;
            z15 = true;
            z16 = z15;
            c0Var.f174901f = z15;
            c0Var.f174902g = z16;
            c0Var.f174903h = z17;
            c0Var.f174904i = z14;
            if (z18) {
                c0Var.f174898c.updateCursorAnchorInfo(cursorAnchorInfoA);
            }
            c2Var = c0Var.f174900e;
            if (!z19) {
                if (c2Var == null) {
                }
                c0Var.f174900e = ge1.b.T(c0Var.f174899d, null, o53.d0.UNDISPATCHED, new b0(c0Var, null), 1);
            } else {
                if (c2Var != null) {
                    c2Var.c(null);
                }
                c0Var.f174900e = null;
            }
        }

        @Override // v2.f2
        public final void sendKeyEvent(KeyEvent keyEvent) {
            this.f175025c.sendKeyEvent(keyEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(r53.y1<Unit> y1Var, h2 h2Var, g2 g2Var, q qVar, g3 g3Var, x5.q qVar2, w1.a aVar, e23.l<? super x5.p, Unit> lVar, e23.a<Unit> aVar2, a4 a4Var, e23.l<? super Boolean, Unit> lVar2, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f175005c = y1Var;
        this.f175006d = h2Var;
        this.f175007e = g2Var;
        this.f175008f = qVar;
        this.f175009g = g3Var;
        this.f175010h = qVar2;
        this.f175011i = aVar;
        this.f175012j = lVar;
        this.f175013k = aVar2;
        this.f175014l = a4Var;
        this.f175015m = lVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f175005c, this.f175006d, this.f175007e, this.f175008f, this.f175009g, this.f175010h, this.f175011i, this.f175012j, this.f175013k, this.f175014l, this.f175015m, dVar);
        hVar.f175004b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<?> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175003a;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var = (o53.b0) this.f175004b;
            o53.d0 d0Var = o53.d0.UNDISPATCHED;
            h2 h2Var = this.f175006d;
            q qVar = this.f175008f;
            ge1.b.T(b0Var, null, d0Var, new a(h2Var, qVar, null), 1);
            r53.y1<Unit> y1Var = this.f175005c;
            if (y1Var != null) {
                ge1.b.T(b0Var, null, null, new b(y1Var, qVar, null), 3);
            }
            final c0 c0Var = new c0(h2Var, this.f175007e, qVar, b0Var);
            final h2 h2Var2 = this.f175006d;
            final x5.q qVar2 = this.f175010h;
            final w1.a aVar2 = this.f175011i;
            final q qVar3 = this.f175008f;
            final e23.l<x5.p, Unit> lVar = this.f175012j;
            final g2 g2Var = this.f175007e;
            final e23.a<Unit> aVar3 = this.f175013k;
            final a4 a4Var = this.f175014l;
            final e23.l<Boolean, Unit> lVar2 = this.f175015m;
            b3 b3Var = new b3() { // from class: v2.f
                @Override // kotlin.b3
                public final InputConnection a(EditorInfo editorInfo) {
                    h2 h2Var3 = h2Var2;
                    f0 f0Var = new f0(h2Var3);
                    q qVar4 = qVar3;
                    e23.l lVar3 = lVar;
                    w1.a aVar4 = aVar2;
                    h.c cVar = new h.c(f0Var, h2Var3, qVar4, lVar3, aVar4, c0Var, g2Var, aVar3, a4Var, lVar2);
                    i0.a(editorInfo, h2Var3.d(), h2Var3.d().f167840d, qVar2, aVar4 != null ? i.f175046a : null);
                    return new l1(cVar, editorInfo);
                }
            };
            this.f175003a = 1;
            if (this.f175009g.a(b3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
