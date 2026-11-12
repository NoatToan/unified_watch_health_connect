package sz0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.y2;
import ei0.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import view.NotificationLoadingView;
import yc.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lsz0/u;", "Lcom/garmin/android/apps/connectmobile/e0;", "", "Lcom/garmin/android/apps/connectmobile/notifications/model/NotificationItem;", "Lsz0/k;", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends com.garmin.android.apps.connectmobile.e0<String, NotificationItem> implements k {
    public static final /* synthetic */ int E = 0;
    public final o13.t A;
    public final ve0.b B;
    public final long C;
    public final f.c<Intent> D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w1 f161509r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NotificationLoadingView f161510t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ComposeView f161511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f.c<Object> f161512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.c<o13.p<String, String>> f161513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f161514y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o13.t f161515z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161516a;

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
            f161516a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f161517a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f161517a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f161517a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f161517a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f161518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f161518a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f161518a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f161519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f161520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f161519a = aVar;
            this.f161520b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f161519a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f161520b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f161521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f161521a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f161521a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public u() {
        super(true);
        this.f161509r = new w1(s0.f105811a.b(i0.class), new d(this), new f(this), new e(null, this));
        this.f161514y = new LinkedHashMap();
        this.f161515z = o13.m.b(new sk0.i0(23));
        this.A = o13.m.b(new sk0.i0(24));
        ve0.b bVar = (ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null);
        this.B = bVar;
        this.C = bVar.d().d();
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new s(this, 0));
        cVarRegisterForActivityResult.getClass();
        this.D = cVarRegisterForActivityResult;
    }

    @Override // sz0.k
    public final void A1(uz0.m mVar) {
        ht.a.f85464a.getClass();
        ht.a.a(null, "NotificationConnectionRequestDeleted");
        Long followRequestId = mVar.getFollowRequestId();
        if (followRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        i0 i0VarD7 = d7();
        long jLongValue = followRequestId.longValue();
        t0 t0Var = i0VarD7.f161414b;
        t0Var.getClass();
        o53.f0.N(new ei0.s0(t0Var, jLongValue, null)).f(getViewLifecycleOwner(), new c(new p(this, mVar, 0)));
    }

    @Override // sz0.k
    public final void B(String str, String str2) {
        str.getClass();
        f.c<o13.p<String, String>> cVar = this.f161513x;
        if (cVar != null) {
            cVar.a(new o13.p<>(str, str2), null);
        } else {
            p005kotlin.jvm.internal.s.m("groupDetailActivityLauncher");
            throw null;
        }
    }

    @Override // sz0.k
    public final void D(String str, String str2) {
        tz0.a aVar = (tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        startActivity(aVar.g(contextRequireContext, str, str2));
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        ComposeView composeView = this.f161511v;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("emptyView");
            throw null;
        }
        v22.e.r(composeView, false);
        d7().a();
    }

    @Override // sz0.k
    public final void G0(long j8, Boolean bool, String str) {
        jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        requireContext().startActivity(bVar.x(contextRequireContext, String.valueOf(j8), str, bool));
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void G4() {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.h(contextRequireContext);
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void H3() {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.t(contextRequireContext);
        sn.a.u(this, d7());
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final s51.d<NotificationItem> J6() {
        z zVar = new z(this);
        zVar.f157384e = true;
        return zVar;
    }

    @Override // sz0.k
    public final void K1(long j8, String str, String str2) {
        ConversationActivity.a aVar = ConversationActivity.f44530c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        requireContext().startActivity(ConversationActivity.a.g(contextRequireContext, j8, str, str2));
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void K5(com.garmin.android.apps.connectmobile.smartscale.model.b bVar) {
        i0 i0VarD7 = d7();
        wz0.a aVar = i0VarD7.f161422j;
        int size = aVar.f188129a.size();
        List<NotificationItem> list = aVar.f188129a;
        if (size == 2) {
            list.clear();
        } else {
            Iterator<NotificationItem> it = list.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                NotificationItem next = it.next();
                if ((next instanceof NotificationItem.Request) && p005kotlin.jvm.internal.s.g(((NotificationItem.Request) next).getDeviceInviteDTO(), bVar)) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 < 0 || i14 >= size) {
                return;
            } else {
                list.remove(i14);
            }
        }
        aVar.f188134f = true;
        com.garmin.android.apps.connectmobile.e0.b.a aVar2 = i0VarD7.f34755a;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    @Override // sz0.k
    public final void L0(String str) {
        Context context = getContext();
        if (context != null) {
            context.startActivity(((ub1.g) this.A.getValue()).f(context, str));
        }
    }

    @Override // sz0.k
    public final void L1(NotificationItem.Request request) {
        uz0.b inboxGroupInviteRequestDTO = request.getInboxGroupInviteRequestDTO();
        Long groupId = inboxGroupInviteRequestDTO != null ? inboxGroupInviteRequestDTO.getGroupId() : null;
        Long groupMemberRequestId = inboxGroupInviteRequestDTO != null ? inboxGroupInviteRequestDTO.getGroupMemberRequestId() : null;
        if (groupId == null || groupMemberRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new k0(d7(), groupId.longValue(), groupMemberRequestId.longValue(), null), 3);
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new c(new q(this, request, inboxGroupInviteRequestDTO, 1)));
    }

    @Override // sz0.k
    public final void M2() {
        f.c<Object> cVar = this.f161512w;
        if (cVar != null) {
            cVar.a(null, null);
        } else {
            p005kotlin.jvm.internal.s.m("inboxRequestActivityLauncher");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final u2 M6() {
        S6();
        return new u2(50, 0, false, 0, 0, 0, 58, null);
    }

    @Override // sz0.k
    public final void N0() {
        Context context = getContext();
        if (context != null) {
            context.startActivity(((ub1.g) this.A.getValue()).d(context));
        }
    }

    @Override // sz0.k
    public final void N4(long j8, boolean z14) {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.d(contextRequireContext, j8, z14);
        sn.a.u(this, d7());
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final int S6() {
        d7();
        return 50;
    }

    @Override // sz0.k
    public final void U3() {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.c(contextRequireContext);
        sn.a.u(this, d7());
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final com.garmin.android.apps.connectmobile.e0.b<String, NotificationItem> U6() {
        return d7();
    }

    @Override // sz0.k
    public final void X1(String str) {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.q(contextRequireContext, str);
        sn.a.u(this, d7());
    }

    public final void Y6(uz0.b bVar, vz0.b bVar2) {
        Long groupId = bVar.getGroupId();
        if (groupId != null) {
            long jLongValue = groupId.longValue();
            i0 i0VarD7 = d7();
            y0 y0VarK = xy2.b.K(i0VarD7, new o0(i0VarD7, jLongValue, bVar.getGroupInviteId(), null));
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new c(new rp.b(this, 19, bVar2, bVar)));
        }
    }

    @Override // sz0.k
    public final void a1(ue0.n nVar) {
        i0 i0VarD7 = d7();
        Long f170205j = nVar.getInviteId();
        if (f170205j != null) {
            long jLongValue = f170205j.longValue();
            i0VarD7.f161425m = ge1.b.T(v1.a(i0VarD7), i0VarD7.f161415c.f22991c, null, new p0(i0VarD7, i0VarD7.f161425m, jLongValue, nVar, null), 2);
        } else {
            p2 p2Var = i0VarD7.f161428p;
            fw.m.a aVar = fw.m.f73767e;
            IllegalStateException illegalStateException = new IllegalStateException("Missing invite ID");
            aVar.getClass();
            p2Var.k(null, fw.m.a.a(null, illegalStateException));
        }
    }

    @Override // sz0.k
    public final void a2(long j8, long j14, String str) {
        str.getClass();
        ConversationActivity.a aVar = ConversationActivity.f44530c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String strValueOf = String.valueOf(j14);
        aVar.getClass();
        requireContext().startActivity(ConversationActivity.a.d(contextRequireContext, j8, strValueOf, null, true));
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void a6(NotificationItem.Request request) {
        Long groupId;
        uz0.b inboxGroupInviteRequestDTO = request.getInboxGroupInviteRequestDTO();
        if (inboxGroupInviteRequestDTO == null || (groupId = inboxGroupInviteRequestDTO.getGroupId()) == null) {
            return;
        }
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new j0(d7(), groupId.longValue(), inboxGroupInviteRequestDTO.getGroupInviteId(), null), 3);
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new c(new q(this, request, inboxGroupInviteRequestDTO, 0)));
    }

    @Override // sz0.k
    public final void c1(hl.a.b bVar) {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.f(contextRequireContext, bVar);
        sn.a.u(this, d7());
    }

    public final tz0.a c7() {
        return (tz0.a) this.f161515z.getValue();
    }

    @Override // sz0.k
    public final void d3(ue0.n nVar) {
        i0 i0VarD7 = d7();
        long jD = i0VarD7.f161416d.d().d();
        wz0.a aVar = i0VarD7.f161422j;
        List<NotificationItem> list = aVar.f188129a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (aVar.f188132d - arrayList.size() >= jD) {
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    g.a(contextRequireContext, this.C);
                    return;
                }
                i0 i0VarD8 = d7();
                Long f170205j = nVar.getInviteId();
                if (f170205j != null) {
                    i0VarD8.f161425m = ge1.b.T(v1.a(i0VarD8), i0VarD8.f161415c.f22991c, null, new l0(i0VarD8, i0VarD8.f161425m, f170205j.longValue(), nVar, null), 2);
                    return;
                }
                p2 p2Var = i0VarD8.f161426n;
                fw.m.a aVar2 = fw.m.f73767e;
                IllegalStateException illegalStateException = new IllegalStateException("Missing invite ID");
                aVar2.getClass();
                p2Var.k(null, fw.m.a.a(null, illegalStateException));
                return;
            }
            Object next = it.next();
            NotificationItem notificationItem = (NotificationItem) next;
            if (notificationItem instanceof NotificationItem.Request) {
                NotificationItem.Request request = (NotificationItem.Request) notificationItem;
                if (request.getAccountSharingInviteDTO() == null) {
                    continue;
                } else {
                    ue0.n accountSharingInviteDTO = request.getAccountSharingInviteDTO();
                    ue0.c status = accountSharingInviteDTO != null ? accountSharingInviteDTO.getStatus() : null;
                    int i14 = status == null ? -1 : i0.c.f161432a[status.ordinal()];
                    if (i14 == -1 || i14 == 1) {
                        arrayList.add(next);
                    } else if (i14 != 2) {
                        u0.r();
                        return;
                    }
                }
            }
        }
    }

    @Override // sz0.k
    public final void d6(hl.a.b bVar) {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.l(contextRequireContext, bVar);
        sn.a.u(this, d7());
    }

    public final i0 d7() {
        return (i0) this.f161509r.getValue();
    }

    public final void e7(final long j8) {
        new androidx.appcompat.app.e.a(requireContext()).setTitle(R.string.garmin_coach_plan_deleted).setMessage(R.string.garmin_coach_plan_deleted_message).setPositiveButton(R.string.lbl_ok, new qh1.j(15)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: sz0.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i14 = u.E;
                u uVar = this.f161492a;
                i0 i0VarD7 = uVar.d7();
                long j14 = j8;
                xy2.b.K(i0VarD7, new q0(i0VarD7, j14, true, null)).f(uVar.getViewLifecycleOwner(), new u.c(new bb2.b(uVar, j14, 11)));
            }
        }).create().show();
    }

    @Override // sz0.k
    public final void f0(long j8, String str, boolean z14) {
        ConversationActivity.a aVar = ConversationActivity.f44530c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        requireContext().startActivity(ConversationActivity.a.b(aVar, contextRequireContext, String.valueOf(j8), z14, str, false, 48));
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void h0(hl.a.b bVar, q92.x xVar) {
        xVar.getClass();
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.j(contextRequireContext, bVar, xVar);
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void h3() {
        bv.b.f21239a.getClass();
        bv.c cVarA = bv.b.a();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        ((kd0.m) cVarA).a(mVarRequireActivity, null, 0);
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void j2(long j8, Long l14, uz0.l lVar) {
        ht.a.f85464a.getClass();
        ht.a.a(null, "GarminCoachPremiumContentNotifTapped");
        if (l14 != null && lVar != null) {
            i0 i0VarD7 = d7();
            xy2.b.K(i0VarD7, new n0(i0VarD7, l14.longValue(), null)).f(getViewLifecycleOwner(), new c(new bn0.h(this, j8, l14, lVar, 9)));
        } else if (l14 == null || lVar != null) {
            e7(j8);
        } else {
            g22.e.a(this, null);
        }
    }

    @Override // sz0.k
    public final void j6() {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.e(contextRequireContext);
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void m3(long j8, long j14, String str) {
        ConversationActivity.a aVar = ConversationActivity.f44530c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        requireContext().startActivity(ConversationActivity.a.e(aVar, contextRequireContext, j8, String.valueOf(j14), str, 16));
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void n0(String str) {
        Context context = getContext();
        if (context != null) {
            c7().p(context, str);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.c<Object> cVarRegisterForActivityResult = registerForActivityResult(new w(), new s(this, 2));
        cVarRegisterForActivityResult.getClass();
        this.f161512w = cVarRegisterForActivityResult;
        f.c<o13.p<String, String>> cVarRegisterForActivityResult2 = registerForActivityResult(new v(), new s(this, 1));
        cVarRegisterForActivityResult2.getClass();
        this.f161513x = cVarRegisterForActivityResult2;
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.notifications_fragment);
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerViewT6 = T6();
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i();
        y2.f49767a.getClass();
        iVar.f10317d = e53.c.e(((e53.c) y2.f49768b.getValue()).f63098a);
        iVar.f10318e = e53.c.e(((e53.c) y2.f49769c.getValue()).f63098a);
        recyclerViewT6.setItemAnimator(iVar);
        View viewFindViewById = view2.findViewById(R.id.loading_view);
        viewFindViewById.getClass();
        this.f161510t = (NotificationLoadingView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.notifications_empty_view);
        viewFindViewById2.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById2;
        this.f161511v = composeView;
        composeView.setContent(new z3.e(786184167, true, new t(this, 0)));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        X6(contextRequireContext);
        I6(new s70.b0(this, 14));
        ge1.b.T(o53.f0.w(this), null, null, new x(this, null), 3);
        ge1.b.T(o53.f0.w(this), null, null, new y(this, null), 3);
    }

    @Override // sz0.k
    public final void p1(uz0.m mVar) {
        ht.a.f85464a.getClass();
        ht.a.a(null, "NotificationConnectionRequestAccepted");
        Long followRequestId = mVar.getFollowRequestId();
        if (followRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        i0 i0VarD7 = d7();
        long jLongValue = followRequestId.longValue();
        t0 t0Var = i0VarD7.f161414b;
        t0Var.getClass();
        o53.f0.N(new ei0.r0(t0Var, jLongValue, null)).f(getViewLifecycleOwner(), new c(new p(this, mVar, 1)));
    }

    @Override // sz0.k
    public final void s2(hl.a aVar) {
        aVar.getClass();
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.u(contextRequireContext, aVar);
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void s4(NotificationItem.Request request) {
        uz0.b inboxGroupInviteRequestDTO = request.getInboxGroupInviteRequestDTO();
        Long groupId = inboxGroupInviteRequestDTO != null ? inboxGroupInviteRequestDTO.getGroupId() : null;
        Long groupMemberRequestId = inboxGroupInviteRequestDTO != null ? inboxGroupInviteRequestDTO.getGroupMemberRequestId() : null;
        if (groupId == null || groupMemberRequestId == null) {
            g22.e.a(this, null);
            return;
        }
        i0 i0VarD7 = d7();
        y0 y0VarK = xy2.b.K(i0VarD7, new m0(i0VarD7, groupId.longValue(), groupMemberRequestId.longValue(), null));
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new c(new q(this, request, inboxGroupInviteRequestDTO, 2)));
    }

    @Override // sz0.k
    public final void t5(long j8, boolean z14) {
        View view2;
        Runnable runnable = (Runnable) this.f161514y.get(Long.valueOf(j8));
        if (runnable != null && (view2 = getView()) != null) {
            view2.removeCallbacks(runnable);
        }
        i0 i0VarD7 = d7();
        xy2.b.K(i0VarD7, new q0(i0VarD7, j8, z14, null)).f(getViewLifecycleOwner(), new c(new ba1.b(z14, this, j8)));
    }

    @Override // sz0.k
    public final void u2(long j8, String str) {
        str.getClass();
        ConversationActivity.a aVar = ConversationActivity.f44530c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        requireContext().startActivity(ConversationActivity.a.b(aVar, contextRequireContext, String.valueOf(j8), true, null, true, 32));
        sn.a.u(this, d7());
    }

    @Override // sz0.k
    public final void z() {
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.D.a(aVarC7.a(contextRequireContext), null);
    }

    @Override // sz0.k
    public final void z0(NotificationItem.Request request) {
        uz0.b inboxGroupInviteRequestDTO = request.getInboxGroupInviteRequestDTO();
        if (inboxGroupInviteRequestDTO == null) {
            return;
        }
        if (inboxGroupInviteRequestDTO.getGroupVisibility() != uz0.a.HIDDEN) {
            Y6(inboxGroupInviteRequestDTO, request.getRequestKey());
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        l.a(new sg0.j(this, 9, inboxGroupInviteRequestDTO, request), contextRequireContext);
    }

    @Override // sz0.k
    public final void z4(hl.a.b bVar, q92.x xVar) {
        xVar.getClass();
        tz0.a aVarC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVarC7.n(contextRequireContext, bVar, xVar);
        sn.a.u(this, d7());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsz0/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PENDING_DELETE_MILLI_SECOND", "J", "", "NOT_FOUND_RESPONSE_CODE", "I", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
