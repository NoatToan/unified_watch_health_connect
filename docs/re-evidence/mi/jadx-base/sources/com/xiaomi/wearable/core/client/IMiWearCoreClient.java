package com.xiaomi.wearable.core.client;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.connection.IDeviceStateListener;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.IReporter;
import com.xiaomi.wearable.core.a;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 R2\u00020\u0001:\u0001RJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010$\u001a\u00020\nH&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0019H&¢\u0006\u0004\b*\u0010+JC\u00103\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u00020\u0019H&¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0019H&¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00192\u0006\u00109\u001a\u000208H&¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00192\u0006\u00109\u001a\u000208H&¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b?\u0010'J/\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0019H&¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0019H&¢\u0006\u0004\bC\u0010+J\u0017\u0010D\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\bD\u0010\u0010J\u0017\u0010E\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\bE\u0010\u0010J\u0017\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020FH&¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010G\u001a\u00020FH&¢\u0006\u0004\bJ\u0010IJ\u001f\u0010L\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u00101\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ9\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020\r2\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00152\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0019H&¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\n2\u0006\u0010N\u001a\u00020\rH&¢\u0006\u0004\bQ\u0010\u0010¨\u0006S"}, d2 = {"Lcom/xiaomi/wearable/core/client/IMiWearCoreClient;", "Lcom/xiaomi/wearable/core/client/ThirdPartySupport;", "Landroid/content/Context;", "context", "Lcom/xiaomi/wearable/core/client/Logger;", "logger", "Lcom/xiaomi/wearable/core/IReporter;", "reporter", "Lcom/xiaomi/wearable/core/client/ServiceStateListener;", "serviceStateListener", "", "init", "(Landroid/content/Context;Lcom/xiaomi/wearable/core/client/Logger;Lcom/xiaomi/wearable/core/IReporter;Lcom/xiaomi/wearable/core/client/ServiceStateListener;)V", "", "channel", "setChannel", "(Ljava/lang/String;)V", "addServiceStateListener", "(Lcom/xiaomi/wearable/core/client/ServiceStateListener;)V", "removeServiceStateListener", "did", "", "currentDevice", "setCurrentDevice", "(Ljava/lang/String;Z)V", "", "mode", "setWearMode", "(Ljava/lang/String;I)V", "Lcom/xiaomi/wearable/core/client/DeviceInfo;", "getCurrentDevice", "()Lcom/xiaomi/wearable/core/client/DeviceInfo;", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "addDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "removeDeviceInfo", "()V", "getDeviceCapabilities", "(Ljava/lang/String;)I", "getDeviceCapabilitiesV2", "appCapability", "setAppCapabilities", "(I)V", "type", "", "data", "needResponse", "Lcom/xiaomi/wearable/core/ICallback;", "callback", "timeout", "call", "(ILjava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)I", "callId", BroadcastsKt.SILENT_PUSHING_CANCEL, "(Ljava/lang/String;I)Z", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "handler", "addDeviceDataHandler", "(Ljava/lang/String;ILcom/xiaomi/wearable/core/client/IDataHandler;)V", "removeDeviceDataHandler", "isIdle", "(Ljava/lang/String;)Z", "openMassChannel", "massId", "sendMassData", "(I[BLcom/xiaomi/wearable/core/ICallback;I)V", "closeMassChannel", "connect", "disconnect", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStateListener", "(Lcom/xiaomi/wearable/connection/IDeviceStateListener;)V", "removeDeviceStateListener", "Lcom/xiaomi/wearable/core/a;", "openUnauthConnection", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/core/a;)V", Home.JSON_KEY_ADDRESS, "unauthCall", "(Ljava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)V", "closeUnauthConnection", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public interface IMiWearCoreClient extends ThirdPartySupport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/core/client/IMiWearCoreClient$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/wearable/core/client/IMiWearCoreClient;", "getInstance", "()Lcom/xiaomi/wearable/core/client/IMiWearCoreClient;", "instance$delegate", "Lkotlin/Lazy;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: instance$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy<MiWearCoreClient> instance = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: duc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IMiWearCoreClient.Companion.instance_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MiWearCoreClient instance_delegate$lambda$0() {
            return new MiWearCoreClient();
        }

        @NotNull
        public final IMiWearCoreClient getInstance() {
            return instance.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void unauthCall$default(IMiWearCoreClient iMiWearCoreClient, String str, byte[] bArr, boolean z, ICallback iCallback, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unauthCall");
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            iMiWearCoreClient.unauthCall(str, bArr, z, iCallback, i);
        }
    }

    void addDeviceDataHandler(@NotNull String did, int type, @NotNull IDataHandler handler);

    void addDeviceInfo(@NotNull com.xiaomi.wearable.core.DeviceInfo deviceInfo);

    void addDeviceStateListener(@NotNull IDeviceStateListener listener);

    void addServiceStateListener(@NotNull ServiceStateListener serviceStateListener);

    int call(int type, @NotNull String did, @Nullable byte[] data, boolean needResponse, @Nullable ICallback callback, int timeout);

    boolean cancel(@NotNull String did, int callId);

    void closeMassChannel(int massId);

    void closeUnauthConnection(@NotNull String address);

    void connect(@NotNull String did);

    void disconnect(@NotNull String did);

    @Nullable
    DeviceInfo getCurrentDevice();

    int getDeviceCapabilities(@NotNull String did);

    int getDeviceCapabilitiesV2(@NotNull String did);

    void init(@NotNull Context context, @NotNull Logger logger, @NotNull IReporter reporter, @NotNull ServiceStateListener serviceStateListener);

    boolean isIdle(@NotNull String did);

    int openMassChannel(@NotNull String did);

    void openUnauthConnection(@NotNull com.xiaomi.wearable.core.DeviceInfo deviceInfo, @NotNull a callback);

    void removeDeviceDataHandler(@NotNull String did, int type, @NotNull IDataHandler handler);

    void removeDeviceInfo();

    void removeDeviceInfo(@NotNull String did);

    void removeDeviceStateListener(@NotNull IDeviceStateListener listener);

    void removeServiceStateListener(@NotNull ServiceStateListener serviceStateListener);

    void sendMassData(int massId, @NotNull byte[] data, @NotNull ICallback callback, int timeout);

    void setAppCapabilities(int appCapability);

    void setChannel(@Nullable String channel);

    void setCurrentDevice(@NotNull String did, boolean currentDevice);

    void setWearMode(@NotNull String did, int mode);

    void unauthCall(@NotNull String address, @NotNull byte[] data, boolean needResponse, @NotNull ICallback callback, int timeout);
}
