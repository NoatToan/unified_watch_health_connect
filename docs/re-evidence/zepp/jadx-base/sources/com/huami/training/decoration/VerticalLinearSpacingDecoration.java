package com.huami.training.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huami/training/decoration/VerticalLinearSpacingDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "", "a", LogUtil.I, "horizontalSpacing", "b", "verticalSpacing", "c", "marginTop", GoogleApiAvailabilityLight.a, "marginBottom", "e", "headerCount", "<init>", "(IIIII)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class VerticalLinearSpacingDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int horizontalSpacing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int verticalSpacing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int marginTop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int marginBottom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int headerCount;

    public VerticalLinearSpacingDecoration() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public /* synthetic */ VerticalLinearSpacingDecoration(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter == null ? 0 : adapter.getItemCount();
        if (childAdapterPosition >= this.headerCount) {
            int i = this.horizontalSpacing;
            outRect.left = i;
            outRect.right = i;
            if (childAdapterPosition == itemCount - 1) {
                outRect.bottom = this.marginBottom;
                return;
            }
            if (childAdapterPosition == 0) {
                outRect.top = this.marginTop;
            }
            outRect.bottom = this.verticalSpacing;
        }
    }

    public VerticalLinearSpacingDecoration(int i, int i2, int i3, int i4, int i5) {
        this.horizontalSpacing = i;
        this.verticalSpacing = i2;
        this.marginTop = i3;
        this.marginBottom = i4;
        this.headerCount = i5;
    }
}
