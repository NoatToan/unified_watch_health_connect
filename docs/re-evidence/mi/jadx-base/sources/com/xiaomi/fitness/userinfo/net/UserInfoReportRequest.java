package com.xiaomi.fitness.userinfo.net;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager;
import com.xiaomi.fitness.userinfo.collect.ReportUserInfoResult;
import com.xiaomi.fitness.userinfo.collect.UserInfoReport;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/net/UserInfoReportRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/userinfo/net/UserInfoReportService;", "<init>", "()V", "reportCollectInfo", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/userinfo/collect/ReportUserInfoResult;", "toUserInfoReport", "Lcom/xiaomi/fitness/userinfo/collect/UserInfoReport;", "(Lcom/xiaomi/fitness/userinfo/collect/UserInfoReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInfoReportRequest extends BaseRequest<UserInfoReportService> {
    @Nullable
    public final Object reportCollectInfo(@NotNull UserInfoReport userInfoReport, @NotNull Continuation<? super BaseResult<ReportUserInfoResult>> continuation) {
        String json = getMGson().toJson(userInfoReport);
        Logger.d(CollectReportInfoManager.TAG, "reportCollectInfo json:" + json);
        UserInfoReportService mService = getMService();
        Intrinsics.checkNotNull(json);
        return mService.reportUserInfoCollectRecord(json, continuation);
    }
}
