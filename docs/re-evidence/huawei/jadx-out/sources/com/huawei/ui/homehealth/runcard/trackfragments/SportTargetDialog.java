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
import defpackage.njy;
import defpackage.qre;
import defpackage.tfi;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SportTargetDialog {
    private CustomViewDialog f;
    private Context h;
    private int[] j;
    private int l;
    private float[] m;
    private Map<String, ArrayList<String>> n;
    private List<String> o;
    private int[] p;
    private static final float[] e = {1.0f, 3.0f, 5.0f, 10.0f, 21.0975f, 42.195f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f25957c = {5.0f, 20.0f, 30.0f, 40.0f, 120.0f, 180.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f25955a = {1.0f, 3.0f, 5.0f, 10.0f, 20.0f, 40.0f};
    private static final int[] g = {10, 20, 30, 60, 120, 180};
    private static final int[] i = {30, 60, 90, 120, 150, 180};
    private static final int[] d = {100, 200, 300, 500, 600, 800};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25956b = {50, 100, 200, 300, 500, 600};
    private int k = 0;
    private float s = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 2;
        }
        return 0;
    }

    private int c(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 1) {
            return i2 != 2 ? 0 : 3;
        }
        return 1;
    }

    public SportTargetDialog(Context context) {
        this.h = context;
    }

    private List<String> e() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(e(-1));
        arrayList.add(e(1));
        arrayList.add(e(0));
        arrayList.add(e(2));
        return arrayList;
    }

    private Map<String, ArrayList<String>> c(HealthMultiNumberPicker healthMultiNumberPicker, int i2) {
        if (healthMultiNumberPicker == null) {
            new HealthMultiNumberPicker(BaseApplication.getContext());
        }
        d(i2);
        ArrayList<String> arrayList = new ArrayList<>(7);
        ArrayList<String> arrayList2 = new ArrayList<>(7);
        ArrayList arrayList3 = new ArrayList(7);
        arrayList.add(this.h.getResources().getString(R.string.IDS_start_track_target_custom));
        arrayList2.add(this.h.getResources().getString(R.string.IDS_start_track_target_custom));
        arrayList3.add(this.h.getResources().getString(R.string.IDS_start_track_target_custom));
        ArrayList<String> arrayListD = d(arrayList, this.m);
        ArrayList<String> arrayListE = e(arrayList2, this.p);
        for (double d2 : this.j) {
            arrayList3.add(qre.e(R.plurals.IDS_kcalories_unit, UnitUtil.b(d2, Locale.getDefault()), UnitUtil.e(d2, 1, 0)));
        }
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("");
        HashMap map = new HashMap();
        map.put(e(-1), arrayList4);
        map.put(e(1), arrayListD);
        map.put(e(0), arrayListE);
        map.put(e(2), arrayList3);
        return map;
    }

    private void d(int i2) {
        if (i2 == 257 || i2 == 282 || i2 == 260) {
            this.m = f25955a;
            this.j = f25956b;
            this.p = g;
        } else if (i2 == 259) {
            this.m = f25957c;
            this.j = d;
            this.p = i;
        } else {
            this.m = e;
            this.j = d;
            this.p = g;
        }
    }

    private ArrayList<String> d(ArrayList<String> arrayList, float[] fArr) {
        String strE;
        if (arrayList == null || fArr.length == 0) {
            LogUtil.j("Track_SportTargetDialog", "distances array is null");
            return arrayList;
        }
        if (UnitUtil.f()) {
            for (double d2 : fArr) {
                arrayList.add(qre.e(R.plurals.ie_motiontrack_show_sport_unit_mile, UnitUtil.b(d2, Locale.getDefault()), UnitUtil.e(UnitUtil.e(d2, 3), 1, 2)));
            }
        } else {
            for (double d3 : fArr) {
                if (Math.abs(d3 - 42.195d) < 9.999999974752427E-7d) {
                    strE = this.h.getResources().getString(R.string.IDS_start_track_show_distance_marathon);
                } else if (Math.abs(d3 - 21.0975d) < 9.999999974752427E-7d) {
                    strE = this.h.getResources().getString(R.string.IDS_start_track_show_distance_half_marathon);
                } else {
                    strE = qre.e(R.plurals.IDS_plugindameon_widget_distance_km_unit, UnitUtil.b(d3, Locale.getDefault()), UnitUtil.e(d3, 1, 0));
                }
                arrayList.add(strE);
            }
        }
        return arrayList;
    }

    private ArrayList<String> e(ArrayList<String> arrayList, int[] iArr) {
        if (arrayList == null || iArr.length == 0) {
            LogUtil.j("Track_SportTargetDialog", "times array is null");
            return arrayList;
        }
        for (int i2 : iArr) {
            arrayList.add(qre.e(R.plurals.sug_fitness_train_minutes, i2, Integer.valueOf(i2)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(int i2, int i3) {
        if (i2 == 0) {
            return 0.0f;
        }
        if (i3 == 0) {
            return this.p[i2 - 1] * 60;
        }
        if (i3 == 1) {
            return this.m[i2 - 1];
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.j[i2 - 1] * 1000;
    }

    private int a(int i2, float f) {
        if (i2 == 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.p;
                if (i3 >= iArr.length) {
                    return 0;
                }
                if (((int) f) / 60 == iArr[i3]) {
                    return i3 + 1;
                }
                i3++;
            }
        } else if (i2 == 1) {
            int i4 = 0;
            while (true) {
                float[] fArr = this.m;
                if (i4 >= fArr.length) {
                    return 0;
                }
                if (Math.abs(f - fArr[i4]) < 1.0E-6f) {
                    return i4 + 1;
                }
                i4++;
            }
        } else {
            if (i2 != 2) {
                return 0;
            }
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.j;
                if (i5 >= iArr2.length) {
                    return 0;
                }
                if (((int) f) / 1000 == iArr2[i5]) {
                    return i5 + 1;
                }
                i5++;
            }
        }
    }

    public void e(int i2, Handler handler) {
        this.l = i2;
        this.k = tfi.e(this.h, i2);
        float fD = tfi.d(this.h, this.l);
        this.s = fD;
        LogUtil.a("Track_SportTargetDialog", "showTargetChoiceWheelPickerDialog() mTargetType: ", Integer.valueOf(this.k), ", mTargetValue: ", Float.valueOf(fD));
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        this.o = e();
        this.n = c(healthMultiNumberPicker, i2);
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, false});
        List<String> list = this.o;
        healthMultiNumberPicker.setDisplayedValues(0, (String[]) list.toArray(new String[list.size()]), 0);
        int iC = c(this.k);
        int iA = a(this.k, this.s);
        if (njy.e(this.o, iC)) {
            return;
        }
        ArrayList<String> arrayList = this.n.get(this.o.get(iC));
        healthMultiNumberPicker.setDisplayedValues(1, (String[]) arrayList.toArray(new String[arrayList.size()]), 0);
        healthMultiNumberPicker.c(new int[]{iC, iA}, arrayList.size());
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportTargetDialog.4
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i3, HealthMultiNumberPicker healthMultiNumberPicker2, int i4, int i5) {
                if (i3 == 0) {
                    if (i5 < SportTargetDialog.this.o.size() && SportTargetDialog.this.n.containsKey(SportTargetDialog.this.o.get(i5))) {
                        ArrayList arrayList2 = (ArrayList) SportTargetDialog.this.n.get(SportTargetDialog.this.o.get(i5));
                        healthMultiNumberPicker2.setDisplayedValues(1, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 0);
                    } else {
                        LogUtil.j("Track_SportTargetDialog", "the sport target is not valid");
                    }
                }
            }
        });
        e(healthMultiNumberPicker, handler);
    }

    private void e(final HealthMultiNumberPicker healthMultiNumberPicker, final Handler handler) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.h);
        builder.b(R.string.IDS_hwh_motiontrack_set_target).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportTargetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                SportTargetDialog sportTargetDialog = SportTargetDialog.this;
                sportTargetDialog.k = sportTargetDialog.b(selectedLocations[0]);
                SportTargetDialog sportTargetDialog2 = SportTargetDialog.this;
                sportTargetDialog2.s = sportTargetDialog2.a(selectedLocations[1], sportTargetDialog2.k);
                if (selectedLocations[0] == 0 || selectedLocations[1] != 0) {
                    LogUtil.a("Track_SportTargetDialog", "mTargetType: ", Integer.valueOf(SportTargetDialog.this.k), ", mTargetValue: ", Float.valueOf(SportTargetDialog.this.s));
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.arg1 = SportTargetDialog.this.k;
                    messageObtainMessage.arg2 = 2;
                    messageObtainMessage.obj = Float.valueOf(SportTargetDialog.this.s);
                    handler.sendMessage(messageObtainMessage);
                    SportTargetDialog.this.d();
                    return;
                }
                if (SportTargetDialog.this.k != 1) {
                    if (SportTargetDialog.this.k != 0) {
                        if (SportTargetDialog.this.k == 2) {
                            SportTargetDialog sportTargetDialog3 = SportTargetDialog.this;
                            sportTargetDialog3.a(sportTargetDialog3.h, SportTargetDialog.this.k, handler);
                            return;
                        } else {
                            LogUtil.a("Track_SportTargetDialog", "unknown target type");
                            return;
                        }
                    }
                    SportTargetDialog sportTargetDialog4 = SportTargetDialog.this;
                    sportTargetDialog4.a(sportTargetDialog4.h, SportTargetDialog.this.k, handler);
                    return;
                }
                SportTargetDialog sportTargetDialog5 = SportTargetDialog.this;
                sportTargetDialog5.a(sportTargetDialog5.h, SportTargetDialog.this.k, handler);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportTargetDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.f = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("goalType", Integer.valueOf(this.k));
        if (!Utils.o()) {
            map.put("goalValue", Integer.valueOf((int) this.s));
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.l));
        }
        lmf.d().c(this.h, AnalyticsValue.BI_TRACK_SPORT_GOAL_ACTION_KEY.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i2, Handler handler) {
        if (context == null) {
            LogUtil.j("Track_SportTargetDialog", "context is null");
            return;
        }
        SportCustomTargetDialog.c cVar = new SportCustomTargetDialog.c(context, handler);
        cVar.e(tfi.a(this.h, this.l, i2));
        SportCustomTargetDialog sportCustomTargetDialogD = cVar.d(i2, this.l);
        if (sportCustomTargetDialogD != null) {
            sportCustomTargetDialogD.show();
        }
    }

    public String e(int i2) {
        if (i2 == 0) {
            return this.h.getResources().getString(R.string.IDS_hwh_motiontrack_time_target);
        }
        if (i2 == 1) {
            return this.h.getResources().getString(R.string.IDS_hwh_motiontrack_distance_target);
        }
        if (i2 == 2) {
            return this.h.getResources().getString(R.string.IDS_hwh_motiontrack_calorie_target);
        }
        return this.h.getResources().getString(R.string.IDS_hwh_motiontrack_none_target);
    }
}
