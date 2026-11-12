package jx0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import com.garmin.android.apps.connectmobile.view.pager.PagerTitleNavigationStrip;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o13.p;
import o13.t;
import o53.l1;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ljx0/d;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends Fragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f101418j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f101419a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f101422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f101423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f101424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f101425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f101426h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f101420b = new ReentrantLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f101427i = o13.m.a(o13.n.NONE, new e(this, null, new C1951d(this), null, null));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jx0/d$b", "Landroidx/viewpager/widget/ViewPager$j;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            d dVar = d.this;
            List<jx0.b.a> list = dVar.v6().f101410h;
            if (list.get(i14).f101414c == null) {
                d.A6(dVar, list.get(i14), dVar.f101421c + 1 == i14, 4);
            }
            dVar.f101419a = list.get(i14).f101412a.f23062b;
            dVar.f101421c = i14;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f101429a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f101429a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f101429a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101429a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: jx0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1951d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f101430a;

        public C1951d(Fragment fragment) {
            this.f101430a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f101430a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f101431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f101434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f101435e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f101431a = fragment;
            this.f101432b = qualifier;
            this.f101433c = aVar;
            this.f101434d = aVar2;
            this.f101435e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, jx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f101433c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f101431a;
            e23.a aVar = this.f101434d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f101432b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f101435e, 4, null);
        }
    }

    public d() {
        final int i14 = 0;
        this.f101422d = o13.m.b(new e23.a(this) { // from class: jx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f101417b;

            {
                this.f101417b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                InfiniteViewPager infiniteViewPager;
                PagerTitleNavigationStrip pagerTitleNavigationStrip;
                int i15 = i14;
                d dVar = this.f101417b;
                switch (i15) {
                    case 0:
                        d.a aVar = d.f101418j;
                        View view2 = dVar.getView();
                        if (view2 != null && (infiniteViewPager = (InfiniteViewPager) view2.findViewById(R.id.infinite_view_pager)) != null) {
                            return infiniteViewPager;
                        }
                        vb.h.z("InfiniteViewPager should not be null");
                        return null;
                    case 1:
                        d.a aVar2 = d.f101418j;
                        View view3 = dVar.getView();
                        if (view3 != null && (pagerTitleNavigationStrip = (PagerTitleNavigationStrip) view3.findViewById(R.id.pager_title_strip)) != null) {
                            return pagerTitleNavigationStrip;
                        }
                        vb.h.z("PagerTitleNavigationStrip should not be null");
                        return null;
                    case 2:
                        d.a aVar3 = d.f101418j;
                        return dVar.u6();
                    case 3:
                        d.a aVar4 = d.f101418j;
                        l2.f37135b.getClass();
                        return l2.a.b().c(dVar);
                    default:
                        d.a aVar5 = d.f101418j;
                        Bundle bundle = (Bundle) dVar.f101425g.getValue();
                        if (bundle != null) {
                            return Boolean.valueOf(bundle.getBoolean("AbstractReportViewPagerHasCycle"));
                        }
                        vb.h.z("mHasCycle should not be null");
                        return null;
                }
            }
        });
        final int i15 = 1;
        this.f101423e = o13.m.b(new e23.a(this) { // from class: jx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f101417b;

            {
                this.f101417b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                InfiniteViewPager infiniteViewPager;
                PagerTitleNavigationStrip pagerTitleNavigationStrip;
                int i16 = i15;
                d dVar = this.f101417b;
                switch (i16) {
                    case 0:
                        d.a aVar = d.f101418j;
                        View view2 = dVar.getView();
                        if (view2 != null && (infiniteViewPager = (InfiniteViewPager) view2.findViewById(R.id.infinite_view_pager)) != null) {
                            return infiniteViewPager;
                        }
                        vb.h.z("InfiniteViewPager should not be null");
                        return null;
                    case 1:
                        d.a aVar2 = d.f101418j;
                        View view3 = dVar.getView();
                        if (view3 != null && (pagerTitleNavigationStrip = (PagerTitleNavigationStrip) view3.findViewById(R.id.pager_title_strip)) != null) {
                            return pagerTitleNavigationStrip;
                        }
                        vb.h.z("PagerTitleNavigationStrip should not be null");
                        return null;
                    case 2:
                        d.a aVar3 = d.f101418j;
                        return dVar.u6();
                    case 3:
                        d.a aVar4 = d.f101418j;
                        l2.f37135b.getClass();
                        return l2.a.b().c(dVar);
                    default:
                        d.a aVar5 = d.f101418j;
                        Bundle bundle = (Bundle) dVar.f101425g.getValue();
                        if (bundle != null) {
                            return Boolean.valueOf(bundle.getBoolean("AbstractReportViewPagerHasCycle"));
                        }
                        vb.h.z("mHasCycle should not be null");
                        return null;
                }
            }
        });
        final int i16 = 2;
        this.f101424f = o13.m.b(new e23.a(this) { // from class: jx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f101417b;

            {
                this.f101417b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                InfiniteViewPager infiniteViewPager;
                PagerTitleNavigationStrip pagerTitleNavigationStrip;
                int i17 = i16;
                d dVar = this.f101417b;
                switch (i17) {
                    case 0:
                        d.a aVar = d.f101418j;
                        View view2 = dVar.getView();
                        if (view2 != null && (infiniteViewPager = (InfiniteViewPager) view2.findViewById(R.id.infinite_view_pager)) != null) {
                            return infiniteViewPager;
                        }
                        vb.h.z("InfiniteViewPager should not be null");
                        return null;
                    case 1:
                        d.a aVar2 = d.f101418j;
                        View view3 = dVar.getView();
                        if (view3 != null && (pagerTitleNavigationStrip = (PagerTitleNavigationStrip) view3.findViewById(R.id.pager_title_strip)) != null) {
                            return pagerTitleNavigationStrip;
                        }
                        vb.h.z("PagerTitleNavigationStrip should not be null");
                        return null;
                    case 2:
                        d.a aVar3 = d.f101418j;
                        return dVar.u6();
                    case 3:
                        d.a aVar4 = d.f101418j;
                        l2.f37135b.getClass();
                        return l2.a.b().c(dVar);
                    default:
                        d.a aVar5 = d.f101418j;
                        Bundle bundle = (Bundle) dVar.f101425g.getValue();
                        if (bundle != null) {
                            return Boolean.valueOf(bundle.getBoolean("AbstractReportViewPagerHasCycle"));
                        }
                        vb.h.z("mHasCycle should not be null");
                        return null;
                }
            }
        });
        final int i17 = 3;
        this.f101425g = o13.m.b(new e23.a(this) { // from class: jx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f101417b;

            {
                this.f101417b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                InfiniteViewPager infiniteViewPager;
                PagerTitleNavigationStrip pagerTitleNavigationStrip;
                int i18 = i17;
                d dVar = this.f101417b;
                switch (i18) {
                    case 0:
                        d.a aVar = d.f101418j;
                        View view2 = dVar.getView();
                        if (view2 != null && (infiniteViewPager = (InfiniteViewPager) view2.findViewById(R.id.infinite_view_pager)) != null) {
                            return infiniteViewPager;
                        }
                        vb.h.z("InfiniteViewPager should not be null");
                        return null;
                    case 1:
                        d.a aVar2 = d.f101418j;
                        View view3 = dVar.getView();
                        if (view3 != null && (pagerTitleNavigationStrip = (PagerTitleNavigationStrip) view3.findViewById(R.id.pager_title_strip)) != null) {
                            return pagerTitleNavigationStrip;
                        }
                        vb.h.z("PagerTitleNavigationStrip should not be null");
                        return null;
                    case 2:
                        d.a aVar3 = d.f101418j;
                        return dVar.u6();
                    case 3:
                        d.a aVar4 = d.f101418j;
                        l2.f37135b.getClass();
                        return l2.a.b().c(dVar);
                    default:
                        d.a aVar5 = d.f101418j;
                        Bundle bundle = (Bundle) dVar.f101425g.getValue();
                        if (bundle != null) {
                            return Boolean.valueOf(bundle.getBoolean("AbstractReportViewPagerHasCycle"));
                        }
                        vb.h.z("mHasCycle should not be null");
                        return null;
                }
            }
        });
        final int i18 = 4;
        this.f101426h = o13.m.b(new e23.a(this) { // from class: jx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f101417b;

            {
                this.f101417b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                InfiniteViewPager infiniteViewPager;
                PagerTitleNavigationStrip pagerTitleNavigationStrip;
                int i19 = i18;
                d dVar = this.f101417b;
                switch (i19) {
                    case 0:
                        d.a aVar = d.f101418j;
                        View view2 = dVar.getView();
                        if (view2 != null && (infiniteViewPager = (InfiniteViewPager) view2.findViewById(R.id.infinite_view_pager)) != null) {
                            return infiniteViewPager;
                        }
                        vb.h.z("InfiniteViewPager should not be null");
                        return null;
                    case 1:
                        d.a aVar2 = d.f101418j;
                        View view3 = dVar.getView();
                        if (view3 != null && (pagerTitleNavigationStrip = (PagerTitleNavigationStrip) view3.findViewById(R.id.pager_title_strip)) != null) {
                            return pagerTitleNavigationStrip;
                        }
                        vb.h.z("PagerTitleNavigationStrip should not be null");
                        return null;
                    case 2:
                        d.a aVar3 = d.f101418j;
                        return dVar.u6();
                    case 3:
                        d.a aVar4 = d.f101418j;
                        l2.f37135b.getClass();
                        return l2.a.b().c(dVar);
                    default:
                        d.a aVar5 = d.f101418j;
                        Bundle bundle = (Bundle) dVar.f101425g.getValue();
                        if (bundle != null) {
                            return Boolean.valueOf(bundle.getBoolean("AbstractReportViewPagerHasCycle"));
                        }
                        vb.h.z("mHasCycle should not be null");
                        return null;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o13.l] */
    public static void A6(d dVar, jx0.b.a aVar, boolean z14, int i14) {
        boolean z15 = (i14 & 2) != 0 ? false : z14;
        boolean z16 = (i14 & 4) == 0;
        dVar.getClass();
        LocalDate localDate = (z15 || aVar.f101413b == ww0.k.b.MONTH) ? aVar.f101412a.f23061a : aVar.f101412a.f23062b;
        k kVar = (k) dVar.f101427i.getValue();
        int iY6 = dVar.getF101504k();
        boolean z17 = z15 || aVar.f101413b == ww0.k.b.MONTH;
        ww0.k.b bVar = aVar.f101413b;
        LinkedHashMap linkedHashMap = kVar.f101496d;
        localDate.getClass();
        ReentrantLock reentrantLock = kVar.f101494b;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap2 = kVar.f101495c;
            p pVar = new p(localDate, Integer.valueOf(iY6));
            Object y0Var = linkedHashMap2.get(pVar);
            if (y0Var == null) {
                y0Var = new y0();
                linkedHashMap2.put(pVar, y0Var);
            }
            y0 y0Var2 = (y0) y0Var;
            l1 l1Var = (l1) linkedHashMap.get(new p(localDate, Integer.valueOf(iY6)));
            cx0.a aVar2 = (cx0.a) y0Var2.d();
            ww0.k kVar2 = aVar2 != null ? (ww0.k) aVar2.f56599a : null;
            if ((l1Var == null || !l1Var.isActive()) && (y0Var2.d() == 0 || z16)) {
                linkedHashMap.put(new p(localDate, Integer.valueOf(iY6)), ge1.b.T(kVar, null, null, new j(kVar, localDate, iY6, z17, bVar, y0Var2, kVar2, null), 3));
            }
            reentrantLock.unlock();
            dh.b.L(y0Var2, dVar, new c(new jt1.d(4, dVar, localDate)));
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
    public final void C6(int i14, ww0.k kVar) {
        LocalDate localDatePlusDays;
        ww0.k.b nextReportType;
        if (w6()) {
            localDatePlusDays = kVar.getNextReportDate();
            nextReportType = kVar.getNextReportType();
        } else {
            LocalDate searchDate = kVar.getSearchDate();
            localDatePlusDays = searchDate != null ? jg.b.t(searchDate).plusDays(1) : null;
            nextReportType = ww0.k.b.MONTH;
        }
        int size = v6().f101410h.size();
        ?? r14 = this.f101427i;
        if (localDatePlusDays == null || nextReportType == null || localDatePlusDays.isAfter(LocalDate.now())) {
            if (i14 < size - 1) {
                v6().f(0, Integer.valueOf(i14 + 1));
                ((k) r14.getValue()).f101495c.clear();
                return;
            }
            return;
        }
        if (i14 == size - 1) {
            v6().a(i14 + 1, localDatePlusDays, nextReportType);
            return;
        }
        int i15 = i14 + 1;
        if (localDatePlusDays.equals(v6().f101410h.get(i15).f101412a.f23061a)) {
            return;
        }
        v6().f(0, Integer.valueOf(i15));
        v6().a(i15, localDatePlusDays, nextReportType);
        ((k) r14.getValue()).f101495c.clear();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
    public final void E6(int i14, ww0.k kVar) {
        LocalDate localDateP;
        ww0.k.b prevReportType;
        LocalDate localDateMinusMonths;
        if (w6()) {
            localDateP = kVar.getPrevReportDate();
            prevReportType = kVar.getPrevReportType();
        } else {
            LocalDate searchDate = kVar.getSearchDate();
            localDateP = (searchDate == null || (localDateMinusMonths = searchDate.minusMonths(1)) == null) ? null : jg.b.P(localDateMinusMonths);
            prevReportType = ww0.k.b.MONTH;
        }
        if (localDateP == null || prevReportType == null) {
            if (i14 > 0) {
                v6().f(i14, null);
            }
        } else if (i14 == 0) {
            v6().a(i14, localDateP, prevReportType);
        } else {
            if (localDateP.equals(v6().f101410h.get(i14 - 1).f101412a.f23061a)) {
                return;
            }
            v6().f(i14, null);
            v6().a(0, localDateP, prevReportType);
            ((k) this.f101427i.getValue()).f101495c.clear();
        }
    }

    public final void F6(LocalDate localDate) {
        localDate.getClass();
        if (isAdded()) {
            v6().f101410h.clear();
            v6().a(0, localDate, w6() ? ww0.k.b.CYCLE : ww0.k.b.MONTH);
            v6().notifyDataSetChanged();
            z6().C(0, false);
            A6(this, v6().f101410h.get(0), false, 6);
        }
    }

    public final void G6(LocalDate localDate) {
        localDate.getClass();
        if (isAdded()) {
            int iD = v6().d(localDate);
            if (iD != -1) {
                z6().C(iD, false);
            } else {
                F6(localDate);
            }
        }
    }

    public boolean H6() {
        return !(this instanceof l);
    }

    public final void I6(ww0.k kVar) {
        InfiniteViewPager infiniteViewPagerZ6 = z6();
        v6().notifyDataSetChanged();
        if (kVar != null) {
            jx0.b bVarV6 = v6();
            bVarV6.getClass();
            Iterator<jx0.b.a> it = bVarV6.f101410h.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                } else if (s.g(it.next().f101414c, kVar)) {
                    break;
                } else {
                    i14++;
                }
            }
            infiniteViewPagerZ6.C(i14, false);
        }
        ((PagerTitleNavigationStrip) this.f101423e.getValue()).i(infiniteViewPagerZ6.getCurrentItem());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.date_infinite_view_pager_fragment_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        LocalDate localDate = this.f101419a;
        if (localDate != null) {
            bundle.putString("AbstractReportViewPagerFragmentDate", localDate != null ? localDate.toString() : null);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((PagerTitleNavigationStrip) this.f101423e.getValue()).findViewById(R.id.separator).setVisibility(H6() ? 0 : 8);
        v6().f101411i = this;
        if (this.f101419a == null) {
            if (bundle == null || (string = bundle.getString("AbstractReportViewPagerFragmentDate")) == null) {
                Bundle bundle2 = (Bundle) this.f101425g.getValue();
                string = bundle2 != null ? bundle2.getString("AbstractReportViewPagerFragmentDate") : null;
                if (string == null) {
                    vb.h.z("Can't display page without start date.");
                    return;
                }
            }
            this.f101419a = LocalDate.parse(string);
        }
        i52.a.f91796a.getClass();
        if (i52.a.l() == ww0.a.PREGNANT) {
            jx0.b bVarV6 = v6();
            LocalDate localDate = this.f101419a;
            localDate.getClass();
            bVarV6.a(0, localDate, ww0.k.b.WEEKS);
        } else {
            jx0.b bVarV7 = v6();
            LocalDate localDate2 = this.f101419a;
            localDate2.getClass();
            bVarV7.a(0, localDate2, w6() ? ww0.k.b.CYCLE : ww0.k.b.MONTH);
        }
        z6().setAdapter(v6());
        z6().c(new b());
        A6(this, v6().f101410h.get(0), false, 6);
    }

    public abstract jx0.b u6();

    public final jx0.b v6() {
        return (jx0.b) this.f101424f.getValue();
    }

    public final boolean w6() {
        return ((Boolean) this.f101426h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y6 */
    public abstract int getF101504k();

    public final InfiniteViewPager z6() {
        return (InfiniteViewPager) this.f101422d.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljx0/d$a;", "", "<init>", "()V", "", "DATE_KEY", "Ljava/lang/String;", "HAS_CYCLE_KEY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
