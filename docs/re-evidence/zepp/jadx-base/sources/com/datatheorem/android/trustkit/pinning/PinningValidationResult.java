package com.datatheorem.android.trustkit.pinning;

/* JADX INFO: loaded from: classes2.dex */
public enum PinningValidationResult {
    SUCCESS,
    FAILED,
    FAILED_CERTIFICATE_CHAIN_NOT_TRUSTED,
    ERROR_INVALID_PARAMETERS,
    FAILED_USER_DEFINED_TRUST_ANCHOR,
    ERROR_COULD_NOT_GENERATE_SPKI_HASH
}
