package com.xiaomi.fitness.sport_manager.utils;

import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt;
import defpackage.f2o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/utils/BeanSportUtils;", "", "<init>", "()V", "modeChanged", "", "getModeChanged", "()Z", "setModeChanged", "(Z)V", "isMainAndBeanSport", "setMainAndBeanSport", "isOnlyMainSport", "setOnlyMainSport", "isOnlyBeanSport", "setOnlyBeanSport", "TAG", "", "getTAG", "()Ljava/lang/String;", "isBeanSport", "isLinkBeanSport", "configBeanSport", "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBeanSportUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeanSportUtils.kt\ncom/xiaomi/fitness/sport_manager/utils/BeanSportUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n774#2:61\n865#2,2:62\n*S KotlinDebug\n*F\n+ 1 BeanSportUtils.kt\ncom/xiaomi/fitness/sport_manager/utils/BeanSportUtils\n*L\n19#1:61\n19#1:62,2\n*E\n"})
public final class BeanSportUtils {

    @NotNull
    public static final BeanSportUtils INSTANCE = new BeanSportUtils();

    @NotNull
    private static final String TAG = "BeanSportUtils";
    private static boolean isMainAndBeanSport;
    private static boolean isOnlyBeanSport;
    private static boolean isOnlyMainSport;
    private static boolean modeChanged;

    private BeanSportUtils() {
    }

    public final void configBeanSport() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean z = wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected();
        if (z && isBeanSport()) {
            isMainAndBeanSport = true;
            isOnlyBeanSport = false;
            isOnlyMainSport = false;
        }
        if (z && !isBeanSport()) {
            isOnlyMainSport = true;
            isOnlyBeanSport = false;
            isMainAndBeanSport = false;
        }
        if (!z && isBeanSport()) {
            isOnlyBeanSport = true;
            isOnlyMainSport = false;
            isMainAndBeanSport = false;
        }
        if (z || isBeanSport()) {
            return;
        }
        isOnlyMainSport = false;
        isOnlyBeanSport = false;
        isMainAndBeanSport = false;
    }

    public final boolean getModeChanged() {
        return modeChanged;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    public final boolean isBeanSport() {
        int iL = f2o.x().L();
        List<WearableDeviceModel> accessoryDeviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : accessoryDeviceModels) {
            if (DeviceModelExtKt.isAccessoryConnected((WearableDeviceModel) obj)) {
                arrayList.add(obj);
            }
        }
        return iL == 1 && (arrayList.isEmpty() ^ true);
    }

    public final boolean isLinkBeanSport() {
        WearableDeviceModel wearableDeviceModel;
        return isBeanSport() && (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) != null && wearableDeviceModel.getIsDeviceConnected();
    }

    public final boolean isMainAndBeanSport() {
        return isMainAndBeanSport;
    }

    public final boolean isOnlyBeanSport() {
        return isOnlyBeanSport;
    }

    public final boolean isOnlyMainSport() {
        return isOnlyMainSport;
    }

    public final void setMainAndBeanSport(boolean z) {
        isMainAndBeanSport = z;
    }

    public final void setModeChanged(boolean z) {
        modeChanged = z;
    }

    public final void setOnlyBeanSport(boolean z) {
        isOnlyBeanSport = z;
    }

    public final void setOnlyMainSport(boolean z) {
        isOnlyMainSport = z;
    }
}
