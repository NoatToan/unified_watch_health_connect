package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ac;
import com.xiaomi.mipush.sdk.aq;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.push.Cif;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.ic;
import com.xiaomi.push.ig;
import com.xiaomi.push.il;
import com.xiaomi.push.io;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jh;
import com.xiaomi.push.jm;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class d6s {
    public static d6s l = null;
    public static boolean m = false;
    public static final ArrayList<a> n = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f15156b;
    public Messenger d;
    public Handler e;
    public long h;
    public List<Message> f = new ArrayList();
    public boolean g = false;
    public String i = null;
    public Intent j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f15157k = null;
    public String c = null;

    public static class a<T extends jm<T, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f15158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ib f15159b;
        public boolean c;
    }

    public d6s(Context context) {
        this.f15155a = false;
        this.e = null;
        this.f15156b = context.getApplicationContext();
        this.f15155a = U();
        m = Y();
        this.e = new h6s(this, Looper.getMainLooper());
        if (y0t.j(context)) {
            b3t.a(new n6s(this));
        }
        Intent intentM = M();
        if (intentM != null) {
            O(intentM);
        }
    }

    public static synchronized d6s c(Context context) {
        try {
            if (l == null) {
                l = new d6s(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return l;
    }

    public final <T extends jm<T, ?>> void A(T t, ib ibVar, boolean z, boolean z2, io ioVar, boolean z3) {
        B(t, ibVar, z, z2, ioVar, z3, this.f15156b.getPackageName(), bas.c(this.f15156b).d());
    }

    public final <T extends jm<T, ?>> void B(T t, ib ibVar, boolean z, boolean z2, io ioVar, boolean z3, String str, String str2) {
        C(t, ibVar, z, z2, ioVar, z3, str, str2, true);
    }

    public final <T extends jm<T, ?>> void C(T t, ib ibVar, boolean z, boolean z2, io ioVar, boolean z3, String str, String str2, boolean z4) {
        D(t, ibVar, z, z2, ioVar, z3, str, str2, z4, true);
    }

    public final <T extends jm<T, ?>> void D(T t, ib ibVar, boolean z, boolean z2, io ioVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (z5 && !bas.c(this.f15156b).s()) {
            if (z2) {
                x(t, ibVar, z);
                return;
            } else {
                x9s.o("drop the message before initialization.");
                return;
            }
        }
        ix ixVarB = z4 ? v4s.b(this.f15156b, t, ibVar, z, str, str2) : v4s.f(this.f15156b, t, ibVar, z, str, str2);
        if (ioVar != null) {
            ixVarB.a(ioVar);
        }
        byte[] bArrE = i.e(ixVarB);
        if (bArrE == null) {
            x9s.o("send message fail, because msgBytes is null.");
            return;
        }
        sls.f(this.f15156b.getPackageName(), this.f15156b, t, ibVar, bArrE.length);
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        intentE.putExtra("mipush_payload", bArrE);
        intentE.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        T(intentE);
    }

    public final void E(String str, aq aqVar, d dVar, String str2) {
        l4s.b(this.f15156b).d(aqVar, "syncing");
        HashMap<String, String> mapE = gxs.e(this.f15156b, dVar);
        mapE.put("third_sync_reason", str2);
        F(str, aqVar, false, mapE);
    }

    public final void F(String str, aq aqVar, boolean z, HashMap<String, String> map) {
        ja jaVar;
        String strA = str;
        if (bas.c(this.f15156b).p() && obs.v(this.f15156b)) {
            ja jaVar2 = new ja();
            jaVar2.a(true);
            Intent intentE = e();
            if (TextUtils.isEmpty(str)) {
                strA = gbs.a();
                jaVar2.a(strA);
                jaVar = z ? new ja(strA, true) : null;
                synchronized (l4s.class) {
                    l4s.b(this.f15156b).e(strA);
                }
            } else {
                jaVar2.a(strA);
                jaVar = z ? new ja(strA, true) : null;
            }
            switch (d7s.f15201a[aqVar.ordinal()]) {
                case 1:
                    il ilVar = il.DisablePushMessage;
                    jaVar2.c(ilVar.f125a);
                    jaVar.c(ilVar.f125a);
                    if (map != null) {
                        jaVar2.a(map);
                        jaVar.a(map);
                    }
                    intentE.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    il ilVar2 = il.EnablePushMessage;
                    jaVar2.c(ilVar2.f125a);
                    jaVar.c(ilVar2.f125a);
                    if (map != null) {
                        jaVar2.a(map);
                        jaVar.a(map);
                    }
                    intentE.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    jaVar2.c(il.ThirdPartyRegUpdate.f125a);
                    if (map != null) {
                        jaVar2.a(map);
                    }
                    break;
            }
            x9s.E("type:" + aqVar + ", " + strA);
            jaVar2.b(bas.c(this.f15156b).d());
            jaVar2.d(this.f15156b.getPackageName());
            ib ibVar = ib.Notification;
            y(jaVar2, ibVar, false, null);
            if (z) {
                jaVar.b(bas.c(this.f15156b).d());
                jaVar.d(this.f15156b.getPackageName());
                Context context = this.f15156b;
                byte[] bArrE = i.e(v4s.b(context, jaVar, ibVar, false, context.getPackageName(), bas.c(this.f15156b).d()));
                if (bArrE != null) {
                    sls.f(this.f15156b.getPackageName(), this.f15156b, jaVar, ibVar, bArrE.length);
                    intentE.putExtra("mipush_payload", bArrE);
                    intentE.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    intentE.putExtra("mipush_app_id", bas.c(this.f15156b).d());
                    intentE.putExtra("mipush_app_token", bas.c(this.f15156b).m());
                    T(intentE);
                }
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 19;
            int iOrdinal = aqVar.ordinal();
            messageObtain.obj = strA;
            messageObtain.arg1 = iOrdinal;
            if (map != null && map.get("third_sync_reason") != null) {
                Bundle bundle = new Bundle();
                bundle.putString("third_sync_reason", map.get("third_sync_reason"));
                messageObtain.setData(bundle);
            }
            this.e.sendMessageDelayed(messageObtain, 5000L);
        }
    }

    public void G(String str, String str2) {
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentE.putExtra(ccs.B, this.f15156b.getPackageName());
        intentE.putExtra(ccs.H, str);
        intentE.putExtra(ccs.I, str2);
        T(intentE);
    }

    public final void H(boolean z) {
        I(z, null);
    }

    public final void I(boolean z, String str) {
        if (z) {
            l4s l4sVarB = l4s.b(this.f15156b);
            aq aqVar = aq.DISABLE_PUSH;
            l4sVarB.d(aqVar, "syncing");
            l4s.b(this.f15156b).d(aq.ENABLE_PUSH, "");
            F(str, aqVar, true, null);
            return;
        }
        l4s l4sVarB2 = l4s.b(this.f15156b);
        aq aqVar2 = aq.ENABLE_PUSH;
        l4sVarB2.d(aqVar2, "syncing");
        l4s.b(this.f15156b).d(aq.DISABLE_PUSH, "");
        F(str, aqVar2, true, null);
    }

    public boolean J() {
        return this.f15155a && 1 == bas.c(this.f15156b).a();
    }

    public boolean K(int i) {
        if (!bas.c(this.f15156b).p()) {
            return false;
        }
        S(i);
        ja jaVar = new ja();
        jaVar.a(gbs.a());
        jaVar.b(bas.c(this.f15156b).d());
        jaVar.d(this.f15156b.getPackageName());
        jaVar.c(il.ClientABTest.f125a);
        HashMap map = new HashMap();
        jaVar.f264a = map;
        map.put("boot_mode", i + "");
        c(this.f15156b).y(jaVar, ib.Notification, false, null);
        return true;
    }

    public final Intent M() {
        if (!"com.xiaomi.xmsf".equals(this.f15156b.getPackageName())) {
            return Q();
        }
        x9s.B("pushChannel xmsf create own channel");
        return Z();
    }

    public final void N() {
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        T(intentE);
    }

    public final void O(Intent intent) {
        try {
            if (y0t.i()) {
                this.f15156b.startService(intent);
            } else {
                X(intent);
            }
        } catch (Exception e) {
            x9s.s(e);
        }
    }

    public boolean P() {
        if (!J() || !a0()) {
            return true;
        }
        if (this.f15157k == null) {
            Integer numValueOf = Integer.valueOf(jcs.c(this.f15156b).a());
            this.f15157k = numValueOf;
            if (numValueOf.intValue() == 0) {
                this.f15156b.getContentResolver().registerContentObserver(jcs.c(this.f15156b).b(), false, new s6s(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f15157k.intValue() != 0;
    }

    public final Intent Q() {
        if (J()) {
            x9s.B("pushChannel app start miui china channel");
            return V();
        }
        x9s.B("pushChannel app start  own channel");
        return Z();
    }

    public void R() {
        if (this.j != null) {
            c0();
            T(this.j);
            this.j = null;
        }
    }

    public final synchronized void S(int i) {
        this.f15156b.getSharedPreferences("mipush_extra", 0).edit().putInt("service_boot_mode", i).commit();
    }

    public final void T(Intent intent) {
        vas vasVarD = vas.d(this.f15156b);
        int iA = ig.ServiceBootMode.a();
        ic icVar = ic.START;
        int iA2 = vasVarD.a(iA, icVar.a());
        int iA3 = a();
        ic icVar2 = ic.BIND;
        boolean z = iA2 == icVar2.a() && m;
        int iA4 = z ? icVar2.a() : icVar.a();
        if (iA4 != iA3) {
            K(iA4);
        }
        if (z) {
            X(intent);
        } else {
            O(intent);
        }
    }

    public final boolean U() {
        try {
            PackageInfo packageInfo = this.f15156b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final Intent V() {
        Intent intent = new Intent();
        String packageName = this.f15156b.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", k());
        intent.putExtra("mipush_app_package", packageName);
        d0();
        return intent;
    }

    public void W() {
        ArrayList<a> arrayList = n;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            for (a aVar : arrayList) {
                A(aVar.f15158a, aVar.f15159b, aVar.c, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            n.clear();
        }
    }

    public final synchronized void X(Intent intent) {
        try {
            if (this.g) {
                Message messageF = f(intent);
                if (this.f.size() >= 50) {
                    this.f.remove(0);
                }
                this.f.add(messageF);
                return;
            }
            if (this.d == null) {
                this.f15156b.bindService(intent, new x6s(this), 1);
                this.g = true;
                this.f.clear();
                this.f.add(f(intent));
            } else {
                try {
                    this.d.send(f(intent));
                } catch (RemoteException unused) {
                    this.d = null;
                    this.g = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean Y() {
        if (J()) {
            try {
                return this.f15156b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public final Intent Z() {
        Intent intent = new Intent();
        String packageName = this.f15156b.getPackageName();
        e0();
        intent.setComponent(new ComponentName(this.f15156b, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    public final synchronized int a() {
        return this.f15156b.getSharedPreferences("mipush_extra", 0).getInt("service_boot_mode", -1);
    }

    public final boolean a0() {
        String packageName = this.f15156b.getPackageName();
        return packageName.contains(OneTrack.Param.MIUI) || packageName.contains("xiaomi") || (this.f15156b.getApplicationInfo().flags & 1) != 0;
    }

    public long b() {
        return this.h;
    }

    public void b0() {
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentE.putExtra(ccs.B, this.f15156b.getPackageName());
        intentE.putExtra(ccs.G, mcs.d(this.f15156b.getPackageName()));
        T(intentE);
    }

    public final void c0() {
        this.h = SystemClock.elapsedRealtime();
    }

    public final void d0() {
        try {
            PackageManager packageManager = this.f15156b.getPackageManager();
            ComponentName componentName = new ComponentName(this.f15156b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    public final Intent e() {
        return (!J() || "com.xiaomi.xmsf".equals(this.f15156b.getPackageName())) ? Z() : V();
    }

    public final void e0() {
        try {
            PackageManager packageManager = this.f15156b.getPackageManager();
            ComponentName componentName = new ComponentName(this.f15156b, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    public final Message f(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    public final String k() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            if (this.f15156b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.i = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.i = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    public void m() {
        O(e());
    }

    public void n(int i) {
        o(i, 0);
    }

    public void o(int i, int i2) {
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentE.putExtra(ccs.B, this.f15156b.getPackageName());
        intentE.putExtra(ccs.C, i);
        intentE.putExtra(ccs.D, i2);
        T(intentE);
    }

    public void p(int i, String str) {
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.thirdparty");
        intentE.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        intentE.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        O(intentE);
    }

    public void r(Context context) {
        if (y0t.i()) {
            return;
        }
        ac acVarA = b7t.a(context);
        if (ac.HUAWEI.equals(acVarA)) {
            E(null, aq.UPLOAD_HUAWEI_TOKEN, d.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (ac.OPPO.equals(acVarA)) {
            E(null, aq.UPLOAD_COS_TOKEN, d.ASSEMBLE_PUSH_COS, "update");
        }
        if (ac.VIVO.equals(acVarA)) {
            E(null, aq.UPLOAD_FTOS_TOKEN, d.ASSEMBLE_PUSH_FTOS, "update");
        }
    }

    public void s(Intent intent) {
        intent.fillIn(e(), 24);
        T(intent);
    }

    public final void t(Cif cif) {
        Intent intentE = e();
        byte[] bArrE = i.e(cif);
        if (bArrE == null) {
            x9s.o("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        intentE.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        intentE.putExtra("mipush_payload", bArrE);
        O(intentE);
    }

    public final void u(jb jbVar, boolean z) {
        oss.a(this.f15156b.getApplicationContext()).g(this.f15156b.getPackageName(), "E100003", jbVar.a(), UserConfig.MOST_USED_DEVICE_SORT_KEY_V2, null);
        this.j = null;
        bas.c(this.f15156b).d = jbVar.a();
        Intent intentE = e();
        byte[] bArrE = i.e(v4s.a(this.f15156b, jbVar, ib.Registration));
        if (bArrE == null) {
            x9s.o("register fail, because msgBytes is null.");
            return;
        }
        intentE.setAction("com.xiaomi.mipush.REGISTER_APP");
        intentE.putExtra("mipush_app_id", bas.c(this.f15156b).d());
        intentE.putExtra("mipush_payload", bArrE);
        intentE.putExtra("mipush_session", this.c);
        intentE.putExtra("mipush_env_chanage", z);
        intentE.putExtra("mipush_env_type", bas.c(this.f15156b).a());
        if (!obs.v(this.f15156b) || !P()) {
            this.j = intentE;
        } else {
            c0();
            T(intentE);
        }
    }

    public final void v(jh jhVar) {
        byte[] bArrE = i.e(v4s.a(this.f15156b, jhVar, ib.UnRegistration));
        if (bArrE == null) {
            x9s.o("unregister fail, because msgBytes is null.");
            return;
        }
        Intent intentE = e();
        intentE.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        intentE.putExtra("mipush_app_id", bas.c(this.f15156b).d());
        intentE.putExtra("mipush_payload", bArrE);
        T(intentE);
    }

    public final <T extends jm<T, ?>> void w(T t, ib ibVar, io ioVar) {
        y(t, ibVar, !ibVar.equals(ib.Registration), ioVar);
    }

    public <T extends jm<T, ?>> void x(T t, ib ibVar, boolean z) {
        a aVar = new a();
        aVar.f15158a = t;
        aVar.f15159b = ibVar;
        aVar.c = z;
        ArrayList<a> arrayList = n;
        synchronized (arrayList) {
            try {
                arrayList.add(aVar);
                if (arrayList.size() > 10) {
                    arrayList.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends jm<T, ?>> void y(T t, ib ibVar, boolean z, io ioVar) {
        A(t, ibVar, z, true, ioVar, true);
    }

    public final <T extends jm<T, ?>> void z(T t, ib ibVar, boolean z, io ioVar, boolean z2) {
        A(t, ibVar, z, true, ioVar, z2);
    }
}
