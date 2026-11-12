package com.mi.fitness.course.schedule.request;

import com.mi.fitness.course.schedule.bean.CourseScheduleDefaultResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import defpackage.uua;
import defpackage.zlb;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://i.ai.mi.com/")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/mi/fitness/course/schedule/request/CourseScheduleApiService;", "", "getAllCourseSchedule", "Lcom/mi/fitness/course/schedule/request/CourseScheduleBaseResult;", "Lcom/mi/fitness/course/schedule/bean/CourseScheduleDefaultResult;", "author", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CourseScheduleApiService {

    @NotNull
    public static final String COURSE_SCHEDULE_HOST = "https://i.ai.mi.com/";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mi/fitness/course/schedule/request/CourseScheduleApiService$Companion;", "", "<init>", "()V", "COURSE_SCHEDULE_HOST", "", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String COURSE_SCHEDULE_HOST = "https://i.ai.mi.com/";

        private Companion() {
        }
    }

    @Nullable
    @uua("course-multi-auth/tableDefault")
    Object getAllCourseSchedule(@NotNull @zlb("Authorization") String str, @NotNull Continuation<? super CourseScheduleBaseResult<CourseScheduleDefaultResult>> continuation);
}
