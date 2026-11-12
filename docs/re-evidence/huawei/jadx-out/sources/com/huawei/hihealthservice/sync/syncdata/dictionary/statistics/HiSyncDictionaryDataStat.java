package com.huawei.hihealthservice.sync.syncdata.dictionary.statistics;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.type.HealthSyncCategory;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictStat;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.dataswitch.HealthStatisticsSwitch;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kul;
import defpackage.kwt;
import defpackage.kxk;
import defpackage.lfz;
import defpackage.lgp;
import defpackage.lhp;
import defpackage.lif;
import defpackage.lih;
import defpackage.liq;
import defpackage.lis;
import defpackage.lqo;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiSyncDictionaryDataStat implements HiSyncBase {
    private static final String TAG = "HiH_HiSyncDicDaStat";
    private Context mContext;
    private HealthStatisticsSwitch mConverter;
    private int mMainUserId;
    private HealthDataCloudFactory mParamsFactory;
    private HiSyncOption mSyncOption;
    private int mUpLoadFailCount = 0;
    private int mUploadCount = 0;
    private kxk mSyncTypeManager = kxk.c();
    private Set<Integer> mDownloadedTypes = new HashSet();
    private kwt mDataClientManager = kwt.b();
    private boolean mIsOverSea = liq.f();

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    public HiSyncDictionaryDataStat(Context context, HiSyncOption hiSyncOption, int i) {
        this.mContext = context;
        this.mSyncOption = hiSyncOption;
        this.mMainUserId = i;
        this.mParamsFactory = lqo.b(context).b();
        this.mConverter = new HealthStatisticsSwitch(this.mContext);
        List<Integer> arrayList = new ArrayList<>(1);
        if (HiHealthDictManager.a(this.mContext).a(this.mSyncOption.getSyncDataType()) != null) {
            arrayList.add(Integer.valueOf(this.mSyncOption.getSyncDataType()));
        } else {
            arrayList = HiHealthDictManager.a(this.mContext).d();
        }
        if (njy.e(arrayList)) {
            ReleaseLogUtil.e(TAG, "allTypes is empty!");
            return;
        }
        for (Integer num : arrayList) {
            int iIntValue = num.intValue();
            if (iIntValue != DicDataTypeUtil.DataType.ACTIVE_HOUR.value() && iIntValue != DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()) {
                HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(this.mContext).a(iIntValue);
                if (hiHealthDictTypeA == null) {
                    ReleaseLogUtil.e(TAG, "dictTp=null,tPId=", num);
                } else if (hiHealthDictTypeA.c() == 0) {
                    this.mDownloadedTypes.add(num);
                }
            }
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws lif {
        ReleaseLogUtil.d(TAG, "pullDataByVersion() begin!");
        lis.b(1.0d, "SYNC_DICT_STAT_DOWNLOAD_PERCENT_MAX");
        if (this.mDownloadedTypes.isEmpty()) {
            ReleaseLogUtil.d(TAG, "mDownloadedTypes is empty pullDataByVersion() end");
            lis.c(this.mContext);
            return;
        }
        List<SyncKey> listA = lhp.b(this.mContext).a(new ArrayList(this.mDownloadedTypes));
        if (HiCommonUtil.b(listA)) {
            ReleaseLogUtil.e(TAG, "dictionary stat not exist in cloud");
            lis.c(this.mContext);
        } else {
            downloadStatByVersion(listA);
            lis.c(this.mContext);
            ReleaseLogUtil.d(TAG, "pullDataByVersion() end!");
        }
    }

    private void downloadStatByVersion(List<SyncKey> list) throws lif {
        long j;
        ReleaseLogUtil.d(TAG, "downloadStatByVersion syncKeys: ", HiJsonUtil.d(list));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zH = liq.h();
        for (SyncKey syncKey : list) {
            Long version = syncKey.getVersion();
            long jLongValue = version.longValue();
            int iIntValue = syncKey.getType().intValue();
            long currentVersion = getCurrentVersion(iIntValue, zH, jCurrentTimeMillis);
            if (currentVersion < jLongValue) {
                HealthStatisticsDownloadByVersionReq healthStatisticsDownloadByVersionReqBuild = new HealthStatisticsDownloadByVersionReq.Builder().dataSource(2).types(iIntValue).version(currentVersion).dataType(2).build();
                int i = 0;
                while (true) {
                    LogUtil.a(TAG, "downloadStat cur = ", Long.valueOf(currentVersion), " max = ", version);
                    long jDownOneTypeDataOnce = downOneTypeDataOnce(healthStatisticsDownloadByVersionReqBuild);
                    int i2 = i + 1;
                    if (jDownOneTypeDataOnce <= -1) {
                        j = jCurrentTimeMillis;
                        break;
                    }
                    j = jCurrentTimeMillis;
                    HealthStatisticsDownloadByVersionReq healthStatisticsDownloadByVersionReq = healthStatisticsDownloadByVersionReqBuild;
                    if (!this.mSyncTypeManager.e(this.mMainUserId, iIntValue, jDownOneTypeDataOnce, 0L, HealthSyncCategory.SyncCategory.STAT.getValue())) {
                        LogUtil.j(TAG, "downloadStat saveVersionToDB failed ");
                        break;
                    }
                    currentVersion = jDownOneTypeDataOnce;
                    healthStatisticsDownloadByVersionReq.setVersion(currentVersion);
                    if (zH) {
                        i = i2;
                    } else if (i >= 20) {
                        i = i2;
                        ReleaseLogUtil.e(TAG, "downloadStat too many times");
                        break;
                    }
                    i = i2;
                    if (currentVersion >= jLongValue) {
                        break;
                    }
                    healthStatisticsDownloadByVersionReqBuild = healthStatisticsDownloadByVersionReq;
                    jCurrentTimeMillis = j;
                }
                jCurrentTimeMillis = j;
            }
        }
        lis.c(this.mContext);
        ReleaseLogUtil.d(TAG, "downloadStatByVersion() end!");
    }

    private long getCurrentVersion(int i, boolean z, long j) {
        kul kulVarA = this.mSyncTypeManager.a(this.mMainUserId, 0L, i, HealthSyncCategory.SyncCategory.STAT.getValue());
        if (kulVarA != null) {
            return kulVarA.h();
        }
        if (z) {
            return 0L;
        }
        return HiDateUtil.d(j, TimeZone.getDefault(), -10);
    }

    private long downOneTypeDataOnce(HealthStatisticsDownloadByVersionReq healthStatisticsDownloadByVersionReq) throws lif {
        HealthStatisticsDownloadByVersionRsp healthStatisticsDownloadByVersionRsp = (HealthStatisticsDownloadByVersionRsp) oet.d().e(healthStatisticsDownloadByVersionReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(healthStatisticsDownloadByVersionReq)), HealthStatisticsDownloadByVersionRsp.class);
        if (!lih.e(healthStatisticsDownloadByVersionRsp, false) || healthStatisticsDownloadByVersionRsp.getCurrentVersion() <= healthStatisticsDownloadByVersionReq.getVersion()) {
            return -1L;
        }
        saveHealthStatistics(healthStatisticsDownloadByVersionRsp.getData());
        return healthStatisticsDownloadByVersionRsp.getCurrentVersion();
    }

    private void saveHealthStatistics(Map<String, List<HealthStatistics>> map) {
        for (Map.Entry<String, List<HealthStatistics>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (HiHealthDictManager.a(this.mContext).a(CommonUtil.j(key)) == null) {
                ReleaseLogUtil.e(TAG, key, " is not exist in dictionary configure file");
            } else {
                List<HealthStatistics> value = entry.getValue();
                if (njy.e(value)) {
                    ReleaseLogUtil.e(TAG, key, " no value");
                } else {
                    ReleaseLogUtil.d(TAG, "result code = ", Integer.valueOf(lfz.d(this.mContext).transferHealthStatData(this.mConverter.c(CommonUtil.j(key), value, this.mMainUserId))));
                }
            }
        }
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        ReleaseLogUtil.d(TAG, "pushData begin");
        if (!lgp.m()) {
            ReleaseLogUtil.e(TAG, "dataPrivacy switch is closed ,can not pushData right now ,push end!");
            return;
        }
        int iG = this.mDataClientManager.g(this.mMainUserId);
        if (iG <= 0) {
            ReleaseLogUtil.e(TAG, "no statClient get, maybe no data need to push ,push end !");
            return;
        }
        List<Integer> arrayList = new ArrayList<>(1);
        if (HiHealthDictManager.a(this.mContext).a(this.mSyncOption.getSyncDataType()) != null) {
            arrayList.add(Integer.valueOf(this.mSyncOption.getSyncDataType()));
        } else {
            arrayList = HiHealthDictManager.a(this.mContext).d();
        }
        if (njy.e(arrayList)) {
            ReleaseLogUtil.e(TAG, "no dictionary stat data need to push ,push end !");
            return;
        }
        for (Integer num : arrayList) {
            int iIntValue = num.intValue();
            if (iIntValue != DicDataTypeUtil.DataType.ACTIVE_HOUR.value() && iIntValue != DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()) {
                HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(this.mContext).a(iIntValue);
                if (hiHealthDictTypeA == null) {
                    ReleaseLogUtil.e(TAG, "dictTp=null,tpId=", num);
                } else if (hiHealthDictTypeA.c() != 1 && hiHealthDictTypeA.c() != 3) {
                    List<String> listO = HiHealthDictManager.a(this.mContext).o(iIntValue);
                    if (HiCommonUtil.b(listO)) {
                        ReleaseLogUtil.e(TAG, "tpId=", num, " no statDt");
                    } else {
                        ArrayList arrayList2 = new ArrayList(listO.size());
                        ArrayList arrayList3 = new ArrayList(listO.size());
                        Iterator<String> it = listO.iterator();
                        while (it.hasNext()) {
                            int iC = HiHealthDictManager.a(this.mContext).c(iIntValue, it.next(), 0);
                            if (iC != 0) {
                                arrayList2.add(Integer.valueOf(iC));
                                if (HiHealthDictManager.a(this.mContext).l(iC)) {
                                    arrayList3.add(Integer.valueOf(iC));
                                }
                            }
                        }
                        int i = this.mIsOverSea;
                        int[] iArr = {50, i};
                        int[] iArrC = i != 0 ? CommonUtil.c((List<Integer>) arrayList3) : CommonUtil.c((List<Integer>) arrayList2);
                        String[] statFieldNameByStatType = this.mIsOverSea ? getStatFieldNameByStatType(arrayList3) : getStatFieldNameByStatType(arrayList2);
                        while (this.mUpLoadFailCount < 2) {
                            List<HiHealthData> listA = liq.a(this.mContext, iG, iArrC, statFieldNameByStatType, iArr);
                            if (njy.e(listA)) {
                                ReleaseLogUtil.e(TAG, "noNeed statData push");
                                break;
                            } else if (uploadHealthStatistics(listA, iArrC, iIntValue)) {
                                liq.e(this.mContext, listA, iArrC, iG);
                            }
                        }
                        this.mUpLoadFailCount = 0;
                    }
                }
            }
        }
        ReleaseLogUtil.d(TAG, "pushData end");
    }

    private boolean uploadHealthStatistics(List<HiHealthData> list, int[] iArr, int i) throws lif {
        if (!this.mIsOverSea) {
            int i2 = this.mUploadCount + 1;
            this.mUploadCount = i2;
            liq.c(i2, this.mSyncOption.getSyncManual());
        } else {
            int i3 = this.mUploadCount + 1;
            this.mUploadCount = i3;
            if (i3 > 3) {
                this.mUpLoadFailCount += 2;
                return false;
            }
        }
        Map<String, List<HealthStatistics>> mapD = this.mConverter.d(list, iArr);
        if (mapD.isEmpty()) {
            this.mUpLoadFailCount++;
            return false;
        }
        HealthStatisticsUploadReq healthStatisticsUploadReq = new HealthStatisticsUploadReq(mapD, list.get(0).getTimeZone());
        while (true) {
            if (this.mUpLoadFailCount >= 2) {
                ReleaseLogUtil.d(TAG, "upload failed! uploadCount: ", Integer.valueOf(this.mUploadCount), " types: ", Arrays.toString(iArr));
                LogUtil.d(TAG, "stat is ", CommonUtil.ao() ? HiJsonUtil.d(mapD) : null);
                return false;
            }
            HealthStatisticsUploadRsp healthStatisticsUploadRsp = (HealthStatisticsUploadRsp) oet.d().e(healthStatisticsUploadReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(this.mParamsFactory.getBody(healthStatisticsUploadReq)), HealthStatisticsUploadRsp.class);
            if (!lih.e(healthStatisticsUploadRsp, false)) {
                this.mUpLoadFailCount++;
            } else {
                if (!this.mSyncTypeManager.e(this.mMainUserId, i, healthStatisticsUploadRsp.getVersion(), 0L, HealthSyncCategory.SyncCategory.STAT.getValue())) {
                    ReleaseLogUtil.e(TAG, "uploadStat saveVersionToDB failed!");
                }
                ReleaseLogUtil.d(TAG, "upload success! uploadCount: ", Integer.valueOf(this.mUploadCount), " types: ", Arrays.toString(iArr));
                LogUtil.d(TAG, "stat is ", CommonUtil.ao() ? HiJsonUtil.d(mapD) : null);
                return true;
            }
        }
    }

    private String[] getStatFieldNameByStatType(List<Integer> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            HiHealthDictStat hiHealthDictStatB = HiHealthDictManager.a(this.mContext).b(it.next().intValue());
            if (hiHealthDictStatB != null) {
                arrayList.add(hiHealthDictStatB.a());
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return strArr;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
