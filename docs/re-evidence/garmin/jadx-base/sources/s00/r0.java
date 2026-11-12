package s00;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/r0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 extends j {
    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        Object next;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        i2.f36769a.getClass();
        i2.a.b(a2.USER_REMINDERS, "UserReminderPushNotificationHandler", "[onPushNotificationReceived] payload=[" + bundle + "]");
        String string = bundle.getString("reminder-type");
        if (string == null) {
            string = "";
        }
        w13.c cVar2 = pd1.a.f137375h;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (!p005kotlin.jvm.internal.s.g(((pd1.a) next).f137376a, string));
        pd1.a aVar = (pd1.a) next;
        if (aVar != null) {
            a2 a2Var = a2.USER_REMINDERS;
            String strM = am.j.m("[onPushNotificationReceived] enqueue ", aVar.f137376a, " RemindersNetwork");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "UserReminderPushNotificationHandler", strM);
            ((kd1.l) KoinJavaComponent.get$default(kd1.l.class, null, null, 6, null)).a(aVar, nd1.c.NETWORK);
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.USER_REMINDER_UPDATED};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls00/r0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_REMINDER_TYPE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
