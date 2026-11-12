package com.xiaomi.fitness.eco.device.manager.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.device.manager.BaseDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import defpackage.hbk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0003H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "Lcom/xiaomi/fitness/device/manager/BaseDeviceManager;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "did", "", "connectLocalDevice", "(Ljava/lang/String;)V", "ecoFetchDeviceList", "()V", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "getDeviceList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStatusListener", "(Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;)V", "removeDeviceStatusListener", "model", "getLocalDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getUniqueIdentify", "()Ljava/lang/String;", "", "getEcoDeviceSize", "()I", "Lhbk;", "callback", "refreshEcoList", "(Lhbk;)V", "<init>", "Companion", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public abstract class EcoDeviceManager extends BaseDeviceManager<EcoDeviceModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager$Companion;", "", "<init>", "()V", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract void addDeviceStatusListener(@NotNull OnEcoDeviceStatusListener listener);

    public abstract void connectLocalDevice(@NotNull String did);

    public abstract void ecoFetchDeviceList();

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    @NotNull
    public abstract List<EcoDevice> getDeviceList();

    public abstract int getEcoDeviceSize();

    @Nullable
    public abstract EcoDeviceModel getLocalDeviceModel(@NotNull String model);

    @NotNull
    public abstract String getUniqueIdentify();

    public abstract void refreshEcoList(@NotNull hbk callback);

    public abstract void removeDeviceStatusListener(@NotNull OnEcoDeviceStatusListener listener);
}
