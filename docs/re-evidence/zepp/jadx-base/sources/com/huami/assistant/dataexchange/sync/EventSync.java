package com.huami.assistant.dataexchange.sync;

import android.content.Context;
import android.util.Pair;
import com.google.gson.Gson;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.ISync;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EventSync implements ISync<EventAction> {
    private static final String b = "Assist-EventSync";
    private Context a;

    public EventSync(Context context) {
        this.a = context;
    }

    public static boolean syncAdded(Context context) {
        ActionResult actionResultQueryAddedEvents = ExchangeCenter.queryAddedEvents();
        boolean zIsSuccess = actionResultQueryAddedEvents.isSuccess();
        if (actionResultQueryAddedEvents.isSuccess()) {
            List<Event> events = UpdateParser.toEvents(actionResultQueryAddedEvents.resultData);
            if (events == null) {
                return false;
            }
            for (Event event : events) {
                String str = event.syncId;
                if (str == null) {
                    Log.d(b, "Event SyncId Null: " + event + ", Continue...", new Object[0]);
                } else {
                    EventDao.deleteEventBySyncId(context, str);
                    EventDao.insertEvent(context, event, true);
                }
            }
        }
        return zIsSuccess;
    }

    public static boolean syncAll(Context context) {
        ActionResult actionResultQueryAllEvents = ExchangeCenter.queryAllEvents();
        boolean zIsSuccess = actionResultQueryAllEvents.isSuccess();
        if (actionResultQueryAllEvents.isSuccess()) {
            List<Event> events = UpdateParser.toEvents(actionResultQueryAllEvents.resultData);
            if (events == null) {
                return false;
            }
            EventDao.deleteAllEvents(context);
            for (Event event : events) {
                if (event.syncId == null) {
                    Log.d(b, "Event SyncId Null: " + event + ", Continue...", new Object[0]);
                } else {
                    EventDao.insertEvent(context, event, true);
                }
            }
        }
        return zIsSuccess;
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onUpdate(EventAction action, ActionResult result) {
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onAdd(EventAction action, ActionResult result) {
        String str = action.event.syncId;
        if (str != null) {
            EventDao.deleteEventBySyncId(this.a, str);
        }
        result.success(EventDao.insertEvent(this.a, action.event, true));
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onDelete(EventAction action, ActionResult result) {
        boolean zDeleteEventBySyncId;
        String[] strArr = action.syncIds;
        if (strArr != null) {
            zDeleteEventBySyncId = EventDao.deleteEventsBySyncIds(this.a, strArr);
        } else {
            String str = action.event.syncId;
            zDeleteEventBySyncId = str != null ? EventDao.deleteEventBySyncId(this.a, str) : false;
        }
        result.success(zDeleteEventBySyncId);
    }

    @Override // com.huami.watch.dataflow.exchange.ISync
    public void onQuery(EventAction action, ActionResult result) throws Throwable {
        String[] strArr = action.projection;
        Pair<String, String[]> pairSelectionAndArgs = action.selectionAndArgs();
        List<Event> listQueryEvents = EventDao.queryEvents(this.a, strArr, (String) pairSelectionAndArgs.first, (String[]) pairSelectionAndArgs.second, true);
        if (listQueryEvents == null) {
            Log.w(b, "Query Events Fail!!", new Object[0]);
            result.fail();
            return;
        }
        ArrayList arrayList = new ArrayList(listQueryEvents.size());
        if (!ArraysUtil.isEmpty(listQueryEvents)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (Event event : listQueryEvents) {
                if (event.syncId == null) {
                    long j = 1 + jCurrentTimeMillis;
                    String strValueOf = String.valueOf(jCurrentTimeMillis);
                    event.syncId = strValueOf;
                    if (EventDao.updateEventSyncId(this.a, event.id, strValueOf)) {
                        jCurrentTimeMillis = j;
                    } else {
                        Log.d(b, "Update Event SyncId Fail, Continue...", new Object[0]);
                        jCurrentTimeMillis = j;
                    }
                }
                arrayList.add(event);
            }
        }
        result.resultData = new Gson().toJson(arrayList);
        result.success();
    }
}
