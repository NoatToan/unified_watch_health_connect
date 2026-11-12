package com.xiaomi.fitness.sport.view.goal;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/SportGoalWrapperAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", DailyRecordKey.sportType, "", "deviceType", "wearMode", "<init>", "(Landroidx/fragment/app/Fragment;III)V", "getSportType", "()I", "getDeviceType", "getWearMode", "fragments", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport/view/goal/SportGoalSettingFragment;", "getItemCount", "createFragment", "position", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportGoalWrapperAdapter extends FragmentStateAdapter {
    private final int deviceType;

    @NotNull
    private final ArrayList<SportGoalSettingFragment> fragments;
    private final int sportType;
    private final int wearMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportGoalWrapperAdapter(@NotNull Fragment fragment, int i, int i2, int i3) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.sportType = i;
        this.deviceType = i2;
        this.wearMode = i3;
        this.fragments = new ArrayList<>();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        SportGoalSettingFragment sportGoalSettingFragmentNewInstance;
        int i;
        int i2 = this.sportType;
        int i3 = 2;
        if (i2 == 3 && (i = this.deviceType) == 0) {
            sportGoalSettingFragmentNewInstance = SportGoalSettingFragment.INSTANCE.newInstance(i2, (position == 0 || position != 1) ? 1 : 2, i, this.wearMode);
        } else {
            SportGoalSettingFragment.Companion companion = SportGoalSettingFragment.INSTANCE;
            if (position == 0) {
                i3 = 0;
            } else if (position == 1 || position != 2) {
                i3 = 1;
            }
            sportGoalSettingFragmentNewInstance = companion.newInstance(i2, i3, this.deviceType, this.wearMode);
        }
        this.fragments.add(sportGoalSettingFragmentNewInstance);
        return sportGoalSettingFragmentNewInstance;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return (this.sportType == 3 && this.deviceType == 0) ? 2 : 3;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getWearMode() {
        return this.wearMode;
    }
}
