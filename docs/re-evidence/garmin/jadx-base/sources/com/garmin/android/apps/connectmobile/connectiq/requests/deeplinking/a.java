package com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import d53.t;
import d53.u;
import d53.w;
import e23.l;
import e23.s;
import java.util.List;
import java.util.Set;
import o53.c0;
import o53.s0;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.h0;
import t10.m;
import t10.n;
import z6.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/deeplinking/a;", "Lak2/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements ak2.a.InterfaceC0062a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0518a f31960b = new C0518a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f31961c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31962a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<Intent, Unit> {
        public b(Object obj) {
            super(1, obj, a.class, "handleIntent", "handleIntent(Landroid/content/Intent;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Intent intent) {
            Intent intent2 = intent;
            intent2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.b(intent2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements s<String, String, String, sz0.e, PendingIntent, Unit> {
        public c(Object obj) {
            super(5, obj, a.class, "showNotification", "showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/notifications/GCMNotificationChannel;Landroid/app/PendingIntent;)V", 0);
        }

        @Override // e23.s
        public final Unit invoke(String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            sz0.e eVar2 = eVar;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            eVar2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.d(str4, str5, str6, eVar2, pendingIntent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<Intent, Unit> {
        public d(Object obj) {
            super(1, obj, a.class, "handleIntent", "handleIntent(Landroid/content/Intent;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Intent intent) {
            Intent intent2 = intent;
            intent2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.b(intent2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements s<String, String, String, sz0.e, PendingIntent, Unit> {
        public e(Object obj) {
            super(5, obj, a.class, "showNotification", "showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/notifications/GCMNotificationChannel;Landroid/app/PendingIntent;)V", 0);
        }

        @Override // e23.s
        public final Unit invoke(String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            sz0.e eVar2 = eVar;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            eVar2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.d(str4, str5, str6, eVar2, pendingIntent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements l<Intent, Unit> {
        public f(Object obj) {
            super(1, obj, a.class, "handleIntent", "handleIntent(Landroid/content/Intent;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Intent intent) {
            Intent intent2 = intent;
            intent2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.b(intent2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends q implements s<String, String, String, sz0.e, PendingIntent, Unit> {
        public g(Object obj) {
            super(5, obj, a.class, "showNotification", "showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/notifications/GCMNotificationChannel;Landroid/app/PendingIntent;)V", 0);
        }

        @Override // e23.s
        public final Unit invoke(String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            sz0.e eVar2 = eVar;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            eVar2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.d(str4, str5, str6, eVar2, pendingIntent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends q implements l<Intent, Unit> {
        public h(Object obj) {
            super(1, obj, a.class, "handleIntent", "handleIntent(Landroid/content/Intent;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Intent intent) {
            Intent intent2 = intent;
            intent2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.b(intent2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class i extends q implements s<String, String, String, sz0.e, PendingIntent, Unit> {
        public i(Object obj) {
            super(5, obj, a.class, "showNotification", "showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/notifications/GCMNotificationChannel;Landroid/app/PendingIntent;)V", 0);
        }

        @Override // e23.s
        public final Unit invoke(String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            sz0.e eVar2 = eVar;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            eVar2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.d(str4, str5, str6, eVar2, pendingIntent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class j extends q implements l<Intent, Unit> {
        public j(Object obj) {
            super(1, obj, a.class, "handleIntent", "handleIntent(Landroid/content/Intent;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Intent intent) {
            Intent intent2 = intent;
            intent2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.b(intent2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class k extends q implements s<String, String, String, sz0.e, PendingIntent, Unit> {
        public k(Object obj) {
            super(5, obj, a.class, "showNotification", "showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/notifications/GCMNotificationChannel;Landroid/app/PendingIntent;)V", 0);
        }

        @Override // e23.s
        public final Unit invoke(String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            sz0.e eVar2 = eVar;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            eVar2.getClass();
            a aVar = (a) this.receiver;
            C0518a c0518a = a.f31960b;
            aVar.d(str4, str5, str6, eVar2, pendingIntent);
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f31961c = gt2.b.f79005a.h("#ProtobufDeepLinking");
    }

    public a(Context context) {
        context.getClass();
        this.f31962a = context;
    }

    @Override // ak2.a.InterfaceC0062a
    public final void a(Uri uri, rs2.c cVar) {
        cVar.getClass();
        c(uri, cVar);
    }

    public final void b(Intent intent) {
        Context context = this.f31962a;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0454  */
    public final void c(Uri uri, rs2.c cVar) {
        GarminConnectMobileApp.f28685g.getClass();
        boolean z14 = GarminConnectMobileApp.a.b().f28689a;
        boolean z15 = !z14;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        new t10.g();
        uri.getClass();
        if (u.q(uri.getScheme(), "connectIQ", true) && uri.getPathSegments().contains("monetization")) {
            return;
        }
        Context context = this.f31962a;
        m mVar = new m(context);
        c80.q qVarA = null;
        if (uri.getPathSegments().contains("trainingPlan")) {
            b bVar = new b(this);
            c cVar2 = new c(this);
            ht.a.f85464a.getClass();
            ht.a.a(null, "GarminCoachDeepLinkedFromDevice");
            if (!z14) {
                intent.addFlags(268435456);
                bVar.invoke(intent);
                return;
            }
            Context context2 = mVar.f161699a;
            String string = context2.getString(R.string.lbl_adaptive_training_plan);
            String strD = p6.b.d(context2, R.string.open_connect_to_train_with_coach, string);
            String string2 = context2.getString(R.string.open_connect_to_train_with_coach);
            string2.getClass();
            sz0.e eVar = sz0.e.F;
            PendingIntent activity = PendingIntent.getActivity(context2, 0, intent, 201326592);
            activity.getClass();
            cVar2.invoke(string, strD, string2, eVar, activity);
            return;
        }
        t10.a aVar = new t10.a(context);
        String path = uri.getPath();
        if (path != null && w.z(path, "/payment/add", false)) {
            Context context3 = aVar.f161674a;
            if (!z14) {
                intent.setFlags(268435456);
                context3.startActivity(intent);
                return;
            }
            eo2.d dVar = eo2.d.f64794a;
            String strValueOf = String.valueOf(intent.getData());
            String strValueOf2 = String.valueOf(intent.getData());
            dVar.getClass();
            eo2.d.d(strValueOf, strValueOf2);
            GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
            kj0.a.b bVar2 = kj0.a.b.f104932a;
            aVar2.getClass();
            PendingIntent activity2 = PendingIntent.getActivity(context3, 0, GarminPayLaunchScreenActivity.a.a(context3, bVar2), 201326592);
            activity2.getClass();
            sz0.e eVar2 = sz0.e.F;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            String string3 = context3.getString(R.string.wallet_concept);
            String strD2 = p6.b.d(context3, R.string.complete_setup_your_garmin_wallet, string3);
            z6.q qVar = new z6.q(context3, eVar2.f161386a);
            qVar.N.icon = 2131232010;
            qVar.f202683e = z6.q.e(string3);
            qVar.f202684f = z6.q.e(strD2);
            o oVar = new o();
            oVar.f202664e = z6.q.e(strD2);
            qVar.l(oVar);
            qVar.f202691m = 1;
            qVar.f202686h = activity2;
            qVar.i(16, true);
            Notification notificationC = qVar.c();
            notificationC.getClass();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(context3, notificationC, iCurrentTimeMillis, eVar2);
            return;
        }
        t10.o oVar2 = new t10.o(context);
        if (uri.getPathSegments().contains("workout")) {
            if (!z14) {
                Context context4 = oVar2.f161710a;
                if (intent.resolveActivity(context4.getPackageManager()) != null) {
                    intent.setFlags(268435456);
                    context4.startActivity(intent);
                    return;
                }
                return;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str : queryParameterNames) {
                if (str.equals("getConfirmation")) {
                    builderClearQuery.appendQueryParameter("getConfirmation", BooleanUtils.FALSE);
                } else {
                    builderClearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
            Uri uriBuild = builderClearQuery.build();
            uriBuild.getClass();
            intent.setData(uriBuild);
            n.a aVar3 = n.f161700e;
            String queryParameter = uri.getQueryParameter("action");
            aVar3.getClass();
            n nVarA = n.a.a(queryParameter);
            int i14 = t10.o.a.f161711a[nVarA.ordinal()];
            if (i14 == 1) {
                oVar2.a(intent, nVarA, uri.getQueryParameter("workoutName"));
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    oVar2.a(intent, nVarA, null);
                    return;
                }
                return;
            }
        }
        t10.e eVar3 = new t10.e(context);
        if (uri.getPathSegments().contains("event")) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "EventDeepLinkedFromDevice");
            Context context5 = eVar3.f161684a;
            if (!z14) {
                if (intent.resolveActivity(context5.getPackageManager()) != null) {
                    intent.setFlags(268435456);
                    context5.startActivity(intent);
                    return;
                }
                return;
            }
            t10.d.a aVar4 = t10.d.f161677c;
            String queryParameter2 = uri.getQueryParameter("action");
            aVar4.getClass();
            t10.d dVarA = t10.d.a.a(queryParameter2);
            if (dVarA != t10.d.VIEW) {
                t10.e.f161683b.error("Action does not match. Action received is " + dVarA.name());
                return;
            }
            PendingIntent activity3 = PendingIntent.getActivity(context5, 0, intent, 201326592);
            activity3.getClass();
            sz0.e eVar4 = sz0.e.F;
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            String string4 = context5.getString(dVarA.f161681a);
            string4.getClass();
            String string5 = context5.getString(dVarA.f161682b);
            string5.getClass();
            z6.q qVar2 = new z6.q(context5, eVar4.f161386a);
            qVar2.N.icon = 2131232010;
            qVar2.f202683e = z6.q.e(string4);
            qVar2.f202684f = z6.q.e(string5);
            o oVar3 = new o();
            oVar3.f202664e = z6.q.e(string5);
            qVar2.l(oVar3);
            qVar2.f202691m = 1;
            qVar2.f202686h = activity3;
            qVar2.i(16, true);
            Notification notificationC2 = qVar2.c();
            notificationC2.getClass();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(context5, notificationC2, iCurrentTimeMillis2, eVar4);
            return;
        }
        t10.k kVar = new t10.k(context);
        if (uri.getPathSegments().contains("running-economy")) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "RunningEconomy");
            Context context6 = kVar.f161696a;
            if (!z14) {
                if (intent.resolveActivity(context6.getPackageManager()) != null) {
                    intent.setFlags(268435456);
                    context6.startActivity(intent);
                    return;
                }
                return;
            }
            t10.j.a aVar5 = t10.j.f161689c;
            String queryParameter3 = uri.getQueryParameter("action");
            aVar5.getClass();
            t10.j jVarA = t10.j.a.a(queryParameter3);
            if (jVarA != t10.j.HELP) {
                t10.k.f161695b.error("Action does not match. Action received is " + jVarA.name());
                return;
            }
            PendingIntent activity4 = PendingIntent.getActivity(context6, 0, intent, 201326592);
            activity4.getClass();
            sz0.e eVar5 = sz0.e.F;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            String string6 = context6.getString(jVarA.f161693a);
            string6.getClass();
            String string7 = context6.getString(jVarA.f161694b);
            string7.getClass();
            z6.q qVar3 = new z6.q(context6, eVar5.f161386a);
            qVar3.N.icon = 2131232010;
            qVar3.f202683e = z6.q.e(string6);
            qVar3.f202684f = z6.q.e(string7);
            o oVar4 = new o();
            oVar4.f202664e = z6.q.e(string7);
            qVar3.l(oVar4);
            qVar3.f202691m = 1;
            qVar3.f202686h = activity4;
            qVar3.i(16, true);
            Notification notificationC3 = qVar3.c();
            notificationC3.getClass();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(context6, notificationC3, iCurrentTimeMillis3, eVar5);
            return;
        }
        t10.c cVar3 = new t10.c(context);
        String string8 = uri.toString();
        string8.getClass();
        if (w.z(string8, "/phone-features/contacts", false)) {
            if (z14) {
                return;
            }
            ContactActivity.a aVar6 = ContactActivity.T;
            Context context7 = cVar3.f161676a;
            Intent intentA = ContactActivity.a.a(aVar6, context7, false, 0, null, 50, false, null, 104);
            intentA.setFlags(268435456);
            context7.startActivity(intentA);
            return;
        }
        t10.i iVar = new t10.i(context);
        sw2.b.f161096a.getClass();
        boolean zG = p005kotlin.jvm.internal.s.g(uri.getHost(), "launch");
        Logger logger = f31961c;
        if (zG) {
            List<String> pathSegments = uri.getPathSegments();
            pathSegments.getClass();
            if (p005kotlin.jvm.internal.s.g(h0.b0(pathSegments), "devicesetting")) {
                logger.trace("Received RTS redirection deep link proto: " + uri);
                if (cVar != null) {
                    d dVar2 = new d(this);
                    e eVar6 = new e(this);
                    x53.c cVar4 = s0.f129406a;
                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.b(uri, iVar, cVar, z15, eVar6, dVar2, null), 3);
                    return;
                }
                return;
            }
        }
        t10.f fVar = new t10.f(context);
        if (uri.getPathSegments().contains("lifestyle-logging")) {
            zd1.a.f204221a.getClass();
            Context context8 = fVar.f161685a;
            Intent intent2 = new Intent(context8, (Class<?>) LifestyleLoggingActivity.class);
            new zd1.a.C3809a(intent2);
            Unit unit = Unit.INSTANCE;
            intent2.setFlags(268435456);
            context8.startActivity(intent2);
            return;
        }
        t10.b bVar3 = new t10.b(context);
        if (p005kotlin.jvm.internal.s.g(uri.getHost(), "launch")) {
            List<String> pathSegments2 = uri.getPathSegments();
            pathSegments2.getClass();
            if (p005kotlin.jvm.internal.s.g(h0.b0(pathSegments2), "alipayappletinstallation")) {
                logger.info("Received " + uri + " as an Alipay installation request");
                if (cVar == null) {
                    return;
                }
                String queryParameter4 = uri.getQueryParameter("device_id");
                if (queryParameter4 != null) {
                    long f92746j = cVar.getF92746j();
                    Long lJ = t.j(queryParameter4);
                    if (lJ == null || f92746j != lJ.longValue()) {
                        logger.warn(n23.j.d(cVar.getF92746j(), "Received device_id = ", queryParameter4, ", but it does not equal to "));
                    }
                } else {
                    logger.warn(n23.j.d(cVar.getF92746j(), "Received device_id = ", queryParameter4, ", but it does not equal to "));
                }
                bVar3.a(cVar.getF92746j(), z15, new f(this), new g(this));
                return;
            }
        }
        t10.l lVar = new t10.l(context, null, 2, null);
        if (!uri.getPathSegments().contains("subscription")) {
            t10.h hVar = new t10.h(context);
            if (uri.getPathSegments().contains("nutrition")) {
                hVar.a(uri, z15, new j(this), new k(this));
                return;
            }
            if (!z14) {
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                b(intent);
                return;
            }
            String string9 = context.getString(R.string.lbl_notification_from_device_title);
            String strD3 = p6.b.d(context, R.string.lbl_notification_from_device_subtitle, string9);
            String string10 = context.getString(R.string.lbl_notification_from_device_subtitle);
            string10.getClass();
            sz0.e eVar7 = sz0.e.F;
            PendingIntent activity5 = PendingIntent.getActivity(context, 0, intent, 201326592);
            activity5.getClass();
            d(string9, strD3, string10, eVar7, activity5);
            return;
        }
        h hVar2 = new h(this);
        i iVar2 = new i(this);
        try {
            String queryParameter5 = uri.getQueryParameter("promotedFeature");
            if (queryParameter5 != null) {
                c80.q.f25532b.getClass();
                qVarA = c80.q.a.a(queryParameter5);
            }
        } catch (Exception e4) {
            String strD4 = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error when parsing promotedFeature for handleSubscriptionDeepLink(): ");
            i2.a aVar7 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var, "SubscriptionDeepLinkHandler", strD4);
        }
        ub1.g gVar = lVar.f161698b;
        Context context9 = lVar.f161697a;
        Intent intentG = gVar.g(context9, qVarA, true);
        if (!z14) {
            intentG.setFlags(268435456);
            hVar2.invoke(intentG);
            return;
        }
        c80.q qVar4 = c80.q.NUTRITION;
        String string11 = qVarA == qVar4 ? context9.getString(R.string.lbl_nutrition) : context9.getString(R.string.lbl_notification_from_device_title);
        string11.getClass();
        String string12 = qVarA == qVar4 ? context9.getString(R.string.open_connect_to_get_started) : context9.getString(R.string.lbl_notification_from_device_subtitle);
        string12.getClass();
        sz0.e eVar8 = sz0.e.F;
        PendingIntent activity6 = PendingIntent.getActivity(context9, 0, intentG, 201326592);
        activity6.getClass();
        iVar2.invoke(string11, string12, string12, eVar8, activity6);
    }

    public final void d(String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent) {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        f31960b.getClass();
        C0518a.a(this.f31962a, str, str2, str3, eVar, pendingIntent, iCurrentTimeMillis);
    }

    @Override // ak2.a.InterfaceC0062a
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final Context getF31962a() {
        return this.f31962a;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/deeplinking/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0518a {
        public /* synthetic */ C0518a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, String str, String str2, String str3, sz0.e eVar, PendingIntent pendingIntent, int i14) {
            context.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            eVar.getClass();
            pendingIntent.getClass();
            z6.q qVar = new z6.q(context, eVar.f161386a);
            qVar.N.icon = 2131232010;
            qVar.f202683e = z6.q.e(str);
            qVar.f202684f = z6.q.e(str2);
            o oVar = new o();
            oVar.f202664e = z6.q.e(str3);
            qVar.l(oVar);
            qVar.f202691m = 1;
            qVar.f202686h = pendingIntent;
            qVar.i(16, true);
            Notification notificationC = qVar.c();
            notificationC.getClass();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(context, notificationC, i14, eVar);
        }

        private C0518a() {
        }
    }
}
