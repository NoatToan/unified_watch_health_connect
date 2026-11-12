package com.huami.assistant.dataexchange;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.assistant.dataexchange.WatchExchange;
import com.huami.assistant.dataexchange.actions.AlarmAction;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.assistant.dataexchange.actions.PinAction;
import com.huami.assistant.dataexchange.actions.UpdateAction;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.dataflow.exchange.BaseExchange;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.TransporterModules;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class WatchExchange extends BaseExchange implements IExchange {
    private static final String o = "Exchange-Assist";
    private static final String p = "com.huami.assistant";
    private static final String q = "com.huami.assistdummy";
    private static volatile WatchExchange r;
    private Transporter n;

    public static WatchExchange get() {
        if (r == null) {
            synchronized (WatchExchange.class) {
                if (r == null) {
                    r = new WatchExchange();
                }
            }
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Action action, DataTransportResult dataTransportResult) {
        Log.d(o, "Sync Notification: " + action.toStringShort() + ", Result: " + dataTransportResult, new Object[0]);
    }

    private ActionResult j(Transporter transporter, @NonNull final Action action) {
        ActionResult actionResult = new ActionResult(action);
        transporter.send(TransportUri.ACTION_ADD, action.toWatchData(), new Transporter.DataSendResultCallback() { // from class: le8
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                WatchExchange.i(action, dataTransportResult);
            }
        });
        actionResult.success();
        return actionResult;
    }

    @Override // com.huami.watch.dataflow.exchange.BaseExchange
    public Action dataToAction(DataBundle itemData, Action baseAction) {
        Action pinAction;
        String str = baseAction.target;
        str.hashCode();
        switch (str) {
            case "com.huami.assistant.Pin":
                pinAction = new PinAction(itemData);
                break;
            case "com.huami.assistant.Alarm":
                pinAction = new AlarmAction(itemData);
                break;
            case "com.huami.assistant.Event":
                pinAction = new EventAction(itemData);
                break;
            case "com.huami.assistant.Update":
                pinAction = new UpdateAction(itemData);
                break;
            default:
                return null;
        }
        return pinAction;
    }

    public void init(Context context, BaseExchange.Callback<Action, ActionResult> syncCallback) {
        init(context, syncCallback, true);
    }

    @Override // com.huami.watch.dataflow.exchange.BaseExchange, com.huami.assistant.dataexchange.IExchange
    public ActionResult sync(@NonNull Action action) {
        action.timestamp = System.currentTimeMillis();
        Log.d(o, "Sync : " + action, new Object[0]);
        String str = action.target;
        str.hashCode();
        return !str.equals(Actions.NOTIFICATION) ? syncToWatch(action) : j(this.n, action);
    }

    public void init(Context context, BaseExchange.Callback<Action, ActionResult> syncCallback, boolean isBuildTypeRelease) {
        String str = isBuildTypeRelease ? "com.huami.assistant" : q;
        Log.d(o, "Init Transporter : " + str, new Object[0]);
        init(context, syncCallback, Transporter.get(context, str));
    }

    @Override // com.huami.watch.dataflow.exchange.BaseExchange
    public void init(Context context, BaseExchange.Callback<Action, ActionResult> syncCallback, Transporter transporter) {
        super.init(context, syncCallback, transporter);
        Transporter transporter2 = Transporter.get(context, TransporterModules.MODULE_NOTIFICAION);
        this.n = transporter2;
        transporter2.connectTransportService();
    }
}
