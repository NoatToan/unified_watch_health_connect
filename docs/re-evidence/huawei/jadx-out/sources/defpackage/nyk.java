package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class nyk extends HealthFragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Fragment> f43951a;

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter, com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public nyk(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f43951a = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
    public Fragment getItem(int i) {
        List<Fragment> list = this.f43951a;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.f43951a.get(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.f43951a.size();
    }
}
