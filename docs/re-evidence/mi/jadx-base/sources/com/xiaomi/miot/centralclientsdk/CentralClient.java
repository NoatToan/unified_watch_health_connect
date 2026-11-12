package com.xiaomi.miot.centralclientsdk;

import android.content.Context;
import com.xiaomi.miot.centralclientsdk.CentralClient;
import defpackage.d4h;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class CentralClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13595a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f13596b;
    public static com.xiaomi.miot.centralclientsdk.c c;
    public static c d;
    public static final HashMap<Integer, d4h> e = new HashMap<>();
    public static final HashMap<Integer, d4h> f = new HashMap<>();
    public static final HashMap<String, Integer> g = new HashMap<>();
    public static final HashMap<Integer, d4h> h = new HashMap<>();
    public static final HashMap<String, Integer> i = new HashMap<>();
    public static int j = 1;

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public static void b(String str, String str2, b bVar, Object obj, int i2) throws Exception {
        if (i2 <= 0) {
            throw new Exception("Invalid timeout");
        }
        int iC = c();
        Integer numValueOf = Integer.valueOf(iC);
        HashMap<Integer, d4h> map = e;
        map.put(numValueOf, new d4h(bVar, obj));
        if (nativeCallAPI(str, str2, iC, i2) == 0) {
            return;
        }
        map.remove(numValueOf);
        throw new Exception("Native api call failed");
    }

    public static int c() {
        int i2 = (j + 1) % Integer.MAX_VALUE;
        j = i2;
        int i3 = i2 > 0 ? i2 : 1;
        j = i3;
        return i3;
    }

    public static void d(String str, a aVar, Object obj) throws Exception {
        int iC = c();
        Integer numValueOf = Integer.valueOf(iC);
        HashMap<Integer, d4h> map = h;
        map.put(numValueOf, new d4h(aVar, obj));
        HashMap<String, Integer> map2 = i;
        map2.put(str, numValueOf);
        if (nativeRegisterBroadcast(str, iC) == 0) {
            return;
        }
        map.remove(numValueOf);
        map2.remove(str);
        throw new Exception("Native register broadcast failed");
    }

    public static void e(Context context, d dVar, String str, int i2, String str2, c cVar) throws Exception {
        if (f13595a) {
            throw new Exception("Direct restart is not allowed");
        }
        System.loadLibrary("central_client_interface");
        d = cVar;
        c = new com.xiaomi.miot.centralclientsdk.c(context);
        f13596b = dVar;
        dVar.a(new d.a() { // from class: ks3
            @Override // com.xiaomi.miot.centralclientsdk.d.a
            public final void a(String str3) {
                CentralClient.nativeOnOTDownLink(str3);
            }
        });
        if (nativeStart(str, i2, str2) != 0) {
            throw new Exception("Native start failed");
        }
        f13595a = true;
    }

    public static void f() {
        if (f13595a) {
            d = null;
            nativeStop();
            try {
                c.i();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            c = null;
            f13596b.a(null);
            f13596b = null;
            f13595a = false;
        }
    }

    private static native int nativeCallAPI(String str, String str2, int i2, int i3);

    private static native void nativeOnCentralDiscovered(String str, String str2, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnOTDownLink(String str);

    private static native int nativeRegisterAPI(String str, int i2);

    private static native int nativeRegisterBroadcast(String str, int i2);

    private static native int nativeReplyAPICall(byte[] bArr, String str);

    private static native int nativeSendBroadcast(String str, String str2);

    private static native int nativeStart(String str, int i2, String str2);

    private static native void nativeStop();

    private static native int nativeUnregisterAPI(String str);

    private static native int nativeUnregisterBroadcast(String str);
}
