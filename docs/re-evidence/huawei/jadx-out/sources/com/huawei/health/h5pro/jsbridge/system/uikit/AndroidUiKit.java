package com.huawei.health.h5pro.jsbridge.system.uikit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;
import com.huawei.uikit.hwdatepicker.widget.HwDatePicker;
import com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog;
import com.huawei.uikit.hwtimepicker.widget.HwTimePicker;
import com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidUiKit implements UiKit {
    private Context e;

    public AndroidUiKit(Context context) {
        this.e = context;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.uikit.UiKit
    public void pickData(String[] strArr, final DataCallback dataCallback) {
        final HwAdvancedNumberPicker hwAdvancedNumberPicker = new HwAdvancedNumberPicker(this.e);
        hwAdvancedNumberPicker.setDisplayedValues(strArr);
        hwAdvancedNumberPicker.setMinValue(0);
        hwAdvancedNumberPicker.setMaxValue(strArr.length - 1);
        new AlertDialog.Builder(this.e).setView(hwAdvancedNumberPicker).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.AndroidUiKit.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dataCallback.onSelected(hwAdvancedNumberPicker.getValue());
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.AndroidUiKit.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dataCallback.onUnselected();
            }
        }).create().show();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.uikit.UiKit
    public void pickDate(final DateCallback dateCallback) {
        HwDatePickerDialog hwDatePickerDialog = new HwDatePickerDialog((Activity) this.e, new HwDatePickerDialog.OnButtonClickCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.AndroidUiKit.1
            @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog.OnButtonClickCallback
            public void onNegativeButtonClick(HwDatePicker hwDatePicker) {
                dateCallback.onUnselected();
            }

            @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePickerDialog.OnButtonClickCallback
            public void onPositiveButtonClick(HwDatePicker hwDatePicker) {
                dateCallback.onSelected(hwDatePicker.getYear(), hwDatePicker.getMonth(), hwDatePicker.getDayOfMonth());
            }
        });
        hwDatePickerDialog.e(false);
        hwDatePickerDialog.show();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.uikit.UiKit
    public void pickTime(final TimeCallback timeCallback) {
        new HwTimePickerDialog((Activity) this.e, new HwTimePickerDialog.OnButtonClickCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.AndroidUiKit.4
            @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog.OnButtonClickCallback
            public void onNegativeButtonClick(HwTimePicker hwTimePicker) {
                timeCallback.onUnselected();
            }

            @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog.OnButtonClickCallback
            public void onPositiveButtonClick(HwTimePicker hwTimePicker) {
                timeCallback.onSelected(hwTimePicker.getHour(), hwTimePicker.getMinute());
            }
        }).show();
    }
}
