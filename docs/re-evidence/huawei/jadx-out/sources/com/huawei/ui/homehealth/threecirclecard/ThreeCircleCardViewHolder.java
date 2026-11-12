package com.huawei.ui.homehealth.threecirclecard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import com.huawei.ui.homehealth.R;
import defpackage.lrd;
import defpackage.qho;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qsp;
import defpackage.tdy;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class ThreeCircleCardViewHolder extends CardViewBaseHolder {
    private Map<Integer, Integer> av;
    private ThreeCircleView aw;

    public ThreeCircleCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.av = new HashMap(10);
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    protected String b() {
        return "ThreeCircleCardViewHolder";
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    protected void j() {
        super.j();
        this.ad.setVisibility(8);
        this.u.setVisibility(8);
        this.r.setBackgroundResource(R.drawable.ic_health_calorie_dot);
        this.q.setText(getContext().getString(R.string.IDS_active_caloric));
        this.p.setText(getContext().getString(R.string.IDS_hw_health_show_time_unit));
        this.ai.setBackgroundResource(R.drawable.ic_health_workout_dot);
        this.ae.setText(getContext().getString(R.string.IDS_active_workout));
        this.al.setText(getContext().getString(R.string.IDS_settings_steps_unit));
        this.an.setBackgroundResource(R.drawable.ic_health_active_hour_dot);
        this.ak.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
        this.ao.setText(getContext().getString(R.string.IDS_messagecenter_time_hour_value));
        this.m.setText(tdy.b(0, 1, 0));
        this.ah.setText(tdy.b(0, 1, 0));
        this.aj.setText(tdy.b(0, 1, 0));
        n();
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    protected void f() {
        View viewFindViewById;
        super.f();
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.three_circle_layout);
        if (viewStub.getParent() != null) {
            viewFindViewById = viewStub.inflate();
        } else {
            viewFindViewById = this.itemView.findViewById(R.id.three_circle_layout_inflated);
        }
        if (viewFindViewById instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            frameLayout.setVisibility(0);
            this.aw = (ThreeCircleView) frameLayout.findViewById(R.id.circleProgressBar);
        }
    }

    public void e(View.OnClickListener onClickListener) {
        this.aw.setOnClickListener(onClickListener);
    }

    public void b(int i, int i2, int i3) {
        if (i == 0) {
            a(i, this.m, this.p, i2, i3, R.plurals.IDS_kcalories_unit, this.t);
        } else if (i == 1) {
            a(i, this.ah, this.al, i2, i3, R.plurals.IDS_single_circle_intensity_target_desc, this.af);
        } else {
            if (i != 2) {
                return;
            }
            a(i, this.aj, this.ao, i2, i3, R.plurals.IDS_hour_unit, this.ap);
        }
    }

    private void a(int i, HealthTextView healthTextView, HealthTextView healthTextView2, int i2, int i3, int i4, View view) {
        LogUtil.a(b(), " curValue=" + i2, " targetValue=" + i3, " index=", Integer.valueOf(i));
        String strE = UnitUtil.e((double) i2, 1, 0);
        healthTextView.setText(strE);
        String strE2 = qre.e(i4, i3, UnitUtil.e(i3, 1, 0));
        String string = getContext().getResources().getString(R.string.IDS_current_total_time, "", strE2);
        healthTextView2.setText(string);
        lrd.b(view, qre.a(R.string.IDS_settings_alarm_comma, strE, qre.a(R.string.IDS_current_target, strE2)));
        int measuredWidth = this.l.getMeasuredWidth() / 3;
        if (measuredWidth == 0) {
            LogUtil.j(b(), "showCycleTextData itemWidth is 0 ");
            return;
        }
        TextPaint paint = healthTextView2.getPaint();
        paint.setTextSize(healthTextView2.getTextSize());
        int iMeasureText = (int) paint.measureText(string);
        TextPaint paint2 = healthTextView.getPaint();
        paint2.setTextSize(healthTextView.getTextSize());
        int iMeasureText2 = (int) paint2.measureText(strE);
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        LogUtil.a(b(), " targetWidth=" + iMeasureText, " valueWidth=" + iMeasureText2, " marginWidth=", Integer.valueOf(dimensionPixelOffset), " itemWidth=", Integer.valueOf(measuredWidth));
        if (iMeasureText + iMeasureText2 + dimensionPixelOffset > measuredWidth) {
            this.av.put(Integer.valueOf(i), Integer.valueOf(i));
        } else {
            this.av.remove(Integer.valueOf(i));
        }
        b(this.av);
    }

    public void m() {
        d(0, this.m, this.p);
        d(1, this.ah, this.al);
        d(2, this.aj, this.ao);
    }

    private void d(int i, HealthTextView healthTextView, HealthTextView healthTextView2) {
        int measuredWidth = this.l.getMeasuredWidth() / 3;
        int measureWidth = (int) healthTextView.getMeasureWidth();
        int measureWidth2 = (int) healthTextView2.getMeasureWidth();
        if (measuredWidth <= 0 || measureWidth <= 0 || measureWidth2 <= 0) {
            LogUtil.j(b(), "updateCurValueTextByIndex Width = 0 return");
            return;
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        LogUtil.a(b(), "updateCurValueTextByIndex targetWidth=" + measureWidth2, " valueWidth=" + measureWidth, " marginWidth=", Integer.valueOf(dimensionPixelOffset), " itemWidth=", Integer.valueOf(measuredWidth));
        if (measureWidth2 + measureWidth + dimensionPixelOffset > measuredWidth) {
            this.av.put(Integer.valueOf(i), Integer.valueOf(i));
        } else {
            this.av.remove(Integer.valueOf(i));
        }
        b(this.av);
    }

    private void b(Map<Integer, Integer> map) {
        if (!map.isEmpty()) {
            a(this.t, this.p, true);
            a(this.af, this.al, true);
            a(this.ap, this.ao, true);
        } else {
            a(this.t, this.p, false);
            a(this.af, this.al, false);
            a(this.ap, this.ao, false);
        }
    }

    public void d(int i, int i2, int i3, boolean z) {
        this.aw.setIsAnimator(z);
        if (i == 0) {
            this.aw.a("firstCircle", i2, i3);
        } else if (i == 1) {
            this.aw.a("secondCircle", i2, i3);
        } else {
            if (i != 2) {
                return;
            }
            this.aw.a("thirdCircle", i2, i3);
        }
    }

    public void k() {
        if (this.aw == null) {
            LogUtil.a(b(), "updateThreeCireIcon mCircleProgressBar == null");
        } else if (WheelChairStateManager.a().d()) {
            this.aw.a("secondCircle", R.drawable.wheel_excise_icon);
            this.aw.a("thirdCircle", R.drawable.wheel_activity_icon);
        } else {
            this.aw.a("secondCircle", R.drawable.ic_time_xxxhdpi);
            this.aw.a("thirdCircle", R.drawable.ic_excise_xxxhdpi);
        }
    }

    public void l() {
        if (this.ak == null) {
            return;
        }
        this.ak.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
    }

    public void n() {
        if (WheelChairStateManager.a().d()) {
            qsp.c(this.d, qqz.c(getContext(), R.drawable.wheel_chair_push));
            this.g.setText(R.string.IDS_three_card_wheelchair_title);
        } else {
            c(R.string.IDS_three_card_step_title, R.drawable.health_life_icon_task_step, R.color.color_64bb5c);
        }
    }

    public void a(int i, int i2) {
        n();
        if (WheelChairStateManager.a().d()) {
            String strE = UnitUtil.e(Math.max(i, 0), 1, 0);
            String strE2 = qre.e(R.plurals.IDS_wheel_chair_value_unit, Math.max(i, 0), strE);
            this.j.setText(tdy.e(strE2, strE));
            lrd.b(this.j, strE2);
        } else {
            e(i, i2);
        }
        b(this.e);
    }

    protected void e(int i, int i2) {
        String string;
        if (i > -1) {
            string = UnitUtil.e(i, 1, 0);
        } else {
            string = getContext().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        String strE = qre.e(R.plurals.IDS_single_circle_walk_target_desc, i2, UnitUtil.e(i2, 1, 0));
        this.j.setText(tdy.e(getContext().getResources().getString(R.string.IDS_current_total_time, string, strE), string));
        lrd.b(this.j, qre.a(R.string.IDS_settings_alarm_comma, string, qre.a(R.string.IDS_current_target, strE.replaceAll(",", ""))));
    }

    private void c(int i, int i2, int i3) {
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(getContext(), i2));
        DrawableCompat.setTint(drawableWrap, qre.e(i3));
        Drawable drawableE = e(drawableWrap);
        this.g.setText(getContext().getString(i));
        this.d.setBackground(drawableE);
    }

    private Drawable e(Drawable drawable) {
        return LanguageUtil.ba(getContext()) ? qqz.e(getContext(), drawable) : drawable;
    }
}
