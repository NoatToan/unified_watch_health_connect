package com.xiaomi.fitness.medal.request;

import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.bean.PopMedalList;
import com.xiaomi.fitness.medal.export.data.MedalAssistResult;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.medal.request.model.MedalResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "cgi-op/api/v1/miwear/")
@Secret(pathPrefix = "cgi-op/api/v1/miwear/", sid = "miothealth")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalService;", "", "getMedalDetail", "Lcom/xiaomi/fitness/medal/request/model/MedalResult;", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postClientAssist", "Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestMedal", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "turnMedalDone", "Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MedalService {
    @Nullable
    @uua("medal/latest")
    Object getLatestMedal(@NotNull Continuation<? super MedalResult<PopMedalData>> continuation);

    @Nullable
    @uua("medal/detail")
    Object getMedalDetail(@xfi("id") long j, @NotNull Continuation<? super MedalResult<MedalDetail>> continuation);

    @u0a
    @ngh("clientTrack/clientAssist")
    @Nullable
    Object postClientAssist(@NotNull @zk9("data") String str, @NotNull Continuation<? super MedalResult<MedalAssistResult>> continuation);

    @u0a
    @ngh("medal/turn")
    @Nullable
    Object turnMedalDone(@NotNull @zk9("data") String str, @NotNull Continuation<? super MedalResult<PopMedalList>> continuation);
}
