package com.beaglebuddy.id3.pojo.v24;

import androidx.exifinterface.media.ExifInterface;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class Timestamp {
    private String a;

    public Timestamp(int i) throws IllegalArgumentException {
        f(i);
    }

    private void a(int i) throws IllegalArgumentException {
        if (i < 1 || i > 31) {
            throw new IllegalArgumentException("Invalid timestamp day, " + i + ".  It must be in the range 1 - 31.");
        }
        if (i < 10) {
            this.a += "0";
        }
        this.a += Integer.toString(i);
    }

    private void b(int i) throws IllegalArgumentException {
        if (i < 1 || i > 24) {
            throw new IllegalArgumentException("Invalid timestamp hour, " + i + ".  It must be in the range 1 - 24.");
        }
        if (i < 10) {
            this.a += "0";
        }
        this.a += Integer.toString(i);
    }

    private void c(int i) throws IllegalArgumentException {
        if (i < 1 || i > 59) {
            throw new IllegalArgumentException("Invalid timestamp minute, " + i + ".  It must be in the range 1 - 59.");
        }
        if (i < 10) {
            this.a += "0";
        }
        this.a += Integer.toString(i);
    }

    private void d(int i) throws IllegalArgumentException {
        if (i < 1 || i > 12) {
            throw new IllegalArgumentException("Invalid timestamp month, " + i + ".  It must be in the range 1 - 12.");
        }
        if (i < 10) {
            this.a += "0";
        }
        this.a += Integer.toString(i);
    }

    private void e(int i) throws IllegalArgumentException {
        if (i < 1 || i > 59) {
            throw new IllegalArgumentException("Invalid timestamp second, " + i + ".  It must be in the range 1 - 59.");
        }
        if (i < 10) {
            this.a += "0";
        }
        this.a += Integer.toString(i);
    }

    private void f(int i) throws IllegalArgumentException {
        if (i <= 0) {
            throw new IllegalArgumentException("Invalid timestamp year, " + i + ".  It must be greater than 0.");
        }
        if (i < 10) {
            this.a = Constant.DEFAULT_CVN2;
        } else if (i < 100) {
            this.a = "00";
        } else if (i < 1000) {
            this.a = "0";
        }
        this.a += Integer.toString(i);
    }

    public String toString() {
        return this.a;
    }

    public Timestamp(int i, int i2) throws IllegalArgumentException {
        this(i);
        this.a += Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        d(i2);
    }

    public Timestamp(int i, int i2, int i3) throws IllegalArgumentException {
        this(i, i2);
        this.a += Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        a(i3);
    }

    public Timestamp(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this(i, i2, i3);
        this.a += ExifInterface.GPS_DIRECTION_TRUE;
        b(i4);
    }

    public Timestamp(int i, int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this(i, i2, i3, i4);
        this.a += ":";
        c(i5);
    }

    public Timestamp(int i, int i2, int i3, int i4, int i5, int i6) throws IllegalArgumentException {
        this(i, i2, i3, i4, i5);
        this.a += ":";
        e(i6);
    }
}
