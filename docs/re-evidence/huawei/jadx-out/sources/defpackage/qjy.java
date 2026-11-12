package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class qjy {
    private static boolean b(long j, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("UIHLH_CommonAutoTestToast", "currentTime = ", Long.valueOf(jCurrentTimeMillis));
        long j2 = jCurrentTimeMillis - j;
        LogUtil.a("UIHLH_CommonAutoTestToast", "period = ", Long.valueOf(j2));
        LogUtil.a("UIHLH_CommonAutoTestToast", "count = ", Integer.valueOf(i));
        if (i > 4 || i < 0) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int iPow = (int) Math.pow(2.0d, i - 1);
        LogUtil.a("UIHLH_CommonAutoTestToast", "time = ", Integer.valueOf(iPow));
        long j3 = ((long) iPow) * 604800000;
        LogUtil.a("UIHLH_CommonAutoTestToast", "duration = ", Long.valueOf(j3));
        return j2 >= j3;
    }

    public static void d(final Context context, final IBaseResponseCallback iBaseResponseCallback, final RelativeLayout relativeLayout, String str, String[] strArr) {
        int i;
        long j;
        if (strArr == null || strArr.length != 4) {
            LogUtil.e("UIHLH_CommonAutoTestToast", "sharedPreferenceKeys is invalid");
            return;
        }
        final String str2 = strArr[0];
        final String str3 = strArr[1];
        final String str4 = strArr[2];
        final String str5 = strArr[3];
        String strE = SharedPreferenceManager.e(context, Integer.toString(10006), str5);
        LogUtil.a("UIHLH_CommonAutoTestToast", "isShow = ", strE);
        e(str, context, relativeLayout);
        String strE2 = SharedPreferenceManager.e(context, Integer.toString(10006), str4);
        if (qrs.b(strE2)) {
            try {
                i = Integer.parseInt(strE2);
            } catch (NumberFormatException unused) {
                LogUtil.e("UIHLH_CommonAutoTestToast", "showBeginDeviceAutoDetect integerCount NumberFormatException");
                i = 0;
            }
        } else {
            i = 0;
        }
        if (!"true".equals(strE)) {
            String strE3 = SharedPreferenceManager.e(context, Integer.toString(10006), str2);
            LogUtil.a("UIHLH_CommonAutoTestToast", " showBeginDeviceStressAutoDetect notReMind = ", strE3);
            if ("true".equals(strE3)) {
                return;
            }
            String strE4 = SharedPreferenceManager.e(context, Integer.toString(10006), str3);
            if (qrs.b(strE4)) {
                try {
                    j = Long.parseLong(strE4);
                } catch (NumberFormatException unused2) {
                    LogUtil.e("UIHLH_CommonAutoTestToast", "showBeginDeviceAutoDetect lastShowDialogTimeLong NumberFormatException");
                    j = 0;
                }
            } else {
                j = 0;
            }
            LogUtil.a("UIHLH_CommonAutoTestToast", "lastShowDialogTimeLong = ", Long.valueOf(j));
            boolean zB = b(j, i);
            LogUtil.a("UIHLH_CommonAutoTestToast", "isDialogPeriod= ", Boolean.valueOf(zB));
            if (!zB) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "time interval is not invalid");
                return;
            }
        }
        SharedPreferenceManager.e(context, Integer.toString(10006), str5, "true", new StorageParams());
        iBaseResponseCallback.a(-1, null);
        if (!HandlerExecutor.d()) {
            final int i2 = i;
            HandlerExecutor.c(new Runnable() { // from class: qjy.2
                @Override // java.lang.Runnable
                public void run() {
                    relativeLayout.setVisibility(0);
                    qjy.d(i2, relativeLayout, context, str2, iBaseResponseCallback, str5, str3, str4);
                }
            });
        } else {
            relativeLayout.setVisibility(0);
            d(i, relativeLayout, context, str2, iBaseResponseCallback, str5, str3, str4);
        }
    }

    public static void c(Context context, String str, String str2, int i) {
        LogUtil.a("UIHLH_CommonAutoTestToast", "integerCount = ", Integer.valueOf(i));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        LogUtil.a("UIHLH_CommonAutoTestToast", "currentTimeString = ", strValueOf);
        SharedPreferenceManager.e(context, Integer.toString(10006), str, strValueOf, new StorageParams());
        int i2 = i + 1;
        LogUtil.a("UIHLH_CommonAutoTestToast", "setToastCilckInfo already show count = ", Integer.valueOf(i2));
        SharedPreferenceManager.e(context, Integer.toString(10006), str2, Integer.toString(i2), new StorageParams());
    }

    public static void e(Context context, String str, String str2) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10006), str);
        LogUtil.a("UIHLH_CommonAutoTestToast", " autoTestCloseSwitchRule notReMind = ", strE);
        if ("true".equals(strE)) {
            return;
        }
        String strE2 = SharedPreferenceManager.e(context, Integer.toString(10006), str2);
        if (qrs.b(strE2)) {
            try {
                if (Integer.parseInt(strE2) >= 5) {
                    return;
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("UIHLH_CommonAutoTestToast", "autoTestCloseSwitchRule NumberFormatException");
            }
        }
        LogUtil.a("UIHLH_CommonAutoTestToast", " autoTestCloseSwitchRule set notReMind");
        SharedPreferenceManager.e(context, Integer.toString(10006), str, "true", new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2, Context context) {
        HashMap map = new HashMap();
        if (str.equals("pressure_auto_detector_agree_no_again_tip")) {
            map.put("moduleType", "1");
        } else if (!str.equals("core_sleep_btn_tips_do_not_remind_again")) {
            return;
        } else {
            map.put("moduleType", "0");
        }
        map.put("click", "1");
        map.put("buttonType", str2);
        lmf.d().c(context, AnalyticsValue.HEALTH_PRESSURE_OR_SLEEP_AUTO_DETECT_TOAST_BUTTON_CLICK_2160027.value(), map, 0);
    }

    public static boolean a(Context context, RelativeLayout relativeLayout, String str) {
        if (!"true".equals(SharedPreferenceManager.e(context, Integer.toString(10006), str))) {
            return true;
        }
        relativeLayout.setVisibility(8);
        return false;
    }

    public static int e(Context context, RelativeLayout relativeLayout, String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        int i2;
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.toast_no_notice_layout);
        String strE = SharedPreferenceManager.e(context, Integer.toString(10006), str);
        if (qrs.b(strE)) {
            try {
                i2 = Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("UIHLH_CommonAutoTestToast", "showToastLayoutByCount NumberFormatException");
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        if (i2 < i) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        relativeLayout.setVisibility(0);
        iBaseResponseCallback.a(-1, null);
        return i2;
    }

    public static void a(Context context, String str, IBaseResponseCallback iBaseResponseCallback, RelativeLayout relativeLayout, String str2, String str3) {
        if (str3 == null) {
            LogUtil.j("UIHLH_CommonAutoTestToast", "content is null");
            return;
        }
        if (relativeLayout == null) {
            LogUtil.j("UIHLH_CommonAutoTestToast", "layout is null");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("UIHLH_CommonAutoTestToast", "title is isEmpty");
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            LogUtil.j("UIHLH_CommonAutoTestToast", "content is isEmpty");
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.j("UIHLH_CommonAutoTestToast", "callback is null");
            return;
        }
        if (d(context, "wear_activity_tip_no_again" + str, relativeLayout, str2, str3)) {
            iBaseResponseCallback.a(160001, "current dialog is notRemind.");
        } else {
            b(context, str, iBaseResponseCallback, relativeLayout);
        }
    }

    private static void b(final Context context, String str, final IBaseResponseCallback iBaseResponseCallback, final RelativeLayout relativeLayout) {
        final String str2 = "wear_activity_tip_no_again" + str;
        final String str3 = "wear_activity_tip_last_time" + str;
        final String str4 = "wear_activity_tip_open_count " + str;
        final String str5 = "wear_activity_tip_is_shown" + str;
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.toast_no_notice_layout);
        final int iA = a(context, str4, relativeLayout, linearLayout, str5);
        b(iA < 1, relativeLayout);
        iBaseResponseCallback.a(-1, null);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qjy.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qjy.e(relativeLayout, iBaseResponseCallback, context, str2, str5);
                qjy.c(context, str3, str4, iA);
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_cancel_layout);
        linearLayout2.setVisibility(0);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: qjy.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "cancelLayout");
                relativeLayout.setVisibility(8);
                iBaseResponseCallback.a(100000, null);
                SharedPreferenceManager.e(context, Integer.toString(10006), str5, "false", new StorageParams());
                qjy.c(context, str3, str4, iA);
            }
        });
        ((LinearLayout) qsp.a(relativeLayout, R.id.toast_try_layout)).setOnClickListener(new View.OnClickListener() { // from class: qjy.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "startLayout");
                iBaseResponseCallback.a(0, null);
                relativeLayout.setVisibility(8);
                SharedPreferenceManager.e(context, Integer.toString(10006), str5, "false", new StorageParams());
                qjy.c(context, str3, str4, iA);
            }
        });
    }

    private static int a(Context context, String str, RelativeLayout relativeLayout, LinearLayout linearLayout, String str2) {
        int i;
        String strE = SharedPreferenceManager.e(context, Integer.toString(10006), str);
        if (qrs.b(strE)) {
            try {
                i = Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("UIHLH_CommonAutoTestToast", "showToastInfos NumberFormatException");
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i < 1) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        relativeLayout.setVisibility(0);
        SharedPreferenceManager.e(context, Integer.toString(10006), str2, "true", new StorageParams());
        return i;
    }

    private static boolean d(Context context, String str, RelativeLayout relativeLayout, String str2, String str3) {
        if ("true".equals(SharedPreferenceManager.e(context, Integer.toString(10006), str))) {
            relativeLayout.setVisibility(8);
            return true;
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv_bold);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv);
        if (!TextUtils.isEmpty(str2)) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str2);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView2.getLayoutParams();
        layoutParams.topMargin = (int) context.getResources().getDimension(R.dimen.hw_show_size_8_dp);
        healthTextView2.setLayoutParams(layoutParams);
        healthTextView2.setText(str3);
        return false;
    }

    public static void a(final Context context, final IBaseResponseCallback iBaseResponseCallback, final RelativeLayout relativeLayout, final String str, final String str2, final String str3, final int i) {
        ((LinearLayout) qsp.a(relativeLayout, R.id.toast_cancel_layout)).setOnClickListener(new View.OnClickListener() { // from class: qjy.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "cancelLayout");
                iBaseResponseCallback.a(100000, null);
                relativeLayout.setVisibility(8);
                SharedPreferenceManager.e(context, Integer.toString(10006), str3, "false", new StorageParams());
                qjy.c(context, str, str2, i);
            }
        });
        ((LinearLayout) qsp.a(relativeLayout, R.id.toast_try_layout)).setOnClickListener(new View.OnClickListener() { // from class: qjy.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "startLayout");
                iBaseResponseCallback.a(0, null);
                relativeLayout.setVisibility(8);
                SharedPreferenceManager.e(context, Integer.toString(10006), str3, "false", new StorageParams());
                qjy.c(context, str, str2, i);
            }
        });
    }

    public static void a(Context context, final IBaseResponseCallback iBaseResponseCallback, final RelativeLayout relativeLayout, String str, String str2) {
        HealthTextView healthTextView = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv_bold);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv);
        if (healthTextView == null) {
            qsl.b("showCommonTipLayout textContent == null", relativeLayout, R.id.toast_title_tv_bold);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
        b(true, relativeLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView2.getLayoutParams();
        layoutParams.topMargin = (int) context.getResources().getDimension(R.dimen.hw_show_size_8_dp);
        healthTextView2.setLayoutParams(layoutParams);
        healthTextView2.setText(str2);
        relativeLayout.setVisibility(0);
        ((LinearLayout) qsp.a(relativeLayout, R.id.toast_cancel_layout)).setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.toast_no_notice_layout);
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qjy.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "showBindWechatLayout click noticeLayout");
                relativeLayout.setVisibility(8);
                iBaseResponseCallback.a(100000, null);
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_try_layout);
        linearLayout2.setVisibility(0);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: qjy.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "showBindWechatLayout click startLayout");
                iBaseResponseCallback.a(0, null);
            }
        });
    }

    public static void e(final Context context, final IBaseResponseCallback iBaseResponseCallback, final RelativeLayout relativeLayout, String str, String str2) {
        HealthTextView healthTextView = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv_bold);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv);
        if (!TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
        b(true, relativeLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView2.getLayoutParams();
        layoutParams.topMargin = (int) context.getResources().getDimension(R.dimen.hw_show_size_8_dp);
        healthTextView2.setLayoutParams(layoutParams);
        healthTextView2.setText(str2);
        relativeLayout.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.toast_cancel_layout);
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qjy.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qjy.e(context, 3);
                LogUtil.a("UIHLH_CommonAutoTestToast", "showEcgServiceActiveLayout click cancel");
                relativeLayout.setVisibility(8);
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(100000, "onClick cancelLayout");
                }
            }
        });
        ((LinearLayout) qsp.a(relativeLayout, R.id.toast_no_notice_layout)).setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_try_layout);
        linearLayout2.setVisibility(0);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: qjy.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qjy.e(context, 2);
                LogUtil.a("UIHLH_CommonAutoTestToast", "showEcgServiceActiveLayout click start");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, "onClick startLayout");
                }
                relativeLayout.setVisibility(8);
            }
        });
        LogUtil.a("UIHLH_CommonAutoTestToast", "end showEcgServiceActiveLayout");
        e(context, 1);
    }

    public static void d(IBaseResponseCallback iBaseResponseCallback, RelativeLayout relativeLayout, String str, String str2, String str3) {
        LogUtil.a("UIHLH_CommonAutoTestToast", "showCommonTipLayout. ");
        if (str3 != null) {
            if ("true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "banner_do_not_ask_again_" + str3))) {
                relativeLayout.setVisibility(8);
                return;
            }
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv_bold);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv);
        if (healthTextView2 == null) {
            qsl.b("showCommonTipLayout textContent == null", relativeLayout, R.id.toast_title_tv);
            return;
        }
        if (healthTextView != null && !TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
        if (healthTextView2.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView2.getLayoutParams();
            layoutParams.topMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.hw_show_size_8_dp);
            healthTextView2.setLayoutParams(layoutParams);
            healthTextView2.setText(str2);
            d(iBaseResponseCallback, relativeLayout, str3);
            relativeLayout.setVisibility(0);
        }
    }

    public static void d(IBaseResponseCallback iBaseResponseCallback, RelativeLayout relativeLayout, String str, String str2, String str3, Object... objArr) {
        LogUtil.a("UIHLH_CommonAutoTestToast", "showCommonTipLayout. ");
        if (str3 != null) {
            if ("true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "banner_do_not_ask_again_" + str3))) {
                relativeLayout.setVisibility(8);
                return;
            }
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv_bold);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv);
        if (healthTextView2 == null) {
            qsl.b("showCommonTipLayout textContent == null", relativeLayout, R.id.toast_title_tv);
            return;
        }
        if (healthTextView != null && !TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
        if (healthTextView2.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView2.getLayoutParams();
            String str4 = String.format(str2, objArr);
            SpannableString spannableString = new SpannableString(str4);
            for (Object obj : objArr) {
                StyleSpan styleSpan = new StyleSpan(1);
                String string = obj.toString();
                int iIndexOf = str4.indexOf(string);
                spannableString.setSpan(styleSpan, iIndexOf, string.length() + iIndexOf, 33);
            }
            layoutParams.topMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.hw_show_size_8_dp);
            healthTextView2.setLayoutParams(layoutParams);
            healthTextView2.setText(spannableString);
            d(iBaseResponseCallback, relativeLayout, str3);
            relativeLayout.setVisibility(0);
        }
    }

    private static void d(final IBaseResponseCallback iBaseResponseCallback, final RelativeLayout relativeLayout, final String str) {
        LogUtil.a("UIHLH_CommonAutoTestToast", "commonTipSetClickEvent. ");
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.toast_cancel_layout);
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qjy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "showCommonTipLayout click cancel");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(100000, "onClick cancelLayout");
                }
                relativeLayout.setVisibility(8);
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_no_notice_layout);
        if (str != null) {
            linearLayout2.setVisibility(0);
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: qjy.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("UIHLH_CommonAutoTestToast", "showCommonTipLayout click cancel");
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(100000, "onClick cancelLayout");
                    }
                    relativeLayout.setVisibility(8);
                    SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "banner_do_not_ask_again_" + str, "true", new StorageParams());
                }
            });
        } else {
            linearLayout2.setVisibility(8);
        }
        b(str == null, relativeLayout);
        LinearLayout linearLayout3 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_try_layout);
        linearLayout3.setVisibility(0);
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: qjy.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CommonAutoTestToast", "showCommonTipLayout click start");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, "onClick startLayout");
                }
                relativeLayout.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("dialogType", 2);
        String strValue = AnalyticsValue.ECG_DIALOG_SHOW_COUNT.value();
        lmf.d().c(context, strValue, map, 0);
        LogUtil.a("UIHLH_CommonAutoTestToast", "BI ecg banner, value: ", strValue, ", typeMap: ", map.toString());
    }

    public static void e(RelativeLayout relativeLayout, IBaseResponseCallback iBaseResponseCallback, Context context, String str, String str2) {
        LogUtil.a("UIHLH_CommonAutoTestToast", "noticeLayout");
        relativeLayout.setVisibility(8);
        iBaseResponseCallback.a(100000, null);
        SharedPreferenceManager.e(context, Integer.toString(10006), str, "true", new StorageParams());
        SharedPreferenceManager.e(context, Integer.toString(10006), str2, "false", new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final int i, final RelativeLayout relativeLayout, final Context context, final String str, final IBaseResponseCallback iBaseResponseCallback, final String str2, final String str3, final String str4) {
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.toast_no_notice_layout);
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_try_layout);
        LinearLayout linearLayout3 = (LinearLayout) qsp.a(relativeLayout, R.id.toast_cancel_layout);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: qjy.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("UIHLH_CommonAutoTestToast", "click no again notice , ", str);
                    qjy.d(str, "1", context);
                    relativeLayout.setVisibility(8);
                    iBaseResponseCallback.a(100000, null);
                    SharedPreferenceManager.e(context, Integer.toString(10006), str, "true", new StorageParams());
                    SharedPreferenceManager.e(context, Integer.toString(10006), str2, "false", new StorageParams());
                    qjy.c(context, str3, str4, i);
                }
            });
        }
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: qjy.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("UIHLH_CommonAutoTestToast", "click cancel , ", str);
                    qjy.d(str, "0", context);
                    iBaseResponseCallback.a(100000, null);
                    relativeLayout.setVisibility(8);
                    SharedPreferenceManager.e(context, Integer.toString(10006), str2, "false", new StorageParams());
                    qjy.c(context, str3, str4, i);
                }
            });
        }
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: qjy.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("UIHLH_CommonAutoTestToast", "click open , ", str);
                    qjy.d(str, "2", context);
                    iBaseResponseCallback.a(0, null);
                    relativeLayout.setVisibility(8);
                    SharedPreferenceManager.e(context, Integer.toString(10006), str2, "false", new StorageParams());
                    qjy.c(context, str3, str4, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final String str, final Context context, final RelativeLayout relativeLayout) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: qjy.8
                @Override // java.lang.Runnable
                public void run() {
                    qjy.e(str, context, relativeLayout);
                }
            });
        } else {
            qsp.b((HealthTextView) qsp.a(relativeLayout, R.id.toast_title_tv), str);
        }
    }

    public static void b(boolean z, RelativeLayout relativeLayout) {
        LinearLayout linearLayout = (LinearLayout) qsp.a(relativeLayout, R.id.button_layout);
        boolean z2 = z || MLAsrConstants.LAN_ZH.equalsIgnoreCase(CommonUtil.u());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (z2) {
            layoutParams.addRule(21);
            linearLayout.setOrientation(0);
        } else {
            layoutParams.addRule(20);
            linearLayout.setOrientation(1);
        }
        linearLayout.setLayoutParams(layoutParams);
    }
}
