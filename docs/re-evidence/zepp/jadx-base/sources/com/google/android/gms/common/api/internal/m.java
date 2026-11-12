package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.zak;

/* JADX INFO: loaded from: classes3.dex */
final class m implements zak {
    private final /* synthetic */ zaar a;

    public m(zaar zaarVar) {
        this.a = zaarVar;
    }

    @Override // com.google.android.gms.common.internal.zak
    @Nullable
    public final Bundle getConnectionHint() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.zak
    public final boolean isConnected() {
        return this.a.isConnected();
    }
}
