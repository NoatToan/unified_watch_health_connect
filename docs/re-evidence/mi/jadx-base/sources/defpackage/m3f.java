package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.provider.Settings;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m3f extends nqc.a implements ServiceConnection {
    public static final Object e = new Object();
    public static HashSet<String> f = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bpc f25711b;
    public hz0 c;
    public volatile boolean d;

    public m3f(Context context) {
        this.d = false;
        s2n.a("ManagerBase", "ManagerBase, create manager: " + this);
        this.f25710a = context;
        s2();
    }

    public static HashMap<String, String> p5(Context context) {
        HashMap<String, String> map = new HashMap<>();
        String string = Settings.Global.getString(context.getContentResolver(), "Aicr_Plugin_Version");
        if (string == null || string.equals("")) {
            map.put("com.xiaomi.aicr.plugin.INerService", "V0");
            map.put("com.xiaomi.aicr.plugin.IImageSegmentService", "V0");
            map.put("com.xiaomi.aicr.plugin.IVisionService", "V0");
            map.put("com.xiaomi.aicr.plugin.IHMindAlgoService", "V0");
        } else {
            for (String str : string.split("\\|")) {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    public static boolean q5(Context context, String str, String str2) {
        try {
            context.getPackageManager().getPackageInfo("com.xiaomi.aicr", 0);
            String str3 = p5(context).get(str);
            return str3 != null && str3.compareTo(str2) >= 0;
        } catch (PackageManager.NameNotFoundException unused) {
            s2n.d("ManagerBase", "isSupport: false!!!");
            return false;
        }
    }

    @Override // defpackage.nqc
    public void X(String str, long j) throws RemoteException {
        h4(str, j);
    }

    public abstract void h4(String str, long j);

    public boolean isConnected() {
        return this.d;
    }

    public boolean isSupport(String str) {
        try {
            this.f25710a.getPackageManager().getPackageInfo("com.xiaomi.aicr", 0);
            bpc bpcVar = this.f25711b;
            return bpcVar != null && bpcVar.isSupport(str);
        } catch (PackageManager.NameNotFoundException | RemoteException unused) {
            s2n.d("ManagerBase", "isSupport: false!!!");
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25711b = bpc.a.s2(iBinder);
        f.add(toString());
        s2n.a("ManagerBase", "onServiceConnected, current: " + toString());
        s5(this.f25711b);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        s2n.a("ManagerBase", "onServiceDisconnected, current: " + toString());
        this.f25711b = null;
        this.d = false;
        u5();
    }

    public void r5(String str) {
        s2n.a("ManagerBase", "use " + str + " first time, downloading...");
    }

    public void s2() {
        if (Build.VERSION.SDK_INT >= 31) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.aicr", "com.xiaomi.aicr.access.AiCrCoreService"));
            intent.putExtra("bind_type", toString());
            try {
                this.f25710a.startForegroundService(intent);
            } catch (ForegroundServiceStartNotAllowedException | SecurityException e2) {
                s2n.c("ManagerBase", "start service failed", e2);
            }
            try {
                this.f25710a.bindService(intent, this, 1);
            } catch (SecurityException e3) {
                s2n.c("ManagerBase", "bind service failed", e3);
            }
        }
    }

    public abstract void s5(bpc bpcVar);

    @Override // defpackage.nqc
    public void t1(IBinder iBinder) throws RemoteException {
        s2n.a("ManagerBase", "onDownload" + iBinder.toString());
        bpc bpcVar = this.f25711b;
        if (bpcVar != null) {
            s5(bpcVar);
        }
    }

    public void t5() {
        if (f.contains(toString())) {
            s2n.a("ManagerBase", "release connected service:" + toString());
            f.remove(toString());
            try {
                this.f25711b.h3(toString());
            } catch (Exception unused) {
                s2n.a("ManagerBase", "fail to release connect :" + toString());
            }
        }
        if (f.isEmpty()) {
            s2n.a("ManagerBase", "no service connection, unbind" + toString());
            try {
                this.f25710a.unbindService(this);
            } catch (Exception e2) {
                s2n.c("ManagerBase", "unbind error", e2);
            }
        }
    }

    public String toString() {
        return e.toString() + "/" + super.toString();
    }

    public abstract void u5();

    public boolean v5(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        s2n.a("ManagerBase", "current " + jCurrentTimeMillis);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            s2n.a("ManagerBase", "waitForConnection can't be called in main thread!");
            return false;
        }
        while (System.currentTimeMillis() <= jCurrentTimeMillis + j) {
            if (this.d) {
                return true;
            }
            try {
                Thread.sleep(40L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return this.d;
    }

    public m3f(Context context, hz0 hz0Var) {
        this(context);
        this.c = hz0Var;
    }
}
