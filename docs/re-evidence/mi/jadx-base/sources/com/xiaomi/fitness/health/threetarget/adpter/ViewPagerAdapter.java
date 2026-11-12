package com.xiaomi.fitness.health.threetarget.adpter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fitness.health.threetarget.ThreeTargetWeekFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/ViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "clz", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/health/threetarget/ThreeTargetWeekFragment;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/Class;)V", "getClz", "()Ljava/lang/Class;", "mFragmentClass", "getMFragmentClass", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewPagerAdapter extends FragmentStateAdapter {

    @Nullable
    private final Class<ThreeTargetWeekFragment> clz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerAdapter(@NotNull FragmentActivity fragmentActivity, @Nullable Class<ThreeTargetWeekFragment> cls) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.clz = cls;
    }

    private final Class<ThreeTargetWeekFragment> getMFragmentClass() {
        return this.clz;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        Class<ThreeTargetWeekFragment> mFragmentClass = getMFragmentClass();
        ThreeTargetWeekFragment threeTargetWeekFragmentNewInstance = mFragmentClass != null ? mFragmentClass.newInstance() : null;
        Intrinsics.checkNotNull(threeTargetWeekFragmentNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.health.threetarget.ThreeTargetWeekFragment");
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 959 - position);
        threeTargetWeekFragmentNewInstance.setArguments(bundle);
        return threeTargetWeekFragmentNewInstance;
    }

    @Nullable
    public final Class<ThreeTargetWeekFragment> getClz() {
        return this.clz;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 960;
    }
}
