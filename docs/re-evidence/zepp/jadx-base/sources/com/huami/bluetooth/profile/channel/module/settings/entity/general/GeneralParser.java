package com.huami.bluetooth.profile.channel.module.settings.entity.general;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/GeneralParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GeneralParser implements IParser<General> {

    @NotNull
    private static final String a = "GeneralParser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public General parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        General general = new General();
        general.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b = byteBuffer.get();
        if (b > 0) {
            int i = 0;
            do {
                i++;
                byte b2 = byteBuffer.get();
                General.Companion companion = General.INSTANCE;
                if (b2 == companion.getKEY_TIME_FORMAT()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, "timeFormat", z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    general.setTimeFormat(enumDataCheckAndGetEnum);
                    Unit unit = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_DATE_DISPLAY_STYLE()) {
                    StringData stringDataCheckAndGetStringData = SettingsParserKt.checkAndGetStringData(byteBuffer, "dateDisplayStyle", z);
                    if (stringDataCheckAndGetStringData == null) {
                        return null;
                    }
                    general.setDateDisplayStyle(stringDataCheckAndGetStringData);
                    Unit unit2 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_OTHER_CALENDAR()) {
                    EnumData enumDataCheckAndGetEnum2 = SettingsParserKt.checkAndGetEnum(byteBuffer, "otherCalendar", z);
                    if (enumDataCheckAndGetEnum2 == null) {
                        return null;
                    }
                    general.setOtherCalendar(enumDataCheckAndGetEnum2);
                    Unit unit3 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_WEEKLY_START_TIME()) {
                    EnumData enumDataCheckAndGetEnum3 = SettingsParserKt.checkAndGetEnum(byteBuffer, "weeklyStartTime", z);
                    if (enumDataCheckAndGetEnum3 == null) {
                        return null;
                    }
                    general.setWeeklyStartTime(enumDataCheckAndGetEnum3);
                    Unit unit4 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_MILEAGE_UNIT()) {
                    EnumData enumDataCheckAndGetEnum4 = SettingsParserKt.checkAndGetEnum(byteBuffer, "mileageUnit", z);
                    if (enumDataCheckAndGetEnum4 == null) {
                        return null;
                    }
                    general.setMileageUnit(enumDataCheckAndGetEnum4);
                    Unit unit5 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HOURLY_ANNOUNCE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "hourlyAnnounceSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    general.setHourlyAnnounceSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                    Unit unit6 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HOURLY_ANNOUNCE_START_TIME()) {
                    Time timeCheckAndGetTime = SettingsParserKt.checkAndGetTime(byteBuffer, "hourlyAnnounceStartTime");
                    if (timeCheckAndGetTime == null) {
                        return null;
                    }
                    general.setHourlyAnnounceStartTime(timeCheckAndGetTime);
                    Unit unit7 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HOURLY_ANNOUNCE_STOP_TIME()) {
                    Time timeCheckAndGetTime2 = SettingsParserKt.checkAndGetTime(byteBuffer, "hourlyAnnounceStopTime");
                    if (timeCheckAndGetTime2 == null) {
                        return null;
                    }
                    general.setHourlyAnnounceStopTime(timeCheckAndGetTime2);
                    Unit unit8 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_ENABLE_DEVICE()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "enableDevice");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    general.setEnableDevice(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                    Unit unit9 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_DND_MODE()) {
                    EnumData enumDataCheckAndGetEnum5 = SettingsParserKt.checkAndGetEnum(byteBuffer, "dndMode", z);
                    if (enumDataCheckAndGetEnum5 == null) {
                        return null;
                    }
                    general.setDndMode(enumDataCheckAndGetEnum5);
                    Unit unit10 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_DND_START_TIME()) {
                    Time timeCheckAndGetTime3 = SettingsParserKt.checkAndGetTime(byteBuffer, "dndStartTime");
                    if (timeCheckAndGetTime3 == null) {
                        return null;
                    }
                    general.setDndStartTime(timeCheckAndGetTime3);
                    Unit unit11 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_DND_STOP_TIME()) {
                    Time timeCheckAndGetTime4 = SettingsParserKt.checkAndGetTime(byteBuffer, "dndStopTime");
                    if (timeCheckAndGetTime4 == null) {
                        return null;
                    }
                    general.setDndStopTime(timeCheckAndGetTime4);
                    Unit unit12 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_WRIST_BRIGHT_IN_DND_MODE()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "wristBrightInDNDSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    general.setWristBrightInDNDSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                    Unit unit13 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_CONN_LOST_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean4 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "connLostRemindSwitch");
                    if (booleanDataCheckAndGetBoolean4 == null) {
                        return null;
                    }
                    general.setConnLostRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean4.getValue()));
                    Unit unit14 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_CONN_LOST_REMIND_START_TIME()) {
                    Time timeCheckAndGetTime5 = SettingsParserKt.checkAndGetTime(byteBuffer, "connLostRemindStartTime");
                    if (timeCheckAndGetTime5 == null) {
                        return null;
                    }
                    general.setConnLostRemindStartTime(timeCheckAndGetTime5);
                    Unit unit15 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_CONN_LOST_REMIND_STOP_TIME()) {
                    Time timeCheckAndGetTime6 = SettingsParserKt.checkAndGetTime(byteBuffer, "connLostRemindStopTime");
                    if (timeCheckAndGetTime6 == null) {
                        return null;
                    }
                    general.setConnLostRemindStopTime(timeCheckAndGetTime6);
                    Unit unit16 = Unit.INSTANCE;
                } else if (b2 == General.KEY_INCOMING_CALL_DELAY_TIME) {
                    IntData intDataCheckAndGetIntData = SettingsParserKt.checkAndGetIntData(byteBuffer, "incomingCallDelayTime", z);
                    if (intDataCheckAndGetIntData == null) {
                        return null;
                    }
                    general.setIncomingCallDelayTime(intDataCheckAndGetIntData);
                    Unit unit17 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_TEMPERATURE_UNIT()) {
                    EnumData enumDataCheckAndGetEnum6 = SettingsParserKt.checkAndGetEnum(byteBuffer, "temperatureUnit", z);
                    if (enumDataCheckAndGetEnum6 == null) {
                        return null;
                    }
                    general.setTemperatureUnit(enumDataCheckAndGetEnum6);
                    Unit unit18 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_TIME_FORMAT_FOLLOW_MOBILE_PHONE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean5 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "timeFormatFollowMobilePhoneSwitch");
                    if (booleanDataCheckAndGetBoolean5 == null) {
                        return null;
                    }
                    general.setTimeFormatFollowMobilePhoneSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean5.getValue()));
                    Unit unit19 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_LONG_PRESS_SIDE_APP()) {
                    StringEnum stringEnumCheckAndGetStringEnum = SettingsParserKt.checkAndGetStringEnum(byteBuffer, "longPressSideApp", z);
                    if (stringEnumCheckAndGetStringEnum == null) {
                        return null;
                    }
                    general.setLongPressSideApp(stringEnumCheckAndGetStringEnum);
                    Unit unit20 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_LONG_PRESS_UP_APP()) {
                    StringEnum stringEnumCheckAndGetStringEnum2 = SettingsParserKt.checkAndGetStringEnum(byteBuffer, "longPressUpApp", z);
                    if (stringEnumCheckAndGetStringEnum2 == null) {
                        return null;
                    }
                    general.setLongPressUpApp(stringEnumCheckAndGetStringEnum2);
                    Unit unit21 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_CLICK_DOWN_APP()) {
                    StringEnum stringEnumCheckAndGetStringEnum3 = SettingsParserKt.checkAndGetStringEnum(byteBuffer, "clickDownApp", z);
                    if (stringEnumCheckAndGetStringEnum3 == null) {
                        return null;
                    }
                    general.setClickDownApp(stringEnumCheckAndGetStringEnum3);
                    Unit unit22 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_CLICK_SELECT_APP()) {
                    StringEnum stringEnumCheckAndGetStringEnum4 = SettingsParserKt.checkAndGetStringEnum(byteBuffer, "clickSelectApp", z);
                    if (stringEnumCheckAndGetStringEnum4 == null) {
                        return null;
                    }
                    general.setClickSelectApp(stringEnumCheckAndGetStringEnum4);
                    Unit unit23 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_INCOMING_CALL_DISPLAY_CONTACTS_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean6 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "inComingCallDisplayContactsSwitch");
                    if (booleanDataCheckAndGetBoolean6 == null) {
                        return null;
                    }
                    general.setInComingCallDisplayContactsSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean6.getValue()));
                    Unit unit24 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SMS_DISPLAY_CONTACTS_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean7 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "smsDisplayContactsSwitch");
                    if (booleanDataCheckAndGetBoolean7 == null) {
                        return null;
                    }
                    general.setSmsDisplayContactsSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean7.getValue()));
                    Unit unit25 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_WEIGHT_UNIT()) {
                    EnumData enumDataCheckAndGetEnum7 = SettingsParserKt.checkAndGetEnum(byteBuffer, "weightUnit", z);
                    if (enumDataCheckAndGetEnum7 == null) {
                        return null;
                    }
                    general.setWeightUnit(enumDataCheckAndGetEnum7);
                    Unit unit26 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_NIGHT_MODE()) {
                    EnumData enumDataCheckAndGetEnum8 = SettingsParserKt.checkAndGetEnum(byteBuffer, "nightMode", z);
                    if (enumDataCheckAndGetEnum8 == null) {
                        return null;
                    }
                    general.setNightMode(enumDataCheckAndGetEnum8);
                    Unit unit27 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_NIGHT_MODE_START_TIME()) {
                    Time timeCheckAndGetTime7 = SettingsParserKt.checkAndGetTime(byteBuffer, "nightModeStartTime");
                    if (timeCheckAndGetTime7 == null) {
                        return null;
                    }
                    general.setNightModeStartTime(timeCheckAndGetTime7);
                    Unit unit28 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_NIGHT_MODE_STOP_TIME()) {
                    Time timeCheckAndGetTime8 = SettingsParserKt.checkAndGetTime(byteBuffer, "nightModeStopTime");
                    if (timeCheckAndGetTime8 == null) {
                        return null;
                    }
                    general.setNightModeStopTime(timeCheckAndGetTime8);
                    Unit unit29 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_AUTO_OTA_AT_NIGHT_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean8 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "autoOtaAtNightSwitch");
                    if (booleanDataCheckAndGetBoolean8 == null) {
                        return null;
                    }
                    general.setAutoOtaAtNightSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean8.getValue()));
                    Unit unit30 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_DISABLE_HID()) {
                    BooleanData booleanDataCheckAndGetBoolean9 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "disableHid");
                    if (booleanDataCheckAndGetBoolean9 == null) {
                        return null;
                    }
                    general.setDisableHid(Boolean.valueOf(booleanDataCheckAndGetBoolean9.getValue()));
                    Unit unit31 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SLEEP_MODE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean10 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "sleepModeSwitch");
                    if (booleanDataCheckAndGetBoolean10 == null) {
                        return null;
                    }
                    general.setSleepModeSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean10.getValue()));
                    Unit unit32 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SLEEP_MODE_FOR_DISPLAY_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean11 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "sleepModeForDisplaySwitch");
                    if (booleanDataCheckAndGetBoolean11 == null) {
                        return null;
                    }
                    general.setSleepModeForDisplaySwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean11.getValue()));
                    Unit unit33 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SLEEP_MODE_SMART_ENABLE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean12 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "sleepModeSmartEnableSwitch");
                    if (booleanDataCheckAndGetBoolean12 == null) {
                        return null;
                    }
                    general.setSleepModeSmartEnableSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean12.getValue()));
                    Unit unit34 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HID_CONNECT()) {
                    BooleanData booleanDataCheckAndGetBoolean13 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "hidConnect");
                    if (booleanDataCheckAndGetBoolean13 == null) {
                        return null;
                    }
                    general.setHidConnect(Boolean.valueOf(booleanDataCheckAndGetBoolean13.getValue()));
                    Unit unit35 = Unit.INSTANCE;
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b2);
                    Debug.fi(a, "[WARNING] parseGeneral unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b);
        }
        return general;
    }
}
