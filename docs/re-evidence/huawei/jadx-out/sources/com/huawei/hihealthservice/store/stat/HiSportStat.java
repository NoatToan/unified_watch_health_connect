package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.kuk;
import defpackage.kxo;
import defpackage.kyj;
import defpackage.kyn;
import defpackage.lgg;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class HiSportStat extends HiStatCommon {
    private static final String[] e = {"step", "distance", "calorie", "altitude_offset", "pushesVal"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kxo f12580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyn f12581c;
    private kyj d;
    private int g;
    private int h;

    public HiSportStat(Context context) {
        super(context);
        this.f12580b = kxo.a();
        this.f12581c = kyn.d(this.mContext);
        this.d = kyj.c();
    }

    @Override // com.huawei.hihealthservice.store.stat.HiStatCommon
    public boolean stat(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault());
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), TimeZone.getDefault());
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jA);
        hiAggregateOption.setEndTime(jC);
        hiAggregateOption.setType(new int[]{2, 3, 4, 5, 8});
        hiAggregateOption.setConstantsKey(e);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(1);
        this.h = hiHealthData.getSyncStatus();
        this.g = hiHealthData.getUserId();
        d(hiAggregateOption, jA);
        d(hiHealthData);
        b(hiHealthData);
        if (e(hiHealthData)) {
            LogUtil.d("Debug_HiSportStat", "stat() send  stepSum change broadcast");
            HiBroadcastUtil.h(this.mContext);
            HiBroadcastUtil.e(this.mContext, 1);
        }
        LogUtil.d("Debug_HiSportStat", "stat() totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    private boolean e(HiHealthData hiHealthData) {
        return (hiHealthData.getDay() == ((long) HiDateUtil.d(System.currentTimeMillis())) && (hiHealthData.getDeviceUuid() != null && !FoundationCommonUtil.getAndroidId(this.mContext).equals(hiHealthData.getDeviceUuid()))) || (40054 == hiHealthData.getType());
    }

    private void d(HiHealthData hiHealthData) {
        LogUtil.d("Debug_HiSportStat", "saveDeviceDayStepsSum() enter");
        lgg.b(hiHealthData);
    }

    private void b(HiHealthData hiHealthData) {
        LogUtil.d("Debug_HiSportStat", "saveDeviceDayPushesSum() enter");
        lgg.d(hiHealthData);
    }

    private boolean d(HiAggregateOption hiAggregateOption, long j) {
        int iE = this.f12581c.e(0, this.g, 0);
        this.f12579a = iE;
        if (iE <= 0) {
            return false;
        }
        List<Integer> listC = this.d.c(this.g);
        if (HiCommonUtil.b(listC)) {
            return true;
        }
        d(hiAggregateOption, listC, j);
        return true;
    }

    private boolean d(HiAggregateOption hiAggregateOption, List<Integer> list, long j) {
        hiAggregateOption.setAlignType(20001);
        List<HiHealthData> listG = this.f12580b.g(list, hiAggregateOption);
        hiAggregateOption.setGroupUnitType(8);
        b(listG, this.f12580b.c(list, hiAggregateOption), j);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAlignType(20002);
        g(this.f12580b.a(list, hiAggregateOption), j);
        hiAggregateOption.setAlignType(20003);
        c(this.f12580b.a(list, hiAggregateOption), j);
        hiAggregateOption.setAlignType(20005);
        b(this.f12580b.a(list, hiAggregateOption), j);
        hiAggregateOption.setAlignType(20004);
        e(this.f12580b.a(list, hiAggregateOption), j);
        hiAggregateOption.setAlignType(20007);
        f(this.f12580b.a(list, hiAggregateOption), j);
        hiAggregateOption.setAlignType(20010);
        d(this.f12580b.a(list, hiAggregateOption), j);
        HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
        hiAggregateOption2.setStartTime(hiAggregateOption.getStartTime());
        hiAggregateOption2.setEndTime(hiAggregateOption.getEndTime());
        hiAggregateOption2.setType(new int[]{20001});
        hiAggregateOption2.setConstantsKey(new String[]{"duration"});
        hiAggregateOption2.setGroupUnitType(3);
        hiAggregateOption2.setAggregateType(1);
        a(this.f12580b.d(list, hiAggregateOption2, null), j);
        return true;
    }

    private boolean b(List<HiHealthData> list, List<HiHealthData> list2, long j) {
        if (HiCommonUtil.b(list) || HiCommonUtil.b(list2)) {
            LogUtil.j("Debug_HiSportStat", "saveAllSessionStat()  statDatas or deviceDatas is null");
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        String[] strArr = e;
        double d = hiHealthData.getDouble(strArr[0]);
        double d2 = hiHealthData.getDouble(strArr[1]);
        char c2 = 2;
        double d3 = hiHealthData.getDouble(strArr[2]);
        char c3 = 3;
        double d4 = hiHealthData.getDouble(strArr[3]);
        double d5 = hiHealthData.getDouble(strArr[4]);
        boolean zA = a(hiHealthData);
        double d6 = d;
        for (HiHealthData hiHealthData2 : list2) {
            String[] strArr2 = e;
            double d7 = hiHealthData2.getDouble(strArr2[0]);
            double d8 = hiHealthData2.getDouble(strArr2[1]);
            double d9 = hiHealthData2.getDouble(strArr2[c2]);
            double d10 = hiHealthData2.getDouble(strArr2[c3]);
            double d11 = hiHealthData2.getDouble(strArr2[4]);
            if (zA) {
                LogUtil.a("HiH_HiSportStat", "saveSessionStat device Stat");
            }
            if (d6 < d7) {
                d6 = d7;
            }
            if (d2 < d8) {
                d2 = d8;
            }
            if (d3 < d9) {
                d3 = d9;
            }
            if (d4 < d10) {
                d4 = d10;
            }
            if (d5 < d11) {
                d5 = d11;
            }
            c2 = 2;
            c3 = 3;
        }
        int iD = HiDateUtil.d(hiHealthData.getStartTime());
        d(j, d6, iD);
        a(j, d2, iD);
        b(j, d3, iD);
        e(j, d4, iD);
        c(j, d5, iD);
        return true;
    }

    private boolean a(HiHealthData hiHealthData) {
        if (HiDateUtil.d(hiHealthData.getStartTime()) != HiDateUtil.d(System.currentTimeMillis())) {
            return false;
        }
        LogUtil.a("HiH_HiSportStat", "isLogFlag saveSessionStat merge");
        return true;
    }

    private void e(long j, double d, int i) {
        LogUtil.a("Debug_HiSportStat", "saveAllSessionStat()  altitude change = ", Boolean.valueOf(e(j, SmartMsgConstant.MSG_TYPE_RIDE_USER, lgg.e(lgg.a(this.mContext, this.g, i, SmartMsgConstant.MSG_TYPE_RIDE_USER), d, this.h), d, 4)));
    }

    private void c(long j, double d, int i) {
        LogUtil.a("Debug_HiSportStat", "saveAllSessionStat()  pushes change = ", Boolean.valueOf(e(j, 40008, lgg.e(lgg.a(this.mContext, this.g, i, 40008), d, this.h), d, 16)));
    }

    private void b(long j, double d, int i) {
        LogUtil.a("Debug_HiSportStat", "saveAllSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40003, lgg.e(lgg.a(this.mContext, this.g, i, 40003), d, this.h), d, 3)));
    }

    private void a(long j, double d, int i) {
        LogUtil.a("Debug_HiSportStat", "saveAllSessionStat()  distance change = ", Boolean.valueOf(e(j, 40004, lgg.e(lgg.a(this.mContext, this.g, i, 40004), d, this.h), d, 2)));
    }

    private void d(long j, double d, int i) {
        LogUtil.a("Debug_HiSportStat", "saveAllSessionStat()  step change = ", Boolean.valueOf(e(j, 40002, lgg.e(lgg.a(this.mContext, this.g, i, 40002), d, this.h), d, 1)));
    }

    private boolean g(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            LogUtil.j("Debug_HiSportStat", "saveWalkSessionStat()  statDatas is null");
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        int i = this.h;
        String[] strArr = e;
        LogUtil.d("Debug_HiSportStat", "saveWalkSessionStat()  step change = ", Boolean.valueOf(e(j, 40011, i, hiHealthData.getDouble(strArr[0]), 1)));
        LogUtil.d("Debug_HiSportStat", "saveWalkSessionStat()  distance change = ", Boolean.valueOf(e(j, 40031, this.h, hiHealthData.getDouble(strArr[1]), 2)));
        LogUtil.d("Debug_HiSportStat", "saveWalkSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40021, this.h, hiHealthData.getDouble(strArr[2]), 3)));
        return true;
    }

    private boolean c(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        int i = this.h;
        String[] strArr = e;
        LogUtil.d("Debug_HiSportStat", "saveRunSessionStat()  step change = ", Boolean.valueOf(e(j, 40012, i, hiHealthData.getDouble(strArr[0]), 1)));
        LogUtil.d("Debug_HiSportStat", "saveRunSessionStat()  distance change = ", Boolean.valueOf(e(j, 40032, this.h, hiHealthData.getDouble(strArr[1]), 2)));
        LogUtil.d("Debug_HiSportStat", "saveRunSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40022, this.h, hiHealthData.getDouble(strArr[2]), 3)));
        return true;
    }

    private boolean b(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        int i = this.h;
        String[] strArr = e;
        LogUtil.d("Debug_HiSportStat", "saveCycleSessionStat()  distance change = ", Boolean.valueOf(e(j, 40033, i, hiHealthData.getDouble(strArr[1]), 2)));
        LogUtil.d("Debug_HiSportStat", "saveCycleSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40023, this.h, hiHealthData.getDouble(strArr[2]), 3)));
        return true;
    }

    private boolean e(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        int i = this.h;
        String[] strArr = e;
        LogUtil.d("Debug_HiSportStat", "saveClimbSessionStat()  step change = ", Boolean.valueOf(e(j, 40013, i, hiHealthData.getDouble(strArr[0]), 1)));
        LogUtil.d("Debug_HiSportStat", "saveClimbSessionStat()  distance change = ", Boolean.valueOf(e(j, 40034, this.h, hiHealthData.getDouble(strArr[1]), 2)));
        LogUtil.d("Debug_HiSportStat", "saveClimbSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40024, this.h, hiHealthData.getDouble(strArr[2]), 3)));
        return true;
    }

    private boolean f(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        LogUtil.a("Debug_HiSportStat", "saveSwimSessionStat()  statDatas = ", list);
        int i = this.h;
        String[] strArr = e;
        LogUtil.d("Debug_HiSportStat", "saveSwimSessionStat()  distance change = ", Boolean.valueOf(e(j, 40035, i, hiHealthData.getDouble(strArr[1]), 2)));
        LogUtil.d("Debug_HiSportStat", "saveSwimSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40025, this.h, hiHealthData.getDouble(strArr[2]), 3)));
        return true;
    }

    private boolean d(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        HiHealthData hiHealthData = list.get(0);
        LogUtil.a("Debug_HiSportStat", "saveFitnessSessionStat()  statDatas = ", list);
        LogUtil.d("Debug_HiSportStat", "saveFitnessSessionStat()  calorie change = ", Boolean.valueOf(e(j, 40054, this.h, hiHealthData.getDouble(e[2]), 3)));
        return true;
    }

    private boolean a(List<HiHealthData> list, long j) {
        if (HiCommonUtil.b(list)) {
            return false;
        }
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        for (HiHealthData hiHealthData : list) {
            switch (hiHealthData.getType()) {
                case 20002:
                    d = hiHealthData.getDouble("duration");
                    break;
                case 20003:
                    d2 = hiHealthData.getDouble("duration");
                    break;
                case 20004:
                    d4 = hiHealthData.getDouble("duration");
                    break;
                case 20005:
                    d3 = hiHealthData.getDouble("duration");
                    break;
                case 20007:
                    d5 = hiHealthData.getDouble("duration");
                    break;
            }
        }
        c(40041, j, d);
        c(40042, j, d2);
        c(40043, j, d3);
        c(40044, j, d4);
        c(40045, j, d5);
        c(SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER, j, d + d2 + d3 + d4 + d5);
        return true;
    }

    private void c(int i, long j, double d) {
        LogUtil.d("Debug_HiSportStat", "saveDurationSessionStat() ", Integer.valueOf(i), " change = ", Boolean.valueOf(e(j, i, this.h, d, 13)));
    }

    private boolean e(long j, int i, int i2, double d, int i3) {
        if (d < 1.0E-6d) {
            LogUtil.j("Debug_HiSportStat", "saveOneSportStat()  statValue is ", Double.valueOf(d));
            return false;
        }
        if (d == 0.0d && !d().contains(Integer.valueOf(i))) {
            return false;
        }
        kuk kukVar = new kuk();
        kukVar.c(j);
        kukVar.e(20001);
        kukVar.a(this.f12579a);
        kukVar.h(this.g);
        kukVar.i(i2);
        kukVar.f(i3);
        kukVar.d(i);
        kukVar.c(d);
        return this.mDataStatManager.b(kukVar);
    }

    private List<Integer> d() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(40011);
        arrayList.add(40031);
        arrayList.add(40021);
        arrayList.add(40012);
        arrayList.add(40032);
        arrayList.add(40022);
        arrayList.add(40013);
        arrayList.add(40034);
        arrayList.add(40024);
        arrayList.add(40033);
        arrayList.add(40023);
        arrayList.add(40035);
        arrayList.add(40025);
        return arrayList;
    }
}
