package gh;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f77408a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f77409b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f77410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f77411d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThread f77412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b f77413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f77414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f77415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile c f77416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile a f77417j;

    public static c a(Context context) {
        if (f77416i == null) {
            synchronized (c.class) {
                f77408a = context.getApplicationContext();
                f77416i = new c();
            }
        }
        if (f77417j == null) {
            synchronized (c.class) {
                f77408a = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f77412e = handlerThread;
                handlerThread.start();
                f77413f = new b(f77412e.getLooper());
                f77417j = new a(f77408a);
                c();
            }
        }
        return f77416i;
    }

    public static void b(int i14, String str) {
        Object obj = f77411d;
        synchronized (obj) {
            Message messageObtainMessage = f77413f.obtainMessage();
            messageObtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, i14);
            if (i14 == 1 || i14 == 2) {
                bundle.putString("appid", str);
            }
            messageObtainMessage.setData(bundle);
            f77413f.sendMessage(messageObtainMessage);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i14 == 0) {
                    f77415h = f77414g;
                    f77414g = null;
                } else if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 4) {
                        }
                    } else if (f77414g != null) {
                        f77414g = null;
                    }
                    f77414g = null;
                } else if (f77414g != null) {
                    f77414g = null;
                }
            }
        }
    }

    public static void c() {
        String str;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "persist.sys.identifierid.supported", PrivacyUpdateRequestError.UNKNOWN);
            } catch (Exception e4) {
                e4.printStackTrace();
                str = "0";
            }
        } catch (Throwable unused) {
            str = "0";
        }
        f77409b = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str);
    }
}
