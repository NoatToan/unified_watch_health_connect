package com.alipay.sdk.m.x;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.huawei.operation.utils.Constants;
import defpackage.mn;
import defpackage.mp;
import defpackage.mu;
import defpackage.mx;
import defpackage.on;
import defpackage.oq;
import defpackage.or;
import defpackage.ov;
import defpackage.ox;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile IAlixPay f2140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f2142c;
    public boolean d;
    public final on f;
    public final Object e = IAlixPay.class;
    public boolean i = false;
    public String j = null;

    public class a implements APayEntranceActivity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f2143a;

        public a(Object obj) {
            this.f2143a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            i.this.j = str;
            synchronized (this.f2143a) {
                try {
                    this.f2143a.notify();
                } catch (Throwable th) {
                    mu.c(i.this.f, "biz", "BSAResultEx", th);
                }
            }
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mu.b(i.this.f, "biz", "srvCon");
            synchronized (i.this.e) {
                i.this.f2140a = IAlixPay.Stub.asInterface(iBinder);
                i.this.e.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            mu.b(i.this.f, "biz", "srvDis");
            i.this.f2140a = null;
        }

        public /* synthetic */ b(i iVar, a aVar) {
            this();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ APayEntranceActivity.a d;

        public c(APayEntranceActivity.a aVar) {
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.f == null || i.this.f.f()) {
                return;
            }
            mu.e(i.this.f, "biz", "ErrActNotCreated", "");
            if (mx.c().ab()) {
                i.this.f.d(true);
                this.d.a(mp.d());
            }
        }
    }

    public class d extends IRemoteServiceCallback.Stub {
        public d() {
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
            mu.d(i.this.f, "wlt", str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (i.this.f2142c != null) {
                    i.this.f2142c.a();
                }
                if (i.this.f != null) {
                    i.this.f.b(true);
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
                mu.c(i.this.f, "biz", "ErrIntentEx", e);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                mu.d(i.this.f, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (i.this.f2141b == null) {
                    mu.e(i.this.f, "biz", "ErrActNull", "");
                    Context contextC = i.this.f.c();
                    if (contextC != null) {
                        contextC.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                i.this.f2141b.startActivity(intent);
                mu.d(i.this.f, "biz", "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th) {
                mu.c(i.this.f, "biz", "ErrActEx", th);
                throw th;
            }
        }

        public /* synthetic */ d(i iVar, a aVar) {
            this();
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f2147b;
        public final /* synthetic */ Object e;

        public e(Intent intent, Object obj) {
            this.f2147b = intent;
            this.e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f2141b != null) {
                    i.this.f2141b.startActivity(this.f2147b);
                    return;
                }
                mu.e(i.this.f, "biz", "ErrActNull2", "");
                Context contextC = i.this.f.c();
                if (contextC != null) {
                    contextC.startActivity(this.f2147b);
                }
            } catch (Throwable th) {
                mu.c(i.this.f, "biz", "ErrActEx2", th);
                ox.b("alipaySdk", "startActivityEx", i.this.f2141b, i.this.f);
                synchronized (this.e) {
                    try {
                        i.this.j = "scheme_failed";
                        this.e.notify();
                    } catch (Throwable th2) {
                        mu.c(i.this.f, "biz", "BSAResultEx", th2);
                    }
                }
            }
        }
    }

    public interface f {
        void a();

        void b();
    }

    public i(Activity activity, on onVar, f fVar) {
        this.f2141b = activity;
        this.f = onVar;
        this.f2142c = fVar;
        oq.c("mspl", "alipaySdk");
    }

    public String b(String str, boolean z) {
        Throwable th;
        PackageInfo packageInfo;
        String strC = "";
        ox.d dVar = null;
        PackageInfo packageInfo2 = null;
        try {
            List<mx.d> listP = mx.c().p();
            if (!mx.c().o || listP == null) {
                listP = mn.e;
            }
            ox.d dVarC = ox.c(this.f, this.f2141b, listP);
            if (dVarC != null) {
                try {
                    if (dVarC.d(this.f) || dVarC.a() || ox.b(dVarC.e)) {
                        return EventType.FAILED;
                    }
                    PackageInfo packageInfo3 = dVarC.e;
                    if (packageInfo3 != null && !"com.eg.android.AlipayGphone".equals(packageInfo3.packageName)) {
                        strC = dVarC.e.packageName;
                    } else {
                        strC = ox.c();
                    }
                    PackageInfo packageInfo4 = dVarC.e;
                    packageInfo2 = packageInfo4 != null ? packageInfo4 : null;
                    String strI = mx.c().i();
                    if (strI != null && strI.length() > 0) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strI).optJSONObject(strC);
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    int i = Integer.parseInt(next);
                                    if (packageInfo2 != null && packageInfo2.versionCode >= i) {
                                        try {
                                            boolean zE = mx.c().e(this.f2141b, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.i = zE;
                                            if (zE) {
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
                } catch (Throwable th2) {
                    th = th2;
                    packageInfo = packageInfo2;
                    dVar = dVarC;
                    mu.c(this.f, "biz", "CheckClientSignEx", th);
                    PackageInfo packageInfo5 = packageInfo;
                    dVarC = dVar;
                    packageInfo2 = packageInfo5;
                }
                boolean zC = ox.c(this.f);
                if ((z || this.i) && !zC && e(strC, this.f2141b, this.f)) {
                    return e(str, strC, packageInfo2);
                }
                return b(str, strC, packageInfo2, dVarC);
            }
            return EventType.FAILED;
        } catch (Throwable th3) {
            th = th3;
            packageInfo = null;
        }
    }

    public final void e(ox.d dVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (dVar == null || (packageInfo = dVar.e) == null) {
            return;
        }
        if (!mx.c().d(this.f)) {
            on onVar = this.f;
            String strD = or.d(onVar, onVar.c(), "sp_bind_failed", "false");
            oq.c("mspl", "get SP_BIND_FAILED: " + strD);
            if (TextUtils.isEmpty(strD) || TextUtils.equals(strD, "false")) {
                return;
            }
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f2141b.startActivity(intent);
        } catch (Throwable th) {
            mu.c(this.f, "biz", "StartLaunchAppTransEx", th);
        }
        Thread.sleep(200L);
    }

    public final String e(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        oq.c("mspl", "pay payInvokeAct");
        mu.d(this.f, "biz", "PgWltVer", str2 + "|" + str3);
        Activity activity = this.f2141b;
        on onVar = this.f;
        mu.d(activity, onVar, str, onVar.f44353a);
        return b(str, str2);
    }

    public final String b(String str, String str2, PackageInfo packageInfo, ox.d dVar) {
        String str3;
        Activity activity;
        boolean zContains = false;
        int i = packageInfo != null ? packageInfo.versionCode : 0;
        oq.c("mspl", "pay bind or scheme");
        on onVar = this.f;
        if (onVar != null && !TextUtils.isEmpty(onVar.j)) {
            zContains = this.f.j.toLowerCase().contains("auth");
        }
        if (!zContains && ox.d(this.f, str2)) {
            if (dVar != null) {
                try {
                    if (mx.c().e()) {
                        e(dVar);
                    }
                } catch (Throwable unused) {
                }
            }
            mu.b(this.f, "biz", "BindSkipByL");
            str3 = EventType.FAILED;
        } else {
            if (dVar != null) {
                try {
                    if (!mx.c().q()) {
                        e(dVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            Pair<String, Boolean> pairD = d(str, str2, this.f);
            str3 = (String) pairD.first;
            try {
                if (EventType.FAILED.equals(str3) && ((Boolean) pairD.second).booleanValue() && mx.c().t()) {
                    mu.b(this.f, "biz", "BindRetry");
                    str3 = (String) d(str, str2, this.f).first;
                }
            } catch (Throwable th) {
                mu.c(this.f, "biz", "BindRetryEx", th);
            }
        }
        oq.c("mspl", "pay bind result: " + str3);
        Activity activity2 = this.f2141b;
        on onVar2 = this.f;
        mu.d(activity2, onVar2, str, onVar2.f44353a);
        if (EventType.FAILED.equals(str3)) {
            if (!mx.c().d(this.f)) {
                oq.c("mspl", "save SP_BIND_FAILED: true");
                on onVar3 = this.f;
                or.c(onVar3, onVar3.c(), "sp_bind_failed", "true");
            }
            if (!"com.eg.android.AlipayGphone".equals(str2)) {
                mu.d(this.f, "biz", "BSPNotStartByAlipay", str2 + "|" + i);
                return str3;
            }
            if (i >= 460 && !zContains && (activity = this.f2141b) != null && e(str2, activity, this.f)) {
                return e(str, str2, packageInfo);
            }
        }
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, Boolean> d(String str, String str2, on onVar) {
        int i;
        IRemoteServiceCallback dVar;
        Activity activity;
        int version;
        String strD;
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(ox.a(str2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder("");
        sb.append(jElapsedRealtime);
        sb.append("|");
        sb.append(str != null ? str.length() : 0);
        mu.d(onVar, "biz", "PgBindStarting", sb.toString());
        mu.d(this.f2141b, onVar, str, onVar.f44353a);
        try {
            try {
                if (!mx.c().o()) {
                    ComponentName componentNameStartService = this.f2141b.getApplication().startService(intent);
                    mu.d(onVar, "biz", "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : Constants.NULL);
                } else {
                    mu.d(onVar, "biz", "stSrv", "skipped");
                }
            } catch (Throwable th) {
                mu.c(onVar, "biz", "ClientBindServiceFailed", th);
                ox.b("alipaySdk", "bindServiceFail", this.f2141b, this.f);
                return new Pair<>(EventType.FAILED, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            mu.c(onVar, "biz", "TryStartServiceEx", th2);
        }
        if (mx.c().f()) {
            mu.d(onVar, "biz", "bindFlg", "imp");
            i = 65;
        } else {
            i = 1;
        }
        boolean zH = mx.c().h();
        if (Build.VERSION.SDK_INT >= 34 && zH) {
            i |= 512;
            mu.d(onVar, "biz", "bindFlg", "allow");
        }
        a aVar = null;
        b bVar = new b(this, aVar);
        if (this.f2141b.getApplicationContext().bindService(intent, bVar, i)) {
            synchronized (this.e) {
                if (this.f2140a == null) {
                    try {
                        this.e.wait(mx.c().k());
                    } catch (InterruptedException e2) {
                        mu.c(onVar, "biz", "BindWaitTimeoutEx", e2);
                    }
                }
            }
            IAlixPay iAlixPay = this.f2140a;
            try {
                if (iAlixPay == null) {
                    mu.e(onVar, "biz", "ClientBindFailed", "");
                    ox.b("alipaySdk", "bindServiceTimeout", this.f2141b, this.f);
                    Pair<String, Boolean> pair = new Pair<>(EventType.FAILED, Boolean.TRUE);
                    try {
                        this.f2141b.getApplicationContext().unbindService(bVar);
                    } catch (Throwable th3) {
                        oq.c(th3);
                    }
                    mu.d(onVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                    mu.d(this.f2141b, onVar, str, onVar.f44353a);
                    this.f2140a = null;
                    if (this.d && (activity4 = this.f2141b) != null) {
                        activity4.setRequestedOrientation(0);
                        this.d = false;
                    }
                    return pair;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                mu.d(onVar, "biz", "PgBinded", "" + jElapsedRealtime2);
                f fVar = this.f2142c;
                if (fVar != null) {
                    fVar.b();
                }
                if (this.f2141b.getRequestedOrientation() == 0) {
                    this.f2141b.setRequestedOrientation(1);
                    this.d = true;
                }
                try {
                    version = iAlixPay.getVersion();
                } catch (Throwable th4) {
                    oq.c(th4);
                    version = 0;
                }
                dVar = new d(this, aVar);
                try {
                    if (version >= 3) {
                        iAlixPay.registerCallback03(dVar, str, null);
                    } else {
                        iAlixPay.registerCallback(dVar);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    mu.d(onVar, "biz", "PgBindPay", "" + jElapsedRealtime3);
                    if (version >= 3) {
                        iAlixPay.r03("biz", "bind_pay", null);
                    }
                    try {
                        if (version >= 2) {
                            Map mapD = on.d(onVar);
                            mapD.put("ts_bind", String.valueOf(jElapsedRealtime));
                            mapD.put("ts_bend", String.valueOf(jElapsedRealtime2));
                            mapD.put("ts_pay", String.valueOf(jElapsedRealtime3));
                            strD = iAlixPay.pay02(str, mapD);
                        } else {
                            strD = iAlixPay.Pay(str);
                        }
                    } catch (Throwable th5) {
                        on onVar2 = this.f;
                        if (onVar2 != null && !onVar2.j()) {
                            mu.c(onVar, "biz", "ClientBindException", th5);
                            ox.b("alipaySdk", "bindServiceEx", this.f2141b, this.f);
                            if (mx.c().u()) {
                                Pair<String, Boolean> pair2 = new Pair<>(EventType.FAILED, Boolean.FALSE);
                                try {
                                    iAlixPay.unregisterCallback(dVar);
                                } catch (Throwable th6) {
                                    oq.c(th6);
                                }
                                try {
                                    this.f2141b.getApplicationContext().unbindService(bVar);
                                } catch (Throwable th7) {
                                    oq.c(th7);
                                }
                                mu.d(onVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                                mu.d(this.f2141b, onVar, str, onVar.f44353a);
                                this.f2140a = null;
                                if (this.d && (activity2 = this.f2141b) != null) {
                                    activity2.setRequestedOrientation(0);
                                    this.d = false;
                                }
                                return pair2;
                            }
                        }
                        strD = mp.d();
                    }
                    String str3 = strD;
                    try {
                        iAlixPay.unregisterCallback(dVar);
                    } catch (Throwable th8) {
                        oq.c(th8);
                    }
                    try {
                        this.f2141b.getApplicationContext().unbindService(bVar);
                    } catch (Throwable th9) {
                        oq.c(th9);
                    }
                    mu.d(onVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                    mu.d(this.f2141b, onVar, str, onVar.f44353a);
                    this.f2140a = null;
                    if (this.d && (activity3 = this.f2141b) != null) {
                        activity3.setRequestedOrientation(0);
                        this.d = false;
                    }
                    return new Pair<>(str3, Boolean.FALSE);
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (Throwable th11) {
                th = th11;
                dVar = null;
            }
            try {
                mu.e(onVar, "biz", "ClientBindFailed", th, "in_bind");
                return new Pair<>(EventType.FAILED, Boolean.TRUE);
            } finally {
                if (dVar != null) {
                    try {
                        iAlixPay.unregisterCallback(dVar);
                    } catch (Throwable th12) {
                        oq.c(th12);
                    }
                }
                try {
                    this.f2141b.getApplicationContext().unbindService(bVar);
                } catch (Throwable th13) {
                    oq.c(th13);
                }
                mu.d(onVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                mu.d(this.f2141b, onVar, str, onVar.f44353a);
                this.f2140a = null;
                if (this.d && (activity = this.f2141b) != null) {
                    activity.setRequestedOrientation(0);
                    this.d = 0 == true ? 1 : 0;
                }
            }
        }
        throw new Throwable("bindService fail");
    }

    public final String b(String str, String str2) {
        JSONObject jSONObject;
        String str3;
        Object obj = new Object();
        String strB = ox.b(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        mu.d(this.f, "biz", "BSAStart", strB + "|" + jElapsedRealtime);
        on.b.c(this.f, strB);
        a aVar = new a(obj);
        APayEntranceActivity.f2057c.put(strB, aVar);
        try {
            try {
                HashMap<String, String> mapD = on.d(this.f);
                mapD.put("ts_intent", String.valueOf(jElapsedRealtime));
                jSONObject = new JSONObject(mapD);
            } catch (Throwable th) {
                mu.c(this.f, "biz", "BSALocEx", th);
                jSONObject = null;
            }
            Intent intent = new Intent(this.f2141b, (Class<?>) APayEntranceActivity.class);
            intent.putExtra("ap_order_info", str);
            intent.putExtra("ap_target_packagename", str2);
            intent.putExtra("ap_session", strB);
            if (jSONObject != null) {
                intent.putExtra("ap_local_info", jSONObject.toString());
            }
            new Handler(Looper.getMainLooper()).postDelayed(new c(aVar), mx.c().k());
            Activity activity = this.f2141b;
            on onVar = this.f;
            mu.d(activity, onVar, str, onVar.f44353a);
            if (mx.c().a()) {
                new Handler(Looper.getMainLooper()).post(new e(intent, obj));
            } else {
                try {
                    Activity activity2 = this.f2141b;
                    if (activity2 != null) {
                        activity2.startActivity(intent);
                    } else {
                        mu.e(this.f, "biz", "ErrActNull", "");
                        Context contextC = this.f.c();
                        if (contextC != null) {
                            contextC.startActivity(intent);
                        }
                    }
                } catch (Throwable th2) {
                    mu.c(this.f, "biz", "ErrActEx", th2);
                    throw th2;
                }
            }
            synchronized (obj) {
                obj.wait();
            }
            String str4 = this.j;
            try {
                str3 = ov.d(this.f, str4).get("resultStatus");
                if (str3 == null) {
                    str3 = Constants.NULL;
                }
            } catch (Throwable th3) {
                mu.c(this.f, "biz", "BSAStatEx", th3);
                str3 = "unknown";
            }
            mu.b(this.f, "biz", "BSADone-" + str3);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            mu.b(this.f, "biz", "BSAEmpty");
            return "scheme_failed";
        } catch (InterruptedException e2) {
            mu.c(this.f, "biz", "BSAWaiting", e2);
            com.alipay.sdk.m.l.c cVar = com.alipay.sdk.m.l.c.PAY_WAITTING;
            return mp.d(cVar.b(), cVar.a(), "");
        } catch (Throwable th4) {
            mu.c(this.f, "biz", "BSAEx", th4);
            ox.b("alipaySdk", "startActivityEx", this.f2141b, this.f);
            return "scheme_failed";
        }
    }

    public void b() {
        this.f2141b = null;
        this.f2142c = null;
    }

    public static boolean e(String str, Context context, on onVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            mu.b(onVar, "biz", "BSADetectFail");
            return false;
        } catch (Throwable th) {
            mu.c(onVar, "biz", "BSADetectFail", th);
            return false;
        }
    }
}
