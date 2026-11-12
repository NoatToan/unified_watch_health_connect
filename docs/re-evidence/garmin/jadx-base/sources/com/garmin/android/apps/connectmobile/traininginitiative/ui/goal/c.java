package com.garmin.android.apps.connectmobile.traininginitiative.ui.goal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.s;
import b.u;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPrioritySelectionActivity;
import fz1.g;
import fz1.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.WeakHashMap;
import l72.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import u1.y0;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46005c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f46007b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/goal/c$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = c.f46005c;
            c cVar = c.this;
            if (cVar.v6().f74008g == 0) {
                cVar.v6().J4();
                return;
            }
            CalendarItemDTO calendarItemDTO = cVar.v6().f74005d;
            if (calendarItemDTO != null) {
                m activity = cVar.getActivity();
                EventGoalActivity eventGoalActivity = activity instanceof EventGoalActivity ? (EventGoalActivity) activity : null;
                if (eventGoalActivity != null) {
                    eventGoalActivity.ca(cVar.v6().x4(), calendarItemDTO, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0891c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0891c(Fragment fragment) {
            super(0);
            this.f46009a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46009a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46010a = aVar;
            this.f46011b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46010a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46011b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46012a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46012a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46012a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.composable_container_w_tool_bar);
        this.f46006a = new w1(s0.f105811a.b(k.class), new C0891c(this), new e(this), new d(null, this));
        this.f46007b = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        m activity = getActivity();
        activity.getClass();
        ((EventGoalActivity) activity).showActionBar();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m activity = getActivity();
        activity.getClass();
        ((EventGoalActivity) activity).hideActionBar();
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46007b, viewLifecycleOwner);
        ((TextView) view2.findViewById(R.id.title_text_view)).setText(R.string.event_goal);
        View viewFindViewById = view2.findViewById(R.id.toolbar_actionbar_default);
        fb1.c cVar = new fb1.c(13);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, cVar);
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(1374584538, true, new g(this, 0, (byte) 0)));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x021d  */
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
    public final void u6(p3.m mVar, int i14) {
        final c cVar;
        boolean z14;
        o0 o0VarE = mVar.E(447787392);
        int i15 = i14 | (o0VarE.r(this) ? 4 : 2);
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97922g;
            bVar.getClass();
            r rVarZ = l.z(rVarD, eVar.f97920e, f14);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            t4.d dVarA = n5.c.a(R.drawable.ic_event_icon, o0VarE, 0);
            bVar.getClass();
            j92.c cVar2 = j92.b.f97901d;
            float f15 = cVar2.f97907f;
            bVar.getClass();
            r rVarR = x2.r(aVar, f15, cVar2.f97907f);
            f5.k.f68985a.getClass();
            y0.a(dVarA, null, rVarR, null, f5.k.a.f68990e, 0.0f, null, o0VarE, 24624, 104);
            bVar.getClass();
            r rVarC2 = l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.set_goal);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131068);
            r rVarF = x2.f(aVar, 1.0f);
            bVar.getClass();
            r rVarC3 = l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            fg0.k kVarX4 = v6().x4();
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
            String strR = kVarX4.r(false);
            if (strR == null) {
                strR = "";
            }
            String strP = gl1.y.P(R.string.set_personal_goal_for_event, new Object[]{strR}, o0VarE);
            fVar.getClass();
            mh.c(strP, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            l.f(b0Var.a(aVar, 1.0f, true), o0VarE);
            f0 f0Var = f0.f110999a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.not_now_lbl);
            r rVarF2 = x2.f(aVar, 1.0f);
            bVar.getClass();
            r rVarC4 = l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            cVar = this;
            boolean zR = o0VarE.r(cVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a(cVar) { // from class: fz1.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c f73994b;

                    {
                        this.f73994b = cVar;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i18 = i16;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar3 = this.f73994b;
                        switch (i18) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                ht.a.f85464a.getClass();
                                ht.a.a(null, "DoNotAddEventGoalFromEventFlow");
                                if (cVar3.v6().f74008g == 0 || !cVar3.v6().f74020t) {
                                    cVar3.v6().J4();
                                } else {
                                    androidx.fragment.app.m activity = cVar3.getActivity();
                                    if (activity != null) {
                                        TrainingPrioritySelectionActivity.a aVar5 = TrainingPrioritySelectionActivity.f46174b;
                                        Context contextRequireContext = cVar3.requireContext();
                                        contextRequireContext.getClass();
                                        fg0.k kVarX5 = cVar3.v6().x4();
                                        CalendarItemDTO calendarItemDTO = cVar3.v6().f74005d;
                                        Boolean boolValueOf = Boolean.valueOf(cVar3.v6().f74010i);
                                        boolean z15 = cVar3.v6().f74020t;
                                        aVar5.getClass();
                                        Intent intentA = TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVarX5, z15, false);
                                        intentA.putExtra("GCM_calendar_items", calendarItemDTO);
                                        intentA.putExtra("extra_navigating_from_goal_setup", true);
                                        intentA.putExtra("extra_navigating_from_goal_setup_not_now", true);
                                        intentA.putExtra("GCM_extra_is_add_to_calendar", boolValueOf);
                                        activity.startActivityForResult(intentA, 124);
                                    }
                                }
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                ht.a.f85464a.getClass();
                                ht.a.a(null, "AddEventGoalFromEventFlow");
                                cVar3.v6().z4().m("EventGoalTypeFragment");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a(cVar) { // from class: fz1.h

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c f73994b;

                        {
                            this.f73994b = cVar;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = i16;
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar3 = this.f73994b;
                            switch (i18) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                    ht.a.f85464a.getClass();
                                    ht.a.a(null, "DoNotAddEventGoalFromEventFlow");
                                    if (cVar3.v6().f74008g == 0 || !cVar3.v6().f74020t) {
                                        cVar3.v6().J4();
                                    } else {
                                        androidx.fragment.app.m activity = cVar3.getActivity();
                                        if (activity != null) {
                                            TrainingPrioritySelectionActivity.a aVar5 = TrainingPrioritySelectionActivity.f46174b;
                                            Context contextRequireContext = cVar3.requireContext();
                                            contextRequireContext.getClass();
                                            fg0.k kVarX5 = cVar3.v6().x4();
                                            CalendarItemDTO calendarItemDTO = cVar3.v6().f74005d;
                                            Boolean boolValueOf = Boolean.valueOf(cVar3.v6().f74010i);
                                            boolean z15 = cVar3.v6().f74020t;
                                            aVar5.getClass();
                                            Intent intentA = TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVarX5, z15, false);
                                            intentA.putExtra("GCM_calendar_items", calendarItemDTO);
                                            intentA.putExtra("extra_navigating_from_goal_setup", true);
                                            intentA.putExtra("extra_navigating_from_goal_setup_not_now", true);
                                            intentA.putExtra("GCM_extra_is_add_to_calendar", boolValueOf);
                                            activity.startActivityForResult(intentA, 124);
                                        }
                                    }
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                    ht.a.f85464a.getClass();
                                    ht.a.a(null, "AddEventGoalFromEventFlow");
                                    cVar3.v6().z4().m("EventGoalTypeFragment");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            f0Var.i(strQ2, rVarC4, false, (e23.a) objQ, o0VarE, 0, 4);
            String strQ3 = gl1.y.Q(o0VarE, R.string.add_a_goal);
            r rVarF3 = x2.f(aVar, 1.0f);
            boolean zR2 = o0VarE.r(cVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                z14 = true;
                final char c14 = 1 == true ? 1 : 0;
                objQ2 = new e23.a(cVar) { // from class: fz1.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c f73994b;

                    {
                        this.f73994b = cVar;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i18 = c14;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar3 = this.f73994b;
                        switch (i18) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                ht.a.f85464a.getClass();
                                ht.a.a(null, "DoNotAddEventGoalFromEventFlow");
                                if (cVar3.v6().f74008g == 0 || !cVar3.v6().f74020t) {
                                    cVar3.v6().J4();
                                } else {
                                    androidx.fragment.app.m activity = cVar3.getActivity();
                                    if (activity != null) {
                                        TrainingPrioritySelectionActivity.a aVar5 = TrainingPrioritySelectionActivity.f46174b;
                                        Context contextRequireContext = cVar3.requireContext();
                                        contextRequireContext.getClass();
                                        fg0.k kVarX5 = cVar3.v6().x4();
                                        CalendarItemDTO calendarItemDTO = cVar3.v6().f74005d;
                                        Boolean boolValueOf = Boolean.valueOf(cVar3.v6().f74010i);
                                        boolean z15 = cVar3.v6().f74020t;
                                        aVar5.getClass();
                                        Intent intentA = TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVarX5, z15, false);
                                        intentA.putExtra("GCM_calendar_items", calendarItemDTO);
                                        intentA.putExtra("extra_navigating_from_goal_setup", true);
                                        intentA.putExtra("extra_navigating_from_goal_setup_not_now", true);
                                        intentA.putExtra("GCM_extra_is_add_to_calendar", boolValueOf);
                                        activity.startActivityForResult(intentA, 124);
                                    }
                                }
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                ht.a.f85464a.getClass();
                                ht.a.a(null, "AddEventGoalFromEventFlow");
                                cVar3.v6().z4().m("EventGoalTypeFragment");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    z14 = true;
                    final int c15 = 1 == true ? 1 : 0;
                    objQ2 = new e23.a(cVar) { // from class: fz1.h

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c f73994b;

                        {
                            this.f73994b = cVar;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = c15;
                            com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar3 = this.f73994b;
                            switch (i18) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                    ht.a.f85464a.getClass();
                                    ht.a.a(null, "DoNotAddEventGoalFromEventFlow");
                                    if (cVar3.v6().f74008g == 0 || !cVar3.v6().f74020t) {
                                        cVar3.v6().J4();
                                    } else {
                                        androidx.fragment.app.m activity = cVar3.getActivity();
                                        if (activity != null) {
                                            TrainingPrioritySelectionActivity.a aVar5 = TrainingPrioritySelectionActivity.f46174b;
                                            Context contextRequireContext = cVar3.requireContext();
                                            contextRequireContext.getClass();
                                            fg0.k kVarX5 = cVar3.v6().x4();
                                            CalendarItemDTO calendarItemDTO = cVar3.v6().f74005d;
                                            Boolean boolValueOf = Boolean.valueOf(cVar3.v6().f74010i);
                                            boolean z15 = cVar3.v6().f74020t;
                                            aVar5.getClass();
                                            Intent intentA = TrainingPrioritySelectionActivity.a.a(contextRequireContext, kVarX5, z15, false);
                                            intentA.putExtra("GCM_calendar_items", calendarItemDTO);
                                            intentA.putExtra("extra_navigating_from_goal_setup", true);
                                            intentA.putExtra("extra_navigating_from_goal_setup_not_now", true);
                                            intentA.putExtra("GCM_extra_is_add_to_calendar", boolValueOf);
                                            activity.startActivityForResult(intentA, 124);
                                        }
                                    }
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                                    ht.a.f85464a.getClass();
                                    ht.a.a(null, "AddEventGoalFromEventFlow");
                                    cVar3.v6().z4().m("EventGoalTypeFragment");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    z14 = true;
                }
            }
            f0Var.d(384, 9, (e23.a) objQ2, rVarF3, strQ3, o0VarE, null, false);
            o0VarE = o0VarE;
            o0VarE.g0(z14);
        } else {
            cVar = this;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(cVar, i14);
        }
    }

    public final k v6() {
        return (k) this.f46006a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/goal/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
