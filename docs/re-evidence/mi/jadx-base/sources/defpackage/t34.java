package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import com.xiaomi.aicr.constant.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t34 extends nqc.a implements ServiceConnection {
    public static final Object h = new Object();
    public static HashSet<String> i = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bpc f34255b;
    public u34 c;
    public String e;
    public int[] f;
    public volatile boolean d = false;
    public ConcurrentLinkedQueue<String> g = new ConcurrentLinkedQueue<>();

    public t34(Context context, u34 u34Var, int[] iArr) {
        this.e = "V0";
        this.f34254a = context;
        this.c = u34Var;
        this.f = iArr;
        this.e = q5(iArr);
        s2();
    }

    public static HashMap<String, String> p5(Context context, int i2) {
        HashMap<String, String> map = new HashMap<>();
        String string = Settings.Global.getString(context.getContentResolver(), "Aicr_COG_Plugin_Version");
        if (string != null && !string.equals("")) {
            for (String str : string.split("\\|")) {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    public static boolean r5(Context context, String str, String str2) {
        try {
            int i2 = context.getPackageManager().getPackageInfo("com.xiaomi.aicr", 0).versionCode;
            s2n.a("CognitionManagerBase", "isSupport code :" + i2);
            String str3 = p5(context, i2).get(str);
            return str3 != null && str3.compareTo(str2) >= 0;
        } catch (Exception unused) {
            s2n.d("CognitionManagerBase", "isSupport: false!!!");
            return false;
        }
    }

    @Override // defpackage.nqc
    public void X(String str, long j) throws RemoteException {
        h4(str, j);
    }

    public abstract void h4(String str, long j);

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f34255b = bpc.a.s2(iBinder);
        i.add(toString());
        s2n.a("CognitionManagerBase", "onServiceConnected,1 current: " + toString());
        s5(this.f34255b);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        s2n.a("CognitionManagerBase", "onServiceDisconnected, current: " + toString());
        this.f34255b = null;
        this.d = false;
        t5();
    }

    public final String q5(int[] iArr) {
        String str = "V0";
        for (int i2 : iArr) {
            String[] strArr = Constants.f11095a.get(Integer.valueOf(i2));
            if (strArr != null && strArr.length == 3) {
                String str2 = strArr[2];
                if (str.compareTo(str2) < 0) {
                    str = str2;
                }
                if (!this.g.contains(strArr[0])) {
                    this.g.add(strArr[0]);
                }
            }
        }
        return str;
    }

    public void s2() {
        if (Build.VERSION.SDK_INT >= 31) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.aicr", "com.xiaomi.aicr.access.AiCrCognitionService"));
            intent.putExtra("bind_type", toString());
            try {
                this.f34254a.startForegroundService(intent);
            } catch (Exception e) {
                s2n.c("CognitionManagerBase", "start service failed", e);
            }
            try {
                this.f34254a.bindService(intent, this, 1);
            } catch (Exception e2) {
                s2n.c("CognitionManagerBase", "bind service failed", e2);
            }
        }
    }

    public abstract void s5(bpc bpcVar);

    @Override // defpackage.nqc
    public void t1(IBinder iBinder) throws RemoteException {
        s2n.a("CognitionManagerBase", "onDownload" + iBinder.toString());
        bpc bpcVar = this.f34255b;
        if (bpcVar != null) {
            s5(bpcVar);
        }
    }

    public abstract void t5();

    public String toString() {
        return h.toString() + "/" + super.toString();
    }
}
