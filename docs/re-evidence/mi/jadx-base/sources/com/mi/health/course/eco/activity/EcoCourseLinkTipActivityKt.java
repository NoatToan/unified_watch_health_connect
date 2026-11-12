package com.mi.health.course.eco.activity;

import android.content.Context;
import android.content.Intent;
import com.mi.health.course.activity.CourseSmartHrActivityKt;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.CoursePreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "judgeIntent", "", "context", "Landroid/content/Context;", "courseType", "", "intent", "Landroid/content/Intent;", "model", "startPlayer", "detail", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoCourseLinkTipActivityKt {

    @NotNull
    private static final String TAG = "EcoCourseLinkTipActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void judgeIntent(Context context, int i, Intent intent, String str) {
        if (i == 1) {
            EcoCourseVideoActivityKt.startVideo(context, intent);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            CourseSmartHrActivityKt.startHeartRate(context, intent);
        } else if (Intrinsics.areEqual(str, "yesoul.exbike.jsc01y")) {
            com.mi.health.course.activity.eco.EcoCourseAudioActivityKt.startBikeAudio(context, intent);
        } else {
            EcoCourseAudioActivityKt.startAudio(context, intent);
        }
    }

    public static final void startPlayer(@NotNull Context context, @NotNull CourseModel.CourseDetailResult detail, @NotNull String model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(model, "model");
        CourseAllInfo courseAllInfo = detail.allInfo;
        int type = courseAllInfo.getType();
        if (CoursePreference.INSTANCE.isShowLinkTip() && CourseExtKt.supportLink(courseAllInfo.getDeviceLinkage()) && !SportDeviceModel.INSTANCE.isJump(model)) {
            Intent intent = new Intent(context, (Class<?>) EcoCourseLinkTipActivity.class);
            intent.putExtra("course_summary", detail.practicedSummary);
            intent.putExtra("course_info", courseAllInfo);
            intent.putExtra("course_device_model", model);
            context.startActivity(intent);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("course_summary", detail.practicedSummary);
            intent2.putExtra("course_info", courseAllInfo);
            intent2.putExtra("course_device_model", model);
            judgeIntent(context, type, intent2, model);
        }
        Logger.d(TAG, "startPlayer: " + type);
    }
}
