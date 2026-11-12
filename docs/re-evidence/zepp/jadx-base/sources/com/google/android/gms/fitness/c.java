package com.google.android.gms.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fitness.request.zza;
import com.google.android.gms.fitness.request.zzad;
import com.google.android.gms.fitness.request.zzbg;
import com.google.android.gms.fitness.request.zze;
import com.google.android.gms.internal.fitness.zzbo;
import com.google.android.gms.internal.fitness.zzcn;
import com.google.android.gms.internal.fitness.zzei;
import com.google.android.gms.internal.fitness.zzk;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class c implements RemoteCall<zzk, TaskCompletionSource<Boolean>> {
    private final /* synthetic */ ListenerHolder a;

    public c(BleClient bleClient, ListenerHolder listenerHolder) {
        this.a = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(zzk zzkVar, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        zzk zzkVar2 = zzkVar;
        TaskCompletionSource<Boolean> taskCompletionSource2 = taskCompletionSource;
        zza zzaVarZzb = zze.zzu().zzb(this.a);
        if (zzaVarZzb == null) {
            taskCompletionSource2.setResult(Boolean.FALSE);
        } else {
            ((zzbo) zzkVar2.getService()).zza(new zzbg((zzad) zzaVarZzb, (zzcn) zzei.zzb(taskCompletionSource2)));
        }
    }
}
