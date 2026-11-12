package wr;

import am.x0;
import am.z0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.google.android.material.tabs.TabLayout;
import e23.p;
import java.util.Iterator;
import java.util.List;
import nr.t;
import o13.n;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.w;
import ps.o1;
import ps.r;
import qr.o6;
import qs.x;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwr/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f186713g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f186715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SwipeViewPager f186716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TabLayout f186717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<? extends xq.b> f186718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f186719f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wr/e$b", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements TabLayout.OnTabSelectedListener {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabReselected(TabLayout.Tab tab) {
        }

        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, o13.l] */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabSelected(TabLayout.Tab tab) {
            int position = tab != null ? tab.getPosition() : -1;
            e eVar = e.this;
            List<? extends xq.b> list = eVar.f186718e;
            if (list == null || position < 0 || position >= list.size()) {
                return;
            }
            List<? extends xq.b> list2 = eVar.f186718e;
            if (list2 == null) {
                s.m("tabList");
                throw null;
            }
            if (list2.get(position).f191926b) {
                return;
            }
            ((o6) eVar.f186715b.getValue()).f146411a.j(Boolean.FALSE);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsMultiViewFragment$onViewCreated$1", f = "ActivityDetailsMultiViewFragment.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186721a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsMultiViewFragment$onViewCreated$1$1", f = "ActivityDetailsMultiViewFragment.kt", l = {77}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f186724b;

            /* JADX INFO: renamed from: wr.e$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3477a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f186725a;

                public C3477a(e eVar) {
                    this.f186725a = eVar;
                }

                /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:60:0x010f  */
                /* JADX WARN: Code duplicated, block: B:62:0x011a  */
                /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, o13.l] */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    List<? extends xq.b> listA;
                    String str;
                    q13.b bVarB;
                    int iIntValue;
                    T next;
                    Integer noOfSplits;
                    String str2;
                    x0 x0VarH;
                    Long activityId;
                    t.e eVar = (t.e) obj;
                    e eVar2 = this.f186725a;
                    TabLayout tabLayout = eVar2.f186717d;
                    b bVar = eVar2.f186719f;
                    if (tabLayout == null) {
                        s.m("tabLayout");
                        throw null;
                    }
                    tabLayout.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) bVar);
                    TabLayout tabLayout2 = eVar2.f186717d;
                    if (tabLayout2 == null) {
                        s.m("tabLayout");
                        throw null;
                    }
                    tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) bVar);
                    r rVar = eVar.f127331a;
                    if (rVar == null) {
                        listA = j0.f134944a;
                    } else {
                        String str3 = rVar.h().f4358a;
                        List<o1> listT = rVar.t();
                        str3.getClass();
                        x0 x0VarM = z0.m(str3);
                        boolean zD = fr.a.d(listT, x.PACE_PRO_SPLIT);
                        boolean zD2 = fr.a.d(listT, x.PACK_WEIGHT);
                        boolean zD3 = fr.a.d(listT, x0VarM != null ? fr.a.a(x0VarM) : null);
                        if (z0.b(x0.D2, str3) || z0.b(x0.f4308n, str3)) {
                            q13.b bVarB2 = w.b();
                            bVarB2.add(xq.b.LAPS);
                            if (zD3) {
                                bVarB2.add(xq.b.REST);
                            }
                            if (zD) {
                                bVarB2.add(xq.b.PACEPRO);
                            }
                            if (zD2) {
                                bVarB2.add(xq.b.WEIGHT_SPLITS);
                            }
                            listA = w.a(bVarB2);
                        } else if (z0.b(x0.O0, str3)) {
                            q13.b bVarB3 = w.b();
                            bVarB3.add(xq.b.LAPS);
                            bVarB3.add(xq.b.SPLITS);
                            if (zD2) {
                                bVarB3.add(xq.b.WEIGHT_SPLITS);
                            }
                            listA = w.a(bVarB3);
                        } else {
                            z0 z0Var = z0.f4390a;
                            String str4 = "";
                            if (x0VarM == null || (str = x0VarM.f4358a) == null) {
                                str = "";
                            }
                            if (xy2.b.C(z0Var, str)) {
                                bVarB = w.b();
                                bVarB.add(xq.b.LAPS);
                                if (zD2) {
                                    bVarB.add(xq.b.WEIGHT_SPLITS);
                                }
                                listA = w.a(bVarB);
                            } else {
                                if (x0VarM != null && (str2 = x0VarM.f4358a) != null) {
                                    str4 = str2;
                                }
                                if (xy2.b.B(z0Var, str4)) {
                                    bVarB = w.b();
                                    bVarB.add(xq.b.LAPS);
                                    if (zD2) {
                                        bVarB.add(xq.b.WEIGHT_SPLITS);
                                    }
                                    listA = w.a(bVarB);
                                } else if (z0.d0(str3)) {
                                    if (listT != null) {
                                        Iterator<T> it = listT.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = (T) null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!s.g(x.WINDSURF_ACTIVE.f147220a, ((o1) next).getSplitType()));
                                        o1 o1Var = next;
                                        if (o1Var == null || (noOfSplits = o1Var.getNoOfSplits()) == null) {
                                            iIntValue = 0;
                                        } else {
                                            iIntValue = noOfSplits.intValue();
                                        }
                                    } else {
                                        iIntValue = 0;
                                    }
                                    listA = iIntValue >= 5 ? p13.x.k(xq.b.TOP_SPLITS, xq.b.ALL_RUNS, xq.b.ALL_LAPS) : p13.x.k(xq.b.ALL_RUNS_ALTERNATE_TITLE, xq.b.LAPS);
                                } else {
                                    listA = p13.x.k(xq.b.LAPS, xq.b.REST);
                                }
                            }
                        }
                    }
                    eVar2.f186718e = listA;
                    if (listA == null) {
                        s.m("tabList");
                        throw null;
                    }
                    if (!listA.isEmpty()) {
                        long jLongValue = (rVar == null || (activityId = rVar.getActivityId()) == null) ? -1L : activityId.longValue();
                        String str5 = (rVar == null || (x0VarH = rVar.h()) == null) ? null : x0VarH.f4358a;
                        List<? extends xq.b> list = eVar2.f186718e;
                        if (list == null) {
                            s.m("tabList");
                            throw null;
                        }
                        xq.a aVar = new xq.a(this.f186725a, jLongValue, str5, list);
                        SwipeViewPager swipeViewPager = eVar2.f186716c;
                        if (swipeViewPager == null) {
                            s.m("viewPager");
                            throw null;
                        }
                        swipeViewPager.setAdapter(aVar);
                        TabLayout tabLayout3 = eVar2.f186717d;
                        if (tabLayout3 == null) {
                            s.m("tabLayout");
                            throw null;
                        }
                        SwipeViewPager swipeViewPager2 = eVar2.f186716c;
                        if (swipeViewPager2 == null) {
                            s.m("viewPager");
                            throw null;
                        }
                        tabLayout3.setupWithViewPager(swipeViewPager2);
                        SwipeViewPager swipeViewPager3 = eVar2.f186716c;
                        if (swipeViewPager3 == null) {
                            s.m("viewPager");
                            throw null;
                        }
                        swipeViewPager3.c(new wr.f(eVar2));
                        SwipeViewPager swipeViewPager4 = eVar2.f186716c;
                        if (swipeViewPager4 == null) {
                            s.m("viewPager");
                            throw null;
                        }
                        swipeViewPager4.C(((qr.t) eVar2.f186714a.getValue()).E1, false);
                        TabLayout tabLayout4 = eVar2.f186717d;
                        if (tabLayout4 == null) {
                            s.m("tabLayout");
                            throw null;
                        }
                        v22.e.v(tabLayout4, eVar2.getResources().getConfiguration().orientation == 1);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f186724b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f186724b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186723a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    e eVar = this.f186724b;
                    p2 p2Var = ((qr.t) eVar.f186714a.getValue()).S1;
                    C3477a c3477a = new C3477a(eVar);
                    this.f186723a = 1;
                    if (p2Var.collect(c3477a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186721a;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = e.this;
                n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
                a aVar2 = new a(eVar, null);
                this.f186721a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186726a;

        public d(Fragment fragment) {
            this.f186726a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f186726a.requireActivity();
        }
    }

    /* JADX INFO: renamed from: wr.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3478e implements e23.a<qr.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186731e;

        public C3478e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186727a = fragment;
            this.f186728b = qualifier;
            this.f186729c = aVar;
            this.f186730d = aVar2;
            this.f186731e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final qr.t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186729c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186727a;
            e23.a aVar = this.f186730d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qr.t.class), f189591b, null, defaultViewModelCreationExtras, this.f186728b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186731e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186732a;

        public f(Fragment fragment) {
            this.f186732a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f186732a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<o6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186737e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186733a = fragment;
            this.f186734b = qualifier;
            this.f186735c = aVar;
            this.f186736d = aVar2;
            this.f186737e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.o6] */
        @Override // e23.a
        public final o6 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186735c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186733a;
            e23.a aVar = this.f186736d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o6.class), f189591b, null, defaultViewModelCreationExtras, this.f186734b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186737e, 4, null);
        }
    }

    public e() {
        d dVar = new d(this);
        n nVar = n.NONE;
        this.f186714a = o13.m.a(nVar, new C3478e(this, null, dVar, null, null));
        this.f186715b = o13.m.a(nVar, new g(this, null, new f(this), null, null));
        this.f186719f = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.stats_multi_view_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new c(null), 3);
        View viewFindViewById = view2.findViewById(R.id.view_pager);
        viewFindViewById.getClass();
        SwipeViewPager swipeViewPager = (SwipeViewPager) viewFindViewById;
        this.f186716c = swipeViewPager;
        swipeViewPager.setSwipeEnabled(false);
        View viewFindViewById2 = view2.findViewById(R.id.tab_layout);
        viewFindViewById2.getClass();
        this.f186717d = (TabLayout) viewFindViewById2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr/e$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
