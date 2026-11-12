package com.xiaomi.hm.health.bodyfat.body_params;

import android.os.Bundle;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamsColorUtils;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class MuscleParamsActivity extends BaseParamsActivity {
    private static final String A = "Params-MuscleParamsActivity";
    private int z;

    private void r() {
        if (this.mFigureView.getVisibility() != 0) {
            return;
        }
        this.mFigureView.setListener(new Function1() { // from class: t95
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.t((Float) obj);
            }
        });
        int iIntValue = this.mUserInfo.getGender().intValue();
        HMLog.i(A, "weightAge = " + this.weightAge + ", sex = " + iIntValue + " , bodyParamsStr = " + this.bodyParamsStr, new Object[0]);
        float[] muscleAllSection = BodyParamsUtils.getMuscleAllSection(this.mUserInfo.getHeight().intValue(), iIntValue);
        StringBuilder sb = new StringBuilder();
        sb.append("sections = ");
        sb.append(Arrays.toString(muscleAllSection));
        HMLog.i(A, sb.toString(), new Object[0]);
        this.mFigureView.setValues(new float[]{HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(10.0f, this.z), 1), HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(muscleAllSection[0], this.z), 1), HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(muscleAllSection[1], this.z), 1), HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(120.0f, this.z), 1)}, ParamsColorUtils.getMuscleColors(this.mContext), this.mContext.getResources().getStringArray(R.array.muscle_content_leval));
        this.mFigureView.setInitValue(Float.valueOf(this.bodyParamsStr).floatValue());
    }

    private void s() {
        this.mUnitTv.setVisibility(0);
        this.z = BFCallback.getUnitManager().getWeightUnit();
        this.mUnitTv.setText(HMWeightUtils.toUnitStr(getApplicationContext(), this.z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t(Float f) {
        return f + HMWeightUtils.toUnitStr(getApplicationContext(), this.z);
    }

    private void u(BodyParamsUtils.BodyMuscleFigure bodyMuscleFigure) {
        int i;
        if (bodyMuscleFigure.equals(BodyParamsUtils.BodyMuscleFigure.Low)) {
            i = R.color.high_color;
        } else if (bodyMuscleFigure.equals(BodyParamsUtils.BodyMuscleFigure.Normal)) {
            i = R.color.weight_bg;
        } else {
            i = bodyMuscleFigure.equals(BodyParamsUtils.BodyMuscleFigure.High) ? R.color.excellent_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.muscle), null);
        if (judgeShowParamsValue()) {
            BodyParamsUtils.BodyMuscleFigure bodyMuscleFigureCalMuscleFigure = BodyParamsUtils.calMuscleFigure(Float.valueOf(HMWeightUtils.convertToKg(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr), BFCallback.getUnitManager().getWeightUnit())).floatValue(), this.weightAge, this.height, this.mUserInfo.getGender().intValue());
            u(bodyMuscleFigureCalMuscleFigure);
            this.mLevelTv.setText(BodyParamsUtils.getMuscleLevalStr(this.mContext, bodyMuscleFigureCalMuscleFigure));
            this.hasFigureTv.setText(R.string.muscle_activity_text);
        } else {
            updateViewColorNoValues();
        }
        s();
        r();
    }
}
