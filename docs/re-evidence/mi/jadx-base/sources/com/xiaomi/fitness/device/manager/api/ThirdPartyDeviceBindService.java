package com.xiaomi.fitness.device.manager.api;

import com.xiaomi.fitness.device.manager.api.model.BindThirdParty;
import com.xiaomi.fitness.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H§@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceBindService;", "", "getBindToken", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "thirdPartyBind", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceRecordInfo;", "thirdPartyUnbind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ThirdPartyDeviceBindService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String DEVICE_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceBindService$Companion;", "", "<init>", "()V", "TAG", "", "DEVICE_PATH", "DEVICE_HOST", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String DEVICE_PATH = "app/v1/";

        @NotNull
        private static final String TAG = "BloodSugarDeviceBindSer";

        private Companion() {
        }
    }

    @u0a
    @ngh("thirdbind/get_bind_token")
    @Nullable
    Object getBindToken(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<BindThirdParty>> continuation);

    @u0a
    @ngh("thirdbind/bind")
    @Nullable
    Object thirdPartyBind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceRecordInfo>> continuation);

    @ngh("")
    @Nullable
    Object thirdPartyUnbind(@NotNull Continuation<? super BaseResult<Object>> continuation);
}
