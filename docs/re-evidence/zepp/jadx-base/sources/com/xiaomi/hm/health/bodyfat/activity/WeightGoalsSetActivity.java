package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightGoalsSetActivity;
import com.xiaomi.hm.health.bodyfat.device.IWeightDevice;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalPersistent;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WeightGoalsSetActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String I = "WeightGoalsSetActivity";
    private static final int J = 1;
    public static final int TYPE_SET_GOALS = 2;
    private int A;
    private TextView B;
    private TextView C;
    private float D;
    private Context E;
    private boolean F;
    private int[] G;
    public boolean mSelf;
    public HMUserInfo mUserInfo;
    private WeightGoalPersistent y;
    private long z;
    private final Lazy<IWeightDevice> x = KoinJavaComponent.inject(IWeightDevice.class);
    public float H = 0.0f;

    public static class SaveWeightInfoTask extends AsyncTask<Void, Void, Boolean> {
        private long a;
        private int b;
        private HMUserInfo c;

        public SaveWeightInfoTask(long j, int i, HMUserInfo hMUserInfo) {
            this.a = j;
            this.b = i;
            this.c = hMUserInfo;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            HMLog.d(WeightGoalsSetActivity.I, "onPreExecute", new Object[0]);
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            try {
                long j = Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
                long j2 = this.a;
                if (j2 == j) {
                    j2 = -1;
                }
                int i = this.b;
                if (i == 2) {
                    WeightGoalManager.getInstance().syncSyncToServer(j2);
                } else if (i == 1) {
                    WeightGoalManager.getInstance().syncDeleteToServer(j2);
                }
                if (this.a != Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
                    this.c = HMUserInfo.getHMUserInfo(UserInfoManager.getManager().getInfo(this.a));
                    UserInfos userInfos = new UserInfos();
                    this.c.getUserInfos(userInfos);
                    UserInfoManager.getManager().syncInfoToServer(userInfos);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Boolean.TRUE;
        }
    }

    private void A(float f) {
        HMLog.d(I, "weight " + f, new Object[0]);
        int age = Birthday.fromStr(this.mUserInfo.getBirthday()).getAge();
        if (age <= 7) {
            this.B.setText(getString(R.string.bodyfat_baby_weight_tips));
            return;
        }
        if (age > 7 && this.mUserInfo.getHeight() <= 90) {
            this.B.setVisibility(8);
            return;
        }
        if (!Language.isChinese() && age <= 18) {
            this.B.setVisibility(8);
            return;
        }
        this.B.setVisibility(0);
        this.B.setText(String.format(getResources().getString(R.string.bodyfat_goal_weight_for_figure), HMWeightUtils.toBodyFigureDescription(getApplicationContext(), HMWeightUtils.calcuBMI(this.mUserInfo.getHeight(), HMWeightUtils.convertToKg(f, this.A)), age, this.mUserInfo.getGender())));
    }

    private void initView() {
        boolean z;
        int i;
        int i2;
        this.C = (TextView) findViewById(R.id.weight_value_tv);
        ((TextView) findViewById(R.id.weight_unit_tv)).setText(HMWeightUtils.toUnitStr(this.E, this.A));
        this.B = (TextView) findViewById(R.id.tip_tv);
        WeightFigureView weightFigureView = (WeightFigureView) findViewById(R.id.weight_figure_view);
        weightFigureView.setLabelTextSize(12.0f);
        weightFigureView.setLanguageNormal(Language.isChinese() || Language.isEnglish());
        weightFigureView.setCenterLabel(true);
        weightFigureView.setScaleTextSize(11.0f);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            weightFigureView.setScaleTextColor(ContextCompat.getColor(this, R.color.s2));
            weightFigureView.setThumbIcon(R.drawable.weight_pick_icon);
            weightFigureView.setBarGap(ViewUtils.dp2px(this, 2.0f));
            weightFigureView.setLabelToBarSpacing(ViewUtils.dp2px(this, 20.0f));
            weightFigureView.setScaleToBarSpacing(ViewUtils.dp2px(this, 14.0f));
            weightFigureView.setBarHeight(ViewUtils.dp2px(this, 2.0f));
            z = true;
        } else {
            weightFigureView.setScaleTextColor(ContextCompat.getColor(this, R.color.s1));
            weightFigureView.setDynamicLabelColor(ContextCompat.getColor(getApplicationContext(), R.color.s2));
            z = false;
        }
        weightFigureView.setListener(new Function1() { // from class: ns8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WeightGoalsSetActivity.s((Float) obj);
            }
        });
        weightFigureView.setType(0);
        weightFigureView.setTypeface(TypefaceManager.get().getTypeface(this, Font.KM));
        int age = Birthday.fromStr(this.mUserInfo.getBirthday()).getAge();
        if (this.mUserInfo.getHeight() < 90 || age < 7) {
            float[] fArr = {HMWeightUtils.convertFromKg(3.0f, this.A), HMWeightUtils.convertFromKg(120.0f, this.A)};
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                this.G = HMWeightUtils.getWeightScaleColorsForBaby();
            } else {
                this.G = HMWeightUtils.getBmiColorForBaby(this.E);
            }
            weightFigureView.setValues(fArr, this.G, WeightFigureView.INSTANCE.getDEFAULT_LABELS(), BFCallback.getInstance().enableMiDongFlavor() ? p(-1, 2) : this.G, z);
            this.D = (fArr[0] + fArr[1]) / 2.0f;
        } else if (age >= 18) {
            String strAdultBMICalculator = HMWeightUtils.adultBMICalculator(true, this.mUserInfo.getHeight() / 100.0f, this.A);
            float fConvertFromKg = HMWeightUtils.convertFromKg(120.0f, this.A);
            float fConvertFromKg2 = HMWeightUtils.convertFromKg(3.0f, this.A);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Float.valueOf(fConvertFromKg2));
            for (String str : strAdultBMICalculator.split(",")) {
                HMLog.d(I, "scale is " + str, new Object[0]);
                float f = Float.parseFloat(str);
                if (f < fConvertFromKg) {
                    arrayList.add(Float.valueOf((int) f));
                }
            }
            arrayList.add(Float.valueOf(fConvertFromKg));
            String[] adualtFigureLables = HMWeightUtils.getAdualtFigureLables(getApplicationContext());
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                this.G = HMWeightUtils.getWeightScaleColors();
            } else {
                this.G = HMWeightUtils.getBmiColorForAdualt(this.E);
            }
            if (arrayList.size() == 2) {
                this.D = (fConvertFromKg2 + fConvertFromKg) / 2.0f;
            } else {
                this.D = (arrayList.get(1).floatValue() + arrayList.get(arrayList.size() - 1).floatValue()) / 2.0f;
            }
            if (this.mUserInfo.getTargetWeight() > 0.0f) {
                float fQ = q();
                i = 0;
                int i3 = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        i = i3;
                        break;
                    }
                    if (i != arrayList.size() - 1) {
                        if (fQ >= arrayList.get(i).floatValue() && fQ < arrayList.get(i + 1).floatValue()) {
                            break;
                        }
                    } else {
                        i3 = i;
                    }
                    i++;
                }
            } else {
                i = 0;
            }
            weightFigureView.setValues(y(arrayList), this.G, adualtFigureLables, BFCallback.getInstance().enableMiDongFlavor() ? p(i, arrayList.size()) : this.G, z);
        } else if (Utils.INSTANCE.isChineseLanguage()) {
            float childNormalBmi = HMWeightUtils.getChildNormalBmi(age, this.mUserInfo.getGender());
            float childFatBmi = HMWeightUtils.getChildFatBmi(age, this.mUserInfo.getGender());
            float childNormalWeightInUnit = HMWeightUtils.getChildNormalWeightInUnit(childNormalBmi, this.mUserInfo.getHeight() / 100.0f, this.A);
            float childNormalWeightInUnit2 = HMWeightUtils.getChildNormalWeightInUnit(childFatBmi, this.mUserInfo.getHeight() / 100.0f, this.A);
            float[] fArr2 = {HMWeightUtils.convertFromKg(3.0f, this.A), childNormalWeightInUnit, childNormalWeightInUnit2, HMWeightUtils.convertFromKg(120.0f, this.A)};
            this.D = (childNormalWeightInUnit + childNormalWeightInUnit2) / 2.0f;
            if (this.mUserInfo.getTargetWeight() > 0.0f) {
                float fQ2 = q();
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 >= 4) {
                        i2 = i4;
                        break;
                    }
                    if (i2 != 3) {
                        if (fQ2 >= fArr2[i2] && fQ2 < fArr2[i2 + 1]) {
                            break;
                        }
                    } else {
                        i4 = i2;
                    }
                    i2++;
                }
            } else {
                i2 = 0;
            }
            String[] childFigureLables = HMWeightUtils.getChildFigureLables(getApplicationContext());
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                this.G = HMWeightUtils.getWeightScaleColors();
            } else {
                this.G = HMWeightUtils.getBmiColorFor7_18(this.E);
            }
            weightFigureView.setValues(fArr2, this.G, childFigureLables, BFCallback.getInstance().enableMiDongFlavor() ? p(i2, childFigureLables.length) : this.G, z);
        } else {
            if (BFCallback.getInstance().enableMiDongFlavor()) {
                this.G = HMWeightUtils.getWeightScaleColorsForBaby();
            } else {
                this.G = HMWeightUtils.getBmiColorForBaby(this.E);
            }
            weightFigureView.setValues(new float[]{HMWeightUtils.convertFromKg(3.0f, this.A), HMWeightUtils.convertFromKg(120.0f, this.A)}, this.G, WeightFigureView.INSTANCE.getDEFAULT_LABELS(), BFCallback.getInstance().enableMiDongFlavor() ? p(-1, 2) : this.G, z);
            this.D = (HMWeightUtils.convertFromKg(3.0f, this.A) + HMWeightUtils.convertFromKg(120.0f, this.A)) / 2.0f;
        }
        if (this.mUserInfo.getTargetWeight() > 0.0f) {
            float targetWeight = this.mUserInfo.getTargetWeight();
            HMLog.d(I, "targetWeightKg = " + targetWeight, new Object[0]);
            boolean z2 = targetWeight >= 120.0f;
            float fScaleFloat = HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(targetWeight, this.A), 1);
            float fConvertFromKg3 = z2 ? HMWeightUtils.convertFromKg(120.0f, this.A) : fScaleFloat;
            HMLog.d(I, "initValue = " + fConvertFromKg3, new Object[0]);
            weightFigureView.setInitValue(fConvertFromKg3);
            this.C.setText(String.valueOf((int) fScaleFloat));
            A(fScaleFloat);
        } else if (WeightInfoManager.getManager().getInfosCount(Long.parseLong(this.mUserInfo.getUserid())) == 0) {
            HMLog.d(I, "uid = " + this.mUserInfo.getUserid() + ", weightinfo table size = 0 ", new Object[0]);
            weightFigureView.setInitValue(this.D);
            this.C.setText(String.valueOf((int) this.D));
            A(this.D);
        } else {
            float fFloatValue = WeightInfoManager.getManager().getLatestInfo(Long.parseLong(this.mUserInfo.getUserid())).getWeight().floatValue();
            boolean z3 = fFloatValue >= 120.0f;
            float fConvertFromKg4 = HMWeightUtils.convertFromKg(fFloatValue, UnitManager.getInstance().getWeightUnit());
            HMLog.d(I, "lastWeightInfo value = " + fConvertFromKg4, new Object[0]);
            float fConvertFromKg5 = z3 ? HMWeightUtils.convertFromKg(120.0f, this.A) : fConvertFromKg4;
            HMLog.d(I, "initValue = " + fConvertFromKg5, new Object[0]);
            weightFigureView.setInitValue(fConvertFromKg5);
            this.C.setText(String.valueOf((int) fConvertFromKg4));
            A(fConvertFromKg4);
        }
        weightFigureView.setValueIndexListener(new Function2() { // from class: os8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.t((Float) obj, (Integer) obj2);
            }
        });
        View viewFindViewById = findViewById(R.id.confirm_btn);
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            findViewById(R.id.bottom_bar).setVisibility(8);
            viewFindViewById.setOnClickListener(this);
            viewFindViewById.setVisibility(0);
        } else if (this.F) {
            findViewById(R.id.bottom_bar).setVisibility(8);
            viewFindViewById.setOnClickListener(this);
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
            findViewById(R.id.bottom_bar).setVisibility(0);
            findViewById(R.id.right_button).setOnClickListener(this);
            findViewById(R.id.left_button).setOnClickListener(this);
        }
    }

    private int[] p(int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i) {
                iArr[i3] = ContextCompat.getColor(this, R.color.s1);
            } else {
                iArr[i3] = ContextCompat.getColor(this, R.color.s3);
            }
        }
        return iArr;
    }

    private float q() {
        float targetWeight = this.mUserInfo.getTargetWeight();
        HMLog.d(I, "targetWeightKg = " + targetWeight, new Object[0]);
        boolean z = targetWeight >= 120.0f;
        float fScaleFloat = HMWeightUtils.scaleFloat(HMWeightUtils.convertFromKg(targetWeight, this.A), 1);
        if (z) {
            fScaleFloat = HMWeightUtils.convertFromKg(120.0f, this.A);
        }
        HMLog.d(I, "initValue = " + fScaleFloat, new Object[0]);
        return fScaleFloat;
    }

    private void r() {
        UserInfos info;
        this.E = getApplicationContext();
        this.A = UnitManager.getInstance().getWeightUnit();
        if (getIntent() != null) {
            HMLog.d(I, "getMemberDetailIntent is not null", new Object[0]);
            long j = Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
            long longExtra = getIntent().getLongExtra("UID", j);
            this.z = longExtra;
            if (longExtra == j) {
                this.mUserInfo = HMPersonInfo.getInstance().getUserInfo();
                info = new UserInfos();
                this.mUserInfo.getUserInfos(info);
                this.mSelf = true;
            } else {
                info = UserInfoManager.getManager().getInfo(this.z);
                this.mUserInfo = HMUserInfo.getHMUserInfo(info);
                this.mSelf = false;
            }
            this.y = new WeightGoalPersistent(this, this.z, this.mUserInfo);
            HMLog.d(I, "mUserInfo is " + HMWeightUtils.parserUserInfos(info), new Object[0]);
        }
        this.F = this.mUserInfo.getTargetWeight() <= 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s(Float f) {
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(f.intValue()));
    }

    private void save() {
        String string = this.C.getText().toString();
        HMLog.d(I, "weightStr " + string, new Object[0]);
        float fConvertToKg = HMWeightUtils.convertToKg(Float.parseFloat(string), this.A);
        w(fConvertToKg);
        this.y.saveToDbAndServer(fConvertToKg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit t(Float f, Integer num) {
        this.H = HMWeightUtils.scaleFloat(f.floatValue(), 1);
        HMLog.d(I, "shown weight " + ((int) this.H), new Object[0]);
        if (!BFCallback.getInstance().enableMiDongFlavor()) {
            this.C.setTextColor(this.G[num.intValue()]);
        }
        this.C.setText(String.valueOf((int) this.H));
        A((int) this.H);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(Exception exc) {
        return "saveToDevice e: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(DialogInterface dialogInterface, int i) {
        Analytics.event(this, StatEvent.WEIGHTGOAL_CLEAR);
        long j = this.z;
        if (j == Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
            j = -1;
        }
        WeightGoalManager.getInstance().deleteUserWeightGoalInLocal(j);
        this.mUserInfo.setTargetWeight(-1.0f);
        if (Long.parseLong(this.mUserInfo.getUserid()) == Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid())) {
            this.y.postWeightGoalsChangedEvent(-1);
        }
        UserInfos userInfos = new UserInfos();
        this.mUserInfo.getUserInfos(userInfos);
        UserInfoManager.getManager().updateInfo(userInfos, true);
        this.y.setResultIntent();
        this.y.toServer(1);
    }

    private void w(float f) {
        try {
            this.x.getValue().saveWeightGoalToDevice(f);
        } catch (Exception e) {
            HMLog.error(I, new Function0() { // from class: ms8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeightGoalsSetActivity.u(e);
                }
            });
        }
    }

    private void x() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.weight_delete_confirm_title).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ls8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private float[] y(List<Float> list) {
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Float f = list.get(i);
            if (f != null) {
                fArr[i] = f.floatValue();
            }
        }
        return fArr;
    }

    private void z(int i) {
        new SaveWeightInfoTask(this.z, i, this.mUserInfo).execute(new Void[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.right_button) {
            Analytics.event(this, StatEvent.WEIGHTGOAL_RESET);
            save();
        } else if (id == R.id.confirm_btn) {
            Analytics.event(this, StatEvent.WEIGHTGOAL_SET);
            save();
        } else if (id == R.id.left_button) {
            x();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_weight_goals_setting);
        BFTitleStyleKt.setUnifyTitleStyle(this, getResources().getString(R.string.bodyfat_set_weight_goal), null);
        r();
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMLog.d(I, "onDestroy", new Object[0]);
    }
}
