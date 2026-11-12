package com.xiaomi.hm.health.bt.profile.bodytemperature;

import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import com.xiaomi.hm.health.bt.utils.TimeUtil;
import defpackage.b;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bodytemperature/Temperature;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "timeMillis", "values", "copy", "a", "J", "getTimeMillis", "()J", "setTimeMillis", "(J)V", "b", "[F", "getValues", "()[F", "setValues", "([F)V", "<init>", "(J[F)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Temperature {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long timeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private float[] values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bodytemperature/Temperature$Companion;", "", "", "binaryTemperatureDataBytes", "", "Lcom/xiaomi/hm/health/bt/profile/bodytemperature/Temperature;", "parseFrom", "([B)[Lcom/xiaomi/hm/health/bt/profile/bodytemperature/Temperature;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Temperature[] parseFrom(@NotNull byte[] binaryTemperatureDataBytes) {
            BinaryTemperatureData[] from = BinaryTemperatureData.INSTANCE.parseFrom(binaryTemperatureDataBytes);
            int length = from.length;
            Temperature[] temperatureArr = new Temperature[length];
            for (int i = 0; i < length; i++) {
                temperatureArr[i] = new Temperature(0L, null, 3, null);
            }
            int length2 = from.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length2) {
                BinaryTemperatureData binaryTemperatureData = from[i2];
                int i4 = i3 + 1;
                Temperature temperature = temperatureArr[i3];
                temperature.setTimeMillis(TemperatureKt.toCalendar(TemperatureKt.dateTime(binaryTemperatureData)).getTimeInMillis());
                temperature.setValues(new float[binaryTemperatureData.getValues().length]);
                short[] values = binaryTemperatureData.getValues();
                int length3 = values.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    temperature.getValues()[i6] = values[i5] / 100.0f;
                    i5++;
                    i6++;
                }
                i2++;
                i3 = i4;
            }
            return temperatureArr;
        }
    }

    public Temperature() {
        this(0L, null, 3, null);
    }

    public Temperature(long j, @NotNull float[] fArr) {
        this.timeMillis = j;
        this.values = fArr;
    }

    public static /* synthetic */ Temperature copy$default(Temperature temperature, long j, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperature.timeMillis;
        }
        if ((i & 2) != 0) {
            fArr = temperature.values;
        }
        return temperature.copy(j, fArr);
    }

    @JvmStatic
    @NotNull
    public static final Temperature[] parseFrom(@NotNull byte[] bArr) {
        return INSTANCE.parseFrom(bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeMillis() {
        return this.timeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float[] getValues() {
        return this.values;
    }

    @NotNull
    public final Temperature copy(long timeMillis, @NotNull float[] values) {
        return new Temperature(timeMillis, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Temperature.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.bodytemperature.Temperature");
        Temperature temperature = (Temperature) other;
        return this.timeMillis == temperature.timeMillis && Arrays.equals(this.values, temperature.values);
    }

    public final long getTimeMillis() {
        return this.timeMillis;
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (b.a(this.timeMillis) * 31) + Arrays.hashCode(this.values);
    }

    public final void setTimeMillis(long j) {
        this.timeMillis = j;
    }

    public final void setValues(@NotNull float[] fArr) {
        this.values = fArr;
    }

    @NotNull
    public String toString() {
        return "Temperature(timeMillis=" + this.timeMillis + ", " + ((Object) TimeUtil.formatDateTime(this.timeMillis)) + ", values=" + ((Object) ArraysUtil.toString(ArraysKt___ArraysJvmKt.toTypedArray(this.values))) + ')';
    }

    public /* synthetic */ Temperature(long j, float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new float[0] : fArr);
    }
}
