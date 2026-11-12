package sz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupNotFoundException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupPrivacyException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupRequestInvitationRemovedException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f161485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotificationItem.Request f161486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uz0.b f161487d;

    public /* synthetic */ q(u uVar, NotificationItem.Request request, uz0.b bVar, int i14) {
        this.f161484a = i14;
        this.f161485b = uVar;
        this.f161486c = request;
        this.f161487d = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        vz0.b requestKey;
        vz0.b requestKey2;
        vz0.b requestKey3;
        int i14 = this.f161484a;
        uz0.b bVar = this.f161487d;
        NotificationItem.Request request = this.f161486c;
        u uVar = this.f161485b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = u.E;
                g3Var.getClass();
                Exception exc = g3Var.f35303d;
                int i16 = u.b.f161516a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.f(uVar);
                    if (exc instanceof GroupNotFoundException) {
                        Context contextRequireContext = uVar.requireContext();
                        contextRequireContext.getClass();
                        g.b(contextRequireContext, m.a.f161454c);
                    } else if (exc instanceof GroupRequestInvitationRemovedException) {
                        Context contextRequireContext2 = uVar.requireContext();
                        contextRequireContext2.getClass();
                        g.b(contextRequireContext2, m.c.f161456c);
                    } else {
                        g22.e.c(uVar);
                    }
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "onAcceptGroupInvite failed, exception: ");
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.p(a2Var, "NotificationsFragment", strD);
                } else if (i16 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, "NotificationsFragment", "onAcceptGroupInvite succeeded");
                    if (uVar.isAdded() && (requestKey = request.getRequestKey()) != null) {
                        i0 i0VarD7 = uVar.d7();
                        Context contextRequireContext3 = uVar.requireContext();
                        contextRequireContext3.getClass();
                        i0VarD7.A4(contextRequireContext3, requestKey, bVar, true);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                int i17 = u.E;
                g3Var.getClass();
                Exception exc2 = g3Var.f35303d;
                int i18 = u.b.f161516a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    g22.e.f(uVar);
                    if (exc2 instanceof GroupNotFoundException) {
                        Context contextRequireContext4 = uVar.requireContext();
                        contextRequireContext4.getClass();
                        g.b(contextRequireContext4, m.a.f161454c);
                    } else if (exc2 instanceof GroupPrivacyException) {
                        Context contextRequireContext5 = uVar.requireContext();
                        contextRequireContext5.getClass();
                        g.b(contextRequireContext5, m.b.f161455c);
                    } else if (exc2 instanceof GroupRequestInvitationRemovedException) {
                        Context contextRequireContext6 = uVar.requireContext();
                        contextRequireContext6.getClass();
                        g.b(contextRequireContext6, m.d.f161457c);
                    } else {
                        g22.e.c(uVar);
                    }
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(exc2, "accept group request failed, exception: ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.p(a2Var3, "NotificationsFragment", strD2);
                } else if (i18 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var4, "NotificationsFragment", "accept group request succeeded");
                    if (uVar.isAdded() && (requestKey2 = request.getRequestKey()) != null) {
                        i0 i0VarD8 = uVar.d7();
                        Context contextRequireContext7 = uVar.requireContext();
                        contextRequireContext7.getClass();
                        i0VarD8.A4(contextRequireContext7, requestKey2, bVar, true);
                    }
                }
                return Unit.INSTANCE;
            default:
                int i19 = u.E;
                g3Var.getClass();
                int i24 = u.b.f161516a[g3Var.f35300a.ordinal()];
                if (i24 == 1) {
                    g22.e.f(uVar);
                    g22.e.c(uVar);
                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "cancel group request failed, exception: ");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.p(a2Var5, "NotificationsFragment", strD3);
                } else if (i24 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var6, "NotificationsFragment", "cancel group request succeeded");
                    if (uVar.isAdded() && (requestKey3 = request.getRequestKey()) != null) {
                        i0 i0VarD9 = uVar.d7();
                        Context contextRequireContext8 = uVar.requireContext();
                        contextRequireContext8.getClass();
                        i0VarD9.A4(contextRequireContext8, requestKey3, bVar, false);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
