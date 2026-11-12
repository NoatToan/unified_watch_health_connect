package com.garmin.android.apps.connectmobile.group.details.challenges;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.m0;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.w;
import p3.q1;
import pm0.j;
import pm0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/e;", "Lcom/garmin/android/apps/connectmobile/m0;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$c;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$i;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends m0 implements com.garmin.android.apps.connectmobile.group.details.challenges.d.c, com.garmin.android.apps.connectmobile.group.details.challenges.d.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f36341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f36342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f36343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.group.details.challenges.d f36344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Long> f36345l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36347b;

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
            f36346a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.group.details.challenges.d.h.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_CREATE_CHALLENGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_INVITE_MEMBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f36347b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<List<? extends com.garmin.android.apps.connectmobile.group.details.challenges.a>, Unit> {
        public b(Object obj) {
            super(1, obj, com.garmin.android.apps.connectmobile.group.details.challenges.d.class, "setItems", "setItems(Ljava/util/List;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(List<? extends com.garmin.android.apps.connectmobile.group.details.challenges.a> list) {
            List<? extends com.garmin.android.apps.connectmobile.group.details.challenges.a> list2 = list;
            list2.getClass();
            com.garmin.android.apps.connectmobile.group.details.challenges.d dVar = (com.garmin.android.apps.connectmobile.group.details.challenges.d) this.receiver;
            dVar.getClass();
            ArrayList arrayList = dVar.f36326f;
            arrayList.clear();
            arrayList.addAll(list2);
            dVar.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36348a;

        public c(l lVar) {
            lVar.getClass();
            this.f36348a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f36348a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36348a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36349a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f36349a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36349a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.challenges.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0642e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f36351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0642e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f36350a = aVar;
            this.f36351b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36350a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36351b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f36352a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36352a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f36353a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36353a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f36355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f36354a = aVar;
            this.f36355b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36354a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36355b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36356a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f36356a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36356a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        t0 t0Var = s0.f105811a;
        this.f36341h = new w1(t0Var.b(com.garmin.android.apps.connectmobile.group.details.challenges.c.class), new d(this), new f(this), new C0642e(null, this));
        this.f36342i = new w1(t0Var.b(mm0.e.class), new g(this), new i(this), new h(null, this));
        f.c<Long> cVarRegisterForActivityResult = registerForActivityResult(new k(this), new jp.a(this, 18));
        cVarRegisterForActivityResult.getClass();
        this.f36345l = cVarRegisterForActivityResult;
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.i
    public final void B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h hVar) {
        hVar.getClass();
        int i14 = a.f36347b[hVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return;
            } else {
                this.f36345l.a(Long.valueOf(J6().B4()), null);
                return;
            }
        }
        GroupDetailsDTO groupDetailsDTO = J6().f119507c;
        if (groupDetailsDTO != null) {
            try {
                pm0.a.f138595a.getClass();
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(pm0.a.a(groupDetailsDTO))));
            } catch (ActivityNotFoundException unused) {
                pm0.a.f138595a.getClass();
                Uri uri = Uri.parse(pm0.a.a(groupDetailsDTO));
                uri.getClass();
                g22.e.i(this, uri);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        m.a(null, new pm0.c(J6().B4(), (com.garmin.android.apps.connectmobile.group.details.challenges.c) this.f36341h.getValue(), true, null), 3).f(getViewLifecycleOwner(), new c(new j(this)));
        I6();
    }

    public final void I6() {
        J6().A4(String.valueOf(J6().B4())).f(this, new c(new q1(this, 20)));
    }

    public final mm0.e J6() {
        return (mm0.e) this.f36342i.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.c
    public final void W3(GroupChallengeDTO groupChallengeDTO) {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        pm0.a.b(contextRequireContext, groupChallengeDTO);
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.c
    public final void g2(com.garmin.android.apps.connectmobile.group.details.challenges.b bVar) {
        GroupDetailChallengeListFragment.a aVar = GroupDetailChallengeListFragment.f36276m;
        long jB4 = J6().B4();
        aVar.getClass();
        Bundle bundleA = h7.c.a(new o13.p("GCM_extra_connection_group_id", Long.valueOf(jB4)), new o13.p("group_challenge_status_type", Integer.valueOf(bVar.ordinal())));
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).g(R.id.groupDetailChallengeListFragment, bundleA);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.fragment_group_challenge);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f36343j = recyclerView;
        recyclerView.setHasFixedSize(true);
        com.garmin.android.apps.connectmobile.group.details.challenges.d dVar = new com.garmin.android.apps.connectmobile.group.details.challenges.d(this, this, J6().f119507c);
        this.f36344k = dVar;
        RecyclerView recyclerView2 = this.f36343j;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(dVar);
        long jB4 = J6().B4();
        w1 w1Var = this.f36341h;
        m.a(null, new pm0.c(jB4, (com.garmin.android.apps.connectmobile.group.details.challenges.c) w1Var.getValue(), false, null), 3).f(getViewLifecycleOwner(), new c(new j(this)));
        w0 w0Var = ((com.garmin.android.apps.connectmobile.group.details.challenges.c) w1Var.getValue()).f36305d;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        com.garmin.android.apps.connectmobile.group.details.challenges.d dVar2 = this.f36344k;
        if (dVar2 != null) {
            w0Var.f(viewLifecycleOwner, new c(new b(dVar2)));
        } else {
            s.m("adapter");
            throw null;
        }
    }
}
