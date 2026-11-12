package com.xiaomi.hm.health.bt.model;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001%B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "Ljava/io/Serializable;", "", "component1", "", "component2", "", "component3", "component4", "component5", "cardType", "aid", "repeatMode", "hour", "minute", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getCardType", "()I", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "J", "getRepeatMode", "()J", "getHour", "getMinute", "<init>", "(ILjava/lang/String;JII)V", "(ILjava/lang/String;II)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class HMCardSwitchTime implements Serializable {
    public static final int PERIOD_EVERY_DAY = 2;
    public static final int PERIOD_EVERY_MONTH = 8;
    public static final int PERIOD_EVERY_WEEK = 4;
    public static final int PERIOD_EVERY_YEAR = 16;
    public static final int PERIOD_FRIDAY = 512;
    public static final int PERIOD_MONDAY = 32;
    public static final int PERIOD_ONCE = 1;
    public static final int PERIOD_SATURDAY = 1024;
    public static final int PERIOD_SUNDAY = 2048;
    public static final int PERIOD_THURSDAY = 256;
    public static final int PERIOD_TUESDAY = 64;
    public static final int PERIOD_WEDNESDAY = 128;
    private static final long serialVersionUID = 1;

    @NotNull
    private final String aid;
    private final int cardType;
    private final int hour;
    private final int minute;
    private final long repeatMode;

    public HMCardSwitchTime(int i, @NotNull String aid, long j, int i2, int i3) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        this.cardType = i;
        this.aid = aid;
        this.repeatMode = j;
        this.hour = i2;
        this.minute = i3;
    }

    public static /* synthetic */ HMCardSwitchTime copy$default(HMCardSwitchTime hMCardSwitchTime, int i, String str, long j, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = hMCardSwitchTime.cardType;
        }
        if ((i4 & 2) != 0) {
            str = hMCardSwitchTime.aid;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            j = hMCardSwitchTime.repeatMode;
        }
        long j2 = j;
        if ((i4 & 8) != 0) {
            i2 = hMCardSwitchTime.hour;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = hMCardSwitchTime.minute;
        }
        return hMCardSwitchTime.copy(i, str2, j2, i5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    @NotNull
    public final HMCardSwitchTime copy(int cardType, @NotNull String aid, long repeatMode, int hour, int minute) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        return new HMCardSwitchTime(cardType, aid, repeatMode, hour, minute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMCardSwitchTime)) {
            return false;
        }
        HMCardSwitchTime hMCardSwitchTime = (HMCardSwitchTime) other;
        return this.cardType == hMCardSwitchTime.cardType && Intrinsics.areEqual(this.aid, hMCardSwitchTime.aid) && this.repeatMode == hMCardSwitchTime.repeatMode && this.hour == hMCardSwitchTime.hour && this.minute == hMCardSwitchTime.minute;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final long getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.cardType) * 31) + this.aid.hashCode()) * 31) + Long.hashCode(this.repeatMode)) * 31) + Integer.hashCode(this.hour)) * 31) + Integer.hashCode(this.minute);
    }

    @NotNull
    public String toString() {
        return "HMCardSwitchTime(cardType=" + this.cardType + ", aid=" + this.aid + ", repeatMode=" + this.repeatMode + ", hour=" + this.hour + ", minute=" + this.minute + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HMCardSwitchTime(int i, @NotNull String aid, int i2, int i3) {
        this(i, aid, 2L, i2, i3);
        Intrinsics.checkNotNullParameter(aid, "aid");
    }
}
