package com.xiaomi.fitness.device.manager.api;

import com.xiaomi.fitness.device.manager.api.model.BindKey;
import com.xiaomi.fitness.device.manager.api.model.BindStatus;
import com.xiaomi.fitness.device.manager.api.model.UpdateDeviceInfoResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.wearable.ApplyBindInfo;
import com.xiaomi.wearable.BindResult;
import com.xiaomi.wearable.LocalBindResult;
import com.xiaomi.wearable.VerifyBindInfo;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/DeviceBindService;", "", "getBindKey", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/BindKey;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindWithSign", "Lcom/xiaomi/fitness/device/manager/api/model/BindStatus;", "locale", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyBind", "Lcom/xiaomi/wearable/ApplyBindInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyBind", "Lcom/xiaomi/wearable/VerifyBindInfo;", "confirmBind", "Lcom/xiaomi/wearable/BindResult;", "unbind", "revokeAuthorization", "recordSourceToServer", "Lcom/xiaomi/wearable/LocalBindResult;", "updateDeviceInfo", "Lcom/xiaomi/fitness/device/manager/api/model/UpdateDeviceInfoResult;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceBindService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String DEVICE_PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/DeviceBindService$Companion;", "", "<init>", "()V", "DEVICE_PATH", "", "DEVICE_HOST", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String DEVICE_PATH = "healthapp/";

        private Companion() {
        }
    }

    @u0a
    @ngh("bind/hello")
    @Nullable
    Object applyBind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<ApplyBindInfo>> continuation);

    @u0a
    @ngh("device/bind_with_devicesign")
    @Nullable
    Object bindWithSign(@NotNull @xfi(encoded = true, value = "locale") String str, @NotNull @zk9(encoded = true, value = "data") String str2, @NotNull Continuation<? super BaseResult<BindStatus>> continuation);

    @u0a
    @ngh("bind/bind")
    @Nullable
    Object confirmBind(@NotNull @xfi(encoded = true, value = "locale") String str, @NotNull @zk9(encoded = true, value = "data") String str2, @NotNull Continuation<? super BaseResult<BindResult>> continuation);

    @Nullable
    @uua("user/get_bindkey")
    Object getBindKey(@NotNull Continuation<? super BaseResult<BindKey>> continuation);

    @u0a
    @ngh("source/record_source")
    @Nullable
    Object recordSourceToServer(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<LocalBindResult>> continuation);

    @u0a
    @ngh("privacy/device/delete")
    @Nullable
    Object revokeAuthorization(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<BindStatus>> continuation);

    @u0a
    @ngh("home/unbind")
    @Nullable
    Object unbind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<BindStatus>> continuation);

    @u0a
    @ngh("bind/update_device_info")
    @Nullable
    Object updateDeviceInfo(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UpdateDeviceInfoResult>> continuation);

    @u0a
    @ngh("bind/ecdh")
    @Nullable
    Object verifyBind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<VerifyBindInfo>> continuation);
}
