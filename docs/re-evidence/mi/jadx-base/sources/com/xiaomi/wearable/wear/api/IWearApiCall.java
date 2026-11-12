package com.xiaomi.wearable.wear.api;

import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.a;
import com.xiaomi.wearable.core.c;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aJ7\u0010\"\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fH&¢\u0006\u0004\b\"\u0010#J?\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH&¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010 \u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J=\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/xiaomi/wearable/wear/api/IWearApiCall;", "", "", "connect", "()V", "removeBond", "disconnect", "destroy", "", "currentDevice", "setCurrent", "(Z)V", "", "wearMode", "setWearMode", "(I)V", "callId", BroadcastsKt.SILENT_PUSHING_CANCEL, "connectionType", "()I", "isIDLE", "()Z", "type", "Lcom/xiaomi/wearable/core/c;", "deviceDataHandler", "addDeviceDataHandler", "(ILcom/xiaomi/wearable/core/c;)V", "removeDeviceDataHandler", "", "data", "needResponse", "Lcom/xiaomi/wearable/core/ICallback;", "callback", "timeout", "call", "(I[BZLcom/xiaomi/wearable/core/ICallback;I)I", "massId", "massCall", "(II[BZLcom/xiaomi/wearable/core/ICallback;I)I", "openMassChannel", "Lcom/xiaomi/wearable/core/a;", "openUnauthConnection", "(Lcom/xiaomi/wearable/core/a;)V", "", Home.JSON_KEY_ADDRESS, "unauthCall", "(Ljava/lang/String;[BZLcom/xiaomi/wearable/core/ICallback;I)V", "closeUnauthConnection", "(Ljava/lang/String;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public interface IWearApiCall {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void closeUnauthConnection(@NotNull IWearApiCall iWearApiCall, @NotNull String address) {
            Intrinsics.checkNotNullParameter(address, "address");
        }

        public static void openUnauthConnection(@NotNull IWearApiCall iWearApiCall, @NotNull a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        public static void unauthCall(@NotNull IWearApiCall iWearApiCall, @Nullable String str, @Nullable byte[] bArr, boolean z, @Nullable ICallback iCallback, int i) {
        }
    }

    void addDeviceDataHandler(int type, @NotNull c deviceDataHandler);

    int call(int type, @NotNull byte[] data, boolean needResponse, @NotNull ICallback callback, int timeout);

    void cancel(int callId);

    void closeUnauthConnection(@NotNull String address);

    void connect();

    int connectionType();

    void destroy();

    void disconnect();

    boolean isIDLE();

    int massCall(int massId, int type, @NotNull byte[] data, boolean needResponse, @NotNull ICallback callback, int timeout);

    int openMassChannel();

    void openUnauthConnection(@NotNull a callback);

    void removeBond();

    void removeDeviceDataHandler(int type, @NotNull c deviceDataHandler);

    void setCurrent(boolean currentDevice);

    void setWearMode(int wearMode);

    void unauthCall(@Nullable String address, @Nullable byte[] data, boolean needResponse, @Nullable ICallback callback, int timeout);
}
