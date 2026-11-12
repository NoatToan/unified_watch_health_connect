package com.mi.health.course.activity;

import android.content.Context;
import android.content.Intent;
import com.mi.health.course.activity.eco.EcoCourseSmartHrActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"startHeartRate", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "TAG", "", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseSmartHrActivityKt {

    @NotNull
    private static final String TAG = "CourseSmartHrActivity";

    public static final void startHeartRate(@NotNull Context context, @NotNull Intent intent) {
        int iHashCode;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!intent.hasExtra("course_device_model")) {
            intent.setClass(context, CourseSmartHrActivity.class);
            context.startActivity(intent);
            return;
        }
        String stringExtra = intent.getStringExtra("course_device_model");
        if (stringExtra == null || ((iHashCode = stringExtra.hashCode()) == -1798122615 ? !stringExtra.equals("yesoul.exbike.jsc01y") : !(iHashCode == -1454035281 && stringExtra.equals("runmi.exbike.jscrm1")))) {
            intent.setClass(context, CourseSmartHrActivity.class);
            context.startActivity(intent);
        } else {
            intent.setClass(context, EcoCourseSmartHrActivity.class);
            context.startActivity(intent);
        }
    }
}
