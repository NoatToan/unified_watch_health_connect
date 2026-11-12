package com.xiaomi.fitness.device.manager;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.net.response.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 H*\u0018\b\u0000\u0010\u0004*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u00012\u00020\u0005:\u0001HJ]\u0010\u000e\u001a\u00020\b2.\b\u0002\u0010\n\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u0001`\t2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0019\u0010\u0013J\u0011\u0010\u001a\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b \u0010\u001fJ4\u0010$\u001a\u00020\b2#\u0010\u001d\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b$\u0010%J4\u0010&\u001a\u00020\b2#\u0010\u001d\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b&\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010+\u001a\u00020\u0010H&¢\u0006\u0004\b,\u0010(J9\u00101\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b3\u00104J%\u00107\u001a\u0004\u0018\u00018\u00002\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002050\u0006H&¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H&¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010<\u001a\u0004\u0018\u00010?H&¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020/H&¢\u0006\u0004\bB\u0010CR\u0014\u0010D\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010C¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceManager;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "T", "", "Lkotlin/Function1;", "", "", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "did", "connectDevice", "(Ljava/lang/String;)V", "disconnectDevice", "getDeviceList", "()Ljava/util/List;", "getDeviceModels", "getLocalDeviceModels", "removeDeviceModel", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStatusListener", "(Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;)V", "removeDeviceStatusListener", "Lkotlin/ParameterName;", "name", "deviceModel", "addDeviceChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "removeDeviceChangeListener", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/DeviceModel;", "getDeviceInfoInAll", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "mac", "getDeviceModelByMac", "Lkotlin/Function0;", "success", "", "fail", "deauthorize", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "switchDevice", "(Lcom/xiaomi/fitness/device/manager/DeviceModel;)V", "", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "parameter", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;Lcom/xiaomi/fitness/device/manager/a;)V", "Lcom/xiaomi/fitness/device/manager/l;", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "getDeviceSize", "()I", "isConnected", "()Z", "getDeviceStatus", "deviceStatus", "Companion", "device-manager_release"}, k = 1, mv = {2, 0, 0})
public interface DeviceManager<T extends DeviceModel<? extends DeviceInfo<? extends Device>>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String LIVEDATA_DEVICE_MODEL = "device_model";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceManager$Companion;", "", "<init>", "()V", "LIVEDATA_DEVICE_MODEL", "", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String LIVEDATA_DEVICE_MODEL = "device_model";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void connectDevice$default(DeviceManager deviceManager, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectDevice");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            deviceManager.connectDevice(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestDeviceList$default(DeviceManager deviceManager, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDeviceList");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            deviceManager.requestDeviceList(function1, function2);
        }

        public static /* synthetic */ void unbindDevice$default(DeviceManager deviceManager, String str, l lVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unbindDevice");
            }
            if ((i & 2) != 0) {
                lVar = null;
            }
            deviceManager.unbindDevice(str, lVar);
        }
    }

    void addDeviceChangeListener(@NotNull Function1<? super T, Unit> listener);

    void addDeviceStatusListener(@NotNull OnDeviceStatusListener listener);

    void bindDevice(@NotNull DeviceParameter parameter, @NotNull a callback);

    void connectDevice(@Nullable String did);

    void deauthorize(@NotNull String did, @NotNull Function0<Unit> success, @NotNull Function1<? super Integer, Unit> fail);

    void disconnectDevice(@NotNull String did);

    @Nullable
    T findDeviceModel(@NotNull Function1<? super T, Boolean> p);

    @Nullable
    T getCurrentDeviceModel();

    @Nullable
    DeviceInfo<? extends Device> getDeviceInfoInAll(@NotNull String did);

    @NotNull
    List<Device> getDeviceList();

    @Nullable
    T getDeviceModel(@NotNull String did);

    @Nullable
    T getDeviceModelByMac(@NotNull String mac);

    @NotNull
    List<T> getDeviceModels();

    int getDeviceSize();

    int getDeviceStatus();

    @NotNull
    List<T> getLocalDeviceModels();

    boolean isConnected();

    void removeDeviceChangeListener(@NotNull Function1<? super T, Unit> listener);

    void removeDeviceModel(@NotNull String did);

    void removeDeviceStatusListener(@NotNull OnDeviceStatusListener listener);

    void requestDeviceList(@Nullable Function1<? super List<? extends T>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail);

    void switchDevice(@Nullable T deviceModel);

    void unbindDevice(@NotNull String did, @Nullable l callback);
}
