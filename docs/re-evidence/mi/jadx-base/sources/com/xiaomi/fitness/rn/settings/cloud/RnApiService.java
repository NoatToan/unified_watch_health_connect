package com.xiaomi.fitness.rn.settings.cloud;

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
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/cloud/RnApiService;", "", "accessPlugin", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/rn/settings/cloud/RnBooleanResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RnApiService {
    @u0a
    @ngh("plugin/access_plugin")
    @Nullable
    Object accessPlugin(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<RnBooleanResult>> continuation);
}
