package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019BW\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003Jd\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\u0019\u0010\u0013\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000eR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u000eR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000eR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u000eR\u001c\u0010\u0019\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "checkValid", "", "component1", "", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "valueCount", "values", "minValueCount", "maxValueCount", "minValue", "maxValue", "containDesc", "copy", "(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "", "toString", "hashCode", "", "other", "equals", "a", LogUtil.I, "getValueCount", "()I", "b", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "c", "Ljava/lang/Integer;", "getMinValueCount", GoogleApiAvailabilityLight.a, "getMaxValueCount", "e", "getMinValue", "f", "getMaxValue", "g", "Z", "getContainDesc", "()Z", "<init>", "(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IntegerArray implements IPrimaryData, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int valueCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Integer> values;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer minValueCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer maxValueCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer minValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer maxValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean containDesc;

    public IntegerArray(int i, @NotNull List<Integer> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, boolean z) {
        this.valueCount = i;
        this.values = list;
        this.minValueCount = num;
        this.maxValueCount = num2;
        this.minValue = num3;
        this.maxValue = num4;
        this.containDesc = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntegerArray copy$default(IntegerArray integerArray, int i, List list, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = integerArray.valueCount;
        }
        if ((i2 & 2) != 0) {
            list = integerArray.values;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            num = integerArray.minValueCount;
        }
        Integer num5 = num;
        if ((i2 & 8) != 0) {
            num2 = integerArray.maxValueCount;
        }
        Integer num6 = num2;
        if ((i2 & 16) != 0) {
            num3 = integerArray.minValue;
        }
        Integer num7 = num3;
        if ((i2 & 32) != 0) {
            num4 = integerArray.maxValue;
        }
        Integer num8 = num4;
        if ((i2 & 64) != 0) {
            z = integerArray.getContainDesc();
        }
        return integerArray.copy(i, list2, num5, num6, num7, num8, z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        Integer num;
        if (getContainDesc()) {
            if (this.minValueCount == null || this.maxValueCount == null || this.minValue == null || this.maxValue == null || this.valueCount != this.values.size()) {
                return false;
            }
            Integer num2 = this.minValueCount;
            Integer num3 = this.maxValueCount;
            int i = this.valueCount;
            if (!(num2.intValue() <= i && i <= num3.intValue()) || (num = (Integer) CollectionsKt.minOrNull((Iterable) this.values)) == null) {
                return false;
            }
            int iIntValue = num.intValue();
            Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) this.values);
            if (num4 == null) {
                return false;
            }
            int iIntValue2 = num4.intValue();
            if (iIntValue < this.minValue.intValue() || iIntValue2 > this.maxValue.intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.values;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMinValueCount() {
        return this.minValueCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxValueCount() {
        return this.maxValueCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMinValue() {
        return this.minValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final boolean component7() {
        return getContainDesc();
    }

    @NotNull
    public final IntegerArray copy(int valueCount, @NotNull List<Integer> values, @Nullable Integer minValueCount, @Nullable Integer maxValueCount, @Nullable Integer minValue, @Nullable Integer maxValue, boolean containDesc) {
        return new IntegerArray(valueCount, values, minValueCount, maxValueCount, minValue, maxValue, containDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegerArray)) {
            return false;
        }
        IntegerArray integerArray = (IntegerArray) other;
        return this.valueCount == integerArray.valueCount && Intrinsics.areEqual(this.values, integerArray.values) && Intrinsics.areEqual(this.minValueCount, integerArray.minValueCount) && Intrinsics.areEqual(this.maxValueCount, integerArray.maxValueCount) && Intrinsics.areEqual(this.minValue, integerArray.minValue) && Intrinsics.areEqual(this.maxValue, integerArray.maxValue) && getContainDesc() == integerArray.getContainDesc();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    @Nullable
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    public final Integer getMaxValueCount() {
        return this.maxValueCount;
    }

    @Nullable
    public final Integer getMinValue() {
        return this.minValue;
    }

    @Nullable
    public final Integer getMinValueCount() {
        return this.minValueCount;
    }

    public final int getValueCount() {
        return this.valueCount;
    }

    @NotNull
    public final List<Integer> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    public int hashCode() {
        int iHashCode = ((this.valueCount * 31) + this.values.hashCode()) * 31;
        Integer num = this.minValueCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxValueCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minValue;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxValue;
        int iHashCode5 = (iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        boolean containDesc = getContainDesc();
        ?? r1 = containDesc;
        if (containDesc) {
            r1 = 1;
        }
        return iHashCode5 + r1;
    }

    @NotNull
    public String toString() {
        return "IntegerArray(valueCount=" + this.valueCount + ", values=" + this.values + ", minValueCount=" + this.minValueCount + ", maxValueCount=" + this.maxValueCount + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", containDesc=" + getContainDesc() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) {
        bos.write(2);
        bos.write(this.valueCount);
        Iterator<T> it2 = this.values.iterator();
        while (it2.hasNext()) {
            bos.write(GattUtils.shortToBytes((short) ((Number) it2.next()).intValue()));
        }
    }

    public /* synthetic */ IntegerArray(int i, List list, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? null : num4, (i2 & 64) != 0 ? false : z);
    }
}
