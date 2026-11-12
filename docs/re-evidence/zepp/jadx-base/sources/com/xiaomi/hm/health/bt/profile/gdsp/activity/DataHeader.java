package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.huami.bluetooth.profile.data.TimeKt;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.Arrays;
import java.util.Calendar;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public class DataHeader {
    private static final int b = 4;
    private static final int c = 12;
    private int a;
    public Calendar calendar;
    public byte[] expansionData;
    public int size;

    public DataHeader() {
        this.calendar = Calendar.getInstance();
        this.size = 0;
        this.a = 1;
    }

    @Nullable
    public static DataHeader fromBytes(@Nullable byte[] bytes) {
        if (bytes == null || bytes.length < 12) {
            return null;
        }
        return new DataHeader(TimeKt.toCalendar(Arrays.copyOfRange(bytes, 4, 12)), ByteUtilsKt.toInt(bytes, 4, 0));
    }

    public int getDeviceError() {
        int i = this.a;
        if (i == 1) {
            return 0;
        }
        if (i == 7) {
            return 5;
        }
        if (i == 48) {
            return 6;
        }
        return i == 49 ? 7 : 100;
    }

    public int getErrorCode() {
        return this.a;
    }

    public boolean isCompressed() {
        byte[] bArr = this.expansionData;
        return (bArr == null || bArr.length == 0 || bArr[0] != 1) ? false : true;
    }

    public boolean isSuccessfully() {
        return this.a == 1;
    }

    public String toString() {
        return "DataHeader{calendar=" + this.calendar.getTime().toString() + ", size=" + this.size + ", error=" + this.a + '}';
    }

    public DataHeader(int errorCode) {
        this.calendar = Calendar.getInstance();
        this.size = 0;
        this.a = 1;
        this.a = errorCode;
    }

    public DataHeader(Calendar calendar, int size) {
        this.calendar = Calendar.getInstance();
        this.size = 0;
        this.a = 1;
        this.calendar = calendar;
        this.size = size;
    }

    public DataHeader(Calendar calendar, int size, byte[] expansionData) {
        this.calendar = Calendar.getInstance();
        this.size = 0;
        this.a = 1;
        this.calendar = calendar;
        this.size = size;
        this.expansionData = expansionData;
    }
}
