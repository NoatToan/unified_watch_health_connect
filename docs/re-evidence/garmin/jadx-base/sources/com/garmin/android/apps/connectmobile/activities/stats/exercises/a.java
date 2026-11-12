package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import e23.l;
import go1.g0;
import h62.j;
import hq.a0;
import hq.b0;
import hq.g;
import hq.r0;
import hq.y;
import hq.z;
import o13.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/a;", "Landroidx/fragment/app/Fragment;", "Landroidx/core/view/s;", "<init>", "()V", "a", "", "selectedSegmentIndex", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0457a f29847i = new C0457a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f29848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f29849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f29850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f29851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f29852e = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.activities.stats.exercises.c.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29853f = m.b(new j(this, 13));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SearchView f29854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f29855h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<com.garmin.android.apps.connectmobile.repcounting.model.d, Unit> {
        public b(Object obj) {
            super(1, obj, a.class, "exerciseOnSelect", "exerciseOnSelect(Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseListItemDTO;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = dVar;
            dVar2.getClass();
            a aVar = (a) this.receiver;
            C0457a c0457a = a.f29847i;
            aVar.u6().f29889f = new r0(dVar2, null, 2, null);
            aVar.requireActivity().getOnBackPressedDispatcher().d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29856a;

        public c(l lVar) {
            lVar.getClass();
            this.f29856a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29856a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29856a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f29857a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29857a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f29859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f29858a = aVar;
            this.f29859b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29858a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29859b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f29860a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29860a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.new_select_exercise_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_search);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        oc.b.G(menuItemFindItem, contextRequireContext, R.color.gcm_icon_primary);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_filter);
        menuItemFindItem2.setVisible(u6().f29904w || u6().f29905x);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        oc.b.G(menuItemFindItem2, contextRequireContext2, R.color.gcm_icon_primary);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_search);
        View actionView = menuItemFindItem3 != null ? menuItemFindItem3.getActionView() : null;
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        if (searchView == null) {
            return;
        }
        searchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        searchView.setMaxWidth(Integer.MAX_VALUE);
        View viewFindViewById = searchView.findViewById(R.id.search_edit_frame);
        viewFindViewById.getClass();
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewFindViewById).getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        View viewFindViewById2 = searchView.findViewById(R.id.search_src_text);
        viewFindViewById2.getClass();
        EditText editText = (EditText) viewFindViewById2;
        editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        String str = u6().f29903v;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("searchHint");
            throw null;
        }
        searchView.setQueryHint(str);
        searchView.setIconifiedByDefault(true);
        searchView.setFocusable(false);
        View viewFindViewById3 = searchView.findViewById(R.id.search_close_btn);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        searchView.setOnSearchClickListener(new g0(imageView, 8));
        searchView.setOnQueryTextListener(new a0(this, searchView, imageView));
        editText.setOnFocusChangeListener(new ew1.l(3, this, menuItemFindItem3));
        this.f29854g = searchView;
        if (u6().f29888e.length() > 0) {
            menuItemFindItem3.expandActionView();
            searchView.j(u6().f29888e);
            u6().f29888e = "";
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        z1 z1Var = (z1) mVarRequireActivity;
        String str = u6().f29902t;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("title");
            throw null;
        }
        z1Var.initActionBar(str, 2);
        z1Var.hideSubtitle();
        return layoutInflater.inflate(R.layout.fragment_new_select_exercise, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        SearchView searchView = this.f29854g;
        CharSequence query = searchView != null ? searchView.getQuery() : null;
        if (query == null || query.length() == 0) {
            return;
        }
        u6().f29888e = query;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        mVarRequireActivity.addMenuProvider(this, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.exercise_filter_chip_group_recycler_view);
        viewFindViewById.getClass();
        this.f29848a = (RecyclerView) viewFindViewById;
        if (!u6().f29893j.isEmpty()) {
            RecyclerView recyclerView = this.f29848a;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("filterChipRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
            linearLayoutManager.setOrientation(0);
            RecyclerView recyclerView2 = this.f29848a;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("filterChipRecyclerView");
                throw null;
            }
            recyclerView2.setLayoutManager(linearLayoutManager);
            g gVar = new g(h0.d1(h0.M0(u6().f29893j)), new z(this, 2));
            this.f29855h = gVar;
            RecyclerView recyclerView3 = this.f29848a;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("filterChipRecyclerView");
                throw null;
            }
            recyclerView3.setAdapter(gVar);
        }
        ((ComposeView) view2.findViewById(R.id.segmented_control_compose_view)).setContent(new z3.e(114070723, true, new y(this, 2)));
        View viewFindViewById2 = view2.findViewById(R.id.exercise_filter_result_count_text_view);
        viewFindViewById2.getClass();
        this.f29849b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.exercise_recycler_view);
        viewFindViewById3.getClass();
        RecyclerView recyclerView4 = (RecyclerView) viewFindViewById3;
        this.f29850c = recyclerView4;
        recyclerView4.setAdapter((b0) this.f29853f.getValue());
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarU6 = u6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c.C4(cVarU6, contextRequireContext, null, null, null, 14);
        View viewFindViewById4 = view2.findViewById(R.id.exercise_empty_view);
        viewFindViewById4.getClass();
        this.f29851d = (ComposeView) viewFindViewById4;
        l2<com.garmin.android.apps.connectmobile.activities.stats.exercises.e> l2Var = u6().f29892i;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(l2Var, viewLifecycleOwner2, new c(new z(this, 1)));
    }

    public final com.garmin.android.apps.connectmobile.activities.stats.exercises.c u6() {
        return (com.garmin.android.apps.connectmobile.activities.stats.exercises.c) this.f29852e.getValue();
    }

    public final void v6() {
        ComposeView composeView = this.f29851d;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("emptyView");
            throw null;
        }
        composeView.setVisibility(0);
        composeView.setContent(new z3.e(-2092424551, true, new y(this, 3)));
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_filter) {
            return false;
        }
        l2<Unit> l2Var = u6().f29891h;
        l2Var.getClass();
        l2Var.m(Unit.INSTANCE);
        return true;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.stats.exercises.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/a$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0457a {
        public /* synthetic */ C0457a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0457a() {
        }
    }
}
