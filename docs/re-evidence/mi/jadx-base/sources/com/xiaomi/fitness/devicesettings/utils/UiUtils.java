package com.xiaomi.fitness.devicesettings.utils;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/UiUtils;", "", "<init>", "()V", "closeDefaultAnimator", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UiUtils {

    @NotNull
    public static final UiUtils INSTANCE = new UiUtils();

    private UiUtils() {
    }

    public final void closeDefaultAnimator(@Nullable RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.w(0L);
            itemAnimator.x(0L);
            itemAnimator.z(0L);
            itemAnimator.A(0L);
            ((w) itemAnimator).V(false);
        }
        recyclerView.setItemAnimator(null);
    }
}
