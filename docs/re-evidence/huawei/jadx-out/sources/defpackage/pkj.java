package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.view.EditShareCustomFragment;
import com.huawei.pluginsocialshare.view.ShareItemFragment;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pkj extends HealthFragmentStatePagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<gxy> f45541b;
    private Fragment[] e;

    public pkj(FragmentManager fragmentManager, List<gxy> list) {
        super(fragmentManager);
        if (!njy.e(list)) {
            this.f45541b = list;
            this.e = new Fragment[list.size()];
        } else {
            LogUtil.j("Share_ShareFragmentPagerAdapter", "ShareFragmentPagerAdapter, shareEditContents is empty");
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<gxy> list = this.f45541b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
    public Fragment getItem(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        Fragment fragmentC = this.e[i];
        if (fragmentC == null) {
            if (this.f45541b.get(i).m()) {
                fragmentC = new EditShareCustomFragment();
            } else {
                fragmentC = ShareItemFragment.c(i);
            }
            this.e[i] = fragmentC;
        }
        return fragmentC;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public CharSequence getPageTitle(int i) {
        if (njy.e(this.f45541b, i)) {
            return null;
        }
        return this.f45541b.get(i).f();
    }
}
