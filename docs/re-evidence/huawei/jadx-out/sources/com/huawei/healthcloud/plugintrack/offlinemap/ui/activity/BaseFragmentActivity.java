package com.huawei.healthcloud.plugintrack.offlinemap.ui.activity;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public abstract class BaseFragmentActivity extends BaseUiActivity {
    private static final int TAB_START = 0;
    private static final String TAG = "common.ui.BaseFragmentActivity";
    private ViewPager mListViewPager;
    private FragmentManager mFragmentManager = getSupportFragmentManager();
    private List<View> mTab = null;
    private List<Fragment> mFragmentList = null;
    private int mTabCount = 0;

    public interface FragmentActivityModel {
        Fragment getFragment();

        List<TabFragmentModel> getTabList();

        int getType();

        int getViewPageId();
    }

    public interface TabFragmentModel {
        Fragment getFragment();

        int getTabNameStringId();

        int getTabTextViewId();

        int getTabViewId();
    }

    public abstract FragmentActivityModel getFragmentStructure();

    @Override // com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.BaseUiActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initializeActivity();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mListViewPager = null;
        this.mFragmentList = null;
    }

    public void setTab(int i) {
        LogUtil.d(TAG, "setTab() enter ");
        if (this.mTab != null) {
            LogUtil.d(TAG, "setTab() mTab != null ");
            for (int i2 = 0; i2 < this.mTab.size(); i2++) {
                if (i2 == i) {
                    this.mTab.get(i2).setEnabled(false);
                } else {
                    this.mTab.get(i2).setEnabled(true);
                }
            }
        }
        if (this.mListViewPager != null) {
            LogUtil.d(TAG, "setTab() seleted : ", Integer.valueOf(i));
            this.mListViewPager.setCurrentItem(i);
        } else {
            LogUtil.j(TAG, "setTab() mListViewPager is null");
        }
    }

    private void initializeActivity() {
        LogUtil.a(TAG, "initializeActivity() ");
        FragmentActivityModel fragmentStructure = getFragmentStructure();
        if (fragmentStructure == null) {
            LogUtil.j(TAG, "initializeActivity model is null");
            finish();
            return;
        }
        int type = fragmentStructure.getType();
        if (type == 0) {
            if (fragmentStructure.getFragment() == null) {
                LogUtil.j(TAG, "initializeActivity model.getFragment() is null");
                finish();
                return;
            } else {
                initFragment(fragmentStructure.getFragment(), fragmentStructure.getViewPageId());
                return;
            }
        }
        if (type == 1) {
            if (fragmentStructure.getTabList() == null) {
                LogUtil.j(TAG, "initializeActivity model.getTabList() is null");
                finish();
                return;
            } else {
                initTabFragment(fragmentStructure.getViewPageId(), fragmentStructure.getTabList());
                return;
            }
        }
        LogUtil.j(TAG, "initializeActivity invalid type");
        finish();
    }

    private void initFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.replace(i, fragment);
        fragmentTransactionBeginTransaction.commit();
    }

    private void initTabFragment(int i, List<TabFragmentModel> list) {
        LogUtil.d(TAG, "initTabFragment modelList : ", list);
        if (list != null) {
            int size = list.size();
            this.mTabCount = size;
            if (size > 0) {
                this.mTab = new ArrayList(10);
                initTab(list);
                initTabText(list);
                initViewPager(i, list);
                LogUtil.d(TAG, "initTabFragment end");
                return;
            }
            LogUtil.j(TAG, "initTabFragment modelList.size() is 0");
            return;
        }
        LogUtil.j(TAG, "initTabFragment modelList is null");
    }

    private void initViewPager(int i, List<TabFragmentModel> list) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof ViewPager) {
            this.mListViewPager = (ViewPager) viewFindViewById;
        }
        ViewPager viewPager = this.mListViewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.BaseFragmentActivity.4
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i2) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i2, float f, int i3) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    BaseFragmentActivity.this.setTab(i2);
                }
            });
            this.mFragmentList = new ArrayList(10);
            Iterator<TabFragmentModel> it = list.iterator();
            while (it.hasNext()) {
                this.mFragmentList.add(it.next().getFragment());
            }
            this.mListViewPager.setAdapter(new c(getSupportFragmentManager(), this.mFragmentList));
            this.mListViewPager.setOffscreenPageLimit(this.mTabCount);
            setTab(0);
            return;
        }
        LogUtil.j(TAG, "initTabFragment mListViewPager is null");
        throw new ClassCastException(toString() + " mListViewPager is null!");
    }

    private void initTabText(List<TabFragmentModel> list) {
        HealthTextView healthTextView = null;
        for (TabFragmentModel tabFragmentModel : list) {
            View viewFindViewById = findViewById(tabFragmentModel.getTabTextViewId());
            if (viewFindViewById instanceof HealthTextView) {
                healthTextView = (HealthTextView) viewFindViewById;
            }
            if (healthTextView != null) {
                healthTextView.setText(tabFragmentModel.getTabNameStringId());
            }
        }
    }

    private void initTab(List<TabFragmentModel> list) {
        for (int i = 0; i < this.mTabCount; i++) {
            View viewFindViewById = findViewById(list.get(i).getTabViewId());
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
                viewFindViewById.setTag(Integer.valueOf(i));
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.BaseFragmentActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (view != null) {
                            BaseFragmentActivity.this.setTab(((Integer) view.getTag()).intValue());
                        }
                    }
                });
                this.mTab.add(viewFindViewById);
            }
        }
    }

    static class c extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Fragment> f10530c;

        c(FragmentManager fragmentManager, List<Fragment> list) {
            super(fragmentManager);
            this.f10530c = list;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (njy.e(this.f10530c, i)) {
                return null;
            }
            Fragment fragment = njy.e(this.f10530c) ? null : this.f10530c.get(i);
            LogUtil.a(BaseFragmentActivity.TAG, "getItem() position : ", Integer.valueOf(i), "    fragment : ", fragment);
            return fragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List<Fragment> list = this.f10530c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }
}
