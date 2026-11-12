package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.UnitUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f43999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f44001c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthProgressBar f;
    private final int g;
    private final int h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private final float o;

    public nzg(View view, IndoorEquipViewModel indoorEquipViewModel) {
        this.g = indoorEquipViewModel.getSportTarget();
        this.o = indoorEquipViewModel.getTargetValue();
        this.h = indoorEquipViewModel.getSportType();
        d(view);
    }

    private void d(View view) {
        this.j = (HealthTextView) view.findViewById(R.id.target_real_time_value);
        this.l = (HealthTextView) view.findViewById(R.id.target_type);
        this.f = (HealthProgressBar) view.findViewById(R.id.progressbar_target);
        this.m = (HealthTextView) view.findViewById(R.id.target_value);
        this.k = (HealthTextView) view.findViewById(R.id.target_unit);
        this.i = (HealthTextView) view.findViewById(R.id.sport_type);
        this.f43999a = (ViewGroup) view.findViewById(R.id.ll_heart_rate_container);
        this.e = (HealthTextView) view.findViewById(R.id.center_heart_rate_value);
        this.d = (HealthTextView) view.findViewById(R.id.heart_rate_des);
        this.f44001c = (HealthTextView) view.findViewById(R.id.heart_rate_des_unit);
    }

    public void a(boolean z) {
        this.f44000b = z;
        LogUtil.a("TargetModeWithProgressViewHolder", "init: mTargetType = ", Integer.valueOf(this.g), ", mTargetValue = ", Float.valueOf(this.o), ", mSportType = ", Integer.valueOf(this.h), ", mHasHeartRateDevice = ", Boolean.valueOf(z));
        c();
        a();
        e();
    }

    private void c() {
        int i = this.h;
        if (i == 264) {
            this.i.setText(R.string.IDS_start_track_sport_type_run);
        } else {
            if (i != 265) {
                return;
            }
            this.i.setText(R.string.IDS_hwh_start_track_sport_type_cycle);
        }
    }

    private void a() {
        double dB;
        int i = this.g;
        if (i == 0) {
            this.l.setText(R.string.ie_device_connect_cost);
            this.k.setText(R.string.IDS_motiontrack_detail_fm_heart_min);
            this.m.setText(UnitUtil.e(((double) this.o) / 60.0d, 1, 0));
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.l.setText(R.string.IDS_track_total_calories_kcal);
            this.k.setText(R.string.IDS_band_data_sport_energy_unit);
            this.m.setText(UnitUtil.e(this.o, 1, 0));
            return;
        }
        boolean zF = UnitUtil.f();
        this.l.setText(zF ? R.string.IDS_motiontrack_show_sport_unit_mi : R.string.IDS_motiontrack_show_sport_unit_km);
        this.k.setText(zF ? R.string.IDS_motiontrack_show_sport_unit_mi : R.string.IDS_motiontrack_show_sport_unit_km);
        int i2 = (int) this.o;
        if (zF) {
            dB = ltc.d(i2);
        } else {
            dB = ltc.b(i2);
        }
        this.m.setText(UnitUtil.e(dB, 1, 2));
    }

    private void e() {
        if (this.f44000b) {
            this.f43999a.setVisibility(0);
        }
    }

    public void d(int i) {
        this.f.setProgress(i);
    }

    public void e(Map<Integer, Object> map) {
        double dB;
        int i = this.g;
        if (i == 0) {
            this.j.setText(UnitUtil.e(b(map, 2)));
        } else if (i == 1) {
            int iB = b(map, 1);
            if (UnitUtil.f()) {
                dB = ltc.d(iB);
            } else {
                dB = ltc.b(iB);
            }
            this.j.setText(UnitUtil.e(dB, 1, 2));
        } else if (i == 2) {
            this.j.setText(UnitUtil.e(b(map, 6), 1, 0));
        }
        if (this.f44000b) {
            e(b(map, 20004));
        }
    }

    private void e(int i) {
        if (i <= 0 || i == 255) {
            this.e.setText(R.string.ie_motiontrack_detail_heartrate_default);
        } else {
            this.e.setText(String.valueOf(i));
        }
    }

    private int b(Map<Integer, Object> map, int i) {
        Object obj = map.get(Integer.valueOf(i));
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void b(float f) {
        HealthTextView healthTextView = this.j;
        healthTextView.setTextSize(0, healthTextView.getTextSize() * f);
        HealthTextView healthTextView2 = this.l;
        healthTextView2.setTextSize(0, healthTextView2.getTextSize() * f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams.height = (int) (layoutParams.height * f);
        layoutParams.width = (int) (layoutParams.width * f);
        LogUtil.a("TargetModeWithProgressViewHolder", "scale is ", Float.valueOf(f), "height is ", Integer.valueOf(layoutParams.height), "width is ", Integer.valueOf(layoutParams.width));
        this.f.setLayoutParams(layoutParams);
        HealthTextView healthTextView3 = this.m;
        healthTextView3.setTextSize(0, healthTextView3.getTextSize() * f);
        HealthTextView healthTextView4 = this.k;
        healthTextView4.setTextSize(0, healthTextView4.getTextSize() * f);
        HealthTextView healthTextView5 = this.i;
        healthTextView5.setTextSize(0, healthTextView5.getTextSize() * f);
        HealthTextView healthTextView6 = this.d;
        healthTextView6.setTextSize(0, healthTextView6.getTextSize() * f);
        HealthTextView healthTextView7 = this.e;
        healthTextView7.setTextSize(0, healthTextView7.getTextSize() * f);
        HealthTextView healthTextView8 = this.f44001c;
        healthTextView8.setTextSize(0, f * healthTextView8.getTextSize());
    }
}
