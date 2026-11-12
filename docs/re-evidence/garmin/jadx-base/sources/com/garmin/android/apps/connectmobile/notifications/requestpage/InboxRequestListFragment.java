package com.garmin.android.apps.connectmobile.notifications.requestpage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestListFragment;
import e23.l;
import ei0.r0;
import ei0.t0;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.h;
import o13.m;
import o13.p;
import o13.t;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import sz0.g;
import view.NotificationLoadingView;
import xz0.q;
import xz0.r;
import xz0.u;
import xz0.v;
import yc.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/requestpage/InboxRequestListFragment;", "Lcom/garmin/android/apps/connectmobile/e0;", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/InboxRequestItem;", "Lxz0/a;", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InboxRequestListFragment extends e0<String, InboxRequestItem<?>> implements xz0.a {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w1 f39561r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f.c<p<String, String>> f39562t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public NotificationLoadingView f39563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ve0.b f39564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f39565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f39566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f.c<Intent> f39567z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39568a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39568a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f39569a;

        public c(l lVar) {
            lVar.getClass();
            this.f39569a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f39569a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39569a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39570a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f39570a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39570a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f39572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f39571a = aVar;
            this.f39572b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39571a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39572b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39573a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f39573a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39573a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public InboxRequestListFragment() {
        super(true);
        this.f39561r = new w1(s0.f105811a.b(xz0.p.class), new d(this), new f(this), new e(null, this));
        ve0.b bVar = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
        this.f39564w = bVar;
        this.f39565x = bVar.d().d();
        this.f39566y = m.b(new xh0.d(7));
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new xz0.f(this, 0));
        cVarRegisterForActivityResult.getClass();
        this.f39567z = cVarRegisterForActivityResult;
    }

    @Override // xz0.a
    public final void B(String str, String str2) {
        str.getClass();
        f.c<p<String, String>> cVar = this.f39562t;
        if (cVar != null) {
            cVar.a(new p<>(str, str2), null);
        } else {
            s.m("groupDetailActivityLauncher");
            throw null;
        }
    }

    @Override // xz0.a
    public final void D(String str, String str2) {
        tz0.a aVar = (tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        startActivity(aVar.g(contextRequireContext, str, str2));
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        Y6().a();
    }

    @Override // xz0.a
    public final void I3(InboxRequestItem<?> inboxRequestItem, int i14) {
        ue0.n nVar = (ue0.n) inboxRequestItem.getInboxRequestDTO();
        Long inviteId = nVar != null ? nVar.getInviteId() : null;
        if (inviteId != null) {
            xz0.p pVarY6 = Y6();
            y0 y0VarK = xy2.b.K(pVarY6, new v(pVarY6, inviteId.longValue(), null));
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new c(new xz0.e(this, inboxRequestItem, i14, 4)));
        }
    }

    @Override // xz0.a
    public final void I5(InboxRequestItem<?> inboxRequestItem, int i14) {
        uz0.m mVar = (uz0.m) inboxRequestItem.getInboxRequestDTO();
        ht.a.f85464a.getClass();
        ht.a.a(null, "NotificationConnectionRequestAccepted");
        Long followRequestId = mVar != null ? mVar.getFollowRequestId() : null;
        if (followRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        xz0.p pVarY6 = Y6();
        long jLongValue = followRequestId.longValue();
        t0 t0Var = pVarY6.f192813b;
        t0Var.getClass();
        f0.N(new r0(t0Var, jLongValue, null)).f(getViewLifecycleOwner(), new c(new xz0.e(this, inboxRequestItem, i14, 6)));
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final s51.d<InboxRequestItem<?>> J6() {
        xz0.b bVar = new xz0.b(this);
        bVar.f157384e = true;
        return bVar;
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final u2 M6() {
        S6();
        return new u2(50, 0, false, 0, 0, 0, 58, null);
    }

    @Override // xz0.a
    public final void O0(InboxRequestItem<?> inboxRequestItem, int i14) {
        uz0.b bVar = (uz0.b) inboxRequestItem.getInboxRequestDTO();
        Long groupId = bVar != null ? bVar.getGroupId() : null;
        Long groupMemberRequestId = bVar != null ? bVar.getGroupMemberRequestId() : null;
        if (groupId == null || groupMemberRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        j jVarA = androidx.lifecycle.m.a(null, new xz0.t(Y6(), groupId.longValue(), groupMemberRequestId.longValue(), null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new c(new xz0.e(this, inboxRequestItem, i14, 3)));
    }

    @Override // xz0.a
    public final void Q5(InboxRequestItem<?> inboxRequestItem, int i14) {
        ht.a.f85464a.getClass();
        ht.a.a(null, "NotificationConnectionRequestDeleted");
        uz0.m mVar = (uz0.m) inboxRequestItem.getInboxRequestDTO();
        Long followRequestId = mVar != null ? mVar.getFollowRequestId() : null;
        if (followRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        xz0.p pVarY6 = Y6();
        long jLongValue = followRequestId.longValue();
        t0 t0Var = pVarY6.f192813b;
        t0Var.getClass();
        f0.N(new ei0.s0(t0Var, jLongValue, null)).f(getViewLifecycleOwner(), new c(new xz0.e(this, inboxRequestItem, i14, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final int S6() {
        Y6();
        return 50;
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final e0.b<String, InboxRequestItem<?>> U6() {
        return Y6();
    }

    public final xz0.p Y6() {
        return (xz0.p) this.f39561r.getValue();
    }

    @Override // xz0.a
    public final void b2(InboxRequestItem<?> inboxRequestItem, int i14) {
        Long groupId;
        uz0.b bVar = (uz0.b) inboxRequestItem.getInboxRequestDTO();
        if (bVar == null || (groupId = bVar.getGroupId()) == null) {
            return;
        }
        long jLongValue = groupId.longValue();
        xz0.p pVarY6 = Y6();
        y0 y0VarK = xy2.b.K(pVarY6, new xz0.w(pVarY6, jLongValue, bVar.getGroupInviteId(), null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new c(new xz0.e(this, inboxRequestItem, i14, 1)));
    }

    public final void c7() {
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xz0.a
    public final void i4(InboxRequestItem<?> inboxRequestItem, int i14) {
        ue0.n nVar = (ue0.n) inboxRequestItem.getInboxRequestDTO();
        xz0.p pVarY6 = Y6();
        long jD = pVarY6.f192820i.d().d();
        xz0.c cVar = pVarY6.f192817f;
        List<InboxRequestItem<?>> list = cVar.f192758a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            InboxRequestItem inboxRequestItem2 = (InboxRequestItem) obj;
            if (inboxRequestItem2 instanceof InboxRequestItem.AuthorizedViewerInvites) {
                ue0.c status = ((InboxRequestItem.AuthorizedViewerInvites) inboxRequestItem2).getInboxRequestDTO().getStatus();
                int i15 = status == null ? -1 : xz0.p.b.f192825a[status.ordinal()];
                if (i15 == -1 || i15 == 1) {
                    arrayList.add(obj);
                } else if (i15 != 2) {
                    u0.r();
                    return;
                }
            }
        }
        if (cVar.f192761d - arrayList.size() >= jD) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            g.a(contextRequireContext, this.f39565x);
            return;
        }
        Long inviteId = nVar != null ? nVar.getInviteId() : null;
        if (inviteId != null) {
            xz0.p pVarY7 = Y6();
            y0 y0VarK = xy2.b.K(pVarY7, new r(pVarY7, inviteId.longValue(), null));
            g3 g3Var = (g3) y0VarK.d();
            if ((g3Var != null ? g3Var.f35300a : null) == fw.p.SUCCESS && !pVarY7.f192822k.X3()) {
                ge1.b.T(v1.a(pVarY7), pVarY7.f192823l.f22991c, null, new q(pVarY7, null), 2);
            }
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new c(new xz0.e(this, inboxRequestItem, i14, 2)));
        }
    }

    @Override // xz0.a
    public final void j5(InboxRequestItem<?> inboxRequestItem, int i14) {
        Object inboxRequestDTO = inboxRequestItem.getInboxRequestDTO();
        inboxRequestDTO.getClass();
        xz0.p pVarY6 = Y6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        pVarY6.f192819h.s(contextRequireContext, (com.garmin.android.apps.connectmobile.smartscale.model.b) inboxRequestDTO);
        xz0.p pVarY7 = Y6();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        pVarY7.z4(contextRequireContext2);
        c7();
    }

    @Override // xz0.a
    public final void n5(InboxRequestItem<?> inboxRequestItem, int i14) {
        Object inboxRequestDTO = inboxRequestItem.getInboxRequestDTO();
        inboxRequestDTO.getClass();
        xz0.p pVarY6 = Y6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        pVarY6.f192819h.k(contextRequireContext, (com.garmin.android.apps.connectmobile.smartscale.model.b) inboxRequestDTO);
        xz0.p pVarY7 = Y6();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        pVarY7.y4(contextRequireContext2, inboxRequestItem, false);
        c7();
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.c<p<String, String>> cVarRegisterForActivityResult = registerForActivityResult(new xz0.g(), new xz0.f(this, 1));
        cVarRegisterForActivityResult.getClass();
        this.f39562t = cVarRegisterForActivityResult;
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.inbox_request_list_fragment);
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.loading_view);
        viewFindViewById.getClass();
        this.f39563v = (NotificationLoadingView) viewFindViewById;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        X6(contextRequireContext);
        final int i14 = 0;
        I6(new l(this) { // from class: xz0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxRequestListFragment f192763b;

            {
                this.f192763b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                InboxRequestListFragment inboxRequestListFragment = this.f192763b;
                switch (i15) {
                    case 0:
                        yc.s sVar = (yc.s) obj;
                        int i16 = InboxRequestListFragment.A;
                        sVar.getClass();
                        inboxRequestListFragment.w6();
                        yc.z0 z0Var = sVar.f196385a;
                        if (!(z0Var instanceof yc.z0.b) || inboxRequestListFragment.f34753o) {
                            NotificationLoadingView notificationLoadingView = inboxRequestListFragment.f39563v;
                            if (notificationLoadingView == null) {
                                p005kotlin.jvm.internal.s.m("loadingLayout");
                                throw null;
                            }
                            notificationLoadingView.a();
                            yc.z0 z0Var2 = sVar.f196386b;
                            if (z0Var2 instanceof yc.z0.a) {
                                z0Var = z0Var2;
                            } else if (!(z0Var instanceof yc.z0.a)) {
                                z0Var = sVar.f196387c;
                                if (!(z0Var instanceof yc.z0.a)) {
                                    z0Var = null;
                                }
                            }
                            if (z0Var != null) {
                                g22.e.c(inboxRequestListFragment);
                            }
                        } else {
                            NotificationLoadingView notificationLoadingView2 = inboxRequestListFragment.f39563v;
                            if (notificationLoadingView2 == null) {
                                p005kotlin.jvm.internal.s.m("loadingLayout");
                                throw null;
                            }
                            notificationLoadingView2.animatorSet.start();
                            notificationLoadingView2.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    default:
                        int i17 = InboxRequestListFragment.A;
                        inboxRequestListFragment.c7();
                        return Unit.INSTANCE;
                }
            }
        });
        final int i15 = 1;
        Y6().f192824m.f(getViewLifecycleOwner(), new c(new l(this) { // from class: xz0.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxRequestListFragment f192763b;

            {
                this.f192763b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                InboxRequestListFragment inboxRequestListFragment = this.f192763b;
                switch (i16) {
                    case 0:
                        yc.s sVar = (yc.s) obj;
                        int i17 = InboxRequestListFragment.A;
                        sVar.getClass();
                        inboxRequestListFragment.w6();
                        yc.z0 z0Var = sVar.f196385a;
                        if (!(z0Var instanceof yc.z0.b) || inboxRequestListFragment.f34753o) {
                            NotificationLoadingView notificationLoadingView = inboxRequestListFragment.f39563v;
                            if (notificationLoadingView == null) {
                                p005kotlin.jvm.internal.s.m("loadingLayout");
                                throw null;
                            }
                            notificationLoadingView.a();
                            yc.z0 z0Var2 = sVar.f196386b;
                            if (z0Var2 instanceof yc.z0.a) {
                                z0Var = z0Var2;
                            } else if (!(z0Var instanceof yc.z0.a)) {
                                z0Var = sVar.f196387c;
                                if (!(z0Var instanceof yc.z0.a)) {
                                    z0Var = null;
                                }
                            }
                            if (z0Var != null) {
                                g22.e.c(inboxRequestListFragment);
                            }
                        } else {
                            NotificationLoadingView notificationLoadingView2 = inboxRequestListFragment.f39563v;
                            if (notificationLoadingView2 == null) {
                                p005kotlin.jvm.internal.s.m("loadingLayout");
                                throw null;
                            }
                            notificationLoadingView2.animatorSet.start();
                            notificationLoadingView2.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    default:
                        int i18 = InboxRequestListFragment.A;
                        inboxRequestListFragment.c7();
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // xz0.a
    public final void p6(InboxRequestItem<?> inboxRequestItem, int i14) {
        uz0.b bVar = (uz0.b) inboxRequestItem.getInboxRequestDTO();
        Long groupId = bVar != null ? bVar.getGroupId() : null;
        Long groupMemberRequestId = bVar != null ? bVar.getGroupMemberRequestId() : null;
        if (groupId == null || groupMemberRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        xz0.p pVarY6 = Y6();
        y0 y0VarK = xy2.b.K(pVarY6, new u(pVarY6, groupId.longValue(), groupMemberRequestId.longValue(), null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new c(new xz0.e(this, inboxRequestItem, i14, 7)));
    }

    @Override // xz0.a
    public final void t3(InboxRequestItem<?> inboxRequestItem, int i14) {
        Long groupId;
        uz0.b bVar = (uz0.b) inboxRequestItem.getInboxRequestDTO();
        if (bVar == null || (groupId = bVar.getGroupId()) == null) {
            return;
        }
        j jVarA = androidx.lifecycle.m.a(null, new xz0.s(Y6(), groupId.longValue(), bVar.getGroupInviteId(), null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new c(new xz0.e(this, inboxRequestItem, i14, 5)));
    }

    @Override // xz0.a
    public final void z() {
        tz0.a aVar = (tz0.a) this.f39566y.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f39567z.a(aVar.a(contextRequireContext), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/requestpage/InboxRequestListFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
