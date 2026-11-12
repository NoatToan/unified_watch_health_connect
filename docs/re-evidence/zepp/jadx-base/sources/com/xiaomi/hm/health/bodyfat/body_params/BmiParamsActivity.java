package com.xiaomi.hm.health.bodyfat.body_params;

import android.content.Context;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.databases.model.UserInfos;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BmiParamsActivity extends BaseParamsActivity {
    private static final String D = "BmiParamsActivity";
    private Context A;
    private int B;
    private int C;
    private UserInfos z;

    private void initView() {
        this.mUnitTv.setVisibility(8);
        if (judgeShowParamsValue()) {
            HMWeightUtils.BodyFigure bodyFigure = HMWeightUtils.toBodyFigure(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr), this.C, this.z.getGender().intValue());
            s(bodyFigure);
            this.mLevelTv.setText(HMWeightUtils.getBmiLevel(this.A, bodyFigure));
            this.hasFigureTv.setText(R.string.bmi_activity_text);
        } else {
            updateViewColorNoValues();
        }
        r();
    }

    private void o() {
        this.mValueTv.setText(R.string.empty_value);
        this.mValueTv.setTextColor(ContextCompat.getColor(this.A, R.color.s5));
        this.mLevelTv.setVisibility(4);
        this.hasFigureTv.setVisibility(8);
        this.noFigureTv.setVisibility(0);
        this.mFigureView.setVisibility(8);
        this.splitView.setVisibility(8);
    }

    private void q() {
        if (getIntent() != null) {
            this.z = UserInfoManager.getManager().getInfo(getIntent().getLongExtra("UID", Long.parseLong(BFCallback.getHMPersonInfo().getUserid())));
            HMLog.d(D, "mUserInfo is " + HMWeightUtils.parserUserInfos(this.z), new Object[0]);
            this.B = getIntent().getIntExtra("height", -1);
            this.C = getIntent().getIntExtra("weight_age", -1);
            HMLog.d(D, "height = " + this.B + " , weightAge = " + this.C, new Object[0]);
        }
    }

    private void r() {
        int i;
        if (this.mFigureView.getVisibility() != 0) {
            return;
        }
        int iIntValue = this.z.getGender().intValue();
        float fCalcuBMI = HMWeightUtils.calcuBMI(this.B, 3.0f);
        float fCalcuBMI2 = HMWeightUtils.calcuBMI(this.B, 120.0f);
        HMLog.i(D, "weightAge = " + this.C + ", sex = " + iIntValue + " , minBmi = " + fCalcuBMI + " , maxBmi = " + fCalcuBMI2, new Object[0]);
        Utils utils = Utils.INSTANCE;
        if (utils.isChineseLanguage() && (i = this.C) >= 7 && i < 18) {
            float[] childBmiSection = HMWeightUtils.getChildBmiSection(i, iIntValue);
            this.mFigureView.setValues(new float[]{fCalcuBMI, childBmiSection[0], childBmiSection[1], fCalcuBMI2}, HMWeightUtils.getBmiColorFor7_18(this.A), BodyParamsUtils.getChildBmiLables(getApplicationContext()));
        } else if (this.C >= 18) {
            this.mFigureView.setValues(utils.isChineseLanguage() ? new float[]{fCalcuBMI, 18.5f, 24.0f, 28.0f, fCalcuBMI2} : new float[]{fCalcuBMI, 18.5f, 25.0f, 30.0f, fCalcuBMI2}, HMWeightUtils.getBmiColorForAdualt(this.A), BodyParamsUtils.getAdualtBmiLables(getApplicationContext()));
        }
        this.mFigureView.setInitValue(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr));
    }

    private void s(HMWeightUtils.BodyFigure bodyFigure) {
        int i;
        if (bodyFigure.equals(HMWeightUtils.BodyFigure.Light)) {
            i = R.color.slight_low_color;
        } else if (bodyFigure.equals(HMWeightUtils.BodyFigure.Normal)) {
            i = R.color.weight_bg;
        } else if (bodyFigure.equals(HMWeightUtils.BodyFigure.Weight)) {
            i = R.color.slight_high_color;
        } else if (bodyFigure.equals(HMWeightUtils.BodyFigure.Fat)) {
            i = R.color.high_color;
        } else {
            i = bodyFigure.equals(HMWeightUtils.BodyFigure.VeryFat) ? R.color.very_high_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity
    public boolean judgeShowParamsValue() {
        int i;
        String string = getTitleTextView().getText().toString();
        boolean zEquals = Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage());
        if (this.B >= 90 && (i = this.C) >= 7 && (zEquals || i >= 18)) {
            this.mValueTv.setText(this.bodyParamsStr);
            this.mValueTv.setTextColor(ContextCompat.getColor(this.A, R.color.s5));
            this.mLevelTv.setVisibility(0);
            this.hasFigureTv.setVisibility(0);
            this.noFigureTv.setVisibility(8);
            this.mFigureView.setVisibility(0);
            this.splitView.setVisibility(0);
            return true;
        }
        o();
        int i2 = this.C;
        if (i2 < 7 || (!zEquals && i2 < 18)) {
            int i3 = zEquals ? 7 : 18;
            this.noFigureTv.setText(getResources().getQuantityString(R.plurals.no_body_params_for_age_min, i3, Integer.valueOf(i3), string));
        } else if (this.B < 90) {
            this.noFigureTv.setText(getString(R.string.no_body_params_for_height_min, new Object[]{90, string}));
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        this.A = applicationContext;
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.SINGLE_BACK;
        int i = R.color.body_params_title_bg;
        setStyle(style, ContextCompat.getColor(applicationContext, i));
        BFTitleStyleKt.setTitleStyle(this, getString(R.string.body_params_bmi), null, style, ContextCompat.getColor(this.A, i), !RainbowUtils.isDarkMode(this));
        q();
        initView();
    }
}
