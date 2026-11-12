package com.xiaomi.hm.health.di.koin;

import com.amap.api.mapcore.util.hl;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.loc.z;
import com.xiaomi.hm.health.di.koin.KoinLifecycleManager;
import com.xiaomi.hm.health.di.koin.module.UserModuleKt;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.healthdata.koin.ScopesKt;
import com.xiaomi.hm.health.stress.StressScopeNamesKt;
import com.xiaomi.hm.health.training.api.NewDbApi;
import com.xiaomi.hm.health.training.api.NewTrainingDb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/KoinLifecycleManager;", "", "", "f", "c", "m", "h", hl.k, "l", "b", "g", "i", "e", z.j, "startUserLifecycle", "stopUserLifecycle", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class KoinLifecycleManager {

    @NotNull
    public static final KoinLifecycleManager INSTANCE = new KoinLifecycleManager();

    private KoinLifecycleManager() {
    }

    private final void b() {
    }

    private final void c() {
        final Koin koin = GlobalContext.INSTANCE.get();
        NewTrainingDb.INSTANCE.setTrainingDb(ScopesAndQualifersKt.trainingDb(koin));
        NewDbApi.INSTANCE.setTrainingDb(ScopesAndQualifersKt.trainingDb(koin));
        ScopesAndQualifersKt.trainingAppExecutors(koin).getDiskIO().execute(new Runnable() { // from class: kl4
            @Override // java.lang.Runnable
            public final void run() {
                KoinLifecycleManager.d(koin);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Koin koin) {
        ScopesAndQualifersKt.trainingConfigManager(koin).setShouldFetchConfigs(true);
    }

    private final void e() {
        KoinModuleKt.ppgScope().close();
    }

    private final void f() {
        KoinExKt.bloodPressureScope().close();
    }

    private final void g() {
        com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt.femaleHealthScope(GlobalContext.INSTANCE.get()).close();
    }

    private final void h() {
        ScopesKt.healthDataScope(GlobalContext.INSTANCE.get()).close();
    }

    private final void i() {
        com.huami.message.di.koin.ScopesAndQualifersKt.messageScope(GlobalContext.INSTANCE.get()).close();
    }

    private final void j() {
        PHNProjectModuleKt.getPhnProjectKoinScope().close();
    }

    private final void k() {
        StressScopeNamesKt.stressScope(com.huami.healthlabel.koin.ScopesAndQualifersKt.getKoin()).close();
    }

    private final void l() {
        com.huami.bodymeasurements.temperature.model.koin.ScopesKt.temperatureScope(GlobalContext.INSTANCE.get()).close();
    }

    private final void m() {
        ScopesAndQualifersKt.trainingScope(GlobalContext.INSTANCE.get()).close();
    }

    public final void startUserLifecycle() {
        stopUserLifecycle();
        c();
        b();
    }

    public final void stopUserLifecycle() {
        GlobalContext globalContext = GlobalContext.INSTANCE;
        UserModuleKt.userScope(globalContext.get()).close();
        m();
        g();
        i();
        k();
        l();
        com.huami.pai.koin.ScopesAndQualifersKt.paiScope(globalContext.get()).close();
        e();
        h();
        Spo2Proxy.unLoad();
        f();
        j();
    }
}
