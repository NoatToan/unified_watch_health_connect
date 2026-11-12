package com.xiaomi.hm.health.bt.profile.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0017\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@BW\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001R\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryTemperatureData;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "dateYear", "dateMonth", "dateDay", "timeHour", "timeMinute", "timeSecond", "timeZone", "values", "copy", "", "toString", "a", ExifInterface.LATITUDE_SOUTH, "getDateYear", "()S", "setDateYear", "(S)V", "b", "B", "getDateMonth", "()B", "setDateMonth", "(B)V", "c", "getDateDay", "setDateDay", GoogleApiAvailabilityLight.a, "getTimeHour", "setTimeHour", "e", "getTimeMinute", "setTimeMinute", "f", "getTimeSecond", "setTimeSecond", "g", "getTimeZone", "setTimeZone", "h", "[S", "getValues", "()[S", "setValues", "([S)V", "<init>", "(SBBBBBB[S)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BinaryTemperatureData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private short dateYear;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private byte dateMonth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private byte dateDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private byte timeHour;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private byte timeMinute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private byte timeSecond;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private byte timeZone;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private short[] values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryTemperatureData$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "", "Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryTemperatureData;", "parseFrom", "([B)[Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryTemperatureData;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BinaryTemperatureData[] parseFrom(@NotNull byte[] bytes) {
            short s;
            ArrayList arrayList = new ArrayList();
            if (bytes.length >= 12) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                if (byteBufferWrap.getShort() == Short.MAX_VALUE) {
                    for (int i = 12; byteBufferWrap.position() + 1 <= bytes.length - i; i = 12) {
                        ArrayList arrayList2 = new ArrayList();
                        BinaryTemperatureData binaryTemperatureData = new BinaryTemperatureData((short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, null, 255, null);
                        binaryTemperatureData.setDateYear(byteBufferWrap.getShort());
                        binaryTemperatureData.setDateMonth(byteBufferWrap.get());
                        binaryTemperatureData.setDateDay(byteBufferWrap.get());
                        binaryTemperatureData.setTimeHour(byteBufferWrap.get());
                        binaryTemperatureData.setTimeMinute(byteBufferWrap.get());
                        binaryTemperatureData.setTimeSecond(byteBufferWrap.get());
                        byteBufferWrap.get();
                        binaryTemperatureData.setTimeZone(byteBufferWrap.get());
                        byteBufferWrap.get();
                        while (byteBufferWrap.position() + 1 <= bytes.length - 2 && (s = byteBufferWrap.getShort()) != Short.MAX_VALUE) {
                            arrayList2.add(Short.valueOf(s));
                        }
                        binaryTemperatureData.setValues(CollectionsKt___CollectionsKt.toShortArray(arrayList2));
                        arrayList.add(binaryTemperatureData);
                    }
                }
            }
            Object[] array = arrayList.toArray(new BinaryTemperatureData[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (BinaryTemperatureData[]) array;
        }
    }

    public BinaryTemperatureData() {
        this((short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, null, 255, null);
    }

    public BinaryTemperatureData(short s, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, @NotNull short[] sArr) {
        this.dateYear = s;
        this.dateMonth = b;
        this.dateDay = b2;
        this.timeHour = b3;
        this.timeMinute = b4;
        this.timeSecond = b5;
        this.timeZone = b6;
        this.values = sArr;
    }

    @JvmStatic
    @NotNull
    public static final BinaryTemperatureData[] parseFrom(@NotNull byte[] bArr) {
        return INSTANCE.parseFrom(bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getDateYear() {
        return this.dateYear;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getDateMonth() {
        return this.dateMonth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getDateDay() {
        return this.dateDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte getTimeHour() {
        return this.timeHour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte getTimeMinute() {
        return this.timeMinute;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final byte getTimeSecond() {
        return this.timeSecond;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final byte getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final short[] getValues() {
        return this.values;
    }

    @NotNull
    public final BinaryTemperatureData copy(short dateYear, byte dateMonth, byte dateDay, byte timeHour, byte timeMinute, byte timeSecond, byte timeZone, @NotNull short[] values) {
        return new BinaryTemperatureData(dateYear, dateMonth, dateDay, timeHour, timeMinute, timeSecond, timeZone, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BinaryTemperatureData.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.bodytemperature.BinaryTemperatureData");
        BinaryTemperatureData binaryTemperatureData = (BinaryTemperatureData) other;
        return this.dateYear == binaryTemperatureData.dateYear && this.dateMonth == binaryTemperatureData.dateMonth && this.dateDay == binaryTemperatureData.dateDay && this.timeHour == binaryTemperatureData.timeHour && this.timeMinute == binaryTemperatureData.timeMinute && this.timeSecond == binaryTemperatureData.timeSecond && this.timeZone == binaryTemperatureData.timeZone && Arrays.equals(this.values, binaryTemperatureData.values);
    }

    public final byte getDateDay() {
        return this.dateDay;
    }

    public final byte getDateMonth() {
        return this.dateMonth;
    }

    public final short getDateYear() {
        return this.dateYear;
    }

    public final byte getTimeHour() {
        return this.timeHour;
    }

    public final byte getTimeMinute() {
        return this.timeMinute;
    }

    public final byte getTimeSecond() {
        return this.timeSecond;
    }

    public final byte getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final short[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (((((((((((((this.dateYear * 31) + this.dateMonth) * 31) + this.dateDay) * 31) + this.timeHour) * 31) + this.timeMinute) * 31) + this.timeSecond) * 31) + this.timeZone) * 31) + Arrays.hashCode(this.values);
    }

    public final void setDateDay(byte b) {
        this.dateDay = b;
    }

    public final void setDateMonth(byte b) {
        this.dateMonth = b;
    }

    public final void setDateYear(short s) {
        this.dateYear = s;
    }

    public final void setTimeHour(byte b) {
        this.timeHour = b;
    }

    public final void setTimeMinute(byte b) {
        this.timeMinute = b;
    }

    public final void setTimeSecond(byte b) {
        this.timeSecond = b;
    }

    public final void setTimeZone(byte b) {
        this.timeZone = b;
    }

    public final void setValues(@NotNull short[] sArr) {
        this.values = sArr;
    }

    @NotNull
    public String toString() {
        return "BinaryTemperatureData(dateYear=" + ((int) this.dateYear) + ", dateMonth=" + ((int) this.dateMonth) + ", dateDay=" + ((int) this.dateDay) + ", timeHour=" + ((int) this.timeHour) + ", timeMinute=" + ((int) this.timeMinute) + ", timeSecond=" + ((int) this.timeSecond) + ", timeZone=" + ((int) this.timeZone) + ", values=" + Arrays.toString(this.values) + ')';
    }

    public /* synthetic */ BinaryTemperatureData(short s, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, short[] sArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (short) 0 : s, (i & 2) != 0 ? (byte) 0 : b, (i & 4) != 0 ? (byte) 0 : b2, (i & 8) != 0 ? (byte) 0 : b3, (i & 16) != 0 ? (byte) 0 : b4, (i & 32) != 0 ? (byte) 0 : b5, (i & 64) != 0 ? (byte) 0 : b6, (i & 128) != 0 ? new short[0] : sArr);
    }
}
