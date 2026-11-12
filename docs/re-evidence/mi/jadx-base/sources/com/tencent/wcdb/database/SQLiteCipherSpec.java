package com.tencent.wcdb.database;

import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;

/* JADX INFO: loaded from: classes6.dex */
public class SQLiteCipherSpec {
    public static final String CIPHER_AES256CBC = "aes-256-cbc";
    public static final String CIPHER_DEVLOCK = "devlock";
    public static final String CIPHER_XXTEA = "xxtea";
    public String cipher;
    public boolean hmacEnabled;
    public int kdfIteration;
    public int pageSize;

    public SQLiteCipherSpec() {
        this.hmacEnabled = true;
        this.pageSize = SQLiteGlobal.defaultPageSize;
    }

    public SQLiteCipherSpec setCipher(String str) {
        this.cipher = str;
        return this;
    }

    public SQLiteCipherSpec setKDFIteration(int i) {
        this.kdfIteration = i;
        return this;
    }

    public SQLiteCipherSpec setPageSize(int i) {
        this.pageSize = i;
        return this;
    }

    public SQLiteCipherSpec setSQLCipherVersion(int i) {
        if (i == 1) {
            this.hmacEnabled = false;
            this.kdfIteration = 4000;
        } else if (i == 2) {
            this.hmacEnabled = true;
            this.kdfIteration = 4000;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unsupported SQLCipher version: " + i);
            }
            this.hmacEnabled = true;
            this.kdfIteration = MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE;
        }
        return this;
    }

    public SQLiteCipherSpec withHMACEnabled(boolean z) {
        this.hmacEnabled = z;
        return this;
    }

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
        this.hmacEnabled = true;
        this.pageSize = SQLiteGlobal.defaultPageSize;
        this.cipher = sQLiteCipherSpec.cipher;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }
}
