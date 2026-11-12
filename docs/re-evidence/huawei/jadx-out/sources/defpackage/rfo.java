package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.EventAlarmInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rfo implements Serializable {
    private static String e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47270c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47269b = 0;
    private int k = 0;
    private int f = 0;
    private String i = null;
    private String d = null;
    private String j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47268a = 0;
    private int l = 1;
    private int o = 0;
    private long h = 0;
    private long g = 0;

    public void d(long j) {
        this.h = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void e(long j) {
        this.g = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.f47270c))).intValue();
    }

    public void a(int i) {
        this.f47270c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.f47269b))).intValue();
    }

    public void b(int i) {
        this.f47269b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String h() {
        return (String) lst.d(this.i);
    }

    public void e(String str) {
        this.i = (String) lst.d(str);
    }

    public String e() {
        return (String) lst.d(this.d);
    }

    public void d(String str) {
        this.d = (String) lst.d(str);
    }

    public String d() {
        return (String) lst.d(this.j);
    }

    public void c(String str) {
        this.j = (String) lst.d(str);
    }

    public int j() {
        return ((Integer) lst.d(Integer.valueOf(this.k))).intValue();
    }

    public void c(int i) {
        this.k = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int f() {
        return ((Integer) lst.d(Integer.valueOf(this.f))).intValue();
    }

    public void e(int i) {
        this.f = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int g() {
        return ((Integer) lst.d(Integer.valueOf(this.l))).intValue();
    }

    public void f(int i) {
        this.l = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int a() {
        return this.f47268a;
    }

    public void d(int i) {
        this.f47268a = i;
    }

    public String toString() {
        return "AlarmListItem{alarmEnable=" + this.f47270c + ", alarmDbTime=" + this.f47269b + ", repeat=" + this.k + ", eventIndex=" + this.f + ", alarmTime='" + this.i + "', alarmContent='" + this.d + "', alarmRepeat='" + this.j + "', type=" + this.l + ",  alarmLegalHolidayEnable=" + this.f47268a + ",needSendAlarm=" + this.o + ", createTimestamp=" + this.h + ", modifiedTimestamp=" + this.g + '}';
    }

    public rfo b(rfo rfoVar, EventAlarmInfo eventAlarmInfo, rdc rdcVar, Context context) {
        if (eventAlarmInfo != null && rdcVar != null && context != null) {
            String strB = rdc.b(context, (eventAlarmInfo.getEventAlarmStartTimeHour() * 100) + eventAlarmInfo.getEventAlarmStartTimeMin());
            LogUtil.a("AlarmListItem", "strTime ", strB);
            rfoVar.a(eventAlarmInfo.getEventAlarmEnable());
            rfoVar.b((eventAlarmInfo.getEventAlarmStartTimeHour() * 100) + eventAlarmInfo.getEventAlarmStartTimeMin());
            rfoVar.e(strB);
            rfoVar.d(eventAlarmInfo.getEventAlarmName());
            String strD = rdcVar.d(eventAlarmInfo.getEventAlarmRepeat());
            rfoVar.c(strD);
            rfoVar.e(eventAlarmInfo.getEventAlarmIndex());
            rfoVar.f(1);
            LogUtil.a("AlarmListItem", "weekRepeat", strD);
            rfoVar.c(eventAlarmInfo.getEventAlarmRepeat());
            rfoVar.d(eventAlarmInfo.getEventAlarmLegalHolidayEnable());
            rfoVar.d(eventAlarmInfo.getCreateTimestamp());
            rfoVar.e(eventAlarmInfo.getModifiedTimestamp());
        }
        return rfoVar;
    }

    public rfo e(rfo rfoVar, EventAlarmInfo eventAlarmInfo, rdc rdcVar, List<EventAlarmInfo> list, int i) {
        if (eventAlarmInfo != null && rdcVar != null && list != null) {
            LogUtil.a("AlarmListItem", "EventAlarmStartTime ", Integer.valueOf((eventAlarmInfo.getEventAlarmStartTimeHour() * 100) + eventAlarmInfo.getEventAlarmStartTimeMin()));
            LogUtil.a("AlarmListItem", "EventAlarmInfo ", eventAlarmInfo.toString());
            DeviceCapability deviceCapabilityA = eej.a(e);
            boolean zIsSupportChangeAlarm = deviceCapabilityA != null ? deviceCapabilityA.isSupportChangeAlarm() : false;
            LogUtil.a("AlarmListItem", "bIsSupportChangeAlarm is ", Boolean.valueOf(zIsSupportChangeAlarm));
            if (zIsSupportChangeAlarm) {
                LogUtil.a("AlarmListItem", "device is support modify");
                rfoVar.a(eventAlarmInfo.getEventAlarmEnable());
            } else if (eventAlarmInfo.getEventAlarmRepeat() == 0 && eventAlarmInfo.getEventAlarmEnable() == 1) {
                int iD = d(eventAlarmInfo, BaseApplication.b());
                rfoVar.a(iD);
                if (iD == 0) {
                    this.o = 1;
                    b(list, i, iD);
                }
            } else {
                rfoVar.a(eventAlarmInfo.getEventAlarmEnable());
            }
            String strB = rdc.b(BaseApplication.b(), (eventAlarmInfo.getEventAlarmStartTimeHour() * 100) + eventAlarmInfo.getEventAlarmStartTimeMin());
            rfoVar.b((eventAlarmInfo.getEventAlarmStartTimeHour() * 100) + eventAlarmInfo.getEventAlarmStartTimeMin());
            rfoVar.e(strB);
            rfoVar.d(eventAlarmInfo.getEventAlarmName());
            rfoVar.c(eventAlarmInfo.getEventAlarmRepeat());
            rfoVar.c(rdcVar.d(eventAlarmInfo.getEventAlarmRepeat()));
            rfoVar.f(1);
            rfoVar.e(eventAlarmInfo.getEventAlarmIndex());
            rfoVar.d(eventAlarmInfo.getEventAlarmLegalHolidayEnable());
            rfoVar.d(eventAlarmInfo.getCreateTimestamp());
            rfoVar.e(eventAlarmInfo.getModifiedTimestamp());
            LogUtil.a("AlarmListItem", "alarm ", rfoVar.toString());
        }
        return rfoVar;
    }

    private void b(List<EventAlarmInfo> list, int i, int i2) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        list.get(i).setEventAlarmEnable(i2);
    }

    public int i() {
        return this.o;
    }

    private int d(EventAlarmInfo eventAlarmInfo, Context context) {
        int eventAlarmEnable = eventAlarmInfo.getEventAlarmEnable();
        String strE = SharedPreferenceManager.e(context, String.valueOf(10022), "ONCE_EVENT_ALARM_INFO");
        LogUtil.a("AlarmListItem", "once onceEventAlarmIsOver json ", strE);
        if (!TextUtils.isEmpty(strE)) {
            eventAlarmEnable = c(eventAlarmInfo, strE);
        } else {
            LogUtil.j("AlarmListItem", "once onceEventAlarmIsOver json is null");
        }
        LogUtil.a("AlarmListItem", "nce onceEventAlarmIsOver itemEventAlarmEnable ", Integer.valueOf(eventAlarmEnable));
        return eventAlarmEnable;
    }

    private int c(EventAlarmInfo eventAlarmInfo, String str) {
        int eventAlarmEnable = eventAlarmInfo.getEventAlarmEnable();
        List<EventAlarmInfo> list = (List) new Gson().fromJson(str, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.ui.device.views.alarm.AlarmListItem$1
        }.getType());
        if (list != null && !list.isEmpty()) {
            for (EventAlarmInfo eventAlarmInfo2 : list) {
                if (eventAlarmInfo2.getEventAlarmIndex() == eventAlarmInfo.getEventAlarmIndex()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    LogUtil.a("AlarmListItem", "once curTime ", Long.valueOf(jCurrentTimeMillis));
                    if (jCurrentTimeMillis >= eventAlarmInfo2.getEventAlarmTime()) {
                        eventAlarmEnable = 0;
                    }
                }
            }
        }
        return eventAlarmEnable;
    }

    public static void b(String str) {
        e = str;
    }
}
