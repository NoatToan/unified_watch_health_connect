package com.huami.watch.companion.watchface;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.widget.toast.CustomToast;

/* JADX INFO: loaded from: classes16.dex */
public class XiHuWatchFaceManagerActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String d = "XiHuWatchFaceManagerActivity";
    private b a;
    private String[] b;
    private Fragment[] c;

    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            XiHuWatchFaceManagerActivity.this.a.a(bool.booleanValue());
        }
    }

    public class b extends FragmentPagerAdapter {
        private boolean a;

        public b(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.a = false;
        }

        public void a(boolean z) {
            this.a = z;
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return this.a ? 2 : 1;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            return XiHuWatchFaceManagerActivity.this.c[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int i) {
            return XiHuWatchFaceManagerActivity.this.b[i];
        }
    }

    private void initData() {
        XiHuWatchFaceDiyViewModule xiHuWatchFaceDiyViewModule = (XiHuWatchFaceDiyViewModule) new ViewModelProvider(this).get(XiHuWatchFaceDiyViewModule.class);
        xiHuWatchFaceDiyViewModule.getShowDiyTab().observe(this, new a());
        if (xiHuWatchFaceDiyViewModule.isSupportDiy()) {
            if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                xiHuWatchFaceDiyViewModule.getCloudDiyWatchSkin();
            } else {
                CustomToast.showShort(this, R.string.no_network_plz_retry);
            }
        }
    }

    private void initView() {
        findViewById(R.id.btn_back).setOnClickListener(this);
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.tab_indicator);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        b bVar = new b(getSupportFragmentManager());
        this.a = bVar;
        viewPager.setAdapter(bVar);
        this.b = new String[]{getString(R.string.my_watch_face), getString(R.string.watch_skin_diy_title)};
        this.c = new Fragment[]{XiHuWatchFaceManagerFragment.newInstance(), XiHuWatchFaceDiyFragment.newInstance()};
        pagerSlidingTabStrip.setViewPager(viewPager);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.right_text && id == R.id.btn_back) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        setContentView(R.layout.activity_xi_hu_watch_face_manager);
        initData();
        initView();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
