package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableAdventuresActivity;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mt0.a2;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.m2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AvailableAdventuresActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/y$b;", "Lot0/b;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AvailableAdventuresActivity extends com.garmin.android.apps.connectmobile.c implements y.b<ot0.b> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f37185l = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRefreshLayout f37187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppBarLayout f37188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f37189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y<ot0.b> f37190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f37191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f37192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f37193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f37194i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37186a = o13.m.a(o13.n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f37195j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f37196k = registerForActivityResult(new g.h(), new jp.a(this, 7));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/AvailableAdventuresActivity$b", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/l0$c;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l0.c {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.l0.c
        public final void a(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.l0.c
        public final void p(String str) {
            str.getClass();
            AvailableAdventuresActivity availableAdventuresActivity = AvailableAdventuresActivity.this;
            f.c<Intent> cVar = availableAdventuresActivity.f37196k;
            BadgeChallengeDetailsActivity.f37204e.getClass();
            cVar.a(BadgeChallengeDetailsActivity.a.a(availableAdventuresActivity, str), null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37198a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f37198a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37198a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37198a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<pt0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f37199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37202d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f37199a = gVar;
            this.f37200b = qualifier;
            this.f37201c = aVar;
            this.f37202d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pt0.n] */
        @Override // e23.a
        public final pt0.n invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f37199a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f37201c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.n.class), f189591b, null, defaultViewModelCreationExtras, this.f37200b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f37202d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.y.b
    public final void Q8(ArrayList arrayList) {
        m2 m2Var;
        pt0.n nVar = (pt0.n) this.f37186a.getValue();
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ot0.b) it.next()).f133719c);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((ot0.c) obj) != ot0.c.ALL) {
                arrayList3.add(obj);
            }
        }
        nVar.getClass();
        o13.t tVar = nVar.f140736c;
        mt0.l0 l0Var = nVar.f140735b;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        l0Var.getClass();
        l0Var.f120697b = arrayList4;
        if (((s51.a) tVar.getValue()).f157372c.d() != s51.e.LOADED || (m2Var = (m2) ((s51.a) tVar.getValue()).f157370a.d()) == null) {
            return;
        }
        m2Var.e().b();
    }

    public final void ca(boolean z14) {
        AppBarLayout appBarLayout = this.f37188c;
        if (appBarLayout == null) {
            p005kotlin.jvm.internal.s.m("appBarLayout");
            throw null;
        }
        if ((appBarLayout.getVisibility() == 0) == z14) {
            return;
        }
        AppBarLayout appBarLayout2 = this.f37188c;
        if (appBarLayout2 == null) {
            p005kotlin.jvm.internal.s.m("appBarLayout");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = appBarLayout2.getLayoutParams();
        LinearLayout linearLayout = this.f37191f;
        if (linearLayout == null) {
            p005kotlin.jvm.internal.s.m("contentContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.getClass();
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams2;
        AppBarLayout appBarLayout3 = this.f37188c;
        if (z14) {
            if (appBarLayout3 == null) {
                p005kotlin.jvm.internal.s.m("appBarLayout");
                throw null;
            }
            appBarLayout3.setVisibility(0);
            layoutParams.height = -2;
            fVar.b(new AppBarLayout.ScrollingViewBehavior());
        } else {
            if (appBarLayout3 == null) {
                p005kotlin.jvm.internal.s.m("appBarLayout");
                throw null;
            }
            appBarLayout3.setVisibility(8);
            layoutParams.height = 0;
            fVar.b(null);
        }
        AppBarLayout appBarLayout4 = this.f37188c;
        if (appBarLayout4 == null) {
            p005kotlin.jvm.internal.s.m("appBarLayout");
            throw null;
        }
        appBarLayout4.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = this.f37191f;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(fVar);
        } else {
            p005kotlin.jvm.internal.s.m("contentContainer");
            throw null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.available_adventures);
        initActionBar(true, getString(R.string.lbl_expeditions));
        View viewFindViewById = findViewById(R.id.swipe_refresh_layout);
        viewFindViewById.getClass();
        this.f37187b = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.app_bar);
        viewFindViewById2.getClass();
        this.f37188c = (AppBarLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.choice_chips);
        viewFindViewById3.getClass();
        this.f37189d = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.content_container);
        viewFindViewById4.getClass();
        this.f37191f = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.recycler_view);
        viewFindViewById5.getClass();
        this.f37192g = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.empty_text);
        viewFindViewById6.getClass();
        this.f37194i = (TextView) viewFindViewById6;
        AppBarLayout appBarLayout = this.f37188c;
        if (appBarLayout == null) {
            p005kotlin.jvm.internal.s.m("appBarLayout");
            throw null;
        }
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new g12.g(this, 1));
        SwipeRefreshLayout swipeRefreshLayout = this.f37187b;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("swipeRefreshView");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new mn2.e(this, 28));
        ca(false);
        y<ot0.b> yVar = new y<>(p13.j0.f134944a, this);
        this.f37190e = yVar;
        RecyclerView recyclerView = this.f37189d;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("choiceChips");
            throw null;
        }
        recyclerView.setAdapter(yVar);
        RecyclerView recyclerView2 = this.f37189d;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("choiceChips");
            throw null;
        }
        recyclerView2.addItemDecoration(new a2(this));
        Object obj = this.f37186a;
        final int i14 = 4;
        ((pt0.n) obj.getValue()).f140735b.f120696a.f(this, new c(new e23.l(this) { // from class: mt0.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableAdventuresActivity f120507b;

            {
                this.f120507b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:106:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x00d2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x00f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:26:0x0093  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                ArrayList arrayListL;
                Iterator it;
                Object next;
                z1 z1Var;
                boolean z14;
                int i15 = i14;
                AvailableAdventuresActivity availableAdventuresActivity = this.f120507b;
                switch (i15) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var = availableAdventuresActivity.f37193h;
                        if (l0Var != null) {
                            l0Var.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var2 = availableAdventuresActivity.f37193h;
                        if (l0Var2 != null) {
                            l0Var2.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout2 = availableAdventuresActivity.f37187b;
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    case 3:
                        Boolean bool = (Boolean) obj2;
                        TextView textView = availableAdventuresActivity.f37194i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyText");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView3 = availableAdventuresActivity.f37192g;
                        if (recyclerView3 != null) {
                            recyclerView3.setVisibility(bool.booleanValue() ? 8 : 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    default:
                        List<ot0.c> list = (List) obj2;
                        AvailableAdventuresActivity.a aVar = AvailableAdventuresActivity.f37185l;
                        if (list.size() > 1) {
                            availableAdventuresActivity.ca(true);
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.y<ot0.b> yVar2 = availableAdventuresActivity.f37190e;
                            if (yVar2 == null) {
                                p005kotlin.jvm.internal.s.m("chipsAdapter");
                                throw null;
                            }
                            androidx.recyclerview.widget.d<T> dVar = yVar2.f10698a;
                            ot0.b.f133718d.getClass();
                            ArrayList<z1> arrayList2 = new ArrayList(p13.y.r(list, 10));
                            for (ot0.c cVar : list) {
                                String string = availableAdventuresActivity.getString(cVar.f133725b);
                                string.getClass();
                                arrayList2.add(new ot0.b(cVar, string, false));
                            }
                            List<T> list2 = dVar.f10426f;
                            list2.getClass();
                            if (!list2.equals(arrayList2)) {
                                if (list2.size() == arrayList2.size()) {
                                    int size = list2.size();
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < size) {
                                            if (((z1) list2.get(i16)).f120948a.equals(((z1) arrayList2.get(i16)).f120948a)) {
                                                i16++;
                                            }
                                        }
                                    }
                                    for (z1 z1Var2 : arrayList2) {
                                        List<T> list3 = dVar.f10426f;
                                        list3.getClass();
                                        it = list3.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list4 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list4);
                                    for (Object obj4 : list4) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                } else {
                                    while (r12.hasNext()) {
                                        List<T> list5 = dVar.f10426f;
                                        list5.getClass();
                                        it = list5.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list6 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list6);
                                    while (r3.hasNext()) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                }
                            }
                        } else {
                            availableAdventuresActivity.ca(false);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        l0 l0Var = new l0(this.f37195j);
        this.f37193h = l0Var;
        RecyclerView recyclerView3 = this.f37192g;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView3.setAdapter(l0Var);
        s51.a aVar = (s51.a) ((pt0.n) obj.getValue()).f140736c.getValue();
        final int i15 = 0;
        aVar.f157370a.f(this, new c(new e23.l(this) { // from class: mt0.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableAdventuresActivity f120507b;

            {
                this.f120507b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:106:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x00d2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x00f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:26:0x0093  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                ArrayList arrayListL;
                Iterator it;
                Object next;
                z1 z1Var;
                boolean z14;
                int i16 = i15;
                AvailableAdventuresActivity availableAdventuresActivity = this.f120507b;
                switch (i16) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var2 = availableAdventuresActivity.f37193h;
                        if (l0Var2 != null) {
                            l0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var3 = availableAdventuresActivity.f37193h;
                        if (l0Var3 != null) {
                            l0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout2 = availableAdventuresActivity.f37187b;
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    case 3:
                        Boolean bool = (Boolean) obj2;
                        TextView textView = availableAdventuresActivity.f37194i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyText");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView4 = availableAdventuresActivity.f37192g;
                        if (recyclerView4 != null) {
                            recyclerView4.setVisibility(bool.booleanValue() ? 8 : 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    default:
                        List<ot0.c> list = (List) obj2;
                        AvailableAdventuresActivity.a aVar2 = AvailableAdventuresActivity.f37185l;
                        if (list.size() > 1) {
                            availableAdventuresActivity.ca(true);
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.y<ot0.b> yVar2 = availableAdventuresActivity.f37190e;
                            if (yVar2 == null) {
                                p005kotlin.jvm.internal.s.m("chipsAdapter");
                                throw null;
                            }
                            androidx.recyclerview.widget.d<T> dVar = yVar2.f10698a;
                            ot0.b.f133718d.getClass();
                            ArrayList<z1> arrayList2 = new ArrayList(p13.y.r(list, 10));
                            for (ot0.c cVar : list) {
                                String string = availableAdventuresActivity.getString(cVar.f133725b);
                                string.getClass();
                                arrayList2.add(new ot0.b(cVar, string, false));
                            }
                            List<T> list2 = dVar.f10426f;
                            list2.getClass();
                            if (!list2.equals(arrayList2)) {
                                if (list2.size() == arrayList2.size()) {
                                    int size = list2.size();
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < size) {
                                            if (((z1) list2.get(i17)).f120948a.equals(((z1) arrayList2.get(i17)).f120948a)) {
                                                i17++;
                                            }
                                        }
                                    }
                                    for (z1 z1Var2 : arrayList2) {
                                        List<T> list5 = dVar.f10426f;
                                        list5.getClass();
                                        it = list5.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list6 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list6);
                                    for (Object obj4 : list6) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                } else {
                                    while (r12.hasNext()) {
                                        List<T> list7 = dVar.f10426f;
                                        list7.getClass();
                                        it = list7.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list8 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list8);
                                    while (r3.hasNext()) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                }
                            }
                        } else {
                            availableAdventuresActivity.ca(false);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 1;
        aVar.f157371b.f(this, new c(new e23.l(this) { // from class: mt0.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableAdventuresActivity f120507b;

            {
                this.f120507b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:106:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x00d2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x00f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:26:0x0093  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                ArrayList arrayListL;
                Iterator it;
                Object next;
                z1 z1Var;
                boolean z14;
                int i17 = i16;
                AvailableAdventuresActivity availableAdventuresActivity = this.f120507b;
                switch (i17) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var2 = availableAdventuresActivity.f37193h;
                        if (l0Var2 != null) {
                            l0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var3 = availableAdventuresActivity.f37193h;
                        if (l0Var3 != null) {
                            l0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout2 = availableAdventuresActivity.f37187b;
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    case 3:
                        Boolean bool = (Boolean) obj2;
                        TextView textView = availableAdventuresActivity.f37194i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyText");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView4 = availableAdventuresActivity.f37192g;
                        if (recyclerView4 != null) {
                            recyclerView4.setVisibility(bool.booleanValue() ? 8 : 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    default:
                        List<ot0.c> list = (List) obj2;
                        AvailableAdventuresActivity.a aVar2 = AvailableAdventuresActivity.f37185l;
                        if (list.size() > 1) {
                            availableAdventuresActivity.ca(true);
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.y<ot0.b> yVar2 = availableAdventuresActivity.f37190e;
                            if (yVar2 == null) {
                                p005kotlin.jvm.internal.s.m("chipsAdapter");
                                throw null;
                            }
                            androidx.recyclerview.widget.d<T> dVar = yVar2.f10698a;
                            ot0.b.f133718d.getClass();
                            ArrayList<z1> arrayList2 = new ArrayList(p13.y.r(list, 10));
                            for (ot0.c cVar : list) {
                                String string = availableAdventuresActivity.getString(cVar.f133725b);
                                string.getClass();
                                arrayList2.add(new ot0.b(cVar, string, false));
                            }
                            List<T> list2 = dVar.f10426f;
                            list2.getClass();
                            if (!list2.equals(arrayList2)) {
                                if (list2.size() == arrayList2.size()) {
                                    int size = list2.size();
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < size) {
                                            if (((z1) list2.get(i18)).f120948a.equals(((z1) arrayList2.get(i18)).f120948a)) {
                                                i18++;
                                            }
                                        }
                                    }
                                    for (z1 z1Var2 : arrayList2) {
                                        List<T> list7 = dVar.f10426f;
                                        list7.getClass();
                                        it = list7.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list8 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list8);
                                    for (Object obj4 : list8) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                } else {
                                    while (r12.hasNext()) {
                                        List<T> list9 = dVar.f10426f;
                                        list9.getClass();
                                        it = list9.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list10 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list10);
                                    while (r3.hasNext()) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                }
                            }
                        } else {
                            availableAdventuresActivity.ca(false);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 2;
        aVar.f157372c.f(this, new c(new e23.l(this) { // from class: mt0.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableAdventuresActivity f120507b;

            {
                this.f120507b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:106:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x00d2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x00f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:26:0x0093  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                ArrayList arrayListL;
                Iterator it;
                Object next;
                z1 z1Var;
                boolean z14;
                int i18 = i17;
                AvailableAdventuresActivity availableAdventuresActivity = this.f120507b;
                switch (i18) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var2 = availableAdventuresActivity.f37193h;
                        if (l0Var2 != null) {
                            l0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var3 = availableAdventuresActivity.f37193h;
                        if (l0Var3 != null) {
                            l0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout2 = availableAdventuresActivity.f37187b;
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    case 3:
                        Boolean bool = (Boolean) obj2;
                        TextView textView = availableAdventuresActivity.f37194i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyText");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView4 = availableAdventuresActivity.f37192g;
                        if (recyclerView4 != null) {
                            recyclerView4.setVisibility(bool.booleanValue() ? 8 : 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    default:
                        List<ot0.c> list = (List) obj2;
                        AvailableAdventuresActivity.a aVar2 = AvailableAdventuresActivity.f37185l;
                        if (list.size() > 1) {
                            availableAdventuresActivity.ca(true);
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.y<ot0.b> yVar2 = availableAdventuresActivity.f37190e;
                            if (yVar2 == null) {
                                p005kotlin.jvm.internal.s.m("chipsAdapter");
                                throw null;
                            }
                            androidx.recyclerview.widget.d<T> dVar = yVar2.f10698a;
                            ot0.b.f133718d.getClass();
                            ArrayList<z1> arrayList2 = new ArrayList(p13.y.r(list, 10));
                            for (ot0.c cVar : list) {
                                String string = availableAdventuresActivity.getString(cVar.f133725b);
                                string.getClass();
                                arrayList2.add(new ot0.b(cVar, string, false));
                            }
                            List<T> list2 = dVar.f10426f;
                            list2.getClass();
                            if (!list2.equals(arrayList2)) {
                                if (list2.size() == arrayList2.size()) {
                                    int size = list2.size();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < size) {
                                            if (((z1) list2.get(i19)).f120948a.equals(((z1) arrayList2.get(i19)).f120948a)) {
                                                i19++;
                                            }
                                        }
                                    }
                                    for (z1 z1Var2 : arrayList2) {
                                        List<T> list9 = dVar.f10426f;
                                        list9.getClass();
                                        it = list9.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list10 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list10);
                                    for (Object obj4 : list10) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                } else {
                                    while (r12.hasNext()) {
                                        List<T> list11 = dVar.f10426f;
                                        list11.getClass();
                                        it = list11.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list12 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list12);
                                    while (r3.hasNext()) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                }
                            }
                        } else {
                            availableAdventuresActivity.ca(false);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 3;
        aVar.f157376g.f(this, new c(new e23.l(this) { // from class: mt0.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AvailableAdventuresActivity f120507b;

            {
                this.f120507b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x00ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:106:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x00d2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0102 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x00f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:26:0x0093  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // e23.l
            public final Object invoke(Object obj2) {
                ArrayList arrayList;
                ArrayList arrayListL;
                Iterator it;
                Object next;
                z1 z1Var;
                boolean z14;
                int i19 = i18;
                AvailableAdventuresActivity availableAdventuresActivity = this.f120507b;
                switch (i19) {
                    case 0:
                        yc.m2 m2Var = (yc.m2) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var2 = availableAdventuresActivity.f37193h;
                        if (l0Var2 != null) {
                            l0Var2.t(m2Var);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 1:
                        s51.e eVar = (s51.e) obj2;
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.l0 l0Var3 = availableAdventuresActivity.f37193h;
                        if (l0Var3 != null) {
                            l0Var3.u(eVar);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("challengesAdapter");
                        throw null;
                    case 2:
                        s51.e eVar2 = (s51.e) obj2;
                        SwipeRefreshLayout swipeRefreshLayout2 = availableAdventuresActivity.f37187b;
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.setRefreshing(eVar2 == s51.e.LOADING);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("swipeRefreshView");
                        throw null;
                    case 3:
                        Boolean bool = (Boolean) obj2;
                        TextView textView = availableAdventuresActivity.f37194i;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("emptyText");
                            throw null;
                        }
                        bool.getClass();
                        textView.setVisibility(bool.booleanValue() ? 0 : 8);
                        RecyclerView recyclerView4 = availableAdventuresActivity.f37192g;
                        if (recyclerView4 != null) {
                            recyclerView4.setVisibility(bool.booleanValue() ? 8 : 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    default:
                        List<ot0.c> list = (List) obj2;
                        AvailableAdventuresActivity.a aVar2 = AvailableAdventuresActivity.f37185l;
                        if (list.size() > 1) {
                            availableAdventuresActivity.ca(true);
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.y<ot0.b> yVar2 = availableAdventuresActivity.f37190e;
                            if (yVar2 == null) {
                                p005kotlin.jvm.internal.s.m("chipsAdapter");
                                throw null;
                            }
                            androidx.recyclerview.widget.d<T> dVar = yVar2.f10698a;
                            ot0.b.f133718d.getClass();
                            ArrayList<z1> arrayList2 = new ArrayList(p13.y.r(list, 10));
                            for (ot0.c cVar : list) {
                                String string = availableAdventuresActivity.getString(cVar.f133725b);
                                string.getClass();
                                arrayList2.add(new ot0.b(cVar, string, false));
                            }
                            List<T> list2 = dVar.f10426f;
                            list2.getClass();
                            if (!list2.equals(arrayList2)) {
                                if (list2.size() == arrayList2.size()) {
                                    int size = list2.size();
                                    int i110 = 0;
                                    while (true) {
                                        if (i110 < size) {
                                            if (((z1) list2.get(i110)).f120948a.equals(((z1) arrayList2.get(i110)).f120948a)) {
                                                i110++;
                                            }
                                        }
                                    }
                                    for (z1 z1Var2 : arrayList2) {
                                        List<T> list11 = dVar.f10426f;
                                        list11.getClass();
                                        it = list11.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list12 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list12);
                                    for (Object obj4 : list12) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                } else {
                                    while (r12.hasNext()) {
                                        List<T> list13 = dVar.f10426f;
                                        list13.getClass();
                                        it = list13.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            z1Var = (z1) next;
                                            if (z1Var != null) {
                                                z14 = z1Var.f120949b;
                                            } else {
                                                z14 = false;
                                            }
                                            z1Var2.f120949b = z14;
                                        } while (!z1Var2.f120948a.equals(((z1) next).f120948a));
                                        z1Var = (z1) next;
                                        if (z1Var != null) {
                                            z14 = z1Var.f120949b;
                                        } else {
                                            z14 = false;
                                        }
                                        z1Var2.f120949b = z14;
                                    }
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.y.u(arrayList2);
                                    arrayList = new ArrayList();
                                    while (r3.hasNext()) {
                                        if (((z1) obj3).f120949b) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    List<T> list14 = dVar.f10426f;
                                    arrayListL = androidx.core.view.j.l(list14);
                                    while (r3.hasNext()) {
                                        if (((z1) obj4).f120949b) {
                                            arrayListL.add(obj4);
                                        }
                                    }
                                    dVar.b(arrayList2, new cd0.v(true ^ arrayList.equals(arrayListL), yVar2, arrayList));
                                }
                            }
                        } else {
                            availableAdventuresActivity.ca(false);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AvailableAdventuresActivity$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
