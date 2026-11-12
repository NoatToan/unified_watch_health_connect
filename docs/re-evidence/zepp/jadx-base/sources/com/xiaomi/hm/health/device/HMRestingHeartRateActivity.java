package com.xiaomi.hm.health.device;

import android.os.Bundle;
import android.text.InputFilter;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Calendar;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMRestingHeartRateActivity extends BaseTitleActivity {
    private static final Lazy<DeviceUtilsApi> z = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private ViewPager x;
    private ViewPager.OnPageChangeListener y = new a();

    public class a extends ViewPager.SimpleOnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            HMRestingHeartRateActivity.this.q();
            HMRestingHeartRateActivity.this.o(i);
        }
    }

    public static class b extends FragmentPagerAdapter {
        private int a;

        private b(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.a = 0;
            this.a = ((DeviceUtilsApi) HMRestingHeartRateActivity.z.getValue()).getRestingHRMonthCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return this.a;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return ((DeviceUtilsApi) HMRestingHeartRateActivity.z.getValue()).createHrRestingChartFragment(i);
        }
    }

    private void findViews() {
        this.x = (ViewPager) findViewById(R.id.view_pager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i) {
        if (i < this.x.getAdapter().getPagerCount() - 1) {
            Analytics.event(this, "Chart_ViewMonthAgoRestingHeart");
        }
    }

    private void p() {
        b bVar = new b(getSupportFragmentManager());
        this.x.setAdapter(bVar);
        this.x.setCurrentItem(bVar.getPagerCount() - 1);
        this.x.addOnPageChangeListener(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String string;
        Calendar selectedMonthCalendar = z.getValue().getSelectedMonthCalendar(this.x.getCurrentItem());
        Calendar calendar = Calendar.getInstance();
        int i = selectedMonthCalendar.get(1);
        int i2 = calendar.get(1);
        int i3 = selectedMonthCalendar.get(2);
        int i4 = calendar.get(2);
        if (i == i2 && i3 == i4) {
            string = getString(R.string.heart_rate_rest_in_this_month);
        } else {
            string = getString(R.string.heart_rate_rest_format, new Object[]{TimeUtils.formatDate_no_d(DeviceXFunctionsKt.getContext(), selectedMonthCalendar.getTime())});
        }
        getTitleTextView().setFilters(new InputFilter[]{new InputFilter.LengthFilter(string.length())});
        setTitleText(string);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, GlobalConfig.get().isBuildMidong() ? R.color.white : R.color.hr_main_bg), getString(R.string.heart_rate_rest_in_this_month), true);
        setContentView(R.layout.activity_hr_resting);
        findViews();
        p();
        q();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.x.removeOnPageChangeListener(this.y);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.event(this, "Chart_RestingHeart");
    }
}
