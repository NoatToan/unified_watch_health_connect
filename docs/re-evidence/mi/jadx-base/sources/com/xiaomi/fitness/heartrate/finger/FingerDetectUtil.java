package com.xiaomi.fitness.heartrate.finger;

import android.content.Context;
import android.view.View;
import defpackage.alb;
import defpackage.clb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.view.HapticCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/FingerDetectUtil;", "", "<init>", "()V", "FP_TAG", "", "FP_DEBUG", "", "onFingerDownVibrate", "", "context", "Landroid/content/Context;", "onFingerUpVibrate", "onFinishBtnClickVibrate", "view", "Landroid/view/View;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FingerDetectUtil {
    public static final boolean FP_DEBUG = true;

    @NotNull
    public static final String FP_TAG = "FP_HR";

    @NotNull
    public static final FingerDetectUtil INSTANCE = new FingerDetectUtil();

    private FingerDetectUtil() {
    }

    public final void onFingerDownVibrate(@Nullable Context context) {
        clb.b(context, 4);
    }

    public final void onFingerUpVibrate(@Nullable Context context) {
        clb.b(context, 165);
    }

    public final void onFinishBtnClickVibrate(@Nullable View view) {
        Intrinsics.checkNotNull(view);
        HapticCompat.performHapticFeedback(view, alb.f1169k);
    }
}
