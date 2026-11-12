package com.xiaomi.fitness.detail.recycler;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fitness.detail.inner.SportDetailInnerFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportDetailInnerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "mFragmentList", "", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "getMFragmentList", "()Ljava/util/List;", "setMFragmentList", "(Ljava/util/List;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "getViewAtPosition", "Landroid/view/View;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportDetailInnerAdapter extends FragmentStateAdapter {

    @NotNull
    private List<SportDetailInnerFragment> mFragmentList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailInnerAdapter(@NotNull FragmentActivity fragmentActivity, @NotNull List<SportDetailInnerFragment> mFragmentList) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mFragmentList, "mFragmentList");
        this.mFragmentList = mFragmentList;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return this.mFragmentList.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mFragmentList.size();
    }

    @NotNull
    public final List<SportDetailInnerFragment> getMFragmentList() {
        return this.mFragmentList;
    }

    @Nullable
    public final View getViewAtPosition(int position) {
        return this.mFragmentList.get(position).getView();
    }

    public final void setMFragmentList(@NotNull List<SportDetailInnerFragment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mFragmentList = list;
    }
}
