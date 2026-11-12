package com.ximalaya.ting.android.sdkdownloader.exception;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes22.dex */
public class AddDownloadException extends BaseRuntimeException {
    public static final int CODE_DISK_OVER;
    public static final int CODE_MAX_DOWNLOADING_COUNT;
    public static final int CODE_MAX_OVER;
    public static final int CODE_MAX_SPACE_OVER;
    public static final int CODE_NOT_FIND_TRACK;
    public static final int CODE_NO_PAY_SOUND;
    public static final int CODE_NULL;
    private static int b;
    private int a;

    static {
        int i = 0 + 1;
        b = i;
        CODE_NULL = i;
        int i2 = i + 1;
        b = i2;
        CODE_MAX_OVER = i2;
        int i3 = i2 + 1;
        b = i3;
        CODE_NOT_FIND_TRACK = i3;
        int i4 = i3 + 1;
        b = i4;
        CODE_MAX_DOWNLOADING_COUNT = i4;
        int i5 = i4 + 1;
        b = i5;
        CODE_DISK_OVER = i5;
        int i6 = i5 + 1;
        b = i6;
        CODE_MAX_SPACE_OVER = i6;
        int i7 = i6 + 1;
        b = i7;
        CODE_NO_PAY_SOUND = i7;
    }

    public AddDownloadException(int i, String str) {
        super(str);
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    public void setCode(int i) {
        this.a = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AddDownloadException{code=" + this.a + " ;message = " + getMessage() + i.d;
    }
}
