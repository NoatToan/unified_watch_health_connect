package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.ui.commonui.viewpager.HealthFragmentPagerAdapter;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class dcq extends HealthFragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31610b;
    private final List<Fragment> d;

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentPagerAdapter, com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public dcq(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.d = new ArrayList();
        this.f31610b = 0;
        a(list);
    }

    public void a(List<Fragment> list) {
        this.d.clear();
        if (list != null) {
            this.d.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void a(int i) {
        LogUtil.b("HealthFragmentAdapter", "setItemShowChange current=", Integer.valueOf(i), " mLastIndex=", Integer.valueOf(this.f31610b));
        if (i >= 0 && i < this.d.size()) {
            this.d.get(i).onHiddenChanged(false);
        }
        if (this.f31610b >= 0) {
            int size = this.d.size();
            int i2 = this.f31610b;
            if (size > i2) {
                this.d.get(i2).onHiddenChanged(true);
            }
        }
        this.f31610b = i;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentPagerAdapter
    public Fragment getItem(int i) {
        if (i >= this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.d.size();
    }
}
