package com.huawei.ui.main.stories.health.activity.healthdata;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import defpackage.lmf;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class WeightDataActivity extends BaseActivity implements HealthViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CustomTitleBar f27632a;
    protected HealthSubTabWidget d;
    protected HealthViewPager g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ArrayList<Fragment> f27634c = new ArrayList<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ArrayList<String> f27633b = new ArrayList<>(16);
    protected ArrayList<Integer> e = new ArrayList<>(16);

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weight_body_data);
        b();
    }

    private void b() {
        this.g = (HealthViewPager) findViewById(R.id.activity_weight_body_data_custom_view_pager);
        this.d = (HealthSubTabWidget) findViewById(R.id.activity_weight_body_data_health_sub_tab_widget);
        this.f27632a = (CustomTitleBar) findViewById(R.id.activity_weight_body_data_custom_title_bar);
        this.g.addOnPageChangeListener(this);
    }

    public HealthSubTabWidget d() {
        return this.d;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        ArrayList<Integer> arrayList = this.e;
        if (arrayList == null || arrayList.isEmpty() || !njy.c(this.e, i)) {
            return;
        }
        a(this.e.get(i).intValue());
    }

    protected void a(int i) {
        HashMap map = new HashMap(8);
        map.put("click", "1");
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), a(), map, 0);
    }

    protected String a() {
        return "";
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f27634c = new ArrayList<>(16);
        this.f27633b = new ArrayList<>(16);
        this.e = new ArrayList<>(16);
        super.onDestroy();
    }
}
