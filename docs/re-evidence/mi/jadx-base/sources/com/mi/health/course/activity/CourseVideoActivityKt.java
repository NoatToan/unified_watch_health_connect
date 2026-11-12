package com.mi.health.course.activity;

import android.content.Context;
import android.content.Intent;
import com.mi.health.course.activity.eco.EcoCourseVideoActivity;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.qmi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"INFO_HOUR_WIDTH", "", "INFO_MINUTE_WIDTH", "TAG", "", "startVideo", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseVideoActivityKt {
    private static final int INFO_HOUR_WIDTH = ExtUtilsKt.getDp(180);
    private static final int INFO_MINUTE_WIDTH = ExtUtilsKt.getDimension(qmi.f31663a);

    @NotNull
    private static final String TAG = "CoursePlayerVideoAc";

    public static final void startVideo(@NotNull Context context, @NotNull Intent intent) {
        int iHashCode;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!intent.hasExtra("course_device_model")) {
            intent.setClass(context, CourseVideoActivity.class);
            context.startActivity(intent);
            return;
        }
        String stringExtra = intent.getStringExtra("course_device_model");
        if (stringExtra == null || ((iHashCode = stringExtra.hashCode()) == -1798122615 ? !stringExtra.equals("yesoul.exbike.jsc01y") : !(iHashCode == -1454035281 && stringExtra.equals("runmi.exbike.jscrm1")))) {
            intent.setClass(context, CourseVideoActivity.class);
            context.startActivity(intent);
        } else {
            intent.setClass(context, EcoCourseVideoActivity.class);
            context.startActivity(intent);
        }
    }
}
