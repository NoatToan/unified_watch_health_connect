package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B/\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0010\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/huami/nfc/applet/CardScheduleTime;", "", "other", "", "equals", "", "hashCode", "component1", "", "component2", "", "component3", "component4", "component5", Constant.KEY_CARD_TYPE, "aid", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "hour", "minute", "copy", "toString", "a", LogUtil.I, "getCardType", "()I", "b", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "c", "J", "getRepeatMode", "()J", GoogleApiAvailabilityLight.a, "getHour", "e", "getMinute", "<init>", "(ILjava/lang/String;JII)V", "Companion", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardScheduleTime {
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

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int cardType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long repeatMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int hour;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int minute;

    public CardScheduleTime(int i, @NotNull String str, long j, int i2, int i3) {
        this.cardType = i;
        this.aid = str;
        this.repeatMode = j;
        this.hour = i2;
        this.minute = i3;
    }

    public static /* synthetic */ CardScheduleTime copy$default(CardScheduleTime cardScheduleTime, int i, String str, long j, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cardScheduleTime.cardType;
        }
        if ((i4 & 2) != 0) {
            str = cardScheduleTime.aid;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            j = cardScheduleTime.repeatMode;
        }
        long j2 = j;
        if ((i4 & 8) != 0) {
            i2 = cardScheduleTime.hour;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = cardScheduleTime.minute;
        }
        return cardScheduleTime.copy(i, str2, j2, i5, i3);
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
    public final CardScheduleTime copy(int cardType, @NotNull String aid, long repeatMode, int hour, int minute) {
        return new CardScheduleTime(cardType, aid, repeatMode, hour, minute);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof CardScheduleTime)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        CardScheduleTime cardScheduleTime = (CardScheduleTime) other;
        return Intrinsics.areEqual(this.aid, cardScheduleTime.aid) && this.cardType == cardScheduleTime.cardType && this.hour == cardScheduleTime.hour && this.minute == cardScheduleTime.minute && this.repeatMode == cardScheduleTime.repeatMode;
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
        return (((((((this.cardType * 31) + this.aid.hashCode()) * 31) + b.a(this.repeatMode)) * 31) + this.hour) * 31) + this.minute;
    }

    @NotNull
    public String toString() {
        return "CardScheduleTime(cardType=" + this.cardType + ", aid=" + this.aid + ", repeatMode=" + this.repeatMode + ", hour=" + this.hour + ", minute=" + this.minute + ')';
    }
}
