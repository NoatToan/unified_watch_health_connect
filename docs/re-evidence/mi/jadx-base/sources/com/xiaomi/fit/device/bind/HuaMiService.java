package com.xiaomi.fit.device.bind;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.emb;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiService;", "", "checkDeviceBind", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$CheckBind;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServerSign", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$ServerSign;", "bindDevice", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$BindCode;", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "batchCheckDeviceBind", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$BatchCheckBind;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HuaMiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String DEVICE_PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiService$Companion;", "", "<init>", "()V", "DEVICE_PATH", "", "DEVICE_HOST", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String DEVICE_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String DEVICE_PATH = "healthapp/";

        private Companion() {
        }
    }

    @ngh("huami/batch_check_bind")
    @emb({"Cookie: auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @u0a
    @Secret(loginPolicy = 3)
    Object batchCheckDeviceBind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<HuaMiRequest.BatchCheckBind>> continuation);

    @u0a
    @ngh("huami/bind")
    @Nullable
    Object bindDevice(@NotNull @xfi(encoded = true, value = "locale") String str, @NotNull @zk9(encoded = true, value = "data") String str2, @NotNull Continuation<? super BaseResult<HuaMiRequest.BindCode>> continuation);

    @u0a
    @ngh("huami/check_bind")
    @Nullable
    Object checkDeviceBind(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<HuaMiRequest.CheckBind>> continuation);

    @u0a
    @ngh("huami/get_server_sign")
    @Nullable
    Object getServerSign(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<HuaMiRequest.ServerSign>> continuation);
}
