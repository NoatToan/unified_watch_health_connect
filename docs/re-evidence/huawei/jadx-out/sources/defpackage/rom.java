package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class rom extends HwFragmentStatePagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Fragment> f47541c;

    public rom(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f47541c = new ArrayList();
        d(list);
    }

    public void d(List<Fragment> list) {
        this.f47541c.clear();
        if (list != null) {
            this.f47541c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
    public Fragment getItem(int i) {
        if (i >= this.f47541c.size()) {
            return null;
        }
        return this.f47541c.get(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.f47541c.size();
    }

    public void c(Fragment fragment) {
        this.f47541c.add(fragment);
        notifyDataSetChanged();
    }
}
