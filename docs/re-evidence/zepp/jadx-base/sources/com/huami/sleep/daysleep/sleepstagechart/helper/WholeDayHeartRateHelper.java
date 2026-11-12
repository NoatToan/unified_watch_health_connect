package com.huami.sleep.daysleep.sleepstagechart.helper;

import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J6\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\fH\u0002J4\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\fH\u0002J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u001e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/helper/WholeDayHeartRateHelper;", "", "", "startMin", "endMin", "originalBytesLength", "", "a", Constants.DATA_KEY_HR, GoogleApiAvailabilityLight.a, "", "hrDataList", "Lkotlin/Function1;", "checkHeartRate", "Landroid/util/Pair;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "e", HTTP.CONTENT_RANGE_BYTES, "curIndex", "interval", "c", "chartDataList", "Lcom/huami/chart/data/ChartDataList;", "b", "parseHeartRateData", "", "Ljava/lang/String;", "mTag", "HR_CHART_MERGE_POINT_COUNT", LogUtil.I, "", "INVALID_HR_VALUE", "F", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class WholeDayHeartRateHelper {
    public static final int HR_CHART_MERGE_POINT_COUNT = 5;

    @NotNull
    public static final WholeDayHeartRateHelper INSTANCE = new WholeDayHeartRateHelper();
    public static final float INVALID_HR_VALUE = -1.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String mTag = "WholeDayHeartRateProvider";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ SparseArray<ChartData> c;
        public final /* synthetic */ Ref.FloatRef d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.IntRef intRef, Ref.IntRef intRef2, SparseArray<ChartData> sparseArray, Ref.FloatRef floatRef) {
            super(0);
            this.a = intRef;
            this.b = intRef2;
            this.c = sparseArray;
            this.d = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startIndex = " + this.a.element + " - useIndex = " + this.b.element + " - size = " + this.c.size() + " - max = " + this.d.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef, int i) {
            super(0);
            this.a = intRef;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "第一个区间 chartDataIndex=" + this.a.element + " - i=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseHeartRateData 入睡下标 = " + this.a + " - 醒来下标 = " + this.b + " - size = " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<SparseArray<ChartData>, Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Pair<SparseArray<ChartData>, Integer> pair) {
            super(0);
            this.a = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "$ 算法计算后, 长度" + ((SparseArray) this.a.first).size() + ",值： " + this.a + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", TypedValues.Custom.S_INT, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Integer, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final boolean a(int i) {
            return WholeDayHeartRateHelper.INSTANCE.d(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }
    }

    private WholeDayHeartRateHelper() {
    }

    private final boolean a(int startMin, int endMin, int originalBytesLength) {
        return startMin < 0 || originalBytesLength <= 0 || originalBytesLength <= startMin || endMin < startMin;
    }

    private final ChartDataList b(SparseArray<ChartData> chartDataList) {
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = -1.0f;
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        SparseArray sparseArray = new SparseArray();
        int size = chartDataList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            chartDataList.keyAt(i);
            ChartData chartDataValueAt = chartDataList.valueAt(i);
            intRef2.element++;
            if (!(chartDataValueAt.getValues()[0] == -1.0f)) {
                float f = floatRef.element;
                if ((f == -1.0f) || f < chartDataValueAt.getValues()[0]) {
                    floatRef.element = chartDataValueAt.getValues()[0];
                }
                sparseArray.put(intRef2.element, chartDataValueAt);
                z = true;
            } else if (!z) {
                intRef.element++;
            }
        }
        HMLog.info(mTag, new a(intRef, intRef2, sparseArray, floatRef));
        ChartDataList chartDataList2 = new ChartDataList(sparseArray);
        chartDataList2.setStart(0);
        chartDataList2.setEnd(intRef2.element);
        chartDataList2.setMinValue(0.0f);
        float f2 = floatRef.element;
        chartDataList2.setMaxValue(f2 == -1.0f ? 0.0f : f2);
        return chartDataList2;
    }

    private final int c(byte[] bytes, int curIndex, int interval, Function1<? super Integer, Boolean> checkHeartRate) {
        int i;
        int i2 = (curIndex - interval) + 1;
        int i3 = 0;
        if (i2 <= curIndex) {
            int i4 = 0;
            while (true) {
                int i5 = curIndex - 1;
                byte b2 = bytes[curIndex];
                if (checkHeartRate.invoke(Integer.valueOf(b2)).booleanValue()) {
                    i3 += b2;
                    i4++;
                }
                if (curIndex == i2) {
                    break;
                }
                curIndex = i5;
            }
            i = i3;
            i3 = i4;
        } else {
            i = 0;
        }
        return i3 > 0 ? (int) ((i * 1.0f) / i3) : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(int hr) {
        return 30 <= hr && hr <= 240;
    }

    private final Pair<SparseArray<ChartData>, Integer> e(byte[] hrDataList, Function1<? super Integer, Boolean> checkHeartRate) {
        int i;
        int i2;
        int i3;
        SparseArray sparseArray = new SparseArray();
        Ref.IntRef intRef = new Ref.IntRef();
        int length = hrDataList.length - 1;
        byte b2 = -2147483648;
        byte b3 = 2147483647;
        if (length >= 0) {
            int i4 = 0;
            i = -1;
            i2 = -1;
            while (true) {
                int i5 = i4 + 1;
                byte b4 = (byte) (hrDataList[i4] & (-1));
                if (checkHeartRate.invoke(Integer.valueOf(b4)).booleanValue()) {
                    if (b4 > b2) {
                        i = i4 / 5;
                        b2 = b4;
                    }
                    if (1 <= b4 && b4 < b3) {
                        i2 = i4 / 5;
                        b3 = b4;
                    }
                }
                if (i5 > length) {
                    break;
                }
                i4 = i5;
            }
        } else {
            i = -1;
            i2 = -1;
        }
        int length2 = hrDataList.length - 1;
        if (length2 >= 0) {
            int i6 = 0;
            boolean z = false;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = i6 + 1;
                if (z) {
                    i7 += b2;
                    i8++;
                    z = false;
                } else {
                    byte b5 = (byte) (hrDataList[i6] & (-1));
                    if (checkHeartRate.invoke(Integer.valueOf(b5)).booleanValue()) {
                        i7 += b5;
                        i8++;
                    }
                    if (i10 % 5 == 0) {
                        if (i8 > 0) {
                            int i11 = (int) ((i7 * 1.0f) / i8);
                            int i12 = i6 / 5;
                            if (b3 != b2 && i12 == i2 && i12 == i) {
                                if (i12 == 0) {
                                    int i13 = intRef.element;
                                    sparseArray.put(i13, new ChartData(i13, b3));
                                    HMLog.info(mTag, new b(intRef, i6));
                                    i9 = i11;
                                    z = true;
                                } else {
                                    int i14 = intRef.element;
                                    sparseArray.put(i14 - 1, new ChartData(i14 - 1, b3));
                                    i11 = b2;
                                }
                            } else if (i2 == i12) {
                                i11 = b3;
                            } else if (i == i12) {
                                i11 = b2;
                            }
                            if (!z) {
                                int i15 = intRef.element;
                                sparseArray.put(i15, new ChartData(i15, i11));
                                i9 = i11;
                            }
                        } else {
                            int i16 = intRef.element;
                            sparseArray.put(i16, new ChartData(i16, -1.0f));
                        }
                        intRef.element++;
                        i7 = 0;
                        i8 = 0;
                    }
                }
                if (i10 > length2) {
                    break;
                }
                i6 = i10;
            }
            i3 = i9;
        } else {
            i3 = 0;
        }
        int length3 = hrDataList.length;
        int i17 = length3 % 5;
        if (i17 != 0) {
            int i18 = length3 / 5;
            if (b3 != b2 && i18 == i && i18 == i2) {
                int i19 = intRef.element;
                sparseArray.put(i19 - 1, new ChartData(i19 - 1, b3));
                int i20 = intRef.element;
                sparseArray.put(i20, new ChartData(i20, b2));
            } else if (i18 == i) {
                int i21 = intRef.element;
                sparseArray.put(i21, new ChartData(i21, b2));
            } else if (i18 == i2) {
                int i22 = intRef.element;
                sparseArray.put(i22, new ChartData(i22, b3));
            } else {
                int iC = c(hrDataList, length3 - 1, i17, checkHeartRate);
                if (checkHeartRate.invoke(Integer.valueOf(iC)).booleanValue()) {
                    int i23 = intRef.element;
                    sparseArray.put(i23, new ChartData(i23, iC));
                }
            }
        }
        return new Pair<>(sparseArray, Integer.valueOf(i3));
    }

    @NotNull
    public final ChartDataList parseHeartRateData(@NotNull byte[] bytes, int startMin, int endMin) {
        int length = bytes.length;
        HMLog.info(mTag, new c(startMin, endMin, length));
        if (a(startMin, endMin, length)) {
            return new ChartDataList(new SparseArray());
        }
        int iMin = Math.min(endMin + 1, length - 1);
        byte[] bArr = new byte[(endMin - startMin) + 1];
        ArraysKt___ArraysJvmKt.copyInto(bytes, bArr, 0, startMin, iMin);
        e eVar = e.a;
        Pair<SparseArray<ChartData>, Integer> pairE = e(bArr, eVar);
        HMLog.info(mTag, new d(pairE));
        return eVar.invoke((Integer) pairE.second).booleanValue() ? b((SparseArray) pairE.first) : new ChartDataList(new SparseArray());
    }
}
