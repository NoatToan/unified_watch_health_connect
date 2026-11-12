package com.xiaomi.hm.health.ui.smartplay.eventremind;

import android.content.Context;
import android.text.TextUtils;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.databases.model.ReminderDao;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.reminder.ReminderExt;
import com.xiaomi.hm.health.reminder.ReminderUtils;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import de.greenrobot.event.EventBus;
import defpackage.kt1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;
import org.koin.java.KoinJavaComponent;
import rx.Emitter;
import rx.Observable;
import rx.Observer;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class EventRemindManager {
    public static final int INVALID_INDEX = -1;
    public static final String PERIOD_DAILY = "0";
    public static final String PERIOD_MONTHLY = "8";
    public static final String PERIOD_ONCE = "10";
    public static final String PERIOD_YEARLY = "9";
    public static final int REMINDER_STATUS_DELETE = -2;
    public static final int REMINDER_STATUS_NORMAL = -1;
    public static final int REMINDER_STATUS_UPLOAD = 0;
    private static final String c = "EventRemindManager";
    public static final int d = 20;
    private static final String e = "yyyy-MM-dd HH:mm";
    private static final int g = 50;
    private static final int h = 0;
    private static final int i = 49;
    private RemindCategorizeDataFactory a;
    private boolean[] b;
    private static SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    private static final Lazy<DeviceManagerApi> j = KoinJavaComponent.inject(DeviceManagerApi.class);

    public interface CallBack {
        void onFinish(boolean z);
    }

    public class a extends HMCallback {
        public final /* synthetic */ CallBack a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, CallBack callBack) {
            super(z);
            this.a = callBack;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.a.onFinish(z);
        }
    }

    public class b implements Observer<Boolean> {
        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class c extends HMCallback {
        public final /* synthetic */ CallBack a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, CallBack callBack) {
            super(z);
            this.a = callBack;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            CallBack callBack = this.a;
            if (callBack != null) {
                callBack.onFinish(z);
            }
        }
    }

    public class d implements Observer<Boolean> {
        public final /* synthetic */ List a;

        public d(List list) {
            this.a = list;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            if (bool.booleanValue()) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ((Reminder) it2.next()).setStatus(-1);
                }
                HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(this.a);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class e implements Observer<Boolean> {
        public final /* synthetic */ Reminder a;

        public e(Reminder reminder) {
            this.a = reminder;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            if (bool.booleanValue()) {
                HMDaoManager.getInstance().getReminderDao().delete(this.a);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class f extends HMCallback<ArrayList<HMReminderInfo>> {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(ArrayList<HMReminderInfo> arrayList) {
            super.onFinish(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append("remindersEventRemind: ");
            sb.append(arrayList != null ? Arrays.toString(arrayList.toArray()) : "null");
            HMLog.i(EventRemindManager.c, sb.toString(), new Object[0]);
            EventRemindManager.updateEventFromDevice(arrayList);
        }
    }

    public class g implements Observer<Boolean> {
        public final /* synthetic */ List a;

        public g(List list) {
            this.a = list;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            HMLog.i(EventRemindManager.c, "uploadDeviceEvent2Server save for server: " + bool, new Object[0]);
            if (bool.booleanValue()) {
                return;
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((Reminder) it2.next()).setStatus(0);
            }
            HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(this.a);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public static class h {
        private static final EventRemindManager a = new EventRemindManager();

        private h() {
        }
    }

    private EventRemindManager() {
        this.a = new RemindCategorizeDataFactory();
        this.b = new boolean[50];
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Throwable th) {
        HMLog.error("", "", th, new Function0() { // from class: gt1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventRemindManager.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Observable<Boolean> B(final List<ReminderEntity> list) {
        return Observable.create(new Action1() { // from class: ht1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                EventRemindManager.x(list, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    public static Observable<Boolean> C(int i2, boolean z) {
        HMLog.i(c, "sync read reminder, limit: " + i2 + ", init: " + z, new Object[0]);
        if (z) {
            EventRemindAPI.getInstance().setNext(null);
        } else if (!EventRemindAPI.getInstance().hasMore()) {
            HMLog.i(c, "no more reminder on server.", new Object[0]);
            return Observable.just(Boolean.FALSE);
        }
        return EventRemindAPI.getInstance().k(i2).flatMap(kt1.a);
    }

    private static ReminderExt D(Reminder reminder) {
        if (reminder == null) {
            return null;
        }
        ReminderExt reminderExt = new ReminderExt();
        reminderExt.setId(reminder.getEventId().intValue());
        reminderExt.setFrom(reminder.getFr().intValue());
        reminderExt.setOp(reminder.getOp().intValue());
        reminderExt.setStartDate(reminder.getStartDate());
        reminderExt.setStopDate(reminder.getStopDate());
        reminderExt.setLoop(reminder.getLoop());
        reminderExt.setTitle(reminder.getTitle());
        reminderExt.setBody(reminder.getBody());
        return reminderExt;
    }

    private static ArrayList<HMReminderInfo> E(List<Reminder> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Reminder> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(D(it2.next()));
        }
        return ReminderUtils.createReminders(arrayList);
    }

    private void F() {
        for (int i2 = 0; i2 < 50; i2++) {
            this.b[i2] = true;
        }
        List<Reminder> enableReminders = getEnableReminders();
        if (enableReminders == null || enableReminders.size() == 0) {
            return;
        }
        Iterator<Reminder> it2 = enableReminders.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().getEventId().intValue();
            if (iIntValue < 0 || iIntValue > 49) {
                HMLog.i(c, "eventId is illegal! The id is " + iIntValue, new Object[0]);
            } else {
                this.b[iIntValue] = false;
            }
        }
    }

    private static void G(List<Reminder> list, List<Reminder> list2) {
        if (list != null && list.size() > 0) {
            EventRemindAPI.uploadReminder(list).compose(RxUtil.ioToMain()).subscribe(new g(list));
        }
        if (list2 == null || list2.size() == 0) {
            return;
        }
        Iterator<Reminder> it2 = list2.iterator();
        while (it2.hasNext()) {
            EventRemindAPI.deleteReminder(it2.next().getTime().longValue()).compose(RxUtil.ioToMain()).subscribe(new Action1() { // from class: it1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    EventRemindManager.y((Boolean) obj);
                }
            }, new Action1() { // from class: jt1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    EventRemindManager.A((Throwable) obj);
                }
            });
        }
    }

    public static void H() {
        List<Reminder> list = HMDaoManager.getInstance().getReminderDao().queryBuilder().where(ReminderDao.Properties.Status.eq(0), new WhereCondition[0]).list();
        if (list == null || list.size() == 0) {
            HMLog.i(c, "no upload failed reminder.", new Object[0]);
            return;
        }
        HMLog.i(c, "failed reminder size: " + list.size(), new Object[0]);
        EventRemindAPI.uploadReminder(list).compose(RxUtil.ioToMain()).subscribe(new d(list));
    }

    public static void deleteReminderToDevice(Reminder reminder, CallBack callBack) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(reminder);
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) j.getValue().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice != null && hMMiLiDevice.isConnected() && hMMiLiDevice.getDeviceInfo() != null) {
            ((HMMiLiProDevice) hMMiLiDevice).setReminder(E(arrayList), new c(true, callBack));
            return;
        }
        HMLog.i(c, "return as device is disconnected.", new Object[0]);
        if (callBack != null) {
            callBack.onFinish(false);
        }
    }

    public static int f(int i2) {
        int i3 = (i2 + 6) % 7;
        if (i3 == 0) {
            return 7;
        }
        return i3;
    }

    public static List<ReminderEntity> g(List<Reminder> list) {
        ArrayList arrayList = new ArrayList();
        for (Reminder reminder : list) {
            ReminderEntity reminderEntity = new ReminderEntity();
            reminderEntity.createdDate = reminder.getTime().longValue();
            reminderEntity.from = reminder.getFr().intValue();
            reminderEntity.id = reminder.getEventId().intValue();
            reminderEntity.loop = reminder.getLoop();
            reminderEntity.op = reminder.getOp().intValue();
            reminderEntity.startDate = reminder.getStartDate();
            reminderEntity.stopDate = reminder.getStopDate();
            reminderEntity.title = reminder.getBody();
            arrayList.add(reminderEntity);
        }
        return arrayList;
    }

    public static SimpleDateFormat getDateFormat() {
        return f;
    }

    public static List<HMReminderInfo> getEnableReminderInfos() {
        return E(getEnableReminders());
    }

    public static List<Reminder> getEnableReminders() {
        List<Reminder> list = HMDaoManager.getInstance().getReminderDao().queryBuilder().where(ReminderDao.Properties.Fr.eq(0), new WhereCondition[0]).where(ReminderDao.Properties.Status.notEq(-2), new WhereCondition[0]).list();
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Reminder reminder : list) {
            if (TextUtils.equals(reminder.getLoop(), "10")) {
                try {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    if (calendar.getTime().before(f.parse(reminder.getStartDate()))) {
                        arrayList.add(reminder);
                    }
                } catch (Exception e2) {
                    HMLog.i(c, "getEnableReminder exception: " + e2.getMessage(), new Object[0]);
                }
            } else {
                arrayList.add(reminder);
            }
        }
        return arrayList;
    }

    public static EventRemindManager getInstance() {
        return h.a;
    }

    public static List<ComparableReminder> getReminders() {
        return ComparableReminder.a(HMDaoManager.getInstance().getReminderDao().queryBuilder().where(ReminderDao.Properties.Fr.eq(0), new WhereCondition[0]).where(ReminderDao.Properties.Status.notEq(-2), new WhereCondition[0]).list());
    }

    public static String getRepeatDescription(Context context, Reminder reminder) {
        StringBuilder sb;
        String loop = reminder.getLoop();
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(f.parse(reminder.getStartDate()));
            byte b2 = -1;
            int iHashCode = loop.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 1567) {
                    if (iHashCode != 56) {
                        if (iHashCode == 57 && loop.equals("9")) {
                            b2 = 3;
                        }
                    } else if (loop.equals("8")) {
                        b2 = 2;
                    }
                } else if (loop.equals("10")) {
                    b2 = 0;
                }
            } else if (loop.equals("0")) {
                b2 = 1;
            }
            if (b2 == 0) {
                sb = new StringBuilder(context.getString(R.string.event_remind_once));
            } else if (b2 == 1) {
                sb = new StringBuilder(context.getString(R.string.event_remind_everyday));
            } else if (b2 != 2) {
                sb = b2 != 3 ? new StringBuilder(v(context, loop)) : new StringBuilder(context.getString(R.string.event_remind_every_year));
            } else {
                sb = new StringBuilder(context.getString(R.string.event_remind_every_month));
                sb.append(context.getString(R.string.event_remind_day_of_month, Integer.valueOf(calendar.get(5))));
            }
            return sb.toString();
        } catch (Exception e2) {
            HMLog.i(c, "getRepeatDescription exception: " + e2.getMessage(), new Object[0]);
            e2.printStackTrace();
            return "";
        }
    }

    public static String getTimeDescription(Reminder reminder) {
        StringBuilder sb;
        String loop = reminder.getLoop();
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = f.parse(reminder.getStartDate());
            calendar.setTime(date);
            byte b2 = -1;
            int iHashCode = loop.hashCode();
            if (iHashCode != 57) {
                if (iHashCode == 1567 && loop.equals("10")) {
                    b2 = 0;
                }
            } else if (loop.equals("9")) {
                b2 = 1;
            }
            if (b2 != 0) {
                sb = b2 != 1 ? new StringBuilder(TimeUtils.formatTime(DeviceXFunctionsKt.getContext(), calendar.getTime())) : new StringBuilder(TimeUtils.formatDateTime_y(DeviceXFunctionsKt.getContext(), date));
            } else {
                sb = new StringBuilder(TimeUtils.formatDateTime_y(DeviceXFunctionsKt.getContext(), calendar.getTime()));
            }
            return sb.toString();
        } catch (Exception e2) {
            HMLog.i(c, "getTimeDescription exception: " + e2.getMessage(), new Object[0]);
            e2.printStackTrace();
            return "";
        }
    }

    private static String h(short s) {
        HMLog.i(c, "flag: " + GattUtils.bytesToHexString(GattUtils.shortToBytes(s)), new Object[0]);
        if ((s & 4096) != 0) {
            return "8";
        }
        if ((s & HMReminderInfo.FLAG_YEAR) != 0) {
            return "9";
        }
        int i2 = s & HMReminderInfo.FLAG_DAY;
        if (i2 == 0) {
            return "10";
        }
        if (i2 == 4064) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if ((s & 32) != 0) {
            sb.append("1,");
        }
        if ((s & 64) != 0) {
            sb.append("2,");
        }
        if ((s & 128) != 0) {
            sb.append("3,");
        }
        if ((s & 256) != 0) {
            sb.append("4,");
        }
        if ((s & 512) != 0) {
            sb.append("5,");
        }
        if ((s & 1024) != 0) {
            sb.append("6,");
        }
        if ((s & 2048) != 0) {
            sb.append("7,");
        }
        return sb.length() > 1 ? sb.substring(0, sb.length() - 1) : sb.toString();
    }

    public static boolean[] i(String[] strArr) {
        boolean[] zArr = new boolean[7];
        try {
            for (String str : strArr) {
                zArr[Integer.parseInt(str) - 1] = true;
            }
        } catch (Exception e2) {
            HMLog.i(c, "createLoops exception: " + e2.getMessage(), new Object[0]);
        }
        return zArr;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) || Pattern.compile("\\s*").matcher(charSequence).matches();
    }

    private static Reminder j(HMReminderInfo hMReminderInfo) {
        Reminder reminder = new Reminder();
        reminder.setTime(Long.valueOf(System.currentTimeMillis()));
        reminder.setOp(1);
        reminder.setStartDate(getDateFormat().format(hMReminderInfo.getStartTime().getTime()));
        reminder.setStopDate(null);
        reminder.setFr(0);
        reminder.setTitle(hMReminderInfo.getRemindTitle());
        String strH = h((short) hMReminderInfo.getFlag());
        HMLog.i(c, "loop: " + strH, new Object[0]);
        reminder.setLoop(strH);
        reminder.setEventId(Integer.valueOf(hMReminderInfo.getId()));
        reminder.setBody(hMReminderInfo.getRemindBody());
        reminder.setStatus(-1);
        reminder.setIconId(-1);
        return reminder;
    }

    private static List<Reminder> k(List<ReminderEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (ReminderEntity reminderEntity : list) {
            Reminder reminder = new Reminder();
            reminder.setTime(Long.valueOf(reminderEntity.createdDate));
            reminder.setEventId(Integer.valueOf(reminderEntity.id));
            reminder.setFr(Integer.valueOf(reminderEntity.from));
            reminder.setOp(1);
            reminder.setIconId(-1);
            reminder.setStatus(-1);
            reminder.setLoop(reminderEntity.loop);
            reminder.setStartDate(reminderEntity.startDate);
            reminder.setStopDate(reminderEntity.stopDate);
            reminder.setTitle(null);
            reminder.setBody(reminderEntity.title);
            arrayList.add(reminder);
        }
        return arrayList;
    }

    public static void l() {
        List<Reminder> list = HMDaoManager.getInstance().getReminderDao().queryBuilder().where(ReminderDao.Properties.Status.eq(-2), new WhereCondition[0]).list();
        if (list == null || list.size() == 0) {
            HMLog.i(c, "no deleted failed reminder.", new Object[0]);
            return;
        }
        HMLog.i(c, "deleted failed reminder size: " + list.size(), new Object[0]);
        for (Reminder reminder : list) {
            EventRemindAPI.deleteReminder(reminder.getTime().longValue()).compose(RxUtil.ioToMain()).subscribe(new e(reminder));
        }
    }

    private static int m() {
        List<Reminder> enableReminders = getEnableReminders();
        if (enableReminders == null) {
            return 0;
        }
        return enableReminders.size();
    }

    public static int n() {
        return s() - m();
    }

    public static String p(int i2, boolean[] zArr, Calendar calendar) {
        if (i2 == 0) {
            return "10";
        }
        if (i2 == 1) {
            return "0";
        }
        if (i2 == 2) {
            return String.valueOf(f(calendar.get(7)));
        }
        if (i2 == 3) {
            return "8";
        }
        if (i2 == 4) {
            return "9";
        }
        if (i2 != 5) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < zArr.length; i3++) {
            if (zArr[i3]) {
                sb.append(i3 + 1);
                sb.append(",");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String r(Context context, Reminder reminder) {
        StringBuilder sb;
        String loop = reminder.getLoop();
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = f.parse(reminder.getStartDate());
            calendar.setTime(date);
            byte b2 = -1;
            int iHashCode = loop.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 1567) {
                    if (iHashCode != 56) {
                        if (iHashCode == 57 && loop.equals("9")) {
                            b2 = 3;
                        }
                    } else if (loop.equals("8")) {
                        b2 = 2;
                    }
                } else if (loop.equals("10")) {
                    b2 = 0;
                }
            } else if (loop.equals("0")) {
                b2 = 1;
            }
            if (b2 == 0) {
                sb = new StringBuilder(context.getString(R.string.event_remind_once) + " ");
                sb.append(TimeUtils.formatDateTime_y(DeviceXFunctionsKt.getContext(), calendar.getTime()));
            } else if (b2 == 1) {
                sb = new StringBuilder(context.getString(R.string.event_remind_everyday) + " ");
                sb.append(TimeUtils.formatTime(DeviceXFunctionsKt.getContext(), calendar.getTime()));
            } else if (b2 == 2) {
                sb = new StringBuilder(context.getString(R.string.event_remind_every_month) + " ");
                sb.append(context.getString(R.string.event_remind_day_of_month, Integer.valueOf(calendar.get(5))));
                sb.append(" ");
                sb.append(TimeUtils.formatTime(DeviceXFunctionsKt.getContext(), calendar.getTime()));
            } else if (b2 != 3) {
                sb = new StringBuilder(t(context, loop));
                sb.append(" ");
                sb.append(TimeUtils.formatTime(DeviceXFunctionsKt.getContext(), calendar.getTime()));
            } else {
                StringBuilder sb2 = new StringBuilder(context.getString(R.string.event_remind_every_year) + " ");
                sb2.append(TimeUtils.formatDateTime_y(DeviceXFunctionsKt.getContext(), date));
                sb = sb2;
            }
            return sb.toString();
        } catch (Exception e2) {
            HMLog.i(c, "getPeriodDescription exception: " + e2.getMessage(), new Object[0]);
            e2.printStackTrace();
            return null;
        }
    }

    public static void readRemindersFromDevice() {
        HMBaseDevice device;
        if (ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_CHANGE_REMINDER_ON_DEVICE) && (device = j.getValue().getDevice(HMDeviceType.MILI)) != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            ((HMMiLiProDevice) device).getReminders(new f());
        }
    }

    public static void recreateDateFormat() {
        f = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    }

    public static int s() {
        List<Reminder> list = HMDaoManager.getInstance().getReminderDao().queryBuilder().where(ReminderDao.Properties.Fr.eq(0), new WhereCondition[0]).where(ReminderDao.Properties.Status.notEq(-2), new WhereCondition[0]).list();
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static void saveEvent2Device(List<Reminder> list, CallBack callBack) {
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) j.getValue().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice != null && hMMiLiDevice.isConnected() && hMMiLiDevice.getDeviceInfo() != null) {
            ((HMMiLiProDevice) hMMiLiDevice).setReminder(E(list), new a(true, callBack));
        } else {
            HMLog.i(c, "return as device is disconnected.", new Object[0]);
            callBack.onFinish(false);
        }
    }

    public static void syncReminderFromServer() {
        EventRemindAPI.getInstance().l().subscribeOn(Schedulers.io()).flatMap(kt1.a).compose(RxUtil.ioToMain()).subscribe(new b());
    }

    private static String t(Context context, String str) {
        StringBuilder sb = new StringBuilder(context.getString(R.string.event_remind_every_week));
        sb.append(" ");
        String[] stringArray = context.getResources().getStringArray(R.array.weeks);
        for (String str2 : str.split(",")) {
            sb.append(stringArray[Integer.parseInt(str2) - 1]);
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String u(Context context, boolean[] zArr) {
        StringBuilder sb = new StringBuilder(context.getString(R.string.event_remind_every_week));
        String[] stringArray = context.getResources().getStringArray(R.array.weeks_short);
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                sb.append(stringArray[i2]);
                sb.append(", ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public static void updateEventFromDevice(List<HMReminderInfo> list) {
        boolean z;
        if (list == null) {
            return;
        }
        List<Reminder> enableReminders = getEnableReminders();
        if (enableReminders == null) {
            ArrayList arrayList = new ArrayList();
            if (list.size() > 0) {
                Iterator<HMReminderInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(j(it2.next()));
                }
                HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(arrayList);
                G(arrayList, null);
                EventBus.getDefault().post(new ReminderChangedEvent(0));
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Reminder> it3 = enableReminders.iterator();
        while (true) {
            boolean z2 = true;
            if (!it3.hasNext()) {
                break;
            }
            Reminder next = it3.next();
            for (HMReminderInfo hMReminderInfo : list) {
                if (next.getEventId().intValue() == hMReminderInfo.getId()) {
                    next.setStartDate(f.format(hMReminderInfo.getStartTime().getTime()));
                    next.setLoop(h((short) hMReminderInfo.getFlag()));
                    z2 = false;
                }
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        for (HMReminderInfo hMReminderInfo2 : list) {
            Iterator<Reminder> it4 = enableReminders.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (it4.next().getEventId().intValue() == hMReminderInfo2.getId()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                enableReminders.add(j(hMReminderInfo2));
            }
        }
        HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(enableReminders);
        HMDaoManager.getInstance().getReminderDao().deleteInTx(arrayList2);
        G(enableReminders, arrayList2);
        EventBus.getDefault().post(new ReminderChangedEvent(0));
    }

    private static String v(Context context, String str) {
        StringBuilder sb = new StringBuilder(context.getString(R.string.event_remind_every_week));
        String[] stringArray = context.getResources().getStringArray(R.array.weeks_short);
        for (String str2 : str.split(",")) {
            sb.append(stringArray[Integer.parseInt(str2) - 1]);
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static boolean w(Reminder reminder) {
        if (!reminder.getLoop().equals("10")) {
            return false;
        }
        try {
            return Calendar.getInstance().getTime().after(f.parse(reminder.getStartDate()));
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(List list, Emitter emitter) {
        if (list == null || list.size() == 0) {
            emitter.onNext(Boolean.FALSE);
            emitter.onCompleted();
        } else {
            HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(k(list));
            emitter.onNext(Boolean.TRUE);
            emitter.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "";
    }

    public synchronized void categorizeReminders(List<ComparableReminder> list) {
        RemindCategorizeDataFactory remindCategorizeDataFactory = this.a;
        if (remindCategorizeDataFactory != null) {
            remindCategorizeDataFactory.categorizeReminders(list);
        }
    }

    public int getEnableIndex() {
        F();
        for (int i2 = 0; i2 <= 49; i2++) {
            if (this.b[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public List<ComparableReminder> getEndedReminders() {
        RemindCategorizeDataFactory remindCategorizeDataFactory = this.a;
        return remindCategorizeDataFactory == null ? new ArrayList() : remindCategorizeDataFactory.getMEndedReminders();
    }

    public List<ComparableReminder> getLaterReminders() {
        RemindCategorizeDataFactory remindCategorizeDataFactory = this.a;
        return remindCategorizeDataFactory == null ? new ArrayList() : remindCategorizeDataFactory.getMLaterReminders();
    }

    public List<ComparableReminder> getTodayReminders() {
        RemindCategorizeDataFactory remindCategorizeDataFactory = this.a;
        return remindCategorizeDataFactory == null ? new ArrayList() : remindCategorizeDataFactory.getMTodayReminders();
    }

    public List<ComparableReminder> getTomorrowReminders() {
        RemindCategorizeDataFactory remindCategorizeDataFactory = this.a;
        return remindCategorizeDataFactory == null ? new ArrayList() : remindCategorizeDataFactory.getMTomorrowReminders();
    }

    public List<ComparableReminder> o(int i2) {
        List<ComparableReminder> endedReminders = getEndedReminders();
        HMLog.d(c, "count: " + i2 + " ended size: " + endedReminders.size(), new Object[0]);
        if (i2 >= endedReminders.size()) {
            return endedReminders;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(endedReminders.get(i3));
        }
        return arrayList;
    }

    public int q(int i2) {
        F();
        for (int i3 = 0; i3 <= 49; i3++) {
            if (this.b[i3] && i3 != i2) {
                return i3;
            }
        }
        return -1;
    }
}
