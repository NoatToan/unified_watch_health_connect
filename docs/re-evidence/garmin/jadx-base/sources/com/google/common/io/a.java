package com.google.common.io;

import java.io.Closeable;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Closer.Suppressor {
    @Override // com.google.common.io.Closer.Suppressor
    public final void suppress(Closeable closeable, Throwable th3, Throwable th4) {
        Closer.lambda$static$0(closeable, th3, th4);
    }
}
