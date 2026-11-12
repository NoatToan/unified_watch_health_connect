package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.ecu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SleepNoDataTopProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26825a;
    SectionBean e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepNoDataTopProvider", "loadData");
        this.e = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("SleepNoDataTopProvider", "loadDefaultData");
        super.loadDefaultData(sectionBean);
        sectionBean.c(new Object());
        boolean zC = c(e());
        this.f26825a = zC;
        LogUtil.a("SleepNoDataTopProvider", "mIsBindDevices: ", Boolean.valueOf(zC));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("SleepNoDataTopProvider", "parseParams");
        map.put("DEVICE_INFO_FLAG", Boolean.valueOf(this.f26825a));
        if (this.f26825a) {
            map.put("RECT_CORNER_IMAGE", Integer.valueOf(R.drawable.rect_corner));
            return;
        }
        map.put("TOP_IMAGE", Integer.valueOf(R.drawable.no_data_head_sleep));
        map.put("TOP_IMAGE_TAHITI", Integer.valueOf(R.drawable.no_data_head_sleep_tahiti));
        map.put("ROUND_CORNER_IMAGE", Integer.valueOf(R.drawable.round_corner));
    }

    private DeviceInfo e() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "SleepNoDataTopProvider");
    }

    private boolean c(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }
}
