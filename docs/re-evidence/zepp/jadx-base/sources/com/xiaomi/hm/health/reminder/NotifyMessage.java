package com.xiaomi.hm.health.reminder;

import android.text.TextUtils;
import com.huami.message.api.WebConst;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.databases.model.ReminderDao;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class NotifyMessage {
    private static final String g = "NotifyMessage";
    private String a;
    private String b;
    private int c;
    private c d;
    private com.xiaomi.hm.health.reminder.a e;
    private ArrayList<ReminderExt> f = new ArrayList<>();

    public class a extends HMCallback {
        public final /* synthetic */ NotifyMessagePushCallback a;

        public a(final NotifyMessagePushCallback val$pushBack) {
            this.a = val$pushBack;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            NotifyMessagePushCallback notifyMessagePushCallback = this.a;
            if (notifyMessagePushCallback != null) {
                notifyMessagePushCallback.onResult(result ? -1 : 4);
            }
            if (result) {
                NotifyMessage.this.b();
            }
            HMLog.i(NotifyMessage.g, "NotifyMessage set reminders result:" + result, new Object[0]);
        }
    }

    public class b extends HMCallback {
        public final /* synthetic */ NotifyMessagePushCallback a;

        public b(final NotifyMessagePushCallback val$pushBack) {
            this.a = val$pushBack;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            NotifyMessagePushCallback notifyMessagePushCallback = this.a;
            if (notifyMessagePushCallback != null) {
                notifyMessagePushCallback.onResult(result ? -1 : 4);
            }
            HMLog.d(NotifyMessage.g, "NotifyMessage text alert result:" + result, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ArrayList<ReminderExt> arrayList = this.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ReminderDao reminderDao = HMDaoManager.getInstance().getReminderDao();
        for (ReminderExt reminderExt : this.f) {
            reminderDao.queryBuilder().where(ReminderDao.Properties.EventId.eq(Integer.valueOf(reminderExt.getId())), ReminderDao.Properties.Fr.eq(Integer.valueOf(reminderExt.getFrom()))).buildDelete().executeDeleteWithoutDetachingEntities();
        }
    }

    private void c() {
        ArrayList<ReminderExt> arrayList = this.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ReminderExt reminderExt : this.f) {
            Reminder reminder = new Reminder();
            reminder.setEventId(Integer.valueOf(reminderExt.getId()));
            reminder.setFr(Integer.valueOf(reminderExt.getFrom()));
            reminder.setLoop(reminderExt.getLoop());
            reminder.setOp(Integer.valueOf(reminderExt.getOp()));
            reminder.setStartDate(reminderExt.getStartDate());
            reminder.setStopDate(reminderExt.getStopDate());
            reminder.setTitle(reminderExt.getTitle());
            reminder.setBody(reminderExt.getBody());
            arrayList2.add(reminder);
        }
        HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(arrayList2);
    }

    public static NotifyMessage load() {
        try {
            ReminderDao reminderDao = HMDaoManager.getInstance().getReminderDao();
            List<Reminder> list = reminderDao.queryBuilder().where(ReminderDao.Properties.Fr.eq(2), new WhereCondition[0]).list();
            if (list != null && !list.isEmpty()) {
                ArrayList<ReminderExt> arrayList = new ArrayList<>();
                for (Reminder reminder : list) {
                    ReminderExt reminderExt = new ReminderExt();
                    reminderExt.setId(reminder.getEventId().intValue());
                    reminderExt.setFrom(reminder.getFr().intValue());
                    reminderExt.setOp(reminder.getOp().intValue());
                    reminderExt.setStartDate(reminder.getStartDate());
                    reminderExt.setStopDate(reminder.getStopDate());
                    reminderExt.setLoop(reminder.getLoop());
                    reminderExt.setTitle(reminder.getTitle());
                    reminderExt.setBody(reminder.getBody());
                    if (ReminderUtils.isExpired(reminderExt)) {
                        reminderDao.delete(reminder);
                    } else {
                        arrayList.add(reminderExt);
                        HMLog.d(g, "load ReminderExt:" + reminderExt, new Object[0]);
                    }
                }
                NotifyMessage notifyMessage = new NotifyMessage();
                notifyMessage.e = null;
                notifyMessage.f = arrayList;
                return notifyMessage;
            }
            return null;
        } catch (Exception e) {
            HMLog.d(g, "load exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static NotifyMessage parse(String data, boolean save) {
        HMLog.i(g, "parse:" + data, new Object[0]);
        if (TextUtils.isEmpty(data)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(data);
            NotifyMessage notifyMessage = new NotifyMessage();
            notifyMessage.a = jSONObject.optString(WebConst.QueryParam.MESSAGE_ID);
            notifyMessage.c = jSONObject.optInt("readReceiptRequired");
            notifyMessage.b = jSONObject.optString("messageContent");
            JSONObject jSONObject2 = jSONObject.getJSONObject("deviceNotificationEffect");
            if (jSONObject2 == null) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(ContactSettingItemActivity.KEY_VIBRATION);
            if (jSONObjectOptJSONObject != null) {
                notifyMessage.d = new c(jSONObjectOptJSONObject.getString("mode"));
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("text");
            if (jSONObjectOptJSONObject2 != null) {
                notifyMessage.e = new com.xiaomi.hm.health.reminder.a(jSONObjectOptJSONObject2.optString("title"), jSONObjectOptJSONObject2.optString("body"));
            }
            ArrayList<ReminderExt> arrayList = new ArrayList<>();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("reminders");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    ReminderExt reminderExt = new ReminderExt();
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                    reminderExt.setId(jSONObject3.getInt("id"));
                    reminderExt.setFrom(jSONObject3.getInt("from"));
                    reminderExt.setOp(jSONObject3.getInt(AdRemindParserKt.KEY_OP));
                    reminderExt.setLoop(jSONObject3.getString("loop"));
                    reminderExt.setStartDate(jSONObject3.getString("startDate"));
                    reminderExt.setStopDate(jSONObject3.optString(AdRemindParserKt.KEY_STOP_DATE));
                    HMLog.i(g, "deviceSource: " + HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI), new Object[0]);
                    com.xiaomi.hm.health.reminder.a aVar = notifyMessage.e;
                    if (aVar != null) {
                        String strB = !TextUtils.isEmpty(aVar.b()) ? notifyMessage.e.b() : notifyMessage.e.a();
                        reminderExt.setTitle("");
                        reminderExt.setBody(strB);
                    }
                    if (!ReminderUtils.isExpired(reminderExt)) {
                        arrayList.add(reminderExt);
                    }
                }
                if (arrayList.isEmpty()) {
                    HMLog.i(g, "return as invalid reminders:" + jSONArrayOptJSONArray, new Object[0]);
                    return null;
                }
            }
            notifyMessage.f = arrayList;
            if (save) {
                notifyMessage.c();
            }
            return notifyMessage;
        } catch (Exception e) {
            HMLog.d(g, "parse exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static void test() {
        NotifyMessage notifyMessage = parse("{\n        \"deviceNotificationEffect\":{\n            \"text\":{\n                \"body\":\"手环arc~\",\n                \"title\":\"h\"\n            },\n            \"vibration\":{\n                \"mode\":\"LIGHT\"\n            },\n            \"reminders\":[\n                {\n                    \"id\":1,\n                    \"op\":1,\n                    \"from\":2,\n                    \"loop\":\"10\",\n                    \"startDate\":\"2017-11-02 10:50\"\n                },\n                {\n                    \"id\":2,\n                    \"op\":1,\n                    \"from\":2,\n                    \"loop\":\"0\",\n                    \"startDate\":\"2017-11-09 20:30\",\n                    \"stopDate\":\"2017-12-09 00:00\"\n                }\n            ]\n        },\n        \"from\":\"string\",\n        \"messageId\":\"string\",\n        \"readReceiptRequired\":0\n    }", false);
        if (notifyMessage != null) {
            notifyMessage.work(null, true);
        }
    }

    public String toString() {
        return "NotifyMessage{messageId='" + this.a + "', messageContent='" + this.b + "', readReceiptRequired=" + this.c + ", vibration=" + this.d + ", text=" + this.e + '}';
    }

    public void work(NotifyMessagePushCallback pushBack, boolean forAll) {
        DeviceInfo deviceInfo;
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (!hMDeviceManager.hasBound(hMDeviceType)) {
            HMLog.i(g, "return as no miband!!!", new Object[0]);
            if (pushBack != null) {
                pushBack.onResult(0);
                return;
            }
            return;
        }
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(hMDeviceType);
        boolean z = true;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected() || (deviceInfo = hMMiLiDevice.getDeviceInfo()) == null) {
            HMLog.i(g, "return as device is disconnected!!!", new Object[0]);
            if (pushBack != null) {
                pushBack.onResult(1);
                return;
            }
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        HMLog.i(g, "source:" + deviceSource, new Object[0]);
        boolean z2 = HMDeviceConfig.isWuhanSeries() || HMDeviceConfig.isCincoSeries();
        if (forAll) {
            if (deviceSource != HMDeviceSource.MILI_PEYTO && deviceSource != HMDeviceSource.MILI_TEMPO) {
                z = false;
            }
            z2 |= z;
        }
        if (!z2) {
            if (pushBack != null) {
                pushBack.onResult(2);
                return;
            }
            return;
        }
        ArrayList<HMReminderInfo> arrayListCreateReminders = ReminderUtils.createReminders(this.f);
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMMiLiDevice;
        if (arrayListCreateReminders != null && arrayListCreateReminders.size() > 0) {
            hMMiLiProDevice.setReminder(arrayListCreateReminders, new a(pushBack));
            return;
        }
        if (this.e != null) {
            if (HMDeviceConfig.hasFeaturePro(deviceSource)) {
                String string = BraceletApp.getContext().getResources().getString(R.string.app_name);
                HMAlertModeExt hMAlertModeExt = new HMAlertModeExt(HMAlertApp.MSPORT, this.e.b(), this.e.a());
                hMAlertModeExt.setAppName(string);
                hMMiLiProDevice.alert(hMAlertModeExt, new b(pushBack));
                return;
            }
            HMLog.i(g, "return as not support text!!!", new Object[0]);
            if (pushBack != null) {
                pushBack.onResult(2);
            }
        }
    }
}
