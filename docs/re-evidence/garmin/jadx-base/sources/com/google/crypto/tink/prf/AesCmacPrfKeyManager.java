package com.google.crypto.tink.prf;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.AesCmacPrfKey;
import com.google.crypto.tink.proto.AesCmacPrfKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.subtle.PrfAesCmac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCmacPrfKeyManager extends KeyTypeManager<AesCmacPrfKey> {
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int VERSION = 0;

    public AesCmacPrfKeyManager() {
        super(AesCmacPrfKey.class, new KeyTypeManager.PrimitiveFactory<Prf, AesCmacPrfKey>(Prf.class) { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Prf getPrimitive(AesCmacPrfKey aesCmacPrfKey) {
                return new PrfAesCmac(aesCmacPrfKey.getKeyValue().toByteArray());
            }
        });
    }

    public static final KeyTemplate aes256CmacTemplate() {
        return KeyTemplate.create(new AesCmacPrfKeyManager().getKeyType(), AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }

    public static void register(boolean z14) {
        Registry.registerKeyManager(new AesCmacPrfKeyManager(), z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateSize(int i14) throws GeneralSecurityException {
        if (i14 == 32) {
            return;
        }
        a.t("AesCmacPrfKey size wrong, must be 32 bytes");
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacPrfKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, AesCmacPrfKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, AesCmacPrfKey>(AesCmacPrfKeyFormat.class) { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesCmacPrfKey createKey(AesCmacPrfKeyFormat aesCmacPrfKeyFormat) {
                return AesCmacPrfKey.newBuilder().setVersion(0).setKeyValue(ByteString.copyFrom(Random.randBytes(aesCmacPrfKeyFormat.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesCmacPrfKeyFormat parseKeyFormat(ByteString byteString) {
                return AesCmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesCmacPrfKeyFormat aesCmacPrfKeyFormat) throws GeneralSecurityException {
                AesCmacPrfKeyManager.validateSize(aesCmacPrfKeyFormat.getKeySize());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public AesCmacPrfKey parseKey(ByteString byteString) {
        return AesCmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesCmacPrfKey aesCmacPrfKey) throws GeneralSecurityException {
        Validators.validateVersion(aesCmacPrfKey.getVersion(), getVersion());
        validateSize(aesCmacPrfKey.getKeyValue().size());
    }
}
