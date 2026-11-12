package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class n extends o {
    private final Callable<String> e;

    public /* synthetic */ n(Callable callable, zzu zzuVar) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // com.google.android.gms.common.o
    public final String a() {
        try {
            return this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
