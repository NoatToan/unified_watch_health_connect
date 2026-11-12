package com.huami.message.ui.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.huami.message.ui.message.MessageFragment;
import com.huami.message.ui.notification.NotificationFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/message/ui/home/McFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "", "a", "Ljava/util/List;", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "fragments", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class McFragmentPagerAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<Fragment> fragments;

    public McFragmentPagerAdapter(@NotNull FragmentManager fragmentManager) {
        super(fragmentManager);
        ArrayList arrayList = new ArrayList();
        this.fragments = arrayList;
        arrayList.add(NotificationFragment.INSTANCE.newInstance());
        arrayList.add(MessageFragment.INSTANCE.newInstance());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return this.fragments.size();
    }

    @NotNull
    public final List<Fragment> getFragments() {
        return this.fragments;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NotNull
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    public final void setFragments(@NotNull List<Fragment> list) {
        this.fragments = list;
    }
}
