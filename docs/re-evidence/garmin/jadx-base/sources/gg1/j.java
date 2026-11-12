package gg1;

import android.content.SharedPreferences;
import androidx.preference.Preference;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements r22.g0.a, com.garmin.android.apps.connectmobile.view.a.InterfaceC0927a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.a f77251b;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.settings.a aVar, int i14) {
        this.f77250a = i14;
        this.f77251b = aVar;
    }

    @Override // com.garmin.android.apps.connectmobile.view.a.InterfaceC0927a
    public void a(int i14, Number number) {
        int i15 = this.f77250a;
        com.garmin.android.apps.connectmobile.settings.a aVar = this.f77251b;
        switch (i15) {
            case 2:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a = com.garmin.android.apps.connectmobile.settings.a.Y;
                number.getClass();
                Preference preference = aVar.f41578k;
                if (preference != null) {
                    preference.y(aVar.w6(number.doubleValue(), i14));
                }
                SharedPreferences.Editor editorEdit = bd.f.a(aVar.requireContext()).edit();
                editorEdit.putFloat(aVar.getString(R.string.key_running_measured_distance), number.floatValue());
                editorEdit.putInt(aVar.getString(R.string.key_running_measured_distance_unit), i14);
                editorEdit.apply();
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a2 = com.garmin.android.apps.connectmobile.settings.a.Y;
                number.getClass();
                if (number.doubleValue() > 0.0d) {
                    Preference preference2 = aVar.f41576i;
                    if (preference2 != null) {
                        preference2.y(aVar.w6(number.doubleValue(), i14));
                    }
                    SharedPreferences.Editor editorEdit2 = bd.f.a(aVar.requireContext()).edit();
                    editorEdit2.putFloat(aVar.getString(R.string.key_walking_measured_distance), number.floatValue());
                    editorEdit2.putInt(aVar.getString(R.string.key_walking_measured_distance_unit), i14);
                    editorEdit2.apply();
                }
                break;
        }
    }

    @Override // r22.g0.a
    public void b(double d14) {
        int i14 = this.f77250a;
        com.garmin.android.apps.connectmobile.settings.a aVar = this.f77251b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a = com.garmin.android.apps.connectmobile.settings.a.Y;
                if (d14 > 0.0d) {
                    SharedPreferences.Editor editorEdit = bd.f.a(aVar.requireContext()).edit();
                    editorEdit.putString(aVar.getString(R.string.key_walking_total_steps), String.valueOf((int) d14));
                    editorEdit.apply();
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.a.C0790a c0790a2 = com.garmin.android.apps.connectmobile.settings.a.Y;
                if (d14 > 0.0d) {
                    SharedPreferences.Editor editorEdit2 = bd.f.a(aVar.requireContext()).edit();
                    editorEdit2.putString(aVar.getString(R.string.key_running_total_steps), String.valueOf((int) d14));
                    editorEdit2.apply();
                }
                break;
        }
    }
}
