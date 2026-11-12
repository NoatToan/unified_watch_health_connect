package com.xiaomi.hm.health.training.ui.adapter;

import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseDetailListFragment;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseIntroductionFragment;
import com.xiaomi.hm.health.training.ui.widget.WrapContentHeightViewPager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseDetailPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> a;
    private int b;

    public FeaturedCourseDetailPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        ArrayList<Fragment> arrayList = new ArrayList<>();
        this.a = arrayList;
        this.b = -1;
        arrayList.add(FeaturedCourseIntroductionFragment.newInstance());
        this.a.add(FeaturedCourseDetailListFragment.newInstance());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return this.a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return this.a.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        super.setPrimaryItem(viewGroup, i, obj);
        WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) viewGroup;
        if (i == this.b || (fragment = (Fragment) obj) == null || fragment.getView() == null) {
            return;
        }
        if (!(fragment instanceof FeaturedCourseIntroductionFragment)) {
            wrapContentHeightViewPager.setCurrentView(fragment.getView());
            this.b = i;
            return;
        }
        FeaturedCourseIntroductionFragment featuredCourseIntroductionFragment = (FeaturedCourseIntroductionFragment) fragment;
        WebView webView = featuredCourseIntroductionFragment.getWebView();
        if (webView != null) {
            wrapContentHeightViewPager.setCurrentView(webView, featuredCourseIntroductionFragment.getExtraHeight());
            this.b = i;
        }
    }

    @Nullable
    public <T extends Fragment> T getItem(Class<T> cls) {
        Iterator<Fragment> it2 = this.a.iterator();
        while (it2.hasNext()) {
            T t = (T) it2.next();
            if (t.getClass().equals(cls)) {
                return t;
            }
        }
        return null;
    }
}
