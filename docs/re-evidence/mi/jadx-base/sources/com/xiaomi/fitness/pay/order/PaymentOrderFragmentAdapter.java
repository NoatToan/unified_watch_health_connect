package com.xiaomi.fitness.pay.order;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentOrderFragmentAdapter extends FragmentStateAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOrderFragmentAdapter(@NotNull FragmentManager fragmentManager, @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new PaymentOrderWatchFaceListFragment();
        }
        if (position != 1) {
            return position != 2 ? new PaymentOrderWatchFaceListFragment() : new PaymentOrderOtherFragment();
        }
        return new PaymentOrderCourseVipListFragment();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 3;
    }
}
