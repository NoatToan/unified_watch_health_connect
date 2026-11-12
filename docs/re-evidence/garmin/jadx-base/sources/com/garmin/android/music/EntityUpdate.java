package com.garmin.android.music;

/* JADX INFO: loaded from: classes11.dex */
public class EntityUpdate {
    public final int attributeId;
    public final int entityId;
    public final int entityUpdateFlags;
    public final byte[] value;

    public EntityUpdate(int i14, int i15, int i16, String str) {
        this.entityId = i14;
        this.attributeId = i15;
        this.entityUpdateFlags = i16;
        this.value = str != null ? str.getBytes() : new byte[0];
    }

    public EntityUpdate(int i14, int i15, int i16, byte[] bArr) {
        this.entityId = i14;
        this.attributeId = i15;
        this.entityUpdateFlags = i16;
        this.value = bArr == null ? new byte[0] : bArr;
    }
}
