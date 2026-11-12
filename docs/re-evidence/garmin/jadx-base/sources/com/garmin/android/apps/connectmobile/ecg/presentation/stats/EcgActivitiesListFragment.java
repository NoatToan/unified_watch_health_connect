package com.garmin.android.apps.connectmobile.ecg.presentation.stats;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivitiesListFragment;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter.EcgFilterActivity;
import e23.l;
import g22.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pf0.f;
import pf0.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgActivitiesListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/c$d;", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgActivitiesListFragment extends Fragment implements com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.ecg.presentation.stats.c f34836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f34837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeRefreshLayout f34838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComposeView f34839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f34840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuItem f34841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f34842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.c<gf0.a> f34843i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/EcgActivitiesListFragment$a", "Landroidx/core/view/s;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements s {
        public a() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.ecg_activities_list_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_filter);
            EcgActivitiesListFragment ecgActivitiesListFragment = EcgActivitiesListFragment.this;
            if (menuItemFindItem != null) {
                Context contextRequireContext = ecgActivitiesListFragment.requireContext();
                contextRequireContext.getClass();
                oc.b.G(menuItemFindItem, contextRequireContext, R.color.gcm_icon_primary);
                menuItemFindItem.setVisible(true);
            } else {
                menuItemFindItem = null;
            }
            ecgActivitiesListFragment.f34841g = menuItemFindItem;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_filter) {
                return false;
            }
            EcgActivitiesListFragment ecgActivitiesListFragment = EcgActivitiesListFragment.this;
            f.c<Intent> cVar = ecgActivitiesListFragment.f34842h;
            EcgFilterActivity.a aVar = EcgFilterActivity.f34906c;
            Context contextRequireContext = ecgActivitiesListFragment.requireContext();
            contextRequireContext.getClass();
            rf0.a aVar2 = (rf0.a) ecgActivitiesListFragment.u6().f137549g.d();
            aVar.getClass();
            Intent intent = new Intent(contextRequireContext, (Class<?>) EcgFilterActivity.class);
            intent.putExtra("EXTRA_FILTER_DATA", aVar2);
            cVar.a(intent, null);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34845a;

        public b(l lVar) {
            lVar.getClass();
            this.f34845a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f34845a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34845a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34846a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f34846a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34846a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f34848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f34847a = aVar;
            this.f34848b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34847a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34848b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f34849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f34849a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34849a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public EcgActivitiesListFragment() {
        super(R.layout.ecg_activities_list);
        this.f34835a = new w1(s0.f105811a.b(y.class), new c(this), new e(this), new d(null, this));
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: pf0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EcgActivitiesListFragment f137475b;

            {
                this.f137475b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                Parcelable parcelable;
                s51.a<gf0.a> aVar;
                switch (i14) {
                    case 0:
                        f.a aVar2 = (f.a) obj;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("EXTRA_FILTER_DATA", rf0.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("EXTRA_FILTER_DATA");
                                if (!(parcelable2 instanceof rf0.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (rf0.a) parcelable2;
                            }
                            rf0.a aVar3 = (rf0.a) parcelable;
                            if (aVar3 != null) {
                                y0<rf0.a> y0Var = this.f137475b.u6().f137548f;
                                if (!aVar3.equals(y0Var.d())) {
                                    y0Var.j(aVar3);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        if (((String) obj) != null && (aVar = this.f137475b.u6().f137547e) != null) {
                            aVar.f157373d.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f34842h = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<gf0.a> cVarRegisterForActivityResult2 = registerForActivityResult(new com.garmin.android.apps.connectmobile.ecg.presentation.stats.a(), new f.b(this) { // from class: pf0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EcgActivitiesListFragment f137475b;

            {
                this.f137475b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                Parcelable parcelable;
                s51.a<gf0.a> aVar;
                switch (i15) {
                    case 0:
                        f.a aVar2 = (f.a) obj;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("EXTRA_FILTER_DATA", rf0.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("EXTRA_FILTER_DATA");
                                if (!(parcelable2 instanceof rf0.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (rf0.a) parcelable2;
                            }
                            rf0.a aVar3 = (rf0.a) parcelable;
                            if (aVar3 != null) {
                                y0<rf0.a> y0Var = this.f137475b.u6().f137548f;
                                if (!aVar3.equals(y0Var.d())) {
                                    y0Var.j(aVar3);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        if (((String) obj) != null && (aVar = this.f137475b.u6().f137547e) != null) {
                            aVar.f157373d.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f34843i = cVarRegisterForActivityResult2;
    }

    @Override // com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.d
    public final void Y0(gf0.a aVar) {
        this.f34843i.a(aVar, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new a(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        this.f34837c = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.swipe_to_refresh);
        viewFindViewById2.getClass();
        this.f34838d = (SwipeRefreshLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.ecg_list_empty);
        viewFindViewById3.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById3;
        this.f34839e = composeView;
        composeView.setContent(new z3.e(831401531, true, new pf0.e(this, 0)));
        View viewFindViewById4 = view2.findViewById(R.id.ecg_filtered_list_empty);
        viewFindViewById4.getClass();
        this.f34840f = viewFindViewById4;
        com.garmin.android.apps.connectmobile.ecg.presentation.stats.c cVar = new com.garmin.android.apps.connectmobile.ecg.presentation.stats.c(this);
        this.f34836b = cVar;
        RecyclerView recyclerView = this.f34837c;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = this.f34837c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        com.garmin.android.apps.connectmobile.ecg.presentation.stats.c cVar2 = this.f34836b;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("listAdapter");
            throw null;
        }
        p.a(recyclerView2, cVar2);
        u6().f137549g.f(getViewLifecycleOwner(), new b(new f(this, 0)));
    }

    public final y u6() {
        return (y) this.f34835a.getValue();
    }
}
