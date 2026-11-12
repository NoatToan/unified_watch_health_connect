package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import java.text.ParseException;

/* JADX INFO: loaded from: classes19.dex */
public class WeightingDynamicWeightView extends FrameLayout {
    private static final float r = 316.0f;
    private static final float s = 0.55f;
    private WeightChartView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private View h;
    private View i;
    private View j;
    private View k;
    private ImageView l;
    private ImageView m;
    private FatMeasuringView n;
    private float o;
    private float p;
    private float q;

    public WeightingDynamicWeightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 0.0f;
        this.h = LayoutInflater.from(context).inflate(R.layout.view_weighting_dynamic, this);
        this.o = 0.0f;
        this.p = 0.0f;
        init();
    }

    public void forceToNormal() {
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        this.k.setVisibility(0);
    }

    public void hideFatMeasuringView() {
        this.n.hide();
    }

    public void init() {
        this.i = this.h.findViewById(R.id.weight_content_all);
        this.j = this.h.findViewById(R.id.weight_bmi_tips);
        this.k = this.h.findViewById(R.id.weight_number_layout);
        TextView textView = (TextView) this.h.findViewById(R.id.number);
        this.b = textView;
        textView.setText(String.valueOf(this.o));
        this.l = (ImageView) findViewById(R.id.weight_overweight);
        this.m = (ImageView) findViewById(R.id.weight_low_power);
        this.c = (TextView) this.h.findViewById(R.id.number_unit);
        this.d = (TextView) this.h.findViewById(R.id.tips);
        this.e = (TextView) this.h.findViewById(R.id.bmi_number);
        this.f = (TextView) this.h.findViewById(R.id.bmi_standard);
        this.g = (TextView) this.h.findViewById(R.id.bmi_text);
        WeightChartView weightChartView = (WeightChartView) this.h.findViewById(R.id.weight_chart);
        this.a = weightChartView;
        weightChartView.setMaxValue(this.p);
        this.a.setValue(this.o);
        this.n = (FatMeasuringView) this.h.findViewById(R.id.bodyfat_view);
    }

    public void normalToLowpower() {
        this.k.setVisibility(8);
        this.m.setVisibility(0);
    }

    public void normalToOverweight() {
        this.k.setVisibility(8);
        this.l.setVisibility(0);
    }

    public void setBmiNumber(String str) {
        this.e.setText(str);
    }

    public void setBmiStandard(String str) {
        this.f.setText(str);
    }

    public void setBmiText(String str) {
        this.g.setText(str);
    }

    public void setMaxWeightNumber(float f) {
        this.p = f;
        this.a.setMaxValue(f);
    }

    public void setWeightNumber(String str) throws ParseException {
        float weightStringToFloat = HMWeightUtils.parseWeightStringToFloat(str);
        this.o = weightStringToFloat;
        WeightChartView weightChartView = this.a;
        if (weightChartView != null) {
            weightChartView.setValue(weightStringToFloat);
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setWeightOverloadTips(String str) {
        this.d.setSingleLine(false);
        this.d.setText(str);
    }

    public void setWeightTips(String str) {
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setText(str);
    }

    public void setWeightUnit(String str) {
        this.c.setText(str);
    }

    public void showFatMeasuringView() {
        this.n.show();
    }

    public void slide(float f) {
        this.q = f;
        updateUI();
    }

    public void updateUI() {
        float f = this.q / s;
        float fDp2px = ViewUtils.dp2px(getContext(), r);
        float f2 = this.q * fDp2px;
        float fDp2px2 = f2 * (-1.0f) * (ViewUtils.dp2px(getContext(), 73.0f) / (fDp2px * s));
        this.i.setTranslationY(fDp2px2);
        float f3 = 1.0f - f;
        this.j.setAlpha(f3);
        this.d.setAlpha(f3);
        if (f < 0.2f) {
            this.a.setTranslationY(fDp2px2);
        }
        this.a.setRotationX(f * 90.0f);
        this.a.setAlpha(f3);
    }
}
