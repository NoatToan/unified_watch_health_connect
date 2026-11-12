package com.xiaomi.fitness.running.group.api;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.running.group.export.data.RunningGroupEntranceResult;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/running/group/api/RunningGroupService;", "", "getTeamEntrance", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceResult;", "params", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "running-group_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RunningGroupService {
    @u0a
    @ngh("running_groups/team_entrance_config")
    @Nullable
    Object getTeamEntrance(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<RunningGroupEntranceResult>> continuation);
}
