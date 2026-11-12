package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.speech.ErrorContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.ReminderContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.speech.utils.HMDispatchHandler;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindAPI;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.eventremind.ReminderModifiedEvent;
import com.xiaomi.hm.health.ui.smartplay.eventremind.RxUtil;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import rx.Observer;

/* JADX INFO: loaded from: classes21.dex */
public class ReminderHandler extends BaseDomainHandler {
    private static final String f = "ReminderHandler";
    private HMSpeechInfo c;
    private boolean d;
    private Reminder e;

    public class a implements Observer<Boolean> {
        public final /* synthetic */ List a;

        public a(final List val$reminders) {
            this.a = val$reminders;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean result) {
            if (result.booleanValue()) {
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
        public void onError(Throwable e) {
        }
    }

    public ReminderHandler(Context context) {
        super(context);
        this.d = false;
    }

    private void b() {
        c(this.context.getString(R.string.speech_nlp_silent_handler_answer));
    }

    private void c(String content) {
        ErrorContent errorContent = new ErrorContent(content);
        errorContent.setType((byte) 1);
        this.c = new HMSpeechInfo(getId(), SpeechType.ERROR, errorContent);
    }

    private void d(HMReminderInfo info, Reminder reminder, String circleExtra) {
        String str;
        short s;
        String str2;
        if (TextUtils.isEmpty(circleExtra)) {
            info.setRepeat(false);
            return;
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_MON)) {
            s = (short) 32;
            str = "1";
        } else {
            str = null;
            s = 0;
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_TUE)) {
            s = (short) (s | 64);
            if (TextUtils.isEmpty(str)) {
                str = "2";
            } else {
                str = str + ",2";
            }
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_WED)) {
            s = (short) (s | 128);
            if (TextUtils.isEmpty(str)) {
                str = "3";
            } else {
                str = str + ",3";
            }
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_THU)) {
            s = (short) (s | 256);
            if (TextUtils.isEmpty(str)) {
                str = "4";
            } else {
                str = str + ",4";
            }
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_FRI)) {
            s = (short) (s | 512);
            if (TextUtils.isEmpty(str)) {
                str = "5";
            } else {
                str = str + ",5";
            }
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_SAT)) {
            s = (short) (s | 1024);
            if (TextUtils.isEmpty(str)) {
                str = "6";
            } else {
                str = str + ",6";
            }
        }
        if (circleExtra.contains(JsonParseUtils.WEEK_SUN)) {
            s = (short) (s | 2048);
            if (TextUtils.isEmpty(str)) {
                str2 = "7";
            } else {
                str2 = str + ",7";
            }
            str = str2;
        }
        if (s == 0) {
            info.setRepeat(false);
            return;
        }
        info.addFlag(s);
        info.setRepeat(true);
        reminder.setLoop(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(List list, HMMiLiProDevice hMMiLiProDevice, boolean z) {
        if (z) {
            HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(list);
            EventBus.getDefault().post(new ReminderModifiedEvent(list));
            i(list);
        } else {
            c(this.context.getString(R.string.alarm_save_failed));
        }
        hMMiLiProDevice.sendSpeechInfoSync(this.c);
    }

    private void f(SpeechResult speechResult) {
        ReminderContent reminderContent = new ReminderContent();
        reminderContent.setType((byte) 2);
        reminderContent.setContent(speechResult.getAnswerText());
        this.c = new HMSpeechInfo(getId(), SpeechType.REMINDER, reminderContent);
    }

    private void g() {
        ReminderContent reminderContent = new ReminderContent();
        reminderContent.setType((byte) 3);
        reminderContent.setContent(this.context.getString(R.string.audio_remind_full));
        this.c = new HMSpeechInfo(getId(), SpeechType.REMINDER, reminderContent);
    }

    private void h(SpeechResult speechResult, int index) {
        try {
            JSONObject jSONObject = new JSONObject(speechResult.getIntention());
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("date_time"));
            Calendar calendarDateFormat = Utils.dateFormat(jSONObject2.getString("value"), "yyyy-MM-dd'T'HH:mm:ss");
            if (calendarDateFormat == null) {
                HMLog.i(f, "value is " + jSONObject2.getString("value"), new Object[0]);
                b();
                return;
            }
            String strOptString = jSONObject.optString("circle");
            String strOptString2 = jSONObject.optString(JsonParseUtils.CIRCLE_EXTRA);
            String strOptString3 = jSONObject.optString("event");
            if (TextUtils.isEmpty(strOptString3)) {
                strOptString3 = this.context.getString(R.string.audio_remind_default);
            }
            HMReminderInfo hMReminderInfo = new HMReminderInfo();
            hMReminderInfo.setRemindStr("", strOptString3);
            hMReminderInfo.setId(index);
            hMReminderInfo.setFrom(0);
            Reminder reminder = new Reminder();
            this.e = reminder;
            reminder.setTime(Long.valueOf(calendarDateFormat.getTimeInMillis()));
            this.e.setOp(1);
            this.e.setStartDate(EventRemindManager.getDateFormat().format(calendarDateFormat.getTime()));
            this.e.setStopDate(null);
            this.e.setFr(0);
            this.e.setTitle("");
            this.e.setEventId(Integer.valueOf(index));
            this.e.setBody(strOptString3);
            this.e.setStatus(-1);
            this.e.setIconId(-1);
            switch (strOptString) {
                case "once":
                    hMReminderInfo.setRepeat(false);
                    this.e.setLoop("10");
                    break;
                case "everyday":
                    hMReminderInfo.setRepeat(true);
                    hMReminderInfo.addFlag(HMReminderInfo.FLAG_DAY);
                    this.e.setLoop("0");
                    break;
                case "everyweek":
                    d(hMReminderInfo, this.e, strOptString2);
                    break;
                case "montofri":
                    hMReminderInfo.setRepeat(true);
                    hMReminderInfo.addFlag((short) 992);
                    this.e.setLoop("1,2,3,4,5");
                    break;
                case "weekend":
                    hMReminderInfo.setRepeat(true);
                    hMReminderInfo.addFlag((short) 3072);
                    this.e.setLoop("6,7");
                    break;
                case "monthly":
                    hMReminderInfo.setRepeat(true);
                    hMReminderInfo.addFlag((short) 4096);
                    this.e.setLoop("8");
                    break;
                case "yearly":
                    hMReminderInfo.setRepeat(true);
                    hMReminderInfo.addFlag(HMReminderInfo.FLAG_YEAR);
                    this.e.setLoop("9");
                    break;
                default:
                    hMReminderInfo.setRepeat(false);
                    break;
            }
            hMReminderInfo.setStartTime(calendarDateFormat);
            hMReminderInfo.setStopTime(null);
            ReminderContent reminderContent = new ReminderContent();
            reminderContent.setContent(strOptString3);
            reminderContent.setType((byte) 1);
            reminderContent.setReminderInfo(hMReminderInfo);
            int id = getId();
            this.c = new HMSpeechInfo(id, SpeechType.REMINDER, reminderContent);
            HMDispatchHandler.getInstance().addContent(id, this.e);
            this.d = true;
        } catch (Exception e) {
            HMLog.i(f, e.getMessage(), new Object[0]);
            b();
        }
    }

    private void i(List<Reminder> reminders) {
        EventRemindAPI.uploadReminder(reminders).compose(RxUtil.ioToMain()).subscribe(new a(reminders));
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(final HMMiLiProDevice hmMiLiProDevice) {
        HMSpeechInfo hMSpeechInfo = this.c;
        if (hMSpeechInfo == null) {
            return;
        }
        if (!this.d || this.e == null) {
            hmMiLiProDevice.sendSpeechInfoSync(hMSpeechInfo);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(this.e);
        EventRemindManager.saveEvent2Device(arrayList, new EventRemindManager.CallBack() { // from class: eb6
            @Override // com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager.CallBack
            public final void onFinish(boolean z) {
                this.a.e(arrayList, hmMiLiProDevice, z);
            }
        });
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        int enableIndex = EventRemindManager.getInstance().getEnableIndex();
        if (enableIndex == -1) {
            g();
        } else if (speechResult.isOpenMic()) {
            f(speechResult);
        } else {
            h(speechResult, enableIndex);
        }
    }
}
