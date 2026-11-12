package com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import az1.i;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.fragments.EventListFragment;
import fg0.k;
import fw.p;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/dashboard/fragments/EventListFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventListFragment extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f45910l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zy1.b f45911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f45912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f45913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f45914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f45916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f45918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f45919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f45920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f45921k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45922a;

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
            f45922a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/dashboard/fragments/EventListFragment$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            EventListFragment eventListFragment = EventListFragment.this;
            eventListFragment.f45918h.f(false);
            eventListFragment.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f45924a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45924a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45925a = aVar;
            this.f45926b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45925a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45926b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f45927a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45927a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [az1.i] */
    /* JADX WARN: Type inference failed for: r0v5, types: [az1.i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [az1.i] */
    public EventListFragment() {
        super(R.layout.event_dash_board_upcoming_events_layout);
        this.f45912b = new w1(s0.f105811a.b(zy1.d.class), new d(this), new f(this), new e(null, this));
        this.f45918h = new c();
        final int i14 = 0;
        this.f45919i = new z0(this) { // from class: az1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventListFragment f13775b;

            {
                this.f13775b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                EventListFragment eventListFragment = this.f13775b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        EventListFragment.a aVar = EventListFragment.f45910l;
                        g3Var.getClass();
                        int i16 = EventListFragment.b.f45922a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            g22.e.l(eventListFragment);
                            return;
                        }
                        if (i16 != 2) {
                            if (i16 != 3) {
                                u0.r();
                                return;
                            } else {
                                g22.e.f(eventListFragment);
                                g22.e.a(eventListFragment, null);
                                return;
                            }
                        }
                        g22.e.f(eventListFragment);
                        bz1.c cVar = (bz1.c) g3Var.f35301b;
                        if (cVar == null) {
                            g22.e.a(eventListFragment, null);
                            return;
                        }
                        List<fg0.k> list = cVar.f22295a;
                        List<fg0.k> list2 = cVar.f22296b;
                        LinearLayout linearLayout = eventListFragment.f45914d;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("upcomingEventsHeader");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        RecyclerView recyclerView = eventListFragment.f45913c;
                        if (recyclerView == null) {
                            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                            throw null;
                        }
                        recyclerView.setVisibility(0);
                        boolean z14 = eventListFragment.f45917g;
                        TextView textView = eventListFragment.f45916f;
                        if (z14) {
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("editPriorityTextView");
                                throw null;
                            }
                            textView.setVisibility(8);
                            zy1.b bVar = eventListFragment.f45911a;
                            if (bVar != null) {
                                String string = eventListFragment.getString(R.string.past_events);
                                string.getClass();
                                bVar.g(2, string);
                            }
                            if (list2 == null || list2.isEmpty()) {
                                return;
                            }
                            String string2 = eventListFragment.getString(R.string.past_events);
                            string2.getClass();
                            eventListFragment.u6(string2, list2);
                            return;
                        }
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("editPriorityTextView");
                            throw null;
                        }
                        textView.setVisibility(0);
                        zy1.b bVar2 = eventListFragment.f45911a;
                        if (bVar2 != null) {
                            String string3 = eventListFragment.getString(R.string.my_events);
                            string3.getClass();
                            bVar2.g(2, string3);
                        }
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        String string4 = eventListFragment.getString(R.string.lbl_upcoming_events);
                        string4.getClass();
                        eventListFragment.u6(string4, list);
                        return;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            EventListFragment.a aVar2 = EventListFragment.f45910l;
                            return;
                        }
                        if (eventListFragment.f45917g) {
                            return;
                        }
                        RecyclerView recyclerView2 = eventListFragment.f45913c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                            throw null;
                        }
                        RecyclerView.h adapter = recyclerView2.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        EventListFragment.a aVar3 = EventListFragment.f45910l;
                        g3Var2.getClass();
                        int i17 = EventListFragment.b.f45922a[g3Var2.f35300a.ordinal()];
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    u0.r();
                                    return;
                                } else {
                                    g22.e.f(eventListFragment);
                                    g22.e.a(eventListFragment, null);
                                    return;
                                }
                            }
                            g22.e.f(eventListFragment);
                            fg0.k kVar = (fg0.k) g3Var2.f35301b;
                            if (kVar != null) {
                                eventListFragment.v6(kVar);
                                return;
                            } else {
                                g22.e.a(eventListFragment, null);
                                return;
                            }
                        }
                        return;
                }
            }
        };
        final int i15 = 1;
        this.f45920j = new z0(this) { // from class: az1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventListFragment f13775b;

            {
                this.f13775b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                EventListFragment eventListFragment = this.f13775b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        EventListFragment.a aVar = EventListFragment.f45910l;
                        g3Var.getClass();
                        int i17 = EventListFragment.b.f45922a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.l(eventListFragment);
                            return;
                        }
                        if (i17 != 2) {
                            if (i17 != 3) {
                                u0.r();
                                return;
                            } else {
                                g22.e.f(eventListFragment);
                                g22.e.a(eventListFragment, null);
                                return;
                            }
                        }
                        g22.e.f(eventListFragment);
                        bz1.c cVar = (bz1.c) g3Var.f35301b;
                        if (cVar == null) {
                            g22.e.a(eventListFragment, null);
                            return;
                        }
                        List<fg0.k> list = cVar.f22295a;
                        List<fg0.k> list2 = cVar.f22296b;
                        LinearLayout linearLayout = eventListFragment.f45914d;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("upcomingEventsHeader");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        RecyclerView recyclerView = eventListFragment.f45913c;
                        if (recyclerView == null) {
                            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                            throw null;
                        }
                        recyclerView.setVisibility(0);
                        boolean z14 = eventListFragment.f45917g;
                        TextView textView = eventListFragment.f45916f;
                        if (z14) {
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("editPriorityTextView");
                                throw null;
                            }
                            textView.setVisibility(8);
                            zy1.b bVar = eventListFragment.f45911a;
                            if (bVar != null) {
                                String string = eventListFragment.getString(R.string.past_events);
                                string.getClass();
                                bVar.g(2, string);
                            }
                            if (list2 == null || list2.isEmpty()) {
                                return;
                            }
                            String string2 = eventListFragment.getString(R.string.past_events);
                            string2.getClass();
                            eventListFragment.u6(string2, list2);
                            return;
                        }
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("editPriorityTextView");
                            throw null;
                        }
                        textView.setVisibility(0);
                        zy1.b bVar2 = eventListFragment.f45911a;
                        if (bVar2 != null) {
                            String string3 = eventListFragment.getString(R.string.my_events);
                            string3.getClass();
                            bVar2.g(2, string3);
                        }
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        String string4 = eventListFragment.getString(R.string.lbl_upcoming_events);
                        string4.getClass();
                        eventListFragment.u6(string4, list);
                        return;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            EventListFragment.a aVar2 = EventListFragment.f45910l;
                            return;
                        }
                        if (eventListFragment.f45917g) {
                            return;
                        }
                        RecyclerView recyclerView2 = eventListFragment.f45913c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                            throw null;
                        }
                        RecyclerView.h adapter = recyclerView2.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        EventListFragment.a aVar3 = EventListFragment.f45910l;
                        g3Var2.getClass();
                        int i18 = EventListFragment.b.f45922a[g3Var2.f35300a.ordinal()];
                        if (i18 != 1) {
                            if (i18 != 2) {
                                if (i18 != 3) {
                                    u0.r();
                                    return;
                                } else {
                                    g22.e.f(eventListFragment);
                                    g22.e.a(eventListFragment, null);
                                    return;
                                }
                            }
                            g22.e.f(eventListFragment);
                            fg0.k kVar = (fg0.k) g3Var2.f35301b;
                            if (kVar != null) {
                                eventListFragment.v6(kVar);
                                return;
                            } else {
                                g22.e.a(eventListFragment, null);
                                return;
                            }
                        }
                        return;
                }
            }
        };
        final int i16 = 2;
        this.f45921k = new z0(this) { // from class: az1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventListFragment f13775b;

            {
                this.f13775b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                EventListFragment eventListFragment = this.f13775b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        EventListFragment.a aVar = EventListFragment.f45910l;
                        g3Var.getClass();
                        int i18 = EventListFragment.b.f45922a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            g22.e.l(eventListFragment);
                            return;
                        }
                        if (i18 != 2) {
                            if (i18 != 3) {
                                u0.r();
                                return;
                            } else {
                                g22.e.f(eventListFragment);
                                g22.e.a(eventListFragment, null);
                                return;
                            }
                        }
                        g22.e.f(eventListFragment);
                        bz1.c cVar = (bz1.c) g3Var.f35301b;
                        if (cVar == null) {
                            g22.e.a(eventListFragment, null);
                            return;
                        }
                        List<fg0.k> list = cVar.f22295a;
                        List<fg0.k> list2 = cVar.f22296b;
                        LinearLayout linearLayout = eventListFragment.f45914d;
                        if (linearLayout == null) {
                            p005kotlin.jvm.internal.s.m("upcomingEventsHeader");
                            throw null;
                        }
                        linearLayout.setVisibility(0);
                        RecyclerView recyclerView = eventListFragment.f45913c;
                        if (recyclerView == null) {
                            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                            throw null;
                        }
                        recyclerView.setVisibility(0);
                        boolean z14 = eventListFragment.f45917g;
                        TextView textView = eventListFragment.f45916f;
                        if (z14) {
                            if (textView == null) {
                                p005kotlin.jvm.internal.s.m("editPriorityTextView");
                                throw null;
                            }
                            textView.setVisibility(8);
                            zy1.b bVar = eventListFragment.f45911a;
                            if (bVar != null) {
                                String string = eventListFragment.getString(R.string.past_events);
                                string.getClass();
                                bVar.g(2, string);
                            }
                            if (list2 == null || list2.isEmpty()) {
                                return;
                            }
                            String string2 = eventListFragment.getString(R.string.past_events);
                            string2.getClass();
                            eventListFragment.u6(string2, list2);
                            return;
                        }
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("editPriorityTextView");
                            throw null;
                        }
                        textView.setVisibility(0);
                        zy1.b bVar2 = eventListFragment.f45911a;
                        if (bVar2 != null) {
                            String string3 = eventListFragment.getString(R.string.my_events);
                            string3.getClass();
                            bVar2.g(2, string3);
                        }
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        String string4 = eventListFragment.getString(R.string.lbl_upcoming_events);
                        string4.getClass();
                        eventListFragment.u6(string4, list);
                        return;
                    case 1:
                        if (!((Boolean) obj).booleanValue()) {
                            EventListFragment.a aVar2 = EventListFragment.f45910l;
                            return;
                        }
                        if (eventListFragment.f45917g) {
                            return;
                        }
                        RecyclerView recyclerView2 = eventListFragment.f45913c;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                            throw null;
                        }
                        RecyclerView.h adapter = recyclerView2.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        EventListFragment.a aVar3 = EventListFragment.f45910l;
                        g3Var2.getClass();
                        int i19 = EventListFragment.b.f45922a[g3Var2.f35300a.ordinal()];
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 != 3) {
                                    u0.r();
                                    return;
                                } else {
                                    g22.e.f(eventListFragment);
                                    g22.e.a(eventListFragment, null);
                                    return;
                                }
                            }
                            g22.e.f(eventListFragment);
                            fg0.k kVar = (fg0.k) g3Var2.f35301b;
                            if (kVar != null) {
                                eventListFragment.v6(kVar);
                                return;
                            } else {
                                g22.e.a(eventListFragment, null);
                                return;
                            }
                        }
                        return;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f45911a = context instanceof zy1.b ? (zy1.b) context : null;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EventListFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f45917g = arguments != null ? arguments.getBoolean("GCM_extra_is_past_events") : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Resources resources;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f45918h, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.recycler_view_events);
        viewFindViewById.getClass();
        this.f45913c = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.upcoming_events_header);
        viewFindViewById2.getClass();
        this.f45914d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.header_text_view);
        viewFindViewById3.getClass();
        this.f45915e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.edit_priority_text_view);
        viewFindViewById4.getClass();
        this.f45916f = (TextView) viewFindViewById4;
        RecyclerView recyclerView = this.f45913c;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f45913c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
            throw null;
        }
        recyclerView2.setNestedScrollingEnabled(this.f45917g);
        if (this.f45917g) {
            Context context = getContext();
            int dimension = (context == null || (resources = context.getResources()) == null) ? 0 : (int) resources.getDimension(R.dimen.spacing_large);
            RecyclerView recyclerView3 = this.f45913c;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                throw null;
            }
            int paddingLeft = recyclerView3.getPaddingLeft();
            RecyclerView recyclerView4 = this.f45913c;
            if (recyclerView4 == null) {
                p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                throw null;
            }
            int paddingTop = recyclerView4.getPaddingTop();
            RecyclerView recyclerView5 = this.f45913c;
            if (recyclerView5 == null) {
                p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                throw null;
            }
            recyclerView3.setPadding(paddingLeft, paddingTop, recyclerView5.getPaddingRight(), dimension);
        }
        TextView textView = this.f45916f;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("editPriorityTextView");
            throw null;
        }
        textView.setOnClickListener(new a32.b(this, 11));
        w1 w1Var = this.f45912b;
        ((zy1.d) w1Var.getValue()).L0.f(getViewLifecycleOwner(), this.f45919i);
        ((zy1.d) w1Var.getValue()).N0.f(getViewLifecycleOwner(), this.f45920j);
        ((zy1.d) w1Var.getValue()).P0.f(getViewLifecycleOwner(), this.f45921k);
    }

    public final void u6(String str, List<k> list) {
        TextView textView = this.f45915e;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("headerTextView");
            throw null;
        }
        textView.setText(str);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        uy1.e eVar = new uy1.e(contextRequireContext, list, this.f45917g);
        eVar.f173410d = this;
        RecyclerView recyclerView = this.f45913c;
        if (recyclerView != null) {
            recyclerView.setAdapter(eVar);
        } else {
            p005kotlin.jvm.internal.s.m("recyclerViewEvents");
            throw null;
        }
    }

    public final void v6(k kVar) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        kVar.getClass();
        if (kVar.getEventType() == gg0.f.f77136l && ((listH = kVar.h()) == null || listH.isEmpty())) {
            zy1.d dVar = (zy1.d) this.f45912b.getValue();
            ge1.b.T(v1.a(dVar), null, null, new zy1.e(dVar, kVar, null), 3);
            return;
        }
        zy1.b bVar = this.f45911a;
        if (bVar != null) {
            EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            aVar.getClass();
            Intent intent = new Intent(contextRequireContext, (Class<?>) EventDetailsActivity.class);
            intent.putExtra("GCM_extra_sharable_event_dto", kVar);
            Intent intentPutExtra = intent.putExtra("navigating_from_event_dashboard", true);
            intentPutExtra.getClass();
            bVar.N7(intentPutExtra);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/dashboard/fragments/EventListFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
