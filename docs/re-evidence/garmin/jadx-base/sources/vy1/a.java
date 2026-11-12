package vy1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.protobuf.DescriptorProtos;
import fg0.k;
import fg0.o;
import fg0.p;
import fg0.u;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import vg1.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lvy1/a;", "Landroidx/fragment/app/Fragment;", "Lwy1/b$a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements wy1.b.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3368a f180785g = new C3368a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f180786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f180787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f180788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f180789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ry1.a f180790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f180791f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vy1/a$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a.this;
            aVar.f180791f.f(false);
            aVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f180793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f180793a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f180793a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f180794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f180795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f180794a = aVar;
            this.f180795b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f180794a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f180795b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f180796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f180796a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f180796a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.ti_event_matching_fragment);
        this.f180786a = new w1(s0.f105811a.b(AddTIEventViewModel.class), new c(this), new e(this), new d(null, this));
        this.f180791f = new b();
    }

    @Override // wy1.b.a
    public final void B3(o oVar) {
        oVar.getClass();
        ht.a.f85464a.getClass();
        ht.a.a(null, "EventMatchingOptionSelected");
        CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
        calendarItemDTO.I1 = true;
        String garminEventUuid = oVar.getGarminEventUuid();
        if (garminEventUuid == null) {
            garminEventUuid = oVar.getEventRef();
        }
        calendarItemDTO.H1 = garminEventUuid;
        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        k kVarU = oVar.u();
        p pVarY = oVar.y();
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF = oVar.f();
        boolean zG = p005kotlin.jvm.internal.s.g(u6().f204393j, Boolean.TRUE);
        boolean z14 = u6().f204395l;
        u uVar = u6().f204397n;
        aVar.getClass();
        requireActivity().startActivityForResult(EventDetailsActivity.a.a(contextRequireContext, calendarItemDTO, kVarU, pVarY, listF, zG, null, z14, uVar), DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f180790e = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIEventMatchingFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        List list;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f180790e;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        ht.a.f85464a.getClass();
        ht.a.a(null, "EventMatchingScreenShown");
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f180791f, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.header_desc);
        viewFindViewById.getClass();
        this.f180787b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.rv_events);
        viewFindViewById2.getClass();
        this.f180788c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.keep_my_event);
        viewFindViewById3.getClass();
        this.f180789d = (Button) viewFindViewById3;
        RecyclerView recyclerView = this.f180788c;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Button button = this.f180789d;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("btnKeepMyEvent");
            throw null;
        }
        button.setOnClickListener(new z0(this, 6));
        TextView textView = this.f180787b;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("titleDescription");
            throw null;
        }
        textView.setText(getString(R.string.matching_events_message, u6().x5().d()));
        g3 g3Var = (g3) ((y0) u6().f46406e2.getValue()).d();
        if (g3Var == null || (list = (List) g3Var.f35301b) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        wy1.b bVar = new wy1.b(contextRequireContext, list);
        bVar.f188057c = this;
        RecyclerView recyclerView2 = this.f180788c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar);
        } else {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
    }

    public final AddTIEventViewModel u6() {
        return (AddTIEventViewModel) this.f180786a.getValue();
    }

    /* JADX INFO: renamed from: vy1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3368a {
        public /* synthetic */ C3368a(j jVar) {
            this();
        }

        private C3368a() {
        }
    }
}
