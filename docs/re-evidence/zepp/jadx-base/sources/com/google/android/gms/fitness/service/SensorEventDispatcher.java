package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SensorEventDispatcher {
    void publish(@RecentlyNonNull DataPoint dataPoint) throws RemoteException;

    void publish(@RecentlyNonNull List<DataPoint> list) throws RemoteException;
}
