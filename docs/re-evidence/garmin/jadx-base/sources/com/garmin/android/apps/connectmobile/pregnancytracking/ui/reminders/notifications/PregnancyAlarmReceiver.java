package com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.notifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import n61.h;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sz0.e;
import sz0.f;
import tb1.b;
import wd1.a;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/reminders/notifications/PregnancyAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyAlarmReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40932b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f40933a = m.b(new h(19));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string;
        a aVar;
        t tVar = this.f40933a;
        com.airbnb.lottie.animation.keyframe.a.u("onReceive: action=[", intent != null ? intent.getAction() : null, "]", (Logger) tVar.getValue());
        if (context != null) {
            if (s.g(intent != null ? intent.getAction() : null, new nb1.a().e(context))) {
                Bundle extras = intent.getExtras();
                if (extras == null || (string = extras.getString("REMINDER_TEXT_EXTRA")) == null) {
                    vb.h.z("Intent must have the notification text as an extra.");
                    return;
                }
                Bundle extras2 = intent.getExtras();
                Integer numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt("DAY_OF_WEEK_EXTRA")) : null;
                Bundle extras3 = intent.getExtras();
                if (extras3 == null) {
                    vb.h.z("Intent must have an extra value for minutes past midnight.");
                    return;
                }
                int i14 = extras3.getInt("MINUTES_PAST_MIDNIGHT_EXTRA");
                a[] aVarArrValues = a.values();
                int length = aVarArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        aVar = null;
                        break;
                    }
                    a aVar2 = aVarArrValues[i15];
                    int i16 = aVar2.f184373b;
                    if (numValueOf != null && i16 == numValueOf.intValue()) {
                        aVar = aVar2;
                        break;
                    }
                    i15++;
                }
                if (aVar == null) {
                    vb.h.z(a0.i("Intent must have a DayOfWeekUtil apiValue extra value: could not find [", numValueOf, "]"));
                    return;
                }
                Bundle extras4 = intent.getExtras();
                Integer numValueOf2 = extras4 != null ? Integer.valueOf(extras4.getInt("REMINDER_ID_EXTRA")) : null;
                Bundle extras5 = intent.getExtras();
                Boolean boolValueOf = extras5 != null ? Boolean.valueOf(extras5.getBoolean("REMINDER_REPEAT_KEY")) : null;
                if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y1() != ww0.a.PREGNANT) {
                    ((Logger) tVar.getValue()).info("Non-Pregnancy CycleType Disabling reminder");
                    new nb1.a().c(numValueOf2);
                    nb1.a aVar3 = new nb1.a();
                    GarminConnectMobileApp.f28685g.getClass();
                    aVar3.a(GarminConnectMobileApp.a.a(), ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).O());
                    return;
                }
                e eVar = e.B;
                q qVar = new q(context, eVar.f161386a);
                Notification notification = qVar.N;
                notification.icon = 2131232010;
                qVar.f202683e = q.e(context.getString(R.string.pregnancy_pregnancy_reminder));
                qVar.f202684f = q.e(string);
                qVar.B = "reminder";
                notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
                qVar.f202691m = 1;
                new nb1.a();
                qVar.f202686h = ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).d(context);
                Notification notificationC = qVar.c();
                notificationC.flags = 16;
                ((Logger) tVar.getValue()).debug("Showing GCM notification to: ".concat(string));
                f.a aVar4 = f.f161394a;
                int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                aVar4.getClass();
                f.a.f(context, notificationC, iIntValue + 31 + i14, eVar);
                if (!s.g(boolValueOf, Boolean.TRUE)) {
                    ((Logger) tVar.getValue()).debug("Disabling the reminder");
                    new nb1.a().c(numValueOf2);
                    return;
                }
                ((Logger) tVar.getValue()).debug("Scheduling next reminder");
                nb1.a aVar5 = new nb1.a();
                DateTime dateTimePlusDays = DateTime.now().plusDays(1);
                dateTimePlusDays.getClass();
                aVar5.k(context, dateTimePlusDays, aVar, i14, numValueOf2, string, boolValueOf);
            }
        }
    }
}
