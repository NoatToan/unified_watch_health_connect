package xz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupNotFoundException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupPrivacyException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupRequestInvitationRemovedException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.InboxRequestItem;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestListFragment;
import ei0.q0;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InboxRequestListFragment f192765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InboxRequestItem f192766c;

    public /* synthetic */ e(InboxRequestListFragment inboxRequestListFragment, InboxRequestItem inboxRequestItem, int i14, int i15) {
        this.f192764a = i15;
        this.f192765b = inboxRequestListFragment;
        this.f192766c = inboxRequestItem;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f192764a;
        InboxRequestItem<?> inboxRequestItem = this.f192766c;
        InboxRequestListFragment inboxRequestListFragment = this.f192765b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = InboxRequestListFragment.A;
                int i16 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    g22.e.a(inboxRequestListFragment, null);
                } else if (i16 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY6 = inboxRequestListFragment.Y6();
                        Context contextRequireContext = inboxRequestListFragment.requireContext();
                        contextRequireContext.getClass();
                        pVarY6.y4(contextRequireContext, inboxRequestItem, false);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            case 1:
                int i17 = InboxRequestListFragment.A;
                g3Var.getClass();
                int i18 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    g22.e.c(inboxRequestListFragment);
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "onDeclineGroupInvite failed, exception: ");
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.p(a2Var, "InboxRequestListFragment", strD);
                } else if (i18 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, "InboxRequestListFragment", "onDeclineGroupInvite succeeded");
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY7 = inboxRequestListFragment.Y6();
                        Context contextRequireContext2 = inboxRequestListFragment.requireContext();
                        contextRequireContext2.getClass();
                        pVarY7.y4(contextRequireContext2, inboxRequestItem, false);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            case 2:
                int i19 = InboxRequestListFragment.A;
                g3Var.getClass();
                int i24 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i24 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    g22.e.c(inboxRequestListFragment);
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "onAcceptAuthorizedViewerInvite failed, exception: ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.p(a2Var3, "InboxRequestListFragment", strD2);
                } else if (i24 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var4, "InboxRequestListFragment", "onAcceptAuthorizedViewerInvite succeeded");
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY8 = inboxRequestListFragment.Y6();
                        Context contextRequireContext3 = inboxRequestListFragment.requireContext();
                        contextRequireContext3.getClass();
                        pVarY8.y4(contextRequireContext3, inboxRequestItem, true);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            case 3:
                int i25 = InboxRequestListFragment.A;
                g3Var.getClass();
                Exception exc = g3Var.f35303d;
                int i26 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i26 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    if (exc instanceof GroupNotFoundException) {
                        Context contextRequireContext4 = inboxRequestListFragment.requireContext();
                        contextRequireContext4.getClass();
                        sz0.g.b(contextRequireContext4, sz0.m.a.f161454c);
                    } else if (exc instanceof GroupPrivacyException) {
                        Context contextRequireContext5 = inboxRequestListFragment.requireContext();
                        contextRequireContext5.getClass();
                        sz0.g.b(contextRequireContext5, sz0.m.b.f161455c);
                    } else if (exc instanceof GroupRequestInvitationRemovedException) {
                        Context contextRequireContext6 = inboxRequestListFragment.requireContext();
                        contextRequireContext6.getClass();
                        sz0.g.b(contextRequireContext6, sz0.m.d.f161457c);
                    } else {
                        g22.e.c(inboxRequestListFragment);
                    }
                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(exc, "accept group request failed, exception: ");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.p(a2Var5, "InboxRequestListFragment", strD3);
                } else if (i26 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i26 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var6, "InboxRequestListFragment", "accept group request succeeded");
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY9 = inboxRequestListFragment.Y6();
                        Context contextRequireContext7 = inboxRequestListFragment.requireContext();
                        contextRequireContext7.getClass();
                        pVarY9.y4(contextRequireContext7, inboxRequestItem, true);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            case 4:
                int i27 = InboxRequestListFragment.A;
                g3Var.getClass();
                int i28 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i28 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    g22.e.c(inboxRequestListFragment);
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "onDeclineAuthorizedViewerInvite failed, exception: ");
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var7 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.p(a2Var7, "InboxRequestListFragment", strD4);
                } else if (i28 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i28 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var8 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.b(a2Var8, "InboxRequestListFragment", "onDeclineAuthorizedViewerInvite succeeded");
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY10 = inboxRequestListFragment.Y6();
                        Context contextRequireContext8 = inboxRequestListFragment.requireContext();
                        contextRequireContext8.getClass();
                        pVarY10.y4(contextRequireContext8, inboxRequestItem, false);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            case 5:
                int i29 = InboxRequestListFragment.A;
                g3Var.getClass();
                Exception exc2 = g3Var.f35303d;
                int i30 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i30 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    if (exc2 instanceof GroupNotFoundException) {
                        Context contextRequireContext9 = inboxRequestListFragment.requireContext();
                        contextRequireContext9.getClass();
                        sz0.g.b(contextRequireContext9, sz0.m.a.f161454c);
                    } else if (exc2 instanceof GroupRequestInvitationRemovedException) {
                        Context contextRequireContext10 = inboxRequestListFragment.requireContext();
                        contextRequireContext10.getClass();
                        sz0.g.b(contextRequireContext10, sz0.m.c.f161456c);
                    } else {
                        g22.e.c(inboxRequestListFragment);
                    }
                    String strD5 = com.airbnb.lottie.animation.keyframe.a.d(exc2, "onAcceptGroupInvite failed, exception: ");
                    i2.a aVar9 = i2.f36769a;
                    a2 a2Var9 = a2.GENERAL;
                    aVar9.getClass();
                    i2.a.p(a2Var9, "InboxRequestListFragment", strD5);
                } else if (i30 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i30 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    i2.a aVar10 = i2.f36769a;
                    a2 a2Var10 = a2.GENERAL;
                    aVar10.getClass();
                    i2.a.b(a2Var10, "InboxRequestListFragment", "onAcceptGroupInvite succeeded");
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY11 = inboxRequestListFragment.Y6();
                        Context contextRequireContext11 = inboxRequestListFragment.requireContext();
                        contextRequireContext11.getClass();
                        pVarY11.y4(contextRequireContext11, inboxRequestItem, true);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            case 6:
                int i34 = InboxRequestListFragment.A;
                int i35 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i35 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    Context contextRequireContext12 = inboxRequestListFragment.requireContext();
                    contextRequireContext12.getClass();
                    q0.b(contextRequireContext12);
                } else if (i35 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i35 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY12 = inboxRequestListFragment.Y6();
                        Context contextRequireContext13 = inboxRequestListFragment.requireContext();
                        contextRequireContext13.getClass();
                        pVarY12.y4(contextRequireContext13, inboxRequestItem, true);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
            default:
                int i36 = InboxRequestListFragment.A;
                g3Var.getClass();
                int i37 = InboxRequestListFragment.b.f39568a[g3Var.f35300a.ordinal()];
                if (i37 == 1) {
                    g22.e.f(inboxRequestListFragment);
                    g22.e.c(inboxRequestListFragment);
                    String strD6 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "cancel group request failed, exception: ");
                    i2.a aVar11 = i2.f36769a;
                    a2 a2Var11 = a2.GENERAL;
                    aVar11.getClass();
                    i2.a.p(a2Var11, "InboxRequestListFragment", strD6);
                } else if (i37 == 2) {
                    g22.e.l(inboxRequestListFragment);
                } else {
                    if (i37 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(inboxRequestListFragment);
                    i2.a aVar12 = i2.f36769a;
                    a2 a2Var12 = a2.GENERAL;
                    aVar12.getClass();
                    i2.a.b(a2Var12, "InboxRequestListFragment", "cancel group request succeeded");
                    if (inboxRequestListFragment.isAdded()) {
                        p pVarY13 = inboxRequestListFragment.Y6();
                        Context contextRequireContext14 = inboxRequestListFragment.requireContext();
                        contextRequireContext14.getClass();
                        pVarY13.y4(contextRequireContext14, inboxRequestItem, false);
                    }
                    inboxRequestListFragment.c7();
                }
                return Unit.INSTANCE;
        }
    }
}
