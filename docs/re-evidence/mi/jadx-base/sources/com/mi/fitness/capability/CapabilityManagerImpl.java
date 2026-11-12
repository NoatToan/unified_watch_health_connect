package com.mi.fitness.capability;

import com.mi.fitness.alexa.export.AlexaExportUtilKt;
import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingCapabilityConstants;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/mi/fitness/capability/CapabilityManagerImpl;", "Lcom/mi/fitness/capability/export/CapabilityManager;", "<init>", "()V", "mCapabilityModels", "", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "getMCapabilityModels", "()Ljava/util/Set;", "setMCapabilityModels", "(Ljava/util/Set;)V", "getCapabilities", "isSupportAlexa", "isSupportRecorderSync", "getCapabilitiesInt", "", "capability_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCapabilityManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapabilityManagerImpl.kt\ncom/mi/fitness/capability/CapabilityManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1863#2,2:63\n*S KotlinDebug\n*F\n+ 1 CapabilityManagerImpl.kt\ncom/mi/fitness/capability/CapabilityManagerImpl\n*L\n43#1:63,2\n*E\n"})
public final class CapabilityManagerImpl implements CapabilityManager {
    public Set<CapabilityModel> mCapabilityModels;

    private final CapabilityModel isSupportRecorderSync() {
        return DeviceSettingCapabilityConstants.INSTANCE.isSupportRecorderSync() ? new CapabilityModel(262144) : new CapabilityModel(0);
    }

    @Override // com.mi.fitness.capability.export.CapabilityManager
    @NotNull
    public Set<CapabilityModel> getCapabilities() {
        return getMCapabilityModels();
    }

    @Override // com.mi.fitness.capability.export.CapabilityManager
    public int getCapabilitiesInt() {
        Iterator<T> it = getMCapabilityModels().iterator();
        int capability = 0;
        while (it.hasNext()) {
            capability |= ((CapabilityModel) it.next()).getCapability();
        }
        int capability2 = isSupportAlexa().getCapability() | capability | NotifyHelperExtKt.getNotificationManagerExport().isSupportSendPhoneNotification().getCapability() | isSupportRecorderSync().getCapability();
        StringBuilder sb = new StringBuilder();
        sb.append("capabilities ");
        sb.append(capability2);
        return capability2;
    }

    @NotNull
    public final Set<CapabilityModel> getMCapabilityModels() {
        Set<CapabilityModel> set = this.mCapabilityModels;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCapabilityModels");
        return null;
    }

    @Override // com.mi.fitness.capability.export.CapabilityManager
    @NotNull
    public CapabilityModel isSupportAlexa() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        int i = 0;
        if (wearableDeviceModel != null && AlexaExportUtilKt.isSupportAlexa(wearableDeviceModel)) {
            i = 1;
        }
        return new CapabilityModel(i);
    }

    public final void setMCapabilityModels(@NotNull Set<CapabilityModel> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.mCapabilityModels = set;
    }
}
