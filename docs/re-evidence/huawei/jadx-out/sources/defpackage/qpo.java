package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.ui.commonui.subtab.HealthSubTabListener;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qpo extends HealthPagerAdapter implements HealthSubTabListener, HealthViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<View> f46612a = new ArrayList(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthSubTabWidget f46613b;
    private final HealthViewPager d;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
    }

    public qpo(HealthViewPager healthViewPager, HealthSubTabWidget healthSubTabWidget) {
        this.f46613b = healthSubTabWidget;
        this.d = healthViewPager;
        healthViewPager.setAdapter(this);
        healthViewPager.addOnPageChangeListener(this);
    }

    public void c(xfz xfzVar, View view, boolean z) {
        if (xfzVar == null || view == null) {
            LogUtil.d("HealthSubTabViewAdapter", "Parameter subTab and view of method add SubTab should not be null.");
            return;
        }
        if (xfzVar.d() == null) {
            xfzVar.c(this);
        }
        xfzVar.e(view);
        this.f46612a.add(view);
        notifyDataSetChanged();
        this.f46613b.b(xfzVar, z);
    }

    public void b() {
        this.f46612a.clear();
        this.f46613b.h();
        notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.f46612a.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f46612a, i)) {
            return null;
        }
        View view = this.f46612a.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.f46613b.setSubTabScrollingOffsets(i, f);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.f46613b.setSubTabSelected(i);
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        Object objG = xfzVar.g();
        if (objG instanceof View) {
            View view = (View) objG;
            int size = this.f46612a.size();
            for (int i = 0; i < size; i++) {
                if (this.f46612a.get(i) == view) {
                    this.d.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        for (int i = 0; i < this.f46612a.size(); i++) {
            if (obj.equals(this.f46612a.get(i))) {
                return i;
            }
        }
        return -2;
    }
}
