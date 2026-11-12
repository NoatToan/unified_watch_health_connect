package com.xiaomi.hm.health.device.alarm;

import android.app.AlarmManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.xiaomiai.VoiceProtocol;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.AlarmClockItem;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceAlarmEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import com.xiaomi.hm.health.webapi.account.model.HMBeanAlarmClock;
import de.greenrobot.event.EventBus;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class AlarmClockManager {
    private static final String i = "AlarmClockManager";
    private static final String j = "ALARM_SIZE_";
    private static final String k = "ALARM_SIZE_INDEX";
    private static final int l = 10;
    private static final int m = 3;
    private static volatile AlarmClockManager n = null;
    private static final int o = 60;
    private static final int p = 24;
    private static final int q = 7;
    private static final int r = 6;
    private int a = 10;
    private final Object b = new Object();
    private boolean d = false;
    private boolean e = false;
    private final Lazy<DeviceManagerApi> f = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<KeeperProxyApi> g = KoinJavaComponent.inject(KeeperProxyApi.class);
    private final Lazy<AccountWebExtApi> h = KoinJavaComponent.inject(AccountWebExtApi.class);
    private AlarmCached c = new DefaultAlarmCached();

    public static class SortBySmart extends c {
        public SortBySmart() {
            super();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.hm.health.device.alarm.AlarmClockManager.c, java.util.Comparator
        public int compare(Alarm alarm, Alarm alarm2) {
            boolean zBooleanValue = alarm.getIsSmart().booleanValue();
            boolean zBooleanValue2 = alarm2.getIsSmart().booleanValue();
            if (zBooleanValue && !zBooleanValue2) {
                return -1;
            }
            if (zBooleanValue || !zBooleanValue2) {
                return super.compare(alarm, alarm2);
            }
            return 1;
        }
    }

    public class a extends HMCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(AlarmClockManager.i, "doFree set alarm to device: " + z, new Object[0]);
            ((KeeperProxyApi) AlarmClockManager.this.g.getValue()).setNeedSetAlarm2Device(z ^ true);
        }
    }

    public class b extends HMCallback {
        public final /* synthetic */ Alarm a;

        public b(Alarm alarm) {
            this.a = alarm;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(AlarmClockManager.i, "set alarm to device : " + z, new Object[0]);
            if (z) {
                AlarmClockManager.this.keepAlarm(this.a);
            }
        }
    }

    public static class c implements Comparator<Alarm> {
        private c() {
        }

        private int a(Alarm alarm) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(alarm.getCalendar().longValue());
            int i = (calendar.get(11) * 60) + calendar.get(12);
            HMLog.d("SortByTimeAndId", "time : " + i, new Object[0]);
            return i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Comparator
        public int compare(Alarm alarm, Alarm alarm2) {
            long jA = a(alarm);
            long jA2 = a(alarm2);
            if (jA > jA2) {
                return 1;
            }
            if (jA < jA2) {
                return -1;
            }
            if (alarm.getIndex().intValue() > alarm2.getIndex().intValue()) {
                return 1;
            }
            return alarm.getIndex().intValue() < alarm2.getIndex().intValue() ? -1 : 0;
        }
    }

    private AlarmClockManager() {
        v();
    }

    private boolean A() {
        List<Alarm> listLoadAll = HMDaoManager.getInstance().getAlarmDao().loadAll();
        HMLog.i(i, "onlyCheckSmartAlarmData: " + listLoadAll.size(), new Object[0]);
        this.a = isNormalAlarmSize() ? 3 : 10;
        Collections.sort(listLoadAll, new Comparator() { // from class: ua
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AlarmClockManager.y((Alarm) obj, (Alarm) obj2);
            }
        });
        j(listLoadAll);
        boolean zL = l(listLoadAll);
        HMLog.i(i, "onlyCheckSmartAlarmData checkSmartAlarm: " + zL, new Object[0]);
        if (zL) {
            HMDaoManager.getInstance().getAlarmDao().deleteAll();
            ((DefaultAlarmCached) this.c).setMemoryCached(listLoadAll);
            try {
                HMDaoManager.getInstance().getAlarmDao().insertInTx(listLoadAll);
            } catch (Exception e) {
                HMLog.i(i, "onlyCheckSmartAlarmData exception: " + e.getMessage(), new Object[0]);
            }
        }
        return zL;
    }

    private String B(int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (i2 <= 0) {
            if (i3 <= 0) {
                if (i4 <= 0) {
                    if (w()) {
                        i5 = R.string.miband_alarm_delay_tips_in_one_minute_beep;
                    } else {
                        i5 = z ? R.string.earbud_alarm_delay_tips_in_one_minute : R.string.miband_alarm_delay_tips_in_one_minute;
                    }
                    return DeviceXFunctionsKt.getContext().getString(i5);
                }
                if (w()) {
                    i6 = R.string.miband_alarm_delay_tips_minute_beep;
                } else {
                    i6 = z ? R.string.earbud_alarm_delay_tips_minute : R.string.miband_alarm_delay_tips_minute;
                }
                return DeviceXFunctionsKt.getContext().getString(i6, new Object[]{i4 + ""});
            }
            if (i4 == 0) {
                if (w()) {
                    i8 = R.string.miband_alarm_delay_tips_hour_beep;
                } else {
                    i8 = z ? R.string.earbud_alarm_delay_tips_hour : R.string.miband_alarm_delay_tips_hour;
                }
                return DeviceXFunctionsKt.getContext().getString(i8, new Object[]{i3 + ""});
            }
            if (w()) {
                i7 = R.string.miband_alarm_delay_tips_hour_minute_beep;
            } else {
                i7 = z ? R.string.earbud_alarm_delay_tips_hour_minute : R.string.miband_alarm_delay_tips_hour_minute;
            }
            return DeviceXFunctionsKt.getContext().getString(i7, new Object[]{i3 + "", i4 + ""});
        }
        if (i3 == 0 && i4 == 0) {
            if (w()) {
                i12 = R.string.miband_alarm_delay_tips_days_only_beep;
            } else {
                i12 = z ? R.string.earbud_alarm_delay_tips_days_only : R.string.miband_alarm_delay_tips_days_only;
            }
            return DeviceXFunctionsKt.getContext().getString(i12, new Object[]{i2 + ""});
        }
        if (i3 > 0 && i4 == 0) {
            if (w()) {
                i11 = R.string.miband_alarm_delay_tips_days_hour_beep;
            } else {
                i11 = z ? R.string.earbud_alarm_delay_tips_days_hour : R.string.miband_alarm_delay_tips_days_hour;
            }
            return DeviceXFunctionsKt.getContext().getString(i11, new Object[]{i2 + "", i3 + ""});
        }
        if (i3 == 0 && i4 > 0) {
            if (w()) {
                i10 = R.string.miband_alarm_delay_tips_days_min_beep;
            } else {
                i10 = z ? R.string.earbud_alarm_delay_tips_days_min : R.string.miband_alarm_delay_tips_days_min;
            }
            return DeviceXFunctionsKt.getContext().getString(i10, new Object[]{i2 + "", i4 + ""});
        }
        if (w()) {
            i9 = R.string.miband_alarm_delay_tips_days_beep;
        } else {
            i9 = z ? R.string.earbud_alarm_delay_tips_days : R.string.miband_alarm_delay_tips_days;
        }
        return DeviceXFunctionsKt.getContext().getString(i9, new Object[]{i2 + "", i3 + "", i4 + ""});
    }

    private void C(List<Alarm> list, String str) {
        HMLog.i(i, r(list, str + " before sort"), new Object[0]);
        Collections.sort(list, new c());
        HMLog.i(i, r(list, str + " after sort"), new Object[0]);
    }

    private void D(List<Alarm> list) {
        Collections.sort(list, new c());
    }

    private void E(HMDeviceSource hMDeviceSource, HMBaseDevice hMBaseDevice) {
        boolean zNeedSetAlarm2Device = this.g.getValue().needSetAlarm2Device();
        boolean zNeedSyncAlarm2Cloud = this.g.getValue().needSyncAlarm2Cloud();
        HMLog.i(i, "needSetAlarm2Device: " + zNeedSetAlarm2Device + ", needSyncAlarm2Cloud: " + zNeedSyncAlarm2Cloud, new Object[0]);
        if (zNeedSetAlarm2Device) {
            ((HMMiLiDevice) hMBaseDevice).setAlarmClock((HMDeviceSource.MILI_AMAZFIT == hMDeviceSource || HMDeviceConfig.hasFeaturePro(hMDeviceSource)) ? getAllAlarmExt() : getOneBandAlarmExt(), new a());
        }
        if (zNeedSyncAlarm2Cloud) {
            HMLog.i(i, "doFree sync alarm to cloud", new Object[0]);
            this.h.getValue().updateProfile(true);
            this.g.getValue().setNeedSyncAlarm2Cloud(false);
        }
    }

    private long F(long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5));
        calendar2.add(6, 1);
        return calendar2.getTimeInMillis();
    }

    public static void destroy() {
        n = null;
    }

    private void e() {
        Analytics.event(DeviceXFunctionsKt.getContext(), StatEvent.EVENT_ALARM_CLOCK_ERROR, k);
    }

    private void f(int i2) {
        Analytics.event(DeviceXFunctionsKt.getContext(), StatEvent.EVENT_ALARM_CLOCK_ERROR, j + i2);
    }

    private boolean g(List<Alarm> list) {
        int size = list.size();
        int[] iArr = this.a == 10 ? new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9} : new int[]{0, 1, 2};
        int[] iArr2 = new int[size];
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = list.get(i2).getIndex().intValue();
        }
        Arrays.sort(iArr2);
        if (Arrays.equals(iArr, iArr2)) {
            HMLog.i(i, "alarm clock data is OK", new Object[0]);
        } else {
            HMLog.i(i, "alarm clock index data is ERROR", new Object[0]);
            for (int i3 = 0; i3 < size; i3++) {
                Alarm alarm = list.get(i3);
                alarm.setIndex(Integer.valueOf(i3));
                HMLog.i(i, "the fixed alarm clock : " + alarm, new Object[0]);
            }
            e();
            z = true;
        }
        return h(list) | z;
    }

    public static List<AlarmClockItem> getAlarmForSync() {
        ArrayList arrayList = new ArrayList();
        List<Alarm> listLoadAll = HMDaoManager.getInstance().getAlarmDao().loadAll();
        j(listLoadAll);
        for (Alarm alarm : listLoadAll) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(alarm.getCalendar().longValue());
            AlarmClockItem alarmClockItem = new AlarmClockItem();
            alarmClockItem.setCalendar(calendar);
            alarmClockItem.setEnabled(alarm.getEnabled().booleanValue());
            alarmClockItem.setUpdate(alarm.getIsUpdate().booleanValue());
            int iIntValue = alarm.getMDays().intValue();
            alarmClockItem.setDays(getCompactRepeatForNonCalendar(iIntValue));
            alarmClockItem.setDaysForSupportCalendar(iIntValue);
            alarmClockItem.setDuration(alarm.getMSmartWakeupDuration().intValue());
            alarmClockItem.setVisible(alarm.getVisible().booleanValue());
            boolean z = true;
            alarmClockItem.setLazySleepEnable(alarm.getIsSmartWakeup() == null || alarm.getIsSmartWakeup().booleanValue());
            alarmClockItem.setIndex(alarm.getIndex().intValue());
            if (alarm.getIsSmart() == null || !alarm.getIsSmart().booleanValue()) {
                z = false;
            }
            alarmClockItem.setSmart(z);
            HMLog.i(i, "sync alarm to cloud: " + alarm.toString(), new Object[0]);
            arrayList.add(alarmClockItem);
        }
        HMLog.i(i, "getAlarmForSync:", new Object[0]);
        return arrayList;
    }

    public static int getCompactRepeatForCalendar(int i2, int i3) {
        if (i3 == 31 && i2 == 128) {
            return i2;
        }
        return (i3 == 96 && i2 == 96) ? i2 : i3;
    }

    public static int getCompactRepeatForNonCalendar(int i2) {
        if (i2 == 128) {
            return 31;
        }
        if (i2 == 96) {
            return 96;
        }
        return i2;
    }

    public static AlarmClockManager getInstance() {
        if (n == null) {
            synchronized (AlarmManager.class) {
                if (n == null) {
                    n = new AlarmClockManager();
                }
            }
        }
        return n;
    }

    private boolean h(List<Alarm> list) {
        boolean z = false;
        for (Alarm alarm : list) {
            if (!alarm.getVisible().booleanValue() && alarm.getEnabled().booleanValue()) {
                z = true;
                alarm.setEnabled(Boolean.FALSE);
            }
        }
        return z;
    }

    private static void i(Alarm alarm) {
        if (alarm == null) {
            return;
        }
        if (alarm.getVisible() == null) {
            Boolean bool = Boolean.FALSE;
            alarm.setVisible(bool);
            alarm.setEnabled(bool);
            alarm.setIsSmart(bool);
        }
        if (alarm.getEnabled() == null) {
            alarm.setEnabled(Boolean.FALSE);
        }
        if (alarm.getIsSmartWakeup() == null) {
            alarm.setIsSmartWakeup(Boolean.TRUE);
        }
        if (alarm.getCalendar() == null) {
            alarm.setCalendar(Long.valueOf(System.currentTimeMillis()));
        }
        if (alarm.getMDays() == null) {
            alarm.setMDays(0);
        }
        if (alarm.getIsSmartWakeup() == null) {
            alarm.setIsSmartWakeup(Boolean.TRUE);
        }
        if (alarm.getIsUpdate() == null) {
            alarm.setIsUpdate(Boolean.FALSE);
        }
        if (alarm.getMSmartWakeupDuration() == null) {
            alarm.setMSmartWakeupDuration(0);
        }
        if (alarm.getIsSmart() == null) {
            alarm.setIsSmart(Boolean.FALSE);
        }
        if (alarm.getIndex() == null) {
            alarm.setIndex(0);
        }
    }

    public static void initAlarmForLogin(List<HMBeanAlarmClock> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HMDaoManager.getInstance().getAlarmDao().deleteAll();
        for (HMBeanAlarmClock hMBeanAlarmClock : list) {
            Alarm alarm = new Alarm();
            alarm.setCalendar(Long.valueOf(hMBeanAlarmClock.getCalendar().getTimeInMillis()));
            alarm.setEnabled(Boolean.valueOf(hMBeanAlarmClock.isEnabled()));
            alarm.setIsUpdate(Boolean.valueOf(hMBeanAlarmClock.isUpdate()));
            alarm.setMDays(Integer.valueOf(getCompactRepeatForCalendar(hMBeanAlarmClock.getDaysForSupportCalendar(), hMBeanAlarmClock.getmDays())));
            alarm.setMSmartWakeupDuration(Integer.valueOf(hMBeanAlarmClock.getmSmartWakeupDuration()));
            alarm.setVisible(Boolean.valueOf(hMBeanAlarmClock.isVisible()));
            alarm.setIsSmartWakeup(Boolean.valueOf(hMBeanAlarmClock.isLazySleepEnable()));
            alarm.setIndex(Integer.valueOf((int) hMBeanAlarmClock.getIndex()));
            alarm.setIsSmart(Boolean.valueOf(hMBeanAlarmClock.isSmart));
            AlarmDbCached.putAlarmDb(alarm);
            HMLog.i(i, "initAlarmForLogin:" + alarm, new Object[0]);
        }
        destroy();
    }

    public static boolean isSupportAlarmModule() {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        return miliDevice != null && miliDevice.supportModule(15);
    }

    private static void j(List<Alarm> list) {
        Iterator<Alarm> it2 = list.iterator();
        while (it2.hasNext()) {
            i(it2.next());
        }
    }

    private void k(List<Alarm> list) {
        Calendar calendar = Calendar.getInstance();
        for (Alarm alarm : list) {
            long jLongValue = alarm.getCalendar().longValue() + ((long) (alarm.getMSmartWakeupDuration().intValue() * 60 * 1000));
            if (alarm.getMDays().intValue() == 0 && jLongValue / 60000 <= calendar.getTimeInMillis() / 60000 && alarm.getEnabled().booleanValue()) {
                alarm.setEnabled(Boolean.FALSE);
                keepAlarm(alarm);
                HMLog.d(i, "checkOnceAlarmIfExpired : " + alarm, new Object[0]);
            }
        }
    }

    private boolean l(List<Alarm> list) {
        boolean z = false;
        boolean z2 = false;
        for (Alarm alarm : list) {
            if (z2 && alarm.getIsSmart().booleanValue()) {
                alarm.setIsSmart(Boolean.FALSE);
                z = true;
            }
            if (alarm.getIsSmart().booleanValue()) {
                z2 = true;
            }
        }
        return z;
    }

    private void m(List<Alarm> list) {
        if (list.size() <= this.a) {
            return;
        }
        f(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            if (i2 < this.a) {
                Alarm alarm = list.get(i2);
                alarm.setIndex(Integer.valueOf(i2));
                if (alarm.getVisible() == null) {
                    if (i2 < 3) {
                        alarm.setVisible(Boolean.TRUE);
                    } else {
                        Boolean bool = Boolean.FALSE;
                        alarm.setVisible(bool);
                        alarm.setEnabled(bool);
                    }
                }
                HMLog.i(i, "change alarm index : " + i2 + ", alarm id:" + alarm.getIndex(), new Object[0]);
            } else {
                list.remove(i2);
                size--;
                i2--;
                HMLog.d(i, "index : " + i2 + ", length:" + size, new Object[0]);
            }
            i2++;
        }
        g(list);
        HMLog.i(i, r(list, "闹钟数据大于mDefaultAlarmSize, deleteAlarm2Default after"), new Object[0]);
    }

    private static Alarm n(AlarmClockExt alarmClockExt) {
        Alarm alarm = new Alarm();
        alarm.setEnabled(Boolean.valueOf(alarmClockExt.isEnable()));
        alarm.setIndex(Integer.valueOf(alarmClockExt.getIndex()));
        if (alarmClockExt.getRepeat() == -128) {
            alarm.setMDays(0);
        } else {
            alarm.setMDays(Integer.valueOf(alarmClockExt.getRepeat()));
        }
        alarm.setVisible(Boolean.valueOf(alarmClockExt.isVisible()));
        alarm.setIsSmart(Boolean.valueOf(alarmClockExt.isSmart()));
        long timeInMillis = alarmClockExt.getCalendar().getTimeInMillis() / 60000;
        long jCurrentTimeMillis = System.currentTimeMillis() / 60000;
        if (alarm.getMDays().intValue() == 0 && timeInMillis <= jCurrentTimeMillis && alarm.getEnabled().booleanValue()) {
            alarmClockExt.getCalendar().add(5, 1);
            alarm.setCalendar(Long.valueOf(alarmClockExt.getCalendar().getTimeInMillis()));
        } else {
            alarm.setCalendar(Long.valueOf(alarmClockExt.getCalendar().getTimeInMillis()));
        }
        alarm.setIsSmartWakeup(Boolean.valueOf(alarmClockExt.isLazy()));
        alarm.setMSmartWakeupDuration(Integer.valueOf(alarmClockExt.getSmartWakeTime()));
        return alarm;
    }

    private void o(List<Alarm> list) {
        if (list.size() >= this.a) {
            return;
        }
        HMLog.i(i, "闹钟小于" + this.a, new Object[0]);
        int size = list.size();
        f(size);
        for (int i2 = 0; i2 < this.a; i2++) {
            if (i2 < size) {
                Alarm alarm = list.get(i2);
                if (alarm.getVisible() == null) {
                    if (i2 < 3) {
                        alarm.setVisible(Boolean.TRUE);
                    } else {
                        Boolean bool = Boolean.FALSE;
                        alarm.setVisible(bool);
                        alarm.setEnabled(bool);
                    }
                }
                if (alarm.getIsSmartWakeup() == null) {
                    alarm.setIsSmartWakeup(Boolean.TRUE);
                }
            } else {
                Alarm alarm2 = new Alarm();
                alarm2.setIndex(Integer.valueOf(i2));
                Boolean bool2 = Boolean.FALSE;
                alarm2.setVisible(bool2);
                alarm2.setEnabled(bool2);
                alarm2.setIsSmart(bool2);
                alarm2.setCalendar(Long.valueOf(System.currentTimeMillis()));
                alarm2.setMDays(0);
                alarm2.setIsUpdate(bool2);
                alarm2.setMSmartWakeupDuration(0);
                alarm2.setIsSmartWakeup(Boolean.TRUE);
                alarm2.setIndex(Integer.valueOf(i2));
                list.add(alarm2);
            }
        }
        g(list);
    }

    private void p(List<Alarm> list) {
        boolean z;
        if (list.size() >= this.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.a; i2++) {
            Iterator<Alarm> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (i2 == it2.next().getIndex().intValue()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        int size = list.size();
        for (int i3 = 0; i3 < this.a; i3++) {
            if (i3 < size) {
                Alarm alarm = list.get(i3);
                if (alarm.getVisible() == null) {
                    if (i3 < 3) {
                        alarm.setVisible(Boolean.TRUE);
                    } else {
                        Boolean bool = Boolean.FALSE;
                        alarm.setVisible(bool);
                        alarm.setEnabled(bool);
                    }
                }
                if (alarm.getIsSmartWakeup() == null) {
                    alarm.setIsSmartWakeup(Boolean.TRUE);
                }
            } else {
                Alarm alarm2 = new Alarm();
                if (arrayList.size() != 0) {
                    alarm2.setIndex((Integer) arrayList.get(0));
                    arrayList.remove(0);
                    Boolean bool2 = Boolean.FALSE;
                    alarm2.setVisible(bool2);
                    alarm2.setEnabled(bool2);
                    alarm2.setIsSmart(bool2);
                    alarm2.setCalendar(Long.valueOf(System.currentTimeMillis()));
                    alarm2.setMDays(0);
                    alarm2.setIsUpdate(bool2);
                    alarm2.setMSmartWakeupDuration(0);
                    alarm2.setIsSmartWakeup(Boolean.TRUE);
                    list.add(alarm2);
                }
            }
        }
    }

    public static void postNonDeviceAlarmEvent(HMDeviceType hMDeviceType) {
        HMDeviceAlarmEvent hMDeviceAlarmEvent = new HMDeviceAlarmEvent(hMDeviceType);
        hMDeviceAlarmEvent.fromDevice = false;
        EventBus.getDefault().post(hMDeviceAlarmEvent);
    }

    private void q(int i2, boolean[] zArr) {
        byte b2 = (byte) i2;
        byte[] bArr = {1, 2, 4, 8, 16, 32, 64};
        for (int i3 = 0; i3 < 7; i3++) {
            if ((bArr[i3] & b2) != 0) {
                zArr[i3] = true;
            }
        }
    }

    private String r(List<Alarm> list, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (Alarm alarm : list) {
            sb.append('\n');
            sb.append(alarm);
        }
        return sb.toString();
    }

    private List<Alarm> s() {
        LinkedList linkedList = new LinkedList(this.c.getAll());
        k(linkedList);
        return linkedList;
    }

    private List<Alarm> t(List<Alarm> list) {
        ArrayList arrayList = new ArrayList();
        for (Alarm alarm : list) {
            if (alarm.getVisible().booleanValue()) {
                arrayList.add(alarm);
                HMLog.d(i, "visible alarm ==> " + alarm, new Object[0]);
            }
        }
        return arrayList;
    }

    private void u(HMDeviceSource hMDeviceSource, HMBaseDevice hMBaseDevice, boolean z) {
        if (z) {
            this.g.getValue().setNeedSetAlarm2Device(true);
            this.g.getValue().setNeedSyncAlarm2Cloud(true);
        } else {
            this.g.getValue().setNeedSetAlarm2Device(false);
        }
        E(hMDeviceSource, hMBaseDevice);
    }

    public static void updateAlarmsFromDevice(List<AlarmClockExt> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("alarms:");
        sb.append(list != null ? Arrays.toString(list.toArray()) : "null");
        HMLog.i(i, sb.toString(), new Object[0]);
        if (list == null) {
            HMLog.i(i, "get alarms from device error!!!", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AlarmClockExt> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(n(it2.next()));
        }
        getInstance().replaceAlarm2DB(arrayList);
        EventBus.getDefault().post(new HMDeviceAlarmEvent(HMDeviceType.MILI));
    }

    private void v() {
        List<Alarm> listLoadAll = HMDaoManager.getInstance().getAlarmDao().loadAll();
        HMLog.i(i, "initDefaultAlarmClock2DB: " + listLoadAll.size(), new Object[0]);
        if (listLoadAll.size() > 0) {
            HMLog.i(i, "Alarm size > 0", new Object[0]);
            return;
        }
        for (int i2 = 0; i2 < 10; i2++) {
            Alarm alarm = new Alarm();
            alarm.setIndex(Integer.valueOf(i2));
            Boolean bool = Boolean.FALSE;
            alarm.setEnabled(bool);
            alarm.setIsUpdate(bool);
            alarm.setIsSmart(bool);
            alarm.setMSmartWakeupDuration(0);
            Boolean bool2 = Boolean.TRUE;
            alarm.setIsSmartWakeup(bool2);
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 7);
            calendar.set(12, 0);
            calendar.set(14, 0);
            if (i2 == 0) {
                alarm.setVisible(bool2);
                alarm.setMDays(31);
                alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            } else if (i2 == 1) {
                alarm.setVisible(bool2);
                alarm.setMDays(127);
                alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            } else if (i2 == 2) {
                alarm.setVisible(bool2);
                alarm.setMDays(0);
                alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            } else {
                alarm.setVisible(bool);
                alarm.setMDays(0);
                alarm.setCalendar(Long.valueOf(System.currentTimeMillis()));
            }
            HMDaoManager.getInstance().getAlarmDao().insert(alarm);
        }
    }

    private boolean w() {
        return this.f.getValue().getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_TOKYO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int x(Alarm alarm, Alarm alarm2) {
        return alarm.getIndex().intValue() - alarm2.getIndex().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int y(Alarm alarm, Alarm alarm2) {
        return alarm.getIndex().intValue() - alarm2.getIndex().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "switch alarm only support MILI";
    }

    public AlarmClockExt alarm2Ext(Alarm alarm) {
        AlarmClockExt alarmClockExt = new AlarmClockExt((byte) alarm.getIndex().intValue());
        alarmClockExt.setEnable(alarm.getEnabled().booleanValue());
        alarmClockExt.setRepeat(alarm.getMDays().intValue());
        alarmClockExt.setVisible(alarm.getVisible().booleanValue());
        alarmClockExt.setSmart(alarm.getIsSmart().booleanValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        alarmClockExt.setCalendar(calendar);
        alarmClockExt.enableLazyMode(alarm.getIsSmartWakeup() == null || alarm.getIsSmartWakeup().booleanValue());
        if (alarm.getMDays().intValue() == 0) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = alarmClockExt.getCalendar();
            calendar2.set(13, 0);
            calendar3.set(13, 0);
            if (calendar3.before(calendar2)) {
                alarmClockExt.getCalendar().add(5, 1);
            }
        }
        return alarmClockExt;
    }

    public AlarmClockItem alarm2Item(Alarm alarm) {
        AlarmClockItem alarmClockItem = new AlarmClockItem();
        alarmClockItem.setEnabled(alarm.getEnabled().booleanValue());
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        alarmClockItem.setCalendar(calendar);
        alarmClockItem.setDays(alarm.getMDays().intValue());
        return alarmClockItem;
    }

    public boolean checkAlarmData() {
        List<Alarm> listLoadAll = HMDaoManager.getInstance().getAlarmDao().loadAll();
        HMLog.i(i, "checkAlarmData: " + listLoadAll.size(), new Object[0]);
        this.a = isNormalAlarmSize() ? 3 : 10;
        Collections.sort(listLoadAll, new Comparator() { // from class: va
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AlarmClockManager.x((Alarm) obj, (Alarm) obj2);
            }
        });
        int size = listLoadAll.size();
        j(listLoadAll);
        boolean z = true;
        boolean z2 = !this.e && l(listLoadAll);
        int i2 = this.a;
        if (size < i2) {
            o(listLoadAll);
        } else if (size > i2) {
            m(listLoadAll);
        } else {
            z = z2;
        }
        boolean zG = g(listLoadAll) | z;
        HMLog.i(i, "checkAlarmData changed: " + zG, new Object[0]);
        if (zG) {
            HMDaoManager.getInstance().getAlarmDao().deleteAll();
            ((DefaultAlarmCached) this.c).setMemoryCached(listLoadAll);
            try {
                HMDaoManager.getInstance().getAlarmDao().insertInTx(listLoadAll);
            } catch (Exception e) {
                HMLog.i(i, "checkAlarmData exception: " + e.getMessage(), new Object[0]);
            }
        }
        return zG;
    }

    public Alarm copyAlarm(Alarm alarm) {
        i(alarm);
        Alarm alarm2 = new Alarm();
        alarm2.setId(alarm.getId());
        alarm2.setIsSmart(alarm.getIsSmart());
        alarm2.setCalendar(alarm.getCalendar());
        alarm2.setEnabled(alarm.getEnabled());
        alarm2.setVisible(alarm.getVisible());
        alarm2.setIndex(alarm.getIndex());
        alarm2.setMSmartWakeupDuration(alarm.getMSmartWakeupDuration());
        alarm2.setMDays(alarm.getMDays());
        alarm2.setIsSmartWakeup(alarm.getIsSmartWakeup());
        alarm2.setIsUpdate(alarm.getIsUpdate());
        return alarm2;
    }

    public synchronized void correctAlarmWhenDoFree(HMDeviceSource hMDeviceSource, HMBaseDevice hMBaseDevice) {
        if (hMBaseDevice instanceof HMMiLiDevice) {
            setSupportMultiSmartAlert(((HMMiLiDevice) hMBaseDevice).isHuamiOs());
        } else {
            setSupportMultiSmartAlert(false);
        }
        if (HMDeviceType.MILI == hMDeviceSource.getType() && !ConfigHelperKt.hasFeature(Feature.SUPPORT_CHANGE_ALARM_ON_DEVICE, hMDeviceSource)) {
            u(hMDeviceSource, hMBaseDevice, checkAlarmData());
            return;
        }
        if (!this.e && A()) {
            u(hMDeviceSource, hMBaseDevice, true);
        }
    }

    public String getAlarmAgainTipStr(int i2) {
        return DeviceXFunctionsKt.getContext().getResources().getQuantityString(R.plurals.alart_later_time, i2, Integer.valueOf(i2));
    }

    public Alarm getAlarmByIndex(int i2) {
        Alarm alarm;
        synchronized (this.b) {
            alarm = this.c.get(i2);
        }
        return alarm;
    }

    public List<AlarmClockExt> getAllAlarmExt() {
        List<Alarm> listS = s();
        ArrayList arrayList = new ArrayList();
        Iterator<Alarm> it2 = listS.iterator();
        while (it2.hasNext()) {
            arrayList.add(alarm2Ext(it2.next()));
        }
        return arrayList;
    }

    public int getAvailableId() {
        for (Alarm alarm : this.c.getAll()) {
            if (!alarm.getVisible().booleanValue()) {
                HMLog.d(i, "getAvailableId : " + alarm.getIndex(), new Object[0]);
                return alarm.getIndex().intValue();
            }
        }
        return -1;
    }

    public int getCountdown(int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        int i5 = calendar.get(7);
        int i6 = ((i2 * 60) + i3) - ((calendar.get(11) * 60) + calendar.get(12));
        if (i4 == 127) {
            if (i6 > 0) {
                return i6;
            }
        } else if (i4 != 0) {
            if (i4 != 31) {
                if (i4 == 128) {
                    return 0;
                }
                boolean[] zArr = {false, false, false, false, false, false, false};
                if (i4 == 96) {
                    zArr[5] = true;
                    zArr[6] = true;
                } else {
                    q(i4, zArr);
                }
                int i7 = 1 != i5 ? i5 - 2 : 6;
                for (int i8 = 0; i8 <= 7; i8++) {
                    if (zArr[(i7 + i8) % 7]) {
                        if (i8 != 0) {
                            return i6 + (i8 * 24 * 60);
                        }
                        if (i6 > 0) {
                            return i6;
                        }
                    }
                }
                return i6;
            }
            HMLog.d(i, "day of week : " + i5, new Object[0]);
            if (i5 != 1) {
                if (i5 == 7) {
                    return i6 + 2880;
                }
                if (i5 == 6) {
                    return i6 <= 0 ? i6 + 4320 : i6;
                }
                if (i6 > 0) {
                    return i6;
                }
            }
        } else if (i6 > 0) {
            return i6;
        }
        return i6 + 1440;
    }

    public String getEarbudStatusTipStr(Alarm alarm) {
        if (!alarm.getEnabled().booleanValue()) {
            return DeviceXFunctionsKt.getContext().getString(R.string.alert_disable);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        return parseCountdownStr(getCountdown(calendar.get(11), calendar.get(12), getCompactRepeatForNonCalendar(alarm.getMDays().intValue())), true);
    }

    public String getEarbudTipStr(int i2, int i3, int i4) {
        return parseCountdownStr(getCountdown(i2, i3, i4), true);
    }

    public int getEnableAlarmSize() {
        Iterator<Alarm> it2 = getShowAlarm().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next().getEnabled().booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public List<AlarmClockExt> getOneBandAlarmExt() {
        resetAlarmForOneBand();
        List<Alarm> listS = s();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(alarm2Ext(listS.get(i2)));
        }
        return arrayList;
    }

    public List<Alarm> getShowAlarm() {
        List<Alarm> listT = t(s());
        if (this.f.getValue().hasBound(HMDeviceType.MILI) && !HMDeviceConfig.hasFeatureProDevice() && !this.f.getValue().hasBound(HMDeviceSource.MILI_AMAZFIT) && listT.size() >= 3) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(listT.get(i2));
            }
            listT.clear();
            listT.addAll(arrayList);
        }
        D(listT);
        HMLog.i(i, "show alarm size : " + listT.size(), new Object[0]);
        return listT;
    }

    public Alarm getSmartAlarm() {
        synchronized (this.b) {
            for (Alarm alarm : this.c.getAll()) {
                if (alarm.getIsSmart().booleanValue()) {
                    return copyAlarm(alarm);
                }
            }
            return null;
        }
    }

    public String getStatusTipStr(Alarm alarm, boolean z) {
        if (!alarm.getEnabled().booleanValue()) {
            return DeviceXFunctionsKt.getContext().getString(R.string.alert_disable);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int iIntValue = alarm.getMDays().intValue();
        if (!z) {
            iIntValue = getCompactRepeatForNonCalendar(iIntValue);
        }
        return parseCountdownStr(getCountdown(i2, i3, iIntValue), false);
    }

    public String getStatusTipStrForLaterRemind(Alarm alarm, boolean z) {
        if (!alarm.getEnabled().booleanValue() || alarm.getMSmartWakeupDuration().intValue() <= 0) {
            HMLog.i(i, "getStatusTipStrForLaterRemind return off, alarm: " + alarm, new Object[0]);
            return DeviceXFunctionsKt.getContext().getString(R.string.alert_disable);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue() + ((long) (alarm.getMSmartWakeupDuration().intValue() * 60 * 1000)));
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int iIntValue = alarm.getMDays().intValue();
        if (!z) {
            iIntValue = getCompactRepeatForNonCalendar(iIntValue);
        }
        return parseCountdownStr(getCountdown(i2, i3, iIntValue), false);
    }

    public String getWeekString(Alarm alarm, boolean z) {
        StringBuilder sb = new StringBuilder();
        int iIntValue = alarm.getMDays().intValue();
        if (iIntValue == 0) {
            return DeviceXFunctionsKt.getContext().getString(R.string.only_once);
        }
        if (iIntValue == 127) {
            return DeviceXFunctionsKt.getContext().getString(R.string.every_day);
        }
        if (iIntValue == 31) {
            return DeviceXFunctionsKt.getContext().getString(R.string.monday_to_friday);
        }
        if (iIntValue == 128) {
            return DeviceXFunctionsKt.getContext().getString(z ? R.string.workday : R.string.monday_to_friday);
        }
        if (iIntValue == 96 && z) {
            return DeviceXFunctionsKt.getContext().getString(R.string.weekend);
        }
        int i2 = 0;
        for (int i3 = iIntValue; i3 > 0; i3 >>= 1) {
            if ((i3 & 1) == 1) {
                i2++;
            }
        }
        String[] stringArray = !Language.isChinese() ? DeviceXFunctionsKt.getContext().getResources().getStringArray(R.array.weeks_short) : DeviceXFunctionsKt.getContext().getResources().getStringArray(R.array.weeks);
        for (int i4 = 0; i4 < 7; i4++) {
            if (((1 << i4) & iIntValue) != 0) {
                sb.append(stringArray[i4]);
                i2--;
                if (i2 > 0) {
                    sb.append(StringUtil.SPACE);
                }
            }
        }
        HMLog.d(i, "week string : " + sb.toString(), new Object[0]);
        return sb.toString();
    }

    public boolean isNormalAlarmSize() {
        DeviceManagerApi value = this.f.getValue();
        return !value.hasBound(HMDeviceType.MILI) || value.hasBound(HMDeviceSource.MILI) || value.hasBound(HMDeviceSource.MILI_1A) || value.hasBound(HMDeviceSource.MILI_1S);
    }

    public boolean isSupportMultiSmartAlert() {
        return this.e;
    }

    public boolean isSupportSmartAlarm() {
        return this.d || this.e;
    }

    public void keepAlarm(@NonNull Alarm alarm) {
        synchronized (this.b) {
            this.c.put(alarm);
        }
    }

    public void keepVisibleAlarm(@NonNull Alarm alarm) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(alarm);
        saveVisibleAlarm(arrayList);
    }

    public void migrateAlarmClock(HMDeviceSource hMDeviceSource) {
        if (HMDeviceConfig.hasFeatureDefaultLazyAlarm(hMDeviceSource)) {
            List<Alarm> all = this.c.getAll();
            boolean z = false;
            for (Alarm alarm : all) {
                if (!alarm.getIsSmartWakeup().booleanValue()) {
                    z = true;
                    alarm.setIsSmartWakeup(Boolean.TRUE);
                }
            }
            if (z) {
                HMLog.i(i, "migrate alarm, turn on lazy mode", new Object[0]);
                replaceAlarm2DB(all);
            }
        }
    }

    public String parseCountdownStr(int i2, boolean z) {
        int i3 = i2 / 1440;
        int i4 = i2 % 1440;
        return B(i3, i4 / 60, i4 % 60, z);
    }

    public void replaceAlarm2DB(List<Alarm> list) {
        HMLog.i(i, r(list, "replaceAlarm2DB"), new Object[0]);
        p(list);
        this.c.replaceAll(list);
    }

    public void resetAlarmForOneBand() {
        List<Alarm> listT = t(s());
        C(listT, "getOneBandAlarms");
        int size = listT.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 < size) {
                HMLog.i(i, "resetAlarmForOneBand:" + listT.get(i2), new Object[0]);
                Alarm alarm = listT.get(i2);
                alarm.setIndex(Integer.valueOf(i2));
                arrayList.add(alarm);
            }
        }
        for (int size2 = arrayList.size(); size2 < 10; size2++) {
            Alarm alarm2 = new Alarm();
            alarm2.setIndex(Integer.valueOf(size2));
            Boolean bool = Boolean.FALSE;
            alarm2.setVisible(bool);
            alarm2.setEnabled(bool);
            alarm2.setIsSmart(bool);
            alarm2.setIsUpdate(bool);
            alarm2.setMSmartWakeupDuration(0);
            alarm2.setMDays(0);
            alarm2.setIsSmartWakeup(Boolean.TRUE);
            alarm2.setCalendar(Long.valueOf(System.currentTimeMillis()));
            arrayList.add(alarm2);
        }
        this.c.putAll(arrayList);
    }

    public void saveAlarm2DB(List<Alarm> list) {
        HMLog.i(i, r(list, "saveAlarm2DB"), new Object[0]);
        this.c.putAll(list);
    }

    public void saveVisibleAlarm(List<Alarm> list) {
        synchronized (this.b) {
            this.c.putAll(list);
        }
    }

    public boolean setAlarm4Once(Alarm alarm) {
        boolean z = false;
        if (alarm.getMDays().intValue() == 0 && alarm.getEnabled().booleanValue()) {
            Calendar calendar = Calendar.getInstance();
            HMLog.d(i, "alarm :" + alarm, new Object[0]);
            calendar.setTimeInMillis(alarm.getCalendar().longValue());
            int i2 = calendar.get(11);
            int i3 = calendar.get(12);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, i2);
            calendar2.set(12, i3);
            calendar2.set(13, 0);
            HMLog.d(i, "before add one day :" + TimeUtils.debugTime(calendar2.getTimeInMillis()), new Object[0]);
            Calendar calendar3 = Calendar.getInstance();
            HMLog.d(i, "calendarNow :" + TimeUtils.debugTime(calendar3.getTimeInMillis()), new Object[0]);
            if (calendar2.getTimeInMillis() / 60000 <= calendar3.getTimeInMillis() / 60000) {
                calendar2.add(6, 1);
                HMLog.d(i, "after add one day :" + TimeUtils.debugTime(calendar2.getTimeInMillis()), new Object[0]);
                z = true;
            }
            alarm.setCalendar(Long.valueOf(calendar2.getTimeInMillis()));
            keepAlarm(alarm);
        }
        return z;
    }

    public void setAlarmClockFromSpeech(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(VoiceProtocol.INTENTION);
            JSONObject jSONObject = new JSONObject(jSONObjectOptJSONObject.optString("date_time"));
            String strOptString = jSONObjectOptJSONObject.optString("circle");
            String strOptString2 = jSONObjectOptJSONObject.optString(JsonParseUtils.CIRCLE_EXTRA);
            String strReplace = jSONObject.optString("value").replace(ExifInterface.GPS_DIRECTION_TRUE, " ");
            jSONObject.optLong("value_timestamp");
            Alarm alarm = new Alarm();
            alarm.setIndex(Integer.valueOf(getAvailableId()));
            Boolean bool = Boolean.TRUE;
            alarm.setEnabled(bool);
            alarm.setVisible(bool);
            HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) this.f.getValue().getDevice(HMDeviceType.MILI);
            alarm.setCalendar(Long.valueOf(TimeUtils.parseStringToLong("yyyy-MM-dd HH:mm:ss", strReplace)));
            if (strOptString.equalsIgnoreCase(JsonParseUtils.CIRCLE_ONCE)) {
                alarm.setMDays(0);
            } else if (strOptString.equalsIgnoreCase(JsonParseUtils.CIRCLE_EVERYDAY)) {
                alarm.setMDays(127);
            } else if (strOptString.equalsIgnoreCase(JsonParseUtils.CIRCLE_EVERYWEEK)) {
                int i2 = 0;
                for (String str2 : strOptString2.split(" ")) {
                    String[] strArr = AlarmClockItem.WEEKS;
                    if (str2.equalsIgnoreCase(strArr[0])) {
                        i2 |= AlarmClockItem.WEEK_MASK[0];
                    }
                    if (str2.equalsIgnoreCase(strArr[1])) {
                        i2 |= AlarmClockItem.WEEK_MASK[1];
                    }
                    if (str2.equalsIgnoreCase(strArr[2])) {
                        i2 |= AlarmClockItem.WEEK_MASK[2];
                    }
                    if (str2.equalsIgnoreCase(strArr[3])) {
                        i2 |= AlarmClockItem.WEEK_MASK[3];
                    }
                    if (str2.equalsIgnoreCase(strArr[4])) {
                        i2 |= AlarmClockItem.WEEK_MASK[4];
                    }
                    if (str2.equalsIgnoreCase(strArr[5])) {
                        i2 |= AlarmClockItem.WEEK_MASK[5];
                    }
                    if (str2.equalsIgnoreCase(strArr[6])) {
                        i2 |= AlarmClockItem.WEEK_MASK[6];
                    }
                }
                alarm.setMDays(Integer.valueOf(i2));
            } else if (strOptString.contains("to")) {
                String[] strArrSplit = strOptString.split("to");
                int i3 = 0;
                int i4 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    String[] strArr2 = AlarmClockItem.WEEKS;
                    if (i3 >= strArr2.length) {
                        break;
                    }
                    if (strArr2[i3].equalsIgnoreCase(strArrSplit[0])) {
                        z = true;
                    }
                    if (z && !z2) {
                        i4 |= AlarmClockItem.WEEK_MASK[i3];
                    }
                    if (strArr2[i3].equalsIgnoreCase(strArrSplit[1])) {
                        z2 = true;
                    }
                    i3++;
                }
                alarm.setMDays(Integer.valueOf(i4));
            }
            hMMiLiDevice.setAlarmClock(alarm2Ext(alarm), new b(alarm));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setSupportMultiSmartAlert(boolean z) {
        this.e = z;
    }

    public boolean switchAlarm(HMDeviceType hMDeviceType, Alarm alarm, boolean z) {
        HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
        if (hMDeviceType != hMDeviceType2) {
            HMLog.info(i, new Function0() { // from class: wa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlarmClockManager.z();
                }
            });
            return false;
        }
        String json = ((DeviceUtilsApi) KoinJavaComponent.inject(DeviceUtilsApi.class).getValue()).getGson().toJson(alarm);
        alarm.setEnabled(Boolean.valueOf(z));
        setAlarm4Once(alarm);
        keepVisibleAlarm(alarm);
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) ((DeviceManagerApi) KoinJavaComponent.inject(DeviceManagerApi.class).getValue()).getDevice(hMDeviceType2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(alarm2Ext(alarm));
        boolean alarmSync = hMMiLiDevice.setAlarmSync(arrayList);
        if (!alarmSync) {
            keepVisibleAlarm((Alarm) ((DeviceUtilsApi) KoinJavaComponent.inject(DeviceUtilsApi.class).getValue()).getGson().fromJson(json, Alarm.class));
        }
        return alarmSync;
    }

    public void syncAlarmToCloud(boolean z) {
        this.h.getValue().updateProfile(z);
    }

    public void updateAlarmSwitch(SparseArray<Boolean> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            HMLog.d(i, "index:" + sparseArray.keyAt(i2) + ",enable:" + sparseArray.valueAt(i2), new Object[0]);
        }
        List<Alarm> listS = s();
        if (listS == null || listS.size() <= 0) {
            return;
        }
        for (Alarm alarm : listS) {
            int iIntValue = alarm.getIndex().intValue();
            HMLog.d(i, "index:" + iIntValue + ",enable:" + alarm.getEnabled() + ",date:" + new Date(alarm.getCalendar().longValue()), new Object[0]);
            Boolean bool = sparseArray.get(iIntValue);
            if (bool != null) {
                alarm.setEnabled(bool);
                if (bool.booleanValue() && alarm.getMDays().intValue() == 0) {
                    alarm.setCalendar(Long.valueOf(F(alarm.getCalendar().longValue())));
                }
            }
        }
        saveAlarm2DB(listS);
    }

    public String getStatusTipStr(int i2, int i3, int i4) {
        return parseCountdownStr(getCountdown(i2, i3, i4), false);
    }

    public String getWeekString(Alarm alarm) {
        return getWeekString(alarm, false);
    }
}
