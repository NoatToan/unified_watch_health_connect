package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: loaded from: classes3.dex */
class d implements f {
    private final Utils a;
    private final TaskCompletionSource<InstallationTokenResult> b;

    public d(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.a = utils;
        this.b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.f
    public boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.f
    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.a.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.b.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
