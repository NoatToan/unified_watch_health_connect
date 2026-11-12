package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import db1.j;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pm0.h;
import qb1.a0;
import qb1.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/b;", "Landroidx/fragment/app/Fragment;", "Lqb1/b0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f40952i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f40953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f40954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q22.b f40955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wp0.a f40956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f40957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f40958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f40959g = new w1(s0.f105811a.b(qb1.f.class), new C0774b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f40960h;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0774b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0774b(Fragment fragment) {
            super(0);
            this.f40961a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40961a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40962a = aVar;
            this.f40963b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40962a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40963b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40964a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40964a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40964a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // qb1.b0
    public final void i0() {
        qb1.f fVar = (qb1.f) this.f40959g.getValue();
        Double d14 = this.f40957e;
        if (d14 != null) {
            fVar.C.g(new j("HYDRATION", d14.doubleValue(), null, 4, null));
        }
        a0 a0Var = this.f40960h;
        if (a0Var != null) {
            a0Var.E8();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 101 && i15 == -1) {
            Double dValueOf = null;
            if (intent != null) {
                q22.b bVar = this.f40955c;
                if (bVar == null) {
                    s.m("mMeasurementUnit");
                    throw null;
                }
                dValueOf = Double.valueOf(intent.getDoubleExtra("GCM_extra_current_daily_goal", jp0.c.n(bVar)));
            }
            this.f40957e = dValueOf;
            u6(dValueOf);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (getActivity() instanceof a0) {
            a7.e activity = getActivity();
            activity.getClass();
            this.f40960h = (a0) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q22.b.a aVar = q22.b.f142305e;
        Bundle arguments = getArguments();
        Object obj = null;
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("EXTRA_HYDRATION_MEASUREMENT_UNIT")) : null;
        aVar.getClass();
        for (Object obj2 : q22.b.f142311k) {
            int iOrdinal = ((q22.b) obj2).ordinal();
            if (numValueOf != null && iOrdinal == numValueOf.intValue()) {
                obj = obj2;
                break;
            }
        }
        q22.b bVar = (q22.b) obj;
        if (bVar == null) {
            bVar = q22.b.FLUID_OUNCE;
        }
        this.f40955c = bVar;
        Bundle arguments2 = getArguments();
        this.f40958f = Double.valueOf(arguments2 != null ? arguments2.getDouble("EXTRA_HYDRATION_GOAL") : jp0.c.n(q22.b.MILLILITER));
        this.f40957e = Double.valueOf(jp0.c.n(q22.b.MILLILITER));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_hydration, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strA;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.setup_hydration_description);
        viewFindViewById.getClass();
        this.f40953a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.setup_hydration_button);
        viewFindViewById2.getClass();
        this.f40954b = (GCMComplexOneLineButton) viewFindViewById2;
        Context context = view2.getContext();
        context.getClass();
        this.f40956d = new wp0.a(new l22.a(context));
        Context context2 = view2.getContext();
        context2.getClass();
        wp0.a aVar = this.f40956d;
        if (aVar != null) {
            double dN = jp0.c.n(q22.b.MILLILITER);
            q22.b bVar = this.f40955c;
            if (bVar == null) {
                s.m("mMeasurementUnit");
                throw null;
            }
            strA = aVar.a(dN, bVar, true);
        } else {
            strA = null;
        }
        String string = getString(R.string.pregnancy_hydration_goal_message, strA);
        string.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.nationalacademies.org/hmd/Reports/2004/Dietary-Reference-Intakes-Water-Potassium-Sodium-Chloride-and-Sulfate.aspx"));
        TextView textView = this.f40953a;
        if (textView == null) {
            s.m("mHydrationDescription");
            throw null;
        }
        oe2.f.Y(textView, string, intent);
        TextView textView2 = this.f40953a;
        if (textView2 == null) {
            s.m("mHydrationDescription");
            throw null;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = this.f40953a;
        if (textView3 == null) {
            s.m("mHydrationDescription");
            throw null;
        }
        textView3.setLinkTextColor(a7.b.getColor(context2, R.color.gcm_text_primary_action));
        ArrayList<j> arrayListB = ((qb1.f) this.f40959g.getValue()).C.b();
        if (arrayListB != null && !arrayListB.isEmpty()) {
            Iterator<j> it = arrayListB.iterator();
            it.getClass();
            while (it.hasNext()) {
                j next = it.next();
                next.getClass();
                j jVar = next;
                if (s.g(jVar.getUserGoalType(), "HYDRATION")) {
                    this.f40957e = Double.valueOf(jVar.getUserGoalValue());
                }
            }
        }
        u6(this.f40957e);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f40954b;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setOnClickListener(new h(3, this, view2));
        } else {
            s.m("mHydrationGoalButton");
            throw null;
        }
    }

    @Override // qb1.b0
    public final void r0() {
        qb1.f fVar = (qb1.f) this.f40959g.getValue();
        Double d14 = this.f40958f;
        if (d14 != null) {
            fVar.C.g(new j("HYDRATION", d14.doubleValue(), null, 4, null));
        }
        a0 a0Var = this.f40960h;
        if (a0Var != null) {
            a0Var.E8();
        }
    }

    public final void u6(Double d14) {
        String strA;
        if (d14 != null) {
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f40954b;
            if (gCMComplexOneLineButton == null) {
                s.m("mHydrationGoalButton");
                throw null;
            }
            wp0.a aVar = this.f40956d;
            if (aVar != null) {
                double dDoubleValue = d14.doubleValue();
                q22.b bVar = this.f40955c;
                if (bVar == null) {
                    s.m("mMeasurementUnit");
                    throw null;
                }
                wp0.a.C3469a c3469a = wp0.a.f186524b;
                strA = aVar.a(dDoubleValue, bVar, true);
            } else {
                strA = "";
            }
            gCMComplexOneLineButton.setButtonRightLabel(strA);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_HYDRATION_GOAL", "EXTRA_HYDRATION_MEASUREMENT_UNIT", "", "HYDRATION_GOAL_REQUEST_CODE", "I", "HYDRATION_GOAL_TYPE", "HYDRATION_GOAL_LINK", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
