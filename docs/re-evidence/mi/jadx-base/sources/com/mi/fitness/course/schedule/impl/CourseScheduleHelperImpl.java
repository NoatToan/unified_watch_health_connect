package com.mi.fitness.course.schedule.impl;

import android.content.Context;
import android.content.Intent;
import com.example.aivs.export.AivsHelper;
import com.example.aivs.export.AivsHelperExtKt;
import com.mi.fitness.course.schecule.export.CourseScheduleConstant;
import com.mi.fitness.course.schecule.export.CourseScheduleHelper;
import com.mi.fitness.course.schedule.web.CourseScheduleWebViewActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.zyi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/mi/fitness/course/schedule/impl/CourseScheduleHelperImpl;", "Lcom/mi/fitness/course/schecule/export/CourseScheduleHelper;", "<init>", "()V", "goCourseScheduleActivity", "", "context", "Landroid/content/Context;", "Companion", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseScheduleHelperImpl implements CourseScheduleHelper {

    @NotNull
    private static final String TAG = "CourseScheduleHelperImpl";

    @Override // com.mi.fitness.course.schecule.export.CourseScheduleHelper
    public void goCourseScheduleActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            Logger.i(TAG, "not login, return goCourseScheduleActivity");
            return;
        }
        int aivs_engine_status = CourseScheduleConstant.INSTANCE.getAivs_engine_status();
        if (aivs_engine_status == 1) {
            Logger.e(TAG, "aivs engine initializing, wait");
            ToastExtKt.toastShort(context, zyi.course_schedule_not_ready_toast);
        } else if (aivs_engine_status != 2) {
            Logger.e(TAG, "aivs engine not ready, try init");
            ToastExtKt.toastShort(context, zyi.course_schedule_not_ready_toast);
            AivsHelperExtKt.getInstance(AivsHelper.INSTANCE).initEngine();
        } else {
            Intent intent = new Intent(context, (Class<?>) CourseScheduleWebViewActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("URL", "https://i.ai.mi.com/h5/precache/ai-schedule/#/todaylesson");
            context.startActivity(intent);
        }
    }
}
