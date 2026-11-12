package com.xiaomi.fitness.research;

import com.mi.command.receive.ResearchHandlerImpl;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.research.ResearchComponent;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/research/ResearchComponent;", "", "<init>", "()V", "deviceSync", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getDeviceSync", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "deviceSync$delegate", "Lkotlin/Lazy;", "researchDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "addDataHandler", "", "addDataReceiverHandler", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = ResearchComponent.TAG)
public final class ResearchComponent {

    @NotNull
    public static final String TAG = "ResearchComponent";

    /* JADX INFO: renamed from: deviceSync$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSync = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lpk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ResearchComponent.deviceSync_delegate$lambda$0();
        }
    });

    @NotNull
    private final DataHandlerWrapper researchDataHandler = new ResearchHandlerImpl();

    private final void addDataReceiverHandler() {
        FitnessLogUtils.i(TAG, "addDataReceiverHandler");
        getDeviceSync().addDataHandler(8, this.researchDataHandler);
        getDeviceSync().addDataHandler(113, this.researchDataHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceContact deviceSync_delegate$lambda$0() {
        return DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
    }

    private final DeviceContact getDeviceSync() {
        return (DeviceContact) this.deviceSync.getValue();
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void addDataHandler() {
        FitnessLogUtils.i("research-sync", "addDataHandler");
        addDataReceiverHandler();
    }
}
