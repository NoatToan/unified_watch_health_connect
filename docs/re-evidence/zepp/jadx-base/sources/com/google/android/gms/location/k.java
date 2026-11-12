package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class k extends LocationCallback {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ FusedLocationProviderClient b;

    public k(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.b = fusedLocationProviderClient;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.a.trySetResult(locationResult.getLastLocation());
        this.b.removeLocationUpdates(this);
    }
}
