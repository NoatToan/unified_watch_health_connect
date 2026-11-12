package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarAllSyncInfo;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarDbBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.DeviceCalendarSyncInfo;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SimpleCalendarBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SmartSimpleCalendarBean;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class mrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mrf f42250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Condition f42251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42252c;
    private static final Lock d;
    private static final Object e;
    private Handler f;
    private ContentObserver g;
    private ConcurrentLinkedQueue<SimpleCalendarBean> h;
    private ContentResolver j;
    private ConcurrentLinkedQueue<List<SimpleCalendarBean>> k;
    private ExtendHandler m;
    private HandlerThread o;
    private b i = new b();
    private Map<String, Boolean> l = new ConcurrentHashMap(16);

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        d = reentrantLock;
        f42252c = new Object();
        e = new Object();
        f42251b = reentrantLock.newCondition();
    }

    private mrf() {
        h();
    }

    public static mrf d() {
        mrf mrfVar;
        synchronized (f42252c) {
            if (f42250a == null) {
                f42250a = new mrf();
            }
            mrfVar = f42250a;
        }
        return mrfVar;
    }

    private static void o() {
        synchronized (f42252c) {
            f42250a = null;
        }
    }

    private void h() {
        this.k = new ConcurrentLinkedQueue<>();
        this.h = new ConcurrentLinkedQueue<>();
        this.o = new HandlerThread("observe_calendar_change_thread");
        this.m = HandlerCenter.b(this.i, "CalendarSyncUtils");
        this.o.start();
        this.f = new Handler(this.o.getLooper());
        mra.b();
    }

    public void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("CalendarSyncUtils", "storeLastUpdated: deviceId is null or empty.");
            return;
        }
        ReleaseLogUtil.d("R_CalendarSyncUtils", "storeLastUpdated.");
        List<CalendarDbBean> listJ = j();
        long size = listJ.size();
        ArrayList arrayList = new ArrayList();
        Iterator<CalendarDbBean> it = listJ.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            CalendarDbBean next = it.next();
            if (next.getOperation() == 2) {
                arrayList.add(next.getEventUuid());
                mra.a(str2, next.getEventUuid());
                it.remove();
            } else {
                hashSet.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        mra.a(str, str2, arrayList2, size, z);
        f();
        ReleaseLogUtil.d("R_CalendarSyncUtils", "storeLastUpdated: SYNC SUCCESSFULLY. currentDeleted Size: ", Integer.valueOf(arrayList.size()), "updateContactBeans Size: ", Integer.valueOf(arrayList2.size()));
    }

    private List<CalendarDbBean> j() {
        if (this.h.isEmpty()) {
            LogUtil.a("CalendarSyncUtils", "getCurrentSynced: current update queue is empty.");
            return Collections.EMPTY_LIST;
        }
        LogUtil.a("CalendarSyncUtils", "getCurrentSynced: start");
        ArrayList arrayList = new ArrayList(this.h.size());
        for (SimpleCalendarBean simpleCalendarBean : this.h) {
            if (simpleCalendarBean instanceof SmartSimpleCalendarBean) {
                LogUtil.a("CalendarSyncUtils", "build smartWatch CalendarVcard");
                SmartSimpleCalendarBean smartSimpleCalendarBean = (SmartSimpleCalendarBean) simpleCalendarBean;
                arrayList.add(new CalendarDbBean(smartSimpleCalendarBean.getEventId(), smartSimpleCalendarBean.getOperation(), smartSimpleCalendarBean.getEventId(), smartSimpleCalendarBean.getDtstart(), smartSimpleCalendarBean.getDtend(), smartSimpleCalendarBean.getAllDay(), mrd.d(smartSimpleCalendarBean)));
            } else {
                arrayList.add(new CalendarDbBean(simpleCalendarBean.getEventUuid(), simpleCalendarBean.getOperation(), simpleCalendarBean.getEventId(), simpleCalendarBean.getDtstart(), simpleCalendarBean.getDtend(), simpleCalendarBean.getAllDay(), mrd.c(simpleCalendarBean)));
            }
        }
        LogUtil.a("CalendarSyncUtils", "getCurrentSynced: currentUpdated list's size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void a(String str, String str2, int i, int i2, boolean z) {
        if (!mri.b()) {
            mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 6);
            LogUtil.j("CalendarSyncUtils", "syncCalendarData: no contact permission.");
            this.l.remove(str);
            return;
        }
        boolean zE = mra.e(str2, str);
        boolean zC = mri.c();
        ReleaseLogUtil.d("R_CalendarSyncUtils", "syncCalendarData： isSynchronizedOnce: ", Boolean.valueOf(zE), " ,isSyncFlag: ", Boolean.valueOf(zC));
        if (zE && zC) {
            b(str, i, i2, z);
        } else {
            a(str, i, i2, str2, z);
        }
    }

    private void a(String str, int i, int i2, String str2, boolean z) {
        synchronized (e) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("CalendarSyncUtils", "syncAllContacts: deviceId is null or empty.");
                this.l.clear();
                return;
            }
            if (!mri.b()) {
                mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 6);
                LogUtil.j("CalendarSyncUtils", "syncAllContacts: no contacts permissions");
                this.l.remove(str);
                return;
            }
            mra.b(str);
            List<SimpleCalendarBean> listC = c(str, i, i2, z);
            ReleaseLogUtil.d("R_CalendarSyncUtils", "syncAllCalendar: ", Integer.valueOf(listC.size()));
            if (listC.isEmpty()) {
                c(str, str2, z);
                return;
            }
            if (!z && listC.size() > i) {
                listC = listC.subList(0, i);
            }
            b(listC, str, z ? 1 : 0, 0);
        }
    }

    private void c(String str, String str2, boolean z) {
        if (!mri.c() && TextUtils.isEmpty(str2)) {
            mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 4);
            this.l.remove(str);
            return;
        }
        if (mri.e()) {
            String str3 = "calendar_data_" + System.currentTimeMillis() + ".json";
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            Gson gson = new Gson();
            LogUtil.a("CalendarSyncUtils", "calendarMinor");
            CalendarAllSyncInfo calendarAllSyncInfo = new CalendarAllSyncInfo();
            calendarAllSyncInfo.setMajor(CommonUtil.k(BaseApplication.getContext()));
            calendarAllSyncInfo.setMinor(0L);
            calendarAllSyncInfo.setCalendarBeanList(arrayList);
            if (!mrh.c(gson.toJson(calendarAllSyncInfo), mrg.f42255c, str3, 0)) {
                LogUtil.j("CalendarSyncUtils", "clearCacheInitSync: vcard text write to file failed. ");
                this.l.remove(str);
                return;
            }
            mqy.d().d(mrg.f42255c + str3, z);
            return;
        }
        mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 4);
        this.l.remove(str);
    }

    private void b(String str, int i, int i2, boolean z) {
        synchronized (e) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("CalendarSyncUtils", "syncChangedContacts: failure, parameter is null");
                this.l.clear();
                return;
            }
            if (!mri.b()) {
                mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 6);
                LogUtil.j("CalendarSyncUtils", "syncChangedContacts: have no contacts permissions");
                this.l.remove(str);
                return;
            }
            List<SimpleCalendarBean> listC = c(str, i, i2, z);
            if (!z && listC.size() > i) {
                listC = listC.subList(0, i);
            }
            List<SimpleCalendarBean> listD = mrc.d(str, listC, z);
            if (listD.isEmpty()) {
                mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 4);
                this.l.remove(str);
            } else {
                b(listD, str, z ? 1 : 0, 1);
                ReleaseLogUtil.d("R_CalendarSyncUtils", " calendarCompareList size: ", Integer.valueOf(listD.size()));
            }
        }
    }

    private static List<SimpleCalendarBean> c(String str, int i, int i2, boolean z) {
        if (z) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis = calendar.getTimeInMillis();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, 34);
            calendar2.set(11, 23);
            calendar2.set(12, 59);
            calendar2.set(13, 59);
            return mrd.b(BaseApplication.getContext(), str, timeInMillis, calendar2.getTimeInMillis());
        }
        return mrd.b(BaseApplication.getContext(), i, i2);
    }

    public void b(Context context) {
        LogUtil.j("CalendarSyncUtils", "startListen enter.");
        if (context == null) {
            LogUtil.j("CalendarSyncUtils", "startListen: context or deviceId is invalid.");
        } else {
            c(context);
            mqs.e(e(context), c(this.f));
        }
    }

    private ContentObserver c(Handler handler) {
        if (this.g == null) {
            this.g = new mqv(handler) { // from class: mrf.2
            };
        }
        return this.g;
    }

    private ContentResolver e(Context context) {
        if (this.j == null) {
            this.j = context.getContentResolver();
        }
        return this.j;
    }

    public void c(Context context) {
        mqs.b(context);
    }

    private void b(List<SimpleCalendarBean> list, String str, int i, int i2) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("CalendarSyncUtils", "sendDeletedContactsToDevice: failure. deletedUidList is null or empty. ");
            this.l.remove(str);
        } else {
            this.k.offer(list);
            b(i2, i, str);
        }
    }

    private void b(int i, int i2, String str) {
        boolean zA;
        ReleaseLogUtil.d("R_CalendarSyncUtils", "sendZip: queue size: ", Integer.valueOf(this.k.size()));
        d.lock();
        try {
            c();
            while (!this.k.isEmpty()) {
                List<SimpleCalendarBean> listPoll = this.k.poll();
                if (listPoll != null && !listPoll.isEmpty()) {
                    this.h.clear();
                    this.h.addAll(listPoll);
                    String str2 = "calendar_data_" + System.currentTimeMillis() + ".json";
                    if (i2 == 1) {
                        Gson gson = new Gson();
                        long jE = mra.e(true);
                        long size = listPoll.size();
                        CalendarAllSyncInfo calendarAllSyncInfo = new CalendarAllSyncInfo();
                        calendarAllSyncInfo.setMajor(CommonUtil.k(BaseApplication.getContext()));
                        calendarAllSyncInfo.setMinor(jE + size);
                        calendarAllSyncInfo.setCalendarBeanList(listPoll);
                        zA = mrh.e(gson.toJson(calendarAllSyncInfo), mrg.f42255c, str2, i);
                    } else {
                        zA = mrh.a(mrd.c(listPoll, 0), mrg.f42255c, str2, i);
                    }
                    if (!zA) {
                        LogUtil.j("CalendarSyncUtils", "sendZip: vcard text write to file failed. ");
                        this.l.remove(str);
                        break;
                    }
                    mqy.d().d(mrg.f42255c + str2, i2 == 1);
                    l();
                }
            }
        } finally {
            d.unlock();
        }
    }

    public void c() {
        LogUtil.a("CalendarSyncUtils", "deleteUpdatedCache.");
        mtt.c(mrg.f42255c);
    }

    public void f() {
        d.lock();
        try {
            f42251b.signalAll();
        } finally {
            d.unlock();
        }
    }

    private void l() {
        try {
            LogUtil.a("CalendarSyncUtils", "lock: is timeout: ", Boolean.valueOf(f42251b.await(300000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e2) {
            LogUtil.e("CalendarSyncUtils", "lock: InterruptedException occurred on locking thread.", Thread.currentThread().getName(), e2.getMessage());
        }
    }

    private void g() {
        this.k.clear();
        this.h.clear();
    }

    private void i() {
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        this.f.removeCallbacksAndMessages(null);
    }

    public void e() {
        d().a().clear();
        c();
        g();
        i();
    }

    public void b() {
        g();
        i();
        ExtendHandler extendHandler = this.m;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.m = null;
        }
        this.o.quit();
        o();
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 16) {
                return true;
            }
            LogUtil.j("CalendarSyncUtils", "handleMessage: fail in default case. what: ", Integer.valueOf(message.what));
            return false;
        }
    }

    public boolean a(DeviceInfo deviceInfo, DeviceCalendarSyncInfo deviceCalendarSyncInfo, Context context) {
        if (deviceCalendarSyncInfo == null) {
            LogUtil.j("CalendarSyncUtils", "calendarInfo from device is empty");
            return false;
        }
        int count = deviceCalendarSyncInfo.getCount();
        List<SmartSimpleCalendarBean> scheduleList = deviceCalendarSyncInfo.getScheduleList();
        if (count == 0 || count != scheduleList.size()) {
            LogUtil.j("CalendarSyncUtils", "Event count from device is" + count + "actual scheduleList size is" + scheduleList.size());
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList(count);
        c(context);
        for (int i = 0; i < count; i++) {
            SmartSimpleCalendarBean smartSimpleCalendarBean = scheduleList.get(i);
            LogUtil.a("CalendarSyncUtils", "recieve event from smart device:", smartSimpleCalendarBean.toString());
            if (smartSimpleCalendarBean.getOperation() == 1) {
                if (smartSimpleCalendarBean.getDtstart() == 0 || mtz.b(smartSimpleCalendarBean.getEventTimezone())) {
                    return false;
                }
                String eventUuid = smartSimpleCalendarBean.getEventUuid();
                ContentValues contentValues = new ContentValues();
                long jA = mrd.a(context, smartSimpleCalendarBean);
                smartSimpleCalendarBean.setCalendar_id(String.valueOf(jA));
                contentValues.put("calendar_id", Long.valueOf(jA));
                contentValues.put("title", smartSimpleCalendarBean.getTitle());
                contentValues.put("allDay", Integer.valueOf(smartSimpleCalendarBean.getAllDay()));
                contentValues.put("dtstart", Long.valueOf(smartSimpleCalendarBean.getDtstart()));
                if (!mtz.b(smartSimpleCalendarBean.getRule())) {
                    contentValues.put("rrule", smartSimpleCalendarBean.getRule());
                    if (!mtz.b(smartSimpleCalendarBean.getDuration())) {
                        contentValues.put("duration", smartSimpleCalendarBean.getDuration());
                    }
                } else {
                    contentValues.put("dtend", Long.valueOf(smartSimpleCalendarBean.getDtend()));
                }
                contentValues.put("eventTimezone", smartSimpleCalendarBean.getEventTimezone());
                try {
                    String lastPathSegment = contentResolver.insert(CalendarContract.Events.CONTENT_URI, contentValues).getLastPathSegment();
                    String strA = a(context, lastPathSegment);
                    smartSimpleCalendarBean.setCalendar_id(strA);
                    int i2 = (smartSimpleCalendarBean.getAllDay() == 1 && CommonUtil.bd()) ? HwExerciseConstants.NINE_MINUTES_PACE : 0;
                    if (!mtz.b(smartSimpleCalendarBean.getMinutes())) {
                        LogUtil.a("CalendarSyncUtils", "insert device event reminder result is " + mrd.b(context, smartSimpleCalendarBean.getMinutes() + i2, smartSimpleCalendarBean.getMethod(), lastPathSegment));
                    }
                    LogUtil.a("CalendarSyncUtils", "insert event title is ", smartSimpleCalendarBean.getTitle(), " result eventId is ", lastPathSegment, " event calendar_id: ", strA);
                    b(arrayList, smartSimpleCalendarBean, lastPathSegment);
                    String strValueOf = String.valueOf(Long.parseLong(lastPathSegment));
                    mqy.d().c(strValueOf, strValueOf, eventUuid);
                } catch (Exception e2) {
                    LogUtil.e("CalendarSyncUtils", "insert event to phone occurs error:", e2);
                }
            }
        }
        String strD = mri.d(deviceInfo.getDeviceIdentify(), true);
        String strK = CommonUtil.k(BaseApplication.getContext());
        mra.a(strK, strD, arrayList, count, true);
        a(strD, strK, 0, 0, true);
        b(context);
        return true;
    }

    public String a(Context context, String str) {
        String[] strArr = {str};
        String string = "1";
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{"calendar_id"}, "_id = ?", strArr, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(cursorQuery.getColumnIndex("calendar_id"));
            }
            return string;
        } catch (Exception e2) {
            LogUtil.a("CalendarSyncUtils", "getSevenDayCalendarData: Exception.", ExceptionUtils.c(e2));
            return "1";
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public Map<String, Boolean> a() {
        return this.l;
    }

    private static void b(List<CalendarDbBean> list, SmartSimpleCalendarBean smartSimpleCalendarBean, String str) {
        LogUtil.a("CalendarSyncUtils", "enter getSmartBeanFromDevice.");
        if (smartSimpleCalendarBean == null || mtz.b(str)) {
            LogUtil.e("CalendarSyncUtils", "deviceCalendarBean is null or eventId is null");
            return;
        }
        smartSimpleCalendarBean.setEventId(str);
        smartSimpleCalendarBean.setEventUuid(str);
        list.add(new CalendarDbBean(smartSimpleCalendarBean.getEventId(), smartSimpleCalendarBean.getOperation(), smartSimpleCalendarBean.getEventId(), smartSimpleCalendarBean.getDtstart(), smartSimpleCalendarBean.getDtend(), smartSimpleCalendarBean.getAllDay(), mrd.d(smartSimpleCalendarBean)));
    }
}
