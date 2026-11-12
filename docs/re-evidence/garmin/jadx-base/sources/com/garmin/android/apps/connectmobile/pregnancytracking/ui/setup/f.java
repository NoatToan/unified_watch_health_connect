package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import db1.u;
import e23.l;
import fw.m;
import fw.p;
import java.util.List;
import o13.h;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import qb1.a0;
import qb1.b0;
import qb1.e0;
import qb1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/f;", "Landroidx/fragment/app/Fragment;", "Lqb1/b0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment implements b0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f40985j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f40986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f40987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f40988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f40989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f40990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f40991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f40992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f40993h = new w1(s0.f105811a.b(qb1.f.class), new d(this), new C0775f(this), new e(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f40994i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40995a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40995a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40996a;

        public c(l lVar) {
            lVar.getClass();
            this.f40996a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40996a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40996a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40997a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40997a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40998a = aVar;
            this.f40999b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40998a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40999b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0775f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f41000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0775f(Fragment fragment) {
            super(0);
            this.f41000a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f41000a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qb1.b0
    public final void i0() {
        Integer numValueOf;
        u weightGoalUserInputs = u6().C.getWeightGoalUserInputs();
        o13.p pVar = null;
        pVar = null;
        Integer numValueOf2 = null;
        Double weightInGram = weightGoalUserInputs != null ? weightGoalUserInputs.getWeightInGram() : null;
        Double heightInCm = weightGoalUserInputs != null ? weightGoalUserInputs.getHeightInCm() : null;
        boolean weightGoalRecommendation = weightGoalUserInputs != null ? weightGoalUserInputs.getWeightGoalRecommendation() : false;
        Object[] objArr = weightInGram == null || Double.isNaN(weightInGram.doubleValue());
        boolean z14 = heightInCm == null || Double.isNaN(heightInCm.doubleValue());
        if (weightGoalRecommendation && (objArr != false || z14)) {
            if (objArr == true && z14) {
                numValueOf2 = Integer.valueOf(R.string.pregnancy_enter_weight_height_title);
                numValueOf = Integer.valueOf(R.string.pregnancy_enter_weight_height_message);
            } else if (objArr == true) {
                numValueOf2 = Integer.valueOf(R.string.pregnancy_enter_weight_title);
                numValueOf = Integer.valueOf(R.string.pregnancy_enter_weight_message);
            } else if (z14) {
                numValueOf2 = Integer.valueOf(R.string.pregnancy_enter_height_title);
                numValueOf = Integer.valueOf(R.string.pregnancy_enter_height_message);
            } else {
                numValueOf = null;
            }
            pVar = new o13.p(numValueOf2, numValueOf);
        }
        if (pVar == null) {
            a0 a0Var = this.f40994i;
            if (a0Var != null) {
                a0Var.E8();
                return;
            }
            return;
        }
        Integer num = (Integer) pVar.f128594a;
        Integer num2 = (Integer) pVar.f128595b;
        if (num == null || num2 == null) {
            return;
        }
        q1.b bVar = q1.f41066b;
        String string = getString(num.intValue());
        string.getClass();
        String string2 = getString(num2.intValue());
        string2.getClass();
        e0 e0Var = new e0(this);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.lbl_ok, R.string.lbl_cancel, e0Var);
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (getActivity() instanceof a0) {
            a7.e activity = getActivity();
            activity.getClass();
            this.f40994i = (a0) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_weight_gain_goals, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((androidx.lifecycle.s0) u6().f144064h.getValue()).f(getViewLifecycleOwner(), new c(new p3.q1(this, 29)));
        u weightGoalUserInputs = u6().C.getWeightGoalUserInputs();
        if (weightGoalUserInputs != null) {
            weightGoalUserInputs.k(null);
        }
        LocalDate dueDate = u6().C.getDueDate();
        if (dueDate == null) {
            dueDate = new LocalDate();
        }
        qb1.f fVarU6 = u6();
        LocalDate localDateMinusDays = dueDate.minusDays(279);
        localDateMinusDays.getClass();
        m<List<db1.n>> mVarD = fVarU6.K4().d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            fVarU6.K4().m(m.a.f(m.f73767e, null, null, 3));
            ge1.b.T(v1.a(fVarU6), null, null, new o(localDateMinusDays, fVarU6, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.weight_gain_goals_radio_button);
        viewFindViewById.getClass();
        this.f40986a = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.weight_gain_goals_radio_note);
        viewFindViewById2.getClass();
        this.f40987b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.weight_gain_goals_weight);
        viewFindViewById3.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById3;
        this.f40988c = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.f(false);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f40988c;
        if (gCMComplexTwoLineButton2 == null) {
            s.m("mWeightBeforePregnancyButton");
            throw null;
        }
        gCMComplexTwoLineButton2.setRightLabelFocusable(false);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f40988c;
        if (gCMComplexTwoLineButton3 == null) {
            s.m("mWeightBeforePregnancyButton");
            throw null;
        }
        gCMComplexTwoLineButton3.setRightLabelClickable(false);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f40988c;
        if (gCMComplexTwoLineButton4 == null) {
            s.m("mWeightBeforePregnancyButton");
            throw null;
        }
        gCMComplexTwoLineButton4.setParentContainerScreenReaderFocusable(true);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f40988c;
        if (gCMComplexTwoLineButton5 == null) {
            s.m("mWeightBeforePregnancyButton");
            throw null;
        }
        View viewFindViewById4 = gCMComplexTwoLineButton5.findViewById(R.id.label_right);
        viewFindViewById4.getClass();
        this.f40989d = (TextView) viewFindViewById4;
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f40988c;
        if (gCMComplexTwoLineButton6 == null) {
            s.m("mWeightBeforePregnancyButton");
            throw null;
        }
        View viewFindViewById5 = gCMComplexTwoLineButton6.findViewById(R.id.label_bottom);
        viewFindViewById5.getClass();
        this.f40990e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.weight_gain_goals_height);
        viewFindViewById6.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById6;
        this.f40991f = gCMComplexOneLineButton;
        View viewFindViewById7 = gCMComplexOneLineButton.findViewById(R.id.label_right);
        viewFindViewById7.getClass();
        this.f40992g = (TextView) viewFindViewById7;
        Context context = getContext();
        if (context != null) {
            TextView textView = this.f40989d;
            if (textView == null) {
                s.m("mWeightBeforePregnancyValueTextView");
                throw null;
            }
            textView.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            TextView textView2 = this.f40989d;
            if (textView2 == null) {
                s.m("mWeightBeforePregnancyValueTextView");
                throw null;
            }
            textView2.setGravity(8388629);
            TextView textView3 = this.f40992g;
            if (textView3 == null) {
                s.m("mHeightValueTextView");
                throw null;
            }
            textView3.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            TextView textView4 = this.f40990e;
            if (textView4 == null) {
                s.m("mWeightLoggedTextView");
                throw null;
            }
            textView4.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            TextView textView5 = this.f40989d;
            if (textView5 == null) {
                s.m("mWeightBeforePregnancyValueTextView");
                throw null;
            }
            textView5.setTextSize(0, context.getResources().getDimension(R.dimen.andfont_body_2));
            TextView textView6 = this.f40992g;
            if (textView6 == null) {
                s.m("mHeightValueTextView");
                throw null;
            }
            textView6.setTextSize(0, context.getResources().getDimension(R.dimen.andfont_body_2));
            TextView textView7 = this.f40990e;
            if (textView7 == null) {
                s.m("mWeightLoggedTextView");
                throw null;
            }
            textView7.setTextSize(0, context.getResources().getDimension(R.dimen.andfont_body_2));
        }
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f40986a;
        if (gCMComplexOneLineButton2 != null) {
            gCMComplexOneLineButton2.setRightElement(GCMComplexOneLineButton.a.SWITCH);
        } else {
            s.m("mRadioButton");
            throw null;
        }
    }

    @Override // qb1.b0
    public final void r0() {
    }

    public final qb1.f u6() {
        return (qb1.f) this.f40993h.getValue();
    }

    public final void v6(Float f14) {
        String strN0;
        Context context = getContext();
        if (context != null) {
            qb1.f.N4(u6(), null, f14 != null ? Double.valueOf(f14.floatValue()) : null, 1);
            if (f14 == null) {
                strN0 = context.getString(R.string.no_value);
                strN0.getClass();
            } else {
                strN0 = l3.a.n0(l3.f23124b, context, f14.floatValue(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                if (TextUtils.isEmpty(strN0)) {
                    strN0 = context.getString(R.string.no_value);
                    strN0.getClass();
                }
            }
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f40991f;
            if (gCMComplexOneLineButton == null) {
                s.m("mHeightButton");
                throw null;
            }
            gCMComplexOneLineButton.setButtonRightLabel(strN0);
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f40991f;
            if (gCMComplexOneLineButton2 != null) {
                gCMComplexOneLineButton2.setButtonRightContentDescription(oi0.c.A(context, new po2.o(29), strN0));
            } else {
                s.m("mHeightButton");
                throw null;
            }
        }
    }

    public final void w6(Double d14) {
        String strC1;
        Context context = getContext();
        if (context != null) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f40988c;
            if (gCMComplexTwoLineButton == null) {
                s.m("mWeightBeforePregnancyButton");
                throw null;
            }
            if (d14 == null) {
                strC1 = context.getString(R.string.no_value);
                strC1.getClass();
            } else {
                strC1 = l3.a.C1(l3.f23124b, context, d14.doubleValue(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 56);
                if (TextUtils.isEmpty(strC1)) {
                    strC1 = context.getString(R.string.no_value);
                    strC1.getClass();
                }
            }
            gCMComplexTwoLineButton.setButtonRightLabel(strC1);
        }
    }

    public final void y6() {
        u weightGoalUserInputs = u6().C.getWeightGoalUserInputs();
        if (weightGoalUserInputs != null) {
            Double weightInGram = weightGoalUserInputs.getWeightInGram();
            if (weightInGram != null) {
                double dDoubleValue = weightInGram.doubleValue();
                l3.f23124b.getClass();
                w6(Double.valueOf(l3.a.P1(dDoubleValue)));
                qb1.f.N4(u6(), Double.valueOf(dDoubleValue), null, 2);
            }
            Double heightInCm = weightGoalUserInputs.getHeightInCm();
            v6(heightInCm != null ? Float.valueOf((float) heightInCm.doubleValue()) : null);
        } else {
            w6(null);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f40986a;
        if (gCMComplexOneLineButton == null) {
            s.m("mRadioButton");
            throw null;
        }
        gCMComplexOneLineButton.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 12));
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f40988c;
        if (gCMComplexTwoLineButton == null) {
            s.m("mWeightBeforePregnancyButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: qb1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f f144042b;

            {
                this.f144042b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                double dP1;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f fVar = this.f144042b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                        db1.u weightGoalUserInputs2 = fVar.u6().C.getWeightGoalUserInputs();
                        Double weightInGram2 = weightGoalUserInputs2 != null ? weightGoalUserInputs2.getWeightInGram() : null;
                        if (weightInGram2 != null) {
                            double dDoubleValue2 = weightInGram2.doubleValue();
                            l3.f23124b.getClass();
                            dP1 = l3.a.P1(dDoubleValue2);
                        } else {
                            dP1 = 68.039d;
                        }
                        double d14 = dP1;
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, (j42.b.InterfaceC1852b) new e0(fVar), d14, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, 0, 0, 0, 0, 480, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                        new com.garmin.android.apps.connectmobile.settings.d(fVar.getActivity(), new e0(fVar));
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f40991f;
        if (gCMComplexOneLineButton2 == null) {
            s.m("mHeightButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexOneLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: qb1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f f144042b;

            {
                this.f144042b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                double dP1;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f fVar = this.f144042b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                        db1.u weightGoalUserInputs2 = fVar.u6().C.getWeightGoalUserInputs();
                        Double weightInGram2 = weightGoalUserInputs2 != null ? weightGoalUserInputs2.getWeightInGram() : null;
                        if (weightInGram2 != null) {
                            double dDoubleValue2 = weightInGram2.doubleValue();
                            l3.f23124b.getClass();
                            dP1 = l3.a.P1(dDoubleValue2);
                        } else {
                            dP1 = 68.039d;
                        }
                        double d14 = dP1;
                        Context contextRequireContext = fVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, (j42.b.InterfaceC1852b) new e0(fVar), d14, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, 0, 0, 0, 0, 480, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                        new com.garmin.android.apps.connectmobile.settings.d(fVar.getActivity(), new e0(fVar));
                        break;
                }
            }
        });
        TextView textView = this.f40987b;
        if (textView != null) {
            oe2.f.Z(textView, R.string.pregnancy_weight_gain_goals_note, "https://www.cdc.gov/maternal-infant-health/pregnancy-weight");
        } else {
            s.m("mWeightGainNote");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
