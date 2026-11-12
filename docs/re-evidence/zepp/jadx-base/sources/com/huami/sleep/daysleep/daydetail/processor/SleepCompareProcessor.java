package com.huami.sleep.daysleep.daydetail.processor;

import android.content.Context;
import android.util.SparseArray;
import com.amap.api.mapcore.util.hl;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.processor.SleepCompareProcessor;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.util.NumberFormatter;
import com.huami.sleep.util.SleepTimeUtil;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J&\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001e\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J4\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J,\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/processor/SleepCompareProcessor;", "", "", "time", "", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "slpCompareList", "Lcom/huami/chart/data/ChartDataList;", hl.k, "current", "g", "", "date", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "getIntoSlpComparePer", "getSlpDpCompareText", "Lkotlin/Pair;", "getIntoSlpData", "getSleepDpCompareInfo", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepCompareProcessor {

    @NotNull
    public static final SleepCompareProcessor INSTANCE = new SleepCompareProcessor();

    private SleepCompareProcessor() {
    }

    private final ChartDataList g(final int current, List<SleepCompareModel> slpCompareList) {
        int count;
        final Context appContext = KoinExtKt.getAppContext();
        SparseArray sparseArray = new SparseArray();
        int size = slpCompareList.size() - 1;
        if (size >= 0) {
            int i = 0;
            count = 0;
            while (true) {
                int i2 = i + 1;
                SleepCompareModel sleepCompareModel = slpCompareList.get(i);
                if (sleepCompareModel.getCategory() > 300) {
                    count += sleepCompareModel.getCount();
                } else {
                    ChartData chartData = new ChartData(i, sleepCompareModel.getCount());
                    int category = sleepCompareModel.getCategory();
                    if (category == 0) {
                        chartData.addExtends(new IDataExtendListener() { // from class: rz6
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return SleepCompareProcessor.h(appContext, baseIndex);
                            }
                        });
                    } else if (category == current) {
                        chartData.addExtends(new IDataExtendListener() { // from class: tz6
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return SleepCompareProcessor.i(appContext, current, baseIndex);
                            }
                        });
                    } else if (category == 300) {
                        chartData.addExtends(new IDataExtendListener() { // from class: sz6
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return SleepCompareProcessor.j(appContext, baseIndex);
                            }
                        });
                    }
                    sparseArray.put(i, chartData);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        } else {
            count = 0;
        }
        sparseArray.put(61, new ChartData(61, count));
        return new ChartDataList(sparseArray, 0, 61);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(Context context, BaseIndex baseIndex) {
        return context.getString(R.string.sleep_deep_unit_h, NumberFormat.getNumberInstance().format(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Context context, int i, BaseIndex baseIndex) {
        return context.getString(R.string.sleep_deep_unit_h, NumberFormat.getNumberInstance().format(i / 60.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(Context context, BaseIndex baseIndex) {
        return context.getString(R.string.sleep_deep_unit_h, NumberFormat.getNumberInstance().format(4.5d));
    }

    private final ChartDataList k(final int time, List<SleepCompareModel> slpCompareList) {
        SparseArray sparseArray = new SparseArray();
        int size = slpCompareList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                SleepCompareModel sleepCompareModel = slpCompareList.get(i);
                if (sleepCompareModel.getCategory() <= 1800) {
                    ChartData chartData = new ChartData(i, sleepCompareModel.getCount());
                    int category = sleepCompareModel.getCategory();
                    if (category == 1200) {
                        chartData.addExtends(new IDataExtendListener() { // from class: vz6
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return SleepCompareProcessor.l(baseIndex);
                            }
                        });
                    } else if (category == time) {
                        chartData.addExtends(new IDataExtendListener() { // from class: qz6
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return SleepCompareProcessor.m(time, baseIndex);
                            }
                        });
                    } else if (category == 1800) {
                        chartData.addExtends(new IDataExtendListener() { // from class: uz6
                            @Override // com.huami.chart.listener.IDataExtendListener
                            public final Object get(BaseIndex baseIndex) {
                                return SleepCompareProcessor.n(baseIndex);
                            }
                        });
                    }
                    sparseArray.put(i, chartData);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        sparseArray.put(61, new ChartData(61, 0.0f));
        return new ChartDataList(sparseArray, 0, 61);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(BaseIndex baseIndex) {
        return "20:00";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(int i, BaseIndex baseIndex) {
        return SleepTimeUtil.INSTANCE.minuteParseToHour(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(BaseIndex baseIndex) {
        return "06:00";
    }

    @NotNull
    public final String getIntoSlpComparePer(@NotNull String date, @Nullable SleepInfo sleepInfo, @NotNull List<SleepCompareModel> slpCompareList) {
        int count;
        int count2;
        if (sleepInfo == null) {
            return "";
        }
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        Date startDate = sleepInfo.getStartDate();
        int timeMinNum = sleepTimeUtil.getTimeMinNum(date, startDate == null ? 0L : startDate.getTime());
        int size = slpCompareList.size() - 1;
        if (size >= 0) {
            int i = 0;
            count = 0;
            count2 = 0;
            while (true) {
                int i2 = i + 1;
                count += slpCompareList.get(i).getCount();
                if (timeMinNum >= slpCompareList.get(i).getCategory()) {
                    count2 += slpCompareList.get(i).getCount();
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        } else {
            count = 0;
            count2 = 0;
        }
        int i3 = 100 - (count == 0 ? 100 : (int) NumberFormatter.INSTANCE.format((count2 / count) * 100, 0, 4));
        if (i3 == 100) {
            i3 = 99;
        }
        String string = i3 >= 1 ? KoinExtKt.getAppContext().getString(R.string.slp3_compare_suf, Integer.valueOf(i3)) : KoinExtKt.getAppContext().getString(R.string.slp3_compare_suf_2, 99);
        return string == null ? "" : string;
    }

    @Nullable
    public final Pair<Integer, ChartDataList> getIntoSlpData(@NotNull String date, @Nullable SleepInfo sleepInfo, @NotNull List<SleepCompareModel> slpCompareList) {
        if (sleepInfo == null || sleepInfo.getSleepCount() <= 0) {
            return null;
        }
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        Date startDate = sleepInfo.getStartDate();
        int timeMinNum = sleepTimeUtil.getTimeMinNum(date, startDate == null ? 0L : startDate.getTime());
        if (timeMinNum > 1810) {
            timeMinNum = 1810;
        } else if (timeMinNum < 1200) {
            timeMinNum = SleepDetailFragment.START_VALID_INTO_TIME;
        }
        int i = timeMinNum % 60;
        return new Pair<>(Integer.valueOf(timeMinNum), INSTANCE.k(i > 30 ? (timeMinNum - i) + 60 : timeMinNum - i, slpCompareList));
    }

    @Nullable
    public final Pair<Integer, ChartDataList> getSleepDpCompareInfo(@Nullable SleepInfo sleepInfo, @NotNull List<SleepCompareModel> slpCompareList) {
        int nonRemCount = sleepInfo == null ? 0 : sleepInfo.getNonRemCount();
        if (nonRemCount <= 0) {
            return null;
        }
        if (nonRemCount >= 300) {
            nonRemCount = 300;
        }
        int i = nonRemCount % 30;
        return new Pair<>(Integer.valueOf(nonRemCount), g(i > 15 ? (nonRemCount - i) + 30 : nonRemCount - i, slpCompareList));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f A[LOOP:0: B:10:0x0017->B:25:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[EDGE_INSN: B:36:0x0073->B:27:0x0073 BREAK  A[LOOP:0: B:10:0x0017->B:25:0x006f], SYNTHETIC] */
    @NotNull
    public final String getSlpDpCompareText(@Nullable SleepInfo sleepInfo, @NotNull List<SleepCompareModel> slpCompareList) {
        int count;
        int i;
        int count2;
        int nonRemCount = sleepInfo == null ? 0 : sleepInfo.getNonRemCount();
        if (nonRemCount <= 0) {
            return "";
        }
        int size = slpCompareList.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            count = 0;
            i = 0;
            while (true) {
                int i3 = i2 + 1;
                count += slpCompareList.get(i2).getCount();
                if (i2 >= slpCompareList.size() - 1 || nonRemCount < slpCompareList.get(i2).getCategory() || nonRemCount < slpCompareList.get(i3).getCategory()) {
                    if (i2 == slpCompareList.size() - 1 && nonRemCount >= slpCompareList.get(i2).getCategory()) {
                        count2 = slpCompareList.get(i2).getCount();
                    }
                    if (i3 > size) {
                        break;
                    }
                    i2 = i3;
                } else {
                    count2 = slpCompareList.get(i2).getCount();
                }
                i += count2;
                if (i3 > size) {
                    break;
                    break;
                }
                i2 = i3;
            }
        } else {
            count = 0;
            i = 0;
        }
        int i4 = (int) ((i / count) * 100);
        if (i4 < 1) {
            return KoinExtKt.getAppContext().getString(R.string.slp3_compare_dp_suf_2, 99);
        }
        Context appContext = KoinExtKt.getAppContext();
        int i5 = R.string.slp3_compare_dp_suf;
        Object[] objArr = new Object[1];
        if (i4 > 99) {
            i4 = 99;
        }
        objArr[0] = Integer.valueOf(i4);
        return appContext.getString(i5, objArr);
    }
}
