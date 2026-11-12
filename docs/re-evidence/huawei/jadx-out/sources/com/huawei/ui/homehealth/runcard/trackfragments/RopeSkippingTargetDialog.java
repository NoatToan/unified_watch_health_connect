package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.homehealth.R;
import defpackage.lmf;
import defpackage.qre;
import defpackage.tfi;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class RopeSkippingTargetDialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25889b;
    private CustomViewDialog e;
    private List<String> g;
    private Map<String, ArrayList<String>> i;
    private int[] j;
    private float[] l;
    private int o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f25888c = {0.5f, 1.0f, 3.0f, 5.0f, 10.0f, 15.0f, 30.0f, 60.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f25887a = {80, 100, 200, 300, 500, 1000, 2000, 3000, 5000};
    private int d = 0;
    private int f = 0;
    private int h = 0;
    private int n = 0;
    private float k = -1.0f;

    private int b(int i) {
        if (i != 0) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i) {
        if (i != 1) {
            return i != 2 ? 6 : 5;
        }
        return 0;
    }

    public RopeSkippingTargetDialog(Context context) {
        this.f25889b = context;
    }

    private List<String> c() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f25889b.getResources().getString(R.string.IDS_hwh_motiontrack_none_target));
        arrayList.add(c(0));
        arrayList.add(c(5));
        return arrayList;
    }

    private Map<String, ArrayList<String>> a(HealthMultiNumberPicker healthMultiNumberPicker, int i) {
        if (healthMultiNumberPicker == null) {
            healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        }
        a(i);
        ArrayList<String> arrayList = new ArrayList<>(7);
        ArrayList<String> arrayList2 = new ArrayList<>(6);
        arrayList.add(this.f25889b.getResources().getString(R.string.IDS_start_track_target_custom));
        arrayList2.add(this.f25889b.getResources().getString(R.string.IDS_start_track_target_custom));
        ArrayList<String> arrayListB = b(healthMultiNumberPicker, arrayList, this.l);
        ArrayList<String> arrayListE = e(arrayList2, this.j);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("");
        HashMap map = new HashMap();
        map.put(this.f25889b.getResources().getString(R.string.IDS_hwh_motiontrack_none_target), arrayList3);
        map.put(c(0), arrayListB);
        map.put(c(5), arrayListE);
        return map;
    }

    private void a(int i) {
        if (i == 283) {
            this.l = f25888c;
            this.j = f25887a;
        }
    }

    private ArrayList<String> b(HealthMultiNumberPicker healthMultiNumberPicker, ArrayList<String> arrayList, float[] fArr) {
        if (arrayList == null || fArr == null || fArr.length == 0) {
            LogUtil.j("Track_RopeSkippingTargetDialog", "times array is null");
            return arrayList;
        }
        for (float f : fArr) {
            arrayList.add(a(healthMultiNumberPicker, f));
        }
        return arrayList;
    }

    private String a(HealthMultiNumberPicker healthMultiNumberPicker, float f) {
        int i = (int) (60.0f * f);
        if (i <= 59) {
            return this.f25889b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_second_value, i, Integer.valueOf(i));
        }
        int i2 = (int) f;
        return healthMultiNumberPicker.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_minute_value, i2, Integer.valueOf(i2));
    }

    private ArrayList<String> e(ArrayList<String> arrayList, int[] iArr) {
        if (arrayList == null || iArr.length == 0) {
            LogUtil.j("Track_RopeSkippingTargetDialog", "times array is null");
            return arrayList;
        }
        for (int i : iArr) {
            arrayList.add(this.f25889b.getResources().getQuantityString(R.plurals.IDS_track_skip_count_unit, i, Integer.valueOf(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float c(int i, int i2) {
        if (i == 0) {
            return 0.0f;
        }
        if (i2 == 0) {
            return this.l[i - 1] * 60.0f;
        }
        if (i2 != 5) {
            return 0.0f;
        }
        return this.j[i - 1];
    }

    private int[] b() {
        int[] iArr = new int[this.l.length];
        int i = 0;
        while (true) {
            float[] fArr = this.l;
            if (i >= fArr.length) {
                return iArr;
            }
            iArr[i] = (int) (fArr[i] * 60.0f);
            i++;
        }
    }

    private int d(int i, float f) {
        if (i == 0) {
            int[] iArrB = b();
            for (int i2 = 0; i2 < iArrB.length; i2++) {
                if (((int) f) == iArrB[i2]) {
                    return i2 + 1;
                }
            }
        } else if (i == 5) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.j;
                if (i3 >= iArr.length) {
                    break;
                }
                if (((int) f) == iArr[i3]) {
                    return i3 + 1;
                }
                i3++;
            }
        }
        return 0;
    }

    public void b(int i, Handler handler) {
        this.o = i;
        this.n = tfi.e(this.f25889b, i);
        float fD = tfi.d(this.f25889b, this.o);
        this.k = fD;
        LogUtil.a("Track_RopeSkippingTargetDialog", "showTargetChoiceWheelPickerDialog() mTargetType: ", Integer.valueOf(this.n), ", mTargetValue: ", Float.valueOf(fD));
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        this.g = c();
        this.i = a(healthMultiNumberPicker, i);
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, false});
        List<String> list = this.g;
        healthMultiNumberPicker.setDisplayedValues(0, (String[]) list.toArray(new String[list.size()]), 0);
        int iB = b(this.n);
        int iD = d(this.n, this.k);
        ArrayList<String> arrayList = this.i.get(this.g.get(iB));
        healthMultiNumberPicker.setDisplayedValues(1, (String[]) arrayList.toArray(new String[arrayList.size()]), 0);
        healthMultiNumberPicker.c(new int[]{iB, iD}, arrayList.size());
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkippingTargetDialog.2
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i2, HealthMultiNumberPicker healthMultiNumberPicker2, int i3, int i4) {
                if (i2 == 0) {
                    if (i4 < RopeSkippingTargetDialog.this.g.size() && RopeSkippingTargetDialog.this.i.containsKey(RopeSkippingTargetDialog.this.g.get(i4))) {
                        ArrayList arrayList2 = (ArrayList) RopeSkippingTargetDialog.this.i.get(RopeSkippingTargetDialog.this.g.get(i4));
                        healthMultiNumberPicker2.setDisplayedValues(1, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 0);
                    } else {
                        LogUtil.j("Track_RopeSkippingTargetDialog", "the sport target is not valid");
                    }
                }
            }
        });
        e(healthMultiNumberPicker, handler);
    }

    private void e(final HealthMultiNumberPicker healthMultiNumberPicker, final Handler handler) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f25889b);
        builder.b(R.string.IDS_hwh_motiontrack_set_target).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkippingTargetDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                RopeSkippingTargetDialog ropeSkippingTargetDialog = RopeSkippingTargetDialog.this;
                ropeSkippingTargetDialog.n = ropeSkippingTargetDialog.d(selectedLocations[0]);
                RopeSkippingTargetDialog ropeSkippingTargetDialog2 = RopeSkippingTargetDialog.this;
                ropeSkippingTargetDialog2.k = ropeSkippingTargetDialog2.c(selectedLocations[1], ropeSkippingTargetDialog2.n);
                if (selectedLocations[0] == 0 || selectedLocations[1] != 0) {
                    LogUtil.a("Track_RopeSkippingTargetDialog", "mTargetType: ", Integer.valueOf(RopeSkippingTargetDialog.this.n), ", mTargetValue: ", Float.valueOf(RopeSkippingTargetDialog.this.k));
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.arg1 = RopeSkippingTargetDialog.this.n;
                    messageObtainMessage.arg2 = 2;
                    messageObtainMessage.obj = Float.valueOf(RopeSkippingTargetDialog.this.k);
                    handler.sendMessage(messageObtainMessage);
                    RopeSkippingTargetDialog.this.d();
                    return;
                }
                if (RopeSkippingTargetDialog.this.n == 0) {
                    RopeSkippingTargetDialog.this.a(handler);
                } else {
                    RopeSkippingTargetDialog ropeSkippingTargetDialog3 = RopeSkippingTargetDialog.this;
                    ropeSkippingTargetDialog3.d(ropeSkippingTargetDialog3.f25889b, RopeSkippingTargetDialog.this.n, handler);
                }
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkippingTargetDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.e = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("goalType", Integer.valueOf(this.n));
        if (!Utils.o()) {
            map.put("goalValue", Integer.valueOf((int) this.k));
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.o));
        }
        lmf.d().c(this.f25889b, AnalyticsValue.BI_TRACK_SPORT_GOAL_ACTION_KEY.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Handler handler) {
        int i;
        int i2;
        int i3;
        if (tfi.e(this.f25889b, this.o) == 0) {
            int iD = (int) tfi.d(this.f25889b, this.o);
            i2 = iD / 3600;
            i3 = (iD % 3600) / 60;
            i = iD % 60;
            if (i2 == 0) {
                i3--;
            }
            LogUtil.a("Track_RopeSkippingTargetDialog", "createCustomTimeDialog() indexHour: ", Integer.valueOf(i2), ", indexMinute: ", Integer.valueOf(i3), ", indexSecond: ", Integer.valueOf(i));
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        healthMultiNumberPicker.setPickerCount(3, new boolean[]{false, true, true});
        healthMultiNumberPicker.setDisplayedValues(0, healthMultiNumberPicker.c(0, 2, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_h)), i2);
        int i4 = i2 == 0 ? 1 : 0;
        int i5 = i2 == 2 ? 0 : 59;
        healthMultiNumberPicker.setDisplayedValues(1, healthMultiNumberPicker.c(i4, i5, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_m)), i3);
        healthMultiNumberPicker.setDisplayedValues(2, healthMultiNumberPicker.c(0, i5, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_second)), i);
        healthMultiNumberPicker.setOnValueChangeListener(e());
        a(healthMultiNumberPicker, handler);
    }

    private HealthMultiNumberPicker.OnValueChangeListener e() {
        return new HealthMultiNumberPicker.OnValueChangeListener() { // from class: syg
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public final void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
                this.d.b(i, healthMultiNumberPicker, i2, i3);
            }
        };
    }

    public /* synthetic */ void b(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
        LogUtil.a("Track_RopeSkippingTargetDialog", "onValueChange() pickerIndex: ", Integer.valueOf(i), ", oldVal: ", Integer.valueOf(i2), ", newVal: ", Integer.valueOf(i3), ", numberPicker: ", healthMultiNumberPicker);
        if (i == 0) {
            if (i3 == 2) {
                healthMultiNumberPicker.setDisplayedValues(1, healthMultiNumberPicker.c(0, 0, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_m)), 0);
                healthMultiNumberPicker.setDisplayedValues(2, healthMultiNumberPicker.c(0, 0, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_second)), 0);
            } else if (i3 == 0) {
                healthMultiNumberPicker.setDisplayedValues(1, healthMultiNumberPicker.c(1, 59, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_m)), 0);
                healthMultiNumberPicker.setDisplayedValues(2, healthMultiNumberPicker.c(0, 59, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_second)), 0);
            } else {
                healthMultiNumberPicker.setDisplayedValues(1, healthMultiNumberPicker.c(0, 59, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_m)), 0);
                healthMultiNumberPicker.setDisplayedValues(2, healthMultiNumberPicker.c(0, 59, this.f25889b.getResources().getString(com.huawei.ui.main.R.string.IDS_second)), 0);
            }
        }
    }

    private void a(final HealthMultiNumberPicker healthMultiNumberPicker, final Handler handler) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f25889b);
        builder.b(R.string.IDS_indoor_skipper_time_target).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkippingTargetDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                RopeSkippingTargetDialog.this.d = selectedLocations[0];
                RopeSkippingTargetDialog.this.f = selectedLocations[1];
                RopeSkippingTargetDialog.this.h = selectedLocations[2];
                if (RopeSkippingTargetDialog.this.d == 0) {
                    RopeSkippingTargetDialog.this.f++;
                }
                LogUtil.a("Track_RopeSkippingTargetDialog", "custom time onClick() mDurationHour: ", Integer.valueOf(RopeSkippingTargetDialog.this.d), ", mDurationMinute: ", Integer.valueOf(RopeSkippingTargetDialog.this.f), ", mDurationSecond: ", Integer.valueOf(RopeSkippingTargetDialog.this.h));
                RopeSkippingTargetDialog ropeSkippingTargetDialog = RopeSkippingTargetDialog.this;
                ropeSkippingTargetDialog.k = (ropeSkippingTargetDialog.d * 3600) + (RopeSkippingTargetDialog.this.f * 60) + RopeSkippingTargetDialog.this.h;
                LogUtil.a("Track_RopeSkippingTargetDialog", "custom time mTargetType: ", Integer.valueOf(RopeSkippingTargetDialog.this.n), ", mTargetValue: ", Float.valueOf(RopeSkippingTargetDialog.this.k));
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.arg1 = RopeSkippingTargetDialog.this.n;
                messageObtainMessage.arg2 = 2;
                messageObtainMessage.obj = Float.valueOf(RopeSkippingTargetDialog.this.k);
                handler.sendMessage(messageObtainMessage);
                RopeSkippingTargetDialog.this.d();
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkippingTargetDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.e = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, int i, Handler handler) {
        if (context == null) {
            LogUtil.j("Track_RopeSkippingTargetDialog", "context is null");
            return;
        }
        SportCustomTargetDialog.c cVar = new SportCustomTargetDialog.c(context, handler);
        cVar.e(tfi.a(this.f25889b, this.o, i));
        SportCustomTargetDialog sportCustomTargetDialogD = cVar.d(i, this.o);
        if (sportCustomTargetDialogD != null) {
            sportCustomTargetDialogD.show();
        }
    }

    public static String c(int i) {
        if (i == 0) {
            return qre.f(R.string.IDS_track_skip_timed_jump);
        }
        if (i == 5) {
            return qre.f(R.string.IDS_track_skip_fixed_num_jump);
        }
        return qre.f(R.string.IDS_track_skip_free_jump);
    }
}
