package com.huami.assistant.dataexchange;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.dataexchange.actions.AlarmAction;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.assistant.dataexchange.actions.NotificationAction;
import com.huami.assistant.dataexchange.actions.PinAction;
import com.huami.assistant.dataexchange.actions.UpdateAction;
import com.huami.assistant.model.bean.Pin;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.notification.data.StatusBarNotificationData;

/* JADX INFO: loaded from: classes5.dex */
public class ExchangeCenter {
    private static final String a = "Assist-ExchangeCenter";

    private static ActionResult a(Action action) {
        return AssistantModule.getExchange().sync(action);
    }

    @NonNull
    public static ActionResult addAlarm(Alarm alarm) {
        return a(new AlarmAction().alarm(alarm).add());
    }

    @NonNull
    public static ActionResult addEvent(Event event) {
        return a(new EventAction().event(event).add());
    }

    @NonNull
    public static ActionResult addNotification(StatusBarNotificationData notificationData) {
        return a(new NotificationAction(notificationData));
    }

    @NonNull
    public static ActionResult addPin(Pin pin) {
        String json = new Gson().toJson(pin);
        Action actionAdd = new PinAction().pin(json).add();
        return !TextUtils.isEmpty(json) ? a(actionAdd) : new ActionResult(actionAdd);
    }

    @NonNull
    public static ActionResult addUpdate(Update update, String keyValuesInfo) {
        return a(new UpdateAction().update(update, keyValuesInfo).add());
    }

    @NonNull
    public static ActionResult delUpdate(Update update) {
        return a(new UpdateAction().update(update.type, update.syncId).delete());
    }

    @NonNull
    public static ActionResult deleteAlarm(long id) {
        return a(new AlarmAction().alarm(id).delete());
    }

    @NonNull
    public static ActionResult deleteEvent(String syncId) {
        return a(new EventAction().event(syncId).delete());
    }

    @NonNull
    public static ActionResult deleteEvents(String[] syncIds) {
        return a(new EventAction().event(syncIds).delete());
    }

    @NonNull
    public static ActionResult deletePin(Context context) {
        return a(new PinAction().pin("").add());
    }

    @NonNull
    public static ActionResult queryAddedEvents() {
        return a(new EventAction().where("dirty=?", "1").where("deleted=?", "0").query());
    }

    @NonNull
    public static ActionResult queryAllAlarm() {
        return a(new AlarmAction().alarm(-1L).query());
    }

    @NonNull
    public static ActionResult queryAllEvents() {
        return a(new EventAction().where("deleted=?", "0").query());
    }

    @NonNull
    public static ActionResult queryDeletedUpdates() {
        UpdateAction updateAction = new UpdateAction();
        updateAction.where("sync_state=?", "1");
        return a(updateAction.query());
    }

    @NonNull
    public static ActionResult queryPin() {
        return a(new PinAction().query());
    }

    @NonNull
    public static ActionResult queryUpdates(long startTime, long endTime) {
        UpdateAction updateAction = new UpdateAction();
        updateAction.where("start_time>=?", String.valueOf(startTime)).where("start_time<=?", String.valueOf(endTime));
        return a(updateAction.query());
    }

    @NonNull
    public static ActionResult addAlarm(long id, int hour, int min, String label, boolean enable, int days) {
        Alarm alarm = new Alarm();
        alarm.id = id;
        alarm.hour = hour;
        alarm.minutes = min;
        alarm.label = label;
        alarm.enabled = enable;
        alarm.days = days;
        return addAlarm(alarm);
    }
}
