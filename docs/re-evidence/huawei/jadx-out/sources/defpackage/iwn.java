package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class iwn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile iwn f38138b;
    private static Context e;

    private iwn() {
    }

    public static iwn a(Context context) {
        if (context != null) {
            e = context.getApplicationContext();
        } else {
            e = BaseApplication.getContext();
        }
        if (f38138b == null) {
            synchronized (iwn.class) {
                if (f38138b == null) {
                    f38138b = new iwn();
                }
            }
        }
        return f38138b;
    }

    public void e(long j, long j2, int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Common_HwHealthTrackMonthDataManager", "requestTrackMonthData sportType = ", Integer.valueOf(i2), " timeUnit = ", Integer.valueOf(i));
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setAggregateType(1);
        if (i2 != 0) {
            hiSportStatDataAggregateOption.setHiHealthTypes(b(i2));
        }
        int[] iArrD = d(i2);
        String[] strArrA = a(i2);
        LogUtil.a("Common_HwHealthTrackMonthDataManager", "types", iArrD);
        hiSportStatDataAggregateOption.setConstantsKey(strArrA);
        hiSportStatDataAggregateOption.setType(iArrD);
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        hiSportStatDataAggregateOption.setReadType(0);
        HiHealthNativeApi.a(e).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener(this) { // from class: iwn.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                if (iBaseResponseCallback == null) {
                    LogUtil.j("Common_HwHealthTrackMonthDataManager", "requestTrackMonthData callback is null");
                } else if (njy.e(list)) {
                    LogUtil.j("Common_HwHealthTrackMonthDataManager", "requestTrackMonthData() all run data null or empty ");
                    iBaseResponseCallback.a(i3, list);
                } else {
                    iBaseResponseCallback.a(i3, list);
                }
            }
        });
    }

    private String[] a(int i) {
        String[] strArrE = jqq.e(e, i);
        if (i == 0) {
            strArrE = (String[]) b(b(), strArrE);
        }
        if (i == 286) {
            return (String[]) b(jqq.e(e, HeartRateThresholdConfig.HEART_RATE_LIMIT), strArrE);
        }
        if (i == 217) {
            for (int i2 : nub.f43727a) {
                strArrE = (String[]) b(strArrE, jqq.e(e, i2));
            }
        }
        return strArrE;
    }

    private int[] d(int i) {
        int[] iArrD = jqq.d(e, i);
        if (i == 0) {
            int[] iArrA = a();
            int[] iArr = new int[iArrA.length + iArrD.length];
            System.arraycopy(iArrA, 0, iArr, 0, iArrA.length);
            System.arraycopy(iArrD, 0, iArr, iArrA.length, iArrD.length);
            iArrD = iArr;
        }
        if (i == 286) {
            int[] iArr2 = new int[iArrD.length + 4];
            System.arraycopy(new int[]{42404, 42403, 42405, 23}, 0, iArr2, 0, 4);
            System.arraycopy(iArrD, 0, iArr2, 4, iArrD.length);
            iArrD = iArr2;
        }
        if (i != 217) {
            return iArrD;
        }
        int[] iArr3 = {42352, 42353, 42355, 42354};
        int[] iArr4 = nub.f43727a;
        int length = iArr4.length;
        int i2 = 0;
        while (i2 < length) {
            int[] iArrD2 = jqq.d(e, iArr4[i2]);
            int[] iArr5 = new int[iArr3.length + iArrD2.length];
            System.arraycopy(iArr3, 0, iArr5, 0, iArr3.length);
            System.arraycopy(iArrD2, 0, iArr5, iArr3.length, iArrD2.length);
            i2++;
            iArr3 = iArr5;
        }
        return iArr3;
    }

    private static int[] b(int i) {
        if (i == 287) {
            return new int[]{i, ComponentInfo.PluginPay_A_N, 289, 288};
        }
        return c(i);
    }

    public static int[] c(int i) {
        if (i == 217) {
            return new int[]{30001, 229, 230, 231, 232, 233};
        }
        if (i == 286) {
            return new int[]{i, 30001};
        }
        return new int[]{i};
    }

    public String[] b() {
        return new String[]{"Track_2572", "Track_2582", "Track_2592", "Track_2622", "Track_2715", "Track_5122", "Track_2204", "Track_2172", "Track_2574", "Track_2584", "Track_2594", "Track_2624", "Track_2714", "Track_5124", "Track_2204", "Track_2174", "Track_2573", "Track_2583", "Track_2593", "Track_2623", "Track_2713", "Track_5123", "Track_2203", "Track_2173", "Track_2575", "Track_2585", "Track_2595", "Track_2625", "Track_2714", "Track_5125", "Track_2205", "Track_2175", "Track_2576", "Track_2586", "Track_2596", "Track_2626", "Track_2716", "Track_5126", "Track_2206", "Track_2176", "Track_Count_Sum", "Track_Duration_Sum", "Track_Calorie_Sum", "Track_Abnormal_Count_Sum", "Track_28722", "Track_28721"};
    }

    public int[] a() {
        return new int[]{42052, 42102, 42152, 42202, 42304, 42252, 42404, 42352, 42054, 42104, 42154, 42204, 42303, 42254, 42404, 42354, 42053, 42103, 42153, 42203, 42302, 42253, 42403, 42353, 42055, 42105, 42155, 42205, 42303, 42255, 42405, 42355, 42056, 42106, 42156, 42206, 42311, 42256, 42406, 42356, 42005, Constants.REBACK_MARKET_ENTRANCE, Constants.REBACK_MARKET_RESULT_CODE, 42008, 22, 21};
    }

    private static <T> T[] b(T[] tArr, T[]... tArr2) {
        int length = tArr.length;
        for (T[] tArr3 : tArr2) {
            length += tArr3.length;
        }
        T[] tArr4 = (T[]) Arrays.copyOf(tArr, length);
        int length2 = tArr.length;
        for (T[] tArr5 : tArr2) {
            System.arraycopy(tArr5, 0, tArr4, length2, tArr5.length);
            length2 += tArr5.length;
        }
        return tArr4;
    }
}
