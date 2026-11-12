package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Supplier;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.r3;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.indicator.HealthLevelIndicator;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputWeightActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.WeightDetailActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity;
import com.huawei.ui.main.stories.health.util.TrendFragmentCallback;
import com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback;
import com.huawei.ui.main.stories.health.views.HealthBodyDetailData;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vei {
    private static final float[][] d = {new float[]{0.0051f, 0.01f}, new float[]{0.0101f, 0.015f}, new float[]{0.0151f, 0.02f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f50991c = {new int[]{24, 1}, new int[]{12, 1}, new int[]{6, 1}};

    /* JADX INFO: loaded from: classes19.dex */
    static class b {
        public static final vei e = new vei();
    }

    static /* synthetic */ boolean b(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    private vei() {
    }

    public static vei d() {
        return b.e;
    }

    public static boolean c(dnb dnbVar) {
        return b(dnbVar, Utils.o());
    }

    public static boolean b(dnb dnbVar, boolean z) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "checkWeightDataValidation WeightBean is null");
            return false;
        }
        if (dnbVar.isVisible(3, z) || dnbVar.isVisible(5, z) || dnbVar.isVisible(7, z) || dnbVar.isVisible(4, z) || dnbVar.isVisible(8, z) || dnbVar.isVisible(10, z)) {
            return true;
        }
        return dnbVar.isVisible(11, z);
    }

    public static void e(Context context, dnb dnbVar, dnj dnjVar) {
        if (dnbVar == null || context == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "bean or context is null");
            return;
        }
        if (qrs.r()) {
            return;
        }
        double dB = dnbVar.b();
        Intent intent = new Intent();
        intent.setFlags(536870912);
        b(dnbVar, dnjVar, dB, intent);
        int iO = dnbVar.o();
        LogUtil.d("HealthWeight_WeightViewUtils", "dataType is : ", Integer.valueOf(iO));
        if (dxm.a(iO)) {
            LogUtil.a("HealthWeight_WeightViewUtils", "checkWeightDataValidation : true");
            a(context, AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_WEIGHT_HISTORY_DATA_2030056.value());
            intent.putExtra("currentUser", MultiUsersManager.INSTANCE.getCurrentUser());
            intent.putExtra("mainUser", MultiUsersManager.INSTANCE.getMainUser());
            intent.setClass(context, WeightDetailActivity.class);
        } else if (c(dnbVar) && dB > 0.0d) {
            LogUtil.a("HealthWeight_WeightViewUtils", "checkWeightDataValidation : true");
            intent.putExtra("currentUser", MultiUsersManager.INSTANCE.getCurrentUser());
            intent.putExtra("mainUser", MultiUsersManager.INSTANCE.getMainUser());
            intent.setClass(context, WeightDetailActivity.class);
        } else {
            intent.setClass(context, InputWeightActivity.class);
        }
        iov.d(context, intent);
    }

    private static void b(dnb dnbVar, dnj dnjVar, double d2, Intent intent) {
        intent.putExtra("weightBean", dnbVar);
        intent.putExtra("weight", String.valueOf(dnbVar.av()));
        intent.putExtra("bodyFat", String.valueOf(d2));
        intent.putExtra("weightTime", dnbVar.ax());
        intent.putExtra("deleteTime", dnbVar.ax());
        intent.putExtra("clientId", dnbVar.l());
        intent.putExtra(ParsedFieldTag.TASK_MODIFY_TIME, dnbVar.x());
        if (dnbVar.aq() > 0.0d && dnbVar.aq() <= 100.0d) {
            intent.putExtra("water", dnbVar.aq());
        } else {
            intent.putExtra("water", dnbVar.ak());
        }
        intent.putExtra("deleteEndTime", dnbVar.aw());
        intent.putExtra("BITag", 1);
        intent.putExtra("resistance", dnbVar.ag());
        if (dnbVar.r() > 0) {
            intent.putExtra("userHeight", dnbVar.r());
        } else {
            intent.putExtra("userHeight", dnjVar.e());
        }
        intent.putExtra("isShowBodyFat", d2 >= 0.5d);
        intent.putExtra("isShowInput", false);
        intent.putExtra("dataType", dnbVar.o());
    }

    public static void a(String str, Context context) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(context, str, map, 0);
    }

    public static void e(dnb dnbVar, ImageView imageView) {
        if (dnbVar == null || imageView == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "bean or imageView is null");
            return;
        }
        if (dnbVar.p()) {
            LogUtil.a("HealthWeight_WeightViewUtils", "setWeightAdapterImage image is edit icon");
            Context context = imageView.getContext();
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.health_healthdata_toobar_edit_gray_ic);
            if (LanguageUtil.ba(context)) {
                drawable = qqz.e(context, drawable);
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        if (g(dnbVar)) {
            LogUtil.a("HealthWeight_WeightViewUtils", "setWeightAdapterImage image is eight electrode icon");
            imageView.setImageResource(R.drawable.ic_health_weight_eight_electrode_pole);
        } else {
            LogUtil.a("HealthWeight_WeightViewUtils", "setWeightAdapterImage image is measure icon");
            imageView.setImageResource(R.drawable.ic_health_nav_measure_grey);
        }
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return ("it".equalsIgnoreCase(language) || "de".equalsIgnoreCase(language) || "es".equalsIgnoreCase(language)) || ("fr".equalsIgnoreCase(language) || "en".equalsIgnoreCase(language));
    }

    public static void c(Context context) {
        CustomProgressDialog customProgressDialogC = new CustomProgressDialog.Builder(context).c();
        customProgressDialogC.setCanceledOnTouchOutside(false);
        customProgressDialogC.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: veh
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return vei.b(dialogInterface, i, keyEvent);
            }
        });
    }

    public static ArrayList<dnb> e(String str, long j, dnj dnjVar, boolean z) {
        ArrayList<dnb> arrayList = new ArrayList(31);
        ArrayList<dnb> arrayList2 = new ArrayList<>(31);
        if (!TextUtils.isEmpty(str)) {
            e(str, (ArrayList<dnb>) arrayList, dnjVar);
            long jM = ltb.m(new Date(j));
            int iO = ezo.o(j);
            if (njy.b(arrayList)) {
                for (dnb dnbVar : arrayList) {
                    if ((1000 * jM) - (((long) (iO - 1)) * 86400000) <= dnbVar.ax() && dnbVar.ax() <= j && b(dnbVar, z)) {
                        arrayList2.add(dnbVar);
                    }
                }
            }
            return arrayList2;
        }
        LogUtil.a("HealthWeight_WeightViewUtils", "getUserWeightTwoWeekData uuid is null");
        return arrayList2;
    }

    private static void e(String str, ArrayList<dnb> arrayList, dnj dnjVar) {
        if (arrayList == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "constructWeightListByUuid weightList = null");
            return;
        }
        List<dnb> singleUserWeightData = WeightDataManager.INSTANCE.getSingleUserWeightData(str, true);
        boolean zO = Utils.o();
        if (njy.b(singleUserWeightData)) {
            Iterator<dnb> it = singleUserWeightData.iterator();
            while (it.hasNext()) {
                dnb dnbVarA = a(it.next(), zO, dnjVar);
                if (dnbVarA != null) {
                    arrayList.add(dnbVarA);
                }
            }
        }
    }

    public static void a(Context context, String str) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(context, str, map, 0);
    }

    public static void d(dnj dnjVar, HiAggregateOption hiAggregateOption, TrendFragmentCallback trendFragmentCallback) {
        if (dnjVar == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getWeightData user is null");
        } else {
            if (hiAggregateOption == null) {
                LogUtil.j("HealthWeight_WeightViewUtils", "getWeightData aggregateOption is null");
                return;
            }
            d(dnjVar, hiAggregateOption);
            LogUtil.a("HealthWeight_WeightViewUtils", "getWeightData, aggregateHiHealthData");
            HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new c(trendFragmentCallback, hiAggregateOption, dnjVar));
        }
    }

    public static void e(long j, long j2, WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setSortOrder(1);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(e(hiAggregateOption), new e(weightAndAiBodyShapeCallback));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeightAndAiBodyShapeCallback f51002a;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        e(WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback) {
            this.f51002a = weightAndAiBodyShapeCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ArrayList<dnb> arrayList = new ArrayList<>(16);
            ArrayList<uww> arrayList2 = new ArrayList<>(16);
            if (njy.e(list)) {
                WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback = this.f51002a;
                if (weightAndAiBodyShapeCallback != null) {
                    weightAndAiBodyShapeCallback.getWeightAndAIBodyShape(arrayList, arrayList2);
                    return;
                }
                return;
            }
            arrayList2.add(new uww(list.get(0)));
            WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback2 = this.f51002a;
            if (weightAndAiBodyShapeCallback2 != null) {
                weightAndAiBodyShapeCallback2.getWeightAndAIBodyShape(arrayList, arrayList2);
            }
        }
    }

    private static void d(dnj dnjVar, HiAggregateOption hiAggregateOption) {
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter(a(dnjVar));
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
    }

    public static void d(dnj dnjVar, HiAggregateOption hiAggregateOption, HiAggregateOption hiAggregateOption2, WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback) {
        if (dnjVar == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getWeightData user is null");
            return;
        }
        if (hiAggregateOption == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getWeightData aggregateOption is null");
            return;
        }
        d(dnjVar, hiAggregateOption);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiAggregateOption);
        if (hiAggregateOption2 != null) {
            arrayList.add(e(hiAggregateOption2));
        }
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataEx(arrayList, new a(weightAndAiBodyShapeCallback, arrayList, dnjVar));
    }

    public static HiAggregateOption e(HiAggregateOption hiAggregateOption) {
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.BODY_SHAPE_BUST_GIRTH.value(), DicDataTypeUtil.DataType.BODY_SHAPE_WAIST_GIRTH.value(), DicDataTypeUtil.DataType.BODY_SHAPE_HIPLINE.value(), DicDataTypeUtil.DataType.BODY_SHAPE_THIGH_GIRTH.value(), DicDataTypeUtil.DataType.BODY_SHAPE_CALVES.value(), DicDataTypeUtil.DataType.BODY_SHAPE_ARM_CIRCUMFERENCE.value(), DicDataTypeUtil.DataType.BODY_SHAPE_HEAD_CIRCUMFERENCE.value(), DicDataTypeUtil.DataType.BODY_SHAPE_LEG_LENGTH.value(), DicDataTypeUtil.DataType.BODY_SHAPE_ARM_LENGTH.value(), DicDataTypeUtil.DataType.BODY_SHAPE_SHOULDER_WIDTH.value(), DicDataTypeUtil.DataType.BODY_SHAPE_WAIST_HIP_RATIO.value(), DicDataTypeUtil.DataType.BODY_SHAPE_BODY_FORM.value()});
        hiAggregateOption.setConstantsKey(new String[]{"bustGirth", "waistGirth", "hipline", "thighGirth", "calves", "armCircumference", "headCircumference", "legLength", "armLength", "shoulderWidth", "waistHipRatio", "bodyForm"});
        return hiAggregateOption;
    }

    public static void a(dnb dnbVar, uww uwwVar) {
        if (dnbVar == null || uwwVar == null || HiDateUtil.d(dnbVar.ax()) != HiDateUtil.d(uwwVar.h()) || !dnbVar.isVisible(27, !vdo.a())) {
            return;
        }
        dnbVar.ae(uwwVar.f());
        dnbVar.f(uwwVar.c());
    }

    public static ArrayList<vfv> e(ArrayList<dnb> arrayList) {
        if (njy.e(arrayList)) {
            return new ArrayList<>();
        }
        ArrayList<vfv> arrayList2 = new ArrayList<>();
        for (dnb dnbVar : arrayList) {
            if (dnbVar != null) {
                arrayList2.add(new vfv(dnbVar.av(), dnbVar.b(), dnbVar.ax(), dnbVar.getFractionDigitByType(0)));
            }
        }
        return arrayList2;
    }

    public static String a(dnj dnjVar) {
        if (dnjVar == null) {
            return "NULL";
        }
        return iun.d(dnjVar.i());
    }

    public static dnb c(dnb dnbVar, boolean z) {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        LogUtil.a("HealthWeight_WeightViewUtils", "convertGuestWeightBean currentUser ", HiJsonUtil.d(currentUser));
        return a(dnbVar, z, currentUser);
    }

    public static dnb a(dnb dnbVar, boolean z, dnj dnjVar) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "convertWeightBean weightBean = null");
            return null;
        }
        if (Double.compare(dnbVar.av(), 0.0d) <= 0) {
            return null;
        }
        dnb dnbVarD = d(dnbVar.o());
        d(dnbVar, dnbVarD, z, dnjVar);
        dnbVarD.v(dnbVar.ag());
        dnbVarD.aa(dnbVar.ak());
        dnbVarD.ag(dnbVar.aq());
        dnbVarD.l(dnbVar.s());
        dnbVarD.h(dnbVar.g());
        dnbVarD.b(dnbVar.e());
        dnbVarD.p(dnbVar.ad());
        dnbVarD.s(dnbVar.aa());
        dnbVarD.j(dnbVar.h());
        dnbVarD.a(dnbVar.a());
        dnbVarD.o(dnbVar.q());
        dnbVarD.t(dnbVar.z());
        dnbVarD.ab(dnbVar.am());
        dnbVarD.f(dnbVar.ac());
        dnbVarD.k(dnbVar.v());
        dnbVarD.q(dnbVar.w());
        dnbVarD.n(dnbVar.u());
        dnbVarD.m(dnbVar.y());
        dnbVarD.y(dnbVar.al());
        dnbVarD.ad(dnbVar.aj());
        dnbVarD.x(dnbVar.ae());
        dnbVarD.w(dnbVar.ah());
        dnbVarD.ac(dnbVar.ap());
        dnbVarD.z(dnbVar.ar());
        dnbVarD.ae(dnbVar.ao());
        dnbVarD.u(dnbVar.af());
        dnbVarD.i(dnbVar.i());
        dnbVarD.f(dnbVar.j());
        dnbVarD.g(dnbVar.m());
        dnbVarD.r(dnbVar.ab());
        dnbVarD.c(dnbVar.n());
        dnbVarD.b(dnbVar.l());
        dnbVarD.b(dnbVar.x());
        dnbVarD.e(dnbVar.k());
        b(dnbVar, dnbVarD);
        return dnbVarD;
    }

    private static dnb d(int i) {
        dnb usrVar;
        if (dxm.e(i)) {
            usrVar = new uss();
        } else if (i == 133) {
            usrVar = new ust();
        } else {
            usrVar = new usr();
        }
        usrVar.d(i);
        return usrVar;
    }

    private static void d(dnb dnbVar, dnb dnbVar2, boolean z, dnj dnjVar) {
        if (dnbVar == null || dnbVar2 == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setBaseDataByWeightData originData = null or weightBean = null");
            return;
        }
        int iR = dnbVar.r();
        if (iR <= 0 && dnjVar != null) {
            iR = dnjVar.e();
        }
        dnbVar2.c(iR);
        double dF = dnbVar.f();
        if (!ezh.c(dF, z)) {
            dF = exz.c(dnbVar.av(), iR);
        }
        dnbVar2.c(dF);
        dnbVar2.c(dnbVar.an());
        int iC = dnbVar.c();
        if (iC <= 0) {
            iC = MultiUsersManager.INSTANCE.getCurrentUser().c();
        }
        dnbVar2.e(iC);
        dnbVar2.af(dnbVar.av());
        dnbVar2.d(dnbVar.b());
        dnbVar2.e(dnbVar.d());
    }

    private static void b(dnb dnbVar, dnb dnbVar2) {
        if (dxm.c(dnbVar)) {
            dnbVar2.d(dnbVar.t());
            dnbVar2.a(2);
        }
        dnbVar2.c(dnbVar.ai());
        dnbVar2.e(dnbVar.ax());
        dnbVar2.d(dnbVar.aw());
        dnbVar2.ah(dnbVar.as());
    }

    public static void d(HiHealthData hiHealthData, dnb dnbVar) {
        hiHealthData.putDouble("bodyWeight", dnbVar.av());
        hiHealthData.putDouble(BleConstants.BODY_FAT_RATE, dnbVar.b());
        hiHealthData.putDouble("bodyFat", dnbVar.d());
        hiHealthData.putDouble(BleConstants.IMPEDANCE, dnbVar.ag());
        hiHealthData.putDouble(BleConstants.MOISTURE, dnbVar.ak());
        hiHealthData.putDouble(BleConstants.MOISTURE_RATE, dnbVar.aq());
        hiHealthData.putDouble(BleConstants.VISCERAL_FAT_LEVEL, dnbVar.s());
        hiHealthData.putDouble(BleConstants.BONE_SALT, dnbVar.g());
        hiHealthData.putDouble(BleConstants.BMI, dnbVar.f());
        hiHealthData.putDouble(BleConstants.BASAL_METABOLISM, dnbVar.e());
        hiHealthData.putDouble(BleConstants.MUSCLE_MASS, dnbVar.ad());
        hiHealthData.putDouble("protein", dnbVar.aa());
        hiHealthData.putDouble(BleConstants.BODY_SCORE, dnbVar.h());
        hiHealthData.putDouble(BleConstants.BODY_AGE, dnbVar.a());
        hiHealthData.putDouble(IndoorEquipManagerApi.KEY_HEART_RATE, dnbVar.q());
        hiHealthData.putDouble("pressure", dnbVar.z());
        hiHealthData.putDouble("skeletalMusclelMass", dnbVar.am());
        hiHealthData.putDouble("age", dnbVar.c());
        hiHealthData.putInt("height", dnbVar.r());
        hiHealthData.putInt(CommonConstant.KEY_GENDER, dnbVar.an());
        hiHealthData.putInt("trackdata_deviceType", dnbVar.o());
        hiHealthData.putInt("pole", dnbVar.ac());
        hiHealthData.putDouble("rightLegMuscleMass", dnbVar.ah());
        hiHealthData.putDouble("leftLegMuscleMass", dnbVar.y());
        hiHealthData.putDouble("rightArmMuscleMass", dnbVar.aj());
        hiHealthData.putDouble("leftArmMuscleMass", dnbVar.w());
        hiHealthData.putDouble("trunkMuscleMass", dnbVar.ar());
        hiHealthData.putDouble("rightLegFatMass", dnbVar.ae());
        hiHealthData.putDouble("leftLegFatMass", dnbVar.u());
        hiHealthData.putDouble("rightArmFatMass", dnbVar.al());
        hiHealthData.putDouble("leftArmFatMass", dnbVar.v());
        hiHealthData.putDouble("trunkFatMass", dnbVar.ap());
        hiHealthData.putDouble("waistHipRatio", dnbVar.ao());
        hiHealthData.putDouble("waistHipRatioUser", dnbVar.as());
        hiHealthData.putDouble("rasm", dnbVar.af());
        hiHealthData.putDouble("bodySize", dnbVar.i());
        hiHealthData.putDouble("bodyShape", dnbVar.j());
        hiHealthData.putDouble("fatBalance", dnbVar.m());
        hiHealthData.putDouble("muscleBalance", dnbVar.ab());
        c(hiHealthData, dnbVar);
        e(hiHealthData, dnbVar);
        hiHealthData.setEndTime(dnbVar.aw());
        hiHealthData.setStartTime(dnbVar.ax());
    }

    private static void e(HiHealthData hiHealthData, dnb dnbVar) {
        if (dxm.c(dnbVar)) {
            LogUtil.a("HealthWeight_WeightViewUtils", "putHfResistArray hiData put six hf hfResist");
            String[] strArr = {"lfrfHfImpedance", "lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance"};
            double[] dArrT = dnbVar.t();
            for (int i = 0; i < 6; i++) {
                hiHealthData.putDouble(strArr[i], dArrT[i]);
            }
            return;
        }
        LogUtil.a("HealthWeight_WeightViewUtils", "puthfResistArray WeightBean is null or not support multi measure");
    }

    private static void c(HiHealthData hiHealthData, dnb dnbVar) {
        String[] strArr = {"lfrfImpedance", "lhrhImpedance", "lhlfImpedance", "lhrfImpedance", "rhlfImpedance", "rhrfImpedance"};
        double[] dArrAi = dnbVar.ai();
        for (int i = 0; i < 6; i++) {
            hiHealthData.putDouble(strArr[i], dArrAi[i]);
        }
    }

    public static long[] e(Date date, int i) {
        long[] jArr = new long[2];
        switch (i) {
            case 7:
                jArr[0] = System.currentTimeMillis();
                jArr[1] = 0;
                break;
            case 8:
                b(date, jArr);
                break;
            case 9:
                c(date, jArr);
                break;
            case 10:
                e(date, jArr);
                break;
            case 11:
                d(date, jArr);
                break;
            case 12:
                jArr[0] = System.currentTimeMillis();
                jArr[1] = Math.min(iuo.g(), System.currentTimeMillis());
                break;
            case 13:
                a(date, jArr);
                break;
            default:
                e(date, jArr, i);
                break;
        }
        return jArr;
    }

    private static void b(Date date, long[] jArr) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        jArr[1] = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        jArr[0] = calendar.getTimeInMillis();
        if (jArr[1] >= System.currentTimeMillis() || System.currentTimeMillis() >= jArr[0]) {
            return;
        }
        jArr[0] = System.currentTimeMillis();
    }

    private static void c(Date date, long[] jArr) {
        jArr[1] = date.getTime() - (((long) (ezo.o(date.getTime()) - 1)) * 86400000);
        long time = date.getTime() + 86400000;
        jArr[0] = time;
        if (time > System.currentTimeMillis()) {
            jArr[0] = System.currentTimeMillis();
        }
    }

    private static void e(Date date, long[] jArr) {
        jArr[1] = date.getTime() - (((long) (ezo.o(date.getTime()) - 1)) * 86400000);
        jArr[0] = System.currentTimeMillis();
    }

    private static void d(Date date, long[] jArr) {
        jArr[0] = date.getTime();
        jArr[1] = date.getTime() - 2592000000L;
    }

    private static void a(Date date, long[] jArr) {
        jArr[0] = date.getTime() - 604800000;
        jArr[1] = date.getTime() - 2592000000L;
    }

    private static void e(Date date, long[] jArr, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        if (i == 6) {
            calendar.add(2, 0);
            calendar.add(5, 0);
        }
        long timeInMillis = calendar.getTimeInMillis();
        LogUtil.d("HealthWeight_WeightViewUtils", "last is : ", Long.valueOf(timeInMillis));
        calendar.set(10, 0);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (i == 3) {
            calendar.add(5, 0);
        } else if (i == 4) {
            calendar.add(5, -6);
        } else if (i == 5) {
            calendar.add(5, -(b(date) - 1));
        } else if (i == 6) {
            calendar.set(5, 1);
            calendar.add(2, -11);
        } else {
            LogUtil.j("HealthWeight_WeightViewUtils", "unkonw type");
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        jArr[0] = timeInMillis;
        if (i == 5) {
            timeInMillis2 += ((long) (b(new Date(timeInMillis)) - b(new Date(timeInMillis2)))) * 86400000;
        }
        jArr[1] = timeInMillis2;
    }

    private static int b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(5);
    }

    public static void b(int i) {
        wvf wvfVarE = wvf.e();
        MultiUsersManager.INSTANCE.getMainUser().c(i);
        wvfVarE.d(false);
    }

    public static int e(float f) {
        return new BigDecimal(f).setScale(0, 4).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    public static int c(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        int i;
        Cursor cursorQuery = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = BaseApplication.b().openOrCreateDatabase("device.db", 0, null);
            try {
                try {
                    cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("device", new String[]{"productId"}, "kind = ? ", new String[]{str}, null, null, null, null);
                    i = 0;
                    while (cursorQuery.moveToNext()) {
                        try {
                            i++;
                        } catch (SQLException unused) {
                            LogUtil.e("HealthWeight_WeightViewUtils", "getBondedProducts SQLException");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                            return i;
                        }
                    }
                    LogUtil.a("HealthWeight_WeightViewUtils", "getBondedProducts count ", Integer.valueOf(i));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    }
                    return i;
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    }
                    throw th;
                }
            } catch (SQLException unused2) {
                i = 0;
            }
        } catch (SQLException unused3) {
            i = 0;
            sQLiteDatabaseOpenOrCreateDatabase = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseOpenOrCreateDatabase = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
            }
            throw th;
        }
    }

    public static int d(dnb dnbVar) {
        if (dnbVar == null) {
            return 0;
        }
        double dB = dnbVar.b();
        double dAm = dnbVar.am();
        if (ezh.g(dB) && ezh.t(dAm)) {
            int iB = exz.b((int) dnbVar.getDoubleOrIntLevelByType(100), (int) dnbVar.getDoubleOrIntLevelByType(10));
            if (ezh.e(iB)) {
                return iB;
            }
        }
        return 0;
    }

    public static int[] d(int i, int i2, double d2, double d3) {
        if (d2 >= d3) {
            if (i <= 1 && i2 == 2) {
                return new int[]{2, 2};
            }
            if (i == 2 && i2 >= 3) {
                return new int[]{3, 3};
            }
        }
        if (d2 <= d3) {
            if (i == 2 && i2 <= 1) {
                return new int[]{2, 2};
            }
            if (i >= 3 && i2 == 2) {
                return new int[]{3, 3};
            }
        }
        return new int[]{i, i2};
    }

    public static boolean b(dnb dnbVar) {
        if (dnbVar == null) {
            return false;
        }
        return ezh.q(dnbVar.v()) && ezh.f(dnbVar.u()) && ezh.q(dnbVar.al()) && ezh.f(dnbVar.ae());
    }

    public static boolean e(dnb dnbVar) {
        if (dnbVar == null) {
            return false;
        }
        return ezh.v(dnbVar.w()) && ezh.o(dnbVar.y()) && ezh.v(dnbVar.aj()) && ezh.o(dnbVar.ah());
    }

    public static int d(double d2, int i) {
        return (dne.b(i) != 2 || (((UnitUtil.d(d2, 2) - exz.b(d2)) > 0.0d ? 1 : ((UnitUtil.d(d2, 2) - exz.b(d2)) == 0.0d ? 0 : -1)) == 0)) ? 1 : 2;
    }

    public static String b() {
        return b(1.0d);
    }

    public static String b(double d2) {
        return e(d2, true);
    }

    public static String e(double d2, boolean z) {
        String strE;
        int iE = UnitUtil.e();
        if (iE == 1) {
            strE = qre.e(R.plurals.IDS_health_catty, UnitUtil.e(d2), "");
        } else if (iE == 3) {
            strE = qre.e(R.plurals.IDS_lb_string, UnitUtil.e(d2), "");
        } else {
            strE = qre.e(R.plurals.IDS_kg_string, UnitUtil.e(d2), "");
        }
        return z ? strE.trim() : strE;
    }

    public static String b(double d2, int i) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return b(0.0d, i);
        }
        Resources resources = BaseApplication.b().getResources();
        int iE = UnitUtil.e();
        if (iE == 1) {
            return resources.getQuantityString(R.plurals.IDS_health_catty, UnitUtil.e(d2), a(d2, 1, i));
        }
        if (iE == 3) {
            return resources.getQuantityString(R.plurals.IDS_lb_string, UnitUtil.e(d2), a(d2, 1, i));
        }
        return resources.getQuantityString(R.plurals.IDS_health_weight, UnitUtil.e(d2), a(d2, 1, i));
    }

    public static String e() {
        Resources resources = BaseApplication.b().getResources();
        int iE = UnitUtil.e();
        if (iE == 1) {
            return resources.getQuantityString(R.plurals.IDS_health_catty, UnitUtil.e(0.0d), "-/-");
        }
        if (iE == 3) {
            return resources.getQuantityString(R.plurals.IDS_lb_string, UnitUtil.e(0.0d), "-/-");
        }
        return resources.getQuantityString(R.plurals.IDS_health_weight, UnitUtil.e(0.0d), "-/-");
    }

    public static void d(Activity activity, boolean z) {
        if (activity == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setResultToH5 activity is null");
            return;
        }
        LogUtil.a("HealthWeight_WeightViewUtils", "setResultToH5 isChange ", Boolean.valueOf(z));
        Intent intent = new Intent();
        HashMap map = new HashMap();
        map.put("isChange", Boolean.valueOf(z));
        intent.putExtra("result", HiJsonUtil.d(map));
        activity.setResult(-1, intent);
    }

    public static String a(double d2, int i, int i2) {
        return UnitUtil.b(d2, i, i2, new Supplier() { // from class: com.huawei.ui.main.stories.health.util.WeightViewUtils$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Boolean.valueOf(LanguageUtil.z(BaseApplication.b()));
            }
        });
    }

    public static boolean g(dnb dnbVar) {
        double[] dArrAi;
        if (dnbVar == null || (dArrAi = dnbVar.ai()) == null || dArrAi.length < 6 || dnbVar.ac() != 2) {
            return false;
        }
        for (double d2 : dArrAi) {
            if (d2 <= 0.0d) {
                return false;
            }
        }
        return true;
    }

    public static String a() {
        String url = GRSManager.c(BaseApplication.b()).getUrl("domainTipsResDbankcdn");
        if (!Utils.o()) {
            if (LanguageUtil.o(BaseApplication.b())) {
                return url + "/SmartWear/Scale-fat/EMUI8.0/C001B001/zh-CN/index.html";
            }
            return url + "/SmartWear/Scale-fat/EMUI8.0/C001B001/en-US/index.html";
        }
        return url + String.format("/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=Scale-fat", CommonUtil.z());
    }

    public void c(Context context, ImageView imageView) {
        if (context == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setAboutImageLayout() context is null.");
            return;
        }
        if (imageView == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setAboutImageLayout() imageView is null.");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        if (qrs.af(context)) {
            layoutParams.width = (int) new HealthColumnSystem(context, 0).a(4);
        } else {
            layoutParams.width = -1;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static ArrayList<Integer> e(dyh dyhVar, int[] iArr, int[] iArr2, dnb dnbVar) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        if (dyhVar == null || dnbVar == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getTrunkFatRateGrades: hwWeightAlgorithm or weightBean is null");
            return arrayList;
        }
        if (Utils.o() && !Utils.c(BaseApplication.b())) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getTrunkFatRateGrades in oversea context, return default value");
            for (int i = 0; i < 5; i++) {
                arrayList.add(1);
            }
            return arrayList;
        }
        if (iArr == null || iArr.length < 2 || iArr2 == null || iArr2.length < 2) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getTrunkFatRateGrades: upperLimbGrades or lowerLimbGrades is out bounds");
            return arrayList;
        }
        arrayList.add(Integer.valueOf(exz.g(dnbVar.an(), dyhVar.aj(), dnbVar.c())));
        arrayList.add(Integer.valueOf(iArr[0]));
        arrayList.add(Integer.valueOf(iArr[1]));
        arrayList.add(Integer.valueOf(iArr2[0]));
        arrayList.add(Integer.valueOf(iArr2[1]));
        return c((int) dnbVar.getDoubleOrIntLevelByType(1), arrayList);
    }

    public static ArrayList<Integer> a(dnb dnbVar) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getSkeletalMuscleGrades return defualt value, is oversea: ", Boolean.valueOf(Utils.o()));
            return arrayList;
        }
        if (Utils.o() && !Utils.c(BaseApplication.b())) {
            LogUtil.j("HealthWeight_WeightViewUtils", "getSkeletalMuscleGrades oversea context, return default value");
            for (int i = 0; i < 5; i++) {
                arrayList.add(1);
            }
            return arrayList;
        }
        byte bAn = dnbVar.an();
        int iC = dnbVar.c();
        int iR = dnbVar.r();
        arrayList.add(Integer.valueOf(exz.b(bAn, iC, iR, dnbVar.ar())));
        arrayList.add(Integer.valueOf(exz.e(bAn, iC, iR, dnbVar.w())));
        arrayList.add(Integer.valueOf(exz.e(bAn, iC, iR, dnbVar.aj())));
        arrayList.add(Integer.valueOf(exz.c(bAn, iC, iR, dnbVar.y())));
        arrayList.add(Integer.valueOf(exz.c(bAn, iC, iR, dnbVar.ah())));
        return c((int) dnbVar.getDoubleOrIntLevelByType(10), arrayList);
    }

    private static ArrayList<Integer> c(int i, ArrayList<Integer> arrayList) {
        if (i == 1 ? arrayList.contains(1) : !(i == 2 ? !(arrayList.contains(2) || (arrayList.contains(1) && arrayList.contains(3))) : !(!(i == 3 || i == 4) || arrayList.contains(3)))) {
            return arrayList;
        }
        if (i == 4) {
            arrayList.set(0, 3);
            return arrayList;
        }
        arrayList.set(0, Integer.valueOf(i));
        return arrayList;
    }

    public static void d(View view, int... iArr) {
        if (view == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setVisibilityInOversea view is null");
            return;
        }
        for (int i : iArr) {
            view.findViewById(i).setVisibility(8);
        }
    }

    public static void a(HealthBodyDetailData healthBodyDetailData, ArrayList<Double> arrayList, ArrayList<Integer> arrayList2) {
        if (healthBodyDetailData == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setBodyDetailDataContent: bodyDetailData is null");
            return;
        }
        if (!njy.c(arrayList, 4) || !njy.c(arrayList2, 4)) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setBodyDetailDataContent: bodyTorsoElementContentList or bodyTorsoElementGradleList is out bounds");
            return;
        }
        healthBodyDetailData.setContent(1, arrayList2.get(0).intValue(), UnitUtil.e(arrayList.get(0).doubleValue(), 1, 1));
        healthBodyDetailData.setContent(3, arrayList2.get(1).intValue(), UnitUtil.e(arrayList.get(1).doubleValue(), 1, 1));
        healthBodyDetailData.setContent(2, arrayList2.get(2).intValue(), UnitUtil.e(arrayList.get(2).doubleValue(), 1, 1));
        healthBodyDetailData.setContent(5, arrayList2.get(3).intValue(), UnitUtil.e(arrayList.get(3).doubleValue(), 1, 1));
        healthBodyDetailData.setContent(4, arrayList2.get(4).intValue(), UnitUtil.e(arrayList.get(4).doubleValue(), 1, 1));
    }

    public static boolean b(double[] dArr, int i) {
        return dArr != null && dArr.length != 0 && i >= 0 && i < dArr.length;
    }

    public static List<qjp> b(Context context, float[] fArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getResources().getString(R.string.IDS_weight_moisture));
        arrayList.add(context.getResources().getString(R.string.IDS_hw_show_protein));
        arrayList.add(context.getResources().getString(R.string.IDS_weight_fat_mass));
        arrayList.add(context.getResources().getString(R.string.IDS_hw_show_bone));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_water_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_protein_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_fat_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_bone_color_end)));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_water_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_protein_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_fat_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.weight_body_analysis_bone_color_begin)));
        int length = fArr != null ? fArr.length : 0;
        ArrayList arrayList4 = new ArrayList(length);
        int i = 0;
        while (i < length) {
            arrayList4.add(new qjp(i < arrayList.size() ? (String) arrayList.get(i) : "", fArr[i], i < arrayList2.size() ? ((Integer) arrayList2.get(i)).intValue() : 0, i < arrayList3.size() ? ((Integer) arrayList3.get(i)).intValue() : 0));
            i++;
        }
        return arrayList4;
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TrendFragmentCallback f51001c;
        private dnj d;
        private HiAggregateOption e;

        c(TrendFragmentCallback trendFragmentCallback, HiAggregateOption hiAggregateOption, dnj dnjVar) {
            this.f51001c = trendFragmentCallback;
            this.e = hiAggregateOption;
            this.f51000b = hiAggregateOption.getCount();
            this.d = dnjVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            boolean zE = vei.e(i, this.e);
            ArrayList<dnb> arrayList = new ArrayList<>(16);
            if (njy.e(list)) {
                TrendFragmentCallback trendFragmentCallback = this.f51001c;
                if (trendFragmentCallback != null) {
                    trendFragmentCallback.getWeight(arrayList, false);
                    return;
                }
                return;
            }
            vng.b(list, arrayList, this.d);
            TrendFragmentCallback trendFragmentCallback2 = this.f51001c;
            if (trendFragmentCallback2 != null) {
                trendFragmentCallback2.getWeight(arrayList, this.f51000b == list.size());
            }
            vei.a(list, zE);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("HealthWeight_WeightViewUtils", "onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
            if (i2 != 0) {
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_QUERY_85070010.value(), i2);
            }
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_QUERY_85070010.value(), qrs.a("0"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(int i, HiAggregateOption hiAggregateOption) {
        boolean z = hiAggregateOption != null && hiAggregateOption.getCount() == 50;
        if (!z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(r3.A, true);
            EventBus.a(new EventBus.d("weight_measure_cloud_down_complete", bundle));
        }
        if (i != 0) {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_QUERY_85070010.value(), i);
            LogUtil.j("HealthWeight_WeightViewUtils", "getAggregateHealthData not success");
        }
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_QUERY_85070010.value(), qrs.a("0"));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<HiHealthData> list, boolean z) {
        if (z) {
            LogUtil.a("HealthWeight_WeightViewUtils", "getAggregateHealthData aggregateOption count REQUEST_MAX_NUM");
            WeightDataManager.INSTANCE.setDataList(false, list);
        } else {
            WeightDataManager.INSTANCE.setDataList(true, list);
            SharedPreferenceManager.e(BaseApplication.b(), "wifi_weight_device", "wifi_push_weight_download", "1", null);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dnj f50998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeightAndAiBodyShapeCallback f50999b;
        private final List<HiAggregateOption> e;

        a(WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback, List<HiAggregateOption> list, dnj dnjVar) {
            this.f50999b = weightAndAiBodyShapeCallback;
            this.e = list;
            this.f50998a = dnjVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            LogUtil.a("HealthWeight_WeightViewUtils", "GetHealthDataHiAggregateExListener errorCode ", Integer.valueOf(i), " dataList ", sparseArray, " anchor ", Integer.valueOf(i2));
            if (sparseArray == null) {
                WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback = this.f50999b;
                if (weightAndAiBodyShapeCallback != null) {
                    weightAndAiBodyShapeCallback.getWeightAndAIBodyShape(new ArrayList<>(), new ArrayList<>());
                    return;
                }
                return;
            }
            HiAggregateOption hiAggregateOption = njy.c(this.e, 0) ? this.e.get(0) : null;
            List<HiHealthData> list = sparseArray.get(0, new ArrayList());
            boolean zE = vei.e(i, hiAggregateOption);
            ArrayList<dnb> arrayList = new ArrayList<>(16);
            ArrayList<uww> arrayListE = vei.e(sparseArray);
            if (njy.e(list)) {
                LogUtil.j("HealthWeight_WeightViewUtils", "GetHealthDataHiAggregateExListener data ", list, " weightBeanList ", arrayList, " aiBodyShapeBeans ", arrayListE);
                WeightAndAiBodyShapeCallback weightAndAiBodyShapeCallback2 = this.f50999b;
                if (weightAndAiBodyShapeCallback2 != null) {
                    weightAndAiBodyShapeCallback2.getWeightAndAIBodyShape(arrayList, arrayListE);
                    return;
                }
                return;
            }
            vng.b(list, arrayList, this.f50998a);
            if (this.f50999b != null) {
                LogUtil.a("HealthWeight_WeightViewUtils", "GetHealthDataHiAggregateExListener weightBeanList ", arrayList, " aiBodyShapeBeans ", arrayListE);
                this.f50999b.getWeightAndAIBodyShape(arrayList, arrayListE);
            }
            vei.a(list, zE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<uww> e(SparseArray<List<HiHealthData>> sparseArray) {
        List<HiHealthData> list = sparseArray.get(1, new ArrayList());
        ArrayList<uww> arrayList = new ArrayList<>();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new uww(it.next()));
        }
        return arrayList;
    }

    public static void d(final String str, final Context context, final boolean z) {
        if (context == null || !(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightViewUtils", "showSetWeightGoalTip context is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_set_weight_goal_tip).c(R.string.IDS_finish_plan, new View.OnClickListener() { // from class: vef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vei.c(str, context, z, view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: ven
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vei.b(context, z, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        b(BaseApplication.b(), AnalyticsValue.WEIGHT_INT_PLAN_2160125.value(), 0);
    }

    static /* synthetic */ void c(String str, final Context context, final boolean z, View view) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthWeight_WeightViewUtils", "finishPlan planId is null");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "showSetWeightGoalTip intPlanApi == null");
        } else {
            planApi.finishPlan(3, str, new UiCallback<String>() { // from class: vei.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    qpx.e(context, R.string.sug_haveno_network);
                    LogUtil.e("HealthWeight_WeightViewUtils", "finishPlan onFailure");
                    Context context2 = context;
                    if (!(context2 instanceof Activity) || z) {
                        return;
                    }
                    ((Activity) context2).finish();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str2) {
                    ObserverManagerUtil.e(ObserveLabels.STAY_FIT_PLAN_END, new Object[0]);
                    qpx.e(context, R.string.IDS_hwh_home_program_terminated);
                    LogUtil.a("HealthWeight_WeightViewUtils", "finishPlan OK !! ", str2);
                    Context context2 = context;
                    if ((context2 instanceof Activity) && z) {
                        iov.d(context2, new Intent(context, (Class<?>) WeightGoalActivity.class));
                        ((Activity) context).finish();
                    }
                }
            });
            b(BaseApplication.b(), AnalyticsValue.WEIGHT_INT_PLAN_2160125.value(), 1);
        }
    }

    static /* synthetic */ void b(Context context, boolean z, View view) {
        if ((context instanceof Activity) && !z) {
            ((Activity) context).finish();
        }
        b(BaseApplication.b(), AnalyticsValue.WEIGHT_INT_PLAN_2160125.value(), -1);
    }

    public static void b(Context context, String str, int i) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(context, str, map, 0);
    }

    public static void e(HealthLevelIndicator healthLevelIndicator, List<qlj> list, double[] dArr, double[] dArr2) {
        if (njy.e(list) || healthLevelIndicator == null) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setIndicatorAllLevelsData, levelsData is empty or mIndicator is null.");
            return;
        }
        int i = 0;
        if (!b(dArr, 0) || !b(dArr2, 1)) {
            LogUtil.j("HealthWeight_WeightViewUtils", "setIndicatorAllLevelsData, valuesArray is empty or rangArray.length < 2.");
            return;
        }
        int length = dArr.length + dArr2.length;
        float[] fArr = new float[length];
        fArr[0] = (float) dArr2[0];
        fArr[length - 1] = (float) dArr2[1];
        while (i < dArr.length) {
            int i2 = i + 1;
            fArr[i2] = (float) dArr[i];
            i = i2;
        }
        for (qlj qljVar : list) {
            qljVar.d(qljVar.b());
            qljVar.e(qljVar.e());
        }
        healthLevelIndicator.setAllLevelsData(list, e(fArr));
    }

    public static int d(double d2, double d3) {
        double[] dArrC = c(1, d3);
        double[] dArrC2 = c(2, d3);
        if (d2 < dArrC[1]) {
            return 1;
        }
        return d2 < dArrC2[1] ? 2 : 3;
    }

    public static ivd e(iuu iuuVar, int i, int i2) {
        ivd ivdVar = new ivd();
        if (i == 0) {
            return d(iuuVar, i2);
        }
        if (i == 1 || i == 2) {
            return a(i != 1 ? 0 : 2);
        }
        return ivdVar;
    }

    private static ivd a(int i) {
        ivd ivdVar = new ivd();
        ivdVar.c(i);
        ivdVar.a(0);
        ivdVar.e(0);
        iuy iuyVar = new iuy();
        iuyVar.a(0);
        iuyVar.d(0);
        iuyVar.b(0);
        iuyVar.c(0);
        ivdVar.a(iuyVar);
        iux iuxVar = new iux();
        iuxVar.e(1);
        iuxVar.e(0.0f);
        iuxVar.a(0.0f);
        iuxVar.a(0);
        ivdVar.e(iuxVar);
        return ivdVar;
    }

    private static ivd d(iuu iuuVar, int i) {
        ivd ivdVar = new ivd();
        ivdVar.c(1);
        if (iuuVar.d() != null) {
            ivdVar.e(iuuVar.d().b());
            ivdVar.a(iuuVar.d().d());
        }
        iux iuxVar = new iux();
        iuxVar.e(i);
        float[][] fArr = d;
        int i2 = i - 1;
        iuxVar.e(fArr[i2][0]);
        iuxVar.a(fArr[i2][1]);
        iuxVar.a(f50991c[i2][0]);
        ivdVar.e(iuxVar);
        iuy iuyVar = new iuy();
        iuyVar.a(30);
        iuyVar.d(40);
        iuyVar.b(25);
        iuyVar.c(5);
        ivdVar.a(iuyVar);
        return ivdVar;
    }

    public static double[] c(int i, double d2) {
        if (i <= 0 || i > d.length) {
            i = 1;
        }
        float[][] fArr = d;
        int i2 = i - 1;
        return new double[]{UnitUtil.b(UnitUtil.d(((double) fArr[i2][0]) * d2, 1), 1), UnitUtil.b(UnitUtil.d(((double) fArr[i2][1]) * d2, 1), 1)};
    }

    public static int d(int i, double d2, double d3) {
        if (i <= 0 || i > d.length) {
            i = 1;
        }
        float[] fArr = d[i - 1];
        double d4 = 1.0f - ((fArr[0] + fArr[1]) / 2.0f);
        return ((int) Math.ceil((Math.log(d3) / Math.log(d4)) - (Math.log(d2) / Math.log(d4)))) * 7;
    }

    private static int[] e(float[] fArr) {
        if (fArr == null || fArr.length <= 1) {
            return new int[]{(int) 270.0f};
        }
        int length = fArr.length - 1;
        int[] iArr = new int[length];
        int iIntValue = BigDecimal.valueOf(270.0f).divide(BigDecimal.valueOf(length)).intValue();
        for (int i = 0; i < length; i++) {
            iArr[i] = iIntValue;
        }
        return iArr;
    }

    public static void b(ResponseCallback<Pair<Long, Object>> responseCallback, String str) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal callback is null ");
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).fetchGoalInfo(0, 5, new AnonymousClass2(responseCallback, str));
        }
    }

    /* JADX INFO: renamed from: vei$2, reason: invalid class name */
    class AnonymousClass2 implements HiCommonListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f50993b;
        final /* synthetic */ ResponseCallback d;

        AnonymousClass2(ResponseCallback responseCallback, String str) {
            this.d = responseCallback;
            this.f50993b = str;
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            if (obj == null) {
                ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal data is null");
                this.d.onResponse(-1, null);
                return;
            }
            if (!njy.b(obj, HiGoalInfo.class)) {
                ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal is not list<HiGoalInfo> type");
                this.d.onResponse(-1, null);
                return;
            }
            List list = (List) obj;
            if (njy.e(list) || list.get(0) == null) {
                ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal goalInformationList is null");
                this.d.onResponse(-1, null);
                return;
            }
            final float goalValue = (float) ((HiGoalInfo) list.get(0)).getGoalValue();
            ReleaseLogUtil.c("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal fetchGoalInfo weightGoal ", Float.valueOf(goalValue));
            if (goalValue <= 0.0f) {
                this.d.onResponse(-1, null);
                return;
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final String str = this.f50993b;
            final ResponseCallback responseCallback = this.d;
            threadPoolManagerC.execute(new Runnable() { // from class: vem
                @Override // java.lang.Runnable
                public final void run() {
                    vei.AnonymousClass2.d(goalValue, str, responseCallback);
                }
            });
        }

        static /* synthetic */ void d(float f, String str, ResponseCallback responseCallback) {
            boolean zE = lua.e();
            LogUtil.a("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal isPullAllStatus ", Boolean.valueOf(zE));
            if (zE) {
                vei.c(f, str, responseCallback);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal onFailure errorCode ", Integer.valueOf(i), " errorMessage ", obj);
            this.d.onResponse(-1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(float f, String str, ResponseCallback<Pair<Long, Object>> responseCallback) {
        LogUtil.a("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal weightGoal: ", Float.valueOf(f), " configId: ", str);
        WeightTargetDifferences weightTargetDifferencesE = vng.e(vng.e());
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        float f2 = userPreference != null ? CommonUtils.f(userPreference.getValue()) : 0.0f;
        if (weightTargetDifferencesE == null || f2 <= 0.0f) {
            ReleaseLogUtil.c("HealthWeight_WeightViewUtils", "getWeightManagerAndGoal weightTargetDifferences: ", weightTargetDifferencesE, " startWeight: ", Float.valueOf(f2));
            responseCallback.onResponse(-1, null);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        e(f, jCurrentTimeMillis, responseCallback, str);
        WeightTargetDifferences.WeightTargetType weightTargetTypeE = weightTargetDifferencesE.e();
        ReleaseLogUtil.c("HealthWeight_WeightViewUtils", "saveWeightManagerAndGoal type ", weightTargetTypeE, " startWeight ", Float.valueOf(f2));
        int i = AnonymousClass3.f50994a[weightTargetTypeE.ordinal()];
        if (i == 1) {
            e(jCurrentTimeMillis, f, f2, weightTargetDifferencesE, str, responseCallback);
            return;
        }
        if (i == 2) {
            ivd ivdVarE = e(new iuu(), 1, 1);
            ivdVarE.d(f2);
            e(ivdVarE, jCurrentTimeMillis, responseCallback, str);
        } else {
            if (i != 3) {
                return;
            }
            ivd ivdVarE2 = e(new iuu(), 2, 1);
            ivdVarE2.d(f2);
            e(ivdVarE2, jCurrentTimeMillis, responseCallback, str);
        }
    }

    /* JADX INFO: renamed from: vei$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50994a;

        static {
            int[] iArr = new int[WeightTargetDifferences.WeightTargetType.values().length];
            f50994a = iArr;
            try {
                iArr[WeightTargetDifferences.WeightTargetType.WEIGHT_LOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50994a[WeightTargetDifferences.WeightTargetType.WEIGHT_GAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50994a[WeightTargetDifferences.WeightTargetType.WEIGHT_KEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(ivd ivdVar, long j, ResponseCallback<Pair<Long, Object>> responseCallback, String str) {
        LogUtil.a("HealthWeight_WeightViewUtils", "saveWeightManager weightManager ", ivdVar);
        nlx.a(ivdVar, j, false, (ResponseCallback<ivd>) null);
        if ("900300023".equals(str)) {
            responseCallback.onResponse(2, new Pair<>(Long.valueOf(j), ivdVar));
        }
    }

    private static void e(float f, long j, ResponseCallback<Pair<Long, Object>> responseCallback, String str) {
        nlx.e(f, j, (ResponseCallback<Double>) null);
        if ("900300022".equals(str)) {
            responseCallback.onResponse(2, new Pair<>(Long.valueOf(j), Float.valueOf(f)));
        }
    }

    private static int e(double d2) {
        float[][] fArr = d;
        if (d2 <= fArr[0][1]) {
            return 1;
        }
        return d2 > ((double) fArr[2][0]) ? 3 : 2;
    }

    public static void e(long j, float f, float f2, WeightTargetDifferences weightTargetDifferences, String str, ResponseCallback<Pair<Long, Object>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "buildAndSaveWeight callback is null ");
        } else if (weightTargetDifferences == null) {
            ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "buildAndSaveWeight weightTargetDifferences is null");
            responseCallback.onResponse(-1, null);
        } else {
            b(j, f, f2, weightTargetDifferences, str, responseCallback);
        }
    }

    private static void b(final long j, float f, final float f2, WeightTargetDifferences weightTargetDifferences, final String str, final ResponseCallback<Pair<Long, Object>> responseCallback) {
        UserInfomation userInfomationA = ioy.a();
        if (userInfomationA == null) {
            ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "saveWeightManagerLose userInfomation is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        vib vibVar = new vib();
        vibVar.c(userInfomationA.getAge());
        vibVar.a(userInfomationA.getGender());
        vibVar.e(userInfomationA.getHeight() == 50 ? 170 : userInfomationA.getHeight());
        vibVar.a(userInfomationA.getWeight() < 10.0f ? 65.0d : userInfomationA.getWeight());
        float fB = lsl.b(DateFormatUtil.a(weightTargetDifferences.a()), DateFormatUtil.a(weightTargetDifferences.b()));
        int iCeil = (int) Math.ceil(fB / 7.0f);
        if (f2 <= 0.0f) {
            ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "getWeightManagerAndGoal startWeight ", Float.valueOf(f2));
            return;
        }
        double dPow = 1.0d - Math.pow(Math.abs(f / f2), 1.0f / iCeil);
        final int iE = e(dPow);
        LogUtil.a("HealthWeight_WeightViewUtils", "getWeightManagerAndGoal rate ", Double.valueOf(dPow), " loseRate ", Integer.valueOf(iE), " days ", Float.valueOf(fB));
        HashMap map = new HashMap();
        map.put("userInfo", vibVar);
        map.put("goalWeight", Float.valueOf(f));
        map.put("choice", Integer.valueOf(iE));
        map.put("targetSettingChanged", true);
        map.put("getIntPlan", false);
        vms.c(map, new UiCallback<iuu>() { // from class: vei.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.d("HealthWeight_WeightViewUtils", "getWeightManagerAndGoal failed errorCode ", Integer.valueOf(i), " errorInfo ", str2);
                responseCallback.onResponse(-1, null);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(iuu iuuVar) {
                ReleaseLogUtil.c("HealthWeight_WeightViewUtils", "getWeightManagerAndGoal data ", iuuVar);
                if (iuuVar == null) {
                    return;
                }
                ivd ivdVarE = vei.e(iuuVar, 0, iE);
                ivdVarE.d(f2);
                vei.e(ivdVarE, j, (ResponseCallback<Pair<Long, Object>>) responseCallback, str);
            }
        });
    }

    public static double d(double d2, int i, int i2) {
        LogUtil.a("HealthWeight_WeightViewUtils", "getWeightGoalLowLimit currentWeight: ", Double.valueOf(d2), " loseRate: ", Integer.valueOf(i), " height: ", Integer.valueOf(i2));
        if (i <= 0 || i > d.length) {
            i = 1;
        }
        double d3 = UnitUtil.d(Math.pow(((double) i2) / 100.0d, 2.0d) * 16.0d, 1);
        int i3 = i - 1;
        float[] fArr = d[i3];
        float f = (fArr[0] + fArr[1]) / 2.0f;
        double d4 = UnitUtil.d(Math.pow(1.0f - f, f50991c[i3][0]) * d2, 1);
        LogUtil.a("HealthWeight_WeightViewUtils", "getWeightGoalLowLimit weightBmi: ", Double.valueOf(d3), " midRate: ", Float.valueOf(f), " weight: ", Double.valueOf(d4));
        if (Double.compare(d3, d2) >= 0) {
            return 10.0d;
        }
        return Math.max(Math.max(10.0d, d4), d3);
    }
}
