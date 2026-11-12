package com.huami.privacy.plugin;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huami/privacy/plugin/ActivityLifecyclePlugin;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/privacy/plugin/PrivacyPlugin;", "Landroid/app/Activity;", "activity", "", "onActivityCreated$hmutil_release", "(Landroid/app/Activity;)V", "onActivityCreated", "onActivityResumed$hmutil_release", "onActivityResumed", "onActivityPaused$hmutil_release", "onActivityPaused", "onActivityDestroyed$hmutil_release", "onActivityDestroyed", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public abstract class ActivityLifecyclePlugin<T> implements PrivacyPlugin<T> {
    public void onActivityCreated$hmutil_release(@NotNull Activity activity) {
    }

    public void onActivityDestroyed$hmutil_release(@NotNull Activity activity) {
    }

    public void onActivityPaused$hmutil_release(@NotNull Activity activity) {
    }

    public void onActivityResumed$hmutil_release(@NotNull Activity activity) {
    }
}
