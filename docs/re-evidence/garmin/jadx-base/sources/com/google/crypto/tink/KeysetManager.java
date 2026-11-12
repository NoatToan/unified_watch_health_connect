package com.google.crypto.tink;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class KeysetManager {
    private final Keyset.Builder keysetBuilder;

    private KeysetManager(Keyset.Builder builder) {
        this.keysetBuilder = builder;
    }

    private synchronized boolean keyIdExists(int i14) {
        Iterator<Keyset.Key> it = this.keysetBuilder.getKeyList().iterator();
        while (it.hasNext()) {
            if (it.next().getKeyId() == i14) {
                return true;
            }
        }
        return false;
    }

    private synchronized Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeyData keyDataNewKeyData;
        int iNewKeyId;
        OutputPrefixType outputPrefixType;
        try {
            keyDataNewKeyData = Registry.newKeyData(keyTemplate);
            iNewKeyId = newKeyId();
            outputPrefixType = keyTemplate.getOutputPrefixType();
            if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
                outputPrefixType = OutputPrefixType.TINK;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return Keyset.Key.newBuilder().setKeyData(keyDataNewKeyData).setKeyId(iNewKeyId).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
    }

    private synchronized int newKeyId() {
        int iRandPositiveInt;
        iRandPositiveInt = randPositiveInt();
        while (keyIdExists(iRandPositiveInt)) {
            iRandPositiveInt = randPositiveInt();
        }
        return iRandPositiveInt;
    }

    private static int randPositiveInt() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i14 = 0;
        while (i14 == 0) {
            secureRandom.nextBytes(bArr);
            i14 = ((bArr[0] & Ascii.DEL) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
        }
        return i14;
    }

    public static KeysetManager withEmptyKeyset() {
        return new KeysetManager(Keyset.newBuilder());
    }

    public static KeysetManager withKeysetHandle(KeysetHandle keysetHandle) {
        return new KeysetManager(keysetHandle.getKeyset().toBuilder());
    }

    public synchronized KeysetManager add(KeyTemplate keyTemplate) {
        addNewKey(keyTemplate.getProto(), false);
        return this;
    }

    @Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, boolean z14) {
        Keyset.Key keyNewKey;
        try {
            keyNewKey = newKey(keyTemplate);
            this.keysetBuilder.addKey(keyNewKey);
            if (z14) {
                this.keysetBuilder.setPrimaryKeyId(keyNewKey.getKeyId());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return keyNewKey.getKeyId();
    }

    public synchronized KeysetManager delete(int i14) {
        if (i14 == this.keysetBuilder.getPrimaryKeyId()) {
            throw new GeneralSecurityException("cannot delete the primary key");
        }
        for (int i15 = 0; i15 < this.keysetBuilder.getKeyCount(); i15++) {
            if (this.keysetBuilder.getKey(i15).getKeyId() == i14) {
                this.keysetBuilder.removeKey(i15);
            }
        }
        throw new GeneralSecurityException("key not found: " + i14);
        return this;
    }

    public synchronized KeysetManager destroy(int i14) {
        try {
            if (i14 == this.keysetBuilder.getPrimaryKeyId()) {
                throw new GeneralSecurityException("cannot destroy the primary key");
            }
            for (int i15 = 0; i15 < this.keysetBuilder.getKeyCount(); i15++) {
                Keyset.Key key = this.keysetBuilder.getKey(i15);
                if (key.getKeyId() == i14) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED && key.getStatus() != KeyStatusType.DESTROYED) {
                        throw new GeneralSecurityException("cannot destroy key with id " + i14 + " and status " + key.getStatus());
                    }
                    this.keysetBuilder.setKey(i15, key.toBuilder().setStatus(KeyStatusType.DESTROYED).clearKeyData().build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i14);
        } catch (Throwable th3) {
            throw th3;
        }
        return this;
    }

    public synchronized KeysetManager disable(int i14) {
        try {
            if (i14 == this.keysetBuilder.getPrimaryKeyId()) {
                throw new GeneralSecurityException("cannot disable the primary key");
            }
            for (int i15 = 0; i15 < this.keysetBuilder.getKeyCount(); i15++) {
                Keyset.Key key = this.keysetBuilder.getKey(i15);
                if (key.getKeyId() == i14) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot disable key with id " + i14 + " and status " + key.getStatus());
                    }
                    this.keysetBuilder.setKey(i15, key.toBuilder().setStatus(KeyStatusType.DISABLED).build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i14);
        } catch (Throwable th3) {
            throw th3;
        }
        return this;
    }

    public synchronized KeysetManager enable(int i14) {
        for (int i15 = 0; i15 < this.keysetBuilder.getKeyCount(); i15++) {
            try {
                Keyset.Key key = this.keysetBuilder.getKey(i15);
                if (key.getKeyId() == i14) {
                    KeyStatusType status = key.getStatus();
                    KeyStatusType keyStatusType = KeyStatusType.ENABLED;
                    if (status != keyStatusType && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot enable key with id " + i14 + " and status " + key.getStatus());
                    }
                    this.keysetBuilder.setKey(i15, key.toBuilder().setStatus(keyStatusType).build());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        throw new GeneralSecurityException("key not found: " + i14);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() {
        return KeysetHandle.fromKeyset(this.keysetBuilder.build());
    }

    @Deprecated
    public synchronized KeysetManager promote(int i14) {
        return setPrimary(i14);
    }

    @Deprecated
    public synchronized KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        addNewKey(keyTemplate, true);
        return this;
    }

    public synchronized KeysetManager setPrimary(int i14) {
        for (int i15 = 0; i15 < this.keysetBuilder.getKeyCount(); i15++) {
            Keyset.Key key = this.keysetBuilder.getKey(i15);
            if (key.getKeyId() == i14) {
                if (!key.getStatus().equals(KeyStatusType.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i14);
                }
                this.keysetBuilder.setPrimaryKeyId(i14);
            }
        }
        throw new GeneralSecurityException("key not found: " + i14);
        return this;
    }

    @Deprecated
    public synchronized KeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        addNewKey(keyTemplate, false);
        return this;
    }
}
