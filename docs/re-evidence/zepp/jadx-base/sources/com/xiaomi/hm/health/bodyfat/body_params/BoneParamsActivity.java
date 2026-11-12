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
public class BoneParamsActivity extends BaseParamsActivity {
    private static final String A = "Params-BoneParamsActivity";
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
        this.mFigureView.setListener(new Function1() { // from class: v40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.u((Float) obj);
            }
        });
        int iIntValue = this.mUserInfo.getGender().intValue();
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        float fConvertTo = HMWeightUtils.convertTo(0.5f, 0, weightUnit);
        float fConvertTo2 = HMWeightUtils.convertTo(8.0f, 0, weightUnit);
        HMLog.i(A, "weightAge = " + this.weightAge + ", sex = " + iIntValue + " , bodyParamsStr = " + this.bodyParamsStr, new Object[0]);
        float[] boneSection = BodyParamsUtils.getBoneSection(iIntValue, this.z);
        StringBuilder sb = new StringBuilder();
        sb.append("sections = ");
        sb.append(Arrays.toString(boneSection));
        HMLog.i(A, sb.toString(), new Object[0]);
        this.mFigureView.setValues(new float[]{fConvertTo, HMWeightUtils.scaleFloatToDown(HMWeightUtils.convertTo(boneSection[0], 0, weightUnit), 1), HMWeightUtils.scaleFloatToDown(HMWeightUtils.convertTo(boneSection[1], 0, weightUnit), 1), fConvertTo2}, ParamsColorUtils.getWaterColors(this.mContext), this.mContext.getResources().getStringArray(R.array.bone_leval));
        this.mFigureView.setInitValue(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr));
    }

    private void t() {
        this.mUnitTv.setVisibility(0);
        this.mUnitTv.setText(HMWeightUtils.toUnitStr(getApplicationContext(), BFCallback.getUnitManager().getWeightUnit()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u(Float f) {
        return f + HMWeightUtils.toUnitStr(getApplicationContext(), BFCallback.getUnitManager().getWeightUnit());
    }

    private void v(BodyParamsUtils.BoneValueType boneValueType) {
        int i;
        if (boneValueType.equals(BodyParamsUtils.BoneValueType.Low)) {
            i = R.color.high_color;
        } else if (boneValueType.equals(BodyParamsUtils.BoneValueType.Normal)) {
            i = R.color.weight_bg;
        } else {
            i = boneValueType.equals(BodyParamsUtils.BoneValueType.High) ? R.color.excellent_color : R.color.body_params_no_values_bg;
        }
        updateStatusBarAndUpView(i);
    }

    @Override // com.xiaomi.hm.health.bodyfat.body_params.BaseParamsActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        int i = R.string.bone_value;
        setTitleText(i);
        BFTitleStyleKt.setUnifyTitleStyle(this, getString(i), null);
        if (judgeShowParamsValue()) {
            r();
            t();
            BodyParamsUtils.BoneValueType boneValueTypeCalBoneType = BodyParamsUtils.calBoneType(HMWeightUtils.convertTo(StringConvertUtils.INSTANCE.stringConvertFloat(this.bodyParamsStr), BFCallback.getUnitManager().getWeightUnit(), 0), this.weightAge, this.mUserInfo.getGender().intValue(), this.z);
            v(boneValueTypeCalBoneType);
            this.mLevelTv.setText(BodyParamsUtils.getBoneLevelStr(this.mContext, boneValueTypeCalBoneType));
            this.hasFigureTv.setText(R.string.bone_activity_text);
        } else {
            t();
            updateViewColorNoValues();
        }
        s();
    }
}
