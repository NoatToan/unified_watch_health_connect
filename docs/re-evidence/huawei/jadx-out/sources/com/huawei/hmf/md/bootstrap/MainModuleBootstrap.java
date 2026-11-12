package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.ui.main.stories.MainModule;
import com.huawei.ui.main.stories.nps.NpsExternalApiImpl;
import defpackage.tqr;
import defpackage.tqv;
import defpackage.tqw;
import defpackage.trf;
import defpackage.uca;
import defpackage.ujo;
import defpackage.uta;
import defpackage.uyi;
import defpackage.uzq;
import defpackage.vik;
import defpackage.vyn;
import defpackage.wjp;
import defpackage.wlu;
import defpackage.wsc;

/* JADX INFO: loaded from: classes33.dex */
public final class MainModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(wlu.class, "com.huawei.health.heartratesetting.HeartRateSettingApi");
        builder.add(tqw.class, "com.huawei.health.main.api.MainCommonApi");
        builder.add(tqv.class, "com.huawei.health.vip.api.EquityApi");
        builder.add(wjp.class, "com.huawei.health.main.api.CloudAuthApi");
        builder.add(NpsExternalApiImpl.class, "com.huawei.health.nps.api.NpsExternalApi");
        builder.add(vyn.class, "com.huawei.health.main.api.MainNavigationApi");
        builder.add(trf.class, "com.huawei.health.configuredpage.api.ConfiguredPageApi");
        builder.add(wsc.class, "com.huawei.health.main.api.WeChatApi");
        builder.add(ujo.class, "com.huawei.health.main.api.FitnessDataInteractorApi");
        builder.add(uca.class, "com.huawei.pluginsleepdetection.SleepRecordNotifyApi");
        builder.add(uyi.class, "com.huawei.health.pressure.PressureApi");
        builder.add(vik.class, "com.huawei.health.weight.WeightApi");
        builder.add(uta.class, "com.huawei.health.bloodpressure.BloodPressureApi");
        builder.add(uzq.class, "com.huawei.health.sleep.SleepApi");
        builder.add(tqr.class, "com.huawei.ui.main.stories.about.AboutApi");
        new ModuleProviderWrapper(new MainModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "Main";
    }
}
