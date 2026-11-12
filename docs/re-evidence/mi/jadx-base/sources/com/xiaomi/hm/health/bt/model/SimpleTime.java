package com.xiaomi.hm.health.bt.model;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001,BC\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 ¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "year", "month", "day", "hour", "minute", "second", "copy", "hashCode", "other", "", "equals", "I", "getYear", "()I", "setYear", "(I)V", c.f13755a, "getMonth", "()B", "setMonth", "(B)V", "getDay", "setDay", "getHour", "setHour", "getMinute", "setMinute", "getSecond", "setSecond", "<init>", "(IBBBBB)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SimpleTime {
    private byte day;
    private byte hour;
    private byte minute;
    private byte month;
    private byte second;
    private int year;

    public SimpleTime() {
        this(0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 63, null);
    }

    public static /* synthetic */ SimpleTime copy$default(SimpleTime simpleTime, int i, byte b2, byte b3, byte b4, byte b5, byte b6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleTime.year;
        }
        if ((i2 & 2) != 0) {
            b2 = simpleTime.month;
        }
        byte b7 = b2;
        if ((i2 & 4) != 0) {
            b3 = simpleTime.day;
        }
        byte b8 = b3;
        if ((i2 & 8) != 0) {
            b4 = simpleTime.hour;
        }
        byte b9 = b4;
        if ((i2 & 16) != 0) {
            b5 = simpleTime.minute;
        }
        byte b10 = b5;
        if ((i2 & 32) != 0) {
            b6 = simpleTime.second;
        }
        return simpleTime.copy(i, b7, b8, b9, b10, b6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final byte getSecond() {
        return this.second;
    }

    @NotNull
    public final SimpleTime copy(int year, byte month, byte day, byte hour, byte minute, byte second) {
        return new SimpleTime(year, month, day, hour, minute, second);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleTime)) {
            return false;
        }
        SimpleTime simpleTime = (SimpleTime) other;
        return this.year == simpleTime.year && this.month == simpleTime.month && this.day == simpleTime.day && this.hour == simpleTime.hour && this.minute == simpleTime.minute && this.second == simpleTime.second;
    }

    public final byte getDay() {
        return this.day;
    }

    public final byte getHour() {
        return this.hour;
    }

    public final byte getMinute() {
        return this.minute;
    }

    public final byte getMonth() {
        return this.month;
    }

    public final byte getSecond() {
        return this.second;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.year) * 31) + Byte.hashCode(this.month)) * 31) + Byte.hashCode(this.day)) * 31) + Byte.hashCode(this.hour)) * 31) + Byte.hashCode(this.minute)) * 31) + Byte.hashCode(this.second);
    }

    public final void setDay(byte b2) {
        this.day = b2;
    }

    public final void setHour(byte b2) {
        this.hour = b2;
    }

    public final void setMinute(byte b2) {
        this.minute = b2;
    }

    public final void setMonth(byte b2) {
        this.month = b2;
    }

    public final void setSecond(byte b2) {
        this.second = b2;
    }

    public final void setYear(int i) {
        this.year = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append('-');
        sb.append((int) this.month);
        sb.append('-');
        sb.append((int) this.day);
        sb.append(' ');
        sb.append((int) this.hour);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append((int) this.minute);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append((int) this.second);
        return sb.toString();
    }

    public SimpleTime(int i, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.year = i;
        this.month = b2;
        this.day = b3;
        this.hour = b4;
        this.minute = b5;
        this.second = b6;
    }

    public /* synthetic */ SimpleTime(int i, byte b2, byte b3, byte b4, byte b5, byte b6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? (byte) 0 : b2, (i2 & 4) != 0 ? (byte) 0 : b3, (i2 & 8) != 0 ? (byte) 0 : b4, (i2 & 16) != 0 ? (byte) 0 : b5, (i2 & 32) != 0 ? (byte) 0 : b6);
    }
}
