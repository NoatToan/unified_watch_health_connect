package com.mi.health.course.api;

import com.mi.health.course.export.data.CourseMembership;
import com.mi.health.course.export.data.CourseVipInfo;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.uua;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "ops/v1/")
@Secret
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/mi/health/course/api/CourseVipService;", "", "getCourseMemberships", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseMembership;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseVip", "Lcom/mi/health/course/export/data/CourseVipInfo;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CourseVipService {
    @Nullable
    @uua("courses/memberships")
    Object getCourseMemberships(@NotNull Continuation<? super BaseResult<CourseMembership>> continuation);

    @Nullable
    @uua("courses")
    Object getCourseVip(@NotNull Continuation<? super BaseResult<CourseVipInfo>> continuation);
}
