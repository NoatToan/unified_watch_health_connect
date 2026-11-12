package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qtn extends HealthFragmentStatePagerAdapter {
    private List<Fragment> e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter, com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public qtn(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.e = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return qrs.c(this.e, i, "HealthFragmentStatePagerSimpleAdapter");
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.e.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        for (int i = 0; i < this.e.size(); i++) {
            if (obj.equals(this.e.get(i))) {
                return i;
            }
        }
        return -2;
    }
}
