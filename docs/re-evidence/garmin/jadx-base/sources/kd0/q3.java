package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/q3;", "Lbs0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q3 implements bs0.a {
    @Override // bs0.a
    public final void a() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_JET_LAG);
    }

    @Override // bs0.a
    public final void b(Context context, LocalDate localDate) {
        GCMCalendarActivity.a aVar = GCMCalendarActivity.F;
        int monthOfYear = localDate.getMonthOfYear();
        int year = localDate.getYear();
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) GCMCalendarActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("extra.specified_month", monthOfYear);
        bundle.putInt("extra.specified_year", year);
        bundle.putBoolean("extra.bottom.nav.bar.visibility", false);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
