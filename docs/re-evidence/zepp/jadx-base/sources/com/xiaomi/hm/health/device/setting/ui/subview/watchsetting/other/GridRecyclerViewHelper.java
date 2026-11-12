package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.other;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001e\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/other/GridRecyclerViewHelper;", "", "", "setup", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "c", LogUtil.I, "getSpanCount", "()I", "spanCount", "", GoogleApiAvailabilityLight.a, "F", "getEdgeSpace", "()F", "edgeSpace", "e", "getSpace", "space", "<init>", "(Landroid/app/Activity;Landroidx/recyclerview/widget/RecyclerView;IFF)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GridRecyclerViewHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView recyclerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int spanCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float edgeSpace;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float space;

    public GridRecyclerViewHelper(@NotNull Activity activity, @NotNull RecyclerView recyclerView, int i, float f, float f2) {
        this.activity = activity;
        this.recyclerView = recyclerView;
        this.spanCount = i;
        this.edgeSpace = f;
        this.space = f2;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final float getEdgeSpace() {
        return this.edgeSpace;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final float getSpace() {
        return this.space;
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    public final void setup() {
        this.recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.other.GridRecyclerViewHelper.setup.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                float edgeSpace;
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                RecyclerView.Adapter adapter = parent.getAdapter();
                Integer numValueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
                if (numValueOf == null) {
                    return;
                }
                int iIntValue = numValueOf.intValue();
                int spanCount = childAdapterPosition % GridRecyclerViewHelper.this.getSpanCount();
                float space = ((GridRecyclerViewHelper.this.getSpace() * (GridRecyclerViewHelper.this.getSpanCount() - 1)) + (GridRecyclerViewHelper.this.getEdgeSpace() * 2)) / GridRecyclerViewHelper.this.getSpanCount();
                int spanCount2 = childAdapterPosition / GridRecyclerViewHelper.this.getSpanCount();
                float edgeSpace2 = GridRecyclerViewHelper.this.getEdgeSpace();
                float edgeSpace3 = 0.0f;
                if (GridRecyclerViewHelper.this.getEdgeSpace() == 0.0f) {
                    edgeSpace = spanCount * (GridRecyclerViewHelper.this.getSpace() - space);
                } else {
                    if (childAdapterPosition < GridRecyclerViewHelper.this.getSpanCount()) {
                        edgeSpace3 = GridRecyclerViewHelper.this.getEdgeSpace();
                        if (iIntValue / GridRecyclerViewHelper.this.getSpanCount() == spanCount2) {
                            edgeSpace2 = 0.0f;
                        }
                    }
                    edgeSpace = GridRecyclerViewHelper.this.getEdgeSpace() - (spanCount * (GridRecyclerViewHelper.this.getSpace() - space));
                }
                outRect.set((int) edgeSpace, (int) edgeSpace3, (int) (space - edgeSpace), (int) edgeSpace2);
            }
        });
    }
}
