package com.xiaomi.hm.health.device.watch_skin;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinListActivity extends BaseTitleActivity {
    private static final String D = "WatchSkinListActivity";
    private static final int E = 0;
    private static final int F = 1;
    private String A;
    private Fragment[] B = new Fragment[2];
    private final Lazy<DeviceManagerApi> C = KoinJavaComponent.inject(DeviceManagerApi.class);
    private ViewPager x;
    private int y;
    private int z;

    public class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        public a(TextView textView, TextView textView2) {
            this.a = textView;
            this.b = textView2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (i == 0) {
                this.a.setTextColor(WatchSkinListActivity.this.y);
                this.b.setTextColor(WatchSkinListActivity.this.z);
            } else {
                this.a.setTextColor(WatchSkinListActivity.this.z);
                this.b.setTextColor(WatchSkinListActivity.this.y);
            }
        }
    }

    public class b extends FragmentPagerAdapter {
        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return 2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                LocalWatchSkinFragment localWatchSkinFragmentNewInstance = LocalWatchSkinFragment.newInstance(WatchSkinListActivity.this.A);
                WatchSkinListActivity.this.B[1] = localWatchSkinFragmentNewInstance;
                return localWatchSkinFragmentNewInstance;
            }
            WebItem webItem = new WebItem();
            webItem.url = WatchSkinUtils.getWatchfaceUrl(((DeviceManagerApi) WatchSkinListActivity.this.C.getValue()).getBoundDeviceSource(HMDeviceType.MILI));
            webItem.isShowMore = false;
            webItem.isUseCache = false;
            webItem.isRefresh = true;
            WebFragment webFragmentNewInstance = WebFragment.newInstance(webItem);
            WatchSkinListActivity.this.B[0] = webFragmentNewInstance;
            return webFragmentNewInstance;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return WatchSkinListActivity.this.getString(R.string.online_watch_skin_title);
            }
            if (i == 1) {
                return WatchSkinListActivity.this.getString(R.string.local_watch_skin_title);
            }
            return null;
        }
    }

    private void init() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.title_container);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.setMargins(0, ViewUtils.getStatusBarHeight(this), 0, 0);
        viewGroup.setLayoutParams(layoutParams);
        int i = R.color.s1;
        this.y = ContextCompat.getColor(this, i);
        this.z = ContextCompat.getColor(this, R.color.s2);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.x = viewPager;
        viewPager.setAdapter(new b(getSupportFragmentManager()));
        TextView textView = (TextView) findViewById(R.id.online_watch_face_title);
        TextView textView2 = (TextView) findViewById(R.id.local_watch_face_title);
        textView2.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: jk8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u(view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ck8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.v(view);
            }
        });
        if (WatchSkinUtils.getWatchfaceType(this.C.getValue().getBoundDeviceSource(HMDeviceType.MILI)) == 2) {
            textView.setText(R.string.band_skin_center);
            textView2.setText(R.string.mine_band_skin);
        }
        this.x.addOnPageChangeListener(new a(textView, textView2));
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this, i));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.back_img);
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: ik8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(view);
            }
        });
        t(this.A);
    }

    private void t(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.x.setCurrentItem(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        this.x.setCurrentItem(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        this.x.setCurrentItem(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_watch_skin_list);
        setStyle(BaseTitleActivity.STYLE.NONE, GlobalConfig.get().isBuildMidong() ? -1 : ContextCompat.getColor(this, R.color.pale_grey), true);
        this.A = WatchSkinManager.getWatchSkinPath(getIntent());
        init();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String watchSkinPath = WatchSkinManager.getWatchSkinPath(intent);
        HMLog.d(D, "onNewIntent: " + watchSkinPath, new Object[0]);
        t(watchSkinPath);
        LocalWatchSkinFragment localWatchSkinFragment = (LocalWatchSkinFragment) this.B[1];
        if (localWatchSkinFragment != null) {
            localWatchSkinFragment.n(watchSkinPath);
        }
    }
}
