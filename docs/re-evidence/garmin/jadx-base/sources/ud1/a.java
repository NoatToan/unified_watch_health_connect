package ud1;

import am.j;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import androidx.room.a0;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.e1;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import pd1.c;
import sd1.h;
import sz0.f;
import t13.d;
import v13.e;
import v13.i;
import yc.l2;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lud1/a;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.reminders.notifications.ReminderNotificationHelper$disableReminder$1$1", f = "ReminderNotificationHelper.kt", l = {415}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f170011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f170012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f170013d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, a aVar, d<? super b> dVar) {
            super(2, dVar);
            this.f170012c = cVar;
            this.f170013d = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f170012c, this.f170013d, dVar);
            bVar.f170011b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f170011b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170010a;
            c cVar = this.f170012c;
            if (i14 == 0) {
                r.b(obj);
                sd1.e eVarB = sd1.e.a.b(sd1.e.f158625a);
                this.f170011b = b0Var;
                this.f170010a = 1;
                obj = f0.J(eVarB, new h(cVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                a2 a2Var = a2.USER_REMINDERS;
                String strH = j.h(((v2.b) v2Var).f47387b, "saveReminders: success, got response code ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ReminderNotificationHelper", strH);
                this.f170013d.m(cVar);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                a2 a2Var2 = a2.USER_REMINDERS;
                String strG = a0.g(((v2.a) v2Var).f47384b, "saveReminders: failure, got response code ");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "ReminderNotificationHelper", strG);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new C3176a(null);
    }

    public static boolean h(Context context) {
        j22.b.f96736a.getClass();
        return !j22.b.l() || j22.b.a(context);
    }

    public static void n(Context context) {
        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(335544320);
        String string = context.getString(R.string.lbl_alarms_and_reminders_is_off);
        string.getClass();
        String string2 = context.getString(R.string.lbl_set_reminders_turn_on_alarms_and_reminders_in_settings);
        string2.getClass();
        sz0.e eVar = sz0.e.f161367g;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.i(16, true);
        qVar.f202683e = q.e(string);
        qVar.f202684f = q.e(string2);
        o oVar = new o();
        oVar.f202664e = q.e(string2);
        qVar.l(oVar);
        qVar.k(Settings.System.DEFAULT_NOTIFICATION_URI);
        qVar.B = StringLookupFactory.KEY_SYS;
        qVar.f202691m = 1;
        qVar.f202686h = PendingIntent.getActivity(context, 0, intent, 1140850688);
        f.a aVar = f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar.getClass();
        f.a.f(context, notificationC, 39, eVar);
    }

    public final void a(Context context, c cVar) {
        List<pd1.b> listF;
        context.getClass();
        a2 a2Var = a2.USER_REMINDERS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", "clearAllReminders: ");
        ArrayList<pd1.b> arrayListZ = (cVar == null || (listF = cVar.f()) == null) ? null : h0.Z(listF);
        if (arrayListZ != null) {
            for (pd1.b bVar : arrayListZ) {
                a2 a2Var2 = a2.USER_REMINDERS;
                String strI = a0.i("clearAllReminders: handling reminder with id=[", bVar.getUserReminderId(), "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "ReminderNotificationHelper", strI);
                List<Integer> listH = bVar.h();
                ArrayList arrayListZ2 = listH != null ? h0.Z(listH) : null;
                for (wd1.a aVar : w02.b0.i(bVar)) {
                    if (arrayListZ2 != null) {
                        Iterator it = arrayListZ2.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            a2 a2Var3 = a2.USER_REMINDERS;
                            String strE = t.e(iIntValue, "clearAllReminders: handling reminder on ", aVar.f184372a, " at ", " minutes");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "ReminderNotificationHelper", strE);
                            Context context2 = context;
                            PendingIntent pendingIntentF = f(context2, bVar.getUserReminderId(), aVar, iIntValue, bVar.getReminderText(), Boolean.valueOf(i(bVar)));
                            Object systemService = context2.getSystemService("alarm");
                            systemService.getClass();
                            ((AlarmManager) systemService).cancel(pendingIntentF);
                            context = context2;
                        }
                    }
                    context = context;
                }
            }
        } else {
            i2.a.p(a2Var, "ReminderNotificationHelper", "clearAllReminders: userReminderListDTO hasn't been initialized yet, not clearing anything");
        }
        a2 a2Var4 = a2.USER_REMINDERS;
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "ReminderNotificationHelper", "clearAllReminders: finished clearing reminders");
    }

    public final void b(Context context, wd1.a aVar, int i14) {
        List<pd1.b> listF;
        wd1.a aVar2 = aVar;
        context.getClass();
        aVar2.getClass();
        a2 a2Var = a2.USER_REMINDERS;
        String str = aVar2.f184372a;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", "clearReminderForDayByTimeIndex: " + str + " at timeIndex=" + i14);
        c cVarG = g();
        ArrayList<pd1.b> arrayListZ = (cVarG == null || (listF = cVarG.f()) == null) ? null : h0.Z(listF);
        if (arrayListZ != null) {
            for (pd1.b bVar : arrayListZ) {
                if (w02.b0.i(bVar).contains(aVar2)) {
                    List<Integer> listH = bVar.h();
                    Integer num = listH != null ? (Integer) h0.e0(i14, h0.Z(listH)) : null;
                    if (num != null) {
                        a2 a2Var2 = a2.USER_REMINDERS;
                        String strI = f3.i(l2.f("clearReminderForDayByTimeIndex: canceling reminder id=[", bVar.getUserReminderId(), "] on ", str, " at "), num, " minutes");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "ReminderNotificationHelper", strI);
                        PendingIntent pendingIntentF = f(context, bVar.getUserReminderId(), aVar2, num.intValue(), bVar.getReminderText(), Boolean.valueOf(i(bVar)));
                        Object systemService = context.getSystemService("alarm");
                        systemService.getClass();
                        ((AlarmManager) systemService).cancel(pendingIntentF);
                    } else {
                        a2 a2Var3 = a2.USER_REMINDERS;
                        StringBuilder sbF = l2.f("clearReminderForDayByTimeIndex: timeEntry is null for reminder id=[", bVar.getUserReminderId(), "] on ", str, " at timeIndex=");
                        sbF.append(i14);
                        String string = sbF.toString();
                        i2.f36769a.getClass();
                        i2.a.p(a2Var3, "ReminderNotificationHelper", string);
                    }
                }
                aVar2 = aVar;
            }
        } else {
            i2.a.p(a2Var, "ReminderNotificationHelper", "clearReminderForDayByTimeIndex: no reminders found");
        }
        a2 a2Var4 = a2.USER_REMINDERS;
        String strN = fb1.c.n("clearReminderForDayByTimeIndex: finished clearing reminders for ", str);
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "ReminderNotificationHelper", strN);
    }

    public final void c(Integer num) {
        List<pd1.b> listF;
        c cVarG = g();
        if (cVarG == null || (listF = cVarG.f()) == null) {
            return;
        }
        for (pd1.b bVar : listF) {
            if (s.g(bVar != null ? bVar.getUserReminderId() : null, num)) {
                if (bVar != null) {
                    bVar.m(Boolean.FALSE);
                }
                ge1.b.T(e1.f129333a, null, null, new b(cVarG, this, null), 3);
            }
        }
    }

    public abstract Intent d(Context context);

    public abstract String e(Context context);

    public final PendingIntent f(Context context, Integer num, wd1.a aVar, int i14, String str, Boolean bool) {
        a2 a2Var = a2.USER_REMINDERS;
        String strI = a0.i("getReminderIntent: creating for userReminderId=[", num, "]");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", strI);
        Intent intentD = d(context);
        intentD.setAction(e(context));
        if (num != null) {
            intentD.setData(Uri.parse(String.valueOf(num.intValue() * aVar.f184373b * i14)));
        }
        intentD.putExtra("REMINDER_TEXT_EXTRA", str);
        intentD.putExtra("DAY_OF_WEEK_EXTRA", aVar.f184373b);
        intentD.putExtra("MINUTES_PAST_MIDNIGHT_EXTRA", i14);
        intentD.putExtra("REMINDER_ID_EXTRA", num);
        intentD.putExtra("REMINDER_REPEAT_KEY", bool);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, (num != null ? num.intValue() : 0) + 3513 + i14, intentD, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    public abstract c g();

    public abstract boolean i(pd1.b bVar);

    public final void j(Context context, c cVar) {
        ArrayList<pd1.b> arrayList;
        List<Integer> listF;
        String occurrence;
        List<pd1.b> listF2 = cVar.f();
        if (listF2 != null) {
            ArrayList arrayListZ = h0.Z(listF2);
            arrayList = new ArrayList();
            for (Object obj : arrayListZ) {
                pd1.b bVar = (pd1.b) obj;
                if (s.g(bVar.getReminderType(), pd1.a.PREGNANCY.f137376a) || s.g(bVar.getReminderType(), pd1.a.BLOOD_PRESSURE.f137376a) || s.g(bVar.getReminderType(), pd1.a.LIFESTYLE_LOGGING.f137376a) || s.g(bVar.getReminderType(), pd1.a.GCNT.f137376a)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (!h(context)) {
            a2 a2Var = a2.USER_REMINDERS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ReminderNotificationHelper", "scheduleAllReminders: SCHEDULE_EXACT_ALARM permission required");
            n(context);
            return;
        }
        if (arrayList != null) {
            for (pd1.b bVar2 : arrayList) {
                if (s.g(bVar2.getEnabled(), Boolean.TRUE)) {
                    a2 a2Var2 = a2.USER_REMINDERS;
                    String str = "scheduleAllReminders: handling [" + bVar2.getReminderText() + "] with id=[" + bVar2.getUserReminderId() + "]";
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "ReminderNotificationHelper", str);
                    List<Integer> listF3 = bVar2.f();
                    boolean z14 = listF3 == null || listF3.size() != 1 || (listF = bVar2.f()) == null || !listF.contains(0) || (occurrence = bVar2.getOccurrence()) == null || !occurrence.equals("WEEKLY");
                    for (wd1.a aVar : w02.b0.i(bVar2)) {
                        List<Integer> listH = bVar2.h();
                        ArrayList arrayListZ2 = listH != null ? h0.Z(listH) : null;
                        boolean z15 = (arrayListZ2 != null ? arrayListZ2.size() : 0) > 1;
                        Integer num = arrayListZ2 != null ? (Integer) h0.o0(arrayListZ2) : null;
                        if (arrayListZ2 != null) {
                            Iterator it = arrayListZ2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                boolean z16 = (!z15 || num == null || num.intValue() == iIntValue) ? false : true;
                                DateTime dateTimeNow = DateTime.now();
                                dateTimeNow.getClass();
                                k(context, dateTimeNow, aVar, iIntValue, bVar2.getUserReminderId(), bVar2.getReminderText(), Boolean.valueOf(z14 || z16));
                            }
                        }
                    }
                } else {
                    a2 a2Var3 = a2.USER_REMINDERS;
                    String strI = a0.i("scheduleAllReminders: reminder with id=[", bVar2.getUserReminderId(), "] is disabled");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "ReminderNotificationHelper", strI);
                }
            }
        }
    }

    public final void k(Context context, DateTime dateTime, wd1.a aVar, int i14, Integer num, String str, Boolean bool) {
        context.getClass();
        aVar.getClass();
        String str2 = aVar.f184372a;
        DateTime dateTimePlusMinutes = k.n(aVar.f184373b, dateTime).withTimeAtStartOfDay().plusMinutes(i14);
        if (dateTimePlusMinutes.isBeforeNow()) {
            dateTimePlusMinutes = dateTimePlusMinutes.plusWeeks(1);
        }
        DateTime dateTime2 = dateTimePlusMinutes;
        a2 a2Var = a2.USER_REMINDERS;
        String strI = f3.i(p6.b.i("scheduleReminder: Setting for ", str2, " at ", dateTime2.toString("h:mm a"), ", id=["), num, "]");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", strI);
        if (!h(context)) {
            i2.a.b(a2Var, "ReminderNotificationHelper", "scheduleReminder: SCHEDULE_EXACT_ALARM permission required");
            n(context);
            return;
        }
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        ((AlarmManager) systemService).setExactAndAllowWhileIdle(0, dateTime2.getMillis(), f(context, num, aVar, i14, str, bool));
        StringBuilder sbI = p6.b.i("scheduleReminder: Set for ", str2, " at ", dateTime2.toString("h:mm a"), ", id=[");
        sbI.append(num);
        sbI.append("]");
        i2.a.b(a2Var, "ReminderNotificationHelper", sbI.toString());
    }

    public final void l(Context context, wd1.a aVar, int i14) {
        ArrayList<pd1.b> arrayList;
        List<pd1.b> listF;
        wd1.a aVar2 = aVar;
        context.getClass();
        aVar2.getClass();
        a2 a2Var = a2.USER_REMINDERS;
        String str = aVar2.f184372a;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", "scheduleReminderForDayByTimeIndex: " + str + " at timeIndex=" + i14);
        c cVarG = g();
        if (cVarG == null || (listF = cVarG.f()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayListZ = h0.Z(listF);
            arrayList = new ArrayList();
            for (Object obj : arrayListZ) {
                if (s.g(((pd1.b) obj).getReminderType(), pd1.a.LIFESTYLE_LOGGING.f137376a)) {
                    arrayList.add(obj);
                }
            }
        }
        if (!h(context)) {
            a2 a2Var2 = a2.USER_REMINDERS;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ReminderNotificationHelper", "scheduleReminderForDayByTimeIndex: SCHEDULE_EXACT_ALARM permission required");
            n(context);
            return;
        }
        if (arrayList != null) {
            for (pd1.b bVar : arrayList) {
                if (s.g(bVar.getEnabled(), Boolean.TRUE) && w02.b0.i(bVar).contains(aVar2)) {
                    List<Integer> listH = bVar.h();
                    Integer num = listH != null ? (Integer) h0.e0(i14, h0.Z(listH)) : null;
                    if (num != null) {
                        a2 a2Var3 = a2.USER_REMINDERS;
                        String strI = f3.i(l2.f("scheduleReminderForDayByTimeIndex: scheduling reminder id=[", bVar.getUserReminderId(), "] on ", str, " at "), num, " minutes");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "ReminderNotificationHelper", strI);
                        boolean zI = i(bVar);
                        DateTime dateTimeNow = DateTime.now();
                        dateTimeNow.getClass();
                        k(context, dateTimeNow, aVar2, num.intValue(), bVar.getUserReminderId(), bVar.getReminderText(), Boolean.valueOf(zI));
                    } else {
                        a2 a2Var4 = a2.USER_REMINDERS;
                        StringBuilder sbF = l2.f("scheduleReminderForDayByTimeIndex: timeEntry is null for reminder id=[", bVar.getUserReminderId(), "] on ", str, " at timeIndex=");
                        sbF.append(i14);
                        String string = sbF.toString();
                        i2.f36769a.getClass();
                        i2.a.p(a2Var4, "ReminderNotificationHelper", string);
                    }
                }
                aVar2 = aVar;
            }
        }
    }

    public abstract void m(c cVar);

    public final void o(Context context, c cVar) {
        context.getClass();
        cVar.getClass();
        a2 a2Var = a2.USER_REMINDERS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ReminderNotificationHelper", "updateReminders: getting old reminders in GCMSettingManager");
        c cVarG = g();
        i2.a.b(a2Var, "ReminderNotificationHelper", "updateReminders: oldReminders are " + cVarG);
        i2.a.b(a2Var, "ReminderNotificationHelper", "updateReminders: clearAllReminders");
        a(context, cVarG);
        i2.a.b(a2Var, "ReminderNotificationHelper", "updateReminders: setting new reminders in GCMSettingManager");
        i2.a.b(a2Var, "ReminderNotificationHelper", "updateReminders: new reminders are " + cVar);
        m(cVar);
        i2.a.b(a2Var, "ReminderNotificationHelper", "updateReminders: scheduleAllReminders");
        j(context, cVar);
    }

    /* JADX INFO: renamed from: ud1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lud1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "REMINDER_TEXT_EXTRA_KEY", "REMINDER_DAY_OF_WEEK_ID_KEY", "REMINDER_MINUTES_PAST_MIDNIGHT_KEY", "REMINDER_ID_EXTRA_KEY", "REMINDER_REPEAT_KEY", "", "REMINDER_START_ID", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3176a {
        public /* synthetic */ C3176a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3176a() {
        }
    }
}
