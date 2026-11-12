package com.huawei.hihealthservice.store.interfaces;

import com.huawei.hihealth.HiHealthData;
import defpackage.kuk;
import defpackage.kym;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IDataInsert {
    int bulkSaveDetailHiHealthData(List<HiHealthData> list, kym kymVar, int i);

    void doAsyncHealthDataStat();

    void doRealTimeHealthDataStat();

    void doRealTimeHealthDataStat(boolean z);

    void onDestroy();

    void prepareAsyncHealthDataStat(List<HiHealthData> list);

    void prepareRealTimeHealthDataStat(List<HiHealthData> list);

    void prepareRealTimeHealthDataStat(List<HiHealthData> list, boolean z);

    boolean saveOneSyncHealthDetailData(HiHealthData hiHealthData, int i, List<Integer> list);

    int saveSyncHealthDetailData(List<HiHealthData> list, int i);

    int transferHealthDetailData(List<HiHealthData> list, int i);

    int transferHealthStatData(List<kuk> list);
}
