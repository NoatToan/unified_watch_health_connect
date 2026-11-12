package com.huawei.ui.main.stories.fitness.activity.step;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import defpackage.lrd;
import defpackage.qre;
import defpackage.qri;
import defpackage.uhv;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class DistanceDescriptionConvertView extends RelativeLayout implements ScrollChartObserverTotalDataView.OnDataChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f27034c;
    private HealthTextView e;

    public DistanceDescriptionConvertView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.day_step_transfer_layout, this);
        this.f27034c = viewInflate.findViewById(R.id.transfer_data_layout);
        this.f27033b = (HealthTextView) viewInflate.findViewById(R.id.transfer_data_description);
        this.f27032a = (HealthTextView) viewInflate.findViewById(R.id.transfer_data_content);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.transfer_data_title);
        if (LanguageUtil.o(context)) {
            return;
        }
        this.f27033b.setVisibility(4);
    }

    private void b(float f) {
        double dE;
        int i;
        int i2;
        LogUtil.a("Step_DistanceDescriptionConvertView", "updateDistanceView totalStep ", Float.valueOf(f));
        double dB = uhv.b(f);
        this.e.setText(qre.f(R.string.IDS_sport_distance));
        double d = UnitUtil.d(dB / 400.0d, 2);
        this.f27033b.setText(qre.e(R.plurals.IDS_standard_playground, UnitUtil.b(d, Locale.getDefault()), UnitUtil.e(d, 1, 2)));
        if (UnitUtil.f()) {
            dE = UnitUtil.e(dB / 1000.0d, 3);
            i = R.plurals.IDS_indoor_run_mi;
            i2 = R.plurals.IDS_plugin_sport_path_distance_to_user_unit_mi;
        } else {
            dE = dB / 1000.0d;
            i = R.plurals.IDS_indoor_run_km;
            i2 = R.plurals.IDS_plugin_sport_path_distance_to_user;
        }
        String strE = UnitUtil.e(dE, 1, 2);
        SpannableString spannableString = new SpannableString(qre.e(i, UnitUtil.b(UnitUtil.d(dE, 2), Locale.getDefault()), strE));
        qri.e(spannableString, strE, R.string.textFontFamilyMedium);
        qri.b(spannableString, strE, R.color.textColorPrimary);
        qri.c(spannableString, strE, qre.b(R.dimen.health_common_20sp));
        this.f27032a.setText(spannableString);
        lrd.d(this.f27034c, qre.a(R.string.accessibility_step_distance, qre.e(i2, UnitUtil.b(UnitUtil.d(dE, 2), Locale.getDefault()), strE), this.f27033b.getText()), false);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView.OnDataChange
    public void onChange(float f) {
        b(f);
    }
}
