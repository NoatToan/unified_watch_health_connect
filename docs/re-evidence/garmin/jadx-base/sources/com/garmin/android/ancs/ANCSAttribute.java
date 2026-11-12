package com.garmin.android.ancs;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ANCSAttribute {
    public static final int ACTIONFLAG_INPUTSUPPORTED = 1;
    public final int actionFlags;
    public final int maxActions;
    public final int maxLength;
    private byte[] value;

    public ANCSAttribute(int i14, int i15, int i16, byte[] bArr) {
        this.maxLength = i14;
        this.maxActions = i15;
        this.actionFlags = i16;
        this.value = bArr;
    }

    public byte[] getValue(boolean z14) {
        byte[] bArr = this.value;
        return bArr == null ? new byte[0] : Arrays.copyOf(bArr, getValueLength(z14));
    }

    public int getValueLength(boolean z14) {
        int i14;
        byte[] bArr = this.value;
        if (bArr == null) {
            return 0;
        }
        if (!z14 || (i14 = this.maxLength) == 0 || bArr.length <= i14) {
            return bArr.length;
        }
        while ((this.value[i14] & 192) == 128) {
            i14--;
        }
        return i14;
    }

    public void setValue(byte[] bArr) {
        this.value = bArr;
    }

    public ANCSAttribute(int i14, byte[] bArr) {
        this(i14, 0, 0, bArr);
    }

    public byte[] getValue() {
        return getValue(true);
    }

    public int getValueLength() {
        return getValueLength(true);
    }
}
