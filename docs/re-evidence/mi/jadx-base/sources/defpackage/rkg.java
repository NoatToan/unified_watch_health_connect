package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rkg {
    public static rkg e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f32637a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<b>> f32638b = new CopyOnWriteArrayList<>();
    public final Object c = new Object();

    @GuardedBy("networkTypeLock")
    public int d = 0;

    public interface b {
        void a(int i);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i;
            int iG = rkg.g(context);
            if (iG == 5 && (i = wlq.f38110a) >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) rk1.e((TelephonyManager) context.getSystemService("phone"));
                    d dVar = new d();
                    if (i < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, EventRecurrence.TH);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            rkg.this.k(iG);
        }
    }

    public class d extends PhoneStateListener {
        public d() {
        }

        @Override // android.telephony.PhoneStateListener
        @RequiresApi(31)
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            rkg.this.k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            rkg.this.k(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public rkg(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    public static synchronized rkg d(Context context) {
        try {
            if (e == null) {
                e = new rkg(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return wlq.f38110a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public int f() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final /* synthetic */ void h(b bVar) {
        bVar.a(f());
    }

    public void i(final b bVar) {
        j();
        this.f32638b.add(new WeakReference<>(bVar));
        this.f32637a.post(new Runnable() { // from class: qkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f31604a.h(bVar);
            }
        });
    }

    public final void j() {
        for (WeakReference<b> weakReference : this.f32638b) {
            if (weakReference.get() == null) {
                this.f32638b.remove(weakReference);
            }
        }
    }

    public final void k(int i) {
        synchronized (this.c) {
            try {
                if (this.d == i) {
                    return;
                }
                this.d = i;
                for (WeakReference<b> weakReference : this.f32638b) {
                    b bVar = weakReference.get();
                    if (bVar != null) {
                        bVar.a(i);
                    } else {
                        this.f32638b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
