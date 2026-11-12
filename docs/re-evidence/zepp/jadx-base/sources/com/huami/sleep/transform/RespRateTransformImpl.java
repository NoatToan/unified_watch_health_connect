package com.huami.sleep.transform;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ranges.IntProgression;
import kotlin.ranges.e;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J4\u0010\r\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f0\f2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/transform/RespRateTransformImpl;", "Lcom/huami/sleep/transform/ITransformChartData;", "", "curIndex", "index", "", "c", GoogleApiAvailabilityLight.a, "", HTTP.CONTENT_RANGE_BYTES, "interval", "b", "Lkotlin/Pair;", "a", "startMin", "endMin", "Lcom/huami/chart/data/ChartDataList;", "transformToChartData", LogUtil.I, "start", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateTransformImpl implements ITransformChartData {

    @NotNull
    public static final RespRateTransformImpl INSTANCE = new RespRateTransformImpl();
    public static final int interval = 5;
    public static final int start = 4;

    private RespRateTransformImpl() {
    }

    private final Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> a(byte[] bytes) {
        int length = bytes.length;
        byte b = 2147483647;
        byte b2 = -2147483648;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            byte b3 = bytes[i];
            int i5 = i4 + 1;
            if (b3 > b2) {
                i3 = i4;
                b2 = b3;
            }
            if (1 <= b3 && b3 < b) {
                i2 = i4;
                b = b3;
            }
            i++;
            i4 = i5;
        }
        return new Pair<>(new Pair(Integer.valueOf(i2), Integer.valueOf(b)), new Pair(Integer.valueOf(i3), Integer.valueOf(b2)));
    }

    private final int b(byte[] bytes, int curIndex, int interval2) {
        int i = (curIndex - interval2) + 1;
        if (i > curIndex) {
            return 0;
        }
        while (true) {
            int i2 = curIndex - 1;
            byte b = bytes[curIndex];
            if (d(b) || curIndex == i) {
                return b;
            }
            curIndex = i2;
        }
    }

    private final boolean c(int curIndex, int index) {
        return index > curIndex + (-5) && index <= curIndex;
    }

    private final boolean d(int i) {
        return i > 0;
    }

    @Override // com.huami.sleep.transform.ITransformChartData
    @NotNull
    public ChartDataList transformToChartData(@NotNull byte[] bytes, int startMin, int endMin) {
        int i;
        boolean z;
        boolean z2;
        int length = bytes.length;
        if (length < 5) {
            return new ChartDataList(new SparseArray());
        }
        SparseArray sparseArray = new SparseArray();
        Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> pairA = a(bytes);
        Pair<Integer, Integer> pairComponent1 = pairA.component1();
        Pair<Integer, Integer> pairComponent2 = pairA.component2();
        int iIntValue = pairComponent1.component1().intValue();
        int iIntValue2 = pairComponent1.component2().intValue();
        int iIntValue3 = pairComponent2.component1().intValue();
        int iIntValue4 = pairComponent2.component2().intValue();
        IntProgression intProgressionStep = e.step(e.until(4, length), 5);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            i = 0;
            z = false;
            z2 = false;
        } else {
            boolean z3 = false;
            i = 0;
            z = false;
            z2 = false;
            while (true) {
                int i2 = first + step;
                byte b = bytes[first];
                if (z3) {
                    sparseArray.put(i, new ChartData(i, iIntValue4));
                    i++;
                    z3 = false;
                } else {
                    boolean z4 = c(first, iIntValue) && !z;
                    boolean z5 = c(first, iIntValue3) && !z2;
                    if (z4 && z5) {
                        if (i <= 0) {
                            sparseArray.put(i, new ChartData(i, iIntValue2));
                            z3 = true;
                            z = true;
                        } else {
                            sparseArray.put(i - 1, new ChartData(i, iIntValue2));
                            sparseArray.put(i, new ChartData(i, iIntValue4));
                            z = true;
                            z2 = true;
                        }
                    } else if (z4) {
                        sparseArray.put(i, new ChartData(i, iIntValue2));
                        z = true;
                    } else if (z5) {
                        sparseArray.put(i, new ChartData(i, iIntValue4));
                        z2 = true;
                    } else if (d(b)) {
                        sparseArray.put(i, new ChartData(i, b));
                    } else {
                        int iB = b(bytes, first, 5);
                        if (iB > 0) {
                            sparseArray.put(i, new ChartData(i, iB));
                        }
                    }
                    i++;
                }
                if (first == last) {
                    break;
                }
                first = i2;
            }
        }
        int i3 = length % 5;
        if (i3 != 0) {
            if (!z2 && !z) {
                int i4 = i - 1;
                sparseArray.put(i4, new ChartData(i4, iIntValue2));
                sparseArray.put(i, new ChartData(i, iIntValue4));
            } else if (!z2) {
                sparseArray.put(i, new ChartData(i, iIntValue4));
            } else if (z) {
                int iB2 = b(bytes, length - 1, i3);
                if (iB2 > 0) {
                    sparseArray.put(i, new ChartData(i, iB2));
                }
            } else {
                sparseArray.put(i, new ChartData(i, iIntValue2));
            }
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray, 0, i);
        float f = 10;
        chartDataList.setMinValue(Math.max(1.0f, iIntValue2 - f));
        chartDataList.setMaxValue(iIntValue4 + f);
        return chartDataList;
    }
}
