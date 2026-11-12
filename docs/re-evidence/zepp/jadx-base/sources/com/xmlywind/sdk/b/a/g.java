package com.xmlywind.sdk.b.a;

import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class g extends e {
    private final long a;

    public g(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.a = j;
    }

    @Override // com.xmlywind.sdk.b.a.e
    public boolean a(File file, long j, int i) {
        return j <= this.a;
    }
}
