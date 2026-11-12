package com.mi.health.course.export;

import com.xiaomi.fitness.common.utils.AppUtil;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0016\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010.\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b2\u00100\"\u0014\u00103\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b4\u00100\"\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"courseApi", "Lcom/mi/health/course/export/CourseApi;", "getCourseApi", "()Lcom/mi/health/course/export/CourseApi;", "COURSE_RECOMMEND_TEST", "", "COURSE_PAGE_TAB", "", "COURSE_PAGE_ALL", "COURSE_PAGE_OUTDOOR_RUN", "COURSE_PAGE_OUTDOOR_WALK", "COURSE_PAGE_OUTDOOR_BIKING", "COURSE_PAGE_INDOOR_BIKING", "COURSE_PAGE_INDOOR_RUN", "COURSE_PAGE_TREADMILL", "COURSE_TAG_JUMP_ROPE", "COURSE_PAGE_EXERCISE_BIKE", "COURSE_PAGE_JUMP_ROPE", "COURSE_TAG_EXERCISE_BIKE", "COURSE_TAG_IN30", "COURSE_TAG_OUT30", "COURSE_TAG_MORE", "COURSE_TAG_DEFAULT", "COURSE_TAG_COURSE_LIST", "TAG_BURNING_RUN", "TAG_BRISK_WALK", "TAG_ENDURANCE", "COURSE_TAG_TREADMILL", "COURSE_TAG_INTELLIGENT_INSTRUMENT", "TAG_EXERCISE_BIKE_ERO_BASIS", "TAG_EXERCISE_BIKE_FAT_BURN", "TAG_EXERCISE_BIKE_INCREASE_ENDURANCE", "TAG_EXERCISE_BIKE_EFFICIENT_METABOLISM", "TAG_SKIPPING_ROPE_FAT_BURN", "TAG_SKIPPING_ROPE_EFFICIENT_ADVANCED", "SOURCE_SPORT_TAB", "", "SOURCE_ALL_COURSE", "SOURCE_SEARCH_LIST", "SOURCE_SERIES_LIST", "SOURCE_MY_COURSE_LIST", "SOURCE_DEVICE_RECOMMEND_COURSE", "SOURCE_DEVICE_RECOMMEND_COURSE_LIST", "SOURCE_CUSTOM1", "SOURCE_CUSTOM2", "SOURCE_MY_VIP", "WEAR_COURSE_STATUS_MESSAGE", "getWEAR_COURSE_STATUS_MESSAGE", "()Ljava/lang/String;", "WEAR_COURSE_START", "getWEAR_COURSE_START", "WEAR_COURSE_FINISHED", "getWEAR_COURSE_FINISHED", "COURSE_TAG_TIME_SEC", "", "getCOURSE_TAG_TIME_SEC", "()J", "getCourseScene", "page", "tag", "course-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseApiKt {

    @NotNull
    public static final String COURSE_PAGE_ALL = "all_course";

    @NotNull
    public static final String COURSE_PAGE_EXERCISE_BIKE = "exercise_bike";

    @NotNull
    public static final String COURSE_PAGE_INDOOR_BIKING = "sub_sport_tab_indoor_biking";

    @NotNull
    public static final String COURSE_PAGE_INDOOR_RUN = "sub_sport_tab_indoor_run";

    @NotNull
    public static final String COURSE_PAGE_JUMP_ROPE = "skipping_rope";

    @NotNull
    public static final String COURSE_PAGE_OUTDOOR_BIKING = "sub_sport_tab_outdoor_biking";

    @NotNull
    public static final String COURSE_PAGE_OUTDOOR_RUN = "sub_sport_tab_outdoor_run";

    @NotNull
    public static final String COURSE_PAGE_OUTDOOR_WALK = "sub_sport_tab_outdoor_walk";

    @NotNull
    public static final String COURSE_PAGE_TAB = "sport_tab";

    @NotNull
    public static final String COURSE_PAGE_TREADMILL = "running_machine";
    public static final boolean COURSE_RECOMMEND_TEST = false;

    @NotNull
    public static final String COURSE_TAG_COURSE_LIST = "course_list";

    @NotNull
    public static final String COURSE_TAG_DEFAULT = "default";

    @NotNull
    public static final String COURSE_TAG_EXERCISE_BIKE = "exercise_bike";

    @NotNull
    public static final String COURSE_TAG_IN30 = "exercise_within_30_minutes";

    @NotNull
    public static final String COURSE_TAG_INTELLIGENT_INSTRUMENT = "intelligent_instrument";

    @NotNull
    public static final String COURSE_TAG_JUMP_ROPE = "skipping_rope";

    @NotNull
    public static final String COURSE_TAG_MORE = "more";

    @NotNull
    public static final String COURSE_TAG_OUT30 = "no_exercise_within_30_minutes";

    @NotNull
    public static final String COURSE_TAG_TREADMILL = "treadmill";
    public static final int SOURCE_ALL_COURSE = 2;
    public static final int SOURCE_CUSTOM1 = 8;
    public static final int SOURCE_CUSTOM2 = 9;
    public static final int SOURCE_DEVICE_RECOMMEND_COURSE = 6;
    public static final int SOURCE_DEVICE_RECOMMEND_COURSE_LIST = 7;
    public static final int SOURCE_MY_COURSE_LIST = 5;
    public static final int SOURCE_MY_VIP = 10;
    public static final int SOURCE_SEARCH_LIST = 3;
    public static final int SOURCE_SERIES_LIST = 4;
    public static final int SOURCE_SPORT_TAB = 1;

    @NotNull
    public static final String TAG_BRISK_WALK = "audio_easy_walk";

    @NotNull
    public static final String TAG_BURNING_RUN = "audio_burn_fat";

    @NotNull
    public static final String TAG_ENDURANCE = "audio_stamina_increase";

    @NotNull
    public static final String TAG_EXERCISE_BIKE_EFFICIENT_METABOLISM = "exercise_bike_efficient_metabolism";

    @NotNull
    public static final String TAG_EXERCISE_BIKE_ERO_BASIS = "exercise_bike_ero_basis";

    @NotNull
    public static final String TAG_EXERCISE_BIKE_FAT_BURN = "exercise_bike_fat_burn";

    @NotNull
    public static final String TAG_EXERCISE_BIKE_INCREASE_ENDURANCE = "exercise_bike_increase_endurance";

    @NotNull
    public static final String TAG_SKIPPING_ROPE_EFFICIENT_ADVANCED = "skipping_rope_efficient_advanced";

    @NotNull
    public static final String TAG_SKIPPING_ROPE_FAT_BURN = "skipping_rope_fat_burn";

    @NotNull
    private static final CourseApi courseApi = ((CourseEntryPoint) EntryPointAccessors.fromApplication(AppUtil.getApp(), CourseEntryPoint.class)).getCourseApi();

    @NotNull
    private static final String WEAR_COURSE_STATUS_MESSAGE = "WEAR_COURSE_STATUS_MESSAGE";

    @NotNull
    private static final String WEAR_COURSE_START = "WEAR_COURSE_START";

    @NotNull
    private static final String WEAR_COURSE_FINISHED = "WEAR_COURSE_FINISHED";

    public static final long getCOURSE_TAG_TIME_SEC() {
        return (System.currentTimeMillis() / ((long) 1000)) - ((long) 1800);
    }

    @NotNull
    public static final CourseApi getCourseApi() {
        return courseApi;
    }

    @NotNull
    public static final String getCourseScene(@NotNull String page, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return page + ":" + tag;
    }

    @NotNull
    public static final String getWEAR_COURSE_FINISHED() {
        return WEAR_COURSE_FINISHED;
    }

    @NotNull
    public static final String getWEAR_COURSE_START() {
        return WEAR_COURSE_START;
    }

    @NotNull
    public static final String getWEAR_COURSE_STATUS_MESSAGE() {
        return WEAR_COURSE_STATUS_MESSAGE;
    }
}
