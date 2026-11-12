package com.huawei.ui.homehealth.runcard.utils;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.homehealth.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class TargetChoicePickerUtils {
    private int[] f;
    private Context h;
    private float[] i;
    private int[] o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f25989c = {1.0f, 3.0f, 5.0f, 10.0f, 21.0975f, 42.195f};
    private static final float[] d = {5.0f, 20.0f, 30.0f, 40.0f, 120.0f, 180.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f25988b = {1.0f, 3.0f, 5.0f, 10.0f, 20.0f, 40.0f};
    private static final int[] j = {10, 20, 30, 60, 120, 180};
    private static final int[] g = {30, 60, 90, 120, 150, 180};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f25987a = {100, 200, 300, 500, 600, 800};
    private static final int[] e = {50, 100, 200, 300, 500, 600};

    public int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public int c(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? -1 : 2;
        }
        return 0;
    }

    public TargetChoicePickerUtils(Context context) {
        this.h = context;
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_none_target));
        arrayList.add(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_distance_target));
        arrayList.add(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_time_target));
        arrayList.add(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_calorie_target));
        return arrayList;
    }

    public Map<String, ArrayList<String>> b(HealthMultiNumberPicker healthMultiNumberPicker, int i) {
        if (healthMultiNumberPicker == null) {
            healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        }
        d(i);
        ArrayList<String> arrayList = new ArrayList<>(7);
        ArrayList arrayList2 = new ArrayList(7);
        ArrayList<String> arrayList3 = new ArrayList<>(7);
        arrayList.add(this.h.getResources().getString(R.string.IDS_start_track_target_custom));
        arrayList2.add(this.h.getResources().getString(R.string.IDS_start_track_target_custom));
        arrayList3.add(this.h.getResources().getString(R.string.IDS_start_track_target_custom));
        ArrayList<String> arrayListE = e(arrayList, this.i);
        Collections.addAll(arrayList2, healthMultiNumberPicker.c(this.f, this.h.getResources().getString(R.string.IDS_hw_health_show_calorie_unit)));
        ArrayList<String> arrayListB = b(healthMultiNumberPicker, arrayList3, this.o);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("");
        HashMap map = new HashMap();
        map.put(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_none_target), arrayList4);
        map.put(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_distance_target), arrayListE);
        map.put(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_time_target), arrayListB);
        map.put(this.h.getResources().getString(R.string.IDS_hwh_motiontrack_calorie_target), arrayList2);
        return map;
    }

    public float b(int i, int i2) {
        if (i == 0) {
            return 0.0f;
        }
        if (i2 == 0) {
            return this.o[i - 1] * 60;
        }
        if (i2 == 1) {
            return this.i[i - 1];
        }
        if (i2 != 2) {
            return 0.0f;
        }
        return this.f[i - 1] * 1000;
    }

    public int b(int i, double d2) {
        if (i == 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.o;
                if (i2 >= iArr.length) {
                    return 0;
                }
                if (((int) d2) / 60 == iArr[i2]) {
                    return i2 + 1;
                }
                i2++;
            }
        } else if (i == 1) {
            int i3 = 0;
            while (true) {
                float[] fArr = this.i;
                if (i3 >= fArr.length) {
                    return 0;
                }
                if (Math.abs(d2 - ((double) fArr[i3])) < 9.999999974752427E-7d) {
                    return i3 + 1;
                }
                i3++;
            }
        } else {
            if (i != 2) {
                return 0;
            }
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return 0;
                }
                if (((int) d2) / 1000 == iArr2[i4]) {
                    return i4 + 1;
                }
                i4++;
            }
        }
    }

    public static String a(double d2, Context context) {
        if (LanguageUtil.l(context)) {
            return e(d2);
        }
        return UnitUtil.e(d2, 1, 2);
    }

    public static String e(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("###0.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d2);
    }

    private void d(int i) {
        if (i == 257 || i == 282 || i == 260) {
            this.i = f25988b;
            this.f = e;
            this.o = j;
        } else if (i == 259) {
            this.i = d;
            this.f = f25987a;
            this.o = g;
        } else {
            this.i = f25989c;
            this.f = f25987a;
            this.o = j;
        }
    }

    private ArrayList<String> e(ArrayList<String> arrayList, float[] fArr) {
        String string;
        if (arrayList == null || fArr.length == 0) {
            LogUtil.j("TargetChoicePickerUtils", "distances array is null");
            return arrayList;
        }
        if (UnitUtil.f()) {
            String string2 = this.h.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
            for (float f : fArr) {
                arrayList.add(UnitUtil.e(UnitUtil.e(f, 3), 1, 2) + string2);
            }
        } else {
            String string3 = this.h.getResources().getString(R.string.IDS_hw_health_show_distance_unit);
            for (double d2 : fArr) {
                if (Math.abs(d2 - 42.195d) < 9.999999974752427E-7d) {
                    string = this.h.getResources().getString(R.string.IDS_start_track_show_distance_marathon);
                } else if (Math.abs(d2 - 21.0975d) < 9.999999974752427E-7d) {
                    string = this.h.getResources().getString(R.string.IDS_start_track_show_distance_half_marathon);
                } else {
                    string = UnitUtil.e(d2, 1, 0) + string3;
                }
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private ArrayList<String> b(HealthMultiNumberPicker healthMultiNumberPicker, ArrayList<String> arrayList, int[] iArr) {
        if (arrayList == null || iArr.length == 0) {
            LogUtil.j("TargetChoicePickerUtils", "times array is null");
            return arrayList;
        }
        for (int i : iArr) {
            arrayList.add(healthMultiNumberPicker.a(i, this.h.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, i)));
        }
        return arrayList;
    }
}
