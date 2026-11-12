package com.xiaomi.fitness.common.recycer.expandable;

import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableAdapterHelper;", "", "<init>", "()V", "TAG", "", "isAttachBottom", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpandableAdapterHelper {

    @NotNull
    public static final ExpandableAdapterHelper INSTANCE = new ExpandableAdapterHelper();

    @NotNull
    public static final String TAG = "ExpandableAdapterHelper";

    private ExpandableAdapterHelper() {
    }

    public final boolean isAttachBottom(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int iComputeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        boolean z = iComputeVerticalScrollExtent + iComputeVerticalScrollOffset >= iComputeVerticalScrollRange;
        Logger.d(TAG, "isAttachBottom:" + z + ";value:" + iComputeVerticalScrollExtent + ";" + iComputeVerticalScrollOffset + ";" + iComputeVerticalScrollRange);
        return z;
    }
}
