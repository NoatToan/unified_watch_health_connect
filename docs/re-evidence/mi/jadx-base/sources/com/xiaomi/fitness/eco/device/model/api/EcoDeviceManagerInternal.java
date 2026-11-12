package com.xiaomi.fitness.eco.device.model.api;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.ms7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u0000 22\u00020\u0001:\u00012J]\u0010\u000b\u001a\u00020\u00052.\b\u0002\u0010\u0007\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u0001`\u00062\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002j\u0004\u0018\u0001`\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001bH&¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001bH&¢\u0006\u0004\b%\u0010#J\u001f\u0010'\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001bH&¢\u0006\u0004\b'\u0010#J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*R\u001c\u0010.\u001a\u00020(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010*\"\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternal;", "", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "deviceInfo", "addLocalDevice", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "device", "updateDevice", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;)V", "", "did", "removeLocalDevice", "(Ljava/lang/String;)V", "initDeviceModelsByCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lms7;", "", "predicate", "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lms7;", CervicalMucusRecord.Appearance.CLEAR, "()V", "isReadded", "notifyDeviceInit", "(Ljava/lang/String;Z)V", "isRemoved", "notifyDeviceDestroy", "isRebind", "notifyDeviceBind", "", "getEcoDeviceSize", "()I", "getRequestStatus", "setRequestStatus", "(I)V", "requestStatus", "getAllDeviceModels", "()Ljava/util/List;", "allDeviceModels", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface EcoDeviceManagerInternal {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int REQUESTED = 2;
    public static final int REQUESTING = 1;
    public static final int REQUEST_NOT = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternal$Companion;", "", "<init>", "()V", "REQUEST_NOT", "", "REQUESTING", "REQUESTED", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int REQUESTED = 2;
        public static final int REQUESTING = 1;
        public static final int REQUEST_NOT = 0;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestDeviceList$default(EcoDeviceManagerInternal ecoDeviceManagerInternal, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDeviceList");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            ecoDeviceManagerInternal.requestDeviceList(function1, function2);
        }
    }

    void addLocalDevice(@NotNull EcoDeviceInfo deviceInfo);

    void clear();

    @Nullable
    ms7 findDeviceModel(@NotNull Function1<? super ms7, Boolean> predicate);

    @NotNull
    List<ms7> getAllDeviceModels();

    int getEcoDeviceSize();

    int getRequestStatus();

    @Nullable
    Object initDeviceModelsByCache(@NotNull Continuation<? super Unit> continuation);

    void notifyDeviceBind(@NotNull String did, boolean isRebind);

    void notifyDeviceDestroy(@NotNull String did, boolean isRemoved);

    void notifyDeviceInit(@NotNull String did, boolean isReadded);

    void removeLocalDevice(@NotNull String did);

    void requestDeviceList(@Nullable Function1<? super List<? extends EcoDevice>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail);

    void setRequestStatus(int i);

    void updateDevice(@NotNull EcoDevice device);
}
