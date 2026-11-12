package com.huawei.hms.mlsdk.asr.o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    private static HandlerThread g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f14433a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14435c;
    private List<String> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f14434b = null;
    private Runnable f = new a();
    private Handler e = new Handler(g.getLooper());

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartLogger.i("WebsocketClient", "reconnectServer....");
            if (q.this.b()) {
                return;
            }
            q qVar = q.this;
            qVar.f14433a = qVar.a();
            if (q.this.f14434b != null) {
                q qVar2 = q.this;
                qVar2.a(qVar2.f14434b);
            }
            q.this.e();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("Reconnect Message");
        g = handlerThread;
        handlerThread.start();
    }

    public q(boolean z, ArrayList arrayList) {
        this.f14433a = null;
        this.d = arrayList;
        this.f14435c = z;
        this.f14433a = a();
    }

    public final boolean c() {
        p pVar = this.f14433a;
        return pVar != null && pVar.d();
    }

    public final void d() {
        synchronized (this) {
            Handler handler = this.e;
            if (handler != null) {
                handler.postDelayed(this.f, 5000L);
            }
        }
    }

    public final void e() {
        synchronized (this) {
            if (!b()) {
                this.f14433a.f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            SmartLogger.i("WebsocketClient", "onStopConnect");
            p pVar = this.f14433a;
            if (pVar != null) {
                pVar.a((n) null);
                this.f14433a.g();
                this.f14434b = null;
            }
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacks(this.f);
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            p pVar = this.f14433a;
            z = pVar != null && pVar.e();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p a() {
        SecureSSLSocketFactoryNew secureSSLSocketFactoryNew;
        SecureX509TrustManager secureX509TrustManager;
        MLApplication.getInstance().getAppContext();
        p.d dVar = new p.d();
        Pair pair = null;
        try {
            secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(MLApplication.getInstance().getAppContext(), new SecureRandom());
        } catch (Exception e) {
            SmartLogger.e("WebsocketClient", e.getMessage());
            secureSSLSocketFactoryNew = null;
        }
        try {
            secureX509TrustManager = new SecureX509TrustManager(MLApplication.getInstance().getAppContext());
        } catch (Exception e2) {
            SmartLogger.e("WebsocketClient", e2.getMessage());
            secureX509TrustManager = null;
        }
        p.d dVarA = dVar.a(secureSSLSocketFactoryNew, secureX509TrustManager).a().a(this.d);
        HashMap map = new HashMap();
        MLApplication mLApplication = MLApplication.getInstance();
        MLApplicationSetting appSetting = mLApplication.getAppSetting();
        if (appSetting != null) {
            UUID uuidRandomUUID = UUID.randomUUID();
            map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
            map.put("X-Request-ID", String.valueOf(uuidRandomUUID));
            SmartLogger.i("AsrProcessor", "X-Request-ID: " + uuidRandomUUID);
            map.put("X-User-Agent", "X-User-Agent");
            map.put("appId", appSetting.getAppId());
            map.put("HMS-APPLICATION-ID", appSetting.getAppId());
            map.put("X-Package-Name", appSetting.getPackageName());
            map.put("X-Country-Code", new l(mLApplication.getAppContext()).a());
            map.put("supplierId", "supplierId");
            map.put("accept", "application/json");
            map.put("certFingerprint", appSetting.getCertFingerprint());
            map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + MLApplication.getInstance().getAuthorizationToken());
            map.put("X-Mlkit-Version", "3.18.6.304");
            SmartLogger.i("WebsocketClient", "X-Mlkit-Version: " + appSetting.getMLSdkVersion());
            try {
                List<ResolveInfo> listQueryIntentServices = MLApplication.getInstance().getAppContext().getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (listQueryIntentServices.size() != 0) {
                    Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                    if (it.hasNext()) {
                        ResolveInfo next = it.next();
                        pair = new Pair(next.serviceInfo.applicationInfo.packageName, next);
                    }
                }
            } catch (RuntimeException e3) {
                SmartLogger.e("WebsocketClient", "getHmsCoreInfo RuntimeException e: " + e3);
            } catch (Exception e4) {
                SmartLogger.e("WebsocketClient", "getHmsCoreInfo Exception e: " + e4);
            }
            if (pair != null) {
                String str = (String) pair.first;
                SmartLogger.d("WebsocketClient", "HMScore PackageName is :" + str);
                map.put("isHmsCore", a(mLApplication.getAppContext(), str) ? "1" : "0");
            } else {
                map.put("isHmsCore", a(mLApplication.getAppContext(), "com.huawei.hwid") ? "1" : "0");
            }
        }
        return new p(dVarA.a(map).a(this.f14435c));
    }

    public final void a(n nVar) {
        synchronized (this) {
            this.f14434b = nVar;
            if (nVar != null) {
                this.f14433a.a(nVar);
            }
        }
    }

    public final void a(String str) {
        synchronized (this) {
            if (b()) {
                this.f14433a.a(str);
            }
        }
    }

    public final void a(byte[] bArr) {
        synchronized (this) {
            if (b()) {
                this.f14433a.a(bArr);
            }
        }
    }

    private static boolean a(Context context, String str) {
        try {
            return (context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 1) != 0;
        } catch (RuntimeException e) {
            SmartLogger.e("WebsocketClient", "isPackageInternal Exception e: " + e);
            return false;
        } catch (Exception e2) {
            SmartLogger.e("WebsocketClient", "isPackageInternal Exception e: " + e2);
            return false;
        }
    }
}
