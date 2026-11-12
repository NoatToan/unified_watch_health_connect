package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.StaleDataException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.util.Pair;
import androidx.work.PeriodicWorkRequest;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.basichealthmodel.receiver.ReminderReceiver;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class cfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f1522a;
    private static List<Integer> d;
    private static final HashMap<Integer, int[]> e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f1524c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, String> f1523b = Collections.synchronizedMap(new HashMap());

    private static boolean b(int i, int i2) {
        if (i < 12 || i > 14) {
            return true;
        }
        return i == 14 && i2 > 0;
    }

    public static int d(int i) {
        return i * 10000;
    }

    public static int e(int i) {
        return (i * 10000) + 9000;
    }

    private static int f(int i) {
        if (i == 3006) {
            return 22;
        }
        if (i == 3011) {
            return 12;
        }
        return i == 3013 ? 3 : 1;
    }

    private static boolean h(int i) {
        switch (i) {
            case 10:
            case 11:
            case 12:
                return false;
            default:
                return true;
        }
    }

    static {
        HashMap map = new HashMap();
        f1522a = map;
        HashMap<Integer, int[]> map2 = new HashMap<>();
        e = map2;
        d = Collections.synchronizedList(new ArrayList());
        map.put(1, 3000);
        Integer numValueOf = Integer.valueOf(IEventListener.EVENT_ID_DEVICE_RTSP_CONN);
        map.put(2, numValueOf);
        Integer numValueOf2 = Integer.valueOf(IEventListener.EVENT_ID_DEVICE_UPDATE);
        map.put(3, numValueOf2);
        map.put(6, 3002);
        map.put(7, 3001);
        map.put(8, 3004);
        map.put(5, 3003);
        Integer numValueOf3 = Integer.valueOf(IEventListener.EVENT_ID_DEVICE_DISCONN_SUCC);
        map.put(9, numValueOf3);
        Integer numValueOf4 = Integer.valueOf(IEventListener.EVENT_ID_DEVICE_SCAN_FINISH);
        map.put(10, numValueOf4);
        Integer numValueOf5 = Integer.valueOf(IEventListener.EVENT_ID_DEVICE_DLNA_CONN_SUCC);
        map.put(11, numValueOf5);
        Integer numValueOf6 = Integer.valueOf(IEventListener.EVENT_ID_DEVICE_REQUEST_PLAY);
        map.put(13, numValueOf6);
        Integer numValueOf7 = Integer.valueOf(IEventListener.EVENT_ID_GRAB_STATE_CHANGED);
        map.put(14, numValueOf7);
        map2.put(3001, new int[]{7, 202004201});
        map2.put(3002, new int[]{6, 202004202});
        map2.put(3003, new int[]{5, 202004203});
        map2.put(3004, new int[]{8, 202004204});
        map2.put(numValueOf3, new int[]{9, 202004206});
        map2.put(numValueOf4, new int[]{10, 202004207});
        map2.put(numValueOf, new int[]{2, 202004208});
        map2.put(numValueOf2, new int[]{3, 202004209});
        map2.put(numValueOf5, new int[]{11, 202004211});
        map2.put(numValueOf6, new int[]{13, 202004213});
        map2.put(numValueOf7, new int[]{14, 202004214});
        map2.put(3000, new int[]{1, 202004200});
        map2.put(4000, new int[]{202004205, 202004205});
        map2.put(4001, new int[]{202004205, 202004205});
    }

    public static List<Integer> i() {
        if (d.size() == 0) {
            d = ffv.b(R.array.alarm_id);
        }
        return d;
    }

    private static void c(long j, int i, Intent intent, boolean z) {
        long j2 = (j / 60000) * 60000;
        ReleaseLogUtil.c("HL_ReminderUtils", "registerReminder isSingle ", Boolean.valueOf(z), " requestCode ", Integer.valueOf(i), " time ", Long.valueOf(j), " timeMillis ", Long.valueOf(j2));
        if (intent == null) {
            LogUtil.j("HL_ReminderUtils", "registerReminder intent is null!");
        } else if (z) {
            xjk.d(i, intent, 201326592, 0, j2);
        } else {
            xjk.a(i, intent, 201326592, 0, j2, 86400000L);
        }
    }

    public static void d(final boolean z, final int i, final String str) {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_" + i, new Runnable() { // from class: cfd
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.d(z, i, str);
                }
            });
            return;
        }
        String str2 = (z ? f() : j()).get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey(str2);
        hiUserPreference.setValue(str);
        if (HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference)) {
            ccy.d(str2, str);
            LogUtil.a("HL_ReminderUtils", "setRemindUserPreference key ", str2, " value ", str);
        }
    }

    private static void d(Context context, int i, Intent intent, List<String> list) {
        if (context == null || intent == null) {
            LogUtil.j("HL_ReminderUtils", "context or intent is null!");
            return;
        }
        intent.setAction("HEALTHLIFE_REMINDER_" + i);
        list.add(intent.getAction());
        xjk.d(i, intent, 201326592);
    }

    private static boolean d(long j) {
        return lsl.aa(j) && System.currentTimeMillis() - j > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    }

    public static void d(int i, long j, int i2, int i3) {
        if (d(j)) {
            LogUtil.j("HL_ReminderUtils", "registerRepeatingReminder time ", Long.valueOf(j), " reminderId ", Integer.valueOf(i), " reminderTotalNumber ", Integer.valueOf(i2), " reminderCurrentNumber ", Integer.valueOf(i3));
            return;
        }
        int iE = (e(i) + i3) - 1;
        c(j, iE, c(i, i2, i3), false);
        LogUtil.a("HL_ReminderUtils", "registerRepeatingReminder requestCode ", Integer.valueOf(iE), " time ", Long.valueOf(j), " reminderId ", Integer.valueOf(i), " reminderTotalNumber ", Integer.valueOf(i2), " reminderCurrentNumber ", Integer.valueOf(i3));
    }

    public static void e(int i, long j, int i2, int i3) {
        a(i, j, i2, i3, new ArrayList());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    public static void a(int i, long j, int i2, int i3, List<String> list) {
        int iD;
        Intent intentC;
        if (d(j)) {
            LogUtil.j("HL_ReminderUtils", "registerSingleReminder time ", Long.valueOf(j), " reminderId ", Integer.valueOf(i), " reminderTotalNumber ", Integer.valueOf(i2), " reminderCurrentNumber ", Integer.valueOf(i3), " actions ", list);
            return;
        }
        if (i == 3000) {
            iD = j(i);
        } else {
            if (i == 4000 || i == 4001) {
                iD = i;
            } else {
                iD = (d(i) + i3) - 1;
            }
            intentC = c(i, i2, i3);
            intentC.setAction("HEALTHLIFE_REMINDER_" + iD);
            if (list != null) {
                list.add(intentC.getAction());
            }
            c(j, iD, intentC, true);
            LogUtil.a("HL_ReminderUtils", "registerSingleReminder requestCode ", Integer.valueOf(iD), " time ", Long.valueOf(j), " reminderId ", Integer.valueOf(i), " reminderTotalNumber ", Integer.valueOf(i2), " reminderCurrentNumber ", Integer.valueOf(i3), " actions ", list);
        }
        intentC = c(i, i2, i3);
        intentC.setAction("HEALTHLIFE_REMINDER_" + iD);
        if (list != null) {
            list.add(intentC.getAction());
        }
        c(j, iD, intentC, true);
        LogUtil.a("HL_ReminderUtils", "registerSingleReminder requestCode ", Integer.valueOf(iD), " time ", Long.valueOf(j), " reminderId ", Integer.valueOf(i), " reminderTotalNumber ", Integer.valueOf(i2), " reminderCurrentNumber ", Integer.valueOf(i3), " actions ", list);
    }

    private static Intent c(int i, int i2, int i3) {
        Context contextB = BaseApplication.b();
        Intent intent = new Intent(contextB, (Class<?>) ReminderReceiver.class);
        String accountInfo = LoginInit.getInstance(contextB).getAccountInfo(1011);
        intent.putExtra("reminderId", i);
        intent.putExtra("reminderHuid", accountInfo);
        intent.putExtra("reminderTotalNumber", i2);
        intent.putExtra("reminderCurrentNumber", i3);
        return intent;
    }

    public static void b(int i) {
        ArrayList arrayList = new ArrayList();
        Context contextB = BaseApplication.b();
        Intent intent = new Intent(contextB, (Class<?>) ReminderReceiver.class);
        if (i == 3000) {
            d(contextB, j(0), intent, arrayList);
            d(contextB, j(1), intent, arrayList);
            return;
        }
        d(contextB, i, intent, arrayList);
        if (i != 4000 && i != 4001) {
            b(contextB, i, intent, arrayList);
        }
        i(arrayList);
    }

    private static void i(List<String> list) {
        if (EnvironmentInfo.l() && njy.b(list)) {
            ReleaseLogUtil.c("HL_ReminderUtils", "unapplyForAlarmExemption actions ", list);
            PowerKitManager.a().b(list);
        }
    }

    private static void b(Context context, int i, Intent intent, List<String> list) {
        int iF = f(i);
        for (int i2 = 0; i2 < iF; i2++) {
            int iD = d(i);
            int iE = e(i);
            d(context, iD + i2, intent, list);
            d(context, iE + i2, intent, list);
        }
    }

    private static void a(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        Context contextB = BaseApplication.b();
        Intent intent = new Intent(contextB, (Class<?>) ReminderReceiver.class);
        d(contextB, i, intent, arrayList);
        int iF = f(i);
        int iD = z ? d(i) : e(i);
        LogUtil.a("HL_ReminderUtils", "cancelTaskReminder isSingle=", Boolean.valueOf(z), ",reminderId=", Integer.valueOf(i), ",reminderCode=", Integer.valueOf(iD), ",maxReminderSize=", Integer.valueOf(iF));
        for (int i2 = 0; i2 < iF; i2++) {
            d(contextB, iD + i2, intent, arrayList);
        }
        if (z) {
            i(arrayList);
        }
    }

    public static void c(final HealthLifeBean healthLifeBean, final boolean z, final int i, final List<Calendar> list, final Map<Integer, cao> map) {
        if (healthLifeBean == null) {
            LogUtil.j("HL_ReminderUtils", "setHealthLifeReminder bean is null");
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_" + healthLifeBean.getId() + i, new Runnable() { // from class: cfc
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.c(healthLifeBean, z, i, list, map);
                }
            });
            return;
        }
        int id = healthLifeBean.getId();
        int iG = g(id);
        cao caoVarA = a(map, id);
        if (!z) {
            caoVarA.d(false);
            map.put(Integer.valueOf(id), caoVarA);
            a(map);
            a(iG, i == 1);
            return;
        }
        if (healthLifeBean.getAddStatus() != 1) {
            LogUtil.a("HL_ReminderUtils", "setHealthLifeReminder bean is not added");
            if (i == 1) {
                caoVarA.d(false);
                map.put(Integer.valueOf(id), caoVarA);
                a(map);
            }
            a(iG, i == 1);
            return;
        }
        if (njy.e(list)) {
            list = e(caoVarA.b());
            caoVarA.e(c(list));
        }
        caoVarA.d(true);
        caoVarA.e(c(list));
        map.put(Integer.valueOf(id), caoVarA);
        a(map);
        a(iG, list, i);
    }

    public static void d(final List<HealthLifeBean> list, final boolean z, final Map<Integer, cao> map) {
        int iG;
        if (list == null || map == null) {
            LogUtil.j("HL_ReminderUtils", "setHealthLifeReminder list is null");
            return;
        }
        LogUtil.a("HL_ReminderUtils", "setHealthLifeReminder isSingle ", Boolean.valueOf(z), " map ", map, " list ", list);
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_" + z, new Runnable() { // from class: cfk
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.d((List<HealthLifeBean>) list, z, (Map<Integer, cao>) map);
                }
            });
            return;
        }
        List<Integer> listI = i();
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean == null) {
                LogUtil.j("HL_ReminderUtils", "setHealthLifeReminder bean is null");
            } else {
                int id = healthLifeBean.getId();
                if (listI.contains(Integer.valueOf(id)) && (iG = g(id)) != -1) {
                    if (id != 1) {
                        cao caoVarA = a(map, id);
                        if (healthLifeBean.getAddStatus() == 0) {
                            if (z) {
                                caoVarA.d(false);
                                map.put(Integer.valueOf(id), caoVarA);
                                a(map);
                            }
                            a(iG, z);
                        } else {
                            List<Calendar> listA = a(id, healthLifeBean, list, caoVarA);
                            caoVarA.e(c(listA));
                            map.put(Integer.valueOf(id), caoVarA);
                            if (!caoVarA.d()) {
                                a(iG, z);
                            } else {
                                a(iG, listA, z ? 1 : 3);
                            }
                        }
                    }
                }
            }
        }
        a(map);
    }

    private static List<Calendar> a(int i, HealthLifeBean healthLifeBean, List<HealthLifeBean> list, cao caoVar) {
        if (i == 6 || i == 7) {
            return cfu.e(i, healthLifeBean.getTarget());
        }
        if (i == 9) {
            return c(list, caoVar);
        }
        return e(caoVar.b());
    }

    private static List<Calendar> c(List<HealthLifeBean> list, cao caoVar) {
        String target = "";
        List<Calendar> listD = cfu.d(9, "", caoVar);
        if (!njy.e(listD)) {
            return listD;
        }
        HealthLifeBean healthLifeBean = cdf.c(list).get(7);
        if (healthLifeBean != null) {
            target = healthLifeBean.getTarget();
        }
        if (!TextUtils.isEmpty(target)) {
            Calendar calendarI = cbg.i(target);
            calendarI.add(12, -60);
            return Collections.singletonList(calendarI);
        }
        return cfu.b(9);
    }

    public static void a(int i, List<Calendar> list, int i2) {
        LogUtil.a("HL_ReminderUtils", "setReminder type ", Integer.valueOf(i2), "setReminder reminderId ", Integer.valueOf(i));
        Map<Integer, Calendar> mapE = e(i, list);
        if (mapE.isEmpty()) {
            LogUtil.j("HL_ReminderUtils", "setReminder calendarMap is empty");
            a(i, i2 == 1);
            return;
        }
        int iIntValue = ((Integer) Collections.max(mapE.keySet())).intValue();
        a(i, i2 == 1);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Calendar> entry : mapE.entrySet()) {
            Calendar value = entry.getValue();
            value.set(13, 0);
            value.set(14, 0);
            int iIntValue2 = entry.getKey().intValue();
            if (i2 == 1) {
                a(i, value.getTimeInMillis(), iIntValue, iIntValue2, arrayList);
            } else {
                if (i2 == 3) {
                    value.add(5, 1);
                }
                d(i, value.getTimeInMillis(), iIntValue, iIntValue2);
            }
        }
        d(arrayList);
    }

    private static void d(List<String> list) {
        if (EnvironmentInfo.l() && njy.b(list)) {
            ReleaseLogUtil.c("HL_ReminderUtils", "applyForAlarmExemption actions ", list);
            PowerKitManager.a().e(list);
        }
    }

    public static Map<Integer, String> f() {
        if (f1524c.size() == 0) {
            for (Integer num : i()) {
                f1524c.put(num, "health_model_task_reminder_" + num);
            }
            Map<Integer, String> map = f1524c;
            map.put(5, "health_model_breath_reminder");
            map.put(7, "health_model_sleep_reminder");
            map.put(6, "health_model_wake_up_reminder");
            map.put(1, "health_model_daily_summary_reminder");
            map.put(8, "health_model_smile_reminder");
        }
        return f1524c;
    }

    public static Map<Integer, String> j() {
        if (f1523b.size() <= 0) {
            for (Integer num : i()) {
                f1523b.put(num, "health_model_task_reminder_" + g(num.intValue()));
            }
        }
        return f1523b;
    }

    public static int g(int i) {
        Map<Integer, Integer> map = f1522a;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i)).intValue();
        }
        return -1;
    }

    public static HashMap<Integer, int[]> d() {
        return e;
    }

    private static int j(int i) {
        Calendar calendar = Calendar.getInstance();
        if (i == 1) {
            calendar.add(5, 1);
        }
        try {
            return Integer.parseInt(AMap3DTileBuildType.HOUSING + new SimpleDateFormat("MMdd").format(calendar.getTime()));
        } catch (NumberFormatException unused) {
            LogUtil.e("HL_ReminderUtils", "generateSummaryRequestCode numberFormatException");
            return 3000;
        }
    }

    public static void b() {
        Iterator<Integer> it = e.keySet().iterator();
        while (it.hasNext()) {
            b(it.next().intValue());
        }
    }

    public static void e(final List<HealthLifeBean> list, final SparseArray<HealthLifeBean> sparseArray, final Map<Integer, cao> map) {
        if (njy.e(list)) {
            LogUtil.j("HL_ReminderUtils", "setReminderForManagement beansTomorrow is empty");
            return;
        }
        LogUtil.a("HL_ReminderUtils", "setReminderForManagement beansTomorrow ", list.toString());
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_" + list, new Runnable() { // from class: cfe
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.e((List<HealthLifeBean>) list, (SparseArray<HealthLifeBean>) sparseArray, (Map<Integer, cao>) map);
                }
            });
            return;
        }
        List<Integer> listI = i();
        LogUtil.a("HL_ReminderUtils", "setReminderForManagement reminderIds ", listI.toString());
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                if (listI.contains(Integer.valueOf(id)) && id != 1) {
                    int iG = g(id);
                    if (!a(map, id).d()) {
                        LogUtil.j("HL_ReminderUtils", "setReminderForManagement isOpenReminder is false");
                        b(iG);
                    } else {
                        e(id, iG, sparseArray, map);
                        c(healthLifeBean, iG, map);
                    }
                }
            }
        }
    }

    private static void c(HealthLifeBean healthLifeBean, int i, Map<Integer, cao> map) {
        if (healthLifeBean.getAddStatus() != 1) {
            a(i, false);
            return;
        }
        int id = healthLifeBean.getId();
        List<Calendar> listD = cfu.d(id, healthLifeBean.getTarget(), map.get(Integer.valueOf(id)));
        if (!njy.e(listD)) {
            cao caoVarA = a(map, id);
            caoVarA.e(c(listD));
            caoVarA.d(true);
            map.put(Integer.valueOf(id), caoVarA);
            a(map);
        }
        a(i, listD, 3);
    }

    private static void e(int i, int i2, SparseArray<HealthLifeBean> sparseArray, Map<Integer, cao> map) {
        if (sparseArray == null || sparseArray.get(i) == null || sparseArray.get(i).getAddStatus() != 1) {
            a(i2, true);
            cao caoVarA = a(map, i);
            caoVarA.d(false);
            map.put(Integer.valueOf(i), caoVarA);
            a(map);
            return;
        }
        List<Calendar> listD = cfu.d(i, sparseArray.get(i).getTarget(), map.get(Integer.valueOf(i)));
        if (!njy.e(listD)) {
            cao caoVarA2 = a(map, i);
            caoVarA2.e(c(listD));
            caoVarA2.d(true);
            map.put(Integer.valueOf(i), caoVarA2);
            a(map);
        }
        a(i2, listD, 1);
    }

    public static void h() {
        ccy.c("reminder_1", "");
        ccy.c("reminder_7", "");
        ccy.c("reminder_6", "");
        ccy.c("reminder_5", "");
        ccy.c("reminder_8", "");
    }

    public static Map<Integer, Calendar> e(int i, List<Calendar> list) {
        if (njy.e(list)) {
            return new HashMap(2);
        }
        list.sort(new Comparator() { // from class: cff
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Calendar calendar = (Calendar) obj;
                Calendar calendar2 = (Calendar) obj2;
                return Long.compare(calendar != null ? calendar.getTimeInMillis() : 0L, calendar2 != null ? calendar2.getTimeInMillis() : 0L);
            }
        });
        Calendar calendar = list.get(0);
        if (calendar == null || !(calendar.clone() instanceof Calendar)) {
            LogUtil.j("HL_ReminderUtils", "getReminderCalendarList startCalendar is null");
            return new HashMap(2);
        }
        HashMap map = new HashMap();
        if (i == 3006 && njy.c(list, 1)) {
            Calendar calendar2 = (Calendar) calendar.clone();
            Calendar calendar3 = list.get(1);
            if (calendar3 == null) {
                calendar3 = (Calendar) calendar.clone();
            }
            LogUtil.a("HL_ReminderUtils", "getReminderCalendarList endCalendar ", Long.valueOf(calendar3.getTimeInMillis()), "startCalendar ", Long.valueOf(calendar2.getTimeInMillis()));
            int i2 = 1;
            while (!calendar2.after(calendar3)) {
                if (b(calendar2.get(11), calendar2.get(12))) {
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.setTimeInMillis(calendar2.getTimeInMillis());
                    map.put(Integer.valueOf(i2), calendar4);
                }
                calendar2.add(11, 1);
                i2++;
            }
        } else {
            for (int i3 = 1; i3 <= list.size(); i3++) {
                map.put(Integer.valueOf(i3), list.get(i3 - 1));
            }
        }
        return map;
    }

    public static void l() {
        if (!lua.e() && Utils.h()) {
            LogUtil.j("HL_ReminderUtils", "syncSaveAllReminder isPullAllStatus false");
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_", new Runnable() { // from class: cey
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.l();
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("health_model_reminder");
        List<HiUserPreference> userPreferenceList = HiHealthManager.d(BaseApplication.b()).getUserPreferenceList(arrayList);
        if (!njy.e(userPreferenceList) && userPreferenceList.get(0) != null && !TextUtils.isEmpty(userPreferenceList.get(0).getValue())) {
            LogUtil.a("HL_ReminderUtils", "syncSaveAllReminder hiUserPreference ", userPreferenceList);
            try {
                HashMap map = (HashMap) HiJsonUtil.d(userPreferenceList.get(0).getValue(), new TypeToken<HashMap<Integer, cam>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$1
                }.getType());
                HashMap map2 = new HashMap();
                a(map2, map);
                ccy.d("health_model_reminder", HiJsonUtil.d(map2));
                cee.e((Map<Integer, cao>) map2, true);
                cee.c((Map<Integer, cao>) map2, true);
                cee.d((Map<Integer, cao>) map2, true);
                return;
            } catch (JsonParseException | IllegalStateException e2) {
                LogUtil.e("HL_ReminderUtils", "syncSaveAllReminder exception ", LogAnonymous.b(e2));
            }
        }
        HashMap map3 = new HashMap();
        b(n(), map3);
        String strE = HiJsonUtil.e(map3, new TypeToken<HashMap<Integer, cam>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$2
        }.getType());
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HL_ReminderUtils", "syncSaveAllReminder value ", strE);
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_reminder");
        hiUserPreference.setValue(strE);
        if (HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference)) {
            HashMap map4 = new HashMap();
            a(map4, map3);
            ccy.d("health_model_reminder", HiJsonUtil.d(map4));
            cbg.al();
        }
        LogUtil.a("HL_ReminderUtils", "syncSaveAllReminder key ", "health_model_reminder", " value ", strE);
    }

    public static void g() {
        Map map;
        if (!lua.e() && Utils.h()) {
            LogUtil.j("HL_ReminderUtils", "syncHiUserPreference isPullAllStatus false");
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_", new Runnable() { // from class: cfg
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.g();
                }
            });
            return;
        }
        String strC = ccy.c("health_model_reminder");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HL_ReminderUtils", "syncHiUserPreference value is empty");
            return;
        }
        try {
            map = (Map) HiJsonUtil.d(strC, new TypeToken<HashMap<Integer, cao>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$3
            }.getType());
        } catch (JsonParseException | IllegalStateException e2) {
            LogUtil.e("HL_ReminderUtils", "syncHiUserPreference exception ", LogAnonymous.b(e2));
            map = null;
        }
        if (map == null || njy.e(map.entrySet())) {
            LogUtil.j("HL_ReminderUtils", "syncHiUserPreference map is empty");
            return;
        }
        HashMap map2 = new HashMap();
        b((Map<Integer, cao>) map, map2);
        if (njy.e(map2.entrySet())) {
            LogUtil.j("HL_ReminderUtils", "syncHiUserPreference beanMap is empty");
            return;
        }
        String strD = HiJsonUtil.d(map2);
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_reminder");
        hiUserPreference.setValue(strD);
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        if (userPreference) {
            cbg.al();
            cee.e((Map<Integer, cao>) map, false);
            cee.c((Map<Integer, cao>) map, false);
            cee.d((Map<Integer, cao>) map, false);
        }
        LogUtil.a("HL_ReminderUtils", "syncHiUserPreference isSuccess ", Boolean.valueOf(userPreference), " key ", "health_model_reminder", " value ", strD);
    }

    private static Map<Integer, cao> n() {
        HashMap map = new HashMap();
        List<Integer> listI = i();
        if (njy.e(listI)) {
            LogUtil.a("HL_ReminderUtils", "getReminder idList  ", listI);
            return map;
        }
        for (Integer num : listI) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                LogUtil.a("HL_ReminderUtils", "convertCloudList task is Summary ");
            } else {
                map.put(num, new cao(a(iIntValue), c(d(iIntValue, true))));
            }
        }
        return map;
    }

    public static List<Calendar> b(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_ReminderUtils", "convertTimestampInterval timestampInterval is empty");
            return new ArrayList(2);
        }
        ArrayList arrayList = new ArrayList(2);
        if (str.contains(Constants.LINK)) {
            strArrSplit = str.split(Constants.LINK);
        } else {
            strArrSplit = str.split(",");
        }
        for (String str2 : strArrSplit) {
            long jF = qrs.f(str2);
            if (jF == 0) {
                LogUtil.j("HL_ReminderUtils", "convertTimestampInterval timestamp is invalid");
                return new ArrayList(2);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jF);
            arrayList.add(cbg.c(calendar));
        }
        return arrayList;
    }

    public static List<Calendar> d(int i, boolean z) {
        final String str = j().get(Integer.valueOf(i));
        List<Calendar> listB = b(ccy.c(str));
        if (njy.e(listB)) {
            cbg.c(ThreadPoolManager.c(), "HealthModelRemind_" + i, new Runnable() { // from class: cez
                @Override // java.lang.Runnable
                public final void run() {
                    cfb.e(str);
                }
            });
            LogUtil.j("HL_ReminderUtils", "getAlarmTimeById calendarList is empty id ", Integer.valueOf(i));
            if (z) {
                return cfu.b(i);
            }
        }
        return listB;
    }

    static /* synthetic */ void e(String str) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference(str);
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            return;
        }
        ccy.d(str, userPreference.getValue());
    }

    public static boolean a(int i) {
        String value;
        String str = f().get(Integer.valueOf(i));
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference(str);
        if (userPreference == null) {
            value = "";
        } else {
            value = userPreference.getValue();
        }
        LogUtil.a("HL_ReminderUtils", "getAlarmSwitchStatus hiUserPreference ", userPreference, " key ", str, " value ", value);
        return !TextUtils.isEmpty(value);
    }

    public static Map<Integer, cao> a() {
        if (!lua.e() && Utils.h()) {
            return new HashMap();
        }
        Map<Integer, cao> mapC = c();
        if (mapC != null && !njy.e(mapC.entrySet())) {
            return mapC;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("health_model_reminder");
        List<HiUserPreference> userPreferenceList = HiHealthManager.d(BaseApplication.b()).getUserPreferenceList(arrayList);
        if (njy.e(userPreferenceList) || userPreferenceList.get(0) == null || TextUtils.isEmpty(userPreferenceList.get(0).getValue())) {
            LogUtil.j("HL_ReminderUtils", "getAllReminder hiUserPreference ", userPreferenceList);
            return n();
        }
        LogUtil.a("HL_ReminderUtils", "getAllReminder map value ", userPreferenceList.get(0).getValue());
        try {
            Map map = (Map) HiJsonUtil.d(userPreferenceList.get(0).getValue(), new TypeToken<HashMap<Integer, cam>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$4
            }.getType());
            if (map != null && !njy.e(map.entrySet())) {
                if (mapC == null) {
                    mapC = new HashMap<>();
                }
                a(mapC, (Map<Integer, cam>) map);
                return mapC;
            }
            LogUtil.j("HL_ReminderUtils", "getAllReminder cloudBeanMap ", map);
            return n();
        } catch (JsonParseException | IllegalStateException | NullPointerException e2) {
            LogUtil.e("HL_ReminderUtils", "getAllReminder exception ", LogAnonymous.b(e2));
            return n();
        }
    }

    public static Map<Integer, cao> c() {
        if (!lua.e() && Utils.h()) {
            return new HashMap();
        }
        String strC = ccy.c("health_model_reminder");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HL_ReminderUtils", "getSpAllReminder value ", strC);
            return new HashMap();
        }
        try {
            Map<Integer, cao> map = (Map) HiJsonUtil.d(strC, new TypeToken<HashMap<Integer, cao>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$5
            }.getType());
            List<dfl> listA = cbg.a(ccy.c("bloodPressureMeasurePlan"));
            if (njy.e(listA)) {
                LogUtil.j("HL_ReminderUtils", "getSpAllReminder bloodPressureAlarmInfoList ", listA);
                return map;
            }
            ArrayList arrayList = new ArrayList();
            for (dfl dflVar : listA) {
                if (dflVar != null) {
                    ayx ayxVar = new ayx();
                    ayxVar.d(dflVar.c());
                    ayxVar.c(dflVar.e());
                    ayxVar.b(dflVar.h());
                    ayxVar.b(dflVar.a());
                    arrayList.add(ayxVar);
                }
            }
            if (njy.e(arrayList)) {
                LogUtil.j("HL_ReminderUtils", "getSpAllReminder list ", arrayList);
                return map;
            }
            map.put(12, new cao(((ayx) arrayList.get(0)).h(), arrayList));
            return map;
        } catch (JsonParseException | IllegalStateException | NullPointerException e2) {
            LogUtil.e("HL_ReminderUtils", "getSpAllReminder exception ", ExceptionUtils.c(e2));
            return new HashMap();
        }
    }

    private static Map<Integer, List<Long>> o() {
        cao value;
        Map<Integer, cao> mapC = c();
        if (mapC == null) {
            return new HashMap();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        for (Map.Entry<Integer, cao> entry : mapC.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null) {
                List<ayx> listB = value.b();
                if (!njy.e(listB)) {
                    Integer key = entry.getKey();
                    if (key.intValue() == 10) {
                        List<Long> listC = c(listB, jCurrentTimeMillis);
                        if (!njy.e(listC)) {
                            map.put(key, listC);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (ayx ayxVar : listB) {
                            if (ayxVar != null) {
                                arrayList.add(Long.valueOf(lsl.a(jCurrentTimeMillis, ayxVar.c(), ayxVar.e())));
                            }
                        }
                        if (!njy.e(arrayList)) {
                            map.put(key, arrayList);
                        }
                    }
                }
            }
        }
        return map;
    }

    private static List<Long> c(List<ayx> list, long j) {
        if (njy.e(list, 1)) {
            return Collections.EMPTY_LIST;
        }
        ayx ayxVar = list.get(0);
        ayx ayxVar2 = list.get(1);
        if (ayxVar == null || ayxVar2 == null) {
            return Collections.EMPTY_LIST;
        }
        long jA = lsl.a(j, ayxVar.c(), ayxVar.e());
        long jA2 = lsl.a(j, ayxVar2.c(), ayxVar2.e());
        if (Long.compare(jA2, jA) != 1) {
            jA2 = jA;
            jA = jA2;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jA);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jA2);
        ArrayList arrayList = new ArrayList();
        while (!calendar.after(calendar2)) {
            if (b(calendar.get(11), calendar.get(12))) {
                arrayList.add(Long.valueOf(calendar.getTimeInMillis()));
            }
            calendar.add(11, 1);
        }
        return arrayList;
    }

    public static List<ayx> c(List<Calendar> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (Calendar calendar : list) {
                if (calendar != null) {
                    ayx ayxVar = new ayx();
                    ayxVar.d(calendar.get(11));
                    ayxVar.c(calendar.get(12));
                    ayxVar.b(127);
                    arrayList.add(ayxVar);
                }
            }
        }
        return arrayList;
    }

    public static void a(Map<Integer, cao> map) {
        if (lua.e() || !Utils.h()) {
            String strE = HiJsonUtil.e(map, new TypeToken<HashMap<Object, cao>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$6
            }.getType());
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("HL_ReminderUtils", "updateSingeTaskReminder value ", strE);
            } else {
                ccy.d("health_model_reminder", strE);
                LogUtil.a("HL_ReminderUtils", "updateSingeTaskReminder value ", strE);
            }
        }
    }

    public static List<Calendar> e(List<ayx> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (ayx ayxVar : list) {
                if (ayxVar != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, ayxVar.c());
                    calendar.set(12, ayxVar.e());
                    arrayList.add(calendar);
                }
            }
        }
        return arrayList;
    }

    public static cao a(Map<Integer, cao> map, int i) {
        if (map == null) {
            ReleaseLogUtil.d("R_HL_ReminderUtils", "getHealthModeModelReminderBean map is null");
            return new cao(false, new ArrayList());
        }
        cao caoVar = map.get(Integer.valueOf(i));
        if (caoVar == null) {
            ReleaseLogUtil.d("R_HL_ReminderUtils", "getHealthModeModelReminderBean bean is null taskId ", Integer.valueOf(i));
            return new cao(false, new ArrayList());
        }
        return new cao(caoVar.d(), caoVar.b());
    }

    public static void b(Map<Integer, cao> map, Map<Integer, cam> map2) {
        if (map2 == null) {
            ReleaseLogUtil.d("R_HL_ReminderUtils", "convertCloudList cloudBeanMap is null");
            return;
        }
        if (map == null || njy.e(map.entrySet())) {
            LogUtil.j("HL_ReminderUtils", "convertCloudList map is fail");
            return;
        }
        for (Map.Entry<Integer, cao> entry : map.entrySet()) {
            cao value = entry.getValue();
            if (value == null || entry.getKey().intValue() == 1) {
                LogUtil.a("HL_ReminderUtils", "convertCloudList modeReminderBean is null or task is Summary ");
            } else {
                ArrayList arrayList = new ArrayList();
                for (ayx ayxVar : value.b()) {
                    if (ayxVar != null) {
                        arrayList.add(new cam.d(ayxVar.c(), ayxVar.e()));
                    }
                }
                map2.put(entry.getKey(), new cam(value.d(), arrayList));
            }
        }
        LogUtil.a("HL_ReminderUtils", "convertCloudList cloudBeanMap is ", map2.toString());
    }

    private static void a(Map<Integer, cao> map, Map<Integer, cam> map2) {
        if (map2 == null || njy.e(map2.entrySet())) {
            LogUtil.j("HL_ReminderUtils", "convertAlarmInfoList cloudBeanMap is fail");
            return;
        }
        for (Map.Entry<Integer, cam> entry : map2.entrySet()) {
            cam value = entry.getValue();
            if (value != null) {
                ArrayList arrayList = new ArrayList();
                for (cam.d dVar : value.e()) {
                    if (dVar != null) {
                        ayx ayxVar = new ayx();
                        ayxVar.c(dVar.d());
                        ayxVar.d(dVar.c());
                        ayxVar.b(127);
                        arrayList.add(ayxVar);
                    }
                }
                map.put(entry.getKey(), new cao(value.c(), arrayList));
            }
        }
        LogUtil.a("HL_ReminderUtils", "convertAlarmInfoList map is ", map.toString());
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_ReminderUtils", "isAppPushEnable package is empty");
            return false;
        }
        try {
            Cursor cursorQuery = BaseApplication.b().getContentResolver().query(Uri.parse(lsu.j), null, null, null, null);
            try {
                LogUtil.a("HL_ReminderUtils", lsu.a("NotificationList", null, null, null, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("HL_ReminderUtils", "isAppPushEnable cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    while (cursorQuery.moveToNext()) {
                        Integer numA = lsu.a("name", cursorQuery, "HL_ReminderUtils");
                        if (numA == null) {
                            LogUtil.j("HL_ReminderUtils", "isAppPushEnable columnIndex is null");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else if (str.equals(cursorQuery.getString(numA.intValue()))) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return true;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException | StaleDataException | IllegalArgumentException e2) {
            LogUtil.a("HL_ReminderUtils", "isAppPushEnable Exception: ", LogAnonymous.b(e2));
        }
    }

    public static String c(int i) {
        int i2;
        switch (i) {
            case 2:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_20;
                break;
            case 3:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_33;
                break;
            case 4:
            case 11:
            case 12:
            default:
                i2 = 0;
                break;
            case 5:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_54;
                break;
            case 6:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_66;
                break;
            case 7:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_71;
                break;
            case 8:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_82;
                break;
            case 9:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_92;
                break;
            case 10:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_100;
                break;
            case 13:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_130;
                break;
            case 14:
                i2 = com.huawei.basichealthmodel.R.string.IDS_reminder_140;
                break;
        }
        return qre.f(i2);
    }

    private static void o(int i) {
        Map<Integer, List<Long>> mapK = k();
        if (mapK == null || mapK.size() <= 0) {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(System.currentTimeMillis()));
            map.put(Integer.valueOf(i), arrayList);
            ccy.d("health_life_colver_reminder_time", HiJsonUtil.d(map));
            return;
        }
        HashMap map2 = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        for (Map.Entry<Integer, List<Long>> entry : mapK.entrySet()) {
            if (entry != null) {
                Integer key = entry.getKey();
                int iIntValue = key.intValue();
                List<Long> value = entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                if (njy.b(value)) {
                    for (Long l : value) {
                        if (DateFormatUtil.a(l.longValue()) == iA) {
                            arrayList2.add(l);
                        }
                    }
                }
                if (iIntValue == i) {
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis));
                }
                if (!njy.e(arrayList2)) {
                    map2.put(key, arrayList2);
                }
            }
        }
        if (!map2.containsKey(Integer.valueOf(i))) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(Long.valueOf(jCurrentTimeMillis));
            map2.put(Integer.valueOf(i), arrayList3);
        }
        ccy.d("health_life_colver_reminder_time", HiJsonUtil.d(map2));
    }

    private static Map<Integer, List<Long>> k() {
        String strC = ccy.c("health_life_colver_reminder_time");
        if (TextUtils.isEmpty(strC)) {
            return new HashMap();
        }
        try {
            return (Map) HiJsonUtil.d(strC, new TypeToken<Map<Integer, List<Long>>>() { // from class: com.huawei.basichealthmodel.util.ReminderUtils$7
            }.getType());
        } catch (JsonParseException | IllegalStateException e2) {
            LogUtil.e("HL_ReminderUtils", "getReminderTimeList exception ", ExceptionUtils.c(e2));
            return new HashMap();
        }
    }

    private static List<Integer> b(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && healthLifeBean.getComplete() <= 0) {
                arrayList.add(Integer.valueOf(healthLifeBean.getId()));
            }
        }
        Map<Integer, List<Long>> mapK = k();
        if (mapK == null) {
            return arrayList;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : arrayList) {
            List<Long> list2 = mapK.get(num);
            if (njy.e(list2)) {
                arrayList2.add(num);
            } else {
                boolean zH = h(num.intValue());
                Iterator<Long> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Long next = it.next();
                        if (DateFormatUtil.a(next.longValue()) == iA && (zH || Math.abs(jCurrentTimeMillis - next.longValue()) < 3600000)) {
                            break;
                        }
                    } else {
                        arrayList2.add(num);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    private static Map<Integer, Long> f(List<HealthLifeBean> list) {
        List<Integer> listB = b(list);
        if (njy.e(listB)) {
            return new HashMap();
        }
        Map<Integer, List<Long>> mapO = o();
        HashMap map = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<Integer, List<Long>> entry : mapO.entrySet()) {
            if (entry != null) {
                Integer key = entry.getKey();
                int iIntValue = key.intValue();
                if (listB.contains(key)) {
                    List<Long> value = entry.getValue();
                    if (!njy.e(value)) {
                        if (iIntValue == 13) {
                            Long l = value.get(value.size() - 1);
                            long jAbs = Math.abs(jCurrentTimeMillis - l.longValue());
                            if (!map.containsKey(key) && jAbs < 3600000) {
                                map.put(key, l);
                            }
                        } else {
                            boolean zH = h(iIntValue);
                            for (Long l2 : value) {
                                long jAbs2 = Math.abs(jCurrentTimeMillis - l2.longValue());
                                if (zH) {
                                    if (!map.containsKey(key) && jAbs2 < 3600000) {
                                        map.put(key, l2);
                                        break;
                                    }
                                } else if (!map.containsKey(key) && jAbs2 < 1800000) {
                                    map.put(key, l2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    private static Pair<Integer, Long> j(List<HealthLifeBean> list) {
        List<Map.Entry<Integer, Long>> listD = d(f(list));
        if (njy.e(listD)) {
            return m();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        long j = jCurrentTimeMillis;
        for (Map.Entry<Integer, Long> entry : listD) {
            if (entry != null) {
                Long value = entry.getValue();
                long jAbs = Math.abs(jCurrentTimeMillis - value.longValue());
                if (jAbs <= j) {
                    map.put(entry.getKey(), value);
                    j = jAbs;
                }
            }
        }
        List<Map.Entry<Integer, Long>> listD2 = d(map);
        if (njy.e(listD2)) {
            return m();
        }
        Map.Entry<Integer, Long> entry2 = listD2.get(qrf.d(listD2.size()));
        if (entry2 == null) {
            LogUtil.j("HL_ReminderUtils", "getRemindTimeMap entry is null list ", listD2);
            return m();
        }
        return new Pair<>(entry2.getKey(), entry2.getValue());
    }

    private static Pair<Integer, Long> m() {
        List<Integer> listB = b(cgc.d());
        if (njy.e(listB)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listB) {
            if (num.intValue() != 2 && num.intValue() != 3) {
                arrayList.add(num);
            }
        }
        if (njy.e(arrayList)) {
            return null;
        }
        Map<Integer, List<Long>> mapO = o();
        HashMap map = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<Integer, List<Long>>> it = mapO.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, List<Long>> next = it.next();
            if (next != null) {
                Integer key = next.getKey();
                int iIntValue = key.intValue();
                if (arrayList.contains(key)) {
                    List<Long> value = next.getValue();
                    if (!njy.e(value)) {
                        long jLongValue = value.get(value.size() - 1).longValue();
                        boolean z = iIntValue == 13;
                        long j = jCurrentTimeMillis;
                        long jLongValue2 = 0;
                        for (Long l : value) {
                            long jLongValue3 = l.longValue();
                            if (z) {
                                jLongValue3 = jLongValue;
                            }
                            if (jLongValue3 <= jCurrentTimeMillis) {
                                long j2 = jCurrentTimeMillis - jLongValue3;
                                if (j2 <= j) {
                                    jLongValue2 = l.longValue();
                                    j = j2;
                                }
                            }
                        }
                        if (jLongValue2 > 0) {
                            map.put(key, Long.valueOf(jLongValue2));
                        }
                    }
                }
            }
        }
        List<Map.Entry<Integer, Long>> listD = d(map);
        if (njy.e(listD)) {
            return null;
        }
        Map.Entry<Integer, Long> entry = listD.get(listD.size() - 1);
        if (entry == null) {
            LogUtil.j("HL_ReminderUtils", "getDefaultReminderIdMap entry is null list ", listD);
            return null;
        }
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    private static List<Map.Entry<Integer, Long>> d(Map<Integer, Long> map) {
        if (map == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Long>>() { // from class: cfb.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<Integer, Long> entry, Map.Entry<Integer, Long> entry2) {
                return Long.compare(entry != null ? entry.getValue().longValue() : 0L, entry2 != null ? entry2.getValue().longValue() : 0L);
            }
        });
        return arrayList;
    }

    private static String i(int i) {
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case 2:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_2_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_2_2));
                break;
            case 3:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_3_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_3_2));
                break;
            case 4:
            default:
                LogUtil.j("HL_ReminderUtils", "getRemindTip id ", Integer.valueOf(i));
                break;
            case 5:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_5_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_5_2));
                break;
            case 6:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_6_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_6_2));
                break;
            case 7:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_7_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_7_2));
                break;
            case 8:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_8_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_8_2));
                break;
            case 9:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_9_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_9_2));
                break;
            case 10:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_10_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_10_2));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_10_3));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_10_4));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_10_5));
                break;
            case 11:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_11_1));
                break;
            case 12:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_12_1));
                break;
            case 13:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_13_1));
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_13_2));
                break;
            case 14:
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.string.IDS_life_task_reminder_14_1));
                break;
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HL_ReminderUtils", "getRemindTip list ", arrayList, " id ", Integer.valueOf(i));
            return "";
        }
        return qre.f(((Integer) arrayList.get(qrf.d(arrayList.size()))).intValue());
    }

    public static Pair<Integer, String> a(List<HealthLifeBean> list) {
        Pair<Integer, Long> pairJ = j(list);
        if (pairJ == null) {
            return new Pair<>(-1, "");
        }
        Integer num = pairJ.first;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = pairJ.second;
        LogUtil.a("HL_ReminderUtils", "getRemindTipMap id ", Integer.valueOf(iIntValue), " timeMillis ", Long.valueOf(l != null ? l.longValue() : -1L));
        if (iIntValue <= -1) {
            return new Pair<>(-1, "");
        }
        o(iIntValue);
        return new Pair<>(Integer.valueOf(iIntValue), i(iIntValue));
    }

    public static void e() {
        lsb.d().e(202004207);
        lsb.d().e(202004211);
        ReleaseLogUtil.c("R_HL_ReminderUtils", "cancelNotification");
    }
}
