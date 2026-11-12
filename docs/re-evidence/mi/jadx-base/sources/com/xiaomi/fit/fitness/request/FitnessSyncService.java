package com.xiaomi.fit.fitness.request;

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

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/request/FitnessSyncService;", "", "getLastSyncTime", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/fitness/request/GetLastSyncItem;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastSyncTime", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessSyncService {
    @u0a
    @ngh("device/get_last_sync_time")
    @Nullable
    Object getLastSyncTime(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetLastSyncItem>> continuation);

    @u0a
    @ngh("device/batch_set_last_sync_time")
    @Nullable
    Object setLastSyncTime(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<String>> continuation);
}
