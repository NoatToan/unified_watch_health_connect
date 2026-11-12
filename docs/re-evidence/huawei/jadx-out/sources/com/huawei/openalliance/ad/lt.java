package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class lt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lt f19502b;
    private Context d;
    private gk e;
    private Map<String, Class<? extends ls>> f = new HashMap();
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.lt.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                hw.a("NotificationActionManager", "intent or action maybe empty.");
            } else {
                hw.a("NotificationActionManager", " action name:%s", intent.getAction());
                lt.this.a(context, intent);
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19501a = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f19503c = new byte[0];

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b("NotificationActionManager", "isPackageExist packageName is Empty.");
            return false;
        }
        synchronized (f19503c) {
            Set<String> setCy = this.e.cy();
            if (setCy == null) {
                return false;
            }
            return setCy.contains(str);
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b("NotificationActionManager", "remove packageName is Empty.");
            return;
        }
        synchronized (f19503c) {
            try {
                Set<String> setCy = this.e.cy();
                if (setCy != null) {
                    setCy.remove(str);
                    fp.b(this.d).b(setCy);
                }
            } catch (Throwable th) {
                hw.b("NotificationActionManager", "removePackage" + th.getClass().getSimpleName());
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b("NotificationActionManager", "add packageName is Empty.");
            return;
        }
        synchronized (f19503c) {
            try {
                Set<String> setCy = this.e.cy();
                if (setCy != null) {
                    setCy.add(str);
                    fp.b(this.d).b(setCy);
                }
            } catch (Throwable th) {
                hw.b("NotificationActionManager", "addPackage" + th.getClass().getSimpleName());
            }
        }
    }

    public void a(Context context, Intent intent) {
        StringBuilder sb;
        String str;
        try {
            int intExtra = intent.getIntExtra("type", 1);
            String str2 = intent.getAction() + intExtra;
            Class<? extends ls> cls = this.f.get(str2);
            if (cls != null) {
                try {
                    cls.newInstance().a(this.d, intent);
                } catch (InstantiationException unused) {
                    str = "InstantiationException can not instantiation notification Action";
                    hw.c("NotificationActionManager", str);
                } catch (Throwable unused2) {
                    str = "Throwable can not instantiation notification Action";
                    hw.c("NotificationActionManager", str);
                }
            } else {
                hw.b("NotificationActionManager", "can not find action key:" + str2);
            }
        } catch (IllegalStateException e) {
            e = e;
            sb = new StringBuilder("actionReceiver.onReceive IllegalStateException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("NotificationActionManager", sb.toString());
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("actionReceiver.onReceive Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("NotificationActionManager", sb.toString());
        }
    }

    public void a() {
        String str;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.ads.notification.action.DELETE");
            com.huawei.openalliance.ad.utils.as.a(this.d, this.g, intentFilter);
        } catch (IllegalStateException unused) {
            str = "init IllegalStateException";
            hw.c("NotificationActionManager", str);
        } catch (Exception unused2) {
            str = "init Exception";
            hw.c("NotificationActionManager", str);
        }
        b();
    }

    private void b() {
        this.f.put("com.huawei.ads.notification.action.CLICK1", lo.class);
        this.f.put("com.huawei.ads.notification.action.DELETE1", lq.class);
    }

    public static lt a(Context context) {
        synchronized (f19501a) {
            if (f19502b == null) {
                f19502b = new lt(context);
            }
        }
        return f19502b;
    }

    private lt(Context context) {
        this.d = context.getApplicationContext();
        this.e = fp.b(context);
    }
}
