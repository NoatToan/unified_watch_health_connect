package com.xiaomi.onetrack;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.onetrack.util.o;
import com.xiaomi.onetrack.util.oaid.a;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class OneTrackDebugger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile OneTrackDebugger f13681a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f13682b = "com.xiaomi.onetrack.otdebugger.FloatWindowService";
    private ConcurrentHashMap<Long, Configuration> c = new ConcurrentHashMap<>();

    private OneTrackDebugger() {
    }

    public static OneTrackDebugger getInstance() {
        if (f13681a == null) {
            synchronized (OneTrackDebugger.class) {
                try {
                    if (f13681a == null) {
                        f13681a = new OneTrackDebugger();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13681a;
    }

    public String getInstanceId() {
        return o.a().b();
    }

    public String getOaid(Context context) {
        return a.a().a(context.getApplicationContext());
    }

    public ConcurrentHashMap<Long, Configuration> getSdkConfig() {
        return this.c;
    }

    public void setSdkConfig(Configuration configuration) {
        this.c.put(Long.valueOf(System.currentTimeMillis()), configuration);
    }

    public void startDebugger() {
        try {
            com.xiaomi.onetrack.f.a.b().startService(new Intent(com.xiaomi.onetrack.f.a.b(), Class.forName(f13682b)));
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
