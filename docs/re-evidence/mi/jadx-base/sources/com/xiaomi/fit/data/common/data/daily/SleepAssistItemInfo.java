package com.xiaomi.fit.data.common.data.daily;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0004\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0015J\b\u0010)\u001a\u00020*H\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0002\u0010\u0012J<\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u00066"}, d2 = {"Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "Ljava/io/Serializable;", "firstRecordTime", "", "sampleUnit", "", "count", Constants.KEY_RECHARGE_VALUES, "", "", "<init>", "(JSS[Ljava/lang/Number;)V", "getFirstRecordTime", "()J", "getSampleUnit", "()S", "getCount", "getValues", "()[Ljava/lang/Number;", "[Ljava/lang/Number;", "sumValue", "", "getSumValue", "()I", "setSumValue", "(I)V", "avgValue", "getAvgValue", "setAvgValue", Constants.KEY_RECHARGE_MAXVALUE, "getMaxValue", "setMaxValue", Constants.KEY_RECHARGE_MINVALUE, "getMinValue", "setMinValue", "computeIntMeanValues", "", "bedTime", "wakeupTime", "computeVisibleSnoreDecibelArray", CloudContract.COL_ZONE_OFFSET, "toString", "", "component1", "component2", "component3", "component4", "copy", "(JSS[Ljava/lang/Number;)Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "equals", "", "other", "", "hashCode", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAssistItemInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAssistItemInfo.kt\ncom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,121:1\n37#2:122\n36#2,3:123\n*S KotlinDebug\n*F\n+ 1 SleepAssistItemInfo.kt\ncom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo\n*L\n113#1:122\n113#1:123,3\n*E\n"})
public final /* data */ class SleepAssistItemInfo implements Serializable {
    private int avgValue;
    private final short count;
    private final long firstRecordTime;
    private int maxValue;
    private int minValue;
    private final short sampleUnit;
    private int sumValue;

    @NotNull
    private final Number[] values;

    public SleepAssistItemInfo(long j, short s, short s2, @NotNull Number[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.firstRecordTime = j;
        this.sampleUnit = s;
        this.count = s2;
        this.values = values;
        this.maxValue = -1;
        this.minValue = -1;
    }

    public static /* synthetic */ SleepAssistItemInfo copy$default(SleepAssistItemInfo sleepAssistItemInfo, long j, short s, short s2, Number[] numberArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepAssistItemInfo.firstRecordTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            s = sleepAssistItemInfo.sampleUnit;
        }
        short s3 = s;
        if ((i & 4) != 0) {
            s2 = sleepAssistItemInfo.count;
        }
        short s4 = s2;
        if ((i & 8) != 0) {
            numberArr = sleepAssistItemInfo.values;
        }
        return sleepAssistItemInfo.copy(j2, s3, s4, numberArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFirstRecordTime() {
        return this.firstRecordTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getSampleUnit() {
        return this.sampleUnit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Number[] getValues() {
        return this.values;
    }

    public final void computeIntMeanValues(long bedTime, long wakeupTime) {
        int iIntValue;
        short s = this.count;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < s; i5++) {
            long j = this.firstRecordTime + ((long) (this.sampleUnit * i5));
            if (j >= bedTime && j <= wakeupTime && (iIntValue = this.values[i5].intValue()) > 0) {
                i++;
                i2 += iIntValue;
                if (i3 == -1 || i3 < iIntValue) {
                    i3 = iIntValue;
                }
                if (i4 == -1 || i4 > iIntValue) {
                    i4 = iIntValue;
                }
            }
        }
        if (i > 0) {
            this.avgValue = MathKt__MathJVMKt.roundToInt((i2 * 1.0f) / i);
            this.sumValue = i2;
            this.maxValue = i3;
            this.minValue = i4;
        }
    }

    @NotNull
    public final SleepAssistItemInfo computeVisibleSnoreDecibelArray(int zoneOffset) {
        long j;
        float f;
        boolean z;
        float f2;
        short s = this.count;
        boolean z2 = false;
        long j2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        long j3 = 0;
        for (int i = 0; i < s; i++) {
            float fFloatValue = this.values[i].floatValue();
            if (fFloatValue > 0.0f) {
                if (f3 < fFloatValue) {
                    j2 = this.firstRecordTime + ((long) (this.sampleUnit * i));
                    f3 = fFloatValue;
                }
                if (f4 == 0.0f || f4 > fFloatValue) {
                    j3 = this.firstRecordTime + ((long) (this.sampleUnit * i));
                    f4 = fFloatValue;
                }
            }
        }
        FitnessLogUtils.i("SleepAssistItemInfo", "max(" + j2 + ", " + f3 + "), min(" + j3 + ", " + f4 + "), " + this);
        int i2 = 1800 / this.sampleUnit;
        int i3 = this.count / i2;
        ArrayList arrayList = new ArrayList();
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 * i2;
                int i6 = i4 + 1;
                int i7 = i6 * i2;
                short s2 = this.count;
                if (i5 > s2) {
                    z = z2;
                    j = j2;
                    f = f3;
                } else {
                    j = j2;
                    if (i7 > s2) {
                        i7 = s2;
                    }
                    long j4 = this.firstRecordTime;
                    short s3 = this.sampleUnit;
                    f = f3;
                    long j5 = ((long) (i5 * s3)) + j4;
                    long j6 = j4 + ((long) (s3 * i7));
                    if (j5 > j || j >= j6) {
                        if (j5 > j3 || j3 >= j6) {
                            int i8 = 0;
                            float f5 = 0.0f;
                            for (int i9 = i5; i9 < i7; i9++) {
                                float fFloatValue2 = this.values[i9].floatValue();
                                if (fFloatValue2 > 0.0f) {
                                    f5 += fFloatValue2;
                                    i8++;
                                }
                            }
                            z = false;
                            f2 = i8 == 0 ? 0.0f : f5 / i8;
                        } else {
                            f2 = f4;
                        }
                        arrayList.add(Float.valueOf(f2));
                    } else {
                        f2 = f;
                    }
                    z = false;
                    arrayList.add(Float.valueOf(f2));
                }
                if (i4 == i3) {
                    break;
                }
                j2 = j;
                z2 = z;
                f3 = f;
                i4 = i6;
            }
        }
        return new SleepAssistItemInfo(this.firstRecordTime + ((long) zoneOffset), (short) 1800, (short) arrayList.size(), (Number[]) arrayList.toArray(new Number[0]));
    }

    @NotNull
    public final SleepAssistItemInfo copy(long firstRecordTime, short sampleUnit, short count, @NotNull Number[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return new SleepAssistItemInfo(firstRecordTime, sampleUnit, count, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAssistItemInfo)) {
            return false;
        }
        SleepAssistItemInfo sleepAssistItemInfo = (SleepAssistItemInfo) other;
        return this.firstRecordTime == sleepAssistItemInfo.firstRecordTime && this.sampleUnit == sleepAssistItemInfo.sampleUnit && this.count == sleepAssistItemInfo.count && Intrinsics.areEqual(this.values, sleepAssistItemInfo.values);
    }

    public final int getAvgValue() {
        return this.avgValue;
    }

    public final short getCount() {
        return this.count;
    }

    public final long getFirstRecordTime() {
        return this.firstRecordTime;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final short getSampleUnit() {
        return this.sampleUnit;
    }

    public final int getSumValue() {
        return this.sumValue;
    }

    @NotNull
    public final Number[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.firstRecordTime) * 31) + Short.hashCode(this.sampleUnit)) * 31) + Short.hashCode(this.count)) * 31) + Arrays.hashCode(this.values);
    }

    public final void setAvgValue(int i) {
        this.avgValue = i;
    }

    public final void setMaxValue(int i) {
        this.maxValue = i;
    }

    public final void setMinValue(int i) {
        this.minValue = i;
    }

    public final void setSumValue(int i) {
        this.sumValue = i;
    }

    @NotNull
    public String toString() {
        long j = this.firstRecordTime;
        short s = this.count;
        short s2 = this.sampleUnit;
        String string = Arrays.toString(this.values);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "{firstRecordTime = " + j + ", count = " + ((int) s) + ", sampleUnit = " + ((int) s2) + " s , value = " + string + " }";
    }
}
