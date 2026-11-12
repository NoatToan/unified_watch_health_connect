package com.google.android.gms.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.zzan;
import com.google.android.gms.internal.fitness.zzap;
import com.google.android.gms.internal.fitness.zzby;
import com.google.android.gms.internal.fitness.zzei;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class m implements RemoteCall<zzap, TaskCompletionSource<Void>> {
    private final /* synthetic */ ListenerHolder a;
    private final /* synthetic */ SensorRequest b;

    public m(SensorsClient sensorsClient, ListenerHolder listenerHolder, SensorRequest sensorRequest) {
        this.a = listenerHolder;
        this.b = sensorRequest;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(zzap zzapVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        ((zzby) zzapVar.getService()).zza(new com.google.android.gms.fitness.request.zzap(this.b, zzan.zzx().zzc(this.a), null, zzei.zza(taskCompletionSource)));
    }
}
