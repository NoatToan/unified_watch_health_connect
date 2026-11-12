package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.x4t;

/* JADX INFO: loaded from: classes5.dex */
final class k extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x4t f8983b;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f8982a.trySetResult(-1);
            this.f8983b.f.a(null);
        } else if (i != 2) {
            this.f8982a.trySetException(new AssetPackException(-100));
        } else {
            this.f8982a.trySetResult(0);
        }
    }
}
