package com.huawei.ui.main.stories.health.temperature.provider;

import android.content.Context;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.ResourceParseHelper;
import defpackage.drw;
import defpackage.ecu;
import defpackage.mbw;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class TemperatureNoDataDesProvider extends BaseKnitDataProvider implements ResourceParseHelper.ConfigInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SectionBean f28128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28130c;
    private String d;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureNoDataTopProvider", "loadData");
        this.f28128a = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("PressureNoDataTopProvider", "loadDefaultData");
        super.loadDefaultData(sectionBean);
        sectionBean.c(new Object());
        this.f28130c = c(e()) || mbw.a() || a() > 0;
        this.f28129b = BaseApplication.getContext().getString(R.string.IDS_desc_body_temperature);
        ResourceParseHelper.c(this);
        d(this.f28130c);
        LogUtil.a("PressureNoDataTopProvider", "mIsBindDevices: ", Boolean.valueOf(this.f28130c));
    }

    private void d(boolean z) {
        if (z) {
            ResourceParseHelper.e("IDS_desc_has_device_no_data", "BodyTemperatureCardConstructor", this);
            ResourceParseHelper.b("temperature_img_has_device_no_data", "BodyTemperatureCardConstructor", this);
        } else {
            ResourceParseHelper.e("IDS_desc_body_temperature", "BodyTemperatureCardConstructor", this);
            ResourceParseHelper.b("pic_body_temperature", "BodyTemperatureCardConstructor", this);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("PressureNoDataTopProvider", "parseParams");
        map.put("DEVICE_INFO_FLAG", Boolean.valueOf(this.f28130c));
        map.put("NO_DATA_DESCRIPTION", this.f28129b);
        if (this.f28130c) {
            map.put("HAS_DEVICE_NO_DATA_IMAGE", this.d);
        } else {
            map.put("TOP_IMAGE", this.d);
            map.put("ROUND_CORNER_IMAGE", Integer.valueOf(R.drawable.round_corner));
        }
    }

    private DeviceInfo e() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "PressureNoDataTopProvider");
    }

    private boolean c(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }

    private int a() {
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE);
        if (njy.e(arrayListD)) {
            return 0;
        }
        return arrayListD.size();
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getTitleName(String str) {
        LogUtil.a("PressureNoDataTopProvider", "getTitleName");
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getDescription(String str) {
        this.f28129b = str;
        this.f28128a.c(new Object());
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getImagePath(String str) {
        this.d = str;
        this.f28128a.c(new Object());
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void showParseErrorAlert() {
        LogUtil.a("PressureNoDataTopProvider", "showParseErrorAlert");
    }
}
