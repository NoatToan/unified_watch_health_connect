package defpackage;

import android.util.Pair;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes13.dex */
public class ovp extends BaseCalculator {
    private PluginAchieveAdapter d = getPluginAchieveAdapter();

    static /* synthetic */ HiHealthData c(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        return hiHealthData2;
    }

    static /* synthetic */ HiHealthData d(HiHealthData hiHealthData) {
        return hiHealthData;
    }

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        b(i);
    }

    private void b(int i) {
        if (this.d == null) {
            this.d = oru.a(BaseApplication.getContext()).getAdapter();
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        ArrayList arrayList = new ArrayList();
        d(jA, jA2, countDownLatch, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b(jA, jA2, countDownLatch, arrayList3, arrayList2);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_LivingCalculator", "getDietRecordData.await(): catch InterruptedException");
        }
        long size = arrayList.size();
        LogUtil.a("PLGACHIEVE_LivingCalculator", "getLivingRecordData threeRingReachNum = ", Long.valueOf(size), " finishThreeCircleDayList =", arrayList.toString());
        insertData(i, EnumAnnualType.REPORT_LIVING.value(), PrebakedEffectId.RT_SPRING, String.valueOf(size));
        int iC = owj.c(arrayList);
        LogUtil.a("PLGACHIEVE_LivingCalculator", "getLivingRecordData maxContinuousThreeRingDay = ", Integer.valueOf(iC));
        insertData(i, EnumAnnualType.REPORT_LIVING.value(), PrebakedEffectId.RT_SWING, String.valueOf(iC));
        int size2 = arrayList2.size();
        LogUtil.a("PLGACHIEVE_LivingCalculator", "getLivingRecordData cloversReachNum = ", Integer.valueOf(size2), " finishCloversDayList =", arrayList2.toString());
        insertData(i, EnumAnnualType.REPORT_LIVING.value(), PrebakedEffectId.RT_WIND, String.valueOf(size2));
        int iC2 = owj.c(arrayList2);
        LogUtil.a("PLGACHIEVE_LivingCalculator", "getLivingRecordData maxContinuousCloversDay = ", Integer.valueOf(iC2));
        insertData(i, EnumAnnualType.REPORT_LIVING.value(), PrebakedEffectId.RT_VICTORY, String.valueOf(iC2));
        int size3 = arrayList3.size();
        LogUtil.a("PLGACHIEVE_LivingCalculator", "getLivingRecordData cloverLeafReachNum = ", Integer.valueOf(size3), " finishRelaxDayList =", arrayList3.toString());
        insertData(i, EnumAnnualType.REPORT_LIVING.value(), PrebakedEffectId.RT_AWARD, String.valueOf(size3));
    }

    private void d(final long j, final long j2, final CountDownLatch countDownLatch, final List<Long> list) {
        LogUtil.a("PLGACHIEVE_LivingCalculator", "dealHistoryThreeCircleData startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthData(a(new Pair<>(Long.valueOf(j), Long.valueOf(j2))), new HiAggregateListener() { // from class: ovp.1
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list2, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(final List<HiHealthData> list2, int i, int i2) {
                if (njy.e(list2)) {
                    LogUtil.j("PLGACHIEVE_LivingCalculator", "getThreeCircleRecordData dataList isEmpty!");
                    countDownLatch.countDown();
                } else {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: ovp.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ovp.this.e(j, j2, countDownLatch, list, list2);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final long j, final long j2, final CountDownLatch countDownLatch, final List<Long> list, final List<HiHealthData> list2) {
        LogUtil.a("PLGACHIEVE_LivingCalculator", "dealHistoryThreeCircleData startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("900200007");
        arrayList.add("900200008");
        arrayList.add("900200009");
        qgm.a(arrayList, new IBaseResponseCallback() { // from class: ovo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f44875a.c(j, j2, list, list2, countDownLatch, i, obj);
            }
        });
    }

    /* synthetic */ void c(long j, long j2, final List list, final List list2, final CountDownLatch countDownLatch, int i, Object obj) {
        final int iD = d(obj, "900200007");
        final int iD2 = d(obj, "900200008");
        final int iD3 = d(obj, "900200009");
        qhb.c().c(j, j2, new ResponseCallback() { // from class: ovs
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj2) {
                this.f44881a.b(list, list2, iD, iD2, iD3, countDownLatch, i2, (List) obj2);
            }
        });
    }

    /* synthetic */ void b(List list, List list2, int i, int i2, int i3, CountDownLatch countDownLatch, int i4, List list3) {
        Map<Long, HiHealthData> map = Collections.EMPTY_MAP;
        if (!njy.e(list3)) {
            map = (Map) list3.stream().collect(Collectors.toMap(new Function() { // from class: ovq
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((HiHealthData) obj).getStartTime());
                }
            }, new Function() { // from class: ovt
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ovp.d((HiHealthData) obj);
                }
            }, new BinaryOperator() { // from class: ovu
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return ovp.c((HiHealthData) obj, (HiHealthData) obj2);
                }
            }));
        }
        d(list, list2, map, i, i2, i3);
        countDownLatch.countDown();
    }

    private int d(Object obj, String str) {
        if (!(obj instanceof HashMap)) {
            return 0;
        }
        HashMap map = (HashMap) obj;
        if (map.get(str) == null) {
            return 0;
        }
        return ((Integer) map.get(str)).intValue();
    }

    private void d(List<Long> list, List<HiHealthData> list2, Map<Long, HiHealthData> map, int i, int i2, int i3) {
        ovp ovpVar = this;
        Map<Long, HiHealthData> map2 = map;
        for (HiHealthData hiHealthData : list2) {
            if (hiHealthData != null) {
                int i4 = hiHealthData.getInt("sport_calorie_sum");
                int i5 = hiHealthData.getInt("durationUserValue");
                int i6 = hiHealthData.getInt("activeUserValue");
                int i7 = hiHealthData.getInt("stepUserValue");
                if (map2.containsKey(Long.valueOf(hiHealthData.getStartTime()))) {
                    HiHealthData hiHealthData2 = map2.get(Long.valueOf(hiHealthData.getStartTime()));
                    if (hiHealthData2 != null) {
                        int iB = ovpVar.b(i, hiHealthData2, "calorieGoalValue");
                        int iB2 = ovpVar.b(i2, hiHealthData2, "durationGoalValue");
                        int iB3 = ovpVar.b(i3, hiHealthData2, "activeGoalValue");
                        int i8 = hiHealthData2.getInt("stepGoalValue");
                        boolean z = hiHealthData2.getInt("calorieIsRingNew") == 1;
                        boolean z2 = i4 >= iB && iB != 0;
                        boolean z3 = i5 >= iB2 && iB2 != 0;
                        boolean z4 = i6 >= iB3 && iB3 != 0;
                        boolean z5 = i7 >= i8 && i8 != 0;
                        if ((z && z2 && z3 && z4) || (!z && z5 && z3 && z4)) {
                            list.add(Long.valueOf(hiHealthData.getStartTime()));
                        }
                    }
                } else {
                    boolean z6 = i != 0 && i4 >= i;
                    boolean z7 = i2 != 0 && i5 >= i2;
                    boolean z8 = i3 != 0 && i6 >= i3;
                    if (z6 && z7 && z8) {
                        list.add(Long.valueOf(hiHealthData.getStartTime()));
                    }
                }
                ovpVar = this;
                map2 = map;
            }
        }
    }

    private int b(int i, HiHealthData hiHealthData, String str) {
        return hiHealthData.getInt(str) == 0 ? i : hiHealthData.getInt(str);
    }

    private HiAggregateOption a(Pair<Long, Long> pair) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(((Long) pair.first).longValue());
        hiAggregateOption.setEndTime(((Long) pair.second).longValue());
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setType(new int[]{40002, 47101, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value(), 40004, 40003, SmartMsgConstant.MSG_TYPE_RIDE_USER});
        hiAggregateOption.setConstantsKey(new String[]{"stepUserValue", "durationUserValue", "activeUserValue", "sport_distance_sum", "sport_calorie_sum", "sport_altitude_offset_sum"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    private void b(long j, long j2, CountDownLatch countDownLatch, List<Long> list, List<Long> list2) {
        List<HealthLifeBean> listE = ffv.e(j, j2);
        if (njy.e(listE)) {
            LogUtil.j("PLGACHIEVE_LivingCalculator", "getThreeCircleRecordData dataList isEmpty!");
            countDownLatch.countDown();
            return;
        }
        for (HealthLifeBean healthLifeBean : listE) {
            if (healthLifeBean != null) {
                long jA = HiDateUtil.a(healthLifeBean.getRecordDay());
                if (healthLifeBean.getId() == 5 && jA != 0 && healthLifeBean.getComplete() >= 1) {
                    list.add(Long.valueOf(jA));
                } else if (healthLifeBean.getId() == 1 && jA != 0 && healthLifeBean.getComplete() >= 1) {
                    list2.add(Long.valueOf(jA));
                }
            }
        }
        countDownLatch.countDown();
    }
}
