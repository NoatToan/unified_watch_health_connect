package com.xiaomi.fitness.sport_eco.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.hy7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/service/SportKeepAliveService;", "Landroid/app/Service;", "", "onCreate", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onUnbind", "(Landroid/content/Intent;)Z", LifecycleConstantKt.ON_DESTROY, "Lhy7$a;", "binder", "Lhy7$a;", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportKeepAliveService extends Service {

    @NotNull
    private static final String TAG = "EcoSportKeepAliveService";

    @NotNull
    private hy7.a binder = new hy7.a() { // from class: com.xiaomi.fitness.sport_eco.service.SportKeepAliveService$binder$1
        @Override // defpackage.hy7
        public void onFinishSport() throws RemoteException {
            FitnessLogUtils.d("EcoSportKeepAliveService", "onFinishSport");
        }

        @Override // defpackage.hy7
        public void onPauseSport() throws RemoteException {
            FitnessLogUtils.d("EcoSportKeepAliveService", "onPauseSport");
        }

        @Override // defpackage.hy7
        public void onRestartSport() throws RemoteException {
            FitnessLogUtils.d("EcoSportKeepAliveService", "onRestartSport");
        }

        @Override // defpackage.hy7
        public void onStartSport() throws RemoteException {
            FitnessLogUtils.d("EcoSportKeepAliveService", "onStartSport");
        }
    };

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        FitnessLogUtils.d(TAG, "onBind");
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        FitnessLogUtils.d(TAG, "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        FitnessLogUtils.d(TAG, LifecycleConstantKt.ON_DESTROY);
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        FitnessLogUtils.d(TAG, "onUnbind");
        return super.onUnbind(intent);
    }
}
