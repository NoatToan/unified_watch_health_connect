package hy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import com.garmin.android.apps.connectmobile.l2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarDetailsActivity f86325b;

    public /* synthetic */ e(CalendarDetailsActivity calendarDetailsActivity, int i14) {
        this.f86324a = i14;
        this.f86325b = calendarDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        int i14 = this.f86324a;
        CalendarDetailsActivity calendarDetailsActivity = this.f86325b;
        switch (i14) {
            case 0:
                CalendarDetailsActivity.b bVar = CalendarDetailsActivity.f31194p;
                calendarDetailsActivity.ua().f73858g = true;
                e32.j jVar = (e32.j) calendarDetailsActivity.oa();
                if (jVar != null) {
                    jVar.a();
                }
                return Unit.INSTANCE;
            default:
                CalendarDetailsActivity.b bVar2 = CalendarDetailsActivity.f31194p;
                l2.a aVar = l2.f37135b;
                Intent intent = calendarDetailsActivity.getIntent();
                aVar.getClass();
                Bundle bundleA = l2.a.a(intent);
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = bundleA != null ? (Parcelable) bundleA.getParcelable("GCM_calendar_data", CalendarDTO.class) : null;
                } else {
                    Parcelable parcelable2 = bundleA != null ? bundleA.getParcelable("GCM_calendar_data") : null;
                    if (!(parcelable2 instanceof CalendarDTO)) {
                        parcelable2 = null;
                    }
                    parcelable = (CalendarDTO) parcelable2;
                }
                CalendarDTO calendarDTO = (CalendarDTO) parcelable;
                Bundle bundleA2 = l2.a.a(calendarDetailsActivity.getIntent());
                return new fy.d(calendarDTO, bundleA2 != null ? bundleA2.getString("GCM_extra_connection_group_id") : null);
        }
    }
}
