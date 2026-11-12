package com.xiaomi.fitness.sport.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport.model.SendFocusNotification;
import com.xiaomi.fitness.sport.utils.SportPreference;
import defpackage.yon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport/service/SportKeepAliveService;", "Landroid/app/Service;", "", "onCreate", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onUnbind", "(Landroid/content/Intent;)Z", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", LifecycleConstantKt.ON_DESTROY, "Lyon$a;", "binder", "Lyon$a;", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportKeepAliveService extends Service {

    @NotNull
    private static final String TAG = "SportKeepAliveService";

    @NotNull
    private yon.a binder = new yon.a() { // from class: com.xiaomi.fitness.sport.service.SportKeepAliveService$binder$1
        @Override // defpackage.yon
        public void onFinishSport() throws RemoteException {
            FitnessLogUtils.i("SportKeepAliveService", "onFinishSport");
        }

        @Override // defpackage.yon
        public void onPauseSport() throws RemoteException {
            FitnessLogUtils.i("SportKeepAliveService", "onPauseSport");
        }

        @Override // defpackage.yon
        public void onRestartSport() throws RemoteException {
            FitnessLogUtils.i("SportKeepAliveService", "onRestartSport");
        }

        @Override // defpackage.yon
        public void onStartSport() throws RemoteException {
            FitnessLogUtils.i("SportKeepAliveService", "onStartSport");
        }
    };

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        FitnessLogUtils.i(TAG, "onBind");
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        FitnessLogUtils.i(TAG, "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        FitnessLogUtils.i(TAG, LifecycleConstantKt.ON_DESTROY);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(@Nullable Intent rootIntent) {
        FitnessLogUtils.i(TAG, "onTaskRemoved");
        super.onTaskRemoved(rootIntent);
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (sportPreference.getFOCUS_NOTIFY_CANCEL_SPORT_TYPE() != -1) {
            SendFocusNotification.INSTANCE.cancelFocusNotification(sportPreference.getFOCUS_NOTIFY_CANCEL_SPORT_TYPE());
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        FitnessLogUtils.i(TAG, "onUnbind");
        return super.onUnbind(intent);
    }
}
