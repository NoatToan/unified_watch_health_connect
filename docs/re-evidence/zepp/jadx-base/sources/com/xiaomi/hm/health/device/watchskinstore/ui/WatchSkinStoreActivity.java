package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.utils.ViewUtils;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

/* JADX INFO: loaded from: classes12.dex */
public class WatchSkinStoreActivity extends AppCompatActivity {
    public static final String KEY_INDEX = "index";
    private static final String h = "WatchSkinStoreActivity";
    private MagicIndicator a;
    private ViewPager b;
    private b c;
    private int[] d;
    private Fragment[] e;
    private HMDeviceSource f;
    private int g;

    public class a extends CommonNavigatorAdapter {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            WatchSkinStoreActivity.this.b.setCurrentItem(i);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public int getCount() {
            if (WatchSkinStoreActivity.this.d == null) {
                return 0;
            }
            return WatchSkinStoreActivity.this.d.length;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerIndicator getIndicator(Context context) {
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setLineHeight(ViewUtils.dpToPx(context, 2.0f));
            linePagerIndicator.setLineWidth(ViewUtils.dpToPx(context, 26.0f));
            linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(context, R.color.s29)));
            linePagerIndicator.setMode(2);
            return linePagerIndicator;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerTitleView getTitleView(Context context, final int i) {
            SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
            TypefaceManager.get().applyTypeface(simplePagerTitleView, "lt-bold");
            simplePagerTitleView.setText(WatchSkinStoreActivity.this.d[i]);
            simplePagerTitleView.setTextSize(15.0f);
            simplePagerTitleView.setNormalColor(ContextCompat.getColor(context, R.color.s2));
            simplePagerTitleView.setSelectedColor(ContextCompat.getColor(context, R.color.s1));
            simplePagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watchskinstore.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
            return simplePagerTitleView;
        }
    }

    public class b extends FragmentStatePagerAdapter {
        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return WatchSkinStoreActivity.this.e.length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            return WatchSkinStoreActivity.this.e[i];
        }
    }

    private void g() {
        h();
        b bVar = new b(getSupportFragmentManager());
        this.c = bVar;
        this.b.setAdapter(bVar);
        this.b.setCurrentItem(this.g);
    }

    private void h() {
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdapter(new a());
        this.a.setNavigator(commonNavigator);
        LinearLayout titleContainer = commonNavigator.getTitleContainer();
        titleContainer.setShowDividers(com.huami.lib.view.ViewUtils.isRTL() ? 1 : 2);
        titleContainer.setDividerDrawable(getResources().getDrawable(R.drawable.simple_splitter));
        ViewPagerHelper.bind(this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        finish();
    }

    private void initData() {
        HMDeviceSource supportWatchStoreDevice = HMDeviceConfig.getSupportWatchStoreDevice();
        this.f = supportWatchStoreDevice;
        this.d = new int[]{R.string.watch_skin_store, R.string.watch_skin_manager};
        this.e = new Fragment[]{SkinStoreFragment.newInstance(supportWatchStoreDevice), SkinManagerFragment.newInstance(this.f)};
        this.g = getIntent() != null ? getIntent().getIntExtra("index", 0) : 0;
    }

    private void initView() {
        this.a = (MagicIndicator) findViewById(R.id.magic_indicator);
        this.b = (ViewPager) findViewById(R.id.view_pager);
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.title_bar);
        if (rainbowTitleBar != null) {
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: gl8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i(view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_watch_skin_store);
        initView();
        initData();
        g();
    }
}
