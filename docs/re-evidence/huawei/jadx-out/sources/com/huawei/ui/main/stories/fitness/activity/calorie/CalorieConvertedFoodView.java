package com.huawei.ui.main.stories.fitness.activity.calorie;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import defpackage.uht;
import defpackage.uhv;
import health.compact.a.LanguageUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class CalorieConvertedFoodView extends ScrollChartObserverTotalDataView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f26641c;
    private HealthTextView d;
    private RelativeLayout e;
    private uht f;
    private HealthTextView g;
    private ImageView h;
    private boolean i;

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView
    public void d(float f) {
        e(f);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void initView(String str, String str2) {
        inflate(getContext(), R.layout.calorie_converted_food_view, this);
        this.i = LanguageUtil.o(getContext());
        this.f26641c = (HealthTextView) findViewById(R.id.fitness_detail_average_data_day_comment);
        this.e = (RelativeLayout) findViewById(R.id.fitness_detail_day_comment_zh);
        this.f26639a = (HealthTextView) findViewById(R.id.fitness_detail_average_data_day_comment_zh);
        this.h = (ImageView) findViewById(R.id.fitness_detail_day_food);
        this.g = (HealthTextView) findViewById(R.id.fitness_detail_day_food_num);
        this.d = (HealthTextView) findViewById(R.id.fitness_detail_average_data_day_comment_less);
        this.f26641c.setVisibility(0);
        this.f = new uht(-1, true);
    }

    private void e(float f) {
        int i;
        int iRound = Math.round(f) * 1000;
        CharSequence charSequenceE = uhv.e(this.f26640b, iRound, this.f);
        LogUtil.a("CalorieConvertedFoodView", " updateComment total", Integer.valueOf(iRound), "text", charSequenceE.toString());
        if (!this.i) {
            this.e.setVisibility(8);
            this.d.setVisibility(8);
            this.f26641c.setVisibility(0);
            this.f26641c.setText(charSequenceE);
            return;
        }
        int iC = this.f.c();
        if (iC == 0) {
            i = R.drawable.step_day_ic_egg;
        } else if (iC == 1) {
            i = R.drawable.step_day_ic_icecream;
        } else if (iC == 2) {
            i = R.drawable.step_day_ic_hamburger;
        } else {
            i = iC != 3 ? -1 : R.drawable.step_day_drumsticks;
        }
        if (i < 0) {
            this.e.setVisibility(8);
            this.f26641c.setVisibility(8);
            this.d.setVisibility(0);
            this.d.setText(charSequenceE);
            return;
        }
        this.e.setVisibility(0);
        this.f26641c.setVisibility(8);
        this.d.setVisibility(8);
        this.f26639a.setText(charSequenceE);
        this.h.setImageResource(i);
        this.g.setText(String.format(Locale.ROOT, "X%1d", Integer.valueOf(this.f.d())));
    }
}
