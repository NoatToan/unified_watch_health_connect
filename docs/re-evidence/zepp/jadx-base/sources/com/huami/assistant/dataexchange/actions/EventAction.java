package com.huami.assistant.dataexchange.actions;

import com.huami.assistant.calendar.Event;
import com.huami.assistant.dataexchange.Actions;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.ArraysUtil;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class EventAction extends Action {
    private static final String f = "SyncId";
    private static final String g = "Title";
    private static final String h = "Description";
    private static final String i = "DTStart";
    private static final String j = "DTEnd";
    private static final String k = "ReminderMinutes";
    private static final String l = "HasAlarm";
    private static final String m = "RRule";
    private static final String n = "AllDay";
    private static final String o = "ReminderType";
    public Event event;
    public Event originEvent;
    public int splitPosition;
    public String[] syncIds;

    public EventAction() {
        this.event = new Event();
        this.originEvent = null;
        this.splitPosition = -1;
    }

    public EventAction event(String syncId) {
        this.event.syncId = syncId;
        return this;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String target() {
        return Actions.EVENT;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String toString() {
        return SearchCriteria.LT + super.toString() + ", " + this.event + ", SyncIds: " + ArraysUtil.toString(this.syncIds) + SearchCriteria.GT;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public DataBundle toWatchData() {
        DataBundle watchData = super.toWatchData();
        watchData.putString(f, this.event.syncId);
        watchData.putString(g, this.event.title);
        watchData.putString(h, this.event.description);
        watchData.putLong(i, this.event.startMillis);
        watchData.putLong(j, this.event.endMillis);
        watchData.putInt(k, this.event.reminderMinutes);
        watchData.putBoolean(l, this.event.hasAlarm);
        watchData.putString(m, this.event.rrule);
        watchData.putBoolean("AllDay", this.event.allDay);
        watchData.putInt(o, 1);
        watchData.putStringArray("SyncIds", this.syncIds);
        return watchData;
    }

    public EventAction event(Event event) {
        this.event = event;
        return this;
    }

    public EventAction event(String[] syncIds) {
        this.syncIds = syncIds;
        return this;
    }

    public EventAction(DataBundle data) {
        super(data);
        Event event = new Event();
        this.event = event;
        this.originEvent = null;
        this.splitPosition = -1;
        event.syncId = data.getString(f);
        this.event.title = data.getString(g);
        this.event.description = data.getString(h);
        this.event.startMillis = data.getLong(i);
        this.event.endMillis = data.getLong(j);
        this.event.reminderMinutes = data.getInt(k);
        this.event.hasAlarm = data.getBoolean(l);
        this.event.rrule = data.getString(m);
        this.event.allDay = data.getBoolean("AllDay");
        this.syncIds = data.getStringArray("SyncIds");
    }
}
