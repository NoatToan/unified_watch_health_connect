package com.xiaomi.hm.health.bodyfat.body_params;

import android.os.Bundle;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.body_params.VisceralFatParamsActivity;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamsColorUtils;
import com.xiaomi.hm.health.bodyfat.utils.WeightConstant;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class VisceralFatParamsActivity extends BaseParamsActivity {
    private static final String z = "Params-VisceralFatParamsActivity";

    private void r() {
    }

    private void s() {
        if (this.mFigureView.getVisibility() != 0) {
            return;
        }
        HMLog.i(z, "age = " + this.weightAge + ", sex = " + this.mUserInfo.getGender().intValue() + " , bodyParamsStr = " + this.bodyParamsStr, new Object[0]);
        float[] fArr = WeightConstant.VISCERAL_FAT_SECTIONS;
        StringBuilder sb = new StringBuilder();
        sb.append("sections = ");
        sb.append(Arrays.toString(fArr));
        HMLog.i(z, sb.toString(), new Object[0]);
        this.mFigureView.setValues(new float[]{1.0f, fArr[0], fArr[1], 50.0f}, ParamsColorUtils.getVisceralFatColors(this.mContext), this.mContext.getResources().getStringArray(R.array.visceral_fat_leval));
        this.mFigureView.setInitValue(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr));
        this.mFigureView.setListener(new Function1() { // from class: yb8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisceralFatParamsActivity.u((Float) obj);
            }
        });
    }

    private void t() {
        this.mUnitTv.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(Float f) {
        return String.valueOf(f.intValue());
    }

    private void v(BodyParamsUtils.VisceralFatFigure visceralFatFigure) {
        int i;
        if (visceralFatFigure.equals(BodyParamsUtils.VisceralFatFigure.Normal)) {
            i = R.color.weight_bg;
        } else if (visceralFatFigure.equals(BodyParamsUtils.VisceralFatFigure.Slightly_Higher)) {
            i = R.color.slight_high_color;
        } else {
            i = visceralFatFigure.equals(BodyParamsUtils.VisceralFatFigure.High) ? R.color.high_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.visceral_value), null);
        if (judgeShowParamsValue()) {
            r();
            t();
            BodyParamsUtils.VisceralFatFigure visceralFatFigureCalVisceralFatType = BodyParamsUtils.calVisceralFatType(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr), this.weightAge);
            v(visceralFatFigureCalVisceralFatType);
            this.mLevelTv.setText(BodyParamsUtils.getVisceralFatLevalStr(this.mContext, visceralFatFigureCalVisceralFatType));
            this.hasFigureTv.setText(R.string.visceral_fat_activity_text);
        } else {
            t();
            updateViewColorNoValues();
        }
        s();
    }
}
