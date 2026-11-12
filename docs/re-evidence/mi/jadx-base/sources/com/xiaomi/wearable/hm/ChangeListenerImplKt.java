package com.xiaomi.wearable.hm;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001¨\u0006\b"}, d2 = {"value2String", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "value2SettingGroupType", "asSettings", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lcom/xiaomi/wearable/hm/HuamiDataWrapper;", "type", "huami-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChangeListenerImplKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsGroupType.values().length];
            try {
                iArr[SettingsGroupType.DEVICE_INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsGroupType.DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingsGroupType.NFC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingsGroupType.SOUND_AND_VIBRATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingsGroupType.WEARING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SettingsGroupType.OFFLINE_VOICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SettingsGroupType.LANGUAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SettingsGroupType.HEALTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SettingsGroupType.SPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SettingsGroupType.GENERAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SettingsGroupType.CONNECTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final Settings asSettings(@NotNull HuamiDataWrapper huamiDataWrapper, @NotNull String type) {
        Intrinsics.checkNotNullParameter(huamiDataWrapper, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1905220446:
                if (type.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_DISPLAY)) {
                    return (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
                }
                break;
            case -1727384341:
                if (type.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_SCREEN_UNLOCK_AND_PASSWORD)) {
                    return (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
                }
                break;
            case -830962856:
                if (type.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_LANGUAGE)) {
                    return (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
                }
                break;
            case 79114068:
                if (type.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT)) {
                    return (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
                }
                break;
            case 637834440:
                if (type.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL)) {
                    return (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
                }
                break;
            case 2127033948:
                if (type.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_HEALTH)) {
                    return (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
                }
                break;
        }
        Settings settings = (Settings) HuamiDataWrapperKt.asData(huamiDataWrapper);
        Logger.w("HuamiDataWrapper.asSettings(" + type + ") in else branch", new Object[0]);
        return settings;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final SettingsGroupType value2SettingGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1905220446:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_DISPLAY)) {
                    return SettingsGroupType.DISPLAY;
                }
                return null;
            case -1844598621:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_DEVICE_INFORMATION)) {
                    return SettingsGroupType.DEVICE_INFORMATION;
                }
                return null;
            case -1727384341:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_SCREEN_UNLOCK_AND_PASSWORD)) {
                    return SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD;
                }
                return null;
            case -930920554:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_OFFLINE_VOICE)) {
                    return SettingsGroupType.OFFLINE_VOICE;
                }
                return null;
            case -830962856:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_LANGUAGE)) {
                    return SettingsGroupType.LANGUAGE;
                }
                return null;
            case -290559266:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_CONNECTION)) {
                    return SettingsGroupType.CONNECTION;
                }
                return null;
            case 77195:
                if (str.equals("NFC")) {
                    return SettingsGroupType.NFC;
                }
                return null;
            case 79114068:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT)) {
                    return SettingsGroupType.SPORT;
                }
                return null;
            case 637834440:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL)) {
                    return SettingsGroupType.GENERAL;
                }
                return null;
            case 1179473562:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_SOUND_AND_VIBRATION)) {
                    return SettingsGroupType.SOUND_AND_VIBRATION;
                }
                return null;
            case 1941364707:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_WEARING)) {
                    return SettingsGroupType.WEARING;
                }
                return null;
            case 2127033948:
                if (str.equals(ChangeListenerImpl.SETTING_GROUP_TYPE_HEALTH)) {
                    return SettingsGroupType.HEALTH;
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public static final String value2String(@NotNull SettingsGroupType settingsGroupType) {
        Intrinsics.checkNotNullParameter(settingsGroupType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[settingsGroupType.ordinal()]) {
            case 1:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_DEVICE_INFORMATION;
            case 2:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_DISPLAY;
            case 3:
                return "NFC";
            case 4:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_SOUND_AND_VIBRATION;
            case 5:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_SCREEN_UNLOCK_AND_PASSWORD;
            case 6:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_WEARING;
            case 7:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_OFFLINE_VOICE;
            case 8:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_LANGUAGE;
            case 9:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_HEALTH;
            case 10:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT;
            case 11:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL;
            case 12:
                return ChangeListenerImpl.SETTING_GROUP_TYPE_CONNECTION;
            default:
                return "";
        }
    }
}
