package com.google.android.gms.internal.measurement;

import ds.e0;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class zzll extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(long j8, long j14, int i14, Throwable th3) {
        Locale locale = Locale.US;
        StringBuilder sbK = e0.k(j8, "Pos: ", ", limit: ");
        sbK.append(j14);
        sbK.append(", len: ");
        sbK.append(i14);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbK.toString()), th3);
    }

    public zzll() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzll(Throwable th3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th3);
    }
}
