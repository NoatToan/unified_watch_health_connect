package com.xiaomi.hm.health.bodyfat.body_params;

import android.os.Bundle;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamsColorUtils;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class BodyFatParamsActivity extends BaseParamsActivity {
    private static final String z = "Params-BodyFatParamsActivity";

    private void r() {
        if (this.mFigureView.getVisibility() != 0) {
            return;
        }
        this.mFigureView.setListener(new Function1() { // from class: m30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.s((Float) obj);
            }
        });
        int iIntValue = this.mUserInfo.getGender().intValue();
        HMLog.i(z, "weightAge = " + this.weightAge + ", sex = " + iIntValue, new Object[0]);
        float[] bodyFatAllSection = BodyParamsUtils.getBodyFatAllSection(this.weightAge, iIntValue);
        String[] stringArray = this.mContext.getResources().getStringArray(R.array.bodyfat_content_leval);
        if (bodyFatAllSection != null) {
            HMLog.i(z, "sections = " + Arrays.toString(bodyFatAllSection), new Object[0]);
            this.mFigureView.setValues(new float[]{1.0f, bodyFatAllSection[0], bodyFatAllSection[1], bodyFatAllSection[2], bodyFatAllSection[3], 45.0f}, ParamsColorUtils.getBodyFatColors(this.mContext), stringArray);
            this.mFigureView.setInitValue(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s(Float f) {
        return f + getResources().getString(R.string.percentage);
    }

    private void t(BodyParamsUtils.BodyFatFigure bodyFatFigure) {
        int i;
        if (bodyFatFigure.equals(BodyParamsUtils.BodyFatFigure.Low)) {
            i = R.color.low_color;
        } else if (bodyFatFigure.equals(BodyParamsUtils.BodyFatFigure.Slightly_Lower)) {
            i = R.color.slight_low_color;
        } else if (bodyFatFigure.equals(BodyParamsUtils.BodyFatFigure.Normal)) {
            i = R.color.weight_bg;
        } else if (bodyFatFigure.equals(BodyParamsUtils.BodyFatFigure.Slightly_Higher)) {
            i = R.color.slight_high_color;
        } else {
            i = bodyFatFigure.equals(BodyParamsUtils.BodyFatFigure.High) ? R.color.high_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.body_fat), null);
        if (judgeShowParamsValue()) {
            BodyParamsUtils.BodyFatFigure bodyFatFigureCalBodyFatFigure = BodyParamsUtils.calBodyFatFigure(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr), this.weightAge, this.mUserInfo.getGender().intValue());
            t(bodyFatFigureCalBodyFatFigure);
            this.mLevelTv.setText(BodyParamsUtils.getBodyFatLevalStr(this.mContext, bodyFatFigureCalBodyFatFigure));
            this.hasFigureTv.setText(R.string.bodyfat_activity_text);
        } else {
            updateViewColorNoValues();
        }
        r();
    }
}
