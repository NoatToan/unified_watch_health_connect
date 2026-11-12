package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.views.FitnessDataOriginView;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class uzi {
    public static void e(Set<String> set, int i, List<uif> list, CustomViewDialog.Builder builder, final Context context, int i2) {
        SpannableString spannableString;
        FitnessDataOriginView fitnessDataOriginView = new FitnessDataOriginView(context, (Boolean) true);
        fitnessDataOriginView.setIsSleepType();
        ArrayList arrayList = new ArrayList();
        SleepViewConstants.SleepTypeEnum sleepTypeEnum = SleepViewConstants.SleepTypeEnum.SCIENCE;
        boolean z = i != 1;
        int[] iArr = new int[4];
        for (uif uifVar : list) {
            boolean zBooleanValue = uifVar.e() instanceof Boolean ? ((Boolean) uifVar.e()).booleanValue() : true;
            e(uifVar, iArr);
            if (set.contains(uifVar.b()) && z == zBooleanValue) {
                if (uifVar.a() == 32) {
                    if (uifVar.d() != null) {
                        arrayList.add(uifVar.d());
                    } else {
                        arrayList.add(qre.f(R.string.IDS_origin_phone));
                    }
                    sleepTypeEnum = SleepViewConstants.SleepTypeEnum.PHONE;
                } else {
                    if (uifVar.b() != null && uifVar.b().equals("-1")) {
                        arrayList.add(qre.f(R.string.IDS_manual_sleep_manual_sleep_input));
                        sleepTypeEnum = SleepViewConstants.SleepTypeEnum.MANUAL;
                    } else if (uifVar.c() != null) {
                        arrayList.add(uifVar.c());
                    } else {
                        arrayList.add(qre.f(R.string.IDS_hw_data_origin_unknow_device));
                    }
                    if (!z) {
                        sleepTypeEnum = SleepViewConstants.SleepTypeEnum.COMMON;
                    }
                }
            }
        }
        String strF = qre.f(R.string.IDS_manual_sleep_more_data_module_name);
        String strC = c(sleepTypeEnum, TextUtils.join("、", arrayList), strF, iArr);
        int iIndexOf = strC.indexOf(strF);
        int length = strF.length() + iIndexOf;
        if (iIndexOf == -1 || length - 1 == -1 || iIndexOf == strC.length() - 1) {
            spannableString = null;
        } else {
            spannableString = new SpannableString(strC);
            spannableString.setSpan(new ClickableSpan() { // from class: uzi.1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    PrivacyDataModelActivity.b(context, new PageModelArgs(103, "PrivacyDataConstructor", 3, 1));
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(ContextCompat.getColor(BaseApplication.b(), R.color.sleep_no_data_learn_more_color));
                    textPaint.setUnderlineText(false);
                }
            }, iIndexOf, length, 18);
        }
        if (spannableString != null) {
            fitnessDataOriginView.setInfoTextSpannableString(spannableString);
        } else {
            fitnessDataOriginView.setInfoText(strC);
        }
        fitnessDataOriginView.setmListdata(list);
        builder.a(qre.f(R.string.IDS_sleep_data_source)).d((View) fitnessDataOriginView).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: uzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("SleepDayBarChartUtils", "showFitnessDataOriginDialog() PositiveButton onClick.");
            }
        });
    }

    public static void e(uif uifVar, int[] iArr) {
        if (uifVar == null || iArr == null || iArr.length != 4) {
            LogUtil.e("SleepDayBarChartUtils", "wrong input");
            return;
        }
        if (uifVar.b() != null && uifVar.b().equals("-1")) {
            iArr[2] = iArr[2] + 1;
            return;
        }
        if (uifVar.e() == null) {
            iArr[1] = iArr[1] + 1;
            return;
        }
        if (!(uifVar.e() instanceof Boolean)) {
            LogUtil.e("SleepDayBarChartUtils", "wrong device Type", uifVar);
        } else if (((Boolean) uifVar.e()).booleanValue()) {
            iArr[0] = iArr[0] + 1;
        } else {
            iArr[3] = iArr[3] + 1;
        }
    }

    /* JADX INFO: renamed from: uzi$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50806b;

        static {
            int[] iArr = new int[SleepViewConstants.SleepTypeEnum.values().length];
            f50806b = iArr;
            try {
                iArr[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50806b[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50806b[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50806b[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String c(SleepViewConstants.SleepTypeEnum sleepTypeEnum, String str, String str2, int[] iArr) {
        String strF;
        int i = AnonymousClass4.f50806b[sleepTypeEnum.ordinal()];
        if (i == 1) {
            int i2 = iArr[2];
            if (i2 == 1) {
                strF = String.format(Locale.ENGLISH, qre.f(R.string.IDS_manual_sleep_more_data_manual_new), str2);
            } else if (i2 > 1) {
                strF = qre.f(R.string.IDS_sleep_data_source_multi_manual_device);
            } else {
                LogUtil.e("SleepDayBarChartUtils", "MANUAL wrong size:", Integer.valueOf(i2));
                strF = "";
            }
        } else if (i == 2) {
            int i3 = iArr[3];
            if (i3 == 1) {
                strF = String.format(Locale.ENGLISH, qre.f(R.string.IDS_manual_sleep_more_data_standard_new), str, str2);
            } else if (i3 > 1) {
                strF = qre.f(R.string.IDS_sleep_data_source_multi_common_device);
            } else {
                LogUtil.e("SleepDayBarChartUtils", "COMMON wrong size:", Integer.valueOf(i3));
                strF = "";
            }
        } else if (i == 3) {
            int i4 = iArr[1];
            if (i4 == 1) {
                strF = b(str);
            } else if (i4 > 1) {
                strF = qre.f(R.string.IDS_sleep_data_source_multi_phone_device);
            } else {
                LogUtil.e("SleepDayBarChartUtils", "PHONE wrong size:", Integer.valueOf(i4));
                strF = "";
            }
        } else {
            if (i == 4) {
                int i5 = iArr[0];
                if (i5 > 0) {
                    strF = b(str);
                } else {
                    LogUtil.e("SleepDayBarChartUtils", "SCIENCE wrong size:", Integer.valueOf(i5));
                }
            } else {
                LogUtil.e("SleepDayBarChartUtils", "error sleepType");
            }
            strF = "";
        }
        LogUtil.a("SleepDayBarChartUtils", "sleepType: ", sleepTypeEnum, " finalString:", strF, " deviceStatistics: ", Arrays.toString(iArr));
        return strF;
    }

    private static String b(String str) {
        String strF = qre.f(R.string.IDS_detail_title_txtsleep_value);
        return String.format(Locale.ENGLISH, qre.f(R.string.IDS_manual_sleep_more_data), str, strF);
    }
}
