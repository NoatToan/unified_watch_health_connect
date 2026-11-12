package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
public class hwg {
    private static Calendar a(IntPlan intPlan) {
        Calendar calendar = Calendar.getInstance();
        if (intPlan != null) {
            SparseArray<IntDayPlan> sparseArrayH = hvu.h(intPlan);
            int size = sparseArrayH.size();
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArrayH.keyAt(i);
                if (iKeyAt > iA && btw.c(sparseArrayH.get(iKeyAt)) == 2) {
                    calendar.setTimeInMillis(DateFormatUtil.d(iKeyAt));
                }
            }
        }
        return calendar;
    }

    public static CustomAlertDialog d(Context context, IntPlan intPlan, ResponseCallback<Object> responseCallback) {
        Calendar calendarA;
        SparseArray<IntDayPlan> sparseArrayH = hvu.h(intPlan);
        int iC = btw.c(sparseArrayH.get(DateFormatUtil.a(System.currentTimeMillis())));
        Context contextB = BaseApplication.b();
        Calendar calendar = null;
        View viewInflate = View.inflate(contextB, R.layout.dialog_plan_adjust, null);
        boolean zBa = LanguageUtil.ba(contextB);
        Calendar calendar2 = Calendar.getInstance();
        int i = 2;
        if (iC == 0) {
            viewInflate.findViewById(R.id.dialog_plan_adjust_rest_divider).setVisibility(0);
            d((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_adjust_rest_arrow), zBa);
            a(viewInflate.findViewById(R.id.dialog_plan_adjust_rest), responseCallback, 1, hvu.a(sparseArrayH, 1) > 0 ? calendar2 : null);
            if (hvu.a(sparseArrayH, 0) > 0) {
                calendar = calendar2;
            }
        } else {
            if (iC == 1) {
                viewInflate.findViewById(R.id.dialog_plan_adjust_train_divider).setVisibility(0);
                d((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_adjust_train_arrow), zBa);
                a(viewInflate.findViewById(R.id.dialog_plan_adjust_train), responseCallback, 0, calendar2);
                calendar = hvu.a(sparseArrayH, 0) > 0 ? calendar2 : null;
                ((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_adjust_train_icon)).setImageDrawable(qqz.c(contextB, R.drawable.icon_status_train));
            } else if (iC == 2) {
                HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_date);
                healthTextView.setVisibility(0);
                calendarA = a(intPlan);
                healthTextView.setText(qre.a(R.string.IDS_leave_date, UnitUtil.e(calendarA, 24)));
                i = 3;
            } else {
                ReleaseLogUtil.d("R_PlanAdjustUtil", "getAdjustDialog dayStatus ", Integer.valueOf(iC));
                return null;
            }
            d((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_arrow), zBa);
            a(viewInflate.findViewById(R.id.dialog_plan_adjust_leave), responseCallback, i, calendarA);
            d((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_week_adjust_arrow), zBa);
            a(viewInflate.findViewById(R.id.dialog_plan_week_adjust), responseCallback, 4, calendarA);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
            builder.d(R.string.IDS_plan_adjust);
            builder.a(viewInflate).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: hwl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    LogUtil.b("R_PlanAdjustUtil", "getAdjustDialog dialog ", dialogInterface, " which ", Integer.valueOf(i2));
                }
            });
            return builder.b();
        }
        calendarA = calendar;
        d((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_arrow), zBa);
        a(viewInflate.findViewById(R.id.dialog_plan_adjust_leave), responseCallback, i, calendarA);
        d((HealthImageView) viewInflate.findViewById(R.id.dialog_plan_week_adjust_arrow), zBa);
        a(viewInflate.findViewById(R.id.dialog_plan_week_adjust), responseCallback, 4, calendarA);
        CustomAlertDialog.Builder builder2 = new CustomAlertDialog.Builder(context);
        builder2.d(R.string.IDS_plan_adjust);
        builder2.a(viewInflate).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: hwl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LogUtil.b("R_PlanAdjustUtil", "getAdjustDialog dialog ", dialogInterface, " which ", Integer.valueOf(i2));
            }
        });
        return builder2.b();
    }

    private static void d(HealthImageView healthImageView, boolean z) {
        Drawable drawable;
        Context contextB = BaseApplication.b();
        if (z) {
            drawable = qqz.e(contextB, R.drawable.ic_plan_arrow_right);
        } else {
            drawable = ContextCompat.getDrawable(contextB, R.drawable.ic_plan_arrow_right);
        }
        healthImageView.setImageDrawable(drawable);
    }

    private static void a(View view, final ResponseCallback<Object> responseCallback, final int i, final Object obj) {
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: hwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hwg.d(responseCallback, i, obj, view2);
            }
        });
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, int i, Object obj, View view) {
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(i, obj);
    }

    private static String c(int i) {
        return e(i, false);
    }

    private static String e(int i, boolean z) {
        double d = i;
        return qre.e(z ? R.plurals.IDS_leave_train_day : R.plurals.IDS_train_day, UnitUtil.e(d), UnitUtil.e(d, 1, 0));
    }

    private static void b(HealthTextView healthTextView, HealthTextView healthTextView2, int i) {
        if (i == 1 || i == 2) {
            String strA = qre.a(R.string.IDS_leave_today_title, qre.f(R.string.IDS_plan_reduction));
            SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_leave_today, strA));
            int iIndexOf = spannableString.toString().indexOf(strA);
            if (iIndexOf >= 0) {
                int length = strA.length() + iIndexOf;
                spannableString.setSpan(new TextAppearanceSpan(BaseApplication.b(), R.style.list_text_title_second), iIndexOf, length, 17);
                spannableString.setSpan(new qli(qrr.e()), iIndexOf, length, 17);
                spannableString.setSpan(new AbsoluteSizeSpan(14, true), iIndexOf, length, 17);
            }
            healthTextView.setText(spannableString);
            healthTextView2.setVisibility(8);
            return;
        }
        healthTextView.setText(qre.f(R.string.IDS_leave_today_new));
        healthTextView2.setVisibility(0);
        healthTextView2.setText(qre.a(R.string.IDS_leave_tip, c(5)));
    }

    private static void b(HealthTextView healthTextView, int i, String str, int i2, String str2) {
        if (i == 1) {
            healthTextView.setText(qre.a(R.string.IDS_leave_menstrual_top, str));
        } else if (i == 2) {
            healthTextView.setText(qre.a(R.string.IDS_leave_menstrual_top_predict, str));
        } else {
            healthTextView.setText(qre.a(R.string.IDS_leave_date_train, c(i2), str2));
        }
    }

    private static void d(HealthTextView healthTextView, HealthTextView healthTextView2, int i, int i2, String str) {
        if (i == 1 || i == 2) {
            healthTextView.setText(qre.f(R.string.IDS_leave_menstrual_middle));
            healthTextView2.setText(qre.a(R.string.IDS_leave_menstrual_bottom, e(i2, true), str));
            healthTextView.setVisibility(0);
            healthTextView2.setVisibility(0);
            return;
        }
        healthTextView.setVisibility(8);
        healthTextView2.setVisibility(8);
    }

    private static void a(HealthTextView healthTextView, int i) {
        healthTextView.setText(qre.e(R.plurals.IDS_train_day, UnitUtil.e(i), ""));
    }

    private static SparseArray<Calendar> c(IntPlan intPlan) {
        IntDayPlan intDayPlan;
        if (intPlan == null) {
            return new SparseArray<>();
        }
        SparseArray<IntDayPlan> sparseArrayH = hvu.h(intPlan);
        int size = sparseArrayH.size();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArrayH.keyAt(i2);
            if (iKeyAt >= iA && (intDayPlan = sparseArrayH.get(iKeyAt)) != null && intDayPlan.getInPlanActionCnt() > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(DateFormatUtil.d(iKeyAt));
                arrayList.add(calendar);
            }
        }
        int iMin = Math.min(arrayList.size(), 5);
        SparseArray<Calendar> sparseArray = new SparseArray<>();
        while (i < iMin) {
            int i3 = i + 1;
            sparseArray.append(i3, (Calendar) arrayList.get(i));
            i = i3;
        }
        return sparseArray;
    }

    private static SparseArray<String> d(SparseArray<Calendar> sparseArray) {
        if (sparseArray == null) {
            return new SparseArray<>();
        }
        int size = sparseArray.size();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        for (int i = 0; i < size; i++) {
            sparseArray2.append(sparseArray.keyAt(i), UnitUtil.e(sparseArray.valueAt(i), 24));
        }
        return sparseArray2;
    }

    private static String[] a(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = UnitUtil.e(sparseArray.keyAt(i), 1, 0);
        }
        return strArr;
    }

    private static int e(SparseArray<Calendar> sparseArray, int i, int i2) {
        Calendar calendarValueAt;
        int size = sparseArray.size();
        if (i == 1 || i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 == size - 1 || ((calendarValueAt = sparseArray.valueAt(i3)) != null && DateFormatUtil.a(calendarValueAt.getTimeInMillis()) >= i2)) {
                    return i3;
                }
            }
        }
        return 0;
    }

    public static void b(Context context, IntPlan intPlan, final int i, int i2, final ResponseCallback<Integer> responseCallback) {
        View viewInflate = View.inflate(BaseApplication.b(), R.layout.dialog_plan_adjust_leave, null);
        b((HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjustment_leave_title), (HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_tip), i);
        double dA = lsl.a(System.currentTimeMillis(), DateFormatUtil.d(i2));
        final String strE = qre.e(R.plurals.IDS_physiology_day, UnitUtil.e(dA), UnitUtil.e(dA, 1, 0));
        SparseArray<Calendar> sparseArrayC = c(intPlan);
        final SparseArray<String> sparseArrayD = d(sparseArrayC);
        int iE = e(sparseArrayC, i, i2);
        int iKeyAt = sparseArrayD.keyAt(iE);
        final HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_subtitle_top);
        final HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_subtitle_middle);
        final HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_subtitle_bottom);
        b(healthTextView, i, strE, iKeyAt, sparseArrayD.valueAt(iE));
        d(healthTextView2, healthTextView3, i, iKeyAt, sparseArrayD.valueAt(iE));
        final HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_unit);
        a(healthTextView4, iKeyAt);
        final HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.dialog_plan_adjust_leave_number_picker);
        healthNumberPicker.setDisplayedValues(a(sparseArrayD));
        healthNumberPicker.setMaxValue(sparseArrayD.size() - 1);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setValue(iE);
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: hwk
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public final void onValuePicked(int i3, int i4) {
                hwg.b(sparseArrayD, healthTextView, i, strE, healthTextView2, healthTextView3, healthTextView4, i3, i4);
            }
        });
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.a(viewInflate).d(R.string.sug_coach_dialog_yes, new DialogInterface.OnClickListener() { // from class: hwj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                hwg.e(responseCallback, sparseArrayD, healthNumberPicker, dialogInterface, i3);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: hwm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                LogUtil.b("R_PlanAdjustUtil", "showLeaveDialog dialog ", dialogInterface, " which ", Integer.valueOf(i3));
            }
        });
        d(builder);
    }

    static /* synthetic */ void b(SparseArray sparseArray, HealthTextView healthTextView, int i, String str, HealthTextView healthTextView2, HealthTextView healthTextView3, HealthTextView healthTextView4, int i2, int i3) {
        int iKeyAt = sparseArray.keyAt(i3);
        b(healthTextView, i, str, iKeyAt, (String) sparseArray.valueAt(i3));
        d(healthTextView2, healthTextView3, i, iKeyAt, (String) sparseArray.valueAt(i3));
        a(healthTextView4, iKeyAt);
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, SparseArray sparseArray, HealthNumberPicker healthNumberPicker, DialogInterface dialogInterface, int i) {
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(0, Integer.valueOf(sparseArray.keyAt(healthNumberPicker.getValue())));
    }

    public static void e(Context context, final Object obj, final ResponseCallback<Object> responseCallback) {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.d(R.string.IDS_leave_cancel);
        if (obj instanceof Calendar) {
            builder.e(qre.a(R.string.IDS_leave_cancel_tip, UnitUtil.e((Calendar) obj, 20)));
        }
        builder.d(R.string.sug_coach_dialog_yes, new DialogInterface.OnClickListener() { // from class: hwn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                hwg.c(responseCallback, obj, dialogInterface, i);
            }
        }).a(R.string.IDS_not_cancel, new DialogInterface.OnClickListener() { // from class: hwq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.b("R_PlanAdjustUtil", "showCancelLeaveDialog dialog ", dialogInterface, " which ", Integer.valueOf(i));
            }
        });
        d(builder);
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, Object obj, DialogInterface dialogInterface, int i) {
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(0, obj);
    }

    private static void d(CustomAlertDialog.Builder builder) {
        CustomAlertDialog customAlertDialogB = builder.b();
        if (customAlertDialogB == null || customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
    }
}
