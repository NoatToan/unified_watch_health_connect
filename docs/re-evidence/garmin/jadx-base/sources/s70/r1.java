package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e9;
import i3.mc;
import java.util.Comparator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class r1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.SelectHomePresetKt$SelectHomePresetContent$5$1", f = "SelectHomePreset.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f157787a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157787a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157787a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157787a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.SelectHomePresetKt$SelectHomePresetContent$6$1", f = "SelectHomePreset.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f157788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r70.z f157789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, r70.z zVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f157788a = aVar;
            this.f157789b = zVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f157788a, this.f157789b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157788a.invoke();
            r70.z zVar = this.f157789b;
            j70.r rVar = zVar.f151122f;
            if (rVar != null) {
                p2 p2Var = zVar.f151127k;
                g3.f35298f.getClass();
                p2Var.k(null, g3.a.d(rVar));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.SelectHomePresetKt$SelectHomePresetContent$7$2$1", f = "SelectHomePreset.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f157790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f157790a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f157790a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157790a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((j70.r) ((o13.p) t7).f128594a).ordinal()), Integer.valueOf(((j70.r) ((o13.p) t14).f128594a).ordinal()));
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157791a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f157791a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0285  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c2.a0 a0Var, r70.z zVar, e23.a<Unit> aVar, j70.r rVar, e23.l<? super j70.r, Unit> lVar, boolean z14, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.m.a.C2565a c2565a;
        p3.o0 o0Var;
        boolean z15;
        a0Var.getClass();
        zVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-2104375400);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(zVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new ro0.h(21);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = new ro0.h(22);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            if (z14) {
                o0VarE.C(-2104278375);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_are_you_sure);
                String strQ2 = gl1.y.Q(o0VarE, R.string.msg_reset_any_changes_prior);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_save);
                String strQ4 = gl1.y.Q(o0VarE, R.string.common_cancel);
                int i16 = 3670016 & i15;
                boolean zR = (i16 == 1048576) | ((i15 & 7168) == 2048) | o0VarE.r(zVar);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a2) {
                    objQ3 = new q42.v(aVar2, 26, rVar, zVar);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar3 = (e23.a) objQ3;
                boolean z16 = i16 == 1048576;
                Object objQ4 = o0VarE.q();
                if (z16 || objQ4 == c2565a2) {
                    objQ4 = new rk0.y(aVar2, 16);
                    o0VarE.K(objQ4);
                }
                c2565a = c2565a2;
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, strQ4, (e23.a) objQ4, o0VarE, 6, 0, 216);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                c2565a = c2565a2;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(-2103418218);
                    l72.c1 c1Var2 = l72.c1.f110940a;
                    String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_focus_not_recommended);
                    String strQ6 = gl1.y.Q(o0VarE, R.string.msg_focus_not_recommended);
                    String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
                    boolean zB = ((i15 & 57344) == 16384) | o0VarE.B(p1Var2) | o0VarE.B(p1Var);
                    Object objQ5 = o0VarE.q();
                    if (zB || objQ5 == c2565a) {
                        objQ5 = new lm0.o(lVar, p1Var2, p1Var, 4);
                        o0VarE.K(objQ5);
                    }
                    e23.a<Unit> aVar4 = (e23.a) objQ5;
                    String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                    boolean zB2 = o0VarE.B(p1Var2);
                    Object objQ6 = o0VarE.q();
                    if (zB2 || objQ6 == c2565a) {
                        objQ6 = new rk0.w(p1Var2, 23);
                        o0VarE.K(objQ6);
                    }
                    c1Var2.a(false, strQ5, strQ6, null, null, strQ7, false, false, aVar4, strQ8, (e23.a) objQ6, o0VarE, 6, 0, 216);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    o0Var.C(-2102716502);
                    o0Var.g0(false);
                }
            }
            p3.p1 p1VarB = s9.c.b((o2) zVar.f151134r.getValue(), g3.a.c(g3.f35298f), o0Var, g3.f35299g << 3);
            p3.o0 o0Var2 = o0Var;
            p3.p1 p1VarB2 = p3.p0.b(zVar.f151121e, null, null, o0Var2, 48, 2);
            fw.p pVar = ((g3) p1VarB.getF182175a()).f35300a;
            fw.p pVar2 = fw.p.LOADING;
            if (pVar == pVar2) {
                z15 = true;
            } else {
                g3 g3Var = (g3) p1VarB2.getF182175a();
                if ((g3Var != null ? g3Var.f35300a : null) == pVar2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            boolean zR2 = o0Var2.r(context);
            Object objQ7 = o0Var2.q();
            if (zR2 || objQ7 == c2565a) {
                objQ7 = new r(context, 6);
                o0Var2.K(objQ7);
            }
            e23.a aVar5 = (e23.a) objQ7;
            g3 g3Var2 = (g3) p1VarB2.getF182175a();
            fw.p pVar3 = g3Var2 != null ? g3Var2.f35300a : null;
            int i17 = pVar3 != null ? e.f157791a[pVar3.ordinal()] : -1;
            if (i17 == 1) {
                o0Var2.C(624923615);
                Unit unit = Unit.INSTANCE;
                boolean z17 = (i15 & 896) == 256;
                Object objQ8 = o0Var2.q();
                if (z17 || objQ8 == c2565a) {
                    objQ8 = new a(aVar, null);
                    o0Var2.K(objQ8);
                }
                p3.l0.e((e23.p) objQ8, unit, o0Var2);
                o0Var2.g0(false);
            } else if (i17 != 2) {
                o0Var2.C(-2102024551);
                o0Var2.g0(false);
            } else {
                o0Var2.C(624925724);
                Unit unit2 = Unit.INSTANCE;
                boolean zB3 = o0Var2.B(aVar5) | o0Var2.r(zVar);
                Object objQ9 = o0Var2.q();
                if (zB3 || objQ9 == c2565a) {
                    objQ9 = new b(aVar5, zVar, null);
                    o0Var2.K(objQ9);
                }
                p3.l0.e((e23.p) objQ9, unit2, o0Var2);
                o0Var2.g0(false);
            }
            o0VarE = o0Var2;
            g02.s0.a(a0Var.a(x2.f(h4.r.S, 1.0f), 1.0f, true), z15, z3.f.c(1801702414, new oy0.b((Object) aVar5, p1VarB, p1Var, (Object) p1Var2, (Object) lVar, (Object) rVar, 17), o0Var2), o0VarE, 384, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(a0Var, zVar, aVar, rVar, lVar, z14, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    public static final void b(o53.b0 b0Var, r70.z zVar, mc mcVar, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        e23.a aVar3;
        int i16;
        e23.a aVar4;
        b0Var.getClass();
        zVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(634568107);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(b0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(zVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(mcVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar5 = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                boolean zR = o0VarE.r(b0Var) | ((i15 & 896) == 256);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new nw0.n(b0Var, mcVar, 7);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new nw0.n(b0Var, mcVar, 7);
                        o0VarE.K(objQ);
                    }
                }
                i16 = i15 & (-57345);
                aVar4 = (e23.a) objQ;
            } else {
                o0VarE.e();
                i16 = i15 & (-57345);
                aVar4 = aVar2;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            long jF2 = ds.e0.f(o0VarE);
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            Object objQ2 = o0VarE.q();
            aVar5.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new ro0.h(23);
                o0VarE.K(objQ2);
            }
            z.f157837a.getClass();
            o0Var = o0VarE;
            e9.a((e23.a) objQ2, rVarD, mcVar, 0.0f, false, null, jF, 0L, 0.0f, jF2, z.f157838b, new v(5), null, z3.f.c(270144137, new ng2.i(zVar, 19, aVar, aVar4), o0VarE), o0Var, (i16 & 896) | 54, 3078, 4536);
            aVar3 = aVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar3 = aVar2;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(b0Var, zVar, mcVar, aVar, aVar3, i14, 15);
        }
    }
}
