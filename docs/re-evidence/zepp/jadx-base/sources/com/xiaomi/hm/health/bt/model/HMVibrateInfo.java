package com.xiaomi.hm.health.bt.model;

import androidx.annotation.Nullable;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class HMVibrateInfo {
    public static final short[] FADE_IN_TIMES = {160, 450, 160, 450, 160, 700, 160, 450, 160, 450, 160, 700, 400, 350, 400, 350, 400, 350, 400, 350};
    private static final String a = "HMVibrateInfo";
    private static final int b = -1;
    private static final int c = -2;
    private static final int d = 128;
    private static final int e = 64;
    public short id;
    public boolean test;
    public short[] times;
    public short type;
    public boolean useCustomVibrate;

    public HMVibrateInfo(short id, short[] times) {
        this.id = (short) -1;
        this.test = false;
        this.useCustomVibrate = false;
        this.id = id;
        this.times = times;
    }

    public static HMVibrateInfo getDefaultVibrate(int type) {
        HMVibrateInfo hMVibrateInfo = new HMVibrateInfo();
        hMVibrateInfo.times = new short[0];
        hMVibrateInfo.test = false;
        hMVibrateInfo.id = (short) -1;
        hMVibrateInfo.useCustomVibrate = false;
        hMVibrateInfo.type = (short) type;
        return hMVibrateInfo;
    }

    public static HMVibrateInfo getFadeInVibrate(int type) {
        HMVibrateInfo hMVibrateInfo = new HMVibrateInfo();
        hMVibrateInfo.times = FADE_IN_TIMES;
        hMVibrateInfo.test = false;
        hMVibrateInfo.id = (short) -2;
        hMVibrateInfo.useCustomVibrate = true;
        hMVibrateInfo.type = (short) type;
        return hMVibrateInfo;
    }

    public static HMVibrateInfo getTestVibrate(short[] times) {
        HMVibrateInfo hMVibrateInfo = new HMVibrateInfo();
        hMVibrateInfo.test = true;
        hMVibrateInfo.useCustomVibrate = true;
        hMVibrateInfo.times = times;
        return hMVibrateInfo;
    }

    public byte[] toBleBytes() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.type);
            byteArrayOutputStream.write((byte) (((this.times.length + 1) / 2) | (this.test ? 128 : 0) | (this.useCustomVibrate ? 64 : 0)));
            for (short s : this.times) {
                byteArrayOutputStream.write(s);
                byteArrayOutputStream.write(s >> 8);
            }
            if (this.times.length % 2 == 1) {
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            Debug.fi(a, "toBleBytes: " + e2);
            return null;
        }
    }

    @Nullable
    public byte[] toModuleBleBytes() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.type);
            byteArrayOutputStream.write(ByteUtilsKt.toByte(this.useCustomVibrate));
            byteArrayOutputStream.write(ByteUtilsKt.toByte(this.test));
            byteArrayOutputStream.write((this.times.length + 1) / 2);
            for (short s : this.times) {
                byteArrayOutputStream.write(s);
                byteArrayOutputStream.write(s >> 8);
            }
            if (this.times.length % 2 == 1) {
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            Debug.fi(a, "toModuleBleBytes: " + e2);
            return null;
        }
    }

    public String toString() {
        return "HMVibrateInfo:\n id: " + ((int) this.id) + "\n test: " + this.test + "\n useCustomVibrate: " + this.useCustomVibrate + "\n times, length: " + this.times.length + ", value: " + Arrays.toString(this.times) + "\n type: " + ((int) this.type);
    }

    public HMVibrateInfo() {
        this.id = (short) -1;
        this.test = false;
        this.useCustomVibrate = false;
    }
}
