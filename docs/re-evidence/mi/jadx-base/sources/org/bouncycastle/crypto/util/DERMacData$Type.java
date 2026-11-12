package org.bouncycastle.crypto.util;

import defpackage.olo;

/* JADX INFO: loaded from: classes3.dex */
public enum DERMacData$Type {
    UNILATERALU("KC_1_U"),
    UNILATERALV("KC_1_V"),
    BILATERALU("KC_2_U"),
    BILATERALV("KC_2_V");

    private final String enc;

    DERMacData$Type(String str) {
        this.enc = str;
    }

    public byte[] getHeader() {
        return olo.e(this.enc);
    }
}
