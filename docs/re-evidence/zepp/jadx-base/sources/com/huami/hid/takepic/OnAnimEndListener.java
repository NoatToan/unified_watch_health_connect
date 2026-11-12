package com.huami.hid.takepic;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/hid/takepic/OnAnimEndListener;", "", "Lcom/huami/hid/takepic/AdaptedLoadingDialog;", "dialog", "", "onAnimEnd", "onDismiss", "hid_release"}, k = 1, mv = {1, 5, 1})
public interface OnAnimEndListener {
    void onAnimEnd(@NotNull AdaptedLoadingDialog dialog);

    void onDismiss(@NotNull AdaptedLoadingDialog dialog);
}
