package com.xiaomi.ai.api;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Alerts {

    public enum AlertCircleType {
        UNKNOWN(-1),
        ONCE(0),
        EVERYDAY(1),
        WORKDAY(2),
        MONDAY_TO_FRIDAY(3),
        HOLIDAY(4),
        WEEKEND(5),
        WEEKLY(6),
        MONTHLY(7),
        YEARLY(8);

        private int id;

        AlertCircleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AlertDateTime {

        @Required
        private long timestamp;

        @Required
        private String value;

        public AlertDateTime() {
        }

        public AlertDateTime(String str, long j) {
            this.value = str;
            this.timestamp = j;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        @Required
        public AlertDateTime setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public AlertDateTime setValue(String str) {
            this.value = str;
            return this;
        }
    }

    public enum AlertFilterType {
        UNKNOWN(-1),
        RECENTLY_SET(0),
        RECENTLY_CALL(1),
        ON_STATUS(2),
        OFF_STATUS(3);

        private int id;

        AlertFilterType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AlertItem {

        @Required
        private AlertCircleType circle;

        @Required
        private String datetime;

        @Required
        private String id;

        @Required
        private AlertStatus status;

        @Required
        private AlertType type;
        private Optional<String> circle_extra = Optional.empty();
        private Optional<String> offset = Optional.empty();
        private Optional<String> event = Optional.empty();
        private Optional<String> reminder = Optional.empty();
        private Optional<String> reminder_url = Optional.empty();
        private Optional<Integer> volume = Optional.empty();
        private Optional<String> ringtone = Optional.empty();
        private Optional<String> update_datetime = Optional.empty();
        private Optional<String> disable_datetime = Optional.empty();
        private Optional<String> ringtone_uri = Optional.empty();
        private Optional<String> ringtone_type = Optional.empty();
        private Optional<String> ringtone_query = Optional.empty();
        private Optional<Integer> advance_reminder = Optional.empty();
        private Optional<Integer> repeat_ringing = Optional.empty();
        private Optional<String> time_reminder = Optional.empty();
        private Optional<Long> offset_remained = Optional.empty();
        private Optional<ReminderParam> reminder_param = Optional.empty();
        private Optional<DateType> date_type = Optional.empty();
        private Optional<Boolean> use_year = Optional.empty();
        private Optional<String> birth_name = Optional.empty();

        @Deprecated
        private Optional<Template.Image> icon = Optional.empty();

        public AlertItem() {
        }

        public AlertItem(String str, AlertType alertType, AlertStatus alertStatus, String str2, AlertCircleType alertCircleType) {
            this.id = str;
            this.type = alertType;
            this.status = alertStatus;
            this.datetime = str2;
            this.circle = alertCircleType;
        }

        public Optional<Integer> getAdvanceReminder() {
            return this.advance_reminder;
        }

        public Optional<String> getBirthName() {
            return this.birth_name;
        }

        @Required
        public AlertCircleType getCircle() {
            return this.circle;
        }

        public Optional<String> getCircleExtra() {
            return this.circle_extra;
        }

        public Optional<DateType> getDateType() {
            return this.date_type;
        }

        @Required
        public String getDatetime() {
            return this.datetime;
        }

        public Optional<String> getDisableDatetime() {
            return this.disable_datetime;
        }

        public Optional<String> getEvent() {
            return this.event;
        }

        @Deprecated
        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getOffset() {
            return this.offset;
        }

        public Optional<Long> getOffsetRemained() {
            return this.offset_remained;
        }

        public Optional<String> getReminder() {
            return this.reminder;
        }

        public Optional<ReminderParam> getReminderParam() {
            return this.reminder_param;
        }

        public Optional<String> getReminderUrl() {
            return this.reminder_url;
        }

        public Optional<Integer> getRepeatRinging() {
            return this.repeat_ringing;
        }

        public Optional<String> getRingtone() {
            return this.ringtone;
        }

        public Optional<String> getRingtoneQuery() {
            return this.ringtone_query;
        }

        public Optional<String> getRingtoneType() {
            return this.ringtone_type;
        }

        public Optional<String> getRingtoneUri() {
            return this.ringtone_uri;
        }

        @Required
        public AlertStatus getStatus() {
            return this.status;
        }

        public Optional<String> getTimeReminder() {
            return this.time_reminder;
        }

        @Required
        public AlertType getType() {
            return this.type;
        }

        public Optional<String> getUpdateDatetime() {
            return this.update_datetime;
        }

        public Optional<Integer> getVolume() {
            return this.volume;
        }

        public Optional<Boolean> isUseYear() {
            return this.use_year;
        }

        public AlertItem setAdvanceReminder(int i) {
            this.advance_reminder = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public AlertItem setBirthName(String str) {
            this.birth_name = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlertItem setCircle(AlertCircleType alertCircleType) {
            this.circle = alertCircleType;
            return this;
        }

        public AlertItem setCircleExtra(String str) {
            this.circle_extra = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setDateType(DateType dateType) {
            this.date_type = Optional.ofNullable(dateType);
            return this;
        }

        @Required
        public AlertItem setDatetime(String str) {
            this.datetime = str;
            return this;
        }

        public AlertItem setDisableDatetime(String str) {
            this.disable_datetime = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setEvent(String str) {
            this.event = Optional.ofNullable(str);
            return this;
        }

        @Deprecated
        public AlertItem setIcon(Template.Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public AlertItem setId(String str) {
            this.id = str;
            return this;
        }

        public AlertItem setOffset(String str) {
            this.offset = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setOffsetRemained(long j) {
            this.offset_remained = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public AlertItem setReminder(String str) {
            this.reminder = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setReminderParam(ReminderParam reminderParam) {
            this.reminder_param = Optional.ofNullable(reminderParam);
            return this;
        }

        public AlertItem setReminderUrl(String str) {
            this.reminder_url = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setRepeatRinging(int i) {
            this.repeat_ringing = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public AlertItem setRingtone(String str) {
            this.ringtone = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setRingtoneQuery(String str) {
            this.ringtone_query = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setRingtoneType(String str) {
            this.ringtone_type = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setRingtoneUri(String str) {
            this.ringtone_uri = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlertItem setStatus(AlertStatus alertStatus) {
            this.status = alertStatus;
            return this;
        }

        public AlertItem setTimeReminder(String str) {
            this.time_reminder = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlertItem setType(AlertType alertType) {
            this.type = alertType;
            return this;
        }

        public AlertItem setUpdateDatetime(String str) {
            this.update_datetime = Optional.ofNullable(str);
            return this;
        }

        public AlertItem setUseYear(boolean z) {
            this.use_year = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public AlertItem setVolume(int i) {
            this.volume = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class AlertOpItem {
        private Optional<String> disable_datetime = Optional.empty();

        @Required
        private String id;

        @Required
        private AlertType type;

        public AlertOpItem() {
        }

        public AlertOpItem(String str, AlertType alertType) {
            this.id = str;
            this.type = alertType;
        }

        public Optional<String> getDisableDatetime() {
            return this.disable_datetime;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public AlertType getType() {
            return this.type;
        }

        public AlertOpItem setDisableDatetime(String str) {
            this.disable_datetime = Optional.ofNullable(str);
            return this;
        }

        @Required
        public AlertOpItem setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public AlertOpItem setType(AlertType alertType) {
            this.type = alertType;
            return this;
        }
    }

    public enum AlertOperation {
        UNKNOWN(-1),
        OPEN(0),
        CLOSE(1),
        PAUSE(2),
        PROCEED(3),
        QUERY(4),
        DELETE(5);

        private int id;

        AlertOperation(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AlertReminder {
    }

    public enum AlertStatus {
        UNKNOWN(-1),
        OFF(0),
        ON(1),
        SUSPEND(2);

        private int id;

        AlertStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AlertTimeInfo {

        @Required
        private String token;

        @Required
        private AlertTimeType type;
        private Optional<AlertDateTime> datetime = Optional.empty();
        private Optional<AlertDateTime> start_datetime = Optional.empty();
        private Optional<AlertDateTime> end_datetime = Optional.empty();

        public AlertTimeInfo() {
        }

        public AlertTimeInfo(AlertTimeType alertTimeType, String str) {
            this.type = alertTimeType;
            this.token = str;
        }

        public Optional<AlertDateTime> getDatetime() {
            return this.datetime;
        }

        public Optional<AlertDateTime> getEndDatetime() {
            return this.end_datetime;
        }

        public Optional<AlertDateTime> getStartDatetime() {
            return this.start_datetime;
        }

        @Required
        public String getToken() {
            return this.token;
        }

        @Required
        public AlertTimeType getType() {
            return this.type;
        }

        public AlertTimeInfo setDatetime(AlertDateTime alertDateTime) {
            this.datetime = Optional.ofNullable(alertDateTime);
            return this;
        }

        public AlertTimeInfo setEndDatetime(AlertDateTime alertDateTime) {
            this.end_datetime = Optional.ofNullable(alertDateTime);
            return this;
        }

        public AlertTimeInfo setStartDatetime(AlertDateTime alertDateTime) {
            this.start_datetime = Optional.ofNullable(alertDateTime);
            return this;
        }

        @Required
        public AlertTimeInfo setToken(String str) {
            this.token = str;
            return this;
        }

        @Required
        public AlertTimeInfo setType(AlertTimeType alertTimeType) {
            this.type = alertTimeType;
            return this;
        }
    }

    public enum AlertTimeType {
        UNKNOWN(-1),
        DATETIME(0),
        DURATION(1),
        OFFSET(2),
        INDETER_DATETIME(3);

        private int id;

        AlertTimeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AlertType {
        UNKNOWN(-1),
        ALARM(0),
        REMINDER(1),
        TIMER(2),
        BIRTHDAY(3),
        ANNIVERSARY(4);

        private int id;

        AlertType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AlertsResult", namespace = "Alerts")
    public static class AlertsResult implements EventPayload {

        @Required
        private List<AlertItem> alerts;

        public AlertsResult() {
        }

        public AlertsResult(List<AlertItem> list) {
            this.alerts = list;
        }

        @Required
        public List<AlertItem> getAlerts() {
            return this.alerts;
        }

        @Required
        public AlertsResult setAlerts(List<AlertItem> list) {
            this.alerts = list;
            return this;
        }
    }

    @NamespaceName(name = "ChimeHourly", namespace = "Alerts")
    public static class ChimeHourly implements EventPayload {
    }

    public enum DateType {
        GREGORIAN(0),
        LUNAR(1);

        private int id;

        DateType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = AVSAPIConstants.Alerts.Directives.DeleteAlert.NAME, namespace = "Alerts")
    @Deprecated
    public static class DeleteAlert implements InstructionPayload {

        @Required
        private String id;

        @Required
        private AlertType type;

        public DeleteAlert() {
        }

        public DeleteAlert(String str, AlertType alertType) {
            this.id = str;
            this.type = alertType;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public AlertType getType() {
            return this.type;
        }

        @Required
        public DeleteAlert setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public DeleteAlert setType(AlertType alertType) {
            this.type = alertType;
            return this;
        }
    }

    @NamespaceName(name = "DeleteAlerts", namespace = "Alerts")
    public static class DeleteAlerts implements InstructionPayload {

        @Required
        private List<AlertOpItem> alerts;

        public DeleteAlerts() {
        }

        public DeleteAlerts(List<AlertOpItem> list) {
            this.alerts = list;
        }

        @Required
        public List<AlertOpItem> getAlerts() {
            return this.alerts;
        }

        @Required
        public DeleteAlerts setAlerts(List<AlertOpItem> list) {
            this.alerts = list;
            return this;
        }
    }

    @NamespaceName(name = "DeliverAlertIntention", namespace = "Alerts")
    public static class DeliverAlertIntention implements InstructionPayload {

        @Required
        private boolean operate_all;

        @Required
        private AlertOperation operation;

        @Required
        private AlertType type;
        private Optional<AlertCircleType> circle = Optional.empty();
        private Optional<String> circle_extra = Optional.empty();
        private Optional<String> event = Optional.empty();
        private Optional<AlertFilterType> filter_type = Optional.empty();
        private Optional<AlertTimeInfo> time = Optional.empty();

        public DeliverAlertIntention() {
        }

        public DeliverAlertIntention(AlertType alertType, AlertOperation alertOperation, boolean z) {
            this.type = alertType;
            this.operation = alertOperation;
            this.operate_all = z;
        }

        public Optional<AlertCircleType> getCircle() {
            return this.circle;
        }

        public Optional<String> getCircleExtra() {
            return this.circle_extra;
        }

        public Optional<String> getEvent() {
            return this.event;
        }

        public Optional<AlertFilterType> getFilterType() {
            return this.filter_type;
        }

        @Required
        public AlertOperation getOperation() {
            return this.operation;
        }

        public Optional<AlertTimeInfo> getTime() {
            return this.time;
        }

        @Required
        public AlertType getType() {
            return this.type;
        }

        @Required
        public boolean isOperateAll() {
            return this.operate_all;
        }

        public DeliverAlertIntention setCircle(AlertCircleType alertCircleType) {
            this.circle = Optional.ofNullable(alertCircleType);
            return this;
        }

        public DeliverAlertIntention setCircleExtra(String str) {
            this.circle_extra = Optional.ofNullable(str);
            return this;
        }

        public DeliverAlertIntention setEvent(String str) {
            this.event = Optional.ofNullable(str);
            return this;
        }

        public DeliverAlertIntention setFilterType(AlertFilterType alertFilterType) {
            this.filter_type = Optional.ofNullable(alertFilterType);
            return this;
        }

        @Required
        public DeliverAlertIntention setOperateAll(boolean z) {
            this.operate_all = z;
            return this;
        }

        @Required
        public DeliverAlertIntention setOperation(AlertOperation alertOperation) {
            this.operation = alertOperation;
            return this;
        }

        public DeliverAlertIntention setTime(AlertTimeInfo alertTimeInfo) {
            this.time = Optional.ofNullable(alertTimeInfo);
            return this;
        }

        @Required
        public DeliverAlertIntention setType(AlertType alertType) {
            this.type = alertType;
            return this;
        }
    }

    public enum RemindType {
        UNKNOWN(-1),
        PUSH(0),
        ALARM(1);

        private int id;

        RemindType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ReminderParam {
        private Optional<String> end_datetime = Optional.empty();
        private Optional<Integer> cycle_count = Optional.empty();
        private Optional<Boolean> all_day = Optional.empty();
        private Optional<String> cycle_end_datetime = Optional.empty();
        private Optional<String> event_location = Optional.empty();
        private Optional<String> circle_rule = Optional.empty();

        public Optional<String> getCircleRule() {
            return this.circle_rule;
        }

        public Optional<Integer> getCycleCount() {
            return this.cycle_count;
        }

        public Optional<String> getCycleEndDatetime() {
            return this.cycle_end_datetime;
        }

        public Optional<String> getEndDatetime() {
            return this.end_datetime;
        }

        public Optional<String> getEventLocation() {
            return this.event_location;
        }

        public Optional<Boolean> isAllDay() {
            return this.all_day;
        }

        public ReminderParam setAllDay(boolean z) {
            this.all_day = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public ReminderParam setCircleRule(String str) {
            this.circle_rule = Optional.ofNullable(str);
            return this;
        }

        public ReminderParam setCycleCount(int i) {
            this.cycle_count = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ReminderParam setCycleEndDatetime(String str) {
            this.cycle_end_datetime = Optional.ofNullable(str);
            return this;
        }

        public ReminderParam setEndDatetime(String str) {
            this.end_datetime = Optional.ofNullable(str);
            return this;
        }

        public ReminderParam setEventLocation(String str) {
            this.event_location = Optional.ofNullable(str);
            return this;
        }
    }

    public static class Ringtone {
        private Optional<String> uri = Optional.empty();
        private Optional<String> type = Optional.empty();
        private Optional<Nlp.InvokeNlpRequest> request = Optional.empty();

        public Optional<Nlp.InvokeNlpRequest> getRequest() {
            return this.request;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public Optional<String> getUri() {
            return this.uri;
        }

        public Ringtone setRequest(Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.request = Optional.ofNullable(invokeNlpRequest);
            return this;
        }

        public Ringtone setType(String str) {
            this.type = Optional.ofNullable(str);
            return this;
        }

        public Ringtone setUri(String str) {
            this.uri = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = AVSAPIConstants.Alerts.Directives.SetAlert.NAME, namespace = "Alerts")
    public static class SetAlert implements InstructionPayload {

        @Required
        private String datetime;

        @Required
        private String id;

        @Required
        private AlertType type;
        private Optional<AlertCircleType> circle = Optional.empty();
        private Optional<String> circle_extra = Optional.empty();
        private Optional<String> event = Optional.empty();
        private Optional<String> reminder = Optional.empty();
        private Optional<Integer> repeat_ringing = Optional.empty();
        private Optional<String> offset = Optional.empty();

        @Deprecated
        private Optional<Nlp.InvokeNlpRequest> invoke_nlp_request = Optional.empty();
        private Optional<Integer> advance_reminder = Optional.empty();
        private Optional<Ringtone> ringtone = Optional.empty();
        private Optional<String> time_reminder = Optional.empty();
        private Optional<String> end_datetime = Optional.empty();
        private Optional<RemindType> remind_type = Optional.empty();
        private Optional<DateType> date_type = Optional.empty();
        private Optional<Boolean> use_year = Optional.empty();
        private Optional<String> birth_name = Optional.empty();

        public SetAlert() {
        }

        public SetAlert(String str, AlertType alertType, String str2) {
            this.id = str;
            this.type = alertType;
            this.datetime = str2;
        }

        public Optional<Integer> getAdvanceReminder() {
            return this.advance_reminder;
        }

        public Optional<String> getBirthName() {
            return this.birth_name;
        }

        public Optional<AlertCircleType> getCircle() {
            return this.circle;
        }

        public Optional<String> getCircleExtra() {
            return this.circle_extra;
        }

        public Optional<DateType> getDateType() {
            return this.date_type;
        }

        @Required
        public String getDatetime() {
            return this.datetime;
        }

        public Optional<String> getEndDatetime() {
            return this.end_datetime;
        }

        public Optional<String> getEvent() {
            return this.event;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Deprecated
        public Optional<Nlp.InvokeNlpRequest> getInvokeNlpRequest() {
            return this.invoke_nlp_request;
        }

        public Optional<String> getOffset() {
            return this.offset;
        }

        public Optional<RemindType> getRemindType() {
            return this.remind_type;
        }

        public Optional<String> getReminder() {
            return this.reminder;
        }

        public Optional<Integer> getRepeatRinging() {
            return this.repeat_ringing;
        }

        public Optional<Ringtone> getRingtone() {
            return this.ringtone;
        }

        public Optional<String> getTimeReminder() {
            return this.time_reminder;
        }

        @Required
        public AlertType getType() {
            return this.type;
        }

        public Optional<Boolean> isUseYear() {
            return this.use_year;
        }

        public SetAlert setAdvanceReminder(int i) {
            this.advance_reminder = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SetAlert setBirthName(String str) {
            this.birth_name = Optional.ofNullable(str);
            return this;
        }

        public SetAlert setCircle(AlertCircleType alertCircleType) {
            this.circle = Optional.ofNullable(alertCircleType);
            return this;
        }

        public SetAlert setCircleExtra(String str) {
            this.circle_extra = Optional.ofNullable(str);
            return this;
        }

        public SetAlert setDateType(DateType dateType) {
            this.date_type = Optional.ofNullable(dateType);
            return this;
        }

        @Required
        public SetAlert setDatetime(String str) {
            this.datetime = str;
            return this;
        }

        public SetAlert setEndDatetime(String str) {
            this.end_datetime = Optional.ofNullable(str);
            return this;
        }

        public SetAlert setEvent(String str) {
            this.event = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SetAlert setId(String str) {
            this.id = str;
            return this;
        }

        @Deprecated
        public SetAlert setInvokeNlpRequest(Nlp.InvokeNlpRequest invokeNlpRequest) {
            this.invoke_nlp_request = Optional.ofNullable(invokeNlpRequest);
            return this;
        }

        public SetAlert setOffset(String str) {
            this.offset = Optional.ofNullable(str);
            return this;
        }

        public SetAlert setRemindType(RemindType remindType) {
            this.remind_type = Optional.ofNullable(remindType);
            return this;
        }

        public SetAlert setReminder(String str) {
            this.reminder = Optional.ofNullable(str);
            return this;
        }

        public SetAlert setRepeatRinging(int i) {
            this.repeat_ringing = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SetAlert setRingtone(Ringtone ringtone) {
            this.ringtone = Optional.ofNullable(ringtone);
            return this;
        }

        public SetAlert setTimeReminder(String str) {
            this.time_reminder = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SetAlert setType(AlertType alertType) {
            this.type = alertType;
            return this;
        }

        public SetAlert setUseYear(boolean z) {
            this.use_year = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "SetTODO", namespace = "Alerts")
    public static class SetTODO implements InstructionPayload {
        private Optional<String> datetime = Optional.empty();

        @Required
        private String todo;

        public SetTODO() {
        }

        public SetTODO(String str) {
            this.todo = str;
        }

        public Optional<String> getDatetime() {
            return this.datetime;
        }

        @Required
        public String getTodo() {
            return this.todo;
        }

        public SetTODO setDatetime(String str) {
            this.datetime = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SetTODO setTodo(String str) {
            this.todo = str;
            return this;
        }
    }

    @NamespaceName(name = "StopAlert", namespace = "Alerts")
    public static class StopAlert implements InstructionPayload {
    }

    @NamespaceName(name = "StoreAlerts", namespace = "Alerts")
    public static class StoreAlerts implements EventPayload {

        @Required
        private List<AlertItem> alert_items;

        public StoreAlerts() {
        }

        public StoreAlerts(List<AlertItem> list) {
            this.alert_items = list;
        }

        @Required
        public List<AlertItem> getAlertItems() {
            return this.alert_items;
        }

        @Required
        public StoreAlerts setAlertItems(List<AlertItem> list) {
            this.alert_items = list;
            return this;
        }
    }

    @NamespaceName(name = "UpdateAlertStatus", namespace = "Alerts")
    @Deprecated
    public static class UpdateAlertStatus implements InstructionPayload {
        private Optional<String> disable_datetime = Optional.empty();

        @Required
        private String id;

        @Required
        private AlertOperation operation;

        @Required
        private AlertType type;

        public UpdateAlertStatus() {
        }

        public UpdateAlertStatus(String str, AlertType alertType, AlertOperation alertOperation) {
            this.id = str;
            this.type = alertType;
            this.operation = alertOperation;
        }

        public Optional<String> getDisableDatetime() {
            return this.disable_datetime;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public AlertOperation getOperation() {
            return this.operation;
        }

        @Required
        public AlertType getType() {
            return this.type;
        }

        public UpdateAlertStatus setDisableDatetime(String str) {
            this.disable_datetime = Optional.ofNullable(str);
            return this;
        }

        @Required
        public UpdateAlertStatus setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public UpdateAlertStatus setOperation(AlertOperation alertOperation) {
            this.operation = alertOperation;
            return this;
        }

        @Required
        public UpdateAlertStatus setType(AlertType alertType) {
            this.type = alertType;
            return this;
        }
    }

    @NamespaceName(name = "UpdateAlerts", namespace = "Alerts")
    public static class UpdateAlerts implements InstructionPayload {

        @Required
        private List<AlertOpItem> alerts;

        @Required
        private AlertOperation operation;

        public UpdateAlerts() {
        }

        public UpdateAlerts(AlertOperation alertOperation, List<AlertOpItem> list) {
            this.operation = alertOperation;
            this.alerts = list;
        }

        @Required
        public List<AlertOpItem> getAlerts() {
            return this.alerts;
        }

        @Required
        public AlertOperation getOperation() {
            return this.operation;
        }

        @Required
        public UpdateAlerts setAlerts(List<AlertOpItem> list) {
            this.alerts = list;
            return this;
        }

        @Required
        public UpdateAlerts setOperation(AlertOperation alertOperation) {
            this.operation = alertOperation;
            return this;
        }
    }

    @NamespaceName(name = "UploadAlerts", namespace = "Alerts")
    public static class UploadAlerts implements InstructionPayload {

        @Required
        private List<AlertType> type;

        public UploadAlerts() {
        }

        public UploadAlerts(List<AlertType> list) {
            this.type = list;
        }

        @Required
        public List<AlertType> getType() {
            return this.type;
        }

        @Required
        public UploadAlerts setType(List<AlertType> list) {
            this.type = list;
            return this;
        }
    }
}
