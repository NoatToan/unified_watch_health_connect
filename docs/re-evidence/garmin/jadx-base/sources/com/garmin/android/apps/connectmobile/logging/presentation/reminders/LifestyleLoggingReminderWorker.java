package com.garmin.android.apps.connectmobile.logging.presentation.reminders;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import b63.i;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import g22.l;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import sz0.e;
import sz0.f;
import t13.d;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/logging/presentation/reminders/LifestyleLoggingReminderWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LifestyleLoggingReminderWorker extends CoroutineWorker {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38688a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.MORNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.EVENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38688a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifestyleLoggingReminderWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        com.garmin.android.apps.connectmobile.logging.presentation.reminders.a aVarA;
        Object next;
        WorkerParameters workerParameters = this.f11470b;
        try {
            c cVar = workerParameters.f11427b;
            c cVar2 = workerParameters.f11427b;
            String strE = cVar.e("reminder_text_key");
            if (strE != null) {
                com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.f38689b.getClass();
                aVarA = com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.C0685a.a(strE);
                if (aVarA == null) {
                    aVarA = com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.EVENING;
                }
            } else {
                aVarA = com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.EVENING;
            }
            int iC = cVar2.c("reminder_day_of_week_id", -1);
            int iC2 = cVar2.c("reminder_minutes_past_midnight", -1);
            int iC3 = cVar2.c("reminder_id", -1);
            boolean zA = cVar2.a("reminder_repeat", false);
            if (iC2 < 0) {
                a2 a2Var = a2.USER_REMINDERS;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingReminderWorker", "doWork: Invalid minutesPastMidnight value");
                return new androidx.work.d.a.C0165a();
            }
            w13.c cVar3 = wd1.a.f184371l;
            cVar3.getClass();
            p13.c.b bVar = new p13.c.b();
            do {
                if (!bVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bVar.next();
            } while (((wd1.a) next).f184373b != iC);
            wd1.a aVar = (wd1.a) next;
            if (aVar == null) {
                i2.f36769a.getClass();
                i2.a.b(a2.USER_REMINDERS, "LifestyleLoggingReminderWorker", "doWork: Could not find DayOfWeekUtil for apiValue: " + iC);
                return new androidx.work.d.a.C0165a();
            }
            d(aVarA, iC3);
            if (zA) {
                i2.f36769a.getClass();
                i2.a.b(a2.USER_REMINDERS, "LifestyleLoggingReminderWorker", "doWork: Rescheduling repeating reminder: id=" + iC3 + ", dayOfWeek=" + aVar + ", minutesPastMidnight=" + iC2);
                fw0.b bVar2 = new fw0.b(aVarA == com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.MORNING);
                Context context = this.f11469a;
                context.getClass();
                DateTime dateTimePlusDays = DateTime.now().plusDays(1);
                dateTimePlusDays.getClass();
                bVar2.k(context, dateTimePlusDays, aVar, iC2, new Integer(iC3), strE, Boolean.valueOf(zA));
            } else {
                i2.f36769a.getClass();
                i2.a.b(a2.USER_REMINDERS, "LifestyleLoggingReminderWorker", "doWork: Disabling non-repeating reminder: id=" + iC3);
                new fw0.b(aVarA == com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.MORNING).c(new Integer(iC3));
            }
            return new androidx.work.d.a.c();
        } catch (Exception e4) {
            a2 a2Var2 = a2.USER_REMINDERS;
            String strN = fb1.c.n("doWork: Exception occurred: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "LifestyleLoggingReminderWorker", strN);
            return new androidx.work.d.a.C0165a();
        }
    }

    public final void d(com.garmin.android.apps.connectmobile.logging.presentation.reminders.a aVar, int i14) {
        String string;
        Context context = this.f11469a;
        context.getClass();
        l22.a aVar2 = new l22.a(context);
        int i15 = b.f38688a[aVar.ordinal()];
        if (i15 == 1) {
            string = aVar2.getString(R.string.msg_lifestyle_logging_morning_notification);
        } else {
            if (i15 != 2) {
                u0.r();
                return;
            }
            string = aVar2.getString(R.string.msg_lifestyle_logging_evening_notification);
        }
        fw0.b bVar = new fw0.b(aVar == com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.MORNING);
        e eVar = e.f161372k0;
        q qVar = new q(context, eVar.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = q.e(aVar2.getString(R.string.lbl_lifestyle_logging_reminder));
        qVar.f202684f = q.e(string);
        qVar.B = "reminder";
        notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
        qVar.f202691m = 1;
        zd1.a.f204221a.getClass();
        Intent intent = new Intent(context, (Class<?>) LifestyleLoggingActivity.class);
        zd1.a.C3809a c3809a = new zd1.a.C3809a(intent);
        boolean z14 = bVar.f73778a;
        if (z14) {
            o oVarD = l.d(o.INSTANCE);
            i.INSTANCE.getClass();
            c3809a.a(b63.q.c(oVarD, 1, i.f16190d));
        }
        Unit unit = Unit.INSTANCE;
        intent.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, z14 ? 1 : 0, intent, 201326592);
        activity.getClass();
        qVar.f202686h = activity;
        Notification notificationC = qVar.c();
        notificationC.flags = 16;
        f.f161394a.getClass();
        f.a.f(context, notificationC, i14 + 40, eVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/logging/presentation/reminders/LifestyleLoggingReminderWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "REMINDER_TEXT_EXTRA_KEY", "REMINDER_DAY_OF_WEEK_ID_KEY", "REMINDER_MINUTES_PAST_MIDNIGHT_KEY", "REMINDER_ID_EXTRA_KEY", "REMINDER_REPEAT_KEY", "WORKER_TAG", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
