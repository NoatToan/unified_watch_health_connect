package com.xiaomi.fitness.training_plan.report;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanShareMethodAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "wholePicBitmapUriStr", "", "mCustomerSharePlanReport", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;)V", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainPlanShareMethodAdapter extends FragmentStateAdapter {

    @NotNull
    public static final String TAG = "TrainPlanShareMethodAdapter";

    @Nullable
    private final CustomerSharePlanReport mCustomerSharePlanReport;

    @Nullable
    private final String wholePicBitmapUriStr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainPlanShareMethodAdapter(@NotNull FragmentActivity fragment, @Nullable String str, @Nullable CustomerSharePlanReport customerSharePlanReport) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.wholePicBitmapUriStr = str;
        this.mCustomerSharePlanReport = customerSharePlanReport;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return position == 0 ? DefaultTrainPlanReportShareFragment.INSTANCE.newInstance(String.valueOf(this.wholePicBitmapUriStr)) : DefaultTrainPlanReportShareFragment.INSTANCE.newInstance(String.valueOf(this.wholePicBitmapUriStr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 1;
    }
}
