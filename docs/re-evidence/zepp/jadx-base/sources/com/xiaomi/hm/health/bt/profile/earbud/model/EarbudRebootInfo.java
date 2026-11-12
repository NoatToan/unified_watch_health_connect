package com.xiaomi.hm.health.bt.profile.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/EarbudRebootInfo;", "", "", "a", LogUtil.I, "getStTimes", "()I", "setStTimes", "(I)V", "stTimes", "b", "getOtherTimes", "setOtherTimes", "otherTimes", "c", "getLowBatteryTimes", "setLowBatteryTimes", "lowBatteryTimes", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EarbudRebootInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int stTimes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int otherTimes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int lowBatteryTimes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/EarbudRebootInfo$Companion;", "", "", "datas", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/EarbudRebootInfo;", "from", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final EarbudRebootInfo from(@Nullable byte[] datas) {
            if (datas == null || datas.length != 12) {
                return null;
            }
            EarbudRebootInfo earbudRebootInfo = new EarbudRebootInfo();
            earbudRebootInfo.setStTimes(GattUtils.bytesToInt(datas, 0, 4));
            earbudRebootInfo.setOtherTimes(GattUtils.bytesToInt(datas, 4, 4));
            earbudRebootInfo.setLowBatteryTimes(GattUtils.bytesToInt(datas, 8, 4));
            return earbudRebootInfo;
        }
    }

    public final int getLowBatteryTimes() {
        return this.lowBatteryTimes;
    }

    public final int getOtherTimes() {
        return this.otherTimes;
    }

    public final int getStTimes() {
        return this.stTimes;
    }

    public final void setLowBatteryTimes(int i) {
        this.lowBatteryTimes = i;
    }

    public final void setOtherTimes(int i) {
        this.otherTimes = i;
    }

    public final void setStTimes(int i) {
        this.stTimes = i;
    }
}
