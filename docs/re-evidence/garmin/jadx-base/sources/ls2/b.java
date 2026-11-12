package ls2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.classic.Logger;
import gt2.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o13.m;
import o13.t;
import org.apache.commons.lang3.e;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lls2/b;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f114790a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f114791b = m.b(new ll0.b(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f114792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet<a> f114793d;

    static {
        int i14 = c.f79010a;
        f114792c = gt2.b.f79005a.i("PAY#CORE#PushNotifMgr");
        f114793d = new HashSet<>();
    }

    private b() {
    }

    public static void a(HashMap map) {
        HashSet<a> hashSet = f114793d;
        boolean zIsEmpty = hashSet.isEmpty();
        Logger logger = f114792c;
        if (zIsEmpty) {
            logger.error("no IPushNotificationHandler found to handle:\n" + map);
            return;
        }
        String str = (String) map.get("notification-key");
        if (str != null) {
            Iterator<a> it = hashSet.iterator();
            it.getClass();
            while (it.hasNext()) {
                a next = it.next();
                next.getClass();
                a aVar = next;
                if (aVar.m4().contains(str)) {
                    logger.error("delivering to " + aVar + ":\n" + map);
                    aVar.w0(map);
                    return;
                }
            }
        }
        logger.error("no IPushNotificationHandler found to handle:\n" + map);
    }

    @SuppressLint({"ApplySharedPref"})
    public static void b(Context context, HashMap map) {
        context.getClass();
        String strE = e.e(System.currentTimeMillis(), "pending.payload.BACKWARD_COMPATIBILITY.");
        JSONObject jSONObject = new JSONObject(map);
        SharedPreferences sharedPreferences = context.getSharedPreferences("push_notif_mgr", 0);
        sharedPreferences.getClass();
        sharedPreferences.edit().putString(strE, jSONObject.toString()).commit();
        f114792c.debug("savePending: key [" + strE + "], value ->\n" + map);
    }

    public final void c() {
        synchronized (this) {
            try {
                HashSet<a> hashSet = f114793d;
                Iterator<a> it = hashSet.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                hashSet.clear();
                f114792c.debug("all unregistered");
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
