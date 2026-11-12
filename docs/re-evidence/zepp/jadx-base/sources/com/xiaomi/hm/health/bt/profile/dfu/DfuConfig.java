package com.xiaomi.hm.health.bt.profile.dfu;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class DfuConfig {
    public static final int BOTH = 2;
    public static final int NOTIFY_LENGTH = 1;
    public static final int WRITE_REQUEST = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 4;
    private static final int h = 0;
    private static final int i = 1;
    private int a = 0;
    private int b = -1;
    private int c = 0;
    private int d = 0;

    private void a(int flushSize) {
        this.b = flushSize;
    }

    private void b(int type) {
        this.a = type;
    }

    public static DfuConfig parse(byte[] value) {
        if (value != null) {
            int i2 = 3;
            if (value.length >= 3) {
                try {
                    int i3 = (value[0] & 255) | ((value[1] & 255) << 8);
                    DfuConfig dfuConfig = new DfuConfig();
                    dfuConfig.setVersion(value[2] & 255);
                    if ((i3 & 1) != 0) {
                        dfuConfig.b(value[3] & 255);
                        i2 = 4;
                    }
                    if ((i3 & 2) != 0) {
                        int i4 = i2 + 1;
                        int i5 = i4 + 1;
                        int i6 = (value[i2] & 255) | ((value[i4] & 255) << 8);
                        int i7 = i5 + 1;
                        int i8 = i6 | ((value[i5] & 255) << 16);
                        dfuConfig.a(i8 | ((value[i7] & 255) << 24));
                        i2 = i7 + 1;
                    }
                    if ((i3 & 4) != 0) {
                        dfuConfig.setFlushType(value[i2]);
                    }
                    return dfuConfig;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public int getFlushSize() {
        return this.b;
    }

    public int getFlushType() {
        return this.c;
    }

    public int getType() {
        return this.a;
    }

    public int getVersion() {
        return this.d;
    }

    public void setFlushType(int flushType) {
        this.c = flushType;
    }

    public void setVersion(int version) {
        this.d = version;
    }

    @NonNull
    public String toString() {
        return "DfuConfig{type=" + this.a + ", flushSize=" + this.b + ", flushType=" + this.c + ", version=" + this.d + '}';
    }
}
