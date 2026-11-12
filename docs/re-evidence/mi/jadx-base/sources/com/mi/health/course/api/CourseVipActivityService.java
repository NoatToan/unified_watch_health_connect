package com.mi.health.course.api;

import com.mi.health.course.export.data.CourseExchangeBenefits;
import com.mi.health.course.export.data.CourseNewEquipmentBenefit;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "ops/v1/toapp/")
@Secret
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mi/health/course/api/CourseVipActivityService;", "", "getNewEquipmentBenefits", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefit;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchangeBenefits", "Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "params", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CourseVipActivityService {
    @u0a
    @ngh("benefits/redeem")
    @Nullable
    Object exchangeBenefits(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<CourseExchangeBenefits>> continuation);

    @Nullable
    @uua("benefits")
    Object getNewEquipmentBenefits(@NotNull Continuation<? super BaseResult<CourseNewEquipmentBenefit>> continuation);
}
