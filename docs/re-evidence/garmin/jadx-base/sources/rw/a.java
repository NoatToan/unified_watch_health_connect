package rw;

import android.view.MenuItem;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import e23.l;
import fw.m;
import fw.p;
import java.util.Calendar;
import o62.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r22.c0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a f154775b;

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar, int i14) {
        this.f154774a = i14;
        this.f154775b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Double systolic;
        Double diastolic;
        int i14 = this.f154774a;
        boolean z14 = true;
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar = this.f154775b;
        switch (i14) {
            case 0:
                Calendar calendar = (Calendar) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                calendar.getClass();
                AddBloodPressureActivity.f30909d.getClass();
                new c0(aVar.requireContext(), AddBloodPressureActivity.f30910e.getMillis(), c0.a(DateTime.now()).getMillis(), calendar, new b0(10, calendar, aVar)).show();
                return Unit.INSTANCE;
            case 1:
                Double d14 = (Double) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a2 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                y0<pw.a> y0Var = aVar.v6().f154816b;
                pw.a aVarD = y0Var.d();
                y0Var.m(aVarD != null ? pw.a.b(aVarD, d14, null, null, null, 1021) : null);
                return Unit.INSTANCE;
            case 2:
                Double d15 = (Double) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a3 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                y0<pw.a> y0Var2 = aVar.v6().f154816b;
                pw.a aVarD2 = y0Var2.d();
                y0Var2.m(aVarD2 != null ? pw.a.b(aVarD2, null, d15, null, null, 1019) : null);
                return Unit.INSTANCE;
            case 3:
                Double d16 = (Double) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a4 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                y0<pw.a> y0Var3 = aVar.v6().f154816b;
                pw.a aVarD3 = y0Var3.d();
                y0Var3.m(aVarD3 != null ? pw.a.b(aVarD3, null, null, d16, null, 1015) : null);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a5 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                y0<pw.a> y0Var4 = aVar.v6().f154816b;
                pw.a aVarD4 = y0Var4.d();
                y0Var4.m(aVarD4 != null ? pw.a.b(aVarD4, null, null, null, str, 991) : null);
                return Unit.INSTANCE;
            case 5:
                m mVar = (m) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a6 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                mVar.getClass();
                aVar.getClass();
                Boolean bool = (Boolean) mVar.f73770c;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                p pVar = mVar.f73769b;
                if (pVar == p.LOADING) {
                    g22.e.l(aVar);
                } else if (pVar == p.SUCCESS && zBooleanValue) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().T3(true);
                    g22.e.f(aVar);
                    aVar.u6(11);
                } else {
                    fw.c cVar = mVar.f73771d;
                    g22.e.f(aVar);
                    g22.e.a(aVar, cVar);
                    aVar.u6(12);
                }
                return Unit.INSTANCE;
            default:
                MenuItem menuItem = aVar.f30918b;
                if (menuItem == null) {
                    s.m("saveMenuItem");
                    throw null;
                }
                yw.d dVar = yw.d.f199882a;
                pw.a aVar2 = (pw.a) aVar.v6().f154817c.d();
                dVar.getClass();
                if (aVar2 == null || (systolic = aVar2.getSystolic()) == null) {
                    z14 = false;
                } else {
                    double dDoubleValue = systolic.doubleValue();
                    if (40.0d > dDoubleValue || dDoubleValue > 300.0d || (diastolic = aVar2.getDiastolic()) == null) {
                        z14 = false;
                    } else {
                        double dDoubleValue2 = diastolic.doubleValue();
                        if (30.0d > dDoubleValue2 || dDoubleValue2 > 200.0d) {
                            z14 = false;
                        } else {
                            Double pulse = aVar2.getPulse();
                            if (pulse != null) {
                                double dDoubleValue3 = pulse.doubleValue();
                                if (1.0d > dDoubleValue3 || dDoubleValue3 > 300.0d) {
                                    z14 = false;
                                }
                            }
                        }
                    }
                }
                menuItem.setEnabled(z14);
                return Unit.INSTANCE;
        }
    }
}
