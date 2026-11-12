package com.alipay.sdk.m.u;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    public static final String j = "failed";
    public static final String k = "scheme_failed";
    public Activity a;
    public volatile IAlixPay b;
    public boolean d;
    public e e;
    public final com.alipay.sdk.m.s.a f;
    public final Object c = IAlixPay.class;
    public boolean g = false;
    public String h = null;
    public String i = null;

    public class a implements AlipayResultActivity.a {
        public final /* synthetic */ CountDownLatch a;

        public a(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.AlipayResultActivity.a
        public void a(int i, String str, String str2) {
            h.this.h = com.alipay.sdk.m.j.b.a(i, str, str2);
            this.a.countDown();
        }
    }

    public class b implements APayEntranceActivity.a {
        public final /* synthetic */ Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            h.this.i = str;
            synchronized (this.a) {
                try {
                    this.a.notify();
                } catch (Throwable th) {
                    com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, "BSAResultEx", th);
                }
            }
        }
    }

    public class c extends IRemoteServiceCallback.Stub {
        public c() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (h.this.e != null) {
                    h.this.e.a();
                }
                if (h.this.f != null) {
                    h.this.f.a(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.Y, e);
            }
            intent.setClassName(str, str2);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, "isFg", runningAppProcessInfo.processName + AESEncryptionHelper.SEPARATOR + runningAppProcessInfo.importance + AESEncryptionHelper.SEPARATOR);
                }
            } catch (Throwable unused) {
            }
            try {
                if (h.this.a == null) {
                    com.alipay.sdk.m.k.a.b(h.this.f, com.alipay.sdk.m.k.b.l, "ErrActNull", "");
                    Context contextA = h.this.f.a();
                    if (contextA != null) {
                        contextA.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                h.this.a.startActivity(intent);
                com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th) {
                com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, "ErrActNull", th);
                throw th;
            }
        }

        public /* synthetic */ c(h hVar, a aVar) {
            this();
        }
    }

    public class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, "srvCon");
            synchronized (h.this.c) {
                h.this.b = IAlixPay.Stub.asInterface(iBinder);
                h.this.c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.alipay.sdk.m.k.a.a(h.this.f, com.alipay.sdk.m.k.b.l, "srvDis");
            h.this.b = null;
        }

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }
    }

    public interface e {
        void a();

        void b();
    }

    public h(Activity activity, com.alipay.sdk.m.s.a aVar, e eVar) {
        this.a = activity;
        this.f = aVar;
        this.e = eVar;
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.z, "alipaySdk");
    }

    private void e(n.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.a.startActivity(intent);
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.c0, th);
        }
        Thread.sleep(200L);
    }

    private String f(String str, String str2) {
        JSONObject jSONObject;
        Object obj = new Object();
        String strA = n.a(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSAStart", strA + AESEncryptionHelper.SEPARATOR + jElapsedRealtime);
        com.alipay.sdk.m.s.a.C0094a.a(this.f, strA);
        APayEntranceActivity.h.put(strA, new b(obj));
        try {
            try {
                HashMap<String, String> mapA = com.alipay.sdk.m.s.a.a(this.f);
                mapA.put("ts_intent", String.valueOf(jElapsedRealtime));
                jSONObject = new JSONObject(mapA);
            } catch (Throwable th) {
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSALocEx", th);
                jSONObject = null;
            }
            Intent intent = new Intent(this.a, (Class<?>) APayEntranceActivity.class);
            intent.putExtra(APayEntranceActivity.d, str);
            intent.putExtra(APayEntranceActivity.e, str2);
            intent.putExtra(APayEntranceActivity.f, strA);
            if (jSONObject != null) {
                intent.putExtra(APayEntranceActivity.g, jSONObject.toString());
            }
            Activity activity = this.a;
            com.alipay.sdk.m.s.a aVar = this.f;
            com.alipay.sdk.m.k.a.a(activity, aVar, str, aVar.d);
            try {
                Activity activity2 = this.a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    com.alipay.sdk.m.k.a.b(this.f, com.alipay.sdk.m.k.b.l, "ErrActNull", "");
                    Context contextA = this.f.a();
                    if (contextA != null) {
                        contextA.startActivity(intent);
                    }
                }
                synchronized (obj) {
                    obj.wait();
                }
                String str3 = this.i;
                String str4 = "unknown";
                try {
                    String str5 = l.a(this.f, str3).get(l.a);
                    str4 = str5 == null ? "null" : str5;
                } catch (Throwable th2) {
                    com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSAStatEx", th2);
                }
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSADone-" + str4);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSAEmpty");
                return k;
            } catch (Throwable th3) {
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "ErrActNull", th3);
                throw th3;
            }
        } catch (InterruptedException e2) {
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSAWaiting", e2);
            com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
            return com.alipay.sdk.m.j.b.a(cVar.b(), cVar.a(), "");
        } catch (Throwable th4) {
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSAEx", th4);
            n.a("alipaySdk", com.alipay.sdk.m.l.b.q, this.a, this.f);
            return k;
        }
    }

    private String c(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.z, "pay payInvokeAct");
        com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.W, str2 + AESEncryptionHelper.SEPARATOR + str3);
        Activity activity = this.a;
        com.alipay.sdk.m.s.a aVar = this.f;
        com.alipay.sdk.m.k.a.a(activity, aVar, str, aVar.d);
        return f(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    private String d(String str, String str2, PackageInfo packageInfo, n.c cVar) {
        String str3;
        com.alipay.sdk.m.s.a aVar;
        boolean zContains = false;
        int i = packageInfo != null ? packageInfo.versionCode : 0;
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.z, "pay bind or scheme");
        com.alipay.sdk.m.s.a aVar2 = this.f;
        if (aVar2 != null && !TextUtils.isEmpty(aVar2.g)) {
            zContains = this.f.g.toLowerCase().contains("auth");
        }
        if (zContains || !n.i()) {
            if (zContains || !n.d(this.f, str2)) {
                if (cVar != null) {
                    try {
                        if (!com.alipay.sdk.m.m.a.z().p()) {
                            e(cVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
                Pair<String, Boolean> pairA = a(str, str2, this.f);
                str3 = (String) pairA.first;
                try {
                    if ("failed".equals(str3) && ((Boolean) pairA.second).booleanValue() && com.alipay.sdk.m.m.a.z().n()) {
                        com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BindRetry");
                        str3 = (String) a(str, str2, this.f).first;
                    }
                } catch (Throwable th) {
                    com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BindRetryEx", th);
                }
            } else {
                if (cVar != null) {
                    try {
                        if (com.alipay.sdk.m.m.a.z().x()) {
                            e(cVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BindSkipByL");
            }
            com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.z, "pay bind result: " + str3);
            Activity activity = this.a;
            com.alipay.sdk.m.s.a aVar3 = this.f;
            com.alipay.sdk.m.k.a.a(activity, aVar3, str, aVar3.d);
            if ("failed".equals(str3)) {
                if (!com.alipay.sdk.m.m.a.z().i()) {
                    com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPNotStartByConfig", "");
                    return str3;
                }
                if (!"com.eg.android.AlipayGphone".equals(str2) && i > 125) {
                    if (!com.alipay.sdk.m.m.a.z().m() || (aVar = this.f) == null || n.b(aVar.f) == 0) {
                        Activity activity2 = this.a;
                        return (activity2 == null || !a(str2, activity2, this.f)) ? k : b(str, str2);
                    }
                    com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPNotStartByUsr");
                    return str3;
                }
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPNotStartByPkg", str2 + AESEncryptionHelper.SEPARATOR + i);
            }
            return str3;
        }
        if (cVar != null) {
            try {
                if (com.alipay.sdk.m.m.a.z().x()) {
                    e(cVar);
                }
            } catch (Throwable unused3) {
            }
        }
        com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BindSkipByModel");
        str3 = "failed";
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.z, "pay bind result: " + str3);
        Activity activity3 = this.a;
        com.alipay.sdk.m.s.a aVar4 = this.f;
        com.alipay.sdk.m.k.a.a(activity3, aVar4, str, aVar4.d);
        if ("failed".equals(str3)) {
            if (!com.alipay.sdk.m.m.a.z().i()) {
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPNotStartByConfig", "");
                return str3;
            }
            if (!"com.eg.android.AlipayGphone".equals(str2)) {
            }
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPNotStartByPkg", str2 + AESEncryptionHelper.SEPARATOR + i);
        }
        return str3;
    }

    public static boolean b(String str, Context context, com.alipay.sdk.m.s.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "BSADetectFail");
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "BSADetectFail", th);
            return false;
        }
    }

    public String a(String str, boolean z) {
        n.c cVarA;
        String strB = "";
        PackageInfo packageInfo = null;
        try {
            List<com.alipay.sdk.m.m.a.b> listL = com.alipay.sdk.m.m.a.z().l();
            if (!com.alipay.sdk.m.m.a.z().g || listL == null) {
                listL = com.alipay.sdk.m.j.a.d;
            }
            cVarA = n.a(this.f, this.a, listL);
            if (cVarA != null) {
                try {
                    if (cVarA.a(this.f) || cVarA.a() || n.a(cVarA.a)) {
                        return "failed";
                    }
                    PackageInfo packageInfo2 = cVarA.a;
                    if (packageInfo2 != null && !"com.eg.android.AlipayGphone".equals(packageInfo2.packageName)) {
                        strB = cVarA.a.packageName;
                    } else {
                        strB = n.b();
                    }
                    PackageInfo packageInfo3 = cVarA.a;
                    packageInfo = packageInfo3 != null ? packageInfo3 : null;
                    String strC = com.alipay.sdk.m.m.a.z().c();
                    if (strC != null && strC.length() > 0) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strC).optJSONObject(strB);
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    int i = Integer.parseInt(next);
                                    if (packageInfo != null && packageInfo.versionCode >= i) {
                                        try {
                                            boolean zA = com.alipay.sdk.m.m.a.z().a(this.a, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.g = zA;
                                            if (zA) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.M, th);
                }
                boolean zB = n.b(this.f);
                if ((z || this.g) && !zB && b(strB, this.a, this.f)) {
                    return c(str, strB, packageInfo);
                }
                return d(str, strB, packageInfo, cVarA);
            }
            return "failed";
        } catch (Throwable th2) {
            th = th2;
            cVarA = null;
        }
    }

    private String b(String str, String str2) {
        String str3;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String strA = n.a(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPStart", strA + AESEncryptionHelper.SEPARATOR + jElapsedRealtime);
        com.alipay.sdk.m.s.a.C0094a.a(this.f, strA);
        AlipayResultActivity.a.put(strA, new a(countDownLatch));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourcePid", Binder.getCallingPid());
            jSONObject.put(com.alipay.sdk.m.l.b.d, str);
            jSONObject.put("pkgName", this.a.getPackageName());
            jSONObject.put(com.google.firebase.crashlytics.internal.settings.b.c, strA);
            String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 2);
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20000125");
            builderAppendQueryParameter.appendQueryParameter("mqpSchemePay", strEncodeToString);
            try {
                HashMap<String, String> mapA = com.alipay.sdk.m.s.a.a(this.f);
                mapA.put("ts_scheme", String.valueOf(jElapsedRealtime));
                builderAppendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(mapA).toString());
            } catch (Throwable th) {
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPLocEx", th);
            }
            String string = builderAppendQueryParameter.build().toString();
            Intent intent = new Intent();
            intent.setPackage(str2);
            intent.addFlags(268435456);
            intent.setData(Uri.parse(string));
            Activity activity = this.a;
            com.alipay.sdk.m.s.a aVar = this.f;
            com.alipay.sdk.m.k.a.a(activity, aVar, str, aVar.d);
            this.a.startActivity(intent);
            com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.z, "pay scheme waiting " + string);
            countDownLatch.await();
            String str4 = this.h;
            try {
                str3 = l.a(this.f, str4).get(l.a);
                if (str3 == null) {
                    str3 = "null";
                }
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPStatEx", th2);
                str3 = "unknown";
            }
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPDone-" + str3);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPEmpty");
            return k;
        } catch (InterruptedException e2) {
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPWaiting", e2);
            com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
            return com.alipay.sdk.m.j.b.a(cVar.b(), cVar.a(), "");
        } catch (Throwable th3) {
            com.alipay.sdk.m.k.a.a(this.f, com.alipay.sdk.m.k.b.l, "BSPEx", th3);
            return k;
        }
    }

    public static boolean a(String str, Context context, com.alipay.sdk.m.s.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "BSPDetectFail");
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "BSPDetectFail", th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair<String, Boolean> a(String str, String str2, com.alipay.sdk.m.s.a aVar) {
        int i;
        d dVar;
        IRemoteServiceCallback cVar;
        Activity activity;
        int version;
        String strA;
        Activity activity2;
        Activity activity3;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(n.c(str2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(jElapsedRealtime);
        sb.append(AESEncryptionHelper.SEPARATOR);
        sb.append(str != null ? str.length() : 0);
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.Q, sb.toString());
        com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
        try {
            try {
                if (!com.alipay.sdk.m.m.a.z().f()) {
                    ComponentName componentNameStartService = this.a.getApplication().startService(intent);
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : "null");
                } else {
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "stSrv", com.facebook.login.a.g);
                }
            } catch (Throwable th) {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.I, th);
                n.a("alipaySdk", com.alipay.sdk.m.l.b.n, this.a, this.f);
                return new Pair<>("failed", Boolean.TRUE);
            }
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.J, th2);
        }
        if (com.alipay.sdk.m.m.a.z().b()) {
            i = 65;
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, "bindFlg", "imp");
        } else {
            i = 1;
        }
        a aVar2 = null;
        d dVar2 = new d(this, aVar2);
        if (this.a.getApplicationContext().bindService(intent, dVar2, i)) {
            synchronized (this.c) {
                if (this.b == null) {
                    try {
                        this.c.wait(com.alipay.sdk.m.m.a.z().k());
                    } catch (InterruptedException e2) {
                        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.K, e2);
                    }
                }
            }
            IAlixPay iAlixPay = this.b;
            try {
                if (iAlixPay == null) {
                    com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.D, "");
                    n.a("alipaySdk", com.alipay.sdk.m.l.b.o, this.a, this.f);
                    Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                    try {
                        this.a.getApplicationContext().unbindService(dVar2);
                    } catch (Throwable th3) {
                        com.alipay.sdk.m.u.e.a(th3);
                    }
                    com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.S, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                    this.b = null;
                    if (this.d && (activity3 = this.a) != null) {
                        activity3.setRequestedOrientation(0);
                        this.d = false;
                    }
                    return pair;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.R, "" + jElapsedRealtime2);
                e eVar = this.e;
                if (eVar != null) {
                    eVar.b();
                }
                if (this.a.getRequestedOrientation() == 0) {
                    this.a.setRequestedOrientation(1);
                    this.d = true;
                }
                try {
                    version = iAlixPay.getVersion();
                } catch (Throwable th4) {
                    com.alipay.sdk.m.u.e.a(th4);
                    version = 0;
                }
                cVar = new c(this, aVar2);
                try {
                    if (version >= 3) {
                        iAlixPay.registerCallback03(cVar, str, null);
                    } else {
                        iAlixPay.registerCallback(cVar);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        sb2.append("");
                        sb2.append(jElapsedRealtime3);
                        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.T, sb2.toString());
                        if (version >= 3) {
                            iAlixPay.r03(com.alipay.sdk.m.k.b.l, "bind_pay", null);
                        }
                        try {
                            if (version >= 2) {
                                Map mapA = com.alipay.sdk.m.s.a.a(aVar);
                                mapA.put("ts_bind", String.valueOf(jElapsedRealtime));
                                mapA.put("ts_bend", String.valueOf(jElapsedRealtime2));
                                mapA.put("ts_pay", String.valueOf(jElapsedRealtime3));
                                strA = iAlixPay.pay02(str, mapA);
                            } else {
                                strA = iAlixPay.Pay(str);
                            }
                        } catch (Throwable th5) {
                            com.alipay.sdk.m.s.a aVar3 = this.f;
                            if (aVar3 != null && !aVar3.d()) {
                                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.G, th5);
                                n.a("alipaySdk", com.alipay.sdk.m.l.b.p, this.a, this.f);
                            }
                            strA = com.alipay.sdk.m.j.b.a();
                        }
                        String str3 = strA;
                        try {
                            iAlixPay.unregisterCallback(cVar);
                        } catch (Throwable th6) {
                            com.alipay.sdk.m.u.e.a(th6);
                        }
                        try {
                            this.a.getApplicationContext().unbindService(dVar2);
                        } catch (Throwable th7) {
                            com.alipay.sdk.m.u.e.a(th7);
                        }
                        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.S, "" + SystemClock.elapsedRealtime());
                        com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                        this.b = null;
                        if (this.d && (activity2 = this.a) != null) {
                            activity2.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return new Pair<>(str3, Boolean.FALSE);
                    } catch (Throwable th8) {
                        th = th8;
                        dVar = dVar2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    dVar = dVar2;
                }
            } catch (Throwable th10) {
                th = th10;
                dVar = dVar2;
                cVar = null;
            }
            try {
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.D, th, "in_bind");
                return new Pair<>("failed", Boolean.TRUE);
            } finally {
                if (cVar != null) {
                    try {
                        iAlixPay.unregisterCallback(cVar);
                    } catch (Throwable th11) {
                        com.alipay.sdk.m.u.e.a(th11);
                    }
                }
                try {
                    this.a.getApplicationContext().unbindService(dVar);
                } catch (Throwable th12) {
                    com.alipay.sdk.m.u.e.a(th12);
                }
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.S, "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.m.k.a.a(this.a, aVar, str, aVar.d);
                this.b = null;
                if (this.d && (activity = this.a) != null) {
                    activity.setRequestedOrientation(0);
                    this.d = 0 == true ? 1 : 0;
                }
            }
        }
        throw new Throwable("bindService fail");
    }

    public void a() {
        this.a = null;
        this.e = null;
    }
}
