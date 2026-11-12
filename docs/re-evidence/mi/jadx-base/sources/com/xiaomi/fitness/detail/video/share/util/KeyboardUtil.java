package com.xiaomi.fitness.detail.video.share.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/util/KeyboardUtil;", "", "<init>", "()V", "showSoftInputMethod", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "show", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyboardUtil {

    @NotNull
    public static final KeyboardUtil INSTANCE = new KeyboardUtil();

    private KeyboardUtil() {
    }

    public final void showSoftInputMethod(@NotNull Context context, @Nullable View view, boolean show) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (view == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (show) {
            inputMethodManager.showSoftInput(view, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
