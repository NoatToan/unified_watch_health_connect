package com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sz0.e;
import sz0.f;
import vb.h;
import z6.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/BloodPressureAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BloodPressureAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string;
        wd1.a aVar;
        if (context != null) {
            if (s.g(intent != null ? intent.getAction() : null, new xw.a().e(context))) {
                Bundle extras = intent.getExtras();
                if (extras == null || (string = extras.getString("REMINDER_TEXT_EXTRA")) == null) {
                    h.z("Intent must have the notification text as an extra.");
                    return;
                }
                Bundle extras2 = intent.getExtras();
                Integer numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt("DAY_OF_WEEK_EXTRA")) : null;
                Bundle extras3 = intent.getExtras();
                if (extras3 == null) {
                    h.z("Intent must have an extra value for minutes past midnight.");
                    return;
                }
                int i14 = extras3.getInt("MINUTES_PAST_MIDNIGHT_EXTRA");
                wd1.a[] aVarArrValues = wd1.a.values();
                int length = aVarArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i15];
                    int i16 = aVar.f184373b;
                    if (numValueOf != null && i16 == numValueOf.intValue()) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (aVar == null) {
                    h.z(a0.i("Intent must have a DayOfWeekUtil apiValue extra value: could not find [", numValueOf, "]"));
                    return;
                }
                Bundle extras4 = intent.getExtras();
                Integer numValueOf2 = extras4 != null ? Integer.valueOf(extras4.getInt("REMINDER_ID_EXTRA")) : null;
                Bundle extras5 = intent.getExtras();
                Boolean boolValueOf = extras5 != null ? Boolean.valueOf(extras5.getBoolean("REMINDER_REPEAT_KEY")) : null;
                e eVar = e.E;
                q qVar = new q(context, eVar.f161386a);
                Notification notification = qVar.N;
                notification.icon = 2131232010;
                qVar.f202683e = q.e(context.getString(R.string.lbl_blood_pressure_reminder));
                qVar.f202684f = q.e(string);
                qVar.B = "reminder";
                notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
                qVar.f202691m = 1;
                new xw.a();
                Intent intent2 = new Intent(context, (Class<?>) BloodPressureReportsActivity.class);
                intent2.addFlags(335544320);
                PendingIntent activity = PendingIntent.getActivity(context, 0, intent2, 201326592);
                activity.getClass();
                qVar.f202686h = activity;
                Notification notificationC = qVar.c();
                notificationC.flags = 16;
                f.a aVar2 = f.f161394a;
                int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                aVar2.getClass();
                f.a.f(context, notificationC, iIntValue + 36 + i14, eVar);
                if (!s.g(boolValueOf, Boolean.TRUE)) {
                    new xw.a().c(numValueOf2);
                    return;
                }
                xw.a aVar3 = new xw.a();
                DateTime dateTimePlusDays = DateTime.now().plusDays(1);
                dateTimePlusDays.getClass();
                aVar3.k(context, dateTimePlusDays, aVar, i14, numValueOf2, string, boolValueOf);
            }
        }
    }
}
