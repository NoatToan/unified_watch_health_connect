package com.garmin.android.apps.connectmobile.menstrualcycle.reminders;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jg.b;
import lc.u0;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;
import sz0.e;
import sz0.f;
import vb.h;
import wn1.d0;
import z6.a0;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/reminders/MenstrualCycleReminders;", "", "<init>", "()V", "Receiver", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleReminders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39205a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f39206b = m.b(new d0(18));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f39207c = m.b(new d0(19));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/reminders/MenstrualCycleReminders$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Receiver extends BroadcastReceiver {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39208a;

            static {
                int[] iArr = new int[kx0.a.values().length];
                try {
                    iArr[kx0.a.DAILY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kx0.a.WEEKLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kx0.a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39208a = iArr;
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            LocalDate localDateG;
            context.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "MenstrualCycleReminders", "In MenstrualCycleReminders.Receiver::onReceive");
            i2.a.b(a2Var, "MenstrualCycleReminders", "intent.action=" + (intent != null ? intent.getAction() : null));
            MenstrualCycleReminders.f39205a.getClass();
            a.c();
            i52.a.f91796a.getClass();
            if (i52.a.l() != ww0.a.INACTIVE && i52.a.l() != ww0.a.PREGNANT) {
                l.a aVar2 = l.f68084a;
                aVar2.getClass();
                if (!l.a.a().d1()) {
                    aVar2.getClass();
                    if (!l.a.a().y0()) {
                        i2.a.b(a2Var, "MenstrualCycleReminders", "Notifications enabled=" + a0.a(context).f202582b.areNotificationsEnabled());
                        String action = intent != null ? intent.getAction() : null;
                        if (s.g(action, (String) MenstrualCycleReminders.f39206b.getValue())) {
                            i2.a.b(a2Var, "MenstrualCycleReminders", "Displaying MC period reminder");
                            String strG = i52.a.g();
                            Intent intentB = MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, context, false, DateTime.now(), 16);
                            intentB.addFlags(335544320);
                            PendingIntent activity = PendingIntent.getActivity(context, 3501, intentB, 201326592);
                            q qVar = new q(context, "REMINDER_CHANNEL_ID");
                            qVar.N.icon = 2131232010;
                            qVar.g(context.getString(R.string.mct_its_about_that_time));
                            qVar.f(strG);
                            qVar.i(16, true);
                            qVar.f202686h = activity;
                            qVar.B = "reminder";
                            o oVar = new o();
                            oVar.f202664e = q.e(strG);
                            qVar.l(oVar);
                            Notification notificationC = qVar.c();
                            notificationC.getClass();
                            f.a aVar3 = f.f161394a;
                            e eVar = e.B;
                            aVar3.getClass();
                            f.a.f(context, notificationC, 3501, eVar);
                            return;
                        }
                        if (s.g(action, (String) MenstrualCycleReminders.f39207c.getValue())) {
                            int i14 = a.f39208a[i52.a.d().ordinal()];
                            if (i14 == 1) {
                                LocalDate localDateNow = LocalDate.now();
                                localDateNow.getClass();
                                localDateG = b.G(localDateNow);
                            } else if (i14 == 2) {
                                localDateG = LocalDate.now().plusWeeks(1);
                            } else {
                                if (i14 != 3) {
                                    u0.r();
                                    return;
                                }
                                localDateG = null;
                            }
                            if (localDateG != null) {
                                LocalDateTime localDateTime = localDateG.toLocalDateTime(i52.a.f());
                                localDateTime.getClass();
                                a.e(context, localDateTime, 0);
                            }
                            String string = i52.a.f91797b.getString(i52.a.c(R.string.key_mct_logged_symptoms_date), null);
                            if (string != null && i52.a.d() == kx0.a.DAILY && string.equals(LocalDate.now().toString())) {
                                return;
                            }
                            i2.a.b(a2Var, "MenstrualCycleReminders", "Displaying MC logging reminder");
                            String strE = i52.a.e();
                            Intent intentB2 = MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, context, false, DateTime.now(), 16);
                            intentB2.addFlags(335544320);
                            PendingIntent activity2 = PendingIntent.getActivity(context, 3507, intentB2, 201326592);
                            q qVar2 = new q(context, "REMINDER_CHANNEL_ID");
                            qVar2.N.icon = 2131232010;
                            qVar2.g(context.getString(R.string.mct_dont_forget_to_log));
                            qVar2.f(strE);
                            qVar2.i(16, true);
                            qVar2.f202686h = activity2;
                            qVar2.B = "reminder";
                            o oVar2 = new o();
                            oVar2.f202664e = q.e(strE);
                            qVar2.l(oVar2);
                            Notification notificationC2 = qVar2.c();
                            notificationC2.getClass();
                            f.a aVar4 = f.f161394a;
                            e eVar2 = e.B;
                            aVar4.getClass();
                            f.a.f(context, notificationC2, 3507, eVar2);
                            return;
                        }
                        return;
                    }
                }
            }
            i2.a.b(a2Var, "MenstrualCycleReminders", "User is inactive or pregnant - not displaying MC notifications.");
        }
    }

    private MenstrualCycleReminders() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/reminders/MenstrualCycleReminders$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MCT_PERIOD_REMINDER_START_ID", "I", "MCT_LOGGING_REMINDER_START_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.reminders.MenstrualCycleReminders$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0697a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f39210b;

            static {
                int[] iArr = new int[kx0.a.values().length];
                try {
                    iArr[kx0.a.DAILY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kx0.a.WEEKLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kx0.a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39209a = iArr;
                int[] iArr2 = new int[gg1.m.values().length];
                try {
                    iArr2[gg1.m.SATURDAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[gg1.m.SUNDAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[gg1.m.MONDAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[gg1.m.TUESDAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[gg1.m.WEDNESDAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[gg1.m.THURSDAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[gg1.m.FRIDAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused10) {
                }
                f39210b = iArr2;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context) {
            context.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "MenstrualCycleReminders", "In MenstrualCycleReminders.clearAllReminders");
            c();
            Object systemService = context.getSystemService("alarm");
            systemService.getClass();
            AlarmManager alarmManager = (AlarmManager) systemService;
            for (int i14 = 0; i14 < 6; i14++) {
                Intent intent = new Intent(context, (Class<?>) Receiver.class);
                a aVar2 = MenstrualCycleReminders.f39205a;
                aVar2.getClass();
                intent.setAction((String) MenstrualCycleReminders.f39207c.getValue());
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i14 + 3507, intent, 201326592);
                broadcast.getClass();
                alarmManager.cancel(broadcast);
                Intent intent2 = new Intent(context, (Class<?>) Receiver.class);
                aVar2.getClass();
                intent2.setAction((String) MenstrualCycleReminders.f39206b.getValue());
                PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i14 + 3501, intent2, 201326592);
                broadcast2.getClass();
                alarmManager.cancel(broadcast2);
            }
        }

        public static void b(Context context) {
            context.getClass();
            if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
                return;
            }
            i52.a.f91796a.getClass();
            if (i52.a.d() == kx0.a.ON_START) {
                kx0.a aVar = kx0.a.WEEKLY;
                aVar.getClass();
                i52.a.f91797b.edit().putString(i52.a.c(R.string.key_mct_logging_reminder_frequency), aVar.name()).apply();
            }
        }

        public static void c() {
            i52.a.f91796a.getClass();
            String strName = i52.a.l().name();
            l.a aVar = l.f68084a;
            aVar.getClass();
            boolean zD1 = l.a.a().d1();
            aVar.getClass();
            boolean zY0 = l.a.a().y0();
            StringBuilder sbD = zl.a.d("MHSettings.cycleType=", strName, ", MHSettings.isUserPregnant=", zD1, ", MHSettings.hasCurrentPregnancy=");
            sbD.append(zY0);
            String string = sbD.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "MenstrualCycleReminders", string);
        }

        public static void d(Context context, String str, AlarmManager alarmManager, LocalDateTime localDateTime, PendingIntent pendingIntent) {
            j22.b.f96736a.getClass();
            if (j22.b.l() && !j22.b.a(context)) {
                String str2 = "No permission to schedule exact alarms - unable to schedule MC " + str + " reminder for " + localDateTime + " with the alarm service!";
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "MenstrualCycleReminders", str2);
                return;
            }
            String str3 = "Has permission to schedule exact alarms - scheduling MC " + str + " reminder for " + localDateTime + " with the alarm service.";
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "MenstrualCycleReminders", str3);
            alarmManager.setExactAndAllowWhileIdle(0, localDateTime.toDate().getTime(), pendingIntent);
        }

        public static void e(Context context, LocalDateTime localDateTime, int i14) {
            Object systemService = context.getSystemService("alarm");
            systemService.getClass();
            Intent intent = new Intent(context, (Class<?>) Receiver.class);
            MenstrualCycleReminders.f39205a.getClass();
            intent.setAction((String) MenstrualCycleReminders.f39207c.getValue());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i14 + 3507, intent, 201326592);
            broadcast.getClass();
            d(context, "logging", (AlarmManager) systemService, localDateTime, broadcast);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:62:0x019c  */
        public static void f(Context context) {
            ArrayList arrayList;
            LocalDateTime localDateTime;
            context.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "MenstrualCycleReminders", "In MenstrualCycleReminders.scheduleReminders");
            c();
            b(context);
            a(context);
            yx0.b.f200016a.getClass();
            Object value = yx0.b.f200019d.getValue();
            value.getClass();
            Set<String> stringSet = ((SharedPreferences) value).getStringSet("periodStartDates", null);
            List<String> listB1 = stringSet != null ? h0.b1(stringSet) : null;
            if (listB1 != null) {
                arrayList = new ArrayList(y.r(listB1, 10));
                for (String str : listB1) {
                    try {
                        arrayList.add(LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd")));
                    } catch (Exception e4) {
                        h.u(am.j.m("Cannot parse local date value: ", str, "."), e4);
                        return;
                    }
                }
            } else {
                arrayList = null;
            }
            List listM0 = arrayList != null ? h0.M0(arrayList) : null;
            if (listM0 == null) {
                listM0 = j0.f134944a;
            }
            i52.a.f91796a.getClass();
            SharedPreferences sharedPreferences = i52.a.f91797b;
            int i14 = 3;
            if (sharedPreferences.getBoolean(i52.a.c(R.string.key_mct_period_reminder_enabled), true) && com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
                LocalTime localTimeH = i52.a.h();
                int i15 = sharedPreferences.getInt(i52.a.c(R.string.key_mct_period_reminder_occurrence), 3);
                int size = listM0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    LocalDateTime localDateTime2 = ((LocalDate) listM0.get(i16)).minusDays(i15).toLocalDateTime(localTimeH);
                    if (localDateTime2.compareTo((ReadablePartial) LocalDateTime.now()) >= 0) {
                        Object systemService = context.getSystemService("alarm");
                        systemService.getClass();
                        Intent intent = new Intent(context, (Class<?>) Receiver.class);
                        MenstrualCycleReminders.f39205a.getClass();
                        intent.setAction((String) MenstrualCycleReminders.f39206b.getValue());
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, i16 + 3501, intent, 201326592);
                        broadcast.getClass();
                        d(context, "period", (AlarmManager) systemService, localDateTime2, broadcast);
                    }
                }
            }
            i52.a.f91796a.getClass();
            if (i52.a.f91797b.getBoolean(i52.a.c(R.string.key_mct_logging_reminder_enabled), true)) {
                LocalTime localTimeF = i52.a.f();
                if (i52.a.d() == kx0.a.ON_START) {
                    int size2 = listM0.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        LocalDateTime localDateTime3 = ((LocalDate) listM0.get(i17)).toLocalDateTime(localTimeF);
                        if (localDateTime3.compareTo((ReadablePartial) LocalDateTime.now()) >= 0) {
                            e(context, localDateTime3, i17);
                        }
                    }
                    return;
                }
                int i18 = C0697a.f39209a[i52.a.d().ordinal()];
                if (i18 == 1) {
                    localDateTime = LocalDate.now().toLocalDateTime(localTimeF);
                    if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                        localDateTime = localDateTime.plusDays(1);
                    }
                } else {
                    if (i18 == 2) {
                        switch (C0697a.f39210b[((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().ordinal()]) {
                            case 1:
                                i14 = 6;
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            case 2:
                                i14 = 7;
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            case 3:
                                i14 = 1;
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            case 4:
                                i14 = 2;
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            case 5:
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            case 6:
                                i14 = 4;
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            case 7:
                                i14 = 5;
                                localDateTime = LocalDate.now().withDayOfWeek(i14).toLocalDateTime(localTimeF);
                                if (localDateTime.compareTo((ReadablePartial) LocalDateTime.now()) < 0) {
                                    localDateTime = localDateTime.plusWeeks(1);
                                    localDateTime.getClass();
                                }
                                break;
                            default:
                                u0.r();
                                break;
                        }
                        return;
                    }
                    if (i18 != 3) {
                        u0.r();
                        return;
                    }
                    localDateTime = new LocalDateTime();
                }
                localDateTime.getClass();
                e(context, localDateTime, 0);
            }
        }

        private a() {
        }
    }
}
