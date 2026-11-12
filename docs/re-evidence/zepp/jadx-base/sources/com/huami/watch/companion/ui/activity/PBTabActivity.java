package com.huami.watch.companion.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.sport.event.PBInfoChangedEvent;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.sport.pb.PBTipDialogFragment;
import com.huami.watch.companion.ui.activity.PBTabActivity;
import com.huami.watch.companion.ui.fragment.PBFragment;
import com.huami.watch.companion.ui.view.PagerSlidingTabStrip;
import com.huami.watch.util.Box;
import com.huami.watch.util.RxBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

/* JADX INFO: loaded from: classes16.dex */
public class PBTabActivity extends AppCompatActivity {
    public static final String APP_GOTO_CLIMB = "climb";
    public static final String APP_GOTO_OUTDOOR_RIDE = "outdoor_ride";
    public static final String APP_GOTO_OUTDOOR_RUN = "outdoor_run";
    public static final String TYPE = "type";
    private b a;
    private String[] b;
    private int[] c;
    private Disposable d;
    private PBTipDialogFragment e;
    private ViewPager f;
    private MagicIndicator g;
    private List<View> h = new ArrayList();

    public class a extends CommonNavigatorAdapter {

        /* JADX INFO: renamed from: com.huami.watch.companion.ui.activity.PBTabActivity$a$a, reason: collision with other inner class name */
        public class C0659a implements CommonPagerTitleView.OnPagerTitleChangeListener {
            public final /* synthetic */ TextView a;

            public C0659a(TextView textView) {
                this.a = textView;
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OnPagerTitleChangeListener
            public void onDeselected(int i, int i2) {
                this.a.setTextColor(ContextCompat.getColor(PBTabActivity.this, R.color.s3));
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OnPagerTitleChangeListener
            public void onEnter(int i, int i2, float f, boolean z) {
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OnPagerTitleChangeListener
            public void onLeave(int i, int i2, float f, boolean z) {
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OnPagerTitleChangeListener
            public void onSelected(int i, int i2) {
                this.a.setTextColor(ContextCompat.getColor(PBTabActivity.this, R.color.p3));
            }
        }

        public class b implements View.OnClickListener {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PBTabActivity.this.f.setCurrentItem(this.a);
            }
        }

        public a() {
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public int getCount() {
            return PBTabActivity.this.b.length;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerIndicator getIndicator(Context context) {
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setLineWidth(UIUtil.dip2px(context, 27.0d));
            linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(PBTabActivity.this, R.color.p3)));
            linePagerIndicator.setMode(2);
            return linePagerIndicator;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
        public IPagerTitleView getTitleView(Context context, int i) {
            CommonPagerTitleView commonPagerTitleView = new CommonPagerTitleView(context);
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.psts_tab_corner_mark, (ViewGroup) null);
            PBTabActivity.this.h.add((ImageView) viewInflate.findViewById(R.id.iv_dot));
            TextView textView = (TextView) viewInflate.findViewById(R.id.psts_tab_title);
            textView.setText(PBTabActivity.this.b[i]);
            commonPagerTitleView.setContentView(viewInflate);
            commonPagerTitleView.setOnPagerTitleChangeListener(new C0659a(textView));
            commonPagerTitleView.setOnClickListener(new b(i));
            return commonPagerTitleView;
        }
    }

    public class b extends FragmentPagerAdapter implements PagerSlidingTabStrip.CustomTabProvider {
        private List<View> a;

        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.a = new ArrayList();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getA() {
            return PBTabActivity.this.b.length;
        }

        @Override // com.huami.watch.companion.ui.view.PagerSlidingTabStrip.CustomTabProvider
        public View getCustomTabView(ViewGroup viewGroup, int i) {
            View viewInflate = PBTabActivity.this.getLayoutInflater().inflate(R.layout.psts_tab_corner_mark, viewGroup, false);
            this.a.add(viewInflate.findViewById(R.id.iv_dot));
            return viewInflate;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return PBFragment.newInstance(PBTabActivity.this.c[i]);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int i) {
            return PBTabActivity.this.b[i];
        }

        @Override // com.huami.watch.companion.ui.view.PagerSlidingTabStrip.CustomTabProvider
        public void tabSelected(View view) {
        }

        @Override // com.huami.watch.companion.ui.view.PagerSlidingTabStrip.CustomTabProvider
        public void tabUnselected(View view) {
        }
    }

    private void initTitle() {
        ((RainbowTitleBar) findViewById(R.id.actionbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: lo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$initTitle$0(view);
            }
        });
    }

    private void initView() {
        initTitle();
        n();
        m();
    }

    private void k() {
        for (int i = 0; i < this.h.size(); i++) {
            this.h.get(i).setVisibility(PBManager.get().hasUnconfirmed(getApplicationContext(), this.c[i]) ? 0 : 8);
        }
    }

    private void l() {
        this.g = (MagicIndicator) findViewById(R.id.magicindicator);
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new a());
        this.g.setNavigator(commonNavigator);
        ViewPagerHelper.bind(this.g, this.f);
        String stringExtra = getIntent().getStringExtra("type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        stringExtra.hashCode();
        switch (stringExtra) {
            case "outdoor_run":
                this.f.setCurrentItem(0);
                break;
            case "outdoor_ride":
                this.f.setCurrentItem(1);
                break;
            case "climb":
                this.f.setCurrentItem(2);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTitle$0(View view) {
        onBackPressed();
    }

    private void m() {
        if (Box.getPBTipDisplayed()) {
            return;
        }
        Box.putPBTipDisplayed(true);
    }

    private void n() {
        this.b = new String[]{getString(R.string.companion_running_sports_type_running), getString(R.string.companion_sports_type_bike_ride), getString(R.string.companion_sports_type_mountaineering)};
        this.c = new int[]{1, 2, 4};
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.f = viewPager;
        viewPager.setOffscreenPageLimit(this.b.length);
        b bVar = new b(getSupportFragmentManager());
        this.a = bVar;
        this.f.setAdapter(bVar);
        l();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Object obj) throws Exception {
        if (!(obj instanceof PBInfoChangedEvent) || this.a == null) {
            return;
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Throwable th) throws Exception {
        HMLog.warn("PBTabActivity", th, new Function0() { // from class: oo5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return PBTabActivity.p();
            }
        });
    }

    private void r() {
        this.d = RxBus.get().toObservable().subscribe(new Consumer() { // from class: mo5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.o(obj);
            }
        }, new Consumer() { // from class: no5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                PBTabActivity.q((Throwable) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pb_tab);
        initView();
        r();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
