package com.huami.widget.toast;

import android.app.Activity;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\b\u001a\u00020\u0007*\u00020\t2\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u001c\u0010\n\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\f\u001a\u00020\u0007*\u00020\t2\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a(\u0010\f\u001a\u00020\u0007*\u00020\t2\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a(\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "icon", "", "message", "", "isLong", "", "showIconToast", "Landroid/app/Activity;", "showIconErrorToast", "showIconSuccessToast", "showHorizontalIconToast", "toast_release"}, k = 2, mv = {1, 5, 1})
public final class IconToastKtxKt {
    public static final void showHorizontalIconToast(@NotNull Activity activity, @DrawableRes int i, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showHorizontalIconToast(activity, i, charSequence, 1);
        } else {
            IconToast.showHorizontalIconToast(activity, i, charSequence, 0);
        }
    }

    public static /* synthetic */ void showHorizontalIconToast$default(Activity activity, int i, CharSequence charSequence, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        showHorizontalIconToast(activity, i, charSequence, z);
    }

    public static final void showIconErrorToast(@NotNull Fragment fragment, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showErrorLong(fragment.requireContext(), charSequence);
        } else {
            IconToast.showError(fragment.requireContext(), charSequence);
        }
    }

    public static /* synthetic */ void showIconErrorToast$default(Fragment fragment, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        showIconErrorToast(fragment, charSequence, z);
    }

    public static final void showIconSuccessToast(@NotNull Fragment fragment, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showSuccessLong(fragment.requireContext(), charSequence);
        } else {
            IconToast.showSuccess(fragment.requireContext(), charSequence);
        }
    }

    public static /* synthetic */ void showIconSuccessToast$default(Fragment fragment, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        showIconSuccessToast(fragment, charSequence, z);
    }

    public static final void showIconToast(@NotNull Fragment fragment, @DrawableRes int i, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showToast(fragment.requireContext(), i, charSequence, 1);
        } else {
            IconToast.showToast(fragment.requireContext(), i, charSequence, 0);
        }
    }

    public static /* synthetic */ void showIconToast$default(Fragment fragment, int i, CharSequence charSequence, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        showIconToast(fragment, i, charSequence, z);
    }

    public static /* synthetic */ void showHorizontalIconToast$default(Activity activity, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        showHorizontalIconToast(activity, i, i2, z);
    }

    public static /* synthetic */ void showIconErrorToast$default(Activity activity, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        showIconErrorToast(activity, charSequence, z);
    }

    public static /* synthetic */ void showIconSuccessToast$default(Activity activity, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        showIconSuccessToast(activity, charSequence, z);
    }

    public static /* synthetic */ void showIconToast$default(Activity activity, int i, CharSequence charSequence, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        showIconToast(activity, i, charSequence, z);
    }

    public static final void showHorizontalIconToast(@NotNull Activity activity, @DrawableRes int i, @StringRes int i2, boolean z) {
        if (z) {
            IconToast.showHorizontalIconToast(activity, i, activity.getResources().getString(i2), 1);
        } else {
            IconToast.showHorizontalIconToast(activity, i, activity.getResources().getString(i2), 0);
        }
    }

    public static /* synthetic */ void showHorizontalIconToast$default(Fragment fragment, int i, CharSequence charSequence, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        showHorizontalIconToast(fragment, i, charSequence, z);
    }

    public static final void showIconErrorToast(@NotNull Activity activity, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showErrorLong(activity, charSequence);
        } else {
            IconToast.showError(activity, charSequence);
        }
    }

    public static final void showIconSuccessToast(@NotNull Activity activity, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showSuccessLong(activity, charSequence);
        } else {
            IconToast.showSuccess(activity, charSequence);
        }
    }

    public static final void showIconToast(@NotNull Activity activity, @DrawableRes int i, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showToast(activity, i, charSequence, 1);
        } else {
            IconToast.showToast(activity, i, charSequence, 0);
        }
    }

    public static /* synthetic */ void showHorizontalIconToast$default(Fragment fragment, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        showHorizontalIconToast(fragment, i, i2, z);
    }

    public static final void showHorizontalIconToast(@NotNull Fragment fragment, @DrawableRes int i, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            IconToast.showHorizontalIconToast(fragment.requireContext(), i, charSequence, 1);
        } else {
            IconToast.showHorizontalIconToast(fragment.requireContext(), i, charSequence, 0);
        }
    }

    public static final void showHorizontalIconToast(@NotNull Fragment fragment, @DrawableRes int i, @StringRes int i2, boolean z) {
        if (z) {
            IconToast.showHorizontalIconToast(fragment.requireContext(), i, fragment.getResources().getString(i2), 1);
        } else {
            IconToast.showHorizontalIconToast(fragment.requireContext(), i, fragment.getResources().getString(i2), 0);
        }
    }
}
