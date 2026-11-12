package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes3.dex */
class e implements f {
    public final TaskCompletionSource<String> a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.f
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.f
    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.a.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
