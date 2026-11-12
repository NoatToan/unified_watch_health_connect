package com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2Parser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SoundAndVibrateV2Parser implements IParser<SoundAndVibrateV2> {

    @NotNull
    private static final String a = "SoundAndVibrateV2Parser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public SoundAndVibrateV2 parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        SoundAndVibrateV2 soundAndVibrateV2 = new SoundAndVibrateV2();
        soundAndVibrateV2.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b = byteBuffer.get();
        if (b > 0) {
            int i = 0;
            do {
                i++;
                byte b2 = byteBuffer.get();
                SoundAndVibrateV2.Companion companion = SoundAndVibrateV2.INSTANCE;
                if (b2 == companion.getKEY_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "remindSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    soundAndVibrateV2.setRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b2 == companion.getKEY_MUTE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "muteSwitch");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setMuteSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                } else if (b2 == companion.getKEY_VOLUME()) {
                    IntData intDataCheckAndGetIntData = SettingsParserKt.checkAndGetIntData(byteBuffer, "volume", z);
                    if (intDataCheckAndGetIntData == null) {
                        return null;
                    }
                    soundAndVibrateV2.setVolume(intDataCheckAndGetIntData);
                } else if (b2 == companion.getKEY_NOTIFICATION_VIBRATION_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "notificationVibrationSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setNotificationVibrationSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                } else if (b2 == companion.getKEY_NOTIFICATION_VIBRATION_STRENGTH()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, "notificationVibrationStrength", z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    soundAndVibrateV2.setNotificationVibrationStrength(enumDataCheckAndGetEnum);
                } else if (b2 == companion.getKEY_SYSTEM_VIBRATION_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean4 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "systemVibrationSwitch");
                    if (booleanDataCheckAndGetBoolean4 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setSystemVibrationSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean4.getValue()));
                } else if (b2 == companion.getKEY_CROWN_VIBRATION_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean5 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "crownVibrationSwitch");
                    if (booleanDataCheckAndGetBoolean5 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setCrownVibrationSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean5.getValue()));
                } else if (b2 == companion.getKEY_COVER_SCREEN_MUTING_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean6 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "coverScreenMutingSwitch");
                    if (booleanDataCheckAndGetBoolean6 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setCoverScreenMutingSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean6.getValue()));
                } else if (b2 == companion.getKEY_VIBRATION_FEEDBACK_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean7 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "vibrationFeedbackSwitch");
                    if (booleanDataCheckAndGetBoolean7 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setVibrationFeedbackSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean7.getValue()));
                } else if (b2 == companion.getKEY_SPORT_VOICE_REPORT_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean8 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "sportVoiceReportSwitch");
                    if (booleanDataCheckAndGetBoolean8 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setSportVoiceReportSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean8.getValue()));
                } else if (b2 == companion.getKEY_BUZZER_SCENES()) {
                    EnumArray enumArrayCheckAndGetEnumArray = SettingsParserKt.checkAndGetEnumArray(byteBuffer, "buzzerScenes", z);
                    if (enumArrayCheckAndGetEnumArray == null) {
                        return null;
                    }
                    soundAndVibrateV2.setBuzzerScenes(enumArrayCheckAndGetEnumArray);
                } else if (b2 == companion.getKEY_BUZZER_VIBRATE_STRENGTH()) {
                    EnumData enumDataCheckAndGetEnum2 = SettingsParserKt.checkAndGetEnum(byteBuffer, "buzzerVibrateStrength", z);
                    if (enumDataCheckAndGetEnum2 == null) {
                        return null;
                    }
                    soundAndVibrateV2.setBuzzerVibrateStrength(enumDataCheckAndGetEnum2);
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b2);
                    Debug.fi(a, "[WARNING] parseSoundAndVibrateV2 unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b);
        }
        return soundAndVibrateV2;
    }
}
