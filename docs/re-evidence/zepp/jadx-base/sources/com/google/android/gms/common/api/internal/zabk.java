package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zabk extends BroadcastReceiver {

    @Nullable
    private Context a;
    private final zabm b;

    public zabk(zabm zabmVar) {
        this.b = zabmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.zaa();
            zaa();
        }
    }

    public final void zaa(Context context) {
        this.a = context;
    }

    public final synchronized void zaa() {
        Context context = this.a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.a = null;
    }
}
