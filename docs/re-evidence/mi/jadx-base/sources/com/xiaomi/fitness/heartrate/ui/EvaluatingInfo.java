package com.xiaomi.fitness.heartrate.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\u0010\u0004\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\u000eB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0010J\u0010\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u0005J\u0016\u0010+\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u001cJ\u0006\u0010.\u001a\u00020\u0003J\b\u00102\u001a\u00020\u0003H\u0016J\u0013\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00105\u001a\u00020,H\u0002J\b\u00106\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010 R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b/\u00101¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/EvaluatingInfo;", "", "evaluationType", "", "name", "", "indicators", "", "Lcom/xiaomi/fitness/heartrate/ui/ValueData;", "normalValues", "valueData", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/xiaomi/fitness/heartrate/ui/ValueData;)V", "value", "(ILcom/xiaomi/fitness/heartrate/ui/ValueData;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(ILcom/xiaomi/fitness/heartrate/ui/ValueData;Ljava/lang/String;)V", "(ILcom/xiaomi/fitness/heartrate/ui/ValueData;)V", "getEvaluationType", "()I", "getName", "()Ljava/lang/String;", "getIndicators", "()Ljava/util/List;", "getNormalValues", "getValueData", "()Lcom/xiaomi/fitness/heartrate/ui/ValueData;", "mAccurateValue", "", "", "description", "getDescription", "setDescription", "(Ljava/lang/String;)V", "mValueIndex", "Ljava/lang/Integer;", "advice", "getAdvice", "setAdvice", "evidenceBased", "getEvidenceBased", "setEvidenceBased", "getAccurateValue", "key", "setAccurateValue", "", "accurateValue", "findIndicatorIndex", "isNormal", "", "()Z", "hashCode", "equals", "other", "performSetIndicatorUniqueIndex", "toString", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEvaluatingInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaluatingInfo.kt\ncom/xiaomi/fitness/heartrate/ui/EvaluatingInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1872#2,3:131\n*S KotlinDebug\n*F\n+ 1 EvaluatingInfo.kt\ncom/xiaomi/fitness/heartrate/ui/EvaluatingInfo\n*L\n121#1:131,3\n*E\n"})
public final class EvaluatingInfo {

    @Nullable
    private String advice;

    @Nullable
    private String description;
    private final int evaluationType;

    @Nullable
    private String evidenceBased;

    @NotNull
    private final List<ValueData> indicators;

    @Nullable
    private Map<String, Number> mAccurateValue;

    @Nullable
    private Integer mValueIndex;

    @NotNull
    private final String name;

    @NotNull
    private final List<ValueData> normalValues;

    @NotNull
    private final ValueData valueData;

    public EvaluatingInfo(int i, @NotNull String name, @NotNull List<ValueData> indicators, @NotNull List<ValueData> normalValues, @NotNull ValueData valueData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(normalValues, "normalValues");
        Intrinsics.checkNotNullParameter(valueData, "valueData");
        this.evaluationType = i;
        this.name = name;
        this.indicators = indicators;
        this.normalValues = normalValues;
        this.valueData = valueData;
        performSetIndicatorUniqueIndex();
    }

    private final void performSetIndicatorUniqueIndex() {
        int i = 0;
        for (Object obj : this.indicators) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((ValueData) obj).setUniqueIndex(i2);
            i = i2;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluatingInfo)) {
            return false;
        }
        EvaluatingInfo evaluatingInfo = (EvaluatingInfo) other;
        return this.evaluationType == evaluatingInfo.evaluationType && Intrinsics.areEqual(this.name, evaluatingInfo.name) && Intrinsics.areEqual(this.valueData, evaluatingInfo.valueData) && Intrinsics.areEqual(this.indicators, evaluatingInfo.indicators) && Intrinsics.areEqual(this.normalValues, evaluatingInfo.normalValues);
    }

    public final int findIndicatorIndex() {
        Integer num = this.mValueIndex;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            return num.intValue();
        }
        int size = this.indicators.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(this.indicators.get(i), this.valueData)) {
                this.mValueIndex = Integer.valueOf(i);
                break;
            }
        }
        if (this.mValueIndex == null) {
            this.mValueIndex = -1;
        }
        Integer num2 = this.mValueIndex;
        Intrinsics.checkNotNull(num2);
        return num2.intValue();
    }

    @Nullable
    public final Number getAccurateValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Number> map = this.mAccurateValue;
        if (map == null) {
            return null;
        }
        Intrinsics.checkNotNull(map);
        return map.get(key);
    }

    @Nullable
    public final String getAdvice() {
        return this.advice;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getEvaluationType() {
        return this.evaluationType;
    }

    @Nullable
    public final String getEvidenceBased() {
        return this.evidenceBased;
    }

    @NotNull
    public final List<ValueData> getIndicators() {
        return this.indicators;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<ValueData> getNormalValues() {
        return this.normalValues;
    }

    @NotNull
    public final ValueData getValueData() {
        return this.valueData;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.evaluationType), this.name, this.valueData, this.indicators, this.normalValues);
    }

    public final boolean isNormal() {
        return this.normalValues.contains(this.valueData);
    }

    public final void setAccurateValue(@NotNull String key, @NotNull Number accurateValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(accurateValue, "accurateValue");
        if (this.mAccurateValue == null) {
            this.mAccurateValue = new HashMap();
        }
        Map<String, Number> map = this.mAccurateValue;
        Intrinsics.checkNotNull(map);
        map.put(key, accurateValue);
    }

    public final void setAdvice(@Nullable String str) {
        this.advice = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setEvidenceBased(@Nullable String str) {
        this.evidenceBased = str;
    }

    @NotNull
    public String toString() {
        return "EvaluatingInfo(evaluationType=" + this.evaluationType + ", name='" + this.name + "', valueData=" + this.valueData + ", mAccurateValue=" + this.mAccurateValue + ", indicators=" + CollectionsKt___CollectionsKt.joinToString$default(this.indicators, null, null, null, 0, null, null, 63, null) + ", normalValues=" + CollectionsKt___CollectionsKt.joinToString$default(this.normalValues, null, null, null, 0, null, null, 63, null) + ", description=" + this.description + ", mValueIndex=" + this.mValueIndex + ", advice=" + this.advice + ", evidenceBased=" + this.evidenceBased + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaluatingInfo(int i, @NotNull ValueData value, @NotNull String name, @NotNull List<ValueData> indicators, @NotNull List<ValueData> normalValues) {
        this(i, name, indicators, normalValues, value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(normalValues, "normalValues");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaluatingInfo(int i, @NotNull ValueData value, @NotNull String name) {
        this(i, value, name, (List<ValueData>) CollectionsKt__CollectionsKt.emptyList(), (List<ValueData>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaluatingInfo(int i, @NotNull ValueData value) {
        this(i, value, "");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
