package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.kws;
import defpackage.ljn;
import defpackage.ljt;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiDataSequenceMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kws f12544a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12545c;

    public HiDataSequenceMerge(Context context) {
        this.f12544a = kws.e(context);
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(HiHealthData hiHealthData, int i, List<Integer> list) {
        long jA;
        boolean zE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int type = hiHealthData.getType();
        if (type == 31001 && hiHealthData.getMergedStatus() != 999) {
            this.f12545c = true;
        }
        List<HiHealthData> listE = this.f12544a.e(list, hiHealthData.getStartTime(), hiHealthData.getType());
        if (listE == null || listE.isEmpty()) {
            if (hiHealthData.getSyncStatus() == 2) {
                return true;
            }
            if (this.f12545c) {
                jA = this.f12544a.a(hiHealthData, i, hiHealthData.getMergedStatus());
            } else {
                jA = this.f12544a.a(hiHealthData, i, 0);
            }
            LogUtil.a("Debug_HiDataSequenceMerge", "sequenceDataMerge insertSequenceData changeResult =  ", Long.valueOf(jA));
            return jA > 0;
        }
        if (d(hiHealthData, i, listE)) {
            return true;
        }
        if (type == 31001) {
            Collections.sort(listE, new ljn.i());
        } else {
            Collections.sort(listE, new ljn.j(BleConstants.TOTAL_DISTANCE));
        }
        if (this.f12545c) {
            zE = d(i, listE, type);
        } else {
            zE = e(i, listE, type);
        }
        LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge use time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return zE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    private boolean d(int i, List<HiHealthData> list, int i2) {
        boolean z = false;
        HiHealthData hiHealthData = list.get(0);
        int size = list.size();
        boolean z2 = true;
        for (int i3 = 1; i3 < size; i3++) {
            HiHealthData hiHealthData2 = list.get(i3);
            if (hiHealthData2.getMergedStatus() == 0) {
                hiHealthData2.setSyncStatus(0);
            }
            if (hiHealthData2.getClientId() == i) {
                boolean zE = this.f12544a.e(hiHealthData2, i, 1);
                LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Boolean.valueOf(zE));
                if (!zE) {
                    z2 = false;
                }
            } else {
                long jB = this.f12544a.b(hiHealthData2, 1);
                LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Long.valueOf(jB));
                if (jB <= 0) {
                    z2 = false;
                }
            }
        }
        if (hiHealthData.getMergedStatus() == 1) {
            hiHealthData.setSyncStatus(0);
        }
        if (hiHealthData.getClientId() == i) {
            if (z2 && this.f12544a.e(hiHealthData, i, 0)) {
                z = true;
            }
            LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData maxData merge isSuccess =  ", Boolean.valueOf(z));
            return z;
        }
        long jD = this.f12544a.d(hiHealthData, hiHealthData.getClientId(), 0);
        LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge updateSequenceDataMerge maxData changeResult =  ", Long.valueOf(jD));
        return z2 && jD > 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    private boolean e(int i, List<HiHealthData> list, int i2) {
        boolean z = false;
        HiHealthData hiHealthData = list.get(0);
        int size = list.size();
        int i3 = 1;
        int i4 = 1;
        boolean z2 = true;
        while (i4 < size) {
            HiHealthData hiHealthData2 = list.get(i4);
            if (i2 == 30001 || i2 == 30003) {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData2.getMetaData(), HiTrackMetaData.class);
                hiTrackMetaData.setDuplicated(i3);
                hiHealthData2.setMetaData(HiJsonUtil.e(hiTrackMetaData, HiTrackMetaData.class));
                hiHealthData2.setSyncStatus(0);
            }
            if (hiHealthData2.getClientId() == i) {
                boolean zE = this.f12544a.e(hiHealthData2, i, i3);
                LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Boolean.valueOf(zE));
                if (!zE) {
                    z2 = false;
                }
            } else {
                long jB = this.f12544a.b(hiHealthData2, i3);
                LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Long.valueOf(jB));
                if (jB <= 0) {
                    z2 = false;
                }
            }
            i4++;
            i3 = 1;
        }
        if (hiHealthData.getClientId() == i) {
            if (z2 && this.f12544a.e(hiHealthData, i, 0)) {
                z = true;
            }
            LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData maxData merge isSuccess =  ", Boolean.valueOf(z));
            return z;
        }
        long jD = this.f12544a.d(hiHealthData, hiHealthData.getClientId(), 0);
        LogUtil.d("Debug_HiDataSequenceMerge", "sequenceDataMerge updateSequenceDataMerge maxData changeResult =  ", Long.valueOf(jD));
        return z2 && jD > 0;
    }

    private boolean d(HiHealthData hiHealthData, int i, List<HiHealthData> list) {
        for (HiHealthData hiHealthData2 : list) {
            if (ljt.c(hiHealthData2.getClientId(), i) && hiHealthData.getSyncStatus() != 2) {
                if (hiHealthData2.getStartTime() == hiHealthData.getStartTime() && hiHealthData2.getEndTime() == hiHealthData.getEndTime()) {
                    if (hiHealthData2.getModifiedTime() > hiHealthData.getModifiedTime()) {
                        LogUtil.e("HiH_HiDataSequenceMerge", "old modifiedTime bigger than new modifiedTime,no merge");
                        return true;
                    }
                    if (hiHealthData2.getMetaData().equals(hiHealthData.getMetaData())) {
                        LogUtil.e("HiH_HiDataSequenceMerge", "same sequence data, does not merge!");
                        return true;
                    }
                    if (b(hiHealthData, hiHealthData2)) {
                        return true;
                    }
                }
                if (hiHealthData2.getInt("merged") != 2) {
                    if (this.f12545c) {
                        hiHealthData2.putInt("merged", hiHealthData.getMergedStatus());
                    } else {
                        hiHealthData2.putInt("merged", 0);
                    }
                }
                hiHealthData2.setSequenceData(hiHealthData.getSequenceData());
                hiHealthData2.setMetaData(hiHealthData.getMetaData());
                hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
                hiHealthData2.setModifiedTime(hiHealthData.getModifiedTime());
                return false;
            }
        }
        if (hiHealthData.getSyncStatus() == 2) {
            return false;
        }
        LogUtil.a("HiH_HiDataSequenceMerge", "mergeSequenceData is new data");
        hiHealthData.setClientId(i);
        if (this.f12545c) {
            hiHealthData.putInt("merged", hiHealthData.getMergedStatus());
        } else {
            hiHealthData.putInt("merged", 0);
        }
        hiHealthData.setModifiedTime(System.currentTimeMillis());
        list.add(hiHealthData);
        return false;
    }

    private boolean b(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        if (hiHealthData2.getType() != 30001) {
            return false;
        }
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData2.getMetaData(), HiTrackMetaData.class);
        HiTrackMetaData hiTrackMetaData2 = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
        HiTrackMetaData hiTrackMetaData3 = (HiTrackMetaData) HiJsonUtil.d(hiHealthData2.getMetaData(), HiTrackMetaData.class);
        if (!d(hiTrackMetaData, hiTrackMetaData2) || hiTrackMetaData3.getDuplicated() != 1) {
            return false;
        }
        LogUtil.e("HiH_HiDataSequenceMerge", "meta data only dumplicate diff, does not merge!");
        return true;
    }

    private boolean d(HiTrackMetaData hiTrackMetaData, HiTrackMetaData hiTrackMetaData2) {
        int duplicated = hiTrackMetaData.getDuplicated();
        int duplicated2 = hiTrackMetaData2.getDuplicated();
        if (duplicated == duplicated2) {
            return false;
        }
        hiTrackMetaData.setDuplicated(duplicated2);
        return HiJsonUtil.d(hiTrackMetaData).equals(HiJsonUtil.d(hiTrackMetaData2));
    }
}
