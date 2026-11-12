package com.garmin.android.music;

/* JADX INFO: loaded from: classes11.dex */
public class AMSEntityUpdate {
    private final byte attributeID;
    private final byte entityID;
    private final byte entityUpdateFlags;
    private final byte[] value;

    public AMSEntityUpdate(byte b14, byte b15, byte b16, byte[] bArr) {
        this.entityID = b14;
        this.attributeID = b15;
        this.entityUpdateFlags = b16;
        this.value = bArr;
    }

    public byte[] toMessage() {
        byte[] bArr = this.value;
        byte[] bArr2 = new byte[bArr.length + 3];
        bArr2[0] = this.entityID;
        bArr2[1] = this.attributeID;
        bArr2[2] = this.entityUpdateFlags;
        System.arraycopy(bArr, 0, bArr2, 3, bArr.length);
        return bArr2;
    }
}
