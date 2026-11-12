package zb0;

import android.text.format.DateFormat;
import android.widget.EditText;
import c22.l3;
import java.util.Calendar;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q1 implements com.garmin.android.apps.connectmobile.settings.d.a, j42.b.InterfaceC1852b, gg1.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f203620a;

    public /* synthetic */ q1(r1 r1Var) {
        this.f203620a = r1Var;
    }

    @Override // gg1.b.a
    public void a(Calendar calendar) {
        r1 r1Var = this.f203620a;
        if (r1Var.z6()) {
            if (calendar.getTimeInMillis() != -1) {
                r1Var.f203626c = LocalDate.fromCalendarFields(calendar);
                r1Var.f203648z.setText(DateFormat.getDateFormat(r1Var.getActivity()).format(calendar.getTime()));
            }
            r1Var.u6();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        r1 r1Var = this.f203620a;
        if (r1Var.z6()) {
            r1Var.f203624a = f14;
            EditText editText = r1Var.f203646x;
            androidx.fragment.app.m activity = r1Var.getActivity();
            f12.l.f68084a.getClass();
            editText.setText(l3.f(f14, activity, f12.l.a.a().y()));
            r1Var.u6();
        }
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        r1 r1Var = this.f203620a;
        if (r1Var.z6()) {
            r1Var.f203625b = d14;
            EditText editText = r1Var.f203647y;
            androidx.fragment.app.m activity = r1Var.getActivity();
            f12.l.f68084a.getClass();
            editText.setText(l3.l(d14, activity, f12.l.a.a().y()));
            r1Var.u6();
        }
    }
}
