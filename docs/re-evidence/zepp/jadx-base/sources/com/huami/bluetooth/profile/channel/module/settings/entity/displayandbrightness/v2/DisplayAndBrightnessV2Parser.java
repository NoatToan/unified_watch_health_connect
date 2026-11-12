package com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2Parser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DisplayAndBrightnessV2Parser implements IParser<DisplayAndBrightnessV2> {

    @NotNull
    private static final a a = new a(null);

    @Deprecated
    @NotNull
    private static final String b = "DisplayAndBrightnessV2Parser";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2Parser$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public DisplayAndBrightnessV2 parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
        displayAndBrightnessV2.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b2 = byteBuffer.get();
        if (b2 > 0) {
            int i = 0;
            do {
                i++;
                byte b3 = byteBuffer.get();
                DisplayAndBrightnessV2.Companion companion = DisplayAndBrightnessV2.INSTANCE;
                if (b3 == companion.getKEY_AUTO_BRIGHTNESS()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "autoBrightness");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setAutoBrightness(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b3 == companion.getKEY_BRIGHTNESS()) {
                    IntData intDataCheckAndGetIntData = SettingsParserKt.checkAndGetIntData(byteBuffer, "brightness", z);
                    if (intDataCheckAndGetIntData == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setBrightness(intDataCheckAndGetIntData);
                } else if (b3 == companion.getKEY_SCREEN_OFF_TIME()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, "screenOffTime", z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffTime(enumDataCheckAndGetEnum);
                } else if (b3 == companion.getKEY_OFF_DISPLAY_MODE()) {
                    EnumData enumDataCheckAndGetEnum2 = SettingsParserKt.checkAndGetEnum(byteBuffer, "screenOffDisplayMode", z);
                    if (enumDataCheckAndGetEnum2 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffDisplayMode(enumDataCheckAndGetEnum2);
                } else if (b3 == companion.getKEY_OFF_DISPLAY_BEGIN_TIME()) {
                    Time timeCheckAndGetTime = SettingsParserKt.checkAndGetTime(byteBuffer, "screenOffDisplayBeginTime");
                    if (timeCheckAndGetTime == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffDisplayBeginTime(timeCheckAndGetTime);
                } else if (b3 == companion.getKEY_OFF_DISPLAY_END_TIME()) {
                    Time timeCheckAndGetTime2 = SettingsParserKt.checkAndGetTime(byteBuffer, "screenOffDisplayEndTime");
                    if (timeCheckAndGetTime2 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffDisplayEndTime(timeCheckAndGetTime2);
                } else if (b3 == companion.getKEY_SCREEN_OFF_DIAL_PLATE_TYPE()) {
                    EnumData enumDataCheckAndGetEnum3 = SettingsParserKt.checkAndGetEnum(byteBuffer, "screenOffDialPlateType", z);
                    if (enumDataCheckAndGetEnum3 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffDialPlateType(enumDataCheckAndGetEnum3);
                } else if (b3 == companion.getKEY_SCREEN_ON_BY_TURNING_WRIST_MODE()) {
                    EnumData enumDataCheckAndGetEnum4 = SettingsParserKt.checkAndGetEnum(byteBuffer, "screenOnByTurningWristMode", z);
                    if (enumDataCheckAndGetEnum4 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOnByTurningWristMode(enumDataCheckAndGetEnum4);
                } else if (b3 == companion.getKEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME()) {
                    Time timeCheckAndGetTime3 = SettingsParserKt.checkAndGetTime(byteBuffer, "screenOnByTurningWristBeginTime");
                    if (timeCheckAndGetTime3 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOnByTurningWristBeginTime(timeCheckAndGetTime3);
                } else if (b3 == companion.getKEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME()) {
                    Time timeCheckAndGetTime4 = SettingsParserKt.checkAndGetTime(byteBuffer, "screenOnByTurningWristEndTime");
                    if (timeCheckAndGetTime4 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOnByTurningWristEndTime(timeCheckAndGetTime4);
                } else if (b3 == companion.getKEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED()) {
                    EnumData enumDataCheckAndGetEnum5 = SettingsParserKt.checkAndGetEnum(byteBuffer, "screenOnByTurningWristActiveSpeed", z);
                    if (enumDataCheckAndGetEnum5 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOnByTurningWristActiveSpeed(enumDataCheckAndGetEnum5);
                } else if (b3 == companion.getKEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "screenOnByNewNotificationSwitch");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOnByNewNotificationSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                } else if (b3 == companion.getKEY_SCREEN_ON_DURING_SPORT_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "screenOnDuringSportSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOnDuringSportSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                } else if (b3 == companion.getKEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean4 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "screenOffFollowCurrentDialSwitch");
                    if (booleanDataCheckAndGetBoolean4 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean4.getValue()));
                } else if (b3 == companion.getKEY_SCREEN_OFF_DIAL_ID()) {
                    StringEnum stringEnumCheckAndGetStringEnum = SettingsParserKt.checkAndGetStringEnum(byteBuffer, "screenOffDialId", z);
                    if (stringEnumCheckAndGetStringEnum == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenOffDialId(stringEnumCheckAndGetStringEnum);
                } else if (b3 == companion.getKEY_HOME_SCREEN_STYLE()) {
                    StringEnum stringEnumCheckAndGetStringEnum2 = SettingsParserKt.checkAndGetStringEnum(byteBuffer, "homeScreenStyle", z);
                    if (stringEnumCheckAndGetStringEnum2 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setHomeScreenStyle(stringEnumCheckAndGetStringEnum2);
                } else if (b3 == companion.getKEY_SCREEN_COLOR_STYLE()) {
                    EnumData enumDataCheckAndGetEnum6 = SettingsParserKt.checkAndGetEnum(byteBuffer, "", z);
                    if (enumDataCheckAndGetEnum6 == null) {
                        return null;
                    }
                    displayAndBrightnessV2.setScreenColorStyle(enumDataCheckAndGetEnum6);
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b3);
                    Debug.fi(b, "[WARNING] parseDisplayAndBrightnessV2 unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b2);
        }
        return displayAndBrightnessV2;
    }
}
