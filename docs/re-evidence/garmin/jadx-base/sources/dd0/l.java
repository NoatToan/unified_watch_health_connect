package dd0;

import android.text.format.DateFormat;
import android.widget.EditText;
import c22.l3;
import java.util.Calendar;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements j42.b.InterfaceC1852b, gg1.b.a, com.garmin.android.apps.connectmobile.settings.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.setup.wizard.g f59174a;

    public /* synthetic */ l(com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar) {
        this.f59174a = gVar;
    }

    @Override // gg1.b.a
    public void a(Calendar calendar) {
        com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar = this.f59174a;
        if (gVar.z6()) {
            if (calendar.getTimeInMillis() != -1) {
                gVar.f34540c = LocalDate.fromCalendarFields(calendar);
                gVar.C.setText(DateFormat.getDateFormat(gVar.getActivity()).format(calendar.getTime()));
            }
            gVar.u6();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar = this.f59174a;
        if (gVar.z6()) {
            gVar.f34538a = f14;
            EditText editText = gVar.A;
            androidx.fragment.app.m activity = gVar.getActivity();
            f12.l.f68084a.getClass();
            editText.setText(l3.f(f14, activity, f12.l.a.a().y()));
            gVar.u6();
        }
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar = this.f59174a;
        if (gVar.z6()) {
            gVar.f34539b = d14;
            EditText editText = gVar.B;
            androidx.fragment.app.m activity = gVar.getActivity();
            f12.l.f68084a.getClass();
            editText.setText(l3.l(d14, activity, f12.l.a.a().y()));
            gVar.u6();
        }
    }
}
