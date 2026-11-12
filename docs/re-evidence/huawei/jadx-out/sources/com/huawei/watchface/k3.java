package com.huawei.watchface;

import android.content.Context;
import com.huawei.watchface.api.PluginBase;

/* JADX INFO: loaded from: classes20.dex */
public class k3 extends PluginBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile k3 f30266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f30267c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30268a;

    public k3(Context context) {
        this.f30268a = context;
    }

    public static k3 a(Context context) {
        if (f30266b == null) {
            synchronized (f30267c) {
                if (f30266b == null) {
                    f30266b = new k3(context.getApplicationContext());
                }
            }
        }
        return f30266b;
    }

    public boolean a() {
        return e4.a("current_user_is_designer", "goal_steps_perference", false);
    }
}
