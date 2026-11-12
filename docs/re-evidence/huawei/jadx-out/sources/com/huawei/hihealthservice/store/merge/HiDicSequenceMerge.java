package com.huawei.hihealthservice.store.merge;

import android.content.Context;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import com.huawei.hihealth.dictionary.model.HiHealthDictMergeMode;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kws;
import defpackage.kwt;
import defpackage.kwy;
import defpackage.ljn;
import defpackage.ljt;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HiDicSequenceMerge implements HiMergeCommon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kws f12550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12551c;
    private String d;
    private String f;
    private String g;
    private int h;
    private HiHealthDictManager i;
    private boolean j;
    private static HashMap<Integer, Integer> e = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, Integer> f12549a = new HashMap<>();

    public HiDicSequenceMerge(Context context) {
        this.f12551c = context;
        this.f12550b = kws.e(context);
        this.i = HiHealthDictManager.a(context);
    }

    private boolean c(HiHealthData hiHealthData, int i) {
        hiHealthData.setType(hiHealthData.getType() - hiHealthData.getSubType());
        List<HiHealthData> listE = this.f12550b.e(Arrays.asList(Integer.valueOf(i)), hiHealthData.getStartTime(), hiHealthData.getType());
        if (CollectionUtils.a(listE)) {
            return this.f12550b.a(hiHealthData, i, hiHealthData.getMergedStatus()) > 0;
        }
        if (listE.size() != 1) {
            LogUtil.e("Debug_HiDicSequenceMerge", "expected single data, but multiple");
            return false;
        }
        long modifiedTime = listE.get(0).getModifiedTime();
        long modifiedTime2 = hiHealthData.getModifiedTime();
        if (modifiedTime2 >= modifiedTime) {
            return this.f12550b.a(hiHealthData, i, hiHealthData.getMergedStatus()) > 0;
        }
        ReleaseLogUtil.d("Debug_HiDicSequenceMerge", "modifiedTime is small, type = ", Integer.valueOf(hiHealthData.getType()), " time = ", Long.valueOf(modifiedTime2), ", timeDb = ", Long.valueOf(modifiedTime));
        return true;
    }

    @Override // com.huawei.hihealthservice.store.merge.HiMergeCommon
    public boolean merge(final HiHealthData hiHealthData, int i, List<Integer> list) {
        List<HiHealthData> listE;
        boolean zC;
        long jA;
        this.h = hiHealthData.getType();
        this.j = hiHealthData.getMergedStatus() == 999;
        HiHealthDictType hiHealthDictTypeA = this.i.a(hiHealthData.getType());
        if (hiHealthDictTypeA == null) {
            ReleaseLogUtil.e("Debug_HiDicSequenceMerge", "HiHealthDictField is null, type is ", Integer.valueOf(hiHealthData.getType()));
            return false;
        }
        HiHealthDictMergeMode hiHealthDictMergeModeF = hiHealthDictTypeA.f();
        if (hiHealthDictMergeModeF == null) {
            ReleaseLogUtil.e("Debug_HiDicSequenceMerge", "mergeMode is null, type is ", Integer.valueOf(hiHealthData.getType()));
            return false;
        }
        String strC = hiHealthDictMergeModeF.c();
        this.g = strC;
        if (HealthDataMergePolicy.NONE.equals(strC)) {
            return c(hiHealthData, i);
        }
        if (HealthDataMergePolicy.SOURCE_PRIORITY.equals(this.g)) {
            int[] iArrD = hiHealthDictMergeModeF.d();
            for (int i2 = 0; i2 < iArrD.length; i2++) {
                e.put(Integer.valueOf(iArrD[i2]), Integer.valueOf(iArrD.length - i2));
            }
            this.f = hiHealthDictMergeModeF.e();
        }
        if (HealthDataMergePolicy.CATEGORY_PRIORITY.equals(this.g)) {
            String[] strArrB = hiHealthDictMergeModeF.b();
            for (int i3 = 0; i3 < strArrB.length; i3++) {
                f12549a.put(strArrB[i3], Integer.valueOf(strArrB.length - i3));
            }
            this.f = hiHealthDictMergeModeF.e();
        }
        if ("MAX".equals(this.g) || "MIN".equals(this.g)) {
            this.d = hiHealthDictMergeModeF.a();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiHealthData.setType(this.h - hiHealthData.getSubType());
        if (hiHealthData.getType() == DicDataTypeUtil.DataType.SLEEP_DETAILS.value()) {
            listE = this.f12550b.c(hiHealthData.getStartTime(), hiHealthData.getType(), list);
        } else if (hiHealthData.getSubType() == 0) {
            listE = this.f12550b.b(list, hiHealthData.getStartTime(), hiHealthData.getEndTime(), hiHealthData.getType());
        } else {
            listE = this.f12550b.e(list, hiHealthData.getStartTime(), hiHealthData.getType());
        }
        if (HiCommonUtil.b(listE)) {
            if (hiHealthData.getSyncStatus() == 2) {
                return true;
            }
            if (this.j) {
                jA = this.f12550b.a(hiHealthData, i, 0);
            } else {
                jA = this.f12550b.a(hiHealthData, i, hiHealthData.getMergedStatus());
            }
            HandlerCenter.a().d(new Runnable() { // from class: lgi
                @Override // java.lang.Runnable
                public final void run() {
                    lfp.c().process(hiHealthData);
                }
            }, 1000L);
            LogUtil.a("Debug_HiDicSequenceMerge", "sequenceDataMerge insertSequenceData changeResult =  ", Long.valueOf(jA));
            hiHealthData.setType(this.h);
            return jA > 0;
        }
        if (e(hiHealthData, i, listE)) {
            hiHealthData.setType(this.h);
            return true;
        }
        if (HealthDataMergePolicy.SOURCE_PRIORITY.equals(this.g) || HealthDataMergePolicy.CATEGORY_PRIORITY.equals(this.g)) {
            for (HiHealthData hiHealthData2 : listE) {
                HiDeviceInfo hiDeviceInfoB = kwy.b(this.f12551c).b(kwt.b().c(hiHealthData2.getClientId()));
                if (hiDeviceInfoB == null) {
                    ReleaseLogUtil.e("Debug_HiDicSequenceMerge", "deviceInfo is null");
                    return false;
                }
                hiHealthData2.setDeviceUuid(hiDeviceInfoB.getDeviceUniqueCode());
            }
        }
        c(listE);
        if (this.j) {
            zC = b(i, listE);
        } else {
            zC = c(i, listE);
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                kwt.b().k(it.next().intValue());
            }
        }
        hiHealthData.setType(this.h);
        LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge use time is ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    private boolean c(int i, List<HiHealthData> list) {
        boolean zE;
        int size = list.size();
        boolean z = true;
        for (int i2 = 1; i2 < size; i2++) {
            HiHealthData hiHealthData = list.get(i2);
            if (hiHealthData.getMergedStatus() == 0) {
                hiHealthData.setSyncStatus(0);
            }
            if (hiHealthData.getClientId() == i) {
                boolean zE2 = this.f12550b.e(hiHealthData, i, 1);
                LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Boolean.valueOf(zE2));
                if (!zE2) {
                    z = false;
                }
            } else {
                long jB = this.f12550b.b(hiHealthData, 1);
                LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Long.valueOf(jB));
                if (jB <= 0) {
                    z = false;
                }
            }
        }
        HiHealthData hiHealthData2 = list.get(0);
        if (hiHealthData2.getMergedStatus() == 1) {
            hiHealthData2.setSyncStatus(0);
        }
        if (hiHealthData2.getClientId() == i) {
            zE = this.f12550b.e(hiHealthData2, i, 0);
            LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData maxData merge isSuccess =  ", Boolean.valueOf(z));
        } else {
            long jD = this.f12550b.d(hiHealthData2, hiHealthData2.getClientId(), 0);
            LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge updateSequenceDataMerge maxData changeResult =  ", Long.valueOf(jD));
            zE = jD > 0;
        }
        return z && zE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    private boolean b(int i, List<HiHealthData> list) {
        boolean zE;
        int size = list.size();
        boolean z = true;
        for (int i2 = 1; i2 < size; i2++) {
            HiHealthData hiHealthData = list.get(i2);
            if (hiHealthData.getClientId() == i) {
                boolean zE2 = this.f12550b.e(hiHealthData, i, 1);
                LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Boolean.valueOf(zE2));
                if (!zE2) {
                    z = false;
                }
            } else {
                long jB = this.f12550b.b(hiHealthData, 1);
                LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData merge status change ", Long.valueOf(jB));
                if (jB <= 0) {
                    z = false;
                }
            }
        }
        HiHealthData hiHealthData2 = list.get(0);
        if (hiHealthData2.getClientId() == i) {
            zE = this.f12550b.e(hiHealthData2, i, 0);
            LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge insertOrUpdateSequenceData maxData merge isSuccess =  ", Boolean.valueOf(z));
        } else {
            long jD = this.f12550b.d(hiHealthData2, hiHealthData2.getClientId(), 0);
            LogUtil.d("Debug_HiDicSequenceMerge", "sequenceDataMerge updateSequenceDataMerge maxData changeResult =  ", Long.valueOf(jD));
            zE = jD > 0;
        }
        return z && zE;
    }

    private boolean e(HiHealthData hiHealthData, int i, List<HiHealthData> list) {
        for (HiHealthData hiHealthData2 : list) {
            if (ljt.c(hiHealthData2.getClientId(), i) && hiHealthData.getSyncStatus() != 2) {
                if (hiHealthData.getType() == DicDataTypeUtil.DataType.SLEEP_DETAILS.value()) {
                    if (hiHealthData2.getEndTime() > hiHealthData.getEndTime()) {
                        LogUtil.a("HiH_HiDicSequenceMerge", "SLEEP_DETAILS time small");
                        return true;
                    }
                    if (hiHealthData2.getEndTime() < hiHealthData.getEndTime()) {
                        this.f12550b.d(hiHealthData2.getDataId(), 2, 2);
                    } else {
                        LogUtil.a("HiH_HiDicSequenceMerge", "SLEEP_DETAILS same time");
                    }
                }
                if (hiHealthData2.getStartTime() == hiHealthData.getStartTime() && hiHealthData2.getEndTime() == hiHealthData.getEndTime() && hiHealthData2.getInt("merged") == 0) {
                    if (hiHealthData2.getModifiedTime() > hiHealthData.getModifiedTime()) {
                        LogUtil.e("HiH_HiDicSequenceMerge", "old modifiedTime bigger than new data, does not merge!");
                        return true;
                    }
                    if (hiHealthData2.getMetaData() != null && hiHealthData2.getMetaData().equals(hiHealthData.getMetaData()) && hiHealthData2.getSimpleData() != null && hiHealthData2.getSimpleData().equals(hiHealthData.getSimpleData())) {
                        LogUtil.e("HiH_HiDicSequenceMerge", "same sequence data, does not merge!");
                        return true;
                    }
                    try {
                        if (hiHealthData.getSubType() != 0 && a(hiHealthData, hiHealthData2)) {
                            return true;
                        }
                    } catch (JSONException e2) {
                        ReleaseLogUtil.e("HiH_HiDicSequenceMerge", "mergeSequenceData JSONException!, e is ", e2.getMessage());
                        return false;
                    }
                }
                if (hiHealthData2.getInt("merged") != 2) {
                    if (this.j) {
                        hiHealthData2.putInt("merged", 0);
                    } else {
                        hiHealthData2.putInt("merged", hiHealthData.getMergedStatus());
                    }
                }
                hiHealthData2.setSequenceData(hiHealthData.getSequenceData());
                hiHealthData2.setMetaData(hiHealthData.getMetaData());
                hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
                hiHealthData2.setSimpleData(hiHealthData.getSimpleData());
                hiHealthData2.setModifiedTime(hiHealthData.getModifiedTime());
                hiHealthData2.setEndTime(hiHealthData.getEndTime());
                return false;
            }
        }
        if (hiHealthData.getSyncStatus() == 2) {
            return false;
        }
        LogUtil.a("HiH_HiDicSequenceMerge", "mergeSequenceData is new data");
        hiHealthData.setClientId(i);
        if (this.j) {
            hiHealthData.putInt("merged", 0);
        } else {
            hiHealthData.putInt("merged", hiHealthData.getMergedStatus());
        }
        hiHealthData.setModifiedTime(System.currentTimeMillis());
        list.add(hiHealthData);
        return false;
    }

    private boolean a(HiHealthData hiHealthData, HiHealthData hiHealthData2) throws JSONException {
        if (hiHealthData2.getType() == 30001) {
            JSONObject jSONObject = new JSONObject(hiHealthData2.getMetaData());
            JSONObject jSONObject2 = new JSONObject(hiHealthData.getMetaData());
            JSONObject jSONObject3 = new JSONObject(hiHealthData2.getMetaData());
            int iC = CommonUtil.c(jSONObject, "mDuplicated");
            int iC2 = CommonUtil.c(jSONObject2, "mDuplicated");
            if (iC == iC2) {
                return false;
            }
            jSONObject.put("mDuplicated", iC2);
            if (HiJsonUtil.d(jSONObject).equals(HiJsonUtil.d(jSONObject2)) && CommonUtil.c(jSONObject3, "mDuplicated") == 1) {
                LogUtil.e("HiH_HiDicSequenceMerge", "meta data only duplicate diff, does not merge!");
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    private void c(List<HiHealthData> list) {
        byte b2;
        Comparator bVar;
        String str = this.g;
        str.hashCode();
        switch (str) {
            case "CATEGORY_PRIORITY":
                b2 = 0;
                break;
            case "MAX":
                b2 = 1;
                break;
            case "MIN":
                b2 = 2;
                break;
            case "NEW":
                b2 = 3;
                break;
            case "OLD":
                b2 = 4;
                break;
            case "SOURCE_PRIORITY":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            bVar = new ljn.b(f12549a, this.f);
        } else if (b2 == 1) {
            bVar = new ljn.j(this.d);
        } else if (b2 == 2) {
            bVar = new ljn.m(this.d);
        } else if (b2 == 3) {
            bVar = new ljn.i();
        } else {
            if (b2 == 4) {
                return;
            }
            if (b2 == 5) {
                bVar = new ljn.c(e, this.f);
            } else {
                LogUtil.j("Debug_HiDicSequenceMerge", "This mergePolicy is not supported! mergePolicy is ", this.g);
                return;
            }
        }
        Collections.sort(list, bVar);
    }
}
