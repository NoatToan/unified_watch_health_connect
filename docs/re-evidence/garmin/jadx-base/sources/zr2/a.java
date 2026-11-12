package zr2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import l73.k;
import lp2.h;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import pi2.c;
import ps2.w;
import q03.d;
import s03.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzr2/a;", "Lpi2/c;", "<init>", "()V", "Ljj0/c;", "notificationEvent", "", "pushNotificationReceived", "(Ljj0/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f206778a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f206779b;

    /* JADX INFO: renamed from: zr2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zr2/a$a", "Lq03/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3853a implements d {
        @Override // q03.d
        public final void a(b bVar) {
            bVar.getClass();
        }

        @Override // q03.d
        public final void onComplete() {
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            th3.getClass();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f206779b = gt2.b.f79005a.h("PAY#PushNotificationReceiver");
    }

    private a() {
    }

    @k
    public final void pushNotificationReceived(jj0.c notificationEvent) {
        notificationEvent.getClass();
        Bundle eventData = notificationEvent.getEventData();
        Logger logger = f206779b;
        if (eventData == null) {
            logger.warn("onMessageReceived: push notification payload is empty...");
            return;
        }
        f206778a.getClass();
        HashMap map = new HashMap();
        for (String str : eventData.keySet()) {
            String string = eventData.getString(str);
            string.getClass();
            map.put(str, string);
        }
        w.f140538a.getClass();
        if (w.f140550m) {
            logger.debug("onMessageReceived: wallet initialized, delivering...");
            ls2.b.f114790a.getClass();
            h hVar = new h(map, 19);
            int i14 = w03.b.f181178a;
            new z03.h(hVar).k(l13.a.f108327b).a(new C3853a());
            return;
        }
        if (TextUtils.isEmpty((CharSequence) map.get("notification-key"))) {
            return;
        }
        logger.warn("onMessageReceived: wallet NOT initialized, displaying generic sync notification for payload ->\n" + map);
        ls2.b bVar = ls2.b.f114790a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        ls2.b.b(contextC, map);
    }
}
