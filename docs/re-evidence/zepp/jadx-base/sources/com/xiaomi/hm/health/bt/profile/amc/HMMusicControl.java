package com.xiaomi.hm.health.bt.profile.amc;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public class HMMusicControl implements Serializable {
    private static final long serialVersionUID = 1;
    private PhoneState a;
    private String d;
    private String e;
    private String f;
    private int b = 0;
    private int c = 0;
    private int g = -1;
    private AppException h = AppException.UNKNOWN;
    private int i = -1;
    private boolean j = false;

    public enum AppException {
        UNKNOWN((byte) 0),
        APP_READY((byte) 1),
        APP_NONE((byte) 2),
        NO_MUSIC((byte) 3),
        APP_KILL((byte) 4),
        NO_PERMISSION((byte) 5);

        private byte exception;

        AppException(byte exception) {
            this.exception = exception;
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
        DISLIKE_TRACK((byte) 12),
        BOOKMARK_TRACK((byte) 13),
        START(MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT),
        STOP((byte) -31);

        private byte mValue;

        DeviceCommand(byte value) {
            this.mValue = value;
        }

        public static DeviceCommand from(byte value) {
            for (DeviceCommand deviceCommand : values()) {
                if (deviceCommand.getValue() == value) {
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

        PhoneState(byte value) {
            this.mValue = value;
        }

        public static PhoneState from(byte value) {
            for (PhoneState phoneState : values()) {
                if (phoneState.getValue() == value) {
                    return phoneState;
                }
            }
            return null;
        }

        public byte getValue() {
            return this.mValue;
        }
    }

    public HMMusicControl(PhoneState state) {
        this.a = PhoneState.PLAY;
        this.a = state;
    }

    public String getAlbum() {
        return this.e;
    }

    public String getArtist() {
        return this.d;
    }

    public int getDuration() {
        return this.g;
    }

    public int getElapsedTime() {
        return this.c;
    }

    public AppException getException() {
        return this.h;
    }

    public int getRate() {
        return this.b;
    }

    public PhoneState getState() {
        return this.a;
    }

    public String getTitle() {
        return this.f;
    }

    public int getVolume() {
        return this.i;
    }

    public boolean isOnlyVolume() {
        return this.j;
    }

    public void setAlbum(String album) {
        this.e = album;
    }

    public void setArtist(String artist) {
        this.d = artist;
    }

    public void setDuration(int duration) {
        this.g = duration;
    }

    public void setElapsedTime(int elapsedTime) {
        this.c = elapsedTime;
    }

    public void setException(AppException exception) {
        this.h = exception;
    }

    public void setOnlyVolume(boolean onlyVolume) {
        this.j = onlyVolume;
    }

    public void setTitle(String title) {
        this.f = title;
    }

    public void setVolume(int volume) {
        this.i = volume;
    }

    public byte[] toBleBytes() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte b = 0;
            if (!this.j) {
                byte b2 = (byte) 1;
                byteArrayOutputStream.write(this.a.getValue());
                byteArrayOutputStream.write(this.b);
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.c));
                if (!TextUtils.isEmpty(this.d)) {
                    b2 = (byte) (b2 | 2);
                    byteArrayOutputStream.write(this.d.getBytes(Charset.defaultCharset()));
                    byteArrayOutputStream.write(0);
                }
                if (!TextUtils.isEmpty(this.e)) {
                    b2 = (byte) (b2 | 4);
                    byteArrayOutputStream.write(this.e.getBytes(Charset.defaultCharset()));
                    byteArrayOutputStream.write(0);
                }
                if (!TextUtils.isEmpty(this.f)) {
                    b2 = (byte) (b2 | 8);
                    byteArrayOutputStream.write(this.f.getBytes(Charset.defaultCharset()));
                    byteArrayOutputStream.write(0);
                }
                int i = this.g;
                if (i != -1) {
                    b2 = (byte) (b2 | 16);
                    byteArrayOutputStream.write(GattUtils.shortToBytes((short) i));
                }
                b = b2;
                AppException appException = this.h;
                if (appException != AppException.UNKNOWN) {
                    b = (byte) (b | 32);
                    byteArrayOutputStream.write(appException.getException());
                }
            }
            int i2 = this.i;
            if (i2 != -1) {
                b = (byte) (b | 64);
                byteArrayOutputStream.write(i2);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(b);
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            return byteArrayOutputStream2.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "HMMusicControl{state=" + this.a + ", rate=" + this.b + ", elapsedTime=" + this.c + ", artist='" + this.d + "', album='" + this.e + "', title='" + this.f + "', duration=" + this.g + ", volume=" + this.i + ", exception=" + this.h + '}';
    }
}
