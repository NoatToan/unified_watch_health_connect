package com.huami.phn.coach.ui.adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.phn.coach.ui.fragment.PHNTrainingStatusFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/phn/coach/ui/adapter/PHNTrainingStatusChartAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "a", LogUtil.I, "fragmentsCount", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;I)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTrainingStatusChartAdapter extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int fragmentsCount;

    public PHNTrainingStatusChartAdapter(@NotNull AppCompatActivity appCompatActivity, int i) {
        super(appCompatActivity);
        this.fragmentsCount = i;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return new PHNTrainingStatusFragment(position, this.fragmentsCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount, reason: from getter */
    public int getPagerCount() {
        return this.fragmentsCount;
    }
}
