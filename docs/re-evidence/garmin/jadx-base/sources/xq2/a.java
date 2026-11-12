package xq2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.R;
import gt2.b;
import gt2.c;
import java.util.Map;
import o13.p;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sz0.e;
import sz0.f;
import z10.d;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lxq2/a;", "", "", "", "data", "<init>", "(Ljava/util/Map;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f191939c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191941b;

    static {
        new C3574a(null);
        int i14 = c.f79010a;
        f191939c = b.f79005a.h("PAY#GarminPayPushNotification");
    }

    public a(Map<String, String> map) {
        map.getClass();
        this.f191940a = map.get("notification-key");
        this.f191941b = map.get("bank-name");
    }

    public final void a(d dVar) {
        p pVar;
        String string;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        Object systemService = contextC.getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        boolean zAreNotificationsEnabled = notificationManager.areNotificationsEnabled();
        Logger logger = f191939c;
        if (!zAreNotificationsEnabled) {
            logger.error("displayCustom: notifications not enabled, impossible to display");
            return;
        }
        f.a aVar = f.f161394a;
        Context contextC2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        e eVar = e.f161375n;
        aVar.getClass();
        f.a.c(contextC2, eVar);
        if (s.g(this.f191940a, "pushnotification_ciq_purchase_confirmation_challenge")) {
            String string2 = contextC.getResources().getString(R.string.ciq_purchase_pn_confirmation_title);
            String str = this.f191941b;
            if (str == null || (string = contextC.getResources().getString(R.string.ciq_purchase_pn_confirmation_message, str)) == null) {
                string = contextC.getResources().getString(R.string.ciq_purchase_prompt_confirmation_message_no_bank_name);
                string.getClass();
            }
            pVar = new p(string2, string);
        } else {
            pVar = null;
        }
        if (pVar == null) {
            logger.error("displayCustom: notificationStrings is null");
            return;
        }
        B b14 = pVar.f128595b;
        PendingIntent pendingIntent = (PendingIntent) dVar.invoke();
        q qVar = new q(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e((CharSequence) pVar.f128594a);
        o oVar = new o();
        CharSequence charSequence = (CharSequence) b14;
        oVar.f202664e = q.e(charSequence);
        qVar.l(oVar);
        qVar.f202684f = q.e(charSequence);
        qVar.f202686h = pendingIntent;
        qVar.i(16, true);
        qVar.B = "status";
        qVar.f202691m = 2;
        qVar.k(RingtoneManager.getDefaultUri(2));
        qVar.f202691m = 4;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        new Handler(Looper.getMainLooper()).post(new go2.a(notificationManager, notificationC, 1));
    }

    /* JADX INFO: renamed from: xq2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxq2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3574a {
        public /* synthetic */ C3574a(j jVar) {
            this();
        }

        private C3574a() {
        }
    }
}
