package com.huawei.openalliance.ad.download.ag;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.br;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.k;
import com.huawei.openalliance.ad.download.l;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18466a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f18467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f18468c;
    private c d;
    private k e;
    private Context f;
    private Map<String, WeakHashMap<l, Object>> g = new ConcurrentHashMap();

    public void b(String str, l lVar) {
        synchronized (this) {
            WeakHashMap<l, Object> weakHashMap = this.g.get(str);
            if (weakHashMap != null && weakHashMap.size() > 0) {
                weakHashMap.remove(lVar);
                if (weakHashMap.size() <= 0) {
                    this.g.remove(str);
                }
            }
        }
    }

    public void a(String str, l lVar) {
        synchronized (this) {
            WeakHashMap<l, Object> weakHashMap = this.g.get(str);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.g.put(str, weakHashMap);
            }
            weakHashMap.put(lVar, null);
        }
    }

    public void a(k kVar) {
        this.e = kVar;
    }

    public void a(AppDownloadTask appDownloadTask) {
        f.d(this.f, appDownloadTask, new b(), String.class);
    }

    private void b(String str, int i) {
        hw.b("AgReserveDownloadManager", "start report reserve result");
        br brVar = new br(this.f);
        BaseAnalysisInfo baseAnalysisInfo = new BaseAnalysisInfo();
        baseAnalysisInfo.ak("2100020");
        baseAnalysisInfo.al(str);
        baseAnalysisInfo.am(String.valueOf(i));
        hw.a("AgReserveDownloadManager", "report reserve result analysis: %s", bk.b(baseAnalysisInfo));
        com.huawei.openalliance.ad.analysis.b bVarA = brVar.a(baseAnalysisInfo);
        Context context = this.f;
        new pc(context, sw.a(context, bVarA.t().intValue())).b(bVarA, false, false);
    }

    private void a(String str, int i) {
        WeakHashMap<l, Object> weakHashMapA = a(str);
        if (weakHashMapA != null && weakHashMapA.size() > 0) {
            for (l lVar : weakHashMapA.keySet()) {
                if (lVar != null) {
                    lVar.a(str, i);
                }
            }
        }
        k kVar = this.e;
        if (kVar != null) {
            kVar.a(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("reserveapp");
        int intExtra = intent.getIntExtra("reserveappstatus", -1);
        hw.b("AgReserveDownloadManager", "reserve status: %s", Integer.valueOf(intExtra));
        if (intExtra == 1 || intExtra == 0) {
            b(stringExtra, intExtra);
        }
        if (intExtra == 2) {
            intExtra = 1;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            hw.b("AgReserveDownloadManager", "pkg is null");
        } else {
            a(stringExtra, intExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Intent intent) {
        try {
            SafeIntent safeIntent = new SafeIntent(intent);
            String action = safeIntent.getAction();
            if ("com.huawei.hms.pps.action.APP_RESERVE_STATUS_CHANGED".equals(action) && context != null) {
                String stringExtra = safeIntent.getStringExtra("callerpackage");
                String packageName = context.getPackageName();
                if (!dg.e(stringExtra, packageName)) {
                    hw.b("AgReserveDownloadManager", "caller does not match, caller %s, currentPackage %s.", stringExtra, packageName);
                    return;
                } else if (safeIntent.getIntExtra("reserveappstatus", -1) == 0) {
                    hw.b("AgReserveDownloadManager", "silent reserve failed no need to notify");
                    return;
                } else {
                    a(safeIntent);
                    return;
                }
            }
            hw.c("AgReserveDownloadManager", "reserve onReceive inValid para %s.", action);
        } catch (IllegalStateException e) {
            hw.c("AgReserveDownloadManager", "silent reserve onReceive IllegalStateException: %s", e.getClass().getSimpleName());
        } catch (Exception e2) {
            hw.c("AgReserveDownloadManager", "silent reserve onReceive Exception: %s", e2.getClass().getSimpleName());
        }
    }

    private void a() {
        this.f18468c = new a();
        as.a(this.f, this.f18468c, new IntentFilter("com.huawei.appgallery.reserveappstatus"), "com.huawei.appmarket.RECV_THIRD_COMMON_MSG", (Handler) null);
        this.d = new c();
        as.a(this.f, this.d, new IntentFilter("com.huawei.hms.pps.action.APP_RESERVE_STATUS_CHANGED"), Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
    }

    class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hw.b("AgReserveDownloadManager", "reserve broadcast.");
            try {
                SafeIntent safeIntent = new SafeIntent(intent);
                String action = safeIntent.getAction();
                if ("com.huawei.appgallery.reserveappstatus".equals(action)) {
                    e.this.a(safeIntent);
                } else {
                    hw.c("AgReserveDownloadManager", "inValid para %s.", action);
                }
            } catch (IllegalStateException e) {
                hw.c("AgReserveDownloadManager", "reserve onReceive IllegalStateException: %s", e.getClass().getSimpleName());
            } catch (Exception e2) {
                hw.c("AgReserveDownloadManager", "reserve onReceive Exception: %s", e2.getClass().getSimpleName());
            }
        }

        private a() {
        }
    }

    static class b implements RemoteCallResultCallback<String> {
        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public void onRemoteCallResult(String str, CallResult<String> callResult) {
            hw.b("AgReserveDownloadManager", "reserve app %s.", Integer.valueOf(callResult.getCode()));
        }

        private b() {
        }
    }

    class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hw.b("AgReserveDownloadManager", "silent reserve broadcast.");
            e.this.a(context, intent);
        }

        private c() {
        }
    }

    private WeakHashMap<l, Object> a(String str) {
        WeakHashMap<l, Object> weakHashMap;
        synchronized (this) {
            weakHashMap = this.g.get(str);
        }
        return weakHashMap;
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f18466a) {
            if (f18467b == null) {
                f18467b = new e(context);
            }
            eVar = f18467b;
        }
        return eVar;
    }

    private e(Context context) {
        String str;
        this.f = context.getApplicationContext();
        try {
            a();
        } catch (IllegalStateException unused) {
            str = "registerReceiver IllegalStateException";
            hw.c("AgReserveDownloadManager", str);
        } catch (Exception unused2) {
            str = "registerReceiver Exception";
            hw.c("AgReserveDownloadManager", str);
        }
    }
}
