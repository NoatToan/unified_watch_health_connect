package nh;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.maps.android.BuildConfig;
import ds.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f126122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile IAlixPay f126123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f126124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f126125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lh.a f126126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f126127f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f126128g = null;

    public interface c {
        void a();
    }

    public i(Activity activity, lh.a aVar, c cVar) {
        this.f126122a = activity;
        this.f126126e = aVar;
        this.f126125d = cVar;
    }

    public static boolean e(Context context, String str, lh.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            wg.a.b("BSADetectFail", aVar);
            return false;
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "BSADetectFail", th3);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, Boolean> a(String str, String str2, lh.a aVar) {
        int i14;
        IRemoteServiceCallback aVar2;
        Activity activity;
        int version;
        String strA;
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction((fg.b.a() && TextUtils.equals(str2, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbK = e0.k(jElapsedRealtime, "", "|");
        sbK.append(str != null ? str.length() : 0);
        wg.a.c(aVar, "biz", "PgBindStarting", sbK.toString());
        wg.a.a(str, aVar.f112379d, this.f126122a, aVar);
        try {
            try {
                if (ah.a.g().f3252h) {
                    wg.a.c(aVar, "biz", "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.f126122a.getApplication().startService(intent);
                    wg.a.c(aVar, "biz", "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : BuildConfig.TRAVIS);
                }
            } catch (Throwable th3) {
                wg.a.d(aVar, "biz", "ClientBindServiceFailed", th3);
                n.g(this.f126122a, "bindServiceFail", this.f126126e);
                return new Pair<>("failed", Boolean.TRUE);
            }
        } catch (Throwable th4) {
            wg.a.d(aVar, "biz", "TryStartServiceEx", th4);
        }
        if (ah.a.g().f3254j) {
            wg.a.c(aVar, "biz", "bindFlg", "imp");
            i14 = 65;
        } else {
            i14 = 1;
        }
        f fVar = null;
        b bVar = new b(this, fVar);
        if (!this.f126122a.getApplicationContext().bindService(intent, bVar, i14)) {
            throw new Throwable("bindService fail");
        }
        synchronized (IAlixPay.class) {
            if (this.f126123b == null) {
                try {
                    IAlixPay.class.wait(ah.a.g().f());
                } catch (InterruptedException e4) {
                    wg.a.d(aVar, "biz", "BindWaitTimeoutEx", e4);
                }
            }
        }
        IAlixPay iAlixPay = this.f126123b;
        try {
            if (iAlixPay == null) {
                wg.a.g(aVar, "biz", "ClientBindFailed", "");
                n.g(this.f126122a, "bindServiceTimeout", this.f126126e);
                Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                try {
                    this.f126122a.getApplicationContext().unbindService(bVar);
                } catch (Throwable th5) {
                    d.a(th5);
                }
                wg.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                wg.a.a(str, aVar.f112379d, this.f126122a, aVar);
                this.f126123b = null;
                if (this.f126124c && (activity4 = this.f126122a) != null) {
                    activity4.setRequestedOrientation(0);
                    this.f126124c = false;
                }
                return pair;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            wg.a.c(aVar, "biz", "PgBinded", "" + jElapsedRealtime2);
            if (this.f126122a.getRequestedOrientation() == 0) {
                this.f126122a.setRequestedOrientation(1);
                this.f126124c = true;
            }
            try {
                version = iAlixPay.getVersion();
            } catch (Throwable th6) {
                d.a(th6);
                version = 0;
            }
            aVar2 = new a(this, fVar);
            try {
                if (version >= 3) {
                    iAlixPay.registerCallback03(aVar2, str, null);
                } else {
                    iAlixPay.registerCallback(aVar2);
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                wg.a.c(aVar, "biz", "PgBindPay", "" + jElapsedRealtime3);
                if (version >= 3) {
                    iAlixPay.r03("biz", "bind_pay", null);
                }
                try {
                    if (version >= 2) {
                        HashMap<String, String> mapD = lh.a.d(aVar);
                        mapD.put("ts_bind", String.valueOf(jElapsedRealtime));
                        mapD.put("ts_bend", String.valueOf(jElapsedRealtime2));
                        mapD.put("ts_pay", String.valueOf(jElapsedRealtime3));
                        strA = iAlixPay.pay02(str, mapD);
                    } else {
                        strA = iAlixPay.Pay(str);
                    }
                } catch (Throwable th7) {
                    lh.a aVar3 = this.f126126e;
                    if (aVar3 != null && !aVar3.f112384i) {
                        wg.a.d(aVar, "biz", "ClientBindException", th7);
                        n.g(this.f126122a, "bindServiceEx", this.f126126e);
                        if (ah.a.g().f3262r) {
                            Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.FALSE);
                            try {
                                iAlixPay.unregisterCallback(aVar2);
                            } catch (Throwable th8) {
                                d.a(th8);
                            }
                            try {
                                this.f126122a.getApplicationContext().unbindService(bVar);
                            } catch (Throwable th9) {
                                d.a(th9);
                            }
                            wg.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                            wg.a.a(str, aVar.f112379d, this.f126122a, aVar);
                            this.f126123b = null;
                            if (this.f126124c && (activity2 = this.f126122a) != null) {
                                activity2.setRequestedOrientation(0);
                                this.f126124c = false;
                            }
                            return pair2;
                        }
                    }
                    strA = ug.b.a();
                }
                String str3 = strA;
                try {
                    iAlixPay.unregisterCallback(aVar2);
                } catch (Throwable th10) {
                    d.a(th10);
                }
                try {
                    this.f126122a.getApplicationContext().unbindService(bVar);
                } catch (Throwable th11) {
                    d.a(th11);
                }
                wg.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                wg.a.a(str, aVar.f112379d, this.f126122a, aVar);
                this.f126123b = null;
                if (this.f126124c && (activity3 = this.f126122a) != null) {
                    activity3.setRequestedOrientation(0);
                    this.f126124c = false;
                }
                return new Pair<>(str3, Boolean.FALSE);
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
            aVar2 = null;
        }
        try {
            wg.a.e(aVar, "ClientBindFailed", th, "in_bind");
            return new Pair<>("failed", Boolean.TRUE);
        } finally {
            if (aVar2 != null) {
                try {
                    iAlixPay.unregisterCallback(aVar2);
                } catch (Throwable th14) {
                    d.a(th14);
                }
            }
            try {
                this.f126122a.getApplicationContext().unbindService(bVar);
            } catch (Throwable th15) {
                d.a(th15);
            }
            wg.a.c(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
            wg.a.a(str, aVar.f112379d, this.f126122a, aVar);
            this.f126123b = null;
            if (this.f126124c && (activity = this.f126122a) != null) {
                activity.setRequestedOrientation(0);
                this.f126124c = 0 == true ? 1 : 0;
            }
        }
    }

    public final String b(String str, String str2, PackageInfo packageInfo) {
        JSONObject jSONObject;
        wg.a.c(this.f126126e, "biz", "PgWltVer", e5.g(str2, "|", packageInfo != null ? packageInfo.versionName : ""));
        Activity activity = this.f126122a;
        lh.a aVar = this.f126126e;
        wg.a.a(str, aVar.f112379d, activity, aVar);
        Object obj = new Object();
        String strA = n.a(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        wg.a.c(this.f126126e, "biz", "BSAStart", strA + "|" + jElapsedRealtime);
        lh.a aVar2 = this.f126126e;
        HashMap<UUID, lh.a> map = lh.a.C2158a.f112387a;
        if (aVar2 != null && !TextUtils.isEmpty(strA)) {
            lh.a.C2158a.f112388b.put(strA, aVar2);
        }
        f fVar = new f(this, obj);
        APayEntranceActivity.f28399d.put(strA, fVar);
        try {
            HashMap<String, String> mapD = lh.a.d(this.f126126e);
            mapD.put("ts_intent", String.valueOf(jElapsedRealtime));
            jSONObject = new JSONObject(mapD);
        } catch (Throwable th3) {
            try {
                wg.a.d(this.f126126e, "biz", "BSALocEx", th3);
                jSONObject = null;
            } catch (InterruptedException e4) {
                wg.a.d(this.f126126e, "biz", "BSAWaiting", e4);
                ug.c cVar = ug.c.PAY_WAITTING;
                return ug.b.b(cVar.f170562a, cVar.f170563b, "");
            } catch (Throwable th4) {
                wg.a.d(this.f126126e, "biz", "BSAEx", th4);
                n.g(this.f126122a, "startActivityEx", this.f126126e);
                return "scheme_failed";
            }
        }
        Intent intent = new Intent(this.f126122a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra("ap_order_info", str);
        intent.putExtra("ap_target_packagename", str2);
        intent.putExtra("ap_session", strA);
        if (jSONObject != null) {
            intent.putExtra("ap_local_info", jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new g(this, fVar), ah.a.g().f());
        Activity activity2 = this.f126122a;
        lh.a aVar3 = this.f126126e;
        wg.a.a(str, aVar3.f112379d, activity2, aVar3);
        if (ah.a.g().f3250f) {
            new Handler(Looper.getMainLooper()).post(new h(this, intent, obj));
        } else {
            try {
                Activity activity3 = this.f126122a;
                if (activity3 != null) {
                    activity3.startActivity(intent);
                } else {
                    wg.a.g(this.f126126e, "biz", "ErrActNull", "");
                    Context context = this.f126126e.f112378c;
                    if (context != null) {
                        context.startActivity(intent);
                    }
                }
            } catch (Throwable th5) {
                wg.a.d(this.f126126e, "biz", "ErrActEx", th5);
                throw th5;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.f126128g;
        String str4 = PrivacyUpdateRequestError.UNKNOWN;
        try {
            String str5 = (String) m.c(str3, this.f126126e).get("resultStatus");
            str4 = str5 == null ? BuildConfig.TRAVIS : str5;
        } catch (Throwable th6) {
            wg.a.d(this.f126126e, "biz", "BSAStatEx", th6);
        }
        wg.a.b("BSADone-".concat(str4), this.f126126e);
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        wg.a.b("BSAEmpty", this.f126126e);
        return "scheme_failed";
    }

    /* JADX WARN: Code duplicated, block: B:138:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0155 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #6 {all -> 0x0158, blocks: (B:93:0x014d, B:95:0x0155), top: B:138:0x014d }] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (android.text.TextUtils.equals(r0, r11[1]) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(String str, boolean z14) {
        String strK;
        n.b bVarF;
        boolean zContains;
        String str2;
        Activity activity;
        lh.a aVar = this.f126126e;
        boolean zContains2 = false;
        PackageInfo packageInfo = null;
        try {
            ArrayList arrayList = ah.a.g().f3268x;
            ah.a.g().getClass();
            bVarF = n.f(aVar, this.f126122a, ug.a.f170550d);
            if (bVarF != null) {
                try {
                    if (!bVarF.a(aVar)) {
                        PackageInfo packageInfo2 = bVarF.f126135a;
                        if (!(packageInfo2.versionCode < bVarF.f126136b)) {
                            if (packageInfo2 != null) {
                                try {
                                    String str3 = packageInfo2.versionName;
                                    String[] strArr = n.f126132a;
                                    if (!TextUtils.equals(str3, strArr[0])) {
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            PackageInfo packageInfo3 = bVarF.f126135a;
                            strK = (packageInfo3 == null || "com.eg.android.AlipayGphone".equals(packageInfo3.packageName)) ? n.k() : bVarF.f126135a.packageName;
                            try {
                                PackageInfo packageInfo4 = bVarF.f126135a;
                                packageInfo = packageInfo4 != null ? packageInfo4 : null;
                                String str4 = ah.a.g().f3260p;
                                if (str4 != null && str4.length() > 0) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject = new JSONObject(str4).optJSONObject(strK);
                                        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                int i14 = Integer.parseInt(next);
                                                if (packageInfo != null && packageInfo.versionCode >= i14) {
                                                    try {
                                                        boolean zE = ah.a.g().e(Integer.parseInt(jSONObjectOptJSONObject.getString(next)), this.f126122a);
                                                        this.f126127f = zE;
                                                        if (zE) {
                                                            break;
                                                        }
                                                    } catch (Exception unused2) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                wg.a.d(aVar, "biz", "CheckClientSignEx", th);
                            }
                            if (aVar != null) {
                                String str5 = aVar.f112381f;
                                if (TextUtils.isEmpty(str5)) {
                                    zContains = false;
                                } else {
                                    zContains = str5.toLowerCase().contains("auth");
                                }
                            } else {
                                zContains = false;
                            }
                            if ((z14 || this.f126127f) && !zContains && e(this.f126122a, strK, aVar)) {
                                return b(str, strK, packageInfo);
                            }
                            int i15 = packageInfo != null ? packageInfo.versionCode : 0;
                            if (aVar != null) {
                                String str6 = aVar.f112381f;
                                if (!TextUtils.isEmpty(str6)) {
                                    zContains2 = str6.toLowerCase().contains("auth");
                                }
                            }
                            if (zContains2) {
                                if (bVarF != null) {
                                    if (!ah.a.g().f3256l) {
                                        d(bVarF);
                                    }
                                }
                                Pair<String, Boolean> pairA = a(str, strK, aVar);
                                str2 = (String) pairA.first;
                                if ("failed".equals(str2)) {
                                    wg.a.b("BindRetry", aVar);
                                    str2 = (String) a(str, strK, aVar).first;
                                }
                            } else {
                                try {
                                    int iN = n.n(strK);
                                    wg.a.c(aVar, "biz", "bindExt", "" + iN);
                                    if (ah.a.g().f3263s && (iN & 2) == 2) {
                                        if (bVarF != null) {
                                            try {
                                                if (ah.a.g().f3257m) {
                                                    d(bVarF);
                                                }
                                            } catch (Throwable unused4) {
                                            }
                                        }
                                        wg.a.b("BindSkipByL", aVar);
                                        str2 = "failed";
                                    } else {
                                        if (bVarF != null) {
                                            try {
                                                if (!ah.a.g().f3256l) {
                                                    d(bVarF);
                                                }
                                            } catch (Throwable unused5) {
                                            }
                                        }
                                        Pair<String, Boolean> pairA2 = a(str, strK, aVar);
                                        str2 = (String) pairA2.first;
                                        try {
                                            if ("failed".equals(str2) && ((Boolean) pairA2.second).booleanValue() && ah.a.g().f3255k) {
                                                wg.a.b("BindRetry", aVar);
                                                str2 = (String) a(str, strK, aVar).first;
                                            }
                                        } catch (Throwable th4) {
                                            wg.a.d(aVar, "biz", "BindRetryEx", th4);
                                        }
                                    }
                                } catch (Throwable unused6) {
                                }
                            }
                            wg.a.a(str, aVar.f112379d, this.f126122a, aVar);
                            if (!"failed".equals(str2)) {
                                return str2;
                            }
                            if ("com.eg.android.AlipayGphone".equals(strK)) {
                                return (i15 < 460 || zContains2 || (activity = this.f126122a) == null || !e(activity, strK, aVar)) ? str2 : b(str, strK, packageInfo);
                            }
                            wg.a.c(aVar, "biz", "BSPNotStartByAlipay", vb.h.h(i15, strK, "|"));
                            return str2;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    strK = "";
                }
            }
            return "failed";
        } catch (Throwable th6) {
            th = th6;
            strK = "";
            bVarF = null;
        }
    }

    public final void d(n.b bVar) throws InterruptedException {
        PackageInfo packageInfo = bVar.f126135a;
        if (packageInfo == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f126122a.startActivity(intent);
        } catch (Throwable th3) {
            wg.a.d(this.f126126e, "biz", "StartLaunchAppTransEx", th3);
        }
        Thread.sleep(200L);
    }

    public class a extends IRemoteServiceCallback.Stub {
        public a() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final int getVersion() {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final boolean isHideLoadingScreen() {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final void payEnd(boolean z14, String str) {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final void r03(String str, String str2, Map map) {
            i iVar = i.this;
            wg.a.c(iVar.f126126e, "wlt", str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                c cVar = iVar.f126125d;
                if (cVar != null) {
                    cVar.a();
                }
                lh.a aVar = iVar.f126126e;
                if (aVar != null) {
                    aVar.f112384i = true;
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final void startActivity(String str, String str2, int i14, Bundle bundle) {
            i iVar = i.this;
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i14);
                intent.putExtras(bundle);
            } catch (Exception e4) {
                wg.a.d(iVar.f126126e, "biz", "ErrIntentEx", e4);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                wg.a.c(iVar.f126126e, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (iVar.f126122a == null) {
                    wg.a.g(iVar.f126126e, "biz", "ErrActNull", "");
                    Context context = iVar.f126126e.f112378c;
                    if (context != null) {
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iVar.f126122a.startActivity(intent);
                wg.a.c(iVar.f126126e, "biz", "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th3) {
                wg.a.d(iVar.f126126e, "biz", "ErrActEx", th3);
                throw th3;
            }
        }

        public /* synthetic */ a(i iVar, f fVar) {
            this();
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            wg.a.b("srvCon", i.this.f126126e);
            i.this.getClass();
            synchronized (IAlixPay.class) {
                i.this.f126123b = IAlixPay.Stub.asInterface(iBinder);
                i.this.getClass();
                IAlixPay.class.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            wg.a.b("srvDis", i.this.f126126e);
            i.this.f126123b = null;
        }

        public /* synthetic */ b(i iVar, f fVar) {
            this();
        }
    }
}
