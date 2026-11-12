package com.xiaomi.hm.health.bt.profile.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/RestModeInfo;", "", "", "toString", "", "a", LogUtil.I, "getTime", "()I", "setTime", "(I)V", "time", "b", "getRemainTime", "setRemainTime", "remainTime", "value", "getTimeInMinute", "setTimeInMinute", "timeInMinute", "getRemainTimeInMinute", "setRemainTimeInMinute", "remainTimeInMinute", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RestModeInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 4;
    private static final int d = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int remainTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/RestModeInfo$Companion;", "", "", "datas", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/RestModeInfo;", "from", "", "SECONDS_IN_MINUTE", LogUtil.I, "VALID_DATA_LENGTH", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final RestModeInfo from(@Nullable byte[] datas) {
            if (datas == null || datas.length != 4) {
                return null;
            }
            RestModeInfo restModeInfo = new RestModeInfo();
            restModeInfo.setTime(GattUtils.bytesToInt(datas, 0, 2));
            restModeInfo.setRemainTime(GattUtils.bytesToInt(datas, 2, 2));
            return restModeInfo;
        }
    }

    public final int getRemainTime() {
        return this.remainTime;
    }

    public final int getRemainTimeInMinute() {
        return this.remainTime / 60;
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

    public final void setTime(int i) {
        this.time = i;
    }

    public final void setTimeInMinute(int i) {
        this.time = i * 60;
    }

    @NotNull
    public String toString() {
        return "EarbudRestModeInfo{time:" + this.time + ", remainTime:" + this.remainTime + '}';
    }
}
