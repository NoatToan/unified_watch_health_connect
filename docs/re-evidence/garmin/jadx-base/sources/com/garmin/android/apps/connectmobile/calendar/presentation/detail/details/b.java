package com.garmin.android.apps.connectmobile.calendar.presentation.detail.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import e23.l;
import e32.p;
import h62.j;
import hy.f;
import hy.k;
import hy.u;
import o13.h;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import sf0.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/b;", "Lsf0/g;", "Lxx/b;", "Lhy/f;", "Lhy/g;", "<init>", "()V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends g<xx.b, f, hy.g> {
    public static final a C = new a(null);
    public MenuItem A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public MenuItem f31206y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public MenuItem f31207z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w1 f31205x = new w1(s0.f105811a.b(fy.a.class), new c(this), new j(this, 20), new d(null, this));
    public final hy.c B = hy.c.f86320b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0500b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f31208a;

        public C0500b(l lVar) {
            lVar.getClass();
            this.f31208a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f31208a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31208a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f31209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f31209a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31209a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f31211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f31210a = aVar;
            this.f31211b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31210a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31211b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.a
    public final p K6(View view2, e32.l lVar) {
        return new f(view2, U6(), lVar);
    }

    @Override // e32.c
    public final int T6() {
        return R.color.surface_background;
    }

    @Override // e32.c
    public final f32.l V6() {
        return ((fy.a) this.f31205x.getValue()).f73859h;
    }

    @Override // g32.c
    public final g32.b<xx.b> X6() {
        return this.B;
    }

    @Override // e32.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.calendar_daily_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_add_event);
        menuItemFindItem.getClass();
        this.f31206y = menuItemFindItem;
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_schedule_a_workout);
        menuItemFindItem2.getClass();
        this.f31207z = menuItemFindItem2;
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_add_trip);
        menuItemFindItem3.getClass();
        this.A = menuItemFindItem3;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_calendar_details_fragment);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_schedule_a_workout) {
            e32.l<NavigatorDestination> lVar = this.f62771i;
            if (lVar != 0) {
                lVar.I8((NavigatorDestination) new u(U6()));
                return true;
            }
            s.m("navigator");
            throw null;
        }
        if (itemId == R.id.menu_item_add_event) {
            e32.l<NavigatorDestination> lVar2 = this.f62771i;
            if (lVar2 != 0) {
                lVar2.I8((NavigatorDestination) new k(U6()));
                return true;
            }
            s.m("navigator");
            throw null;
        }
        if (itemId != R.id.menu_item_add_trip) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            requireActivity().finish();
            return true;
        }
        e32.l<NavigatorDestination> lVar3 = this.f62771i;
        if (lVar3 != 0) {
            lVar3.I8((NavigatorDestination) hy.b.f86319a);
            return true;
        }
        s.m("navigator");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        super.onPrepareOptionsMenu(menu);
        MenuItem menuItem = this.f31206y;
        w1 w1Var = this.f31205x;
        boolean z14 = false;
        if (menuItem != null) {
            menuItem.setVisible(!(((fy.a) w1Var.getValue()).f73852a != null));
        }
        if (this.f31207z != null) {
            MenuItem menuItem2 = this.f31206y;
            if (menuItem2 == null) {
                s.m("addEventMenuItem");
                throw null;
            }
            LocalDate localDate = new LocalDate(U6());
            LocalDate localDate2 = new LocalDate();
            LocalDate localDatePlusYears = new LocalDate().plusYears(1);
            localDatePlusYears.getClass();
            menuItem2.setVisible(((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).d() && j23.g.a.a(new h0(localDate2, localDatePlusYears, 0, 4, null), localDate));
        }
        o13.p<LocalDate, LocalDate> pVarG = ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).G();
        LocalDate localDate3 = pVarG.f128594a;
        LocalDate localDate4 = pVarG.f128595b;
        LocalDate localDate5 = U6().toLocalDate();
        MenuItem menuItem3 = this.A;
        if (menuItem3 == null) {
            s.m("addTripMenuItem");
            throw null;
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        if (k1.f37122a.i() && ((localDate5.isAfter(localDate3) || localDate5.equals(localDate3)) && (localDate5.isBefore(localDate4) || localDate5.equals(localDate4)))) {
            z14 = true;
        }
        menuItem3.setVisible(z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("IS_MOVEMENT_CHIP_SELECTED", ((f) J6()).f86329d.b());
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sf0.g, g32.c, e32.c, e32.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        b00.b.f14135a.getClass();
        b00.b.a.f14137b.f(getViewLifecycleOwner(), new C0500b(new ho0.g(this, 10)));
        if (bundle != null) {
            ((f) J6()).d(bundle.getBoolean("IS_MOVEMENT_CHIP_SELECTED"));
        }
        if (this.f75714o) {
            Y6();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/b$a;", "", "<init>", "()V", "", "IS_MOVEMENT_CHIP_SELECTED", "Ljava/lang/String;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
