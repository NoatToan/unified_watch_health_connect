package com.xiaomi.hm.health.device.setting.ui.widget;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u000b\u001a\u00020\n2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/widget/AutoHeightGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "widthSpec", "heightSpec", "", "onMeasure", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "spanCount", "<init>", "(Landroid/content/Context;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AutoHeightGridLayoutManager extends GridLayoutManager {
    public AutoHeightGridLayoutManager(@NotNull Context context, int i) {
        super(context, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state, int widthSpec, int heightSpec) {
        View viewForPosition;
        if (state.getItemCount() <= 0) {
            super.onMeasure(recycler, state, widthSpec, heightSpec);
            return;
        }
        try {
            viewForPosition = recycler.getViewForPosition(0);
        } catch (Throwable unused) {
            viewForPosition = null;
        }
        if (viewForPosition == null) {
            return;
        }
        measureChild(viewForPosition, widthSpec, heightSpec);
        setMeasuredDimension(widthSpec, viewForPosition.getMeasuredHeight() * (state.getItemCount() / getSpanCount()));
    }
}
