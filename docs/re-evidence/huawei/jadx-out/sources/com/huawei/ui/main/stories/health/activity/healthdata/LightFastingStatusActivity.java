package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.horizontalscrollview.HealthHorizontalScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.usk;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class LightFastingStatusActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f27592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f27593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f27594c;
    private ImageView d;
    private FrameLayout e;
    private FrameLayout f;
    private HealthHorizontalScrollView g;
    private HealthViewPager h;
    private FrameLayout i;
    private ImageView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_light_fasting_status);
        c();
        a();
    }

    private void c() {
        ((CustomTitleBar) findViewById(R.id.light_fasting_title_bar)).setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        this.g = (HealthHorizontalScrollView) findViewById(R.id.light_fasting_status_scrollview);
        this.e = (FrameLayout) findViewById(R.id.light_fasting_increased_layout);
        this.f27594c = (FrameLayout) findViewById(R.id.light_fasting_decreased_layout);
        this.i = (FrameLayout) findViewById(R.id.light_fasting_maintenance_layout);
        this.f = (FrameLayout) findViewById(R.id.light_fasting_phase_layout);
        this.f27593b = (ImageView) findViewById(R.id.light_fasting_increased_image);
        this.f27592a = (ImageView) findViewById(R.id.light_fasting_decreased_image);
        this.d = (ImageView) findViewById(R.id.light_fasting_maintenance_image);
        this.j = (ImageView) findViewById(R.id.light_fasting_phase_image);
        this.h = (HealthViewPager) findViewById(R.id.light_fasting_status_view_page);
        this.e.setOnClickListener(this);
        this.f27594c.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    private void a() {
        int intExtra = getIntent().getIntExtra("status", 0);
        usk uskVar = new usk();
        this.h.setAdapter(uskVar);
        if (intExtra == 0) {
            b(uskVar.e());
        } else {
            b(intExtra);
        }
        this.h.addOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.LightFastingStatusActivity.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LightFastingStatusActivity.this.b(i + 1);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.e) {
            b(1);
            return;
        }
        if (view == this.f27594c) {
            b(2);
            return;
        }
        if (view == this.i) {
            b(3);
        } else if (view == this.f) {
            b(4);
        } else {
            LogUtil.d("LightFastingStatusActivity", "onClick is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i == 1) {
            d(this.e, this.f27593b);
            if (LanguageUtil.ba(this)) {
                this.g.fullScroll(66);
            } else {
                this.g.fullScroll(17);
            }
        } else if (i == 2) {
            d(this.f27594c, this.f27592a);
        } else if (i == 3) {
            d(this.i, this.d);
        } else if (i == 4) {
            d(this.f, this.j);
            if (LanguageUtil.ba(this)) {
                this.g.fullScroll(17);
            } else {
                this.g.fullScroll(66);
            }
        }
        int i2 = i - 1;
        if (this.h.getCurrentItem() != i2) {
            this.h.setCurrentItem(i2);
        }
    }

    private void d(FrameLayout frameLayout, ImageView imageView) {
        this.e.setBackgroundResource(R.drawable.light_fasting_status_normal_bg);
        this.f27594c.setBackgroundResource(R.drawable.light_fasting_status_normal_bg);
        this.i.setBackgroundResource(R.drawable.light_fasting_status_normal_bg);
        this.f.setBackgroundResource(R.drawable.light_fasting_status_normal_bg);
        this.f27593b.setAlpha(0.3f);
        this.f27592a.setAlpha(0.3f);
        this.d.setAlpha(0.3f);
        this.j.setAlpha(0.3f);
        frameLayout.setBackgroundResource(R.drawable.light_fasting_status_select_bg);
        imageView.setAlpha(1.0f);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
