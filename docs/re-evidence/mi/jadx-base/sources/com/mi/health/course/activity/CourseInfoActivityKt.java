package com.mi.health.course.activity;

import android.app.Application;
import android.content.Intent;
import com.mi.health.course.activity.eco.EcoCourseInfoActivity;
import com.mi.health.course.export.data.TrainingCourseInfo;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG_L", "", "AUDIO_SIZE_LIMIT", "", "KEY_COURSE_ID", "startCourseInfo", "", "id", "", "trainingCourseInfo", "Lcom/mi/health/course/export/data/TrainingCourseInfo;", "from", "needCheckSycn", "", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseInfoActivityKt {
    private static final int AUDIO_SIZE_LIMIT = 4;

    @NotNull
    public static final String KEY_COURSE_ID = "course_id";

    @NotNull
    private static final String TAG_L = "CoursePlayerInfo";

    public static final void startCourseInfo(long j, @Nullable TrainingCourseInfo trainingCourseInfo, int i, boolean z) {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) CourseInfoActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("course_id", j);
        intent.putExtra(BaseCourseActivityKt.KEY_TRAINING_PLAN_INFO, trainingCourseInfo);
        intent.putExtra("from", i);
        intent.putExtra(EcoCourseInfoActivity.KEY_NEED_CHECK_SYNC, z);
        app.startActivity(intent);
    }

    public static /* synthetic */ void startCourseInfo$default(long j, TrainingCourseInfo trainingCourseInfo, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            trainingCourseInfo = null;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        startCourseInfo(j, trainingCourseInfo, i, z);
    }
}
