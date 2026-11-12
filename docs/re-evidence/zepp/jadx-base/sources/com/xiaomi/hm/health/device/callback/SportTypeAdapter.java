package com.xiaomi.hm.health.device.callback;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/SportTypeAdapter;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;", "sportType", "", "typeValue", ParamKey.dataSource, "convertSportType", "SPORT_MIX_TYPE_TRIATHLON", LogUtil.I, "SPORT_TYPE_MULTI", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTypeAdapter {

    @NotNull
    public static final SportTypeAdapter INSTANCE = new SportTypeAdapter();
    public static final int SPORT_MIX_TYPE_TRIATHLON = 19;
    public static final int SPORT_TYPE_MULTI = 20;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportType.values().length];
            iArr[SportType.SPORT_TYPE_ODRUN.ordinal()] = 1;
            iArr[SportType.SPORT_TYPE_IDRUN.ordinal()] = 2;
            iArr[SportType.SPORT_TYPE_RIDING.ordinal()] = 3;
            iArr[SportType.SPORT_TYPE_WALKING.ordinal()] = 4;
            iArr[SportType.SPORT_TYPE_EXERCISE.ordinal()] = 5;
            iArr[SportType.SPORT_TYPE_POOL_SWIM.ordinal()] = 6;
            iArr[SportType.SPORT_TYPE_OPEN_WATER_SWIM.ordinal()] = 7;
            iArr[SportType.SPORT_TYPE_CLIMB.ordinal()] = 8;
            iArr[SportType.SPORT_TYPE_CROSS_COUNTRY_RUN.ordinal()] = 9;
            iArr[SportType.SPORT_TYPE_ELLIPTICAL.ordinal()] = 10;
            iArr[SportType.SPORT_TYPE_IDRIDING.ordinal()] = 11;
            iArr[SportType.SPORT_TYPE_ODTREKKING.ordinal()] = 12;
            iArr[SportType.SPORT_TYPE_SKIING.ordinal()] = 13;
            iArr[SportType.SPORT_TYPE_NONE.ordinal()] = 14;
            iArr[SportType.SPORT_TYPE_JUMP_ROPE.ordinal()] = 15;
            iArr[SportType.SPORT_TYPE_ROWING.ordinal()] = 16;
            iArr[SportType.SPORT_TYPE_YOGA.ordinal()] = 17;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportTypeAdapter() {
    }

    public final int convertSportType(@NotNull SportType sportType, int typeValue, int dataSource) {
        int i = 1;
        switch (WhenMappings.$EnumSwitchMapping$0[sportType.ordinal()]) {
            case 2:
                i = !ConfigHelperKt.hasFeature(HMDeviceSource.fromValue(dataSource - 100), Feature.BOLT_SERIES) ? 8 : 25;
                break;
            case 3:
                i = 9;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 16;
                break;
            case 6:
            case 7:
                i = sportType != SportType.SPORT_TYPE_POOL_SWIM ? 15 : 14;
                break;
            case 8:
                i = 13;
                break;
            case 9:
                i = 7;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 22;
                break;
            case 13:
                i = 11;
                break;
            case 14:
                i = typeValue;
                break;
            case 15:
                i = 21;
                break;
            case 16:
                i = 23;
                break;
            case 17:
                i = 60;
                break;
        }
        if (typeValue == 19) {
            return 2001;
        }
        if (typeValue != 20) {
            return i;
        }
        return 2002;
    }
}
