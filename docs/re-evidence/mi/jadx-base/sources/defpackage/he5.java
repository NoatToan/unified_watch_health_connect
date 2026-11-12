package defpackage;

import android.content.DialogInterface;
import android.util.ArrayMap;
import androidx.preference.Preference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindUtils;
import com.xiaomi.fitness.health.bloodpressure.ui.MeasureRemindPreferenceFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import miuix.preference.DropDownPreference;
import miuix.preference.PreferenceFragment;
import miuix.preference.RadioButtonPreference;
import miuix.preference.RadioSetPreferenceCategory;
import miuix.preference.TextPreference;

/* JADX INFO: loaded from: classes9.dex */
public class he5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceFragment f19970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tz2 f19971b;
    public TextPreference c;
    public DropDownPreference d;
    public RadioSetPreferenceCategory e;
    public RadioButtonPreference f;
    public List<String> g;
    public Map<Integer, Boolean> h;

    public class a extends av6 {
        public a() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            super.onDialogClick(str, dialogInterface, i);
            if (i == -1) {
                he5 he5Var = he5.this;
                int iM = he5Var.m(he5Var.h);
                int[] repeatDays = BloodPressureRemindUtils.getRepeatDays(iM);
                he5.this.f19971b.g(iM);
                he5.this.c.p(BloodPressureRemindUtils.getCustomRepeatFormatString(he5.this.f19970a.requireContext(), repeatDays));
            }
        }

        @Override // defpackage.av6
        public void onDialogMultiClick(String str, int i, boolean z) {
            super.onDialogMultiClick(str, i, z);
            if (i < 0 || i >= he5.this.h.size()) {
                return;
            }
            he5.this.h.put(Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    public he5(MeasureRemindPreferenceFragment measureRemindPreferenceFragment) {
        this.f19970a = measureRemindPreferenceFragment;
        o();
    }

    public final void i(int i, int[] iArr) {
        this.f19971b.f(iArr);
        ArrayUtils arrayUtils = ArrayUtils.INSTANCE;
        if (!ArrayUtils.isEmpty(this.g)) {
            Iterator<String> it = this.g.iterator();
            while (it.hasNext()) {
                this.e.r(j(it.next()));
            }
            this.g.clear();
        }
        boolean zIsChecked = this.f.isChecked();
        for (int i2 = 0; i2 < i; i2++) {
            String str = "custom_remind" + i2;
            TextPreference textPreferenceP = p(i2, iArr[i2], str);
            this.e.h(textPreferenceP);
            textPreferenceP.setDependency("custom_enable");
            this.g.add(str);
            if (!zIsChecked) {
                textPreferenceP.setVisible(false);
            }
        }
    }

    public final <T extends Preference> T j(CharSequence charSequence) {
        return (T) this.f19970a.findPreference(charSequence);
    }

    public tz2 k() {
        return this.f19971b;
    }

    public final int[] l(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = (int) ((((long) i2) * TimeUnit.HOURS.toMinutes(1L)) + 480);
        }
        return iArr;
    }

    public final int m(Map<Integer, Boolean> map) {
        int iIntValue = 0;
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getValue().booleanValue()) {
                iIntValue |= 1 << entry.getKey().intValue();
            }
        }
        return iIntValue;
    }

    public int[] n() {
        tz2 tz2Var = this.f19971b;
        return tz2Var == null ? new int[0] : new int[]{400, tz2Var.c().length + 399};
    }

    public final void o() {
        this.g = new ArrayList();
        this.e = (RadioSetPreferenceCategory) j("custom_category");
        this.f = (RadioButtonPreference) j("custom_enable");
        this.c = (TextPreference) j("custom_repeat_mode");
        this.d = (DropDownPreference) j("custom_day_count");
        CharSequence[] charSequenceArr = new CharSequence[12];
        int i = 0;
        while (i < 12) {
            int i2 = i + 1;
            charSequenceArr[i] = String.valueOf(i2);
            i = i2;
        }
        this.d.D(charSequenceArr);
        this.d.F(charSequenceArr);
        this.d.G(null);
        this.d.E(null);
        this.d.setOnPreferenceChangeListener(new Preference.c() { // from class: ee5
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                return this.f16557a.q(preference, obj);
            }
        });
        this.c.setOnPreferenceClickListener(new Preference.d() { // from class: fe5
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f17701a.r(preference);
            }
        });
    }

    public final TextPreference p(final int i, int i2, String str) {
        TextPreference textPreference = new TextPreference(this.f19970a.requireContext());
        textPreference.setTitle(this.f19970a.getString(c0j.v2, Integer.valueOf(i + 1)));
        textPreference.p(TimeUtils.parseMinutesToHHMM(i2));
        textPreference.setKey(str);
        textPreference.setLayoutResource(jui.V4);
        textPreference.setOnPreferenceClickListener(new Preference.d() { // from class: ge5
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f18882a.s(i, preference);
            }
        });
        return textPreference;
    }

    public final /* synthetic */ boolean q(Preference preference, Object obj) {
        String str = (String) obj;
        if (this.f19971b == null) {
            return true;
        }
        int i = Integer.parseInt(str);
        this.f19971b.e(i);
        i(i, l(i));
        return true;
    }

    public final /* synthetic */ boolean r(Preference preference) {
        w();
        return true;
    }

    public final /* synthetic */ boolean s(int i, Preference preference) {
        v(i);
        return true;
    }

    public final void t(int i) {
        if (this.g.size() != this.f19971b.c().length) {
            return;
        }
        ((TextPreference) j(this.g.get(i))).p(TimeUtils.parseMinutesToHHMM(this.f19971b.c()[i]));
    }

    public final void u() {
        String customRepeatFormatString = BloodPressureRemindUtils.getCustomRepeatFormatString(this.f19970a.requireContext(), BloodPressureRemindUtils.getRepeatDays(this.f19971b.d()));
        this.d.H(String.valueOf(this.f19971b.b()));
        this.c.p(customRepeatFormatString);
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            t(i);
        }
    }

    public final void v(int i) {
        tz2 tz2Var = this.f19971b;
        if (tz2Var == null) {
            return;
        }
        int[] iArrC = tz2Var.c();
        if (i < 0 || i >= iArrC.length) {
            return;
        }
        int i2 = iArrC[i];
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.v2, Integer.valueOf(i + 1))).create();
        hourMinutePickerDialogCreate.setRequestCode(i + 400);
        hourMinutePickerDialogCreate.setValue(i2 / 60, i2 % 60);
        hourMinutePickerDialogCreate.showIfNeed(this.f19970a.getChildFragmentManager());
    }

    public final void w() {
        if (this.f19971b == null) {
            return;
        }
        String[] stringArray = this.f19970a.getResources().getStringArray(ohi.d);
        int length = stringArray.length;
        boolean[] zArr = new boolean[length];
        int[] repeatDays = BloodPressureRemindUtils.getRepeatDays(this.f19971b.d());
        this.h = new ArrayMap(stringArray.length);
        for (int i : repeatDays) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < length) {
                zArr[i2] = true;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            this.h.put(Integer.valueOf(i3), Boolean.valueOf(zArr[i3]));
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(c0j.w2).setNegativeText(c0j.D7).setPositiveText(c0j.J7).setItems(stringArray).setItemsChoices(zArr).create();
        commonDialogCreate.addDialogCallback(new a());
        commonDialogCreate.showIfNeed(this.f19970a.getChildFragmentManager());
    }

    public void x(tz2 tz2Var) {
        if (tz2Var != null) {
            tz2 tz2Var2 = new tz2(tz2Var);
            this.f19971b = tz2Var2;
            i(tz2Var2.b(), this.f19971b.c());
            u();
        }
    }

    public void y(int i, int i2) {
        int i3 = i - 400;
        int[] iArrC = this.f19971b.c();
        if (iArrC == null || i3 < 0 || i3 >= iArrC.length) {
            return;
        }
        int[] iArr = (int[]) iArrC.clone();
        iArr[i3] = i2;
        this.f19971b.f(iArr);
        t(i3);
    }
}
