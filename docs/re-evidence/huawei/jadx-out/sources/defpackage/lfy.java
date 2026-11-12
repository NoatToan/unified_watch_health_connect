package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.util.HiFileUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.HiZipUtil;
import com.huawei.hihealthservice.store.merge.HiDataSequenceMerge;
import com.huawei.hihealthservice.store.merge.HiDicHealthDataMerge;
import com.huawei.hihealthservice.store.merge.HiDicSequenceMerge;
import com.huawei.hihealthservice.store.merge.HiHealthDataPointMerge;
import com.huawei.hihealthservice.store.stat.HiDicHealthDataStat;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiValidatorUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lfy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f40064a;
    private HiHealthDictManager d;
    private HiDataSequenceMerge e;

    private lfy() {
        this.e = new HiDataSequenceMerge(f40064a);
        this.d = HiHealthDictManager.a(f40064a);
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final lfy f40065c = new lfy();
    }

    public static lfy a(Context context) {
        if (context != null) {
            f40064a = context.getApplicationContext();
        }
        return b.f40065c;
    }

    public boolean b(HiHealthData hiHealthData, int i, List<Integer> list) {
        HiTrackMetaData hiTrackMetaData;
        String strA;
        if (hiHealthData == null || list == null) {
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHlthSaveTrk", "saveSequenceData start clientId is ", Integer.valueOf(i), " sequenceData type is ", Integer.valueOf(hiHealthData.getType()));
        int type = hiHealthData.getType();
        if (type == 30001) {
            Boolean boolA = a(hiHealthData, i);
            if (boolA != null) {
                return boolA.booleanValue();
            }
        } else if (type != 30003) {
            if (type == 31001) {
                LogUtil.a("HiH_HiHealthSaveData", "saveSequenceData DATA_SEQUENCE_ECG 1 clientId is ", Integer.valueOf(i));
                if (hiHealthData.getBoolean("is_sequence_zip")) {
                    if (hiHealthData.getBoolean("is_dividing")) {
                        kyg.c().a(hiHealthData);
                        return true;
                    }
                    LogUtil.d("HiH_HiHealthSaveData", "saveSequenceData DATA_SEQUENCE_ECG 1 end ! clientId is ", Integer.valueOf(i));
                    strA = kyg.c().d(hiHealthData);
                    hiHealthData.setType(31001);
                } else {
                    try {
                        LogUtil.d("HiH_HiHealthSaveData", "saveSequenceData DATA_SEQUENCE_ECG 2 clientId is ", Integer.valueOf(i));
                        strA = HiZipUtil.a(kyg.c().d(hiHealthData));
                    } catch (IOException e) {
                        ReleaseLogUtil.a("HiH_HiHealthSaveData", "saveSequenceData DATA_SEQUENCE_ECG compress e = ", LogAnonymous.b(e));
                        return false;
                    }
                }
                hiHealthData.setSequenceData(strA);
            } else if (HiHealthDictManager.a(f40064a).k(hiHealthData.getType())) {
                return c(hiHealthData, i, list);
            }
        } else if (!d(hiHealthData, i, 30001)) {
            return false;
        }
        if (hiHealthData.getType() == 30001 && hiHealthData.getSubType() == 0 && (hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class)) != null) {
            hiHealthData.setSubType(hiTrackMetaData.getSportType());
        }
        if (HiCommonUtil.a(hiHealthData.getSequenceData())) {
            ReleaseLogUtil.a("HiH_HiHealthSaveData", "saveSequenceData track data error");
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHealthSaveData", "saveSequenceData sequence length = ", Integer.valueOf(hiHealthData.getSequenceData().length()));
        return this.e.merge(hiHealthData, i, list);
    }

    private boolean c(HiHealthData hiHealthData, int i, List<Integer> list) {
        if (hiHealthData.getSequenceData() != null) {
            Boolean boolA = a(hiHealthData, i);
            if (boolA != null) {
                return boolA.booleanValue();
            }
        } else if (hiHealthData.getSequenceFileUrl() != null) {
            if (!d(hiHealthData, i, hiHealthData.getType())) {
                return false;
            }
        } else {
            ReleaseLogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData and getSequenceFileUrl all null");
            return false;
        }
        if (HiCommonUtil.a(hiHealthData.getSequenceData())) {
            ReleaseLogUtil.a("HiH_HiHealthSaveData", "saveSequenceData data error");
            return false;
        }
        return new HiDicSequenceMerge(f40064a).merge(hiHealthData, i, list);
    }

    private Boolean a(HiHealthData hiHealthData, int i) {
        String strA;
        LogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData DATA_SEQUENCE 1 clientId is ", Integer.valueOf(i));
        if (hiHealthData.getBoolean("is_sequence_zip")) {
            if (hiHealthData.getBoolean("is_dividing")) {
                LogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData is dividing");
                kyg.c().a(hiHealthData);
                return true;
            }
            LogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData DATA_SEQUENCE 1 end ! clientId is ", Integer.valueOf(i));
            strA = kyg.c().d(hiHealthData);
        } else {
            try {
                LogUtil.d("HiH_HiHlthSaveTrk", "saveSequenceData DATA_SEQUENCE 2 clientId is ", Integer.valueOf(i));
                strA = HiZipUtil.a(kyg.c().d(hiHealthData));
            } catch (IOException e) {
                ReleaseLogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData DATA_SEQUENCE compress e = ", LogAnonymous.b(e));
                return false;
            }
        }
        hiHealthData.setSequenceData(strA);
        return null;
    }

    private boolean d(HiHealthData hiHealthData, int i, int i2) {
        LogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData DATA_SEQUENCE_FILE clientId is ", Integer.valueOf(i));
        try {
            String strA = HiZipUtil.a(HiFileUtil.a(f40064a, hiHealthData.getSequenceFileUrl()));
            hiHealthData.setType(i2);
            hiHealthData.setSequenceData(strA);
            return true;
        } catch (IOException e) {
            ReleaseLogUtil.a("HiH_HiHlthSaveTrk", "saveSequenceData DATA_SEQUENCE_FILE compress e = ", LogAnonymous.b(e));
            return false;
        }
    }

    public boolean c(int i, HiHealthData hiHealthData, int i2, List<Integer> list, HiHealthDataPointMerge hiHealthDataPointMerge) {
        int[] iArrE = HiHealthDataType.e(i);
        HiHealthData hiHealthData2 = new HiHealthData();
        hiHealthData2.setStartTime(hiHealthData.getStartTime());
        hiHealthData2.setEndTime(hiHealthData.getEndTime());
        hiHealthData2.setMetaData(hiHealthData.getMetaData());
        hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
        int length = iArrE.length;
        int i3 = 0;
        for (int i4 : iArrE) {
            LogUtil.d("HiH_HiHealthSaveData", "saveSetData() type = ", Integer.valueOf(i), ", pointType = ", Integer.valueOf(i4));
            hiHealthData2.setType(i4);
            String strA = HiHealthDataKey.a(i4);
            double d = hiHealthData.getDouble(strA);
            if (HiValidatorUtil.b(i4, d)) {
                hiHealthData2.setValue(d);
                hiHealthData2.setPointUnit(hiHealthData.getInt(HiHealthDataKey.e(strA)));
                if (hiHealthDataPointMerge.merge(hiHealthData2, i2, list)) {
                    i3++;
                }
            } else {
                i3++;
            }
        }
        return i3 >= length;
    }

    public boolean d(HiHealthData hiHealthData, int i, List<Integer> list) {
        if (hiHealthData == null || i <= 0 || HiCommonUtil.b(list)) {
            ReleaseLogUtil.e("HiH_HiHealthSaveData", "saveDicSetData setData is null or clientId <= 0 or clients is null or empty");
            return false;
        }
        try {
            HashMap<Integer, Double> map = (HashMap) new Gson().fromJson(hiHealthData.getFieldsValue(), new TypeToken<HashMap<Integer, Double>>() { // from class: com.huawei.hihealthservice.store.HiHealthDataInsertStoreSaveData$1
            }.getType());
            HashMap<Integer, String> map2 = (HashMap) new Gson().fromJson(hiHealthData.getFieldsMetaData(), new TypeToken<HashMap<Integer, String>>() { // from class: com.huawei.hihealthservice.store.HiHealthDataInsertStoreSaveData$2
            }.getType());
            HashMap<Integer, Long> map3 = (HashMap) new Gson().fromJson(hiHealthData.getFieldsModifyTime(), new TypeToken<HashMap<Integer, Long>>() { // from class: com.huawei.hihealthservice.store.HiHealthDataInsertStoreSaveData$3
            }.getType());
            HashSet<Integer> hashSet = new HashSet(16);
            if (map != null && !map.isEmpty()) {
                hashSet.addAll(map.keySet());
            }
            if (map2 != null && !map2.isEmpty()) {
                hashSet.addAll(map2.keySet());
            }
            if (map3 != null && !map3.isEmpty()) {
                hashSet.addAll(map3.keySet());
            }
            if (hashSet.isEmpty()) {
                map = new HashMap<>(16);
                map2 = new HashMap<>(16);
                b(hiHealthData, map, map2);
                if (!map.isEmpty()) {
                    hashSet.addAll(map.keySet());
                }
                if (!map2.isEmpty()) {
                    hashSet.addAll(map2.keySet());
                }
                if (hashSet.isEmpty()) {
                    ReleaseLogUtil.e("HiH_HiHealthSaveData", "values and metaDatas all empty!");
                    return false;
                }
            }
            HashMap<Integer, Double> map4 = map;
            HashMap<Integer, String> map5 = map2;
            int i2 = 0;
            int i3 = 0;
            for (Integer num : hashSet) {
                int iIntValue = num.intValue();
                if (!lkh.c(iIntValue)) {
                    if (HiHealthDictManager.a(f40064a).c(iIntValue) == null) {
                        ReleaseLogUtil.e("HiH_HiHealthSaveData", "HiHealthDictField is null, type is ", num);
                    } else {
                        HiHealthData hiHealthDataA = a(hiHealthData, map4, map5, map3, iIntValue);
                        i2++;
                        HiDicHealthDataMerge hiDicHealthDataMerge = new HiDicHealthDataMerge(f40064a);
                        if (!hiDicHealthDataMerge.e(hiHealthDataA)) {
                            ReleaseLogUtil.e("HiH_HiHealthSaveData", "hiDicHealthDataMerge init failed!");
                            return false;
                        }
                        if (hiDicHealthDataMerge.d(hiHealthDataA, i, list)) {
                            LogUtil.d("HiH_HiHealthSaveData", "saveDicSetData typeId = ", Integer.valueOf(hiHealthData.getType()), ", healthType = ", Integer.valueOf(hiHealthDataA.getType()), ", value = ", Double.valueOf(hiHealthDataA.getValue()));
                            i3++;
                        }
                    }
                }
            }
            return i3 == i2;
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.e("HiH_HiHealthSaveData", "FromJson JsonSyntaxException is ", LogAnonymous.b(e));
            return false;
        }
    }

    private void b(HiHealthData hiHealthData, HashMap<Integer, Double> map, HashMap<Integer, String> map2) {
        for (int i : HiHealthDataType.e(hiHealthData.getType())) {
            double d = hiHealthData.getDouble(HiHealthDataKey.a(i));
            if (HiValidatorUtil.b(i, d)) {
                map.put(Integer.valueOf(i), Double.valueOf(d));
                map2.put(Integer.valueOf(i), hiHealthData.getMetaData());
            }
        }
    }

    private HiHealthData a(HiHealthData hiHealthData, HashMap<Integer, Double> map, HashMap<Integer, String> map2, HashMap<Integer, Long> map3, int i) {
        Long l;
        Double d;
        HiHealthData hiHealthData2 = new HiHealthData();
        hiHealthData2.setStartTime(hiHealthData.getStartTime());
        hiHealthData2.setEndTime(hiHealthData.getEndTime());
        hiHealthData2.setSyncStatus(hiHealthData.getSyncStatus());
        hiHealthData2.setDeviceUuid(hiHealthData.getDeviceUuid());
        hiHealthData2.setModifiedTime(hiHealthData.getModifiedTime());
        hiHealthData2.setTimeZone(hiHealthData.getTimeZone());
        if (map != null && !map.isEmpty() && map.containsKey(Integer.valueOf(i)) && (d = map.get(Integer.valueOf(i))) != null) {
            hiHealthData2.setValue(d.doubleValue());
        }
        if (map2 != null && !map2.isEmpty() && map2.containsKey(Integer.valueOf(i))) {
            hiHealthData2.setMetaData(map2.get(Integer.valueOf(i)));
        }
        if (map3 != null && !map3.isEmpty() && map3.containsKey(Integer.valueOf(i)) && (l = map3.get(Integer.valueOf(i))) != null) {
            hiHealthData2.setModifiedTime(l.longValue());
        }
        hiHealthData2.setType(i);
        return hiHealthData2;
    }

    public boolean e(HiHealthData hiHealthData, int i, int i2) {
        if (hiHealthData == null || i <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthSaveData", "saveDicStatData  statData is null or statClient <= 0");
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHealthSaveData", "saveDicStatData type =", Integer.valueOf(hiHealthData.getType()), ",time = ", Long.valueOf(hiHealthData.getStartTime()), ",statClient = ", Integer.valueOf(i), ",userId = ", Integer.valueOf(i2));
        kuk kukVar = new kuk();
        kukVar.c(hiHealthData.getStartTime());
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        HiHealthDictField hiHealthDictFieldJ = this.d.j(hiHealthData.getType());
        if (hiHealthDictFieldJ == null) {
            ReleaseLogUtil.e("HiH_HiHealthSaveData", "saveDicStatData healthDictField is null");
            return false;
        }
        kukVar.e(hiHealthDictFieldJ.e());
        kukVar.f(0);
        kukVar.a(i);
        kukVar.a(hiHealthData.getModifiedTime());
        kukVar.d(hiHealthData.getType());
        kukVar.c(hiHealthData.getValue());
        if (this.d.b(hiHealthData.getType()) == null) {
            ReleaseLogUtil.e("HiH_HiHealthSaveData", "saveDicStatData  healthDictStat is null, type is ", Integer.valueOf(hiHealthData.getType()));
            return false;
        }
        return new HiDicHealthDataStat(f40064a).e(kukVar);
    }

    public boolean c(HiHealthData hiHealthData, int i, int i2) {
        if (hiHealthData == null || i <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthSaveData", "saveStatData() statClient <= 0");
            return false;
        }
        ReleaseLogUtil.d("HiH_HiHealthSaveData", "saveStatDtTp=", Integer.valueOf(hiHealthData.getType()), ",tm", Long.valueOf(hiHealthData.getStartTime()), ",statClient=", Integer.valueOf(i), ",uId=", Integer.valueOf(i2));
        kuk kukVar = new kuk();
        kukVar.c(hiHealthData.getStartTime());
        kukVar.h(i2);
        kukVar.i(hiHealthData.getSyncStatus());
        kukVar.e(hiHealthData.getInt("hihealth_type"));
        kukVar.f(hiHealthData.getPointUnit());
        kukVar.a(i);
        kukVar.a(hiHealthData.getModifiedTime());
        if (hiHealthData.getType() == 10010) {
            return d(hiHealthData, kukVar);
        }
        kukVar.d(hiHealthData.getType());
        kukVar.c(hiHealthData.getValue());
        return ljq.d(f40064a, kukVar.g()).b(kukVar);
    }

    private boolean d(HiHealthData hiHealthData, kuk kukVar) {
        for (int i : HiHealthDataType.e(hiHealthData.getType())) {
            String strA = HiHealthDataKey.a(i);
            double d = hiHealthData.getDouble(strA);
            if (!strA.equals("menstrual_physical") || d != 2.147483647E9d) {
                kukVar.d(i);
                kukVar.c(d);
                if (!ljq.d(f40064a, kukVar.g()).b(kukVar)) {
                    ReleaseLogUtil.e("HiH_HiHealthSaveData", "saveStatSet false");
                    return false;
                }
            }
        }
        return true;
    }

    public void e(List<HiHealthData> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            int type = hiHealthData.getType();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c cVar = new c();
                    cVar.e = 1;
                    cVar.f40068c = hiHealthData.getStartTime();
                    cVar.f40066a = hiHealthData.getEndTime();
                    cVar.f = hiHealthData.getType();
                    cVar.d = hiHealthData.getModifiedTime();
                    cVar.h = hiHealthData.getValue();
                    arrayList.add(cVar);
                    break;
                }
                c cVar2 = (c) it.next();
                if (cVar2.f == type) {
                    if (cVar2.f40068c > hiHealthData.getStartTime()) {
                        cVar2.f40068c = hiHealthData.getStartTime();
                    }
                    if (cVar2.f40066a < hiHealthData.getEndTime()) {
                        cVar2.f40066a = hiHealthData.getEndTime();
                    }
                    c.d(cVar2);
                    if (type > 4) {
                        break;
                    }
                    c.b(cVar2, hiHealthData.getValue());
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder("insDt=[");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append('{');
            sb.append(((c) arrayList.get(i)).toString());
            sb.append('}');
        }
        sb.append(']');
        ReleaseLogUtil.d("HiH_HiHealthSaveData", sb.toString());
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f40066a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40068c;
        private long d;
        private int e;
        private int f;
        private double h;

        private c() {
        }

        static /* synthetic */ double b(c cVar, double d) {
            double d2 = cVar.h + d;
            cVar.h = d2;
            return d2;
        }

        static /* synthetic */ int d(c cVar) {
            int i = cVar.e;
            cVar.e = i + 1;
            return i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(16);
            sb.append("tp=");
            sb.append(this.f);
            sb.append(",ct=");
            sb.append(this.e);
            sb.append(",sTm=");
            sb.append(this.f40068c);
            sb.append(",eTm=");
            sb.append(this.f40066a);
            sb.append(",mTm=");
            sb.append(this.d);
            sb.append(",mSV=");
            sb.append(this.h);
            return sb.toString();
        }
    }
}
