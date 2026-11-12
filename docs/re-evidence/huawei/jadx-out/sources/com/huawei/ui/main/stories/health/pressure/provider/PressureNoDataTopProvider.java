package com.huawei.ui.main.stories.health.pressure.provider;

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
public class PressureNoDataTopProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SectionBean f28026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28027c;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureNoDataTopProvider", "loadData");
        this.f28026b = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("PressureNoDataTopProvider", "loadDefaultData");
        super.loadDefaultData(sectionBean);
        sectionBean.c(new Object());
        boolean zA = a(e());
        this.f28027c = zA;
        LogUtil.a("PressureNoDataTopProvider", "mIsBindDevices: ", Boolean.valueOf(zA));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("PressureNoDataTopProvider", "parseParams");
        map.put("DEVICE_INFO_FLAG", Boolean.valueOf(this.f28027c));
        if (this.f28027c) {
            map.put("RECT_CORNER_IMAGE", Integer.valueOf(R.drawable.rect_corner));
            return;
        }
        map.put("TOP_IMAGE", Integer.valueOf(R.drawable.no_data_head_pressure));
        map.put("TOP_IMAGE_TAHITI", Integer.valueOf(R.drawable.no_data_head_pressure_tahiti));
        map.put("ROUND_CORNER_IMAGE", Integer.valueOf(R.drawable.round_corner));
    }

    private DeviceInfo e() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "PressureNoDataTopProvider");
    }

    private boolean a(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }
}
