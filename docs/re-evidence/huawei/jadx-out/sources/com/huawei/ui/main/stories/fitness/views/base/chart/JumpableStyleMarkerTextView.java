package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.main.R;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class JumpableStyleMarkerTextView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f27170c;
    private HealthTextView d;
    private HealthTextView e;
    private View.OnClickListener g;
    private View.OnClickListener h;
    private int i;

    public JumpableStyleMarkerTextView(Context context) {
        super(context);
        this.e = null;
        this.f27170c = null;
        this.i = 0;
        this.f27168a = false;
        b();
    }

    public JumpableStyleMarkerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = null;
        this.f27170c = null;
        this.i = 0;
        this.f27168a = false;
        b();
    }

    public JumpableStyleMarkerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = null;
        this.f27170c = null;
        this.i = 0;
        this.f27168a = false;
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.view_jumpable_marker_textview, this);
        this.h = new a();
        this.d = (HealthTextView) findViewById(R.id.detail_markview_data);
        this.e = (HealthTextView) findViewById(R.id.detail_markview_data_unit);
        this.f27169b = (HealthTextView) findViewById(R.id.detail_markview_data_head);
        this.f27170c = (RelativeLayout) findViewById(R.id.jumpable_click_area);
        if (LanguageUtil.aj(getContext()) || LanguageUtil.br(getContext())) {
            this.d = (HealthTextView) findViewById(R.id.kiswahili_detail_markview_data);
            this.e = (HealthTextView) findViewById(R.id.kiswahili_detail_markview_data_unit);
            this.f27169b = (HealthTextView) findViewById(R.id.kiswahili_detail_markview_data_head);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.kiswahili_jumpable_click_area);
            this.f27170c = relativeLayout;
            relativeLayout.setVisibility(0);
        }
        if (qrs.ac()) {
            this.e.setTextSize(1, 28.0f);
            this.f27169b.setTextSize(1, 28.0f);
        }
        this.f27170c.setOnClickListener(this.h);
    }

    public void e(int i) {
        Drawable drawableMutate;
        if (this.i == i) {
            return;
        }
        this.d.setTextColor(i);
        this.e.setTextColor(i);
        this.f27169b.setTextColor(i);
        if (!LanguageUtil.ba(getContext())) {
            drawableMutate = getResources().getDrawable(R.mipmap.ic_arrow_purple).mutate();
        } else {
            drawableMutate = getResources().getDrawable(R.mipmap.ic_arrow_purple_left).mutate();
        }
        drawableMutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public void setMarkerText(String str, String str2) {
        if (!TextUtils.equals(this.d.getText(), str)) {
            this.d.setText(str);
        }
        if (TextUtils.equals(this.e.getText(), str2)) {
            return;
        }
        this.e.setText(str2);
    }

    public void setContentOnClickListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public void setHost(ObserveredClassifiedView observeredClassifiedView) {
        if (observeredClassifiedView.getStepDataType().isYearData() && !observeredClassifiedView.getStepDataType().isAllAportData()) {
            if (observeredClassifiedView.getStepDataType().isCaloriesData() || observeredClassifiedView.getStepDataType().isClimbData() || observeredClassifiedView.getStepDataType().isDistanceData() || observeredClassifiedView.getStepDataType().isTimeStrengthData() || observeredClassifiedView.getStepDataType().isStepData()) {
                this.f27169b.setVisibility(0);
                this.f27169b.setText(getContext().getString(R.string.IDS_hw_health_show_healthdata_weight_average));
                return;
            }
            return;
        }
        if (observeredClassifiedView.getStepDataType().isAllAportData() && observeredClassifiedView.getDataLayerType() == DataLayerType.CALORIES) {
            this.f27169b.setVisibility(0);
            this.f27169b.setText(getContext().getString(R.string.IDS_track_total_calories));
        } else {
            this.f27169b.setVisibility(8);
        }
    }

    class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (JumpableStyleMarkerTextView.this.g == null || !JumpableStyleMarkerTextView.this.f27168a) {
                return;
            }
            JumpableStyleMarkerTextView.this.g.onClick(view);
        }
    }

    public void setTextJumpable(boolean z) {
        this.f27168a = z;
    }
}
