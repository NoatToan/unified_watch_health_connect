package com.xiaomi.fitness.trail.adapter;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fitness.trail.RecordListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordPageAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "indicator", "Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter;", "category", "", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter;Ljava/lang/String;)V", "getItemCount", "", "createFragment", "Lcom/xiaomi/fitness/trail/RecordListFragment;", "position", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordPageAdapter extends FragmentStateAdapter {

    @NotNull
    private final String category;

    @NotNull
    private final IndicatorAdapter indicator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordPageAdapter(@NotNull Fragment fragment, @NotNull IndicatorAdapter indicator, @NotNull String category) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(category, "category");
        this.indicator = indicator;
        this.category = category;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.indicator.getCount();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public RecordListFragment createFragment(int position) {
        IndicatorAdapter indicatorAdapter = this.indicator;
        IndicatorAdapter.Indicator value = indicatorAdapter.getValue(position);
        return RecordListFragment.INSTANCE.instance(this.category, indicatorAdapter.getTimeDim(), value.getStart(), value.getEnd(), position);
    }
}
