package com.huami.assistant.dataexchange.actions;

import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.dataexchange.Actions;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.transport.DataBundle;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmAction extends Action {
    private static final String f = "hour";
    private static final String g = "minutes";
    private static final String h = "label";
    private static final String i = "enabled";
    private static final String j = "days";
    private static final String k = "id";
    public Alarm alarm;

    public AlarmAction() {
        this.alarm = new Alarm();
    }

    public AlarmAction alarm(long id) {
        this.alarm.id = id;
        return this;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String target() {
        return Actions.ALARM;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public DataBundle toWatchData() {
        DataBundle watchData = super.toWatchData();
        watchData.putInt(f, this.alarm.hour);
        watchData.putInt(g, this.alarm.minutes);
        watchData.putString(h, this.alarm.label);
        watchData.putLong("id", this.alarm.id);
        watchData.putBoolean("enabled", this.alarm.enabled);
        watchData.putInt("days", this.alarm.days);
        return watchData;
    }

    public AlarmAction alarm(Alarm alarm) {
        this.alarm = alarm;
        return this;
    }

    public AlarmAction(DataBundle data) {
        super(data);
        Alarm alarm = new Alarm();
        this.alarm = alarm;
        alarm.hour = data.getInt(f, -1);
        this.alarm.minutes = data.getInt(g, -1);
        this.alarm.label = data.getString(h);
        this.alarm.id = data.getLong("id");
        this.alarm.enabled = data.getBoolean("enabled", true);
        this.alarm.days = data.getInt("days", 0);
    }
}
