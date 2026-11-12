package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserManager;
import android.util.Log;
import com.huawei.android.powerkit.PowerKitConnection;
import com.huawei.android.powerkit.Sink;
import com.huawei.android.powerkit.adapter.IPowerKitApi;
import com.huawei.android.powerkit.adapter.IStateSink;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class bdf implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1033a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PowerKitConnection f1035c;
    private bdf j;
    private final HashSet<Sink> f = new HashSet<>();
    private final ArrayList<Integer> e = new ArrayList<>();
    private final HashMap<Sink, ArrayList<Integer>> h = new HashMap<>();
    private final e i = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f1034b = new Object();
    private IPowerKitApi g = null;
    private ServiceConnection d = new ServiceConnection() { // from class: bdf.4
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.v("PowerKitApi", "Power kit service disconnected");
            bdf.this.f1035c.onServiceDisconnected();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (bdf.this.f1034b) {
                bdf.this.g = IPowerKitApi.Stub.asInterface(iBinder);
                try {
                    bdf.this.g.asBinder().linkToDeath(bdf.this.j, 0);
                } catch (Exception unused) {
                    Log.w("PowerKitApi", "power kit linkToDeath failed ! calling pid: " + Binder.getCallingPid());
                }
            }
            Log.v("PowerKitApi", "Power kit service connected");
            bdf.this.f1035c.onServiceConnected();
        }
    };

    public bdf(Context context, PowerKitConnection powerKitConnection) {
        this.f1033a = null;
        this.j = null;
        this.f1035c = null;
        this.j = this;
        this.f1035c = powerKitConnection;
        this.f1033a = context;
        a();
    }

    private boolean a() {
        boolean zBindService = false;
        if (!((UserManager) this.f1033a.getSystemService("user")).isSystemUser()) {
            Log.v("PowerKitApi", "not owner, power kit service not support");
            return false;
        }
        try {
            zBindService = this.f1033a.getApplicationContext().bindService(a(this.f1033a, new Intent("com.huawei.android.powerkit.PowerKitService")), this.d, 1);
            Log.v("PowerKitApi", "bind power kit service, state: " + zBindService);
            return zBindService;
        } catch (Exception unused) {
            Log.w("PowerKitApi", "bind power kit service exception!");
            return zBindService;
        }
    }

    private Intent a(Context context, Intent intent) {
        context.getPackageManager().queryIntentServices(intent, 0);
        ComponentName componentName = new ComponentName("com.huawei.powergenie", "com.huawei.android.powerkit.PowerKitService");
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    public String a(Context context) throws RemoteException {
        String powerKitVersion;
        synchronized (this.f1034b) {
            IPowerKitApi iPowerKitApi = this.g;
            if (iPowerKitApi == null) {
                throw new RemoteException("PowerKit server is not found");
            }
            powerKitVersion = iPowerKitApi.getPowerKitVersion(context.getPackageName());
        }
        return powerKitVersion;
    }

    public boolean d(Context context, boolean z, String str, int i, long j, String str2) throws RemoteException {
        boolean zApplyForResourceUse;
        synchronized (this.f1034b) {
            IPowerKitApi iPowerKitApi = this.g;
            if (iPowerKitApi == null) {
                throw new RemoteException("PowerKit server is not found");
            }
            zApplyForResourceUse = iPowerKitApi.applyForResourceUse(context.getPackageName(), z, str, i, j, str2);
        }
        return zApplyForResourceUse;
    }

    public boolean c(Sink sink, int i) throws RemoteException {
        synchronized (this.f1034b) {
            IPowerKitApi iPowerKitApi = this.g;
            if (iPowerKitApi == null) {
                throw new RemoteException("PowerKit server is not found");
            }
            String powerKitVersion = iPowerKitApi.getPowerKitVersion(this.f1033a.getPackageName());
            if (i == 51 && a(powerKitVersion, "10.0.0.305")) {
                Log.i("PowerKitApi", "System PowerKit version is low, don't support application using baseline remaining");
                return false;
            }
            if (!c(sink)) {
                return false;
            }
            Log.i("PowerKitApi", "registerSink return true");
            ArrayList<Integer> arrayList = this.h.get(sink);
            if (arrayList == null) {
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                arrayList2.add(Integer.valueOf(i));
                this.h.put(sink, arrayList2);
            } else {
                arrayList.add(Integer.valueOf(i));
            }
            this.e.add(Integer.valueOf(i));
            return this.g.enableStateEvent(i);
        }
    }

    private boolean c(Sink sink) {
        if (sink == null) {
            Log.e("PowerKitApi", "registerSink a null sink fail.");
            return false;
        }
        if (!this.f.contains(sink)) {
            this.f.add(sink);
            if (this.f.size() == 1) {
                e();
            }
        }
        return true;
    }

    private void e() {
        try {
            this.g.registerSink(this.i);
        } catch (RemoteException unused) {
            Log.e("PowerKitApi", "register sink transport fail.");
        }
    }

    public boolean e(Sink sink, int i) throws RemoteException {
        boolean zDisableStateEvent;
        synchronized (this.f1034b) {
            if (this.g == null) {
                throw new RemoteException("PowerKit server is not found");
            }
            ArrayList<Integer> arrayList = this.h.get(sink);
            if (arrayList != null) {
                arrayList.remove(Integer.valueOf(i));
                if (arrayList.size() == 0) {
                    this.h.remove(sink);
                    b(sink);
                }
            }
            this.e.remove(Integer.valueOf(i));
            Log.i("PowerKitApi", "Disable state event, stateType: " + i);
            zDisableStateEvent = this.g.disableStateEvent(i);
        }
        return zDisableStateEvent;
    }

    private void b(Sink sink) {
        this.f.remove(sink);
        if (this.f.size() == 0) {
            d();
        }
    }

    private void d() {
        try {
            this.g.unregisterSink(this.i);
        } catch (RemoteException unused) {
            Log.e("PowerKitApi", "unregister sink transport fail.");
        }
    }

    private boolean a(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit2.length != strArrSplit.length) {
            return true;
        }
        for (int i = 0; i < strArrSplit2.length; i++) {
            if (Integer.parseInt(strArrSplit[i]) > Integer.parseInt(strArrSplit2[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean b(Context context) throws RemoteException {
        boolean zIsUserSleeping;
        synchronized (this.f1034b) {
            if (this.g == null) {
                throw new RemoteException("PowerKit server is not found");
            }
            Log.i("PowerKitApi", "isUserSleeping ! pkg: " + context.getPackageName());
            zIsUserSleeping = this.g.isUserSleeping(context.getPackageName());
        }
        return zIsUserSleeping;
    }

    public boolean c(Context context, List<String> list, boolean z) throws RemoteException {
        boolean zApplyForAlarmExemption;
        synchronized (this.f1034b) {
            if (this.g == null) {
                throw new RemoteException("PowerKit server is not found");
            }
            Log.i("PowerKitApi", "Caller: " + context.getPackageName() + " actions:" + list + " apply:" + z);
            zApplyForAlarmExemption = this.g.applyForAlarmExemption(context.getPackageName(), list, z);
        }
        return zApplyForAlarmExemption;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        Log.e("PowerKitApi", "powerkit process binder was died and connecting ...");
        synchronized (this.f1034b) {
            this.g = null;
        }
        int i = 5;
        while (i > 0) {
            i--;
            SystemClock.sleep(new Random().nextInt(2001) + 1000);
            if (a()) {
                return;
            }
        }
    }

    final class e extends IStateSink.Stub {
        private e() {
        }

        @Override // com.huawei.android.powerkit.adapter.IStateSink
        public void onStateChanged(int i, int i2, int i3, String str, int i4) {
            Log.i("PowerKitApi", "stateType:" + i + " eventType:" + i2 + " pid:" + i3 + " pkg:" + str + " uid:" + i4);
            synchronized (bdf.this.f1034b) {
                if (bdf.this.f.isEmpty()) {
                    return;
                }
                for (Sink sink : bdf.this.f) {
                    ArrayList arrayList = (ArrayList) bdf.this.h.get(sink);
                    if (arrayList != null && arrayList.contains(Integer.valueOf(i))) {
                        sink.onStateChanged(i, i2, i3, str, i4);
                    }
                }
            }
        }

        @Override // com.huawei.android.powerkit.adapter.IStateSink
        public void onPowerOverUsing(String str, int i, long j, long j2, String str2) {
            Log.i("PowerKitApi", "onPowerOverUsing moudle:" + str + " resource:" + i + " duration:" + j + " time:" + j2 + " extend:" + str2);
            synchronized (bdf.this.f1034b) {
                if (bdf.this.f.isEmpty()) {
                    return;
                }
                for (Sink sink : bdf.this.f) {
                    ArrayList arrayList = (ArrayList) bdf.this.h.get(sink);
                    if (arrayList != null && arrayList.contains(50)) {
                        sink.onPowerOverUsing(str, i, j, j2, str2);
                    }
                }
            }
        }

        @Override // com.huawei.android.powerkit.adapter.IStateSink
        public void onPowerBaseLineUsing(String str, String str2, long j, int i, String str3) {
            Log.i("PowerKitApi", "onPowerBaseLineUsing callingPkg:" + str + " appAndGroup:" + str2 + " usage duration:" + j + " usage Count:" + i + " extend:" + str3);
            synchronized (bdf.this.f1034b) {
                if (bdf.this.f.isEmpty()) {
                    return;
                }
                for (Sink sink : bdf.this.f) {
                    ArrayList arrayList = (ArrayList) bdf.this.h.get(sink);
                    if (arrayList != null && arrayList.contains(51)) {
                        sink.onPowerBaseLineUsing(str, str2, j, i, str3);
                    }
                }
            }
        }
    }
}
