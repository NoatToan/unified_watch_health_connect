package com.garmin.android.apps.connectmobile;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.telephony.PhoneCallListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f46491b;

    public /* synthetic */ u1(Context context, int i14) {
        this.f46490a = i14;
        this.f46491b = context;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        h7.g gVarB;
        Object systemService;
        Context contextE;
        int i14 = this.f46490a;
        Context context = this.f46491b;
        switch (i14) {
            case 0:
                v1.f47374a.getClass();
                v1.d(context);
                break;
            case 1:
                SmartNotificationsUtil.lambda$showNotification$0(context);
                break;
            case 2:
                PhoneCallListener.enable$lambda$0(context);
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new u1(context, 4));
                break;
            case 4:
                androidx.profileinstaller.c.b(context, new bv2.g(1), androidx.profileinstaller.c.f10232a, false);
                break;
            default:
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 33) {
                    i.e.c cVar = i.e.f86561a;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i15 >= 33) {
                            p1.b<WeakReference<i.e>> bVar = i.e.f86567g;
                            bVar.getClass();
                            p1.b.a aVar = new p1.b.a();
                            while (true) {
                                if (aVar.hasNext()) {
                                    i.e eVar = (i.e) ((WeakReference) aVar.next()).get();
                                    if (eVar != null && (contextE = eVar.e()) != null) {
                                        systemService = contextE.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                gVarB = h7.g.b(i.e.b.a(systemService));
                            } else {
                                gVarB = h7.g.f82327b;
                            }
                        } else {
                            gVarB = i.e.f86563c;
                            if (gVarB == null) {
                                gVarB = h7.g.f82327b;
                            }
                        }
                        if (gVarB.f82328a.isEmpty()) {
                            String strB = z6.c.b(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                i.e.b.b(systemService2, i.e.a.a(strB));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                i.e.f86566f = true;
                break;
        }
    }
}
