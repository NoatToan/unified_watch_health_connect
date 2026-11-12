package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.main.R;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class usk extends HealthPagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f50510c = BaseApplication.getContext();

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return 4;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(this.f50510c, R.layout.light_fasting_status_item_view, null);
        e(i, viewInflate);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    private void e(int i, View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.light_fasting_status_title);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.light_fasting_status_time);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.light_fasting_current_phase);
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.light_fasting_status_desc);
        ImageView imageView = (ImageView) view.findViewById(R.id.light_fasting_state_bg);
        if (i == 0) {
            healthTextView.setText(R.string.IDS_fasting_status_increased);
            healthTextView2.setText(this.f50510c.getString(R.string.IDS_light_fasting_time, 0, 4));
            healthTextView4.setText(this.f50510c.getString(R.string.IDS_wl_food_b_g_increased_d, 10, 20, 4));
            imageView.setImageResource(R.mipmap.ic_xuetang_shangsheng_bg);
        } else if (i == 1) {
            healthTextView.setText(R.string.IDS_fasting_status_decreased);
            healthTextView2.setText(this.f50510c.getString(R.string.IDS_light_fasting_time, 4, 8));
            healthTextView4.setText(R.string.IDS_wl_food_b_g_decreased_d);
            imageView.setImageResource(R.mipmap.ic_xuetang_xiajiang_bg);
        } else if (i == 2) {
            healthTextView.setText(R.string.IDS_fasting_status_maintenance);
            healthTextView2.setText(this.f50510c.getString(R.string.IDS_light_fasting_time, 8, 12));
            healthTextView4.setText(R.string.IDS_wl_food_b_g_maintenance_d);
            imageView.setImageResource(R.mipmap.ic_xuetang_weichi_bg);
        } else if (i == 3) {
            healthTextView.setText(R.string.IDS_fasting_status_phase);
            healthTextView2.setText(this.f50510c.getString(R.string.IDS_light_fasting_phase_time, 12));
            healthTextView4.setText(R.string.IDS_wl_food_f_b_phase_d);
            imageView.setImageResource(R.mipmap.ic_xuetang_rangshao_bg);
        }
        a(healthTextView3, i + 1);
    }

    private void a(HealthTextView healthTextView, int i) {
        if (e() == i) {
            healthTextView.setVisibility(0);
        } else {
            healthTextView.setVisibility(8);
        }
    }

    public int e() {
        vhm vhmVarA = uxb.c().a();
        int i = 0;
        if (vhmVarA == null) {
            LogUtil.d("FastingLiteStatusAdapter", "currentTask is null");
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - vhmVarA.b();
        if (jCurrentTimeMillis >= 14400000) {
            if (jCurrentTimeMillis < 28800000) {
                i = 1;
            } else {
                i = jCurrentTimeMillis < 43200000 ? 2 : 3;
            }
        }
        return i + 1;
    }
}
