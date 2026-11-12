package com.xiaomi.fitness.eco.device.manager;

import android.app.Application;
import com.xiaomi.fitness.component.AppComponentDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerComponent_AppComponent;", "Lcom/xiaomi/fitness/component/AppComponentDelegate;", "Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerComponent;", "<init>", "()V", "createAppComponent", "performTask", "", "appContext", "", "taskId", "", "callTask", "methodName", "", "inputData", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceManagerComponent_AppComponent extends AppComponentDelegate<EcoDeviceManagerComponent> {
    @Override // com.xiaomi.fitness.component.AppComponentDelegate
    @NotNull
    public final Object callTask(@NotNull Object appContext, @NotNull String methodName, @Nullable Object inputData) throws Exception {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        throw new IllegalArgumentException("EcoDeviceManagerComponent:" + methodName);
    }

    @Override // com.xiaomi.fitness.component.AppComponentDelegate
    public final void performTask(@NotNull Object appContext, int taskId) throws Exception {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        if (taskId == 14) {
            getSingleton().requestDeviceWhenMainCreated();
            return;
        }
        if (taskId == 19) {
            getSingleton().loadDeviceCache();
            return;
        }
        if (taskId == 20) {
            getSingleton().requestDeviceWhenMainResume();
            return;
        }
        switch (taskId) {
            case 10:
                getSingleton().startConnectProcess((Application) appContext);
                return;
            case 11:
                getSingleton().initConnect((Application) appContext);
                return;
            case 12:
                getSingleton().updateDevices();
                return;
            default:
                throw new IllegalArgumentException("EcoDeviceManagerComponent:" + taskId);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.component.AppComponentDelegate
    @NotNull
    public final EcoDeviceManagerComponent createAppComponent() {
        return new EcoDeviceManagerComponent();
    }
}
