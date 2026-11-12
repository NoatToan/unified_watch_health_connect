package com.huami.bluetooth.profile.channel.module.voice.content;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.codeless.internal.Constants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u000f2\u00020\u0001:\t\u0010\u0011\u000f\u0012\u0013\u0014\u0015\u0016\u0017B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "", "version", "", "getBytes", "b", LogUtil.I, "app", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "c", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "parameter", "<init>", "(ILcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;)V", "Companion", "AppParameter", "BrightnessParameter", "CountdownParameter", "DNDParameter", "MusicParameter", "NFCCardParameter", "PhoneMuteParameter", "SportParameter", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class OpenAppContent extends NLPContent {
    public static final int ACTIVITY_TARGET = 30;
    public static final int ALARM_CLOCK = 16;
    public static final int ALIPAY = 0;
    public static final int ALTIMETER = 25;
    public static final int BODY_TEMPERATURE = 32;
    public static final int BREATHING = 41;
    public static final int BRIGHTNESS = 15;
    public static final int CAMERA = 8;
    public static final int CARD = 1;
    public static final int COMPASS = 24;
    public static final int COUNT_DOWN = 11;
    public static final int DIAL = 14;
    public static final int DND = 7;
    public static final int ECG = 22;
    public static final int EXERCISE_STATUS = 43;
    public static final int FIND_PHONE = 12;
    public static final int FLASHLIGHT = 40;
    public static final int FLIGHT_MANAGER = 37;
    public static final int HEART_RATE = 3;
    public static final int HOME = 46;
    public static final int MENSTRUATION = 42;
    public static final int MENTAL_STRESS = 21;
    public static final int MUSIC = 9;
    public static final int MUTE_PHONE = 13;
    public static final int NETEASE_CLOUD_MUSIC = 29;
    public static final int NOTIFICATION = 6;
    public static final int PAI = 33;
    public static final int PHONE = 35;
    public static final int REBOOT = 45;
    public static final int RECENT_SPORT = 18;
    public static final int SCHEDULE = 23;
    public static final int SHUT_DOWN = 47;
    public static final int SLEEP = 19;
    public static final int SMART_ASSISTANT = 27;
    public static final int SMS = 34;
    public static final int SPO2 = 20;
    public static final int SPORT = 4;
    public static final int SPORT_MAIN_PAGE = 31;
    public static final int SPORT_RECORD = 17;
    public static final int STATUS = 2;
    public static final int STOP_WATCH = 10;
    public static final int Settings = 28;
    public static final int TIGER_TRADE = 36;
    public static final int TOMATO_CLOCK = 38;
    public static final int WEATHER = 5;
    public static final int WECHAT_PAY = 39;
    public static final int WORLD_TIME = 26;
    public static final int WRIST_LIFT = 44;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int app;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final AppParameter parameter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "", "getBytes", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class AppParameter {
        @NotNull
        public abstract byte[] getBytes();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$BrightnessParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "", "a", LogUtil.I, "action", "b", "Ljava/lang/Integer;", Constants.PATH_TYPE_ABSOLUTE, "c", "percent", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class BrightnessParameter extends AppParameter {
        public static final int ABSOLUTE = 1;
        public static final int NO_OP = 0;
        public static final int PERCENT = 2;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Integer absolute;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Integer percent;

        public /* synthetic */ BrightnessParameter(int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            int i = this.action;
            if (i == 0) {
                return new byte[]{(byte) i};
            }
            byte[] bArr = new byte[2];
            bArr[0] = (byte) i;
            if (i == 1) {
                bArr[1] = (byte) this.absolute.intValue();
            } else if (i == 2) {
                bArr[1] = (byte) this.percent.intValue();
            }
            return bArr;
        }

        public BrightnessParameter(int i, @Nullable Integer num, @Nullable Integer num2) {
            this.action = i;
            this.absolute = num;
            this.percent = num2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B3\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$CountdownParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "", "a", LogUtil.I, "code", "b", "Ljava/lang/Integer;", "hours", "c", "minutes", GoogleApiAvailabilityLight.a, "seconds", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CountdownParameter extends AppParameter {
        public static final int FAILED = 1;
        public static final int SUCCESS = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Integer hours;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Integer minutes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private final Integer seconds;

        public /* synthetic */ CountdownParameter(int i, Integer num, Integer num2, Integer num3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3);
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            int i = this.code;
            return i != 0 ? new byte[]{(byte) i} : new byte[]{(byte) i, (byte) this.hours.intValue(), (byte) this.minutes.intValue(), (byte) this.seconds.intValue()};
        }

        public CountdownParameter(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            this.code = i;
            this.hours = num;
            this.minutes = num2;
            this.seconds = num3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$DNDParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "", "a", LogUtil.I, "mode", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DNDParameter extends AppParameter {
        public static final int CLOSE = 2;
        public static final int NO_OP = 0;
        public static final int OPEN = 1;
        public static final int OPEN_SMART = 3;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int mode;

        public DNDParameter(int i) {
            this.mode = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            return new byte[]{(byte) this.mode};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$MusicParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "", "a", LogUtil.I, "action", "b", "Ljava/lang/Integer;", "percentOfVolume", "<init>", "(ILjava/lang/Integer;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class MusicParameter extends AppParameter {
        public static final int NEXT = 3;
        public static final int NO_OP = 8;
        public static final int PAUSE = 1;
        public static final int PLAY = 0;
        public static final int PREV = 4;
        public static final int RESERVE = 2;
        public static final int VOL_DEC = 6;
        public static final int VOL_INC = 5;
        public static final int VOL_SET = 7;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Integer percentOfVolume;

        public MusicParameter(int i, @Nullable Integer num) {
            this.action = i;
            this.percentOfVolume = num;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            int i = this.action;
            return i != 7 ? new byte[]{(byte) i} : new byte[]{(byte) i, (byte) this.percentOfVolume.intValue()};
        }

        public /* synthetic */ MusicParameter(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$NFCCardParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "", "a", LogUtil.I, "type", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class NFCCardParameter extends AppParameter {
        public static final int ACCESS = 1;
        public static final int BANK = 3;
        public static final int BUS = 2;
        public static final int UNSELECT = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int type;

        public NFCCardParameter(int i) {
            this.type = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            return new byte[]{(byte) this.type};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$PhoneMuteParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "", "a", LogUtil.I, "muteSwitch", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PhoneMuteParameter extends AppParameter {
        public static final int EMPTY = 0;
        public static final int MUTE = 1;
        public static final int NOT_MUTED = 2;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int muteSwitch;

        public PhoneMuteParameter(int i) {
            this.muteSwitch = i;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            return new byte[]{(byte) this.muteSwitch};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$SportParameter;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/OpenAppContent$AppParameter;", "", "getBytes", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;", "type", "", "b", "Ljava/lang/Integer;", "typeValue", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportType;)V", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SportParameter extends AppParameter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final SportType type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Integer typeValue;

        public SportParameter(@NotNull SportType sportType) {
            this.type = sportType;
        }

        @Override // com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent.AppParameter
        @NotNull
        public byte[] getBytes() {
            Integer num = this.typeValue;
            return GattUtils.shortToBytes((short) (num == null ? this.type.getValue() : num.intValue()));
        }

        public SportParameter(int i) {
            this(SportType.SPORT_TYPE_NONE);
            this.typeValue = Integer.valueOf(i);
        }
    }

    public /* synthetic */ OpenAppContent(int i, AppParameter appParameter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : appParameter);
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.NLPContent
    @NotNull
    public byte[] getBytes(int version) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.app);
        AppParameter appParameter = this.parameter;
        if (appParameter != null) {
            byteArrayOutputStream.write(appParameter.getBytes());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public OpenAppContent(int i, @Nullable AppParameter appParameter) {
        super(4);
        this.app = i;
        this.parameter = appParameter;
    }
}
