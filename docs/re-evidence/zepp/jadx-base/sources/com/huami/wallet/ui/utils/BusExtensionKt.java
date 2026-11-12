package com.huami.wallet.ui.utils;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/view/View;", "", "setVisible", "setGone", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BusExtensionKt {
    public static final void setGone(@NotNull View view) {
        view.setVisibility(8);
    }

    public static final void setVisible(@NotNull View view) {
        view.setVisibility(0);
    }
}
