package com.huami.message.ui.message;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/huami/message/ui/message/VerticalLinearSpacingDecoration;", "Landroidx/recyclerview/widget/DividerItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "", "a", LogUtil.I, "horizontalSpacing", "b", "verticalSpacing", "c", "marginTop", GoogleApiAvailabilityLight.a, "marginBottom", "e", "headerCount", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "orientation", "<init>", "(Landroid/content/Context;IIIIII)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class VerticalLinearSpacingDecoration extends DividerItemDecoration {

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

    public /* synthetic */ VerticalLinearSpacingDecoration(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        int a = (adapter == null ? 0 : adapter.getA()) - 1;
        if (childAdapterPosition == 0) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        if (childAdapterPosition == a) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        if (childAdapterPosition >= this.headerCount) {
            int i = this.horizontalSpacing;
            outRect.left = i;
            outRect.right = i;
            if (childAdapterPosition == a) {
                outRect.bottom = this.marginBottom;
            } else {
                if (childAdapterPosition == 0) {
                    outRect.top = this.marginTop;
                }
                outRect.bottom = this.verticalSpacing;
            }
        }
        super.getItemOffsets(outRect, view, parent, state);
    }

    public VerticalLinearSpacingDecoration(@NotNull Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        super(context, i);
        this.horizontalSpacing = i2;
        this.verticalSpacing = i3;
        this.marginTop = i4;
        this.marginBottom = i5;
        this.headerCount = i6;
    }
}
