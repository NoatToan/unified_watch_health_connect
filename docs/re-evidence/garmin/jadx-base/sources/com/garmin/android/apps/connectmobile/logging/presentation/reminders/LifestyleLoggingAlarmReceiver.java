package com.garmin.android.apps.connectmobile.logging.presentation.reminders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.a0;
import androidx.work.d;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fb1.c;
import fw0.b;
import i3.e5;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ue.i0;
import ue.l;
import ue.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/logging/presentation/reminders/LifestyleLoggingAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LifestyleLoggingAlarmReceiver extends BroadcastReceiver {
    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.garmin.android.apps.connectmobile.logging.presentation.reminders.a aVarA;
        Bundle extras;
        if (context == null) {
            return;
        }
        Object obj = null;
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("REMINDER_TEXT_EXTRA");
        if (string != null) {
            com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.f38689b.getClass();
            aVarA = com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.C0685a.a(string);
            if (aVarA == null) {
                aVarA = com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.EVENING;
            }
        } else {
            aVarA = com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.EVENING;
        }
        if (!s.g(intent != null ? intent.getAction() : null, new b(aVarA == com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.MORNING).e(context))) {
            a2 a2Var = a2.USER_REMINDERS;
            String strN = c.n("onReceive: Unknown action received: ", intent != null ? intent.getAction() : null);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "LifestyleLoggingAlarmReceiver", strN);
            return;
        }
        a2 a2Var2 = a2.USER_REMINDERS;
        String strN2 = c.n("onReceive: Received lifestyle logging reminder alarm for type: ", string);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "LifestyleLoggingAlarmReceiver", strN2);
        Bundle extras2 = intent.getExtras();
        Integer numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt("DAY_OF_WEEK_EXTRA")) : null;
        Bundle extras3 = intent.getExtras();
        int i14 = extras3 != null ? extras3.getInt("MINUTES_PAST_MIDNIGHT_EXTRA", -1) : -1;
        Bundle extras4 = intent.getExtras();
        Integer numValueOf2 = extras4 != null ? Integer.valueOf(extras4.getInt("REMINDER_ID_EXTRA")) : null;
        Bundle extras5 = intent.getExtras();
        boolean z14 = extras5 != null ? extras5.getBoolean("REMINDER_REPEAT_KEY", false) : false;
        if (i14 < 0 || numValueOf == null) {
            i2.a.b(a2Var2, "LifestyleLoggingAlarmReceiver", "onReceive: Invalid intent extras");
            return;
        }
        w13.c cVar = wd1.a.f184371l;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (((wd1.a) next).f184373b == numValueOf.intValue()) {
                obj = next;
                break;
            }
        }
        if (((wd1.a) obj) == null) {
            a2 a2Var3 = a2.USER_REMINDERS;
            String strG = a0.g(numValueOf, "onReceive: Could not find DayOfWeekUtil for apiValue: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "LifestyleLoggingAlarmReceiver", strG);
            return;
        }
        androidx.work.c.a aVar = new androidx.work.c.a();
        LinkedHashMap linkedHashMap = aVar.f11467a;
        linkedHashMap.put("reminder_text_key", string);
        linkedHashMap.put("reminder_day_of_week_id", numValueOf);
        linkedHashMap.put("reminder_minutes_past_midnight", Integer.valueOf(i14));
        linkedHashMap.put("reminder_id", Integer.valueOf(numValueOf2 != null ? numValueOf2.intValue() : -1));
        linkedHashMap.put("reminder_repeat", Boolean.valueOf(z14));
        com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).c(e5.f(numValueOf2 == null ? "default" : numValueOf2, "lifestyle_logging_reminder_worker_"), l.REPLACE, new x.a((Class<? extends d>) LifestyleLoggingReminderWorker.class).f(aVar.a()).a());
        a2 a2Var4 = a2.USER_REMINDERS;
        String strG2 = a0.g(numValueOf2, "enqueueReminderWorker: Enqueued worker for reminder id=");
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "LifestyleLoggingAlarmReceiver", strG2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/logging/presentation/reminders/LifestyleLoggingAlarmReceiver$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
