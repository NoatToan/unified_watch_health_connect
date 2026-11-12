package defpackage;

import androidx.preference.Preference;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodpressure.ui.MeasureRemindPreferenceFragment;
import java.util.Objects;
import miuix.preference.PreferenceFragment;
import miuix.preference.TextPreference;

/* JADX INFO: loaded from: classes9.dex */
public class i2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceFragment f20707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tz2 f20708b;
    public TextPreference c;
    public TextPreference d;
    public TextPreference e;

    public i2m(MeasureRemindPreferenceFragment measureRemindPreferenceFragment) {
        this.f20707a = measureRemindPreferenceFragment;
        g();
    }

    public final <T extends Preference> T d(CharSequence charSequence) {
        return (T) this.f20707a.findPreference(charSequence);
    }

    public tz2 e() {
        return this.f20708b;
    }

    public int[] f() {
        tz2 tz2Var = this.f20708b;
        return tz2Var == null ? new int[0] : new int[]{300, tz2Var.c().length + 299};
    }

    public final void g() {
        TextPreference textPreference = (TextPreference) d("severe_remind1");
        Objects.requireNonNull(textPreference);
        this.c = textPreference;
        TextPreference textPreference2 = (TextPreference) d("severe_remind2");
        Objects.requireNonNull(textPreference2);
        this.d = textPreference2;
        TextPreference textPreference3 = (TextPreference) d("severe_remind3");
        Objects.requireNonNull(textPreference3);
        this.e = textPreference3;
        this.c.setTitle(this.f20707a.getString(c0j.v2, 1));
        this.d.setTitle(this.f20707a.getString(c0j.v2, 2));
        this.e.setTitle(this.f20707a.getString(c0j.v2, 3));
        this.c.setOnPreferenceClickListener(new Preference.d() { // from class: f2m
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f17338a.h(preference);
            }
        });
        this.d.setOnPreferenceClickListener(new Preference.d() { // from class: g2m
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f18507a.i(preference);
            }
        });
        this.e.setOnPreferenceClickListener(new Preference.d() { // from class: h2m
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f19619a.j(preference);
            }
        });
    }

    public final /* synthetic */ boolean h(Preference preference) {
        l(0);
        return true;
    }

    public final /* synthetic */ boolean i(Preference preference) {
        l(1);
        return true;
    }

    public final /* synthetic */ boolean j(Preference preference) {
        l(2);
        return true;
    }

    public final void k() {
        String minutesToHHMM = TimeUtils.parseMinutesToHHMM(this.f20708b.c()[0]);
        String minutesToHHMM2 = TimeUtils.parseMinutesToHHMM(this.f20708b.c()[1]);
        String minutesToHHMM3 = TimeUtils.parseMinutesToHHMM(this.f20708b.c()[2]);
        this.c.p(minutesToHHMM);
        this.d.p(minutesToHHMM2);
        this.e.p(minutesToHHMM3);
    }

    public final void l(int i) {
        tz2 tz2Var = this.f20708b;
        if (tz2Var == null) {
            return;
        }
        int[] iArrC = tz2Var.c();
        if (i < 0 || i >= iArrC.length) {
            return;
        }
        int i2 = iArrC[i];
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.v2, Integer.valueOf(i + 1))).create();
        hourMinutePickerDialogCreate.setRequestCode(i + 300);
        hourMinutePickerDialogCreate.setValue(i2 / 60, i2 % 60);
        hourMinutePickerDialogCreate.showIfNeed(this.f20707a.getChildFragmentManager());
    }

    public void m(tz2 tz2Var) {
        if (tz2Var != null) {
            this.f20708b = new tz2(tz2Var);
            k();
        }
    }

    public void n(int i, int i2) {
        int i3 = i - 300;
        int[] iArrC = this.f20708b.c();
        if (iArrC == null || i3 < 0 || i3 >= iArrC.length) {
            return;
        }
        int[] iArr = (int[]) iArrC.clone();
        iArr[i3] = i2;
        this.f20708b.f(iArr);
        k();
    }
}
