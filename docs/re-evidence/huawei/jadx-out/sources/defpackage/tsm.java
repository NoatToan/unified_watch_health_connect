package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.dialog.HealthDataInputDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.main.R;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class tsm {
    public static String e(dnj dnjVar, double d, double d2) {
        if (dnjVar == null) {
            return "addRecord";
        }
        if (c(BaseApplication.b())) {
            return "startPlan";
        }
        if (d > 0.0d && d2 > 0.0d) {
            if (dnjVar.r() > d) {
                return "loseWeightGoal";
            }
            return "gainWeightGoal";
        }
        if (d2 <= 0.0d) {
            return "addRecord";
        }
        if (exz.b(d2, Utils.o(), dnjVar.d(), dnjVar.c()) > 2) {
            return "todoLoseWeight";
        }
        return "todoGainWeight";
    }

    public static void c(Context context, String str, String str2, String str3, int i) {
        LogUtil.a("VIPCard_MemberWeightUtil", "enter goToCustomRecipe");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, str).addGlobalBiParam("resourceName", str2).addGlobalBiParam("resourceId", str3).addGlobalBiParam("pullOrder", String.valueOf(i + 1));
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.custom-recipe", builder);
    }

    public static void a(Context context, String str) {
        LogUtil.a("VIPCard_MemberWeightUtil", "goToAiFitnessPlan, url = ", str);
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi != null) {
            LogUtil.a("VIPCard_MemberWeightUtil", "jump to Ai fitness plan");
            fitnessAdviceApi.jumpFitnessPage(context, Uri.parse(str), null);
        }
    }

    public static void d(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.d("VIPCard_MemberWeightUtil", "getWeightUserData callback is null");
        } else {
            HiHealthManager.d(context).fetchUserData(new HiCommonListener() { // from class: tsm.3
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    if (obj != null) {
                        List list = (List) obj;
                        if (njy.e(list)) {
                            LogUtil.d("VIPCard_MemberWeightUtil", "getWeightUserData onSuccess userInfos is null or size is zero");
                            iBaseResponseCallback.a(1, new dnj());
                            return;
                        }
                        HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                        if (hiUserInfo == null) {
                            LogUtil.d("VIPCard_MemberWeightUtil", "getWeightUserData onSuccess, HiUserInfo is null");
                            iBaseResponseCallback.a(1, new dnj());
                            return;
                        }
                        int gender = hiUserInfo.getGender();
                        if (gender != 2 && gender != 0 && gender != 1) {
                            gender = -100;
                        }
                        dnj dnjVar = new dnj();
                        dnjVar.e(hiUserInfo.getAge());
                        dnjVar.e((byte) gender);
                        dnjVar.c(hiUserInfo.getHeight());
                        dnjVar.e(hiUserInfo.getWeight());
                        iBaseResponseCallback.a(0, dnjVar);
                        return;
                    }
                    iBaseResponseCallback.a(1, new dnj());
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    LogUtil.c("VIPCard_MemberWeightUtil", "getWeightUserData fail");
                    iBaseResponseCallback.a(1, new dnj());
                }
            });
        }
    }

    public static boolean c(Context context) {
        String strE = SharedPreferenceManager.e(context, "intelligent_plan", "intelligent_plan_create_temp");
        return strE != null && Boolean.parseBoolean(strE);
    }

    public static HealthDataInputDialog.e d(dnj dnjVar) {
        HealthDataInputDialog.e eVar;
        HealthDataInputDialog.DataSetFormatter dataSetFormatterC = c();
        HealthDataInputDialog.SelectedValueProcessor selectedValueProcessorD = d();
        int iE = UnitUtil.e();
        if (iE == 1) {
            eVar = new HealthDataInputDialog.e((int) UnitUtil.j(10.0d), (int) UnitUtil.j(251.0d), dataSetFormatterC, selectedValueProcessorD);
        } else if (iE == 3) {
            eVar = new HealthDataInputDialog.e(22, 552, dataSetFormatterC, selectedValueProcessorD);
        } else {
            eVar = new HealthDataInputDialog.e(10, 251, dataSetFormatterC, selectedValueProcessorD);
        }
        eVar.e(vei.e(100.0d, false)).c(BaseApplication.b().getResources().getString(R.string.IDS_hw_show_set_weight));
        eVar.e(1);
        if (dnjVar == null) {
            eVar.d(vng.e(70.0d));
            return eVar;
        }
        if (dnjVar.r() > 0.0f) {
            eVar.d(vng.e(dnjVar.r()));
            return eVar;
        }
        if (dnjVar.d() == 0) {
            eVar.d(vng.e(50.0d));
            return eVar;
        }
        eVar.d(vng.e(70.0d));
        return eVar;
    }

    public static HealthDataInputDialog.e a(dnj dnjVar) {
        HealthDataInputDialog.e eVar = new HealthDataInputDialog.e(50, 250, c(), a());
        eVar.e(BaseApplication.b().getResources().getString(R.string.IDS_cm));
        eVar.c(BaseApplication.b().getResources().getString(R.string.IDS_hw_show_set_height));
        eVar.e(1);
        if (dnjVar != null) {
            LogUtil.a("VIPCard_MemberWeightUtil", "height = ", Integer.valueOf(dnjVar.e()));
            if (dnjVar.e() > 0) {
                eVar.d(d(dnjVar.e(), 50.0d));
                return eVar;
            }
            if (dnjVar.d() == 0) {
                eVar.d(d(160.0d, 50.0d));
                return eVar;
            }
            eVar.d(d(170.0d, 50.0d));
            return eVar;
        }
        eVar.d(d(170.0d, 50.0d));
        return eVar;
    }

    public static View a(final Context context, dnj dnjVar) {
        if (context == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.member_open_inch_height_dialog, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.height_ft_number_picker_v9);
        String[] strArr = new String[8];
        int i = 0;
        while (i < 8) {
            int i2 = i + 1;
            strArr[i] = context.getResources().getQuantityString(R.plurals.IDS_altitude_ft, i2, Integer.valueOf(i2));
            i = i2;
        }
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(7);
        healthNumberPicker.setSelectorPaintColor(context.getResources().getColor(R.color.weight_management_text_color));
        HealthNumberPicker healthNumberPicker2 = (HealthNumberPicker) viewInflate.findViewById(R.id.height_inch_number_picker_v9);
        String[] strArr2 = new String[12];
        for (int i3 = 0; i3 < 12; i3++) {
            strArr2[i3] = context.getResources().getQuantityString(R.plurals.IDS_ins_string, i3, Integer.valueOf(i3));
        }
        healthNumberPicker2.setDisplayedValues(strArr2);
        healthNumberPicker2.setMinValue(0);
        healthNumberPicker2.setMaxValue(11);
        healthNumberPicker2.setSelectorPaintColor(context.getResources().getColor(R.color.weight_management_text_color));
        final int[] iArrC = c(dnjVar);
        if (dnjVar != null && dnjVar.e() > 30) {
            int[] iArrG = UnitUtil.g(BigDecimal.valueOf(dnjVar.e()).divide(new BigDecimal(100), 2, 4).doubleValue());
            if (iArrG[0] > 0 && iArrG[1] >= 0) {
                iArrC = iArrG;
            }
        }
        healthNumberPicker.setValue(iArrC[0] - 1);
        healthNumberPicker2.setValue(iArrC[1]);
        final HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.inch_height_value);
        healthTextView.setText(c(context, iArrC));
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: tso
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public final void onValuePicked(int i4, int i5) {
                tsm.e(iArrC, healthTextView, context, i4, i5);
            }
        });
        healthNumberPicker2.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: tsn
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public final void onValuePicked(int i4, int i5) {
                tsm.c(iArrC, healthTextView, context, i4, i5);
            }
        });
        return viewInflate;
    }

    static /* synthetic */ void e(int[] iArr, HealthTextView healthTextView, Context context, int i, int i2) {
        iArr[0] = i2 + 1;
        healthTextView.setText(c(context, iArr));
    }

    static /* synthetic */ void c(int[] iArr, HealthTextView healthTextView, Context context, int i, int i2) {
        iArr[1] = i2;
        healthTextView.setText(c(context, iArr));
    }

    private static int[] c(dnj dnjVar) {
        if (dnjVar != null && dnjVar.d() == 0) {
            return new int[]{5, 3};
        }
        return new int[]{5, 7};
    }

    private static CharSequence c(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return "";
        }
        Resources resources = context.getResources();
        int i = R.plurals.IDS_altitude_ft;
        int i2 = iArr[0];
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        Resources resources2 = context.getResources();
        int i3 = R.plurals.IDS_ins_string;
        int i4 = iArr[1];
        return e(context.getResources().getString(R.string.IDS_member_bmi_selected_height, quantityString, resources2.getQuantityString(i3, i4, Integer.valueOf(i4))), String.valueOf(iArr[0]), String.valueOf(iArr[1]));
    }

    public static CharSequence e(String str, String str2, String str3) {
        int iLastIndexOf;
        int iIndexOf;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 30.0f, BaseApplication.b().getResources().getDisplayMetrics());
        LogUtil.a("VIPCard_MemberWeightUtil", "textSize = ", Integer.valueOf(iApplyDimension));
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("VIPCard_MemberWeightUtil", "getTextSizeSpanString() content or highlightText is empty.");
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!TextUtils.isEmpty(str2) && (iIndexOf = str.indexOf(str2)) >= 0) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iApplyDimension), iIndexOf, str2.length() + iIndexOf, 34);
        }
        if (!TextUtils.isEmpty(str3) && (iLastIndexOf = str.lastIndexOf(str3)) >= 0) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iApplyDimension), iLastIndexOf, str3.length() + iLastIndexOf, 34);
        }
        return spannableStringBuilder;
    }

    public static int d(double d, double d2) {
        try {
            return (int) (NumberFormat.getInstance(Locale.getDefault()).parse(UnitUtil.e(BigDecimal.valueOf(d).subtract(BigDecimal.valueOf(d2)).doubleValue(), 1, 1)).doubleValue() * 10.0d);
        } catch (ParseException e) {
            LogUtil.c("VIPCard_MemberWeightUtil", "parse weight data exception", e.getMessage());
            return 0;
        }
    }

    public static double e(double d, int i) {
        return new BigDecimal(d + (((double) i) * 0.1d)).setScale(1, 4).doubleValue();
    }

    public static HealthDataInputDialog.DataSetFormatter c() {
        return new HealthDataInputDialog.DataSetFormatter() { // from class: tsp
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.DataSetFormatter
            public final String format(int i) {
                return UnitUtil.e(i, 1, 0);
            }
        };
    }

    public static HealthDataInputDialog.SelectedValueProcessor d() {
        return new HealthDataInputDialog.SelectedValueProcessor() { // from class: tsm.2
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public int process(int i, int i2) {
                return i;
            }

            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public String format(int i) {
                return UnitUtil.e(vng.c(i), 1, 1);
            }
        };
    }

    public static HealthDataInputDialog.SelectedValueProcessor a() {
        return new HealthDataInputDialog.SelectedValueProcessor() { // from class: tsm.1
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public int process(int i, int i2) {
                return i;
            }

            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public String format(int i) {
                return UnitUtil.e(tsm.e(50.0d, i), 1, 1);
            }
        };
    }

    public static void a(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        LogUtil.a("VIPCard_MemberWeightUtil", "enter getRecommendedPlanList");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.d("VIPCard_MemberWeightUtil", "refreshFitnessPlan, getRecommendPlans : planApi is null.");
            iBaseResponseCallback.a(1, new ArrayList());
        } else {
            planApi.getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: tsm.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.d("VIPCard_MemberWeightUtil", "onFailure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                    iBaseResponseCallback.a(1, new ArrayList());
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitnessPackageInfo> list) {
                    LogUtil.a("VIPCard_MemberWeightUtil", "onSuccess invoke, data = ", list);
                    ArrayList arrayList = new ArrayList();
                    for (FitnessPackageInfo fitnessPackageInfo : list) {
                        if (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                            arrayList.add(fitnessPackageInfo);
                        }
                    }
                    LogUtil.a("VIPCard_MemberWeightUtil", "fitnessPackageInfo = ", arrayList);
                    iBaseResponseCallback.a(0, arrayList);
                }
            });
        }
    }

    public static SpannableString e(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.weight_management_text_color)), iIndexOf, str2.length() + iIndexOf, 17);
        return spannableString;
    }

    public static void d(float f) {
        dso dsoVar = new dso();
        dsoVar.setBodyFatRat(0.0f);
        dsoVar.setWeight(f);
        dsoVar.setStartTime(System.currentTimeMillis());
        dsoVar.d(true);
        dsoVar.setEndTime(System.currentTimeMillis());
        enw enwVar = new enw(10006);
        enwVar.c(new IBaseResponseCallback() { // from class: tsi
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("VIPCard_MemberWeightUtil", "errorCode = ", Integer.valueOf(i), " objData = ", obj);
            }
        });
        enwVar.onDataChanged(vng.a(), dsoVar);
    }
}
