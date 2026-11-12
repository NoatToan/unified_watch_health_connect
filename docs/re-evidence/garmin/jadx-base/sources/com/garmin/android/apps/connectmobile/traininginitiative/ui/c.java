package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import am.x0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mz1.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/c;", "Landroidx/fragment/app/Fragment;", "Luy1/f$a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements uy1.f.a {
    public static final a T = new a(null);
    public GCMComplexTwoLineButton A;
    public ImageView B;
    public CardView C;
    public LinearLayout D;
    public uy1.f E;
    public LinearLayout F;
    public TextView I;
    public boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f45861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f45864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f45865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f45868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f45869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f45870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f45871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f45872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f45873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f45874p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f45875q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f45876r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f45877t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f45878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f45879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RelativeLayout f45880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RelativeLayout f45881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f45882z;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45883a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f45883a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45883a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45883a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0885c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45884a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0885c(Fragment fragment) {
            super(0);
            this.f45884a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45884a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45886b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45885a = aVar;
            this.f45886b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45885a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45886b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45887a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f45887a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45887a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.event_details_overview_fragment);
        this.f45859a = new w1(s0.f105811a.b(e0.class), new C0885c(this), new e(this), new d(null, this));
    }

    @Override // uy1.f.a
    public final void N1(x0 x0Var, com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        e0 e0VarW6 = w6();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        e0VarW6.A5(mVarRequireActivity, dVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.P = arguments.getBoolean("GCM_extra_is_find_an_event");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.overview_title);
        viewFindViewById.getClass();
        this.f45860b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_view_event_type);
        viewFindViewById2.getClass();
        this.f45861c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text_view_date);
        viewFindViewById3.getClass();
        this.f45862d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.text_view_start_time);
        viewFindViewById4.getClass();
        this.f45863e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.text_view_location);
        viewFindViewById5.getClass();
        this.f45864f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.text_view_course);
        viewFindViewById6.getClass();
        this.f45865g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.course_info_view);
        viewFindViewById7.getClass();
        this.f45866h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.text_view_website);
        viewFindViewById8.getClass();
        this.f45867i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.text_view_notes);
        viewFindViewById9.getClass();
        this.f45868j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.ll_start_time);
        viewFindViewById10.getClass();
        this.f45869k = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.ll_website);
        viewFindViewById11.getClass();
        this.f45880x = (RelativeLayout) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.ll_notes);
        viewFindViewById12.getClass();
        this.f45870l = (LinearLayout) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.ll_distance);
        viewFindViewById13.getClass();
        this.f45871m = (LinearLayout) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.distance_title);
        viewFindViewById14.getClass();
        this.f45872n = (TextView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.distance_text);
        viewFindViewById15.getClass();
        this.f45873o = (TextView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.rl_add_course);
        viewFindViewById16.getClass();
        this.f45874p = (RelativeLayout) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.ll_course);
        viewFindViewById17.getClass();
        this.f45875q = (LinearLayout) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.ll_course_list);
        viewFindViewById18.getClass();
        this.f45876r = (LinearLayout) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.ll_location_layout);
        viewFindViewById19.getClass();
        this.f45878v = (LinearLayout) viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.layout_event_type);
        viewFindViewById20.getClass();
        this.f45879w = (LinearLayout) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.rl_register_layout);
        viewFindViewById21.getClass();
        this.f45881y = (RelativeLayout) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.tv_event_source);
        viewFindViewById22.getClass();
        this.f45882z = (TextView) viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.event_source);
        viewFindViewById23.getClass();
        this.A = (GCMComplexTwoLineButton) viewFindViewById23;
        View viewFindViewById24 = view2.findViewById(R.id.image_view_source);
        viewFindViewById24.getClass();
        this.B = (ImageView) viewFindViewById24;
        View viewFindViewById25 = view2.findViewById(R.id.card_view_image_source);
        viewFindViewById25.getClass();
        this.C = (CardView) viewFindViewById25;
        View viewFindViewById26 = view2.findViewById(R.id.ll_event_source);
        viewFindViewById26.getClass();
        this.D = (LinearLayout) viewFindViewById26;
        View viewFindViewById27 = view2.findViewById(R.id.recycler_view);
        viewFindViewById27.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById27;
        this.f45877t = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        View viewFindViewById28 = view2.findViewById(R.id.ll_subscribers);
        viewFindViewById28.getClass();
        this.F = (LinearLayout) viewFindViewById28;
        View viewFindViewById29 = view2.findViewById(R.id.text_view_subscriber_count);
        viewFindViewById29.getClass();
        this.I = (TextView) viewFindViewById29;
        LinearLayout linearLayout = this.f45875q;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("mCourseLayout");
            throw null;
        }
        final int i14 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.c f167206b;

            {
                this.f167206b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar = this.f167206b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        fg0.k kVarD = cVar.w6().k5().d();
                        String registrationUrl = kVarD != null ? kVarD.getRegistrationUrl() : null;
                        if (registrationUrl != null) {
                            cVar.y6(registrationUrl);
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        mz1.e0 e0VarW6 = cVar.w6();
                        androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
                        mVarRequireActivity.getClass();
                        e0VarW6.A5(mVarRequireActivity, null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        ((androidx.lifecycle.y0) cVar.w6().f121686h1.getValue()).m("TIAddCourseFragment");
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = this.f45874p;
        if (relativeLayout == null) {
            p005kotlin.jvm.internal.s.m("mAddCourseLayout");
            throw null;
        }
        final int i15 = 2;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.c f167206b;

            {
                this.f167206b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar = this.f167206b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        fg0.k kVarD = cVar.w6().k5().d();
                        String registrationUrl = kVarD != null ? kVarD.getRegistrationUrl() : null;
                        if (registrationUrl != null) {
                            cVar.y6(registrationUrl);
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        mz1.e0 e0VarW6 = cVar.w6();
                        androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
                        mVarRequireActivity.getClass();
                        e0VarW6.A5(mVarRequireActivity, null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        ((androidx.lifecycle.y0) cVar.w6().f121686h1.getValue()).m("TIAddCourseFragment");
                        break;
                }
            }
        });
        w6().k5().f(getViewLifecycleOwner(), new b(new ty1.n(this, 0)));
        ((androidx.lifecycle.s0) w6().R0.getValue()).f(getViewLifecycleOwner(), new b(new ty1.n(this, 1)));
        ((androidx.lifecycle.s0) w6().f204403v.getValue()).f(getViewLifecycleOwner(), new b(new ty1.n(this, 2)));
        RelativeLayout relativeLayout2 = this.f45881y;
        if (relativeLayout2 == null) {
            p005kotlin.jvm.internal.s.m("mRegisterLayout");
            throw null;
        }
        final int i16 = 0;
        relativeLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.c f167206b;

            {
                this.f167206b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.c cVar = this.f167206b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        fg0.k kVarD = cVar.w6().k5().d();
                        String registrationUrl = kVarD != null ? kVarD.getRegistrationUrl() : null;
                        if (registrationUrl != null) {
                            cVar.y6(registrationUrl);
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        mz1.e0 e0VarW6 = cVar.w6();
                        androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
                        mVarRequireActivity.getClass();
                        e0VarW6.A5(mVarRequireActivity, null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.c.T;
                        ((androidx.lifecycle.y0) cVar.w6().f121686h1.getValue()).m("TIAddCourseFragment");
                        break;
                }
            }
        });
    }

    public final void u6(String str) {
        fg0.n nVarA4 = w6().A4(str);
        if (nVarA4 == null || p005kotlin.jvm.internal.s.g(gg0.j.NONE.toString(), String.valueOf(nVarA4.getVerifiedStatus()))) {
            return;
        }
        TextView textView = this.f45882z;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mTvEventSource");
            throw null;
        }
        textView.setVisibility(0);
        LinearLayout linearLayout = this.D;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("mEventSourceLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.A;
        if (gCMComplexTwoLineButton == null) {
            p005kotlin.jvm.internal.s.m("mEventSource");
            throw null;
        }
        gCMComplexTwoLineButton.setButtonTopLabel(nVarA4.getEventsProviderName());
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.A;
        if (gCMComplexTwoLineButton2 == null) {
            p005kotlin.jvm.internal.s.m("mEventSource");
            throw null;
        }
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(R.string.verified_source));
        if (g22.n.d(nVarA4.getLogoURL())) {
            CardView cardView = this.C;
            if (cardView == null) {
                p005kotlin.jvm.internal.s.m("mCardViewImageSource");
                throw null;
            }
            cardView.setVisibility(0);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            zp0.c cVar = new zp0.c(contextRequireContext);
            cVar.f206565e = nVarA4.getLogoURL();
            ImageView imageView = this.B;
            if (imageView != null) {
                cVar.h(imageView);
            } else {
                p005kotlin.jvm.internal.s.m("mImageViewSource");
                throw null;
            }
        }
    }

    public final ArrayList v6(List list) {
        ArrayList arrayList = new ArrayList();
        if (w6().z5() && list != null && !list.isEmpty()) {
            w6();
            com.garmin.android.apps.connectmobile.courses.model.e eVarC5 = e0.c5(list);
            if (eVarC5 != null) {
                String string = getString(R.string.activity_options_bike_title);
                string.getClass();
                String str = eVarC5.courseName;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new my1.e(string, str, eVarC5.g(), new com.garmin.android.apps.connectmobile.courses.model.d(eVarC5)));
            }
            w6();
            com.garmin.android.apps.connectmobile.courses.model.e eVarD5 = e0.d5(list);
            if (eVarD5 != null) {
                String string2 = getString(R.string.lbl_run);
                string2.getClass();
                String str2 = eVarD5.courseName;
                arrayList.add(new my1.e(string2, str2 != null ? str2 : "", eVarD5.g(), new com.garmin.android.apps.connectmobile.courses.model.d(eVarD5)));
            }
        }
        return arrayList;
    }

    public final e0 w6() {
        return (e0) this.f45859a.getValue();
    }

    public final void y6(String str) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
        aVar.setTitle(getString(R.string.leave_garmin_connect_question));
        aVar.setMessage(getString(R.string.leave_garmin_connect_event_prompt));
        aVar.setCancelable(false);
        aVar.setPositiveButton(getString(R.string.lbl_common_continue), new pk1.t(10, str, this));
        aVar.setNegativeButton(getString(R.string.lbl_cancel), new ty1.o(0));
        aVar.create().show();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
    public final void z6(String str, List<com.garmin.android.apps.connectmobile.courses.model.e> list) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        boolean z14;
        boolean z15;
        boolean z16 = true;
        if (w6().z5()) {
            if (list == null || list.isEmpty()) {
                if (list != null) {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z14 = false;
                                break;
                            } else if (((com.garmin.android.apps.connectmobile.courses.model.e) it.next()).G()) {
                                z14 = true;
                                break;
                            }
                        }
                    } else {
                        z14 = false;
                        break;
                    }
                    TextView textView = this.f45866h;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("mCourseInfo");
                        throw null;
                    }
                    v22.e.r(textView, z14);
                }
                LinearLayout linearLayout = this.f45876r;
                if (linearLayout == null) {
                    p005kotlin.jvm.internal.s.m("mCourseListLayout");
                    throw null;
                }
                linearLayout.setVisibility(8);
                RelativeLayout relativeLayout = this.f45874p;
                if (relativeLayout == null) {
                    p005kotlin.jvm.internal.s.m("mAddCourseLayout");
                    throw null;
                }
                relativeLayout.setVisibility(8);
            } else {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                uy1.f fVar = new uy1.f(contextRequireContext, v6(list));
                this.E = fVar;
                RecyclerView recyclerView = this.f45877t;
                if (recyclerView == null) {
                    p005kotlin.jvm.internal.s.m("mCourseRecyclerView");
                    throw null;
                }
                recyclerView.setAdapter(fVar);
                uy1.f fVar2 = this.E;
                if (fVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mMultipleCourseItemAdapter");
                    throw null;
                }
                fVar2.f173413b = this;
                if (fVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mMultipleCourseItemAdapter");
                    throw null;
                }
                fVar2.f173412a = v6(list);
                fVar2.notifyDataSetChanged();
                LinearLayout linearLayout2 = this.f45876r;
                if (linearLayout2 == null) {
                    p005kotlin.jvm.internal.s.m("mCourseListLayout");
                    throw null;
                }
                linearLayout2.setVisibility(0);
                if (!list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z15 = false;
                            break;
                        } else if (((com.garmin.android.apps.connectmobile.courses.model.e) it3.next()).G()) {
                            z15 = true;
                            break;
                        }
                    }
                } else {
                    z15 = false;
                    break;
                }
                TextView textView2 = this.f45866h;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("mCourseInfo");
                    throw null;
                }
                v22.e.r(textView2, z15);
                LinearLayout linearLayout3 = this.f45875q;
                if (linearLayout3 == null) {
                    p005kotlin.jvm.internal.s.m("mCourseLayout");
                    throw null;
                }
                linearLayout3.setVisibility(8);
            }
        } else if (str == null || str.length() == 0) {
            w6();
            lz1.f.f115404a.getClass();
            LinearLayout linearLayout4 = this.f45875q;
            if (linearLayout4 == null) {
                p005kotlin.jvm.internal.s.m("mCourseLayout");
                throw null;
            }
            linearLayout4.setVisibility(8);
            LinearLayout linearLayout5 = this.f45876r;
            if (linearLayout5 == null) {
                p005kotlin.jvm.internal.s.m("mCourseListLayout");
                throw null;
            }
            linearLayout5.setVisibility(8);
            TextView textView3 = this.f45866h;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("mCourseInfo");
                throw null;
            }
            textView3.setVisibility(8);
        } else {
            TextView textView4 = this.f45865g;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("mCourse");
                throw null;
            }
            textView4.setText(str);
            TextView textView5 = this.f45866h;
            if (textView5 == null) {
                p005kotlin.jvm.internal.s.m("mCourseInfo");
                throw null;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) ((androidx.lifecycle.s0) w6().M0.getValue()).d();
            v22.e.r(textView5, eVar2 != null && eVar2.G());
            LinearLayout linearLayout6 = this.f45875q;
            if (linearLayout6 == null) {
                p005kotlin.jvm.internal.s.m("mCourseLayout");
                throw null;
            }
            linearLayout6.setVisibility(0);
            LinearLayout linearLayout7 = this.f45876r;
            if (linearLayout7 == null) {
                p005kotlin.jvm.internal.s.m("mCourseListLayout");
                throw null;
            }
            linearLayout7.setVisibility(8);
            RelativeLayout relativeLayout2 = this.f45874p;
            if (relativeLayout2 == null) {
                p005kotlin.jvm.internal.s.m("mAddCourseLayout");
                throw null;
            }
            relativeLayout2.setVisibility(8);
        }
        List<com.garmin.android.apps.connectmobile.courses.model.e> listD = w6().h5().d();
        if (listD == null || listD.isEmpty()) {
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((androidx.lifecycle.s0) w6().M0.getValue()).d();
            if (eVar != null || !eVar.G()) {
                z16 = false;
            }
        } else {
            Iterator<T> it4 = listD.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((androidx.lifecycle.s0) w6().M0.getValue()).d();
                    if (eVar != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                } else if (((com.garmin.android.apps.connectmobile.courses.model.e) it4.next()).G()) {
                }
            }
        }
        if (this.P && w6().w5()) {
            TextView textView6 = this.f45866h;
            if (textView6 == null) {
                p005kotlin.jvm.internal.s.m("mCourseInfo");
                throw null;
            }
            textView6.setText(z16 ? getString(R.string.lbcp_course_footer_not_subscribed) : getString(R.string.adding_event_to_calendar));
            TextView textView7 = this.f45866h;
            if (textView7 != null) {
                textView7.setVisibility(0);
            } else {
                p005kotlin.jvm.internal.s.m("mCourseInfo");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/c$a;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
