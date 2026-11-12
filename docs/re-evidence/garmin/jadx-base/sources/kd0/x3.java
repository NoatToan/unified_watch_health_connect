package kd0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/x3;", "Lau0/s;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x3 implements au0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f104447a;

    static {
        new a(null);
        f104447a = Uri.parse("https://connect.garmin.com/live-activity/start");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // au0.s
    public final Object a(v13.c cVar) {
        a4 a4Var;
        Context context;
        int i14;
        if (cVar instanceof a4) {
            a4Var = (a4) cVar;
            int i15 = a4Var.f103982e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                a4Var.f103982e = i15 - Integer.MIN_VALUE;
            } else {
                a4Var = new a4(this, cVar);
            }
        } else {
            a4Var = new a4(this, cVar);
        }
        Object obj = a4Var.f103980c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = a4Var.f103982e;
        if (i16 == 0) {
            o13.r.b(obj);
            Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
            sz0.f.f161394a.getClass();
            if (sz0.f.a.e(47, contextC)) {
                bu0.e eVar = (bu0.e) KoinJavaComponent.get$default(bu0.e.class, null, null, 6, null);
                a4Var.f103978a = contextC;
                a4Var.f103979b = 47;
                a4Var.f103982e = 1;
                Object objA = eVar.a(contextC, null, a4Var);
                if (objA == aVar) {
                    return aVar;
                }
                context = contextC;
                obj = objA;
                i14 = 47;
            }
            return Unit.INSTANCE;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = a4Var.f103979b;
        context = a4Var.f103978a;
        o13.r.b(obj);
        bu0.o oVar = (bu0.o) obj;
        if (oVar != null) {
            zb0.h1.a(context, i14, oVar.f21220a, oVar.f21221b, oVar.f21222c, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (c() == r1) goto L29;
     */
    @Override // au0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(am.x0 x0Var, v13.c cVar) {
        z3 z3Var;
        if (cVar instanceof z3) {
            z3Var = (z3) cVar;
            int i14 = z3Var.f104482d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z3Var.f104482d = i14 - Integer.MIN_VALUE;
            } else {
                z3Var = new z3(this, cVar);
            }
        } else {
            z3Var = new z3(this, cVar);
        }
        Object objD = z3Var.f104480b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = z3Var.f104482d;
        if (i15 == 0) {
            o13.r.b(objD);
            GarminConnectMobileApp.f28685g.getClass();
            if (!GarminConnectMobileApp.a.b().f28689a) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.k(a2Var, "LiveActivityNotificationsProviderImpl", "App is in foreground. Don't show start notification.");
                return Unit.INSTANCE;
            }
            z3Var.f104479a = x0Var;
            z3Var.f104482d = 1;
            objD = d(z3Var);
            if (objD != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            x0Var = z3Var.f104479a;
            o13.r.b(objD);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x0Var = z3Var.f104479a;
            o13.r.b(objD);
        }
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.k(a2Var2, "LiveActivityNotificationsProviderImpl", "Show LIVE_ACTIVITY_START notification");
        String string = contextC.getString(R.string.lbl_live_activity_name_title, dh.b.A(contextC, x0Var.f4360c));
        string.getClass();
        String strConcat = "\u200b\u200c\u200b".concat(string);
        String string2 = contextC.getString(R.string.lbl_live_activity_notification);
        string2.getClass();
        String strConcat2 = "\u200b\u200c\u200b".concat(string2);
        PendingIntent activity = PendingIntent.getActivity(contextC, 0, new Intent("android.intent.action.VIEW", f104447a), 201326592);
        sz0.e eVar = sz0.e.K0;
        z6.q qVar = new z6.q(contextC, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(strConcat);
        qVar.f202684f = z6.q.e(strConcat2);
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(strConcat2);
        qVar.l(oVar);
        qVar.f202691m = 1;
        qVar.f202686h = activity;
        qVar.i(16, true);
        sz0.f.a aVar = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar.getClass();
        sz0.f.a.f(contextC, notificationC, 40, eVar);
        return Unit.INSTANCE;
        if (!((Boolean) objD).booleanValue()) {
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.k(a2Var3, "LiveActivityNotificationsProviderImpl", "User live activity start notification preference is off or unknown.");
            return Unit.INSTANCE;
        }
        z3Var.f104479a = x0Var;
        z3Var.f104482d = 2;
    }

    @Override // au0.s
    public final Unit c() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.k(a2Var, "LiveActivityNotificationsProviderImpl", "Cancel LIVE_ACTIVITY_START notification");
        sz0.f.a aVar = sz0.f.f161394a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        aVar.getClass();
        sz0.f.a.a(40, contextC);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(v13.c cVar) {
        y3 y3Var;
        if (cVar instanceof y3) {
            y3Var = (y3) cVar;
            int i14 = y3Var.f104457c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y3Var.f104457c = i14 - Integer.MIN_VALUE;
            } else {
                y3Var = new y3(this, cVar);
            }
        } else {
            y3Var = new y3(this, cVar);
        }
        Object objB = y3Var.f104455a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y3Var.f104457c;
        if (i15 == 0) {
            o13.r.b(objB);
            dj1.a aVar2 = (dj1.a) KoinJavaComponent.get$default(dj1.a.class, null, null, 6, null);
            y3Var.f104457c = 1;
            objB = aVar2.b(y3Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objB;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "LiveActivityNotificationsProviderImpl", "Error fetching notification settings");
            return Boolean.FALSE;
        }
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "LiveActivityNotificationsProviderImpl", "Successfully fetched notifications data");
        return Boolean.valueOf(((NotificationPreferencesDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).M0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkd0/x3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/net/Uri;", "liveActivityStartLink", "Landroid/net/Uri;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
