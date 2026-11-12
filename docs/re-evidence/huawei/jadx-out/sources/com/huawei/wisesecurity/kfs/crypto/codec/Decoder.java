package com.huawei.wisesecurity.kfs.crypto.codec;

import android.util.Base64;
import defpackage.ynw;
import defpackage.yof;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public interface Decoder {
    public static final Decoder BASE64 = new Decoder() { // from class: com.huawei.wisesecurity.kfs.crypto.codec.Decoder.3
        @Override // com.huawei.wisesecurity.kfs.crypto.codec.Decoder
        public byte[] decode(String str) throws ynw {
            try {
                return Base64.decode(str, 0);
            } catch (Exception e) {
                throw new ynw("Base64 decode fail : " + e.getMessage());
            }
        }
    };
    public static final Decoder BASE64URL = new Decoder() { // from class: com.huawei.wisesecurity.kfs.crypto.codec.Decoder.1
        @Override // com.huawei.wisesecurity.kfs.crypto.codec.Decoder
        public byte[] decode(String str) throws ynw {
            try {
                return Base64.decode(str, 8);
            } catch (Exception e) {
                throw new ynw("Base64 decode fail : " + e.getMessage());
            }
        }
    };
    public static final Decoder HEX = new Decoder() { // from class: com.huawei.wisesecurity.kfs.crypto.codec.Decoder.5
        @Override // com.huawei.wisesecurity.kfs.crypto.codec.Decoder
        public byte[] decode(String str) throws ynw {
            return yof.b(str);
        }
    };
    public static final Decoder RAW_BYTES = new Decoder() { // from class: com.huawei.wisesecurity.kfs.crypto.codec.Decoder.4
        @Override // com.huawei.wisesecurity.kfs.crypto.codec.Decoder
        public byte[] decode(String str) throws ynw {
            return str.getBytes(StandardCharsets.UTF_8);
        }
    };

    byte[] decode(String str) throws ynw;
}
