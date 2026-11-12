package com.huami.heartrate.chart;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.app.restheartrate.service.api.MaxHeartApi;
import com.app.restheartrate.service.entity.MaxHeartRate;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.heartrate.R;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.model.HeartRateSection;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.widget.colorbar.ColorItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u001aE\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u0014\u001a\u00020\u00002!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015H\u0002\u001a\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006H\u0000\u001a(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0000\u0018\u00010 *\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0000\u0018\u00010 H\u0000\u001a\u0019\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010#\u001a\u00020\u0000H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010&\u001a\u0004\u0018\u00010\u0006*\u00020\bH\u0002¢\u0006\u0004\b&\u0010'\u001a\u0010\u0010(\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0000\"\u0016\u0010*\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010)\"I\u0010.\u001a/\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(#\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\u001b0\u00158\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-\"7\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u00158\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b\u001a\u0010-¨\u0006/"}, d2 = {"", "wholeHrData", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "measureHrData", "mergeMeasureToWholeDay", "", "indexInDay", "", "c", "([BI)Ljava/lang/Byte;", "findLastValidHeartRateIndex", "", "timeInMillis", "b", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "chartDataList", "Lcom/huami/heartrate/chart/ShowValue;", "findMaxMinAverage", "hrDataList", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constant.KEY_HR_VALUE, "", "isValidHeartRate", "Landroid/util/Pair;", GoogleApiAvailabilityLight.a, "age", "Lcom/huami/heartrate/chart/HeartRateInfo;", "parseWholeDayHeartRateData", "", "", "handleMaxHeartRate", "rawArray", "a", "([B)Ljava/lang/Integer;", "e", "(B)Ljava/lang/Integer;", "getMaxHeartRate", "Ljava/lang/String;", "TAG", "Lkotlin/jvm/functions/Function1;", "getWholeDayHeartRateDataConvert", "()Lkotlin/jvm/functions/Function1;", "wholeDayHeartRateDataConvert", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class HandleDataKt {

    @NotNull
    private static final String a = "WholeDayHeartRateDataProcess";

    @NotNull
    private static final Function1<byte[], Pair<SparseArray<ChartData>, Integer>> b = d.a;

    @NotNull
    private static final Function1<Integer, Boolean> c = b.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "最大心率数据-> " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final boolean a(int i) {
            return 40 <= i && i <= 220;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ Ref.IntRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(0);
            this.a = intRef;
            this.b = intRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "maxHr: " + this.a.element + ", minHr: " + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Landroid/util/Pair;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<byte[], Pair<SparseArray<ChartData>, Integer>> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<SparseArray<ChartData>, Integer> invoke(@NotNull byte[] bArr) {
            return HandleDataKt.d(bArr, HandleDataKt.isValidHeartRate());
        }
    }

    private static final Integer a(byte[] bArr) {
        Integer num;
        int i = 1;
        if (bArr.length == 0) {
            num = null;
        } else {
            Integer numE = e(bArr[0]);
            Integer numValueOf = Integer.valueOf(numE == null ? 0 : numE.intValue());
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
            if (1 <= lastIndex) {
                while (true) {
                    Integer numE2 = e(bArr[i]);
                    Integer numValueOf2 = Integer.valueOf(numE2 == null ? 0 : numE2.intValue());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            num = numValueOf;
        }
        return num;
    }

    private static final int b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    private static final Byte c(byte[] bArr, int i) {
        Byte orNull = ArraysKt___ArraysKt.getOrNull(bArr, i);
        if (orNull == null) {
            return null;
        }
        orNull.byteValue();
        if (c.invoke(Integer.valueOf(orNull.byteValue() & 255)).booleanValue()) {
            return orNull;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<SparseArray<ChartData>, Integer> d(byte[] bArr, Function1<? super Integer, Boolean> function1) {
        int i;
        int i2;
        int i3;
        SparseArray sparseArray = new SparseArray();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Integer.MIN_VALUE;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = Integer.MAX_VALUE;
        int length = bArr.length - 1;
        if (length >= 0) {
            int i4 = 0;
            i = -1;
            i2 = -1;
            while (true) {
                int i5 = i4 + 1;
                int i6 = bArr[i4] & 255;
                if (function1.invoke(Integer.valueOf(i6)).booleanValue()) {
                    if (i6 > intRef.element) {
                        intRef.element = i6;
                        i2 = i4 / 5;
                    }
                    if (1 <= i6 && i6 < intRef2.element) {
                        intRef2.element = i6;
                        i = i4 / 5;
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
        HMLog.debug(a, new c(intRef, intRef2));
        int length2 = bArr.length - 1;
        if (length2 >= 0) {
            int i7 = 0;
            boolean z = false;
            int i8 = -1;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i7 + 1;
                if (z) {
                    z = false;
                } else {
                    int i12 = bArr[i7] & 255;
                    if (function1.invoke(Integer.valueOf(i12)).booleanValue()) {
                        i8 = i12;
                    }
                    if (i11 % 5 == 0) {
                        if (i8 > -1) {
                            int i13 = i7 / 5;
                            int i14 = intRef2.element;
                            int i15 = intRef.element;
                            if (i14 != i15 && i13 == i && i13 == i2) {
                                if (i13 == 0) {
                                    sparseArray.put(i10, new ChartData(i10, i14));
                                    sparseArray.put(i10, new ChartData(i10, intRef.element));
                                    i9 = i8;
                                    z = true;
                                } else {
                                    int i16 = i10 - 1;
                                    sparseArray.put(i16, new ChartData(i16, i14));
                                    i8 = intRef.element;
                                }
                            } else if (i == i13) {
                                i8 = i14;
                            } else if (i2 == i13) {
                                i8 = i15;
                            }
                            if (!z) {
                                sparseArray.put(i10, new ChartData(i10, i8));
                                i9 = i8;
                            }
                        }
                        i10++;
                        i8 = -1;
                    }
                }
                if (i11 > length2) {
                    break;
                }
                i7 = i11;
            }
            i3 = i9;
        } else {
            i3 = 0;
        }
        return new Pair<>(sparseArray, Integer.valueOf(i3));
    }

    private static final Integer e(byte b2) {
        int i = b2 & 255;
        if (c.invoke(Integer.valueOf(i)).booleanValue()) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public static final int findLastValidHeartRateIndex(@NotNull byte[] bArr) {
        int length = bArr.length - 1;
        if (length < 0) {
            return 0;
        }
        while (true) {
            int i = length - 1;
            if (c.invoke(Integer.valueOf(bArr[length] & 255)).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return 0;
            }
            length = i;
        }
    }

    @NotNull
    public static final ShowValue findMaxMinAverage(@NotNull SparseArray<ChartData> sparseArray) {
        int i;
        int i2;
        int i3;
        int size;
        if (sparseArray.size() == 0) {
            return new ShowValue(0, 0, 0, 7, null);
        }
        int i4 = -1;
        if (sparseArray.size() == 0 || (size = sparseArray.size() - 1) < 0) {
            i = Integer.MAX_VALUE;
            i2 = 0;
            i3 = 0;
        } else {
            i = Integer.MAX_VALUE;
            i2 = 0;
            i3 = 0;
            while (true) {
                int i5 = size - 1;
                int sumValue = (int) sparseArray.valueAt(size).getSumValue();
                if (1 <= sumValue && sumValue < i) {
                    i = sumValue;
                }
                if (sumValue > i4) {
                    i4 = sumValue;
                }
                if (c.invoke(Integer.valueOf(sumValue)).booleanValue()) {
                    i2 += sumValue;
                    i3++;
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return i3 == 0 ? new ShowValue(0, 0, 0, 7, null) : new ShowValue(i4, i != Integer.MAX_VALUE ? i : 0, i2 / i3);
    }

    public static final int getMaxHeartRate(int i) {
        return 220 - i;
    }

    @NotNull
    public static final Function1<byte[], Pair<SparseArray<ChartData>, Integer>> getWholeDayHeartRateDataConvert() {
        return b;
    }

    @Nullable
    public static final Map<String, byte[]> handleMaxHeartRate(@Nullable Map<String, byte[]> map) {
        MaxHeartRate heartRateByDate;
        if (map == null || KoinExtKt.getTruthMaxHeartRate() == null) {
            return map;
        }
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, byte[]>> it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, byte[]> next = it2.next();
            byte[] bArr = (byte[]) next.getValue().clone();
            MaxHeartApi truthMaxHeartRate = KoinExtKt.getTruthMaxHeartRate();
            if (truthMaxHeartRate != null && (heartRateByDate = truthMaxHeartRate.getHeartRateByDate(next.getKey())) != null) {
                long time = heartRateByDate.getTime();
                int value = heartRateByDate.getValue();
                Integer numA = a(next.getValue());
                int iIntValue = numA != null ? numA.intValue() : 0;
                if (iIntValue < value) {
                    bArr[b(ExtensionUtilsKt.secondToMills(time))] = (byte) value;
                }
                sb.append("date : " + ((Object) next.getKey()) + " | maxHeartRate(" + time + "," + value + "),rawMax:" + iIntValue + " ");
            }
            linkedHashMap.put(next.getKey(), bArr);
        }
        String string = sb.toString();
        if ((string.length() > 0 ? 1 : 0) != 0) {
            HMLog.info(a, new a(string));
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Function1<Integer, Boolean> isValidHeartRate() {
        return c;
    }

    @NotNull
    public static final byte[] mergeMeasureToWholeDay(@NotNull byte[] bArr, @Nullable List<HeartRateEntity> list) {
        byte[] bArr2 = (byte[]) bArr.clone();
        boolean z = true;
        if (!(bArr2.length == 0)) {
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z) {
                for (HeartRateEntity heartRateEntity : list) {
                    int iB = b(heartRateEntity.getTime() * ((long) 1000));
                    if (c(bArr2, iB) == null) {
                        Integer hr = heartRateEntity.getHr();
                        bArr2[iB] = (byte) (hr == null ? 0 : hr.intValue());
                    }
                }
            }
        }
        return bArr2;
    }

    @NotNull
    public static final HeartRateInfo parseWholeDayHeartRateData(@NotNull byte[] bArr, int i) {
        String str;
        byte[] bArr2 = bArr;
        float maxHeartRate = getMaxHeartRate(i);
        float f = 0.5f * maxHeartRate;
        float f2 = 0.6f * maxHeartRate;
        float f3 = 0.7f * maxHeartRate;
        float f4 = 0.8f * maxHeartRate;
        float f5 = maxHeartRate * 0.9f;
        int length = bArr2.length;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i2 < length) {
            byte b2 = bArr2[i2];
            i2++;
            int i11 = b2 & 255;
            if (c.invoke(Integer.valueOf(i11)).booleanValue()) {
                float f6 = i11;
                if (f6 >= f5) {
                    i5++;
                } else if (f6 >= f4 && f6 < f5) {
                    i10++;
                } else if (f6 >= f3 && f6 < f4) {
                    i9++;
                } else if (f6 >= f2 && f6 < f3) {
                    i8++;
                } else if (f6 < f || f6 >= f2) {
                    i6++;
                } else {
                    i7++;
                }
                if (i11 > i4) {
                    i4 = i11;
                }
                if (i11 < i3) {
                    i3 = i11;
                }
            }
            bArr2 = bArr;
        }
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        if (i4 == 0 && i3 == 0) {
            return new HeartRateInfo(false, null, null, 6, null);
        }
        int[] iArr = {R.color.heart_rate_range_tape_rest, R.color.heart_rate_range_tape_warm_up, R.color.heart_rate_range_tape_fat_burn, R.color.heart_rate_range_tape_lung_strength, R.color.heart_rate_range_tape_stamina_strength, R.color.heart_rate_range_tape_anaerobic_limit};
        int[] iArr2 = {R.string.heart_rate_hr_section_rest, R.string.heart_rate_hr_section_warm_up, R.string.heart_rate_hr_section_fat_burn, R.string.heart_rate_hr_section_heart_lung_strengthen, R.string.heart_rate_hr_section_stamina_strengthen, R.string.heart_rate_hr_section_anaerobic_limit};
        int[] iArr3 = {i6, i7, i8, i9, i10, i5};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        boolean z = false;
        while (true) {
            int i13 = i12 + 1;
            String string = KoinExtKt.getAppContext().getString(iArr2[i12]);
            int color = ContextCompat.getColor(KoinExtKt.getAppContext(), iArr[i12]);
            int i14 = iArr3[i12];
            int i15 = i14 / 60;
            int i16 = i14 % 60;
            if (i14 >= 60) {
                String string2 = KoinExtKt.getAppContext().getString(R.string.heart_rate_unit_hour_long);
                String string3 = StringsKt__StringsKt.trim(KoinExtKt.getAppContext().getString(R.string.heart_rate_unit_min_long)).toString();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format(Locale.getDefault(), "%d%s% 02d%s", Arrays.copyOf(new Object[]{Integer.valueOf(i15), string2, Integer.valueOf(i16), string3}, 4));
            } else {
                String string4 = KoinExtKt.getAppContext().getString(R.string.heart_rate_unit_min_long);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format(Locale.getDefault(), "%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(i16), string4}, 2));
            }
            arrayList.add(ColorItem.create(color, i14));
            arrayList2.add(new HeartRateSection(color, string, str));
            if (i14 > 0) {
                z = true;
            }
            if (i13 > 5) {
                break;
            }
            i12 = i13;
        }
        if (!z) {
            arrayList.add(ColorItem.create(ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.hr_tape_rest), 1.0f));
        }
        return new HeartRateInfo(true, arrayList, arrayList2);
    }
}
