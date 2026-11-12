package com.garmin.android.apps.connectmobile.nutrition.domain.reminders;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.a0;
import b11.c;
import b21.l4;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import f01.f;
import java.util.Map;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q01.j;
import sz0.e;
import vb.h;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/domain/reminders/NutritionAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NutritionAlarmReceiver extends BroadcastReceiver {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39575a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f39575a = iArr;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string;
        String strB;
        String strD;
        Object next;
        if (context != null) {
            if (s.g(intent != null ? intent.getAction() : null, new t01.a(null, null, 3, null).e(context))) {
                l22.a aVar = new l22.a(context);
                Map<String, j> mapP = ((e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, 6, null)).p();
                String string2 = aVar.getString(R.string.nutrition_tracking_reminder_title);
                Bundle extras = intent.getExtras();
                if (extras == null || (string = extras.getString("REMINDER_TEXT_EXTRA")) == null) {
                    h.z("Intent must have the notification text as an extra.");
                    return;
                }
                f.f67690b.getClass();
                f fVarA = f.a.a(string);
                if ((fVarA == null ? -1 : a.f39575a[fVarA.ordinal()]) == 1) {
                    strD = aVar.getString(R.string.nutrition_tracking_reminder_text_generic_today);
                } else {
                    j jVar = mapP.get(string);
                    if (jVar != null) {
                        c.a aVar2 = c.f14245d;
                        String str = jVar.f142035a;
                        boolean z14 = jVar.f142036b;
                        aVar2.getClass();
                        strB = c.a.b(str, aVar, z14);
                    } else {
                        strB = string;
                    }
                    x0.f23314a.getClass();
                    strD = aVar.d(g2.b(x0.Sf), strB);
                }
                Bundle extras2 = intent.getExtras();
                Integer numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt("DAY_OF_WEEK_EXTRA")) : null;
                Bundle extras3 = intent.getExtras();
                if (extras3 == null) {
                    h.z("Intent must have an extra value for minutes past midnight.");
                    return;
                }
                int i14 = extras3.getInt("MINUTES_PAST_MIDNIGHT_EXTRA");
                w13.c cVar = wd1.a.f184371l;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                do {
                    if (!bVarN.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarN.next();
                } while (!(numValueOf != null && ((wd1.a) next).f184373b == numValueOf.intValue()));
                wd1.a aVar3 = (wd1.a) next;
                if (aVar3 == null) {
                    h.z(a0.i("Intent must have a DayOfWeekUtil apiValue extra value: could not find [", numValueOf, "]"));
                    return;
                }
                Bundle extras4 = intent.getExtras();
                Integer numValueOf2 = extras4 != null ? Integer.valueOf(extras4.getInt("REMINDER_ID_EXTRA")) : null;
                Bundle extras5 = intent.getExtras();
                Boolean boolValueOf = extras5 != null ? Boolean.valueOf(extras5.getBoolean("REMINDER_REPEAT_KEY")) : null;
                e eVar = e.H0;
                q qVar = new q(context, eVar.f161386a);
                Notification notification = qVar.N;
                notification.icon = 2131232010;
                qVar.f202683e = q.e(string2);
                qVar.f202684f = q.e(strD);
                qVar.B = "reminder";
                notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
                qVar.f202691m = 1;
                t01.a aVar4 = new t01.a(string, numValueOf2);
                Boolean bool = boolValueOf;
                Intent intentA = NutritionActivity.a.a(NutritionActivity.f39581f, context, null, null, new l4.x0(aVar4.f161671a), false, false, 54);
                intentA.addFlags(335544320);
                Integer num = aVar4.f161672b;
                PendingIntent activity = PendingIntent.getActivity(context, (num != null ? num.intValue() : 0) + 42, intentA, 201326592);
                activity.getClass();
                qVar.f202686h = activity;
                Notification notificationC = qVar.c();
                notificationC.flags = 16;
                sz0.f.a aVar5 = sz0.f.f161394a;
                int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                aVar5.getClass();
                sz0.f.a.f(context, notificationC, iIntValue + 42, eVar);
                if (!s.g(bool, Boolean.TRUE)) {
                    new t01.a(null, null, 3, null).c(numValueOf2);
                    return;
                }
                t01.a aVar6 = new t01.a(null, null, 3, null);
                DateTime dateTimePlusDays = DateTime.now().plusDays(1);
                dateTimePlusDays.getClass();
                aVar6.k(context, dateTimePlusDays, aVar3, i14, numValueOf2, string, bool);
            }
        }
    }
}
