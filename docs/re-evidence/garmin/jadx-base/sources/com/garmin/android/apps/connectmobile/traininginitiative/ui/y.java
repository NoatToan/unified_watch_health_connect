package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import ty1.h0;
import ty1.q1;
import ty1.r1;
import ty1.s1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/y;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f46341v = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f46344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InlineUnitsTextFieldView f46345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f46346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f46347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMComplexTwoLineButton f46348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f46349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f46350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f46351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f46352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f46353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f46354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f46355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bg0.a.c f46356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f46357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46358r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f46359t;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46360a;

        static {
            int[] iArr = new int[ny1.e.values().length];
            try {
                iArr[ny1.e.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ny1.e.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46360a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/y$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = y.f46341v;
            y.this.G6();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46362a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46362a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46362a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46362a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46363a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46363a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46364a = aVar;
            this.f46365b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46364a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46365b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46366a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46366a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46366a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public y() {
        super(R.layout.ti_review_entries_distance_time_fragment);
        this.f46343c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46359t = new c();
    }

    public final void A6(bg0.a.c cVar) {
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f46345e;
        if (inlineUnitsTextFieldView == null) {
            p005kotlin.jvm.internal.s.m("distanceView");
            throw null;
        }
        inlineUnitsTextFieldView.setNumberOfDecimalsAllowed(2);
        InlineUnitsTextFieldView inlineUnitsTextFieldView2 = this.f46345e;
        if (inlineUnitsTextFieldView2 != null) {
            eg0.a.a(inlineUnitsTextFieldView2, cVar, new s1(this, 1));
        } else {
            p005kotlin.jvm.internal.s.m("distanceView");
            throw null;
        }
    }

    public final void C6(boolean z14) {
        String string = getString(z14 ? R.string.remove_distance_question : R.string.remove_time_question);
        string.getClass();
        String string2 = getString(z14 ? R.string.remove_distance_message : R.string.remove_time_message);
        string2.getClass();
        o13.p pVar = new o13.p(getString(R.string.lbl_cancel), new q1(0));
        o13.p pVar2 = new o13.p(getString(R.string.lbl_common_continue), new ap2.f(z14, this, 22));
        c22.f fVar = c22.f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        fVar.getClass();
        androidx.appcompat.app.e eVarB = c22.f.b(contextRequireContext, string, string2, pVar2, pVar, null, false);
        eVarB.setOnShowListener(new r1(this, 0));
        eVarB.show();
    }

    public final AddTIEventViewModel E6() {
        return (AddTIEventViewModel) this.f46343c.getValue();
    }

    public final void F6(bg0.a.c cVar, bg0.a.b bVar) {
        Number number;
        bg0.a.c cVarD = E6().n5().d();
        String string = null;
        if (cVarD != null) {
            Number number2 = cVarD.f17834a;
            if (number2 != null) {
                if (p005kotlin.jvm.internal.s.a(number2.doubleValue(), (cVar == null || (number = cVar.f17834a) == null) ? null : Double.valueOf(number.doubleValue())) && cVarD.f17835b == bVar) {
                    TextView textView = this.f46351k;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("resetCourseDistance");
                        throw null;
                    }
                    textView.setVisibility(8);
                } else {
                    if (isAdded() && !this.f46355o) {
                        this.f46355o = true;
                        String string2 = getString(R.string.pacepro_distance_alert_title);
                        string2.getClass();
                        String string3 = getString(R.string.change_event_course_distance_message);
                        string3.getClass();
                        o13.p pVar = new o13.p(getString(R.string.lbl_cancel), new s1(this, 0));
                        o13.p pVar2 = new o13.p(getString(R.string.lbl_common_continue), new q1(1));
                        c22.f fVar = c22.f.f23050a;
                        Context contextRequireContext = requireContext();
                        contextRequireContext.getClass();
                        fVar.getClass();
                        androidx.appcompat.app.e eVarB = c22.f.b(contextRequireContext, string2, string3, pVar2, pVar, null, false);
                        eVarB.setOnShowListener(new r1(this, 1));
                        eVarB.show();
                    }
                    TextView textView2 = this.f46351k;
                    if (textView2 == null) {
                        p005kotlin.jvm.internal.s.m("resetCourseDistance");
                        throw null;
                    }
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = this.f46351k;
                if (textView3 == null) {
                    p005kotlin.jvm.internal.s.m("resetCourseDistance");
                    throw null;
                }
                textView3.setVisibility(8);
            }
        } else {
            TextView textView4 = this.f46351k;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("resetCourseDistance");
                throw null;
            }
            textView4.setVisibility(8);
        }
        E6().C6(cVar);
        E6().G6(ny1.e.DISTANCE);
        TextView textView5 = this.f46346f;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("distanceRangeView");
            throw null;
        }
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            Integer numV = og0.a.v(bVar);
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            string = activity.getString(R.string.event_distance_range, 0, numV, bVar.a(contextRequireContext2));
        }
        textView5.setText(string);
    }

    public final void G6() {
        this.f46358r = true;
        AddTIEventViewModel addTIEventViewModelE6 = E6();
        addTIEventViewModelE6.s5().o(addTIEventViewModelE6.q5());
        this.f46359t.f(false);
        requireActivity().onBackPressed();
    }

    public final void H6() {
        bg0.a.c cVarD = E6().n5().d();
        if (cVarD == null) {
            bg0.a.f17827a.getClass();
            cVarD = new bg0.a.c(null, bg0.a.C0255a.a());
        }
        A6(cVarD);
        E6().C6(E6().n5().d());
        TextView textView = this.f46351k;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("resetCourseDistance");
            throw null;
        }
        textView.setVisibility(8);
        E6().n6(true);
    }

    public final void I6() {
        if (E6().k6()) {
            E6().n6(false);
        } else {
            E6().n6(true);
            E6().C6(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46342b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIReviewEntriesDistanceTimeFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46342b;
        final int i14 = 2;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46359t, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.toolbar_actionbar_default);
        tn.k kVar = new tn.k(12);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, kVar);
        View viewFindViewById2 = view2.findViewById(R.id.title_view);
        viewFindViewById2.getClass();
        this.f46344d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.distance_field);
        viewFindViewById3.getClass();
        this.f46345e = (InlineUnitsTextFieldView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.distance_description);
        viewFindViewById4.getClass();
        this.f46347g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.distance_range);
        viewFindViewById5.getClass();
        this.f46346f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.duration_field);
        viewFindViewById6.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById6;
        this.f46348h = gCMComplexTwoLineButton;
        ((TextView) gCMComplexTwoLineButton.findViewById(R.id.label_top)).setTextSize(2, 16.0f);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f46348h;
        if (gCMComplexTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("durationView");
            throw null;
        }
        ((TextView) gCMComplexTwoLineButton2.findViewById(R.id.label_top)).setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary));
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f46348h;
        if (gCMComplexTwoLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("durationView");
            throw null;
        }
        ((TextView) gCMComplexTwoLineButton3.findViewById(R.id.label_bottom)).setTextSize(2, 12.0f);
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f46348h;
        if (gCMComplexTwoLineButton4 == null) {
            p005kotlin.jvm.internal.s.m("durationView");
            throw null;
        }
        gCMComplexTwoLineButton4.setFieldValueColor(R.color.gcm_text_secondary);
        View viewFindViewById7 = view2.findViewById(R.id.duration_description);
        viewFindViewById7.getClass();
        this.f46349i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.duration_range);
        viewFindViewById8.getClass();
        this.f46350j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.reset_course_distance);
        viewFindViewById9.getClass();
        this.f46351k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.title_text_view);
        viewFindViewById10.getClass();
        this.f46354n = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.text_view_cancel);
        viewFindViewById11.getClass();
        this.f46353m = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.text_view_save);
        viewFindViewById12.getClass();
        this.f46352l = (TextView) viewFindViewById12;
        TextView textView = this.f46354n;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("title");
            throw null;
        }
        textView.setText(getString(R.string.lbl_distance));
        TextView textView2 = this.f46351k;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("resetCourseDistance");
            throw null;
        }
        textView2.setVisibility(8);
        bg0.a.c cVarD = E6().q5().d();
        if (cVarD == null && (cVarD = E6().n5().d()) == null) {
            bg0.a.f17827a.getClass();
            cVarD = new bg0.a.c(null, bg0.a.C0255a.a());
        }
        A6(cVarD);
        TextView textView3 = this.f46350j;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("durationRangeView");
            throw null;
        }
        final int i15 = 0;
        textView3.setText(getString(R.string.event_time_range, 0, 48));
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f46348h;
        if (gCMComplexTwoLineButton5 == null) {
            p005kotlin.jvm.internal.s.m("durationView");
            throw null;
        }
        gCMComplexTwoLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167241b;

            {
                this.f167241b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                bg0.a.c cVarD2;
                bg0.a.b bVarA;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167241b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        r22.f0.a aVar3 = r22.f0.U0;
                        Integer numD = yVar.E6().t5().d();
                        r22.f0 f0VarB = r22.f0.a.b(aVar3, numD != null ? numD.intValue() : DateTimeConstants.SECONDS_PER_HOUR, 47, 28);
                        f0VarB.T = new tr2.b(yVar, 10);
                        String str = r22.f0.V0;
                        androidx.fragment.app.v childFragmentManager = yVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f0VarB.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.H6();
                        return;
                    case 2:
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        if (v22.e.d(inlineUnitsTextFieldView)) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            v22.e.b(inlineUnitsTextFieldView2);
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                            if (inlineUnitsTextFieldView3 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            Number currentNumber = inlineUnitsTextFieldView3.getCurrentNumber();
                            if (currentNumber == null || (cVarD2 = yVar.E6().q5().d()) == null) {
                                yVar.I6();
                            } else {
                                Integer numV = og0.a.v(cVarD2.f17835b);
                                if (currentNumber.floatValue() >= numV.floatValue()) {
                                    currentNumber = numV;
                                }
                                bg0.a.c cVarD3 = yVar.E6().q5().d();
                                if (cVarD3 != null) {
                                    bVarA = cVarD3.f17835b;
                                } else {
                                    bg0.a.f17827a.getClass();
                                    bVarA = bg0.a.C0255a.a();
                                }
                                yVar.f46355o = true;
                                yVar.F6(new bg0.a.c(currentNumber, bVarA), bVarA);
                            }
                        }
                        TextView textView4 = yVar.f46352l;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        if (textView4.isEnabled()) {
                            AddTIEventViewModel addTIEventViewModelE6 = yVar.E6();
                            addTIEventViewModelE6.s5().o(addTIEventViewModelE6.q5());
                            yVar.G6();
                            return;
                        }
                        return;
                    default:
                        bg0.a.c cVar = yVar.f46356p;
                        if (cVar != null && !cVar.equals(yVar.E6().q5().d())) {
                            yVar.E6().C6(cVar);
                        }
                        Integer num = yVar.f46357q;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Integer numD2 = yVar.E6().t5().d();
                            if (numD2 == null || iIntValue != numD2.intValue()) {
                                yVar.E6().D6(Integer.valueOf(iIntValue));
                            }
                        }
                        yVar.G6();
                        return;
                }
            }
        });
        AddTIEventViewModel addTIEventViewModelE6 = E6();
        final int i16 = 1;
        addTIEventViewModelE6.s5().n(addTIEventViewModelE6.q5(), new AddTIEventViewModel.f(new mz1.d(addTIEventViewModelE6, i16)));
        this.f46356p = E6().q5().d();
        this.f46357q = E6().t5().d();
        String strD = E6().x5().d();
        if (strD == null) {
            strD = "";
        }
        String string2 = getString(R.string.time_based_event, strD);
        string2.getClass();
        String strD2 = E6().x5().d();
        String string3 = getString(R.string.distance_based_event, strD2 != null ? strD2 : "");
        string3.getClass();
        TextView textView4 = this.f46347g;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("distanceDescriptionView");
            throw null;
        }
        v22.d.b(textView4, string2, new e23.a(this) { // from class: ty1.u1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167247b;

            {
                this.f167247b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167247b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.C6(true);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.C6(false);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        TextView textView5 = this.f46347g;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("distanceDescriptionView");
            throw null;
        }
        textView5.append(StringUtils.SPACE + getString(R.string.event_time_based_examples));
        TextView textView6 = this.f46349i;
        if (textView6 == null) {
            p005kotlin.jvm.internal.s.m("durationDescriptionView");
            throw null;
        }
        v22.d.b(textView6, string3, new e23.a(this) { // from class: ty1.u1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167247b;

            {
                this.f167247b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167247b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.C6(true);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.C6(false);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        TextView textView7 = this.f46351k;
        if (textView7 == null) {
            p005kotlin.jvm.internal.s.m("resetCourseDistance");
            throw null;
        }
        textView7.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167241b;

            {
                this.f167241b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                bg0.a.c cVarD2;
                bg0.a.b bVarA;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167241b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        r22.f0.a aVar3 = r22.f0.U0;
                        Integer numD = yVar.E6().t5().d();
                        r22.f0 f0VarB = r22.f0.a.b(aVar3, numD != null ? numD.intValue() : DateTimeConstants.SECONDS_PER_HOUR, 47, 28);
                        f0VarB.T = new tr2.b(yVar, 10);
                        String str = r22.f0.V0;
                        androidx.fragment.app.v childFragmentManager = yVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f0VarB.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.H6();
                        return;
                    case 2:
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        if (v22.e.d(inlineUnitsTextFieldView)) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            v22.e.b(inlineUnitsTextFieldView2);
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                            if (inlineUnitsTextFieldView3 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            Number currentNumber = inlineUnitsTextFieldView3.getCurrentNumber();
                            if (currentNumber == null || (cVarD2 = yVar.E6().q5().d()) == null) {
                                yVar.I6();
                            } else {
                                Integer numV = og0.a.v(cVarD2.f17835b);
                                if (currentNumber.floatValue() >= numV.floatValue()) {
                                    currentNumber = numV;
                                }
                                bg0.a.c cVarD3 = yVar.E6().q5().d();
                                if (cVarD3 != null) {
                                    bVarA = cVarD3.f17835b;
                                } else {
                                    bg0.a.f17827a.getClass();
                                    bVarA = bg0.a.C0255a.a();
                                }
                                yVar.f46355o = true;
                                yVar.F6(new bg0.a.c(currentNumber, bVarA), bVarA);
                            }
                        }
                        TextView textView8 = yVar.f46352l;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        if (textView8.isEnabled()) {
                            AddTIEventViewModel addTIEventViewModelE7 = yVar.E6();
                            addTIEventViewModelE7.s5().o(addTIEventViewModelE7.q5());
                            yVar.G6();
                            return;
                        }
                        return;
                    default:
                        bg0.a.c cVar = yVar.f46356p;
                        if (cVar != null && !cVar.equals(yVar.E6().q5().d())) {
                            yVar.E6().C6(cVar);
                        }
                        Integer num = yVar.f46357q;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Integer numD2 = yVar.E6().t5().d();
                            if (numD2 == null || iIntValue != numD2.intValue()) {
                                yVar.E6().D6(Integer.valueOf(iIntValue));
                            }
                        }
                        yVar.G6();
                        return;
                }
            }
        });
        TextView textView8 = this.f46352l;
        if (textView8 == null) {
            p005kotlin.jvm.internal.s.m("save");
            throw null;
        }
        textView8.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167241b;

            {
                this.f167241b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                bg0.a.c cVarD2;
                bg0.a.b bVarA;
                int i17 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167241b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        r22.f0.a aVar3 = r22.f0.U0;
                        Integer numD = yVar.E6().t5().d();
                        r22.f0 f0VarB = r22.f0.a.b(aVar3, numD != null ? numD.intValue() : DateTimeConstants.SECONDS_PER_HOUR, 47, 28);
                        f0VarB.T = new tr2.b(yVar, 10);
                        String str = r22.f0.V0;
                        androidx.fragment.app.v childFragmentManager = yVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f0VarB.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.H6();
                        return;
                    case 2:
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        if (v22.e.d(inlineUnitsTextFieldView)) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            v22.e.b(inlineUnitsTextFieldView2);
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                            if (inlineUnitsTextFieldView3 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            Number currentNumber = inlineUnitsTextFieldView3.getCurrentNumber();
                            if (currentNumber == null || (cVarD2 = yVar.E6().q5().d()) == null) {
                                yVar.I6();
                            } else {
                                Integer numV = og0.a.v(cVarD2.f17835b);
                                if (currentNumber.floatValue() >= numV.floatValue()) {
                                    currentNumber = numV;
                                }
                                bg0.a.c cVarD3 = yVar.E6().q5().d();
                                if (cVarD3 != null) {
                                    bVarA = cVarD3.f17835b;
                                } else {
                                    bg0.a.f17827a.getClass();
                                    bVarA = bg0.a.C0255a.a();
                                }
                                yVar.f46355o = true;
                                yVar.F6(new bg0.a.c(currentNumber, bVarA), bVarA);
                            }
                        }
                        TextView textView9 = yVar.f46352l;
                        if (textView9 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        if (textView9.isEnabled()) {
                            AddTIEventViewModel addTIEventViewModelE7 = yVar.E6();
                            addTIEventViewModelE7.s5().o(addTIEventViewModelE7.q5());
                            yVar.G6();
                            return;
                        }
                        return;
                    default:
                        bg0.a.c cVar = yVar.f46356p;
                        if (cVar != null && !cVar.equals(yVar.E6().q5().d())) {
                            yVar.E6().C6(cVar);
                        }
                        Integer num = yVar.f46357q;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Integer numD2 = yVar.E6().t5().d();
                            if (numD2 == null || iIntValue != numD2.intValue()) {
                                yVar.E6().D6(Integer.valueOf(iIntValue));
                            }
                        }
                        yVar.G6();
                        return;
                }
            }
        });
        TextView textView9 = this.f46353m;
        if (textView9 == null) {
            p005kotlin.jvm.internal.s.m("cancel");
            throw null;
        }
        final int i17 = 3;
        textView9.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167241b;

            {
                this.f167241b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                bg0.a.c cVarD2;
                bg0.a.b bVarA;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167241b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        r22.f0.a aVar3 = r22.f0.U0;
                        Integer numD = yVar.E6().t5().d();
                        r22.f0 f0VarB = r22.f0.a.b(aVar3, numD != null ? numD.intValue() : DateTimeConstants.SECONDS_PER_HOUR, 47, 28);
                        f0VarB.T = new tr2.b(yVar, 10);
                        String str = r22.f0.V0;
                        androidx.fragment.app.v childFragmentManager = yVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (childFragmentManager.G(str) == null) {
                            f0VarB.show(childFragmentManager, str);
                            return;
                        }
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        yVar.H6();
                        return;
                    case 2:
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        if (v22.e.d(inlineUnitsTextFieldView)) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            v22.e.b(inlineUnitsTextFieldView2);
                            InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                            if (inlineUnitsTextFieldView3 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            Number currentNumber = inlineUnitsTextFieldView3.getCurrentNumber();
                            if (currentNumber == null || (cVarD2 = yVar.E6().q5().d()) == null) {
                                yVar.I6();
                            } else {
                                Integer numV = og0.a.v(cVarD2.f17835b);
                                if (currentNumber.floatValue() >= numV.floatValue()) {
                                    currentNumber = numV;
                                }
                                bg0.a.c cVarD3 = yVar.E6().q5().d();
                                if (cVarD3 != null) {
                                    bVarA = cVarD3.f17835b;
                                } else {
                                    bg0.a.f17827a.getClass();
                                    bVarA = bg0.a.C0255a.a();
                                }
                                yVar.f46355o = true;
                                yVar.F6(new bg0.a.c(currentNumber, bVarA), bVarA);
                            }
                        }
                        TextView textView10 = yVar.f46352l;
                        if (textView10 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        if (textView10.isEnabled()) {
                            AddTIEventViewModel addTIEventViewModelE7 = yVar.E6();
                            addTIEventViewModelE7.s5().o(addTIEventViewModelE7.q5());
                            yVar.G6();
                            return;
                        }
                        return;
                    default:
                        bg0.a.c cVar = yVar.f46356p;
                        if (cVar != null && !cVar.equals(yVar.E6().q5().d())) {
                            yVar.E6().C6(cVar);
                        }
                        Integer num = yVar.f46357q;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            Integer numD2 = yVar.E6().t5().d();
                            if (numD2 == null || iIntValue != numD2.intValue()) {
                                yVar.E6().D6(Integer.valueOf(iIntValue));
                            }
                        }
                        yVar.G6();
                        return;
                }
            }
        });
        ((androidx.lifecycle.s0) E6().F1.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167210b;

            {
                this.f167210b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167210b;
                switch (i18) {
                    case 0:
                        Integer num = (Integer) obj;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = yVar.f46348h;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            int i19 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
                            int i24 = iIntValue % DateTimeConstants.SECONDS_PER_HOUR;
                            int i25 = i24 / 60;
                            int i26 = i24 % 60;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i19), Integer.valueOf(i25), Integer.valueOf(i26)}, 3)));
                        } else {
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(yVar.getString(R.string.enter_event_time));
                        }
                        if (yVar.E6().k6()) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton7 = yVar.f46348h;
                            if (gCMComplexTwoLineButton7 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            if (gCMComplexTwoLineButton7.isVisible()) {
                                yVar.E6().n6(num != null && num.intValue() >= 1);
                                if (num == null || num.intValue() < 1) {
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton8 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    Resources resources = yVar.getResources();
                                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                                    gCMComplexTwoLineButton8.setRightIcon(resources.getDrawable(2131231971, null));
                                    yVar.E6().n6(false);
                                    TextView textView10 = yVar.f46350j;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                } else {
                                    yVar.E6().n6(true);
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton9 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    gCMComplexTwoLineButton9.setRightIcon(null);
                                    TextView textView11 = yVar.f46350j;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                        } else {
                            yVar.E6().n6(true);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = yVar.f46348h;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.setButtonTopLabel(yVar.getString(R.string.activity_stats_details_total_time_label));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        bool.getClass();
                        inlineUnitsTextFieldView.setHasError(bool.booleanValue());
                        TextView textView12 = yVar.f46346f;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("distanceRangeView");
                            throw null;
                        }
                        textView12.setVisibility(bool.booleanValue() ? 0 : 8);
                        yVar.E6().n6(!bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        TextView textView13 = yVar.f46352l;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        bool2.getClass();
                        textView13.setEnabled(bool2.booleanValue());
                        TextView textView14 = yVar.f46352l;
                        if (textView14 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        boolean zIsEnabled = textView14.isEnabled();
                        TextView textView15 = yVar.f46352l;
                        if (zIsEnabled) {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.palette_delta_2, null));
                        } else {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.gcm_text_secondary, null));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (!((Boolean) obj).booleanValue()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            inlineUnitsTextFieldView2.setVisibility(8);
                            TextView textView16 = yVar.f46347g;
                            if (textView16 == null) {
                                p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                throw null;
                            }
                            textView16.setVisibility(8);
                            TextView textView17 = yVar.f46349i;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                throw null;
                            }
                            textView17.setVisibility(8);
                            TextView textView18 = yVar.f46344d;
                            if (textView18 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView18.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton11 = yVar.f46348h;
                            if (gCMComplexTwoLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton11.setVisibility(0);
                            TextView textView19 = yVar.f46344d;
                            if (textView19 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView19.setText(yVar.getString(R.string.event_total_time));
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.e eVar = (ny1.e) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (eVar != null) {
                            int i27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.b.f46360a[eVar.ordinal()];
                            if (i27 == 1) {
                                InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                                if (inlineUnitsTextFieldView3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView3.setVisibility(0);
                                boolean z14 = yVar.E6().f46439u2;
                                TextView textView20 = yVar.f46347g;
                                if (z14) {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(8);
                                } else {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(0);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton12 = yVar.f46348h;
                                if (gCMComplexTwoLineButton12 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton12.setVisibility(8);
                                TextView textView21 = yVar.f46349i;
                                if (textView21 == null) {
                                    p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                    throw null;
                                }
                                textView21.setVisibility(8);
                                TextView textView22 = yVar.f46350j;
                                if (textView22 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView22.setVisibility(8);
                                TextView textView23 = yVar.f46354n;
                                if (textView23 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView23.setText(yVar.getString(R.string.lbl_distance));
                                TextView textView24 = yVar.f46344d;
                                if (textView24 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView24.setText(yVar.getString(R.string.event_total_distance));
                                if (yVar.E6().q5().d() == null) {
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView4 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView4 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView4.setEditTextValue("");
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView5 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView5 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView5.setEditHintText(yVar.getString(R.string.enter_event_distance));
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView6 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView6 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView6.setHasError(yVar.E6().k6());
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                if (i27 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                InlineUnitsTextFieldView inlineUnitsTextFieldView7 = yVar.f46345e;
                                if (inlineUnitsTextFieldView7 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView7.setVisibility(8);
                                TextView textView25 = yVar.f46347g;
                                if (textView25 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                    throw null;
                                }
                                textView25.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton13 = yVar.f46348h;
                                if (gCMComplexTwoLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton13.setVisibility(0);
                                TextView textView26 = yVar.f46346f;
                                if (textView26 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceRangeView");
                                    throw null;
                                }
                                textView26.setVisibility(8);
                                boolean z15 = yVar.E6().f46439u2;
                                TextView textView27 = yVar.f46349i;
                                if (z15) {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(8);
                                } else {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(0);
                                }
                                TextView textView28 = yVar.f46354n;
                                if (textView28 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView28.setText(yVar.getString(R.string.lbl_time));
                                TextView textView29 = yVar.f46344d;
                                if (textView29 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView29.setText(yVar.getString(R.string.event_total_time));
                                TextView textView30 = yVar.f46350j;
                                if (textView30 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView30.setVisibility(0);
                                yVar.E6().n6(true);
                                if (yVar.E6().k6()) {
                                    Integer numD = yVar.E6().t5().d();
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton14 = yVar.f46348h;
                                    if (numD != null) {
                                        if (numD.intValue() < 1) {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            Resources resources2 = yVar.getResources();
                                            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                                            gCMComplexTwoLineButton14.setRightIcon(resources2.getDrawable(2131231971, null));
                                        } else {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            gCMComplexTwoLineButton14.setRightIcon(null);
                                            TextView textView31 = yVar.f46350j;
                                            if (textView31 == null) {
                                                p005kotlin.jvm.internal.s.m("durationRangeView");
                                                throw null;
                                            }
                                            textView31.setVisibility(8);
                                        }
                                    } else {
                                        if (gCMComplexTwoLineButton14 == null) {
                                            p005kotlin.jvm.internal.s.m("durationView");
                                            throw null;
                                        }
                                        Resources resources3 = yVar.getResources();
                                        ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
                                        gCMComplexTwoLineButton14.setRightIcon(resources3.getDrawable(2131231971, null));
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 4;
        ((androidx.lifecycle.s0) E6().D1.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167210b;

            {
                this.f167210b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167210b;
                switch (i19) {
                    case 0:
                        Integer num = (Integer) obj;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = yVar.f46348h;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            int i110 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
                            int i24 = iIntValue % DateTimeConstants.SECONDS_PER_HOUR;
                            int i25 = i24 / 60;
                            int i26 = i24 % 60;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i110), Integer.valueOf(i25), Integer.valueOf(i26)}, 3)));
                        } else {
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(yVar.getString(R.string.enter_event_time));
                        }
                        if (yVar.E6().k6()) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton7 = yVar.f46348h;
                            if (gCMComplexTwoLineButton7 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            if (gCMComplexTwoLineButton7.isVisible()) {
                                yVar.E6().n6(num != null && num.intValue() >= 1);
                                if (num == null || num.intValue() < 1) {
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton8 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    Resources resources = yVar.getResources();
                                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                                    gCMComplexTwoLineButton8.setRightIcon(resources.getDrawable(2131231971, null));
                                    yVar.E6().n6(false);
                                    TextView textView10 = yVar.f46350j;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                } else {
                                    yVar.E6().n6(true);
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton9 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    gCMComplexTwoLineButton9.setRightIcon(null);
                                    TextView textView11 = yVar.f46350j;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                        } else {
                            yVar.E6().n6(true);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = yVar.f46348h;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.setButtonTopLabel(yVar.getString(R.string.activity_stats_details_total_time_label));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        bool.getClass();
                        inlineUnitsTextFieldView.setHasError(bool.booleanValue());
                        TextView textView12 = yVar.f46346f;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("distanceRangeView");
                            throw null;
                        }
                        textView12.setVisibility(bool.booleanValue() ? 0 : 8);
                        yVar.E6().n6(!bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        TextView textView13 = yVar.f46352l;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        bool2.getClass();
                        textView13.setEnabled(bool2.booleanValue());
                        TextView textView14 = yVar.f46352l;
                        if (textView14 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        boolean zIsEnabled = textView14.isEnabled();
                        TextView textView15 = yVar.f46352l;
                        if (zIsEnabled) {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.palette_delta_2, null));
                        } else {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.gcm_text_secondary, null));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (!((Boolean) obj).booleanValue()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            inlineUnitsTextFieldView2.setVisibility(8);
                            TextView textView16 = yVar.f46347g;
                            if (textView16 == null) {
                                p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                throw null;
                            }
                            textView16.setVisibility(8);
                            TextView textView17 = yVar.f46349i;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                throw null;
                            }
                            textView17.setVisibility(8);
                            TextView textView18 = yVar.f46344d;
                            if (textView18 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView18.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton11 = yVar.f46348h;
                            if (gCMComplexTwoLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton11.setVisibility(0);
                            TextView textView19 = yVar.f46344d;
                            if (textView19 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView19.setText(yVar.getString(R.string.event_total_time));
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.e eVar = (ny1.e) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (eVar != null) {
                            int i27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.b.f46360a[eVar.ordinal()];
                            if (i27 == 1) {
                                InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                                if (inlineUnitsTextFieldView3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView3.setVisibility(0);
                                boolean z14 = yVar.E6().f46439u2;
                                TextView textView20 = yVar.f46347g;
                                if (z14) {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(8);
                                } else {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(0);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton12 = yVar.f46348h;
                                if (gCMComplexTwoLineButton12 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton12.setVisibility(8);
                                TextView textView21 = yVar.f46349i;
                                if (textView21 == null) {
                                    p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                    throw null;
                                }
                                textView21.setVisibility(8);
                                TextView textView22 = yVar.f46350j;
                                if (textView22 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView22.setVisibility(8);
                                TextView textView23 = yVar.f46354n;
                                if (textView23 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView23.setText(yVar.getString(R.string.lbl_distance));
                                TextView textView24 = yVar.f46344d;
                                if (textView24 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView24.setText(yVar.getString(R.string.event_total_distance));
                                if (yVar.E6().q5().d() == null) {
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView4 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView4 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView4.setEditTextValue("");
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView5 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView5 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView5.setEditHintText(yVar.getString(R.string.enter_event_distance));
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView6 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView6 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView6.setHasError(yVar.E6().k6());
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                if (i27 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                InlineUnitsTextFieldView inlineUnitsTextFieldView7 = yVar.f46345e;
                                if (inlineUnitsTextFieldView7 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView7.setVisibility(8);
                                TextView textView25 = yVar.f46347g;
                                if (textView25 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                    throw null;
                                }
                                textView25.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton13 = yVar.f46348h;
                                if (gCMComplexTwoLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton13.setVisibility(0);
                                TextView textView26 = yVar.f46346f;
                                if (textView26 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceRangeView");
                                    throw null;
                                }
                                textView26.setVisibility(8);
                                boolean z15 = yVar.E6().f46439u2;
                                TextView textView27 = yVar.f46349i;
                                if (z15) {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(8);
                                } else {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(0);
                                }
                                TextView textView28 = yVar.f46354n;
                                if (textView28 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView28.setText(yVar.getString(R.string.lbl_time));
                                TextView textView29 = yVar.f46344d;
                                if (textView29 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView29.setText(yVar.getString(R.string.event_total_time));
                                TextView textView30 = yVar.f46350j;
                                if (textView30 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView30.setVisibility(0);
                                yVar.E6().n6(true);
                                if (yVar.E6().k6()) {
                                    Integer numD = yVar.E6().t5().d();
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton14 = yVar.f46348h;
                                    if (numD != null) {
                                        if (numD.intValue() < 1) {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            Resources resources2 = yVar.getResources();
                                            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                                            gCMComplexTwoLineButton14.setRightIcon(resources2.getDrawable(2131231971, null));
                                        } else {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            gCMComplexTwoLineButton14.setRightIcon(null);
                                            TextView textView31 = yVar.f46350j;
                                            if (textView31 == null) {
                                                p005kotlin.jvm.internal.s.m("durationRangeView");
                                                throw null;
                                            }
                                            textView31.setVisibility(8);
                                        }
                                    } else {
                                        if (gCMComplexTwoLineButton14 == null) {
                                            p005kotlin.jvm.internal.s.m("durationView");
                                            throw null;
                                        }
                                        Resources resources3 = yVar.getResources();
                                        ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
                                        gCMComplexTwoLineButton14.setRightIcon(resources3.getDrawable(2131231971, null));
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        E6().t5().f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167210b;

            {
                this.f167210b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167210b;
                switch (i19) {
                    case 0:
                        Integer num = (Integer) obj;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = yVar.f46348h;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            int i110 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
                            int i24 = iIntValue % DateTimeConstants.SECONDS_PER_HOUR;
                            int i25 = i24 / 60;
                            int i26 = i24 % 60;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i110), Integer.valueOf(i25), Integer.valueOf(i26)}, 3)));
                        } else {
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(yVar.getString(R.string.enter_event_time));
                        }
                        if (yVar.E6().k6()) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton7 = yVar.f46348h;
                            if (gCMComplexTwoLineButton7 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            if (gCMComplexTwoLineButton7.isVisible()) {
                                yVar.E6().n6(num != null && num.intValue() >= 1);
                                if (num == null || num.intValue() < 1) {
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton8 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    Resources resources = yVar.getResources();
                                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                                    gCMComplexTwoLineButton8.setRightIcon(resources.getDrawable(2131231971, null));
                                    yVar.E6().n6(false);
                                    TextView textView10 = yVar.f46350j;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                } else {
                                    yVar.E6().n6(true);
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton9 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    gCMComplexTwoLineButton9.setRightIcon(null);
                                    TextView textView11 = yVar.f46350j;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                        } else {
                            yVar.E6().n6(true);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = yVar.f46348h;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.setButtonTopLabel(yVar.getString(R.string.activity_stats_details_total_time_label));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        bool.getClass();
                        inlineUnitsTextFieldView.setHasError(bool.booleanValue());
                        TextView textView12 = yVar.f46346f;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("distanceRangeView");
                            throw null;
                        }
                        textView12.setVisibility(bool.booleanValue() ? 0 : 8);
                        yVar.E6().n6(!bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        TextView textView13 = yVar.f46352l;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        bool2.getClass();
                        textView13.setEnabled(bool2.booleanValue());
                        TextView textView14 = yVar.f46352l;
                        if (textView14 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        boolean zIsEnabled = textView14.isEnabled();
                        TextView textView15 = yVar.f46352l;
                        if (zIsEnabled) {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.palette_delta_2, null));
                        } else {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.gcm_text_secondary, null));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (!((Boolean) obj).booleanValue()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            inlineUnitsTextFieldView2.setVisibility(8);
                            TextView textView16 = yVar.f46347g;
                            if (textView16 == null) {
                                p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                throw null;
                            }
                            textView16.setVisibility(8);
                            TextView textView17 = yVar.f46349i;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                throw null;
                            }
                            textView17.setVisibility(8);
                            TextView textView18 = yVar.f46344d;
                            if (textView18 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView18.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton11 = yVar.f46348h;
                            if (gCMComplexTwoLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton11.setVisibility(0);
                            TextView textView19 = yVar.f46344d;
                            if (textView19 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView19.setText(yVar.getString(R.string.event_total_time));
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.e eVar = (ny1.e) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (eVar != null) {
                            int i27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.b.f46360a[eVar.ordinal()];
                            if (i27 == 1) {
                                InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                                if (inlineUnitsTextFieldView3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView3.setVisibility(0);
                                boolean z14 = yVar.E6().f46439u2;
                                TextView textView20 = yVar.f46347g;
                                if (z14) {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(8);
                                } else {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(0);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton12 = yVar.f46348h;
                                if (gCMComplexTwoLineButton12 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton12.setVisibility(8);
                                TextView textView21 = yVar.f46349i;
                                if (textView21 == null) {
                                    p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                    throw null;
                                }
                                textView21.setVisibility(8);
                                TextView textView22 = yVar.f46350j;
                                if (textView22 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView22.setVisibility(8);
                                TextView textView23 = yVar.f46354n;
                                if (textView23 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView23.setText(yVar.getString(R.string.lbl_distance));
                                TextView textView24 = yVar.f46344d;
                                if (textView24 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView24.setText(yVar.getString(R.string.event_total_distance));
                                if (yVar.E6().q5().d() == null) {
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView4 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView4 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView4.setEditTextValue("");
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView5 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView5 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView5.setEditHintText(yVar.getString(R.string.enter_event_distance));
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView6 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView6 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView6.setHasError(yVar.E6().k6());
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                if (i27 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                InlineUnitsTextFieldView inlineUnitsTextFieldView7 = yVar.f46345e;
                                if (inlineUnitsTextFieldView7 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView7.setVisibility(8);
                                TextView textView25 = yVar.f46347g;
                                if (textView25 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                    throw null;
                                }
                                textView25.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton13 = yVar.f46348h;
                                if (gCMComplexTwoLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton13.setVisibility(0);
                                TextView textView26 = yVar.f46346f;
                                if (textView26 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceRangeView");
                                    throw null;
                                }
                                textView26.setVisibility(8);
                                boolean z15 = yVar.E6().f46439u2;
                                TextView textView27 = yVar.f46349i;
                                if (z15) {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(8);
                                } else {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(0);
                                }
                                TextView textView28 = yVar.f46354n;
                                if (textView28 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView28.setText(yVar.getString(R.string.lbl_time));
                                TextView textView29 = yVar.f46344d;
                                if (textView29 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView29.setText(yVar.getString(R.string.event_total_time));
                                TextView textView30 = yVar.f46350j;
                                if (textView30 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView30.setVisibility(0);
                                yVar.E6().n6(true);
                                if (yVar.E6().k6()) {
                                    Integer numD = yVar.E6().t5().d();
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton14 = yVar.f46348h;
                                    if (numD != null) {
                                        if (numD.intValue() < 1) {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            Resources resources2 = yVar.getResources();
                                            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                                            gCMComplexTwoLineButton14.setRightIcon(resources2.getDrawable(2131231971, null));
                                        } else {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            gCMComplexTwoLineButton14.setRightIcon(null);
                                            TextView textView31 = yVar.f46350j;
                                            if (textView31 == null) {
                                                p005kotlin.jvm.internal.s.m("durationRangeView");
                                                throw null;
                                            }
                                            textView31.setVisibility(8);
                                        }
                                    } else {
                                        if (gCMComplexTwoLineButton14 == null) {
                                            p005kotlin.jvm.internal.s.m("durationView");
                                            throw null;
                                        }
                                        Resources resources3 = yVar.getResources();
                                        ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
                                        gCMComplexTwoLineButton14.setRightIcon(resources3.getDrawable(2131231971, null));
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((androidx.lifecycle.s0) E6().V0.getValue()).f(getViewLifecycleOwner(), new d(new tn2.n0(this, 22)));
        E6().s5().f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167210b;

            {
                this.f167210b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167210b;
                switch (i19) {
                    case 0:
                        Integer num = (Integer) obj;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = yVar.f46348h;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            int i110 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
                            int i24 = iIntValue % DateTimeConstants.SECONDS_PER_HOUR;
                            int i25 = i24 / 60;
                            int i26 = i24 % 60;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i110), Integer.valueOf(i25), Integer.valueOf(i26)}, 3)));
                        } else {
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(yVar.getString(R.string.enter_event_time));
                        }
                        if (yVar.E6().k6()) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton7 = yVar.f46348h;
                            if (gCMComplexTwoLineButton7 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            if (gCMComplexTwoLineButton7.isVisible()) {
                                yVar.E6().n6(num != null && num.intValue() >= 1);
                                if (num == null || num.intValue() < 1) {
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton8 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    Resources resources = yVar.getResources();
                                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                                    gCMComplexTwoLineButton8.setRightIcon(resources.getDrawable(2131231971, null));
                                    yVar.E6().n6(false);
                                    TextView textView10 = yVar.f46350j;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                } else {
                                    yVar.E6().n6(true);
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton9 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    gCMComplexTwoLineButton9.setRightIcon(null);
                                    TextView textView11 = yVar.f46350j;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                        } else {
                            yVar.E6().n6(true);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = yVar.f46348h;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.setButtonTopLabel(yVar.getString(R.string.activity_stats_details_total_time_label));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        bool.getClass();
                        inlineUnitsTextFieldView.setHasError(bool.booleanValue());
                        TextView textView12 = yVar.f46346f;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("distanceRangeView");
                            throw null;
                        }
                        textView12.setVisibility(bool.booleanValue() ? 0 : 8);
                        yVar.E6().n6(!bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        TextView textView13 = yVar.f46352l;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        bool2.getClass();
                        textView13.setEnabled(bool2.booleanValue());
                        TextView textView14 = yVar.f46352l;
                        if (textView14 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        boolean zIsEnabled = textView14.isEnabled();
                        TextView textView15 = yVar.f46352l;
                        if (zIsEnabled) {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.palette_delta_2, null));
                        } else {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.gcm_text_secondary, null));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (!((Boolean) obj).booleanValue()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            inlineUnitsTextFieldView2.setVisibility(8);
                            TextView textView16 = yVar.f46347g;
                            if (textView16 == null) {
                                p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                throw null;
                            }
                            textView16.setVisibility(8);
                            TextView textView17 = yVar.f46349i;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                throw null;
                            }
                            textView17.setVisibility(8);
                            TextView textView18 = yVar.f46344d;
                            if (textView18 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView18.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton11 = yVar.f46348h;
                            if (gCMComplexTwoLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton11.setVisibility(0);
                            TextView textView19 = yVar.f46344d;
                            if (textView19 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView19.setText(yVar.getString(R.string.event_total_time));
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.e eVar = (ny1.e) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (eVar != null) {
                            int i27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.b.f46360a[eVar.ordinal()];
                            if (i27 == 1) {
                                InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                                if (inlineUnitsTextFieldView3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView3.setVisibility(0);
                                boolean z14 = yVar.E6().f46439u2;
                                TextView textView20 = yVar.f46347g;
                                if (z14) {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(8);
                                } else {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(0);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton12 = yVar.f46348h;
                                if (gCMComplexTwoLineButton12 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton12.setVisibility(8);
                                TextView textView21 = yVar.f46349i;
                                if (textView21 == null) {
                                    p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                    throw null;
                                }
                                textView21.setVisibility(8);
                                TextView textView22 = yVar.f46350j;
                                if (textView22 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView22.setVisibility(8);
                                TextView textView23 = yVar.f46354n;
                                if (textView23 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView23.setText(yVar.getString(R.string.lbl_distance));
                                TextView textView24 = yVar.f46344d;
                                if (textView24 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView24.setText(yVar.getString(R.string.event_total_distance));
                                if (yVar.E6().q5().d() == null) {
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView4 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView4 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView4.setEditTextValue("");
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView5 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView5 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView5.setEditHintText(yVar.getString(R.string.enter_event_distance));
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView6 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView6 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView6.setHasError(yVar.E6().k6());
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                if (i27 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                InlineUnitsTextFieldView inlineUnitsTextFieldView7 = yVar.f46345e;
                                if (inlineUnitsTextFieldView7 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView7.setVisibility(8);
                                TextView textView25 = yVar.f46347g;
                                if (textView25 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                    throw null;
                                }
                                textView25.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton13 = yVar.f46348h;
                                if (gCMComplexTwoLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton13.setVisibility(0);
                                TextView textView26 = yVar.f46346f;
                                if (textView26 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceRangeView");
                                    throw null;
                                }
                                textView26.setVisibility(8);
                                boolean z15 = yVar.E6().f46439u2;
                                TextView textView27 = yVar.f46349i;
                                if (z15) {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(8);
                                } else {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(0);
                                }
                                TextView textView28 = yVar.f46354n;
                                if (textView28 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView28.setText(yVar.getString(R.string.lbl_time));
                                TextView textView29 = yVar.f46344d;
                                if (textView29 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView29.setText(yVar.getString(R.string.event_total_time));
                                TextView textView30 = yVar.f46350j;
                                if (textView30 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView30.setVisibility(0);
                                yVar.E6().n6(true);
                                if (yVar.E6().k6()) {
                                    Integer numD = yVar.E6().t5().d();
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton14 = yVar.f46348h;
                                    if (numD != null) {
                                        if (numD.intValue() < 1) {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            Resources resources2 = yVar.getResources();
                                            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                                            gCMComplexTwoLineButton14.setRightIcon(resources2.getDrawable(2131231971, null));
                                        } else {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            gCMComplexTwoLineButton14.setRightIcon(null);
                                            TextView textView31 = yVar.f46350j;
                                            if (textView31 == null) {
                                                p005kotlin.jvm.internal.s.m("durationRangeView");
                                                throw null;
                                            }
                                            textView31.setVisibility(8);
                                        }
                                    } else {
                                        if (gCMComplexTwoLineButton14 == null) {
                                            p005kotlin.jvm.internal.s.m("durationView");
                                            throw null;
                                        }
                                        Resources resources3 = yVar.getResources();
                                        ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
                                        gCMComplexTwoLineButton14.setRightIcon(resources3.getDrawable(2131231971, null));
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((y0) E6().R1.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167210b;

            {
                this.f167210b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167210b;
                switch (i19) {
                    case 0:
                        Integer num = (Integer) obj;
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = yVar.f46348h;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            int i110 = iIntValue / DateTimeConstants.SECONDS_PER_HOUR;
                            int i24 = iIntValue % DateTimeConstants.SECONDS_PER_HOUR;
                            int i25 = i24 / 60;
                            int i26 = i24 % 60;
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i110), Integer.valueOf(i25), Integer.valueOf(i26)}, 3)));
                        } else {
                            if (gCMComplexTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton6.setButtonBottomLeftLabel(yVar.getString(R.string.enter_event_time));
                        }
                        if (yVar.E6().k6()) {
                            GCMComplexTwoLineButton gCMComplexTwoLineButton7 = yVar.f46348h;
                            if (gCMComplexTwoLineButton7 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            if (gCMComplexTwoLineButton7.isVisible()) {
                                yVar.E6().n6(num != null && num.intValue() >= 1);
                                if (num == null || num.intValue() < 1) {
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton8 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    Resources resources = yVar.getResources();
                                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                                    gCMComplexTwoLineButton8.setRightIcon(resources.getDrawable(2131231971, null));
                                    yVar.E6().n6(false);
                                    TextView textView10 = yVar.f46350j;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView10.setVisibility(0);
                                } else {
                                    yVar.E6().n6(true);
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton9 = yVar.f46348h;
                                    if (gCMComplexTwoLineButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("durationView");
                                        throw null;
                                    }
                                    gCMComplexTwoLineButton9.setRightIcon(null);
                                    TextView textView11 = yVar.f46350j;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("durationRangeView");
                                        throw null;
                                    }
                                    textView11.setVisibility(8);
                                }
                            }
                        } else {
                            yVar.E6().n6(true);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton10 = yVar.f46348h;
                            if (gCMComplexTwoLineButton10 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton10.setButtonTopLabel(yVar.getString(R.string.activity_stats_details_total_time_label));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Boolean bool = (Boolean) obj;
                        InlineUnitsTextFieldView inlineUnitsTextFieldView = yVar.f46345e;
                        if (inlineUnitsTextFieldView == null) {
                            p005kotlin.jvm.internal.s.m("distanceView");
                            throw null;
                        }
                        bool.getClass();
                        inlineUnitsTextFieldView.setHasError(bool.booleanValue());
                        TextView textView12 = yVar.f46346f;
                        if (textView12 == null) {
                            p005kotlin.jvm.internal.s.m("distanceRangeView");
                            throw null;
                        }
                        textView12.setVisibility(bool.booleanValue() ? 0 : 8);
                        yVar.E6().n6(!bool.booleanValue());
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        TextView textView13 = yVar.f46352l;
                        if (textView13 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        bool2.getClass();
                        textView13.setEnabled(bool2.booleanValue());
                        TextView textView14 = yVar.f46352l;
                        if (textView14 == null) {
                            p005kotlin.jvm.internal.s.m("save");
                            throw null;
                        }
                        boolean zIsEnabled = textView14.isEnabled();
                        TextView textView15 = yVar.f46352l;
                        if (zIsEnabled) {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.palette_delta_2, null));
                        } else {
                            if (textView15 == null) {
                                p005kotlin.jvm.internal.s.m("save");
                                throw null;
                            }
                            textView15.setTextColor(yVar.getResources().getColor(R.color.gcm_text_secondary, null));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (!((Boolean) obj).booleanValue()) {
                            InlineUnitsTextFieldView inlineUnitsTextFieldView2 = yVar.f46345e;
                            if (inlineUnitsTextFieldView2 == null) {
                                p005kotlin.jvm.internal.s.m("distanceView");
                                throw null;
                            }
                            inlineUnitsTextFieldView2.setVisibility(8);
                            TextView textView16 = yVar.f46347g;
                            if (textView16 == null) {
                                p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                throw null;
                            }
                            textView16.setVisibility(8);
                            TextView textView17 = yVar.f46349i;
                            if (textView17 == null) {
                                p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                throw null;
                            }
                            textView17.setVisibility(8);
                            TextView textView18 = yVar.f46344d;
                            if (textView18 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView18.setVisibility(0);
                            GCMComplexTwoLineButton gCMComplexTwoLineButton11 = yVar.f46348h;
                            if (gCMComplexTwoLineButton11 == null) {
                                p005kotlin.jvm.internal.s.m("durationView");
                                throw null;
                            }
                            gCMComplexTwoLineButton11.setVisibility(0);
                            TextView textView19 = yVar.f46344d;
                            if (textView19 == null) {
                                p005kotlin.jvm.internal.s.m("titleView");
                                throw null;
                            }
                            textView19.setText(yVar.getString(R.string.event_total_time));
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.e eVar = (ny1.e) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                        if (eVar != null) {
                            int i27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.b.f46360a[eVar.ordinal()];
                            if (i27 == 1) {
                                InlineUnitsTextFieldView inlineUnitsTextFieldView3 = yVar.f46345e;
                                if (inlineUnitsTextFieldView3 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView3.setVisibility(0);
                                boolean z14 = yVar.E6().f46439u2;
                                TextView textView20 = yVar.f46347g;
                                if (z14) {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(8);
                                } else {
                                    if (textView20 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                        throw null;
                                    }
                                    textView20.setVisibility(0);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton12 = yVar.f46348h;
                                if (gCMComplexTwoLineButton12 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton12.setVisibility(8);
                                TextView textView21 = yVar.f46349i;
                                if (textView21 == null) {
                                    p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                    throw null;
                                }
                                textView21.setVisibility(8);
                                TextView textView22 = yVar.f46350j;
                                if (textView22 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView22.setVisibility(8);
                                TextView textView23 = yVar.f46354n;
                                if (textView23 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView23.setText(yVar.getString(R.string.lbl_distance));
                                TextView textView24 = yVar.f46344d;
                                if (textView24 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView24.setText(yVar.getString(R.string.event_total_distance));
                                if (yVar.E6().q5().d() == null) {
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView4 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView4 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView4.setEditTextValue("");
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView5 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView5 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView5.setEditHintText(yVar.getString(R.string.enter_event_distance));
                                    InlineUnitsTextFieldView inlineUnitsTextFieldView6 = yVar.f46345e;
                                    if (inlineUnitsTextFieldView6 == null) {
                                        p005kotlin.jvm.internal.s.m("distanceView");
                                        throw null;
                                    }
                                    inlineUnitsTextFieldView6.setHasError(yVar.E6().k6());
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                if (i27 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                InlineUnitsTextFieldView inlineUnitsTextFieldView7 = yVar.f46345e;
                                if (inlineUnitsTextFieldView7 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceView");
                                    throw null;
                                }
                                inlineUnitsTextFieldView7.setVisibility(8);
                                TextView textView25 = yVar.f46347g;
                                if (textView25 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceDescriptionView");
                                    throw null;
                                }
                                textView25.setVisibility(8);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton13 = yVar.f46348h;
                                if (gCMComplexTwoLineButton13 == null) {
                                    p005kotlin.jvm.internal.s.m("durationView");
                                    throw null;
                                }
                                gCMComplexTwoLineButton13.setVisibility(0);
                                TextView textView26 = yVar.f46346f;
                                if (textView26 == null) {
                                    p005kotlin.jvm.internal.s.m("distanceRangeView");
                                    throw null;
                                }
                                textView26.setVisibility(8);
                                boolean z15 = yVar.E6().f46439u2;
                                TextView textView27 = yVar.f46349i;
                                if (z15) {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(8);
                                } else {
                                    if (textView27 == null) {
                                        p005kotlin.jvm.internal.s.m("durationDescriptionView");
                                        throw null;
                                    }
                                    textView27.setVisibility(0);
                                }
                                TextView textView28 = yVar.f46354n;
                                if (textView28 == null) {
                                    p005kotlin.jvm.internal.s.m("title");
                                    throw null;
                                }
                                textView28.setText(yVar.getString(R.string.lbl_time));
                                TextView textView29 = yVar.f46344d;
                                if (textView29 == null) {
                                    p005kotlin.jvm.internal.s.m("titleView");
                                    throw null;
                                }
                                textView29.setText(yVar.getString(R.string.event_total_time));
                                TextView textView30 = yVar.f46350j;
                                if (textView30 == null) {
                                    p005kotlin.jvm.internal.s.m("durationRangeView");
                                    throw null;
                                }
                                textView30.setVisibility(0);
                                yVar.E6().n6(true);
                                if (yVar.E6().k6()) {
                                    Integer numD = yVar.E6().t5().d();
                                    GCMComplexTwoLineButton gCMComplexTwoLineButton14 = yVar.f46348h;
                                    if (numD != null) {
                                        if (numD.intValue() < 1) {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            Resources resources2 = yVar.getResources();
                                            ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                                            gCMComplexTwoLineButton14.setRightIcon(resources2.getDrawable(2131231971, null));
                                        } else {
                                            if (gCMComplexTwoLineButton14 == null) {
                                                p005kotlin.jvm.internal.s.m("durationView");
                                                throw null;
                                            }
                                            gCMComplexTwoLineButton14.setRightIcon(null);
                                            TextView textView31 = yVar.f46350j;
                                            if (textView31 == null) {
                                                p005kotlin.jvm.internal.s.m("durationRangeView");
                                                throw null;
                                            }
                                            textView31.setVisibility(8);
                                        }
                                    } else {
                                        if (gCMComplexTwoLineButton14 == null) {
                                            p005kotlin.jvm.internal.s.m("durationView");
                                            throw null;
                                        }
                                        Resources resources3 = yVar.getResources();
                                        ThreadLocal<TypedValue> threadLocal3 = b7.g.f16255a;
                                        gCMComplexTwoLineButton14.setRightIcon(resources3.getDrawable(2131231971, null));
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        InlineUnitsTextFieldView inlineUnitsTextFieldView = this.f46345e;
        if (inlineUnitsTextFieldView != null) {
            v22.e.b(inlineUnitsTextFieldView);
        } else {
            p005kotlin.jvm.internal.s.m("distanceView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/y$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "HR_MIN_SEC_FORMAT", "", "DEFAULT_DURATION_TIME", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
