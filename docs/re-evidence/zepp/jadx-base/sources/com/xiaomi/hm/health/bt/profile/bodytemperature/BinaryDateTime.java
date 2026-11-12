package com.xiaomi.hm.health.bt.profile.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bodytemperature/BinaryDateTime;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "dateYear", "dateMonth", "dateDay", "timeHour", "timeMinute", "timeSecond", "timeZone", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getDateYear", "()S", "setDateYear", "(S)V", "b", "B", "getDateMonth", "()B", "setDateMonth", "(B)V", "c", "getDateDay", "setDateDay", GoogleApiAvailabilityLight.a, "getTimeHour", "setTimeHour", "e", "getTimeMinute", "setTimeMinute", "f", "getTimeSecond", "setTimeSecond", "g", "getTimeZone", "setTimeZone", "<init>", "(SBBBBBB)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BinaryDateTime {

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

    public BinaryDateTime() {
        this((short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 127, null);
    }

    public BinaryDateTime(short s, byte b, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.dateYear = s;
        this.dateMonth = b;
        this.dateDay = b2;
        this.timeHour = b3;
        this.timeMinute = b4;
        this.timeSecond = b5;
        this.timeZone = b6;
    }

    public static /* synthetic */ BinaryDateTime copy$default(BinaryDateTime binaryDateTime, short s, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, Object obj) {
        if ((i & 1) != 0) {
            s = binaryDateTime.dateYear;
        }
        if ((i & 2) != 0) {
            b = binaryDateTime.dateMonth;
        }
        byte b7 = b;
        if ((i & 4) != 0) {
            b2 = binaryDateTime.dateDay;
        }
        byte b8 = b2;
        if ((i & 8) != 0) {
            b3 = binaryDateTime.timeHour;
        }
        byte b9 = b3;
        if ((i & 16) != 0) {
            b4 = binaryDateTime.timeMinute;
        }
        byte b10 = b4;
        if ((i & 32) != 0) {
            b5 = binaryDateTime.timeSecond;
        }
        byte b11 = b5;
        if ((i & 64) != 0) {
            b6 = binaryDateTime.timeZone;
        }
        return binaryDateTime.copy(s, b7, b8, b9, b10, b11, b6);
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
    public final BinaryDateTime copy(short dateYear, byte dateMonth, byte dateDay, byte timeHour, byte timeMinute, byte timeSecond, byte timeZone) {
        return new BinaryDateTime(dateYear, dateMonth, dateDay, timeHour, timeMinute, timeSecond, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinaryDateTime)) {
            return false;
        }
        BinaryDateTime binaryDateTime = (BinaryDateTime) other;
        return this.dateYear == binaryDateTime.dateYear && this.dateMonth == binaryDateTime.dateMonth && this.dateDay == binaryDateTime.dateDay && this.timeHour == binaryDateTime.timeHour && this.timeMinute == binaryDateTime.timeMinute && this.timeSecond == binaryDateTime.timeSecond && this.timeZone == binaryDateTime.timeZone;
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

    public int hashCode() {
        return (((((((((((this.dateYear * 31) + this.dateMonth) * 31) + this.dateDay) * 31) + this.timeHour) * 31) + this.timeMinute) * 31) + this.timeSecond) * 31) + this.timeZone;
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

    @NotNull
    public String toString() {
        return "BinaryDateTime(dateYear=" + ((int) this.dateYear) + ", dateMonth=" + ((int) this.dateMonth) + ", dateDay=" + ((int) this.dateDay) + ", timeHour=" + ((int) this.timeHour) + ", timeMinute=" + ((int) this.timeMinute) + ", timeSecond=" + ((int) this.timeSecond) + ", timeZone=" + ((int) this.timeZone) + ')';
    }

    public /* synthetic */ BinaryDateTime(short s, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (short) 0 : s, (i & 2) != 0 ? (byte) 0 : b, (i & 4) != 0 ? (byte) 0 : b2, (i & 8) != 0 ? (byte) 0 : b3, (i & 16) != 0 ? (byte) 0 : b4, (i & 32) != 0 ? (byte) 0 : b5, (i & 64) != 0 ? (byte) 0 : b6);
    }
}
