package lo;

import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements TimePickerDialog.OnTimeSetListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f113917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f113918c;

    public /* synthetic */ n(Calendar calendar, com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar) {
        this.f113916a = 1;
        this.f113917b = calendar;
        this.f113918c = aVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
        int i16 = this.f113916a;
        Object obj = this.f113917b;
        Object obj2 = this.f113918c;
        switch (i16) {
            case 0:
                t tVar = (t) obj2;
                Calendar calendar = (Calendar) obj;
                tVar.getClass();
                calendar.set(11, i14);
                calendar.set(12, i15);
                tVar.f113949a.P0(calendar);
                tVar.w6();
                return;
            case 1:
                Calendar calendar2 = (Calendar) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a) obj2;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                calendar2.set(11, i14);
                calendar2.set(12, i15);
                rw.g gVar = aVar.f30919c;
                if (gVar == null) {
                    p005kotlin.jvm.internal.s.m("viewBinder");
                    throw null;
                }
                gVar.b(calendar2);
                aVar.v6().f154818d = calendar2;
                return;
            case 2:
                vd1.d dVar = (vd1.d) obj;
                int i17 = vd1.d.f177451k;
                int i18 = (i14 * 60) + i15;
                if (((List) obj2).contains(Integer.valueOf(i18))) {
                    dVar.E6();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                List<Integer> listH = dVar.A6().h();
                if (listH == null) {
                    listH = p13.j0.f134944a;
                }
                arrayList.addAll(listH);
                arrayList.add(Integer.valueOf(i18));
                if (arrayList.size() > 1) {
                    p13.c0.u(arrayList, new vd1.d.b());
                }
                dVar.w6().debug("addReminderTime: new list size=[" + arrayList.size() + "]");
                dVar.A6().s(p13.h0.b1(arrayList));
                dVar.z6().notifyDataSetChanged();
                return;
            default:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b bVar = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b) obj2;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.a aVar2 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.f30933m;
                List listC = p13.w.c(Integer.valueOf((i14 * 60) + i15));
                bVar.A6().debug("addReminderTime: new list size=[" + listC.size() + "]");
                bVar.E6().s(p13.h0.b1(listC));
                bVar.f30934j = new DateTime().withTime(i14, i15, 0, 0);
                ((TextView) obj).setText(DateFormat.getTimeFormat(bVar.requireContext()).format(bVar.f30934j.toDate()));
                return;
        }
    }

    public /* synthetic */ n(int i14, Object obj, Object obj2) {
        this.f113916a = i14;
        this.f113918c = obj;
        this.f113917b = obj2;
    }
}
