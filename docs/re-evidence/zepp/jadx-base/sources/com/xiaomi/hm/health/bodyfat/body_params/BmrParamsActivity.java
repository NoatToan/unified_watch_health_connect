package com.xiaomi.hm.health.bodyfat.body_params;

import android.os.Bundle;
import android.widget.TextView;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamsColorUtils;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class BmrParamsActivity extends BaseParamsActivity {
    private static final String A = "Params-BmrParamsActivity";
    private float z;

    private void r() {
        if (getIntent() != null) {
            this.z = getIntent().getFloatExtra("weightKg", 0.0f);
            HMLog.d(A, "weightKg = " + this.z, new Object[0]);
        }
    }

    private void s() {
        if (this.mFigureView.getVisibility() != 0) {
            return;
        }
        int iIntValue = this.mUserInfo.getGender().intValue();
        HMLog.i(A, "weightAge = " + this.weightAge + ", sex = " + iIntValue + " , bodyParamsStr = " + this.bodyParamsStr, new Object[0]);
        int bmrNormalValue = BodyParamsUtils.getBmrNormalValue(this.weightAge, iIntValue, this.z);
        StringBuilder sb = new StringBuilder();
        sb.append("sections = ");
        sb.append(bmrNormalValue);
        HMLog.i(A, sb.toString(), new Object[0]);
        this.mFigureView.setValues(new float[]{10.0f, (float) bmrNormalValue, 5000.0f}, ParamsColorUtils.get2SectionsColors(this.mContext), this.mContext.getResources().getStringArray(R.array.brm_leval));
        this.mFigureView.setListener(new Function1() { // from class: g30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.u((Float) obj);
            }
        });
        this.mFigureView.setInitValue(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr));
    }

    private void t() {
        this.mUnitTv.setVisibility(0);
        this.mUnitTv.setText(R.string.kilo_cal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u(Float f) {
        return f.intValue() + getResources().getString(R.string.kilo_cal);
    }

    private void v(BodyParamsUtils.BodyBmrFigure bodyBmrFigure) {
        int i;
        if (bodyBmrFigure.equals(BodyParamsUtils.BodyBmrFigure.Standard)) {
            i = R.color.weight_bg;
        } else {
            i = bodyBmrFigure.equals(BodyParamsUtils.BodyBmrFigure.Not_Standard) ? R.color.high_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.basal_metabolism), null);
        if (judgeShowParamsValue()) {
            r();
            t();
            TextView textView = this.mValueTv;
            Locale locale = Locale.getDefault();
            StringConvertUtils.Companion companion = StringConvertUtils.INSTANCE;
            textView.setText(String.format(locale, "%,d", Integer.valueOf(companion.stringConvertInt(this.bodyParamsStr))));
            BodyParamsUtils.BodyBmrFigure bmrFigure = BodyParamsUtils.getBmrFigure(companion.stringConvertInt(this.bodyParamsStr), this.weightAge, this.mUserInfo.getGender().intValue(), this.z);
            v(bmrFigure);
            this.mLevelTv.setText(BodyParamsUtils.getBmrLevelStr(this.mContext, bmrFigure));
            this.hasFigureTv.setText(R.string.bmr_activity_text);
        } else {
            t();
            updateViewColorNoValues();
        }
        s();
    }
}
