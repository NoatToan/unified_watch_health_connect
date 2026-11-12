package com.huawei.health.configresource.downloaddevicemanager;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dkg;
import defpackage.dkh;
import defpackage.dkl;
import defpackage.dko;
import defpackage.dkr;
import defpackage.dku;
import defpackage.dkv;
import defpackage.dkz;
import defpackage.edl;
import defpackage.edm;
import defpackage.eds;
import defpackage.edv;
import defpackage.edx;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
@ApiDefine(uri = DownloadManagerApi.class)
public class DownloadManagerImpl implements DownloadManagerApi {
    private static final String TAG = "DownloadManagerImpl";

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public String getPairDescription(String str) {
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public List<String> getValueFeature(String str) {
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void downloadIndexAll() {
        LogUtil.a(TAG, "downloadIndexAll");
        dkr.d().e();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void addDownloadIndexAllCallBack(DownloadResultCallBack downloadResultCallBack) {
        LogUtil.a(TAG, "addDownloadIndexAllCallBack");
        dkr.d().b(downloadResultCallBack);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void onDownloadIndexAllDestroy() {
        dkr.d().a();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public List<eds> getDeviceList() {
        return dkg.d().e();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public edm getIndexBean() {
        return dkg.d().c();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public List<eds> getDeviceInfoByBluetooth(String str) {
        return dkg.d().a(str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void downloadIndexByUuidList(List<String> list, DownloadDeviceInfoCallBack downloadDeviceInfoCallBack) {
        if (downloadDeviceInfoCallBack == null) {
            if (list == null || list.size() != 1) {
                return;
            }
            dkl.d().a(list.get(0));
            return;
        }
        new dko(list, downloadDeviceInfoCallBack).a();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void downloadIndexByType(int i) {
        dkv.d().a(i);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void downloadIndexByDeviceType(String str) {
        dkl.d().c(str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public edl getPluginInfoByUuid(String str) {
        return dkz.d().b(str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public edl getPluginInfoByDeviceType(int i) {
        return dkz.d().b(i);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public edl getPluginInfoByHiType(int i) {
        return dkz.d().a(i);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public List<edx> getIndexList() {
        return dkz.d().b();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public boolean isResourcesAvailable(String str) {
        return dkz.d().j(str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public Bitmap loadImageByImageName(edl edlVar, String str) {
        return dkz.d().e(edlVar, str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public Bitmap loadImageByImagePath(String str) {
        return dkz.d().h(str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void clearPluginInfoList() {
        dkz.e();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public String getPluginIndexOobe(String str) {
        String strC;
        edx edxVarD = dkz.d().d(str);
        if (edxVarD == null) {
            strC = "";
        } else {
            strC = edxVarD.c();
        }
        return (TextUtils.isEmpty(strC) && isSmartWatch(str)) ? "6ed99f86-c6b4-43e2-8339-52b2d72a9168" : strC;
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public void resourcePresetHty() {
        dku.e();
        downloadIndexAll();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public boolean isHtyVersion() {
        return dku.c();
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public boolean isSupportPairCheckedOtaAutoUpdateSwitch() {
        List<String> listA = dkh.a();
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        LogUtil.a(TAG, "countryCodeList: " + listA + ", current countryCode: " + commonCountryCode);
        return !listA.contains(commonCountryCode);
    }

    private boolean isSmartWatch(String str) {
        return "69a968a4-5db8-4d1e-a390-762cb8039784".equals(str) || "96cea4f7-9a5e-4db4-9dda-244885c5446f".equals(str) || "c7d28238-fec2-4985-b2a4-f29c96637ac4".equals(str) || "f5195256-bc1c-44b8-a4b7-52866f623d11".equals(str);
    }

    @Override // com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi
    public List<edv> getUuids() {
        return dkg.d().b();
    }
}
