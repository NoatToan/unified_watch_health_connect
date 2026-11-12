package com.huami.bluetooth.profile.channel.module.settings.entity.sport;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/SportParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportParser implements IParser<Sport> {

    @NotNull
    private static final String a = "SportParser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public Sport parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Sport sport = new Sport();
        sport.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b = byteBuffer.get();
        if (b > 0) {
            int i = 0;
            do {
                i++;
                byte b2 = byteBuffer.get();
                Sport.Companion companion = Sport.INSTANCE;
                if (b2 == companion.getKEY_AUTO_STOP_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "autoStopSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    sport.setAutoStopSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b2 == companion.getKEY_SWIM_LOG_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "swimLogSwitch");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    sport.setSwimLogSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                } else if (b2 == companion.getKEY_RESERVE_HEART_RATE_MODE()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, "reserveHeartRateMode", z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    sport.setReserveHeartRateMode(enumDataCheckAndGetEnum);
                } else if (b2 == companion.getKEY_RESERVE_HEART_RATE_VALUE_LIST()) {
                    IntegerArray integerArrayCheckAndGetIntArray = SettingsParserKt.checkAndGetIntArray(byteBuffer, "reserveHeartRateValueList", z);
                    if (integerArrayCheckAndGetIntArray == null) {
                        return null;
                    }
                    sport.setReserveHeartRateValueList(integerArrayCheckAndGetIntArray);
                } else if (b2 == companion.getKEY_MAXIMUM_HEART_RATE_VALUE_LIST()) {
                    IntegerArray integerArrayCheckAndGetIntArray2 = SettingsParserKt.checkAndGetIntArray(byteBuffer, "maximumHeartRateValueList", z);
                    if (integerArrayCheckAndGetIntArray2 == null) {
                        return null;
                    }
                    sport.setMaximumHeartRateValueList(integerArrayCheckAndGetIntArray2);
                } else if (b2 == companion.getKEY_REST_HEART_RATE()) {
                    IntData intDataCheckAndGetIntData = SettingsParserKt.checkAndGetIntData(byteBuffer, "restHeartRate", z);
                    if (intDataCheckAndGetIntData == null) {
                        return null;
                    }
                    sport.setRestHeartRate(intDataCheckAndGetIntData);
                } else if (b2 == companion.getKEY_GPS_MODE()) {
                    EnumData enumDataCheckAndGetEnum2 = SettingsParserKt.checkAndGetEnum(byteBuffer, "gpsMode", z);
                    if (enumDataCheckAndGetEnum2 == null) {
                        return null;
                    }
                    sport.setGpsMode(enumDataCheckAndGetEnum2);
                } else if (b2 == companion.getGPS_FREQUENCY_BAND()) {
                    EnumData enumDataCheckAndGetEnum3 = SettingsParserKt.checkAndGetEnum(byteBuffer, "gpsFrequencyBand", z);
                    if (enumDataCheckAndGetEnum3 == null) {
                        return null;
                    }
                    sport.setGpsFrequencyBand(enumDataCheckAndGetEnum3);
                } else if (b2 == companion.getGPS_SYSTEM_CHOICE()) {
                    EnumData enumDataCheckAndGetEnum4 = SettingsParserKt.checkAndGetEnum(byteBuffer, "gpsSystemChoice", z);
                    if (enumDataCheckAndGetEnum4 == null) {
                        return null;
                    }
                    sport.setGpsSystemChoice(enumDataCheckAndGetEnum4);
                } else if (b2 == companion.getGPS_SEARCHING_PREFERENCE()) {
                    EnumData enumDataCheckAndGetEnum5 = SettingsParserKt.checkAndGetEnum(byteBuffer, "gpsSearchingPreference", z);
                    if (enumDataCheckAndGetEnum5 == null) {
                        return null;
                    }
                    sport.setGpsSearchingPreference(enumDataCheckAndGetEnum5);
                } else if (b2 == companion.getGPS_DATA_INTERVAL()) {
                    EnumData enumDataCheckAndGetEnum6 = SettingsParserKt.checkAndGetEnum(byteBuffer, "gpsDataInterval", z);
                    if (enumDataCheckAndGetEnum6 == null) {
                        return null;
                    }
                    sport.setGpsDataInterval(enumDataCheckAndGetEnum6);
                } else if (b2 == companion.getA_GPS_OUT_OF_DATE_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "aGpsOutOfDateRemindSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    sport.setAGpsOutOfDateRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                } else if (b2 == companion.getA_GPS_OUT_OF_DATE_REMIND_TIME()) {
                    Time timeCheckAndGetTime = SettingsParserKt.checkAndGetTime(byteBuffer, "aGpsOutOfDateRemindTime");
                    if (timeCheckAndGetTime == null) {
                        return null;
                    }
                    sport.setAGpsOutOfDateRemindTime(timeCheckAndGetTime);
                } else if (b2 == companion.getSPORT_RECOGNITION_TYPES()) {
                    EnumArray enumArrayCheckAndGetEnumArray = SettingsParserKt.checkAndGetEnumArray(byteBuffer, "sportRecognitionTypes", z);
                    if (enumArrayCheckAndGetEnumArray == null) {
                        return null;
                    }
                    sport.setSportRecognitionTypes(enumArrayCheckAndGetEnumArray);
                } else if (b2 == companion.getSPORT_RECOGNIZED_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean4 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "sportRecognizedRemindSwitch");
                    if (booleanDataCheckAndGetBoolean4 == null) {
                        return null;
                    }
                    sport.setSportRecognizedRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean4.getValue()));
                } else if (b2 == companion.getSPORT_RECOGNITION_SENSITIVITY()) {
                    EnumData enumDataCheckAndGetEnum7 = SettingsParserKt.checkAndGetEnum(byteBuffer, "sportRecognitionSensitivity", z);
                    if (enumDataCheckAndGetEnum7 == null) {
                        return null;
                    }
                    sport.setSportRecognitionSensitivity(enumDataCheckAndGetEnum7);
                } else if (b2 == companion.getROWING_MACHINE_WEARING_WRIST()) {
                    EnumData enumDataCheckAndGetEnum8 = SettingsParserKt.checkAndGetEnum(byteBuffer, "rowingMachineWearingWrist", z);
                    if (enumDataCheckAndGetEnum8 == null) {
                        return null;
                    }
                    sport.setRowingMachineWearingWrist(enumDataCheckAndGetEnum8);
                } else if (b2 == companion.getPOOL_SWIMMING_LANE_LENGTH()) {
                    EnumData enumDataCheckAndGetEnum9 = SettingsParserKt.checkAndGetEnum(byteBuffer, "poolSwimmingLaneLength", z);
                    if (enumDataCheckAndGetEnum9 == null) {
                        return null;
                    }
                    sport.setPoolSwimmingLaneLength(enumDataCheckAndGetEnum9);
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b2);
                    Debug.fi(a, "[WARNING] parseSport unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b);
        }
        return sport;
    }
}
