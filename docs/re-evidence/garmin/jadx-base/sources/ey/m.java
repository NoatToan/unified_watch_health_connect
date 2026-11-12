package ey;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"Ley/m;", "Le32/e;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends e32.e<fw.m<? extends CalendarDTO>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GCMCalendarActivity f67100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f67101b;

    public m(GCMCalendarActivity gCMCalendarActivity, DateTime dateTime) {
        this.f67100a = gCMCalendarActivity;
        this.f67101b = dateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.e
    public final void a(fw.m<? extends CalendarDTO> mVar) {
        List<CalendarItemDTO.b> listD;
        fw.m<? extends CalendarDTO> mVar2 = mVar;
        fw.p pVar = fw.p.ERROR;
        fw.p pVar2 = mVar2.f73769b;
        GCMCalendarActivity gCMCalendarActivity = this.f67100a;
        if (pVar == pVar2) {
            GCMCalendarActivity.a aVar = GCMCalendarActivity.F;
            gCMCalendarActivity.ma();
            fw.c cVar = mVar2.f73771d;
            gCMCalendarActivity.getClass();
            if (cVar != null && !(cVar instanceof fw.h) && !(cVar instanceof fw.o)) {
                Toast.makeText(gCMCalendarActivity, R.string.txt_error_occurred, 0).show();
            }
        }
        if (fw.p.SUCCESS == pVar2) {
            gCMCalendarActivity.f31081r = (CalendarDTO) mVar2.f73770c;
            gCMCalendarActivity.qa(this.f67101b);
            com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = gCMCalendarActivity.f31070g;
            fVar.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.b bVar = gCMCalendarActivity.f31069f;
            List<? extends CalendarItemDTO.b> listZ = (bVar == null || (listD = bVar.d()) == null) ? null : h0.Z(listD);
            if (listZ == null) {
                listZ = j0.f134944a;
            }
            listZ.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.d dVarV6 = fVar.v6(fVar.f31113h, fVar.f31114i);
            if (dVarV6 != null) {
                dVarV6.f31168q = listZ;
            }
        }
    }
}
