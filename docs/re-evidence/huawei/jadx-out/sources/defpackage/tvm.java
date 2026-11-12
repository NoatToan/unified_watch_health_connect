package defpackage;

import android.text.SpannableString;
import android.util.SparseArray;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes43.dex */
public class tvm {
    public static void a(SparseArray<Object> sparseArray, twu twuVar, boolean z) {
        if (sparseArray.size() <= 0) {
            LogUtil.a("BloodOxygenDataUtil", "map.size is 0");
            return;
        }
        List<HiHealthData> arrayList = new ArrayList<>(16);
        Object obj = sparseArray.get(2103);
        if (obj instanceof List) {
            arrayList = (List) obj;
            LogUtil.a("BloodOxygenDataUtil", "oxygenMeasureValueList.size :", Integer.valueOf(arrayList.size()));
        }
        if (njy.b(arrayList)) {
            HiHealthData hiHealthData = arrayList.get(0);
            int intValue = hiHealthData.getIntValue();
            String strE = wua.e(BaseApplication.getContext(), hiHealthData.getLong("start_time"));
            String strE2 = UnitUtil.e(intValue, 2, 0);
            twuVar.a(strE);
            twuVar.d(strE2);
        }
        List<HiHealthData> arrayList2 = new ArrayList<>(16);
        Object obj2 = sparseArray.get(2107);
        if (obj2 instanceof List) {
            arrayList2 = (List) obj2;
            LogUtil.a("BloodOxygenDataUtil", "dealDataMap oxygenRemindValueList: ", arrayList2.toString());
        }
        List<HiHealthData> arrayList3 = new ArrayList(16);
        Object obj3 = sparseArray.get(DicDataTypeUtil.DataType.ALTITUDE_TYPE.value());
        if (obj3 instanceof List) {
            arrayList3 = (List) obj3;
            for (HiHealthData hiHealthData2 : arrayList3) {
                hiHealthData2.putInt("altitudeKey", hiHealthData2.getIntValue());
            }
            LogUtil.a("BloodOxygenDataUtil", "altitudeValueList.size :", Integer.valueOf(arrayList3.size()));
        }
        List<HiHealthData> arrayList4 = new ArrayList<>(16);
        Object obj4 = sparseArray.get(DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value());
        if (obj4 instanceof List) {
            arrayList4 = (List) obj4;
            LogUtil.a("BloodOxygenDataUtil", "lakeLouiseValueList.size :", Integer.valueOf(arrayList4.size()));
        }
        final List<HiHealthData>[] listArr = {new ArrayList(16)};
        final List[] listArr2 = {new ArrayList(16)};
        final List[] listArr3 = {new ArrayList(16)};
        if (z) {
            wbe wbeVar = new wbe();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            wbeVar.c(0, arrayList4, new DataSourceCallback() { // from class: tvn
                @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                public final void onResponse(int i, Object obj5) {
                    tvm.a(listArr, countDownLatch, i, (List) obj5);
                }
            });
            d(countDownLatch);
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            wbeVar.c(1, listArr[0], new DataSourceCallback() { // from class: tvk
                @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                public final void onResponse(int i, Object obj5) {
                    tvm.d(listArr2, countDownLatch2, i, (List) obj5);
                }
            });
            d(countDownLatch2);
            final CountDownLatch countDownLatch3 = new CountDownLatch(1);
            wbeVar.c(1, arrayList2, new DataSourceCallback() { // from class: tvl
                @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
                public final void onResponse(int i, Object obj5) {
                    tvm.b(listArr3, countDownLatch3, i, (List) obj5);
                }
            });
            d(countDownLatch3);
        } else {
            listArr[0] = arrayList;
            listArr2[0] = arrayList3;
            listArr3[0] = arrayList3;
        }
        List<HiHealthData> listB = wua.b(arrayList4, listArr[0], listArr2[0], true);
        wua.a(arrayList2, (List<HiHealthData>) listArr3[0]);
        e(listB, arrayList2, twuVar);
    }

    static /* synthetic */ void a(List[] listArr, CountDownLatch countDownLatch, int i, List list) {
        if (i == 0) {
            listArr[0] = list;
        }
        countDownLatch.countDown();
    }

    static /* synthetic */ void d(List[] listArr, CountDownLatch countDownLatch, int i, List list) {
        if (i == 0) {
            listArr[0] = list;
        }
        countDownLatch.countDown();
    }

    static /* synthetic */ void b(List[] listArr, CountDownLatch countDownLatch, int i, List list) {
        if (i == 0) {
            listArr[0] = list;
        }
        countDownLatch.countDown();
    }

    private static void d(CountDownLatch countDownLatch) {
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("BloodOxygenDataUtil", "countDownLatch exception");
        }
    }

    public static void e(List<HiHealthData> list, List<HiHealthData> list2, twu twuVar) {
        List<HiHealthData> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        Collections.sort(arrayList, new Comparator<HiHealthData>() { // from class: tvm.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                return hiHealthData.getLong("start_time") - hiHealthData2.getLong("start_time") > 0 ? -1 : 1;
            }
        });
        new ArrayList();
        if (arrayList.size() > 5) {
            arrayList = arrayList.subList(0, 5);
        }
        for (HiHealthData hiHealthData : arrayList) {
            if (hiHealthData.getIntValue() == 0) {
                hiHealthData.putInt("point_value", hiHealthData.getInt("bloodOxygenKey"));
            }
        }
        twuVar.a(arrayList);
    }

    public static void a(long j, long j2, twu twuVar, DataInfos dataInfos, IBaseResponseCallback iBaseResponseCallback) {
        vzo vzoVar = new vzo();
        vzoVar.e(new int[]{47201, 47202});
        vzoVar.d(new String[]{"maxBloodOxygen", "minBloodOxygen"});
        vzoVar.a(new int[]{4, 5});
        LogUtil.a("BloodOxygenDataUtil", "getMeasureList start");
        e(vzoVar, j, j2, twuVar, dataInfos, iBaseResponseCallback);
    }

    public static void e(vzo vzoVar, long j, long j2, twu twuVar, DataInfos dataInfos, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(10);
        long jA = ift.a(j);
        LogUtil.a("BloodOxygenDataUtil", "getMeasureList starttime is ", Long.valueOf(jA), "endtime is ", Long.valueOf(j2));
        for (int i : vzoVar.i()) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setReadType(0);
            hiAggregateOption.setStartTime(jA);
            hiAggregateOption.setEndTime(j2);
            hiAggregateOption.setGroupUnitType(3);
            hiAggregateOption.setAggregateType(i);
            hiAggregateOption.setConstantsKey(vzoVar.e());
            hiAggregateOption.setType(vzoVar.o());
            hiAggregateOption.setSortOrder(1);
            arrayList.add(hiAggregateOption);
        }
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthDataEx(arrayList, new AnonymousClass2(iBaseResponseCallback, twuVar, jA, dataInfos));
    }

    /* JADX INFO: renamed from: tvm$2, reason: invalid class name */
    class AnonymousClass2 implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ twu f49712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IBaseResponseCallback f49713c;
        final /* synthetic */ long d;
        final /* synthetic */ DataInfos e;

        AnonymousClass2(IBaseResponseCallback iBaseResponseCallback, twu twuVar, long j, DataInfos dataInfos) {
            this.f49713c = iBaseResponseCallback;
            this.f49712b = twuVar;
            this.d = j;
            this.e = dataInfos;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            if (i != 0 || sparseArray.get(0) == null) {
                LogUtil.e("BloodOxygenDataUtil", "getMeasureList fail");
                this.f49713c.a(0, true);
                return;
            }
            List<HiHealthData> list = sparseArray.get(0);
            int i3 = -1;
            int i4 = 101;
            for (HiHealthData hiHealthData : list) {
                LogUtil.a("BloodOxygenDataUtil", "getMeasureList measureData IS ", hiHealthData.toString());
                hiHealthData.putInt("bloodOxygenCardKey", 1003);
                int i5 = hiHealthData.getInt("maxBloodOxygen");
                int i6 = hiHealthData.getInt("minBloodOxygen");
                if (i5 > i3) {
                    i3 = i5;
                }
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            if (njy.b(list)) {
                String strE = UnitUtil.e(i3, 1, 0);
                this.f49712b.c(tvm.e(UnitUtil.b(BaseApplication.getContext(), "[\\d]", UnitUtil.e(CommonUtil.n(BaseApplication.getActivity(), UnitUtil.e(i4, 1, 0)), 2, 0), R.style.health_text_chart_extreme_value, R.style.health_text_chart_extreme_value_percent), UnitUtil.b(BaseApplication.getContext(), "[\\d]", UnitUtil.e(CommonUtil.n(BaseApplication.getActivity(), strE), 2, 0), R.style.health_text_chart_extreme_value, R.style.health_text_chart_extreme_value_percent)));
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final long j = this.d;
            final twu twuVar = this.f49712b;
            final DataInfos dataInfos = this.e;
            final IBaseResponseCallback iBaseResponseCallback = this.f49713c;
            threadPoolManagerC.execute(new Runnable() { // from class: tvt
                @Override // java.lang.Runnable
                public final void run() {
                    tvm.c(j, twuVar, dataInfos, iBaseResponseCallback);
                }
            });
        }
    }

    public static void c(long j, twu twuVar, DataInfos dataInfos, IBaseResponseCallback iBaseResponseCallback) {
        long jC = lsl.c(j);
        long jR = lsl.r(j);
        if (dataInfos == DataInfos.BloodOxygenWeekDetail) {
            jC = lsl.d(jR, 7);
        } else if (dataInfos == DataInfos.BloodOxygenMonthDetail) {
            if (lsl.p(jR) == jR) {
                jC = lsl.b(jR);
            } else {
                jC = lsl.d(jR, 30);
            }
        } else if (dataInfos == DataInfos.BloodOxygenYearDetail) {
            jC = lsl.d(jR, 365);
        } else {
            LogUtil.a("BloodOxygenDataUtil", "DAY data type");
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jR);
        hiAggregateOption.setEndTime(jC);
        hiAggregateOption.setConstantsKey(new String[]{"altitude"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.ALTITUDE_TYPE.value()});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(1);
        HiAggregateOption hiAggregateOption2 = new HiAggregateOption();
        hiAggregateOption2.setStartTime(jR);
        hiAggregateOption2.setEndTime(jC);
        hiAggregateOption2.setConstantsKey(new String[]{"altitude"});
        hiAggregateOption2.setAggregateType(5);
        hiAggregateOption2.setType(new int[]{DicDataTypeUtil.DataType.ALTITUDE_TYPE.value()});
        hiAggregateOption2.setGroupUnitType(3);
        hiAggregateOption2.setSortOrder(1);
        d(hiAggregateOption, hiAggregateOption2, twuVar, iBaseResponseCallback);
    }

    private static void d(HiAggregateOption hiAggregateOption, HiAggregateOption hiAggregateOption2, final twu twuVar, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e((String) null).e();
        HiDataAggregateProOption hiDataAggregateProOptionE2 = HiDataAggregateProOption.builder().c(hiAggregateOption2).e((String) null).e();
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiDataAggregateProOptionE);
        arrayList.add(hiDataAggregateProOptionE2);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthDataProEx(arrayList, new HiAggregateListenerEx() { // from class: tvm.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
                if (i == 1 || sparseArray == null || sparseArray.size() < 2) {
                    LogUtil.e("BloodOxygenDataUtil", "aggregateMaxAndMin data null,errorcode=", Integer.valueOf(i));
                    iBaseResponseCallback.a(0, true);
                    return;
                }
                LogUtil.a("BloodOxygenDataUtil", "aggregateMaxAndMin end");
                List<HiHealthData> listC = tvm.c(sparseArray.get(0), sparseArray.get(1));
                if (njy.b(listC)) {
                    int i3 = listC.get(0).getInt("maxBloodOxygen");
                    int i4 = listC.get(0).getInt("minBloodOxygen");
                    String strE = wgv.e(i3);
                    String strE2 = wgv.e(i4);
                    String strE3 = tvm.e(UnitUtil.b(BaseApplication.getContext(), "[\\d]", strE2, R.style.health_text_chart_extreme_value, R.style.health_text_chart_extreme_value_percent), UnitUtil.b(BaseApplication.getContext(), "[\\d]", strE, R.style.health_text_chart_extreme_value, R.style.health_text_chart_extreme_value_percent));
                    twuVar.b(strE3);
                    LogUtil.a("BloodOxygenDataUtil", "aggregateMaxAndMin text: ", strE3);
                    iBaseResponseCallback.a(0, true);
                }
            }
        });
    }

    public static String e(SpannableString spannableString, SpannableString spannableString2) {
        if (LanguageUtil.ai(BaseApplication.getContext())) {
            return ((Object) spannableString) + " - " + ((Object) spannableString2);
        }
        return ((Object) spannableString) + " ~ " + ((Object) spannableString2);
    }

    public static List<HiHealthData> c(List<HiHealthData> list, List<HiHealthData> list2) {
        if (list.size() != list2.size()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthData> it = list.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int i2 = it.next().getInt("altitude");
            if (i2 > i) {
                i = i2;
            }
        }
        Iterator<HiHealthData> it2 = list2.iterator();
        int i3 = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            int i4 = it2.next().getInt("altitude");
            if (i4 < i3) {
                i3 = i4;
            }
        }
        if (i == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i == Integer.MAX_VALUE || i3 == Integer.MIN_VALUE) {
            return Collections.EMPTY_LIST;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.putInt("maxBloodOxygen", i);
        hiHealthData.putInt("minBloodOxygen", i3);
        arrayList.add(hiHealthData);
        return arrayList;
    }
}
