package com.garmin.android.apps.connectmobile.group.details.challenges;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.group.details.challenges.GroupDetailChallengeListFragment;
import com.garmin.android.apps.connectmobile.m0;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import o13.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.u;
import p3.q1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/GroupDetailChallengeListFragment;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$c;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupDetailChallengeListFragment extends m0 implements com.garmin.android.apps.connectmobile.group.details.challenges.d.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f36276m = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f36277h = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.group.details.challenges.c.class), new e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f36278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.group.details.challenges.d f36279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f36280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f36281l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36282a;

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
            f36282a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.d f36283a;

        public c(com.garmin.android.apps.connectmobile.group.details.challenges.d dVar) {
            this.f36283a = dVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return new q(1, this.f36283a, com.garmin.android.apps.connectmobile.group.details.challenges.d.class, "setItems", "setItems(Ljava/util/List;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(Object obj) {
            List list = (List) obj;
            list.getClass();
            com.garmin.android.apps.connectmobile.group.details.challenges.d dVar = this.f36283a;
            dVar.getClass();
            ArrayList arrayList = dVar.f36326f;
            arrayList.clear();
            arrayList.addAll(list);
            dVar.notifyDataSetChanged();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36284a;

        public d(l lVar) {
            lVar.getClass();
            this.f36284a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36284a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36284a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36285a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f36285a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36285a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f36287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f36286a = aVar;
            this.f36287b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36286a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36287b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f36288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f36288a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36288a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public GroupDetailChallengeListFragment() {
        final int i14 = 0;
        this.f36280k = m.b(new e23.a(this) { // from class: pm0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailChallengeListFragment f138624b;

            {
                this.f138624b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                GroupDetailChallengeListFragment groupDetailChallengeListFragment = this.f138624b;
                switch (i15) {
                    case 0:
                        GroupDetailChallengeListFragment.a aVar = GroupDetailChallengeListFragment.f36276m;
                        Bundle arguments = groupDetailChallengeListFragment.getArguments();
                        int i16 = arguments != null ? arguments.getInt("group_challenge_status_type") : -1;
                        com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b.getClass();
                        return (com.garmin.android.apps.connectmobile.group.details.challenges.b) u.L(i16, com.garmin.android.apps.connectmobile.group.details.challenges.b.values());
                    default:
                        GroupDetailChallengeListFragment.a aVar2 = GroupDetailChallengeListFragment.f36276m;
                        Bundle arguments2 = groupDetailChallengeListFragment.getArguments();
                        return Long.valueOf(arguments2 != null ? arguments2.getLong("GCM_extra_connection_group_id") : -1L);
                }
            }
        });
        final int i15 = 1;
        this.f36281l = m.b(new e23.a(this) { // from class: pm0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailChallengeListFragment f138624b;

            {
                this.f138624b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                GroupDetailChallengeListFragment groupDetailChallengeListFragment = this.f138624b;
                switch (i16) {
                    case 0:
                        GroupDetailChallengeListFragment.a aVar = GroupDetailChallengeListFragment.f36276m;
                        Bundle arguments = groupDetailChallengeListFragment.getArguments();
                        int i17 = arguments != null ? arguments.getInt("group_challenge_status_type") : -1;
                        com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b.getClass();
                        return (com.garmin.android.apps.connectmobile.group.details.challenges.b) u.L(i17, com.garmin.android.apps.connectmobile.group.details.challenges.b.values());
                    default:
                        GroupDetailChallengeListFragment.a aVar2 = GroupDetailChallengeListFragment.f36276m;
                        Bundle arguments2 = groupDetailChallengeListFragment.getArguments();
                        return Long.valueOf(arguments2 != null ? arguments2.getLong("GCM_extra_connection_group_id") : -1L);
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        j jVarA = androidx.lifecycle.m.a(null, new pm0.c(((Number) this.f36281l.getValue()).longValue(), (com.garmin.android.apps.connectmobile.group.details.challenges.c) this.f36277h.getValue(), true, null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new d(new q1(this, 19)));
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.c
    public final void W3(GroupChallengeDTO groupChallengeDTO) {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        pm0.a.b(contextRequireContext, groupChallengeDTO);
    }

    @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.c
    public final void g2(com.garmin.android.apps.connectmobile.group.details.challenges.b bVar) {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setHasFixedSize(true);
        this.f36278i = recyclerView;
        return C6(layoutInflater, viewGroup, recyclerView);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        com.garmin.android.apps.connectmobile.group.details.challenges.d dVar = new com.garmin.android.apps.connectmobile.group.details.challenges.d(this, null, null, 6, null);
        this.f36279j = dVar;
        RecyclerView recyclerView = this.f36278i;
        if (recyclerView == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(dVar);
        com.garmin.android.apps.connectmobile.group.details.challenges.c cVar = (com.garmin.android.apps.connectmobile.group.details.challenges.c) this.f36277h.getValue();
        com.garmin.android.apps.connectmobile.group.details.challenges.b bVar = (com.garmin.android.apps.connectmobile.group.details.challenges.b) this.f36280k.getValue();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        com.garmin.android.apps.connectmobile.group.details.challenges.d dVar2 = this.f36279j;
        if (dVar2 == null) {
            s.m("adapter");
            throw null;
        }
        c cVar2 = new c(dVar2);
        int i14 = bVar == null ? -1 : com.garmin.android.apps.connectmobile.group.details.challenges.c.b.f36309a[bVar.ordinal()];
        if (i14 == 1) {
            dh.b.L(cVar.f36306e, viewLifecycleOwner, cVar2);
        } else {
            if (i14 != 2) {
                return;
            }
            dh.b.L(cVar.f36307f, viewLifecycleOwner, cVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/GroupDetailChallengeListFragment$a;", "", "<init>", "()V", "", "EXTRA_GROUP_CHALLENGE_STATUS_TYPE", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
