package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import android.util.ArrayMap;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kth;
import defpackage.kud;
import defpackage.kuk;
import defpackage.kws;
import defpackage.kww;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HiTrackStat extends HiStatCommon {
    private kyn aa;
    private int ab;
    private int ac;
    private TimeZone ad;
    private int ae;
    private double af;
    private double ag;
    private int ah;
    private double ai;
    private Map<String, List<String>> aj;
    private double ak;
    private double al;
    private int am;
    private double an;
    private List<String> ao;
    private List<String> ap;
    private List<String> aq;
    private int ar;
    private List<String> as;
    private List<String> at;
    private List<String> au;
    private List<String> ax;
    private List<String> f;
    private double g;
    private List<String> i;
    private int k;
    private double l;
    private int m;
    private int n;
    private kws o;
    private int p;
    private float q;
    private int r;
    private double s;
    private int t;
    private int u;
    private int v;
    private int w;
    private double x;
    private int y;
    private kyj z;
    private static final Integer[] h = {42051, 42052, 42053, 42054, 42055, 42056, 42057, 42058, 42059, 42060, 42061};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer[] f12586c = {42101, 42102, 42103, 42104, 42105, 42106, 42107, 42108, 42109, 42110, 42111};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer[] f12584a = {42151, 42152, 42153, 42154, 42155, 42156, 42157, 42158, 42159, 42160, 42161};
    private static final Integer[] e = {42201, 42202, 42203, 42204, 42205, 42206, 42207, 42208, 42209, 42210, 42211};
    private static final Integer[] j = {42251, 42252, 42253, 42254, 42255, 42256, 42257, 42258, 42259, 42260, 42261};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer[] f12585b = {42351, 42352, 42353, 42354, 42355, 42356, 42357, 42358, 42359, 42360, 42361, 42362};
    private static final Integer[] d = {42401, 42402, 42403, 42404, 42405, 42406, 42407, 42408, 42409, 42410, 42411, 42412, 42413};

    public HiTrackStat(Context context) {
        super(context);
        this.ar = 0;
        this.w = 0;
        this.p = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        this.af = 0.0d;
        this.al = 0.0d;
        this.ag = 0.0d;
        this.ak = 0.0d;
        this.ai = 0.0d;
        this.an = 0.0d;
        this.ah = 0;
        this.ae = 0;
        this.l = 0.0d;
        this.g = 0.0d;
        this.r = 0;
        this.s = 0.0d;
        this.q = 0.0f;
        this.m = 0;
        this.y = 30001;
        this.n = 0;
        this.x = 0.0d;
        this.k = 0;
        this.au = new ArrayList(10);
        this.as = new ArrayList(10);
        this.ap = new ArrayList(10);
        this.aq = new ArrayList(10);
        this.at = new ArrayList(10);
        this.ax = new ArrayList(10);
        this.f = new ArrayList(10);
        this.ao = new ArrayList(10);
        this.i = new ArrayList(10);
        this.aj = new HashMap(16);
        this.o = kws.e(context);
        this.aa = kyn.d(this.mContext);
        this.z = kyj.c();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.am = hiHealthData.getUserId();
        this.ad = TimeZone.getDefault();
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), this.ad);
        long jD = HiDateUtil.d(hiHealthData.getStartTime(), this.ad, -1);
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), this.ad);
        this.ab = HiDateUtil.e(jA, this.ad);
        ReleaseLogUtil.d("HiH_HiTrackStat", "stat() trackData", Long.valueOf(jA), " tz ", this.ad);
        int type = hiHealthData.getType();
        List<Integer> listC = this.z.c(this.am);
        if (listC == null || listC.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiTrackStat", "stat() clientIds is null");
            return false;
        }
        if (jA >= HiDateUtil.a(System.currentTimeMillis(), this.ad) - 31104000000L) {
            try {
                HiDicHealthDataStat.a(this.mContext, this.o.a(listC, jD, jC, 30001));
            } catch (JSONException e2) {
                ReleaseLogUtil.e("HiH_HiTrackStat", "statDayTrack eliminateDuplicateMetaData JSONException, e is ", e2.getMessage());
                return false;
            }
        }
        List<String> listE = this.o.e(listC, jA, jC, type);
        this.ac = this.aa.e(0, this.am, 0);
        Map<String, List<String>> mapE = e(listE);
        b(listE, hiHealthData, HiDicHealthDataStat.f12563c);
        List<kuk> listA = kww.c(this.mContext).a(this.ab, this.ac, CommonUtil.c((List<Integer>) e()));
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        if (!HiCommonUtil.b(listA)) {
            Iterator<kuk> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().g()));
            }
        }
        c(mapE.get("walk_type_datas"), hiHealthData, h, arrayList);
        c(mapE.get("run_type_datas"), hiHealthData, f12586c, arrayList);
        c(mapE.get("ride_type_datas"), hiHealthData, f12584a, arrayList);
        c(mapE.get("swim_type_datas"), hiHealthData, e, arrayList);
        c(mapE.get("triathlon_type_datas"), hiHealthData, j, arrayList);
        c(mapE.get("ski_type_datas"), hiHealthData, f12585b, arrayList);
        c(mapE.get("golf_type_datas"), hiHealthData, d, arrayList);
        ArrayList arrayList2 = new ArrayList(10);
        if (this.aj.size() > 0) {
            LogUtil.d("HiH_HiTrackStat", "statDayTrack for userDefinedSequenceData");
            for (Map.Entry<String, List<String>> entry : this.aj.entrySet()) {
                b(entry.getValue(), hiHealthData, HiDicHealthDataStat.f12562a);
                arrayList2.add(entry.getKey());
            }
        }
        this.mDataStatManager.d(this.ab, arrayList2, this.ac);
        d(mapE.get("basketball_type_datas"), hiHealthData);
        a(this.ab, 43500, hiHealthData.getSyncStatus(), mapE.get("wear_device_type_datas") != null ? mapE.get("wear_device_type_datas").size() : 0, 16);
        LogUtil.d("HiH_HiTrackStat", "stat() mTotalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    private ArrayList<Integer> e() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(h));
        arrayList.addAll(Arrays.asList(f12586c));
        arrayList.addAll(Arrays.asList(f12584a));
        arrayList.addAll(Arrays.asList(e));
        arrayList.addAll(Arrays.asList(j));
        arrayList.addAll(Arrays.asList(f12585b));
        arrayList.addAll(Arrays.asList(d));
        return arrayList;
    }

    private void c(List<String> list, HiHealthData hiHealthData, Integer[] numArr, ArrayList<Integer> arrayList) {
        if (!HiCommonUtil.b(list)) {
            b(list, hiHealthData, numArr);
            return;
        }
        ArrayList<Integer> arrayList2 = new ArrayList(Arrays.asList(numArr));
        arrayList2.retainAll(arrayList);
        if (arrayList2.size() > 0) {
            ReleaseLogUtil.d("HiH_HiTrackStat", "intersection is ", arrayList2);
            for (Integer num : arrayList2) {
                kuk kukVar = new kuk();
                kukVar.d(num.intValue());
                kukVar.a(this.ac);
                kukVar.b(this.ab);
                this.mDataStatManager.e(kukVar);
            }
        }
    }

    private void d(List<String> list, HiHealthData hiHealthData) {
        List<String> arrayList;
        if (this.ac <= 0) {
            LogUtil.j("HiH_HiTrackStat", "statDayBasketballTrack userClient <= 0");
            return;
        }
        if (list == null) {
            LogUtil.d("HiH_HiTrackStat", "statDayBasketballTrack sequenceMetaDatas is null");
            arrayList = new ArrayList<>(10);
        } else {
            arrayList = list;
        }
        LogUtil.d("HiH_HiTrackStat", "statDayBasketballTrack sequenceMetaDatas = ", Integer.valueOf(arrayList.size()), ",mStatClient = ", Integer.valueOf(this.ac));
        Iterator<String> it = arrayList.iterator();
        int totalSteps = 0;
        int i = 0;
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        int iIntValue5 = 0;
        int i2 = 0;
        double totalDistance = 0.0d;
        double totalCalories = 0.0d;
        double totalTime = 0.0d;
        while (it.hasNext()) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(it.next(), HiTrackMetaData.class);
            i++;
            if (hiTrackMetaData.getAbnormalTrack() != 0 || hiTrackMetaData.getDuplicated() != 0) {
                LogUtil.j("HiH_HiTrackStat", "statDayBasketballTrack is abnormalTrack or duplicated");
                i2++;
            } else {
                totalSteps += hiTrackMetaData.getTotalSteps();
                totalCalories += (double) hiTrackMetaData.getTotalCalories();
                totalDistance += (double) hiTrackMetaData.getTotalDistance();
                totalTime += hiTrackMetaData.getTotalTime();
                Map<String, Integer> wearSportData = hiTrackMetaData.getWearSportData();
                if (wearSportData != null) {
                    if (wearSportData.containsKey("active_time")) {
                        iIntValue += wearSportData.get("active_time").intValue();
                    }
                    if (wearSportData.containsKey("jump_times")) {
                        iIntValue2 += wearSportData.get("jump_times").intValue();
                    }
                    if (wearSportData.containsKey("max_duration_of_passage") && wearSportData.get("max_duration_of_passage").intValue() > iIntValue3) {
                        iIntValue3 = wearSportData.get("max_duration_of_passage").intValue();
                    }
                    if (wearSportData.containsKey("max_jump_height") && wearSportData.get("max_jump_height").intValue() > iIntValue4) {
                        iIntValue4 = wearSportData.get("max_jump_height").intValue();
                    }
                    if (wearSportData.containsKey("max_spriting_speed") && wearSportData.get("max_spriting_speed").intValue() > iIntValue5) {
                        iIntValue5 = wearSportData.get("max_spriting_speed").intValue();
                    }
                }
            }
        }
        int syncStatus = hiHealthData.getSyncStatus();
        a(this.ab, 42310, syncStatus, totalSteps, 1);
        a(this.ab, 42301, syncStatus, totalDistance, 2);
        a(this.ab, 42302, syncStatus, totalCalories, 3);
        a(this.ab, 42303, syncStatus, totalTime, 13);
        a(this.ab, 42304, syncStatus, i, 16);
        a(this.ab, 42305, syncStatus, iIntValue, 13);
        a(this.ab, 42306, syncStatus, iIntValue2, 16);
        a(this.ab, 42307, syncStatus, iIntValue3, 13);
        a(this.ab, 42308, syncStatus, iIntValue4, 2);
        a(this.ab, 42309, syncStatus, iIntValue5, 14);
        a(this.ab, 42311, syncStatus, i2, 16);
    }

    private void b(List<String> list, HiHealthData hiHealthData, Integer[] numArr) {
        boolean zEquals = Arrays.equals(HiDicHealthDataStat.f12563c, numArr);
        if (this.ac <= 0) {
            LogUtil.j("HiH_HiTrackStat", "statDayTrack userClient <= 0");
            return;
        }
        if (list == null) {
            LogUtil.d("HiH_HiTrackStat", "statDayTrack sequenceMetaDatas is null");
            list = new ArrayList<>(10);
        }
        LogUtil.d("HiH_HiTrackStat", "statDayTrack sequenceMetaDatas = ", Integer.valueOf(list.size()), ",mStatClient = ", Integer.valueOf(this.ac));
        d();
        e(list, zEquals);
        e(hiHealthData, numArr, zEquals);
    }

    private void e(HiHealthData hiHealthData, Integer[] numArr, boolean z) {
        int syncStatus = hiHealthData.getSyncStatus();
        a(this.ab, numArr[0].intValue(), syncStatus, this.an, 1);
        a(this.ab, numArr[1].intValue(), syncStatus, this.af, 2);
        a(this.ab, numArr[2].intValue(), syncStatus, this.ag, 3);
        a(this.ab, numArr[3].intValue(), syncStatus, this.al, 13);
        a(this.ab, numArr[4].intValue(), syncStatus, this.ah, 16);
        a(this.ab, numArr[5].intValue(), syncStatus, this.ae, 16);
        a(this.ab, numArr[7].intValue(), syncStatus, this.l, 2);
        int i = this.r;
        if (i == 0 || (i >= 21 && i <= 88)) {
            a(this.ab, numArr[8].intValue(), syncStatus, this.r, 0);
            if (z) {
                int i2 = this.r;
                if (i2 == 0) {
                    c();
                } else {
                    b(this.ab, 42007, syncStatus, i2, 0);
                }
            }
        }
        a(this.ab, numArr[9].intValue(), syncStatus, this.g, 4);
        if (this.y == 220 && ((Set) Arrays.stream(numArr).collect(Collectors.toSet())).contains(42413)) {
            a(this.ab, 42413, syncStatus, this.ak, 16);
            a(this.ab, 42412, syncStatus, Math.round(this.ak / ((double) this.ah)), 16);
        }
        int i3 = this.y;
        if (i3 == 217 || i3 == 218 || i3 == 219) {
            a(this.ab, 42362, syncStatus, Math.round(this.ai * 100.0d) / 100.0d, 4);
        }
        if (this.y == 283) {
            a(this.ab, 12, syncStatus, this.m, 16);
        }
        if (this.y == 274) {
            a(this.ab, 25, syncStatus, this.x, 13);
        }
        int i4 = this.y;
        if (i4 == 258 || i4 == 264 || i4 == 280) {
            a(this.ab, 42112, syncStatus, this.n, 8);
            a(this.ab, 42113, syncStatus, this.k, 13);
        }
        if (z) {
            c(this.s, this.ab, syncStatus);
        }
    }

    private void e(List<String> list, boolean z) {
        int iIntValue;
        int i;
        Iterator<String> it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(it.next(), HiTrackMetaData.class);
            if (z && 512 == hiTrackMetaData.getSportType()) {
                LogUtil.d("HiH_HiTrackStat", "statDayTrack TRIATHLON don't stat in total");
            } else {
                this.y = hiTrackMetaData.getSportType();
                this.ah++;
                if (hiTrackMetaData.getAbnormalTrack() == 0 && (((i = this.y) == 258 || i == 264 || i == 280) && !z2)) {
                    if (hiTrackMetaData.getExtendTrackMap().containsKey("lthrHr")) {
                        this.n = CommonUtil.j(hiTrackMetaData.getExtendTrackMap().get("lthrHr"));
                    }
                    if (hiTrackMetaData.getExtendTrackMap().containsKey("lthrPace")) {
                        this.k = CommonUtil.j(hiTrackMetaData.getExtendTrackMap().get("lthrPace"));
                    }
                    if (this.n != 0 || this.k != 0) {
                        z2 = true;
                    }
                }
                if (hiTrackMetaData.getAbnormalTrack() != 0 || hiTrackMetaData.getDuplicated() != 0) {
                    LogUtil.j("HiH_HiTrackStat", "statDayTrack is abnormalTrack or duplicated");
                    this.ae++;
                } else {
                    this.ag += (double) hiTrackMetaData.getTotalCalories();
                    this.an += (double) hiTrackMetaData.getTotalSteps();
                    this.af += (double) hiTrackMetaData.getTotalDistance();
                    this.al += hiTrackMetaData.getTotalTime();
                    float avgPace = hiTrackMetaData.getAvgPace();
                    this.q = avgPace;
                    this.s += (double) avgPace;
                    this.g += (double) hiTrackMetaData.getCreepingWave();
                    this.ak += a(hiTrackMetaData.getExtendTrackMap());
                    this.ai += (double) hiTrackMetaData.getTotalDescent();
                    Map<String, Integer> wearSportData = hiTrackMetaData.getWearSportData();
                    if (wearSportData != null && wearSportData.containsKey("max_met") && (iIntValue = ((int) (wearSportData.get("max_met").intValue() * 3.5f)) / 65536) > this.r) {
                        this.r = iIntValue;
                    }
                    double totalDistance = hiTrackMetaData.getTotalDistance();
                    double totalDistance2 = this.l;
                    if (totalDistance > totalDistance2) {
                        totalDistance2 = hiTrackMetaData.getTotalDistance();
                    }
                    this.l = totalDistance2;
                    b(hiTrackMetaData);
                    if (hiTrackMetaData.getSportType() == 274) {
                        String str = hiTrackMetaData.getExtendTrackMap().get("rowMachinePowerModeTime");
                        try {
                            this.x += str == null ? 0.0d : Double.parseDouble(str);
                        } catch (NumberFormatException unused) {
                            ReleaseLogUtil.a("HiH_HiTrackStat", "get RowMachinePowerModeTime NumberFormatException, time is ", str);
                        }
                    }
                }
            }
        }
    }

    private double a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("golfSwingCount");
            if (StringUtils.g(str)) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("HiH_HiTrackStat", "Invalid golfSwingCount:" + str);
            }
        }
        return 0.0d;
    }

    private void b(HiTrackMetaData hiTrackMetaData) {
        int i;
        if (hiTrackMetaData.getSportType() == 283) {
            String str = hiTrackMetaData.getExtendTrackMap().get("skipNum");
            if (str == null) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    ReleaseLogUtil.a("HiH_HiTrackStat", "get JumpTimes NumberFormatException, time is ", str);
                    return;
                }
            }
            this.m += i;
        }
    }

    private void d() {
        this.af = 0.0d;
        this.al = 0.0d;
        this.ag = 0.0d;
        this.an = 0.0d;
        this.ah = 0;
        this.ae = 0;
        this.l = 0.0d;
        this.g = 0.0d;
        this.r = 0;
        this.s = 0.0d;
        this.q = 0.0f;
        this.m = 0;
        this.n = 0;
        this.k = 0;
        this.x = 0.0d;
        this.ak = 0.0d;
        this.ai = 0.0d;
        this.y = 30001;
    }

    private void c(double d2, int i, int i2) {
        a(i, 42004, i2, d2, 14);
        a(i, 43800, i2, this.u | this.ar | this.w | this.p | this.v | this.t, 0);
        if (i == HiDateUtil.e(System.currentTimeMillis(), this.ad)) {
            LogUtil.d("HiH_HiTrackStat", "statDayTrack today track Stat changed ! ");
            HiBroadcastUtil.b(this.mContext, 2);
        }
    }

    private Map<String, List<String>> e(List<String> list) {
        this.ar = 0;
        this.w = 0;
        this.p = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        ArrayMap arrayMap = new ArrayMap();
        if (HiCommonUtil.b(list)) {
            LogUtil.j("HiH_HiTrackStat", "getSportTypeSequenceData sequenceMetaDatas is null");
            this.aj.clear();
            return arrayMap;
        }
        e(list, arrayMap);
        return arrayMap;
    }

    private void e(List<String> list, Map<String, List<String>> map) {
        b();
        for (String str : list) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
            if (d(hiTrackMetaData)) {
                this.ax.add(str);
            }
            int sportType = hiTrackMetaData.getSportType();
            if (sportType == 227) {
                this.as.add(str);
            } else {
                if (sportType != 262) {
                    if (sportType == 264) {
                        this.as.add(str);
                        this.v = 2;
                    } else if (sportType != 266) {
                        switch (sportType) {
                            case 257:
                                break;
                            case 258:
                                this.as.add(str);
                                this.w = 8;
                                continue;
                            case 259:
                                this.ap.add(str);
                                this.p = 4;
                                continue;
                            default:
                                switch (sportType) {
                                    case OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE /* 280 */:
                                        this.as.add(str);
                                        this.u = 32;
                                        continue;
                                    case 281:
                                    case 282:
                                        break;
                                    default:
                                        e(sportType, str);
                                        continue;
                                }
                                break;
                        }
                        this.au.add(str);
                        this.ar = 16;
                    }
                }
                this.aq.add(str);
                this.t = 1;
            }
        }
        c(map);
    }

    private void e(int i, String str) {
        if (i == 271) {
            this.f.add(str);
            return;
        }
        if (i == 512) {
            this.at.add(str);
            this.t = 1;
            return;
        }
        switch (i) {
            case 217:
            case 218:
            case 219:
                this.ao.add(str);
                break;
            case HeartRateThresholdConfig.HEART_RATE_LIMIT /* 220 */:
                this.i.add(str);
                break;
            default:
                d(i, str);
                this.t = 1;
                break;
        }
    }

    private void d(int i, String str) {
        List<String> arrayList = this.aj.get(String.valueOf(i));
        if (HiCommonUtil.b(arrayList)) {
            arrayList = new ArrayList<>(10);
        }
        arrayList.add(str);
        this.aj.put(String.valueOf(i), arrayList);
    }

    private void c(Map<String, List<String>> map) {
        map.put("walk_type_datas", this.au);
        map.put("run_type_datas", this.as);
        map.put("ride_type_datas", this.ap);
        map.put("swim_type_datas", this.aq);
        map.put("triathlon_type_datas", this.at);
        map.put("wear_device_type_datas", this.ax);
        map.put("basketball_type_datas", this.f);
        map.put("ski_type_datas", this.ao);
        map.put("golf_type_datas", this.i);
    }

    private void b() {
        this.au.clear();
        this.as.clear();
        this.ap.clear();
        this.aq.clear();
        this.at.clear();
        this.ax.clear();
        this.f.clear();
        this.i.clear();
        this.ao.clear();
        this.aj.clear();
    }

    private boolean d(HiTrackMetaData hiTrackMetaData) {
        int trackType = hiTrackMetaData.getTrackType();
        return trackType == 3 || trackType == 4 || trackType == 5 || trackType == 6;
    }

    private boolean a(int i, int i2, int i3, double d2, int i4) {
        kuk kukVarC = c(i, i2, i3, d2, i4);
        if (i2 < 50) {
            kukVarC.e(this.y);
        }
        if (d2 <= 0.0d) {
            LogUtil.d("HiH_HiTrackStat", "saveOneTrackStat delete old stat , because new stat is zero ! statDate = ", Integer.valueOf(i), ",mStatClient = ", Integer.valueOf(this.ac), ", statType = ", Integer.valueOf(i2));
            return this.mDataStatManager.e(kukVarC);
        }
        return this.mDataStatManager.b(kukVarC);
    }

    private kuk c(int i, int i2, int i3, double d2, int i4) {
        kuk kukVar = new kuk();
        kukVar.b(i);
        kukVar.e(30001);
        kukVar.a(this.ac);
        kukVar.h(this.am);
        kukVar.i(i3);
        kukVar.f(i4);
        kukVar.d(i2);
        kukVar.c(d2);
        return kukVar;
    }

    private boolean b(int i, int i2, int i3, double d2, int i4) {
        return this.mDataStatManager.a(c(i, i2, i3, d2, i4));
    }

    private void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, jCurrentTimeMillis);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        List<HiHealthData> listD = this.mDataStatManager.d(hiDataReadOption, 42006, this.ac, (kth) null);
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("HiH_HiTrackStat", "getLastVo2max vo2maxListSport is null");
        } else {
            b(HiDateUtil.e(listD.get(0).getStartTime(), this.ad), 42007, 1, listD.get(0).getIntValue(), 0);
        }
    }

    public boolean e(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.am = hiHealthData.getUserId();
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), this.ad);
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), this.ad);
        int type = hiHealthData.getType();
        List<Integer> listC = this.z.c(this.am);
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("HiH_HiTrackStat", "statOldData() clientIds is null");
            return false;
        }
        List<String> listE = this.o.e(listC, jA, jC, type);
        this.ac = this.aa.e(0, this.am, 0);
        e(listE, hiHealthData);
        LogUtil.a("HiH_HiTrackStat", "statOldData() mTotalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    private void e(List<String> list, HiHealthData hiHealthData) {
        int iIntValue;
        if (this.ac <= 0) {
            LogUtil.j("HiH_HiTrackStat", "statDayTrack userClient <= 0");
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("HiH_HiTrackStat", "statDayTrack sequenceMetaDatas is null");
            return;
        }
        LogUtil.d("HiH_HiTrackStat", "statDayTrack sequenceMetaDatas = ", Integer.valueOf(list.size()), ",mStatClient = ", Integer.valueOf(this.ac));
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map<String, Integer> wearSportData = ((HiTrackMetaData) HiJsonUtil.d(it.next(), HiTrackMetaData.class)).getWearSportData();
            if (wearSportData != null && wearSportData.containsKey("max_met") && (iIntValue = ((int) (wearSportData.get("max_met").intValue() * 3.5f)) / 65536) > i) {
                i = iIntValue;
            }
        }
        int syncStatus = hiHealthData.getSyncStatus();
        if (21 > i || i > 88) {
            return;
        }
        double d2 = i;
        a(this.ab, 42006, syncStatus, d2, 0);
        b(this.ab, 42007, syncStatus, d2, 0);
    }

    public void d(int i) {
        String str = "is_handle_history_golf_data_stat" + i;
        if (SharedPreferenceManager.b("HiHealthService", str, false)) {
            return;
        }
        ReleaseLogUtil.d("HiH_HiTrackStat", "Start to handleHistoryGolfTrack");
        List<Integer> listC = this.z.c(i);
        if (listC == null || listC.isEmpty()) {
            SharedPreferenceManager.a("HiHealthService", str, true);
            ReleaseLogUtil.e("HiH_HiTrackStat", "handleHistoryGolfTrack clientIds is null");
            return;
        }
        int iE = kud.a().e();
        this.am = iE;
        this.ac = this.aa.e(0, iE, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (long j2 = 1546272000000L; j2 < jCurrentTimeMillis; j2 += 62208000001L) {
            c(j2, j2 + 62208000000L, listC);
        }
        SharedPreferenceManager.a("HiHealthService", str, true);
        ReleaseLogUtil.d("HiH_HiTrackStat", "End to handleHistoryGolfTrack totalTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void b(int i) {
        String str = i + "_reviseSkiTotalDescent";
        if (SharedPreferenceManager.b("HiHealthService", str, false)) {
            return;
        }
        try {
            try {
                ReleaseLogUtil.d("HiH_HiTrackStat", "Start to reviseSkiTotalDescent");
                List<Integer> listC = this.z.c(i);
                if (njy.e(listC)) {
                    ReleaseLogUtil.a("HiH_HiTrackStat", "reviseSkiTotalDescent clientIds is empty");
                    SharedPreferenceManager.a("HiHealthService", str, true);
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<HiHealthData> arrayList = new ArrayList();
                Iterator it = Arrays.asList(217, 218, 219).iterator();
                while (it.hasNext()) {
                    List<HiHealthData> listE = this.o.e(listC, 0L, jCurrentTimeMillis, 30001, ((Integer) it.next()).intValue());
                    if (!njy.e(listE)) {
                        arrayList.addAll(listE);
                    }
                }
                HashMap map = new HashMap();
                for (HiHealthData hiHealthData : arrayList) {
                    try {
                        if (hiHealthData.getMetaData() != null) {
                            double dOptDouble = new JSONObject(hiHealthData.getMetaData()).optDouble("mTotalDescent", 0.0d);
                            int iE = HiDateUtil.e(hiHealthData.getStartTime(), TimeZone.getDefault());
                            map.put(Integer.valueOf(iE), Double.valueOf(((Double) map.getOrDefault(Integer.valueOf(iE), Double.valueOf(0.0d))).doubleValue() + dOptDouble));
                        }
                    } catch (Exception e2) {
                        LogUtil.e("HiH_HiTrackStat", "Failed to parse metaData:", ExceptionUtils.c(e2));
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    double dRound = Math.round(((Double) entry.getValue()).doubleValue() * 100.0d) / 100.0d;
                    ReleaseLogUtil.d("HiH_HiTrackStat", "reviseSkiTotalDescent date=", entry.getKey(), ", value=", Double.valueOf(dRound));
                    a(((Integer) entry.getKey()).intValue(), 42362, 0, dRound, 4);
                }
                ReleaseLogUtil.d("HiH_HiTrackStat", "End to reviseSkiTotalDescent");
                SharedPreferenceManager.a("HiHealthService", str, true);
            } catch (Exception e3) {
                ReleaseLogUtil.a("HiH_HiTrackStat", "Failed to reviseSkiTotalDescent cause: ", ExceptionUtils.c(e3));
            }
        } catch (Throwable th) {
            SharedPreferenceManager.a("HiHealthService", str, true);
            throw th;
        }
    }

    private void c(long j2, long j3, List<Integer> list) {
        List<HiHealthData> listE = this.o.e(list, j2, j3, 30001, HeartRateThresholdConfig.HEART_RATE_LIMIT);
        ReleaseLogUtil.d("HiH_HiTrackStat", "handleHistoryGolfTrack startTime=", Long.valueOf(j2), ", endTime=", Long.valueOf(j3), ", size=", Integer.valueOf(listE.size()));
        if (njy.e(listE)) {
            return;
        }
        Map map = (Map) listE.stream().collect(Collectors.groupingBy(new Function() { // from class: lgk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                return Integer.valueOf(HiDateUtil.e(hiHealthData.getStartTime(), HiDateUtil.b(hiHealthData.getTimeZone())));
            }
        }));
        for (Integer num : map.keySet()) {
            List list2 = (List) map.get(num);
            Iterator it = list2.iterator();
            int iA = 0;
            while (it.hasNext()) {
                try {
                    iA = (int) (((double) iA) + a(((HiTrackMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiTrackMetaData.class)).getExtendTrackMap()));
                } catch (Exception e2) {
                    ReleaseLogUtil.a("HiH_HiTrackStat", "Failed to fromJson trackMetaData", ExceptionUtils.c(e2));
                }
            }
            a(num.intValue(), 42413, 0, iA, 16);
            long jRound = Math.round(iA / list2.size());
            a(num.intValue(), 42412, 0, jRound, 16);
            LogUtil.a("HiH_HiTrackStat", "handleHistoryGolfTrack day=", num, ", statType=", 42413, ", sum=", Integer.valueOf(iA), ", avg=", Long.valueOf(jRound));
        }
    }
}
