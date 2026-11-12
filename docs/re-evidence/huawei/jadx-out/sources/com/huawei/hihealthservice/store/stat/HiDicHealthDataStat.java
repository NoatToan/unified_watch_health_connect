package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HealthDataStatPolicy;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictStat;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.TrackSimilarityIdentifier;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import defpackage.kth;
import defpackage.kuk;
import defpackage.kws;
import defpackage.kww;
import defpackage.kxe;
import defpackage.kxo;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.ljq;
import defpackage.ljz;
import defpackage.lkh;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HiDicHealthDataStat {
    private static final Map<String, Integer> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f12564b;
    private Context d;
    private HiHealthDictManager f;
    private kxe g;
    private kws h;
    private kxo i;
    private int j;
    private int k;
    private long l;
    private int m;
    private long n;
    private long o;
    private TimeZone p;
    private int q;
    private int r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer[] f12563c = {42011, 42003, Integer.valueOf(Constants.REBACK_MARKET_RESULT_CODE), Integer.valueOf(Constants.REBACK_MARKET_ENTRANCE), 42005, 42008, 42009, 42010, 42006, 42012, 42013};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Integer[] f12562a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 25, 24, 22, 21, 26, 27, 28, 29};

    private boolean e(int i) {
        return i == 3 || i == 4 || i == 5 || i == 6;
    }

    static {
        ArrayMap arrayMap = new ArrayMap(10);
        e = arrayMap;
        arrayMap.put("MAX", 4);
        arrayMap.put("MIN", 5);
        arrayMap.put(HealthDataStatPolicy.AVG, 3);
        arrayMap.put(HealthDataStatPolicy.SUM, 1);
        arrayMap.put(HealthDataStatPolicy.COUNT, 2);
        arrayMap.put(HealthDataStatPolicy.SD, 7);
    }

    public HiDicHealthDataStat(Context context) {
        this.d = context;
    }

    private boolean d(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("HiH_HiDicHealthDataStat", "healthData is null");
            return false;
        }
        this.r = hiHealthData.getUserId();
        int iE = kyn.d(this.d).e(0, this.r, 0);
        this.k = iE;
        if (iE <= 0) {
            LogUtil.j("HiH_HiDicHealthDataStat", "mStatClient <= 0");
            return false;
        }
        List<Integer> listC = kyj.c().c(this.r);
        this.f12564b = listC;
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiDicHealthDataStat", "mClients is null or empty");
            return false;
        }
        this.p = TimeZone.getDefault();
        this.l = HiDateUtil.a(hiHealthData.getStartTime(), this.p);
        this.n = HiDateUtil.c(hiHealthData.getStartTime(), this.p);
        this.o = HiDateUtil.d(hiHealthData.getStartTime(), this.p, -1);
        this.j = HiDateUtil.e(this.l, this.p);
        this.q = hiHealthData.getType();
        this.m = hiHealthData.getSubType();
        this.i = ljq.e(this.d, this.q);
        this.g = ljq.a(this.d, this.q);
        this.h = kws.e(this.d);
        this.f = HiHealthDictManager.a(this.d);
        return true;
    }

    public boolean a(HiHealthData hiHealthData) {
        if (!d(hiHealthData)) {
            LogUtil.j("HiH_HiDicHealthDataStat", "initalize failed!");
            return false;
        }
        ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "execute stat in type:", Integer.valueOf(hiHealthData.getType()), "startTime:", Long.valueOf(hiHealthData.getStartTime()));
        int i = AnonymousClass2.f12565b[HiHealthDataType.d(hiHealthData.getType()).ordinal()];
        if (i == 1) {
            HiHealthDictField hiHealthDictFieldC = this.f.c(this.q);
            if (hiHealthDictFieldC == null) {
                LogUtil.j("HiH_HiDicHealthDataStat", "healthDictField is null, health type is ", Integer.valueOf(this.q));
                return false;
            }
            if (HiCommonUtil.b(hiHealthDictFieldC.j())) {
                LogUtil.j("HiH_HiDicHealthDataStat", "statPolicys is empty!");
                return false;
            }
            Iterator<HiHealthDictStat> it = hiHealthDictFieldC.j().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } else if (i == 2) {
            kws kwsVar = this.h;
            List<Integer> list = this.f12564b;
            long j = this.l;
            long j2 = this.n;
            int i2 = this.q;
            int i3 = this.m;
            List<String> listD = kwsVar.d(list, j, j2, i2 - i3, i3);
            if (HiCommonUtil.b(listD)) {
                ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "sequenceMetaDatas is null or empty!");
                List<String> listO = HiHealthDictManager.a(this.d).o(this.q);
                ArrayList arrayList = new ArrayList(Arrays.asList(f12562a));
                Iterator<String> it2 = listO.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(HiHealthDictManager.a(this.d).c(this.q, it2.next(), 0)));
                }
                kuk kukVar = new kuk();
                kukVar.e(this.m);
                kukVar.a(this.k);
                kukVar.b(this.j);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    kukVar.d(((Integer) it3.next()).intValue());
                    kww.c(this.d).e(kukVar);
                }
            }
            try {
                List<HiHealthDictField> listH = this.f.h(hiHealthData.getType());
                if (HiCommonUtil.b(listH)) {
                    ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "dictFields is null or empty!");
                    return false;
                }
                ArrayList arrayList2 = new ArrayList(10);
                for (String str : listD) {
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        for (HiHealthDictField hiHealthDictField : listH) {
                            HashMap map = new HashMap(1);
                            if (jSONObject.has(hiHealthDictField.c()) && HiCommonUtil.d(String.valueOf(jSONObject.get(hiHealthDictField.c())))) {
                                map.put(hiHealthDictField.c(), Double.valueOf(jSONObject.getDouble(hiHealthDictField.c())));
                                arrayList2.add(map);
                            }
                            if (jSONObject.has(BleConstants.EXTEND_TRACK_DATA_MAP)) {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.getString(BleConstants.EXTEND_TRACK_DATA_MAP));
                                if (jSONObject2.has(hiHealthDictField.c()) && HiCommonUtil.d(String.valueOf(jSONObject2.get(hiHealthDictField.c())))) {
                                    map.put(hiHealthDictField.c(), Double.valueOf(jSONObject2.getDouble(hiHealthDictField.c())));
                                    arrayList2.add(map);
                                }
                            }
                        }
                    }
                }
                if (!HiCommonUtil.b(arrayList2)) {
                    for (HiHealthDictField hiHealthDictField2 : listH) {
                        if (hiHealthDictField2 == null || HiCommonUtil.b(hiHealthDictField2.j())) {
                            ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "dictField is null or statPolicies is empty!");
                        } else {
                            Iterator<HiHealthDictStat> it4 = hiHealthDictField2.j().iterator();
                            while (it4.hasNext()) {
                                c(it4.next(), hiHealthDictField2, arrayList2);
                            }
                        }
                    }
                }
                c(hiHealthData);
            } catch (JSONException e2) {
                ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "stat JSONException!, e is ", e2.getMessage());
                return false;
            }
        } else {
            ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "This type is not supported stat, type is ", Integer.valueOf(hiHealthData.getType()));
        }
        return true;
    }

    /* JADX INFO: renamed from: com.huawei.hihealthservice.store.stat.HiDicHealthDataStat$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12565b;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f12565b = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12565b[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void c(HiHealthData hiHealthData) {
        if (hiHealthData.getSubType() == 0) {
            return;
        }
        try {
            if (this.l >= HiDateUtil.a(System.currentTimeMillis(), this.p) - 31104000000L) {
                a(this.d, this.h.a(this.f12564b, this.o, this.n, 30001));
            }
            HashMap map = new HashMap(16);
            List<String> listE = this.h.e(this.f12564b, this.l, this.n, 30001);
            int i = 0;
            for (String str : listE) {
                if (str != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (e(CommonUtil.c(jSONObject, "trackType"))) {
                        i++;
                    }
                    int iC = CommonUtil.c(jSONObject, BleConstants.SPORT_TYPE);
                    List arrayList = (List) map.get(String.valueOf(iC));
                    if (HiCommonUtil.b(arrayList)) {
                        arrayList = new ArrayList(10);
                    }
                    arrayList.add(str);
                    map.put(String.valueOf(iC), arrayList);
                }
            }
            hiHealthData.setSyncStatus(0);
            c(hiHealthData, 30001, listE, f12563c, true);
            if (i > 0) {
                e(HiDateUtil.e(hiHealthData.getStartTime(), this.p), 30001, 43500, i, hiHealthData.getSyncStatus(), 16);
            }
            if (map.isEmpty()) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                HiHealthDictType hiHealthDictTypeA = this.f.a(hiHealthData.getType());
                if (hiHealthDictTypeA != null) {
                    c(hiHealthData, CommonUtils.j((String) entry.getKey()), (List) entry.getValue(), ArrayUtils.toWrapperArray(hiHealthDictTypeA.a()), false);
                }
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "processSportSequenceStat JSONException!, e is ", e2.getMessage());
        }
    }

    private void c(HiHealthData hiHealthData, int i, List<String> list, Integer[] numArr, boolean z) {
        String str;
        String str2;
        String str3;
        double d;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        String str4;
        double d2;
        int i6;
        int i7;
        String str5;
        String str6;
        int i8;
        double d3;
        String str7;
        int i9;
        String str8 = "HiH_HiDicHealthDataStat";
        try {
            Iterator<String> it = list.iterator();
            String str9 = "max_met";
            double dMax = 0.0d;
            int i10 = 0;
            double d4 = 0.0d;
            double dMax2 = 0.0d;
            double d5 = 0.0d;
            double d6 = 0.0d;
            double d7 = 0.0d;
            double d8 = 0.0d;
            double d9 = 0.0d;
            int i11 = 0;
            double d10 = 0.0d;
            double d11 = 0.0d;
            int i12 = 0;
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            while (true) {
                try {
                    str2 = str8;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        it = it;
                        JSONObject jSONObject = new JSONObject(it.next());
                        i10++;
                        try {
                            if (CommonUtil.c(jSONObject, "abnormalTrack") == 0) {
                                try {
                                    if (CommonUtil.c(jSONObject, "mDuplicated") == 0) {
                                        double d15 = d5 + CommonUtil.d(jSONObject, "totalSteps");
                                        dMax = Math.max(CommonUtil.d(jSONObject, "mTotalDescent"), dMax);
                                        d6 += CommonUtil.d(jSONObject, BleConstants.TOTAL_DISTANCE);
                                        d8 += CommonUtil.d(jSONObject, "totalTime");
                                        d9 += CommonUtil.d(jSONObject, "creepingWave");
                                        d4 += CommonUtil.d(jSONObject, "avgPace");
                                        d7 += CommonUtil.d(jSONObject, BleConstants.TOTAL_CALORIES);
                                        dMax2 = Math.max(CommonUtil.d(jSONObject, BleConstants.TOTAL_DISTANCE), dMax2);
                                        d14 += CommonUtil.d(jSONObject, "mTotalDescent");
                                        if (jSONObject.has(BleConstants.EXTEND_TRACK_DATA_MAP)) {
                                            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(BleConstants.EXTEND_TRACK_DATA_MAP));
                                            d11 += CommonUtil.d(jSONObject2, "divingTime");
                                            d13 += CommonUtil.d(jSONObject2, "totalPushes");
                                            d10 += CommonUtil.d(jSONObject2, "divingCount");
                                            d12 += CommonUtil.d(jSONObject2, "wayPointDistance");
                                        }
                                        if (jSONObject.has("wearSportData")) {
                                            JSONObject jSONObject3 = jSONObject.getJSONObject("wearSportData");
                                            str7 = str9;
                                            if (jSONObject3.has(str7)) {
                                                int iD = ((int) (CommonUtil.d(jSONObject3, str7) * 3.5d)) / 65536;
                                                i9 = i12;
                                                if (iD > i9) {
                                                    i12 = iD;
                                                }
                                                str9 = str7;
                                                str8 = str2;
                                                d5 = d15;
                                            }
                                            i12 = i9;
                                            str9 = str7;
                                            str8 = str2;
                                            d5 = d15;
                                        } else {
                                            str7 = str9;
                                        }
                                        i9 = i12;
                                        i12 = i9;
                                        str9 = str7;
                                        str8 = str2;
                                        d5 = d15;
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                    str = str2;
                                    ReleaseLogUtil.e(str, "statSportSequence JSONException!, e is ", e.getMessage());
                                    return;
                                }
                            }
                            ReleaseLogUtil.e(str5, "statDayTrack is abnormalTrack or duplicated");
                            i11++;
                            str8 = str5;
                            dMax = d3;
                            i12 = i8;
                            str9 = str6;
                        } catch (JSONException e3) {
                            e = e3;
                            str = str5;
                            ReleaseLogUtil.e(str, "statSportSequence JSONException!, e is ", e.getMessage());
                            return;
                        }
                        str6 = str9;
                        i8 = i12;
                        d3 = dMax;
                        str5 = str2;
                    } catch (JSONException e4) {
                        e = e4;
                        str5 = str2;
                    }
                } catch (JSONException e5) {
                    e = e5;
                    str = str8;
                    ReleaseLogUtil.e(str, "statSportSequence JSONException!, e is ", e.getMessage());
                    return;
                }
            }
            int i13 = i12;
            double d16 = dMax;
            double d17 = d4;
            int iE = HiDateUtil.e(hiHealthData.getStartTime(), this.p);
            int syncStatus = hiHealthData.getSyncStatus();
            if (z) {
                e(iE, i, numArr[0].intValue(), d5, syncStatus, 1);
                e(iE, i, numArr[1].intValue(), d6, syncStatus, 2);
                e(iE, i, numArr[2].intValue(), d7, syncStatus, 3);
                e(iE, i, numArr[3].intValue(), d8, syncStatus, 13);
                e(iE, i, numArr[4].intValue(), i10, syncStatus, 16);
                e(iE, i, numArr[5].intValue(), i11, syncStatus, 16);
                e(iE, i, numArr[7].intValue(), dMax2, syncStatus, 2);
                e(iE, i, numArr[9].intValue(), d9, syncStatus, 4);
                str3 = str2;
                d = d17;
                i2 = i13;
                c2 = '\b';
            } else {
                Integer[] numArr2 = numArr;
                String str10 = str2;
                double d18 = d17;
                int i14 = i11;
                int length = numArr2.length;
                int i15 = 0;
                while (i15 < length) {
                    int iIntValue = numArr2[i15].intValue();
                    if (iIntValue == 8) {
                        i3 = i15;
                        i4 = length;
                        i5 = i14;
                        str4 = str10;
                        d2 = d18;
                        i6 = i10;
                        e(iE, i, iIntValue, dMax2, syncStatus, 2);
                    } else if (iIntValue == 10) {
                        i3 = i15;
                        i4 = length;
                        i5 = i14;
                        str4 = str10;
                        d2 = d18;
                        i6 = i10;
                        e(iE, i, iIntValue, d9, syncStatus, 4);
                    } else if (iIntValue == 24) {
                        i3 = i15;
                        i4 = length;
                        i5 = i14;
                        str4 = str10;
                        d2 = d18;
                        i6 = i10;
                        e(iE, i, iIntValue, d10, syncStatus, 16);
                    } else if (iIntValue == 21) {
                        i3 = i15;
                        i4 = length;
                        i5 = i14;
                        str4 = str10;
                        d2 = d18;
                        i6 = i10;
                        e(iE, i, iIntValue, d11, syncStatus, 2);
                    } else if (iIntValue != 22) {
                        switch (iIntValue) {
                            case 1:
                                i3 = i15;
                                i4 = length;
                                i5 = i14;
                                i7 = i10;
                                e(iE, i, iIntValue, d5, syncStatus, 1);
                                d2 = d18;
                                String str11 = str10;
                                i6 = i7;
                                str4 = str11;
                                break;
                            case 2:
                                i3 = i15;
                                i4 = length;
                                i5 = i14;
                                i7 = i10;
                                e(iE, i, iIntValue, d6, syncStatus, 2);
                                d2 = d18;
                                String str12 = str10;
                                i6 = i7;
                                str4 = str12;
                                break;
                            case 3:
                                i3 = i15;
                                i4 = length;
                                i5 = i14;
                                i7 = i10;
                                e(iE, i, iIntValue, d7, syncStatus, 3);
                                d2 = d18;
                                String str13 = str10;
                                i6 = i7;
                                str4 = str13;
                                break;
                            case 4:
                                i3 = i15;
                                i4 = length;
                                i5 = i14;
                                i7 = i10;
                                e(iE, i, iIntValue, d8, syncStatus, 13);
                                d2 = d18;
                                String str14 = str10;
                                i6 = i7;
                                str4 = str14;
                                break;
                            case 5:
                                i3 = i15;
                                i4 = length;
                                i5 = i14;
                                i7 = i10;
                                e(iE, i, iIntValue, i7, syncStatus, 16);
                                d2 = d18;
                                String str15 = str10;
                                i6 = i7;
                                str4 = str15;
                                break;
                            case 6:
                                i4 = length;
                                double d19 = i14;
                                i3 = i15;
                                i5 = i14;
                                i7 = i10;
                                e(iE, i, iIntValue, d19, syncStatus, 16);
                                d2 = d18;
                                String str16 = str10;
                                i6 = i7;
                                str4 = str16;
                                break;
                            default:
                                i3 = i15;
                                i4 = length;
                                i5 = i14;
                                i7 = i10;
                                switch (iIntValue) {
                                    case 26:
                                        d2 = d18;
                                        e(iE, i, iIntValue, d12, syncStatus, 2);
                                        String str17 = str10;
                                        i6 = i7;
                                        str4 = str17;
                                        break;
                                    case 27:
                                        double d20 = d18;
                                        d2 = d20;
                                        e(iE, i, iIntValue, HiCommonUtil.b(d20, i7, 2), syncStatus, 14);
                                        String str18 = str10;
                                        i6 = i7;
                                        str4 = str18;
                                        break;
                                    case 28:
                                        e(iE, i, iIntValue, d13, syncStatus, 16);
                                        d2 = d18;
                                        String str19 = str10;
                                        i6 = i7;
                                        str4 = str19;
                                        break;
                                    case 29:
                                        e(iE, i, iIntValue, d14, syncStatus, 4);
                                        d2 = d18;
                                        String str110 = str10;
                                        i6 = i7;
                                        str4 = str110;
                                        break;
                                    default:
                                        d2 = d18;
                                        String str20 = str10;
                                        ReleaseLogUtil.d(str20, "common stat type is invalid!");
                                        i6 = i7;
                                        str4 = str20;
                                        break;
                                }
                                break;
                        }
                    } else {
                        i3 = i15;
                        i4 = length;
                        i5 = i14;
                        String str21 = str10;
                        d2 = d18;
                        i6 = i10;
                        str4 = str21;
                        e(iE, i, iIntValue, d16, syncStatus, 2);
                    }
                    i15 = i3 + 1;
                    numArr2 = numArr;
                    length = i4;
                    i10 = i6;
                    d18 = d2;
                    str10 = str4;
                    i14 = i5;
                }
                str3 = str10;
                d = d18;
                c2 = '\b';
                i2 = i13;
            }
            if (i2 == 0 || (i2 >= 21 && i2 <= 88)) {
                if (z) {
                    double d21 = i2;
                    e(iE, i, numArr[c2].intValue(), d21, syncStatus, 0);
                    if (i2 == 0) {
                        c();
                    } else {
                        e(iE, 30001, 42007, d21, syncStatus, 0);
                    }
                } else if (Arrays.asList(numArr).contains(9)) {
                    e(iE, i, 9, i2, syncStatus, 0);
                }
            }
            if (z) {
                if (d > 0.0d) {
                    e(iE, 30001, 42004, d, syncStatus, 14);
                }
                if (iE == HiDateUtil.e(System.currentTimeMillis(), this.p)) {
                    LogUtil.d(str3, "statDayTrack today track Stat changed ! ");
                    HiBroadcastUtil.b(this.d, 2);
                }
            }
        } catch (JSONException e6) {
            e = e6;
        }
    }

    private void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, jCurrentTimeMillis);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        List<HiHealthData> listD = kww.c(this.d).d(hiDataReadOption, 42006, this.k, (kth) null);
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("HiH_HiDicHealthDataStat", "getLastVo2max vo2maxListSport is null");
        } else {
            e(HiDateUtil.e(listD.get(0).getStartTime(), this.p), 30001, 42007, listD.get(0).getIntValue(), listD.get(0).getSyncStatus(), 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    private boolean a(HiHealthDictStat hiHealthDictStat) {
        double d;
        List<HiHealthData> listD;
        double d2;
        String[] strArr = {hiHealthDictStat.a()};
        HiDataReadOption hiDataReadOptionB = b();
        String strE = hiHealthDictStat.e();
        strE.hashCode();
        switch (strE) {
            case "SD":
                List<HiHealthData> listB = this.g.b(hiDataReadOptionB, this.q, this.f12564b, (kth) null);
                List<HiHealthData> listD2 = this.i.d(this.f12564b, this.l, this.n, 3, this.q, new String[]{HealthDataStatPolicy.AVG}, new int[]{3}, 0);
                if (HiCommonUtil.b(listD2) || HiCommonUtil.b(listB) || listB.size() <= 1) {
                    LogUtil.j("HiH_HiDicHealthDataStat", "statData is nullEmpty or currentDayDatas is less than or equal to one");
                    return ljz.d(this.j, this.k, this.q, new int[]{hiHealthDictStat.c()});
                }
                d = d(listB, listD2);
                d2 = d;
                return e(this.j, this.q, hiHealthDictStat.c(), d2, 0, 0);
            case "AVG":
            case "MAX":
            case "MIN":
            case "SUM":
            case "COUNT":
                int[] iArr = {e.get(hiHealthDictStat.e()).intValue()};
                if (hiHealthDictStat.b() != null) {
                    listD = this.i.a(this.f12564b, this.l, this.n, 3, this.q, strArr, iArr, 0, hiHealthDictStat.b().doubleValue());
                } else {
                    listD = this.i.d(this.f12564b, this.l, this.n, 3, this.q, strArr, iArr, 0);
                }
                if (HiCommonUtil.b(listD)) {
                    ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "statData is null");
                    if (lkh.h(hiHealthDictStat.c())) {
                        return true;
                    }
                    return ljz.d(this.j, this.k, this.q, new int[]{hiHealthDictStat.c()});
                }
                int size = listD.size();
                if (size > 1 && (hiHealthDictStat.c() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value() || hiHealthDictStat.c() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value() || hiHealthDictStat.c() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value())) {
                    ReleaseLogUtil.d(r15, "statPointOnePolicy detailDatas=", listD);
                    double d3 = 0.0d;
                    for (int i = 0; i < size; i++) {
                        double d4 = listD.get(i).getDouble(hiHealthDictStat.a());
                        if (d4 > d3) {
                            d3 = d4;
                        }
                    }
                    d2 = d3;
                } else {
                    d = listD.get(0).getDouble(hiHealthDictStat.a());
                    d2 = d;
                }
                return e(this.j, this.q, hiHealthDictStat.c(), d2, 0, 0);
            case "LAST":
                hiDataReadOptionB.setCount(1);
                List<HiHealthData> listB2 = this.g.b(hiDataReadOptionB, this.q, this.f12564b, (kth) null);
                if (HiCommonUtil.b(listB2)) {
                    ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "statData is null");
                    if (lkh.h(hiHealthDictStat.c())) {
                        return true;
                    }
                    return ljz.d(this.j, this.k, this.q, new int[]{hiHealthDictStat.c()});
                }
                d = listB2.get(0).getValue();
                d2 = d;
                return e(this.j, this.q, hiHealthDictStat.c(), d2, 0, 0);
            default:
                LogUtil.j("HiH_HiDicHealthDataStat", "This statPolicy is not supported! statPolicy is ", hiHealthDictStat.e());
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7  */
    private boolean c(HiHealthDictStat hiHealthDictStat, HiHealthDictField hiHealthDictField, List<Map<String, Double>> list) throws JSONException {
        byte b2;
        double dDoubleValue;
        double dDoubleValue2;
        String strE = hiHealthDictStat.e();
        strE.hashCode();
        int i = 0;
        switch (strE) {
            case "AVG":
                b2 = 0;
                break;
            case "MAX":
                b2 = 1;
                break;
            case "MIN":
                b2 = 2;
                break;
            case "SUM":
                b2 = 3;
                break;
            case "LAST":
                b2 = 4;
                break;
            case "COUNT":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        double dDoubleValue3 = 0.0d;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    dDoubleValue2 = Double.MAX_VALUE;
                    for (Map<String, Double> map : list) {
                        if (map.containsKey(hiHealthDictField.c()) && map.get(hiHealthDictField.c()).doubleValue() < dDoubleValue2) {
                            dDoubleValue2 = map.get(hiHealthDictField.c()).doubleValue();
                            i = 1;
                        }
                    }
                } else if (b2 == 3) {
                    for (Map<String, Double> map2 : list) {
                        if (map2.containsKey(hiHealthDictField.c())) {
                            dDoubleValue3 += map2.get(hiHealthDictField.c()).doubleValue();
                            i = 1;
                        }
                    }
                } else if (b2 == 4) {
                    Iterator<Map<String, Double>> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map<String, Double> next = it.next();
                            if (next.containsKey(hiHealthDictField.c())) {
                                dDoubleValue = next.get(hiHealthDictField.c()).doubleValue();
                                i = 1;
                            }
                        }
                    }
                } else if (b2 == 5) {
                    Iterator<Map<String, Double>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().containsKey(hiHealthDictField.c())) {
                            dDoubleValue3 += 1.0d;
                            i = 1;
                        }
                    }
                } else {
                    LogUtil.j("HiH_HiDicHealthDataStat", "This statPolicy is not supported! statPolicy is ", hiHealthDictStat.e());
                    return false;
                }
                if (i == 0) {
                    ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "statValue is inValid, statValue is ", Double.valueOf(dDoubleValue), ", statPolicy is ", hiHealthDictStat.e(), ", statType is ", Integer.valueOf(hiHealthDictStat.c()));
                    return true;
                }
                return e(this.j, this.m, hiHealthDictStat.c(), dDoubleValue, 0, 0);
            }
            dDoubleValue2 = Double.MIN_VALUE;
            for (Map<String, Double> map3 : list) {
                if (map3.containsKey(hiHealthDictField.c()) && map3.get(hiHealthDictField.c()).doubleValue() > dDoubleValue2) {
                    dDoubleValue2 = map3.get(hiHealthDictField.c()).doubleValue();
                    i = 1;
                }
            }
            dDoubleValue = dDoubleValue2;
            if (i == 0) {
                ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "statValue is inValid, statValue is ", Double.valueOf(dDoubleValue), ", statPolicy is ", hiHealthDictStat.e(), ", statType is ", Integer.valueOf(hiHealthDictStat.c()));
                return true;
            }
            return e(this.j, this.m, hiHealthDictStat.c(), dDoubleValue, 0, 0);
        }
        int i2 = 0;
        for (Map<String, Double> map4 : list) {
            if (map4.containsKey(hiHealthDictField.c())) {
                dDoubleValue3 += map4.get(hiHealthDictField.c()).doubleValue();
                i++;
                i2 = 1;
            }
        }
        if (i != 0) {
            dDoubleValue3 /= (double) i;
        }
        i = i2;
        dDoubleValue = dDoubleValue3;
        if (i == 0) {
            ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "statValue is inValid, statValue is ", Double.valueOf(dDoubleValue), ", statPolicy is ", hiHealthDictStat.e(), ", statType is ", Integer.valueOf(hiHealthDictStat.c()));
            return true;
        }
        return e(this.j, this.m, hiHealthDictStat.c(), dDoubleValue, 0, 0);
    }

    public static void a(Context context, List<HiHealthData> list) throws JSONException {
        if (HiCommonUtil.c(list)) {
            return;
        }
        ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "eliminateDumplicateMetaData duplication", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            b(arrayList, linkedHashMap, it.next());
        }
        TrackSimilarityIdentifier trackSimilarityIdentifier = new TrackSimilarityIdentifier();
        List<TrackSimilarityIdentifier.TrackRecord> listD = trackSimilarityIdentifier.d(arrayList, TrackSimilarityIdentifier.TrackRouteDateInfo.INVALID_DATE);
        List<TrackSimilarityIdentifier.TrackRecord> listD2 = trackSimilarityIdentifier.d(arrayList, TrackSimilarityIdentifier.TrackRouteDateInfo.VALID_DATE);
        list.clear();
        if (!HiCommonUtil.c(listD)) {
            c(list, linkedHashMap, listD);
        }
        if (!HiCommonUtil.c(listD2)) {
            Iterator<TrackSimilarityIdentifier.TrackRecord> it2 = listD2.iterator();
            while (it2.hasNext()) {
                c(list, linkedHashMap, it2.next());
            }
        }
        ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "metadata change  sequenceMetaDatasBefore size  = ", Integer.valueOf(list.size()));
        for (HiHealthData hiHealthData : list) {
            kws.e(context).e(hiHealthData, hiHealthData.getClientId());
        }
    }

    private static void c(List<HiHealthData> list, Map<TrackSimilarityIdentifier.TrackRecord, HiHealthData> map, List<TrackSimilarityIdentifier.TrackRecord> list2) {
        for (TrackSimilarityIdentifier.TrackRecord trackRecord : list2) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(map.get(trackRecord).getMetaData(), HiTrackMetaData.class);
            if (hiTrackMetaData.getDuplicated() != 1) {
                hiTrackMetaData.setDuplicated(1);
                map.get(trackRecord).setMetaData(HiJsonUtil.d(hiTrackMetaData));
                list.add(map.get(trackRecord));
            } else {
                ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "buildTrackMetaData duplication is 1");
            }
        }
    }

    private static void c(List<HiHealthData> list, Map<TrackSimilarityIdentifier.TrackRecord, HiHealthData> map, TrackSimilarityIdentifier.TrackRecord trackRecord) {
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(map.get(trackRecord).getMetaData(), HiTrackMetaData.class);
        if (hiTrackMetaData.getDuplicated() == 1) {
            hiTrackMetaData.setDuplicated(0);
            map.get(trackRecord).setMetaData(HiJsonUtil.d(hiTrackMetaData));
            list.add(map.get(trackRecord));
            return;
        }
        ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "TrackSimilarityIdentifier duplication is 0");
    }

    private static void b(List<TrackSimilarityIdentifier.TrackRecord> list, Map<TrackSimilarityIdentifier.TrackRecord, HiHealthData> map, HiHealthData hiHealthData) throws JSONException {
        JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
        if (CommonUtil.c(jSONObject, "abnormalTrack") != 0 || CommonUtil.c(jSONObject, BleConstants.SPORT_TYPE) == 512 || CommonUtil.c(jSONObject, BleConstants.SPORT_TYPE) == DicDataTypeUtil.DataType.ADVENTURES_SPORT_TYPE.value()) {
            return;
        }
        if (CommonUtil.c(jSONObject, "sportDataSource") == 2) {
            ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "eliminateDumplicateMetaData user input source");
            return;
        }
        c cVar = new c(hiHealthData.getStartTime(), hiHealthData.getEndTime(), CommonUtil.c(jSONObject, BleConstants.TOTAL_DISTANCE), CommonUtil.c(jSONObject, "trackType"));
        list.add(cVar);
        map.put(cVar, hiHealthData);
    }

    private HiDataReadOption b() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(this.l);
        hiDataReadOption.setEndTime(this.n);
        hiDataReadOption.setSortOrder(1);
        return hiDataReadOption;
    }

    private double d(List<HiHealthData> list, List<HiHealthData> list2) {
        double d = list2.get(0).getDouble(HealthDataStatPolicy.AVG);
        Iterator<HiHealthData> it = list.iterator();
        double dPow = 0.0d;
        while (it.hasNext()) {
            dPow += Math.pow(it.next().getValue() - d, 2.0d);
        }
        return Math.sqrt(dPow / ((double) (list.size() - 1)));
    }

    private boolean e(int i, int i2, int i3, double d, int i4, int i5) {
        if (lkh.j(i3) && i != HiDateUtil.e(System.currentTimeMillis(), this.p) && d == 0.0d) {
            return true;
        }
        kuk kukVar = new kuk();
        kukVar.b(i);
        kukVar.h(this.r);
        kukVar.i(i4);
        kukVar.e(i2);
        kukVar.f(i5);
        kukVar.a(this.k);
        kukVar.c(d);
        kukVar.d(i3);
        return e(kukVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0065: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:25:0x0065 */
    public boolean e(kuk kukVar) throws Throwable {
        Exception e2;
        boolean zB;
        boolean z;
        boolean z2 = false;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), kukVar.g()) ? ljq.b(BaseApplication.b(), kukVar.g()) : false;
                try {
                    boolean zD = d(kukVar);
                    if (zB) {
                        ljq.g(BaseApplication.b(), kukVar.g());
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), kukVar.g());
                    }
                    return zD;
                } catch (Exception e3) {
                    e2 = e3;
                    ReleaseLogUtil.e("HiH_HiDicHealthDataStat", "insertOrUpdateStatData: ", LogAnonymous.b(e2));
                    if (zB) {
                        ljq.c(BaseApplication.b(), kukVar.g());
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    ljq.c(BaseApplication.b(), kukVar.g());
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                ljq.c(BaseApplication.b(), kukVar.g());
            }
            throw th;
        }
    }

    private boolean d(kuk kukVar) {
        List listAsList = Arrays.asList(f12563c);
        List listAsList2 = Arrays.asList(f12562a);
        if ((listAsList.contains(Integer.valueOf(kukVar.g())) || listAsList2.contains(Integer.valueOf(kukVar.g()))) && kukVar.l() == 0.0d) {
            ReleaseLogUtil.d("HiH_HiDicHealthDataStat", "statValue is 0, statType is = ", Integer.valueOf(kukVar.g()));
            return ljz.d(this.j, this.k, kukVar.b(), new int[]{kukVar.g()});
        }
        return ljq.d(this.d, kukVar.g()).b(kukVar, true, this.f.e().contains(Integer.valueOf(kukVar.b())));
    }

    public static class c extends TrackSimilarityIdentifier.TrackRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f12567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12568c;
        long e;

        c(long j, long j2, int i, int i2) {
            this.f12567b = j;
            this.e = j2;
            this.f12568c = i;
            this.f12566a = i2;
        }

        @Override // com.huawei.hwcommonmodel.TrackSimilarityIdentifier.TrackRecord
        public long getStartTime() {
            return this.f12567b;
        }

        @Override // com.huawei.hwcommonmodel.TrackSimilarityIdentifier.TrackRecord
        public long getEndTime() {
            return this.e;
        }

        @Override // com.huawei.hwcommonmodel.TrackSimilarityIdentifier.TrackRecord
        public float getDistance() {
            return this.f12568c;
        }

        @Override // com.huawei.hwcommonmodel.TrackSimilarityIdentifier.TrackRecord
        public boolean isWatchData() {
            return this.f12566a > 2;
        }
    }
}
