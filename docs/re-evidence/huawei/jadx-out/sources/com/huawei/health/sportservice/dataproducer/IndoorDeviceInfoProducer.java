package com.huawei.health.sportservice.dataproducer;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.dmg;
import defpackage.nxo;
import defpackage.nxs;
import defpackage.nye;
import defpackage.nzc;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.INDOOR_DEVICE_INFO_PRODUCER)
public class IndoorDeviceInfoProducer extends BaseProducer implements SportLifecycle {
    private static final String TAG = "SportService_IndoorDeviceInfoProducer";
    private static final int TIME_1000MS = 1000;
    private DeviceInformation mDeviceInformation;
    private String mDeviceMacAddress = Constants.LINK;
    private boolean mIsFitnessMachineProfile;
    private nye mSportBiReportController;

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
        if (obj instanceof DeviceInformation) {
            this.mDeviceInformation = (DeviceInformation) obj;
            onStagingAndNotification();
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        DeviceInformation deviceInformation = this.mDeviceInformation;
        if (deviceInformation == null) {
            return;
        }
        LogUtil.a(TAG, "onStagingAndNotification, mDeviceInformation = ", deviceInformation);
        setBiBean();
        BaseSportManager.getInstance().stagingAndNotification("INDOOR_DEVICE_INFO_DATA", this.mDeviceInformation);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        this.mIsFitnessMachineProfile = nxs.d().g();
        this.mDeviceMacAddress = nxs.d().c();
        BaseSportManager.getInstance().subscribeToSource("INDOOR_DEVICE_INFO_DATA", this);
        nye nyeVarD = nye.d(BaseApplication.b());
        this.mSportBiReportController = nyeVarD;
        nyeVarD.d();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        if (this.mSportBiReportController != null) {
            reportFinishSportBiEvent();
            this.mSportBiReportController.b(this.mDeviceMacAddress);
        }
    }

    private void reportFinishSportBiEvent() {
        DeviceInformation deviceInformation = this.mDeviceInformation;
        if (deviceInformation == null || deviceInformation.getDeviceType() != 283) {
            LogUtil.a(TAG, "mDeviceInformation is null or device is not ropeSkipping device");
        } else {
            nzc.c(this.mSportBiReportController.d(this.mDeviceInformation.getModelString(), this.mDeviceInformation.getDeviceType()), CommonUtils.j(String.valueOf(BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION"))) / 1000, dmg.a().getCurrentMacAddress(), 283);
        }
    }

    private void setBiBean() {
        String strC;
        nxo nxoVar = new nxo();
        nxoVar.j("FtmpGetDisSuccess");
        nxoVar.b(this.mDeviceInformation.getManufacturerString());
        nxoVar.d(this.mDeviceInformation.getModelString());
        nxoVar.a(String.valueOf(this.mDeviceInformation.getDeviceType()));
        if (TextUtils.isEmpty(this.mDeviceMacAddress)) {
            if (this.mDeviceInformation.getDeviceType() == 283) {
                strC = dmg.a().getCurrentMacAddress();
            } else {
                strC = nxs.d().c();
            }
            this.mDeviceMacAddress = strC;
        }
        nxoVar.c(this.mDeviceMacAddress);
        nxoVar.h(this.mIsFitnessMachineProfile + "");
        nxoVar.f(!this.mIsFitnessMachineProfile ? this.mDeviceInformation.getBleDeviceName() : Constants.LINK);
        nzc.d(BaseApplication.b(), nxoVar);
    }
}
