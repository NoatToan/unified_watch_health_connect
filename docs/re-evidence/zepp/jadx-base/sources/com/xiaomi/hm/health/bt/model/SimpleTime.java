package com.xiaomi.hm.health.bt.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import io.netty.util.internal.StringUtil;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011BC\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "year", "month", "day", "hour", "minute", "second", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getYear", "()I", "setYear", "(I)V", "b", "B", "getMonth", "()B", "setMonth", "(B)V", "c", "getDay", "setDay", GoogleApiAvailabilityLight.a, "getHour", "setHour", "e", "getMinute", "setMinute", "f", "getSecond", "setSecond", "<init>", "(IBBBBB)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SimpleTime {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private byte month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private byte day;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private byte hour;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private byte minute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private byte second;

    public SimpleTime() {
        this(0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 63, null);
    }

    public SimpleTime(int i, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.year = i;
        this.month = b;
        this.day = b2;
        this.hour = b3;
        this.minute = b4;
        this.second = b5;
    }

    public static /* synthetic */ SimpleTime copy$default(SimpleTime simpleTime, int i, byte b, byte b2, byte b3, byte b4, byte b5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleTime.year;
        }
        if ((i2 & 2) != 0) {
            b = simpleTime.month;
        }
        byte b6 = b;
        if ((i2 & 4) != 0) {
            b2 = simpleTime.day;
        }
        byte b7 = b2;
        if ((i2 & 8) != 0) {
            b3 = simpleTime.hour;
        }
        byte b8 = b3;
        if ((i2 & 16) != 0) {
            b4 = simpleTime.minute;
        }
        byte b9 = b4;
        if ((i2 & 32) != 0) {
            b5 = simpleTime.second;
        }
        return simpleTime.copy(i, b6, b7, b8, b9, b5);
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
        return (((((((((this.year * 31) + this.month) * 31) + this.day) * 31) + this.hour) * 31) + this.minute) * 31) + this.second;
    }

    public final void setDay(byte b) {
        this.day = b;
    }

    public final void setHour(byte b) {
        this.hour = b;
    }

    public final void setMinute(byte b) {
        this.minute = b;
    }

    public final void setMonth(byte b) {
        this.month = b;
    }

    public final void setSecond(byte b) {
        this.second = b;
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
        sb.append(StringUtil.SPACE);
        sb.append((int) this.hour);
        sb.append(JsonLexerKt.COLON);
        sb.append((int) this.minute);
        sb.append(JsonLexerKt.COLON);
        sb.append((int) this.second);
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/SimpleTime$Companion;", "", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "create", "", "timeInMill", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SimpleTime create(@NotNull Calendar calendar) {
            return new SimpleTime(calendar.get(1), (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13));
        }

        @NotNull
        public final SimpleTime create(long timeInMill) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timeInMill);
            return create(calendar);
        }
    }

    public /* synthetic */ SimpleTime(int i, byte b, byte b2, byte b3, byte b4, byte b5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? (byte) 0 : b, (i2 & 4) != 0 ? (byte) 0 : b2, (i2 & 8) != 0 ? (byte) 0 : b3, (i2 & 16) != 0 ? (byte) 0 : b4, (i2 & 32) != 0 ? (byte) 0 : b5);
    }
}
