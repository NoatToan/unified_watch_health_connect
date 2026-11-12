package com.huami.wallet.ui.utils;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u0001\u001a(\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0007"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "singleClick", "", "t", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class KTViewExtensionKt {
    public static final void singleClick(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
        view.setOnClickListener(new SingleClickListener(function1));
    }

    public static final void singleClick(@NotNull View view, int i, @NotNull Function1<? super View, Unit> function1) {
        view.setOnClickListener(new SingleClickListener(i, function1));
    }
}
