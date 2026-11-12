package com.xiaomi.fitness.common.utils;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.Toast;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ToastUtil;", "", "<init>", "()V", "sToast", "Landroid/widget/Toast;", "showToastNotUI", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "msgRes", "", "msg", "", "showToast", "showShortToast", "showLongToast", "showMergeToast", "showLongMergeToast", "duration", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ToastUtil {

    @NotNull
    public static final ToastUtil INSTANCE = new ToastUtil();

    @Nullable
    private static Toast sToast;

    private ToastUtil() {
    }

    @JvmStatic
    public static final void showLongToast(int msgRes) {
        showLongToast(AppUtil.getApp().getString(msgRes));
    }

    @JvmStatic
    public static final void showShortToast(int msgRes) {
        showShortToast(AppUtil.getApp().getString(msgRes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showToastNotUI$lambda$0(int i) {
        INSTANCE.showToast(i);
    }

    public final void showLongMergeToast(@NotNull String msg, int msgRes) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{msg, AppUtil.getApp().getString(msgRes)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        showLongToast(str);
    }

    public final void showMergeToast(@NotNull String msg, int msgRes) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{msg, AppUtil.getApp().getString(msgRes)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        showShortToast(str);
    }

    public final void showToast(int msgRes) {
        showShortToast(msgRes);
    }

    public final void showToastNotUI(@Nullable Activity activity, final int msgRes) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: rgp
            @Override // java.lang.Runnable
            public final void run() {
                ToastUtil.showToastNotUI$lambda$0(msgRes);
            }
        });
    }

    @JvmStatic
    public static final void showLongToast(@Nullable String msg) {
        INSTANCE.showToast(msg, 1);
    }

    @JvmStatic
    public static final void showShortToast(@Nullable String msg) {
        INSTANCE.showToast(msg, 0);
    }

    @JvmStatic
    public static final void showToast(@Nullable String msg) {
        showShortToast(msg);
    }

    public final void showLongMergeToast(int msgRes, @Nullable String msg) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{AppUtil.getApp().getString(msgRes), msg}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        showLongToast(str);
    }

    public final void showMergeToast(int msgRes, @Nullable String msg) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{AppUtil.getApp().getString(msgRes), msg}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        showShortToast(str);
    }

    private final void showToast(String msg, int duration) {
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        Toast toast = sToast;
        if (toast == null) {
            Toast toastMakeText = Toast.makeText(AppUtil.getApp(), msg, duration);
            toastMakeText.show();
            sToast = toastMakeText;
            return;
        }
        Intrinsics.checkNotNull(toast);
        toast.setText(msg);
        Toast toast2 = sToast;
        Intrinsics.checkNotNull(toast2);
        toast2.setDuration(duration);
        Toast toast3 = sToast;
        Intrinsics.checkNotNull(toast3);
        toast3.show();
    }

    public final void showToastNotUI(@Nullable Activity activity, @Nullable final String msg) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: qgp
            @Override // java.lang.Runnable
            public final void run() {
                ToastUtil.showToast(msg);
            }
        });
    }
}
