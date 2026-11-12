package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzv;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b implements SensorEventDispatcher {
    private final zzv a;

    public b(zzv zzvVar) {
        this.a = (zzv) Preconditions.checkNotNull(zzvVar);
    }

    @Override // com.google.android.gms.fitness.service.SensorEventDispatcher
    public final void publish(DataPoint dataPoint) throws RemoteException {
        dataPoint.zzh();
        this.a.zzc(dataPoint);
    }

    @Override // com.google.android.gms.fitness.service.SensorEventDispatcher
    public final void publish(List<DataPoint> list) throws RemoteException {
        Iterator<DataPoint> it2 = list.iterator();
        while (it2.hasNext()) {
            publish(it2.next());
        }
    }
}
