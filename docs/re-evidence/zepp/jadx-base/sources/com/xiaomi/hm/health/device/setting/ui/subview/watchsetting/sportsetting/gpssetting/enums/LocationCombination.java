package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "", "shortDesc", "fullDesc", "", "accuracy", LogUtil.I, "getAccuracy", "()I", "powerConsume", "getPowerConsume", "value", "getValue", "<init>", "(Ljava/lang/String;IIII)V", "Companion", "GPS_LE", "GPS", "GPS_BEIDOU", "GPS_GLONASS", "GPS_GALILEO", "GPS_ALL", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum LocationCombination implements GpsSetting {
    GPS_LE(1, 1, 0),
    GPS(2, 2, 1),
    GPS_BEIDOU(3, 3, 2),
    GPS_GLONASS(3, 3, 3),
    GPS_GALILEO(3, 3, 4),
    GPS_ALL(4, 4, 5);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int accuracy;
    private final int powerConsume;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "fromValue", "(Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final LocationCombination fromValue(@Nullable Integer value) {
            if (value == null) {
                return null;
            }
            value.intValue();
            for (LocationCombination locationCombination : LocationCombination.values()) {
                if (locationCombination.getValue() == value.intValue()) {
                    return locationCombination;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationCombination.values().length];
            iArr[LocationCombination.GPS_LE.ordinal()] = 1;
            iArr[LocationCombination.GPS.ordinal()] = 2;
            iArr[LocationCombination.GPS_BEIDOU.ordinal()] = 3;
            iArr[LocationCombination.GPS_GLONASS.ordinal()] = 4;
            iArr[LocationCombination.GPS_GALILEO.ordinal()] = 5;
            iArr[LocationCombination.GPS_ALL.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LocationCombination(int i, int i2, int i3) {
        this.accuracy = i;
        this.powerConsume = i2;
        this.value = i3;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting
    @NotNull
    public String fullDesc() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(IntroduceShuffleFactoryKt.getString(R.string.ds_gps_mode), Arrays.copyOf(new Object[]{shortDesc()}, 1));
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final int getPowerConsume() {
        return this.powerConsume;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting
    @NotNull
    public String shortDesc() {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                i = R.string.ds_gps_mode_gps_le;
                break;
            case 2:
                i = R.string.ds_gps_mode_gps;
                break;
            case 3:
                i = R.string.ds_gps_mode_gps_beidou;
                break;
            case 4:
                i = R.string.ds_gps_mode_gps_glonass_new;
                break;
            case 5:
                i = R.string.ds_gps_mode_gps_galileo;
                break;
            case 6:
                i = R.string.ds_gps_mode_all;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return IntroduceShuffleFactoryKt.getString(i);
    }
}
