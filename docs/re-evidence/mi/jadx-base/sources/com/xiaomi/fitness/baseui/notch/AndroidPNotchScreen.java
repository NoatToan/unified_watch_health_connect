package com.xiaomi.fitness.baseui.notch;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.xiaomi.fitness.baseui.notch.AndroidPNotchScreen;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J\u001a\u0010\t\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J$\u0010\u000b\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/AndroidPNotchScreen;", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen;", "<init>", "()V", "hasNotch", "", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setDisplayInNotch", "", "getNotchRect", "callback", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchSizeCallback;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(28)
public final class AndroidPNotchScreen implements INotchScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getNotchRect$lambda$0(View contentView, INotchScreen.NotchSizeCallback notchSizeCallback) {
        DisplayCutout displayCutout;
        Intrinsics.checkNotNullParameter(contentView, "$contentView");
        WindowInsets rootWindowInsets = contentView.getRootWindowInsets();
        if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            if (notchSizeCallback != null) {
                notchSizeCallback.onResult(null);
            }
        } else {
            List<Rect> boundingRects = displayCutout.getBoundingRects();
            Intrinsics.checkNotNullExpressionValue(boundingRects, "getBoundingRects(...)");
            if (notchSizeCallback != null) {
                notchSizeCallback.onResult(boundingRects);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public void getNotchRect(@Nullable WeakReference<Activity> activityWeakReference, @Nullable final INotchScreen.NotchSizeCallback callback) {
        Activity activity;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return;
        }
        final View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.post(new Runnable() { // from class: na1
            @Override // java.lang.Runnable
            public final void run() {
                AndroidPNotchScreen.getNotchRect$lambda$0(decorView, callback);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public boolean hasNotch(@Nullable WeakReference<Activity> activityWeakReference) {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public void setDisplayInNotch(@Nullable WeakReference<Activity> activityWeakReference) {
        Activity activity;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        window.setAttributes(attributes);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
    }
}
