package com.huami.bluetooth.profile.channel.module.settings;

import com.huami.bluetooth.profile.channel.module.settings.entity.SettingsVersion;
import com.huami.bluetooth.profile.channel.module.settings.entity.connection.Connection;
import com.huami.bluetooth.profile.channel.module.settings.entity.connection.ConnectionParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation.DeviceInformation;
import com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation.DeviceInformationParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.GeneralParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.HealthParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v1.LanguageV1Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.LanguageV2Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v1.OfflineVoiceV1Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPasswordParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.SportParser;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v1.WearingWayV1Parser;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2Parser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Int32Data;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntegerArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u001a\u001c\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a\u001c\u0010%\u001a\u0004\u0018\u00010$*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a\u001c\u0010'\u001a\u0004\u0018\u00010&*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a\u0014\u0010)\u001a\u0004\u0018\u00010(*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u001a\u001c\u0010+\u001a\u0004\u0018\u00010**\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a\u0014\u0010-\u001a\u0004\u0018\u00010,*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u001a\u0014\u0010/\u001a\u0004\u0018\u00010.*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u001a\u001c\u00101\u001a\u0004\u0018\u000100*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a\u001c\u00103\u001a\u0004\u0018\u000102*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a\u001c\u00105\u001a\u0004\u0018\u000104*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u001a#\u0010:\u001a\u00020 *\u0004\u0018\u00010 2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;\u001a&\u0010@\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<j\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>`?\"\u0016\u0010C\u001a\u00020\u001c8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"", Constant.h, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/SettingsVersion;", "parseVersion", "Ljava/nio/ByteBuffer;", "byteBuffer", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "parseLanguage", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "parseOfflineVoice", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "parseWearingWay", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "parseScreenLockAndPassword", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "parseSoundAndVibrate", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "parseHealth", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/deviceinformation/DeviceInformation;", "parseDeviceInformation", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "parseGeneral", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "parseSport", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/connection/Connection;", "parseConnection", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "parseDisplayAndBrightness", "", "typeMsg", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "checkAndGetTime", "", "containDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "checkAndGetIntData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Int32Data;", "checkAndGetInt32Data", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntegerArray;", "checkAndGetIntArray", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "checkAndGetFlagData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "checkAndGetStringData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "checkAndGetTimeStampData", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/BooleanData;", "checkAndGetBoolean", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "checkAndGetStringEnum", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "checkAndGetEnum", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "checkAndGetEnumArray", "Ljava/io/ByteArrayOutputStream;", "bos", "", "key", "write", "(Ljava/lang/Boolean;Ljava/io/ByteArrayOutputStream;B)Z", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "toResultStr", "a", "Ljava/lang/String;", "TAG", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SettingsParserKt {

    @NotNull
    private static final String a = "SettingsParser";

    @Nullable
    public static final BooleanData checkAndGetBoolean(@NotNull ByteBuffer byteBuffer, @NotNull String str) {
        if (ByteBufferExtendsKt.checkBoolean(byteBuffer)) {
            return ByteBufferExtendsKt.getBooleanData(byteBuffer);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final EnumData checkAndGetEnum(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkEnum(byteBuffer)) {
            return ByteBufferExtendsKt.getEnumData(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final EnumArray checkAndGetEnumArray(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkEnumArray(byteBuffer)) {
            return ByteBufferExtendsKt.getEnumArray(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch"));
        return null;
    }

    @Nullable
    public static final Flag checkAndGetFlagData(@NotNull ByteBuffer byteBuffer, @NotNull String str) {
        if (ByteBufferExtendsKt.checkFlag(byteBuffer)) {
            return ByteBufferExtendsKt.getFlag(byteBuffer);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final Int32Data checkAndGetInt32Data(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkInt32(byteBuffer)) {
            return ByteBufferExtendsKt.getInt32Data(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final IntegerArray checkAndGetIntArray(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkIntArray(byteBuffer)) {
            return ByteBufferExtendsKt.getIntArray(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final IntData checkAndGetIntData(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkInt(byteBuffer)) {
            return ByteBufferExtendsKt.getIntData(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final StringData checkAndGetStringData(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkString(byteBuffer)) {
            return ByteBufferExtendsKt.getStringData(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final StringEnum checkAndGetStringEnum(@NotNull ByteBuffer byteBuffer, @NotNull String str, boolean z) {
        if (ByteBufferExtendsKt.checkStringEnum(byteBuffer)) {
            return ByteBufferExtendsKt.getStringEnumData(byteBuffer, z);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch"));
        return null;
    }

    @Nullable
    public static final Time checkAndGetTime(@NotNull ByteBuffer byteBuffer, @NotNull String str) {
        if (ByteBufferExtendsKt.checkTime(byteBuffer)) {
            return ByteBufferExtendsKt.getTimeData(byteBuffer);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final TimeStamp checkAndGetTimeStampData(@NotNull ByteBuffer byteBuffer, @NotNull String str) {
        if (ByteBufferExtendsKt.checkTimeStamp(byteBuffer)) {
            return ByteBufferExtendsKt.getTimeStamp(byteBuffer);
        }
        Debug.fi(a, Intrinsics.stringPlus(str, " type mismatch."));
        return null;
    }

    @Nullable
    public static final Connection parseConnection(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt <= 1) {
            return new ConnectionParser().parse(byteBuffer, uInt8ToInt);
        }
        Debug.fi(a, Intrinsics.stringPlus("parseConnection version not support. current: 1, device: ", Integer.valueOf(uInt8ToInt)));
        return null;
    }

    @Nullable
    public static final DeviceInformation parseDeviceInformation(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt <= 1) {
            return new DeviceInformationParser().parse(byteBuffer, uInt8ToInt);
        }
        Debug.fi(a, Intrinsics.stringPlus("parseDeviceInformation version not support. current: 1, device: ", Integer.valueOf(uInt8ToInt)));
        return null;
    }

    @Nullable
    public static final DisplayAndBrightness parseDisplayAndBrightness(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 2) {
            Debug.fi(a, Intrinsics.stringPlus("parseDisplayAndBrightness version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
            return null;
        }
        if (uInt8ToInt == 1) {
            return new DisplayAndBrightnessV1Parser().parse(byteBuffer, uInt8ToInt);
        }
        if (uInt8ToInt != 2) {
            return null;
        }
        return new DisplayAndBrightnessV2Parser().parse(byteBuffer, uInt8ToInt);
    }

    @Nullable
    public static final General parseGeneral(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt <= 2) {
            return new GeneralParser().parse(byteBuffer, uInt8ToInt);
        }
        Debug.fi(a, Intrinsics.stringPlus("parseGeneral version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
        return null;
    }

    @Nullable
    public static final Health parseHealth(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt <= 2) {
            return new HealthParser().parse(byteBuffer, uInt8ToInt);
        }
        Debug.fi(a, Intrinsics.stringPlus("parseHealth version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
        return null;
    }

    @Nullable
    public static final SettingsLanguage parseLanguage(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 2) {
            Debug.fi(a, Intrinsics.stringPlus("parseLanguage version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
            return null;
        }
        if (uInt8ToInt == 1) {
            return new LanguageV1Parser().parse(byteBuffer, uInt8ToInt);
        }
        if (uInt8ToInt != 2) {
            return null;
        }
        return new LanguageV2Parser().parse(byteBuffer, uInt8ToInt);
    }

    @Nullable
    public static final OfflineVoice parseOfflineVoice(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 2) {
            Debug.fi(a, Intrinsics.stringPlus("parseOfflineVoice version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
            return null;
        }
        if (uInt8ToInt == 1) {
            return new OfflineVoiceV1Parser().parse(byteBuffer, uInt8ToInt);
        }
        if (uInt8ToInt != 2) {
            return null;
        }
        return new OfflineVoiceV2Parser().parse(byteBuffer, uInt8ToInt);
    }

    @Nullable
    public static final ScreenLockAndPassword parseScreenLockAndPassword(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt <= 1) {
            return new ScreenLockAndPasswordParser().parse(byteBuffer, uInt8ToInt);
        }
        Debug.fi(a, Intrinsics.stringPlus("parseScreenLockAndPassword version not support. current: 1, device: ", Integer.valueOf(uInt8ToInt)));
        return null;
    }

    @Nullable
    public static final SoundAndVibrate parseSoundAndVibrate(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 2) {
            Debug.fi(a, Intrinsics.stringPlus("parseSoundAndVibrate version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
            return null;
        }
        if (uInt8ToInt == 1) {
            return new SoundAndVibrateV1Parser().parse(byteBuffer, uInt8ToInt);
        }
        if (uInt8ToInt != 2) {
            return null;
        }
        return new SoundAndVibrateV2Parser().parse(byteBuffer, uInt8ToInt);
    }

    @Nullable
    public static final Sport parseSport(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt <= 1) {
            return new SportParser().parse(byteBuffer, uInt8ToInt);
        }
        Debug.fi(a, Intrinsics.stringPlus("parseConnection version not support. current: 1, device: ", Integer.valueOf(uInt8ToInt)));
        return null;
    }

    @NotNull
    public static final SettingsVersion parseVersion(@NotNull byte[] bArr) {
        Object objM3845constructorimpl;
        SettingsVersion settingsVersion;
        try {
            Result.Companion companion = Result.Companion;
            if (bArr.length == 2) {
                settingsVersion = new SettingsVersion(bArr[1], null, null, 6, null);
            } else {
                byte b = bArr[1];
                int i = 3;
                byte b2 = bArr[2];
                ArrayList arrayList = new ArrayList();
                int length = bArr.length;
                if (3 < length) {
                    while (true) {
                        int i2 = i + 1;
                        SettingsGroupType settingsGroupTypeFromValue = SettingsGroupType.INSTANCE.fromValue(bArr[i]);
                        if (settingsGroupTypeFromValue != null) {
                            arrayList.add(settingsGroupTypeFromValue);
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                settingsVersion = new SettingsVersion(b, Integer.valueOf(b2), arrayList);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(settingsVersion);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        SettingsVersion settingsVersion2 = (SettingsVersion) objM3845constructorimpl;
        return settingsVersion2 == null ? new SettingsVersion(-1, null, null, 6, null) : settingsVersion2;
    }

    @Nullable
    public static final WearingWay parseWearingWay(@NotNull ByteBuffer byteBuffer) {
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 2) {
            Debug.fi(a, Intrinsics.stringPlus("parseWearingWay version not support. current: 2, device: ", Integer.valueOf(uInt8ToInt)));
            return null;
        }
        if (uInt8ToInt == 1) {
            return new WearingWayV1Parser().parse(byteBuffer, uInt8ToInt);
        }
        if (uInt8ToInt != 2) {
            return null;
        }
        return new WearingWayV2Parser().parse(byteBuffer, uInt8ToInt);
    }

    @NotNull
    public static final String toResultStr(@NotNull HashMap<SettingsGroupType, Settings> map) {
        Iterator<Map.Entry<SettingsGroupType, Settings>> it2 = map.entrySet().iterator();
        String str = "";
        while (it2.hasNext()) {
            str = str + it2.next().getValue() + '\n';
        }
        return str;
    }

    public static final boolean write(@Nullable Boolean bool, @NotNull ByteArrayOutputStream byteArrayOutputStream, byte b) {
        if (bool == null) {
            return false;
        }
        bool.booleanValue();
        byteArrayOutputStream.write(b);
        byteArrayOutputStream.write(11);
        byteArrayOutputStream.write(bool.booleanValue() ? 1 : 0);
        return true;
    }
}
