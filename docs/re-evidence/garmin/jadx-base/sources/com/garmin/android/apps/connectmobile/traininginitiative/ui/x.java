package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.RobotTextViewChangeColorOnDisable;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import lc.u0;
import mz1.e0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import ty1.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/x;", "Landroidx/fragment/app/Fragment;", "Luy1/i$a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends Fragment implements uy1.i.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f46310w = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ry1.a f46311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f46312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RobotTextViewChangeColorOnDisable f46313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f46314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f46315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f46316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f46317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f46318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public uy1.i f46319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f46320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f46321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ConstraintLayout f46322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f46323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f46324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AppCompatButton f46325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Toolbar f46326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActivityListItemDTO f46327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f46328r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fg0.k f46329t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f46330v;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46334d;

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
            f46331a = iArr;
            int[] iArr2 = new int[ny1.a.values().length];
            try {
                iArr2[ny1.a.LINKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ny1.a.UN_LINKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f46332b = iArr2;
            int[] iArr3 = new int[p2.values().length];
            try {
                iArr3[p2.NO_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[p2.ACTIVITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f46333c = iArr3;
            int[] iArr4 = new int[ty1.f.values().length];
            try {
                iArr4[ty1.f.LOAD_ACTIVITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ty1.f.LINK_ACTIVITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f46334d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/x$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = x.f46310w;
            x xVar = x.this;
            xVar.f46330v.f(false);
            xVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46336a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46336a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46336a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46336a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46337a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46337a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46338a = aVar;
            this.f46339b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46338a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46339b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46340a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46340a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46340a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public x() {
        super(R.layout.ti_link_activities_fragment);
        this.f46312b = new w1(s0.f105811a.b(e0.class), new e(this), new g(this), new f(null, this));
        this.f46330v = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            EventDetailsActivity.f45692o.getClass();
            EventDetailsActivity eventDetailsActivity = EventDetailsActivity.f45693p;
            if (eventDetailsActivity == null) {
                p005kotlin.jvm.internal.s.m("instance");
                throw null;
            }
            eventDetailsActivity.hideActionBar();
            this.f46311a = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TILinkActivitiesFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        EventDetailsActivity.f45692o.getClass();
        EventDetailsActivity eventDetailsActivity = EventDetailsActivity.f45693p;
        if (eventDetailsActivity != null) {
            eventDetailsActivity.showActionBar();
        } else {
            p005kotlin.jvm.internal.s.m("instance");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u6().j5();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        String strA;
        gg0.f eventType;
        gg0.f eventType2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46311a;
        final int i14 = 2;
        if (aVar != null) {
            String string2 = getString(R.string.add_event);
            string2.getClass();
            aVar.g(2, string2);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46330v, viewLifecycleOwner);
        this.f46329t = u6().k5().d();
        View viewFindViewById = view2.findViewById(R.id.title_text_view);
        viewFindViewById.getClass();
        this.f46315e = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.title_layout1);
        viewFindViewById2.getClass();
        this.f46321k = (RelativeLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.title_layout2);
        viewFindViewById3.getClass();
        this.f46322l = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.title_text_view2);
        viewFindViewById4.getClass();
        this.f46316f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.text_view_cancel);
        viewFindViewById5.getClass();
        this.f46314d = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.text_view_save);
        viewFindViewById6.getClass();
        this.f46313c = (RobotTextViewChangeColorOnDisable) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.recycler_view);
        viewFindViewById7.getClass();
        this.f46317g = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.view_all_activities);
        viewFindViewById8.getClass();
        this.f46318h = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.toolbar_Layout);
        viewFindViewById9.getClass();
        View viewFindViewById10 = view2.findViewById(R.id.toolbar_actionbar_default);
        viewFindViewById10.getClass();
        this.f46326p = (Toolbar) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.activity_container);
        viewFindViewById11.getClass();
        this.f46320j = (LinearLayout) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.no_activity_container);
        viewFindViewById12.getClass();
        this.f46323m = (RelativeLayout) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.desc_no_activities);
        viewFindViewById13.getClass();
        this.f46324n = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.no_activities_view_all);
        viewFindViewById14.getClass();
        this.f46325o = (AppCompatButton) viewFindViewById14;
        TextView textView = this.f46324n;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mNoActivitiesDescView");
            throw null;
        }
        textView.setText(getString(R.string.no_activities_to_link));
        RecyclerView recyclerView = this.f46317g;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("mRecyclerView");
            throw null;
        }
        final int i15 = 1;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f46317g;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("mRecyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        uy1.i iVar = new uy1.i(contextRequireContext, this);
        this.f46319i = iVar;
        RecyclerView recyclerView3 = this.f46317g;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("mRecyclerView");
            throw null;
        }
        recyclerView3.setAdapter(iVar);
        TextView textView2 = this.f46315e;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mTitleView");
            throw null;
        }
        fg0.k kVar = this.f46329t;
        if (kVar == null || (eventType2 = kVar.getEventType()) == null) {
            string = null;
        } else {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            string = getString(R.string.event_activity_type, eventType2.a(contextRequireContext2));
        }
        textView2.setText(string);
        TextView textView3 = this.f46324n;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("mNoActivitiesDescView");
            throw null;
        }
        fg0.k kVarD = u6().k5().d();
        if (kVarD == null || (eventType = kVarD.getEventType()) == null) {
            strA = null;
        } else {
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            strA = eventType.a(contextRequireContext3);
        }
        textView3.setText(getString(R.string.no_activities_to_link, strA));
        Toolbar toolbar = this.f46326p;
        if (toolbar == null) {
            p005kotlin.jvm.internal.s.m("mToolBar");
            throw null;
        }
        tn.k kVar2 = new tn.k(11);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(toolbar, kVar2);
        RobotTextViewChangeColorOnDisable robotTextViewChangeColorOnDisable = this.f46313c;
        if (robotTextViewChangeColorOnDisable == null) {
            p005kotlin.jvm.internal.s.m("mSaveView");
            throw null;
        }
        final int i16 = 0;
        robotTextViewChangeColorOnDisable.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167184b;

            {
                this.f167184b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0072  */
            /* JADX WARN: Code duplicated, block: B:27:0x0086  */
            /* JADX WARN: Code duplicated, block: B:39:0x010c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ActivityListItemDTO activityListItemDTO;
                fg0.j eventCustomization;
                Long associatedWithActivityId;
                ActivityListItemDTO activityListItemDTO2;
                int i17 = i16;
                int i18 = 6;
                Unit unit = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167184b;
                switch (i17) {
                    case 0:
                        fg0.k kVar3 = xVar.f46329t;
                        if (kVar3 != null && (activityListItemDTO = xVar.f46327q) != null) {
                            int i19 = 1;
                            if (activityListItemDTO.K1 != 0) {
                                Long l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                long j8 = activityListItemDTO.K1;
                                if (l14 == null || l14.longValue() != j8) {
                                    String string3 = xVar.getString(R.string.activity_already_linked);
                                    string3.getClass();
                                    String string4 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string4.getClass();
                                    o13.p pVar = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar2 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i19));
                                    c22.f fVar = c22.f.f23050a;
                                    Context contextRequireContext4 = xVar.requireContext();
                                    contextRequireContext4.getClass();
                                    fVar.getClass();
                                    androidx.appcompat.app.e eVarB = c22.f.b(contextRequireContext4, string3, string4, pVar2, pVar, null, false);
                                    eVarB.setOnShowListener(new c22.e(xVar, i18));
                                    eVarB.show();
                                    unit = Unit.INSTANCE;
                                } else if (g22.n.d(activityListItemDTO.L1) || p005kotlin.jvm.internal.s.g(kVar3.getShareableEventUuid(), activityListItemDTO.L1)) {
                                    eventCustomization = kVar3.getEventCustomization();
                                    if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null) {
                                        long jLongValue = associatedWithActivityId.longValue();
                                        activityListItemDTO2 = xVar.f46327q;
                                        if (activityListItemDTO2 == null && jLongValue == activityListItemDTO2.f29250b && p005kotlin.jvm.internal.s.g(xVar.f46328r, Boolean.FALSE)) {
                                            xVar.u6().B5(activityListItemDTO.f29250b, true);
                                        } else {
                                            xVar.u6().B5(activityListItemDTO.f29250b, false);
                                        }
                                        unit = Unit.INSTANCE;
                                    }
                                } else {
                                    String string5 = xVar.getString(R.string.activity_already_linked);
                                    string5.getClass();
                                    String string6 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string6.getClass();
                                    o13.p pVar3 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar4 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i19));
                                    c22.f fVar2 = c22.f.f23050a;
                                    Context contextRequireContext5 = xVar.requireContext();
                                    contextRequireContext5.getClass();
                                    fVar2.getClass();
                                    androidx.appcompat.app.e eVarB2 = c22.f.b(contextRequireContext5, string5, string6, pVar4, pVar3, null, false);
                                    eVarB2.setOnShowListener(new c22.e(xVar, i18));
                                    eVarB2.show();
                                    unit = Unit.INSTANCE;
                                }
                            } else {
                                if (g22.n.d(activityListItemDTO.L1)) {
                                }
                                eventCustomization = kVar3.getEventCustomization();
                                if (eventCustomization != null) {
                                    long jLongValue2 = associatedWithActivityId.longValue();
                                    activityListItemDTO2 = xVar.f46327q;
                                    if (activityListItemDTO2 == null) {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    } else {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    }
                                    unit = Unit.INSTANCE;
                                }
                            }
                            if (unit == null) {
                                xVar.u6().B5(activityListItemDTO.f29250b, false);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity = xVar.requireActivity();
                        mVarRequireActivity.getClass();
                        bVar.t(mVarRequireActivity);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar2 = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity2 = xVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.t(mVarRequireActivity2);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        TextView textView4 = this.f46314d;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("mCancelView");
            throw null;
        }
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167184b;

            {
                this.f167184b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0072  */
            /* JADX WARN: Code duplicated, block: B:27:0x0086  */
            /* JADX WARN: Code duplicated, block: B:39:0x010c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ActivityListItemDTO activityListItemDTO;
                fg0.j eventCustomization;
                Long associatedWithActivityId;
                ActivityListItemDTO activityListItemDTO2;
                int i17 = i15;
                int i18 = 6;
                Unit unit = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167184b;
                switch (i17) {
                    case 0:
                        fg0.k kVar3 = xVar.f46329t;
                        if (kVar3 != null && (activityListItemDTO = xVar.f46327q) != null) {
                            int i19 = 1;
                            if (activityListItemDTO.K1 != 0) {
                                Long l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                long j8 = activityListItemDTO.K1;
                                if (l14 == null || l14.longValue() != j8) {
                                    String string5 = xVar.getString(R.string.activity_already_linked);
                                    string5.getClass();
                                    String string6 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string6.getClass();
                                    o13.p pVar3 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar4 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i19));
                                    c22.f fVar2 = c22.f.f23050a;
                                    Context contextRequireContext5 = xVar.requireContext();
                                    contextRequireContext5.getClass();
                                    fVar2.getClass();
                                    androidx.appcompat.app.e eVarB2 = c22.f.b(contextRequireContext5, string5, string6, pVar4, pVar3, null, false);
                                    eVarB2.setOnShowListener(new c22.e(xVar, i18));
                                    eVarB2.show();
                                    unit = Unit.INSTANCE;
                                } else if (g22.n.d(activityListItemDTO.L1) || p005kotlin.jvm.internal.s.g(kVar3.getShareableEventUuid(), activityListItemDTO.L1)) {
                                    eventCustomization = kVar3.getEventCustomization();
                                    if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null) {
                                        long jLongValue2 = associatedWithActivityId.longValue();
                                        activityListItemDTO2 = xVar.f46327q;
                                        if (activityListItemDTO2 == null && jLongValue2 == activityListItemDTO2.f29250b && p005kotlin.jvm.internal.s.g(xVar.f46328r, Boolean.FALSE)) {
                                            xVar.u6().B5(activityListItemDTO.f29250b, true);
                                        } else {
                                            xVar.u6().B5(activityListItemDTO.f29250b, false);
                                        }
                                        unit = Unit.INSTANCE;
                                    }
                                } else {
                                    String string7 = xVar.getString(R.string.activity_already_linked);
                                    string7.getClass();
                                    String string8 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string8.getClass();
                                    o13.p pVar5 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar6 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i19));
                                    c22.f fVar3 = c22.f.f23050a;
                                    Context contextRequireContext6 = xVar.requireContext();
                                    contextRequireContext6.getClass();
                                    fVar3.getClass();
                                    androidx.appcompat.app.e eVarB3 = c22.f.b(contextRequireContext6, string7, string8, pVar6, pVar5, null, false);
                                    eVarB3.setOnShowListener(new c22.e(xVar, i18));
                                    eVarB3.show();
                                    unit = Unit.INSTANCE;
                                }
                            } else {
                                if (g22.n.d(activityListItemDTO.L1)) {
                                }
                                eventCustomization = kVar3.getEventCustomization();
                                if (eventCustomization != null) {
                                    long jLongValue3 = associatedWithActivityId.longValue();
                                    activityListItemDTO2 = xVar.f46327q;
                                    if (activityListItemDTO2 == null) {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    } else {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    }
                                    unit = Unit.INSTANCE;
                                }
                            }
                            if (unit == null) {
                                xVar.u6().B5(activityListItemDTO.f29250b, false);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity = xVar.requireActivity();
                        mVarRequireActivity.getClass();
                        bVar.t(mVarRequireActivity);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar2 = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity2 = xVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.t(mVarRequireActivity2);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        TextView textView5 = this.f46318h;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("mViewAllActivitiesView");
            throw null;
        }
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167184b;

            {
                this.f167184b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0072  */
            /* JADX WARN: Code duplicated, block: B:27:0x0086  */
            /* JADX WARN: Code duplicated, block: B:39:0x010c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ActivityListItemDTO activityListItemDTO;
                fg0.j eventCustomization;
                Long associatedWithActivityId;
                ActivityListItemDTO activityListItemDTO2;
                int i17 = i14;
                int i18 = 6;
                Unit unit = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167184b;
                switch (i17) {
                    case 0:
                        fg0.k kVar3 = xVar.f46329t;
                        if (kVar3 != null && (activityListItemDTO = xVar.f46327q) != null) {
                            int i19 = 1;
                            if (activityListItemDTO.K1 != 0) {
                                Long l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                long j8 = activityListItemDTO.K1;
                                if (l14 == null || l14.longValue() != j8) {
                                    String string7 = xVar.getString(R.string.activity_already_linked);
                                    string7.getClass();
                                    String string8 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string8.getClass();
                                    o13.p pVar5 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar6 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i19));
                                    c22.f fVar3 = c22.f.f23050a;
                                    Context contextRequireContext6 = xVar.requireContext();
                                    contextRequireContext6.getClass();
                                    fVar3.getClass();
                                    androidx.appcompat.app.e eVarB3 = c22.f.b(contextRequireContext6, string7, string8, pVar6, pVar5, null, false);
                                    eVarB3.setOnShowListener(new c22.e(xVar, i18));
                                    eVarB3.show();
                                    unit = Unit.INSTANCE;
                                } else if (g22.n.d(activityListItemDTO.L1) || p005kotlin.jvm.internal.s.g(kVar3.getShareableEventUuid(), activityListItemDTO.L1)) {
                                    eventCustomization = kVar3.getEventCustomization();
                                    if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null) {
                                        long jLongValue3 = associatedWithActivityId.longValue();
                                        activityListItemDTO2 = xVar.f46327q;
                                        if (activityListItemDTO2 == null && jLongValue3 == activityListItemDTO2.f29250b && p005kotlin.jvm.internal.s.g(xVar.f46328r, Boolean.FALSE)) {
                                            xVar.u6().B5(activityListItemDTO.f29250b, true);
                                        } else {
                                            xVar.u6().B5(activityListItemDTO.f29250b, false);
                                        }
                                        unit = Unit.INSTANCE;
                                    }
                                } else {
                                    String string9 = xVar.getString(R.string.activity_already_linked);
                                    string9.getClass();
                                    String string10 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string10.getClass();
                                    o13.p pVar7 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar8 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i19));
                                    c22.f fVar4 = c22.f.f23050a;
                                    Context contextRequireContext7 = xVar.requireContext();
                                    contextRequireContext7.getClass();
                                    fVar4.getClass();
                                    androidx.appcompat.app.e eVarB4 = c22.f.b(contextRequireContext7, string9, string10, pVar8, pVar7, null, false);
                                    eVarB4.setOnShowListener(new c22.e(xVar, i18));
                                    eVarB4.show();
                                    unit = Unit.INSTANCE;
                                }
                            } else {
                                if (g22.n.d(activityListItemDTO.L1)) {
                                }
                                eventCustomization = kVar3.getEventCustomization();
                                if (eventCustomization != null) {
                                    long jLongValue4 = associatedWithActivityId.longValue();
                                    activityListItemDTO2 = xVar.f46327q;
                                    if (activityListItemDTO2 == null) {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    } else {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    }
                                    unit = Unit.INSTANCE;
                                }
                            }
                            if (unit == null) {
                                xVar.u6().B5(activityListItemDTO.f29250b, false);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity = xVar.requireActivity();
                        mVarRequireActivity.getClass();
                        bVar.t(mVarRequireActivity);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar2 = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity2 = xVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.t(mVarRequireActivity2);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        AppCompatButton appCompatButton = this.f46325o;
        if (appCompatButton == null) {
            p005kotlin.jvm.internal.s.m("mNoActivitiesViewAllView");
            throw null;
        }
        final int i17 = 3;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167184b;

            {
                this.f167184b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0072  */
            /* JADX WARN: Code duplicated, block: B:27:0x0086  */
            /* JADX WARN: Code duplicated, block: B:39:0x010c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ActivityListItemDTO activityListItemDTO;
                fg0.j eventCustomization;
                Long associatedWithActivityId;
                ActivityListItemDTO activityListItemDTO2;
                int i18 = i17;
                int i19 = 6;
                Unit unit = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167184b;
                switch (i18) {
                    case 0:
                        fg0.k kVar3 = xVar.f46329t;
                        if (kVar3 != null && (activityListItemDTO = xVar.f46327q) != null) {
                            int i110 = 1;
                            if (activityListItemDTO.K1 != 0) {
                                Long l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                long j8 = activityListItemDTO.K1;
                                if (l14 == null || l14.longValue() != j8) {
                                    String string9 = xVar.getString(R.string.activity_already_linked);
                                    string9.getClass();
                                    String string10 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string10.getClass();
                                    o13.p pVar7 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar8 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i110));
                                    c22.f fVar4 = c22.f.f23050a;
                                    Context contextRequireContext7 = xVar.requireContext();
                                    contextRequireContext7.getClass();
                                    fVar4.getClass();
                                    androidx.appcompat.app.e eVarB4 = c22.f.b(contextRequireContext7, string9, string10, pVar8, pVar7, null, false);
                                    eVarB4.setOnShowListener(new c22.e(xVar, i19));
                                    eVarB4.show();
                                    unit = Unit.INSTANCE;
                                } else if (g22.n.d(activityListItemDTO.L1) || p005kotlin.jvm.internal.s.g(kVar3.getShareableEventUuid(), activityListItemDTO.L1)) {
                                    eventCustomization = kVar3.getEventCustomization();
                                    if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null) {
                                        long jLongValue4 = associatedWithActivityId.longValue();
                                        activityListItemDTO2 = xVar.f46327q;
                                        if (activityListItemDTO2 == null && jLongValue4 == activityListItemDTO2.f29250b && p005kotlin.jvm.internal.s.g(xVar.f46328r, Boolean.FALSE)) {
                                            xVar.u6().B5(activityListItemDTO.f29250b, true);
                                        } else {
                                            xVar.u6().B5(activityListItemDTO.f29250b, false);
                                        }
                                        unit = Unit.INSTANCE;
                                    }
                                } else {
                                    String string11 = xVar.getString(R.string.activity_already_linked);
                                    string11.getClass();
                                    String string12 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string12.getClass();
                                    o13.p pVar9 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar10 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i110));
                                    c22.f fVar5 = c22.f.f23050a;
                                    Context contextRequireContext8 = xVar.requireContext();
                                    contextRequireContext8.getClass();
                                    fVar5.getClass();
                                    androidx.appcompat.app.e eVarB5 = c22.f.b(contextRequireContext8, string11, string12, pVar10, pVar9, null, false);
                                    eVarB5.setOnShowListener(new c22.e(xVar, i19));
                                    eVarB5.show();
                                    unit = Unit.INSTANCE;
                                }
                            } else {
                                if (g22.n.d(activityListItemDTO.L1)) {
                                }
                                eventCustomization = kVar3.getEventCustomization();
                                if (eventCustomization != null) {
                                    long jLongValue5 = associatedWithActivityId.longValue();
                                    activityListItemDTO2 = xVar.f46327q;
                                    if (activityListItemDTO2 == null) {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    } else {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    }
                                    unit = Unit.INSTANCE;
                                }
                            }
                            if (unit == null) {
                                xVar.u6().B5(activityListItemDTO.f29250b, false);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity = xVar.requireActivity();
                        mVarRequireActivity.getClass();
                        bVar.t(mVarRequireActivity);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar2 = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity2 = xVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.t(mVarRequireActivity2);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        Toolbar toolbar2 = this.f46326p;
        if (toolbar2 == null) {
            p005kotlin.jvm.internal.s.m("mToolBar");
            throw null;
        }
        final int i18 = 4;
        toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ty1.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167184b;

            {
                this.f167184b = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0072  */
            /* JADX WARN: Code duplicated, block: B:27:0x0086  */
            /* JADX WARN: Code duplicated, block: B:39:0x010c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ActivityListItemDTO activityListItemDTO;
                fg0.j eventCustomization;
                Long associatedWithActivityId;
                ActivityListItemDTO activityListItemDTO2;
                int i19 = i18;
                int i110 = 6;
                Unit unit = null;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167184b;
                switch (i19) {
                    case 0:
                        fg0.k kVar3 = xVar.f46329t;
                        if (kVar3 != null && (activityListItemDTO = xVar.f46327q) != null) {
                            int i111 = 1;
                            if (activityListItemDTO.K1 != 0) {
                                Long l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                long j8 = activityListItemDTO.K1;
                                if (l14 == null || l14.longValue() != j8) {
                                    String string11 = xVar.getString(R.string.activity_already_linked);
                                    string11.getClass();
                                    String string12 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string12.getClass();
                                    o13.p pVar9 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar10 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i111));
                                    c22.f fVar5 = c22.f.f23050a;
                                    Context contextRequireContext8 = xVar.requireContext();
                                    contextRequireContext8.getClass();
                                    fVar5.getClass();
                                    androidx.appcompat.app.e eVarB5 = c22.f.b(contextRequireContext8, string11, string12, pVar10, pVar9, null, false);
                                    eVarB5.setOnShowListener(new c22.e(xVar, i110));
                                    eVarB5.show();
                                    unit = Unit.INSTANCE;
                                } else if (g22.n.d(activityListItemDTO.L1) || p005kotlin.jvm.internal.s.g(kVar3.getShareableEventUuid(), activityListItemDTO.L1)) {
                                    eventCustomization = kVar3.getEventCustomization();
                                    if (eventCustomization != null && (associatedWithActivityId = eventCustomization.getAssociatedWithActivityId()) != null) {
                                        long jLongValue5 = associatedWithActivityId.longValue();
                                        activityListItemDTO2 = xVar.f46327q;
                                        if (activityListItemDTO2 == null && jLongValue5 == activityListItemDTO2.f29250b && p005kotlin.jvm.internal.s.g(xVar.f46328r, Boolean.FALSE)) {
                                            xVar.u6().B5(activityListItemDTO.f29250b, true);
                                        } else {
                                            xVar.u6().B5(activityListItemDTO.f29250b, false);
                                        }
                                        unit = Unit.INSTANCE;
                                    }
                                } else {
                                    String string13 = xVar.getString(R.string.activity_already_linked);
                                    string13.getClass();
                                    String string14 = xVar.getString(R.string.event_linked_to_other_activity);
                                    string14.getClass();
                                    o13.p pVar11 = new o13.p(xVar.getString(R.string.lbl_cancel), new tu.a(29));
                                    o13.p pVar12 = new o13.p(xVar.getString(R.string.link_actvity), new tr2.o(xVar, i111));
                                    c22.f fVar6 = c22.f.f23050a;
                                    Context contextRequireContext9 = xVar.requireContext();
                                    contextRequireContext9.getClass();
                                    fVar6.getClass();
                                    androidx.appcompat.app.e eVarB6 = c22.f.b(contextRequireContext9, string13, string14, pVar12, pVar11, null, false);
                                    eVarB6.setOnShowListener(new c22.e(xVar, i110));
                                    eVarB6.show();
                                    unit = Unit.INSTANCE;
                                }
                            } else {
                                if (g22.n.d(activityListItemDTO.L1)) {
                                }
                                eventCustomization = kVar3.getEventCustomization();
                                if (eventCustomization != null) {
                                    long jLongValue6 = associatedWithActivityId.longValue();
                                    activityListItemDTO2 = xVar.f46327q;
                                    if (activityListItemDTO2 == null) {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    } else {
                                        xVar.u6().B5(activityListItemDTO.f29250b, false);
                                    }
                                    unit = Unit.INSTANCE;
                                }
                            }
                            if (unit == null) {
                                xVar.u6().B5(activityListItemDTO.f29250b, false);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity = xVar.requireActivity();
                        mVarRequireActivity.getClass();
                        bVar.t(mVarRequireActivity);
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        jy1.b bVar2 = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
                        androidx.fragment.app.m mVarRequireActivity2 = xVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.t(mVarRequireActivity2);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        xVar.f46330v.f(false);
                        xVar.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        ((androidx.lifecycle.s0) u6().f121683e1.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167195b;

            {
                this.f167195b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                fg0.j eventCustomization;
                int i19 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167195b;
                g3 g3Var = (g3) obj;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        int i24 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.b.f46331a[g3Var.f35300a.ordinal()];
                        if (i24 == 1) {
                            g22.e.l(xVar);
                        } else if (i24 == 2) {
                            g22.e.f(xVar);
                            List list = (List) g3Var.f35301b;
                            if (list != null) {
                                if (list.isEmpty()) {
                                    xVar.v6(p2.NO_STATE);
                                } else {
                                    RobotTextViewChangeColorOnDisable robotTextViewChangeColorOnDisable2 = xVar.f46313c;
                                    if (robotTextViewChangeColorOnDisable2 == null) {
                                        p005kotlin.jvm.internal.s.m("mSaveView");
                                        throw null;
                                    }
                                    robotTextViewChangeColorOnDisable2.setEnabled(false);
                                    fg0.k kVar3 = xVar.f46329t;
                                    Long associatedWithActivityId = (kVar3 == null || (eventCustomization = kVar3.getEventCustomization()) == null) ? null : eventCustomization.getAssociatedWithActivityId();
                                    uy1.i iVar2 = xVar.f46319i;
                                    if (iVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("mAdapter");
                                        throw null;
                                    }
                                    ArrayList<ActivityListItemDTO> arrayList = iVar2.f173451g;
                                    arrayList.clear();
                                    iVar2.f173449e = -1;
                                    iVar2.f173450f = associatedWithActivityId;
                                    arrayList.addAll(list);
                                    iVar2.notifyDataSetChanged();
                                }
                            }
                        } else {
                            if (i24 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(xVar);
                            xVar.w6(f.LOAD_ACTIVITIES);
                            xVar.v6(p2.NO_STATE);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        ((androidx.lifecycle.s0) xVar.u6().f121685g1.getValue()).l(xVar);
                        fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                        int i25 = pVar == null ? -1 : com.garmin.android.apps.connectmobile.traininginitiative.ui.x.b.f46331a[pVar.ordinal()];
                        if (i25 == -1) {
                            com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar4.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TILinkActivitiesFragment", "addEventToActivityLiveData: activity status is null");
                        } else if (i25 == 1) {
                            g22.e.l(xVar);
                        } else if (i25 == 2) {
                            mz1.e0 e0VarU6 = xVar.u6();
                            e0VarU6.I1 = 0;
                            e0VarU6.s5().m(null);
                            if (xVar.getActivity() instanceof EventDetailsActivity) {
                                androidx.fragment.app.m activity = xVar.getActivity();
                                activity.getClass();
                                ((EventDetailsActivity) activity).ma();
                            }
                            g22.e.f(xVar);
                            ny1.a aVar5 = (ny1.a) g3Var.f35301b;
                            int i26 = aVar5 == null ? -1 : com.garmin.android.apps.connectmobile.traininginitiative.ui.x.b.f46332b[aVar5.ordinal()];
                            if (i26 == -1) {
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TILinkActivitiesFragment", "addEventToActivityLiveData SUCCESS: activity status is null");
                            } else if (i26 == 1) {
                                ActivityListItemDTO activityListItemDTO = xVar.f46327q;
                                if (activityListItemDTO != null) {
                                    String string3 = xVar.getString(R.string.event_linked_message, activityListItemDTO.f29253c);
                                    string3.getClass();
                                    r22.q0.b bVar = r22.q0.f149800b;
                                    View viewRequireView = xVar.requireView();
                                    viewRequireView.getClass();
                                    r22.q0.b.c(bVar, viewRequireView, string3, null, 12).show();
                                }
                            } else {
                                if (i26 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                ActivityListItemDTO activityListItemDTO2 = xVar.f46327q;
                                if (activityListItemDTO2 != null) {
                                    String string4 = xVar.getString(R.string.event_unlinked_message, activityListItemDTO2.f29253c);
                                    string4.getClass();
                                    r22.q0.b bVar2 = r22.q0.f149800b;
                                    View viewRequireView2 = xVar.requireView();
                                    viewRequireView2.getClass();
                                    r22.q0.b.c(bVar2, viewRequireView2, string4, null, 12).show();
                                }
                            }
                            xVar.requireActivity().onBackPressed();
                        } else {
                            if (i25 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            xVar.w6(f.LINK_ACTIVITIES);
                            g22.e.f(xVar);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((androidx.lifecycle.s0) u6().f121685g1.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167195b;

            {
                this.f167195b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                fg0.j eventCustomization;
                int i19 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167195b;
                g3 g3Var = (g3) obj;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        int i24 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.b.f46331a[g3Var.f35300a.ordinal()];
                        if (i24 == 1) {
                            g22.e.l(xVar);
                        } else if (i24 == 2) {
                            g22.e.f(xVar);
                            List list = (List) g3Var.f35301b;
                            if (list != null) {
                                if (list.isEmpty()) {
                                    xVar.v6(p2.NO_STATE);
                                } else {
                                    RobotTextViewChangeColorOnDisable robotTextViewChangeColorOnDisable2 = xVar.f46313c;
                                    if (robotTextViewChangeColorOnDisable2 == null) {
                                        p005kotlin.jvm.internal.s.m("mSaveView");
                                        throw null;
                                    }
                                    robotTextViewChangeColorOnDisable2.setEnabled(false);
                                    fg0.k kVar3 = xVar.f46329t;
                                    Long associatedWithActivityId = (kVar3 == null || (eventCustomization = kVar3.getEventCustomization()) == null) ? null : eventCustomization.getAssociatedWithActivityId();
                                    uy1.i iVar2 = xVar.f46319i;
                                    if (iVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("mAdapter");
                                        throw null;
                                    }
                                    ArrayList<ActivityListItemDTO> arrayList = iVar2.f173451g;
                                    arrayList.clear();
                                    iVar2.f173449e = -1;
                                    iVar2.f173450f = associatedWithActivityId;
                                    arrayList.addAll(list);
                                    iVar2.notifyDataSetChanged();
                                }
                            }
                        } else {
                            if (i24 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            g22.e.f(xVar);
                            xVar.w6(f.LOAD_ACTIVITIES);
                            xVar.v6(p2.NO_STATE);
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                        ((androidx.lifecycle.s0) xVar.u6().f121685g1.getValue()).l(xVar);
                        fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                        int i25 = pVar == null ? -1 : com.garmin.android.apps.connectmobile.traininginitiative.ui.x.b.f46331a[pVar.ordinal()];
                        if (i25 == -1) {
                            com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar4.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TILinkActivitiesFragment", "addEventToActivityLiveData: activity status is null");
                        } else if (i25 == 1) {
                            g22.e.l(xVar);
                        } else if (i25 == 2) {
                            mz1.e0 e0VarU6 = xVar.u6();
                            e0VarU6.I1 = 0;
                            e0VarU6.s5().m(null);
                            if (xVar.getActivity() instanceof EventDetailsActivity) {
                                androidx.fragment.app.m activity = xVar.getActivity();
                                activity.getClass();
                                ((EventDetailsActivity) activity).ma();
                            }
                            g22.e.f(xVar);
                            ny1.a aVar5 = (ny1.a) g3Var.f35301b;
                            int i26 = aVar5 == null ? -1 : com.garmin.android.apps.connectmobile.traininginitiative.ui.x.b.f46332b[aVar5.ordinal()];
                            if (i26 == -1) {
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TILinkActivitiesFragment", "addEventToActivityLiveData SUCCESS: activity status is null");
                            } else if (i26 == 1) {
                                ActivityListItemDTO activityListItemDTO = xVar.f46327q;
                                if (activityListItemDTO != null) {
                                    String string3 = xVar.getString(R.string.event_linked_message, activityListItemDTO.f29253c);
                                    string3.getClass();
                                    r22.q0.b bVar = r22.q0.f149800b;
                                    View viewRequireView = xVar.requireView();
                                    viewRequireView.getClass();
                                    r22.q0.b.c(bVar, viewRequireView, string3, null, 12).show();
                                }
                            } else {
                                if (i26 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                ActivityListItemDTO activityListItemDTO2 = xVar.f46327q;
                                if (activityListItemDTO2 != null) {
                                    String string4 = xVar.getString(R.string.event_unlinked_message, activityListItemDTO2.f29253c);
                                    string4.getClass();
                                    r22.q0.b bVar2 = r22.q0.f149800b;
                                    View viewRequireView2 = xVar.requireView();
                                    viewRequireView2.getClass();
                                    r22.q0.b.c(bVar2, viewRequireView2, string4, null, 12).show();
                                }
                            }
                            xVar.requireActivity().onBackPressed();
                        } else {
                            if (i25 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            xVar.w6(f.LINK_ACTIVITIES);
                            g22.e.f(xVar);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    @Override // uy1.i.a
    public final void t2(ActivityListItemDTO activityListItemDTO, boolean z14) {
        boolean z15;
        fg0.j eventCustomization;
        RobotTextViewChangeColorOnDisable robotTextViewChangeColorOnDisable = this.f46313c;
        if (robotTextViewChangeColorOnDisable == null) {
            p005kotlin.jvm.internal.s.m("mSaveView");
            throw null;
        }
        fg0.k kVar = this.f46329t;
        Long associatedWithActivityId = (kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? null : eventCustomization.getAssociatedWithActivityId();
        if (associatedWithActivityId != null) {
            z15 = true;
            if (associatedWithActivityId.longValue() != activityListItemDTO.f29250b) {
                uy1.i iVar = this.f46319i;
                if (iVar == null) {
                    p005kotlin.jvm.internal.s.m("mAdapter");
                    throw null;
                }
                if (iVar.f173449e != -1) {
                    z15 = z14;
                }
            } else if (z14) {
                z15 = false;
            }
        } else {
            z15 = z14;
        }
        robotTextViewChangeColorOnDisable.setEnabled(z15);
        this.f46327q = activityListItemDTO;
        this.f46328r = Boolean.valueOf(z14);
    }

    public final e0 u6() {
        return (e0) this.f46312b.getValue();
    }

    public final void v6(p2 p2Var) {
        int i14 = b.f46333c[p2Var.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return;
            }
            if (this.f46319i == null) {
                p005kotlin.jvm.internal.s.m("mAdapter");
                throw null;
            }
            TextView textView = this.f46318h;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("mViewAllActivitiesView");
                throw null;
            }
            textView.setVisibility(0);
            RobotTextViewChangeColorOnDisable robotTextViewChangeColorOnDisable = this.f46313c;
            if (robotTextViewChangeColorOnDisable == null) {
                p005kotlin.jvm.internal.s.m("mSaveView");
                throw null;
            }
            robotTextViewChangeColorOnDisable.setVisibility(0);
            TextView textView2 = this.f46314d;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("mCancelView");
                throw null;
            }
            textView2.setVisibility(0);
            Toolbar toolbar = this.f46326p;
            if (toolbar == null) {
                p005kotlin.jvm.internal.s.m("mToolBar");
                throw null;
            }
            toolbar.setNavigationIcon((Drawable) null);
            TextView textView3 = this.f46315e;
            if (textView3 != null) {
                textView3.setGravity(16);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mTitleView");
                throw null;
            }
        }
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.arrow_left);
        if (drawable != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            og2.k.F(R.color.gcm_icon_primary, contextRequireContext, drawable);
        }
        Toolbar toolbar2 = this.f46326p;
        if (toolbar2 == null) {
            p005kotlin.jvm.internal.s.m("mToolBar");
            throw null;
        }
        toolbar2.setNavigationIcon(drawable);
        LinearLayout linearLayout = this.f46320j;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("mActivitiesContainer");
            throw null;
        }
        linearLayout.setVisibility(8);
        RelativeLayout relativeLayout = this.f46323m;
        if (relativeLayout == null) {
            p005kotlin.jvm.internal.s.m("mNoActivitiesContainer");
            throw null;
        }
        relativeLayout.setVisibility(0);
        RobotTextViewChangeColorOnDisable robotTextViewChangeColorOnDisable2 = this.f46313c;
        if (robotTextViewChangeColorOnDisable2 == null) {
            p005kotlin.jvm.internal.s.m("mSaveView");
            throw null;
        }
        robotTextViewChangeColorOnDisable2.setVisibility(8);
        TextView textView4 = this.f46314d;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("mCancelView");
            throw null;
        }
        textView4.setVisibility(8);
        RelativeLayout relativeLayout2 = this.f46321k;
        if (relativeLayout2 == null) {
            p005kotlin.jvm.internal.s.m("mTitleLayout1");
            throw null;
        }
        relativeLayout2.setVisibility(8);
        ConstraintLayout constraintLayout = this.f46322l;
        if (constraintLayout == null) {
            p005kotlin.jvm.internal.s.m("mTitleLayout2");
            throw null;
        }
        constraintLayout.setVisibility(0);
        TextView textView5 = this.f46316f;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("mTitleView2");
            throw null;
        }
        TextView textView6 = this.f46315e;
        if (textView6 != null) {
            textView5.setText(textView6.getText());
        } else {
            p005kotlin.jvm.internal.s.m("mTitleView");
            throw null;
        }
    }

    public final void w6(ty1.f fVar) {
        if (u6().I1 < 3) {
            int i14 = b.f46334d[fVar.ordinal()];
            if (i14 == 1) {
                final int i15 = 0;
                y6(R.string.activities_did_not_load, R.string.msg_sorry_something_went_wrong, new e23.a(this) { // from class: ty1.o1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167202b;

                    {
                        this.f167202b = this;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i16 = i15;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167202b;
                        switch (i16) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                                xVar.u6().I1++;
                                xVar.u6().j5();
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                                xVar.u6().I1++;
                                ActivityListItemDTO activityListItemDTO = xVar.f46327q;
                                if (activityListItemDTO != null) {
                                    xVar.u6().B5(activityListItemDTO.f29250b, false);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, false);
                return;
            } else if (i14 != 2) {
                u0.r();
                return;
            } else {
                final int i16 = 1;
                y6(R.string.activity_did_not_link, R.string.msg_sorry_something_went_wrong, new e23.a(this) { // from class: ty1.o1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.x f167202b;

                    {
                        this.f167202b = this;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i17 = i16;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = this.f167202b;
                        switch (i17) {
                            case 0:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                                xVar.u6().I1++;
                                xVar.u6().j5();
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                                xVar.u6().I1++;
                                ActivityListItemDTO activityListItemDTO = xVar.f46327q;
                                if (activityListItemDTO != null) {
                                    xVar.u6().B5(activityListItemDTO.f29250b, false);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, false);
                return;
            }
        }
        if (u6().I1 == 3) {
            u6().I1 = 0;
            int i17 = b.f46334d[fVar.ordinal()];
            if (i17 == 1) {
                y6(R.string.unable_to_load_activities, R.string.come_back_try_again_later, null, true);
            } else if (i17 == 2) {
                y6(R.string.unable_to_link_activity, R.string.come_back_try_again_later, null, true);
            } else {
                u0.r();
            }
        }
    }

    public final void y6(int i14, int i15, e23.a aVar, boolean z14) {
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(requireContext());
        aVar2.setTitle(i14);
        aVar2.setMessage(i15);
        aVar2.setPositiveButton(z14 ? R.string.lbl_ok : R.string.lbl_retry, new c32.a(aVar, 8));
        if (!z14) {
            aVar2.setNegativeButton(R.string.lbl_cancel, new ty1.o(5));
        }
        aVar2.create().show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
