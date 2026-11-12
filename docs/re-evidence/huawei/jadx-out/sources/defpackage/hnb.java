package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.indicator.HealthGradientIndicator;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hnb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f36948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f36949c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthGradientIndicator f;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private LinearLayout j;
    private LinearLayout k;
    private HealthTextView l;
    private HealthTextView m;
    private LinearLayout n;
    private View o;
    private HealthTextView r;
    private LinearLayout s;

    public hnb(int i) {
        this.f36947a = i;
        b();
        c();
    }

    private void b() {
        this.o = LayoutInflater.from(btx.c()).inflate(R.layout.layout_equip_sport_data, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.bottomMargin = 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(marginLayoutParams);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.alignWithParent = true;
        layoutParams.bottomMargin = 0;
        layoutParams.width = -1;
        this.o.setLayoutParams(layoutParams);
        this.n = (LinearLayout) this.o.findViewById(R.id.ll_slope);
        this.i = (LinearLayout) this.o.findViewById(R.id.ll_resistance);
        this.k = (LinearLayout) this.o.findViewById(R.id.ll_speed);
        this.s = (LinearLayout) this.o.findViewById(R.id.ll_steps);
        this.j = (LinearLayout) this.o.findViewById(R.id.ll_power);
        this.f36948b = (LinearLayout) this.o.findViewById(R.id.ll_cadence);
        this.d = (HealthTextView) this.o.findViewById(R.id.distance_total);
        this.m = (HealthTextView) this.o.findViewById(R.id.slope);
        this.h = (HealthTextView) this.o.findViewById(R.id.resistance);
        this.l = (HealthTextView) this.o.findViewById(R.id.speed);
        this.r = (HealthTextView) this.o.findViewById(R.id.steps);
        this.g = (HealthTextView) this.o.findViewById(R.id.power);
        this.f36949c = (HealthTextView) this.o.findViewById(R.id.cadence);
        this.f = (HealthGradientIndicator) this.o.findViewById(R.id.gradient_indicator);
        this.e = (HealthTextView) this.o.findViewById(R.id.duration);
        HealthTextView healthTextView = (HealthTextView) this.o.findViewById(R.id.speed_unit);
        HealthTextView healthTextView2 = (HealthTextView) this.o.findViewById(R.id.distance_unit);
        if (UnitUtil.f()) {
            healthTextView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour));
            healthTextView2.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_mi));
        }
    }

    private void c() {
        if (this.f36947a == 1) {
            this.n.setVisibility(0);
            this.s.setVisibility(0);
            this.f36948b.setVisibility(0);
            this.i.setVisibility(8);
            this.k.setVisibility(8);
            this.j.setVisibility(8);
        }
    }

    public void b(double d) {
        String quantityString;
        Resources resources = BaseApplication.getContext().getResources();
        if (resources == null) {
            LogUtil.e("Suggestion_EquipmentSportDataViewHolder", "setDistance resources == null");
            return;
        }
        String strE = UnitUtil.e(d, 1, 2);
        if (CommonUtil.b(d)) {
            strE = resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        if (UnitUtil.f()) {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_indoor_run_mi, (int) d, strE);
        } else {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_indoor_run_km, (int) d, strE);
        }
        String string = resources.getString(R.string.IDS_level_record_total, quantityString);
        HealthTextView healthTextView = this.d;
        if (healthTextView != null) {
            healthTextView.setText(string);
        }
    }

    public void c(String str) {
        a(str, this.h);
    }

    public void b(String str) {
        a(str, this.m);
    }

    public void i(String str) {
        a(str, this.l);
    }

    public void d(String str) {
        a(str, this.g);
    }

    public void g(String str) {
        a(str, this.r);
    }

    public void e(String str) {
        a(str, this.f36949c);
    }

    public void a(String str) {
        a(str, this.e);
    }

    private void a(String str, HealthTextView healthTextView) {
        if (TextUtils.isEmpty(str)) {
            healthTextView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        } else {
            healthTextView.setText(str);
        }
    }

    public View d() {
        return this.o;
    }

    public void a(float f, int i, String str, String str2, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_EquipmentSportDataViewHolder", "name is empty");
            return;
        }
        String strE = UnitUtil.e(f, 1, i2);
        if (f < 1.0E-7f) {
            strE = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        this.f.b(f, strE).c(i).b(str).a(str2).d();
    }
}
