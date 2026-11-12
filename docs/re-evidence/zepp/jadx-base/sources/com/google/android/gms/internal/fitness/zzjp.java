package com.google.android.gms.internal.fitness;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjp extends RuntimeException {
    private final List<String> a;

    public zzjp(zzik zzikVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }
}
