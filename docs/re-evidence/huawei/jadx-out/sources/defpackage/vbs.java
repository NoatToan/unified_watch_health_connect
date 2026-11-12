package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class vbs {
    static /* synthetic */ void b(View view) {
    }

    public static void d(dnj dnjVar, HealthTextView healthTextView, ImageView imageView) {
        if (dnjVar == null || imageView == null) {
            LogUtil.a("BaseHealthViewsUtils", "setUserNameAndPhotoForList: user or headPhotoView is null");
            return;
        }
        if (healthTextView != null) {
            String strH = dnjVar.h();
            if (LanguageUtil.ba(BaseApplication.getContext()) && !TextUtils.isEmpty(strH) && (StringUtils.b(strH) || StringUtils.d(strH))) {
                healthTextView.setTextDirection(3);
            }
            healthTextView.setText(strH);
        }
        imageView.setImageBitmap(null);
        imageView.setImageResource(0);
        if (dnjVar.m() == -1) {
            imageView.setImageResource(R.drawable.health_spineer_setting_selector);
            return;
        }
        if (!TextUtils.isEmpty(dnjVar.b())) {
            c(dnjVar.b(), imageView, dnjVar);
        } else if (dnjVar.k() == null) {
            imageView.setImageDrawable(qlo.b(BaseApplication.getContext().getResources(), new qlo.e(null, dnjVar.i(), true)));
        } else {
            imageView.setImageBitmap(qlo.d(dnjVar.k(), true));
        }
    }

    private static void c(String str, ImageView imageView, dnj dnjVar) {
        if (imageView == null || dnjVar == null) {
            LogUtil.e("BaseHealthViewsUtils", "setUserPhotoForList: headPhotoView or user is null");
            return;
        }
        if (!"default".equals(str)) {
            Bitmap bitmapA = qqf.a(BaseApplication.getContext(), str);
            if (bitmapA != null) {
                imageView.setImageBitmap(qlo.d(bitmapA, true));
                return;
            }
            return;
        }
        imageView.setImageDrawable(qlo.b(BaseApplication.getContext().getResources(), new qlo.e(null, dnjVar.i(), true)));
    }

    public static void a(Context context, int i, final IBaseResponseCallback iBaseResponseCallback) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_healthdata_weight_userinfo_dialog_set, (ViewGroup) null);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.weight_number_picker_v9);
        ArrayList<String> arrayListA = a(context);
        healthNumberPicker.setDisplayedValues((String[]) arrayListA.toArray(new String[arrayListA.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayListA.size() - 1);
        if (i >= 50) {
            int i2 = i - 50;
            LogUtil.d("BaseHealthViewsUtils", "mHiUserInfo.getHeight() = ", Integer.valueOf(i2));
            healthNumberPicker.setValue(i2);
        } else {
            healthNumberPicker.setValue(110);
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.b(R.string.IDS_hw_show_set_height).d(viewInflate).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: vbs.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("BaseHealthViewsUtils", "get hselect =", Integer.valueOf(healthNumberPicker.getValue()));
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    return;
                }
                iBaseResponseCallback2.a(0, Integer.valueOf(healthNumberPicker.getValue()));
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: vbs.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d().show();
    }

    public static void a(Context context, dnj dnjVar, int i, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null) {
            LogUtil.j("showHeightInchDialog() context is null", new Object[0]);
            return;
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.health_healthdata_userinfo_dialog_inch_height_v9, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.height_ft_number_picker_v9);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_dialog_tips)).setVisibility(8);
        String[] strArr = new String[8];
        int i2 = 0;
        while (i2 < 8) {
            StringBuilder sb = new StringBuilder();
            int i3 = i2 + 1;
            sb.append(UnitUtil.e(i3, 1, 0));
            sb.append(" ");
            sb.append(context.getString(R.string.IDS_ft));
            strArr[i2] = sb.toString();
            i2 = i3;
        }
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(7);
        HealthNumberPicker healthNumberPicker2 = (HealthNumberPicker) viewInflate.findViewById(R.id.height_inch_number_picker_v9);
        String[] strArr2 = new String[12];
        for (int i4 = 0; i4 < 12; i4++) {
            strArr2[i4] = UnitUtil.e(i4, 1, 0) + " " + context.getString(R.string.IDS_ins);
        }
        healthNumberPicker2.setDisplayedValues(strArr2);
        healthNumberPicker2.setMinValue(0);
        healthNumberPicker2.setMaxValue(11);
        int[] iArrG = {5, 3};
        if (dnjVar != null && i > 30) {
            iArrG = UnitUtil.g(((double) i) / 100.0d);
        }
        healthNumberPicker.setValue(iArrG[0] - 1);
        healthNumberPicker2.setValue(iArrG[1]);
        b(context, iBaseResponseCallback, viewInflate, healthNumberPicker, healthNumberPicker2);
    }

    private static void b(Context context, final IBaseResponseCallback iBaseResponseCallback, View view, final HealthNumberPicker healthNumberPicker, final HealthNumberPicker healthNumberPicker2) {
        String string = context.getString(R.string.IDS_hw_show_set_height);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.a(string).d(view).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: vbs.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(1, new int[]{healthNumberPicker.getValue() + 1, healthNumberPicker2.getValue()});
                    return;
                }
                LogUtil.j("BaseHealthViewsUtils", "call back is null");
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: vbs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        builder.d().show();
    }

    private static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>(31);
        for (int i = 50; i < 251; i++) {
            arrayList.add(context.getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(i, 1, 0)));
        }
        return arrayList;
    }

    public static boolean a(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = calendar.get(2) + 1;
        int i6 = calendar.get(5);
        boolean z = i > i4;
        if (i == i4 && i2 > i5) {
            z = true;
        }
        if (i == i4 && i2 == i5 && i3 > i6) {
            return true;
        }
        return z;
    }

    public static boolean b(int i, int i2, int i3) {
        int i4 = i + 18;
        Calendar calendar = Calendar.getInstance();
        int i5 = calendar.get(1);
        int i6 = calendar.get(2);
        int i7 = calendar.get(5);
        if (i4 < i5) {
            return false;
        }
        if (i4 != i5 || i2 >= i6) {
            return (i4 == i5 && i2 == i6 && i3 + 1 <= i7) ? false : true;
        }
        return false;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(context.getString(R.string.IDS_hwh_home_overall_target_calculation)).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: vbt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vbs.b(view);
            }
        });
        builder.c().show();
    }
}
