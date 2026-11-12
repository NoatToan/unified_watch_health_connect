package ew1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.e5;
import i3.mh;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew1/y;", "Lew1/u;", "<init>", "()V", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f66842g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f66845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f66846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f66847f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.fragments.FBTCoachRecommendationFragCompose$CoachRecommendationScreen$1$1", f = "FBTCoachRecommendationFragCompose.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return y.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            fy1.c cVar = fy1.c.f73884a;
            b bVar = y.f66842g;
            jv1.s sVar = (jv1.s) y.this.A6().j6().d();
            vt1.o oVar = sVar != null ? sVar.f101125d : null;
            cVar.getClass();
            int i14 = oVar == null ? -1 : fy1.c.a.f73888b[oVar.ordinal()];
            if (i14 != 1) {
                str = i14 != 2 ? "GarminCoachATPCautionShown" : "GarminCoachITPCautionShown";
            } else {
                str = "GarminCoachTriathlonCautionShown";
            }
            fy1.c.b(str);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66849a;

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
            f66849a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ew1/y$d", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends b.s {
        public d() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b bVar = y.f66842g;
            y yVar = y.this;
            aw1.h hVarA6 = yVar.A6();
            androidx.fragment.app.m mVarRequireActivity = yVar.requireActivity();
            mVarRequireActivity.getClass();
            if (hVarA6.f13385r1 && hVarA6.Y6()) {
                hVarA6.x6();
                hVarA6.s6().j("FBTItpHoursPerWeekSelectionFragmentCompose");
            } else {
                hVarA6.t7();
                if (hVarA6.e7() && (hVarA6.N6() || (hVarA6.d7() && !hVarA6.Q6()))) {
                    aw1.h.n7(hVarA6, mVarRequireActivity);
                }
            }
            f(false);
            yVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66851a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f66851a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66851a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66853b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66852a = aVar;
            this.f66853b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66852a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66853b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f66854a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66854a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ew1.v] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ew1.v] */
    public y() {
        super(R.layout.fbt_activity_view);
        this.f66843b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new e(this), new g(this), new f(null, this));
        final int i14 = 0;
        this.f66845d = new androidx.lifecycle.z0(this) { // from class: ew1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f66796b;

            {
                this.f66796b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                y yVar = this.f66796b;
                g3 g3Var = (g3) obj;
                switch (i15) {
                    case 0:
                        y.b bVar = y.f66842g;
                        fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                        int i16 = pVar != null ? y.c.f66849a[pVar.ordinal()] : -1;
                        if (i16 == 1) {
                            g22.e.l(yVar);
                            break;
                        } else if (i16 == 2) {
                            g22.e.f(yVar);
                            jv1.f fVar = (jv1.f) g3Var.f35301b;
                            if (fVar != null) {
                                yVar.A6().r7(fVar);
                            }
                            break;
                        } else if (i16 == 3) {
                            g22.e.f(yVar);
                            g22.e.a(yVar, null);
                            yVar.A6().l5();
                            break;
                        }
                        break;
                    default:
                        y.b bVar2 = y.f66842g;
                        if (g3Var != null) {
                            int i17 = y.c.f66849a[g3Var.f35300a.ordinal()];
                            if (i17 == 1) {
                                g22.e.l(yVar);
                            } else if (i17 == 2) {
                                g22.e.f(yVar);
                                androidx.fragment.app.m activity = yVar.getActivity();
                                if (activity != null) {
                                    activity.getSupportFragmentManager().c0(-1, 1, yVar.A6().O6() ? "FBTRideWeeklyAvgHoursFragCompose" : yVar.A6().e7() ? "FBTTriathlonTrainingHistoryFragCompose" : "FBTRunningWeeklyAvgDistancePaceFragCompose");
                                    yVar.A6().s6().j("FBTUserUpcomingEventsFragCompose");
                                }
                            } else if (i17 != 3) {
                                lc.u0.r();
                            } else {
                                g22.e.f(yVar);
                                g22.e.a(yVar, null);
                            }
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f66846e = new androidx.lifecycle.z0(this) { // from class: ew1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f66796b;

            {
                this.f66796b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                y yVar = this.f66796b;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        y.b bVar = y.f66842g;
                        fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                        int i17 = pVar != null ? y.c.f66849a[pVar.ordinal()] : -1;
                        if (i17 == 1) {
                            g22.e.l(yVar);
                            break;
                        } else if (i17 == 2) {
                            g22.e.f(yVar);
                            jv1.f fVar = (jv1.f) g3Var.f35301b;
                            if (fVar != null) {
                                yVar.A6().r7(fVar);
                            }
                            break;
                        } else if (i17 == 3) {
                            g22.e.f(yVar);
                            g22.e.a(yVar, null);
                            yVar.A6().l5();
                            break;
                        }
                        break;
                    default:
                        y.b bVar2 = y.f66842g;
                        if (g3Var != null) {
                            int i18 = y.c.f66849a[g3Var.f35300a.ordinal()];
                            if (i18 == 1) {
                                g22.e.l(yVar);
                            } else if (i18 == 2) {
                                g22.e.f(yVar);
                                androidx.fragment.app.m activity = yVar.getActivity();
                                if (activity != null) {
                                    activity.getSupportFragmentManager().c0(-1, 1, yVar.A6().O6() ? "FBTRideWeeklyAvgHoursFragCompose" : yVar.A6().e7() ? "FBTTriathlonTrainingHistoryFragCompose" : "FBTRunningWeeklyAvgDistancePaceFragCompose");
                                    yVar.A6().s6().j("FBTUserUpcomingEventsFragCompose");
                                }
                            } else if (i18 != 3) {
                                lc.u0.r();
                            } else {
                                g22.e.f(yVar);
                                g22.e.a(yVar, null);
                            }
                        }
                        break;
                }
            }
        };
        this.f66847f = new d();
    }

    public final aw1.h A6() {
        return (aw1.h) this.f66843b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:102:0x0230  */
    /* JADX WARN: Code duplicated, block: B:106:0x023b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0251  */
    /* JADX WARN: Code duplicated, block: B:112:0x025b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0268  */
    /* JADX WARN: Code duplicated, block: B:116:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0278  */
    /* JADX WARN: Code duplicated, block: B:118:0x028a  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strA;
        String string;
        ew1.a aVar;
        String strA2;
        String string2;
        vt1.n nVar;
        String string3;
        o13.p pVar;
        o13.p pVar2;
        String strValueOf;
        String strA3;
        Integer num;
        vt1.n nVar2;
        String strValueOf2;
        Integer num2;
        String strA4;
        Integer num3;
        String strValueOf3;
        ew1.a aVar2;
        o13.p pVar3;
        vt1.n nVar3;
        Integer num4;
        String strValueOf4;
        vt1.n nVar4;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        boolean z14 = false;
        this.f66844c = A6().H5().f61437c;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setTitle(R.string.atp_lbl_coach_recommendation);
        b.u onBackPressedDispatcher = mVarRequireActivity.getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f66847f, viewLifecycleOwner);
        if (!this.f66844c && A6().Q6() && getParentFragmentManager().G("FBTUserUpcomingEventsFragCompose") == null) {
            A6().M0.f(getViewLifecycleOwner(), this.f66846e);
        }
        if ((A6().L6() && A6().O6()) || !A6().O6()) {
            A6().A5().f(getViewLifecycleOwner(), this.f66845d);
        }
        aw1.h hVarA6 = A6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        jv1.e eVarY5 = A6().y5();
        boolean z15 = this.f66844c;
        if (!z15 && A6().Q6() && getParentFragmentManager().G("FBTAddGoalDataFragment") == null) {
            z14 = true;
        }
        String str = "";
        if (eVarY5 == null || (nVar4 = eVarY5.f101033b) == null) {
            strA = eVarY5 != null ? eVarY5.f101041j : null;
            if (strA == null) {
                strA = "";
            }
        } else {
            strA = nVar4.a(contextRequireContext);
        }
        l22.a aVar3 = new l22.a(contextRequireContext);
        if (hVarA6.O6() && hVarA6.Y6()) {
            o13.p pVar4 = z15 ? new o13.p(contextRequireContext.getString(R.string.set_finish_goal), contextRequireContext.getString(R.string.lbl_exit)) : new o13.p(contextRequireContext.getString(R.string.common_change_selection), contextRequireContext.getString(R.string.common_keep_selection));
            aVar = new ew1.a(contextRequireContext.getString(R.string.itp_challenging_plan_header), contextRequireContext.getString(R.string.itp_plan_recommendation_description, "5-9"), null, null, (String) pVar4.f128594a, (String) pVar4.f128595b, 12, null);
        } else if (hVarA6.G1 != null && !hVarA6.J6()) {
            jv1.e eVarY6 = hVarA6.y5();
            if (eVarY6 != null && eVarY6.f101032a) {
                jv1.e eVarY7 = hVarA6.y5();
                if ((eVarY7 != null ? eVarY7.f101037f : null) != null) {
                    if (hVarA6.J6()) {
                        if (hVarA6.e7()) {
                            string2 = contextRequireContext.getString(R.string.half_triathlon_caution_description);
                        } else {
                            if (eVarY5 != null) {
                                strA2 = "";
                            } else {
                                strA2 = "";
                            }
                            string2 = contextRequireContext.getString(R.string.coach_caution_recommendation_message, strA, strA2);
                        }
                        String str2 = string2;
                        str2.getClass();
                        if (hVarA6.e7()) {
                            string3 = contextRequireContext.getString(R.string.atp_lbl_challenging_distance);
                        } else {
                            string3 = contextRequireContext.getString(R.string.challenging_distance);
                        }
                        String str3 = string3;
                        str3.getClass();
                        if (z15) {
                            pVar = new o13.p(contextRequireContext.getString(R.string.set_finish_goal), contextRequireContext.getString(R.string.lbl_exit));
                        } else if (z14) {
                            pVar = new o13.p(aVar3.getString(R.string.lbl_change_event), aVar3.getString(R.string.lbl_keep_event));
                        } else {
                            pVar = new o13.p(contextRequireContext.getString(R.string.change_distance_goal), contextRequireContext.getString(R.string.keep_my_goal));
                        }
                        aVar = new ew1.a(str3, str2, null, null, (String) pVar.f128594a, (String) pVar.f128595b, 12, null);
                    } else {
                        if (z15) {
                            string = contextRequireContext.getString(R.string.challenging_time_goal_msg);
                        } else {
                            string = contextRequireContext.getString(R.string.atp_msg_challenging_time_goal);
                        }
                        String str4 = string;
                        str4.getClass();
                        aVar = new ew1.a(contextRequireContext.getString(R.string.atp_lbl_challenging_time_goal), str4, null, null, contextRequireContext.getString(R.string.atp_lbl_change_time_goal), contextRequireContext.getString(R.string.atp_lbl_keep_current_goal), 12, null);
                    }
                }
            }
            if (z15) {
                pVar2 = new o13.p(aVar3.getString(R.string.continue_setup_label), contextRequireContext.getString(R.string.lbl_exit));
            } else {
                pVar2 = z14 ? new o13.p(aVar3.getString(R.string.lbl_change_event), aVar3.getString(R.string.lbl_keep_event)) : new o13.p(contextRequireContext.getString(R.string.change_distance_goal), contextRequireContext.getString(R.string.keep_my_goal));
            }
            String str5 = (String) pVar2.f128594a;
            String str6 = (String) pVar2.f128595b;
            jv1.s sVarI6 = hVarA6.i6();
            jv1.h hVar = sVarI6 != null ? sVarI6.f101127f : null;
            jv1.g gVar = hVar instanceof jv1.g ? (jv1.g) hVar : null;
            if (gVar == null || (nVar2 = gVar.f101054c) == null || nVar2 == vt1.n.OTHER) {
                jv1.e eVar = hVarA6.G1;
                if (eVar == null || (num = eVar.f101040i) == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                    strValueOf = "";
                }
                strA3 = aVar3.a(R.string.challenging_time_frame_description_unnamed, strA, strValueOf, strA);
            } else {
                jv1.e eVar2 = hVarA6.G1;
                if (eVar2 == null || (num2 = eVar2.f101040i) == null || (strValueOf2 = String.valueOf(num2.intValue())) == null) {
                    strValueOf2 = "";
                }
                strA3 = aVar3.a(R.string.challenging_time_frame_description_named, strA, strValueOf2, strA);
            }
            aVar = new ew1.a(null, null, aVar3.getString(R.string.challenging_time_frame), strA3, str5, str6, 3, null);
        } else if (hVarA6.J6()) {
            if (hVarA6.e7()) {
                string2 = contextRequireContext.getString(R.string.half_triathlon_caution_description);
            } else {
                if (eVarY5 != null || (nVar = eVarY5.f101034c) == null) {
                    strA2 = "";
                } else {
                    strA2 = nVar.a(contextRequireContext);
                }
                string2 = contextRequireContext.getString(R.string.coach_caution_recommendation_message, strA, strA2);
            }
            String str7 = string2;
            str7.getClass();
            if (hVarA6.e7()) {
                string3 = contextRequireContext.getString(R.string.atp_lbl_challenging_distance);
            } else {
                string3 = contextRequireContext.getString(R.string.challenging_distance);
            }
            String str8 = string3;
            str8.getClass();
            if (z15) {
                pVar = new o13.p(contextRequireContext.getString(R.string.set_finish_goal), contextRequireContext.getString(R.string.lbl_exit));
            } else if (z14) {
                pVar = new o13.p(aVar3.getString(R.string.lbl_change_event), aVar3.getString(R.string.lbl_keep_event));
            } else {
                pVar = new o13.p(contextRequireContext.getString(R.string.change_distance_goal), contextRequireContext.getString(R.string.keep_my_goal));
            }
            aVar = new ew1.a(str8, str7, null, null, (String) pVar.f128594a, (String) pVar.f128595b, 12, null);
        } else {
            if (z15) {
                string = contextRequireContext.getString(R.string.challenging_time_goal_msg);
            } else {
                string = contextRequireContext.getString(R.string.atp_msg_challenging_time_goal);
            }
            String str9 = string;
            str9.getClass();
            aVar = new ew1.a(contextRequireContext.getString(R.string.atp_lbl_challenging_time_goal), str9, null, null, contextRequireContext.getString(R.string.atp_lbl_change_time_goal), contextRequireContext.getString(R.string.atp_lbl_keep_current_goal), 12, null);
        }
        ew1.a aVar4 = aVar;
        if (hVarA6.L6() && hVarA6.G1 == null) {
            String string4 = aVar3.getString(R.string.challenging_time_frame);
            jv1.s sVarI7 = hVarA6.i6();
            jv1.h hVar2 = sVarI7 != null ? sVarI7.f101127f : null;
            jv1.g gVar2 = hVar2 instanceof jv1.g ? (jv1.g) hVar2 : null;
            if (gVar2 == null || (nVar3 = gVar2.f101054c) == null || nVar3 == vt1.n.OTHER) {
                if (eVarY5 != null && (num3 = eVarY5.f101040i) != null && (strValueOf3 = String.valueOf(num3.intValue())) != null) {
                    str = strValueOf3;
                }
                strA4 = aVar3.a(R.string.challenging_time_frame_description_unnamed, strA, str, strA);
            } else {
                if (eVarY5 != null && (num4 = eVarY5.f101040i) != null && (strValueOf4 = String.valueOf(num4.intValue())) != null) {
                    str = strValueOf4;
                }
                strA4 = aVar3.a(R.string.challenging_time_frame_description_named, strA, str, strA);
            }
            String str10 = strA4;
            if (hVarA6.J6()) {
                aVar2 = new ew1.a(aVar4.f66294a, aVar4.f66295b, string4, str10, aVar4.f66298e, aVar4.f66299f);
            } else {
                if (z15) {
                    pVar3 = new o13.p(aVar3.getString(R.string.continue_setup_label), contextRequireContext.getString(R.string.lbl_exit));
                } else {
                    pVar3 = z14 ? new o13.p(aVar3.getString(R.string.lbl_change_event), aVar3.getString(R.string.lbl_keep_event)) : new o13.p(contextRequireContext.getString(R.string.change_distance_goal), contextRequireContext.getString(R.string.keep_my_goal));
                }
                aVar2 = new ew1.a(null, null, string4, str10, (String) pVar3.f128594a, (String) pVar3.f128595b);
            }
            aVar4 = aVar2;
        }
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(1215099679, true, new x(this, aVar4, 0, (byte) 0)));
    }

    @Override // ew1.u
    public final boolean v6() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    public final void w6(ew1.a aVar, p3.m mVar, int i14) {
        y yVar;
        boolean z14;
        ew1.a aVar2 = aVar;
        p3.o0 o0VarE = mVar.E(-592164522);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(aVar2) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, unit, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            h4.r rVarB = u1.a2.b(b0Var.a(c2.x2.f(aVar3, 1.0f), 1.0f, true), u1.a2.a(o0VarE), true);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarB, eVar2.f97920e, 0.0f, 2);
            c2.z zVarA2 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            bVar2.getClass();
            c2.l.f(c2.x2.h(aVar3, eVar2.f97921f), o0VarE);
            aVar2 = aVar;
            String str = aVar2.f66294a;
            String str2 = aVar2.f66297d;
            String str3 = aVar2.f66296c;
            String str4 = aVar2.f66295b;
            if (str == null || str4 == null) {
                yVar = this;
                o0VarE.C(796107872);
                o0VarE.g0(false);
            } else {
                o0VarE.C(795914711);
                yVar = this;
                yVar.z6(str, str4, o0VarE, (i15 << 3) & 896);
                o0VarE.g0(false);
            }
            if (str3 == null || str2 == null) {
                o0VarE.C(796739776);
                o0VarE.g0(false);
            } else {
                o0VarE.C(796231407);
                if (str == null || str4 == null) {
                    z14 = false;
                    o0VarE.C(796549312);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(796340775);
                    bVar2.getClass();
                    z14 = false;
                    e5.t(aVar3, eVar2.f97920e, o0VarE, false);
                }
                yVar.z6(str3, str2, o0VarE, (i15 << 3) & 896);
                o0VarE.g0(z14);
            }
            if (yVar.A6().J6()) {
                o0VarE.C(796805527);
                yVar.y6(gl1.y.Q(o0VarE, R.string.triathlon_coach_caution_note), o0VarE, i15 & 112);
                o0VarE.g0(false);
            } else {
                o0VarE.C(796906432);
                o0VarE.g0(false);
            }
            c2.l.f(b0Var.a(aVar3, 1.0f, true), o0VarE);
            o0VarE.g0(true);
            b82.c.b(null, null, z3.f.c(1808926753, new x(aVar2, yVar, 2), o0VarE), z3.f.c(164977984, new x(aVar2, yVar, 3), o0VarE), 0L, o0VarE, 3456, 19);
            o0VarE.g0(true);
        } else {
            yVar = this;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(yVar, aVar2, i14);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTCoachRecommendationFragCompose";
    }

    public final void y6(String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1916037920);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97921f, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
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
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i15 & 14, 0, 130046);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(this, str, i14, 29);
        }
    }

    public final void z6(String str, String str2, p3.m mVar, int i14) {
        String str3;
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1157287069);
        if ((i14 & 6) == 0) {
            str3 = str;
            i15 = i14 | (o0VarE.B(str3) ? 4 : 2);
        } else {
            str3 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57757g;
            mh.c(str3, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i16 & 14) | 48, 0, 130044);
            h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            fVar.getClass();
            mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, (i16 >> 3) & 14, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, str, str2, i14, 22);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew1/y$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
