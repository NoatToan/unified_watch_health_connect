package com.garmin.android.apps.connectmobile.jet_lag.presentation.setup;

import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import e23.l;
import fw.p;
import ho.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ls0.o;
import ls0.q;
import o13.m;
import o53.f0;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/TripFlightFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TripFlightFragment extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f37039n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f37041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NestedScrollView f37042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f37043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f37044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f37045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f37046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ms0.e f37047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f37048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ms0.e f37049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f37050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f37051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f37052m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/TripFlightFragment$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SEARCHING,
        RESULTS,
        NO_RESULTS,
        TIMED_OUT
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37059b;

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
            f37058a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.SEARCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.RESULTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.NO_RESULTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.TIMED_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f37059b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37060a;

        public d(l lVar) {
            lVar.getClass();
            this.f37060a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37060a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37060a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f37061a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37061a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37063b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37062a = aVar;
            this.f37063b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37062a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37063b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f37064a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37064a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f37065a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f37065a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37066a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar) {
            super(0);
            this.f37066a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f37066a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f37067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o13.l lVar) {
            super(0);
            this.f37067a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f37067a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f37069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, o13.l lVar) {
            super(0);
            this.f37068a = aVar;
            this.f37069b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37068a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37069b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    static {
        new a(null);
    }

    public TripFlightFragment() {
        super(R.layout.trip_flight_fragment);
        t0 t0Var = s0.f105811a;
        this.f37040a = new w1(t0Var.b(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.class), new e(this), new g(this), new f(null, this));
        ls0.g gVar = new ls0.g(this, 0);
        o13.l lVarA = m.a(o13.n.NONE, new i(new h(this)));
        this.f37041b = new w1(t0Var.b(q.class), new j(lVarA), gVar, new k(null, lVarA));
    }

    public static void H6(ms0.e eVar, boolean z14, b bVar) {
        ViewGroup viewGroup = eVar.f120467c;
        ms0.h hVar = eVar.f120469e;
        v22.e.r(viewGroup, z14);
        int i14 = bVar == null ? -1 : c.f37059b[bVar.ordinal()];
        if (i14 == 1) {
            hVar.getClass();
            hVar.f120477a.setVisibility(0);
            v22.e.q(hVar.f120478b);
            hVar.f120479c.setText(R.string.lbl_searching_for_results);
            return;
        }
        if (i14 == 2) {
            hVar.getClass();
            hVar.f120477a.setVisibility(8);
            return;
        }
        if (i14 == 3) {
            hVar.getClass();
            hVar.f120477a.setVisibility(0);
            v22.e.j(hVar.f120478b);
            hVar.f120479c.setText(R.string.lbl_no_results_found);
            return;
        }
        if (i14 != 4) {
            hVar.getClass();
            hVar.f120477a.setVisibility(8);
        } else {
            hVar.getClass();
            hVar.f120477a.setVisibility(0);
            v22.e.j(hVar.f120478b);
            hVar.f120479c.setText(R.string.lbl_search_timed_out_try_again);
        }
    }

    public static void K6(TripFlightFragment tripFlightFragment) {
        q qVarW6 = tripFlightFragment.w6();
        ns0.c cVar = ns0.c.f127813a;
        yr0.i iVar = qVarW6.f114746c;
        cVar.getClass();
        iVar.getClass();
        boolean z14 = g22.n.d(iVar.f198995c) && g22.n.d(iVar.f198996d) && iVar.f198997e != null && iVar.f198998f != null && g22.n.d(iVar.f198999g) && g22.n.d(iVar.f199000h) && iVar.f199001i != null && iVar.f199002j != null;
        View view2 = tripFlightFragment.f37050k;
        if (view2 == null) {
            s.m("addAnotherDestination");
            throw null;
        }
        v22.e.i(view2, z14);
        Button button = tripFlightFragment.f37051l;
        if (button != null) {
            button.setEnabled(z14);
        } else {
            s.m("nextButton");
            throw null;
        }
    }

    public final void A6() {
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_DESTINATION_INDEX", w6().f114745b + 1);
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).g(R.id.action_trip_next_flight_fragment, bundle);
    }

    public final void C6(yr0.i iVar) {
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        ns0.b.f127812a.getClass();
        iVar.getClass();
        Long l14 = iVar.f198993a;
        Long l15 = iVar.f198994b;
        String str = iVar.f198995c;
        String str2 = iVar.f198996d;
        LocalDate localDate = iVar.f198997e;
        String string = null;
        String string2 = (localDate == null || (localDateTime2 = localDate.toLocalDateTime(iVar.f198998f)) == null) ? null : localDateTime2.toString("yyyy-MM-dd'T'HH:mm:ss.S");
        String str3 = iVar.f198999g;
        String str4 = iVar.f199000h;
        LocalDate localDate2 = iVar.f199001i;
        if (localDate2 != null && (localDateTime = localDate2.toLocalDateTime(iVar.f199002j)) != null) {
            string = localDateTime.toString("yyyy-MM-dd'T'HH:mm:ss.S");
        }
        yr0.j jVar = new yr0.j(l14, l15, str, str2, string2, str3, str4, string);
        if (w6().f114744a) {
            y6().f37108f = jVar;
            return;
        }
        int i14 = w6().f114745b;
        if (i14 < y6().f37107e.size()) {
            y6().f37107e.set(i14, jVar);
        } else {
            y6().f37107e.add(jVar);
        }
    }

    public final void E6(boolean z14) {
        ms0.e eVar = this.f37049j;
        if (eVar == null) {
            s.m("arrivalViewHolder");
            throw null;
        }
        v22.e.r(eVar.f120471g.f102707b, z14);
        ms0.e eVar2 = this.f37049j;
        if (eVar2 == null) {
            s.m("arrivalViewHolder");
            throw null;
        }
        v22.e.r(eVar2.f120472h.f102707b, z14);
        G6(z14);
    }

    public final void F6(boolean z14) {
        ms0.e eVar = this.f37047h;
        if (eVar == null) {
            s.m("departureViewHolder");
            throw null;
        }
        v22.e.r(eVar.f120470f, w6().f114745b == 0 && z14);
        ms0.e eVar2 = this.f37047h;
        if (eVar2 == null) {
            s.m("departureViewHolder");
            throw null;
        }
        v22.e.r(eVar2.f120471g.f102707b, z14);
        ms0.e eVar3 = this.f37047h;
        if (eVar3 == null) {
            s.m("departureViewHolder");
            throw null;
        }
        v22.e.r(eVar3.f120472h.f102707b, z14);
        View view2 = this.f37048i;
        if (view2 == null) {
            s.m("arrivalView");
            throw null;
        }
        v22.e.r(view2, z14);
        G6(z14);
    }

    public final void G6(boolean z14) {
        View view2 = this.f37050k;
        if (view2 == null) {
            s.m("addAnotherDestination");
            throw null;
        }
        boolean z15 = false;
        v22.e.r(view2, z6() && z14);
        Button button = this.f37051l;
        if (button == null) {
            s.m("nextButton");
            throw null;
        }
        v22.e.r(button, z14);
        TextView textView = this.f37052m;
        if (textView == null) {
            s.m("secondaryActionButton");
            throw null;
        }
        if ((w6().z4() || (w6().f114744a && w6().f114745b <= 1)) && z14) {
            z15 = true;
        }
        v22.e.r(textView, z15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I6(LocalDate localDate, LocalDate localDate2) {
        LocalDate localDateNow = LocalDate.now();
        o13.p pVar = new o13.p(localDateNow.minusMonths(1).withDayOfMonth(1), localDateNow.plusYears(1));
        LocalDate localDate3 = (LocalDate) pVar.f128594a;
        LocalDate localDate4 = (LocalDate) pVar.f128595b;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.C0664a c0664a = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.f37094a;
        if (localDate2 == null) {
            localDate2 = localDate3;
        }
        String string = getString(R.string.lbl_add_date);
        string.getClass();
        c0664a.getClass();
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a aVar = new com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_SELECTED_DATE", localDate);
        bundle.putSerializable("ARG_MIN_DATE", localDate2);
        bundle.putSerializable("ARG_MAX_DATE", localDate4);
        bundle.putString("ARG_TITLE", string);
        aVar.setArguments(bundle);
        aVar.show(getChildFragmentManager(), (String) null);
    }

    public final void J6(LocalTime localTime, l<? super LocalTime, Unit> lVar) {
        Context contextRequireContext = requireContext();
        ls0.m mVar = new ls0.m(lVar, 0);
        int hourOfDay = localTime != null ? localTime.getHourOfDay() : 0;
        int minuteOfHour = localTime != null ? localTime.getMinuteOfHour() : 0;
        j0.f23099a.getClass();
        TimePickerDialog timePickerDialog = new TimePickerDialog(contextRequireContext, R.style.GCMTimePicker, mVar, hourOfDay, minuteOfHour, j0.D());
        timePickerDialog.show();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        og.a.W(timePickerDialog, contextRequireContext2);
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        og.a.w(timePickerDialog, contextRequireContext3);
    }

    public final void M6() {
        K6(this);
        u6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S6(e23.a<Unit> aVar) {
        yr0.i iVarR;
        boolean z14 = w6().f114744a;
        int i14 = w6().f114745b;
        ArrayList arrayList = y6().f37107e;
        yr0.j jVar = z14 ? (yr0.j) h0.n0(arrayList) : (yr0.j) h0.e0(i14 - 1, arrayList);
        if (jVar != null) {
            ns0.b.f127812a.getClass();
            iVarR = ns0.b.r(jVar);
        } else {
            iVarR = null;
        }
        q qVarW6 = w6();
        g3 g3Var = (g3) y6().f37112j.d();
        List list = g3Var != null ? (List) g3Var.f35301b : null;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        list.getClass();
        ls0.p pVar = qVarW6.f114751h;
        yr0.i iVar = qVarW6.f114746c;
        pVar.getClass();
        iVar.getClass();
        o oVar = new o(iVar, iVarR, list);
        Iterator<l<o, yr0.k>> it = pVar.f114743a.iterator();
        yr0.k kVarInvoke = null;
        while (it.hasNext() && kVarInvoke == null) {
            kVarInvoke = it.next().invoke(oVar);
        }
        if (kVarInvoke == null) {
            u6();
            aVar.invoke();
            return;
        }
        yr0.k.a aVar2 = kVarInvoke.f199013b;
        u6();
        yr0.k.a aVar3 = kVarInvoke.f199012a;
        if (aVar3 != null) {
            ms0.e eVar = this.f37047h;
            if (eVar == null) {
                s.m("departureViewHolder");
                throw null;
            }
            ms0.c.a(eVar, aVar3);
        }
        if (aVar2 != null) {
            ms0.e eVar2 = this.f37049j;
            if (eVar2 == null) {
                s.m("arrivalViewHolder");
                throw null;
            }
            ms0.c.a(eVar2, aVar2);
        }
        ll0.a aVar4 = new ll0.a(aVar, 4);
        if (aVar2 == null || !aVar2.f199014a) {
            return;
        }
        o0.a.b(o0.f149771c, getString(R.string.lbl_same_time_zone), getString(R.string.msg_destinations_same_time_zone), R.string.lbl_edit_destination, null, R.string.lbl_common_continue, new js0.d(aVar4, 18), 8).u6(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (w6().f114745b == 0) {
            f0.k(requireActivity().getOnBackPressedDispatcher(), null, new ls0.l(this, 0), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        int i14;
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.flight_scroll);
        viewFindViewById.getClass();
        this.f37042c = (NestedScrollView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.flight_primary_instructions);
        viewFindViewById2.getClass();
        this.f37043d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.flight_secondary_instructions);
        viewFindViewById3.getClass();
        this.f37044e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.flight_destination_title);
        viewFindViewById4.getClass();
        this.f37045f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.flight_departure);
        viewFindViewById5.getClass();
        this.f37046g = viewFindViewById5;
        this.f37047h = new ms0.e(viewFindViewById5);
        View viewFindViewById6 = view2.findViewById(R.id.flight_arrival);
        viewFindViewById6.getClass();
        this.f37048i = viewFindViewById6;
        this.f37049j = new ms0.e(viewFindViewById6);
        View viewFindViewById7 = view2.findViewById(R.id.add_another_destination);
        viewFindViewById7.getClass();
        this.f37050k = viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.next);
        viewFindViewById8.getClass();
        this.f37051l = (Button) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.secondary_action);
        viewFindViewById9.getClass();
        this.f37052m = (TextView) viewFindViewById9;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ks0.c cVar = new ks0.c(contextRequireContext);
        boolean zZ4 = y6().z4();
        TextView textView = this.f37043d;
        if (textView == null) {
            s.m("primaryInstructions");
            throw null;
        }
        if (w6().f114744a) {
            i14 = zZ4 ? R.string.msg_edit_return_details : R.string.msg_add_return_details;
        } else if (w6().z4()) {
            i14 = zZ4 ? R.string.msg_edit_your_next_destination : R.string.msg_add_your_next_destination;
        } else {
            i14 = zZ4 ? R.string.msg_edit_your_destination : R.string.msg_add_your_destination;
        }
        textView.setText(i14);
        TextView textView2 = this.f37044e;
        if (textView2 == null) {
            s.m("secondaryInstructions");
            throw null;
        }
        textView2.setText(R.string.msg_jet_lag_do_not_include_connecting_flights);
        TextView textView3 = this.f37045f;
        if (textView3 == null) {
            s.m("destinationTitle");
            throw null;
        }
        final int i15 = 0;
        final int i16 = 1;
        if (w6().z4()) {
            textView3.setText(cVar.f106382a.a(R.string.lbl_destination_index, String.valueOf(w6().f114745b + 1)));
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        final ms0.e eVar = this.f37047h;
        if (eVar == null) {
            s.m("departureViewHolder");
            throw null;
        }
        TextView textView4 = eVar.f120470f;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.d dVar = new com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.d(eVar, this);
        z0 z0Var = new z0(this) { // from class: ls0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripFlightFragment f114710b;

            {
                this.f114710b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i15;
                ms0.e eVar2 = eVar;
                TripFlightFragment tripFlightFragment = this.f114710b;
                g3 g3Var = (g3) obj;
                switch (i17) {
                    case 0:
                        int i18 = TripFlightFragment.f37039n;
                        g3Var.getClass();
                        tripFlightFragment.F6(false);
                        List list = (List) g3Var.f35301b;
                        ms0.c.e(eVar2, list == null ? p13.j0.f134944a : list);
                        if (g3Var.f35300a != fw.p.SUCCESS) {
                            TripFlightFragment.H6(eVar2, true, TripFlightFragment.b.TIMED_OUT);
                        } else if (list == null) {
                            tripFlightFragment.F6(true);
                            TripFlightFragment.H6(eVar2, false, null);
                        } else {
                            TripFlightFragment.H6(eVar2, true, !list.isEmpty() ? TripFlightFragment.b.RESULTS : TripFlightFragment.b.NO_RESULTS);
                        }
                        break;
                    default:
                        int i19 = TripFlightFragment.f37039n;
                        g3Var.getClass();
                        tripFlightFragment.E6(false);
                        List list2 = (List) g3Var.f35301b;
                        ms0.c.e(eVar2, list2 == null ? p13.j0.f134944a : list2);
                        if (g3Var.f35300a != fw.p.SUCCESS) {
                            TripFlightFragment.H6(eVar2, true, TripFlightFragment.b.TIMED_OUT);
                        } else if (list2 == null) {
                            tripFlightFragment.E6(true);
                            TripFlightFragment.H6(eVar2, false, null);
                        } else {
                            TripFlightFragment.H6(eVar2, true, !list2.isEmpty() ? TripFlightFragment.b.RESULTS : TripFlightFragment.b.NO_RESULTS);
                        }
                        break;
                }
            }
        };
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        yr0.i iVar = w6().f114746c;
        d0 d0Var = new d0(this, z0Var, eVar, dVar, 20);
        ev2.f fVar = new ev2.f(eVar, this, z0Var, dVar, 24);
        iVar.getClass();
        String string = contextRequireContext2.getString(R.string.lbl_departure_from);
        String strD = p6.b.d(contextRequireContext2, R.string.lte_city, string);
        String str = iVar.f198995c;
        String string2 = contextRequireContext2.getString(R.string.lbl_departure_date);
        string2.getClass();
        LocalDate localDate = iVar.f198997e;
        String string3 = contextRequireContext2.getString(R.string.lbl_departure_time);
        string3.getClass();
        ms0.c.b(eVar, contextRequireContext2, new ms0.d(string, strD, str, string2, localDate, string3, iVar.f198998f), d0Var, fVar);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar.f120466b;
        styledInlineTextFieldViewDark.getClass();
        EditText editText = styledInlineTextFieldViewDark.editText;
        editText.getClass();
        final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ls0.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                int i17 = i15;
                View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                switch (i17) {
                    case 0:
                        int i18 = TripFlightFragment.f37039n;
                        onFocusChangeListener2.onFocusChange(view3, z14);
                        if (!z14) {
                            view3.getClass();
                            v22.e.b(view3);
                        }
                        break;
                    default:
                        int i19 = TripFlightFragment.f37039n;
                        onFocusChangeListener2.onFocusChange(view3, z14);
                        if (!z14) {
                            view3.getClass();
                            v22.e.b(view3);
                        }
                        break;
                }
            }
        });
        Unit unit = Unit.INSTANCE;
        eVar.f120468d.setAdapter(new ms0.g(new k62.k(this, 29, eVar, dVar)));
        if (w6().f114745b == 0) {
            textView4.setOnClickListener(new ls0.e(this, i15));
            textView4.setVisibility(0);
        } else {
            v22.e.j(textView4);
        }
        eVar.f120471g.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: ls0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripFlightFragment f114717b;

            {
                this.f114717b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i15;
                final int i18 = 1;
                final int i19 = 0;
                final ms0.e eVar2 = eVar;
                final TripFlightFragment tripFlightFragment = this.f114717b;
                switch (i17) {
                    case 0:
                        int i24 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove != null) {
                            oVarRemove.f7410a.d(oVarRemove.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str2) {
                                Object serializable;
                                Object serializable2;
                                int i25 = i18;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i25) {
                                    case 0:
                                        int i26 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.c(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i27 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f198997e, null);
                        break;
                    case 1:
                        int i25 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f198998f, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i26 = i18;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i26) {
                                    case 0:
                                        int i27 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.d(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i28 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                    case 2:
                        int i26 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove2 = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove2 != null) {
                            oVarRemove2.f7410a.d(oVarRemove2.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str2) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i19;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.c(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f199001i, tripFlightFragment.w6().f114746c.f198997e);
                        break;
                    default:
                        int i27 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f199002j, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i19;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.d(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                }
            }
        });
        eVar.f120472h.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: ls0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripFlightFragment f114717b;

            {
                this.f114717b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                final int i18 = 1;
                final int i19 = 0;
                final ms0.e eVar2 = eVar;
                final TripFlightFragment tripFlightFragment = this.f114717b;
                switch (i17) {
                    case 0:
                        int i24 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove != null) {
                            oVarRemove.f7410a.d(oVarRemove.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str2) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i18;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.c(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f198997e, null);
                        break;
                    case 1:
                        int i25 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f198998f, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i18;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.d(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                    case 2:
                        int i26 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove2 = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove2 != null) {
                            oVarRemove2.f7410a.d(oVarRemove2.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str2) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i19;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.c(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str2.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f199001i, tripFlightFragment.w6().f114746c.f198997e);
                        break;
                    default:
                        int i27 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f199002j, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i19;
                                ms0.e eVar3 = eVar2;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext3 = tripFlightFragment2.requireContext();
                                        contextRequireContext3.getClass();
                                        ms0.c.d(eVar3, contextRequireContext3, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar3, contextRequireContext4, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                }
            }
        });
        F6(true);
        ms0.e eVar2 = this.f37047h;
        if (eVar2 == null) {
            s.m("departureViewHolder");
            throw null;
        }
        H6(eVar2, false, null);
        final ms0.e eVar3 = this.f37049j;
        if (eVar3 == null) {
            s.m("arrivalViewHolder");
            throw null;
        }
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.c cVar2 = new com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.c(eVar3, this);
        z0 z0Var2 = new z0(this) { // from class: ls0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripFlightFragment f114710b;

            {
                this.f114710b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                ms0.e eVar4 = eVar3;
                TripFlightFragment tripFlightFragment = this.f114710b;
                g3 g3Var = (g3) obj;
                switch (i17) {
                    case 0:
                        int i18 = TripFlightFragment.f37039n;
                        g3Var.getClass();
                        tripFlightFragment.F6(false);
                        List list = (List) g3Var.f35301b;
                        ms0.c.e(eVar4, list == null ? p13.j0.f134944a : list);
                        if (g3Var.f35300a != fw.p.SUCCESS) {
                            TripFlightFragment.H6(eVar4, true, TripFlightFragment.b.TIMED_OUT);
                        } else if (list == null) {
                            tripFlightFragment.F6(true);
                            TripFlightFragment.H6(eVar4, false, null);
                        } else {
                            TripFlightFragment.H6(eVar4, true, !list.isEmpty() ? TripFlightFragment.b.RESULTS : TripFlightFragment.b.NO_RESULTS);
                        }
                        break;
                    default:
                        int i19 = TripFlightFragment.f37039n;
                        g3Var.getClass();
                        tripFlightFragment.E6(false);
                        List list2 = (List) g3Var.f35301b;
                        ms0.c.e(eVar4, list2 == null ? p13.j0.f134944a : list2);
                        if (g3Var.f35300a != fw.p.SUCCESS) {
                            TripFlightFragment.H6(eVar4, true, TripFlightFragment.b.TIMED_OUT);
                        } else if (list2 == null) {
                            tripFlightFragment.E6(true);
                            TripFlightFragment.H6(eVar4, false, null);
                        } else {
                            TripFlightFragment.H6(eVar4, true, !list2.isEmpty() ? TripFlightFragment.b.RESULTS : TripFlightFragment.b.NO_RESULTS);
                        }
                        break;
                }
            }
        };
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        yr0.i iVar2 = w6().f114746c;
        d0 d0Var2 = new d0(this, z0Var2, eVar3, cVar2, 21);
        ev2.f fVar2 = new ev2.f(eVar3, this, z0Var2, cVar2, 25);
        iVar2.getClass();
        String string4 = contextRequireContext3.getString(R.string.trip_label_to);
        String strD2 = p6.b.d(contextRequireContext3, R.string.lte_city, string4);
        String str2 = iVar2.f198999g;
        String string5 = contextRequireContext3.getString(R.string.lbl_arrival_date);
        string5.getClass();
        LocalDate localDate2 = iVar2.f199001i;
        String string6 = contextRequireContext3.getString(R.string.lbl_arrival_time);
        string6.getClass();
        ms0.c.b(eVar3, contextRequireContext3, new ms0.d(string4, strD2, str2, string5, localDate2, string6, iVar2.f199002j), d0Var2, fVar2);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = eVar3.f120466b;
        styledInlineTextFieldViewDark2.getClass();
        EditText editText2 = styledInlineTextFieldViewDark2.editText;
        editText2.getClass();
        final View.OnFocusChangeListener onFocusChangeListener2 = editText2.getOnFocusChangeListener();
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ls0.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                int i17 = i16;
                View.OnFocusChangeListener onFocusChangeListener3 = onFocusChangeListener2;
                switch (i17) {
                    case 0:
                        int i18 = TripFlightFragment.f37039n;
                        onFocusChangeListener3.onFocusChange(view3, z14);
                        if (!z14) {
                            view3.getClass();
                            v22.e.b(view3);
                        }
                        break;
                    default:
                        int i19 = TripFlightFragment.f37039n;
                        onFocusChangeListener3.onFocusChange(view3, z14);
                        if (!z14) {
                            view3.getClass();
                            v22.e.b(view3);
                        }
                        break;
                }
            }
        });
        eVar3.f120468d.setAdapter(new ms0.g(new ls0.h(this, i15, eVar3, cVar2)));
        v22.e.j(eVar3.f120470f);
        final int i17 = 2;
        eVar3.f120471g.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: ls0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripFlightFragment f114717b;

            {
                this.f114717b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                final int i19 = 1;
                final int i110 = 0;
                final ms0.e eVar4 = eVar3;
                final TripFlightFragment tripFlightFragment = this.f114717b;
                switch (i18) {
                    case 0:
                        int i24 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove != null) {
                            oVarRemove.f7410a.d(oVarRemove.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str3) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i19;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.c(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f198997e, null);
                        break;
                    case 1:
                        int i25 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f198998f, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i19;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.d(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                    case 2:
                        int i26 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove2 = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove2 != null) {
                            oVarRemove2.f7410a.d(oVarRemove2.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str3) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i110;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.c(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f199001i, tripFlightFragment.w6().f114746c.f198997e);
                        break;
                    default:
                        int i27 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f199002j, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i110;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.d(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                }
            }
        });
        final int i18 = 3;
        eVar3.f120472h.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: ls0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TripFlightFragment f114717b;

            {
                this.f114717b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i19 = i18;
                final int i110 = 1;
                final int i111 = 0;
                final ms0.e eVar4 = eVar3;
                final TripFlightFragment tripFlightFragment = this.f114717b;
                switch (i19) {
                    case 0:
                        int i24 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove != null) {
                            oVarRemove.f7410a.d(oVarRemove.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str3) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i110;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.c(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f198997e, null);
                        break;
                    case 1:
                        int i25 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f198998f, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i110;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.d(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                    case 2:
                        int i26 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        androidx.fragment.app.v.o oVarRemove2 = tripFlightFragment.getChildFragmentManager().f7383n.remove("REQUEST_KEY_DATE");
                        if (oVarRemove2 != null) {
                            oVarRemove2.f7410a.d(oVarRemove2.f7412c);
                        }
                        tripFlightFragment.getChildFragmentManager().n0("REQUEST_KEY_DATE", tripFlightFragment.getViewLifecycleOwner(), new androidx.fragment.app.b0() { // from class: ls0.i
                            @Override // androidx.fragment.app.b0
                            public final void g(Bundle bundle2, String str3) {
                                Object serializable;
                                Object serializable2;
                                int i27 = i111;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                switch (i27) {
                                    case 0:
                                        int i28 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable3 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable3 instanceof LocalDate)) {
                                                serializable3 = null;
                                            }
                                            serializable = (LocalDate) serializable3;
                                        }
                                        tripFlightFragment2.w6().f114746c.f199001i = (LocalDate) serializable;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.c(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199001i, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i29 = TripFlightFragment.f37039n;
                                        str3.getClass();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            serializable2 = bundle2.getSerializable("RESULT_KEY_DATE", LocalDate.class);
                                        } else {
                                            Object serializable4 = bundle2.getSerializable("RESULT_KEY_DATE");
                                            if (!(serializable4 instanceof LocalDate)) {
                                                serializable4 = null;
                                            }
                                            serializable2 = (LocalDate) serializable4;
                                        }
                                        tripFlightFragment2.w6().f114746c.f198997e = (LocalDate) serializable2;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.c(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198997e, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                            }
                        });
                        tripFlightFragment.I6(tripFlightFragment.w6().f114746c.f199001i, tripFlightFragment.w6().f114746c.f198997e);
                        break;
                    default:
                        int i27 = TripFlightFragment.f37039n;
                        tripFlightFragment.v6();
                        tripFlightFragment.J6(tripFlightFragment.w6().f114746c.f199002j, new e23.l() { // from class: ls0.j
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i28 = i111;
                                ms0.e eVar5 = eVar4;
                                TripFlightFragment tripFlightFragment2 = tripFlightFragment;
                                LocalTime localTime = (LocalTime) obj;
                                switch (i28) {
                                    case 0:
                                        int i29 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f199002j = localTime;
                                        Context contextRequireContext4 = tripFlightFragment2.requireContext();
                                        contextRequireContext4.getClass();
                                        ms0.c.d(eVar5, contextRequireContext4, tripFlightFragment2.w6().f114746c.f199002j, null);
                                        tripFlightFragment2.M6();
                                        break;
                                    default:
                                        int i210 = TripFlightFragment.f37039n;
                                        localTime.getClass();
                                        tripFlightFragment2.w6().f114746c.f198998f = localTime;
                                        Context contextRequireContext5 = tripFlightFragment2.requireContext();
                                        contextRequireContext5.getClass();
                                        ms0.c.d(eVar5, contextRequireContext5, tripFlightFragment2.w6().f114746c.f198998f, null);
                                        tripFlightFragment2.M6();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        break;
                }
            }
        });
        E6(true);
        ms0.e eVar4 = this.f37049j;
        if (eVar4 == null) {
            s.m("arrivalViewHolder");
            throw null;
        }
        H6(eVar4, false, null);
        boolean zZ6 = z6();
        View view3 = this.f37050k;
        if (zZ6) {
            if (view3 == null) {
                s.m("addAnotherDestination");
                throw null;
            }
            k32.l lVar = new k32.l(view3);
            lVar.f102707b.setOnClickListener(new ls0.e(this, i18));
            lVar.a(R.string.lbl_add_another_destination, null);
            k32.l.d(lVar, R.drawable.plus, Integer.valueOf(R.color.gcm_icon_primary_action_selector), 20, 8);
            View view4 = this.f37050k;
            if (view4 == null) {
                s.m("addAnotherDestination");
                throw null;
            }
            view4.setVisibility(0);
        } else {
            if (view3 == null) {
                s.m("addAnotherDestination");
                throw null;
            }
            view3.setVisibility(8);
        }
        Button button = this.f37051l;
        if (button == null) {
            s.m("nextButton");
            throw null;
        }
        button.setOnClickListener(new ls0.e(this, 4));
        TextView textView5 = this.f37052m;
        if (textView5 == null) {
            s.m("secondaryActionButton");
            throw null;
        }
        if (w6().f114744a && w6().f114745b == 1) {
            textView5.setText(R.string.lbl_this_is_one_way_trip);
            textView5.setOnClickListener(new ls0.e(this, 5));
            textView5.setVisibility(0);
        } else if (w6().z4()) {
            textView5.setText(R.string.lbl_remove_destination);
            textView5.setOnClickListener(new ls0.e(this, 6));
            textView5.setVisibility(0);
        } else {
            textView5.setVisibility(8);
        }
        K6(this);
        NestedScrollView nestedScrollView = this.f37042c;
        if (nestedScrollView == null) {
            s.m("scrollView");
            throw null;
        }
        lp2.h hVar = new lp2.h(this, 18);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(nestedScrollView, hVar);
    }

    public final void u6() {
        ms0.e eVar = this.f37047h;
        if (eVar == null) {
            s.m("departureViewHolder");
            throw null;
        }
        eVar.f120466b.setHasError(false);
        eVar.f120471g.f(false);
        eVar.f120472h.f(false);
        eVar.f120473i.setText((CharSequence) null);
        ms0.e eVar2 = this.f37049j;
        if (eVar2 == null) {
            s.m("arrivalViewHolder");
            throw null;
        }
        eVar2.f120466b.setHasError(false);
        eVar2.f120471g.f(false);
        eVar2.f120472h.f(false);
        eVar2.f120473i.setText((CharSequence) null);
    }

    public final void v6() {
        ms0.e eVar = this.f37047h;
        if (eVar == null) {
            s.m("departureViewHolder");
            throw null;
        }
        eVar.f120466b.clearFocus();
        ms0.e eVar2 = this.f37049j;
        if (eVar2 != null) {
            eVar2.f120466b.clearFocus();
        } else {
            s.m("arrivalViewHolder");
            throw null;
        }
    }

    public final q w6() {
        return (q) this.f37041b.getValue();
    }

    public final com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e y6() {
        return (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e) this.f37040a.getValue();
    }

    public final boolean z6() {
        return !w6().f114744a && w6().f114745b < 4 && w6().f114745b >= y6().f37107e.size() - 1;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/setup/TripFlightFragment$a;", "", "<init>", "()V", "", "ARG_RETURN_FLIGHT", "Ljava/lang/String;", "ARG_DESTINATION_INDEX", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
