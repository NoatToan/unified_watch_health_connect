package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class OpenContent extends SpeechContent {
    public static final byte APP_ALARM = 16;
    public static final byte APP_ALIPAY = 0;
    public static final byte APP_BRIGHNESS = 15;
    public static final byte APP_CAMERA = 8;
    public static final byte APP_COUNTDOWN = 11;
    public static final byte APP_DIAL = 14;
    public static final byte APP_DND = 7;
    public static final byte APP_FIND_PHONE = 12;
    public static final byte APP_HEARTRATE = 3;
    public static final byte APP_MUSIC = 9;
    public static final byte APP_MUTE = 13;
    public static final byte APP_NFC = 1;
    public static final byte APP_NOTIFICATION = 6;
    public static final byte APP_SPORT = 4;
    public static final byte APP_STATUS = 2;
    public static final byte APP_TIMER = 10;
    public static final byte APP_WEATHER = 5;
    public static final byte SUB_UNKNOWN = -1;
    private byte b;
    private byte c;
    private SpeechContent d;
    public static final byte SUB_SPORT_OUTDOOR = (byte) SportType.SPORT_TYPE_ODRUN.getValue();
    public static final byte SUB_SPORT_INDOOR = (byte) SportType.SPORT_TYPE_IDRUN.getValue();
    public static final byte SUB_SPORT_WALK = (byte) SportType.SPORT_TYPE_WALKING.getValue();
    public static final byte SUB_SPORT_RIDE = (byte) SportType.SPORT_TYPE_RIDING.getValue();
    public static final byte SUB_SPORT_EXERCISE = (byte) SportType.SPORT_TYPE_EXERCISE.getValue();
    public static final byte SUB_SPORT_SWIM_POOL = (byte) SportType.SPORT_TYPE_POOL_SWIM.getValue();
    public static final byte SUB_SPORT_SWIM_OUTDOOR = (byte) SportType.SPORT_TYPE_OPEN_WATER_SWIM.getValue();

    public static class BrightnessContent extends SpeechContent {
        public static final byte NONE = 32;
        public static final byte RESERVE = 0;
        public static final byte SET_BRIGHTNESS_DELTA = 1;
        public static final byte SET_BRIGHTNESS_PERCENT = 2;
        private byte b;
        private byte c = 0;
        private byte d = 50;

        public BrightnessContent(byte op) {
            this.b = op;
        }

        @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
        public byte[] getBytes() {
            byte b = this.b;
            if (b == 1) {
                return new byte[]{b, this.c};
            }
            return b == 2 ? new byte[]{b, this.d} : new byte[]{b};
        }

        public void setBrightnessDelta(byte delta) {
            this.c = delta;
        }

        public void setBrightnessPercent(byte percent) {
            this.d = percent;
        }

        @NonNull
        public String toString() {
            return "BrightnessContent{op=" + ((int) this.b) + ", brightnessDelta=" + ((int) this.c) + ", brightnessPercent=" + ((int) this.d) + '}';
        }
    }

    public static class CountdownContent extends SpeechContent {
        public static final byte EXCEED_LIMIT = 1;
        public static final byte SUCCESS = 0;
        private byte b;
        private byte c;
        private byte d;
        private String e;

        public CountdownContent(byte minute, byte second, String content) {
            this((byte) 0, minute, second, content);
        }

        @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
        public byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.b);
            if (this.b == 0) {
                byteArrayOutputStream.write(this.c);
                byteArrayOutputStream.write(this.d);
            } else {
                if (!TextUtils.isEmpty(this.e)) {
                    byteArrayOutputStream.write(this.e.getBytes(Charset.defaultCharset()), 0, this.e.getBytes(Charset.defaultCharset()).length);
                }
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        }

        public String getContent() {
            return this.e;
        }

        public byte getMinute() {
            return this.c;
        }

        public byte getSecond() {
            return this.d;
        }

        public byte getType() {
            return this.b;
        }

        public void setContent(String content) {
            this.e = content;
        }

        public void setMinute(byte minute) {
            this.c = minute;
        }

        public void setSecond(byte second) {
            this.d = second;
        }

        public void setType(byte type) {
            this.b = type;
        }

        public CountdownContent(byte type, byte minute, byte second, String content) {
            this.b = (byte) 0;
            this.c = (byte) 0;
            this.d = (byte) 0;
            this.e = null;
            this.b = type;
            this.c = minute;
            this.d = second;
            this.e = content;
        }

        public CountdownContent(byte type, String content) {
            this.b = (byte) 0;
            this.c = (byte) 0;
            this.d = (byte) 0;
            this.e = null;
            this.b = type;
            this.e = content;
        }
    }

    public static class DndContent extends SpeechContent {
        public static final byte CLOSE = 0;
        public static final byte NONE = 32;
        public static final byte OPEN = 1;
        public static final byte OPEN_SMART = 2;
        public static final byte SWITCH = 16;
        private byte b;

        public DndContent(byte op) {
            this.b = (byte) 1;
            this.b = op;
        }

        @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
        public byte[] getBytes() {
            return new byte[]{this.b};
        }

        @NonNull
        public String toString() {
            return "DndContent{op=" + ((int) this.b) + '}';
        }
    }

    public static class MusicContent extends SpeechContent {
        public static final byte NEXT = 3;
        public static final byte NONE = 32;
        public static final byte PAUSE = 1;
        public static final byte PLAY = 0;
        public static final byte PREV = 4;
        public static final byte RESERVE = 2;
        public static final byte VOLUME_DOWN = 6;
        public static final byte VOLUME_SET = 25;
        public static final byte VOLUME_UP = 5;
        private byte b;
        private byte c = 100;

        public MusicContent(byte op) {
            this.b = (byte) 0;
            this.b = op;
        }

        @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
        public byte[] getBytes() {
            byte b = this.b;
            return b == 25 ? new byte[]{b, this.c} : new byte[]{b};
        }

        public byte getPercentOfVolume() {
            return this.c;
        }

        public void setPercentOfVolume(byte percentOfVolume) {
            this.c = percentOfVolume;
        }

        @NonNull
        public String toString() {
            return "MusicContent{op=" + ((int) this.b) + ", percentOfVolume=" + ((int) this.c) + '}';
        }
    }

    public OpenContent(byte appID) {
        this(appID, (byte) -1);
    }

    public byte getAppID() {
        return this.b;
    }

    @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
    public byte[] getBytes() {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        byte b = this.c;
        if (b != -1) {
            byteArrayOutputStream.write(b);
        }
        SpeechContent speechContent = this.d;
        if (speechContent != null && (bytes = speechContent.getBytes()) != null && bytes.length > 0) {
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public SpeechContent getParam() {
        return this.d;
    }

    public byte getSubID() {
        return this.c;
    }

    public void setAppID(byte appID) {
        this.b = appID;
    }

    public void setParam(SpeechContent param) {
        this.d = param;
    }

    public void setSubID(byte subID) {
        this.c = subID;
    }

    public String toString() {
        return "OpenContent{appID=" + ((int) this.b) + ", subID=" + ((int) this.c) + ", param=" + this.d + '}';
    }

    public OpenContent(byte appID, byte subID) {
        this.c = (byte) -1;
        this.d = null;
        this.b = appID;
        this.c = subID;
    }
}
