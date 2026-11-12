package com.xiaomi.hm.health.mainpage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter;
import com.xiaomi.hm.health.view.pager.IconPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/NavigationAdapter;", "Lcom/xiaomi/hm/health/view/pager/CacheFragmentStatePagerAdapter;", "Lcom/xiaomi/hm/health/view/pager/IconPagerAdapter;", "", "index", "getIconResId", "getCount", "position", "Landroidx/fragment/app/Fragment;", "createItem", "", "getPageTitle", "Landroid/content/Context;", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/xiaomi/hm/health/mainpage/PageEntry;", "h", "Ljava/util/List;", "itemList", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NavigationAdapter extends CacheFragmentStatePagerAdapter implements IconPagerAdapter {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<PageEntry> itemList;

    public NavigationAdapter(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull List<PageEntry> list) {
        super(fragmentManager);
        this.context = context;
        this.itemList = list;
    }

    @Override // com.xiaomi.hm.health.view.pager.CacheFragmentStatePagerAdapter
    @NotNull
    public Fragment createItem(int position) {
        return this.itemList.get(position).getFragment();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return this.itemList.size();
    }

    @Override // com.xiaomi.hm.health.view.pager.IconPagerAdapter
    public int getIconResId(int index) {
        return this.itemList.get(index).getPageIcon();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public String getPageTitle(int position) {
        return this.context.getResources().getString(this.itemList.get(position).getPageTitle());
    }
}
