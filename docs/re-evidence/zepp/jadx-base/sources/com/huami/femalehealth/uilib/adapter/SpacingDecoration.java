package com.huami.femalehealth.uilib.adapter;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/SpacingDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "b", "a", "c", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "getItemOffsets", "", LogUtil.I, "horizontalSpacing", "verticalSpacing", "", "Z", "includeEdge", GoogleApiAvailabilityLight.a, "marginBottom", "e", "headerCount", "<init>", "(IIZII)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class SpacingDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int horizontalSpacing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int verticalSpacing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean includeEdge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int marginBottom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int headerCount;

    public SpacingDecoration() {
        this(0, 0, false, 0, 0, 31, null);
    }

    public /* synthetic */ SpacingDecoration(int i, int i2, boolean z, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    private final void a(Rect outRect, View view, RecyclerView parent) {
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int spanCount = gridLayoutManager.getSpanCount();
        int i = childAdapterPosition % spanCount;
        int orientation = gridLayoutManager.getOrientation();
        if (orientation == 0) {
            if (this.includeEdge) {
                int i2 = this.verticalSpacing;
                outRect.top = ((spanCount - i) * i2) / spanCount;
                outRect.bottom = (i2 * (i + 1)) / spanCount;
                if (gridLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition < spanCount) {
                        outRect.right = this.horizontalSpacing;
                    }
                    outRect.left = this.horizontalSpacing;
                    return;
                } else {
                    if (childAdapterPosition < spanCount) {
                        outRect.left = this.horizontalSpacing;
                    }
                    outRect.right = this.horizontalSpacing;
                    return;
                }
            }
            int i3 = this.verticalSpacing;
            outRect.top = (i3 * i) / spanCount;
            outRect.bottom = (i3 * ((spanCount - 1) - i)) / spanCount;
            if (gridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition >= spanCount) {
                    outRect.right = this.horizontalSpacing;
                    return;
                }
                return;
            } else {
                if (childAdapterPosition >= spanCount) {
                    outRect.left = this.horizontalSpacing;
                    return;
                }
                return;
            }
        }
        if (orientation != 1) {
            return;
        }
        if (this.includeEdge) {
            int i4 = this.horizontalSpacing;
            outRect.left = ((spanCount - i) * i4) / spanCount;
            outRect.right = (i4 * (i + 1)) / spanCount;
            if (gridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition < spanCount) {
                    outRect.bottom = this.verticalSpacing;
                }
                outRect.top = this.verticalSpacing;
                return;
            } else {
                if (childAdapterPosition < spanCount) {
                    outRect.top = this.verticalSpacing;
                }
                outRect.bottom = this.verticalSpacing;
                return;
            }
        }
        int i5 = this.horizontalSpacing;
        outRect.left = (i5 * i) / spanCount;
        outRect.right = (i5 * ((spanCount - 1) - i)) / spanCount;
        if (gridLayoutManager.getReverseLayout()) {
            if (childAdapterPosition >= spanCount) {
                outRect.bottom = this.verticalSpacing;
            }
        } else if (childAdapterPosition >= spanCount) {
            outRect.top = this.verticalSpacing;
        }
    }

    private final void b(Rect outRect, View view, RecyclerView parent) {
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int orientation = linearLayoutManager.getOrientation();
        if (orientation == 0) {
            if (this.includeEdge) {
                int i = this.verticalSpacing;
                outRect.top = i;
                outRect.bottom = i;
                if (linearLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition == 0) {
                        outRect.right = this.horizontalSpacing;
                    }
                    outRect.left = this.horizontalSpacing;
                    return;
                } else {
                    if (childAdapterPosition == 0) {
                        outRect.left = this.horizontalSpacing;
                    }
                    outRect.right = this.horizontalSpacing;
                    return;
                }
            }
            int i2 = this.verticalSpacing;
            outRect.top = i2;
            outRect.bottom = i2;
            if (linearLayoutManager.getReverseLayout()) {
                if (childAdapterPosition > 0) {
                    outRect.right = this.horizontalSpacing;
                    return;
                }
                return;
            } else {
                if (childAdapterPosition > 0) {
                    outRect.left = this.horizontalSpacing;
                    return;
                }
                return;
            }
        }
        if (orientation != 1) {
            return;
        }
        if (this.includeEdge) {
            int i3 = this.horizontalSpacing;
            outRect.left = i3;
            outRect.right = i3;
            if (linearLayoutManager.getReverseLayout()) {
                if (childAdapterPosition == 0) {
                    outRect.bottom = this.verticalSpacing;
                }
                outRect.top = this.verticalSpacing;
                return;
            } else {
                if (childAdapterPosition == 0) {
                    outRect.top = this.verticalSpacing;
                }
                outRect.bottom = this.verticalSpacing;
                return;
            }
        }
        int i4 = this.horizontalSpacing;
        outRect.left = i4;
        outRect.right = i4;
        if (linearLayoutManager.getReverseLayout()) {
            if (childAdapterPosition > 0) {
                outRect.bottom = this.verticalSpacing;
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        int a = adapter != null ? adapter.getA() : 0;
        if (childAdapterPosition >= this.headerCount) {
            if (childAdapterPosition == a - 1) {
                outRect.bottom = this.marginBottom;
            } else {
                outRect.bottom = this.verticalSpacing;
            }
        }
    }

    private final void c(Rect outRect, View view, RecyclerView parent) {
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        int orientation = staggeredGridLayoutManager.getOrientation();
        if (orientation == 0) {
            if (this.includeEdge) {
                int i = this.verticalSpacing;
                outRect.top = ((spanCount - spanIndex) * i) / spanCount;
                outRect.bottom = (i * (spanIndex + 1)) / spanCount;
                if (staggeredGridLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition < spanCount) {
                        outRect.right = this.horizontalSpacing;
                    }
                    outRect.left = this.horizontalSpacing;
                    return;
                } else {
                    if (childAdapterPosition < spanCount) {
                        outRect.left = this.horizontalSpacing;
                    }
                    outRect.right = this.horizontalSpacing;
                    return;
                }
            }
            int i2 = this.verticalSpacing;
            outRect.top = (i2 * spanIndex) / spanCount;
            outRect.bottom = (i2 * ((spanCount - 1) - spanIndex)) / spanCount;
            if (staggeredGridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition >= spanCount) {
                    outRect.right = this.horizontalSpacing;
                    return;
                }
                return;
            } else {
                if (childAdapterPosition >= spanCount) {
                    outRect.left = this.horizontalSpacing;
                    return;
                }
                return;
            }
        }
        if (orientation != 1) {
            return;
        }
        if (this.includeEdge) {
            int i3 = this.horizontalSpacing;
            outRect.left = ((spanCount - spanIndex) * i3) / spanCount;
            outRect.right = (i3 * (spanIndex + 1)) / spanCount;
            if (staggeredGridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition < spanCount) {
                    outRect.bottom = this.verticalSpacing;
                }
                outRect.top = this.verticalSpacing;
                return;
            } else {
                if (childAdapterPosition < spanCount) {
                    outRect.top = this.verticalSpacing;
                }
                outRect.bottom = this.verticalSpacing;
                return;
            }
        }
        int i4 = this.horizontalSpacing;
        outRect.left = (i4 * spanIndex) / spanCount;
        outRect.right = (i4 * ((spanCount - 1) - spanIndex)) / spanCount;
        if (staggeredGridLayoutManager.getReverseLayout()) {
            if (childAdapterPosition >= spanCount) {
                outRect.bottom = this.verticalSpacing;
            }
        } else if (childAdapterPosition >= spanCount) {
            outRect.top = this.verticalSpacing;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            a(outRect, view, parent);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            c(outRect, view, parent);
        } else if (layoutManager instanceof LinearLayoutManager) {
            b(outRect, view, parent);
        }
    }

    public SpacingDecoration(int i, int i2, boolean z, int i3, int i4) {
        this.horizontalSpacing = i;
        this.verticalSpacing = i2;
        this.includeEdge = z;
        this.marginBottom = i3;
        this.headerCount = i4;
    }
}
