package com.xiaomi.hm.health.bt.profile.amc;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMMusicControl implements Serializable {
    private static final long serialVersionUID = 1;
    private String album;
    private String artist;
    private PhoneState state;
    private String title;
    private int rate = 0;
    private int elapsedTime = 0;
    private int duration = -1;
    private AppException exception = AppException.UNKNOWN;
    private int volume = -1;
    private boolean onlyVolume = false;

    public enum AppException {
        UNKNOWN((byte) 0),
        APP_READY((byte) 1),
        APP_NONE((byte) 2),
        NO_MUSIC((byte) 3),
        APP_KILL((byte) 4),
        NO_PERMISSION((byte) 5);

        private byte exception;

        AppException(byte b2) {
            this.exception = b2;
        }

        public byte getException() {
            return this.exception;
        }
    }

    public enum DeviceCommand {
        PLAY((byte) 0),
        PAUSE((byte) 1),
        TOGGLE((byte) 2),
        NEXT((byte) 3),
        PREV((byte) 4),
        VOL_UP((byte) 5),
        VOL_DOWN((byte) 6),
        REPEAT((byte) 7),
        SHUFFLE((byte) 8),
        SKIP_FORWARD((byte) 9),
        SKIP_BACKWARD((byte) 10),
        LIKE_TRACK((byte) 11),
        DISLIKE_TRACK(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT),
        BOOKMARK_TRACK(HMProSyncDataBaseProfile.DATA_TYPE_PAI),
        START((byte) -32),
        STOP((byte) -31);

        private byte mValue;

        DeviceCommand(byte b2) {
            this.mValue = b2;
        }

        public static DeviceCommand from(byte b2) {
            for (DeviceCommand deviceCommand : values()) {
                if (deviceCommand.getValue() == b2) {
                    return deviceCommand;
                }
            }
            return null;
        }

        public byte getValue() {
            return this.mValue;
        }
    }

    public enum PhoneState {
        PAUSE((byte) 0),
        PLAY((byte) 1),
        REWIND((byte) 2),
        FORWARD((byte) 3);

        private byte mValue;

        PhoneState(byte b2) {
            this.mValue = b2;
        }

        public static PhoneState from(byte b2) {
            for (PhoneState phoneState : values()) {
                if (phoneState.getValue() == b2) {
                    return phoneState;
                }
            }
            return null;
        }

        public byte getValue() {
            return this.mValue;
        }
    }

    public HMMusicControl(PhoneState phoneState) {
        this.state = PhoneState.PLAY;
        this.state = phoneState;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getElapsedTime() {
        return this.elapsedTime;
    }

    public AppException getException() {
        return this.exception;
    }

    public int getRate() {
        return this.rate;
    }

    public PhoneState getState() {
        return this.state;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isOnlyVolume() {
        return this.onlyVolume;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setElapsedTime(int i) {
        this.elapsedTime = i;
    }

    public void setException(AppException appException) {
        this.exception = appException;
    }

    public void setOnlyVolume(boolean z) {
        this.onlyVolume = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public byte[] toBleBytes() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte b2 = 0;
            if (!this.onlyVolume) {
                byte b3 = (byte) 1;
                byteArrayOutputStream.write(this.state.getValue());
                byteArrayOutputStream.write(this.rate);
                byteArrayOutputStream.write(tet.s((short) this.elapsedTime));
                if (!TextUtils.isEmpty(this.artist)) {
                    b3 = (byte) (b3 | 2);
                    byteArrayOutputStream.write(this.artist.getBytes(Charset.defaultCharset()));
                    byteArrayOutputStream.write(0);
                }
                if (!TextUtils.isEmpty(this.album)) {
                    b3 = (byte) (b3 | 4);
                    byteArrayOutputStream.write(this.album.getBytes(Charset.defaultCharset()));
                    byteArrayOutputStream.write(0);
                }
                if (!TextUtils.isEmpty(this.title)) {
                    b3 = (byte) (b3 | 8);
                    byteArrayOutputStream.write(this.title.getBytes(Charset.defaultCharset()));
                    byteArrayOutputStream.write(0);
                }
                int i = this.duration;
                if (i != -1) {
                    b3 = (byte) (b3 | 16);
                    byteArrayOutputStream.write(tet.s((short) i));
                }
                b2 = b3;
                AppException appException = this.exception;
                if (appException != AppException.UNKNOWN) {
                    b2 = (byte) (b2 | 32);
                    byteArrayOutputStream.write(appException.getException());
                }
            }
            int i2 = this.volume;
            if (i2 != -1) {
                b2 = (byte) (b2 | 64);
                byteArrayOutputStream.write(i2);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(b2);
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            return byteArrayOutputStream2.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "HMMusicControl{state=" + this.state + ", rate=" + this.rate + ", elapsedTime=" + this.elapsedTime + ", artist='" + this.artist + "', album='" + this.album + "', title='" + this.title + "', duration=" + this.duration + ", volume=" + this.volume + ", exception=" + this.exception + AbstractJsonLexerKt.END_OBJ;
    }
}
