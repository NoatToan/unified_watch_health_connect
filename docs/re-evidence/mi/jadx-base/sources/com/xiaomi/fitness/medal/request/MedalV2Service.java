package com.xiaomi.fitness.medal.request;

import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.bean.PopMedalList;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.request.model.MedalNewNetworkResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ecf;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/")
@Secret(sid = "miothealth")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0005J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalV2Service;", "", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lecf;", "getAllMedalsWithOutNew", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMedals", "", "data", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "getMedalDetailV2", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "getMedalList", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "getMedalEntrance", "getMedalEntranceV4", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface MedalV2Service {
    @Nullable
    @uua("ops/v1/medal/my_all_medal")
    Object getAllMedals(@NotNull Continuation<? super MedalNewNetworkResult<ecf>> continuation);

    @Nullable
    @uua("ops/v1/medal/my_all_medal_without_new")
    Object getAllMedalsWithOutNew(@NotNull Continuation<? super MedalNewNetworkResult<ecf>> continuation);

    @Nullable
    @uua("ops/v1/medal/detail")
    Object getMedalDetailV2(@NotNull @xfi("data") String str, @NotNull Continuation<? super MedalNewNetworkResult<MedalDetail>> continuation);

    @Nullable
    @uua("ops/v1/medal/my_entrance")
    Object getMedalEntrance(@NotNull Continuation<? super MedalNewNetworkResult<MedalEntrance>> continuation);

    @Nullable
    @uua("ops/v1/medal/my_entrance/v3")
    Object getMedalEntranceV4(@NotNull Continuation<? super MedalNewNetworkResult<MedalEntrance>> continuation);

    @Nullable
    @uua("ops/v1/medal/pop_list")
    Object getMedalList(@NotNull Continuation<? super MedalNewNetworkResult<PopMedalList>> continuation);
}
