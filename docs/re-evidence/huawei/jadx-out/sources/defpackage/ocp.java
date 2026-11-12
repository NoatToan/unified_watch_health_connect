package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import com.huawei.multisimsdk.odsa.utils.OdsaHttpConnectionUtils;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class ocp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ocp f44132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f44133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f44134c;
    private static final int d;
    private static final int e;
    private static final Executor i;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f44134c = iAvailableProcessors;
        int i2 = iAvailableProcessors + 1;
        d = i2;
        int i3 = (iAvailableProcessors * 2) + 1;
        e = i3;
        i = new ThreadPoolExecutor(i2, i3, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f44133b = new Object();
    }

    public static ocp d() {
        ocp ocpVar;
        synchronized (f44133b) {
            if (f44132a == null) {
                f44132a = new ocp();
            }
            ocpVar = f44132a;
        }
        return ocpVar;
    }

    public void c(String str, String str2, ResponseHandler responseHandler) {
        g gVar = new g(new Handler(Looper.getMainLooper()), str, str2, responseHandler);
        ocq.e("AsyncHttpUtils", "threadPoolExecutor.execute");
        i.execute(gVar);
    }

    public void e(Context context, String str, String str2, int i2, ResponseHandler responseHandler) {
        d dVar = new d(context, new Handler(Looper.getMainLooper()), responseHandler, str, str2, i2);
        ocq.e("AsyncHttpUtils", "threadPoolExecutor.execute, slotId=" + i2);
        i.execute(dVar);
    }

    public void b(String str, String str2, String str3, ResponseHandler responseHandler) {
        g gVar = new g(new Handler(Looper.getMainLooper()), str, str2, str3, responseHandler);
        ocq.e("AsyncHttpUtils", "threadPoolExecutor.execute");
        i.execute(gVar);
    }

    public void d(String str, String str2, String str3, String str4, ResponseHandler responseHandler) {
        g gVar = new g(new Handler(Looper.getMainLooper()), str, str2, str3, str4, responseHandler);
        ocq.e("AsyncHttpUtils", "threadPoolExecutor.execute");
        i.execute(gVar);
    }

    public void a(String str, String str2, String str3, ResponseHandler responseHandler) {
        a aVar = new a(new Handler(Looper.getMainLooper()), str, str2, str3, responseHandler);
        ocq.e("AsyncHttpUtils", "threadPoolExecutor.execute, aka get request.");
        i.execute(aVar);
    }

    public void d(String str, String str2, String str3, ResponseHandler responseHandler) {
        b bVar = new b(new Handler(Looper.getMainLooper()), str, str2, responseHandler, str3);
        ocq.e("AsyncHttpUtils", "threadPoolExecutor.execute, aka get request.");
        i.execute(bVar);
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f44141a;
        ResponseHandler d;

        c(String str, ResponseHandler responseHandler) {
            this.d = responseHandler;
            this.f44141a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.onCallback(this.f44141a);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f44146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ResponseHandler f44147c;
        String d;

        e(int i, String str, ResponseHandler responseHandler) {
            this.f44146b = i;
            this.f44147c = responseHandler;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44147c.onCallback(this.f44146b, this.d);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ResponseHandler f44148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Handler f44150c;
        String d;
        String e;
        String f;
        String g;

        g(Handler handler, String str, String str2, ResponseHandler responseHandler) {
            this.f44150c = handler;
            this.g = str;
            this.f = str2;
            this.f44148a = responseHandler;
        }

        g(Handler handler, String str, String str2, String str3, ResponseHandler responseHandler) {
            this.f44150c = handler;
            this.g = str;
            this.f = str2;
            this.f44148a = responseHandler;
            this.d = str3;
        }

        g(Handler handler, String str, String str2, String str3, String str4, ResponseHandler responseHandler) {
            this.f44150c = handler;
            this.g = str;
            this.f = str2;
            this.f44148a = responseHandler;
            this.d = str3;
            this.f44149b = str4;
            ocf ocfVarA = ocf.a();
            String strB = obf.b(ocfVarA.b(), ocfVarA.c());
            this.e = String.format("sip:%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org", strB, oco.a(strB), oco.b(strB));
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                String strB = ocn.e().b(this.g, this.f, this.d, this.f44149b, this.e);
                if (strB == null || (handler = this.f44150c) == null) {
                    return;
                }
                handler.post(ocp.this.new c(strB, this.f44148a));
            } catch (KeyManagementException unused) {
                ocq.c("AsyncHttpUtils", "doPostRequest->KeyManagementException");
            } catch (NoSuchAlgorithmException unused2) {
                ocq.c("AsyncHttpUtils", "doPostRequest->NoSuchAlgorithmException");
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Handler f44145c;
        ResponseHandler d;
        Context e;
        String f;

        d(Context context, Handler handler, ResponseHandler responseHandler, String str, String str2, int i) {
            this.f44145c = handler;
            this.d = responseHandler;
            this.f = str;
            this.f44144b = str2;
            this.f44143a = i;
            this.e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            c cVar;
            Handler handler2;
            Handler handler3;
            String strA = null;
            try {
                try {
                    try {
                        try {
                            ocq.e("AsyncHttpUtils", "run gbaStep1(), slotId=" + this.f44143a);
                            strA = ocu.d().a(this.e, this.f44144b, this.f44143a, this.f);
                            if (ocq.f44154c.booleanValue()) {
                                ocq.e("AsyncHttpUtils", "result=" + strA);
                            }
                            if (strA == null || (handler3 = this.f44145c) == null) {
                                return;
                            }
                            handler3.post(ocp.this.new c(strA, this.d));
                        } catch (Exception unused) {
                            ocq.c("AsyncHttpUtils", "doPostRequest->Exception:");
                            if (strA == null || (handler = this.f44145c) == null) {
                                return;
                            }
                            cVar = ocp.this.new c(strA, this.d);
                            handler.post(cVar);
                        }
                    } catch (KeyManagementException unused2) {
                        ocq.c("AsyncHttpUtils", "doPostRequest->KeyManagementException");
                        if (strA == null || (handler = this.f44145c) == null) {
                            return;
                        }
                        cVar = ocp.this.new c(strA, this.d);
                        handler.post(cVar);
                    }
                } catch (NoSuchAlgorithmException unused3) {
                    ocq.c("AsyncHttpUtils", "doPostRequest->NoSuchAlgorithmException");
                    if (strA == null || (handler = this.f44145c) == null) {
                        return;
                    }
                    cVar = ocp.this.new c(strA, this.d);
                    handler.post(cVar);
                }
            } catch (Throwable th) {
                if (strA != null && (handler2 = this.f44145c) != null) {
                    handler2.post(ocp.this.new c(strA, this.d));
                }
                throw th;
            }
        }
    }

    public void b(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Map<String, String> map, ResponseHandler responseHandler, int i2) {
        i.execute(new i(new Handler(Looper.getMainLooper()), responseHandler, absPrimaryDevice, absPairedDevice, i2, map));
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Handler f44152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map<String, String> f44153c;
        AbsPrimaryDevice d;
        AbsPairedDevice e;
        ResponseHandler j;

        i(Handler handler, ResponseHandler responseHandler, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, int i, Map<String, String> map) {
            this.f44152b = handler;
            this.j = responseHandler;
            this.d = absPrimaryDevice;
            this.e = absPairedDevice;
            this.f44151a = i;
            this.f44153c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strD;
            Handler handler;
            try {
                if (oco.b("ODSA_SUPPORT_POST_METHOD", (Boolean) false).booleanValue()) {
                    strD = OdsaHttpConnectionUtils.b().e(this.f44151a, this.d, this.e, this.f44153c);
                } else {
                    strD = OdsaHttpConnectionUtils.b().d(this.f44151a, this.d, this.e, this.f44153c);
                }
                if (strD == null || (handler = this.f44152b) == null) {
                    return;
                }
                handler.post(ocp.this.new e(this.f44151a, strD, this.j));
            } catch (Exception e) {
                ocq.a("AsyncHttpUtils", "doPostRequest->Exception:", e);
            }
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f44135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Handler f44137c;
        String d;
        ResponseHandler e;
        String i;

        a(Handler handler, String str, String str2, String str3, ResponseHandler responseHandler) {
            this.f44137c = handler;
            this.f44136b = str;
            this.i = str2;
            this.f44135a = str3;
            this.e = responseHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strE;
            Handler handler;
            if (oco.b("ODSA_SUPPORT_POST_METHOD", (Boolean) false).booleanValue()) {
                strE = OdsaHttpConnectionUtils.b().d(this.f44136b, this.i, this.d, this.f44135a);
            } else {
                strE = OdsaHttpConnectionUtils.b().e(this.f44136b, this.i, this.d, this.f44135a);
            }
            if (strE == null || (handler = this.f44137c) == null) {
                return;
            }
            handler.post(ocp.this.new c(strE, this.e));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Handler f44138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f44140c;
        ResponseHandler d;
        String e;

        b(Handler handler, String str, String str2, ResponseHandler responseHandler, String str3) {
            this.f44138a = handler;
            this.e = str;
            this.f44140c = str2;
            this.f44139b = str3;
            this.d = responseHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            String strA = OdsaHttpConnectionUtils.b().a(this.e, this.f44140c, this.f44139b);
            if (strA == null || (handler = this.f44138a) == null) {
                return;
            }
            handler.post(ocp.this.new c(strA, this.d));
        }
    }
}
