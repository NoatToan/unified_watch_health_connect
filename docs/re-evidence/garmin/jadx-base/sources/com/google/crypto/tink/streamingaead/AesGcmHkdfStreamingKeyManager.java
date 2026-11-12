package com.google.crypto.tink.streamingaead;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKey;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.subtle.AesGcmHkdfStreaming;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class AesGcmHkdfStreamingKeyManager extends KeyTypeManager<AesGcmHkdfStreamingKey> {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int TAG_SIZE_IN_BYTES = 16;

    public AesGcmHkdfStreamingKeyManager() {
        super(AesGcmHkdfStreamingKey.class, new KeyTypeManager.PrimitiveFactory<StreamingAead, AesGcmHkdfStreamingKey>(StreamingAead.class) { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public StreamingAead getPrimitive(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) {
                return new AesGcmHkdfStreaming(aesGcmHkdfStreamingKey.getKeyValue().toByteArray(), StreamingAeadUtil.toHmacAlgo(aesGcmHkdfStreamingKey.getParams().getHkdfHashType()), aesGcmHkdfStreamingKey.getParams().getDerivedKeySize(), aesGcmHkdfStreamingKey.getParams().getCiphertextSegmentSize(), 0);
            }
        });
    }

    public static final KeyTemplate aes128GcmHkdf1MBTemplate() {
        return createKeyTemplate(16, HashType.SHA256, 16, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static final KeyTemplate aes128GcmHkdf4KBTemplate() {
        return createKeyTemplate(16, HashType.SHA256, 16, 4096);
    }

    public static final KeyTemplate aes256GcmHkdf1MBTemplate() {
        return createKeyTemplate(32, HashType.SHA256, 32, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static final KeyTemplate aes256GcmHkdf4KBTemplate() {
        return createKeyTemplate(32, HashType.SHA256, 32, 4096);
    }

    private static KeyTemplate createKeyTemplate(int i14, HashType hashType, int i15, int i16) {
        return KeyTemplate.create(new AesGcmHkdfStreamingKeyManager().getKeyType(), AesGcmHkdfStreamingKeyFormat.newBuilder().setKeySize(i14).setParams(AesGcmHkdfStreamingParams.newBuilder().setCiphertextSegmentSize(i16).setDerivedKeySize(i15).setHkdfHashType(hashType).build()).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z14) {
        Registry.registerKeyManager(new AesGcmHkdfStreamingKeyManager(), z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateParams(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) throws GeneralSecurityException {
        Validators.validateAesKeySize(aesGcmHkdfStreamingParams.getDerivedKeySize());
        if (aesGcmHkdfStreamingParams.getHkdfHashType() == HashType.UNKNOWN_HASH) {
            a.t("unknown HKDF hash type");
        } else {
            if (aesGcmHkdfStreamingParams.getCiphertextSegmentSize() >= aesGcmHkdfStreamingParams.getDerivedKeySize() + 25) {
                return;
            }
            a.t("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesGcmHkdfStreamingKeyFormat, AesGcmHkdfStreamingKey>(AesGcmHkdfStreamingKeyFormat.class) { // from class: com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmHkdfStreamingKey createKey(AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat) {
                return AesGcmHkdfStreamingKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(aesGcmHkdfStreamingKeyFormat.getKeySize()))).setParams(aesGcmHkdfStreamingKeyFormat.getParams()).setVersion(AesGcmHkdfStreamingKeyManager.this.getVersion()).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmHkdfStreamingKey deriveKey(AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat, InputStream inputStream) throws GeneralSecurityException {
                Validators.validateVersion(aesGcmHkdfStreamingKeyFormat.getVersion(), AesGcmHkdfStreamingKeyManager.this.getVersion());
                byte[] bArr = new byte[aesGcmHkdfStreamingKeyFormat.getKeySize()];
                try {
                    if (inputStream.read(bArr) == aesGcmHkdfStreamingKeyFormat.getKeySize()) {
                        return AesGcmHkdfStreamingKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setParams(aesGcmHkdfStreamingKeyFormat.getParams()).setVersion(AesGcmHkdfStreamingKeyManager.this.getVersion()).build();
                    }
                    throw new GeneralSecurityException("Not enough pseudorandomness given");
                } catch (IOException e4) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", e4);
                }
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmHkdfStreamingKeyFormat parseKeyFormat(ByteString byteString) {
                return AesGcmHkdfStreamingKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat) throws GeneralSecurityException {
                if (aesGcmHkdfStreamingKeyFormat.getKeySize() >= 16) {
                    AesGcmHkdfStreamingKeyManager.validateParams(aesGcmHkdfStreamingKeyFormat.getParams());
                } else {
                    a.t("key_size must be at least 16 bytes");
                }
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public AesGcmHkdfStreamingKey parseKey(ByteString byteString) {
        return AesGcmHkdfStreamingKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesGcmHkdfStreamingKey aesGcmHkdfStreamingKey) throws GeneralSecurityException {
        Validators.validateVersion(aesGcmHkdfStreamingKey.getVersion(), getVersion());
        validateParams(aesGcmHkdfStreamingKey.getParams());
    }
}
