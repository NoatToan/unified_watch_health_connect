package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class trh {
    public static void d(HealthTextView healthTextView, String str, int i) {
        if (healthTextView == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setTitleUi titleTextView is null.");
        } else if (!TextUtils.isEmpty(str) && i == 1) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        } else {
            healthTextView.setVisibility(8);
        }
    }

    public static void e(HealthTextView healthTextView, String str, int i) {
        d(healthTextView, str, i);
    }

    public static void e(HealthTextView healthTextView, dlm dlmVar, int i) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setJoinNumberOrReadCount textView or itemObject is null.");
            return;
        }
        String strW = dlmVar.w();
        if (!TextUtils.isEmpty(strW)) {
            c(healthTextView, dlmVar, strW);
        } else {
            b(healthTextView, dlmVar, i);
        }
    }

    private static void c(HealthTextView healthTextView, dlm dlmVar, String str) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setNumberViewByPageAttributeKey textView or itemObject is null.");
            return;
        }
        if ("activity".equals(str)) {
            b(healthTextView, dlmVar);
        } else if ("knowledge".equals(str)) {
            a(healthTextView, dlmVar);
        } else {
            healthTextView.setVisibility(8);
        }
    }

    private static void b(HealthTextView healthTextView, dlm dlmVar, int i) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setNumberViewByPageAttribute textView or itemObject is null.");
        } else {
            if (c(healthTextView, dlmVar, i)) {
                return;
            }
            b(healthTextView, dlmVar);
        }
    }

    private static boolean c(HealthTextView healthTextView, dlm dlmVar, int i) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "isViewVisibleByPageAttribute textView or itemObject is null.");
            return true;
        }
        String strA = a(dlmVar);
        if (TextUtils.isEmpty(strA)) {
            if (i == 3) {
                return false;
            }
            healthTextView.setVisibility(8);
            return true;
        }
        if ("活动".equals(strA)) {
            return false;
        }
        healthTextView.setVisibility(8);
        return true;
    }

    private static void a(HealthTextView healthTextView, dlm dlmVar) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setReadCount readTextView or itemObject is null.");
            return;
        }
        int iY = dlmVar.y();
        if (iY >= 0) {
            String strReplace = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_activity_social_people_read, iY, Integer.valueOf(iY)).replace(String.valueOf(iY), UnitUtil.e(iY, 1, 0));
            healthTextView.setVisibility(0);
            healthTextView.setText(strReplace);
            return;
        }
        healthTextView.setVisibility(8);
    }

    private static void b(HealthTextView healthTextView, dlm dlmVar) {
        String strL = dlmVar.l();
        if (TextUtils.isEmpty(strL)) {
            LogUtil.j("ConfiguredPage_UiUtil", "setJoinNumber numOfPeopleString is empty.");
            healthTextView.setVisibility(8);
            return;
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), strL);
        if (iN >= 0) {
            healthTextView.setVisibility(0);
            healthTextView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_activity_social_people_attended, UnitUtil.e(iN, 1, 0)));
        } else {
            healthTextView.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    public static void e(HealthTextView healthTextView, dlm dlmVar) {
        byte b2;
        String string;
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setPageAttributeUi attributeTextView or object is null.");
            return;
        }
        String strW = dlmVar.w();
        if (TextUtils.isEmpty(strW)) {
            LogUtil.j("ConfiguredPage_UiUtil", "setPageAttributeUi pageAttributeKey is empty.");
            c(healthTextView, dlmVar);
            return;
        }
        Resources resources = BaseApplication.getContext().getResources();
        strW.hashCode();
        switch (strW) {
            case "advertising":
                b2 = 0;
                break;
            case "activity":
                b2 = 1;
                break;
            case "course":
                b2 = 2;
                break;
            case "medal":
                b2 = 3;
                break;
            case "knowledge":
                b2 = 4;
                break;
            case "service":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            string = resources.getString(R.string.IDS_messageCenter_ad_logo);
        } else if (b2 == 1) {
            string = resources.getString(R.string.IDS_main_home_bottom_text_activity);
        } else if (b2 == 2) {
            string = resources.getString(R.string.IDS_configured_page_attribute_course);
        } else if (b2 == 3) {
            string = resources.getString(R.string.IDS_clear_medal_data_cache);
        } else if (b2 == 4) {
            string = resources.getString(R.string.IDS_configured_page_attribute_knowledge);
        } else if (b2 == 5) {
            string = resources.getString(R.string.IDS_hw_messagecenter_service);
        } else {
            string = dlmVar.u();
            if (!TextUtils.isEmpty(string)) {
                string = string.trim();
            }
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("ConfiguredPage_UiUtil", "setPageAttributeUi pageAttributeText is empty.");
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(string);
        }
    }

    private static void c(HealthTextView healthTextView, dlm dlmVar) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setAttributeViewByPageAttribute attributeTextView or object is null.");
            return;
        }
        String strA = a(dlmVar);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("ConfiguredPage_UiUtil", "setAttributeViewByPageAttribute pageAttribute is empty.");
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(strA);
        }
    }

    public static void e(HealthTextView healthTextView, dlm dlmVar, int i, int i2) {
        if (healthTextView == null || dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setHuaweiActivityStatusUi activityStatusTextView or itemObject is null.");
            return;
        }
        String strW = dlmVar.w();
        if (TextUtils.isEmpty(strW)) {
            if (c(healthTextView, dlmVar, i2)) {
                return;
            }
        } else if (!"activity".equals(strW)) {
            healthTextView.setVisibility(8);
            return;
        }
        d(healthTextView, dlmVar, i);
    }

    private static void d(HealthTextView healthTextView, dlm dlmVar, int i) {
        Context context = BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "configuredPageActivityServerCurrentTime" + i);
        OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "operationInteractorsApi = null");
            return;
        }
        int activityStatus = operationInteractorsApi.getActivityStatus(strE, dlmVar.d(), dlmVar.f());
        if (activityStatus == 0) {
            healthTextView.setVisibility(0);
            healthTextView.setText(context.getResources().getString(R.string.IDS_activity_social_coming_soon));
            healthTextView.setBackground(context.getResources().getDrawable(R.drawable.activity_status_in_coming_bg));
        } else if (activityStatus == 1) {
            healthTextView.setVisibility(0);
            healthTextView.setText(context.getResources().getString(R.string.IDS_hwh_home_group_underway));
            healthTextView.setBackground(context.getResources().getDrawable(R.drawable.activity_status_in_progress_bg));
        } else if (activityStatus == -1) {
            healthTextView.setVisibility(0);
            healthTextView.setText(context.getResources().getString(R.string.IDS_activity_social_is_over));
            healthTextView.setBackground(context.getResources().getDrawable(R.drawable.activity_status_finished_bg));
        } else {
            healthTextView.setVisibility(8);
            LogUtil.a("ConfiguredPage_UiUtil", "setHuaweiActivityStatusUi activity status is empty.");
        }
    }

    private static String a(dlm dlmVar) {
        if (dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "getPageAttribute itemObject is null.");
            return "";
        }
        String strX = dlmVar.x();
        if (TextUtils.isEmpty(strX)) {
            return "";
        }
        return strX.trim();
    }

    public static void b(HealthTextView healthTextView, LinearLayout linearLayout, HealthTextView healthTextView2, dlm dlmVar, int i) {
        if (healthTextView == null || linearLayout == null || healthTextView2 == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setCommonViewTitle titleTextView or textAreaLayout or textAreaTitleView is null.");
            return;
        }
        if (dlmVar == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setCommonViewTitle itemObject is null.");
            return;
        }
        Context context = BaseApplication.getContext();
        String strO = dlmVar.o();
        int i2 = dlmVar.i();
        ViewGroup.LayoutParams layoutParams = healthTextView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (i == 1) {
            linearLayout.setVisibility(8);
            d(healthTextView, strO, i2);
            a(context, healthTextView, layoutParams2);
        } else {
            if (i == 2) {
                linearLayout.setVisibility(8);
                d(healthTextView, strO, i2);
                d(context, healthTextView, layoutParams2);
                return;
            }
            healthTextView.setVisibility(8);
            if (!TextUtils.isEmpty(strO) && i2 == 1) {
                linearLayout.setVisibility(0);
                healthTextView2.setText(strO);
            } else {
                linearLayout.setVisibility(8);
            }
        }
    }

    private static void d(Context context, HealthTextView healthTextView, RelativeLayout.LayoutParams layoutParams) {
        if (context == null || healthTextView == null || layoutParams == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setTextInnerCenterTitle context or titleTextView or titleParams is null.");
            return;
        }
        layoutParams.removeRule(12);
        layoutParams.removeRule(20);
        layoutParams.addRule(15);
        layoutParams.setMarginStart(qqp.a(context, 12.0f));
        healthTextView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.textSizeButton1));
        healthTextView.setTextColor(context.getResources().getColor(R.color.textColorPrimary));
        healthTextView.setTypeface(Typeface.create(context.getResources().getString(R.string.textFontFamilyMedium), 0));
        healthTextView.setLayoutParams(layoutParams);
    }

    private static void a(Context context, HealthTextView healthTextView, RelativeLayout.LayoutParams layoutParams) {
        if (context == null || healthTextView == null || layoutParams == null) {
            LogUtil.j("ConfiguredPage_UiUtil", "setTextInnerImageTitle context or titleTextView or titleParams is null.");
            return;
        }
        layoutParams.removeRule(15);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(qqp.a(context, 16.0f));
        layoutParams.bottomMargin = qqp.a(context, 8.0f);
        healthTextView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.textSizeSubTitle3));
        healthTextView.setTextColor(context.getResources().getColor(R.color.common_white_90alpha));
        healthTextView.setTypeface(Typeface.create(context.getResources().getString(R.string.textFontFamilyMedium), 0));
        healthTextView.setLayoutParams(layoutParams);
    }
}
