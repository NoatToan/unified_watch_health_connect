package com.mi.health.course.api;

import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseTrainRecord;
import com.xiaomi.fitness.net.response.BaseResult;
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

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/mi/health/course/api/CourseService;", "", "getCourseList", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "params", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPracticedCourseList", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "getMultiCourseInfo", "Lcom/mi/health/course/export/data/CourseModel$CourseBasicInformationList;", "getTrainRecord", "Lcom/mi/health/course/export/data/CourseTrainRecord;", "postTrainRecord", "Lcom/mi/health/course/export/data/CourseModel$RequestResult;", "postRemoveCourse", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CourseService {
    @Nullable
    @uua("course/get_user_course_detail")
    Object getCourseInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.CourseDetailResult>> continuation);

    @Nullable
    @uua("course/get_course_list")
    Object getCourseList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.CourseListData>> continuation);

    @Nullable
    @uua("course/multi_get_course_info")
    Object getMultiCourseInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.CourseBasicInformationList>> continuation);

    @Nullable
    @uua("course/get_user_course_list")
    Object getPracticedCourseList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.PracticedCourseList>> continuation);

    @Nullable
    @uua("course/get_train_record")
    Object getTrainRecord(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CourseTrainRecord>> continuation);

    @u0a
    @ngh("course/remove_user_course")
    @Nullable
    Object postRemoveCourse(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.RequestResult>> continuation);

    @u0a
    @ngh("course/up_train_record")
    @Nullable
    Object postTrainRecord(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<CourseModel.RequestResult>> continuation);
}
