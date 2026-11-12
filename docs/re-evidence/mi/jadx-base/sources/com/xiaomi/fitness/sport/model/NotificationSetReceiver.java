package com.xiaomi.fitness.sport.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/model/NotificationSetReceiver;", "Landroid/content/BroadcastReceiver;", "type", "", "<init>", "(I)V", DailyRecordKey.sportType, "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationSetReceiver extends BroadcastReceiver {
    private final int sportType;

    public NotificationSetReceiver(int i) {
        this.sportType = i;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
        int sportState = SportManagerExtKt.getInstance(companion).getSportState();
        Logger.i("NotificationSetReceiver", " intent action " + intent.getAction() + "  currentSportState " + sportState);
        if (sportState != 1) {
            if (sportState == 2) {
                ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(companion);
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                sportManagerExtKt.resumeSport(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport.model.NotificationSetReceiver.onReceive.2
                    @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                    public void call(int responseCode) {
                    }
                });
                return;
            } else if (sportState != 3) {
                return;
            }
        }
        ISportRemoteState sportManagerExtKt2 = SportManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        sportManagerExtKt2.pauseSport(wearableDeviceModel2 != null ? wearableDeviceModel2.getDid() : null, this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport.model.NotificationSetReceiver.onReceive.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
            }
        });
    }
}
