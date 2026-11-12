package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "", "fullDesc", "shortDesc", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "ACCURATE", "BALANCE", "BATTERY_SAVE", "SUPER_BATTERY_SAVE", "DIY", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum GpsMode implements GpsSetting {
    ACCURATE(0),
    BALANCE(1),
    BATTERY_SAVE(2),
    SUPER_BATTERY_SAVE(3),
    DIY(4);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "fromValue", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final GpsMode fromValue(int value) {
            for (GpsMode gpsMode : GpsMode.values()) {
                if (value == gpsMode.getValue()) {
                    return gpsMode;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GpsMode.values().length];
            iArr[GpsMode.ACCURATE.ordinal()] = 1;
            iArr[GpsMode.BALANCE.ordinal()] = 2;
            iArr[GpsMode.BATTERY_SAVE.ordinal()] = 3;
            iArr[GpsMode.SUPER_BATTERY_SAVE.ordinal()] = 4;
            iArr[GpsMode.DIY.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GpsMode(int i) {
        this.value = i;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting
    @NotNull
    public String fullDesc() {
        return shortDesc();
    }

    public final int getValue() {
        return this.value;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting
    @NotNull
    public String shortDesc() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            i = R.string.ds_gps_mode_accurate;
        } else if (i2 == 2) {
            i = R.string.ds_gps_mode_balance;
        } else if (i2 == 3) {
            i = R.string.ds_gps_mode_battery_save;
        } else if (i2 == 4) {
            i = R.string.ds_gps_mode_super_battery_save;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.ds_gps_mode_diy;
        }
        return IntroduceShuffleFactoryKt.getString(i);
    }
}
