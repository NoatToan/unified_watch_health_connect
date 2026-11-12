package com.mi.health.course.activity;

import android.content.Context;
import android.content.Intent;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.CoursePreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.yrn.export.constants.YRNSportConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a<\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"TAG", "", "judgeIntent", "", "context", "Landroid/content/Context;", "courseType", "", "intent", "Landroid/content/Intent;", "startPlayer", "detail", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "model", "planId", "", "source", "mNeedFreshTabType", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseLinkTipActivityKt {

    @NotNull
    private static final String TAG = "CoursePlayerLink";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void judgeIntent(Context context, int i, Intent intent) {
        if (i == 1) {
            CourseVideoActivityKt.startVideo(context, intent);
        } else if (i == 2) {
            CourseAudioActivityKt.startAudio(context, intent);
        } else {
            if (i != 3) {
                return;
            }
            CourseSmartHrActivityKt.startHeartRate(context, intent);
        }
    }

    public static final void startPlayer(@NotNull Context context, @NotNull CourseModel.CourseDetailResult detail, @NotNull String model, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(model, "model");
        CourseAllInfo courseAllInfo = detail.allInfo;
        int type = courseAllInfo.getType();
        if (CoursePreference.INSTANCE.isShowLinkTip() && CourseExtKt.supportLink(courseAllInfo.getDeviceLinkage())) {
            Intent intent = new Intent(context, (Class<?>) CourseLinkTipActivity.class);
            intent.putExtra("course_summary", detail.practicedSummary);
            intent.putExtra("course_info", courseAllInfo);
            intent.putExtra("course_device_model", model);
            intent.putExtra(BaseCourseActivityKt.KEY_TRAINING_PLAN_INFO, j);
            intent.putExtra("source", i);
            context.startActivity(intent);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("course_summary", detail.practicedSummary);
            intent2.putExtra("course_info", courseAllInfo);
            intent2.putExtra("course_device_model", model);
            intent2.putExtra(BaseCourseActivityKt.KEY_TRAINING_PLAN_INFO, j);
            intent2.putExtra("source", i);
            intent2.putExtra(YRNSportConfig.KEY_NEED_FRESH_TAB_TYPE, i2);
            judgeIntent(context, type, intent2);
        }
        Logger.d(TAG, "startPlayer: " + type);
    }

    public static /* synthetic */ void startPlayer$default(Context context, CourseModel.CourseDetailResult courseDetailResult, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = -1;
        }
        startPlayer(context, courseDetailResult, str, j2, i4, i2);
    }
}
