package io.sentry.android.core;

import android.os.Debug;
import defpackage.lpf;
import defpackage.sqh;
import defpackage.vvc;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class v implements vvc {
    @Override // defpackage.vvc
    public void c() {
    }

    @Override // defpackage.vvc
    public void d(@NotNull sqh sqhVar) {
        sqhVar.b(new lpf(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize()));
    }
}
