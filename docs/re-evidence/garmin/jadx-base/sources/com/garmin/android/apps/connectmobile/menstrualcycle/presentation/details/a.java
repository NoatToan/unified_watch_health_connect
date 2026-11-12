package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c22.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import g2.m1;
import ht1.v;
import hx0.t0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o13.m;
import o13.n;
import o13.t;
import o53.f0;
import o53.l1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import q92.x;
import ro0.l;
import z10.d1;
import z10.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/a;", "Lhx0/t0;", "Landroidx/fragment/app/Fragment;", "Lhx0/f;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements t0, hx0.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0689a f38856n = new C0689a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1 f38859c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f38861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f38863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f38866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RangeCalendar f38867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f38868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f38869m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38857a = m.a(n.NONE, new h(this, null, new g(this), null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f38858b = new w1(s0.f105811a.b(i3.class), new e(this), new v(6), new f(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f38860d = m.b(new hx0.g(this, 1));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/a$b", "Lb/s;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            C0689a c0689a = a.f38856n;
            a.this.y6();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/a$c", "Landroidx/core/view/s;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            RangeCalendar rangeCalendar = a.this.f38867k;
            if (rangeCalendar == null) {
                p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                throw null;
            }
            if (rangeCalendar.l()) {
                return;
            }
            menuInflater.inflate(R.menu.help_3_0, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_help) {
                return false;
            }
            HelpActivity.a aVar = HelpActivity.f36653a;
            Context contextRequireContext = a.this.requireContext();
            l lVar = l.MENSTRUAL_CYCLE;
            aVar.getClass();
            HelpActivity.a.d(contextRequireContext, lVar, "CALENDAR_LEGEND", null);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f38872a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f38872a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f38872a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38872a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38873a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f38873a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f38873a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f38874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f38875b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f38874a = aVar;
            this.f38875b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f38874a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f38875b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38876a;

        public g(Fragment fragment) {
            this.f38876a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f38876a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38881e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38877a = fragment;
            this.f38878b = qualifier;
            this.f38879c = aVar;
            this.f38880d = aVar2;
            this.f38881e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 viewModelStore = ((ViewModelStoreOwner) this.f38879c.invoke()).getF189591b();
            Fragment fragment = this.f38877a;
            e23.a aVar = this.f38880d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f38878b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38881e, 4, null);
        }
    }

    public static /* synthetic */ void w6(a aVar, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i14) {
        if ((i14 & 4) != 0) {
            localDate3 = null;
        }
        aVar.v6(localDate, localDate2, localDate3, false);
    }

    public final void A6(i.a aVar) {
        RangeCalendar rangeCalendar = this.f38867k;
        if (rangeCalendar == null) {
            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
            throw null;
        }
        rangeCalendar.setMode(aVar);
        Button button = this.f38868l;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("cycleEditButton");
            throw null;
        }
        button.setText(getString(aVar == i.a.NORMAL ? R.string.mct_edit_period : R.string.lbl_common_save));
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    @Override // hx0.t0
    public final void O() {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVarU6 = u6();
        if (bVarU6.f38886e.compareTo((ReadablePartial) bVarU6.f38893l) > 0) {
            RangeCalendar rangeCalendar = this.f38867k;
            if (rangeCalendar != null) {
                rangeCalendar.f38823d = false;
                return;
            } else {
                p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                throw null;
            }
        }
        LocalDate localDate = u6().f38886e;
        localDate.getClass();
        LocalDate localDateG = jg.b.G(localDate);
        LocalDate localDate2 = new LocalDate(localDateG.getYear(), localDateG.getMonthOfYear(), 1);
        LocalDate localDatePlusMonths = u6().f38886e.plusMonths(3);
        w6(this, localDate2, jg.b.J(new LocalDate(localDatePlusMonths.getYear(), localDatePlusMonths.getMonthOfYear(), 1)), null, 12);
    }

    @Override // hx0.t0
    public final void P1() {
        g22.e.f(this);
        View view2 = this.f38866j;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("loadingView");
            throw null;
        }
        v22.e.j(view2);
        this.f38864h = false;
    }

    @Override // hx0.f
    public final void f2(LocalDate localDate) {
        Intent intent = new Intent();
        intent.putExtra("CALENDAR_SELECTED_DATE", localDate);
        intent.putExtra("CALENDAR_UPDATED_KEY", this.f38862f);
        e1 e1Var = this.f38859c;
        if (e1Var != null) {
            e1Var.onFragmentFinished(-1, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 101 && d1.i(x.DI_CONNECT_UPLOAD)) {
            RangeCalendar rangeCalendar = this.f38867k;
            if (rangeCalendar == null) {
                p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                throw null;
            }
            if (rangeCalendar.l()) {
                return;
            }
            A6(i.a.EDIT_RANGE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f38859c = context instanceof e1 ? (e1) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38861e = new b();
        u uVar = (u) this.f38860d.getValue();
        b bVar = this.f38861e;
        if (bVar != null) {
            uVar.b(bVar, this);
        } else {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_menstrual_cycle_calendar, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("CALENDAR_UPDATED_KEY", this.f38862f);
        bundle.putBoolean("EXIT_ON_SAVE_KEY", this.f38865i);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        i.a aVar;
        Object serializable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.loading_view);
        viewFindViewById.getClass();
        this.f38866j = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.cycle_range_calendar);
        viewFindViewById2.getClass();
        this.f38867k = (RangeCalendar) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.cycle_edit_button);
        viewFindViewById3.getClass();
        this.f38868l = (Button) viewFindViewById3;
        this.f38869m = view2.findViewById(R.id.cycle_edit_button_wrapper);
        Bundle arguments = getArguments();
        if (arguments == null) {
            aVar = i.a.NORMAL;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("CALENDAR_MODE_KEY", i.a.class);
            } else {
                Object serializable2 = arguments.getSerializable("CALENDAR_MODE_KEY");
                if (!(serializable2 instanceof i.a)) {
                    serializable2 = null;
                }
                serializable = (i.a) serializable2;
            }
            aVar = (i.a) serializable;
            if (aVar == null) {
                aVar = i.a.NORMAL;
            }
        }
        A6(aVar);
        this.f38862f = bundle != null ? bundle.getBoolean("CALENDAR_UPDATED_KEY") : this.f38862f;
        this.f38865i = bundle != null ? bundle.getBoolean("EXIT_ON_SAVE_KEY") : this.f38865i;
        View view3 = this.f38866j;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("loadingView");
            throw null;
        }
        view3.setVisibility(8);
        RangeCalendar rangeCalendar = this.f38867k;
        if (rangeCalendar == null) {
            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
            throw null;
        }
        rangeCalendar.setDataLoader(this);
        RangeCalendar rangeCalendar2 = this.f38867k;
        if (rangeCalendar2 == null) {
            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
            throw null;
        }
        rangeCalendar2.setDaySelectedListener(this);
        if (u6().f38884c.isEmpty()) {
            g22.e.l(this);
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDate = new LocalDate(localDateNow.getYear(), localDateNow.getMonthOfYear(), 1);
            LocalDate localDateMinusMonths = localDate.minusMonths(1);
            localDateMinusMonths.getClass();
            LocalDate localDateP = jg.b.P(localDateMinusMonths);
            LocalDate localDatePlusMonths = localDate.plusMonths(1);
            localDatePlusMonths.getClass();
            v6(localDateP, jg.b.t(localDatePlusMonths), localDate, true);
        }
        Button button = this.f38868l;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("cycleEditButton");
            throw null;
        }
        button.setOnClickListener(new cw2.b(29, this, view2));
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_view);
        this.f38863g = composeView;
        if (composeView != null) {
            composeView.setVisibility(8);
        }
    }

    @Override // hx0.t0
    public final void s0() {
        LocalDate localDateMinusMonths = u6().f38885d.minusMonths(3);
        LocalDate localDate = new LocalDate(localDateMinusMonths.getYear(), localDateMinusMonths.getMonthOfYear(), 1);
        LocalDate localDate2 = u6().f38885d;
        localDate2.getClass();
        w6(this, localDate, jg.b.J(localDate2), null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b u6() {
        return (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b) this.f38857a.getValue();
    }

    public final void v6(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, boolean z14) {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVarU6 = u6();
        h0 h0VarI = f0.I(localDate, localDate2);
        LinkedHashMap linkedHashMap = bVarU6.f38890i;
        LocalDate localDate4 = h0VarI.f23061a;
        ReentrantLock reentrantLock = bVarU6.f38889h;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap2 = bVarU6.f38883b;
            Object y0Var = linkedHashMap2.get(h0VarI);
            if (y0Var == null) {
                y0Var = new y0();
                linkedHashMap2.put(h0VarI, y0Var);
            }
            y0 y0Var2 = (y0) y0Var;
            l1 l1Var = (l1) linkedHashMap.get(h0VarI);
            if (l1Var == null || !l1Var.isActive()) {
                y0Var2.j(null);
                LocalDate localDate5 = h0VarI.f23062b;
                if (localDate4.compareTo((ReadablePartial) bVarU6.f38885d) < 0) {
                    bVarU6.f38885d = localDate4;
                }
                if (localDate5.compareTo((ReadablePartial) bVarU6.f38886e) > 0) {
                    bVarU6.f38886e = localDate5;
                }
                linkedHashMap.put(h0VarI, ge1.b.T(bVarU6, null, null, new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.c(bVarU6, h0VarI, y0Var2, null), 3));
            }
            reentrantLock.unlock();
            dh.b.L(y0Var2, this, new d(new cq.m(this, z14, localDate3, localDate, localDate2, 2)));
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void y6() {
        RangeCalendar rangeCalendar = this.f38867k;
        if (rangeCalendar == null) {
            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
            throw null;
        }
        if (rangeCalendar.l()) {
            A6(i.a.NORMAL);
            return;
        }
        Intent intentPutExtra = new Intent().putExtra("CALENDAR_UPDATED_KEY", this.f38862f);
        intentPutExtra.getClass();
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intentPutExtra);
        }
        b bVar = this.f38861e;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
        bVar.f(false);
        ((u) this.f38860d.getValue()).d();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    public final void z6(Set<LocalDate> set, Set<LocalDate> set2, LocalDate localDate, boolean z14) {
        LocalDate localDate2;
        LocalDate localDateG;
        xw0.c cVar;
        LocalDate localDateD;
        f12.l.f68084a.getClass();
        f12.l.a.a().T3(true);
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVarU6 = u6();
        RangeCalendar rangeCalendar = this.f38867k;
        if (rangeCalendar == null) {
            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
            throw null;
        }
        Set<LocalDate> pregnancyStartDates = rangeCalendar.getPregnancyStartDates();
        bVarU6.getClass();
        set.getClass();
        localDate.getClass();
        pregnancyStartDates.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((LocalDate) obj).compareTo((ReadablePartial) localDate) <= 0) {
                arrayList.add(obj);
            }
        }
        List listM0 = p13.h0.M0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((LocalDate) obj2).compareTo((ReadablePartial) localDate) <= 0) {
                arrayList2.add(obj2);
            }
        }
        List listM1 = p13.h0.M0(arrayList2);
        if (bVarU6.f38888g == null && p005kotlin.jvm.internal.s.g(listM0, listM1)) {
            cVar = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listM0) {
                if (!listM1.contains((LocalDate) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : listM1) {
                if (!listM0.contains((LocalDate) obj4)) {
                    arrayList4.add(obj4);
                }
            }
            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                localDate2 = (LocalDate) r13.b.e((Comparable) p13.h0.b0(arrayList3), (Comparable) p13.h0.b0(arrayList4));
                localDateG = (LocalDate) r13.b.d((Comparable) p13.h0.m0(arrayList3), (Comparable) p13.h0.m0(arrayList4));
            } else if (!arrayList3.isEmpty()) {
                localDate2 = (LocalDate) p13.h0.b0(arrayList3);
                localDateG = (LocalDate) p13.h0.m0(arrayList3);
            } else if (arrayList4.isEmpty()) {
                localDate2 = null;
                localDateG = null;
            } else {
                localDate2 = (LocalDate) p13.h0.b0(arrayList4);
                localDateG = (LocalDate) p13.h0.m0(arrayList4);
            }
            h0 h0Var = bVarU6.f38888g;
            LocalDate localDate3 = h0Var != null ? h0Var.f23061a : null;
            LocalDate localDate4 = h0Var != null ? h0Var.f23062b : null;
            if (localDate3 != null && localDate4 != null) {
                if (localDate2 == null || localDateG == null) {
                    localDateG = localDate4;
                    localDate2 = localDate3;
                } else {
                    localDate2 = (LocalDate) r13.b.e(localDate3, localDate2);
                    localDateG = (LocalDate) r13.b.d(localDate4, localDateG);
                }
            }
            if (localDate2 == null || localDateG == null) {
                cVar = null;
            } else {
                LocalDate localDateJ = localDate2;
                while (listM1.contains(jg.b.J(localDateJ))) {
                    localDateJ = jg.b.J(localDateJ);
                }
                while (listM1.contains(jg.b.G(localDateG))) {
                    localDateG = jg.b.G(localDateG);
                }
                ArrayList arrayListZ4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.z4(f0.I(localDateJ, localDateG), listM1);
                if (!z14 && arrayListZ4.isEmpty() && arrayList4.isEmpty() && !arrayList3.isEmpty()) {
                    h0 h0Var2 = bVarU6.f38888g;
                    if (!arrayList3.contains(localDateJ) || !arrayList3.contains(localDateG)) {
                        localDateG = jg.b.G(localDateG);
                        listM1 = p13.x.m(localDateG);
                    } else if (h0Var2 != null && arrayList3.contains(h0Var2.f23061a) && arrayList3.contains(h0Var2.f23062b)) {
                        LocalDate localDateNow = LocalDate.now();
                        localDateNow.getClass();
                        localDateG = jg.b.G(localDateNow);
                        listM1 = p13.x.m(localDateG);
                    }
                }
                LocalDate localDate5 = localDateG;
                cVar = new xw0.c(Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), LocalDate.now(), localDateJ, localDate5, DateTime.now(DateTimeZone.UTC), com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b.z4(f0.I(localDateJ, localDate5), listM1), false, 64, null);
                LocalDate localDateF = cVar.getStartDate();
                if (localDateF != null && (localDateD = cVar.getEndDate()) != null) {
                    List<List<LocalDate>> listB = cVar.b();
                    for (LocalDate localDate6 : pregnancyStartDates) {
                        if (localDateF.isBefore(localDate6) || localDateF.isEqual(localDate6)) {
                            if (localDateD.isEqual(localDate6) || localDateD.isAfter(localDate6)) {
                                int iIndexOf = -1;
                                boolean z15 = true;
                                for (List<LocalDate> list : listB) {
                                    if (list.get(0).isBefore(localDate6) || list.get(0).isEqual(localDate6)) {
                                        iIndexOf = listB.indexOf(list);
                                    }
                                    if (list.contains(localDate6)) {
                                        z15 = false;
                                    }
                                }
                                if (z15) {
                                    cVar.b().add(iIndexOf + 1, p13.x.m(localDate6));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (cVar == null) {
            A6(i.a.NORMAL);
            return;
        }
        RangeCalendar rangeCalendar2 = this.f38867k;
        if (rangeCalendar2 == null) {
            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
            throw null;
        }
        LocalDate viewDate = rangeCalendar2.getViewDate();
        g22.e.l(this);
        this.f38864h = true;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVarU7 = u6();
        y0<cx0.a<Unit>> y0Var = bVarU7.f38892k;
        ReentrantLock reentrantLock = bVarU7.f38889h;
        reentrantLock.lock();
        try {
            if (cVar.getStartDate() != null && cVar.getEndDate() != null) {
                bVarU7.f38891j = ge1.b.T(bVarU7, null, null, new hx0.i(bVarU7.f38891j, bVarU7, cVar, null), 3);
            }
            reentrantLock.unlock();
            dh.b.L(y0Var, this, new d(new m1(27, this, viewDate)));
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/a$a;", "", "<init>", "()V", "", "EXIT_ON_SAVE_KEY", "Ljava/lang/String;", "", "CONSENT_REQUEST_CODE", "I", "TAG", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0689a {
        public /* synthetic */ C0689a(j jVar) {
            this();
        }

        private C0689a() {
        }
    }
}
