package com.garmin.android.apps.connectmobile.connections.groups.details;

import am.r1;
import am.x0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import c2.o3;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import fw.p;
import h0.r0;
import j02.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.g0;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupActivityFeedTypeMainFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f31372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f31373b = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.connections.groups.details.a.class), new j(this), new l(this), new k(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f31374c = new a(new b(), new d(this), new e(this), new f(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f31375d = new g();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$b;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o.f<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a, com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a2) {
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a3 = abstractC0510a;
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a4 = abstractC0510a2;
            abstractC0510a3.getClass();
            abstractC0510a4.getClass();
            return abstractC0510a3.equals(abstractC0510a4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a, com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a2) {
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a3 = abstractC0510a;
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a4 = abstractC0510a2;
            abstractC0510a3.getClass();
            abstractC0510a4.getClass();
            return abstractC0510a3.getClass().equals(abstractC0510a4.getClass()) && abstractC0510a3.getF31471a() == abstractC0510a4.getF31471a();
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a, com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a2) {
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a3 = abstractC0510a2;
            abstractC0510a.getClass();
            abstractC0510a3.getClass();
            return abstractC0510a3;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31390a;

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
            f31390a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.p<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a, Boolean, Unit> {
        public d(Object obj) {
            super(2, obj, GroupActivityFeedTypeMainFragment.class, "updateTypeSelection", "updateTypeSelection(Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeViewModel$ActivityFeedType;Z)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a, Boolean bool) {
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a2 = abstractC0510a;
            boolean zBooleanValue = bool.booleanValue();
            abstractC0510a2.getClass();
            ((com.garmin.android.apps.connectmobile.connections.groups.details.a) ((GroupActivityFeedTypeMainFragment) this.receiver).f31373b.getValue()).x4(abstractC0510a2, zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.l<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b, Unit> {
        public e(Object obj) {
            super(1, obj, GroupActivityFeedTypeMainFragment.class, "onSubTypeClicked", "onSubTypeClicked(Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeViewModel$ActivityFeedType$SubType;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar) {
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar2 = bVar;
            bVar2.getClass();
            GroupActivityFeedTypeMainFragment groupActivityFeedTypeMainFragment = (GroupActivityFeedTypeMainFragment) this.receiver;
            groupActivityFeedTypeMainFragment.getClass();
            Bundle bundleA = h7.c.a(new o13.p("param_sub_type", bVar2));
            NavHostFragment.f10124e.getClass();
            NavHostFragment.a.a(groupActivityFeedTypeMainFragment).g(R.id.action_to_sub_fragment, bundleA);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements e23.l<x0, Unit> {
        public f(Object obj) {
            super(1, obj, GroupActivityFeedTypeMainFragment.class, "onSubTypeBecomeEmpty", "onSubTypeBecomeEmpty(Lcom/garmin/android/apps/connectmobile/activities/ActivityType;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(x0 x0Var) {
            x0 x0Var2 = x0Var;
            x0Var2.getClass();
            GroupActivityFeedTypeMainFragment groupActivityFeedTypeMainFragment = (GroupActivityFeedTypeMainFragment) this.receiver;
            RecyclerView recyclerView = groupActivityFeedTypeMainFragment.f31372a;
            if (recyclerView != null) {
                recyclerView.postDelayed(new r0(20, groupActivityFeedTypeMainFragment, x0Var2), 300L);
                return Unit.INSTANCE;
            }
            s.m("recyclerView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$g", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends b.s {
        public g() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            y0 y0Var;
            com.garmin.android.apps.connectmobile.connections.groups.services.model.a aVarC;
            f(false);
            GroupActivityFeedTypeMainFragment groupActivityFeedTypeMainFragment = GroupActivityFeedTypeMainFragment.this;
            com.garmin.android.apps.connectmobile.connections.groups.details.a aVar = (com.garmin.android.apps.connectmobile.connections.groups.details.a) groupActivityFeedTypeMainFragment.f31373b.getValue();
            GroupDTO groupDTO = aVar.f31465a;
            List<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a> listD = aVar.f31467c.d();
            if (listD == null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "GroupActivityFeedTypeViewModel", "ActivityTypes should not be null");
                y0Var = new y0(groupDTO);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a) obj;
                    if ((abstractC0510a instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) && ((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) abstractC0510a).f31473c) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a) it.next()).getF31471a());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listD) {
                    if (obj2 instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (arrayList2.contains(((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) obj3).f31474b)) {
                        arrayList4.add(obj3);
                    }
                }
                List<x0> listN0 = h0.N0(c0.u(c53.q.c(c0.o(new g0(arrayList4), new r(3)), new o3(16))), r1.n());
                ArrayList arrayList5 = new ArrayList(y.r(listN0, 10));
                for (x0 x0Var : listN0) {
                    ConcurrentHashMap<to.o, x0> concurrentHashMap = aVar.f31469e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<to.o, x0> entry : concurrentHashMap.entrySet()) {
                        if (entry.getValue() == x0Var) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    to.o oVar = (to.o) h0.c0(linkedHashMap.keySet());
                    if (oVar != null) {
                        aVarC = new com.garmin.android.apps.connectmobile.connections.groups.services.model.a();
                        aVarC.f31608b = oVar.j();
                        aVarC.f31607a = String.valueOf(oVar.getTypeId());
                        aVarC.f31609c = oVar.getParentTypeId() != null ? oVar.getParentTypeId().toString() : null;
                        aVarC.f31610d = oVar.getSortOrder() != null ? oVar.getSortOrder().toString() : null;
                    } else {
                        aVarC = com.garmin.android.apps.connectmobile.connections.groups.services.model.a.C(x0Var);
                    }
                    arrayList5.add(aVarC);
                }
                groupDTO.f31577v = arrayList5;
                y0Var = new y0(groupDTO);
            }
            n0 viewLifecycleOwner = groupActivityFeedTypeMainFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0Var, viewLifecycleOwner, new i(new j10.b(groupActivityFeedTypeMainFragment, 1)));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends q implements e23.l<List<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a>, Unit> {
        public h(Object obj) {
            super(1, obj, a.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(List<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a> list) {
            ((a) this.receiver).t(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f31392a;

        public i(e23.l lVar) {
            lVar.getClass();
            this.f31392a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f31392a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31392a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f31393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f31393a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31393a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f31395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, Fragment fragment) {
            super(0);
            this.f31394a = aVar;
            this.f31395b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31394a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31395b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f31396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f31396a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f31396a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setHasFixedSize(true);
        this.f31372a = recyclerView;
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (isAdded()) {
            g22.e.f(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = this.f31372a;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        a aVar = this.f31374c;
        recyclerView.setAdapter(aVar);
        w1 w1Var = this.f31373b;
        dh.b.L(((com.garmin.android.apps.connectmobile.connections.groups.details.a) w1Var.getValue()).f31468d, this, new i(new h(aVar)));
        dh.b.L(((com.garmin.android.apps.connectmobile.connections.groups.details.a) w1Var.getValue()).f31470f, this, new i(new j10.b(this, 0)));
        requireActivity().getOnBackPressedDispatcher().a(this.f31375d);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0011\u0012\u0013BW\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a$a;", "Landroidx/recyclerview/widget/o$f;", "callback", "Lkotlin/Function2;", "", "", "typeSelectionChangeCallback", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;", "subTypeClickedCallback", "Lam/x0;", "onEmptySubTypesCallback", "<init>", "(Landroidx/recyclerview/widget/o$f;Le23/p;Le23/l;Le23/l;)V", "a", "b", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends x<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a, AbstractC0509a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.p<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a, Boolean, Unit> f31376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.l<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b, Unit> f31377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.l<x0, Unit> f31378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31380f;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class AbstractC0509a extends RecyclerView.f0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AbstractC0509a(View view2) {
                super(view2);
                view2.getClass();
            }

            public abstract void d(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a);
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a$b;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a$a;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton;", "button", "Lkotlin/Function2;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a;", "", "", "onSelectionChangedCallback", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton;Le23/p;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends AbstractC0509a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int f31381c = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GCMComplexOneLineButton f31382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e23.p<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a, Boolean, Unit> f31383b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(GCMComplexOneLineButton gCMComplexOneLineButton, e23.p<? super com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a, ? super Boolean, Unit> pVar) {
                super(gCMComplexOneLineButton);
                gCMComplexOneLineButton.getClass();
                pVar.getClass();
                this.f31382a = gCMComplexOneLineButton;
                this.f31383b = pVar;
            }

            @Override // com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment.a.AbstractC0509a
            public final void d(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a) {
                if (abstractC0510a instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) {
                    GCMComplexOneLineButton gCMComplexOneLineButton = this.f31382a;
                    gCMComplexOneLineButton.setOnCheckedChangeListener(null);
                    Context context = gCMComplexOneLineButton.getContext();
                    context.getClass();
                    com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a c0511a = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) abstractC0510a;
                    String strA = dh.b.A(context, c0511a.f31472b.f4360c);
                    TextView textView = gCMComplexOneLineButton.f47762b;
                    textView.setText(strA);
                    textView.setContentDescription(strA);
                    gCMComplexOneLineButton.setRightElement(GCMComplexOneLineButton.a.SWITCH);
                    if (c0511a.f31473c) {
                        gCMComplexOneLineButton.k();
                    } else {
                        gCMComplexOneLineButton.j();
                    }
                    gCMComplexOneLineButton.setOnCheckedChangeListener(new bl0.b(11, this, abstractC0510a));
                }
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a$c;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeMainFragment$a$a;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;", "", "subTypeClickedCallback", "Lam/x0;", "onEmptySubTypesCallback", "<init>", "(Landroid/view/View;Le23/l;Le23/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends AbstractC0509a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ int f31384f = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e23.l<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b, Unit> f31385a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e23.l<x0, Unit> f31386b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f31387c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final TextView f31388d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final View f31389e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(View view2, e23.l<? super com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b, Unit> lVar, e23.l<? super x0, Unit> lVar2) {
                super(view2);
                view2.getClass();
                lVar.getClass();
                lVar2.getClass();
                this.f31385a = lVar;
                this.f31386b = lVar2;
                this.f31387c = (TextView) view2.findViewById(R.id.text1);
                this.f31388d = (TextView) view2.findViewById(R.id.text2);
                View viewFindViewById = view2.findViewById(R.id.icon_end);
                viewFindViewById.getClass();
                viewFindViewById.setVisibility(8);
                this.f31389e = viewFindViewById;
            }

            @Override // com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment.a.AbstractC0509a
            public final void d(com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a) {
                String string;
                if (abstractC0510a instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) {
                    this.itemView.setOnClickListener(new hx0.k(19, this, abstractC0510a));
                    TextView textView = this.f31387c;
                    Context context = textView.getContext();
                    context.getClass();
                    com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) abstractC0510a;
                    List<x0> list = bVar.f31476d;
                    x0 x0Var = bVar.f31474b;
                    textView.setText(context.getString(R.string.social_group_activity_types, dh.b.A(context, x0Var.f4360c)));
                    int size = bVar.f31475c.size();
                    int size2 = list.size();
                    TextView textView2 = this.f31388d;
                    if (size == size2) {
                        string = textView2.getContext().getString(R.string.common_all);
                    } else if (list.isEmpty()) {
                        this.f31386b.invoke(x0Var);
                        string = textView2.getContext().getString(R.string.lbl_none);
                    } else {
                        string = h0.k0(bVar.f31476d, null, null, null, new iz1.f(this, 4), 31);
                    }
                    textView2.setText(string);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o.f<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a> fVar, e23.p<? super com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a, ? super Boolean, Unit> pVar, e23.l<? super com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b, Unit> lVar, e23.l<? super x0, Unit> lVar2) {
            super(fVar);
            fVar.getClass();
            pVar.getClass();
            lVar.getClass();
            lVar2.getClass();
            this.f31376b = pVar;
            this.f31377c = lVar;
            this.f31378d = lVar2;
            this.f31379e = 1;
            this.f31380f = 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i14) {
            return r(i14) instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a ? this.f31379e : this.f31380f;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
            AbstractC0509a abstractC0509a = (AbstractC0509a) f0Var;
            abstractC0509a.getClass();
            list.getClass();
            if (list.isEmpty()) {
                super.onBindViewHolder(abstractC0509a, i14, list);
                return;
            }
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510aR = r(i14);
            abstractC0510aR.getClass();
            abstractC0509a.d(abstractC0510aR);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            if (i14 == this.f31379e) {
                Context context = viewGroup.getContext();
                context.getClass();
                GCMComplexOneLineButton gCMComplexOneLineButton = new GCMComplexOneLineButton(context, null, 0, 6, null);
                gCMComplexOneLineButton.setLayoutParams(new RecyclerView.q(-1, -2));
                return new b(gCMComplexOneLineButton, this.f31376b);
            }
            if (i14 != this.f31380f) {
                vb.h.s("Unsupported viewType");
                return null;
            }
            View viewD = a0.d(viewGroup, R.layout.gcm_row_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) ((16 * viewGroup.getContext().getResources().getDisplayMetrics().density) + 0.5f));
            }
            return new c(viewD, this.f31377c, this.f31378d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            AbstractC0509a abstractC0509a = (AbstractC0509a) f0Var;
            abstractC0509a.getClass();
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510aR = r(i14);
            abstractC0510aR.getClass();
            abstractC0509a.d(abstractC0510aR);
        }
    }
}
