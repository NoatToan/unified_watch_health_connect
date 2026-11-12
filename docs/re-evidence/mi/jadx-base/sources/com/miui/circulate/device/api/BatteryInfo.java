package com.miui.circulate.device.api;

import com.mibi.sdk.component.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/miui/circulate/device/api/BatteryInfo;", "Lcom/miui/circulate/device/api/Flat;", Constants.KEY_RECHARGE_VALUES, "", "", "([Ljava/lang/Double;)V", "getValues", "()[Ljava/lang/Double;", "[Ljava/lang/Double;", "component1", "copy", "([Ljava/lang/Double;)Lcom/miui/circulate/device/api/BatteryInfo;", "equals", "", "other", "", "flat", "", "hashCode", "", "toString", "Companion", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBatteryInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatteryInfo.kt\ncom/miui/circulate/device/api/BatteryInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n13579#2,2:54\n*S KotlinDebug\n*F\n+ 1 BatteryInfo.kt\ncom/miui/circulate/device/api/BatteryInfo\n*L\n11#1:54,2\n*E\n"})
public final /* data */ class BatteryInfo implements Flat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Double[] values;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00020\t\"\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/miui/circulate/device/api/BatteryInfo$Companion;", "", "()V", "of", "Lcom/miui/circulate/device/api/BatteryInfo;", Column.BATTERY, "", "ofMultiple", Constants.KEY_RECHARGE_VALUES, "", "parse", "json", "", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BatteryInfo of(double battery) {
            return new BatteryInfo(new Double[]{Double.valueOf(battery)});
        }

        @JvmStatic
        @NotNull
        public final BatteryInfo ofMultiple(@NotNull double... values) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new BatteryInfo(ArraysKt___ArraysJvmKt.toTypedArray(values));
        }

        @Nullable
        public final BatteryInfo parse(@Nullable String json) {
            if (json == null || json.length() == 0) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(json);
            int length = jSONArray.length();
            Double[] dArr = new Double[length];
            for (int i = 0; i < length; i++) {
                dArr[i] = Double.valueOf(0.0d);
            }
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = Double.valueOf(jSONArray.getDouble(i2));
            }
            return new BatteryInfo(dArr);
        }
    }

    public BatteryInfo(@NotNull Double[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
    }

    public static /* synthetic */ BatteryInfo copy$default(BatteryInfo batteryInfo, Double[] dArr, int i, Object obj) {
        if ((i & 1) != 0) {
            dArr = batteryInfo.values;
        }
        return batteryInfo.copy(dArr);
    }

    @JvmStatic
    @NotNull
    public static final BatteryInfo of(double d) {
        return INSTANCE.of(d);
    }

    @JvmStatic
    @NotNull
    public static final BatteryInfo ofMultiple(@NotNull double... dArr) {
        return INSTANCE.ofMultiple(dArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double[] getValues() {
        return this.values;
    }

    @NotNull
    public final BatteryInfo copy(@NotNull Double[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return new BatteryInfo(values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BatteryInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.miui.circulate.device.api.BatteryInfo");
        return Arrays.equals(this.values, ((BatteryInfo) other).values);
    }

    @Override // com.miui.circulate.device.api.Flat
    @NotNull
    public String flat() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Double d : this.values) {
            jSONArray.put(d.doubleValue());
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    @NotNull
    public final Double[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }

    @NotNull
    public String toString() {
        return "BatteryInfo(values=" + Arrays.toString(this.values) + ')';
    }
}
