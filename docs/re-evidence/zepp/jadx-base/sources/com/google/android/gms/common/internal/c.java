package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes3.dex */
final class c extends zab {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ LifecycleFragment b;
    private final /* synthetic */ int c = 2;

    public c(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.a = intent;
        this.b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zab
    public final void zaa() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
