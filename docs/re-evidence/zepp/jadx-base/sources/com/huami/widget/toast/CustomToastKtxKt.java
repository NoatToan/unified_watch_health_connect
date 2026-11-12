package com.huami.widget.toast;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\b"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "message", "", "isLong", "", "showToast", "Landroid/app/Activity;", "toast_release"}, k = 2, mv = {1, 5, 1})
public final class CustomToastKtxKt {
    public static final void showToast(@NotNull Fragment fragment, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            CustomToast.showLong(fragment.requireContext(), charSequence);
        } else {
            CustomToast.showShort(fragment.requireContext(), charSequence);
        }
    }

    public static /* synthetic */ void showToast$default(Fragment fragment, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        showToast(fragment, charSequence, z);
    }

    public static /* synthetic */ void showToast$default(Activity activity, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        showToast(activity, charSequence, z);
    }

    public static final void showToast(@NotNull Activity activity, @NotNull CharSequence charSequence, boolean z) {
        if (z) {
            CustomToast.showLong(activity, charSequence);
        } else {
            CustomToast.showShort(activity, charSequence);
        }
    }
}
