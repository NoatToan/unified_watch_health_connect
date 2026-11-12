package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.speech.AlarmContent;
import com.xiaomi.hm.health.bt.profile.speech.ErrorContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.speech.constant.AlarmIntentionAction;
import com.xiaomi.hm.health.speech.constant.SpeechDialogStatus;
import com.xiaomi.hm.health.speech.entity.AlarmEventSkill;
import com.xiaomi.hm.health.speech.utils.AlarmUtils;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import com.xiaomi.hm.health.utils.Utils;
import java.util.Calendar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AlarmHandler extends BaseDomainHandler {
    private static final String k = "AlarmHandler";
    private static final int l = 99;
    private static final int m = 59;
    private static final long n = 0;
    private AlarmIntentionAction c;
    private AlarmEventSkill d;
    private ReminderHandler e;
    private HMSpeechInfo f;
    private OpenContent g;
    private boolean h;
    private boolean i;
    private Alarm j;

    public class a extends HMCallback {
        public final /* synthetic */ HMMiLiProDevice a;

        public a(final HMMiLiProDevice val$hmMiLiProDevice) {
            this.a = val$hmMiLiProDevice;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(AlarmHandler.k, "set alarm to device : " + result, new Object[0]);
            if (result) {
                AlarmClockManager.getInstance().setAlarm4Once(AlarmHandler.this.j);
                AlarmClockManager.getInstance().keepAlarm(AlarmHandler.this.j);
                AlarmClockManager.getInstance().syncAlarmToCloud(true);
            } else {
                AlarmHandler alarmHandler = AlarmHandler.this;
                alarmHandler.e(alarmHandler.context.getString(R.string.alarm_save_failed));
            }
            this.a.sendSpeechInfoSync(AlarmHandler.this.f);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SpeechDialogStatus.values().length];
            b = iArr;
            try {
                iArr[SpeechDialogStatus.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[SpeechDialogStatus.FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AlarmIntentionAction.values().length];
            a = iArr2;
            try {
                iArr2[AlarmIntentionAction.Alarm.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AlarmIntentionAction.Timer.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AlarmIntentionAction.Reminder.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AlarmIntentionAction.NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AlarmHandler(Context context) {
        super(context);
        this.i = false;
    }

    private void d() {
        e(this.context.getString(R.string.speech_nlp_silent_handler_answer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String content) {
        ErrorContent errorContent = new ErrorContent(content);
        errorContent.setType((byte) 1);
        this.f = new HMSpeechInfo(getId(), SpeechType.ERROR, errorContent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    private void f(AlarmClockExt alarmClockExt, Alarm alarm, String str) {
        ?? r0;
        int i;
        if (TextUtils.isEmpty(str)) {
            alarmClockExt.setRepeat(0);
            alarm.setMDays(0);
            return;
        }
        boolean zContains = str.contains(JsonParseUtils.WEEK_MON);
        if (str.contains(JsonParseUtils.WEEK_TUE)) {
            r0 = zContains;
            r0 = (zContains ? 1 : 0) | 2;
        }
        r0 = zContains;
        ?? r1 = r0;
        if (str.contains(JsonParseUtils.WEEK_WED)) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        ?? r2 = r1;
        if (str.contains(JsonParseUtils.WEEK_THU)) {
            r2 = (r1 == true ? 1 : 0) | 8;
        }
        ?? r3 = r2;
        if (str.contains(JsonParseUtils.WEEK_FRI)) {
            r3 = (r2 == true ? 1 : 0) | 16;
        }
        ?? r4 = r3;
        if (str.contains(JsonParseUtils.WEEK_SAT)) {
            r4 = (r3 == true ? 1 : 0) | 32;
        }
        ?? r5 = r4;
        if (str.contains(JsonParseUtils.WEEK_SUN)) {
            i = (r4 == true ? 1 : 0) | 64;
        }
        if (r5 == 0) {
            r5 = i;
            alarmClockExt.setRepeat(0);
            alarm.setMDays(0);
        } else {
            r5 = i;
            alarmClockExt.setRepeat((byte) r5);
            alarm.setMDays(Integer.valueOf((int) r5));
        }
    }

    private boolean g(int minuteValue, int secondValue) {
        return minuteValue > 99 || secondValue > 59;
    }

    private boolean h(AlarmEventSkill alarmEventSkill) {
        boolean zIsComplete = alarmEventSkill.isComplete();
        SpeechDialogStatus speechDialogStatusBySpeechDialogStatusDesc = SpeechDialogStatus.getSpeechDialogStatusBySpeechDialogStatusDesc(alarmEventSkill.getDialogStatus());
        if (speechDialogStatusBySpeechDialogStatusDesc == null) {
            return zIsComplete;
        }
        int i = b.b[speechDialogStatusBySpeechDialogStatusDesc.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return zIsComplete;
        }
        return true;
    }

    private boolean i(SpeechResult speechResult) {
        try {
            JSONObject jSONObject = new JSONObject(speechResult.getIntention());
            if (!jSONObject.has("operation")) {
                return false;
            }
            String string = jSONObject.getString("operation");
            if ("query".equals(string) || "delete".equals(string) || "close".equals(string) || "modify".equals(string)) {
                this.g = new OpenContent((byte) 16);
                this.f = new HMSpeechInfo(getId(), SpeechType.OPEN, this.g);
                return true;
            }
        } catch (Exception e) {
            HMLog.i(k, e.getMessage(), new Object[0]);
        }
        return false;
    }

    private void j(SpeechResult speechResult, int index) {
        try {
            JSONObject jSONObject = new JSONObject(speechResult.getIntention());
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("date_time"));
            Calendar calendarDateFormat = Utils.dateFormat(jSONObject2.getString("value"), "yyyy-MM-dd'T'HH:mm:ss");
            if (calendarDateFormat == null) {
                HMLog.i(k, "value is " + jSONObject2.getString("value"), new Object[0]);
                d();
                return;
            }
            String strOptString = jSONObject.optString("circle");
            String strOptString2 = jSONObject.optString(JsonParseUtils.CIRCLE_EXTRA);
            String strOptString3 = jSONObject.optString("event");
            AlarmClockExt alarmClockExt = new AlarmClockExt();
            alarmClockExt.setCalendar(calendarDateFormat);
            alarmClockExt.setEnable(true);
            alarmClockExt.setIndex((byte) index);
            alarmClockExt.setSmart(false);
            alarmClockExt.setVisible(true);
            alarmClockExt.enableLazyMode(true);
            Alarm alarmByIndex = AlarmClockManager.getInstance().getAlarmByIndex(index);
            this.j = alarmByIndex;
            alarmByIndex.setCalendar(Long.valueOf(calendarDateFormat.getTimeInMillis()));
            Alarm alarm = this.j;
            Boolean bool = Boolean.TRUE;
            alarm.setIsSmartWakeup(bool);
            this.j.setIsSmart(Boolean.FALSE);
            this.j.setVisible(bool);
            this.j.setEnabled(bool);
            switch (strOptString) {
                case "once":
                    alarmClockExt.setRepeat(0);
                    this.j.setMDays(0);
                    break;
                case "everyday":
                    alarmClockExt.setRepeat(127);
                    this.j.setMDays(127);
                    break;
                case "everyweek":
                    f(alarmClockExt, this.j, strOptString2);
                    break;
                case "montofri":
                    alarmClockExt.setRepeat(31);
                    this.j.setMDays(31);
                    break;
                case "weekend":
                    alarmClockExt.setRepeat(96);
                    this.j.setMDays(96);
                    break;
                case "monthly":
                    d();
                    HMLog.i(k, "not support monthly alarm", new Object[0]);
                    return;
                case "yearly":
                    d();
                    HMLog.i(k, "not support yearly alarm", new Object[0]);
                    return;
                default:
                    alarmClockExt.setRepeat(0);
                    break;
            }
            AlarmContent alarmContent = new AlarmContent();
            alarmContent.setType((byte) 1);
            alarmContent.setContent(strOptString3);
            alarmContent.setAlarm(alarmClockExt);
            this.i = true;
            this.f = new HMSpeechInfo(getId(), SpeechType.ALARM, alarmContent);
        } catch (Exception e) {
            HMLog.i(k, e.getMessage(), new Object[0]);
            d();
        }
    }

    private void k(SpeechResult speechResult) {
        AlarmContent alarmContent = new AlarmContent();
        alarmContent.setType((byte) 2);
        alarmContent.setContent(speechResult.getAnswerText());
        this.f = new HMSpeechInfo(getId(), SpeechType.ALARM, alarmContent);
    }

    private void l() {
        AlarmContent alarmContent = new AlarmContent();
        alarmContent.setType((byte) 3);
        alarmContent.setContent(this.context.getString(R.string.audio_alarm_full));
        this.f = new HMSpeechInfo(getId(), SpeechType.ALARM, alarmContent);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
        OpenContent.CountdownContent countdownContent;
        AlarmIntentionAction alarmIntentionAction = this.c;
        if (alarmIntentionAction == null) {
            this.f = new HMSpeechInfo(getId(), SpeechType.ERROR, new ErrorContent(this.context.getString(R.string.speech_nlp_silent_handler_answer)));
            return;
        }
        int i = b.a[alarmIntentionAction.ordinal()];
        if (i == 2) {
            AlarmEventSkill alarmEventSkill = this.d;
            if (alarmEventSkill == null) {
                return;
            }
            this.h = h(alarmEventSkill);
            this.g = new OpenContent((byte) 11);
            if (this.h) {
                int[] iArrConvertTimeIntervalToMinuteAndSecondsArr = AlarmUtils.convertTimeIntervalToMinuteAndSecondsArr(this.d.getRelativeTimestamp(), this.d.getOffset() == null ? 0L : this.d.getOffset().getTimestamp());
                if (g(iArrConvertTimeIntervalToMinuteAndSecondsArr[0], iArrConvertTimeIntervalToMinuteAndSecondsArr[1])) {
                    countdownContent = new OpenContent.CountdownContent((byte) 1, (byte) iArrConvertTimeIntervalToMinuteAndSecondsArr[0], (byte) iArrConvertTimeIntervalToMinuteAndSecondsArr[1], this.context.getString(R.string.speech_nlp_alarm_timer_setting_time_beyond_maximum));
                } else {
                    countdownContent = new OpenContent.CountdownContent((byte) iArrConvertTimeIntervalToMinuteAndSecondsArr[0], (byte) iArrConvertTimeIntervalToMinuteAndSecondsArr[1], "");
                }
                this.g.setParam(countdownContent);
            } else {
                this.g.setParam(new OpenContent.CountdownContent((byte) 1, (byte) 0, (byte) 0, this.d.getReplyText()));
            }
        } else if (i == 3) {
            ReminderHandler reminderHandler = this.e;
            if (reminderHandler != null) {
                reminderHandler.handleDomainEvent();
            }
        } else if (i == 4) {
            d();
        }
        if (this.g != null) {
            this.f = new HMSpeechInfo(getId(), SpeechType.OPEN, this.g);
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        ReminderHandler reminderHandler = this.e;
        if (reminderHandler != null) {
            reminderHandler.pushInfoToDevice(hmMiLiProDevice);
        }
        HMSpeechInfo hMSpeechInfo = this.f;
        if (hMSpeechInfo == null) {
            return;
        }
        if (!this.i || this.j == null) {
            hmMiLiProDevice.sendSpeechInfoSync(hMSpeechInfo);
        } else {
            hmMiLiProDevice.setAlarmClock(AlarmClockManager.getInstance().alarm2Ext(this.j), new a(hmMiLiProDevice));
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        this.c = AlarmIntentionAction.findCorrespondAlarmIntentionActionByActionDesc(speechResult.getAction());
        AlarmEventSkill intentionContentJsonStrToAlarmEventSkill = JsonParseUtils.parseIntentionContentJsonStrToAlarmEventSkill(speechResult.getIntention());
        this.d = intentionContentJsonStrToAlarmEventSkill;
        intentionContentJsonStrToAlarmEventSkill.setReplyText(speechResult.getAnswerText());
        AlarmIntentionAction alarmIntentionAction = this.c;
        if (alarmIntentionAction == null) {
            d();
            return;
        }
        int i = b.a[alarmIntentionAction.ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            ReminderHandler reminderHandler = new ReminderHandler(this.context);
            this.e = reminderHandler;
            reminderHandler.resolveSpeechResult(speechResult);
            return;
        }
        if (i(speechResult)) {
            return;
        }
        int availableId = AlarmClockManager.getInstance().getAvailableId();
        if (availableId < 0 || availableId > 9) {
            l();
        } else if (speechResult.isOpenMic()) {
            k(speechResult);
        } else {
            j(speechResult, availableId);
        }
    }
}
