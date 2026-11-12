package com.huawei.health.sport.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.health.servicesui.R;
import defpackage.qre;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes8.dex */
public class AiFitnessPlanEnergyReplacementCard extends FrameLayout {
    private TextView d;
    private View e;

    public AiFitnessPlanEnergyReplacementCard(Context context) {
        super(context);
        d(context);
    }

    public AiFitnessPlanEnergyReplacementCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public AiFitnessPlanEnergyReplacementCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }

    private void d(Context context) {
        LayoutInflater.from(context).inflate(R.layout.ai_fitness_plan_energy_replacement_card, this);
        this.e = findViewById(R.id.jump_to_int_plan_btn);
        this.d = (TextView) findViewById(R.id.current_sport_consumption_text);
    }

    public void setCalorieConsumption(float f) {
        float f2 = f / 1000.0f;
        this.d.setText(getContext().getString(R.string.IDS_hw_int_plan_exercise_consumption, qre.e(R.plurals.IDS_kcalories_unit, Math.round(f2), UnitUtil.e(Math.round(f2), 1, 0))));
    }

    public void setJumpBtnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }
}
