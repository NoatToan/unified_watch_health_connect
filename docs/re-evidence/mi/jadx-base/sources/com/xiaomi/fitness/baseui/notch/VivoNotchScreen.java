package com.xiaomi.fitness.baseui.notch;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J\u001a\u0010\t\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0017J$\u0010\u000b\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/VivoNotchScreen;", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen;", "<init>", "()V", "hasNotch", "", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setDisplayInNotch", "", "getNotchRect", "callback", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchSizeCallback;", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(26)
public final class VivoNotchScreen implements INotchScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/VivoNotchScreen$Companion;", "", "<init>", "()V", "isNotch", "", "()Z", "getNotchHeight", "", "context", "Landroid/content/Context;", "getNotchWidth", "getDensity", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float getDensity(Context context) {
            return context.getResources().getDisplayMetrics().density;
        }

        public final int getNotchHeight(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (int) (27 * getDensity(context));
        }

        public final int getNotchWidth(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (int) (100 * getDensity(context));
        }

        public final boolean isNotch() {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                Object objInvoke = cls.getMethod("isFtFeatureSupport", Integer.TYPE).invoke(cls.newInstance(), 32);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public void getNotchRect(@Nullable WeakReference<Activity> activityWeakReference, @Nullable INotchScreen.NotchSizeCallback callback) {
        Activity activity;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ScreenUtil screenUtil = ScreenUtil.INSTANCE;
        Companion companion = INSTANCE;
        arrayList.add(screenUtil.calculateNotchRect(activity, companion.getNotchWidth(activity), companion.getNotchHeight(activity)));
        if (callback != null) {
            callback.onResult(arrayList);
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public boolean hasNotch(@Nullable WeakReference<Activity> activityWeakReference) {
        return INSTANCE.isNotch();
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    @Deprecated(message = "")
    public void setDisplayInNotch(@Nullable WeakReference<Activity> activityWeakReference) {
    }
}
