package com.xiaomi.fit.fitness.impl;

import android.os.RemoteException;
import com.xiaomi.fit.fitness.export.api.HealthConnectApi;
import com.xiaomi.fit.fitness.remote.FitnessDBDataUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/HealthConnectApiImpl;", "Lcom/xiaomi/fit/fitness/export/api/HealthConnectApi;", "<init>", "()V", "startSyncDataToHealthConnect", "", "disconnectHealthConnect", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectApiImpl implements HealthConnectApi {
    @Override // com.xiaomi.fit.fitness.export.api.HealthConnectApi
    public void disconnectHealthConnect() throws RemoteException {
        FitnessDBDataUpdater.INSTANCE.getInstance().disconnectHealthConnect();
    }

    @Override // com.xiaomi.fit.fitness.export.api.HealthConnectApi
    public void startSyncDataToHealthConnect() throws RemoteException {
        FitnessDBDataUpdater.INSTANCE.getInstance().startSyncDataToHealthConnect();
    }
}
