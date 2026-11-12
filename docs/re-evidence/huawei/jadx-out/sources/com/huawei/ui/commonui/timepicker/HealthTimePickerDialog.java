package com.huawei.ui.commonui.timepicker;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.hwtimepicker.widget.HwTimePicker;
import com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog;
import defpackage.xgq;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTimePickerDialog extends xgq {

    /* JADX INFO: loaded from: classes43.dex */
    public enum ButtonId {
        LEFT,
        RIGHT
    }

    public interface TimeSelectedListener {
        void onTimeSelected(int i, int i2);
    }

    public HealthTimePickerDialog(Activity activity, HwTimePickerDialog.OnButtonClickCallback onButtonClickCallback) {
        super(activity, onButtonClickCallback);
        b(activity);
    }

    public HealthTimePickerDialog(Activity activity, final TimeSelectedListener timeSelectedListener) {
        super(activity, new HwTimePickerDialog.OnButtonClickCallback() { // from class: com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.3
            @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog.OnButtonClickCallback
            public void onNegativeButtonClick(HwTimePicker hwTimePicker) {
            }

            @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog.OnButtonClickCallback
            public void onPositiveButtonClick(HwTimePicker hwTimePicker) {
                timeSelectedListener.onTimeSelected(hwTimePicker.getHour(), hwTimePicker.getMinute());
            }
        });
        b(activity);
    }

    private void b(Activity activity) {
        int color = ContextCompat.getColor(activity, R.color.common_colorAccent);
        c(color);
        c(false);
        e(color);
    }

    @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePickerDialog, android.app.Dialog
    public void show() {
        super.show();
        e();
    }

    public void e() {
        HwTextView hwTextView = (HwTextView) findViewById(R.id.hwtimepicker_title);
        if (hwTextView != null) {
            hwTextView.setGravity(GravityCompat.START);
        }
    }

    public void e(ButtonId buttonId, String str) {
        e(buttonId, -1, str);
    }

    public void c(ButtonId buttonId, int i) {
        e(buttonId, i, (String) null);
    }

    private void e(ButtonId buttonId, int i, String str) {
        Field[] declaredFields = HwTimePickerDialog.class.getDeclaredFields();
        int iB = b(buttonId);
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.getType() == HwTextView.class) {
                try {
                    HwTextView hwTextView = (HwTextView) field.get(this);
                    if (hwTextView == null) {
                        return;
                    }
                    if (hwTextView.getId() == iB) {
                        if (i != -1) {
                            hwTextView.setTextColor(i);
                        }
                        if (str != null) {
                            hwTextView.setText(str);
                            return;
                        }
                        return;
                    }
                    continue;
                } catch (IllegalAccessException e) {
                    LogUtil.a("HealthTimePickerDialog", "Failed to find cancle button, ", e.getCause());
                }
            }
        }
    }

    private int b(ButtonId buttonId) {
        if (buttonId == ButtonId.LEFT) {
            return R.id.hwtimepicker_negative_btn;
        }
        return R.id.hwtimepicker_positive_btn;
    }
}
