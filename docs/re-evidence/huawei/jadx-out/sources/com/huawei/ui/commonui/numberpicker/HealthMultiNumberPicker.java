package com.huawei.ui.commonui.numberpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMultiNumberPicker extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f23784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinearLayout f23785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f23786c;
    private Context d;
    private int e;
    private int f;
    private OnValueChangeListener g;
    private int[] h;
    private final FrameLayout i;
    private Map<Integer, String[]> j;
    private final LinearLayout k;

    public interface OnValueChangeListener {
        void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3);
    }

    public HealthMultiNumberPicker(Context context) {
        this(context, null);
    }

    public HealthMultiNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.d = context;
        View viewInflate = View.inflate(getContext(), R.layout.health_multi_number_picker_layout, this);
        this.f23784a = (LinearLayout) viewInflate.findViewById(R.id.hw_health_multi_numberpicker_layout);
        this.i = (FrameLayout) viewInflate.findViewById(R.id.number_picker_root_layout);
        this.k = (LinearLayout) viewInflate.findViewById(R.id.unit_root_layout);
        this.f23785b = (LinearLayout) viewInflate.findViewById(R.id.first_unit_layout);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.number_picker_parent);
        if (LanguageUtil.ba(context)) {
            relativeLayout.setLayoutDirection(0);
        }
    }

    public void setSelectorTextColor(int i) {
        this.f = i;
        int childCount = this.f23784a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f23784a.getChildAt(i2);
            if (!(childAt instanceof HealthNumberPicker)) {
                LogUtil.e("HealthMultiNumberPicker", "mMultiNumberpickerLayout did not contain HealthNumberPicker view");
                return;
            }
            ((HealthNumberPicker) childAt).setSelectorPaintColor(i);
        }
    }

    public void setPickerCount(int i, boolean[] zArr) {
        this.e = i;
        if (zArr == null || zArr.length < i) {
            LogUtil.e("HealthMultiNumberPicker", "the looper flags have something wrong");
            return;
        }
        this.f23786c = (boolean[]) zArr.clone();
        for (int i2 = 0; i2 < this.e; i2++) {
            c(i2);
        }
    }

    public void setColonAndUnit(int i) {
        if (this.e != i || i <= 0) {
            LogUtil.a("HealthMultiNumberPicker", "num is wrong");
            return;
        }
        if (i != 2 && i != 3) {
            LogUtil.a("HealthMultiNumberPicker", "NumberPicker count is not supported");
            return;
        }
        this.k.setVisibility(0);
        View viewInflate = View.inflate(getContext(), R.layout.health_multi_colon_layout, null);
        if (i == 3) {
            ((LinearLayout) viewInflate.findViewById(R.id.second_colon_layout)).setVisibility(0);
            LinearLayout linearLayout = this.f23785b;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.colon_root_layout);
        if (linearLayout2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
            marginLayoutParams.setMarginStart(this.d.getResources().getDimensionPixelSize(R.dimen.health_common_56dp));
            marginLayoutParams.setMarginEnd(this.d.getResources().getDimensionPixelSize(R.dimen.health_common_56dp));
            linearLayout2.setLayoutParams(marginLayoutParams);
        }
        if (viewInflate instanceof LinearLayout) {
            this.i.addView((LinearLayout) viewInflate);
        }
    }

    public void setOnValueChangeListener(OnValueChangeListener onValueChangeListener) {
        if (onValueChangeListener == null) {
            LogUtil.e("HealthMultiNumberPicker", "the listener of the picker has not been initialized");
        } else {
            this.g = onValueChangeListener;
        }
    }

    public void setDisplayedValues(int i, String[] strArr, int i2) {
        int i3;
        if (i >= this.e) {
            LogUtil.e("HealthMultiNumberPicker", "the index of picker is out of bound");
            return;
        }
        if (i > 0) {
            this.f23784a.removeViewAt(i);
            c(i);
        }
        View childAt = this.f23784a.getChildAt(i);
        if (!(childAt instanceof HealthNumberPicker)) {
            LogUtil.e("HealthMultiNumberPicker", "mMultiNumberpickerLayout did not contain HealthNumberPicker view");
            return;
        }
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) childAt;
        if (strArr == null) {
            LogUtil.e("HealthMultiNumberPicker", "the values of picker is empty");
            return;
        }
        if (i2 < 0 || i2 >= strArr.length || strArr.length <= 0) {
            i2 = 0;
            i3 = 0;
        } else {
            int length = strArr.length;
            healthNumberPicker.setEnabled(true);
            i3 = length - 1;
        }
        if (strArr.length == 1 && strArr[0].equals("")) {
            healthNumberPicker.setEnabled(false);
            healthNumberPicker.setAlpha(1.0f);
        }
        e(healthNumberPicker, strArr, 0, i3, i2);
        b(healthNumberPicker, i, i2);
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put(Integer.valueOf(i), strArr);
    }

    private void b(HealthNumberPicker healthNumberPicker, int i, int i2) {
        healthNumberPicker.setWrapSelectorWheel(this.f23786c[i]);
        this.h[i] = i2;
    }

    public void setDataContent(int i, Map<Integer, String[]> map, boolean[] zArr, int[] iArr) {
        if (i < 0) {
            LogUtil.e("HealthMultiNumberPicker", "the count of the picker can not be less than 0");
            return;
        }
        this.e = i;
        if (map != null) {
            int size = map.size();
            int i2 = this.e;
            if (size >= i2) {
                if (zArr == null || zArr.length < i2) {
                    LogUtil.e("HealthMultiNumberPicker", "the value of lopper is invalid");
                    return;
                }
                if (iArr == null || iArr.length < i2) {
                    LogUtil.e("HealthMultiNumberPicker", "the values of location have something wrong");
                    return;
                }
                this.j = map;
                this.f23786c = (boolean[]) zArr.clone();
                for (int i3 = 0; i3 < this.e; i3++) {
                    if (i3 >= iArr.length) {
                        iArr[i3] = 0;
                    }
                    d(i3, iArr[i3]);
                }
                return;
            }
        }
        LogUtil.e("HealthMultiNumberPicker", "the values of picker is invalid");
    }

    private HealthNumberPicker c(final int i) {
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) View.inflate(getContext(), R.layout.health_multi_number_picker_one_layout, null).findViewById(R.id.health_number_picker_one);
        healthNumberPicker.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        healthNumberPicker.setOnValueChangedListener(new HwAdvancedNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.1
            @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnValueChangeListener
            public void onValueChange(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i2, int i3) {
                HealthMultiNumberPicker.this.h[i] = i3;
                if (HealthMultiNumberPicker.this.g != null) {
                    HealthMultiNumberPicker.this.g.onValueChange(i, HealthMultiNumberPicker.this, i2, i3);
                }
            }
        });
        if (this.h == null) {
            this.h = new int[this.e];
        }
        int i2 = this.f;
        if (i2 != -1) {
            healthNumberPicker.setSelectorPaintColor(i2);
        }
        this.f23784a.addView(healthNumberPicker, i);
        return healthNumberPicker;
    }

    private void d(int i, int i2) {
        Map<Integer, String[]> map = this.j;
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            LogUtil.e("HealthMultiNumberPicker", "the values of picker is not exist");
            return;
        }
        String[] strArr = this.j.get(Integer.valueOf(i));
        if (strArr == null || strArr.length == 0) {
            LogUtil.e("HealthMultiNumberPicker", "the picker's values are empty");
            return;
        }
        HealthNumberPicker healthNumberPickerC = c(i);
        healthNumberPickerC.setWrapSelectorWheel(this.f23786c[i]);
        e(healthNumberPickerC, strArr, 0, strArr.length - 1, i2);
        boolean[] zArr = this.f23786c;
        if (i >= zArr.length) {
            zArr[i] = false;
        }
        b(healthNumberPickerC, i, i2);
    }

    private void e(HealthNumberPicker healthNumberPicker, String[] strArr, int i, int i2, int i3) {
        if (strArr == null || strArr.length == 0) {
            LogUtil.e("HealthMultiNumberPicker", "the picker's values are empty");
            return;
        }
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMinValue(i);
        healthNumberPicker.setMaxValue(i2);
        healthNumberPicker.setValue(i3);
    }

    public void c(int[] iArr, int i) {
        if (iArr == null || iArr.length < this.e) {
            LogUtil.e("HealthMultiNumberPicker", "the values of location have something wrong");
            return;
        }
        this.h = (int[]) iArr.clone();
        for (int i2 = 0; i2 < this.e; i2++) {
            int[] iArr2 = this.h;
            int i3 = iArr2[i2];
            if (i3 < 0 || i3 > i - 1) {
                iArr2[i2] = 0;
            }
            View childAt = this.f23784a.getChildAt(i2);
            if (!(childAt instanceof HealthNumberPicker)) {
                LogUtil.e("HealthMultiNumberPicker", "mMultiNumberpickerLayout did not contain HealthNumberPicker view");
                return;
            }
            ((HealthNumberPicker) childAt).setValue(this.h[i2]);
        }
    }

    public int[] getSelectedLocations() {
        int[] iArr = this.h;
        if (iArr == null) {
            LogUtil.e("HealthMultiNumberPicker", "the value of selectedLocation is null");
            return new int[0];
        }
        return (int[]) iArr.clone();
    }

    public String[] d(int i) {
        Map<Integer, String[]> map = this.j;
        if (map == null) {
            LogUtil.e("HealthMultiNumberPicker", "the value of pickers is null");
            return new String[0];
        }
        return map.get(Integer.valueOf(i));
    }

    public String[] c(int i, int i2, String str) {
        if (i > i2) {
            LogUtil.e("HealthMultiNumberPicker", "the range of number has something wrong");
            return new String[0];
        }
        if (str == null) {
            str = "";
        }
        int i3 = (i2 - i) + 1;
        int[] iArr = new int[i3];
        for (int i4 = i; i4 <= i2; i4++) {
            iArr[i4 - i] = i4;
        }
        return e(i3, iArr, str);
    }

    public String[] c(int[] iArr, String str) {
        if (iArr == null) {
            LogUtil.e("HealthMultiNumberPicker", "numberList is empty");
            return new String[0];
        }
        if (str == null) {
            str = "";
        }
        return a(iArr.length, iArr, str);
    }

    public String a(double d, String str) {
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(UnitUtil.e(d, 1, 0));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private String[] e(int i, int[] iArr, String str) {
        if (i <= 0) {
            LogUtil.d("HealthMultiNumberPicker", "the length of number list is 0");
            return new String[0];
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            String strE = UnitUtil.e(iArr[i2], 1, 0);
            strArr[i2] = strE;
            if (iArr[i2] < 10) {
                strE = new DecimalFormat("00").format(iArr[i2]);
            }
            strArr[i2] = strE;
        }
        return strArr;
    }

    private String[] a(int i, int[] iArr, String str) {
        if (i <= 0) {
            LogUtil.d("HealthMultiNumberPicker", "the length of number list is 0");
            return new String[0];
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append(UnitUtil.e(iArr[i2], 1, 0));
            stringBuffer.append(str);
            strArr[i2] = stringBuffer.toString();
        }
        return strArr;
    }
}
