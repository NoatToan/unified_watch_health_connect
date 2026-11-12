package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Callable<String> {
    public final /* synthetic */ FirebaseAnalytics a;

    public b(FirebaseAnalytics firebaseAnalytics) {
        this.a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        return this.a.a.zzk();
    }
}
