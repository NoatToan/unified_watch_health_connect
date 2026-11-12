package defpackage;

import androidx.preference.Preference;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.bloodpressure.ui.MeasureRemindPreferenceFragment;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import java.util.Objects;
import miuix.preference.PreferenceFragment;
import miuix.preference.TextPreference;

/* JADX INFO: loaded from: classes9.dex */
public class j7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceFragment f22488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tz2 f22489b;
    public TextPreference c;
    public TextPreference d;

    public j7g(MeasureRemindPreferenceFragment measureRemindPreferenceFragment) {
        this.f22488a = measureRemindPreferenceFragment;
        e();
    }

    public final <T extends Preference> T c(CharSequence charSequence) {
        return (T) this.f22488a.findPreference(charSequence);
    }

    public int[] d() {
        tz2 tz2Var = this.f22489b;
        return tz2Var == null ? new int[0] : new int[]{200, tz2Var.c().length + 199};
    }

    public final void e() {
        TextPreference textPreference = (TextPreference) c("moderate_remind1");
        Objects.requireNonNull(textPreference);
        this.c = textPreference;
        TextPreference textPreference2 = (TextPreference) c("moderate_remind2");
        Objects.requireNonNull(textPreference2);
        this.d = textPreference2;
        this.c.setTitle(this.f22488a.getString(c0j.v2, 1));
        this.d.setTitle(this.f22488a.getString(c0j.v2, 2));
        this.c.setOnPreferenceClickListener(new Preference.d() { // from class: h7g
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f19776a.f(preference);
            }
        });
        this.d.setOnPreferenceClickListener(new Preference.d() { // from class: i7g
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                return this.f20859a.g(preference);
            }
        });
    }

    public final /* synthetic */ boolean f(Preference preference) {
        i(0);
        return true;
    }

    public final /* synthetic */ boolean g(Preference preference) {
        i(1);
        return true;
    }

    public final void h() {
        String minutesToHHMM = TimeUtils.parseMinutesToHHMM(this.f22489b.c()[0]);
        String minutesToHHMM2 = TimeUtils.parseMinutesToHHMM(this.f22489b.c()[1]);
        this.c.p(minutesToHHMM);
        this.d.p(minutesToHHMM2);
    }

    public final void i(int i) {
        tz2 tz2Var = this.f22489b;
        if (tz2Var == null) {
            return;
        }
        int[] iArrC = tz2Var.c();
        if (i < 0 || i >= iArrC.length) {
            return;
        }
        int i2 = iArrC[i];
        HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setPositiveText(c0j.J7).setNegativeText(c0j.D7).setCancelable(false).setDialogTitle(new DialogParams.DialogDescriptionString(c0j.v2, Integer.valueOf(i + 1))).create();
        hourMinutePickerDialogCreate.setRequestCode(i + 200);
        hourMinutePickerDialogCreate.setValue(i2 / 60, i2 % 60);
        hourMinutePickerDialogCreate.showIfNeed(this.f22488a.getChildFragmentManager());
    }

    public void j(tz2 tz2Var) {
        if (tz2Var != null) {
            this.f22489b = new tz2(tz2Var);
            h();
        }
    }

    public void k(int i, int i2) {
        int i3 = i + OTAErrorCode.READ_FRIMWARE_VERSION_FAIL;
        int[] iArrC = this.f22489b.c();
        if (iArrC == null || i3 < 0 || i3 >= iArrC.length) {
            return;
        }
        int[] iArr = (int[]) iArrC.clone();
        iArr[i3] = i2;
        this.f22489b.f(iArr);
        h();
    }
}
