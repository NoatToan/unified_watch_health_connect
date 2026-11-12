package fa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o f70040e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f70041a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<b>> f70042b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f70043c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70044d = 0;

    public interface b {
        void onNetworkTypeChanged(int i14);
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0034  */
        /* JADX WARN: Code duplicated, block: B:22:0x003b  */
        /* JADX WARN: Code duplicated, block: B:23:0x003d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0043  */
        /* JADX WARN: Code duplicated, block: B:26:0x0045  */
        /* JADX WARN: Code duplicated, block: B:27:0x0047  */
        /* JADX WARN: Code duplicated, block: B:28:0x0049  */
        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            int i14 = 0;
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        i14 = 1;
                    } else {
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i14 = 3;
                                    break;
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
                                    i14 = 4;
                                    break;
                                case 13:
                                    i14 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i14 = 6;
                                    break;
                                case 18:
                                    i14 = 2;
                                    break;
                                case 20:
                                    if (z.f70071a >= 29) {
                                        i14 = 9;
                                    }
                                    break;
                            }
                        } else if (type == 1) {
                            i14 = 2;
                        } else if (type == 4 || type == 5) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i14 = 3;
                                    break;
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
                                    i14 = 4;
                                    break;
                                case 13:
                                    i14 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i14 = 6;
                                    break;
                                case 18:
                                    i14 = 2;
                                    break;
                                case 20:
                                    if (z.f70071a >= 29) {
                                        i14 = 9;
                                    }
                                    break;
                            }
                        } else if (type != 6) {
                            i14 = type != 9 ? 8 : 7;
                        } else {
                            i14 = 5;
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
            int i15 = z.f70071a;
            o oVar = o.this;
            if (i15 < 31 || i14 != 5) {
                o.a(oVar, i14);
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                p pVar = new p(oVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), pVar);
                telephonyManager.unregisterTelephonyCallback(pVar);
            } catch (RuntimeException unused2) {
                o.a(oVar, 5);
            }
        }
    }

    private o(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    public static void a(o oVar, int i14) {
        synchronized (oVar.f70043c) {
            try {
                if (oVar.f70044d == i14) {
                    return;
                }
                oVar.f70044d = i14;
                for (WeakReference<b> weakReference : oVar.f70042b) {
                    b bVar = weakReference.get();
                    if (bVar != null) {
                        bVar.onNetworkTypeChanged(i14);
                    } else {
                        oVar.f70042b.remove(weakReference);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static synchronized o b(Context context) {
        try {
            if (f70040e == null) {
                f70040e = new o(context);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f70040e;
    }

    public final int c() {
        int i14;
        synchronized (this.f70043c) {
            i14 = this.f70044d;
        }
        return i14;
    }
}
