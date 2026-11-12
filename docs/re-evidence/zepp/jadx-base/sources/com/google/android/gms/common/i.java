package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class i extends h {
    private final byte[] b;

    public i(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // com.google.android.gms.common.h
    public final byte[] e() {
        return this.b;
    }
}
