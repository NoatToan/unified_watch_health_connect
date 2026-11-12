package com.google.android.gms.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.zzad;
import com.google.android.gms.fitness.request.zze;
import com.google.android.gms.internal.fitness.zzbo;
import com.google.android.gms.internal.fitness.zzcn;
import com.google.android.gms.internal.fitness.zzei;
import com.google.android.gms.internal.fitness.zzk;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b implements RemoteCall<zzk, TaskCompletionSource<Void>> {
    private final /* synthetic */ ListenerHolder a;
    private final /* synthetic */ List b;
    private final /* synthetic */ int c;

    public b(BleClient bleClient, ListenerHolder listenerHolder, List list, int i) {
        this.a = listenerHolder;
        this.b = list;
        this.c = i;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(zzk zzkVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        ((zzbo) zzkVar.getService()).zza(new StartBleScanRequest((List<DataType>) this.b, (zzad) zze.zzu().zza(this.a), this.c, (zzcn) zzei.zza(taskCompletionSource)));
    }
}
