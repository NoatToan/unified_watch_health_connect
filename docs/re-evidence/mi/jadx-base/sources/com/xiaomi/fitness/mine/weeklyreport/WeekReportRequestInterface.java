package com.xiaomi.fitness.mine.weeklyreport;

import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.uua;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = WeekReportConstant.HEALTH_PATH)
@Secret(pathPrefix = WeekReportConstant.HEALTH_PATH, sid = "miothealth")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequestInterface;", "", "getWeekReportList", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportResult;", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WeekReportRequestInterface {
    @Secret(encryptResponse = false, loginPolicy = 3)
    @Nullable
    @uua("health/weeklyList")
    Object getWeekReportList(@NotNull Continuation<? super WeekReportResult<WeekReportListResponse>> continuation);
}
