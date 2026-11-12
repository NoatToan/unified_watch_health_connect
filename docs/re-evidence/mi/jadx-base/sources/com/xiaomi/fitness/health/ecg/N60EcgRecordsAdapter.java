package com.xiaomi.fitness.health.ecg;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/N60EcgRecordsAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "getItemCount", "", "createFragment", "position", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class N60EcgRecordsAdapter extends FragmentStateAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N60EcgRecordsAdapter(@NotNull Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return (position == 0 || position == 1 || position == 2) ? N60EcgAllRecordsFragment.INSTANCE.instance(position) : N60EcgAllRecordsFragment.INSTANCE.instance(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 3;
    }
}
