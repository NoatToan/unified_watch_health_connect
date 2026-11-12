package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/b0;", "Landroidx/fragment/app/Fragment;", "Lwy1/c$a;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends Fragment implements wy1.c.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45848e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f45850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f45851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f45852d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45853a;

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
            f45853a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45854a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f45854a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45854a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45854a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f45855a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45855a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45857b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45856a = aVar;
            this.f45857b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45856a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45857b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f45858a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45858a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b0() {
        super(R.layout.ti_user_calendar_events_fragment);
        this.f45849a = new w1(s0.f105811a.b(AddTIEventViewModel.class), new d(this), new f(this), new e(null, this));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new tr2.y(this, 2));
        cVarRegisterForActivityResult.getClass();
        this.f45852d = cVarRegisterForActivityResult;
    }

    @Override // wy1.c.a
    public final void f(fg0.k kVar) {
        kVar.getClass();
        Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
        CalendarItemDTO calendarItemDTO = new CalendarItemDTO(l14 != null ? l14.longValue() : -1L);
        calendarItemDTO.I1 = kVar.getShareableEventUuid() != null;
        calendarItemDTO.H1 = kVar.getShareableEventUuid();
        EventDetailsActivity.a aVar = EventDetailsActivity.f45692o;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        fg0.x xVar = u6().f204394k;
        String str = xVar != null ? xVar.f71366b : null;
        fg0.x xVar2 = u6().f204394k;
        aVar.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) EventDetailsActivity.class);
        intent.putExtra("GCM_calendar_items", calendarItemDTO);
        intent.putExtra("GCM_extra_sharable_event_dto", kVar);
        intent.putExtra("GCM_tp_plan_name", str);
        intent.putExtra("GCM_extra_is_garmin_coach_dto", xVar2);
        intent.putExtra("GCM_extra_is_garmin_coach_flow", true);
        this.f45852d.a(intent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f45850b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIUserCalendarEventsFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f45850b;
        if (aVar != null) {
            String string = getString(R.string.atp_lbl_find_race_event);
            string.getClass();
            aVar.g(2, string);
        }
        View viewFindViewById = view2.findViewById(R.id.events_recycler_view);
        viewFindViewById.getClass();
        this.f45851c = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.find_an_event);
        viewFindViewById2.getClass();
        ((AppCompatButton) viewFindViewById2).setOnClickListener(new t61.m(this, 16));
        ((y0) u6().f46419k2.getValue()).f(getViewLifecycleOwner(), new c(new tn2.t(this, 15)));
        AddTIEventViewModel addTIEventViewModelU6 = u6();
        ge1.b.T(v1.a(addTIEventViewModelU6), null, null, new mz1.r(addTIEventViewModelU6, null), 3);
    }

    public final AddTIEventViewModel u6() {
        return (AddTIEventViewModel) this.f45849a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
