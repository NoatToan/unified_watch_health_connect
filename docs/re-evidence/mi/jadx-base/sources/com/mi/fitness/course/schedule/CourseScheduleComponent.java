package com.mi.fitness.course.schedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.mi.fitness.course.schecule.export.CourseScheduleConstant;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004*\u0001\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/mi/fitness/course/schedule/CourseScheduleComponent;", "", "<init>", "()V", "initCourseScheduleComponent", "", LoginPreferenceConfig.TYPE_REGISTER, "com/mi/fitness/course/schedule/CourseScheduleComponent$register$1", "Lcom/mi/fitness/course/schedule/CourseScheduleComponent$register$1;", "Companion", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "小爱课程表")
public final class CourseScheduleComponent {

    @NotNull
    private static final String TAG = "CourseScheduleComponent";

    @NotNull
    private final CourseScheduleComponent$register$1 register = new BroadcastReceiver() { // from class: com.mi.fitness.course.schedule.CourseScheduleComponent$register$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, CourseScheduleConstant.SYNC_AIVS_ENGINE_STATUS_ACTION)) {
                Logger.i("CourseScheduleComponent", "receive SYNC_AIVS_ENGINE_STATUS_ACTION");
                CourseScheduleConstant.INSTANCE.setAivs_engine_status(intent.getIntExtra(CourseScheduleConstant.SYNC_AIVS_ENGINE_STATUS_READY, 0));
            }
        }
    };

    @ComponentTask(notLaterThan = 2, onMainThread = false)
    public final void initCourseScheduleComponent() {
        Logger.i(TAG, "initCourseScheduleComponent");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(this.register, new IntentFilter(CourseScheduleConstant.SYNC_AIVS_ENGINE_STATUS_ACTION), 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.register, new IntentFilter(CourseScheduleConstant.SYNC_AIVS_ENGINE_STATUS_ACTION));
        }
    }
}
