package com.facebook.react;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.fmb;
import defpackage.hmb;
import defpackage.mcj;
import defpackage.sk1;
import defpackage.xdj;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HeadlessJsTaskService extends Service implements hmb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static PowerManager.WakeLock f7142b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Integer> f7143a = new CopyOnWriteArraySet();

    @SuppressLint({"WakelockTimeout"})
    public static void a(Context context) {
        PowerManager.WakeLock wakeLock = f7142b;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) sk1.c((PowerManager) context.getSystemService("power"))).newWakeLock(1, HeadlessJsTaskService.class.getCanonicalName());
            f7142b = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            f7142b.acquire();
        }
    }

    public xdj b() {
        ((mcj) getApplication()).a();
        return null;
    }

    public fmb c(Intent intent) {
        return null;
    }

    public void d(fmb fmbVar) {
        UiThreadUtil.assertOnUiThread();
        a(this);
        b();
        throw null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        throw null;
    }

    @Override // defpackage.hmb
    public void onHeadlessJsTaskFinish(int i) {
        this.f7143a.remove(Integer.valueOf(i));
        if (this.f7143a.size() == 0) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        fmb fmbVarC = c(intent);
        if (fmbVarC == null) {
            return 2;
        }
        d(fmbVarC);
        return 3;
    }
}
