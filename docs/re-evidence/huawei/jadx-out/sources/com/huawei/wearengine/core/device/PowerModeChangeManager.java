package com.huawei.wearengine.core.device;

import com.huawei.wearengine.utils.Singleton;
import defpackage.yit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes20.dex */
public class PowerModeChangeManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Singleton<PowerModeChangeManager> f30766a = new Singleton<PowerModeChangeManager>() { // from class: com.huawei.wearengine.core.device.PowerModeChangeManager.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.wearengine.utils.Singleton
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PowerModeChangeManager create() {
            return new PowerModeChangeManager();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f30767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f30768c;
    private final AtomicBoolean e;

    /* JADX INFO: loaded from: classes46.dex */
    public interface HandlePowerModeChange {
        void startClearData(String str);
    }

    private PowerModeChangeManager() {
        this.f30767b = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f30768c = Executors.newSingleThreadExecutor();
    }

    public static PowerModeChangeManager a() {
        return f30766a.get();
    }

    public void c() {
        this.f30767b.set(true);
    }

    public boolean e() {
        return this.e.get();
    }

    public boolean e(boolean z) {
        if (!e()) {
            return false;
        }
        yit.e("PowerModeChangeManager", "checkIsPowerModeChanging powerMode in changing");
        if (z) {
            throw new IllegalStateException(String.valueOf(20));
        }
        return true;
    }
}
