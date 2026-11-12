package defpackage;

import android.content.Context;
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
public class mwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceFragment f27287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextPreference f27288b;
    public TextPreference c;
    public int d;
    public tz2 e;

    public class a extends av6 {
        public a() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            super.onDialogClick(str, dialogInterface, i);
            mwg.this.d(i);
        }
    }

    public mwg(PreferenceFragment preferenceFragment) {
        this.f27287a = preferenceFragment;
        j();
    }

    public final void d(int i) {
        if (i >= 0 && i < 7) {
            this.d = i;
            return;
        }
        if (i != -1) {
            this.d = g();
        }
        this.e.g(BloodPressureRemindUtils.getNormalRepeatByArrayIndex(this.d));
        this.f27288b.p(h(this.f27287a.requireContext(), this.d));
    }

    public final <T extends Preference> T e(CharSequence charSequence) {
        return (T) this.f27287a.findPreference(charSequence);
    }

    public tz2 f() {
        return this.e;
    }

    public final int g() {
        tz2 tz2Var = this.e;
        if (tz2Var == null) {
            return 0;
        }
        return BloodPressureRemindUtils.getNormalArrayRepeatIndex(tz2Var.d());
    }

    public final String h(Context context, int i) {
        String[] stringArray = context.getResources().getStringArray(ohi.d);
        return (i < 0 || i >= stringArray.length) ? context.getString(c0j.h2) : stringArray[i];
    }

    public int[] i() {
        tz2 tz2Var = this.e;
        return tz2Var == null ? new int[0] : new int[]{90, tz2Var.c().length + 89};
    }

    public final void j() {
        TextPreference textPreference = (TextPreference) e("normal_repeat_mode");
        Objects.requireNonNull(textPreference);
        this.f27288b = textPreference;
        TextPreference textPreference2 = (TextPreference) e("normal_remind");
        Objects.requireNonNull(textPreference2);
        this.c = textPreference2;
        textPreference2.setTitle(this.f27287a.getString(c0j.u2));
        this.f27288b.setOnPreferenceClickListener(new Preference.d() { // from class: kwg
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f24370a.k(preference);
            }
        });
        this.c.setOnPreferenceClickListener(new Preference.d() { // from class: lwg
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f25495a.l(preference);
            }
        });
    }

    public final /* synthetic */ boolean k(Preference preference) {
        n();
        return true;
    }

    public final /* synthetic */ boolean l(Preference preference) {
        o();
        return true;
    }

    public final void m() {
        String strH = h(this.f27287a.requireContext(), g());
        String minutesToHHMM = TimeUtils.parseMinutesToHHMM(this.e.c()[0]);
        this.f27288b.p(strH);
        this.c.p(minutesToHHMM);
    }

    public final void n() {
        if (this.e == null) {
            return;
        }
        int iG = g();
        CommonDialog commonDialogCreate = new CommonDialog.c("normal_repeat").setDialogTitle(c0j.w2).setNegativeText(c0j.D7).setPositiveText(c0j.J7).setItems(this.f27287a.requireContext().getResources().getStringArray(ohi.d)).setItemsCheckedIndex(iG).create();
        commonDialogCreate.addDialogCallback(new a());
        commonDialogCreate.showIfNeed(this.f27287a.getChildFragmentManager());
        this.d = iG;
    }

    public final void o() {
        tz2 tz2Var = this.e;
        if (tz2Var == null) {
            return;
        }
        int[] iArrC = tz2Var.c();
        if (iArrC.length <= 0) {
            return;
        }
        int i = iArrC[0];
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.u2, new Object[0])).create();
        hourMinutePickerDialogCreate.setRequestCode(90);
        hourMinutePickerDialogCreate.setValue(i / 60, i % 60);
        hourMinutePickerDialogCreate.showIfNeed(this.f27287a.getChildFragmentManager());
    }

    public void p(tz2 tz2Var) {
        if (tz2Var != null) {
            this.e = new tz2(tz2Var);
            m();
        }
    }

    public void q(int i, int i2) {
        int i3 = i - 90;
        int[] iArrC = this.e.c();
        if (iArrC == null || i3 < 0 || i3 >= iArrC.length) {
            return;
        }
        int[] iArr = (int[]) iArrC.clone();
        iArr[i3] = i2;
        this.e.f(iArr);
        m();
    }
}
