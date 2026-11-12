package fb1;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements TimePickerDialog.OnTimeSetListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f70232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f70233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f70234d;

    public /* synthetic */ f(p005kotlin.jvm.internal.r0 r0Var, DateTime dateTime, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar) {
        this.f70231a = 1;
        this.f70232b = r0Var;
        this.f70233c = dateTime;
        this.f70234d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
        int i16 = this.f70231a;
        Fragment fragment = this.f70234d;
        Serializable serializable = this.f70232b;
        DateTime dateTime = this.f70233c;
        switch (i16) {
            case 0:
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) serializable;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b) fragment;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                DateTime dateTimeWithZone = new DateTime().withYear(dateTime.getYear()).withMonthOfYear(dateTime.getMonthOfYear()).withDayOfMonth(dateTime.getDayOfMonth()).withHourOfDay(i14).withMinuteOfHour(i15).withSecondOfMinute(0).withMillisOfSecond(0).withZone(dateTime.getZone());
                if (dateTimeWithZone.compareTo((ReadableInstant) r0Var.f105810a) < 0) {
                    dateTimeWithZone = new DateTime(((DateTime) r0Var.f105810a).getMillis() + ((long) DateTimeConstants.MILLIS_PER_MINUTE));
                }
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = bVar.f40458a;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mEndTime");
                    throw null;
                }
                c22.j0 j0Var = c22.j0.f23099a;
                int hourOfDay = dateTimeWithZone.getHourOfDay();
                int minuteOfHour = dateTimeWithZone.getMinuteOfHour();
                j0Var.getClass();
                gCMPregnancyTwoLineButton.setButtonValueLabel(c22.j0.C(hourOfDay, minuteOfHour));
                db1.a aVar2 = bVar.f40467j;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                    throw null;
                }
                aVar2.i(Integer.valueOf(((int) ((dateTimeWithZone.getMillis() - ((DateTime) r0Var.f105810a).getMillis()) / ((long) 1000))) + 60));
                bVar.requireActivity().invalidateOptionsMenu();
                return;
            case 1:
                p005kotlin.jvm.internal.r0 r0Var2 = (p005kotlin.jvm.internal.r0) serializable;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar2 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b) fragment;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                DateTime dateTimeWithZone2 = new DateTime().withYear(((DateTime) r0Var2.f105810a).getYear()).withMonthOfYear(((DateTime) r0Var2.f105810a).getMonthOfYear()).withDayOfMonth(((DateTime) r0Var2.f105810a).getDayOfMonth()).withHourOfDay(i14).withMinuteOfHour(i15).withSecondOfMinute(0).withMillisOfSecond(0).withZone(((DateTime) r0Var2.f105810a).getZone());
                if (dateTimeWithZone2.compareTo((ReadableInstant) dateTime) > 0) {
                    dateTimeWithZone2 = new DateTime(dateTime.getMillis() - ((long) DateTimeConstants.MILLIS_PER_MINUTE));
                }
                db1.a aVar4 = bVar2.f40467j;
                if (aVar4 == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                    throw null;
                }
                aVar4.k(dateTimeWithZone2);
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = bVar2.f40460c;
                if (gCMPregnancyTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("mStartTime");
                    throw null;
                }
                c22.j0 j0Var2 = c22.j0.f23099a;
                int hourOfDay2 = dateTimeWithZone2.getHourOfDay();
                int minuteOfHour2 = dateTimeWithZone2.getMinuteOfHour();
                j0Var2.getClass();
                gCMPregnancyTwoLineButton2.setButtonValueLabel(c22.j0.C(hourOfDay2, minuteOfHour2));
                db1.a aVar5 = bVar2.f40467j;
                if (aVar5 == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                    throw null;
                }
                aVar5.i(Integer.valueOf(((int) ((dateTime.getMillis() - dateTimeWithZone2.getMillis()) / ((long) 1000))) + 60));
                bVar2.requireActivity().invalidateOptionsMenu();
                return;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h) fragment;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                DateTime dateTimeWithMillisOfSecond = new DateTime().withYear(dateTime.getYear()).withMonthOfYear(dateTime.getMonthOfYear()).withDayOfMonth(dateTime.getDayOfMonth()).withHourOfDay(i14).withMinuteOfHour(i15).withZone(((DateTime) serializable).getZone()).withSecondOfMinute(0).withMillisOfSecond(0);
                String strC6 = hVar.C6(i14, i15);
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton3 = hVar.f40637e;
                if (gCMPregnancyTwoLineButton3 == null) {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseTimeField");
                    throw null;
                }
                gCMPregnancyTwoLineButton3.setButtonValueLabel(strC6);
                if (hVar.f40648p) {
                    db1.t tVar = hVar.f40645m;
                    if (tVar == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                        throw null;
                    }
                    tVar.q(dateTimeWithMillisOfSecond);
                    db1.t tVar2 = hVar.f40645m;
                    if (tVar2 == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                        throw null;
                    }
                    tVar2.h(dateTimeWithMillisOfSecond);
                } else {
                    db1.r rVar = hVar.f40643k;
                    if (rVar == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                        throw null;
                    }
                    rVar.t(dateTimeWithMillisOfSecond);
                }
                hVar.requireActivity().invalidateOptionsMenu();
                return;
        }
    }

    public /* synthetic */ f(DateTime dateTime, Serializable serializable, Fragment fragment, int i14) {
        this.f70231a = i14;
        this.f70233c = dateTime;
        this.f70232b = serializable;
        this.f70234d = fragment;
    }
}
