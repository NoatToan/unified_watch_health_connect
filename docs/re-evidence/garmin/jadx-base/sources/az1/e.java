package az1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexTwoLineEventButton;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import fw.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Laz1/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f13722x = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f13723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zy1.b f13724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f13725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineEventButton f13726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f13727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f13728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f13729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f13730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FragmentContainerView f13731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ConstraintLayout f13732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f13733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f13734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f13735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f13736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f13737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f13738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f13739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f13740r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ConstraintLayout f13741t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f13742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a4.b f13743w;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13745b;

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
            f13744a = iArr;
            int[] iArr2 = new int[zy1.c.values().length];
            try {
                iArr2[zy1.c.ONE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[zy1.c.ONE_EVENT_PAST_EVENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[zy1.c.ONLY_PAST_EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f13745b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"az1/e$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            m activity = e.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13747a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f13747a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f13747a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: az1.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0196e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f13748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f13749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0196e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f13748a = aVar;
            this.f13749b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f13748a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13749b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f13750a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f13750a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        super(R.layout.event_dash_board_fragment);
        this.f13723a = new w1(s0.f105811a.b(zy1.d.class), new d(this), new f(this), new C0196e(null, this));
        this.f13742v = new c();
        this.f13743w = new a4.b(this, 9);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Object context = getContext();
        zy1.b bVar = context instanceof zy1.b ? (zy1.b) context : null;
        this.f13724b = bVar;
        if (bVar != null) {
            bVar.i0(true);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f13742v, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.primary_view);
        viewFindViewById.getClass();
        this.f13726d = (GCMComplexTwoLineEventButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.primary_header_title);
        viewFindViewById2.getClass();
        this.f13729g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.primary_action_button);
        viewFindViewById3.getClass();
        this.f13730h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.primary_event_header);
        viewFindViewById4.getClass();
        this.f13725c = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.upcoming_view_layout);
        viewFindViewById5.getClass();
        this.f13731i = (FragmentContainerView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.event_stats_view);
        viewFindViewById6.getClass();
        this.f13732j = (ConstraintLayout) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.lbl_countDown);
        viewFindViewById7.getClass();
        this.f13733k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.txt_countdown_value);
        viewFindViewById8.getClass();
        this.f13734l = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.lbl_weather);
        viewFindViewById9.getClass();
        this.f13735m = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.txt_weather_value);
        viewFindViewById10.getClass();
        this.f13736n = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.lbl_goal_pace);
        viewFindViewById11.getClass();
        this.f13737o = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.txt_goal_pace_value);
        viewFindViewById12.getClass();
        this.f13738p = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.lbl_goal_time);
        viewFindViewById13.getClass();
        this.f13739q = (TextView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.txt_goal_time_value);
        viewFindViewById14.getClass();
        this.f13740r = (TextView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.no_upcoming_events_view);
        viewFindViewById15.getClass();
        this.f13741t = (ConstraintLayout) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.add_event_view);
        viewFindViewById16.getClass();
        this.f13727e = viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.past_events_view);
        viewFindViewById17.getClass();
        this.f13728f = (GCMComplexOneLineButton) viewFindViewById17;
        View view3 = this.f13727e;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("addEventView");
            throw null;
        }
        final int i14 = 0;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: az1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f13721b;

            {
                this.f13721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i15 = i14;
                e eVar = this.f13721b;
                switch (i15) {
                    case 0:
                        zy1.b bVar2 = eVar.f13724b;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) TrainingInitiativeEventActivity.class);
                            intent.putExtra("extra.date.time", new DateTime());
                            intent.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intent);
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f13722x;
                        zy1.d dVar = (zy1.d) eVar.f13723a.getValue();
                        dg0.a aVar3 = dg0.a.PRIMARY_EVENT;
                        aVar3.getClass();
                        dVar.I = aVar3;
                        dVar.a5().m("EventDashBoardPriorityListFragment");
                        break;
                    case 2:
                        e.a aVar4 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                    case 3:
                        zy1.b bVar3 = eVar.f13724b;
                        if (bVar3 != null) {
                            TrainingInitiativeEventActivity.a aVar5 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar5.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext2);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar3.N7(intentA);
                        }
                        break;
                    case 4:
                        zy1.b bVar4 = eVar.f13724b;
                        if (bVar4 != null) {
                            TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext3 = eVar.requireContext();
                            contextRequireContext3.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar6.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext3);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar4.N7(intentA2);
                        }
                        break;
                    default:
                        e.a aVar7 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                }
            }
        });
        TextView textView = this.f13730h;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("primaryEventChangeButton");
            throw null;
        }
        final int i15 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: az1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f13721b;

            {
                this.f13721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i16 = i15;
                e eVar = this.f13721b;
                switch (i16) {
                    case 0:
                        zy1.b bVar2 = eVar.f13724b;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) TrainingInitiativeEventActivity.class);
                            intent.putExtra("extra.date.time", new DateTime());
                            intent.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intent);
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f13722x;
                        zy1.d dVar = (zy1.d) eVar.f13723a.getValue();
                        dg0.a aVar3 = dg0.a.PRIMARY_EVENT;
                        aVar3.getClass();
                        dVar.I = aVar3;
                        dVar.a5().m("EventDashBoardPriorityListFragment");
                        break;
                    case 2:
                        e.a aVar4 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                    case 3:
                        zy1.b bVar3 = eVar.f13724b;
                        if (bVar3 != null) {
                            TrainingInitiativeEventActivity.a aVar5 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar5.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext2);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar3.N7(intentA);
                        }
                        break;
                    case 4:
                        zy1.b bVar4 = eVar.f13724b;
                        if (bVar4 != null) {
                            TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext3 = eVar.requireContext();
                            contextRequireContext3.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar6.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext3);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar4.N7(intentA2);
                        }
                        break;
                    default:
                        e.a aVar7 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                }
            }
        });
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f13728f;
        if (gCMComplexOneLineButton == null) {
            p005kotlin.jvm.internal.s.m("pastEventsView");
            throw null;
        }
        final int i16 = 2;
        gCMComplexOneLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: az1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f13721b;

            {
                this.f13721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i17 = i16;
                e eVar = this.f13721b;
                switch (i17) {
                    case 0:
                        zy1.b bVar2 = eVar.f13724b;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) TrainingInitiativeEventActivity.class);
                            intent.putExtra("extra.date.time", new DateTime());
                            intent.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intent);
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f13722x;
                        zy1.d dVar = (zy1.d) eVar.f13723a.getValue();
                        dg0.a aVar3 = dg0.a.PRIMARY_EVENT;
                        aVar3.getClass();
                        dVar.I = aVar3;
                        dVar.a5().m("EventDashBoardPriorityListFragment");
                        break;
                    case 2:
                        e.a aVar4 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                    case 3:
                        zy1.b bVar3 = eVar.f13724b;
                        if (bVar3 != null) {
                            TrainingInitiativeEventActivity.a aVar5 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar5.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext2);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar3.N7(intentA);
                        }
                        break;
                    case 4:
                        zy1.b bVar4 = eVar.f13724b;
                        if (bVar4 != null) {
                            TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext3 = eVar.requireContext();
                            contextRequireContext3.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar6.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext3);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar4.N7(intentA2);
                        }
                        break;
                    default:
                        e.a aVar7 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                }
            }
        });
        final int i17 = 3;
        ((AppCompatButton) view2.findViewById(R.id.btn_find_event)).setOnClickListener(new View.OnClickListener(this) { // from class: az1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f13721b;

            {
                this.f13721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i18 = i17;
                e eVar = this.f13721b;
                switch (i18) {
                    case 0:
                        zy1.b bVar2 = eVar.f13724b;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) TrainingInitiativeEventActivity.class);
                            intent.putExtra("extra.date.time", new DateTime());
                            intent.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intent);
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f13722x;
                        zy1.d dVar = (zy1.d) eVar.f13723a.getValue();
                        dg0.a aVar3 = dg0.a.PRIMARY_EVENT;
                        aVar3.getClass();
                        dVar.I = aVar3;
                        dVar.a5().m("EventDashBoardPriorityListFragment");
                        break;
                    case 2:
                        e.a aVar4 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                    case 3:
                        zy1.b bVar3 = eVar.f13724b;
                        if (bVar3 != null) {
                            TrainingInitiativeEventActivity.a aVar5 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar5.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext2);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar3.N7(intentA);
                        }
                        break;
                    case 4:
                        zy1.b bVar4 = eVar.f13724b;
                        if (bVar4 != null) {
                            TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext3 = eVar.requireContext();
                            contextRequireContext3.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar6.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext3);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar4.N7(intentA2);
                        }
                        break;
                    default:
                        e.a aVar7 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                }
            }
        });
        final int i18 = 4;
        ((AppCompatButton) view2.findViewById(R.id.btn_create_event)).setOnClickListener(new View.OnClickListener(this) { // from class: az1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f13721b;

            {
                this.f13721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i19 = i18;
                e eVar = this.f13721b;
                switch (i19) {
                    case 0:
                        zy1.b bVar2 = eVar.f13724b;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) TrainingInitiativeEventActivity.class);
                            intent.putExtra("extra.date.time", new DateTime());
                            intent.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intent);
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f13722x;
                        zy1.d dVar = (zy1.d) eVar.f13723a.getValue();
                        dg0.a aVar3 = dg0.a.PRIMARY_EVENT;
                        aVar3.getClass();
                        dVar.I = aVar3;
                        dVar.a5().m("EventDashBoardPriorityListFragment");
                        break;
                    case 2:
                        e.a aVar4 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                    case 3:
                        zy1.b bVar3 = eVar.f13724b;
                        if (bVar3 != null) {
                            TrainingInitiativeEventActivity.a aVar5 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar5.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext2);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar3.N7(intentA);
                        }
                        break;
                    case 4:
                        zy1.b bVar4 = eVar.f13724b;
                        if (bVar4 != null) {
                            TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext3 = eVar.requireContext();
                            contextRequireContext3.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar6.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext3);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar4.N7(intentA2);
                        }
                        break;
                    default:
                        e.a aVar7 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                }
            }
        });
        final int i19 = 5;
        ((GCMComplexOneLineButton) view2.findViewById(R.id.past_events)).setOnClickListener(new View.OnClickListener(this) { // from class: az1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f13721b;

            {
                this.f13721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                int i110 = i19;
                e eVar = this.f13721b;
                switch (i110) {
                    case 0:
                        zy1.b bVar2 = eVar.f13724b;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = eVar.requireContext();
                            contextRequireContext.getClass();
                            aVar.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) TrainingInitiativeEventActivity.class);
                            intent.putExtra("extra.date.time", new DateTime());
                            intent.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intent);
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f13722x;
                        zy1.d dVar = (zy1.d) eVar.f13723a.getValue();
                        dg0.a aVar3 = dg0.a.PRIMARY_EVENT;
                        aVar3.getClass();
                        dVar.I = aVar3;
                        dVar.a5().m("EventDashBoardPriorityListFragment");
                        break;
                    case 2:
                        e.a aVar4 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                    case 3:
                        zy1.b bVar3 = eVar.f13724b;
                        if (bVar3 != null) {
                            TrainingInitiativeEventActivity.a aVar5 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = eVar.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar5.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext2);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar3.N7(intentA);
                        }
                        break;
                    case 4:
                        zy1.b bVar4 = eVar.f13724b;
                        if (bVar4 != null) {
                            TrainingInitiativeEventActivity.a aVar6 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext3 = eVar.requireContext();
                            contextRequireContext3.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar6.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext3);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar4.N7(intentA2);
                        }
                        break;
                    default:
                        e.a aVar7 = e.f13722x;
                        ((zy1.d) eVar.f13723a.getValue()).a5().m("EventListFragment");
                        break;
                }
            }
        });
        ((zy1.d) this.f13723a.getValue()).f207469k0.f(getViewLifecycleOwner(), this.f13743w);
    }

    public final void u6(boolean z14) {
        TextView textView = this.f13729g;
        if (z14) {
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("primaryHeaderTitle");
                throw null;
            }
            textView.setText(R.string.upcoming_event);
            TextView textView2 = this.f13729g;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("primaryHeaderTitle");
                throw null;
            }
            textView2.setTextAppearance(2132149061);
            TextView textView3 = this.f13729g;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("primaryHeaderTitle");
                throw null;
            }
            textView3.setAllCaps(false);
            TextView textView4 = this.f13730h;
            if (textView4 != null) {
                textView4.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("primaryEventChangeButton");
                throw null;
            }
        }
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("primaryHeaderTitle");
            throw null;
        }
        textView.setText(R.string.primary_event);
        TextView textView5 = this.f13729g;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("primaryHeaderTitle");
            throw null;
        }
        textView5.setTextAppearance(R.style.Text_Overline_Secondary);
        TextView textView6 = this.f13729g;
        if (textView6 == null) {
            p005kotlin.jvm.internal.s.m("primaryHeaderTitle");
            throw null;
        }
        textView6.setAllCaps(true);
        TextView textView7 = this.f13730h;
        if (textView7 != null) {
            textView7.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("primaryEventChangeButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Laz1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INT_FORECAST_DAYS", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
