package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Registry;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class HybridEncryptFactory {
    @Deprecated
    public static HybridEncrypt getPrimitive(KeysetHandle keysetHandle, KeyManager<HybridEncrypt> keyManager) {
        Registry.registerPrimitiveWrapper(new HybridEncryptWrapper());
        return (HybridEncrypt) Registry.wrap(Registry.getPrimitives(keysetHandle, keyManager, HybridEncrypt.class));
    }

    @Deprecated
    public static HybridEncrypt getPrimitive(KeysetHandle keysetHandle) {
        return getPrimitive(keysetHandle, null);
    }
}
