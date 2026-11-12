package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fitness.data.zzv;
import com.google.android.gms.fitness.request.zzam;
import com.google.android.gms.fitness.request.zzan;
import com.google.android.gms.fitness.request.zzar;
import com.google.android.gms.internal.fitness.zzap;
import com.google.android.gms.internal.fitness.zzby;
import com.google.android.gms.internal.fitness.zzcn;
import com.google.android.gms.internal.fitness.zzei;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class n implements RemoteCall<zzap, TaskCompletionSource<Boolean>> {
    private final /* synthetic */ ListenerHolder a;

    public n(SensorsClient sensorsClient, ListenerHolder listenerHolder) {
        this.a = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(zzap zzapVar, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        zzap zzapVar2 = zzapVar;
        TaskCompletionSource<Boolean> taskCompletionSource2 = taskCompletionSource;
        zzam zzamVarZzd = zzan.zzx().zzd(this.a);
        if (zzamVarZzd == null) {
            taskCompletionSource2.setResult(Boolean.FALSE);
        } else {
            ((zzby) zzapVar2.getService()).zza(new zzar((zzv) zzamVarZzd, (PendingIntent) null, (zzcn) zzei.zzb(taskCompletionSource2)));
        }
    }
}
