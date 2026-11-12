package com.google.crypto.tink;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class CleartextKeysetHandle {
    public static KeysetHandle fromKeyset(Keyset keyset) {
        return KeysetHandle.fromKeyset(keyset);
    }

    public static Keyset getKeyset(KeysetHandle keysetHandle) {
        return keysetHandle.getKeyset();
    }

    @Deprecated
    public static final KeysetHandle parseFrom(byte[] bArr) throws GeneralSecurityException {
        try {
            return KeysetHandle.fromKeyset(Keyset.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry()));
        } catch (InvalidProtocolBufferException unused) {
            a.t("invalid keyset");
            return null;
        }
    }

    public static KeysetHandle read(KeysetReader keysetReader) {
        return KeysetHandle.fromKeyset(keysetReader.read());
    }

    public static void write(KeysetHandle keysetHandle, KeysetWriter keysetWriter) {
        keysetWriter.write(keysetHandle.getKeyset());
    }
}
