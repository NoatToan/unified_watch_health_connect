package com.beaglebuddy.id3.enums;

import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes2.dex */
public enum ID3TagVersion {
    NONE("none", (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0),
    ID3V2_2("ID3v2.2", (byte) 73, a.n, HMDisplaySetting.TYPE_VENICE, (byte) 2, (byte) 0),
    ID3V2_3("ID3v2.3", (byte) 73, a.n, HMDisplaySetting.TYPE_VENICE, (byte) 3, (byte) 0),
    ID3V2_4("ID3v2.4", (byte) 73, a.n, HMDisplaySetting.TYPE_VENICE, (byte) 4, (byte) 0),
    ID3V2_4_FOOTER("ID3v2.4 footer", HMDisplaySetting.TYPE_VENICE, a.n, (byte) 73, (byte) 4, (byte) 0);

    public static final int NUM_ID_BYTES = 5;
    private String description;
    private byte[] idBytes;

    ID3TagVersion(String str, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.description = str;
        this.idBytes = new byte[]{b, b2, b3, b4, b5};
    }

    public static final ID3TagVersion getVersion(byte[] bArr) {
        for (ID3TagVersion iD3TagVersion : values()) {
            if (Arrays.equals(bArr, iD3TagVersion.getIdBytes())) {
                return iD3TagVersion;
            }
        }
        return NONE;
    }

    public static ID3TagVersion readVersion(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[5];
        return inputStream.read(bArr) == 5 ? getVersion(bArr) : NONE;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getIdBytes() {
        return this.idBytes;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.description;
    }
}
