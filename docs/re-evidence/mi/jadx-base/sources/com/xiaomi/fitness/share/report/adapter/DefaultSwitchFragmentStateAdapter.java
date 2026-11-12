package com.xiaomi.fitness.share.report.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.share.report.fragment.DefaultShareWholeReportFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/DefaultSwitchFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "bitmapUriStr", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/String;)V", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultSwitchFragmentStateAdapter extends FragmentStateAdapter {

    @Nullable
    private final String bitmapUriStr;

    @NotNull
    private final FragmentActivity fragment;

    @NotNull
    private final SportBasicReport sportReport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSwitchFragmentStateAdapter(@NotNull FragmentActivity fragment, @NotNull SportBasicReport sportReport, @Nullable String str) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        this.fragment = fragment;
        this.sportReport = sportReport;
        this.bitmapUriStr = str;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return position == 0 ? DefaultShareWholeReportFragment.INSTANCE.newInstance(this.sportReport, this.bitmapUriStr) : DefaultShareWholeReportFragment.INSTANCE.newInstance(this.sportReport, this.bitmapUriStr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 1;
    }
}
