package androidx.security.crypto;

import com.google.crypto.tink.KeyTemplate;
import defpackage.vv0;

/* JADX INFO: loaded from: classes.dex */
public enum EncryptedFile$FileEncryptionScheme {
    AES256_GCM_HKDF_4KB(vv0.k());

    private final KeyTemplate mStreamingAeadKeyTemplate;

    EncryptedFile$FileEncryptionScheme(KeyTemplate keyTemplate) {
        this.mStreamingAeadKeyTemplate = keyTemplate;
    }

    public KeyTemplate getKeyTemplate() {
        return this.mStreamingAeadKeyTemplate;
    }
}
