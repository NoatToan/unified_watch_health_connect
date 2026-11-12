package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import com.xiaomi.push.cz;
import com.xiaomi.push.da;
import com.xiaomi.push.db;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;
import com.xiaomi.push.du;
import com.xiaomi.push.ea;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import com.xiaomi.push.service.at;
import com.xiaomi.push.service.aw;
import com.xiaomi.push.service.bd;
import com.xiaomi.push.service.bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ag {
    private static ag k = null;
    private static boolean l = false;
    private static final ArrayList<a> m = new ArrayList<>();
    private boolean a;
    private Context b;
    private Messenger d;
    private Handler e;
    private long h;
    private List<Message> f = new ArrayList();
    private boolean g = false;
    private Intent i = null;
    private Integer j = null;
    private String c = null;

    public static class a<T extends ef<T, ?>> {
        public T a;
        public cz b;
        public boolean c;
    }

    private ag(Context context) {
        this.a = false;
        this.e = null;
        this.b = context.getApplicationContext();
        this.a = A();
        l = C();
        this.e = new k(this, Looper.getMainLooper());
        if (com.xiaomi.channel.commonutils.android.f.m3427a(context)) {
            com.xiaomi.push.service.i.a(new q(this));
        }
        Intent intentV = v();
        if (intentV != null) {
            r(intentV);
        }
    }

    private boolean A() {
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(PkgNameConstants.XMSF, 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Intent B() {
        Intent intent = new Intent();
        String packageName = this.b.getPackageName();
        intent.setPackage(PkgNameConstants.XMSF);
        intent.setClassName(PkgNameConstants.XMSF, n());
        intent.putExtra("mipush_app_package", packageName);
        G();
        return intent;
    }

    private boolean C() {
        if (m3472a()) {
            try {
                return this.b.getPackageManager().getPackageInfo(PkgNameConstants.XMSF, 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private Intent D() {
        Intent intent = new Intent();
        String packageName = this.b.getPackageName();
        H();
        intent.setComponent(new ComponentName(this.b, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    private boolean E() {
        String packageName = this.b.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.b.getApplicationInfo().flags & 1) != 0;
    }

    private void F() {
        this.h = SystemClock.elapsedRealtime();
    }

    private void G() {
        try {
            PackageManager packageManager = this.b.getPackageManager();
            ComponentName componentName = new ComponentName(this.b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void H() {
        try {
            PackageManager packageManager = this.b.getPackageManager();
            ComponentName componentName = new ComponentName(this.b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    public static synchronized ag a(Context context) {
        if (k == null) {
            k = new ag(context);
        }
        return k;
    }

    private synchronized int f() {
        return this.b.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    private Intent h() {
        return (!m3472a() || PkgNameConstants.XMSF.equals(this.b.getPackageName())) ? D() : B();
    }

    private Message i(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    private String n() {
        try {
            return this.b.getPackageManager().getPackageInfo(PkgNameConstants.XMSF, 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private void r(Intent intent) {
        try {
            if (com.xiaomi.channel.commonutils.android.f.m3426a() || Build.VERSION.SDK_INT < 26) {
                this.b.startService(intent);
            } else {
                z(intent);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    public void t(String str, am amVar, boolean z, HashMap<String, String> map) {
        dt dtVar;
        dt dtVar2;
        cz czVar;
        byte[] bArrA;
        String str2;
        if (com.xiaomi.mipush.sdk.a.m3457a(this.b).m3464b() && com.xiaomi.push.y.m3842a(this.b)) {
            dt dtVar3 = new dt();
            dtVar3.a(true);
            Intent intentH = h();
            if (!TextUtils.isEmpty(str)) {
                dtVar3.a(str);
                if (z) {
                    dtVar2 = new dt(str, true);
                } else {
                    dtVar = null;
                }
                switch (t.a[amVar.ordinal()]) {
                    case 1:
                        df dfVar = df.DisablePushMessage;
                        dtVar3.c(dfVar.f77a);
                        dtVar.c(dfVar.f77a);
                        if (map != null) {
                            dtVar3.a(map);
                            dtVar.a(map);
                        }
                        str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                        intentH.setAction(str2);
                        break;
                    case 2:
                        df dfVar2 = df.EnablePushMessage;
                        dtVar3.c(dfVar2.f77a);
                        dtVar.c(dfVar2.f77a);
                        if (map != null) {
                            dtVar3.a(map);
                            dtVar.a(map);
                        }
                        str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                        intentH.setAction(str2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dtVar3.c(df.ThirdPartyRegUpdate.f77a);
                        if (map != null) {
                            dtVar3.a(map);
                        }
                        break;
                }
                com.xiaomi.channel.commonutils.logger.b.e("type:" + amVar + ", " + str);
                dtVar3.b(com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
                dtVar3.d(this.b.getPackageName());
                czVar = cz.Notification;
                a(dtVar3, czVar, false, null);
                if (z) {
                    dtVar.b(com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
                    dtVar.d(this.b.getPackageName());
                    Context context = this.b;
                    bArrA = ee.a(aa.a(context, dtVar, czVar, false, context.getPackageName(), com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a()));
                    if (bArrA != null) {
                        intentH.putExtra("mipush_payload", bArrA);
                        intentH.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                        intentH.putExtra("mipush_app_id", com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
                        intentH.putExtra("mipush_app_token", com.xiaomi.mipush.sdk.a.m3457a(this.b).b());
                        w(intentH);
                    }
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 19;
                int iOrdinal = amVar.ordinal();
                messageObtain.obj = str;
                messageObtain.arg1 = iOrdinal;
                this.e.sendMessageDelayed(messageObtain, 5000L);
            }
            str = aw.a();
            dtVar3.a(str);
            dtVar2 = z ? new dt(str, true) : null;
            synchronized (x.class) {
                x.a(this.b).m3484a(str);
            }
            dtVar = dtVar2;
            switch (t.a[amVar.ordinal()]) {
                case 1:
                    df dfVar3 = df.DisablePushMessage;
                    dtVar3.c(dfVar3.f77a);
                    dtVar.c(dfVar3.f77a);
                    if (map != null) {
                        dtVar3.a(map);
                        dtVar.a(map);
                    }
                    str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                    intentH.setAction(str2);
                    break;
                case 2:
                    df dfVar4 = df.EnablePushMessage;
                    dtVar3.c(dfVar4.f77a);
                    dtVar.c(dfVar4.f77a);
                    if (map != null) {
                        dtVar3.a(map);
                        dtVar.a(map);
                    }
                    str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                    intentH.setAction(str2);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    dtVar3.c(df.ThirdPartyRegUpdate.f77a);
                    if (map != null) {
                        dtVar3.a(map);
                    }
                    break;
            }
            com.xiaomi.channel.commonutils.logger.b.e("type:" + amVar + ", " + str);
            dtVar3.b(com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
            dtVar3.d(this.b.getPackageName());
            czVar = cz.Notification;
            a(dtVar3, czVar, false, null);
            if (z) {
                dtVar.b(com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
                dtVar.d(this.b.getPackageName());
                Context context2 = this.b;
                bArrA = ee.a(aa.a(context2, dtVar, czVar, false, context2.getPackageName(), com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a()));
                if (bArrA != null) {
                    intentH.putExtra("mipush_payload", bArrA);
                    intentH.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    intentH.putExtra("mipush_app_id", com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
                    intentH.putExtra("mipush_app_token", com.xiaomi.mipush.sdk.a.m3457a(this.b).b());
                    w(intentH);
                }
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 19;
            int iOrdinal2 = amVar.ordinal();
            messageObtain2.obj = str;
            messageObtain2.arg1 = iOrdinal2;
            this.e.sendMessageDelayed(messageObtain2, 5000L);
        }
    }

    private Intent v() {
        if (!PkgNameConstants.XMSF.equals(this.b.getPackageName())) {
            return x();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel xmsf create own channel");
        return D();
    }

    private void w(Intent intent) {
        at atVarA = at.a(this.b);
        int iA = db.ServiceBootMode.a();
        da daVar = da.START;
        int iA2 = atVarA.a(iA, daVar.a());
        int iF = f();
        da daVar2 = da.BIND;
        boolean z = iA2 == daVar2.a() && l;
        int iA3 = z ? daVar2.a() : daVar.a();
        if (iA3 != iF) {
            m3473a(iA3);
        }
        if (z) {
            z(intent);
        } else {
            r(intent);
        }
    }

    private Intent x() {
        if (m3472a()) {
            com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start miui channel");
            return B();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start  own channel");
        return D();
    }

    private synchronized void y(int i) {
        this.b.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    private synchronized void z(Intent intent) {
        if (this.g) {
            Message messageI = i(intent);
            if (this.f.size() >= 50) {
                this.f.remove(0);
            }
            this.f.add(messageI);
            return;
        }
        if (this.d == null) {
            this.b.bindService(intent, new s(this), 1);
            this.g = true;
            this.f.clear();
            this.f.add(i(intent));
        } else {
            try {
                this.d.send(i(intent));
            } catch (RemoteException unused) {
                this.d = null;
                this.g = false;
            }
        }
    }

    public long a() {
        return this.h;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3471a() {
        r(h());
    }

    public void a(int i) {
        p(i, 0);
    }

    public final void a(du duVar, boolean z, boolean z2) {
        this.i = null;
        com.xiaomi.mipush.sdk.a.m3457a(this.b).d = duVar.a();
        Intent intentH = h();
        byte[] bArrA = ee.a(aa.a(this.b, duVar, cz.Registration));
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("register fail, because msgBytes is null.");
            return;
        }
        intentH.setAction("com.xiaomi.mipush.REGISTER_APP");
        intentH.putExtra("mipush_app_id", com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
        intentH.putExtra("mipush_payload", bArrA);
        intentH.putExtra("mipush_session", this.c);
        intentH.putExtra("mipush_env_chanage", z);
        intentH.putExtra("mipush_env_type", com.xiaomi.mipush.sdk.a.m3457a(this.b).a());
        intentH.putExtra("mipush_region_change", z2);
        if (!com.xiaomi.push.y.m3842a(this.b) || !m3474b()) {
            this.i = intentH;
        } else {
            F();
            w(intentH);
        }
    }

    public final void a(ea eaVar) {
        byte[] bArrA = ee.a(aa.a(this.b, eaVar, cz.UnRegistration));
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        intentH.putExtra("mipush_app_id", com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
        intentH.putExtra("mipush_payload", bArrA);
        w(intentH);
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, di diVar) {
        a(t, czVar, !czVar.equals(cz.Registration), diVar);
    }

    public <T extends ef<T, ?>> void a(T t, cz czVar, boolean z) {
        a aVar = new a();
        aVar.a = t;
        aVar.b = czVar;
        aVar.c = z;
        ArrayList<a> arrayList = m;
        synchronized (arrayList) {
            arrayList.add(aVar);
            if (arrayList.size() > 10) {
                arrayList.remove(0);
            }
        }
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, boolean z, di diVar) {
        a(t, czVar, z, true, diVar, true);
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, boolean z, di diVar, boolean z2) {
        a(t, czVar, z, true, diVar, z2);
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, boolean z, boolean z2, di diVar, boolean z3) {
        a(t, czVar, z, z2, diVar, z3, this.b.getPackageName(), com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, boolean z, boolean z2, di diVar, boolean z3, String str, String str2) {
        a(t, czVar, z, z2, diVar, z3, str, str2, true);
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, boolean z, boolean z2, di diVar, boolean z3, String str, String str2, boolean z4) {
        a(t, czVar, z, z2, diVar, z3, str, str2, z4, true);
    }

    public final <T extends ef<T, ?>> void a(T t, cz czVar, boolean z, boolean z2, di diVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (z5 && !com.xiaomi.mipush.sdk.a.m3457a(this.b).m3465c()) {
            if (z2) {
                a(t, czVar, z);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.b.m3434a("drop the message before initialization.");
                return;
            }
        }
        dq dqVarA = z4 ? aa.a(this.b, t, czVar, z, str, str2) : aa.b(this.b, t, czVar, z, str, str2);
        if (diVar != null) {
            dqVarA.a(diVar);
        }
        byte[] bArrA = ee.a(dqVarA);
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        intentH.putExtra("mipush_payload", bArrA);
        intentH.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        w(intentH);
    }

    public final void a(String str, am amVar, c cVar) {
        x.a(this.b).a(amVar, SlpHMDeviceSyncDataEventObserver.SYNCING);
        t(str, amVar, false, g.a(this.b, cVar));
    }

    public void a(String str, String str2) {
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentH.putExtra(bd.C, this.b.getPackageName());
        intentH.putExtra(bd.I, str);
        intentH.putExtra(bd.J, str2);
        w(intentH);
    }

    public final void a(boolean z) {
        a(z, (String) null);
    }

    public final void a(boolean z, String str) {
        am amVar;
        x xVarA;
        am amVar2;
        if (z) {
            x xVarA2 = x.a(this.b);
            amVar = am.DISABLE_PUSH;
            xVarA2.a(amVar, SlpHMDeviceSyncDataEventObserver.SYNCING);
            xVarA = x.a(this.b);
            amVar2 = am.ENABLE_PUSH;
        } else {
            x xVarA3 = x.a(this.b);
            amVar = am.ENABLE_PUSH;
            xVarA3.a(amVar, SlpHMDeviceSyncDataEventObserver.SYNCING);
            xVarA = x.a(this.b);
            amVar2 = am.DISABLE_PUSH;
        }
        xVarA.a(amVar2, "");
        t(str, amVar, true, null);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3472a() {
        return this.a && 1 == com.xiaomi.mipush.sdk.a.m3457a(this.b).a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3473a(int i) {
        if (!com.xiaomi.mipush.sdk.a.m3457a(this.b).m3464b()) {
            return false;
        }
        y(i);
        dt dtVar = new dt();
        dtVar.a(aw.a());
        dtVar.b(com.xiaomi.mipush.sdk.a.m3457a(this.b).m3458a());
        dtVar.d(this.b.getPackageName());
        dtVar.c(df.ClientABTest.f77a);
        HashMap map = new HashMap();
        dtVar.f129a = map;
        map.put("boot_mode", i + "");
        a(this.b).a(dtVar, cz.Notification, false, null);
        return true;
    }

    public final void b() {
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        w(intentH);
    }

    public void b(int i) {
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentH.putExtra(bd.C, this.b.getPackageName());
        intentH.putExtra(bd.F, i);
        intentH.putExtra(bd.H, com.xiaomi.push.ac.b(this.b.getPackageName() + i));
        w(intentH);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3474b() {
        if (!m3472a() || !E()) {
            return true;
        }
        if (this.j == null) {
            Integer numValueOf = Integer.valueOf(bf.a(this.b).a());
            this.j = numValueOf;
            if (numValueOf.intValue() == 0) {
                this.b.getContentResolver().registerContentObserver(bf.a(this.b).m3830a(), false, new r(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.j.intValue() != 0;
    }

    public void c() {
        if (this.i != null) {
            F();
            w(this.i);
            this.i = null;
        }
    }

    public void d() {
        ArrayList<a> arrayList = m;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            for (a aVar : arrayList) {
                a(aVar.a, aVar.b, aVar.c, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            m.clear();
        }
    }

    public void e() {
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentH.putExtra(bd.C, this.b.getPackageName());
        intentH.putExtra(bd.H, com.xiaomi.push.ac.b(this.b.getPackageName()));
        w(intentH);
    }

    public void p(int i, int i2) {
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentH.putExtra(bd.C, this.b.getPackageName());
        intentH.putExtra(bd.D, i);
        intentH.putExtra(bd.E, i2);
        w(intentH);
    }

    public void q(int i, String str) {
        Intent intentH = h();
        intentH.setAction("com.xiaomi.mipush.thirdparty");
        intentH.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        intentH.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        r(intentH);
    }
}
