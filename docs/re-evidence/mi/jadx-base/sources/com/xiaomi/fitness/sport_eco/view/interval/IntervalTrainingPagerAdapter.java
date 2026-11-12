package com.xiaomi.fitness.sport_eco.view.interval;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingPagerAdapter;", "Landroidx/fragment/app/i;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "getCount", "()I", "", "fragments", "Ljava/util/List;", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "Landroidx/fragment/app/FragmentManager;", "manager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IntervalTrainingPagerAdapter extends i {

    @NotNull
    private List<Fragment> fragments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntervalTrainingPagerAdapter(@NotNull FragmentManager manager, @NotNull List<Fragment> fragments) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        this.fragments = fragments;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.fragments.size();
    }

    @NotNull
    public final List<Fragment> getFragments() {
        return this.fragments;
    }

    @Override // androidx.fragment.app.i
    @NotNull
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    public final void setFragments(@NotNull List<Fragment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fragments = list;
    }
}
