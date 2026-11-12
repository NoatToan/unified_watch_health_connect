package com.google.crypto.tink;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class KeysetHandle {
    private final Keyset keyset;

    private KeysetHandle(Keyset keyset) {
        this.keyset = keyset;
    }

    public static void assertEnoughEncryptedKeyMaterial(EncryptedKeyset encryptedKeyset) throws GeneralSecurityException {
        if (encryptedKeyset == null || encryptedKeyset.getEncryptedKeyset().size() == 0) {
            a.t("empty keyset");
        }
    }

    public static void assertEnoughKeyMaterial(Keyset keyset) throws GeneralSecurityException {
        if (keyset == null || keyset.getKeyCount() <= 0) {
            a.t("empty keyset");
        }
    }

    private static void assertNoSecretKeyMaterial(Keyset keyset) throws GeneralSecurityException {
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("keyset contains key material of type " + key.getKeyData().getKeyMaterialType() + " for type url " + key.getKeyData().getTypeUrl());
            }
        }
    }

    private static KeyData createPublicKeyData(KeyData keyData) throws GeneralSecurityException {
        if (keyData.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
            a.t("The keyset contains a non-private key");
            return null;
        }
        KeyData publicKeyData = Registry.getPublicKeyData(keyData.getTypeUrl(), keyData.getValue());
        validate(publicKeyData);
        return publicKeyData;
    }

    private static Keyset decrypt(EncryptedKeyset encryptedKeyset, Aead aead) throws GeneralSecurityException {
        try {
            Keyset from = Keyset.parseFrom(aead.decrypt(encryptedKeyset.getEncryptedKeyset().toByteArray(), new byte[0]), ExtensionRegistryLite.getEmptyRegistry());
            assertEnoughKeyMaterial(from);
            return from;
        } catch (InvalidProtocolBufferException unused) {
            a.t("invalid keyset, corrupted key material");
            return null;
        }
    }

    private static EncryptedKeyset encrypt(Keyset keyset, Aead aead) throws GeneralSecurityException {
        byte[] bArrEncrypt = aead.encrypt(keyset.toByteArray(), new byte[0]);
        try {
            if (Keyset.parseFrom(aead.decrypt(bArrEncrypt, new byte[0]), ExtensionRegistryLite.getEmptyRegistry()).equals(keyset)) {
                return EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrEncrypt)).setKeysetInfo(Util.getKeysetInfo(keyset)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            a.t("invalid keyset, corrupted key material");
            return null;
        }
    }

    public static final KeysetHandle fromKeyset(Keyset keyset) throws GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        return new KeysetHandle(keyset);
    }

    public static final KeysetHandle generateNew(KeyTemplate keyTemplate) {
        return KeysetManager.withEmptyKeyset().rotate(keyTemplate.getProto()).getKeysetHandle();
    }

    private <B, P> P getPrimitiveWithKnownInputPrimitive(Class<P> cls, Class<B> cls2) {
        return (P) Registry.wrap(Registry.getPrimitives(this, cls2), cls);
    }

    public static final KeysetHandle read(KeysetReader keysetReader, Aead aead) throws GeneralSecurityException {
        EncryptedKeyset encrypted = keysetReader.readEncrypted();
        assertEnoughEncryptedKeyMaterial(encrypted);
        return new KeysetHandle(decrypt(encrypted, aead));
    }

    public static final KeysetHandle readNoSecret(byte[] bArr) throws GeneralSecurityException {
        try {
            Keyset from = Keyset.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry());
            assertNoSecretKeyMaterial(from);
            return fromKeyset(from);
        } catch (InvalidProtocolBufferException unused) {
            a.t("invalid keyset");
            return null;
        }
    }

    private static void validate(KeyData keyData) {
        Registry.getPrimitive(keyData);
    }

    public Keyset getKeyset() {
        return this.keyset;
    }

    public KeysetInfo getKeysetInfo() {
        return Util.getKeysetInfo(this.keyset);
    }

    public <P> P getPrimitive(Class<P> cls) throws GeneralSecurityException {
        Class<?> inputPrimitive = Registry.getInputPrimitive(cls);
        if (inputPrimitive != null) {
            return (P) getPrimitiveWithKnownInputPrimitive(cls, inputPrimitive);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public KeysetHandle getPublicKeysetHandle() throws GeneralSecurityException {
        if (this.keyset == null) {
            a.t("cleartext keyset is not available");
            return null;
        }
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            builderNewBuilder.addKey(Keyset.Key.newBuilder().mergeFrom(key).setKeyData(createPublicKeyData(key.getKeyData())).build());
        }
        builderNewBuilder.setPrimaryKeyId(this.keyset.getPrimaryKeyId());
        return new KeysetHandle(builderNewBuilder.build());
    }

    public String toString() {
        return getKeysetInfo().toString();
    }

    public void write(KeysetWriter keysetWriter, Aead aead) {
        keysetWriter.write(encrypt(this.keyset, aead));
    }

    public void writeNoSecret(KeysetWriter keysetWriter) throws GeneralSecurityException {
        assertNoSecretKeyMaterial(this.keyset);
        keysetWriter.write(this.keyset);
    }

    @Deprecated
    public static final KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        return KeysetManager.withEmptyKeyset().rotate(keyTemplate).getKeysetHandle();
    }

    public static final KeysetHandle readNoSecret(KeysetReader keysetReader) throws GeneralSecurityException {
        try {
            Keyset keyset = keysetReader.read();
            assertNoSecretKeyMaterial(keyset);
            return fromKeyset(keyset);
        } catch (InvalidProtocolBufferException unused) {
            a.t("invalid keyset");
            return null;
        }
    }

    public <P> P getPrimitive(KeyManager<P> keyManager, Class<P> cls) {
        if (keyManager != null) {
            return (P) Registry.wrap(Registry.getPrimitives(this, keyManager, cls));
        }
        h.s("customKeyManager must be non-null.");
        return null;
    }
}
