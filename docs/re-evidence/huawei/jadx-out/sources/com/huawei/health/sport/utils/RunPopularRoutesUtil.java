package com.huawei.health.sport.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.servicesui.R;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddv;
import defpackage.lmf;
import defpackage.qre;
import defpackage.qri;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class RunPopularRoutesUtil {

    public interface DialogCallBack {
        void goNext();

        void notGoNext();
    }

    public static void e(Context context) {
        context.getSharedPreferences("popularRoutes_sharedpreference_msg", 0).edit().putBoolean("enter_popular_routes", true).commit();
    }

    public static boolean c(Context context) {
        return context.getSharedPreferences("popularRoutes_sharedpreference_msg", 0).getBoolean("enter_popular_routes", false);
    }

    public static void e(final Context context, final int i, final DialogCallBack dialogCallBack) {
        if (c(context)) {
            dialogCallBack.goNext();
            return;
        }
        LogUtil.a("RunPopularRoutesUtil", "showFirstPopularRoutesDialog enter");
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).a(View.inflate(context, R.layout.dialog_first_popular_routes_tip, null)).a(R.string.IDS_device_release_user_profile_log_collect_cancel, new DialogInterface.OnClickListener() { // from class: hak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RunPopularRoutesUtil.e(dialogCallBack, i, dialogInterface, i2);
            }
        }).d(R.string.IDS_device_release_user_profile_log_collect_agree, new DialogInterface.OnClickListener() { // from class: hag
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RunPopularRoutesUtil.b(context, dialogCallBack, i, dialogInterface, i2);
            }
        }).b();
        HealthTextView healthTextView = (HealthTextView) customAlertDialogB.findViewById(R.id.third);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_hw_routes_dialog_permission, qre.f(R.string.IDS_hw_routes_dialog_permission_run)));
        qri.e(spannableString, qre.f(R.string.IDS_hw_routes_dialog_permission_run), R.string.textFontFamilyMedium);
        qri.b(spannableString, qre.f(R.string.IDS_hw_routes_dialog_permission_run), R.color.textColorPrimary);
        healthTextView.setText(spannableString);
        HealthButton healthButton = (HealthButton) customAlertDialogB.findViewById(R.id.dialog_btn_positive);
        if (!Utils.o()) {
            healthButton.setTextColor(context.getResources().getColor(R.color.hwbutton_selector_text_emphasize_emui, null));
            healthButton.setBackgroundResource(R.drawable.button_background_emphasize);
        }
        ((HealthButtonBarLayout) customAlertDialogB.findViewById(R.id.button_bar)).setDividerDrawable(context.getResources().getDrawable(R.drawable.custom_dialog_divider_vertical_trusparent, null));
        customAlertDialogB.setCancelable(false);
        if (customAlertDialogB.isShowing()) {
            return;
        }
        c(0, i);
        customAlertDialogB.show();
    }

    public static /* synthetic */ void e(DialogCallBack dialogCallBack, int i, DialogInterface dialogInterface, int i2) {
        LogUtil.a("RunPopularRoutesUtil", "showFirstPopularRoutesDialog click cancel");
        dialogCallBack.notGoNext();
        c(1, i);
    }

    public static /* synthetic */ void b(Context context, DialogCallBack dialogCallBack, int i, DialogInterface dialogInterface, int i2) {
        LogUtil.a("RunPopularRoutesUtil", "showFirstPopularRoutesDialog click agree");
        e(context);
        dialogCallBack.goNext();
        c(2, i);
    }

    private static void c(int i, int i2) {
        if (i2 < 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        lmf.d().c(BaseApplication.b(), "1040078", map, 0);
    }

    public static void b(Context context, int i, HotPathCityInfo hotPathCityInfo) {
        LogUtil.a("RunPopularRoutesUtil", "Enter jumpToRouteList");
        if (context == null) {
            LogUtil.j("RunPopularRoutesUtil", "jumpToRouteList fail: context is null");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SportRouteService", ddv.b().getCommonJsModule("SportRouteService")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device"));
        builder.setImmerse();
        builder.showStatusBar();
        String str = "#/route-query-list?sportType=" + i;
        if (hotPathCityInfo != null) {
            str = str + "&cityId=" + hotPathCityInfo.getCityId() + "&cityName=" + hotPathCityInfo.getCityName();
            GpsPoint cityCenter = hotPathCityInfo.getCityCenter();
            if (cityCenter != null) {
                str = str + "&latitude=" + cityCenter.getLatitude() + "&longitude=" + cityCenter.getLongitude();
            }
        }
        builder.addPath(str);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sports-path", builder);
    }
}
