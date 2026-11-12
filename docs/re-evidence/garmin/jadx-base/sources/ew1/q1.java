package ew1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import aq.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import i3.e5;
import i3.mh;
import i3.qa;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0014\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lew1/q1;", "Lew1/u;", "<init>", "()V", "a", "Ljv1/u;", "uiModel", "Lcom/garmin/android/apps/connectmobile/g3;", "Ltw1/m;", "planCreationState", "Lfu1/l;", "atpPlanCreationState", "", "progress", "animatedProgress", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q1 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f66677f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f66681e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {
        public b() {
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                p3.x1 x1Var = p3.n.f135158a;
                b82.c.b(null, null, z3.f.c(-987173290, new j1(q1.this, 1), mVar2), null, b82.c.d(mVar2), mVar2, 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.fragments.FBTReviewInformationFragCompose$PlanCreationProgress$1$1$1", f = "FBTReviewInformationFragCompose.kt", l = {383}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.m1 f66684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p3.m1 m1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f66684b = m1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f66684b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66683a;
            if (i14 != 0 && i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            do {
                a aVar2 = q1.f66677f;
                p3.m1 m1Var = this.f66684b;
                if (m1Var.getFloatValue() >= 10.0f) {
                    return Unit.INSTANCE;
                }
                m1Var.i(m1Var.getFloatValue() + 0.1f);
                this.f66683a = 1;
            } while (o53.m0.b(300L, this) != aVar);
            return aVar;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66685a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66685a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/q1$e", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends b.s {
        public e() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b.u onBackPressedDispatcher;
            q1 q1Var = q1.this;
            q1Var.f66681e.f(false);
            if (q1Var.f66679c) {
                q1Var.K6();
                return;
            }
            if (q1Var.f66680d) {
                q1Var.I6();
                return;
            }
            q1Var.J6().f13385r1 = false;
            androidx.fragment.app.m activity = q1Var.getActivity();
            if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f66687a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66687a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66688a = aVar;
            this.f66689b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66688a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66689b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f66690a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66690a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public q1() {
        super(R.layout.fbt_activity_view);
        this.f66678b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new f(this), new h(this), new g(null, this));
        this.f66681e = new e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A6(boolean z14, int i14, int i15, p3.m mVar, int i16) {
        fw.p pVar;
        p3.o0 o0VarE = mVar.E(-706630239);
        int i17 = i16 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            ((androidx.lifecycle.y0) J6().f13370d1.getValue()).m(Boolean.FALSE);
            p3.p1 p1VarG = o53.f0.G(J6().U0, o0VarE);
            p3.p1 p1VarG2 = o53.f0.G((androidx.lifecycle.s0) J6().W0.getValue(), o0VarE);
            p3.p1 p1VarG3 = o53.f0.G((androidx.lifecycle.s0) J6().Y0.getValue(), o0VarE);
            g3 g3Var = (g3) p1VarG2.getF182175a();
            Unit unit = null;
            if (g3Var == null || (pVar = g3Var.f35300a) == null) {
                g3 g3Var2 = (g3) p1VarG3.getF182175a();
                pVar = g3Var2 != null ? g3Var2.f35300a : null;
            }
            jv1.u uVar = (jv1.u) p1VarG.getF182175a();
            if (uVar == null) {
                o0VarE.C(-1586150668);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1586150667);
                if (pVar == null) {
                    o0VarE.C(-609204260);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-609204259);
                    androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) J6().f13370d1.getValue();
                    Boolean bool = Boolean.TRUE;
                    y0Var.m(bool);
                    if (pVar == fw.p.SUCCESS && J6().H5().f61437c) {
                        o0VarE.C(-2002213968);
                        o0VarE.g0(false);
                        androidx.fragment.app.m activity = getActivity();
                        if (activity != null) {
                            Intent intent = new Intent();
                            intent.putExtra("extras_is_event_tp_plan_created", true);
                            intent.putExtra("extras_is_event_training_plan_navigation", true);
                            Unit unit2 = Unit.INSTANCE;
                            activity.setResult(-1, intent);
                            if (p005kotlin.jvm.internal.s.g(J6().H5().f61441g, bool)) {
                                jv1.s sVarI6 = J6().i6();
                                fg0.k kVar = sVarI6 != null ? sVarI6.f101124c : null;
                                if (kVar != null) {
                                    ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).c(activity, kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
                                }
                            }
                            activity.finish();
                            unit = Unit.INSTANCE;
                        }
                    } else {
                        o0VarE.C(1459465317);
                        z6(uVar, pVar, o0VarE, (i17 >> 3) & 896);
                        o0VarE.g0(false);
                        unit = Unit.INSTANCE;
                    }
                    o0VarE.g0(false);
                }
                if (unit == null) {
                    o0VarE.C(-607889084);
                    C6(uVar, z14, i14, i15, o0VarE, (i17 << 3) & 8176);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-712388549);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(this, z14, i14, i15, i16);
        }
    }

    public final void C6(final jv1.u uVar, final boolean z14, final int i14, final int i15, p3.m mVar, final int i16) {
        int i17;
        p3.o0 o0VarE = mVar.E(-1113003295);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.r(uVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.k(i15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.r(this) ? 16384 : 8192;
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b82.c.c(z3.f.c(2079731521, new b(), o0VarE), z3.f.c(-192427257, new b82.l1(z14, i14, i15, this, uVar), o0VarE), o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ew1.p1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    q1.a aVar2 = q1.f66677f;
                    this.f66656a.C6(uVar, z14, i14, i15, mVar2, p3.p0.t(i16 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0190  */
    /* JADX WARN: Code duplicated, block: B:40:0x0197  */
    /* JADX WARN: Code duplicated, block: B:42:0x019f  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01da  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0208  */
    /* JADX WARN: Code duplicated, block: B:63:0x0212  */
    /* JADX WARN: Code duplicated, block: B:64:0x0214  */
    /* JADX WARN: Code duplicated, block: B:68:0x0242  */
    /* JADX WARN: Code duplicated, block: B:78:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e4 A[SYNTHETIC] */
    public final void E6(List<jv1.t> list, p3.m mVar, int i14) {
        q1 q1Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        String str;
        boolean zR;
        Object objQ;
        p3.o0 o0VarE = mVar.E(268775843);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (list.isEmpty()) {
                p3.p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new k1(this, list, i14, 2);
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
                bVar.getClass();
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC4 = c2.l.C(rVarF2, f14, 0.0f, f15, eVar.f97917b, 2);
                String upperCase = gl1.y.Q(o0VarE, R.string.training_preferences).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                d6.h.f57752b.getClass();
                mh.c(upperCase, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
                zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF3, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                o0VarE.C(-1228852866);
                for (jv1.t tVar : list) {
                    if (tVar.f101152e) {
                        o0VarE.C(2132705493);
                        l72.p2 p2Var = l72.p2.f111205a;
                        String str2 = tVar.f101148a;
                        str = tVar.f101149b;
                        if (str == null) {
                            str = "";
                        }
                        String str3 = str;
                        boolean z14 = tVar.f101151d;
                        zR = o0VarE.r(tVar) | o0VarE.r(this);
                        objQ = o0VarE.q();
                        if (zR) {
                            objQ = new l1(tVar, this, 1);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l1(tVar, this, 1);
                                o0VarE.K(objQ);
                            }
                        }
                        tu1.a.a(p2Var, null, str2, str3, z14, null, (e23.a) objQ, o0VarE, 0, 41);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(2133293625);
                        o0VarE.g0(false);
                    }
                }
                q1Var = this;
                e5.u(o0VarE, false, true, true);
                p3.x1 x1Var2 = p3.n.f135158a;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF4 = c2.x2.f(aVar, 1.0f);
            bVar.getClass();
            float f16 = eVar.f97920e;
            bVar.getClass();
            float f17 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC5 = c2.l.C(rVarF4, f16, 0.0f, f17, eVar.f97917b, 2);
            String upperCase2 = gl1.y.Q(o0VarE, R.string.training_preferences).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF2 = d92.c.f(j92.f.f97934k, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(upperCase2, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            h4.r rVarF5 = c2.x2.f(aVar, 1.0f);
            zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF5, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            o0VarE.C(-1228852866);
            while (r0.hasNext()) {
                if (tVar.f101152e) {
                    o0VarE.C(2132705493);
                    l72.p2 p2Var2 = l72.p2.f111205a;
                    String str4 = tVar.f101148a;
                    str = tVar.f101149b;
                    if (str == null) {
                        str = "";
                    }
                    String str5 = str;
                    boolean z15 = tVar.f101151d;
                    zR = o0VarE.r(tVar) | o0VarE.r(this);
                    objQ = o0VarE.q();
                    if (zR) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l1(tVar, this, 1);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new l1(tVar, this, 1);
                        o0VarE.K(objQ);
                    }
                    tu1.a.a(p2Var2, null, str4, str5, z15, null, (e23.a) objQ, o0VarE, 0, 41);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2133293625);
                    o0VarE.g0(false);
                }
            }
            q1Var = this;
            e5.u(o0VarE, false, true, true);
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            q1Var = this;
            o0VarE.e();
        }
        p3.p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new k1(q1Var, list, i14, 3);
        }
    }

    public final void F6(int i14, p3.m mVar, int i15) {
        int i16;
        int i17;
        q1 q1Var = this;
        p3.o0 o0VarE = mVar.E(352085483);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i16 = i15 | (o0VarE.k(i14) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(q1Var) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            c2.z zVarA = c2.y.a(cVar2, aVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            c2.z zVarA2 = c2.y.a(cVar2, aVar2, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_plan_created);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            int i18 = d6.h.f57755e;
            h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            float f15 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(strQ, c2.l.C(rVarF2, f14, 0.0f, f15, eVar2.f97922g, 2), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(10.0f, o0VarE);
            }
            float floatValue = ((p3.m1) objQ).getFloatValue();
            qa.f89427a.getClass();
            x3 x3VarB = s1.f.b(floatValue, qa.f89431e, null, o0VarE, 0, 28);
            l72.y2 y2Var = l72.y2.f111386a;
            float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
            bVar2.getClass();
            float f16 = eVar2.f97920e;
            bVar2.getClass();
            float f17 = eVar2.f97920e;
            bVar2.getClass();
            y2Var.c(fFloatValue, c2.l.C(aVar, f16, 0.0f, f17, eVar2.f97922g, 2), false, o0VarE, 384, 0);
            String strQ2 = gl1.y.Q(o0VarE, i14);
            fVar2.getClass();
            s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f18 = eVar2.f97920e;
            bVar2.getClass();
            float f19 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(strQ2, c2.l.C(rVarF3, f18, 0.0f, f19, eVar2.f97917b, 2), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            String strQ3 = gl1.y.Q(o0VarE, R.string.first_training_workout_description);
            fVar2.getClass();
            s5.x0 x0VarB3 = d92.c.b(j92.f.f97933j, o0VarE);
            h4.r rVarF4 = c2.x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f22 = eVar2.f97920e;
            bVar2.getClass();
            float f24 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(strQ3, c2.l.C(rVarF4, f22, 0.0f, f24, eVar2.f97917b, 2), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, 0, 0, 130044);
            i17 = 1;
            o0VarE.g0(true);
            c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarF5 = c2.x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f25 = eVar2.f97920e;
            bVar2.getClass();
            float f26 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(rVarF5, f25, 0.0f, f26, eVar2.f97918c, 2);
            String strQ4 = gl1.y.Q(o0VarE, R.string.common_button_got_it);
            q1Var = this;
            boolean zR = o0VarE.r(q1Var);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new m1(q1Var, 2);
                o0VarE.K(objQ2);
            }
            f0Var.d(0, 9, (e23.a) objQ2, rVarC3, strQ4, o0VarE, null, false);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            i17 = 1;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m3(q1Var, i14, i15, i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x0240  */
    public final void G6(p3.m mVar, int i14) {
        int i15;
        q1 q1Var;
        int i16;
        p3.o0 o0VarE = mVar.E(-1374369203);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(this) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            c2.z zVarA = c2.y.a(cVar2, aVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            c2.z zVarA2 = c2.y.a(cVar2, aVar2, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_whoops);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97929f, o0VarE);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            float f15 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(strQ, c2.l.C(rVarF2, f14, 0.0f, f15, eVar2.f97917b, 2), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_atp_error);
            fVar2.getClass();
            s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f16 = eVar2.f97920e;
            bVar2.getClass();
            float f17 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(strQ2, c2.l.C(rVarF3, f16, 0.0f, f17, eVar2.f97917b, 2), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            o0VarE.g0(true);
            c2.l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarF4 = c2.x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f18 = eVar2.f97920e;
            bVar2.getClass();
            float f19 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(rVarF4, f18, 0.0f, f19, eVar2.f97918c, 2);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
            q1Var = this;
            boolean zR = o0VarE.r(q1Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                i16 = 0;
                objQ = new m1(q1Var, 0);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i16 = 0;
                    objQ = new m1(q1Var, 0);
                    o0VarE.K(objQ);
                } else {
                    i16 = 0;
                }
            }
            f0Var.d(0, 9, (e23.a) objQ, rVarC3, strQ3, o0VarE, null, false);
            o0VarE = o0VarE;
            h4.r rVarF5 = c2.x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f22 = eVar2.f97920e;
            bVar2.getClass();
            float f24 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(rVarF5, f22, 0.0f, f24, eVar2.f97918c, 2);
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_cancel_setup);
            boolean zR2 = o0VarE.r(q1Var);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new m1(q1Var, 1);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new m1(q1Var, 1);
                    o0VarE.K(objQ2);
                }
            }
            f0Var.k(strQ4, rVarC4, false, (e23.a) objQ2, o0VarE, 0, 4);
            o0VarE.g0(true);
        } else {
            q1Var = this;
            i16 = 0;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(q1Var, i14, i16);
        }
    }

    public final void H6(p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(582847582);
        int i16 = i14 & 1;
        if (o0VarE.n(i16, i16 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar2, 1.0f);
            c2.z zVarA = c2.y.a(cVar, aVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_creating_plan);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            h4.r rVarF = c2.x2.f(aVar2, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            mh.c(strQ, c2.l.C(rVarF, f14, 0.0f, f15, eVar.f97922g, 2), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.1f, o0VarE);
            }
            p3.m1 m1Var = (p3.m1) objQ;
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(m1Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarE);
            float floatValue = m1Var.getFloatValue();
            qa.f89427a.getClass();
            x3 x3VarB = s1.f.b(floatValue, qa.f89431e, null, o0VarE, 0, 28);
            l72.y2 y2Var = l72.y2.f111386a;
            float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
            bVar2.getClass();
            y2Var.c(fFloatValue, c2.l.y(aVar2, eVar.f97920e), false, o0VarE, 384, 0);
            o0VarE = o0VarE;
            i15 = 1;
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(this, i14, i15);
        }
    }

    public final void I6() {
        fy1.c.f73884a.getClass();
        fy1.c.a();
        J6().f13387t1 = new LinkedHashSet();
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            if (J6().H5().f61437c) {
                dw1.a aVarH5 = J6().H5();
                aVarH5.f61435a.setValue(aVarH5.f61442h);
            } else {
                activity.setResult(0);
                activity.finish();
            }
        }
    }

    public final aw1.h J6() {
        return (aw1.h) this.f66678b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K6() {
        tw1.n trainingPlanType;
        fy1.c.f73884a.getClass();
        fy1.c.a();
        vt1.o oVarB = null;
        oVarB = null;
        if (J6().M6()) {
            g3 g3Var = (g3) ((androidx.lifecycle.s0) J6().Y0.getValue()).d();
            fu1.l lVar = g3Var != null ? (fu1.l) g3Var.f35301b : null;
            if (lVar != null) {
                TrainingPlanDashboardActivity.a aVar = TrainingPlanDashboardActivity.f45383n;
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                Long athletePlanId = lVar.getAthletePlanId();
                long jLongValue = athletePlanId != null ? athletePlanId.longValue() : -1L;
                aVar.getClass();
                if (mVarRequireActivity != null) {
                    mVarRequireActivity.startActivity(TrainingPlanDashboardActivity.a.b(aVar, mVarRequireActivity, jLongValue, "GARMIN_COACH", 32));
                }
                androidx.fragment.app.m activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    activity.finish();
                    return;
                }
                return;
            }
            return;
        }
        if (J6().Y6()) {
            g3 g3Var2 = (g3) ((androidx.lifecycle.s0) J6().W0.getValue()).d();
            tw1.m mVar = g3Var2 != null ? (tw1.m) g3Var2.f35301b : null;
            if (mVar != null) {
                ITPDashboardActivity.a aVar2 = ITPDashboardActivity.f45618m;
                androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
                long trainingPlanId = mVar.getTrainingPlanId();
                if (mVarRequireActivity2 != null) {
                    aVar2.getClass();
                    mVarRequireActivity2.startActivity(ITPDashboardActivity.a.a(mVarRequireActivity2, trainingPlanId, "GARMIN_COACH", false));
                } else {
                    aVar2.getClass();
                }
            }
            androidx.fragment.app.m activity2 = getActivity();
            if (activity2 != null) {
                activity2.setResult(-1);
                activity2.finish();
                return;
            }
            return;
        }
        g3 g3Var3 = (g3) ((androidx.lifecycle.s0) J6().W0.getValue()).d();
        tw1.m mVar2 = g3Var3 != null ? (tw1.m) g3Var3.f35301b : null;
        if (mVar2 != null && (trainingPlanType = mVar2.getTrainingPlanType()) != null) {
            oVarB = trainingPlanType.b();
        }
        vt1.o oVar = oVarB;
        if (mVar2 == null || oVar == null) {
            return;
        }
        FBTDashBoardActivity.a aVar3 = FBTDashBoardActivity.f45458n;
        androidx.fragment.app.m mVarRequireActivity3 = requireActivity();
        mVarRequireActivity3.getClass();
        FBTDashBoardActivity.a.c(aVar3, mVarRequireActivity3, mVar2.getTrainingPlanId(), oVar, 1007, 88);
        androidx.fragment.app.m activity3 = getActivity();
        if (activity3 != null) {
            activity3.setResult(-1);
            activity3.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(R.string.review_plan);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((androidx.lifecycle.y0) J6().f13370d1.getValue()).m(Boolean.FALSE);
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        b.u onBackPressedDispatcher;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66681e, viewLifecycleOwner);
        }
        J6().f13385r1 = true;
        tu1.a.p(view2, R.id.composable_container, new z3.e(482097519, true, new j1(this, 0)));
    }

    @Override // ew1.u
    public final boolean u6() {
        return true;
    }

    @Override // ew1.u
    public final boolean v6() {
        return !J6().H5().f61437c;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0341  */
    public final void w6(List<jv1.t> list, p3.m mVar, int i14) {
        boolean z14;
        z3.e eVar;
        p3.o0 o0VarE = mVar.E(-1839701881);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (list.isEmpty()) {
                p3.p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new k1(this, list, i14, 4);
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String upperCase = gl1.y.Q(o0VarE, R.string.event_goal).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
            bVar.getClass();
            float f14 = eVar2.f97920e;
            bVar.getClass();
            float f15 = eVar2.f97920e;
            bVar.getClass();
            float f16 = 1.0f;
            mh.c(upperCase, c2.l.C(rVarF2, f14, 0.0f, f15, eVar2.f97917b, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.C(337745673);
            for (jv1.t tVar : list) {
                boolean z15 = tVar.f101152e;
                String str = tVar.f101149b;
                if (z15) {
                    o0VarE.C(-1039952644);
                    boolean z16 = tVar.f101154g;
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (z16) {
                        o0VarE.C(-1039943220);
                        h4.r.a aVar4 = h4.r.S;
                        h4.r rVarF3 = c2.x2.f(aVar4, f16);
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(rVarF3, 0.0f, eVar3.f97919d, 1);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        c2.s2 s2VarA = c2.q2.a(gVar, h4.d.a.f81533k, o0VarE, 6);
                        p3.x1 x1Var2 = p3.n.f135158a;
                        int iHashCode2 = Long.hashCode(o0VarE.U);
                        p3.i2 i2VarA1 = o0VarE.a0();
                        h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
                        h5.g.V.getClass();
                        h5.e0.a aVar5 = h5.g.a.f81805b;
                        if (cVar == null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar5);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                        c2.u2 u2Var = c2.u2.f22900a;
                        String str2 = tVar.f101148a;
                        j92.f fVar = d92.b.f58624b;
                        fVar.getClass();
                        s5.x0 x0Var = j92.f.f97931h;
                        s5.x0 x0VarF2 = d92.c.f(x0Var, o0VarE);
                        bVar3.getClass();
                        float f17 = eVar3.f97920e;
                        bVar3.getClass();
                        float f18 = eVar3.f97920e;
                        bVar3.getClass();
                        p3.o0 o0Var = o0VarE;
                        mh.c(str2, c2.l.C(aVar4, f17, 0.0f, f18, eVar3.f97917b, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 131068);
                        String str3 = str == null ? "" : str;
                        fVar.getClass();
                        s5.x0 x0VarB = d92.c.b(d92.c.e(x0Var), o0Var);
                        bVar3.getClass();
                        float f19 = eVar3.f97920e;
                        bVar3.getClass();
                        float f22 = eVar3.f97920e;
                        bVar3.getClass();
                        h4.r rVarC4 = c2.l.C(aVar4, f19, 0.0f, f22, eVar3.f97917b, 2);
                        boolean zR = o0Var.r(tVar);
                        Object objQ = o0Var.q();
                        if (zR) {
                            objQ = new ds0.g(tVar, 19);
                            o0Var.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ds0.g(tVar, 19);
                                o0Var.K(objQ);
                            }
                        }
                        mh.c(str3, p5.v.c((e23.l) objQ, rVarC4, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 131068);
                        o0VarE = o0Var;
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                        z14 = false;
                    } else {
                        z14 = false;
                        o0VarE.C(-1038562356);
                        l72.p2 p2Var = l72.p2.f111205a;
                        String str4 = tVar.f101148a;
                        String str5 = str == null ? "" : str;
                        u4.d dVar = tVar.f101153f;
                        if (dVar == null) {
                            o0VarE.C(-1038321022);
                            o0VarE.g0(false);
                            eVar = null;
                        } else {
                            o0VarE.C(-1038321021);
                            z3.e eVarC = z3.f.c(-1203045058, new b82.k(dVar, 2), o0VarE);
                            o0VarE.g0(false);
                            eVar = eVarC;
                        }
                        boolean z17 = tVar.f101151d;
                        boolean zR2 = o0VarE.r(tVar) | o0VarE.r(this);
                        Object objQ2 = o0VarE.q();
                        if (zR2) {
                            objQ2 = new l1(tVar, this, 2);
                            o0VarE.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l1(tVar, this, 2);
                                o0VarE.K(objQ2);
                            }
                        }
                        tu1.a.a(p2Var, null, str4, str5, z17, eVar, (e23.a) objQ2, o0VarE, 0, 9);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(-1037312777);
                    o0VarE.g0(false);
                }
                f16 = 1.0f;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new k1(this, list, i14, 5);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTReviewInformationFragCompose";
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    public final void y6(List<jv1.t> list, p3.m mVar, int i14) {
        p3.p2 p2VarI0;
        k1 k1Var;
        p3.o0 o0VarE = mVar.E(1344856426);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    k1Var = new k1(this, list, i14, 0);
                }
            } else {
                h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarE.C(-72162945);
                for (jv1.t tVar : list) {
                    if (tVar.f101152e) {
                        o0VarE.C(-710965908);
                        l72.p2 p2Var = l72.p2.f111205a;
                        String str = tVar.f101148a;
                        String str2 = tVar.f101149b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        boolean z14 = tVar.f101151d;
                        boolean zR = o0VarE.r(tVar) | o0VarE.r(this);
                        Object objQ = o0VarE.q();
                        if (zR) {
                            objQ = new l1(tVar, this, 0);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l1(tVar, this, 0);
                                o0VarE.K(objQ);
                            }
                        }
                        tu1.a.a(p2Var, null, str, str2, z14, null, (e23.a) objQ, o0VarE, 0, 41);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-710427748);
                        o0VarE.g0(false);
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                p3.x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = k1Var;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            k1Var = new k1(this, list, i14, 1);
            p2VarI0.f135219d = k1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void z6(jv1.u uVar, fw.p pVar, p3.m mVar, int i14) {
        int i15;
        o13.p pVar2;
        o13.p pVar3;
        Integer num;
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-181590777);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(uVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(pVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            vt1.o oVar = uVar.f101158a;
            int i16 = oVar == null ? -1 : jv1.u.a.f101163a[oVar.ordinal()];
            if (i16 == 1) {
                pVar2 = new o13.p(Integer.valueOf(R.string.get_ready_to_run), 2131232219);
            } else if (i16 == 2) {
                pVar2 = new o13.p(Integer.valueOf(R.string.itp_plan_created_title), 2131231061);
            } else if (i16 != 3) {
                if (i16 == 4 || i16 == 5) {
                    pVar2 = new o13.p(Integer.valueOf(R.string.get_ready_for_your_workouts), 2131232839);
                } else {
                    pVar3 = new o13.p(null, null);
                }
                num = (Integer) pVar3.f128594a;
                Integer num2 = (Integer) pVar3.f128595b;
                o0VarE.C(-568583170);
                if (num != null || num2 == null) {
                    z14 = true;
                    z15 = false;
                } else {
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    t4.d dVarA = n5.c.a(iIntValue, o0VarE, 0);
                    String strQ = gl1.y.Q(o0VarE, R.string.default_image_view_content_description);
                    f5.k.f68985a.getClass();
                    z14 = true;
                    u1.y0.a(dVarA, strQ, c2.x2.d(aVar, 1.0f), null, f5.k.a.f68987b, 0.3f, null, o0VarE, 221568, 72);
                    int i17 = d.f66685a[pVar.ordinal()];
                    if (i17 == 1) {
                        z15 = false;
                        o0VarE.C(762124832);
                        H6(o0VarE, (i15 >> 6) & 14);
                        o0VarE.g0(false);
                    } else if (i17 == 2) {
                        z15 = false;
                        o0VarE.C(-2143869440);
                        this.f66679c = true;
                        F6(iIntValue2, o0VarE, (i15 >> 3) & 112);
                        o0VarE.g0(false);
                    } else {
                        if (i17 != 3) {
                            throw kg.f.h(o0VarE, 762123489, false);
                        }
                        o0VarE.C(-2143712859);
                        this.f66680d = true;
                        G6(o0VarE, (i15 >> 6) & 14);
                        z15 = false;
                        o0VarE.g0(false);
                    }
                }
                o0VarE.g0(z15);
                o0VarE.g0(z14);
            } else {
                pVar2 = new o13.p(Integer.valueOf(R.string.get_ready_to_train_exclamation), 2131232856);
            }
            pVar3 = pVar2;
            num = (Integer) pVar3.f128594a;
            Integer num3 = (Integer) pVar3.f128595b;
            o0VarE.C(-568583170);
            if (num != null) {
                z14 = true;
                z15 = false;
            } else {
                z14 = true;
                z15 = false;
            }
            o0VarE.g0(z15);
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, uVar, pVar, i14, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/q1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
