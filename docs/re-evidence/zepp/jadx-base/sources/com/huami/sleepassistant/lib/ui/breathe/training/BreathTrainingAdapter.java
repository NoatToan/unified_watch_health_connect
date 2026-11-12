package com.huami.sleepassistant.lib.ui.breathe.training;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/training/BreathTrainingAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "", "getPageTitle", "", "a", "Ljava/util/List;", "mFragments", "", "b", "mTitles", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BreathTrainingAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Fragment> mFragments;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<String> mTitles;

    public BreathTrainingAdapter(@NotNull FragmentManager fragmentManager, @NotNull List<Fragment> list, @NotNull List<String> list2) {
        super(fragmentManager, 1);
        this.mFragments = list;
        this.mTitles = list2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return this.mFragments.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NotNull
    public Fragment getItem(int position) {
        return this.mFragments.get(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int position) {
        return this.mTitles.get(position);
    }
}
