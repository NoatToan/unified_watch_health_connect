package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fya {
    public static void e(HealthTextView healthTextView, String str, boolean z) {
        if (healthTextView == null) {
            LogUtil.j("UiUtils", "setTitleUi titleTextView is null.");
        } else if (!TextUtils.isEmpty(str) && z) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        } else {
            healthTextView.setVisibility(8);
        }
    }

    public static void d(HealthTextView healthTextView, String str, boolean z, boolean z2) {
        if (healthTextView == null) {
            LogUtil.j("UiUtils", "setTitleUi titleTextView is null.");
        } else if (!TextUtils.isEmpty(str) && z) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        } else {
            healthTextView.setVisibility(z2 ? 4 : 8);
        }
    }

    public static void d(HealthTextView healthTextView, String str, boolean z) {
        e(healthTextView, str, z);
    }

    public static void a(HealthTextView healthTextView, String str, boolean z, boolean z2) {
        d(healthTextView, str, z, z2);
    }

    public static void e(HealthTextView healthTextView, String str, String str2) {
        String strD;
        if (healthTextView == null) {
            LogUtil.j("UiUtils", "setPageAttributeUi attributeTextView is null.");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UiUtils", "setPageAttributeUi category is null.");
            healthTextView.setVisibility(8);
            return;
        }
        if (TextUtils.equals(str, "Mixed")) {
            strD = d(str2);
        } else {
            strD = d(str);
        }
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("UiUtils", "pageAttributeText is empty.");
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(strD);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    public static String d(String str) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UiUtils", "getItemCategory category is empty.");
            return null;
        }
        Resources resources = BaseApplication.getContext().getResources();
        str.hashCode();
        switch (str) {
            case "Merchandise":
                b2 = 0;
                break;
            case "Activity":
                b2 = 1;
                break;
            case "Advertisements":
                b2 = 2;
                break;
            case "Information":
                b2 = 3;
                break;
            case "Service":
                b2 = 4;
                break;
            case "Course":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return resources.getString(R.string.IDS_attribute_merchandise);
        }
        if (b2 == 1) {
            return resources.getString(R.string.IDS_main_home_bottom_text_activity);
        }
        if (b2 == 2) {
            return resources.getString(R.string.IDS_messageCenter_ad_logo);
        }
        if (b2 == 3) {
            return resources.getString(R.string.IDS_social_information);
        }
        if (b2 == 4) {
            return resources.getString(R.string.IDS_hw_messagecenter_service);
        }
        if (b2 == 5) {
            return resources.getString(R.string.IDS_configured_page_attribute_course);
        }
        LogUtil.j("UiUtils", "category is empty.");
        return null;
    }

    public static void b(HealthTextView healthTextView, SingleGridContent singleGridContent, String str) {
        String strE;
        if (healthTextView == null || singleGridContent == null) {
            LogUtil.j("UiUtils", "setJoinNumberOrReadCount textView or object is null.");
            return;
        }
        if (TextUtils.equals(str, SingleDailyMomentContent.INFORMATION_TYPE) || TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.INFORMATION_TYPE)) {
            LogUtil.a("UiUtils", "numOfPeople:", singleGridContent.getNumberOfPeople() + "--", singleGridContent.getTheme());
            int numberOfPeople = singleGridContent.getNumberOfPeople();
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId()) && numberOfPeople >= 0) {
                String strReplace = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_activity_social_people_read, numberOfPeople, Integer.valueOf(numberOfPeople)).replace(String.valueOf(numberOfPeople), UnitUtil.e(numberOfPeople, 1, 0));
                healthTextView.setVisibility(0);
                healthTextView.setText(strReplace);
                return;
            }
            healthTextView.setVisibility(8);
            return;
        }
        if (TextUtils.equals(str, SingleDailyMomentContent.ACTIVITY_TYPE) || TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.ACTIVITY_TYPE) || TextUtils.equals(str, SingleDailyMomentContent.COURSE_TYPE) || TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.COURSE_TYPE)) {
            LogUtil.a("UiUtils", "numOfPeople:", singleGridContent.getNumberOfPeople() + "--", singleGridContent.getTheme());
            int numberOfPeople2 = singleGridContent.getNumberOfPeople();
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId()) && numberOfPeople2 > 0) {
                healthTextView.setVisibility(0);
                String string = Integer.toString(numberOfPeople2);
                try {
                    strE = UnitUtil.e(numberOfPeople2, 1, 0);
                    try {
                        string = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_person_join, numberOfPeople2, strE);
                    } catch (Exception e) {
                        e = e;
                        ReleaseLogUtil.a("UiUtils", "setJoinNumberOrReadCount failed, cause exception = ", e.getMessage(), ", cause = ", e.getCause(), ", numberOfPeople = ", strE, ", numOfPeople = ", Integer.valueOf(numberOfPeople2));
                    }
                } catch (Exception e2) {
                    e = e2;
                    strE = "";
                }
                healthTextView.setText(string);
                return;
            }
            healthTextView.setVisibility(8);
            return;
        }
        healthTextView.setVisibility(8);
    }

    public static void e(HealthTextView healthTextView, SingleGridContent singleGridContent, String str, int i) {
        if (healthTextView == null) {
            LogUtil.j("UiUtils", "setActivityStatusView activityStatusTextView is null.");
            return;
        }
        if (singleGridContent == null) {
            LogUtil.j("UiUtils", "setActivityStatusView itemObject is null.");
            return;
        }
        if (!TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.ACTIVITY_TYPE) && !TextUtils.equals(str, SingleDailyMomentContent.ACTIVITY_TYPE)) {
            LogUtil.j("UiUtils", "setActivityStatusView not activity category.");
            return;
        }
        Context context = BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_ICE), "marketingServerCurrentTime" + i);
        OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            LogUtil.j("UiUtils", "operationInteractorsApi = null");
            return;
        }
        LogUtil.a("UiUtils", "setActivityStatusView currentTime:", strE, "--", singleGridContent.getBeginDate(), "--", singleGridContent.getEndDate(), "--", singleGridContent.getTheme(), "--id:", singleGridContent.getDynamicDataId());
        int activityStatus = operationInteractorsApi.getActivityStatus(strE, singleGridContent.getBeginDate(), singleGridContent.getEndDate());
        if (activityStatus == 0) {
            healthTextView.setVisibility(0);
            healthTextView.setText(context.getResources().getString(R.string.IDS_activity_social_coming_soon));
            c(healthTextView, R.color.marketing_activity_status_label);
        } else if (activityStatus == 1) {
            healthTextView.setVisibility(0);
            healthTextView.setText(context.getResources().getString(R.string.IDS_hwh_home_group_underway));
            c(healthTextView, R.color.marketing_activity_status_label);
        } else if (activityStatus == -1) {
            healthTextView.setVisibility(0);
            healthTextView.setText(context.getResources().getString(R.string.IDS_activity_social_is_over));
            c(healthTextView, R.color.hw_show_healthdata_norecord_textcolor);
        } else {
            healthTextView.setVisibility(8);
            LogUtil.a("UiUtils", "setActivityStatusView activity status is empty.");
        }
    }

    private static void c(HealthTextView healthTextView, int i) {
        float[] fArr;
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                fArr = new float[]{a(16.0f), a(16.0f), 0.0f, 0.0f, a(8.0f), a(8.0f), 0.0f, 0.0f};
            } else {
                fArr = new float[]{0.0f, 0.0f, a(16.0f), a(16.0f), 0.0f, 0.0f, a(8.0f), a(8.0f)};
            }
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setColor(BaseApplication.getContext().getColor(i));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UiUtils", "IllegalArgumentException");
        }
    }

    public static int c(Context context, int i) {
        int iB = fxk.b(context) - i;
        if (!qrs.af(BaseApplication.getActivity())) {
            return iB;
        }
        int iB2 = (iB - qqp.b(BaseApplication.getContext())) / 2;
        LogUtil.j("UiUtils", "getBannerImageWidth() width = ", Integer.valueOf(iB2));
        return iB2;
    }

    public static void b(HealthTextView healthTextView, boolean z, boolean z2) {
        if (healthTextView == null || !d()) {
            return;
        }
        if (z) {
            healthTextView.setVisibility(8);
            return;
        }
        if (z2) {
            healthTextView.setMaxLines(3);
        }
        if (qrs.ac()) {
            healthTextView.setTextSize(1, (healthTextView.getTextSize() / healthTextView.getContext().getResources().getDisplayMetrics().scaledDensity) * 2.0f);
        }
    }

    public static boolean d() {
        return qrs.i() >= 1.25f;
    }

    public static void a(HealthTextView healthTextView, CornerTemplate cornerTemplate, float[] fArr) {
        if (cornerTemplate == null) {
            LogUtil.j("UiUtils", "content = null");
            return;
        }
        if (fArr == null) {
            LogUtil.j("UiUtils", "corner radius object is null");
            return;
        }
        if (fArr.length != 8) {
            LogUtil.j("UiUtils", "the quantity of corner params is not equal 8");
            return;
        }
        if (!e(healthTextView, cornerTemplate)) {
            LogUtil.j("UiUtils", "setCornerShow can not show");
            return;
        }
        String corner = cornerTemplate.getCorner();
        if (TextUtils.isEmpty(corner)) {
            return;
        }
        a(healthTextView, cornerTemplate, fArr, corner.length());
        healthTextView.setGravity(17);
        healthTextView.setText(cornerTemplate.getCorner());
        healthTextView.setVisibility(0);
    }

    private static void a(HealthTextView healthTextView, CornerTemplate cornerTemplate, float[] fArr, int i) {
        if (i == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(a(16.0f), a(16.0f));
            gradientDrawable.setColor(Color.parseColor(cornerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
            healthTextView.setPadding(0, 0, 0, 0);
            return;
        }
        if (i < 2) {
            LogUtil.j("UiUtils", "setCornerMultiShow corner text length is: ", Integer.valueOf(i));
            return;
        }
        try {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadii(fArr);
            gradientDrawable2.setColor(Color.parseColor(cornerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable2);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UiUtils", "IllegalArgumentException");
        }
    }

    public static void b(HealthTextView healthTextView, CornerTemplate cornerTemplate) {
        if (cornerTemplate == null) {
            LogUtil.j("UiUtils", "content = null");
            return;
        }
        if (!e(healthTextView, cornerTemplate)) {
            LogUtil.j("UiUtils", "setCornerShow can not show");
            return;
        }
        try {
            float fA = a(4.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
            gradientDrawable.setStroke(a(1.0f), Color.parseColor(cornerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UiUtils", "IllegalArgumentException");
        }
        healthTextView.setGravity(17);
        healthTextView.setText(cornerTemplate.getCorner());
        healthTextView.setTextColor(Color.parseColor(cornerTemplate.getCornerColor()));
        healthTextView.setVisibility(0);
    }

    public static void b(HealthTextView healthTextView, CornerTemplate cornerTemplate, boolean z) {
        float[] fArr;
        if (cornerTemplate == null) {
            LogUtil.j("UiUtils", "content = null");
            return;
        }
        LogUtil.a("UiUtils", "content: ", cornerTemplate.toString());
        if (!e(healthTextView, cornerTemplate)) {
            LogUtil.j("UiUtils", "setCornerShow can not show");
            return;
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                if (z) {
                    fArr = new float[]{a(8.0f), a(8.0f), 0.0f, 0.0f, a(8.0f), a(8.0f), 0.0f, 0.0f};
                } else {
                    fArr = new float[]{a(16.0f), a(16.0f), 0.0f, 0.0f, a(8.0f), a(8.0f), 0.0f, 0.0f};
                }
            } else if (z) {
                fArr = new float[]{0.0f, 0.0f, a(8.0f), a(8.0f), 0.0f, 0.0f, a(8.0f), a(8.0f)};
            } else {
                fArr = new float[]{0.0f, 0.0f, a(16.0f), a(16.0f), 0.0f, 0.0f, a(8.0f), a(8.0f)};
            }
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setColor(Color.parseColor(cornerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UiUtils", "IllegalArgumentException");
        }
        healthTextView.setGravity(17);
        healthTextView.setText(cornerTemplate.getCorner());
        healthTextView.setVisibility(0);
    }

    public static Drawable d(HealthTextView healthTextView, int i, int i2) {
        float[] fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = i2;
            fArr = new float[]{a(f), a(f), 0.0f, 0.0f, a(f), a(f), 0.0f, 0.0f};
        } else {
            float f2 = i2;
            fArr = new float[]{0.0f, 0.0f, a(f2), a(f2), 0.0f, 0.0f, a(f2), a(f2)};
        }
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(ContextCompat.getColor(BaseApplication.getContext(), i));
        if (healthTextView != null) {
            healthTextView.setBackground(gradientDrawable);
        }
        return gradientDrawable;
    }

    public static void a(HealthTextView healthTextView, SingleGridContent singleGridContent, ImageView imageView) {
        if (singleGridContent == null || healthTextView == null || imageView == null) {
            LogUtil.j("UiUtils", "content = null");
        } else if ("1".equals(singleGridContent.getInfoType())) {
            healthTextView.setGravity(17);
            healthTextView.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_sleep_series_icon));
            healthTextView.setVisibility(0);
            imageView.setVisibility(8);
        }
    }

    public static void d(HealthTextView healthTextView, CornerTemplate cornerTemplate) {
        if (!e(healthTextView, cornerTemplate)) {
            LogUtil.j("UiUtils", "setCornerStyle can not show");
            return;
        }
        try {
            healthTextView.setTextColor(Color.parseColor(cornerTemplate.getCornerColor()));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(a(2.0f));
            gradientDrawable.setStroke(2, Color.parseColor(cornerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UiUtils", "IllegalArgumentException");
        }
        healthTextView.setGravity(17);
        healthTextView.setText(cornerTemplate.getCorner());
        healthTextView.setVisibility(0);
    }

    public static void c(HealthTextView healthTextView, CornerTemplate cornerTemplate, int i, int i2, int i3, int i4) {
        if (cornerTemplate == null) {
            LogUtil.j("UiUtils", "content = null");
            return;
        }
        if (!e(healthTextView, cornerTemplate)) {
            LogUtil.j("UiUtils", "setCornerShow can not show");
            return;
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            gradientDrawable.setCornerRadii(new float[]{a(f), a(f), a(f2), a(f2), a(f3), a(f3), a(f4), a(f4)});
            gradientDrawable.setColor(Color.parseColor(cornerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UiUtils", "IllegalArgumentException");
        }
        healthTextView.setGravity(17);
        healthTextView.setText(cornerTemplate.getCorner());
        healthTextView.setVisibility(0);
    }

    private static boolean e(HealthTextView healthTextView, CornerTemplate cornerTemplate) {
        if (healthTextView == null) {
            LogUtil.j("UiUtils", "textView = null");
            return false;
        }
        if (cornerTemplate.getCornerVisibility() && !TextUtils.isEmpty(cornerTemplate.getCorner()) && !TextUtils.isEmpty(cornerTemplate.getCornerColor())) {
            return true;
        }
        healthTextView.setVisibility(8);
        return false;
    }

    public static int a(float f) {
        return qrs.d(BaseApplication.getContext(), f);
    }

    public static void d(HealthTextView healthTextView, int i) {
        if (healthTextView == null || i <= 0) {
            LogUtil.j("UiUtils", "moveCornerMark failed");
            return;
        }
        TextPaint paint = healthTextView.getPaint();
        CharSequence text = healthTextView.getText();
        LogUtil.j("UiUtils", "corner mark text: ", text);
        if (TextUtils.isEmpty(text)) {
            return;
        }
        int iMeasureText = (int) paint.measureText(text.toString());
        LogUtil.e("UiUtils", "corner mark image width and text width: ", Integer.valueOf(i), ",", Integer.valueOf(iMeasureText));
        c(healthTextView, text, i / 2, healthTextView.getPaddingLeft() + healthTextView.getPaddingRight() + iMeasureText);
    }

    private static void c(HealthTextView healthTextView, CharSequence charSequence, int i, int i2) {
        if (b(charSequence)) {
            a(healthTextView, i, i2);
        } else {
            c(healthTextView, i, i2);
        }
    }

    private static void c(final HealthTextView healthTextView, int i, int i2) {
        final int iAbs;
        int left = healthTextView.getLeft() + i;
        int left2 = healthTextView.getLeft() + (i2 / 2);
        if (left2 >= left) {
            iAbs = 0;
        } else if (left2 >= left || left2 < healthTextView.getLeft()) {
            LogUtil.j("UiUtils", "get textMoveWidth error");
            iAbs = 0;
        } else {
            iAbs = Math.abs(left - left2);
        }
        LogUtil.d("UiUtils", "corner mark text moved width: ", Integer.valueOf(iAbs));
        HandlerExecutor.c(new Runnable() { // from class: fya.5
            @Override // java.lang.Runnable
            public void run() {
                HealthTextView healthTextView2 = healthTextView;
                healthTextView2.setLeft(healthTextView2.getLeft() + iAbs);
                HealthTextView healthTextView3 = healthTextView;
                healthTextView3.setRight(healthTextView3.getRight() + iAbs);
            }
        });
    }

    private static void a(final HealthTextView healthTextView, int i, int i2) {
        final int iAbs = Math.abs((i - i2) - (i2 / 2));
        LogUtil.d("UiUtils", "corner mark text moved width: ", Integer.valueOf(iAbs));
        HandlerExecutor.c(new Runnable() { // from class: fya.3
            @Override // java.lang.Runnable
            public void run() {
                HealthTextView healthTextView2 = healthTextView;
                healthTextView2.setLeft(healthTextView2.getLeft() + iAbs);
                HealthTextView healthTextView3 = healthTextView;
                healthTextView3.setRight(healthTextView3.getRight() + iAbs);
            }
        });
    }

    private static boolean b(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && charSequence.length() == 1;
    }

    public static void b(boolean z, HealthSubHeader healthSubHeader) {
        if (!z) {
            ViewGroup.LayoutParams layoutParams = healthSubHeader.getLayoutParams();
            if (layoutParams != null) {
                healthSubHeader.setVisibility(4);
                layoutParams.height = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
                return;
            }
            return;
        }
        healthSubHeader.setVisibility(0);
    }

    public static Drawable c() {
        int i;
        if (qrs.x(BaseApplication.getContext())) {
            i = R.drawable.ic_right_grey_update_dark;
        } else {
            i = R.drawable.ic_right_grey_update;
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return qqz.e(BaseApplication.getContext(), i);
        }
        return ContextCompat.getDrawable(BaseApplication.getContext(), i);
    }

    public static CharSequence d(SingleGridContent singleGridContent) {
        if (singleGridContent == null) {
            ReleaseLogUtil.e("UiUtils", "getContentDescription singleGridContent is null");
            return "";
        }
        String theme = singleGridContent.getTheme();
        String strTrim = theme != null ? theme.trim() : "";
        String description = singleGridContent.getDescription();
        if (description != null) {
            String strTrim2 = description.trim();
            if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                strTrim = qre.a(R.string.accessibility_theme_description, strTrim, strTrim2);
            }
        }
        String strF = strTrim;
        if (TextUtils.isEmpty(strF)) {
            String itemCategory = singleGridContent.getItemCategory();
            String strD = d(itemCategory);
            LogUtil.j("UiUtils", "getContentDescription contentDescription ", strF, " itemCategory ", itemCategory, " itemCategoryText ", strD);
            strF = TextUtils.isEmpty(strD) ? qre.f(R.string.IDS_configured_page_attribute_course) : strD;
        }
        if (lrd.d()) {
            LogUtil.a("UiUtils", "getContentDescription singleGridContent ", HiJsonUtil.d(singleGridContent));
        }
        return strF;
    }
}
