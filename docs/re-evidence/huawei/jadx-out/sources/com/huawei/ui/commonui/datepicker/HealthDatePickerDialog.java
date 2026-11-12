package com.huawei.ui.commonui.datepicker;

import android.app.Activity;
import com.huawei.uikit.hwdatepicker.R;
import com.huawei.uikit.hwdatepicker.widget.HwDatePicker;
import com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog;
import defpackage.xgr;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDatePickerDialog extends xgr {

    public interface DateSelectedListener {
        void onDateSelected(int i, int i2, int i3);
    }

    public HealthDatePickerDialog(Activity activity, final DateSelectedListener dateSelectedListener, GregorianCalendar gregorianCalendar) {
        super(activity, R.style.Widget_Emui_HwDatePickerDialogStyle, new HwDatePickerDialog.OnButtonClickCallback() { // from class: com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.1
            @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog.OnButtonClickCallback
            public void onNegativeButtonClick(HwDatePicker hwDatePicker) {
            }

            @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog.OnButtonClickCallback
            public void onPositiveButtonClick(HwDatePicker hwDatePicker) {
                dateSelectedListener.onDateSelected(hwDatePicker.getYear(), hwDatePicker.getMonth(), hwDatePicker.getDayOfMonth());
            }
        }, gregorianCalendar);
        setCanceledOnTouchOutside(true);
        e(false);
        d(true);
        b(false);
        d(activity.getResources().getColor(com.huawei.ui.commonui.R.color.common_colorAccent));
    }

    @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog
    public void a(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        if (b() != null && !b().b()) {
            b().setIsShowAllYears(true);
        }
        super.a(gregorianCalendar, gregorianCalendar2);
    }
}
