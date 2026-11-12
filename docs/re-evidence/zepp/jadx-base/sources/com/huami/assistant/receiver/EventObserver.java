package com.huami.assistant.receiver;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EventObserver extends ContentObserver {
    private static final String b = "Observer-Event";
    private Context a;

    public EventObserver(Context context) {
        super(null);
        this.a = context;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, Uri uri) {
        Log.i(b, "Exchange Deleted Start...", new Object[0]);
        String[] strArrQueryDeletedEvents = EventDao.queryDeletedEvents(this.a);
        if (!ArraysUtil.isEmpty(strArrQueryDeletedEvents)) {
            ActionResult actionResultDeleteEvents = ExchangeCenter.deleteEvents(strArrQueryDeletedEvents);
            if (actionResultDeleteEvents.isSuccess()) {
                EventDao.deleteEventsBySyncIds(this.a, ((EventAction) actionResultDeleteEvents.action).syncIds);
            }
        }
        Log.i(b, "Exchange Deleted End!!", new Object[0]);
        Log.i(b, "Exchange Added Start...", new Object[0]);
        List<Event> listQueryAddedEvents = EventDao.queryAddedEvents(this.a);
        if (!ArraysUtil.isEmpty(listQueryAddedEvents)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (Event event : listQueryAddedEvents) {
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
                if (ExchangeCenter.addEvent(event).isSuccess()) {
                    EventDao.updateEventSynced(this.a, event.id);
                }
            }
        }
        Log.i(b, "Exchange Added End!!", new Object[0]);
    }
}
