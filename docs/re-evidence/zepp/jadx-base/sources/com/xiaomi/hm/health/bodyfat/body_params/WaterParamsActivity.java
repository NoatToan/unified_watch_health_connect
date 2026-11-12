package com.xiaomi.hm.health.bodyfat.body_params;

import android.os.Bundle;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamsColorUtils;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class WaterParamsActivity extends BaseParamsActivity {
    private static final String z = "Params-WaterParamsActivity";

    private void r() {
        if (this.mFigureView.getVisibility() != 0) {
            return;
        }
        this.mFigureView.setListener(new Function1() { // from class: vl8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.s((Float) obj);
            }
        });
        int iIntValue = this.mUserInfo.getGender().intValue();
        HMLog.i(z, "weightAge = " + this.weightAge + ", sex = " + iIntValue + " , bodyParamsStr = " + this.bodyParamsStr, new Object[0]);
        float[] waterAllSection = BodyParamsUtils.getWaterAllSection(this.weightAge, iIntValue);
        if (waterAllSection == null) {
            return;
        }
        this.mFigureView.setValues(new float[]{35.0f, waterAllSection[0], waterAllSection[1], 75.0f}, ParamsColorUtils.getWaterColors(this.mContext), this.mContext.getResources().getStringArray(R.array.water_leval));
        this.mFigureView.setInitValue(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s(Float f) {
        return f + getResources().getString(R.string.percentage);
    }

    private void t(BodyParamsUtils.BodyWaterFigure bodyWaterFigure) {
        int i;
        if (bodyWaterFigure.equals(BodyParamsUtils.BodyWaterFigure.Slightly_Lower)) {
            i = R.color.high_color;
        } else if (bodyWaterFigure.equals(BodyParamsUtils.BodyWaterFigure.Normal)) {
            i = R.color.weight_bg;
        } else {
            i = bodyWaterFigure.equals(BodyParamsUtils.BodyWaterFigure.Slightly_High) ? R.color.excellent_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.water), null);
        if (judgeShowParamsValue()) {
            BodyParamsUtils.BodyWaterFigure bodyWaterFigureCalWatereFigure = BodyParamsUtils.calWatereFigure(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr), this.weightAge, this.mUserInfo.getGender().intValue());
            t(bodyWaterFigureCalWatereFigure);
            this.mLevelTv.setText(BodyParamsUtils.getWaterLevelStr(this.mContext, bodyWaterFigureCalWatereFigure));
            this.hasFigureTv.setText(R.string.water_activity_text);
        } else {
            updateViewColorNoValues();
        }
        r();
    }
}
