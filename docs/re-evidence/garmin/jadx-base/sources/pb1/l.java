package pb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancySegmentedButton;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import db1.u;
import fw.p;
import kx0.m;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.q1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpb1/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f136861l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f136862m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f136863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f136864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f136865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f136866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMPregnancySegmentedButton f136867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMPregnancySegmentedButton f136868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMPregnancySegmentedButton f136869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f136870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f136871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f136872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w1 f136873k = new w1(s0.f105811a.b(m.class), new d(this), new f(this), new e(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136874a;

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
            f136874a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f136875a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f136875a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f136875a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f136875a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f136876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f136876a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f136876a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f136877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f136878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f136877a = aVar;
            this.f136878b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f136877a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f136878b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f136879a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f136879a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f136879a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f136862m = gt2.b.f79005a.h("PregnancySettingsTopFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_top_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pt_settings_cycle_type);
        viewFindViewById.getClass();
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = (GCMPregnancyTwoLineButton) viewFindViewById;
        this.f136863a = gCMPregnancyTwoLineButton;
        gCMPregnancyTwoLineButton.setButtonValueLabel(getString(R.string.pregnancy_pregnant));
        View viewFindViewById2 = view2.findViewById(R.id.pt_settings_cycle_type_hint);
        viewFindViewById2.getClass();
        this.f136864b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.pt_settings_due_date);
        viewFindViewById3.getClass();
        this.f136865c = (GCMPregnancyTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.pt_settings_expecting);
        viewFindViewById4.getClass();
        this.f136866d = (GCMPregnancyTwoLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.pt_settings_weight_gain_goals);
        viewFindViewById5.getClass();
        this.f136867e = (GCMPregnancySegmentedButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.pt_settings_baby_movement);
        viewFindViewById6.getClass();
        this.f136868f = (GCMPregnancySegmentedButton) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.pt_settings_blood_glucose);
        viewFindViewById7.getClass();
        this.f136869g = (GCMPregnancySegmentedButton) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.pt_weight_before_pregnancy);
        viewFindViewById8.getClass();
        this.f136870h = (GCMPregnancyTwoLineButton) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.pt_height_pregnancy);
        viewFindViewById9.getClass();
        this.f136871i = (GCMPregnancyTwoLineButton) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.pt_glucose_tracking_units);
        viewFindViewById10.getClass();
        this.f136872j = (GCMPregnancyTwoLineButton) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.pt_weight_goals_hint);
        viewFindViewById11.getClass();
        oe2.f.Z((TextView) viewFindViewById11, R.string.pregnancy_weight_gain_goals_footer, "https://www.cdc.gov/maternal-infant-health/pregnancy-weight");
        TextView textView = this.f136864b;
        if (textView == null) {
            s.m("mCycleTypeHint");
            throw null;
        }
        textView.setText(R.string.pregnancy_cycle_type_selection_footer);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            v6().A4().f(activity, new c(new q1(this, 12)));
        }
        v6().B4();
    }

    public final GCMPregnancyTwoLineButton u6() {
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f136865c;
        if (gCMPregnancyTwoLineButton != null) {
            return gCMPregnancyTwoLineButton;
        }
        s.m("mDueDateButton");
        throw null;
    }

    public final m v6() {
        return (m) this.f136873k.getValue();
    }

    public final void w6(u uVar) {
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f136870h;
        if (gCMPregnancyTwoLineButton == null) {
            s.m("mWeightButton");
            throw null;
        }
        gCMPregnancyTwoLineButton.setVisibility(uVar.getWeightGoalRecommendation() ? 0 : 8);
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = this.f136871i;
        if (gCMPregnancyTwoLineButton2 != null) {
            gCMPregnancyTwoLineButton2.setVisibility(uVar.getWeightGoalRecommendation() ? 0 : 8);
        } else {
            s.m("mHeightButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpb1/l$a;", "", "<init>", "()V", "", "TWO_WEEKS_IN_DAYS", "I", "DAY_RANGE", "MAX_DAYS_RANGE", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
