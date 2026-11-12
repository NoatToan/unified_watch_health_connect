package com.huawei.hmf.md.bootstrap;

import com.huawei.health.impl.DeviceManagerImpl;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.aws;
import defpackage.awu;
import defpackage.fmm;
import defpackage.fmp;
import defpackage.fmq;
import defpackage.fmr;
import defpackage.fms;
import defpackage.fmt;
import defpackage.fmu;
import defpackage.fmw;
import defpackage.fmx;
import defpackage.fmz;
import defpackage.fna;
import defpackage.fnb;
import defpackage.fnc;
import defpackage.fnd;
import defpackage.fne;
import defpackage.fng;
import defpackage.fnh;
import defpackage.fni;
import defpackage.fnj;

/* JADX INFO: loaded from: classes33.dex */
public final class PluginDeviceOpenModuleModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(fnh.class, "com.huawei.health.device.api.WeightDataUtilsApi");
        builder.add(fmq.class, "com.huawei.health.device.api.DeviceInfoUtilsApi");
        builder.add(fnd.class, "com.huawei.health.device.api.JsonParserApi");
        builder.add(fnc.class, "com.huawei.health.device.api.MeasureKitManagerApi");
        builder.add(fmz.class, "com.huawei.health.device.api.HonourDeviceConstantsApi");
        builder.add(fna.class, "com.huawei.health.device.api.HwWspMeasureControllerApi");
        builder.add(fms.class, "com.huawei.health.device.api.DeviceDataBaseHelperApi");
        builder.add(fmt.class, "com.huawei.health.device.api.DataBaseapiApi");
        builder.add(fne.class, "com.huawei.health.device.api.PluginDeviceApi");
        builder.add(fng.class, "com.huawei.health.device.api.MultiUsersManagerApi");
        builder.add(fmu.class, "com.huawei.health.device.api.DeviceMainActivityApi");
        builder.add(fni.class, "com.huawei.health.device.api.VersionVerifyUtilApi");
        builder.add(fmp.class, "com.huawei.health.device.api.DeviceFragmentFactoryApi");
        builder.add(fnj.class, "com.huawei.health.device.api.WiFiWeightSaveHandlerApi");
        builder.add(DeviceManagerImpl.class, "com.huawei.health.device.api.DeviceManagerApi");
        builder.add(fmr.class, "com.huawei.health.device.api.ConverResisToWeightDataUtilApi");
        builder.add(fmw.class, "com.huawei.health.device.api.EventBusApi");
        builder.add(fmm.class, "com.huawei.health.device.api.CommonLibUtilApi");
        builder.add(fmx.class, "com.huawei.health.device.api.HealthDeviceEntryApi");
        builder.add(fnb.class, "com.huawei.health.device.api.HwChMeasureControllerApi");
        builder.add(awu.class, "com.huawei.plugindevice.UploadSmartLifeApi");
        new ModuleProviderWrapper(new aws(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "PluginDeviceOpenModule";
    }
}
