package defpackage;

import android.content.DialogInterface;
import androidx.preference.Preference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindUtils;
import java.util.Objects;
import miuix.preference.PreferenceFragment;
import miuix.preference.TextPreference;

/* JADX INFO: loaded from: classes9.dex */
public class gxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceFragment f19433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextPreference f19434b;
    public TextPreference c;
    public TextPreference d;
    public int e;
    public tz2 f;

    public class a extends av6 {
        public a() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            super.onDialogClick(str, dialogInterface, i);
            gxf.this.e(i);
        }
    }

    public gxf(PreferenceFragment preferenceFragment) {
        this.f19433a = preferenceFragment;
        j();
    }

    public final void e(int i) {
        if (i >= 0 && i < 3) {
            this.e = i;
            return;
        }
        if (i != -1) {
            this.e = h();
        }
        this.f.g(BloodPressureRemindUtils.getMidRepeatByArrayIndex(this.e));
        this.f19434b.p(BloodPressureRemindUtils.getMidRepeatString(this.f19433a.requireContext(), this.e));
    }

    public final <T extends Preference> T f(CharSequence charSequence) {
        return (T) this.f19433a.findPreference(charSequence);
    }

    public tz2 g() {
        return this.f;
    }

    public final int h() {
        tz2 tz2Var = this.f;
        if (tz2Var == null) {
            return 0;
        }
        return BloodPressureRemindUtils.getMidArrayRepeatIndex(tz2Var.d());
    }

    public int[] i() {
        tz2 tz2Var = this.f;
        return tz2Var == null ? new int[0] : new int[]{100, tz2Var.c().length + 99};
    }

    public final void j() {
        TextPreference textPreference = (TextPreference) f("mid_repeat_mode");
        Objects.requireNonNull(textPreference);
        this.f19434b = textPreference;
        TextPreference textPreference2 = (TextPreference) f("mid_remind1");
        Objects.requireNonNull(textPreference2);
        this.c = textPreference2;
        TextPreference textPreference3 = (TextPreference) f("mid_remind2");
        Objects.requireNonNull(textPreference3);
        this.d = textPreference3;
        this.c.setTitle(this.f19433a.getString(c0j.v2, 1));
        this.d.setTitle(this.f19433a.getString(c0j.v2, 2));
        this.f19434b.setOnPreferenceClickListener(new Preference.d() { // from class: dxf
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f16032a.k(preference);
            }
        });
        this.c.setOnPreferenceClickListener(new Preference.d() { // from class: exf
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f17162a.l(preference);
            }
        });
        this.d.setOnPreferenceClickListener(new Preference.d() { // from class: fxf
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f18348a.m(preference);
            }
        });
    }

    public final /* synthetic */ boolean k(Preference preference) {
        o();
        return true;
    }

    public final /* synthetic */ boolean l(Preference preference) {
        p(0);
        return true;
    }

    public final /* synthetic */ boolean m(Preference preference) {
        p(1);
        return true;
    }

    public final void n() {
        String midRepeatString = BloodPressureRemindUtils.getMidRepeatString(this.f19433a.requireContext(), h());
        String minutesToHHMM = TimeUtils.parseMinutesToHHMM(this.f.c()[0]);
        String minutesToHHMM2 = TimeUtils.parseMinutesToHHMM(this.f.c()[1]);
        this.f19434b.p(midRepeatString);
        this.c.p(minutesToHHMM);
        this.d.p(minutesToHHMM2);
    }

    public final void o() {
        if (this.f == null) {
            return;
        }
        int iH = h();
        CommonDialog commonDialogCreate = new CommonDialog.c("mid_repeat").setDialogTitle(c0j.w2).setNegativeText(c0j.D7).setPositiveText(c0j.J7).setItems(this.f19433a.requireContext().getResources().getStringArray(ohi.c)).setItemsCheckedIndex(iH).create();
        commonDialogCreate.addDialogCallback(new a());
        commonDialogCreate.showIfNeed(this.f19433a.getChildFragmentManager());
        this.e = iH;
    }

    public final void p(int i) {
        tz2 tz2Var = this.f;
        if (tz2Var == null) {
            return;
        }
        int[] iArrC = tz2Var.c();
        if (i < 0 || i >= iArrC.length) {
            return;
        }
        int i2 = iArrC[i];
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.v2, Integer.valueOf(i + 1))).create();
        hourMinutePickerDialogCreate.setRequestCode(i + 100);
        hourMinutePickerDialogCreate.setValue(i2 / 60, i2 % 60);
        hourMinutePickerDialogCreate.showIfNeed(this.f19433a.getChildFragmentManager());
    }

    public void q(tz2 tz2Var) {
        if (tz2Var != null) {
            this.f = new tz2(tz2Var);
            n();
        }
    }

    public void r(int i, int i2) {
        int i3 = i - 100;
        int[] iArrC = this.f.c();
        if (iArrC == null || i3 < 0 || i3 >= iArrC.length) {
            return;
        }
        int[] iArr = (int[]) iArrC.clone();
        iArr[i3] = i2;
        this.f.f(iArr);
        n();
    }
}
