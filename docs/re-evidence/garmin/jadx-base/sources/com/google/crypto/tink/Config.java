package com.google.crypto.tink;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.proto.KeyTypeEntry;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class Config {
    public static KeyTypeEntry getTinkKeyTypeEntry(String str, String str2, String str3, int i14, boolean z14) {
        return KeyTypeEntry.newBuilder().setPrimitiveName(str2).setTypeUrl("type.googleapis.com/google.crypto.tink." + str3).setKeyManagerVersion(i14).setNewKeyAllowed(z14).setCatalogueName(str).build();
    }

    public static void register(RegistryConfig registryConfig) throws GeneralSecurityException {
        Iterator<KeyTypeEntry> it = registryConfig.getEntryList().iterator();
        while (it.hasNext()) {
            registerKeyType(it.next());
        }
    }

    public static void registerKeyType(KeyTypeEntry keyTypeEntry) throws GeneralSecurityException {
        validate(keyTypeEntry);
        if (keyTypeEntry.getCatalogueName().equals("TinkAead") || keyTypeEntry.getCatalogueName().equals("TinkMac") || keyTypeEntry.getCatalogueName().equals("TinkHybridDecrypt") || keyTypeEntry.getCatalogueName().equals("TinkHybridEncrypt") || keyTypeEntry.getCatalogueName().equals("TinkPublicKeySign") || keyTypeEntry.getCatalogueName().equals("TinkPublicKeyVerify") || keyTypeEntry.getCatalogueName().equals("TinkStreamingAead") || keyTypeEntry.getCatalogueName().equals("TinkDeterministicAead")) {
            return;
        }
        Catalogue<?> catalogue = Registry.getCatalogue(keyTypeEntry.getCatalogueName());
        Registry.registerPrimitiveWrapper(catalogue.getPrimitiveWrapper());
        Registry.registerKeyManager(catalogue.getKeyManager(keyTypeEntry.getTypeUrl(), keyTypeEntry.getPrimitiveName(), keyTypeEntry.getKeyManagerVersion()), keyTypeEntry.getNewKeyAllowed());
    }

    private static void validate(KeyTypeEntry keyTypeEntry) throws GeneralSecurityException {
        if (keyTypeEntry.getTypeUrl().isEmpty()) {
            a.t("Missing type_url.");
        } else if (keyTypeEntry.getPrimitiveName().isEmpty()) {
            a.t("Missing primitive_name.");
        } else if (keyTypeEntry.getCatalogueName().isEmpty()) {
            a.t("Missing catalogue_name.");
        }
    }
}
