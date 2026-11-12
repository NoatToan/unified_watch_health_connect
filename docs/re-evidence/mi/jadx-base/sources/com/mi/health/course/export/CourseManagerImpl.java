package com.mi.health.course.export;

import android.app.Activity;
import android.content.Intent;
import com.mi.health.course.activity.CourseVipActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/mi/health/course/export/CourseManagerImpl;", "Lcom/mi/health/course/export/CourseManager;", "<init>", "()V", "gotoCourseVipPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseManagerImpl implements CourseManager {
    @Override // com.mi.health.course.export.CourseManager
    public void gotoCourseVipPage(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) CourseVipActivity.class));
    }
}
