package com.huami.assistant.dataexchange.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.ISync;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EventUpdatesSync implements ISync<EventAction> {
    private static final String b = "Assist-EventUpdatesSync";
    private Context a;

    public EventUpdatesSync(Context context) {
        this.a = context;
    }

    @NonNull
    public static List<Update> build(@NonNull List<Event> events) {
        ArrayList arrayList = new ArrayList(events.size());
        for (Event event : events) {
            arrayList.add(UpdateBuilder.build(event, UpdatesManager.getManager().getBySyncId(2, event.syncId)));
        }
        return arrayList;
    }

    public static boolean syncAdded() {
        ActionResult actionResultQueryAddedEvents = ExchangeCenter.queryAddedEvents();
        boolean zIsSuccess = actionResultQueryAddedEvents.isSuccess();
        if (!actionResultQueryAddedEvents.isSuccess()) {
            return zIsSuccess;
        }
        List<Event> events = UpdateParser.toEvents(actionResultQueryAddedEvents.resultData);
        if (events == null) {
            return false;
        }
        return UpdatesManager.getManager().save(build(events));
    }

    public static boolean syncAll() {
        ActionResult actionResultQueryAllEvents = ExchangeCenter.queryAllEvents();
        boolean zIsSuccess = actionResultQueryAllEvents.isSuccess();
        if (!actionResultQueryAllEvents.isSuccess()) {
            return zIsSuccess;
        }
        List<Event> events = UpdateParser.toEvents(actionResultQueryAllEvents.resultData);
        if (events == null) {
            return false;
        }
        return UpdatesManager.getManager().deleteAllAndSave(2, build(events));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onQuery(EventAction action, ActionResult result) {
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onAdd(EventAction action, ActionResult result) {
        Event event = action.event;
        if (event.syncId != null) {
            UpdatesManager.getManager().deleteBySyncId(2, event.syncId);
            EventDao.deleteEventBySyncId(this.a, event.syncId);
        }
        EventDao.insertEvent(this.a, event, true);
        result.success(UpdatesManager.getManager().save(UpdateBuilder.build(event)));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onDelete(EventAction action, ActionResult result) {
        boolean zDeleteBySyncId;
        if (action.syncIds != null) {
            zDeleteBySyncId = UpdatesManager.getManager().deleteBySyncIds(2, action.syncIds);
            EventDao.deleteEventsBySyncIds(this.a, action.syncIds);
        } else if (action.event.syncId != null) {
            zDeleteBySyncId = UpdatesManager.getManager().deleteBySyncId(2, action.event.syncId);
            EventDao.deleteEventBySyncId(this.a, action.event.syncId);
        } else {
            zDeleteBySyncId = false;
        }
        result.success(zDeleteBySyncId);
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onUpdate(EventAction action, ActionResult result) {
        Event event = action.event;
        result.success(UpdatesManager.getManager().save(UpdateBuilder.build(event, UpdatesManager.getManager().getBySyncId(2, event.syncId))));
    }
}
