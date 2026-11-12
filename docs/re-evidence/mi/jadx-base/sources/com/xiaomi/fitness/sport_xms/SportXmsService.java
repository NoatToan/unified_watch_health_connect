package com.xiaomi.fitness.sport_xms;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/SportXmsService;", "Landroid/app/Service;", "<init>", "()V", "sportXmsApiImpl", "Lcom/xiaomi/fitness/sport_xms/SportXmsApiImpl;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onUnbind", "", LifecycleConstantKt.ON_DESTROY, "abnormalFinishSport", "Companion", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportXmsService extends Service {

    @NotNull
    public static final String TAG = "SportXmsService";

    @Nullable
    private SportXmsApiImpl sportXmsApiImpl;

    private final void abnormalFinishSport() {
        Logger.i(TAG, "abnormalFinishSport");
        FinishSportData finishSportData = new FinishSportData();
        finishSportData.setSportType(810);
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sportManagerExtKt.finishSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, finishSportData, new RequestCallback() { // from class: com.xiaomi.fitness.sport_xms.SportXmsService.abnormalFinishSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        Logger.i(TAG, "onBind");
        SportXmsApiImpl sportXmsApiImpl = new SportXmsApiImpl();
        this.sportXmsApiImpl = sportXmsApiImpl;
        Intrinsics.checkNotNull(sportXmsApiImpl);
        return sportXmsApiImpl;
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger.i(TAG, "onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.i(TAG, LifecycleConstantKt.ON_DESTROY);
        SportXmsApiImpl sportXmsApiImpl = this.sportXmsApiImpl;
        if (sportXmsApiImpl != null && sportXmsApiImpl.aidongIsSporting()) {
            abnormalFinishSport();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        Logger.i(TAG, "onUnbind");
        return super.onUnbind(intent);
    }
}
