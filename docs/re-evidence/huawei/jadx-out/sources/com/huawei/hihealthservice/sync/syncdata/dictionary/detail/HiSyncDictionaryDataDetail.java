package com.huawei.hihealthservice.sync.syncdata.dictionary.detail;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.type.HealthSyncCategory;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.store.merge.HiDicSequenceMerge;
import com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch;
import com.huawei.hihealthservice.sync.dataswitch.MotionPathDataSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.BaseMetaData;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByVersionReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestRsp;
import com.huawei.hwcloudmodel.healthdatacloud.model.SampleSequence;
import com.huawei.hwcloudmodel.model.unite.AddHealthDataRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kul;
import defpackage.kws;
import defpackage.kwt;
import defpackage.kxk;
import defpackage.kyj;
import defpackage.kym;
import defpackage.lfz;
import defpackage.lgp;
import defpackage.lgq;
import defpackage.lhp;
import defpackage.lif;
import defpackage.lih;
import defpackage.lij;
import defpackage.liq;
import defpackage.lir;
import defpackage.lis;
import defpackage.liz;
import defpackage.ljq;
import defpackage.lju;
import defpackage.lke;
import defpackage.lqo;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HiSyncDictionaryDataDetail implements HiSyncBase {
    private static final String TAG = "HiH_HiSyncDictData";
    private static final List<Integer> UN_CLOUD_TYPE = Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.MERGED_RUN.value()), Integer.valueOf(DicDataTypeUtil.DataType.MERGED_BIKE.value()));
    List<kul> localVersions;
    private Context mContext;
    private long mCurrentVersion;
    private kws mDataSequenceManager;
    private HealthDataSwitch mHealthDataSwitch;
    private lfz mHiHealthDataInsertStore;
    private lqo mHwCloudMgr;
    private int mMainUserId;
    private MotionPathDataSwitch mMotionPathDataSwitch;
    private lgq mMotionPathDataSwitchHelper;
    private HealthDataCloudFactory mParamsFactory;
    private HiSyncOption mSyncOption;
    List<Integer> mSyncTypes;
    private lhp mSyncVersionMgr;
    private int mUploadFailCount = 0;
    private int mUploadTotalCount = 0;
    private kxk mSyncAnchorMgr = kxk.c();

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    public HiSyncDictionaryDataDetail(Context context, HiSyncOption hiSyncOption, int i) {
        this.mContext = context;
        this.mSyncOption = hiSyncOption;
        this.mMainUserId = i;
        lqo lqoVarB = lqo.b(context);
        this.mHwCloudMgr = lqoVarB;
        this.mParamsFactory = lqoVarB.b();
        this.mSyncVersionMgr = lhp.b(this.mContext);
        this.mHiHealthDataInsertStore = lfz.d(this.mContext);
        this.mHealthDataSwitch = new HealthDataSwitch(this.mContext);
        this.mMotionPathDataSwitch = new MotionPathDataSwitch(this.mContext);
        this.mMotionPathDataSwitchHelper = lgq.c(context);
        this.mDataSequenceManager = kws.e(this.mContext);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d(TAG, "pullDataByVersion begin");
        lis.b(20.0d, "SYNC_DICTIONARY_DATA_DOWNLOAD_PERCENT_MAX");
        this.mSyncTypes = new ArrayList(1);
        if (HiHealthDictManager.a(this.mContext).a(this.mSyncOption.getSyncDataType()) != null) {
            this.mSyncTypes.add(Integer.valueOf(this.mSyncOption.getSyncDataType()));
        } else if (this.mSyncOption.getSyncDataType() == DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value()) {
            this.mSyncTypes = Collections.singletonList(Integer.valueOf(this.mSyncOption.getSyncDataType()));
        } else {
            this.mSyncTypes = HiHealthDictManager.a(this.mContext).a();
        }
        LogUtil.d(TAG, "dictionary health types = ", this.mSyncTypes);
        List<SyncKey> listB = this.mSyncVersionMgr.b(this.mSyncTypes);
        this.localVersions = this.mSyncAnchorMgr.e(this.mMainUserId, 0L, this.mSyncTypes, new int[]{HealthSyncCategory.SyncCategory.POINT.getValue(), HealthSyncCategory.SyncCategory.SEQUENCE.getValue()});
        if (HiCommonUtil.b(listB)) {
            ReleaseLogUtil.e(TAG, "dictionary data not exist in cloud");
            return;
        }
        ReleaseLogUtil.d(TAG, "pullDataByVersion syncKeys: ", HiJsonUtil.d(listB));
        double size = 1.0d / ((double) listB.size());
        for (SyncKey syncKey : listB) {
            lis.b(this.mContext, 1.0d, size, 20.0d);
            if (syncKey.getType().intValue() == 30001 || syncKey.getType().intValue() == DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value()) {
                downloadSequenceDataByType(syncKey);
            } else if (!liq.f(this.mContext, this.mMainUserId) && syncKey.getType().intValue() == DicDataTypeUtil.DataType.ALTITUDE_TYPE_SET.value()) {
                ReleaseLogUtil.e(TAG, "ALTITUDE_TYPE_SET isFirstSync");
            } else if (!liq.f(this.mContext, this.mMainUserId) && liq.e.containsKey(syncKey.getType())) {
                ReleaseLogUtil.e(TAG, "FirstSync return ", syncKey.getType());
                if (syncKey.getVersion().longValue() != 0) {
                    long jG = HiDateUtil.g(System.currentTimeMillis());
                    downloadAllStatByTime(syncKey.getType().intValue(), liq.a(liq.b(jG, liq.e.get(syncKey.getType()).d()), jG, 8));
                    if (!this.mSyncAnchorMgr.d(this.mMainUserId, syncKey.getType().intValue(), syncKey.getVersion().longValue(), 0L)) {
                        ReleaseLogUtil.e(TAG, "saveVersionToDB failed!", syncKey.getType());
                    }
                }
            } else {
                HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(this.mContext).a(syncKey.getType().intValue());
                if (hiHealthDictTypeA == null) {
                    ReleaseLogUtil.e(TAG, "dictType is null, syncKey is ", syncKey);
                } else if (hiHealthDictTypeA.c() == 0) {
                    downloadPointDataByType(syncKey);
                } else if (hiHealthDictTypeA.c() == 1) {
                    downloadSequenceDataByType(syncKey);
                } else {
                    ReleaseLogUtil.e(TAG, "category error, syncKey is ", syncKey);
                }
            }
        }
        ReleaseLogUtil.d(TAG, "pullDataByVersion end");
    }

    private void downloadSequenceDataByType(SyncKey syncKey) throws Throwable {
        LogUtil.d(TAG, "downloadSequenceDataByType key = ", syncKey);
        if (syncKey == null) {
            ReleaseLogUtil.e(TAG, "downloadSequenceDataByType syncKey is null");
            return;
        }
        int iIntValue = syncKey.getType().intValue();
        Long version = syncKey.getVersion();
        long jLongValue = version.longValue();
        if (jLongValue <= 0) {
            LogUtil.j(TAG, "downloadSequenceDataByType the maxVersion is not right , maxVersion is ", version);
            return;
        }
        kul oneSyncLocalVersion = getOneSyncLocalVersion(iIntValue);
        if (oneSyncLocalVersion == null) {
            downloadSequenceDataByVersion(new GetSampleSequenceByVersionReq.Builder().type(iIntValue).version(0L).dataType(this.mSyncOption.getSyncMethod()).build(), jLongValue);
        } else if (oneSyncLocalVersion.h() < jLongValue) {
            downloadSequenceDataByVersion(new GetSampleSequenceByVersionReq.Builder().type(iIntValue).version(oneSyncLocalVersion.h()).dataType(this.mSyncOption.getSyncMethod()).build(), jLongValue);
        } else {
            LogUtil.d(TAG, "do not need download data, DBversion is ", Long.valueOf(oneSyncLocalVersion.h()), ", maxVersion is ", version);
        }
    }

    private void downloadPointDataByType(SyncKey syncKey) throws lif {
        if (syncKey == null) {
            ReleaseLogUtil.e(TAG, "downloadPointDataByType syncKey is null");
            return;
        }
        Integer type = syncKey.getType();
        int iIntValue = type.intValue();
        Long version = syncKey.getVersion();
        long jLongValue = version.longValue();
        LogUtil.d(TAG, "downloadOneTypeDataByVersion type is ", type, ", maxVersion is ", version);
        if (jLongValue <= 0) {
            ReleaseLogUtil.e(TAG, "downloadOneTypeDataByVersion cloud has no such data, type is ", type);
            return;
        }
        GetHealthDataByVersionReq getHealthDataByVersionReq = new GetHealthDataByVersionReq();
        getHealthDataByVersionReq.setDataType(Integer.valueOf(this.mSyncOption.getSyncMethod()));
        getHealthDataByVersionReq.setType(type);
        kul oneSyncLocalVersion = getOneSyncLocalVersion(iIntValue);
        if (oneSyncLocalVersion == null) {
            LogUtil.d(TAG, " syncAnchorTable is null");
            getHealthDataByVersionReq.setVersion(0L);
            downloadPointDataByVersion(getHealthDataByVersionReq, jLongValue);
        } else if (oneSyncLocalVersion.h() < jLongValue) {
            getHealthDataByVersionReq.setVersion(oneSyncLocalVersion.h());
            downloadPointDataByVersion(getHealthDataByVersionReq, jLongValue);
        } else {
            LogUtil.d(TAG, " do not need downloadOneTypeDataByVersion data, type is ", type, ", DBversion is ", Long.valueOf(oneSyncLocalVersion.h()), ", maxVersion is ", version);
        }
    }

    private void downloadSequenceDataByVersion(GetSampleSequenceByVersionReq getSampleSequenceByVersionReq, long j) throws Throwable {
        long jDownloadSequenceDataByRequest;
        ReleaseLogUtil.d(TAG, "performDownloadByVersion req = ", getSampleSequenceByVersionReq, " maxVersion = ", Long.valueOf(j));
        this.mCurrentVersion = getSampleSequenceByVersionReq.getVersion();
        do {
            jDownloadSequenceDataByRequest = downloadSequenceDataByRequest(getSampleSequenceByVersionReq);
            ReleaseLogUtil.d(TAG, "performDownloadByVersion downCurrentVersion = ", Long.valueOf(jDownloadSequenceDataByRequest), " maxVersion = ", Long.valueOf(j));
            if (jDownloadSequenceDataByRequest <= -1) {
                return;
            }
            if (!this.mSyncAnchorMgr.d(this.mMainUserId, getSampleSequenceByVersionReq.getType(), jDownloadSequenceDataByRequest, 0L)) {
                ReleaseLogUtil.e(TAG, "performDownloadByVersion saveVersionToDB failed ");
            }
            getSampleSequenceByVersionReq = getSampleSequenceByVersionReq.toBuilder().version(this.mCurrentVersion).dataType(this.mSyncOption.getSyncMethod()).build();
        } while (jDownloadSequenceDataByRequest < j);
    }

    private void downloadPointDataByVersion(GetHealthDataByVersionReq getHealthDataByVersionReq, long j) throws lif {
        long jDownloadPointDataByRequest;
        ReleaseLogUtil.d(TAG, " downloadPointDataByVersion rep = ", getHealthDataByVersionReq, ", maxVersion = ", Long.valueOf(j));
        int i = 0;
        do {
            jDownloadPointDataByRequest = downloadPointDataByRequest(getHealthDataByVersionReq);
            LogUtil.d(TAG, " downloadPointDataByVersion downCurrentVersion is ", Long.valueOf(jDownloadPointDataByRequest), " maxVersion is ", Long.valueOf(j));
            i++;
            if (jDownloadPointDataByRequest <= -1) {
                return;
            }
            if (!this.mSyncAnchorMgr.d(this.mMainUserId, getHealthDataByVersionReq.getType().intValue(), jDownloadPointDataByRequest, 0L)) {
                ReleaseLogUtil.e(TAG, "downloadPointDataByVersion saveVersionToDB failed!");
                return;
            }
            getHealthDataByVersionReq.setVersion(jDownloadPointDataByRequest);
            if (lgp.h() && !liq.h()) {
                ReleaseLogUtil.e(TAG, " downloadPointDataByVersion() background is running");
                return;
            } else if (!liq.h() && i >= 20 && getHealthDataByVersionReq.getType().intValue() != DicDataTypeUtil.DataType.ALTITUDE_TYPE_SET.value()) {
                ReleaseLogUtil.e(TAG, " downloadPointDataByVersion() pullDataByVersion too many times");
                return;
            }
        } while (jDownloadPointDataByRequest < j);
    }

    private long downloadSequenceDataByRequest(GetSampleSequenceByVersionReq getSampleSequenceByVersionReq) throws Throwable {
        GetSampleSequenceByVersionRsp getSampleSequenceByVersionRsp = (GetSampleSequenceByVersionRsp) oet.d().e(getSampleSequenceByVersionReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(getSampleSequenceByVersionReq)), GetSampleSequenceByVersionRsp.class);
        if (!lih.e(getSampleSequenceByVersionRsp, false)) {
            ReleaseLogUtil.e(TAG, "downloadSequenceDataByRequest SyncError checkCloudRsp");
            return -1L;
        }
        long currentVersion = getSampleSequenceByVersionRsp.getCurrentVersion();
        long j = this.mCurrentVersion;
        if (currentVersion <= j) {
            ReleaseLogUtil.e(TAG, "downloadSequenceDataByRequest downloadVersion is ", Long.valueOf(currentVersion), " smaller than currentVersion ", Long.valueOf(j));
            return -1L;
        }
        List<BaseMetaData> deleteInfos = getSampleSequenceByVersionRsp.getDeleteInfos();
        if (!HiCommonUtil.b(deleteInfos) && !liq.h()) {
            deleteSequences(deleteInfos);
        }
        List<SampleSequence> detailInfos = getSampleSequenceByVersionRsp.getDetailInfos();
        if (HiCommonUtil.b(detailInfos)) {
            ReleaseLogUtil.e(TAG, "downloadSequenceDataByRequest cloudTracks is null or empty");
            this.mCurrentVersion = currentVersion;
            return currentVersion;
        }
        this.mCurrentVersion = currentVersion;
        saveSequenceData(detailInfos, false);
        return currentVersion;
    }

    private void deleteSequences(List<BaseMetaData> list) throws Throwable {
        boolean zB;
        Context context;
        int i;
        ArrayList arrayList = new ArrayList(10);
        for (BaseMetaData baseMetaData : list) {
            ReleaseLogUtil.e(TAG, "deleteSequence ", baseMetaData.toString());
            List<Integer> listC = kwt.b().c(this.mContext, Long.valueOf(baseMetaData.getDeviceCode()), this.mMainUserId);
            if (HiCommonUtil.b(listC)) {
                ReleaseLogUtil.e(TAG, "deleteSequence clientId error");
            } else {
                int[] iArr = {30001};
                List<HiHealthData> listB = this.mDataSequenceManager.b(baseMetaData.getStartTime(), baseMetaData.getEndTime(), iArr[0], listC, lke.b(baseMetaData.getSubType()));
                if (listB == null || listB.isEmpty()) {
                    ReleaseLogUtil.e(TAG, "deleteSequence not found");
                } else {
                    HiHealthData hiHealthData = listB.get(0);
                    try {
                        zB = !ljq.h(this.mContext, iArr[0]) ? ljq.b(this.mContext, iArr[0]) : false;
                        try {
                            try {
                                int iC = this.mDataSequenceManager.c(hiHealthData);
                                if (iC <= 0) {
                                    ReleaseLogUtil.e(TAG, "deleteSequences() fail");
                                } else {
                                    hiHealthData.setUserId(this.mMainUserId);
                                    hiHealthData.setSyncStatus(2);
                                    hiHealthData.setType(hiHealthData.getType() + hiHealthData.getSubType());
                                    arrayList.add(hiHealthData);
                                }
                                if (zB && iC > 0) {
                                    ljq.g(this.mContext, iArr[0]);
                                }
                                if (zB) {
                                    context = this.mContext;
                                    i = iArr[0];
                                    ljq.c(context, i);
                                }
                            } catch (Exception e) {
                                e = e;
                                ReleaseLogUtil.a(TAG, "deleteSequences Exception ", LogAnonymous.b(e));
                                if (zB) {
                                    context = this.mContext;
                                    i = iArr[0];
                                    ljq.c(context, i);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (zB) {
                                ljq.c(this.mContext, iArr[0]);
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zB = false;
                    } catch (Throwable th2) {
                        th = th2;
                        zB = false;
                    }
                }
            }
        }
        deleteAndDoMerge(arrayList, kwt.b().b(this.mMainUserId));
        prepareAndDoHealthDataStat(arrayList);
    }

    private void deleteAndDoMerge(List<HiHealthData> list, List<Integer> list2) {
        HiDicSequenceMerge hiDicSequenceMerge = new HiDicSequenceMerge(this.mContext);
        if (HiCommonUtil.b(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            hiDicSequenceMerge.merge(hiHealthData, hiHealthData.getClientId(), list2);
        }
    }

    private void prepareAndDoHealthDataStat(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return;
        }
        lfz lfzVarD = lfz.d(this.mContext);
        lfzVarD.prepareRealTimeHealthDataStat(list);
        lfzVarD.doRealTimeHealthDataStat();
    }

    private long downloadPointDataByRequest(GetHealthDataByVersionReq getHealthDataByVersionReq) throws lif {
        GetHealthDataByVersionRsp getHealthDataByVersionRspB = this.mHwCloudMgr.b(getHealthDataByVersionReq);
        if (!lih.e(getHealthDataByVersionRspB, false)) {
            ReleaseLogUtil.e(TAG, "downOneTypeDataOnce() SyncError checkCloudRsp");
            return -1L;
        }
        long currentVersion = getHealthDataByVersionRspB.getCurrentVersion();
        if (currentVersion <= getHealthDataByVersionReq.getVersion()) {
            ReleaseLogUtil.e(TAG, "downloadPointDataByRequest downloadVersion is ", Long.valueOf(currentVersion), " smaller than currentVersion ", Long.valueOf(getHealthDataByVersionReq.getVersion()));
            return -1L;
        }
        List<HealthDetail> detailInfos = getHealthDataByVersionRspB.getDetailInfos();
        if (HiCommonUtil.b(detailInfos)) {
            ReleaseLogUtil.e(TAG, " downOneTypeDataOnce() detailInfos is null or empty");
            return currentVersion;
        }
        if (!savePointData(detailInfos, getHealthDataByVersionReq.getType().intValue(), getHealthDataByVersionReq.getVersion())) {
            return -1L;
        }
        liz.a().d(getHealthDataByVersionReq.getType().intValue(), new kym(this.mContext.getPackageName()));
        return currentVersion;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[PHI: r7
      0x00bd: PHI (r7v3 int) = (r7v2 int), (r7v9 int) binds: [B:36:0x00bb, B:27:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102  */
    private void saveSequenceData(List<SampleSequence> list, boolean z) throws Throwable {
        boolean zB;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<HiHealthData> listE = this.mMotionPathDataSwitch.e(list, this.mMainUserId, z);
        if (HiCommonUtil.b(listE)) {
            ReleaseLogUtil.d(TAG, "saveSequenceData hiHealthDatas is empty");
            return;
        }
        boolean z2 = false;
        int type = listE.get(0).getType();
        ReleaseLogUtil.d(TAG, "local sequences data type is ", Integer.valueOf(type), ", size is ", Integer.valueOf(listE.size()));
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), type) ? ljq.b(BaseApplication.b(), type) : false;
                try {
                    try {
                        List<Integer> listC = kyj.c().c(this.mMainUserId);
                        if (HiCommonUtil.b(listC)) {
                            ReleaseLogUtil.a(TAG, "clients is null or empty!");
                            if (zB) {
                                ljq.c(BaseApplication.b(), type);
                                return;
                            }
                            return;
                        }
                        i = 0;
                        for (int i2 = 0; i2 < listE.size(); i2++) {
                            try {
                                if (this.mHiHealthDataInsertStore.saveOneSyncHealthDetailData(listE.get(i2), this.mMainUserId, listC)) {
                                    i++;
                                }
                                liq.d(i2, BaseApplication.h());
                            } catch (Exception unused) {
                                ReleaseLogUtil.e(TAG, "saveSequenceData Exception");
                                if (zB) {
                                    ljq.c(BaseApplication.b(), type);
                                }
                            }
                        }
                        if (zB) {
                            ljq.g(BaseApplication.b(), type);
                        }
                        if (zB) {
                            ljq.c(BaseApplication.b(), type);
                        }
                        if (i == listE.size()) {
                            liz.a().a(type, "sync download", new kym(this.mContext.getPackageName()));
                        }
                        this.mHiHealthDataInsertStore.prepareRealTimeHealthDataStat(listE);
                        this.mHiHealthDataInsertStore.doRealTimeHealthDataStat();
                        LogUtil.a(TAG, "saveData end saveDetailTime =  ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    } catch (Exception unused2) {
                        i = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (zB) {
                        ljq.c(BaseApplication.b(), type);
                    }
                    throw th;
                }
            } catch (Exception unused3) {
                zB = false;
                i = 0;
            } catch (Throwable th2) {
                th = th2;
                zB = z2;
                if (zB) {
                    ljq.c(BaseApplication.b(), type);
                }
                throw th;
            }
            ReleaseLogUtil.e(TAG, "saveSequenceData Exception");
            if (zB) {
                ljq.c(BaseApplication.b(), type);
            }
            if (i == listE.size()) {
                liz.a().a(type, "sync download", new kym(this.mContext.getPackageName()));
            }
            this.mHiHealthDataInsertStore.prepareRealTimeHealthDataStat(listE);
            this.mHiHealthDataInsertStore.doRealTimeHealthDataStat();
            LogUtil.a(TAG, "saveData end saveDetailTime =  ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th3) {
            th = th3;
            z2 = zB;
            zB = z2;
            if (zB) {
                ljq.c(BaseApplication.b(), type);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    private boolean savePointData(List<HealthDetail> list, int i, long j) throws Throwable {
        boolean zB;
        LogUtil.d(TAG, " saveData()");
        Collections.sort(list, lir.b());
        List<HiHealthData> listA = this.mHealthDataSwitch.a(list, this.mMainUserId, j);
        if (HiCommonUtil.b(listA)) {
            ReleaseLogUtil.e(TAG, "local data empty");
            return true;
        }
        boolean z = false;
        int type = listA.get(0).getType();
        ReleaseLogUtil.d(TAG, "local point data type is ", Integer.valueOf(type), ", size is ", Integer.valueOf(listA.size()));
        try {
            zB = !ljq.h(this.mContext, type) ? ljq.b(this.mContext, type) : false;
            try {
                try {
                    savePointDataDb(listA, i);
                    if (zB) {
                        ljq.g(this.mContext, type);
                    }
                    if (zB) {
                        ljq.c(this.mContext, type);
                    }
                } catch (Exception unused) {
                    ReleaseLogUtil.a(TAG, "savePointData Exception");
                    if (zB) {
                        ljq.c(this.mContext, type);
                    }
                }
            } catch (Throwable th) {
                th = th;
                z = zB;
                if (z) {
                    ljq.c(this.mContext, type);
                }
                throw th;
            }
        } catch (Exception unused2) {
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (z) {
                ljq.c(this.mContext, type);
            }
            throw th;
        }
        return true;
    }

    private void savePointDataDb(List<HiHealthData> list, int i) {
        this.mHiHealthDataInsertStore.saveSyncHealthDetailData(list, this.mMainUserId);
        if (HiHealthDictManager.a(this.mContext).n(i)) {
            this.mHiHealthDataInsertStore.prepareRealTimeHealthDataStat(list);
            this.mHiHealthDataInsertStore.doRealTimeHealthDataStat();
        }
    }

    private void downloadAllStatByTime(int i, SparseArray<Integer> sparseArray) throws lif {
        if (sparseArray == null || sparseArray.size() <= 0) {
            ReleaseLogUtil.e(TAG, "downloadAllStatByTime() downloadDaysMap is null, stop pullDataByVersion!");
            return;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            int iKeyAt = sparseArray.keyAt(size);
            downloadByTime(i, HiDateUtil.a(iKeyAt), HiDateUtil.a(sparseArray.get(iKeyAt).intValue()) + 86400000);
        }
    }

    public void downloadByTime(int i, long j, long j2) throws lif {
        if (j > j2 || j <= 0) {
            ReleaseLogUtil.e(TAG, "downloadByTime the time is not right");
            return;
        }
        ReleaseLogUtil.d(TAG, "downloadByTime is ", Integer.valueOf(i), ",", Long.valueOf(j), " ,", Long.valueOf(j2));
        GetHealthDataByTimeReq getHealthDataByTimeReqInitByTimeRep = initByTimeRep(i, j, j2);
        GetHealthDataByTimeRsp getHealthDataByTimeRspA = this.mHwCloudMgr.a(getHealthDataByTimeReqInitByTimeRep);
        if (!lih.e(getHealthDataByTimeRspA, false)) {
            ReleaseLogUtil.e(TAG, "pullDataByTime error");
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataByTimeRspA.getDetailInfos();
        if (detailInfos == null || detailInfos.isEmpty()) {
            ReleaseLogUtil.e(TAG, "pullDataByTime data error");
        } else {
            if (savePointData(detailInfos, getHealthDataByTimeReqInitByTimeRep.getType().intValue(), 0L)) {
                return;
            }
            ReleaseLogUtil.e(TAG, "pullDataByTime save data error");
        }
    }

    private GetHealthDataByTimeReq initByTimeRep(int i, long j, long j2) {
        GetHealthDataByTimeReq getHealthDataByTimeReq = new GetHealthDataByTimeReq();
        getHealthDataByTimeReq.setQueryType(2);
        getHealthDataByTimeReq.setDataType(2);
        getHealthDataByTimeReq.setStartTime(Long.valueOf(j));
        getHealthDataByTimeReq.setEndTime(Long.valueOf(j2));
        getHealthDataByTimeReq.setType(Integer.valueOf(i));
        return getHealthDataByTimeReq;
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif, IllegalArgumentException {
        ReleaseLogUtil.d(TAG, "pushData begin");
        if (!lgp.m()) {
            ReleaseLogUtil.e(TAG, "dataPrivacy switch is closed, push end");
            return;
        }
        List<Integer> listB = kwt.b().b(this.mMainUserId);
        this.mSyncTypes = new ArrayList(1);
        if (HiHealthDictManager.a(this.mContext).a(this.mSyncOption.getSyncDataType()) != null) {
            this.mSyncTypes.add(Integer.valueOf(this.mSyncOption.getSyncDataType()));
        } else {
            this.mSyncTypes = HiHealthDictManager.a(this.mContext).d();
        }
        if (HiCommonUtil.b(listB)) {
            ReleaseLogUtil.d(TAG, "no need upload data");
            if (this.mSyncTypes.size() == 1) {
                lij.a(this.mContext, this.mMainUserId, this.mSyncTypes.get(0).intValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(this.mSyncTypes.size());
        ArrayList arrayList2 = new ArrayList(this.mSyncTypes.size());
        for (Integer num : this.mSyncTypes) {
            HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(this.mContext).a(num.intValue());
            if (hiHealthDictTypeA == null) {
                ReleaseLogUtil.e(TAG, "dictType=null,typeId=", num);
            } else if (hiHealthDictTypeA.c() == 1) {
                arrayList2.add(num);
            } else if (hiHealthDictTypeA.c() == 0) {
                arrayList.add(num);
            } else {
                ReleaseLogUtil.e(TAG, "typeId needn't syncCloud,typeId=", num);
            }
        }
        uploadSampleSequenceData(listB, arrayList2);
        uploadSamplePointData(listB, arrayList);
        ReleaseLogUtil.d(TAG, "pushData end");
    }

    private void uploadSampleSequenceData(List<Integer> list, List<Integer> list2) throws lif {
        List<Integer> listB = kws.e(this.mContext).b();
        if (HiCommonUtil.b(listB)) {
            return;
        }
        listB.retainAll(list);
        ReleaseLogUtil.d(TAG, "uploadSampleSequenceData clientIds=", HiJsonUtil.d(listB));
        if (HiCommonUtil.b(listB)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size());
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (Integer num : list2) {
            HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(this.mContext).a(num.intValue());
            if (hiHealthDictTypeA != null) {
                if (hiHealthDictTypeA.i() == 0) {
                    arrayList.add(num);
                } else {
                    arrayList2.add(Integer.valueOf(hiHealthDictTypeA.i()));
                }
            }
        }
        List<Integer> listB2 = kwt.b().b(this.mMainUserId);
        boolean z = false;
        if (!HiCommonUtil.b(arrayList) && !HiCommonUtil.b(kws.e(this.mContext).d(listB2, CommonUtil.c((List<Integer>) arrayList), new int[]{0}, 2, 1))) {
            z = true;
        }
        boolean z2 = (HiCommonUtil.b(arrayList2) || z || HiCommonUtil.b(kws.e(this.mContext).d(listB2, new int[]{30001}, CommonUtil.c((List<Integer>) arrayList2), 2, 1))) ? z : true;
        for (Integer num2 : list2) {
            int iIntValue = num2.intValue();
            if (UN_CLOUD_TYPE.contains(num2)) {
                LogUtil.a(TAG, "needn't syncCloud, typeId: ", num2);
            } else {
                if (z2) {
                    lij.a(this.mContext, this.mMainUserId, iIntValue);
                }
                Iterator<Integer> it = listB.iterator();
                while (it.hasNext()) {
                    uploadSequenceData(it.next().intValue(), iIntValue);
                }
            }
        }
    }

    private void uploadSamplePointData(List<Integer> list, List<Integer> list2) throws lif {
        LogUtil.a(TAG, "uploadSamplePointData clientIds=", HiJsonUtil.d(list));
        if (list2.size() > 1) {
            list2 = liq.b("type_id", 0);
            if (HiCommonUtil.b(list2)) {
                return;
            }
        }
        List<Integer> listB = liq.b("client_id", 0);
        if (HiCommonUtil.b(listB)) {
            return;
        }
        LogUtil.a(TAG, "uploadSamplePointData syncClients=", HiJsonUtil.d(listB));
        listB.retainAll(list);
        if (HiCommonUtil.b(listB)) {
            return;
        }
        ReleaseLogUtil.d(TAG, "uploadSamplePointData retainAll ", HiJsonUtil.d(listB));
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            List<HiHealthDictField> listH = HiHealthDictManager.a(this.mContext).h(iIntValue);
            ArrayList arrayList = new ArrayList(listH.size());
            ArrayList arrayList2 = new ArrayList(listH.size());
            for (HiHealthDictField hiHealthDictField : listH) {
                arrayList.add(Integer.valueOf(hiHealthDictField.e()));
                if (hiHealthDictField.h()) {
                    arrayList2.add(Integer.valueOf(hiHealthDictField.e()));
                }
            }
            Iterator<Integer> it2 = listB.iterator();
            while (it2.hasNext()) {
                uploadPointData(it2.next().intValue(), arrayList, iIntValue, arrayList2);
            }
        }
    }

    private void uploadSequenceData(int i, int i2) throws lif, IllegalArgumentException {
        List<HiHealthData> listD;
        int iE = lju.e();
        while (this.mUploadFailCount < 2) {
            HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(this.mContext).a(i2);
            if (hiHealthDictTypeA == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i));
            if (hiHealthDictTypeA.i() == 0) {
                listD = this.mDataSequenceManager.d(arrayList, new int[]{i2}, new int[]{0}, 0, lju.c(iE, 10));
            } else {
                listD = this.mDataSequenceManager.d(arrayList, new int[]{i2 >= DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value() ? DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value() : 30001}, new int[]{hiHealthDictTypeA.i()}, 0, lju.c(iE, 5));
            }
            if (HiCommonUtil.b(listD)) {
                break;
            }
            kul kulVarA = this.mSyncAnchorMgr.a(this.mMainUserId, 0L, i2);
            this.localVersions = Collections.singletonList(kulVarA);
            if (!uploadSequenceDataOnce(listD, kulVarA != null ? kulVarA.h() : 0L)) {
                break;
            }
        }
        this.mUploadFailCount = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r20.mUploadFailCount >= 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r0 = java.lang.System.currentTimeMillis();
        r1 = defpackage.ljq.a(r20.mContext, r23).c(r21, r24, health.compact.a.HiDateUtil.p(r0), health.compact.a.HiDateUtil.g(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (health.compact.a.HiCommonUtil.b(r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        com.huawei.hwlogsmodel.LogUtil.d(com.huawei.hihealthservice.sync.syncdata.dictionary.detail.HiSyncDictionaryDataDetail.TAG, "no oversea data to upload", java.lang.Integer.valueOf(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r5 = addHealthData(r1, r21, r23, true, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r5 != (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        r20.mUploadFailCount = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void uploadPointData(int i, List<Integer> list, int i2, List<Integer> list2) throws lif, IllegalArgumentException {
        kul kulVarA = this.mSyncAnchorMgr.a(this.mMainUserId, 0L, i2);
        this.localVersions = Collections.singletonList(kulVarA);
        long jH = kulVarA != null ? kulVarA.h() : 0L;
        while (this.mUploadFailCount < 2) {
            List<HiHealthData> uploadDataList = getUploadDataList(i2, list, i, (200 / list.size()) * list.size());
            if (HiCommonUtil.b(uploadDataList)) {
                LogUtil.a(TAG, "no china data to upload ", Integer.valueOf(i2), " clientId ", Integer.valueOf(i));
                break;
            }
            jH = addHealthData(uploadDataList, i, i2, false, jH);
            liq.a(500);
            if (jH == -1) {
                return;
            }
        }
    }

    private List<HiHealthData> getUploadDataList(int i, List<Integer> list, int i2, int i3) {
        List<HiHealthData> listC = ljq.a(this.mContext, i).c(i2, list, i3);
        if (HiCommonUtil.b(listC)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(listC.size());
        for (HiHealthData hiHealthData : listC) {
            String str = hiHealthData.getStartTime() + "_" + hiHealthData.getEndTime();
            if (!arrayList2.contains(str)) {
                List<HiHealthData> listE = ljq.a(this.mContext, i).e(i2, list, hiHealthData.getStartTime(), hiHealthData.getEndTime());
                if (!HiCommonUtil.b(listE)) {
                    arrayList.addAll(listE);
                }
                arrayList2.add(str);
            }
        }
        return arrayList;
    }

    private void uploadSequenceDone(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int iB = 0;
        for (HiHealthData hiHealthData : list) {
            HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(BaseApplication.b()).a(hiHealthData.getType() + hiHealthData.getSubType());
            if (hiHealthDictTypeA != null && hiHealthDictTypeA.b() != -1) {
                deleteTemporaryData(hiHealthData, hiHealthDictTypeA.b());
            } else {
                long dataId = hiHealthData.getDataId();
                long j = hiHealthData.getLong("modified_time");
                if (this.mDataSequenceManager.a(dataId, j)) {
                    iB = this.mDataSequenceManager.b(dataId, j);
                }
                long startTime = hiHealthData.getStartTime();
                ReleaseLogUtil.d(TAG, "uploadSequenceDone sID=", Long.valueOf(dataId), " trackTm=", Long.valueOf(startTime), " mdfdTm=", HiDateUtil.l(j), " update res=", Integer.valueOf(iB));
            }
        }
    }

    private void deleteTemporaryData(HiHealthData hiHealthData, int i) {
        if (i != 0) {
            ReleaseLogUtil.a(TAG, "Not supported delaySecondToDelete is ", Integer.valueOf(i));
        } else {
            ReleaseLogUtil.d(TAG, "delete type:", Integer.valueOf(hiHealthData.getType()), ", subTypeId:", Integer.valueOf(hiHealthData.getSubType()), " ,st: ", Long.valueOf(hiHealthData.getStartTime()), ", et: ", Long.valueOf(hiHealthData.getEndTime()));
            ReleaseLogUtil.d(TAG, "End to delete, result: ", Boolean.valueOf(this.mDataSequenceManager.c(hiHealthData) > 0));
        }
    }

    private void updateDataSyncStatus(List<HiHealthData> list, int i) {
        for (HiHealthData hiHealthData : list) {
            ljq.a(this.mContext, i).b(hiHealthData.getDataId(), hiHealthData.getModifiedTime(), 1);
            hiHealthData.setUserId(this.mMainUserId);
            hiHealthData.setSyncStatus(1);
        }
        this.mHiHealthDataInsertStore.prepareRealTimeHealthDataStat(list, false);
        this.mHiHealthDataInsertStore.doRealTimeHealthDataStat(false);
    }

    private boolean uploadSequenceDataOnce(List<HiHealthData> list, long j) throws Throwable {
        if (!liq.f()) {
            int i = this.mUploadTotalCount + 1;
            this.mUploadTotalCount = i;
            liq.c(i, this.mSyncOption.getSyncManual());
        } else {
            int i2 = this.mUploadTotalCount + 1;
            this.mUploadTotalCount = i2;
            if (i2 > 10) {
                this.mUploadFailCount += 2;
                ReleaseLogUtil.e(TAG, "uploadSequenceDataOnce uploadTotalCount");
                return false;
            }
        }
        List<SampleSequence> listB = this.mMotionPathDataSwitchHelper.b(list);
        if (HiCommonUtil.b(listB)) {
            ReleaseLogUtil.e(TAG, "uploadTrackDataOnce cloudTrack is null or empty ");
            return false;
        }
        AddSampleSequenceReq addSampleSequenceReq = new AddSampleSequenceReq(listB);
        addSampleSequenceReq.setLocalMaxVersion(Long.valueOf(j));
        while (this.mUploadFailCount < 2) {
            AddSampleSequenceRsp addSampleSequenceRsp = (AddSampleSequenceRsp) oet.d().e(addSampleSequenceReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(addSampleSequenceReq)), AddSampleSequenceRsp.class);
            if (addSampleSequenceRsp != null && addSampleSequenceRsp.getResultCode().intValue() == 1001) {
                ParamValidDetail paramValidDetail = addSampleSequenceRsp.getParamValidDetail();
                liq.d(addSampleSequenceRsp, paramValidDetail);
                if (paramValidDetail == null) {
                    this.mUploadFailCount++;
                } else {
                    liq.a(list, paramValidDetail, (Map<Long, List<Long>>) null);
                    uploadSequenceDone(list);
                    sequenceDownloadMore(addSampleSequenceReq, addSampleSequenceRsp, list.get(0).getType());
                    ReleaseLogUtil.d(TAG, "uploadSequenceDataOnce failed ! resultCode is ", addSampleSequenceRsp.getResultCode(), ", resultDesc is ", addSampleSequenceRsp.getResultDesc());
                    return true;
                }
            } else if (!lih.e(addSampleSequenceRsp, false)) {
                this.mUploadFailCount++;
            } else {
                uploadSequenceDone(list);
                sequenceDownloadMore(addSampleSequenceReq, addSampleSequenceRsp, list.get(0).getType());
                ReleaseLogUtil.d(TAG, "uploadSequenceDataOnce OK ! uploadCount is ", Integer.valueOf(this.mUploadTotalCount), ", date size = ", Integer.valueOf(list.size()), ",type,", Integer.valueOf(list.get(0).getType()));
                return true;
            }
        }
        ReleaseLogUtil.d(TAG, "uploadSequenceDataOnce failed ! uploadCount is ", Integer.valueOf(this.mUploadTotalCount), ", date size = ", Integer.valueOf(list.size()), ",type,", Integer.valueOf(list.get(0).getType()));
        return false;
    }

    private void sequenceDownloadMore(AddSampleSequenceReq addSampleSequenceReq, AddSampleSequenceRsp addSampleSequenceRsp, int i) throws Throwable {
        ReleaseLogUtil.d(TAG, "sequence LocalMaxVersion=", addSampleSequenceReq.getLocalMaxVersion(), ",rsp=", Long.valueOf(addSampleSequenceRsp.getTimestamp()), ",isHasMore=", Boolean.valueOf(addSampleSequenceRsp.isHasMore()), ",cloudTp=", Integer.valueOf(i));
        if (addSampleSequenceRsp.isHasMore()) {
            SyncKey syncKey = new SyncKey();
            syncKey.setType(Integer.valueOf(i));
            syncKey.setVersion(Long.valueOf(addSampleSequenceRsp.getTimestamp()));
            syncKey.setDeviceCode(0L);
            downloadSequenceDataByType(syncKey);
            return;
        }
        if (this.mSyncAnchorMgr.d(this.mMainUserId, i, addSampleSequenceRsp.getTimestamp(), 0L)) {
            return;
        }
        ReleaseLogUtil.e(TAG, "sequence downloadMore saveVersionToDB failed!");
    }

    private long addHealthData(List<HiHealthData> list, int i, int i2, boolean z, long j) throws lif, IllegalArgumentException {
        if (z || !liq.f()) {
            int i3 = this.mUploadTotalCount + 1;
            this.mUploadTotalCount = i3;
            liq.c(i3, this.mSyncOption.getSyncManual());
        } else {
            int i4 = this.mUploadTotalCount + 1;
            this.mUploadTotalCount = i4;
            if (i4 > 5) {
                ReleaseLogUtil.d(TAG, "isOverSea mUploadTotalCount too much");
                this.mUploadFailCount += 2;
                return -1L;
            }
        }
        HashMap map = new HashMap();
        List<HealthDetail> listB = this.mHealthDataSwitch.b(list, i, i2, map);
        AddHealthDataReq addHealthDataReq = new AddHealthDataReq();
        addHealthDataReq.setTimeZone(list.get(0).getTimeZone());
        addHealthDataReq.setDetailInfo(listB);
        addHealthDataReq.setLocalMaxVersion(Long.valueOf(j));
        while (true) {
            int i5 = this.mUploadFailCount;
            if (i5 < 2) {
                AddHealthDataRsp addHealthDataRspB = this.mHwCloudMgr.b(addHealthDataReq);
                if (addHealthDataRspB != null && addHealthDataRspB.getResultCode().intValue() == 1001) {
                    ParamValidDetail paramValidDetail = addHealthDataRspB.getParamValidDetail();
                    liq.d(addHealthDataRspB, paramValidDetail);
                    if (paramValidDetail == null) {
                        this.mUploadFailCount++;
                    } else {
                        liq.a(list, paramValidDetail, map);
                        updateDataSyncStatus(list, i2);
                        pointDownloadMore(addHealthDataReq, addHealthDataRspB, i2);
                        ReleaseLogUtil.e(TAG, "addDataToCloud failed ! resultCode is ", addHealthDataRspB.getResultCode(), ", resultDesc is ", addHealthDataRspB.getResultDesc());
                        return addHealthDataRspB.getTimestamp().longValue();
                    }
                } else if (!lih.e(addHealthDataRspB, false)) {
                    this.mUploadFailCount++;
                } else {
                    ReleaseLogUtil.d(TAG, "addDataToCloud OK! uploadCount=", Integer.valueOf(this.mUploadFailCount), " tp=", Integer.valueOf(i2), ",dtsz=", Integer.valueOf(list.size()), " cId=", Integer.valueOf(i));
                    updateDataSyncStatus(list, i2);
                    pointDownloadMore(addHealthDataReq, addHealthDataRspB, i2);
                    return addHealthDataRspB.getTimestamp().longValue();
                }
            } else {
                ReleaseLogUtil.d(TAG, "addDataToCloud failed! uploadCount", Integer.valueOf(i5), " tp=", Integer.valueOf(i2), ", date sz=", Integer.valueOf(list.size()), " clientId ", Integer.valueOf(i));
                return -1L;
            }
        }
    }

    private void pointDownloadMore(AddHealthDataReq addHealthDataReq, AddHealthDataRsp addHealthDataRsp, int i) throws lif {
        ReleaseLogUtil.d(TAG, "point LocalMaxVersion=", addHealthDataReq.getLocalMaxVersion(), ",rsp=", addHealthDataRsp.getTimestamp(), ",isHasMore=", Boolean.valueOf(addHealthDataRsp.isHasMore()), ",cloudTp=", Integer.valueOf(i));
        if (addHealthDataRsp.isHasMore()) {
            SyncKey syncKey = new SyncKey();
            syncKey.setType(Integer.valueOf(i));
            syncKey.setVersion(addHealthDataRsp.getTimestamp());
            downloadPointDataByType(syncKey);
            return;
        }
        if (this.mSyncAnchorMgr.d(this.mMainUserId, i, addHealthDataRsp.getTimestamp().longValue(), 0L)) {
            return;
        }
        ReleaseLogUtil.e(TAG, "point downloadMore saveVersionToDB failed!");
    }

    public kul getOneSyncLocalVersion(int i) {
        if (HiCommonUtil.b(this.localVersions)) {
            return null;
        }
        for (kul kulVar : this.localVersions) {
            if (i == kulVar.b()) {
                return kulVar;
            }
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void downloadLatestSequenceData(int i, int i2, int i3) throws lif {
        ReleaseLogUtil.d(TAG, "downloadLatestData enter");
        GetSampleSequenceLatestReq getSampleSequenceLatestReq = new GetSampleSequenceLatestReq();
        getSampleSequenceLatestReq.setType(i3);
        getSampleSequenceLatestReq.setDataType(2);
        if (i3 == DicDataTypeUtil.DataType.SLEEP_DETAILS.value()) {
            getSampleSequenceLatestReq.setTimestamp(HiDateUtil.m(System.currentTimeMillis()) + 1);
        } else {
            getSampleSequenceLatestReq.setTimestamp(HiDateUtil.h(System.currentTimeMillis()));
        }
        if (i > 0) {
            getSampleSequenceLatestReq.setDays(i);
        }
        if (i2 > 0) {
            getSampleSequenceLatestReq.setCounts(i2);
        }
        GetSampleSequenceLatestRsp getSampleSequenceLatestRsp = (GetSampleSequenceLatestRsp) oet.d().e(getSampleSequenceLatestReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(getSampleSequenceLatestReq)), GetSampleSequenceLatestRsp.class);
        if (!lih.e(getSampleSequenceLatestRsp, false)) {
            ReleaseLogUtil.e(TAG, "downloadLatestData warning");
            return;
        }
        List<SampleSequence> detailInfos = getSampleSequenceLatestRsp.getDetailInfos();
        if (njy.e(detailInfos)) {
            ReleaseLogUtil.e(TAG, "downloadLatestData dataList is Empty");
            return;
        }
        saveSequenceData(detailInfos, true);
        if (i3 == 30001) {
            liz.a().a(4, "latestDataDownload", new kym(this.mContext.getPackageName()));
        }
    }

    public void downloadLatestPointData(int i, int i2, int i3) throws lif {
        ReleaseLogUtil.d(TAG, "downloadLatestData enter");
        GetHealthDataLatestReq getHealthDataLatestReq = new GetHealthDataLatestReq();
        getHealthDataLatestReq.setType(i3);
        getHealthDataLatestReq.setDataType(2);
        getHealthDataLatestReq.setTimestamp(HiDateUtil.h(System.currentTimeMillis()));
        if (i > 0) {
            getHealthDataLatestReq.setDays(i);
        }
        if (i2 > 0) {
            getHealthDataLatestReq.setCounts(i2);
        }
        GetHealthDataLatestRsp getHealthDataLatestRspA = this.mHwCloudMgr.a(getHealthDataLatestReq);
        if (!lih.e(getHealthDataLatestRspA, false)) {
            ReleaseLogUtil.e(TAG, "downloadLatestData warning");
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataLatestRspA.getDetailInfos();
        if (njy.e(detailInfos)) {
            ReleaseLogUtil.e(TAG, "downloadLatestData dataList is Empty");
        } else {
            savePointData(detailInfos, i3, 0L);
            liz.a().a(liz.d(i3), "latestDataDownload", new kym(this.mContext.getPackageName()));
        }
    }
}
