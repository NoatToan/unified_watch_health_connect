package com.mi.health.course.eco.activity;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "TIMEOUT", "", "startAudio", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoCourseAudioActivityKt {

    @NotNull
    private static final String TAG = "EcoCourseAudioActivity";
    public static final long TIMEOUT = 10000;

    public static final void startAudio(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.setClass(context, EcoCourseAudioActivity.class);
        context.startActivity(intent);
    }
}
