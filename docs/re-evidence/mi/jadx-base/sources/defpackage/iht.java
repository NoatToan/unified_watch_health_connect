package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.ha;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class iht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, byte[]> f21161a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList<Pair<String, byte[]>> f21162b = new ArrayList<>();

    public static void a(Context context, int i, String str) {
        Map<String, byte[]> map = f21161a;
        synchronized (map) {
            try {
                for (String str2 : map.keySet()) {
                    x9s.o("notify registration error. " + str2);
                    b(context, str2, f21161a.get(str2), i, str);
                }
                f21161a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, i.g(str));
    }

    public static void c(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f21162b) {
                arrayList = f21162b;
                f21162b = new ArrayList<>();
            }
            boolean zC = det.c();
            for (Pair<String, byte[]> pair : arrayList) {
                i.l(xMPushService, (String) pair.first, (byte[]) pair.second);
                if (!zC) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (ha e) {
            x9s.D("meet error when process pending message. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void d(XMPushService xMPushService, boolean z) {
        try {
            Map<String, byte[]> map = f21161a;
            synchronized (map) {
                try {
                    for (String str : map.keySet()) {
                        x9s.o("processing pending registration request. " + str);
                        i.l(xMPushService, str, f21161a.get(str));
                        if (z && !det.c()) {
                            try {
                                Thread.sleep(200L);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    f21161a.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (ha e) {
            x9s.D("fail to deal with pending register request. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void e(String str, byte[] bArr) {
        Map<String, byte[]> map = f21161a;
        synchronized (map) {
            x9s.o("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    public static void f(String str, byte[] bArr) {
        synchronized (f21162b) {
            try {
                f21162b.add(new Pair<>(str, bArr));
                if (f21162b.size() > 50) {
                    f21162b.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
