package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.AndroidRuntimeException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionConstant;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class imx {
    static /* synthetic */ void c(View view) {
    }

    private static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (1 == i) {
            return 0;
        }
        return i;
    }

    static /* synthetic */ void d(DialogInterface dialogInterface, int i) {
    }

    static /* synthetic */ void e(DialogInterface dialogInterface, int i) {
    }

    static /* synthetic */ void e(View view) {
    }

    public static void d(Activity activity, UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback) {
        e(activity, userInfomation, iBaseResponseCallback, false);
    }

    public static void e(Activity activity, final UserInfomation userInfomation, final IBaseResponseCallback iBaseResponseCallback, boolean z) {
        if (activity == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "activity param null");
            return;
        }
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.health_healthdata_userinfo_dialog_set, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_dialog_tips_userinfo);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.userinfo_number_picker_v9);
        healthTextView.setText(activity.getString(R.string.IDS_hwh_user_data_weight_tips));
        ArrayList<String> arrayListC = c(z);
        healthNumberPicker.setDisplayedValues((String[]) arrayListC.toArray(new String[arrayListC.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayListC.size() - 1);
        if (z) {
            c(userInfomation, healthNumberPicker);
        } else {
            d(userInfomation, healthNumberPicker, UnitUtil.f());
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activity);
        builder.b(activity.getString(R.string.IDS_hw_health_show_healthdata_weight)).a(viewInflate).d(R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: inc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                imx.a(iBaseResponseCallback, userInfomation, healthNumberPicker, dialogInterface, i);
            }
        }).a(R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: ind
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                imx.e(dialogInterface, i);
            }
        });
        builder.b().show();
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, UserInfomation userInfomation, HealthNumberPicker healthNumberPicker, DialogInterface dialogInterface, int i) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "callback is null");
            return;
        }
        if (e()) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        float value = healthNumberPicker.getValue() / 10.0f;
        Float.valueOf(value).getClass();
        userInfomation.setWeight(value);
        iBaseResponseCallback.a(1, userInfomation);
    }

    private static void c(UserInfomation userInfomation, HealthNumberPicker healthNumberPicker) {
        int iE = UnitUtil.e();
        if (iE != 1) {
            d(userInfomation, healthNumberPicker, iE == 3);
        } else if (userInfomation != null && Math.round(UnitUtil.j(userInfomation.getWeight())) >= UnitUtil.j(10.0d)) {
            LogUtil.d("UIME_UserInfoActivityUtil", "CATTY userInfomation.getWeight()=", Float.valueOf(userInfomation.getWeight()));
            healthNumberPicker.setValue((int) (Math.round(UnitUtil.j(userInfomation.getWeight())) - UnitUtil.j(10.0d)));
        } else {
            healthNumberPicker.setValue((int) UnitUtil.j(70.0d));
        }
    }

    private static void d(UserInfomation userInfomation, HealthNumberPicker healthNumberPicker, boolean z) {
        if (z) {
            if (userInfomation != null && ((int) Math.round(UnitUtil.h(userInfomation.getWeight()))) >= 22) {
                LogUtil.d("UIME_UserInfoActivityUtil", "LB userInfomation.getWeight()=", Float.valueOf(userInfomation.getWeight()));
                healthNumberPicker.setValue(((int) Math.round(UnitUtil.h(userInfomation.getWeight() * 10.0f))) - 220);
                return;
            } else {
                healthNumberPicker.setValue((int) UnitUtil.h(700.0d));
                return;
            }
        }
        if (userInfomation != null && Math.round(userInfomation.getWeight()) >= 10) {
            LogUtil.d("UIME_UserInfoActivityUtil", "userInfomation.getWeight()=", Float.valueOf(userInfomation.getWeight()));
            healthNumberPicker.setValue(Math.round(userInfomation.getWeight() * 10.0f) - 100);
        } else {
            healthNumberPicker.setValue(700);
        }
    }

    public static void c(Activity activity, final UserInfomation userInfomation, final IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "showHeightDialog activity param is null");
            return;
        }
        if (UnitUtil.f()) {
            b(activity, userInfomation, iBaseResponseCallback);
            return;
        }
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.health_healthdata_userinfo_dialog_set, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_dialog_tips_userinfo);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.userinfo_number_picker_v9);
        healthTextView.setText(activity.getString(R.string.IDS_hwh_user_data_height_tips));
        ArrayList<String> arrayListA = a();
        healthNumberPicker.setDisplayedValues((String[]) arrayListA.toArray(new String[arrayListA.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayListA.size() - 1);
        if (userInfomation != null && userInfomation.getHeight() >= 50) {
            LogUtil.d("UIME_UserInfoActivityUtil", "userInfomation.getHeight()=", Integer.valueOf(userInfomation.getHeight()));
            healthNumberPicker.setValue(userInfomation.getHeight() - 50);
        } else {
            healthNumberPicker.setValue(110);
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activity);
        builder.b(activity.getString(R.string.IDS_hw_show_set_height)).a(viewInflate).d(R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: ine
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                imx.d(iBaseResponseCallback, userInfomation, healthNumberPicker, dialogInterface, i);
            }
        }).a(R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: ink
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                imx.d(dialogInterface, i);
            }
        });
        builder.b().show();
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, UserInfomation userInfomation, HealthNumberPicker healthNumberPicker, DialogInterface dialogInterface, int i) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "callback is null");
            return;
        }
        if (e()) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        int value = healthNumberPicker.getValue();
        Integer.valueOf(value).getClass();
        userInfomation.setHeight(value);
        iBaseResponseCallback.a(0, userInfomation);
    }

    private static void b(Activity activity, final UserInfomation userInfomation, final IBaseResponseCallback iBaseResponseCallback) {
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.health_healthdata_userinfo_dialog_inch_height_v9, (ViewGroup) null);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.height_ft_number_picker_v9);
        String[] strArr = new String[8];
        int i = 0;
        while (i < 8) {
            StringBuilder sb = new StringBuilder();
            int i2 = i + 1;
            sb.append(UnitUtil.e(i2, 1, 0));
            sb.append(" ");
            sb.append(activity.getResources().getString(R.string.IDS_ft));
            strArr[i] = sb.toString();
            i = i2;
        }
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(7);
        final HealthNumberPicker healthNumberPicker2 = (HealthNumberPicker) viewInflate.findViewById(R.id.height_inch_number_picker_v9);
        String[] strArr2 = new String[12];
        for (int i3 = 0; i3 < 12; i3++) {
            strArr2[i3] = UnitUtil.e(i3, 1, 0) + " " + activity.getResources().getString(R.string.IDS_ins);
        }
        healthNumberPicker2.setDisplayedValues(strArr2);
        healthNumberPicker2.setMinValue(0);
        healthNumberPicker2.setMaxValue(11);
        int[] iArr = {5, 7};
        if (userInfomation != null && userInfomation.getHeight() > 30) {
            int[] iArrG = UnitUtil.g(new BigDecimal(userInfomation.getHeight()).divide(new BigDecimal(100), 2, 4).doubleValue());
            if (iArrG[0] > 0 && iArrG[1] >= 0) {
                iArr = iArrG;
            }
        }
        healthNumberPicker.setValue(iArr[0] - 1);
        healthNumberPicker2.setValue(iArr[1]);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activity);
        builder.a(activity.getString(R.string.IDS_hw_show_set_height)).d(viewInflate).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: ing
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                imx.a(userInfomation, iBaseResponseCallback, healthNumberPicker, healthNumberPicker2);
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: inf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                imx.e(view);
            }
        });
        builder.d().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback, HealthNumberPicker healthNumberPicker, HealthNumberPicker healthNumberPicker2) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "handlePositiveEvent callback is null");
            return;
        }
        if (e()) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        userInfomation.setHeight((int) Math.rint((UnitUtil.c(healthNumberPicker.getValue() + 1, 1) * 100.0d) + UnitUtil.c(healthNumberPicker2.getValue(), 0)));
        iBaseResponseCallback.a(0, userInfomation);
    }

    public static boolean e() {
        if (CommonUtil.ca() || !Utils.h()) {
            return false;
        }
        return !CommonUtil.ab(BaseApplication.getContext());
    }

    private static ArrayList<String> c(boolean z) {
        Context context = BaseApplication.getContext();
        ArrayList<String> arrayList = new ArrayList<>();
        if (z) {
            b(context, arrayList);
            return arrayList;
        }
        d(context, arrayList, UnitUtil.f());
        return arrayList;
    }

    private static void b(Context context, ArrayList<String> arrayList) {
        int iE = UnitUtil.e();
        if (iE == 1) {
            int iJ = (int) UnitUtil.j(10.0d);
            while (true) {
                double d = iJ;
                if (d > UnitUtil.j(250.0d)) {
                    return;
                }
                arrayList.add(context.getResources().getQuantityString(R.plurals.IDS_health_catty, UnitUtil.e(d), UnitUtil.e(d, 1, 0)));
                iJ++;
            }
        } else {
            d(context, arrayList, iE == 3);
        }
    }

    private static void d(Context context, ArrayList<String> arrayList, boolean z) {
        if (z) {
            for (double d = 22.0d; d <= 552.0d; d += 0.1d) {
                arrayList.add(context.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(d, 1, 1)));
            }
            return;
        }
        for (double d2 = 10.0d; d2 <= 250.0d; d2 += 0.1d) {
            arrayList.add(context.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(d2, 1, 1)));
        }
    }

    private static ArrayList<String> a() {
        Context context = BaseApplication.getContext();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 50; i <= 250; i++) {
            arrayList.add(context.getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(i, 1, 0)));
        }
        return arrayList;
    }

    public static void e(Activity activity, int i, int i2, int i3, final IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "activity param null");
            return;
        }
        if (i <= 0) {
            i = 1992;
            i2 = 0;
            i3 = 1;
        }
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(activity, new HealthDatePickerDialog.DateSelectedListener() { // from class: inl
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public final void onDateSelected(int i4, int i5, int i6) {
                imx.b(iBaseResponseCallback, i4, i5, i6);
            }
        }, new GregorianCalendar(i, i2, i3));
        int i4 = Calendar.getInstance().get(1);
        healthDatePickerDialog.e(i4 - 150, i4);
        healthDatePickerDialog.show();
    }

    static /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, int i2, int i3) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "callback is null");
            return;
        }
        if (e()) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        String str = i + String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2 + 1)) + String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.setBirthday(str);
        iBaseResponseCallback.a(3, userInfomation);
    }

    public static void d(Activity activity, int i, UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback) {
        if (activity == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "activity param null");
            return;
        }
        if (activity.getSystemService("layout_inflater") instanceof LayoutInflater) {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.hw_show_settings_gender_view, (ViewGroup) null);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activity);
            builder.a(activity.getString(R.string.IDS_hw_show_set_gender)).d(viewInflate).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: inb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    imx.c(view);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            if (iBaseResponseCallback == null) {
                LogUtil.j("UIME_UserInfoActivityUtil", "callback is null");
            } else if (e()) {
                iBaseResponseCallback.a(-1, null);
            } else {
                c(viewInflate, i, customViewDialogD, userInfomation, iBaseResponseCallback);
                customViewDialogD.show();
            }
        }
    }

    private static void c(View view, final int i, final CustomViewDialog customViewDialog, final UserInfomation userInfomation, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("UIME_UserInfoActivityUtil", "initializeGenderDialogLayout()");
        final HealthRadioButton healthRadioButton = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview1);
        final HealthRadioButton healthRadioButton2 = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview2);
        final HealthRadioButton healthRadioButton3 = (HealthRadioButton) view.findViewById(R.id.settings_gender_secrect);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout1);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout2);
        RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout_secrect);
        HealthDivider healthDivider = (HealthDivider) view.findViewById(R.id.gender_picker_divide_line2);
        if (i == 19) {
            healthDivider.setVisibility(8);
            relativeLayout3.setVisibility(8);
        } else {
            healthDivider.setVisibility(0);
            relativeLayout3.setVisibility(0);
        }
        e(d(userInfomation.getGender()), healthRadioButton, healthRadioButton2, healthRadioButton3, i);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: inj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                imx.c(healthRadioButton, healthRadioButton2, healthRadioButton3, userInfomation, iBaseResponseCallback, i, customViewDialog, view2);
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: inh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                imx.e(healthRadioButton, healthRadioButton2, healthRadioButton3, userInfomation, iBaseResponseCallback, i, customViewDialog, view2);
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: ini
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                imx.d(healthRadioButton, healthRadioButton2, healthRadioButton3, userInfomation, iBaseResponseCallback, i, customViewDialog, view2);
            }
        });
    }

    static /* synthetic */ void c(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback, int i, CustomViewDialog customViewDialog, View view) {
        healthRadioButton.setChecked(true);
        healthRadioButton2.setChecked(false);
        healthRadioButton3.setChecked(false);
        userInfomation.setGender(1);
        iBaseResponseCallback.a(i, userInfomation);
        customViewDialog.dismiss();
    }

    static /* synthetic */ void e(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback, int i, CustomViewDialog customViewDialog, View view) {
        healthRadioButton.setChecked(false);
        healthRadioButton2.setChecked(true);
        healthRadioButton3.setChecked(false);
        userInfomation.setGender(0);
        iBaseResponseCallback.a(i, userInfomation);
        customViewDialog.dismiss();
    }

    static /* synthetic */ void d(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback, int i, CustomViewDialog customViewDialog, View view) {
        healthRadioButton.setChecked(false);
        healthRadioButton2.setChecked(false);
        healthRadioButton3.setChecked(true);
        userInfomation.setGender(2);
        iBaseResponseCallback.a(i, userInfomation);
        customViewDialog.dismiss();
    }

    private static void e(int i, HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, HealthRadioButton healthRadioButton3, int i2) {
        if (i == 0) {
            healthRadioButton.setChecked(false);
            healthRadioButton2.setChecked(true);
            healthRadioButton3.setChecked(false);
            return;
        }
        if (i == 1) {
            healthRadioButton.setChecked(true);
            healthRadioButton2.setChecked(false);
            healthRadioButton3.setChecked(false);
        } else if (i == 2) {
            healthRadioButton.setChecked(false);
            healthRadioButton2.setChecked(false);
            healthRadioButton3.setChecked(true);
        } else if (i2 == 19) {
            healthRadioButton.setChecked(false);
            healthRadioButton2.setChecked(false);
        } else {
            healthRadioButton.setChecked(true);
            healthRadioButton2.setChecked(false);
            healthRadioButton3.setChecked(false);
        }
    }

    public static String d(Context context, int i) {
        String string = context.getResources().getString(R.string.IDS_hw_me_userinfo_not_set);
        if (i <= 0) {
            LogUtil.j("UIME_UserInfoActivityUtil", "height invalid");
            return string;
        }
        if (UnitUtil.f()) {
            LogUtil.a("UIME_UserInfoActivityUtil", "enter UNIT_IMPERIAL");
            int[] iArrG = {5, 7};
            if (i > 30) {
                iArrG = UnitUtil.g(((double) i) / 100.0d);
            }
            return UnitUtil.e(iArrG[0], 1, 0) + " " + context.getResources().getString(R.string.IDS_ft) + " " + UnitUtil.e(iArrG[1], 1, 0) + " " + context.getResources().getString(R.string.IDS_ins);
        }
        LogUtil.a("UIME_UserInfoActivityUtil", "enter UNIT_CM_KG");
        return context.getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(i, 1, 0));
    }

    public static String e(Context context, float f) {
        String string = context.getResources().getString(R.string.IDS_hw_me_userinfo_not_set);
        if (f <= 0.0f) {
            return string;
        }
        if (UnitUtil.f()) {
            LogUtil.a("UIME_UserInfoActivityUtil", "enter UNIT_IMPERIAL");
            return context.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(UnitUtil.h(f), 1, 1));
        }
        LogUtil.a("UIME_UserInfoActivityUtil", "enter UNIT_CM_KG");
        return context.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(CommonUtil.a(String.valueOf(f)), 1, 1));
    }

    public static String c(Context context, String str) {
        String string = context.getResources().getString(R.string.IDS_hw_me_userinfo_not_set);
        try {
            int i = Integer.parseInt(str);
            if (i <= 0) {
                return string;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(i / 10000, ((i % 10000) / 100) - 1, i % 100);
            return UnitUtil.a(calendar.getTime(), 20);
        } catch (NumberFormatException unused) {
            LogUtil.j("UIME_UserInfoActivityUtil", "parse birthday error");
            return string;
        }
    }

    public static void a(Context context) {
        qpx.e(context, R.string.IDS_network_connect_error);
    }

    public static void a(Activity activity) {
        if (activity == null) {
            LogUtil.j("UIME_UserInfoActivityUtil", "activity param null");
            return;
        }
        if (!HuaweiLoginManager.checkIsInstallHuaweiAccount(activity)) {
            LogUtil.j("UIME_UserInfoActivityUtil", "checkIsInstallHuaweiAccount is false");
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwid://com.huawei.hwid/AccountDetail"));
            intent.setPackage(HMSPackageManager.getInstance(activity).getHMSPackageName());
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("UIME_UserInfoActivityUtil", "HMS Not Installed");
        } catch (AndroidRuntimeException e) {
            LogUtil.e("UIME_UserInfoActivityUtil", "AndroidRuntimeException: Activity start fail - " + e.getMessage());
        } catch (IllegalArgumentException e2) {
            LogUtil.e("UIME_UserInfoActivityUtil", "exception getClassName:" + e2.getClass().getSimpleName());
        }
    }

    public static void d(final Context context) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_emergency_dialog_message).a(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: imx.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_UserInfoActivityUtil", "showEmergencyChangeDialog cancel click");
            }
        }).c(R.string.IDS_hw_watchface_go_hms_install, new View.OnClickListener() { // from class: imx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_UserInfoActivityUtil", "showEmergencyChangeDialog ok click");
                imx.c(context);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        LogUtil.a("UIME_UserInfoActivityUtil", "enterEditEmergencyContact enter");
        Intent intent = new Intent();
        try {
            intent.setClassName(FallDetectionConstant.PACKAGE_NAME, FallDetectionConstant.CLASS_NAME);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("UIME_UserInfoActivityUtil", "enterEditEmergencyContact Emui110 activityNotFoundException SOS");
        }
    }
}
