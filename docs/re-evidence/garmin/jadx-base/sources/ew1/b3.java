package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0016\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0014\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lew1/b3;", "Lew1/u;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Lfw1/a;", "upcomingEventsModel", "", "updateEventResult", "Lfg0/k;", "fetchTriathlonEventResult", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b3 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f66335d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f66337c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f66338a;

        public b(e23.a<Unit> aVar) {
            this.f66338a = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                p3.x1 x1Var = p3.n.f135158a;
                l72.f0 f0Var = l72.f0.f110999a;
                h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f0Var.k(gl1.y.Q(mVar2, R.string.find_a_different_event), c2.l.y(rVarF, j92.b.f97899b.f97920e), false, this.f66338a, mVar2, 0, 4);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66339a;

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
            f66339a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/b3$d", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b3 b3Var = b3.this;
            b3Var.f66337c.f(false);
            b3Var.F6().u6().m(null);
            b3Var.F6().d8();
            b3Var.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66341a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66341a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66342a = aVar;
            this.f66343b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66342a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66343b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f66344a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66344a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b3() {
        super(R.layout.fbt_activity_view);
        this.f66336b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new e(this), new g(this), new f(null, this));
        this.f66337c = new d();
    }

    public final void A6(final fg0.k kVar, final List<fg0.k> list, final List<fg0.n> list2, final boolean z14, final int i14, final int i15, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.l<? super fg0.k, Unit> lVar, e23.a<Unit> aVar3, p3.m mVar, int i16, int i17) {
        p3.o0 o0VarE = mVar.E(707356796);
        int i18 = i16 | ((i16 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(list2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.k(i15) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
        if (o0VarE.n(i18 & 1, ((306783379 & i18) == 306783378 && (i17 & 1) == 0) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            b82.c.c(z3.f.c(326090780, new b(aVar3), o0VarE), z3.f.c(-1481273834, new e23.q() { // from class: ew1.y2
                /* JADX WARN: Code duplicated, block: B:25:0x01e1  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Context context2;
                    List list3;
                    List<fg0.k> list4;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    b3.a aVar5 = b3.f66335d;
                    ((c2.a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar6 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f14 = eVar.f97921f;
                        float f15 = eVar.f97920e;
                        g02.b2.a(c2.l.C(aVar6, 0.0f, 0.0f, 0.0f, f14, 7), z14, i14, i15, gl1.y.Q(mVar2, R.string.which_race_or_event_question), null, gl1.y.Q(mVar2, R.string.what_events_can_i_train_for), null, aVar, mVar2, 0, SyslogConstants.LOG_LOCAL4);
                        fg0.k kVar3 = kVar;
                        Context context3 = context;
                        List list5 = list2;
                        List list6 = list;
                        if (kVar3 != null) {
                            mVar2.C(-2134015301);
                            h4.r rVarC2 = c2.l.C(c2.l.A(c2.x2.f(aVar6, 1.0f), f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97917b, 7);
                            String strQ = gl1.y.Q(mVar2, R.string.primary_race_title);
                            Locale locale = Locale.ROOT;
                            String upperCase = strQ.toUpperCase(locale);
                            upperCase.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0Var = j92.f.f97933j;
                            list4 = list6;
                            context2 = context3;
                            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                            f10.d.b(null, f10.d.e(context2, list5, kVar3), aVar2, mVar2, 0);
                            if (list4.isEmpty()) {
                                mVar2 = mVar2;
                                list3 = list5;
                                mVar2.C(-2132878996);
                                mVar2.f();
                            } else {
                                mVar2 = mVar2;
                                mVar2.C(-2133328465);
                                h4.r rVarC3 = c2.l.C(c2.l.A(c2.x2.f(aVar6, 1.0f), f15, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97917b, 5);
                                String upperCase2 = gl1.y.Q(mVar2, R.string.other_races_title).toUpperCase(locale);
                                upperCase2.getClass();
                                list3 = list5;
                                mh.c(upperCase2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 131068);
                                mVar2 = mVar2;
                                mVar2.f();
                            }
                            mVar2.f();
                        } else {
                            context2 = context3;
                            list3 = list5;
                            list4 = list6;
                            mVar2.C(-2132861140);
                            mVar2.f();
                        }
                        for (fg0.k kVar4 : list4) {
                            f10.b bVarE = f10.d.e(context2, list3, kVar4);
                            e23.l lVar2 = lVar;
                            boolean zB = mVar2.B(lVar2) | mVar2.r(kVar4);
                            Object objQ = mVar2.q();
                            if (zB) {
                                objQ = new d50.g(lVar2, kVar4, 1);
                                mVar2.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d50.g(lVar2, kVar4, 1);
                                    mVar2.K(objQ);
                                }
                            }
                            f10.d.b(null, bVarE, (e23.a) objQ, mVar2, 0);
                        }
                        p3.x1 x1Var3 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.t(this, kVar, list, list2, z14, i14, i15, aVar, aVar2, lVar, aVar3, i16, i17);
        }
    }

    public final void C6(fg0.k kVar, fw1.a aVar) {
        if (!d53.u.q(kVar.getProvider(), "gc-discoverable-events", false) || kVar.n0()) {
            E6(kVar, aVar);
            return;
        }
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(requireContext());
        aVar2.setTitle(R.string.user_created_event);
        aVar2.setMessage(aVar2.getContext().getString(R.string.user_created_event_warning_message));
        aVar2.setPositiveButton(R.string.lbl_common_continue, new bi2.k(this, 11, kVar, aVar));
        aVar2.setNegativeButton(android.R.string.cancel, new com.garmin.android.apps.connectmobile.connectiq.i(28));
        aVar2.create().show();
    }

    public final void E6(fg0.k kVar, fw1.a aVar) {
        fg0.k kVarB5 = F6().B5();
        fg0.j eventCustomization = kVar.getEventCustomization();
        if (eventCustomization != null ? p005kotlin.jvm.internal.s.g(eventCustomization.getIsPrimaryEvent(), Boolean.TRUE) : false) {
            aw1.h hVarF6 = F6();
            if (kVar.getEventType() == gg0.f.f77136l) {
                hVarF6.R7(kVar);
                hVarF6.s6().j("FBTTriathlonTrainingHistoryFragCompose");
                return;
            } else {
                hVarF6.K7(kVar);
                hVarF6.H6();
                return;
            }
        }
        if (kVarB5 != null) {
            G6(new cw1.g0(this, 19, kVar, kVarB5));
        } else if (aVar.f73783e != null) {
            G6(new c2(7, this, kVar));
        } else {
            F6().j8(kVar, null);
        }
    }

    public final aw1.h F6() {
        return (aw1.h) this.f66336b.getValue();
    }

    public final void G6(e23.a<Unit> aVar) {
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(requireContext());
        aVar2.setTitle(R.string.make_event_primary_question);
        aVar2.setMessage(aVar2.getContext().getString(R.string.make_event_primary_message_v2));
        aVar2.setPositiveButton(R.string.set_as_primary, new c32.a(aVar, 1));
        aVar2.setNegativeButton(android.R.string.cancel, new com.garmin.android.apps.connectmobile.connectiq.i(27));
        aVar2.create().show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        g22.e.f(this);
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setTitle(R.string.select_event_title);
            b.u onBackPressedDispatcher = activity.getOnBackPressedDispatcher();
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.b(this.f66337c, viewLifecycleOwner);
        }
        F6().G1 = null;
        tu1.a.p(view2, R.id.composable_container, new z3.e(-395839367, true, new dh1.a(this, 21)));
    }

    public final void w6(g3<fg0.k> g3Var, fw1.a aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(560270025);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(g3Var) : o0VarE.r(g3Var) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (g3Var != null) {
                int i16 = c.f66339a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.f(this);
                    fg0.k kVar = g3Var.f35301b;
                    if (kVar != null) {
                        C6(kVar, aVar);
                    }
                    F6().o6().m(null);
                } else if (i16 == 2) {
                    g22.e.a(this, null);
                    g22.e.f(this);
                    F6().o6().m(null);
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return;
                    }
                    g22.e.l(this);
                }
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, g3Var, aVar, i14, 26);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTUserUpcomingEventsFragCompose";
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x0180  */
    public final void y6(g3<fw1.a> g3Var, p3.p1<fg0.k> p1Var, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        p3.o0 o0VarE = mVar.E(1821448706);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(g3Var) : o0VarE.r(g3Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(p1Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (g3Var == null) {
                o0VarE.C(161826381);
                o0VarE.g0(false);
            } else {
                o0VarE.C(161826382);
                int i17 = c.f66339a[g3Var.f35300a.ordinal()];
                if (i17 != 1) {
                    if (i17 == 2) {
                        o0VarE.C(-1106099028);
                        o0VarE.g0(false);
                        g22.e.f(this);
                        g22.e.a(this, null);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (i17 != 3) {
                            throw kg.f.h(o0VarE, -174332315, false);
                        }
                        o0VarE.C(-174223612);
                        o0VarE.g0(false);
                        g22.e.l(this);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    z14 = false;
                } else {
                    o0VarE.C(-1109289920);
                    g22.e.f(this);
                    fw1.a aVar = g3Var.f35301b;
                    if (aVar == null) {
                        o0VarE.C(-1109220326);
                        o0VarE.g0(false);
                        z14 = false;
                    } else {
                        o0VarE.C(-1109220325);
                        fg0.k kVar = aVar.f73780b;
                        List<fg0.k> list = aVar.f73779a;
                        if (list == null) {
                            list = p13.j0.f134944a;
                        }
                        List<fg0.n> list2 = aVar.f73781c;
                        if (list2 == null) {
                            list2 = p13.j0.f134944a;
                        }
                        boolean zR5 = F6().R5();
                        int iC5 = F6().C5("FBTUserUpcomingEventsFragCompose");
                        int iY5 = F6().Y5();
                        boolean zR = o0VarE.r(this);
                        Object objQ = o0VarE.q();
                        p3.m.a aVar2 = p3.m.f135153a;
                        if (zR) {
                            objQ = new e23.a(this) { // from class: ew1.z2

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b3 f66887b;

                                {
                                    this.f66887b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i16;
                                    b3 b3Var = this.f66887b;
                                    switch (i18) {
                                        case 0:
                                            b3.a aVar3 = b3.f66335d;
                                            HelpActivity.a.e(HelpActivity.f36653a, b3Var.getActivity(), ro0.l.TRAINABLE_EVENTS, null, null, 12);
                                            break;
                                        default:
                                            b3.a aVar4 = b3.f66335d;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachDidNotSelectUserEvent");
                                            if (b3Var.F6().R6()) {
                                                aw1.h hVarF6 = b3Var.F6();
                                                jv1.s sVarI6 = hVarF6.i6();
                                                hVarF6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -537133281, 511) : null);
                                                hVarF6.w7();
                                                if (hVarF6.O6()) {
                                                    hVarF6.s6().j("FBTSelectSportFragmentCompose");
                                                } else if (hVarF6.e7()) {
                                                    hVarF6.s6().j("FBTTriathlonTrainingHistoryFragCompose");
                                                } else {
                                                    hVarF6.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                                }
                                            } else {
                                                b3Var.F6().s6().j("navigate_to_event_search");
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e23.a(this) { // from class: ew1.z2

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b3 f66887b;

                                    {
                                        this.f66887b = this;
                                    }

                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i18 = i16;
                                        b3 b3Var = this.f66887b;
                                        switch (i18) {
                                            case 0:
                                                b3.a aVar3 = b3.f66335d;
                                                HelpActivity.a.e(HelpActivity.f36653a, b3Var.getActivity(), ro0.l.TRAINABLE_EVENTS, null, null, 12);
                                                break;
                                            default:
                                                b3.a aVar4 = b3.f66335d;
                                                fy1.c.f73884a.getClass();
                                                fy1.c.b("GarminCoachDidNotSelectUserEvent");
                                                if (b3Var.F6().R6()) {
                                                    aw1.h hVarF6 = b3Var.F6();
                                                    jv1.s sVarI6 = hVarF6.i6();
                                                    hVarF6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -537133281, 511) : null);
                                                    hVarF6.w7();
                                                    if (hVarF6.O6()) {
                                                        hVarF6.s6().j("FBTSelectSportFragmentCompose");
                                                    } else if (hVarF6.e7()) {
                                                        hVarF6.s6().j("FBTTriathlonTrainingHistoryFragCompose");
                                                    } else {
                                                        hVarF6.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                                    }
                                                } else {
                                                    b3Var.F6().s6().j("navigate_to_event_search");
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ);
                            }
                        }
                        e23.a<Unit> aVar3 = (e23.a) objQ;
                        int i18 = i15 & 112;
                        boolean zR2 = o0VarE.r(this) | (i18 == 32) | o0VarE.r(aVar);
                        Object objQ2 = o0VarE.q();
                        if (zR2) {
                            objQ2 = new cw1.g0(this, p1Var, aVar, 20);
                            o0VarE.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new cw1.g0(this, p1Var, aVar, 20);
                                o0VarE.K(objQ2);
                            }
                        }
                        e23.a<Unit> aVar4 = (e23.a) objQ2;
                        boolean zR3 = (i18 == 32) | o0VarE.r(this) | o0VarE.r(aVar);
                        Object objQ3 = o0VarE.q();
                        if (zR3) {
                            objQ3 = new ci0.b(p1Var, 23, this, aVar);
                            o0VarE.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new ci0.b(p1Var, 23, this, aVar);
                                o0VarE.K(objQ3);
                            }
                        }
                        e23.l<? super fg0.k, Unit> lVar = (e23.l) objQ3;
                        boolean zR4 = o0VarE.r(this);
                        Object objQ4 = o0VarE.q();
                        if (zR4) {
                            final int i19 = 1;
                            objQ4 = new e23.a(this) { // from class: ew1.z2

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ b3 f66887b;

                                {
                                    this.f66887b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i19;
                                    b3 b3Var = this.f66887b;
                                    switch (i110) {
                                        case 0:
                                            b3.a aVar5 = b3.f66335d;
                                            HelpActivity.a.e(HelpActivity.f36653a, b3Var.getActivity(), ro0.l.TRAINABLE_EVENTS, null, null, 12);
                                            break;
                                        default:
                                            b3.a aVar6 = b3.f66335d;
                                            fy1.c.f73884a.getClass();
                                            fy1.c.b("GarminCoachDidNotSelectUserEvent");
                                            if (b3Var.F6().R6()) {
                                                aw1.h hVarF6 = b3Var.F6();
                                                jv1.s sVarI6 = hVarF6.i6();
                                                hVarF6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -537133281, 511) : null);
                                                hVarF6.w7();
                                                if (hVarF6.O6()) {
                                                    hVarF6.s6().j("FBTSelectSportFragmentCompose");
                                                } else if (hVarF6.e7()) {
                                                    hVarF6.s6().j("FBTTriathlonTrainingHistoryFragCompose");
                                                } else {
                                                    hVarF6.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                                }
                                            } else {
                                                b3Var.F6().s6().j("navigate_to_event_search");
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                final int i110 = 1;
                                objQ4 = new e23.a(this) { // from class: ew1.z2

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ b3 f66887b;

                                    {
                                        this.f66887b = this;
                                    }

                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i111 = i110;
                                        b3 b3Var = this.f66887b;
                                        switch (i111) {
                                            case 0:
                                                b3.a aVar5 = b3.f66335d;
                                                HelpActivity.a.e(HelpActivity.f36653a, b3Var.getActivity(), ro0.l.TRAINABLE_EVENTS, null, null, 12);
                                                break;
                                            default:
                                                b3.a aVar6 = b3.f66335d;
                                                fy1.c.f73884a.getClass();
                                                fy1.c.b("GarminCoachDidNotSelectUserEvent");
                                                if (b3Var.F6().R6()) {
                                                    aw1.h hVarF6 = b3Var.F6();
                                                    jv1.s sVarI6 = hVarF6.i6();
                                                    hVarF6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -537133281, 511) : null);
                                                    hVarF6.w7();
                                                    if (hVarF6.O6()) {
                                                        hVarF6.s6().j("FBTSelectSportFragmentCompose");
                                                    } else if (hVarF6.e7()) {
                                                        hVarF6.s6().j("FBTTriathlonTrainingHistoryFragCompose");
                                                    } else {
                                                        hVarF6.s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
                                                    }
                                                } else {
                                                    b3Var.F6().s6().j("navigate_to_event_search");
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ4);
                            }
                        }
                        z14 = false;
                        A6(kVar, list, list2, zR5, iC5, iY5, aVar3, aVar4, lVar, (e23.a) objQ4, o0VarE, fg0.k.X, (i15 >> 6) & 14);
                        o0VarE.g0(false);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    o0VarE.g0(z14);
                }
                o0VarE.g0(z14);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3(this, g3Var, p1Var, i14, 0);
        }
    }

    public final void z6(g3<Unit> g3Var, p3.p1<fg0.k> p1Var, p3.m mVar, int i14) {
        int i15;
        p3.p1<fg0.k> p1Var2;
        fg0.j jVar;
        fg0.j jVar2;
        jv1.m mVarA;
        jv1.m mVar2;
        fg0.j jVarB;
        jv1.h hVar;
        vt1.f fVarV6;
        p3.o0 o0VarE = mVar.E(612233032);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(g3Var) : o0VarE.r(g3Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            p1Var2 = p1Var;
            i15 |= o0VarE.B(p1Var2) ? 32 : 16;
        } else {
            p1Var2 = p1Var;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (g3Var != null) {
                int i16 = c.f66339a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.f(this);
                    fg0.k f182175a = p1Var2.getF182175a();
                    if (f182175a != null) {
                        aw1.h hVarF6 = F6();
                        fg0.j eventCustomization = f182175a.getEventCustomization();
                        if (eventCustomization != null) {
                            Boolean bool = Boolean.TRUE;
                            jVar = fg0.j.b(eventCustomization, null, null, bool, bool, null, null, 8155);
                        } else {
                            Boolean bool2 = Boolean.TRUE;
                            jVar = new fg0.j(null, null, bool2, null, null, bool2, null, null, null, null, null, null, null, 8155, null);
                        }
                        fg0.d customGoal = jVar.getCustomGoal();
                        vt1.o oVarW = tu1.a.w(f182175a);
                        if (f182175a.getEventType() == gg0.f.f77136l) {
                            jVar2 = jVar;
                            jVarB = fg0.j.b(jVar2, null, null, null, null, null, null, 8191);
                            hVar = null;
                            fVarV6 = null;
                            mVar2 = null;
                        } else {
                            jVar2 = jVar;
                            jv1.h hVarU = tu1.a.u(f182175a);
                            if (customGoal != null) {
                                jv1.m.f101075d.getClass();
                                mVarA = jv1.m.a.a(customGoal);
                            } else {
                                mVarA = null;
                            }
                            mVar2 = mVarA;
                            jVarB = null;
                            hVar = hVarU;
                            fVarV6 = hVarF6.v6(mVarA, hVarU, oVarW);
                        }
                        jv1.s sVarI6 = hVarF6.i6();
                        hVarF6.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, fg0.k.d(f182175a, null, null, null, null, null, null, jVar2, -16777217), oVarW, tu1.a.t(f182175a), hVar, fVarV6, mVar2, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVarB, null, null, null, null, null, null, null, -536871165, 508) : null);
                    }
                    aw1.h hVarF7 = F6();
                    hVarF7.H6();
                    hVarF7.O4().m(null);
                    hVarF7.g6(null);
                } else if (i16 == 2) {
                    F6().O4().m(null);
                    g22.e.a(this, null);
                    g22.e.f(this);
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return;
                    }
                    g22.e.l(this);
                }
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3(this, g3Var, p1Var2, i14, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/b3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
