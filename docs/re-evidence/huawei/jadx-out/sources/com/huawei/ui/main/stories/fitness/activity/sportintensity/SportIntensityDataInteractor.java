package com.huawei.ui.main.stories.fitness.activity.sportintensity;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.TotalDataRectView;
import defpackage.qqn;
import defpackage.qre;
import defpackage.qsp;
import defpackage.uhf;
import defpackage.uhg;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SportIntensityDataInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f27004a = new d(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f27006c;
    private Context d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private TotalDataRectView i;
    private HealthTextView j;
    private HealthTextView m;

    public SportIntensityDataInteractor(Context context) {
        this.d = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(uhg uhgVar) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        if (uhgVar == null) {
            a(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
            LogUtil.j("Step_SportIntensityDataInterActor", "intensity is null. ");
            d7 = 0.0d;
            d8 = 0.0d;
            d5 = 0.0d;
            d6 = 0.0d;
            d4 = 0.0d;
            d3 = 0.0d;
        } else {
            double dB = uhgVar.b() + uhgVar.i() + uhgVar.h();
            double dE = ((double) (uhgVar.e() + uhgVar.c() + uhgVar.j() + uhgVar.a())) + dB;
            LogUtil.a("Step_SportIntensityDataInterActor", "updateBottomTeleVisions, sumData = ", Integer.valueOf(uhgVar.d()), "  sumData", Double.valueOf(dE));
            if (uhgVar.d() > dE) {
                d2 = ((double) uhgVar.d()) - dE;
                dE = uhgVar.d();
            } else {
                d2 = 0.0d;
            }
            double d9 = d(uhgVar.c(), dE);
            double d10 = d(uhgVar.e(), dE);
            double d11 = d(uhgVar.a(), dE);
            double d12 = d(d2 + dB, dE);
            LogUtil.a("Step_SportIntensityDataInterActor", "updateBottomTeleVisions, per_cent run = ", Double.valueOf(d9), " ride = ", Double.valueOf(d10), " fitness = ", Double.valueOf(d11), "convergenceData =", Double.valueOf(dB), " other = ", Double.valueOf(d12));
            double d13 = d9 + d10 + d11 + d12;
            if (d13 > 100.0d) {
                double d14 = d13 - 100.0d;
                if (d9 >= d10 && d9 >= d11 && d9 >= d12) {
                    d9 -= d14;
                } else if (d11 >= d9 && d11 >= d10 && d11 >= d12) {
                    d11 -= d14;
                } else if (d10 >= d9 && d10 >= d11 && d10 >= d12) {
                    d10 -= d14;
                } else if (d12 >= d9 && d12 >= d10 && d12 >= d11) {
                    d12 -= d14;
                }
            }
            double dRound = Math.round(((((double) uhgVar.j()) * 1.0d) / dE) * 100.0d);
            if (uhgVar.j() > 0 && uhgVar.d() > 0) {
                dRound = (((100.0d - d9) - d10) - d11) - d12;
            }
            double d15 = dRound >= 0.0d ? dRound : 0.0d;
            LogUtil.a("Step_SportIntensityDataInterActor", "updateBottomTeleVisions, per_cent walk =", Double.valueOf(d15), "  run = ", Double.valueOf(d9), " ride = ", Double.valueOf(d10), " fitness = ", Double.valueOf(d11), " other = ", Double.valueOf(d12));
            d3 = dE;
            d4 = d12;
            d5 = d10;
            d6 = d11;
            d7 = d15;
            d8 = d9;
        }
        a(d7, d8, d5, d6, d4);
        this.i.setViewData((float) (d8 * d3), (float) (d7 * d3), (float) (d3 * d5), (float) (d3 * d6), (float) (d3 * d4));
        this.i.invalidate();
    }

    private double d(double d2, double d3) {
        double d4 = d2 * 1.0d;
        double dRound = Math.round((d4 / d3) * 100.0d);
        if (dRound >= 1.0d || d4 <= 0.0d) {
            return dRound;
        }
        return 1.0d;
    }

    private void a(double d2, double d3, double d4, double d5, double d6) {
        this.f.setText(b(d2));
        this.h.setText(b(d3));
        this.g.setText(b(d4));
        this.j.setText(b(d5));
        this.f27005b.setText(b(d6));
    }

    protected void a(Activity activity) {
        if (activity == null) {
            LogUtil.e("Step_SportIntensityDataInterActor", "initTotalData  Failed , activity is null！ ");
            return;
        }
        this.i = (TotalDataRectView) qsp.a(activity, R.id.total_data_tv_bg);
        this.h = (HealthTextView) qsp.a(activity, R.id.fitness_detail_total_run_time_data);
        this.f = (HealthTextView) qsp.a(activity, R.id.fitness_detail_total_walk_time_data);
        this.g = (HealthTextView) qsp.a(activity, R.id.fitness_detail_total_ride_time_data);
        this.j = (HealthTextView) qsp.a(activity, R.id.fitness_detail_total_train_time_data);
        this.f27005b = (HealthTextView) qsp.a(activity, R.id.fitness_detail_total_other_time_data);
        HealthTextView healthTextView = (HealthTextView) qsp.a(activity, R.id.view_proportionSubHeader_title);
        this.e = healthTextView;
        healthTextView.setText(this.d.getResources().getString(R.string.IDS_workout_percentage_title));
        e(activity.getResources().getColor(R.color.fitness_detail_time_color_one_new), activity.getResources().getColor(R.color.fitness_detail_time_color_two_new), activity.getResources().getColor(R.color.fitness_detail_time_color_three_new), activity.getResources().getColor(R.color.fitness_detail_time_color_four_new), qqn.d(R.color.active_workout_focus));
        this.i.setColors(activity.getResources().getColor(R.color.fitness_detail_time_color_one_new), activity.getResources().getColor(R.color.fitness_detail_time_color_two_new), activity.getResources().getColor(R.color.fitness_detail_time_color_three_new), activity.getResources().getColor(R.color.fitness_detail_time_color_four_new), qqn.d(R.color.active_workout_focus));
        this.m = (HealthTextView) qsp.a(activity, R.id.card_view_what_sports_item_content);
        this.m.setText(qre.a(R.string.IDS_workout_introduction, qre.e(R.plurals.IDS_min_insert_unit, 150, UnitUtil.e(150.0d, 1, 0)), qre.e(R.plurals.IDS_min_insert_unit, 75, UnitUtil.e(75.0d, 1, 0))));
    }

    private void e(int i, int i2, int i3, int i4, int i5) {
        this.h.setTextColor(i);
        this.f.setTextColor(i2);
        this.g.setTextColor(i3);
        this.j.setTextColor(i4);
        this.f27005b.setTextColor(i5);
    }

    public void b(long j, long j2, int i) {
        LogUtil.a("Step_SportIntensityDataInterActor", "requestTotalDataByType , startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2), ", type = ", Integer.valueOf(i));
        if (this.f27006c == null) {
            this.f27006c = new e(this);
        }
        uhf.c().c(j, j2, i, this.f27006c);
    }

    private SpannableString b(double d2) {
        return UnitUtil.b(this.d, "[\\d]", UnitUtil.e(d2, 2, 0), R.style.fitness_detail_data_percent_number_style_num, R.style.fitness_detail_data_percent_number_style_sign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public uhg e(List<uhg> list) {
        LogUtil.a("Step_SportIntensityDataInterActor", "getTotalData ");
        if (list != null && !list.isEmpty()) {
            uhg uhgVar = list.get(0);
            LogUtil.a("Step_SportIntensityDataInterActor", "intensity = ", uhgVar.toString());
            return uhgVar;
        }
        return new uhg();
    }

    public static class d extends Handler {
        private WeakReference<SportIntensityDataInteractor> d;

        public d(SportIntensityDataInteractor sportIntensityDataInteractor) {
            this.d = new WeakReference<>(sportIntensityDataInteractor);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            SportIntensityDataInteractor sportIntensityDataInteractor = this.d.get();
            if (sportIntensityDataInteractor != null && message.what == 101 && (message.obj instanceof uhg)) {
                sportIntensityDataInteractor.b((uhg) message.obj);
            }
        }
    }

    public static class e implements InterfaceSportIntensityData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SportIntensityDataInteractor> f27007a;

        e(SportIntensityDataInteractor sportIntensityDataInteractor) {
            this.f27007a = new WeakReference<>(sportIntensityDataInteractor);
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.sportintensity.InterfaceSportIntensityData
        public void onResponse(int i, List<uhg> list) {
            SportIntensityDataInteractor sportIntensityDataInteractor = this.f27007a.get();
            if (sportIntensityDataInteractor != null) {
                uhg uhgVarE = sportIntensityDataInteractor.e(list);
                Message messageObtain = Message.obtain();
                messageObtain.obj = uhgVarE;
                messageObtain.what = 101;
                sportIntensityDataInteractor.f27004a.sendMessage(messageObtain);
                return;
            }
            LogUtil.j("Step_SportIntensityDataInterActor", "dataInteractor is null ");
        }
    }
}
