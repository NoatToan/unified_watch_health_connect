package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class SleepShareBriefView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f27267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27268c;
    private RelativeLayout d;
    private HealthTextView e;
    private ViewGroup f;
    private RelativeLayout g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;

    public SleepShareBriefView(Context context) {
        super(context);
        e();
    }

    public SleepShareBriefView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public SleepShareBriefView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_for_share_sleep_brief_layout, (ViewGroup) this, true);
        this.d = (RelativeLayout) viewInflate.findViewById(R.id.sleep_scoring_area);
        this.f27266a = (HealthTextView) viewInflate.findViewById(R.id.sleep_scoring_text);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.sleep_scoring_desc_quality);
        this.i = (HealthTextView) viewInflate.findViewById(R.id.sleep_scoring_unit);
        this.f = (ViewGroup) viewInflate.findViewById(R.id.sleep_share_brief_star_container);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.sleep_scoring_desc);
        this.g = (RelativeLayout) viewInflate.findViewById(R.id.sleep_total_time);
        this.h = (HealthTextView) viewInflate.findViewById(R.id.common_sleep_sleep_hour_time);
        this.f27268c = (HealthTextView) viewInflate.findViewById(R.id.sleep_efficiency_desc);
        this.f27267b = (RelativeLayout) viewInflate.findViewById(R.id.sleep_share_brief_bottom_area);
    }

    public void setScoring(String str, String str2) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("SleepShareBriefView", "setScoring failed cause score is not a valid number! ", str);
            i = 0;
        }
        this.g.setVisibility(8);
        this.f27266a.setText(str);
        this.i.setVisibility(0);
        this.i.setText(getContext().getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, i));
        this.f.setVisibility(0);
        setStarNum(i);
        this.j.setText(str2);
    }

    private void setStarNum(int i) {
        int i2 = (i + 9) / 10;
        int i3 = i2 < 10 ? i2 : 10;
        if (i3 <= 0) {
            i3 = 0;
        }
        int i4 = i3 / 2;
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_default_star);
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), R.drawable.ic_half_star);
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), R.drawable.ic_full_star);
        for (int i5 = 0; i5 < i4; i5++) {
            d(this.f.getChildAt(i5), drawable3);
        }
        for (int i6 = i4; i6 < 5; i6++) {
            d(this.f.getChildAt(i6), drawable);
        }
        if (i3 % 2 == 1) {
            d(this.f.getChildAt(i4), drawable2);
        }
    }

    private void d(View view, Drawable drawable) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        }
    }

    public void setStatus(String str) {
        this.i.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.e.setVisibility(0);
        this.f27268c.setVisibility(0);
        this.f27266a.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline7_medium));
        this.f27266a.setText(str);
        this.j.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.health_common_24dp));
        this.e.setText(getContext().getResources().getString(R.string.IDS_sleep_quality));
    }

    public void setSleepEfficiency(String str, String str2) {
        this.i.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.e.setVisibility(0);
        this.f27268c.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.f27266a.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(14);
            this.f27266a.setLayoutParams(layoutParams);
        }
        this.f27266a.setText(str2);
        this.e.setText(getContext().getResources().getString(R.string.IDS_sleep_quality));
        this.f27268c.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.health_common_6dp));
        this.f27268c.setText(str);
    }

    public void setSleepTime(String str) {
        this.d.setVisibility(8);
        this.f.setVisibility(8);
        if (!TextUtils.isEmpty(str)) {
            ViewGroup.LayoutParams layoutParams = this.f27267b.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(3);
                this.f27267b.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = this.g.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams3).addRule(3, R.id.sleep_share_brief_bottom_area);
                this.g.setLayoutParams(layoutParams3);
            }
            this.h.setText(str);
        }
        this.h.setText(str);
        this.j.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.health_common_24dp));
        this.j.setText(getContext().getResources().getString(R.string.IDS_fitness_total_sleep_data_title));
    }
}
