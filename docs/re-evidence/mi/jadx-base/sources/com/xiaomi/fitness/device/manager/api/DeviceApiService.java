package com.xiaomi.fitness.device.manager.api;

import com.xiaomi.fitness.device.manager.api.model.DeviceListData;
import com.xiaomi.fitness.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.device.manager.api.model.ProductListData;
import com.xiaomi.fitness.device.manager.report.DeviceActiveResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.emb;
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
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;", "", "getDevices", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceListData;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductConfigByCategory", "Lcom/xiaomi/fitness/device/manager/api/model/ProductListData;", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductConfig", "recordDevices", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceRecordInfo;", "uploadDeviceLocalBind", "deviceActive", "Lcom/xiaomi/fitness/device/manager/report/DeviceActiveResult;", "upTrackData", "upHuamiTrackData", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String DEVICE_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/DeviceApiService$Companion;", "", "<init>", "()V", "DEVICE_PATH", "", "DEVICE_HOST", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String DEVICE_PATH = "app/v1/";

        private Companion() {
        }
    }

    @u0a
    @ngh("stat/up_metric")
    @Nullable
    Object deviceActive(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceActiveResult>> continuation);

    @u0a
    @ngh("source/get_source_list")
    @Nullable
    Object getDevices(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceListData>> continuation);

    @Nullable
    @uua("product/get_config_info")
    Object getProductConfig(@Nullable @xfi("locale") String str, @Nullable @xfi("data") String str2, @NotNull Continuation<? super BaseResult<ProductListData>> continuation);

    @emb({"Cookie: auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @uua("product/get_config_info_by_category")
    @Secret(loginPolicy = 3)
    Object getProductConfigByCategory(@Nullable @xfi("locale") String str, @NotNull @xfi("data") String str2, @NotNull Continuation<? super BaseResult<ProductListData>> continuation);

    @u0a
    @ngh("source/record_source")
    @Nullable
    Object recordDevices(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceRecordInfo>> continuation);

    @u0a
    @ngh("stat/up_hm_track_data")
    @Nullable
    Object upHuamiTrackData(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceActiveResult>> continuation);

    @u0a
    @ngh("stat/up_track_data")
    @Nullable
    Object upTrackData(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceActiveResult>> continuation);

    @u0a
    @ngh("bind/device_local_bind")
    @Nullable
    Object uploadDeviceLocalBind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<DeviceRecordInfo>> continuation);
}
