package com.garmin.android.apps.connectmobile.cloudmessaging;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import o00.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sz0.r0;
import ue.f;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;
import v.e0;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cloudmessaging/FCMRegistrationGCWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FCMRegistrationGCWorker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31356e = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMRegistrationGCWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        boolean zIsSuccessful;
        WorkerParameters workerParameters = this.f11470b;
        c cVar = workerParameters.f11427b;
        int i14 = workerParameters.f11428c;
        String strE = cVar.e("ARG_TOKEN");
        c cVar2 = workerParameters.f11427b;
        long jD = cVar2.d("ARG_USER_PROFILE_PK", 0L);
        long jD2 = cVar2.d("ARG_APP_VERSION_CODE", 0L);
        String strE2 = cVar2.e("ARG_APP_VERSION_NAME");
        if (strE2 == null) {
            strE2 = "";
        }
        String str = strE2;
        if (strE != null) {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(jD, "FCMRegistrationGCWorker -> Registration ID for user with profilePk = [", "] is [", strE);
            sbK.append("]");
            String string = sbK.toString();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "FCMRegistrationGCWorker", string);
            if (!TextUtils.isEmpty(strE)) {
                i2.a.b(a2Var, "FCMRegistrationGCWorker", "FCMRegistrationGCWorker -> Calling Garmin Connect to register the ID...");
                b bVar = (b) KoinJavaComponent.get$default(b.class, null, null, 6, null);
                bVar.getClass();
                r0 r0Var = new r0(strE, jD, 2, n00.a.GCM.name(), false, false, false, false, null, null, 0L, 2032, null);
                r0Var.b();
                r0Var.f();
                r0Var.i();
                r0Var.j();
                r0Var.g();
                String str2 = Build.VERSION.RELEASE;
                r0Var.h();
                r0Var.d(jD2);
                try {
                    zIsSuccessful = bVar.f128481a.a(r0Var).execute().f25745a.isSuccessful();
                } catch (Throwable th3) {
                    String strN = fb1.c.n("registerCloudMessaging failed -> ", th3.getMessage());
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var2, "CloudMessagingRepo", strN);
                    zIsSuccessful = false;
                }
                if (!zIsSuccessful) {
                    String strF = e0.f(i14, "FCMRegistrationGCWorker -> Failed to send registration ID to Garmin Connect. runAttemptCount=[", "]");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var3, "FCMRegistrationGCWorker", strF);
                    return i14 < 5 ? new d.a.b() : new d.a.C0165a();
                }
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(jD, "FCMRegistrationGCWorker -> Successfully sent registration ID to Garmin Connect. ID is associated with app version [", str, "], profile primary key [");
                sbJ.append("]");
                String string2 = sbJ.toString();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var4, "FCMRegistrationGCWorker", string2);
                return new d.a.c();
            }
        }
        return i14 < 5 ? new d.a.b() : new d.a.C0165a();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cloudmessaging/FCMRegistrationGCWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_TOKEN", "ARG_USER_PROFILE_PK", "ARG_APP_VERSION_CODE", "ARG_APP_VERSION_NAME", "", "RETRY_COUNT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context) {
            context.getClass();
            a2 a2Var = a2.CLOUD_MESSAGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FCMRegistrationGCWorker", "FirebaseMessaging get token call to retrieve token");
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new n00.b(context));
        }

        public static void b(Context context, String str) {
            context.getClass();
            c.a aVar = new c.a();
            LinkedHashMap linkedHashMap = aVar.f11467a;
            linkedHashMap.put("ARG_TOKEN", str);
            linkedHashMap.put("ARG_USER_PROFILE_PK", Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()));
            linkedHashMap.put("ARG_APP_VERSION_CODE", Long.valueOf(11657));
            linkedHashMap.put("ARG_APP_VERSION_NAME", "5.30.1");
            c cVarA = aVar.a();
            t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context);
            l lVar = l.REPLACE;
            x.a aVarF = new x.a((Class<? extends d>) FCMRegistrationGCWorker.class).f(cVarA);
            f.a aVar2 = new f.a();
            aVar2.b(v.CONNECTED);
            aVarF.f170098c.f26950j = aVar2.a();
            t0VarO.a("FCMRegistrationGCWorker", lVar, aVarF.d(ue.a.LINEAR, 1L, TimeUnit.HOURS).a()).a();
        }

        private a() {
        }
    }
}
