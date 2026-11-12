package com.xiaomi.fitness.eco.device.manager.export;

import com.xiaomi.fitness.device.manager.BaseProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager;", "Lcom/xiaomi/fitness/device/manager/BaseProductManager;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "<init>", "()V", "getDeviceInfoList", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "Companion", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EcoProductManager extends BaseProductManager<EcoProduct> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager$Companion;", "", "<init>", "()V", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public abstract List<EcoAddDeviceInfo> getDeviceInfoList();
}
