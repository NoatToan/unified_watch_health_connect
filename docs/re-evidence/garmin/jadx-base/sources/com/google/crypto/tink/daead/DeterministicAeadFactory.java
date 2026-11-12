package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Registry;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class DeterministicAeadFactory {
    @Deprecated
    public static DeterministicAead getPrimitive(KeysetHandle keysetHandle, KeyManager<DeterministicAead> keyManager) {
        Registry.registerPrimitiveWrapper(new DeterministicAeadWrapper());
        return (DeterministicAead) Registry.wrap(Registry.getPrimitives(keysetHandle, keyManager, DeterministicAead.class));
    }

    @Deprecated
    public static DeterministicAead getPrimitive(KeysetHandle keysetHandle) {
        return getPrimitive(keysetHandle, null);
    }
}
