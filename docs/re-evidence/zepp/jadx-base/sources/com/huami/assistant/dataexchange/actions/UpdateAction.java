package com.huami.assistant.dataexchange.actions;

import com.huami.assistant.dataexchange.Actions;
import com.huami.assistant.model.bean.Update;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.ArraysUtil;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateAction extends Action {
    private static final String g = "SyncId";
    private static final String h = "Type";
    private static final String i = "TypeKey";
    private static final String j = "StartTime";
    private static final String k = "EndTime";
    private static final String l = "Data";
    private static final String m = "Data1";
    private static final String n = "SyncIds";
    private String f;
    public String[] syncIds;
    public Update update;

    public UpdateAction() {
        this.update = new Update();
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String target() {
        return Actions.UPDATE;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String toString() {
        return SearchCriteria.LT + super.toString() + ", " + this.update + ", SyncIds: " + ArraysUtil.toString(this.syncIds) + SearchCriteria.GT;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public DataBundle toWatchData() {
        DataBundle watchData = super.toWatchData();
        watchData.putString(g, this.update.syncId);
        watchData.putInt("Type", this.update.type);
        watchData.putString(i, Update.ALL_TYPES.get(this.update.type));
        watchData.putLong(j, this.update.startTime);
        watchData.putLong(k, this.update.endTime);
        watchData.putString("Data", this.update.data);
        watchData.putString(m, this.f);
        watchData.putStringArray(n, this.syncIds);
        return watchData;
    }

    public UpdateAction update(int type, String syncId) {
        Update update = this.update;
        update.syncId = syncId;
        update.type = type;
        return this;
    }

    public UpdateAction(DataBundle data) {
        super(data);
        Update update = new Update();
        this.update = update;
        update.syncId = data.getString(g);
        this.update.type = data.getInt("Type", -1);
        this.update.startTime = data.getLong(j);
        this.update.endTime = data.getLong(k);
        this.update.data = data.getString("Data");
        this.syncIds = data.getStringArray(n);
    }

    public UpdateAction update(Update update, String keyValuesInfo) {
        this.update = update;
        this.f = keyValuesInfo;
        return this;
    }

    public UpdateAction update(String[] syncIds) {
        this.syncIds = syncIds;
        return this;
    }
}
