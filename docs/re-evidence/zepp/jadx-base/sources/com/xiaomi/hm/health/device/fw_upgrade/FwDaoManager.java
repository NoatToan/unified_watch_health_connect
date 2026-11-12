package com.xiaomi.hm.health.device.fw_upgrade;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfoDao;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class FwDaoManager {
    private static FwDaoManager b;
    private final Lazy<DeviceManagerApi> a = KoinJavaComponent.inject(DeviceManagerApi.class);

    private FwDaoManager() {
    }

    private FwDwonSuccessInfoDao a() {
        return HMDaoManager.getInstance().getFwDwonSuccessInfoDao();
    }

    private boolean c(HMDeviceSource hMDeviceSource) {
        return (hMDeviceSource.getValue() == HMDeviceSource.MILI_TEMPO.getValue() || hMDeviceSource.getValue() == HMDeviceSource.MILI_PEYTO.getValue()) ? false : true;
    }

    public static FwDaoManager getManager() {
        if (b == null) {
            b = new FwDaoManager();
        }
        return b;
    }

    public long addInfo(FwDwonSuccessInfo fwDwonSuccessInfo) {
        return a().insert(fwDwonSuccessInfo);
    }

    public boolean b(int i, int i2, int i3) {
        List<FwDwonSuccessInfo> list = a().queryBuilder().where(FwDwonSuccessInfoDao.Properties.Source.eq(Integer.valueOf(i)), FwDwonSuccessInfoDao.Properties.ServerAppVersion.eq(Integer.valueOf(i2)), FwDwonSuccessInfoDao.Properties.LocalFwVersionCode.eq(Integer.valueOf(i3))).list();
        return list != null && list.size() > 0;
    }

    public FwDwonSuccessInfo getFontInfo(HMDeviceSource hMDeviceSource, int i) {
        return null;
    }

    public FwDwonSuccessInfo getFwInfo(HMDeviceSource hMDeviceSource, int i) {
        return null;
    }

    public FwDwonSuccessInfo getGpsInfo(HMDeviceSource hMDeviceSource, int i) {
        return null;
    }

    public FwDwonSuccessInfo getInfo(HMDeviceSource hMDeviceSource, int i) {
        FwDwonSuccessInfo lastestInfo = getLastestInfo(hMDeviceSource, i);
        if (lastestInfo == null) {
            return null;
        }
        HMBaseDevice device = this.a.getValue().getDevice(hMDeviceSource.getType());
        String languageCode = HMLanguage.getLanguageCode(HMFwOnlineManager.getLocale(device == null ? null : device.getDeviceInfo()));
        String langs = HMFwOnlineManager.getLangs(lastestInfo.getFwRelyVersion());
        if (langs == null || langs.length() == 0 || langs.contains(languageCode)) {
            return lastestInfo;
        }
        return null;
    }

    public FwDwonSuccessInfo getLastestInfo(HMDeviceSource hMDeviceSource, int i) {
        return !HMDeviceConfig.hasSurportProductVersionDevices(hMDeviceSource) ? a().queryBuilder().where(FwDwonSuccessInfoDao.Properties.Source.eq(Integer.valueOf(hMDeviceSource.getValue())), FwDwonSuccessInfoDao.Properties.ServerAppVersion.eq(Integer.valueOf(HMAppConfig.getVersionCode())), FwDwonSuccessInfoDao.Properties.FwType.isNotNull()).orderDesc(FwDwonSuccessInfoDao.Properties.Id).limit(1).unique() : a().queryBuilder().where(FwDwonSuccessInfoDao.Properties.Source.eq(Integer.valueOf(hMDeviceSource.getValue())), FwDwonSuccessInfoDao.Properties.ProductVersion.eq(Integer.valueOf(i)), FwDwonSuccessInfoDao.Properties.ServerAppVersion.eq(Integer.valueOf(HMAppConfig.getVersionCode())), FwDwonSuccessInfoDao.Properties.FwType.isNotNull()).orderDesc(FwDwonSuccessInfoDao.Properties.Id).limit(1).unique();
    }

    public FwDwonSuccessInfo getResInfo(HMDeviceSource hMDeviceSource, int i) {
        return null;
    }

    public void updateForce(HMDeviceSource hMDeviceSource, int i) {
        FwDwonSuccessInfo info = getInfo(hMDeviceSource, i);
        if (info == null) {
            return;
        }
        info.setForceUpgrade(Boolean.TRUE);
        a().insertOrReplace(info);
    }
}
