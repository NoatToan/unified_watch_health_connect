package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class InternalScoreTestActivity extends BaseTitleActivity {
    public RadioGroup sexRadioGroup;
    public EditText showText;
    public Context x;

    private void initView() {
        this.showText = (EditText) findViewById(R.id.result_view);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.set_rp);
        this.sexRadioGroup = radioGroup;
        radioGroup.check(R.id.radioFemale);
        ((Button) findViewById(R.id.clearButton)).setOnClickListener(new View.OnClickListener() { // from class: yg4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
        ((Button) findViewById(R.id.startButton)).setOnClickListener(new View.OnClickListener() { // from class: zg4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        this.showText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        this.showText.setText("");
        int valueByID = (int) getValueByID(R.id.age_value_edittv);
        int valueByID2 = (int) getValueByID(R.id.height_value_edittv);
        float valueByID3 = getValueByID(R.id.weight_value_edittv);
        int sexType = getSexType();
        float fCalcuBMI = HMWeightUtils.calcuBMI(valueByID2, valueByID3);
        float valueByID4 = getValueByID(R.id.body_fat_edit);
        float valueByID5 = getValueByID(R.id.muscle_value_edit);
        float valueByID6 = getValueByID(R.id.water_value_edit);
        int valueByID7 = (int) getValueByID(R.id.visceral_fat_value);
        float valueByID8 = getValueByID(R.id.bone_value_edit);
        int valueByID9 = (int) getValueByID(R.id.bmr_value_edit);
        float valueByID10 = getValueByID(R.id.pmr_value_edit);
        float valueByID11 = getValueByID(R.id.subcutaneous_fat_value_edit);
        float valueByID12 = getValueByID(R.id.skeletal_muscle_value_edit);
        UserInfos userInfos = new UserInfos();
        userInfos.setGender(Integer.valueOf(sexType));
        userInfos.setHeight(Integer.valueOf(valueByID2));
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setWeight(Float.valueOf(valueByID3));
        weightInfos.setBmi(Float.valueOf(fCalcuBMI));
        weightInfos.setBody_fat(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID4, 1)));
        weightInfos.setMuscle(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID5, 1)));
        weightInfos.setMoisture(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID6, 1)));
        float f = valueByID7;
        weightInfos.setVisceral_fat(Float.valueOf(HMWeightUtils.scaleFloatToDown(f, 1)));
        weightInfos.setBone_mass(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID8, 1)));
        weightInfos.setBasal_metabolism(Integer.valueOf(valueByID9));
        weightInfos.setPmr(Float.valueOf(valueByID10));
        weightInfos.setSubcutaneousFat(valueByID11);
        weightInfos.setSkeletalMuscle(valueByID12);
        int bodyScore = BodyParamsUtils.getBodyScore(weightInfos, userInfos, valueByID);
        this.showText.setText(String.format(Locale.getDefault(), "身体得分值： %d", Integer.valueOf(bodyScore)));
        WeightInfos weightInfos2 = new WeightInfos();
        weightInfos2.setWeight(Float.valueOf(valueByID3));
        weightInfos2.setUserId(-1L);
        weightInfos2.setScore(Integer.valueOf(bodyScore));
        weightInfos2.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        weightInfos2.setSync(0);
        weightInfos2.setType(0);
        weightInfos2.setImpedance(999);
        weightInfos2.setVisceral_fat(Float.valueOf(HMWeightUtils.scaleFloatToDown(f, 1)));
        weightInfos2.setBody_fat(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID4, 1)));
        weightInfos2.setMuscle(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID5, 1)));
        weightInfos2.setBone_mass(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID8, 1)));
        weightInfos2.setMoisture(Float.valueOf(HMWeightUtils.scaleFloatToDown(valueByID6, 1)));
        weightInfos2.setBasal_metabolism(Integer.valueOf(valueByID9));
        weightInfos2.setBmi(Float.valueOf(fCalcuBMI));
        weightInfos2.setSource(101);
        UserInfos info = UserInfoManager.getManager().getInfo(-1L);
        weightInfos2.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(info.getHeight().intValue(), valueByID3)));
        weightInfos2.setHeight(Integer.valueOf(valueByID2));
        weightInfos2.setBody_shape_type(Integer.valueOf(BodyParamsUtils.calBodyShape(BodyParamsUtils.getWeightAge(weightInfos2.getTimestamp().longValue(), info.getBirthday()), sexType, valueByID2, weightInfos2.getBody_fat().floatValue(), weightInfos2.getMuscle().floatValue())));
        WeightInfoManager.getManager().addInfo(weightInfos2);
        EventBus.getDefault().post(new EventWeightChanged(Long.valueOf(info.getUserId()).longValue(), 2));
        Toast.makeText(getApplicationContext(), "成功入库", 0).show();
    }

    public int getSexType() {
        return this.sexRadioGroup.getCheckedRadioButtonId() == R.id.radioMale ? 1 : 0;
    }

    public float getValueByID(int i) {
        return StringConvertUtils.INSTANCE.stringConvertFloat(((EditText) findViewById(i)).getText().toString());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_test_score);
        Context applicationContext = getApplicationContext();
        this.x = applicationContext;
        setStyle(BaseTitleActivity.STYLE.SINGLE_BACK, ContextCompat.getColor(applicationContext, R.color.bg_weight_title_color));
        setTitleText("身体得分测试");
        initView();
    }
}
