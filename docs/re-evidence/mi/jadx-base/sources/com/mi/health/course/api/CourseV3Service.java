package com.mi.health.course.api;

import com.mi.health.course.data.CourseCatalogResp;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.mi.health.course.export.data.CourseCatalogConfigData;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseInfoList;
import com.mi.health.course.export.data.CourseListData;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseSeriesInfoData;
import com.mi.health.course.export.data.CourseSeriesRecommend;
import com.mi.health.course.export.data.CourseVideo;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.plh;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006 "}, d2 = {"Lcom/mi/health/course/api/CourseV3Service;", "", "getCourseList", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "params", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCatalog", "Lcom/mi/health/course/data/CourseCatalogResp;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseRecommend", "getCourseSeriesRecommend", "Lcom/mi/health/course/export/data/CourseSeriesRecommend;", "getCourseCatalogConfig", "Lcom/mi/health/course/export/data/CourseCatalogConfigData;", "getAidongCourseList", "Lcom/mi/health/course/export/data/CourseListData;", "getCourseSeriesList", "getCourseSeriesDetail", "Lcom/mi/health/course/export/data/CourseSeriesInfoData;", "getCourseDetail", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "getCourseVideo", "Lcom/mi/health/course/export/data/CourseVideo;", "id", "getAidongMemberUserInfo", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "getCourseInfos", "Lcom/mi/health/course/export/data/CourseInfoList;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseInfoItem;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CourseV3Service {
    @Nullable
    @uua("courses/list")
    Object getAidongCourseList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseListData>> continuation);

    @Nullable
    @uua("course/get_vip_info")
    Object getAidongMemberUserInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<AidongVipUserInfo>> continuation);

    @Nullable
    @uua("course/get_tag_filter")
    Object getCatalog(@NotNull Continuation<? super BaseResult<CourseCatalogResp>> continuation);

    @Nullable
    @uua("courses/config")
    Object getCourseCatalogConfig(@NotNull Continuation<? super BaseResult<CourseCatalogConfigData>> continuation);

    @Nullable
    @uua("courses/resources/id")
    Object getCourseDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.CourseDetailResult>> continuation);

    @Nullable
    @uua("course/get_user_general_course_info")
    Object getCourseInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseInfoItem>> continuation);

    @Nullable
    @uua("course/get_general_course_infos")
    Object getCourseInfos(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseInfoList>> continuation);

    @Nullable
    @uua("course/get_course_list")
    Object getCourseList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.CourseListData>> continuation);

    @Nullable
    @uua("course/get_recommend_course_list")
    Object getCourseRecommend(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.CourseListData>> continuation);

    @Nullable
    @uua("courses/albums/id")
    Object getCourseSeriesDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseSeriesInfoData>> continuation);

    @Nullable
    @uua("courses/albums")
    Object getCourseSeriesList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseListData>> continuation);

    @Nullable
    @uua("courses/recommended/albums")
    Object getCourseSeriesRecommend(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseSeriesRecommend>> continuation);

    @Nullable
    @uua("courses/resources/{id}/play")
    Object getCourseVideo(@plh("id") @NotNull String str, @NotNull Continuation<? super BaseResult<CourseVideo>> continuation);
}
