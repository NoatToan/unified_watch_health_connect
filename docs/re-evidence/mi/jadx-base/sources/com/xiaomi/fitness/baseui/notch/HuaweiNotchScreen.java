package com.xiaomi.fitness.baseui.notch;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J\u001a\u0010\t\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J$\u0010\u000b\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/HuaweiNotchScreen;", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen;", "<init>", "()V", "hasNotch", "", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setDisplayInNotch", "", "getNotchRect", "callback", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchSizeCallback;", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(26)
public final class HuaweiNotchScreen implements INotchScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FLAG_NOTCH_SUPPORT = 65536;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/HuaweiNotchScreen$Companion;", "", "<init>", "()V", "FLAG_NOTCH_SUPPORT", "", "setNotDisplayInNotch", "", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setNotDisplayInNotch(@Nullable WeakReference<Activity> activityWeakReference) {
            Activity activity;
            if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
                return;
            }
            try {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                cls.getMethod("clearHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
                window.getWindowManager().updateViewLayout(window.getDecorView(), window.getDecorView().getLayoutParams());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public void getNotchRect(@Nullable WeakReference<Activity> activityWeakReference, @Nullable INotchScreen.NotchSizeCallback callback) {
        Activity activity;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return;
        }
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object objInvoke = clsLoadClass.getMethod("getNotchSize", new Class[0]).invoke(clsLoadClass, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) objInvoke;
            ArrayList arrayList = new ArrayList();
            arrayList.add(ScreenUtil.INSTANCE.calculateNotchRect(activity, iArr[0], iArr[1]));
            if (callback != null) {
                callback.onResult(arrayList);
            }
        } catch (Throwable unused) {
            if (callback != null) {
                callback.onResult(null);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public boolean hasNotch(@Nullable WeakReference<Activity> activityWeakReference) {
        Activity activity;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return false;
        }
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object objInvoke = clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public void setDisplayInNotch(@Nullable WeakReference<Activity> activityWeakReference) {
        Activity activity;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return;
        }
        try {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
            window.getWindowManager().updateViewLayout(window.getDecorView(), window.getDecorView().getLayoutParams());
        } catch (Throwable unused) {
        }
    }
}
