package com.xiaomi.fitness.share.amap.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/share/amap/utils/ViewHeightWrapper;", "", "target", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mTarget", "height", "", "getHeight", "()I", "setHeight", "(I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewHeightWrapper {

    @NotNull
    private final View mTarget;

    public ViewHeightWrapper(@NotNull View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.mTarget = target;
    }

    public final int getHeight() {
        return this.mTarget.getLayoutParams().height;
    }

    public final void setHeight(int i) {
        this.mTarget.getLayoutParams().height = i;
        this.mTarget.requestLayout();
    }
}
