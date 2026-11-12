package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public final class zzdl extends IOException {
    public zzdl(String str, Throwable th3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th3);
    }

    public zzdl() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzdl(Throwable th3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th3);
    }
}
