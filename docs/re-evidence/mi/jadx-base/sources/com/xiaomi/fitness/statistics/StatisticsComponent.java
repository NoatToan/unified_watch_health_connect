package com.xiaomi.fitness.statistics;

import android.app.Application;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.statistics.bigdata.DeviceLogDataHandler;
import com.xiaomi.fitness.statistics.page.ActivityPageLifecycleCallback;
import com.xiaomi.onetrack.c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/statistics/StatisticsComponent;", "", "<init>", "()V", "initOnetrack", "", "app", "Landroid/app/Application;", "initDeviceLogData", "initAutoPageTrack", "Companion", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = c.a.f13834a)
public final class StatisticsComponent {

    @NotNull
    private static final String TAG = "StatisticsComponent";

    @ComponentTask(notLaterThan = 4)
    public final void initAutoPageTrack(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Logger.i(TAG, "initAutoPageTrack");
        app.registerActivityLifecycleCallbacks(new ActivityPageLifecycleCallback());
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 2)
    public final void initDeviceLogData(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Logger.i(TAG, "initDeviceLogData() called with: app = " + app + " application.isMainProcess:" + ApplicationExtKt.isMainProcess(ApplicationExtKt.getApplication()));
        final DeviceLogDataHandler deviceLogDataHandler = new DeviceLogDataHandler();
        ServiceConnector.addServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), new ServiceConnection() { // from class: com.xiaomi.fitness.statistics.StatisticsComponent.initDeviceLogData.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                Logger.i(StatisticsComponent.TAG, "onServiceConnected() called with: name = " + name + ", service = " + service);
                DeviceContact.Companion companion = DeviceContact.INSTANCE;
                DeviceSyncExtKt.getInstance(companion).addDataHandler(103, deviceLogDataHandler);
                DeviceSyncExtKt.getInstance(companion).addDataHandler(104, deviceLogDataHandler);
                DeviceSyncExtKt.getInstance(companion).addDataHandler(2, deviceLogDataHandler);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
            }
        }, 0, 2, null);
    }

    @ComponentTask(multiProcess = true, notEarlierThan = 4, notLaterThan = 4)
    public final void initOnetrack(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).init();
    }
}
