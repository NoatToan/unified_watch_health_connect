package com.xiaomi.fitness.sport.sporttab.recycler;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/HorizontalCardListItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "itemSize", "I", "", "marginEdge", "F", "marginInBetween", "<init>", "(IFF)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HorizontalCardListItemDecoration extends RecyclerView.n {
    private final int itemSize;
    private final float marginEdge;
    private final float marginInBetween;

    public HorizontalCardListItemDecoration(int i, float f, float f2) {
        this.itemSize = i;
        this.marginEdge = f;
        this.marginInBetween = f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zIsRtl = UIUtils.INSTANCE.isRtl();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.itemSize;
        if (i <= 1) {
            float f = this.marginEdge;
            outRect.left = (int) f;
            outRect.right = (int) f;
        } else {
            if (zIsRtl) {
                if (childAdapterPosition == 0) {
                    outRect.right = (int) this.marginEdge;
                } else {
                    outRect.right = (int) this.marginInBetween;
                }
                if (childAdapterPosition == i - 1) {
                    outRect.left = (int) this.marginEdge;
                    return;
                }
                return;
            }
            if (childAdapterPosition == 0) {
                outRect.left = (int) this.marginEdge;
            } else {
                outRect.left = (int) this.marginInBetween;
            }
            if (childAdapterPosition == i - 1) {
                outRect.right = (int) this.marginEdge;
            }
        }
    }
}
