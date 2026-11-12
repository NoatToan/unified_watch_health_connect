package com.xiaomi.fitness.sport_xms;

import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener;
import com.xiaomi.fitness.sport_xms.SportXmsApiImpl$iSportSensorDataChangedListener$1;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import defpackage.lxc;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/sport_xms/SportXmsApiImpl$iSportSensorDataChangedListener$1", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSensorDataChangedListener;", "onReceiveWearSensorData", "", "wearSensorData", "Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportXmsApiImpl$iSportSensorDataChangedListener$1 implements ISportSensorDataChangedListener {
    final /* synthetic */ SportXmsApiImpl this$0;

    public SportXmsApiImpl$iSportSensorDataChangedListener$1(SportXmsApiImpl sportXmsApiImpl) {
        this.this$0 = sportXmsApiImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceiveWearSensorData$lambda$0(SportXmsApiImpl this$0, WearSensorData wearSensorData) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        lxc lxcVar = this$0.sensorListener;
        if (lxcVar != null) {
            lxcVar.onSportXmsSensorDataChanged(wearSensorData);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener
    public void onReceiveWearSensorData(final WearSensorData wearSensorData) {
        FitnessLogUtils.d("SportXmsApiImpl", "wearSensorData : " + wearSensorData);
        Executor executor = this.this$0.executor;
        final SportXmsApiImpl sportXmsApiImpl = this.this$0;
        executor.execute(new Runnable() { // from class: n6o
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                SportXmsApiImpl$iSportSensorDataChangedListener$1.onReceiveWearSensorData$lambda$0(sportXmsApiImpl, wearSensorData);
            }
        });
    }
}
