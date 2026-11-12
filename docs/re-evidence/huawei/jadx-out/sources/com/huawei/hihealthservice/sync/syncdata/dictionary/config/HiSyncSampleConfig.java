package com.huawei.hihealthservice.sync.syncdata.dictionary.config;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.dbmanager.SampleConfigManager;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import defpackage.ioi;
import defpackage.kul;
import defpackage.kwt;
import defpackage.kxk;
import defpackage.kyk;
import defpackage.kym;
import defpackage.lhp;
import defpackage.lif;
import defpackage.lih;
import defpackage.liq;
import defpackage.lis;
import defpackage.liz;
import defpackage.lqo;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class HiSyncSampleConfig implements HiSyncBase {
    private static final List<String> BLACK_LIST;
    private static final List<String> FILTER_NO_CLOUD_LIST;
    private static final String TAG = "HiH_HiSyncSampCfg";
    private final Context mContext;
    private final int mMainUserId;
    private final HealthDataCloudFactory mParamsFactory;
    private final HiSyncOption mSyncOption;
    private final lhp mSyncVersionMgr;
    private int mUploadFailCount = 0;
    private int mUploadTotalCount = 0;
    private final kxk mSyncAnchorMgr = kxk.c();

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    static {
        ArrayList arrayList = new ArrayList();
        FILTER_NO_CLOUD_LIST = arrayList;
        arrayList.add("900500039");
        arrayList.add(MatterDataContans.CONFIG_ID_UNIT_TYPE);
        BLACK_LIST = Collections.singletonList("900100021");
    }

    public HiSyncSampleConfig(Context context, HiSyncOption hiSyncOption, int i) {
        this.mContext = context;
        this.mSyncOption = hiSyncOption;
        this.mMainUserId = i;
        this.mParamsFactory = lqo.b(context).b();
        this.mSyncVersionMgr = lhp.b(context);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d(TAG, "pullDataByVersion begin");
        lis.b(1.0d, "SYNC_CONFIG_DOWNLOAD_PERCENT_MAX");
        List<SyncKey> listC = this.mSyncVersionMgr.c(900000000);
        if (HiCommonUtil.b(listC)) {
            ReleaseLogUtil.e(TAG, "dictionary data not exist in cloud");
            lis.c(this.mContext);
        } else {
            downloadSampleConfig(listC.get(0));
            lis.c(this.mContext);
            ReleaseLogUtil.d(TAG, "pullDataByVersion end");
        }
    }

    private void downloadSampleConfig(SyncKey syncKey) throws lif {
        if (syncKey == null) {
            return;
        }
        Long version = syncKey.getVersion();
        long jLongValue = version.longValue();
        if (jLongValue <= 0) {
            ReleaseLogUtil.e(TAG, "downloadSampleConfig cloud has no such data");
            return;
        }
        GetSampleConfigByVersionReq getSampleConfigByVersionReq = new GetSampleConfigByVersionReq();
        kul kulVarA = this.mSyncAnchorMgr.a(this.mMainUserId, 0L, 900000000);
        if (kulVarA == null) {
            LogUtil.a(TAG, " syncAnchorTable is null");
            getSampleConfigByVersionReq.setVersion(0L);
            downloadSampleConfigByVersion(getSampleConfigByVersionReq, jLongValue);
        } else if (kulVarA.h() < jLongValue) {
            getSampleConfigByVersionReq.setVersion(kulVarA.h());
            downloadSampleConfigByVersion(getSampleConfigByVersionReq, jLongValue);
        } else {
            LogUtil.a(TAG, " do not need downloadSampleConfig, DBversion is ", Long.valueOf(kulVarA.h()), ", cloudVersion is ", version);
        }
    }

    private void downloadSampleConfigByVersion(GetSampleConfigByVersionReq getSampleConfigByVersionReq, long j) throws lif {
        long jDownloadSampleConfigByRequest;
        do {
            jDownloadSampleConfigByRequest = downloadSampleConfigByRequest(getSampleConfigByVersionReq);
            ReleaseLogUtil.d(TAG, " downloadSampleConfigByVersion downCurrentVersion is ", Long.valueOf(jDownloadSampleConfigByRequest), " cloudVersion is ", Long.valueOf(j));
            if (jDownloadSampleConfigByRequest <= -1) {
                return;
            }
            if (!this.mSyncAnchorMgr.d(this.mMainUserId, 900000000, jDownloadSampleConfigByRequest, 0L)) {
                ReleaseLogUtil.e(TAG, "downloadSampleConfigByVersion saveVersionToDB failed!");
                return;
            }
            getSampleConfigByVersionReq.setVersion(jDownloadSampleConfigByRequest);
        } while (jDownloadSampleConfigByRequest < j);
    }

    private long downloadSampleConfigByRequest(GetSampleConfigByVersionReq getSampleConfigByVersionReq) throws lif {
        GetSampleConfigByVersionRsp getSampleConfigByVersionRsp = (GetSampleConfigByVersionRsp) oet.d().e(getSampleConfigByVersionReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(getSampleConfigByVersionReq)), GetSampleConfigByVersionRsp.class);
        if (!lih.e(getSampleConfigByVersionRsp, false)) {
            ReleaseLogUtil.e(TAG, "downloadSampleConfigByRequest SyncError checkCloudRsp");
            return -1L;
        }
        List<CloudSampleConfig> infoList = getSampleConfigByVersionRsp.getInfoList();
        if (HiCommonUtil.b(infoList)) {
            ReleaseLogUtil.e(TAG, "downloadSampleConfigByRequest detailInfos is null or empty");
            return -1L;
        }
        long currentVersion = getSampleConfigByVersionRsp.getCurrentVersion();
        if (currentVersion <= getSampleConfigByVersionReq.getVersion().longValue()) {
            ReleaseLogUtil.e(TAG, "downloadSampleConfigByRequest downloadVersion is ", Long.valueOf(currentVersion), " smaller than currentVersion ", getSampleConfigByVersionReq.getVersion());
            return -1L;
        }
        if (saveSampleConfig(infoList)) {
            return currentVersion;
        }
        return -1L;
    }

    private boolean saveSampleConfig(List<CloudSampleConfig> list) throws lif {
        List<HiSampleConfig> listCloudSampleConfigToLocal = cloudSampleConfigToLocal(list);
        if (HiCommonUtil.b(listCloudSampleConfigToLocal)) {
            ReleaseLogUtil.e(TAG, "localSampleConfigList empty");
            return false;
        }
        ReleaseLogUtil.d(TAG, "localSampleConfigList size is ", Integer.valueOf(listCloudSampleConfigToLocal.size()));
        for (HiSampleConfig hiSampleConfig : listCloudSampleConfigToLocal) {
            if (hiSampleConfig == null) {
                LogUtil.j(TAG, "localSampleConfig is null");
            } else {
                SampleConfigManager.e().d(this.mMainUserId, hiSampleConfig);
                liz.a().a(103, hiSampleConfig.getConfigId(), new kym(this.mContext.getPackageName()));
            }
        }
        return true;
    }

    private List<HiSampleConfig> cloudSampleConfigToLocal(List<CloudSampleConfig> list) throws lif {
        ArrayList arrayList = new ArrayList(list.size());
        for (CloudSampleConfig cloudSampleConfig : list) {
            if (cloudSampleConfig != null) {
                kym kymVarE = kyk.e(this.mContext).e(liq.e(this.mContext), this.mMainUserId, cloudSampleConfig.getDeviceCode(), true);
                if (kymVarE == null) {
                    ReleaseLogUtil.d(TAG, "HealthContext is null, deviceCode is ", Long.valueOf(cloudSampleConfig.getDeviceCode()));
                } else {
                    arrayList.add(new HiSampleConfig.Builder().h(cloudSampleConfig.getType()).a(cloudSampleConfig.getConfigId()).f(cloudSampleConfig.getScopeApp()).i(cloudSampleConfig.getScopeDeviceType()).b(cloudSampleConfig.getConfigData()).d(cloudSampleConfig.getConfigDescription()).c(cloudSampleConfig.getMetaData()).e(cloudSampleConfig.getModifyTime()).d(kymVarE.c()).b(1).c());
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif, IllegalArgumentException {
        ReleaseLogUtil.d(TAG, "pushData begin");
        List<Integer> listH = kwt.b().h(this.mMainUserId);
        if (!HiCommonUtil.b(listH)) {
            uploadSampleConfig(listH);
        } else {
            ReleaseLogUtil.e(TAG, "no client get, maybe no data need to pushData");
        }
        deleteSampleConfig();
        ReleaseLogUtil.d(TAG, "pushData end");
    }

    private void uploadSampleConfig(List<Integer> list) throws lif, IllegalArgumentException {
        while (this.mUploadFailCount < 2) {
            List<HiSampleConfig> listFilterByDataPrivacy = filterByDataPrivacy(filterNoCloud(SampleConfigManager.e().e(list, null, 0, 10)));
            if (HiCommonUtil.b(listFilterByDataPrivacy)) {
                break;
            }
            long jUploadSampleConfigOnce = uploadSampleConfigOnce(listFilterByDataPrivacy);
            if (jUploadSampleConfigOnce == 0) {
                ReleaseLogUtil.e(TAG, "cloudVersion is zero!");
                break;
            } else if (!this.mSyncAnchorMgr.d(this.mMainUserId, 900000000, jUploadSampleConfigOnce, 0L)) {
                ReleaseLogUtil.e(TAG, "downloadSampleConfigByVersion saveVersionToDB failed!");
                return;
            }
        }
        this.mUploadFailCount = 0;
    }

    public List<HiSampleConfig> filterByDataPrivacy(List<HiSampleConfig> list) {
        if (HiCommonUtil.b(list)) {
            return new ArrayList();
        }
        if ("true".equals(ioi.d().c(2))) {
            return list;
        }
        Map map = (Map) list.stream().collect(Collectors.partitioningBy(new Predicate() { // from class: com.huawei.hihealthservice.sync.syncdata.dictionary.config.HiSyncSampleConfig$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return HiSyncSampleConfig.BLACK_LIST.contains(((HiSampleConfig) obj).getConfigId());
            }
        }));
        List list2 = (List) map.get(true);
        if (!CollectionUtils.a(list2)) {
            ReleaseLogUtil.e(TAG, "user dataPrivacy switch is closed, configId=", HiJsonUtil.d((List) list2.stream().map(new Function() { // from class: com.huawei.hihealthservice.sync.syncdata.dictionary.config.HiSyncSampleConfig$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((HiSampleConfig) obj).getConfigId();
                }
            }).collect(Collectors.toList())));
        }
        return (List) map.get(false);
    }

    private List<HiSampleConfig> filterNoCloud(List<HiSampleConfig> list) {
        if (HiCommonUtil.b(list)) {
            return new ArrayList();
        }
        return (List) list.stream().filter(new Predicate() { // from class: com.huawei.hihealthservice.sync.syncdata.dictionary.config.HiSyncSampleConfig$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return HiSyncSampleConfig.lambda$filterNoCloud$1((HiSampleConfig) obj);
            }
        }).collect(Collectors.toList());
    }

    static /* synthetic */ boolean lambda$filterNoCloud$1(HiSampleConfig hiSampleConfig) {
        return !FILTER_NO_CLOUD_LIST.contains(hiSampleConfig.getConfigId());
    }

    private long uploadSampleConfigOnce(List<HiSampleConfig> list) throws lif, IllegalArgumentException {
        if (!liq.f()) {
            int i = this.mUploadTotalCount + 1;
            this.mUploadTotalCount = i;
            liq.c(i, this.mSyncOption.getSyncManual());
        } else {
            int i2 = this.mUploadTotalCount + 1;
            this.mUploadTotalCount = i2;
            if (i2 > 5) {
                ReleaseLogUtil.d(TAG, "isOverSea mUploadTotalCount too much");
                this.mUploadFailCount += 2;
                return 0L;
            }
        }
        List<CloudSampleConfig> listLocalSampleConfigToCloud = localSampleConfigToCloud(list);
        if (CollectionUtils.a(listLocalSampleConfigToCloud)) {
            return 0L;
        }
        SetSampleConfigReq setSampleConfigReq = new SetSampleConfigReq();
        setSampleConfigReq.setmInfoList(listLocalSampleConfigToCloud);
        SetSampleConfigRsp setSampleConfigRsp = new SetSampleConfigRsp();
        while (this.mUploadFailCount < 2) {
            setSampleConfigRsp = (SetSampleConfigRsp) oet.d().e(setSampleConfigReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(setSampleConfigReq)), SetSampleConfigRsp.class);
            if (setSampleConfigRsp != null && !HiCommonUtil.b(setSampleConfigRsp.getFailResult())) {
                getSuccessSampleConfig(list, setSampleConfigRsp);
                for (HiSampleConfig hiSampleConfig : list) {
                    SampleConfigManager.e().c(hiSampleConfig.getId(), hiSampleConfig.getModifiedTime(), 1);
                }
                ReleaseLogUtil.d(TAG, "uploadSampleConfig failed ! resultCode is ", setSampleConfigRsp.getResultCode(), ", resultDesc is ", setSampleConfigRsp.getResultDesc());
                this.mUploadFailCount++;
            } else if (!lih.e(setSampleConfigRsp, false)) {
                this.mUploadFailCount++;
            } else {
                for (HiSampleConfig hiSampleConfig2 : list) {
                    SampleConfigManager.e().c(hiSampleConfig2.getId(), hiSampleConfig2.getModifiedTime(), 1);
                }
                ReleaseLogUtil.d(TAG, "uploadSampleConfig OK ! size = ", Integer.valueOf(listLocalSampleConfigToCloud.size()));
                return setSampleConfigRsp.getTimestamp();
            }
        }
        ReleaseLogUtil.d(TAG, "uploadSampleConfig failed ! size = ", Integer.valueOf(listLocalSampleConfigToCloud.size()));
        return setSampleConfigRsp.getTimestamp();
    }

    private void getSuccessSampleConfig(List<HiSampleConfig> list, SetSampleConfigRsp setSampleConfigRsp) {
        Iterator<HiSampleConfig> it = list.iterator();
        while (it.hasNext()) {
            HiSampleConfig next = it.next();
            for (CloudSampleConfig cloudSampleConfig : setSampleConfigRsp.getFailResult()) {
                if (cloudSampleConfig.getType().equals(next.getType()) && cloudSampleConfig.getConfigId().equals(next.getConfigId()) && cloudSampleConfig.getScopeApp().equals(next.getScopeApp()) && cloudSampleConfig.getScopeDeviceType().equals(next.getScopeDeviceType())) {
                    it.remove();
                }
            }
        }
    }

    private List<CloudSampleConfig> localSampleConfigToCloud(List<HiSampleConfig> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiSampleConfig hiSampleConfig : list) {
            if (hiSampleConfig != null) {
                if (TextUtils.isEmpty(hiSampleConfig.getConfigData())) {
                    ReleaseLogUtil.e(TAG, "invalid id:", hiSampleConfig.getConfigId(), ", data is empty");
                    SampleConfigManager.e().c(hiSampleConfig.getId(), hiSampleConfig.getModifiedTime(), 3);
                } else if (TextUtils.isEmpty(hiSampleConfig.getConfigId()) || !hiSampleConfig.getConfigId().startsWith(hiSampleConfig.getType())) {
                    ReleaseLogUtil.e(TAG, "invalid id:", hiSampleConfig.getConfigId(), ", type:", hiSampleConfig.getType());
                    SampleConfigManager.e().c(hiSampleConfig.getId(), hiSampleConfig.getModifiedTime(), 3);
                } else {
                    kym kymVarJ = kwt.b().j(hiSampleConfig.getClientId());
                    if (kymVarJ == null) {
                        ReleaseLogUtil.d(TAG, "HealthContext is null, clientId is ", Integer.valueOf(hiSampleConfig.getClientId()));
                    } else {
                        arrayList.add(new CloudSampleConfig.Builder().type(hiSampleConfig.getType()).configId(hiSampleConfig.getConfigId()).scopeApp(hiSampleConfig.getScopeApp()).scopeDeviceType(hiSampleConfig.getScopeDeviceType()).configData(hiSampleConfig.getConfigData()).configDescription(hiSampleConfig.getConfigDescription()).metaData(hiSampleConfig.getMetaData()).deviceCode(kymVarJ.e()).modifyTime(hiSampleConfig.getModifiedTime()).build());
                    }
                }
            }
        }
        return arrayList;
    }

    private void deleteSampleConfig() throws lif, IllegalArgumentException {
        List<Integer> listB = kwt.b().b(this.mMainUserId);
        if (HiCommonUtil.b(listB)) {
            LogUtil.j(TAG, "no clientIDs get , who is ", Integer.valueOf(this.mMainUserId));
            return;
        }
        while (this.mUploadFailCount < 2) {
            List<HiSampleConfig> listE = SampleConfigManager.e().e(listB, null, 2, 10);
            if (HiCommonUtil.b(listE)) {
                return;
            }
            ReleaseLogUtil.d(TAG, "deleteSampleConfig getDeleteSampleConfigList size = ", Integer.valueOf(listE.size()));
            deleteSampleConfigOnce(listB, listE);
        }
        this.mUploadFailCount = 0;
    }

    private void deleteSampleConfigOnce(List<Integer> list, List<HiSampleConfig> list2) throws lif {
        ArrayList arrayList = new ArrayList(list2.size());
        for (HiSampleConfig hiSampleConfig : list2) {
            if (hiSampleConfig != null) {
                arrayList.add(new HiSampleConfigKey.Builder().e(hiSampleConfig.getType()).a(hiSampleConfig.getConfigId()).d(hiSampleConfig.getScopeApp()).c(hiSampleConfig.getScopeDeviceType()).d());
            }
        }
        if (HiCommonUtil.b(arrayList)) {
            ReleaseLogUtil.e(TAG, "deleteSampleConfigKeyList is empty");
            return;
        }
        DeleteSampleConfigReq deleteSampleConfigReq = new DeleteSampleConfigReq();
        deleteSampleConfigReq.setDeleteSampleConfigKeyList(arrayList);
        while (this.mUploadFailCount < 2) {
            DeleteSampleConfigRsp deleteSampleConfigRsp = (DeleteSampleConfigRsp) oet.d().e(deleteSampleConfigReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(deleteSampleConfigReq)), DeleteSampleConfigRsp.class);
            if (deleteSampleConfigRsp != null && deleteSampleConfigRsp.getResultCode().intValue() != 0) {
                if (!HiCommonUtil.b(deleteSampleConfigRsp.getFailResult())) {
                    arrayList.removeAll(deleteSampleConfigRsp.getFailResult());
                }
                ReleaseLogUtil.d(TAG, "DeleteSampleConfig failed ! resultCode is ", deleteSampleConfigRsp.getResultCode(), ", resultDesc", deleteSampleConfigRsp.getResultDesc());
                this.mUploadFailCount++;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SampleConfigManager.e().c(list, (HiSampleConfigKey) it.next(), 2);
                }
            } else if (!lih.e(deleteSampleConfigRsp, false)) {
                this.mUploadFailCount++;
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    SampleConfigManager.e().c(list, (HiSampleConfigKey) it2.next(), 2);
                }
                ReleaseLogUtil.d(TAG, "deleteSampleConfig OK ! ");
                return;
            }
        }
        ReleaseLogUtil.e(TAG, "deleteSampleConfig failed !");
        this.mUploadFailCount++;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
