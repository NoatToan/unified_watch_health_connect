package com.huami.bodymeasurements.common.chart;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.common.chart.vo.BarDto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a$\u0010\u0011\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\n\u0010\u0012\u001a\u00020\u0006*\u00020\u0006¨\u0006\u0013"}, d2 = {"", "Lcom/huami/bodymeasurements/common/chart/vo/BarDto;", "", "dateMode", "", "offset", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "convertToBarChartDataList", GoogleApiAvailabilityLight.a, "", "day", "a", "c", "e", "index", "", "timeStamp", "b", "toRawBarChartVo", "common_release"}, k = 2, mv = {1, 5, 1})
public final class ChartDataConverterKt {
    private static final int a(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0189  */
    /* JADX WARN: Code duplicated, block: B:50:0x018b  */
    /* JADX WARN: Code duplicated, block: B:52:0x018e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e2  */
    private static final BarChartVo b(BarDto barDto, int i, long j, float f) {
        float fFloatValue;
        boolean z;
        boolean z2;
        Pair pair;
        Pair<Float, Float> pair2;
        Pair pair3;
        Pair<Float, Float> pair4;
        float fFloatValue2;
        boolean z3;
        Pair pair5 = new Pair(Float.valueOf(f), Float.valueOf(f));
        Pair pair6 = new Pair(Float.valueOf(f), Float.valueOf(f));
        Pair<Float, Float> highValue = barDto.getHighValue();
        Pair<Float, Float> pair7 = null;
        Float fValueOf = Float.valueOf(0.0f);
        if (highValue == null) {
            pair3 = pair5;
            pair4 = null;
        } else {
            float fFloatValue3 = barDto.getHighRange().getFirst().floatValue();
            float fFloatValue4 = barDto.getHighRange().getSecond().floatValue();
            if (highValue.getSecond().floatValue() == 0.0f) {
                fFloatValue = highValue.getFirst().floatValue();
                if (fFloatValue == fFloatValue3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float f2 = 2 * f;
                    pair = new Pair(fValueOf, Float.valueOf(f2));
                    pair2 = new Pair<>(highValue.getFirst(), Float.valueOf(highValue.getFirst().floatValue() + f2));
                } else {
                    if (fFloatValue == fFloatValue4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        float f3 = 2 * f;
                        pair = new Pair(Float.valueOf(f3), fValueOf);
                        pair2 = new Pair<>(Float.valueOf(highValue.getFirst().floatValue() - f3), highValue.getFirst());
                    } else {
                        pair = new Pair(Float.valueOf(f), Float.valueOf(f));
                        highValue = new Pair<>(Float.valueOf(highValue.getFirst().floatValue() - f), Float.valueOf(highValue.getFirst().floatValue() + f));
                    }
                }
                highValue = pair2;
            } else {
                if (highValue.getFirst().floatValue() == highValue.getSecond().floatValue()) {
                    fFloatValue = highValue.getFirst().floatValue();
                    if (fFloatValue == fFloatValue3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        float f4 = 2 * f;
                        pair = new Pair(fValueOf, Float.valueOf(f4));
                        pair2 = new Pair<>(highValue.getFirst(), Float.valueOf(highValue.getFirst().floatValue() + f4));
                    } else {
                        if (fFloatValue == fFloatValue4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            float f5 = 2 * f;
                            pair = new Pair(Float.valueOf(f5), fValueOf);
                            pair2 = new Pair<>(Float.valueOf(highValue.getFirst().floatValue() - f5), highValue.getFirst());
                        } else {
                            pair = new Pair(Float.valueOf(f), Float.valueOf(f));
                            highValue = new Pair<>(Float.valueOf(highValue.getFirst().floatValue() - f), Float.valueOf(highValue.getFirst().floatValue() + f));
                        }
                    }
                    highValue = pair2;
                } else {
                    pair = new Pair(fValueOf, fValueOf);
                }
            }
            pair3 = pair;
            pair4 = highValue;
        }
        Pair<Float, Float> lowValue = barDto.getLowValue();
        if (lowValue != null) {
            float fFloatValue5 = barDto.getLowRange().getFirst().floatValue();
            float fFloatValue6 = barDto.getLowRange().getSecond().floatValue();
            if (lowValue.getSecond().floatValue() == 0.0f) {
                fFloatValue2 = lowValue.getFirst().floatValue();
                if (fFloatValue2 == fFloatValue5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    float f6 = 2 * f;
                    pair6 = new Pair(fValueOf, Float.valueOf(f6));
                    pair7 = new Pair<>(lowValue.getFirst(), Float.valueOf(lowValue.getFirst().floatValue() + f6));
                } else {
                    if (fFloatValue2 == fFloatValue6) {
                        float f7 = 2 * f;
                        pair6 = new Pair(Float.valueOf(f7), fValueOf);
                        pair7 = new Pair<>(Float.valueOf(lowValue.getFirst().floatValue() - f7), lowValue.getFirst());
                    } else {
                        pair6 = new Pair(Float.valueOf(f), Float.valueOf(f));
                        pair7 = new Pair<>(Float.valueOf(lowValue.getFirst().floatValue() - f), Float.valueOf(lowValue.getFirst().floatValue() + f));
                    }
                }
            } else {
                if (lowValue.getFirst().floatValue() == lowValue.getSecond().floatValue()) {
                    fFloatValue2 = lowValue.getFirst().floatValue();
                    if (fFloatValue2 == fFloatValue5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        float f8 = 2 * f;
                        pair6 = new Pair(fValueOf, Float.valueOf(f8));
                        pair7 = new Pair<>(lowValue.getFirst(), Float.valueOf(lowValue.getFirst().floatValue() + f8));
                    } else {
                        if (fFloatValue2 == fFloatValue6) {
                            float f9 = 2 * f;
                            pair6 = new Pair(Float.valueOf(f9), fValueOf);
                            pair7 = new Pair<>(Float.valueOf(lowValue.getFirst().floatValue() - f9), lowValue.getFirst());
                        } else {
                            pair6 = new Pair(Float.valueOf(f), Float.valueOf(f));
                            pair7 = new Pair<>(Float.valueOf(lowValue.getFirst().floatValue() - f), Float.valueOf(lowValue.getFirst().floatValue() + f));
                        }
                    }
                } else {
                    pair6 = new Pair(fValueOf, fValueOf);
                    pair7 = lowValue;
                }
            }
        }
        return new BarChartVo(i, pair4, pair3, pair7, pair6, j);
    }

    private static final List<BarChartVo> c(List<BarDto> list, float f) {
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BarDto barDto : list) {
            calendar.setTime(barDto.getUploadTime());
            arrayList.add(b(barDto, calendar.get(5), calendar.getTimeInMillis(), f));
        }
        return arrayList;
    }

    @NotNull
    public static final List<BarChartVo> convertToBarChartDataList(@NotNull List<BarDto> list, @NotNull String str, float f) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3645428) {
            if (iHashCode != 3704893) {
                if (iHashCode == 104080000 && str.equals("month")) {
                    return c(list, f);
                }
            } else if (str.equals("year")) {
                return e(list, f);
            }
        } else if (str.equals("week")) {
            return d(list, f);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private static final List<BarChartVo> d(List<BarDto> list, float f) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BarDto barDto : list) {
            calendar.setTime(barDto.getUploadTime());
            arrayList.add(b(barDto, a(calendar.get(7)), calendar.getTimeInMillis(), f));
        }
        return arrayList;
    }

    private static final List<BarChartVo> e(List<BarDto> list, float f) {
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BarDto barDto : list) {
            calendar.setTime(barDto.getUploadTime());
            arrayList.add(b(barDto, calendar.get(2) + 1, calendar.getTimeInMillis(), f));
        }
        return arrayList;
    }

    @NotNull
    public static final BarChartVo toRawBarChartVo(@NotNull BarChartVo barChartVo) {
        Pair pair;
        Pair pair2;
        Pair<Float, Float> highValue = barChartVo.getHighValue();
        if (highValue == null) {
            pair = null;
        } else {
            float fFloatValue = highValue.getFirst().floatValue();
            float fFloatValue2 = highValue.getSecond().floatValue();
            Pair<Float, Float> highOffset = barChartVo.getHighOffset();
            pair = new Pair(Float.valueOf(fFloatValue + highOffset.getFirst().floatValue()), Float.valueOf(fFloatValue2 - highOffset.getSecond().floatValue()));
        }
        Pair<Float, Float> lowValue = barChartVo.getLowValue();
        if (lowValue == null) {
            pair2 = null;
        } else {
            float fFloatValue3 = lowValue.getFirst().floatValue();
            float fFloatValue4 = lowValue.getSecond().floatValue();
            Pair<Float, Float> lowOffset = barChartVo.getLowOffset();
            pair2 = new Pair(Float.valueOf(fFloatValue3 + lowOffset.getFirst().floatValue()), Float.valueOf(fFloatValue4 - lowOffset.getSecond().floatValue()));
        }
        return new BarChartVo(barChartVo.getIndex(), pair, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), pair2, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), barChartVo.getTimeStamp());
    }
}
