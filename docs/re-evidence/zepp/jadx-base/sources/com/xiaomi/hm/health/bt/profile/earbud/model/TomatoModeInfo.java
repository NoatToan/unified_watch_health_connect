package com.xiaomi.hm.health.bt.profile.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b$\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR$\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\n¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/TomatoModeInfo;", "", "", "toString", "", "a", LogUtil.I, "getTime", "()I", "setTime", "(I)V", "time", "b", "getRemainTime", "setRemainTime", "remainTime", "c", "getRestTime", "setRestTime", "restTime", GoogleApiAvailabilityLight.a, "getRestRemainTime", "setRestRemainTime", "restRemainTime", "value", "getTimeInMinute", "setTimeInMinute", "timeInMinute", "getRemainTimeInMinute", "setRemainTimeInMinute", "remainTimeInMinute", "getRestTimeInMinute", "setRestTimeInMinute", "restTimeInMinute", "getRestRemainTimeInMinute", "setRestRemainTimeInMinute", "restRemainTimeInMinute", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TomatoModeInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int e = 8;
    private static final int f = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int remainTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int restTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int restRemainTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/TomatoModeInfo$Companion;", "", "", "datas", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/TomatoModeInfo;", "from", "", "SECONDS_IN_MINUTE", LogUtil.I, "VALID_DATA_LENGTH", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TomatoModeInfo from(@Nullable byte[] datas) {
            if (datas == null || datas.length != 8) {
                return null;
            }
            TomatoModeInfo tomatoModeInfo = new TomatoModeInfo();
            tomatoModeInfo.setTime(GattUtils.bytesToInt(datas, 0, 2));
            tomatoModeInfo.setRemainTime(GattUtils.bytesToInt(datas, 2, 2));
            tomatoModeInfo.setRestTime(GattUtils.bytesToInt(datas, 4, 2));
            tomatoModeInfo.setRestRemainTime(GattUtils.bytesToInt(datas, 6, 2));
            return tomatoModeInfo;
        }
    }

    public final int getRemainTime() {
        return this.remainTime;
    }

    public final int getRemainTimeInMinute() {
        return this.remainTime / 60;
    }

    public final int getRestRemainTime() {
        return this.restRemainTime;
    }

    public final int getRestRemainTimeInMinute() {
        return this.restRemainTime / 60;
    }

    public final int getRestTime() {
        return this.restTime;
    }

    public final int getRestTimeInMinute() {
        return this.restTime / 60;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getTimeInMinute() {
        return this.time / 60;
    }

    public final void setRemainTime(int i) {
        this.remainTime = i;
    }

    public final void setRemainTimeInMinute(int i) {
        this.remainTime = i * 60;
    }

    public final void setRestRemainTime(int i) {
        this.restRemainTime = i;
    }

    public final void setRestRemainTimeInMinute(int i) {
        this.restRemainTime = i * 60;
    }

    public final void setRestTime(int i) {
        this.restTime = i;
    }

    public final void setRestTimeInMinute(int i) {
        this.restTime = i * 60;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    public final void setTimeInMinute(int i) {
        this.time = i * 60;
    }

    @NotNull
    public String toString() {
        return "EarbudTomatoModeInfo{time:" + this.time + ", remainTime:" + this.remainTime + ", restTime:" + this.restTime + ", restRemainTime:" + this.restRemainTime + '}';
    }
}
