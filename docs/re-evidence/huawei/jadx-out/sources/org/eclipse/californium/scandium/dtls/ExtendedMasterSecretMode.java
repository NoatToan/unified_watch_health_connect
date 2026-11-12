package org.eclipse.californium.scandium.dtls;

/* JADX INFO: loaded from: classes20.dex */
public enum ExtendedMasterSecretMode {
    NONE,
    OPTIONAL,
    ENABLED,
    REQUIRED;

    public boolean is(ExtendedMasterSecretMode extendedMasterSecretMode) {
        return ordinal() >= extendedMasterSecretMode.ordinal();
    }
}
