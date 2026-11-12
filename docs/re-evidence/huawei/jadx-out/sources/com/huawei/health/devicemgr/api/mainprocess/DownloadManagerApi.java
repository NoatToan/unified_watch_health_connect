package com.huawei.health.devicemgr.api.mainprocess;

import android.graphics.Bitmap;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import defpackage.edl;
import defpackage.edm;
import defpackage.eds;
import defpackage.edv;
import defpackage.edx;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DownloadManagerApi {
    void addDownloadIndexAllCallBack(DownloadResultCallBack downloadResultCallBack);

    void clearPluginInfoList();

    void downloadIndexAll();

    void downloadIndexByDeviceType(String str);

    void downloadIndexByType(int i);

    void downloadIndexByUuidList(List<String> list, DownloadDeviceInfoCallBack downloadDeviceInfoCallBack);

    List<eds> getDeviceInfoByBluetooth(String str);

    List<eds> getDeviceList();

    edm getIndexBean();

    List<edx> getIndexList();

    String getPairDescription(String str);

    String getPluginIndexOobe(String str);

    edl getPluginInfoByDeviceType(int i);

    edl getPluginInfoByHiType(int i);

    edl getPluginInfoByUuid(String str);

    List<edv> getUuids();

    List<String> getValueFeature(String str);

    boolean isHtyVersion();

    boolean isResourcesAvailable(String str);

    boolean isSupportPairCheckedOtaAutoUpdateSwitch();

    Bitmap loadImageByImageName(edl edlVar, String str);

    Bitmap loadImageByImagePath(String str);

    void onDownloadIndexAllDestroy();

    void resourcePresetHty();
}
