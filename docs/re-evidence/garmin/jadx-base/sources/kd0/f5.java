package kd0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyGenesisActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.notifications.PregnancyAlarmReceiver;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/f5;", "Ltb1/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f5 implements tb1.b {
    @Override // tb1.b
    public final Intent a(Context context) {
        return new Intent(context, (Class<?>) PregnancyLogDeliveryDateActivity.class);
    }

    @Override // tb1.b
    public final Intent b(Context context, boolean z14) {
        PregnancyGenesisActivity.a aVar = PregnancyGenesisActivity.f40516b;
        tb1.e.f163745a.getClass();
        return PregnancyGenesisActivity.a.a(aVar, context, tb1.e.a.h(), false, DateTime.now(), false, z14, 32);
    }

    @Override // tb1.b
    public final Intent c(Context context) {
        return sn.a.d(context, context, PregnancyAlarmReceiver.class);
    }

    @Override // tb1.b
    public final PendingIntent d(Context context) {
        Intent intentA = PregnancyGenesisActivity.a.a(PregnancyGenesisActivity.f40516b, context, false, true, null, false, false, 120);
        intentA.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
        activity.getClass();
        return activity;
    }
}
