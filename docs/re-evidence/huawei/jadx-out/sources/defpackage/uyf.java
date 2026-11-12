package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class uyf implements IChartStorageHelper {
    @Override // com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper
    public void queryStepDayData(Context context, long j, long j2, DataInfos dataInfos, HwHealthChartHolder.c cVar, ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        if (dataInfos.isDayData() && !qnh.s(j)) {
            responseCallback.onResult(-1, null);
            return;
        }
        int i = AnonymousClass4.f50734b[dataInfos.ordinal()];
        if (i == 1) {
            e(context, j, j2, responseCallback);
            return;
        }
        if (i == 2) {
            b(context, j, j2, responseCallback);
            return;
        }
        if (i == 3) {
            b(context, j, j2, responseCallback);
        } else if (i == 4) {
            d(context, j, j2, responseCallback);
        } else {
            LogUtil.a("PressureLineChartStorageHelper", "no case match !");
        }
    }

    /* JADX INFO: renamed from: uyf$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50734b;

        static {
            int[] iArr = new int[DataInfos.values().length];
            f50734b = iArr;
            try {
                iArr[DataInfos.PressureDayDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50734b[DataInfos.PressureWeekDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50734b[DataInfos.PressureMonthDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50734b[DataInfos.PressureYearDetail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void e(Context context, long j, long j2, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2 - 1);
        hiDataReadOption.setType(new int[]{2034});
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uyf.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    LogUtil.a("PressureLineChartStorageHelper", "data is null");
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 != null) {
                        responseCallback2.onResult(-1, null);
                        return;
                    }
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    ResponseCallback responseCallback3 = responseCallback;
                    if (responseCallback3 != null) {
                        responseCallback3.onResult(-1, null);
                        return;
                    }
                    return;
                }
                List list = (List) sparseArray.get(2034);
                HashMap map = new HashMap(16);
                uyf.this.a(list, map);
                LogUtil.a("PressureLineChartStorageHelper", "before resultMap: ", map.toString());
                LogUtil.a("PressureLineChartStorageHelper", "pressureMeasureValueList size: ", Integer.valueOf(list.size()));
                uyf.this.c(list, map);
                HashMap map2 = new HashMap(16);
                uyf.this.d(map, map2);
                LogUtil.a("PressureLineChartStorageHelper", "after resultNewMap: ", map2.toString());
                if (responseCallback != null) {
                    if (map2.size() > 0) {
                        responseCallback.onResult(0, map2);
                    } else {
                        responseCallback.onResult(-1, null);
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.d("PressureLineChartStorageHelper", "requestDayPressureData onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map<Long, IStorageModel> map, Map<Long, IStorageModel> map2) {
        frg frgVar;
        float fE;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            int iE = (int) ((frg) entry.getValue()).e();
            sb.append(jLongValue);
            sb.append(" ");
            sb.append(iE);
            sb.append(",");
            Calendar calendarA = a(jLongValue);
            IStorageModel iStorageModel = map2.get(Long.valueOf(calendarA.getTimeInMillis()));
            if (iStorageModel instanceof frg) {
                frgVar = (frg) iStorageModel;
                fE = frgVar.e();
            } else {
                fE = 0.0f;
                frgVar = new frg(0.0f);
            }
            d(iE, calendarA, frgVar, fE, map2);
        }
        LogUtil.a("PressureLineChartStorageHelper", "setHalfHourData all data = ", sb.toString());
    }

    private Calendar a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (calendar.get(12) / 30 == 0) {
            calendar.set(12, 14);
            calendar.set(13, 30);
        } else {
            calendar.set(12, 44);
            calendar.set(13, 30);
        }
        calendar.set(14, 0);
        return calendar;
    }

    private void d(int i, Calendar calendar, frg frgVar, float f, Map<Long, IStorageModel> map) {
        if (f == 0.0f) {
            frgVar.d(i);
            frgVar.c(1);
        } else {
            int iC = frgVar.c();
            float f2 = iC;
            int i2 = iC + 1;
            frgVar.c(i2);
            frgVar.d(((f * f2) + i) / i2);
        }
        map.put(Long.valueOf(calendar.getTimeInMillis()), frgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, Map<Long, IStorageModel> map) {
        for (HiHealthData hiHealthData : list) {
            LogUtil.a("PressureLineChartStorageHelper", "measureType1 = ", Integer.valueOf(((HiStressMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiStressMetaData.class)).fetchStressMeasureType()));
            map.put(Long.valueOf(hiHealthData.getStartTime()), new frg(hiHealthData.getIntValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, Map<Long, IStorageModel> map) {
        for (HiHealthData hiHealthData : list) {
            long startTime = hiHealthData.getStartTime();
            int iFetchStressMeasureType = ((HiStressMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiStressMetaData.class)).fetchStressMeasureType();
            LogUtil.a("PressureLineChartStorageHelper", "measureType2 = " + iFetchStressMeasureType);
            if (iFetchStressMeasureType == 0 || iFetchStressMeasureType == 2) {
                LogUtil.a("PressureLineChartStorageHelper", "pressureMeasureValueList.size()2 = " + list.size());
                for (HiHealthData hiHealthData2 : list) {
                    int iFetchStressMeasureType2 = ((HiStressMetaData) HiJsonUtil.d(hiHealthData2.getMetaData(), HiStressMetaData.class)).fetchStressMeasureType();
                    LogUtil.a("PressureLineChartStorageHelper", "measureTypeTemp = " + iFetchStressMeasureType2);
                    if (iFetchStressMeasureType2 != 0 && iFetchStressMeasureType2 != 2) {
                        long startTime2 = hiHealthData2.getStartTime();
                        LogUtil.a("PressureLineChartStorageHelper", "pressureTimeTmp = " + startTime2);
                        if (Math.abs(startTime2 - startTime) <= 600000) {
                            LogUtil.a("PressureLineChartStorageHelper", "in range");
                            if (map.containsKey(Long.valueOf(startTime2))) {
                                map.remove(Long.valueOf(startTime2));
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(Context context, long j, long j2, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{44306});
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uyf.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    if (responseCallback != null) {
                        LogUtil.a("PressureLineChartStorageHelper", "data is null，callback -1");
                        responseCallback.onResult(-1, null);
                        return;
                    }
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 != null) {
                        responseCallback2.onResult(-1, null);
                        return;
                    }
                    return;
                }
                List<HiHealthData> list = (List) sparseArray.get(44306);
                HashMap map = new HashMap(16);
                for (HiHealthData hiHealthData : list) {
                    map.put(Long.valueOf(ltb.h(hiHealthData.getStartTime() + 43200000)), new frg(hiHealthData.getIntValue()));
                }
                if (responseCallback != null) {
                    if (map.size() > 0) {
                        responseCallback.onResult(0, map);
                    } else {
                        responseCallback.onResult(-1, null);
                    }
                }
            }
        });
    }

    private void d(Context context, final long j, final long j2, final ResponseCallback<Map<Long, IStorageModel>> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{44306});
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: uyf.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 != null) {
                        responseCallback2.onResult(-1, null);
                        return;
                    }
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    if (responseCallback != null) {
                        LogUtil.a("PressureLineChartStorageHelper", "data size is zero ");
                        responseCallback.onResult(-1, null);
                        return;
                    }
                    return;
                }
                List list = (List) sparseArray.get(44306);
                if (responseCallback != null && list.size() <= 0) {
                    responseCallback.onResult(-1, null);
                }
                uyf.this.c(list, responseCallback, j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, ResponseCallback<Map<Long, IStorageModel>> responseCallback, long j, long j2) {
        Map<Long, IStorageModel> mapB = b(new Date(j), list, (int) ((j2 - j) / 2592000000L));
        if (responseCallback == null || mapB.size() <= 0) {
            return;
        }
        responseCallback.onResult(0, mapB);
    }

    private long a(Date date) {
        long time = date.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM", Locale.getDefault());
        String str = simpleDateFormat.format(Long.valueOf(time));
        if (str == null) {
            return 0L;
        }
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            LogUtil.e("PressureLineChartStorageHelper", "acquireMonthZeroTimeFromDate, wrong parse");
            return 0L;
        }
    }

    private Date e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    private Map<Long, IStorageModel> b(Date date, List<HiHealthData> list, int i) {
        HashMap map = new HashMap(16);
        Date dateE = e(date);
        int i2 = 0;
        while (i2 < i) {
            Date dateB = ltb.b(dateE, 1);
            List<HiHealthData> listB = b(ltb.l(dateE), ltb.l(ltb.c(ltb.d(dateB, -1))), list);
            int size = listB.size();
            if (listB.size() > 0) {
                Iterator<HiHealthData> it = listB.iterator();
                int intValue = 0;
                while (it.hasNext()) {
                    intValue += it.next().getIntValue();
                }
                map.put(Long.valueOf(a(dateE) + 1296000000), new frg((int) (intValue / size)));
            }
            i2++;
            dateE = dateB;
        }
        return map;
    }

    private List<HiHealthData> b(long j, long j2, List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(10);
        for (HiHealthData hiHealthData : list) {
            long startTime = hiHealthData.getStartTime() / 1000;
            if (startTime >= j && startTime <= j2) {
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }
}
