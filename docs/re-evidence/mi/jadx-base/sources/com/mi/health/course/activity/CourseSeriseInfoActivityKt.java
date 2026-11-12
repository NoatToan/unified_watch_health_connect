package com.mi.health.course.activity;

import android.app.Application;
import android.content.Intent;
import com.xiaomi.fitness.common.utils.AppUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG", "", "startCourseSeriesInfo", "", "id", "", "from", "", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseSeriseInfoActivityKt {

    @NotNull
    private static final String TAG = "CourseSeriesInfoActivity";

    public static final void startCourseSeriesInfo(long j, int i) {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) CourseSeriseInfoActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("id", j);
        intent.putExtra("from", i);
        app.startActivity(intent);
    }
}
