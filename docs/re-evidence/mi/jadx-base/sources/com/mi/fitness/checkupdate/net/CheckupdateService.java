package com.mi.fitness.checkupdate.net;

import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.xfi;
import defpackage.zk9;
import defpackage.zlb;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mi/fitness/checkupdate/net/CheckupdateService;", "", "getLatestVersion", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "data", "", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkHMUpgrade", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "header", "reportDeviceInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CheckupdateService {
    @u0a
    @ngh("huami/ota")
    @Nullable
    Object checkHMUpgrade(@NotNull @zk9("data") String str, @NotNull @zlb("X-Request-Id") String str2, @NotNull Continuation<? super BaseResult<OtaUpgradeResult>> continuation);

    @u0a
    @ngh("device/latest_ver")
    @Nullable
    Object getLatestVersion(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull @xfi(encoded = true, value = "locale") String str2, @NotNull Continuation<? super BaseResult<LatestVersion>> continuation);

    @u0a
    @ngh("device/bledevice_info")
    @Nullable
    Object reportDeviceInfo(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<String>> continuation);
}
