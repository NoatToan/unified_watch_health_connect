package com.xiaomi.fitness.device.manager.extensions;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.login.utils.RegionUtil;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0007\u001a\n\u0010\u000b\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u000f\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0010\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0011\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0012\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0013\u001a\u00020\u0006*\u00020\u0007\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0007H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"sHuamiFeatureCardIds", "", "", "sBleFeatureCardIds", "sWearOSFeatureCardV4Ids", "isSupportFeatureCardV4", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "cardId", "getFeatureItemVisible", "featureId", "isSupportAssistSleep", "isShowCards", "isSupportXiaoAi", "isSupportGoogleAccount", "isSupportSyncPhoneSchedule", "isSupportWristScreenWake", "isSupportUnlockLaptop", "isSupportMiuiClock", "isSupportNightMode", "resetOnRemoveDevice", "", "bleName", "", "getBleName", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Ljava/lang/String;", "isThirdPartyDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelExtKt {

    @NotNull
    private static final List<Integer> sHuamiFeatureCardIds = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{5, 6, 8, 15, 7, 9, 10, 18, 13, 11});

    @NotNull
    private static final List<Integer> sBleFeatureCardIds = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{5, 6, 8, 15, 7, 9, 10, 18, 13, 11, 12});

    @NotNull
    private static final List<Integer> sWearOSFeatureCardV4Ids = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{19, 6, 8, 15, 7, 9, 10, 18, 11, 12});

    @Nullable
    public static final String getBleName(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getDeviceInfo().getBleName();
    }

    @Deprecated(message = "use TabContentItem.getItemVisible")
    public static final boolean getFeatureItemVisible(@NotNull WearableDeviceModel wearableDeviceModel, int i) {
        boolean zIsShowCards;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (i == 103) {
            zIsShowCards = isShowCards(wearableDeviceModel);
        } else if (i != 149) {
            zIsShowCards = true;
            if (i != 201) {
                if (i == 206) {
                    zIsShowCards = isSupportGoogleAccount(wearableDeviceModel);
                } else if (i == 110 || i == 111) {
                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "notification");
                } else if (i == 181) {
                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ECG_MEASURE_REMIND);
                } else if (i != 182) {
                    switch (i) {
                        case 113:
                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "heart_rate");
                            break;
                        case 114:
                            zIsShowCards = isSupportAssistSleep(wearableDeviceModel);
                            break;
                        case 115:
                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.BLOOD_OXYGEN_MONITOR);
                            break;
                        case 116:
                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.PRESSURE_MONITOR);
                            break;
                        case 117:
                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SEDENTARY);
                            break;
                        case 118:
                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.GOAL_REMIND);
                            break;
                        default:
                            switch (i) {
                                case 120:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.CLOCK);
                                    break;
                                case 121:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.EVENT_REMIND);
                                    break;
                                case 122:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "weather");
                                    break;
                                case 123:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "stock");
                                    break;
                                case 124:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.WORLD_CLOCK);
                                    break;
                                case 125:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.TAKE_PHOTO);
                                    break;
                                case 126:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SPORT_SORT);
                                    break;
                                case 127:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.TILE);
                                    break;
                                case 128:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.LAUNCHER);
                                    break;
                                case 129:
                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.APP_LAYOUT);
                                    break;
                                case 130:
                                    zIsShowCards = isSupportWristScreenWake(wearableDeviceModel);
                                    break;
                                default:
                                    switch (i) {
                                        case 132:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NIGHT_MODE);
                                            break;
                                        case 133:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.WEAR_TYPE);
                                            break;
                                        case 134:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.FIND);
                                            break;
                                        case 135:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.BLUETOOTH_BROADCAST);
                                            break;
                                        case 136:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SPORT_HR_BROADCAST);
                                            break;
                                        case 137:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "language");
                                            break;
                                        case 138:
                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.WRIST_LOCK);
                                            break;
                                        default:
                                            switch (i) {
                                                case 140:
                                                    zIsShowCards = isSupportUnlockLaptop(wearableDeviceModel);
                                                    break;
                                                case 141:
                                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.RESTRICT_BIND);
                                                    break;
                                                case 142:
                                                case 143:
                                                    zIsShowCards = isSupportXiaoAi(wearableDeviceModel);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 152:
                                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.GUIDE);
                                                            break;
                                                        case 153:
                                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SHORTCUT);
                                                            break;
                                                        case 154:
                                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.THIRD_PARTY_APP);
                                                            break;
                                                        case 155:
                                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "widget");
                                                            break;
                                                        case 156:
                                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "bedtime_clock");
                                                            break;
                                                        case 157:
                                                            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.EMERGENCY_CONTACT);
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 161:
                                                                    zIsShowCards = isSupportSyncPhoneSchedule(wearableDeviceModel);
                                                                    break;
                                                                case 162:
                                                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "ecg");
                                                                    break;
                                                                case 163:
                                                                    zIsShowCards = isSupportMiuiClock(wearableDeviceModel);
                                                                    break;
                                                                case 164:
                                                                    zIsShowCards = false;
                                                                    break;
                                                                case 165:
                                                                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.STAND_REMINDER);
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_pressure");
                }
            }
        } else {
            zIsShowCards = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ESIM);
        }
        Logger.i("getFeatureItemVisible " + i + ":" + zIsShowCards, new Object[0]);
        return zIsShowCards;
    }

    public static final boolean isShowCards(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) && !RegionUtil.isInnerCN()) {
            HuamiApiCaller huaMiApiCaller = com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            if (huaMiApiCaller == null || huaMiApiCaller.isMiliMainLand()) {
                return false;
            }
            return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD);
        }
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "nfc");
    }

    public static final boolean isSupportAssistSleep(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isPanGu(wearableDeviceModel) | com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ASSIST_SLEEP);
    }

    public static final boolean isSupportFeatureCardV4(@NotNull WearableDeviceModel wearableDeviceModel, int i) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return sHuamiFeatureCardIds.contains(Integer.valueOf(i));
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            return sBleFeatureCardIds.contains(Integer.valueOf(i));
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return sWearOSFeatureCardV4Ids.contains(Integer.valueOf(i));
        }
        return false;
    }

    public static final boolean isSupportGoogleAccount(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return AppUtil.INSTANCE.isPlayChannel() && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel);
    }

    public static final boolean isSupportMiuiClock(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MIUI_CLOCK) & RomUtils.isXiaomi();
    }

    public static final boolean isSupportNightMode(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NIGHT_MODE);
    }

    public static final boolean isSupportSyncPhoneSchedule(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "calendar") & RomUtils.isXiaomi();
    }

    public static final boolean isSupportUnlockLaptop(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.AUTH_UNLOCK);
        }
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.AUTH_UNLOCK) | AppUtil.INSTANCE.isDevChannel();
    }

    public static final boolean isSupportWristScreenWake(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "wrist");
        }
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "wrist") | AppUtil.INSTANCE.isDevChannel();
    }

    public static final boolean isSupportXiaoAi(@NotNull WearableDeviceModel wearableDeviceModel) {
        boolean zHasSoftwareFeature;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean z = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai") && !AppUtil.INSTANCE.isPlayChannel();
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuamiApiCaller huaMiApiCaller = com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            zHasSoftwareFeature = huaMiApiCaller != null ? huaMiApiCaller.hasSoftwareFeature(17) : false;
        } else {
            zHasSoftwareFeature = true;
        }
        Logger.d("isSupportXiaoAi " + com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) + " " + z + " " + wearableDeviceModel.getIsDeviceConnected() + " " + zHasSoftwareFeature, new Object[0]);
        return z && zHasSoftwareFeature;
    }

    public static final boolean isThirdPartyDevice(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return BloodSugarExtKt.isBloodSugar(wearableDeviceModel);
    }

    public static final void resetOnRemoveDevice(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeDid(wearableDeviceModel.getDid());
    }
}
