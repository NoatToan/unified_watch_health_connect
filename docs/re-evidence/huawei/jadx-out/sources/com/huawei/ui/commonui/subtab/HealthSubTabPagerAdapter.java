package com.huawei.ui.commonui.subtab;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.viewpager.HealthEmptyFragment;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;
import defpackage.njy;
import defpackage.qpm;
import defpackage.xft;
import defpackage.xfz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSubTabPagerAdapter extends FragmentStatePagerAdapter implements ViewPager.OnPageChangeListener, HwSubTabWidget.OnSubTabChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FragmentTransaction f23900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthSubTabWidget f23901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FragmentManager f23902c;
    private Fragment d;
    protected ViewPager e;
    private final Handler f;
    private boolean g;
    private ArrayList<e> h;
    private boolean i;
    private boolean j;
    private int k;
    private final List<qpm> o;

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
    public void onSubTabReselected(xfz xfzVar) {
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
    public void onSubTabUnselected(xfz xfzVar) {
    }

    public HealthSubTabPagerAdapter(FragmentManager fragmentManager, ViewPager viewPager, HealthSubTabWidget healthSubTabWidget) {
        super(fragmentManager);
        this.g = true;
        this.f23900a = null;
        this.h = new ArrayList<>();
        this.d = null;
        this.j = false;
        this.o = new ArrayList(2);
        this.i = true;
        this.k = 0;
        this.f = new a(this);
        this.f23902c = fragmentManager;
        this.f23901b = healthSubTabWidget;
        this.e = viewPager;
        viewPager.setAdapter(this);
        this.e.addOnPageChangeListener(this);
        this.f23901b.setOnSubTabChangeListener(this);
    }

    public void a() {
        LogUtil.a("HealthSubTabPagerAdapter", "unbindViews");
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
        }
        HealthSubTabWidget healthSubTabWidget = this.f23901b;
        if (healthSubTabWidget != null) {
            healthSubTabWidget.setOnSubTabChangeListener(null);
        }
    }

    public void c(xfz xfzVar, qpm qpmVar, boolean z) {
        if (xfzVar == null || qpmVar == null) {
            LogUtil.j("HealthSubTabPagerAdapter", "Parameter subTab and fragment of method add SubTab should not be null.");
            return;
        }
        for (qpm qpmVar2 : this.o) {
            if (qpmVar2.c() == qpmVar.c() || qpmVar2.d() == qpmVar.d()) {
                LogUtil.e("HealthSubTabPagerAdapter", "try to add duplicated bean");
                return;
            }
        }
        xfzVar.e(qpmVar);
        this.o.add(qpmVar);
        this.f23901b.b(xfzVar, z);
        notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        qpm qpmVarA = a(i);
        if (qpmVarA != null) {
            return qpmVarA.d();
        }
        return new HealthEmptyFragment();
    }

    private qpm a(int i) {
        int size = this.o.size();
        if (i < 0 || i >= size) {
            return null;
        }
        return this.o.get(i);
    }

    public void a(List<qpm> list, int i) {
        this.o.clear();
        if (list != null) {
            this.o.addAll(list);
        }
        ViewPager viewPager = this.e;
        if (viewPager instanceof HealthNativeViewPager) {
            ((HealthNativeViewPager) viewPager).setInitItem(i);
        }
        notifyDataSetChanged();
    }

    private boolean a(qpm qpmVar, qpm qpmVar2) {
        return qpmVar != null && qpmVar.equals(qpmVar2);
    }

    private int a(qpm qpmVar) {
        return this.o.indexOf(qpmVar);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.o.size();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (!this.g) {
            LogUtil.e("HealthSubTabPagerAdapter", "onPageScrolled not accessed");
            return;
        }
        if (this.i) {
            this.f23901b.setIsViewPagerScroll(true);
            this.f23901b.setSubTabScrollingOffsets(i, f);
            e();
            f();
        }
        if (f == 0.0f && this.k == this.e.getCurrentItem()) {
            this.i = true;
            e();
            this.f23901b.setIsViewPagerScroll(false);
            this.f23901b.setSubTabClicked(false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.g) {
            this.f23901b.setSubTabSelected(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (!this.g) {
            LogUtil.e("HealthSubTabPagerAdapter", "onPageScrollStateChanged not accessed");
        } else if (i == 0) {
            e();
            this.f23901b.setIsViewPagerScroll(false);
        }
    }

    private void d(xfz xfzVar) {
        Object objG = xfzVar.g();
        if (!(objG instanceof qpm)) {
            LogUtil.e("HealthSubTabPagerAdapter", "tabTag is not an instance of FragmentSubTabPagerBean");
            return;
        }
        qpm qpmVar = (qpm) objG;
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            if (this.o.get(i) == qpmVar) {
                notifyDataSetChanged();
                this.e.setCurrentItem(i);
                LogUtil.a("HealthSubTabPagerAdapter", "found tab, index: ", Integer.valueOf(i));
                return;
            }
        }
        LogUtil.e("HealthSubTabPagerAdapter", "found no tabs, ", objG, " mSubTabBeans: ", this.o);
    }

    public void c(List<qpm> list) {
        if (list == null || list.size() != this.o.size()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Collections.swap(this.o, i, this.o.indexOf(list.get(i)));
        }
        notifyDataSetChanged();
    }

    public List<qpm> b() {
        ArrayList arrayList = new ArrayList();
        for (qpm qpmVar : this.o) {
            if (qpmVar.c() != -2 && qpmVar.c() != -3) {
                arrayList.add(qpmVar);
            }
        }
        return arrayList;
    }

    public boolean e(qpm qpmVar) {
        qpm qpmVar2;
        qpm qpmVar3;
        xfz xfzVarA;
        this.e.removeOnPageChangeListener(this);
        this.e.addOnPageChangeListener(this);
        this.e.setOffscreenPageLimit(1);
        int iIndexOf = this.o.indexOf(qpmVar);
        if (njy.e(this.o, iIndexOf)) {
            LogUtil.e("HealthSubTabPagerAdapter", "detachedAllFragment failed, cause retainFragBean = ", qpmVar, " not exists!");
            return false;
        }
        int i = iIndexOf - 1;
        if (njy.c(this.o, i)) {
            qpmVar2 = new qpm(new HealthEmptyFragment(), "", -2);
            this.o.set(i, qpmVar2);
        } else {
            qpmVar2 = null;
        }
        int i2 = iIndexOf + 1;
        if (njy.c(this.o, i2)) {
            qpmVar3 = new qpm(new HealthEmptyFragment(), "", -3);
            this.o.set(i2, qpmVar3);
        } else {
            qpmVar3 = null;
        }
        int subTabCount = this.f23901b.getSubTabCount();
        for (int i3 = 0; i3 < subTabCount; i3++) {
            if (i3 != iIndexOf && i3 != i && i3 != i2 && (xfzVarA = this.f23901b.a(i3)) != null) {
                xfzVarA.e(null);
                xfzVarA.c(null);
            }
        }
        if (d(qpmVar2, qpmVar) || d(qpmVar2, qpmVar3) || d(qpmVar, qpmVar3)) {
            LogUtil.e("HealthSubTabPagerAdapter", "found same beans between the retained bean and its neighbours");
            return false;
        }
        this.o.clear();
        if (qpmVar2 != null) {
            this.o.add(qpmVar2);
        }
        this.o.add(qpmVar);
        if (qpmVar3 != null) {
            this.o.add(qpmVar3);
        }
        notifyDataSetChanged();
        return true;
    }

    private boolean d(qpm qpmVar, qpm qpmVar2) {
        if (qpmVar == null || qpmVar2 == null) {
            return false;
        }
        return qpmVar.d() == qpmVar2.d() || qpmVar.c() == qpmVar2.c();
    }

    public boolean a(List<qpm> list, qpm qpmVar) {
        if (list.size() != this.f23901b.getSubTabCount()) {
            LogUtil.e("HealthSubTabPagerAdapter", "attachedAllFragment, size error.");
            return false;
        }
        this.e.removeOnPageChangeListener(this);
        this.e.addOnPageChangeListener(this);
        for (qpm qpmVar2 : this.o) {
            for (int i = 0; i < list.size(); i++) {
                qpm qpmVar3 = list.get(i);
                if (qpmVar2 != null && qpmVar3 != null && qpmVar2.c() == qpmVar3.c()) {
                    list.set(i, qpmVar2);
                }
            }
        }
        List<qpm> listE = qpm.e(list);
        if (listE.size() < list.size()) {
            LogUtil.e("HealthSubTabPagerAdapter", "attachedAllFragment found duplicated beans: ", Integer.valueOf(list.size()), " ", Integer.valueOf(listE.size()));
            return false;
        }
        this.o.clear();
        this.o.addAll(list);
        int i2 = 0;
        while (true) {
            if (i2 < this.o.size()) {
                qpm qpmVar4 = this.o.get(i2);
                xfz xfzVarA = this.f23901b.a(i2);
                if (qpmVar4 == null || qpmVar4 == qpmVar || xfzVarA == null) {
                    LogUtil.e("attachedAllFragment setTag failed, bean is not null: ", Boolean.valueOf(qpmVar4 != null), " bean is not retainFragBean: ", Boolean.valueOf(qpmVar4 != qpmVar), " subTab is not null: ", Boolean.valueOf(xfzVarA != null));
                } else {
                    xfzVarA.e(qpmVar4);
                }
                i2++;
            } else {
                notifyDataSetChanged();
                return true;
            }
        }
    }

    public void e(int i) {
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            qpm qpmVar = this.o.get(i2);
            if (qpmVar != null && qpmVar.c() == i) {
                d(i2);
            }
        }
    }

    public void d(int i) {
        if (njy.c(this.o, i)) {
            xfz xfzVarA = this.f23901b.a(i);
            if (xfzVarA != null) {
                xfzVarA.e(null);
                xfzVarA.c(null);
            }
            this.f23901b.b(i);
            this.o.remove(i);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        e eVar;
        if (this.h.size() > i && (eVar = this.h.get(i)) != null) {
            if (eVar.e == i && eVar.f23903a != null && eVar.f23903a.d() != null && eVar.f23903a.d().isAdded()) {
                return eVar;
            }
            d();
        }
        if (this.f23900a == null) {
            this.f23900a = this.f23902c.beginTransaction();
        }
        while (this.h.size() <= i) {
            this.h.add(null);
        }
        e eVar2 = new e(a(i), i);
        this.h.set(i, eVar2);
        Fragment item = getItem(i);
        if (item != null) {
            item.setMenuVisibility(false);
            item.setUserVisibleHint(false);
            this.f23900a.remove(item);
            this.f23900a.add(viewGroup.getId(), item);
        }
        return eVar2;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        e eVar = (e) obj;
        if (this.f23900a == null) {
            this.f23900a = this.f23902c.beginTransaction();
        }
        if (njy.c(this.h, i)) {
            this.h.set(i, null);
        }
        Fragment fragmentA = eVar.a();
        if (fragmentA != null) {
            this.f23900a.remove(fragmentA);
        } else {
            LogUtil.e("HealthSubTabPagerAdapter", "destroyItem failed, cause fragment is null!");
        }
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragmentA = ((e) obj).a();
        Fragment fragment = this.d;
        if (fragmentA != fragment) {
            if (fragment != null) {
                fragment.setMenuVisibility(false);
                this.d.setUserVisibleHint(false);
            }
            if (fragmentA != null) {
                fragmentA.setMenuVisibility(true);
                fragmentA.setUserVisibleHint(true);
            }
            this.d = fragmentA;
        }
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f23900a;
        if (fragmentTransaction != null) {
            try {
                fragmentTransaction.commitNowAllowingStateLoss();
            } catch (IllegalStateException unused) {
                LogUtil.e("HealthSubTabPagerAdapter", "finishUpdate IllegalStateException");
                this.f23900a.commitAllowingStateLoss();
            }
            this.f23900a = null;
        }
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Fragment fragmentA;
        return (obj instanceof e) && (fragmentA = ((e) obj).a()) != null && fragmentA.getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        this.j = true;
        e eVar = (e) obj;
        int iIndexOf = this.h.indexOf(eVar);
        if (iIndexOf < 0) {
            return -1;
        }
        qpm qpmVar = eVar.f23903a;
        if (a(qpmVar, a(iIndexOf))) {
            return -1;
        }
        e eVar2 = this.h.get(iIndexOf);
        int iA = a(qpmVar);
        if (iA < 0) {
            iA = -2;
        }
        if (eVar2 != null) {
            eVar2.e = iA;
        }
        return iA;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        d();
    }

    private void d() {
        if (this.j) {
            this.j = false;
            ArrayList<e> arrayList = new ArrayList<>(this.h.size());
            for (int i = 0; i < this.h.size(); i++) {
                arrayList.add(null);
            }
            for (e eVar : this.h) {
                if (eVar != null && eVar.e >= 0) {
                    while (arrayList.size() <= eVar.e) {
                        arrayList.add(null);
                    }
                    arrayList.set(eVar.e, eVar);
                }
            }
            this.h = arrayList;
        }
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
    public void onSubTabSelected(xfz xfzVar) {
        if (this.f23901b.getSubTabAppearance() == 1 || (this.f23901b.a() && xft.d(this.f23901b.getContext()) != 2)) {
            this.i = false;
        }
        this.k = xfzVar.c();
        this.g = false;
        d(xfzVar);
        this.g = true;
    }

    public void c() {
        d(this.o);
    }

    public void d(List<qpm> list) {
        if (njy.e(list)) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            qpm qpmVar = list.get(i);
            if (qpmVar != null && (qpmVar.c() == -2 || qpmVar.c() == -3)) {
                list.remove(qpmVar);
                i--;
            }
            i++;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qpm f23903a;
        private int e;

        public e(qpm qpmVar, int i) {
            this.f23903a = qpmVar;
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Fragment a() {
            qpm qpmVar = this.f23903a;
            if (qpmVar != null) {
                return qpmVar.d();
            }
            return null;
        }
    }

    private void f() {
        this.f.sendEmptyMessageDelayed(100, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f.removeMessages(100);
    }

    static class a extends BaseHandler<HealthSubTabPagerAdapter> {
        public a(HealthSubTabPagerAdapter healthSubTabPagerAdapter) {
            super(healthSubTabPagerAdapter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HealthSubTabPagerAdapter healthSubTabPagerAdapter, Message message) {
            HealthSubTabWidget healthSubTabWidget;
            if (message.what == 100 && (healthSubTabWidget = healthSubTabPagerAdapter.f23901b) != null) {
                LogUtil.a("HealthSubTabPagerAdapter", "restore isViewPagerScroll");
                healthSubTabPagerAdapter.e();
                healthSubTabWidget.setIsViewPagerScroll(false);
            }
        }
    }
}
