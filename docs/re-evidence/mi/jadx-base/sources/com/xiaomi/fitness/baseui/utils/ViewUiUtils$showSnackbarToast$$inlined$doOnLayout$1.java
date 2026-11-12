package com.xiaomi.fitness.baseui.utils;

import android.view.View;
import android.widget.TextView;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewUiUtils.kt\ncom/xiaomi/fitness/baseui/utils/ViewUiUtils\n*L\n1#1,414:1\n69#2:415\n70#2:420\n111#3,4:416\n*E\n"})
public final class ViewUiUtils$showSnackbarToast$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ int $maxLines$inlined;
    final /* synthetic */ int $minTextSizeSp$inlined;
    final /* synthetic */ TextView $tv$inlined;

    public ViewUiUtils$showSnackbarToast$$inlined$doOnLayout$1(TextView textView, int i, int i2) {
        this.$tv$inlined = textView;
        this.$maxLines$inlined = i;
        this.$minTextSizeSp$inlined = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        if (this.$tv$inlined.getLineCount() > this.$maxLines$inlined) {
            this.$tv$inlined.setTextSize(this.$minTextSizeSp$inlined);
        }
    }
}
