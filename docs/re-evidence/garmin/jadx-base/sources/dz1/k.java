package dz1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ds.e0;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldz1/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f61743y = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f61744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f61745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f61746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f61747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f61748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f61749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f61750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f61751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f61752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f61753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f61754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f61755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f61756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f61757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f61758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f61759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f61760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f61761r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f61762t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexTwoLineButton f61763v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexTwoLineButton f61764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexTwoLineButton f61765x;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f61766a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f61766a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f61766a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61766a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f61767a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f61767a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f61768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f61769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f61768a = aVar;
            this.f61769b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f61768a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f61769b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f61770a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f61770a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public k() {
        super(R.layout.ti_find_event_filter_fragment2);
        this.f61744a = new w1(s0.f105811a.b(cz1.a.class), new c(this), new e(this), new d(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u6().j5(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.title_text_view);
        viewFindViewById.getClass();
        this.f61745b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_view_apply);
        viewFindViewById2.getClass();
        this.f61746c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.btn_cancel);
        viewFindViewById3.getClass();
        this.f61747d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.reset);
        viewFindViewById4.getClass();
        this.f61748e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.event_type);
        viewFindViewById5.getClass();
        this.f61749f = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.event_type_title);
        viewFindViewById6.getClass();
        this.f61750g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.event_type_value);
        viewFindViewById7.getClass();
        this.f61751h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.participation);
        viewFindViewById8.getClass();
        this.f61752i = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.participation_value);
        viewFindViewById9.getClass();
        this.f61753j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.dates);
        viewFindViewById10.getClass();
        this.f61754k = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.dates_title);
        viewFindViewById11.getClass();
        this.f61755l = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.dates_value);
        viewFindViewById12.getClass();
        this.f61756m = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.event_duration);
        viewFindViewById13.getClass();
        this.f61757n = (LinearLayout) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.event_duration_title);
        viewFindViewById14.getClass();
        this.f61758o = (TextView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.event_duration_value);
        viewFindViewById15.getClass();
        this.f61759p = (TextView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.radius);
        viewFindViewById16.getClass();
        this.f61760q = (LinearLayout) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.radius_title);
        viewFindViewById17.getClass();
        this.f61761r = (TextView) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.radius_value);
        viewFindViewById18.getClass();
        this.f61762t = (TextView) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.event_source_view);
        viewFindViewById19.getClass();
        View viewFindViewById20 = view2.findViewById(R.id.events_sub_text);
        viewFindViewById20.getClass();
        View viewFindViewById21 = view2.findViewById(R.id.official_events);
        viewFindViewById21.getClass();
        this.f61763v = (GCMComplexTwoLineButton) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.verified_events);
        viewFindViewById22.getClass();
        this.f61764w = (GCMComplexTwoLineButton) viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.garmin_user_events);
        viewFindViewById23.getClass();
        this.f61765x = (GCMComplexTwoLineButton) viewFindViewById23;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f61763v;
        if (gCMComplexTwoLineButton == null) {
            s.m("officialEventsView");
            throw null;
        }
        gg0.j jVar = gg0.j.OFFICIAL;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = contextRequireContext.getString(jVar.f77181b);
        string.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(string);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f61764w;
        if (gCMComplexTwoLineButton2 == null) {
            s.m("verifiedEventsView");
            throw null;
        }
        gg0.j jVar2 = gg0.j.VERIFIED;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        String string2 = contextRequireContext2.getString(jVar2.f77181b);
        string2.getClass();
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(string2);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f61765x;
        if (gCMComplexTwoLineButton3 == null) {
            s.m("userEventsView");
            throw null;
        }
        gg0.j jVar3 = gg0.j.NONE;
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        String string3 = contextRequireContext3.getString(jVar3.f77181b);
        string3.getClass();
        gCMComplexTwoLineButton3.setButtonBottomLeftLabel(string3);
        TextView textView = this.f61745b;
        if (textView == null) {
            s.m("title");
            throw null;
        }
        textView.setText(getString(R.string.lbl_filter));
        LinearLayout linearLayout = this.f61754k;
        if (linearLayout == null) {
            s.m("dateView");
            throw null;
        }
        final int i14 = 3;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                k kVar = this.f61742b;
                switch (i15) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = this.f61749f;
        if (linearLayout2 == null) {
            s.m("eventTypeView");
            throw null;
        }
        final int i15 = 5;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                k kVar = this.f61742b;
                switch (i16) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout3 = this.f61752i;
        if (linearLayout3 == null) {
            s.m("participationView");
            throw null;
        }
        final int i16 = 6;
        linearLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                k kVar = this.f61742b;
                switch (i17) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout4 = this.f61760q;
        if (linearLayout4 == null) {
            s.m("radiusView");
            throw null;
        }
        final int i17 = 7;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                k kVar = this.f61742b;
                switch (i18) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        TextView textView2 = this.f61746c;
        if (textView2 == null) {
            s.m("textViewApply");
            throw null;
        }
        final int i18 = 8;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                k kVar = this.f61742b;
                switch (i19) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        ImageView imageView = this.f61747d;
        if (imageView == null) {
            s.m("imgBtnCancel");
            throw null;
        }
        final int i19 = 9;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i19;
                k kVar = this.f61742b;
                switch (i110) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        TextView textView3 = this.f61748e;
        if (textView3 == null) {
            s.m("textViewReset");
            throw null;
        }
        final int i24 = 10;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i24;
                k kVar = this.f61742b;
                switch (i110) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout5 = this.f61757n;
        if (linearLayout5 == null) {
            s.m("eventDuration");
            throw null;
        }
        final int i25 = 0;
        linearLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i25;
                k kVar = this.f61742b;
                switch (i110) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f61763v;
        if (gCMComplexTwoLineButton4 == null) {
            s.m("officialEventsView");
            throw null;
        }
        final int i26 = 1;
        gCMComplexTwoLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i26;
                k kVar = this.f61742b;
                switch (i110) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f61764w;
        if (gCMComplexTwoLineButton5 == null) {
            s.m("verifiedEventsView");
            throw null;
        }
        final int i27 = 2;
        gCMComplexTwoLineButton5.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i27;
                k kVar = this.f61742b;
                switch (i110) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f61765x;
        if (gCMComplexTwoLineButton6 == null) {
            s.m("userEventsView");
            throw null;
        }
        final int i28 = 4;
        gCMComplexTwoLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: dz1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f61742b;

            {
                this.f61742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i110 = i28;
                k kVar = this.f61742b;
                switch (i110) {
                    case 0:
                        k.a aVar = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDurationFragment");
                        break;
                    case 1:
                        k.a aVar2 = k.f61743y;
                        kVar.u6().e5(gg0.j.OFFICIAL);
                        break;
                    case 2:
                        k.a aVar3 = k.f61743y;
                        kVar.u6().e5(gg0.j.VERIFIED);
                        break;
                    case 3:
                        k.a aVar4 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterDateFragment");
                        break;
                    case 4:
                        k.a aVar5 = k.f61743y;
                        kVar.u6().e5(gg0.j.NONE);
                        break;
                    case 5:
                        k.a aVar6 = k.f61743y;
                        kVar.u6().a5().m("EventTypeListFragment");
                        break;
                    case 6:
                        k.a aVar7 = k.f61743y;
                        kVar.u6().a5().m("TIFindEventFilterParticipationFragment");
                        break;
                    case 7:
                        k.a aVar8 = k.f61743y;
                        kVar.u6().a5().m("TISearchRadiusFragment");
                        break;
                    case 8:
                        k.a aVar9 = k.f61743y;
                        Intent intent = new Intent();
                        intent.putExtra("GCM_extra_events_filter_dto", (Parcelable) kVar.u6().L0.d());
                        androidx.fragment.app.m activity = kVar.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, intent);
                        }
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        break;
                    case 9:
                        k.a aVar10 = k.f61743y;
                        androidx.fragment.app.m activity3 = kVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(0);
                        }
                        androidx.fragment.app.m activity4 = kVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                        }
                        break;
                    default:
                        k.a aVar11 = k.f61743y;
                        cz1.a aVarU6 = kVar.u6();
                        aVarU6.P = true;
                        my1.d dVar = aVarU6.I;
                        if (dVar != null) {
                            aVarU6.i5(dVar);
                        }
                        break;
                }
            }
        });
        View viewFindViewById24 = view2.findViewById(R.id.toolbar_actionbar_default);
        e0 e0Var = new e0(2);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById24, e0Var);
        u6().L0.f(getViewLifecycleOwner(), new b(new ds0.g(this, 1)));
    }

    public final cz1.a u6() {
        return (cz1.a) this.f61744a.getValue();
    }

    public final void v6(boolean z14, boolean z15) {
        TextView textView = this.f61748e;
        if (textView == null) {
            s.m("textViewReset");
            throw null;
        }
        textView.setEnabled(z14);
        TextView textView2 = this.f61746c;
        if (textView2 == null) {
            s.m("textViewApply");
            throw null;
        }
        textView2.setEnabled(z15);
        TextView textView3 = this.f61748e;
        if (textView3 == null) {
            s.m("textViewReset");
            throw null;
        }
        Context contextRequireContext = requireContext();
        int i14 = R.color.gcm_text_secondary;
        textView3.setTextColor(a7.b.getColor(contextRequireContext, z14 ? R.color.palette_blue_22 : R.color.gcm_text_secondary));
        TextView textView4 = this.f61746c;
        if (textView4 == null) {
            s.m("textViewApply");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        if (z15) {
            i14 = R.color.palette_blue_22;
        }
        textView4.setTextColor(a7.b.getColor(contextRequireContext2, i14));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldz1/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
