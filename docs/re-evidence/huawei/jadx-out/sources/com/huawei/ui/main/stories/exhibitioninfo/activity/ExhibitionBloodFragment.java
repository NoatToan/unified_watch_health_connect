package com.huawei.ui.main.stories.exhibitioninfo.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.main.R;
import defpackage.tss;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ExhibitionBloodFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f26478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSeekBarExtend f26479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f26480c;
    private HealthSeekBarExtend d;
    private TextView e;
    private HealthSeekBarExtend f;
    private View g;
    private Context h;
    private TextView i;
    private HiHealthData j = null;
    private double k;
    private LinearLayout l;
    private LinearLayout m;
    private double n;
    private LinearLayout o;
    private RelativeLayout r;
    private RelativeLayout s;
    private RelativeLayout t;

    public static int a(double d) {
        if (d < 70.0d) {
            return (int) ((d / 70.0d) * 34.0d);
        }
        return d < 90.0d ? ((int) (((d - 70.0d) * 210.0d) / 20.0d)) + 36 : (int) (((double) 248) + ((((double) 102) * (d - 90.0d)) / 10.0d));
    }

    public static int b(double d) {
        if (d < 4.4d) {
            return (int) ((d / 4.4d) * 34.0d);
        }
        return d < 7.8d ? ((int) (((d - 4.4d) * 210.0d) / 3.3999999999999995d)) + 36 : (int) (((double) 248) + ((((double) 102) * (d - 7.8d)) / 25.2d));
    }

    private void a(View view) {
        ((ImageView) view.findViewById(R.id.blood_oxygen_empty_bar)).setImageDrawable(tss.e(106));
        if (this.f26479b != null) {
            return;
        }
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) view.findViewById(R.id.blood_oxygen_seek_bar);
        this.f26479b = healthSeekBarExtend;
        healthSeekBarExtend.setThumb(ContextCompat.getDrawable(this.h, R.drawable.ic_health_progressbar));
        this.f26479b.setThumbOffset(15);
        this.f26479b.setProgressDrawable(ContextCompat.getDrawable(this.h, R.drawable.health_halthdata_weight_seekbar_background));
        this.f26479b.setRulerSrc(tss.e(106));
        this.f26479b.setMax(350);
        this.f26479b.setSeekBarPadding(0, 0, 0, 0);
    }

    private void b(View view) {
        if (this.d != null) {
            return;
        }
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) view.findViewById(R.id.blood_pressure_seek_bar);
        this.d = healthSeekBarExtend;
        healthSeekBarExtend.setThumb(ContextCompat.getDrawable(this.h, R.drawable.ic_health_progressbar));
        this.d.setThumbOffset(15);
        this.d.setProgressDrawable(ContextCompat.getDrawable(this.h, R.drawable.health_halthdata_weight_seekbar_background));
        this.d.setRulerSrc(ContextCompat.getDrawable(this.h, R.drawable.card_blood_pressure_sugar_bar));
        this.d.setMax(100);
        this.d.setSeekBarPadding(0, 0, 0, 0);
    }

    private void c(View view) {
        ((ImageView) view.findViewById(R.id.blood_sugar_empty_bar)).setImageDrawable(tss.e(105));
        if (this.f != null) {
            return;
        }
        HealthSeekBarExtend healthSeekBarExtend = (HealthSeekBarExtend) view.findViewById(R.id.blood_sugar_seek_bar);
        this.f = healthSeekBarExtend;
        healthSeekBarExtend.setThumb(ContextCompat.getDrawable(this.h, R.drawable.ic_health_progressbar));
        this.f.setThumbOffset(15);
        this.f.setProgressDrawable(ContextCompat.getDrawable(this.h, R.drawable.health_halthdata_weight_seekbar_background));
        this.f.setRulerSrc(tss.e(105));
        this.f.setMax(350);
        this.f.setSeekBarPadding(0, 0, 0, 0);
    }

    public void d(Context context, double d, HiHealthData hiHealthData, double d2) throws Throwable {
        if (context == null) {
            this.h = BaseApplication.b();
            LogUtil.j("ExhibitionBloodFragment", "initViewInActivity Activity is null");
        } else {
            this.h = context;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.report_blood_layout, (ViewGroup) null);
        this.g = viewInflate;
        this.n = d;
        this.j = hiHealthData;
        this.k = d2;
        e(viewInflate);
    }

    public void e() {
        j();
    }

    private void j() {
        b();
        c();
        a();
    }

    private void b() {
        if (Double.isNaN(this.n) || this.n == 0.0d) {
            return;
        }
        this.f26480c.setText(Math.round(this.n) + "%");
        int iA = a(this.n);
        int iA2 = a(iA);
        LogUtil.a("ExhibitionBloodFragment", "initBloodOxygenData progress = ", Integer.valueOf(iA), ", finalProgress = ", Integer.valueOf(iA2));
        this.l.setVisibility(8);
        this.s.setVisibility(0);
        this.f26479b.setProgress(iA2);
    }

    private void c() {
        HiHealthData hiHealthData = this.j;
        if (hiHealthData != null) {
            double d = hiHealthData.getDouble("BLOOD_PRESSURE_SYSTOLIC");
            double d2 = this.j.getDouble("BLOOD_PRESSURE_DIASTOLIC");
            LogUtil.a("ExhibitionBloodFragment", "initBloodPressureData highData = ", Double.valueOf(d), ", lowData = ", Double.valueOf(d2));
            this.o.setVisibility(8);
            this.r.setVisibility(0);
            this.f26478a.setText(String.valueOf((int) d));
            this.e.setText(String.valueOf((int) d2));
            this.d.setProgress(tss.e((short) UnitUtil.d(d, 0), (short) UnitUtil.d(d2, 0)));
        }
    }

    private void a() {
        if (Double.isNaN(this.k)) {
            return;
        }
        double d = this.k;
        if (d != 0.0d) {
            int iB = b(d);
            int iA = a(iB);
            LogUtil.a("ExhibitionBloodFragment", "initBloodSugarData progressSugar = ", Integer.valueOf(iB), ", finalProgress = ", Integer.valueOf(iA));
            this.m.setVisibility(8);
            this.t.setVisibility(0);
            this.i.setText(UnitUtil.e(this.k, 1, 1));
            this.f.setProgress(iA);
        }
    }

    private void e(View view) throws Throwable {
        tss.b((RelativeLayout) view.findViewById(R.id.report_blood_pdf), 101);
        this.s = (RelativeLayout) view.findViewById(R.id.blood_oxygen_data);
        this.f26480c = (TextView) view.findViewById(R.id.report_blood_oxygen_date);
        a(view);
        this.l = (LinearLayout) view.findViewById(R.id.blood_oxygen_empty);
        this.r = (RelativeLayout) view.findViewById(R.id.blood_pressure_date);
        this.f26478a = (TextView) view.findViewById(R.id.report_blood_pressure_hight_date);
        this.e = (TextView) view.findViewById(R.id.report_blood_pressure_low_date);
        b(view);
        this.o = (LinearLayout) view.findViewById(R.id.blood_pressure_empty);
        this.t = (RelativeLayout) view.findViewById(R.id.blood_sugar_data);
        this.i = (TextView) view.findViewById(R.id.report_blood_sugar_date);
        c(view);
        this.m = (LinearLayout) view.findViewById(R.id.blood_sugar_empty);
    }

    private int a(int i) {
        LogUtil.d("ExhibitionBloodFragment", "the last progress data is ", Integer.valueOf(i));
        if (i < 15) {
            return 15;
        }
        if (i > 335) {
            return 335;
        }
        LogUtil.d("ExhibitionBloodFragment", "the progress is normal");
        return i;
    }

    public Bitmap d() {
        return tss.b(this.g);
    }
}
