package com.alipay.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.AlipayResultActivity;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.c.q;
import defpackage.gv5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f5882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile IAlixPay f5883b;
    public boolean d;
    public c e;
    public final com.alipay.sdk.sys.a f;
    public final Object c = IAlixPay.class;
    public String g = null;

    public class a extends IRemoteServiceCallback.Stub {
        public a() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 3;
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
            com.alipay.sdk.app.statistic.a.h(e.this.f, "wlt", str, str2);
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
                com.alipay.sdk.app.statistic.a.d(e.this.f, "biz", "ErrIntentEx", e);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                com.alipay.sdk.app.statistic.a.h(e.this.f, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (e.this.f5882a != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    e.this.f5882a.startActivity(intent);
                    com.alipay.sdk.app.statistic.a.h(e.this.f, "biz", "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                } else {
                    com.alipay.sdk.app.statistic.a.c(e.this.f, "biz", "ErrActNull", "");
                    Context contextM = e.this.f.m();
                    if (contextM != null) {
                        contextM.startActivity(intent);
                    }
                }
                e.this.e.b();
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.d(e.this.f, "biz", "ErrActNull", th);
                throw th;
            }
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.alipay.sdk.app.statistic.a.b(e.this.f, "biz", "srvCon");
            synchronized (e.this.c) {
                e.this.f5883b = IAlixPay.Stub.asInterface(iBinder);
                e.this.c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.alipay.sdk.app.statistic.a.b(e.this.f, "biz", "srvDis");
            e.this.f5883b = null;
        }
    }

    public interface c {
        void a();

        void b();
    }

    public e(Activity activity, com.alipay.sdk.sys.a aVar, c cVar) {
        this.f5882a = activity;
        this.f = aVar;
        this.e = cVar;
    }

    public static boolean j(String str, Context context, com.alipay.sdk.sys.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "BSPDetectFail");
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "BSPDetectFail", th);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0272 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, Boolean> a(String str, String str2, com.alipay.sdk.sys.a aVar) {
        int i;
        b bVar;
        IRemoteServiceCallback aVar2;
        Activity activity;
        int version;
        String strF;
        Activity activity2;
        Activity activity3;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(k.h(str2));
        String strF2 = k.f(this.f5882a, str2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(jElapsedRealtime);
        sb.append("|");
        sb.append(str != null ? str.length() : 0);
        com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgBindStarting", sb.toString());
        com.alipay.sdk.app.statistic.a.a(this.f5882a, aVar, str, aVar.d);
        try {
            try {
                if (com.alipay.sdk.data.a.w().o()) {
                    com.alipay.sdk.app.statistic.a.h(aVar, "biz", "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.f5882a.getApplication().startService(intent);
                    com.alipay.sdk.app.statistic.a.h(aVar, "biz", "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : AbstractJsonLexerKt.NULL);
                }
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.d(aVar, "biz", "ClientBindServiceFailed", th);
                return new Pair<>("failed", Boolean.TRUE);
            }
        } catch (Throwable th2) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "TryStartServiceEx", th2);
        }
        if (com.alipay.sdk.data.a.w().r()) {
            com.alipay.sdk.app.statistic.a.h(aVar, "biz", "bindFlg", "imp");
            i = 65;
        } else {
            i = 1;
        }
        b bVar2 = new b();
        if (!this.f5882a.getApplicationContext().bindService(intent, bVar2, i)) {
            throw new Throwable("bindService fail");
        }
        synchronized (this.c) {
            if (this.f5883b == null) {
                try {
                    this.c.wait(com.alipay.sdk.data.a.w().a());
                } catch (InterruptedException e) {
                    com.alipay.sdk.app.statistic.a.d(aVar, "biz", "BindWaitTimeoutEx", e);
                }
            }
        }
        IAlixPay iAlixPay = this.f5883b;
        try {
            if (iAlixPay == null) {
                com.alipay.sdk.app.statistic.a.c(aVar, "biz", "ClientBindFailed", strF2 + "|" + k.f(this.f5882a, str2));
                Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                try {
                    this.f5882a.getApplicationContext().unbindService(bVar2);
                } catch (Throwable th3) {
                    com.alipay.sdk.util.c.d(th3);
                }
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.app.statistic.a.a(this.f5882a, aVar, str, aVar.d);
                this.f5883b = null;
                if (this.d && (activity3 = this.f5882a) != null) {
                    activity3.setRequestedOrientation(0);
                    this.d = false;
                }
                return pair;
            }
            try {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgBinded", "" + jElapsedRealtime2);
                c cVar = this.e;
                if (cVar != null) {
                    cVar.a();
                }
                if (this.f5882a.getRequestedOrientation() == 0) {
                    this.f5882a.setRequestedOrientation(1);
                    this.d = true;
                }
                try {
                    version = iAlixPay.getVersion();
                } catch (Throwable th4) {
                    com.alipay.sdk.util.c.d(th4);
                    version = 0;
                }
                aVar2 = new a();
                try {
                    if (version >= 3) {
                        iAlixPay.registerCallback03(aVar2, str, null);
                    } else {
                        iAlixPay.registerCallback(aVar2);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        sb2.append("");
                        sb2.append(jElapsedRealtime3);
                        com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgBindPay", sb2.toString());
                        if (version >= 3) {
                            iAlixPay.r03("biz", "bind_pay", null);
                        }
                        try {
                            if (version >= 2) {
                                Map mapF = com.alipay.sdk.sys.a.f(aVar);
                                mapF.put("ts_bind", String.valueOf(jElapsedRealtime));
                                mapF.put("ts_bend", String.valueOf(jElapsedRealtime2));
                                mapF.put("ts_pay", String.valueOf(jElapsedRealtime3));
                                strF = iAlixPay.pay02(str, mapF);
                            } else {
                                strF = iAlixPay.Pay(str);
                            }
                        } catch (Throwable th5) {
                            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "ClientBindException", th5);
                            strF = com.alipay.sdk.app.b.f();
                        }
                        String str3 = strF;
                        try {
                            iAlixPay.unregisterCallback(aVar2);
                        } catch (Throwable th6) {
                            com.alipay.sdk.util.c.d(th6);
                        }
                        try {
                            this.f5882a.getApplicationContext().unbindService(bVar2);
                        } catch (Throwable th7) {
                            com.alipay.sdk.util.c.d(th7);
                        }
                        com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                        com.alipay.sdk.app.statistic.a.a(this.f5882a, aVar, str, aVar.d);
                        this.f5883b = null;
                        if (this.d && (activity2 = this.f5882a) != null) {
                            activity2.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return new Pair<>(str3, Boolean.FALSE);
                    } catch (Throwable th8) {
                        th = th8;
                        bVar = bVar2;
                        try {
                            com.alipay.sdk.app.statistic.a.e(aVar, "biz", "ClientBindFailed", th, "in_bind");
                            return new Pair<>("failed", Boolean.TRUE);
                        } finally {
                            if (aVar2 != null) {
                                try {
                                    iAlixPay.unregisterCallback(aVar2);
                                } catch (Throwable th9) {
                                    com.alipay.sdk.util.c.d(th9);
                                }
                            }
                            try {
                                this.f5882a.getApplicationContext().unbindService(bVar);
                            } catch (Throwable th10) {
                                com.alipay.sdk.util.c.d(th10);
                            }
                            com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                            com.alipay.sdk.app.statistic.a.a(this.f5882a, aVar, str, aVar.d);
                            this.f5883b = null;
                            if (this.d && (activity = this.f5882a) != null) {
                                activity.setRequestedOrientation(0);
                                this.d = 0 == true ? 1 : 0;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    bVar = bVar2;
                }
            } catch (Throwable th12) {
                th = th12;
                bVar = bVar2;
                aVar2 = null;
                com.alipay.sdk.app.statistic.a.e(aVar, "biz", "ClientBindFailed", th, "in_bind");
                return new Pair<>("failed", Boolean.TRUE);
            }
        } catch (Throwable th13) {
            th = th13;
            bVar = bVar2;
            aVar2 = null;
        }
    }

    public String e(String str) {
        String strD = "";
        PackageInfo packageInfo = null;
        try {
            List<com.alipay.sdk.data.a.C0118a> listV = com.alipay.sdk.data.a.w().v();
            if (!com.alipay.sdk.data.a.w().g || listV == null) {
                listV = com.alipay.sdk.app.a.d;
            }
            k.a aVarC = k.c(this.f, this.f5882a, listV);
            if (aVarC == null || aVarC.b(this.f) || aVarC.a() || k.m(aVarC.f5891a)) {
                return "failed";
            }
            PackageInfo packageInfo2 = aVarC.f5891a;
            strD = (packageInfo2 == null || CommonConstants.ALIPAY_PACKAGE_NAME.equals(packageInfo2.packageName)) ? k.d() : aVarC.f5891a.packageName;
            PackageInfo packageInfo3 = aVarC.f5891a;
            packageInfo = packageInfo3 != null ? packageInfo3 : null;
            if (!com.alipay.sdk.data.a.w().t()) {
                i(aVarC);
            }
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(this.f, "biz", "CheckClientSignEx", th);
        }
        return g(str, strD, packageInfo);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final String f(String str, String str2) {
        String str3;
        String str4;
        String strSubstring;
        String strSubstring2;
        JSONObject jSONObject;
        String strReplace = str;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        String strE = k.e(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.app.statistic.a.h(this.f, "biz", "BSPStart", strE + "|" + jElapsedRealtime);
        com.alipay.sdk.sys.a.C0120a.d(this.f, strE);
        AlipayResultActivity.f5795a.put(strE, new AlipayResultActivity.a() { // from class: com.alipay.sdk.util.e.1
            @Override // com.alipay.sdk.app.AlipayResultActivity.a
            public void a(int i, String str5, String str6) {
                e.this.g = com.alipay.sdk.app.b.b(i, str5, str6);
                countDownLatch.countDown();
            }
        });
        try {
            try {
                String[] strArrSplit = strReplace.split(gv5.CONNECT_STR, -1);
                int length = strArrSplit.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str4 = null;
                        strSubstring = "";
                        strSubstring2 = strSubstring;
                        jSONObject = null;
                        break;
                    }
                    str4 = strArrSplit[i];
                    if (str4.startsWith("bizcontext=")) {
                        String strSubstring3 = str4.substring(str4.indexOf("{"), str4.lastIndexOf("}") + 1);
                        int iIndexOf = str4.indexOf(strSubstring3);
                        strSubstring2 = str4.substring(0, iIndexOf);
                        strSubstring = str4.substring(iIndexOf + strSubstring3.length());
                        jSONObject = new JSONObject(strSubstring3);
                        if (!jSONObject.optString("sc").equals("h5tonative")) {
                            jSONObject.put("sc", "h5tonative_sdkscheme");
                            break;
                        }
                        jSONObject.put("sc", "h5tonative_scheme");
                        break;
                    }
                    i++;
                }
                if (TextUtils.isEmpty(str4)) {
                    throw new RuntimeException("empty ctx_args");
                }
                if (strReplace.indexOf(str4) != strReplace.lastIndexOf(str4)) {
                    throw new RuntimeException("multi ctx_args");
                }
                strReplace = strReplace.replace(str4, strSubstring2 + jSONObject.toString() + strSubstring);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sourcePid", Binder.getCallingPid());
                jSONObject2.put("external_info", strReplace);
                jSONObject2.put(Constants.KEY_PACKAGE_NAME, this.f5882a.getPackageName());
                jSONObject2.put(CommonConstants.KEY_SESSION, strE);
                String strEncodeToString = Base64.encodeToString(jSONObject2.toString().getBytes("UTF-8"), 2);
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter(q.f13858b, "20000125");
                builderAppendQueryParameter.appendQueryParameter("mqpSchemePay", strEncodeToString);
                try {
                    HashMap<String, String> mapF = com.alipay.sdk.sys.a.f(this.f);
                    mapF.put("ts_scheme", String.valueOf(jElapsedRealtime));
                    builderAppendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(mapF).toString());
                } catch (Throwable th) {
                    com.alipay.sdk.app.statistic.a.d(this.f, "biz", "BSPLocEx", th);
                }
                String string = builderAppendQueryParameter.build().toString();
                Intent intent = new Intent();
                intent.setPackage(str2);
                intent.addFlags(268435456);
                intent.setData(Uri.parse(string));
                Activity activity = this.f5882a;
                com.alipay.sdk.sys.a aVar = this.f;
                com.alipay.sdk.app.statistic.a.a(activity, aVar, strReplace, aVar.d);
                this.f5882a.startActivity(intent);
                com.alipay.sdk.data.a.w().e(this.f, this.f5882a.getApplicationContext());
                com.alipay.sdk.util.c.f("mspl", "pay scheme waiting " + string);
                countDownLatch.await();
                String str5 = this.g;
                try {
                    str3 = i.c(this.f, str5).get("resultStatus");
                    if (str3 == null) {
                        str3 = AbstractJsonLexerKt.NULL;
                    }
                } catch (Throwable th2) {
                    com.alipay.sdk.app.statistic.a.d(this.f, "biz", "BSPStatEx", th2);
                    str3 = "unknown";
                }
                com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BSPDone-" + str3);
                if (!TextUtils.isEmpty(str5)) {
                    return str5;
                }
                com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BSPEmpty");
                return "scheme_failed";
            } catch (Throwable th3) {
                com.alipay.sdk.app.statistic.a.d(this.f, "biz", "BSPEx", th3);
                return "scheme_failed";
            }
        } catch (Exception e) {
            try {
                com.alipay.sdk.app.statistic.a.e(this.f, "biz", "BSPSCReplaceEx", e, Base64.encodeToString(str.getBytes(), 2));
            } catch (InterruptedException e2) {
                com.alipay.sdk.app.statistic.a.d(this.f, "biz", "BSPWaiting", e2);
                com.alipay.sdk.app.c cVar = com.alipay.sdk.app.c.PAY_WAITTING;
                return com.alipay.sdk.app.b.b(cVar.a(), cVar.b(), "");
            }
        }
    }

    public final String g(String str, String str2, PackageInfo packageInfo) {
        String str3;
        com.alipay.sdk.sys.a aVar;
        int i = packageInfo != null ? packageInfo.versionCode : 0;
        String str4 = packageInfo != null ? packageInfo.versionName : "";
        com.alipay.sdk.util.c.f("mspl", "pay bind or scheme");
        com.alipay.sdk.app.statistic.a.h(this.f, "biz", "PgWltVer", str2 + "|" + str4);
        if (k.E()) {
            com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BindSkipByModel");
            str3 = "failed";
        } else {
            Pair<String, Boolean> pairA = a(str, str2, this.f);
            str3 = (String) pairA.first;
            try {
                if ("failed".equals(str3) && ((Boolean) pairA.second).booleanValue() && com.alipay.sdk.data.a.w().s()) {
                    com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BindRetry");
                    str3 = (String) a(str, str2, this.f).first;
                }
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.d(this.f, "biz", "BindRetryEx", th);
            }
        }
        com.alipay.sdk.util.c.f("mspl", "pay bind result: " + str3);
        Activity activity = this.f5882a;
        com.alipay.sdk.sys.a aVar2 = this.f;
        com.alipay.sdk.app.statistic.a.a(activity, aVar2, str, aVar2.d);
        if ("failed".equals(str3)) {
            if (!com.alipay.sdk.data.a.w().j()) {
                com.alipay.sdk.app.statistic.a.h(this.f, "biz", "BSPNotStartByConfig", "");
                return str3;
            }
            if (CommonConstants.ALIPAY_PACKAGE_NAME.equals(str2) && i > 125) {
                if (!com.alipay.sdk.data.a.w().p() || (aVar = this.f) == null || k.p(aVar.f) == 0) {
                    Activity activity2 = this.f5882a;
                    return (activity2 == null || !j(str2, activity2, this.f)) ? "scheme_failed" : f(str, str2);
                }
                com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BSPNotStartByUsr");
                return str3;
            }
            com.alipay.sdk.app.statistic.a.h(this.f, "biz", "BSPNotStartByPkg", str2 + "|" + i);
        }
        return str3;
    }

    public void h() {
        this.f5882a = null;
        this.e = null;
    }

    public final void i(k.a aVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (aVar == null || (packageInfo = aVar.f5891a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f5882a.startActivity(intent);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(this.f, "biz", "StartLaunchAppTransEx", th);
        }
        Thread.sleep(200L);
    }
}
