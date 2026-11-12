package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.ui.commonui.subtab.HealthSubTabListener;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthFragmentPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qpn extends HealthFragmentPagerAdapter implements HealthSubTabListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qpl f46609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthViewPager f46610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HealthSubTabWidget f46611c;
    private final List<Fragment> e;

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
    }

    public qpn(FragmentActivity fragmentActivity, HealthViewPager healthViewPager, HealthSubTabWidget healthSubTabWidget) {
        super(fragmentActivity.getSupportFragmentManager());
        this.e = new ArrayList(3);
        this.f46611c = healthSubTabWidget;
        this.f46610b = healthViewPager;
        healthViewPager.setAdapter(this);
        qpl qplVar = new qpl(healthSubTabWidget);
        this.f46609a = qplVar;
        healthViewPager.addOnPageChangeListener(qplVar);
    }

    public qpn(FragmentManager fragmentManager, HealthViewPager healthViewPager, HealthSubTabWidget healthSubTabWidget) {
        super(fragmentManager);
        this.e = new ArrayList(3);
        this.f46611c = healthSubTabWidget;
        this.f46610b = healthViewPager;
        healthViewPager.setAdapter(this);
        qpl qplVar = new qpl(healthSubTabWidget);
        this.f46609a = qplVar;
        healthViewPager.addOnPageChangeListener(qplVar);
    }

    public void b(xfz xfzVar, Fragment fragment, boolean z) {
        if (xfzVar == null || fragment == null) {
            LogUtil.d("HealthSubTabAdapter", "Parameter subTab and fragment of method add SubTab should not be null.");
            return;
        }
        if (xfzVar.d() == null) {
            xfzVar.c(this);
        }
        xfzVar.e(fragment);
        this.e.add(fragment);
        notifyDataSetChanged();
        this.f46611c.b(xfzVar, z);
    }

    public void e(xfz xfzVar, int i, Fragment fragment, boolean z) {
        if (xfzVar == null || fragment == null) {
            LogUtil.d("HealthSubTabAdapter", "Parameter subTab and fragment of method add SubTab should not be null.");
            return;
        }
        if (xfzVar.d() == null) {
            xfzVar.c(this);
        }
        xfzVar.e(fragment);
        this.e.add(i, fragment);
        notifyDataSetChanged();
        this.f46611c.c(xfzVar, i, z);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentPagerAdapter
    public Fragment getItem(int i) {
        return qrs.c(this.e, i, "HealthSubTabAdapter");
    }

    public void b(int i) {
        if (this.f46611c == null) {
            LogUtil.c("HealthSubTabAdapter", "removeSubTab mSubTabWidget is null");
            return;
        }
        if (njy.c(this.e, i)) {
            xfz xfzVarA = this.f46611c.a(i);
            if (xfzVarA != null) {
                xfzVarA.e(null);
                xfzVarA.c(null);
            }
            this.f46611c.b(i);
            this.e.remove(i);
            notifyDataSetChanged();
        }
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

    @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentPagerAdapter
    public long getItemId(int i) {
        if (njy.e(this.e, i)) {
            return super.getItemId(i);
        }
        Fragment fragment = this.e.get(i);
        if (fragment == null) {
            return super.getItemId(i);
        }
        return fragment.hashCode();
    }

    @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
    public void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        Object objG = xfzVar.g();
        if (objG instanceof Fragment) {
            Fragment fragment = (Fragment) objG;
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                if (this.e.get(i) == fragment) {
                    this.f46610b.setCurrentItem(i);
                    return;
                }
            }
        }
    }
}
