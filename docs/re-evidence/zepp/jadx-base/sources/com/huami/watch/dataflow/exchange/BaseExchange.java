package com.huami.watch.dataflow.exchange;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseExchange {
    private static final String g = "Exchange-Base";
    private static final String h = "com.huami.assistant";
    private static final String i = "com.huami.assistant.exchange.Sync";
    private static final String j = "com.huami.assistant.exchange.Feedback";
    private static final String k = "com.huami.watch.exchange";
    private static final String l = "com.huami.watch.exchange.Sync";
    private static final String m = "com.huami.watch.exchange.Feedback";
    private Callback<Action, ActionResult> a;
    private Handler d;
    private Transporter e;
    private Map<String, ISync> b = new ConcurrentHashMap();
    private Map<Long, ActionResult> c = new ConcurrentHashMap();
    private Transporter.DataListener f = new a();

    public interface Callback<T1, T2> {
        void accept(@NonNull T1 t1, T2 t2) throws Exception;
    }

    public class a implements Transporter.DataListener {

        /* JADX INFO: renamed from: com.huami.watch.dataflow.exchange.BaseExchange$a$a, reason: collision with other inner class name */
        public class RunnableC0666a implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ DataBundle b;

            public RunnableC0666a(String str, DataBundle dataBundle) {
                this.a = str;
                this.b = dataBundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseExchange.this.e(this.a, this.b);
            }
        }

        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            BaseExchange.this.d.post(new RunnableC0666a(transportDataItem.getAction(), transportDataItem.getData()));
        }
    }

    public class b implements Transporter.DataSendResultCallback {
        public final /* synthetic */ Action a;

        public b(Action action) {
            this.a = action;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            Log.d(BaseExchange.g, "Sync: " + this.a.toStringShort() + ", Result: " + dataTransportResult, new Object[0]);
        }
    }

    public class c implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ Action a;

        public c(Action action) {
            this.a = action;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() {
            DoLooper.Result result = new DoLooper.Result();
            ActionResult actionResult = (ActionResult) BaseExchange.this.c.get(Long.valueOf(this.a.timestamp));
            if (actionResult != null) {
                result.finish = true;
                result.success = actionResult.isSuccess();
            }
            return result;
        }
    }

    public class d implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ ActionResult a;

        public d(ActionResult actionResult) {
            this.a = actionResult;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() {
            DoLooper.Result result = new DoLooper.Result();
            result.finish = this.a.isFinish();
            return result;
        }
    }

    private void d(@NonNull ActionResult actionResult) {
        Log.d(g, "Feedback: " + actionResult, new Object[0]);
        this.e.send(j, actionResult.toWatchData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    public void e(String str, DataBundle dataBundle) {
        Action action = new Action(dataBundle);
        Action actionDataToAction = dataToAction(dataBundle, action);
        byte b2 = 0;
        Log.d(g, "OnDataReceived: " + str + ", " + dataBundle + ", Action: " + action, new Object[0]);
        if (str == null || actionDataToAction == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1684868235:
                if (!str.equals(j)) {
                    b2 = -1;
                }
                break;
            case -638841434:
                if (!str.equals(m)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1532271243:
                if (!str.equals(i)) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1936487740:
                if (!str.equals(l)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                f(new ActionResult(dataBundle, actionDataToAction));
                break;
            case 2:
            case 3:
                g(actionDataToAction);
                break;
        }
    }

    private void f(ActionResult actionResult) {
        Log.d(g, "OnFeedback: " + actionResult, new Object[0]);
        this.c.put(Long.valueOf(actionResult.action.timestamp), actionResult);
        Log.d(g, this.c + ", " + this.c.size(), new Object[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void g(Action action) {
        Log.d(g, "OnSync: " + action, new Object[0]);
        ISync iSync = this.b.get(action.target);
        if (iSync == null) {
            Log.d(g, "No Sync for <" + action.target + ">, Abort!!", new Object[0]);
            return;
        }
        ActionResult actionResult = new ActionResult(action);
        try {
            String str = action.action;
            byte b2 = -1;
            switch (str.hashCode()) {
                case -1754979095:
                    if (str.equals("Update")) {
                        b2 = 2;
                    }
                    break;
                case 65665:
                    if (str.equals("Add")) {
                        b2 = 0;
                    }
                    break;
                case 78391464:
                    if (str.equals(Action.QUERY)) {
                        b2 = 3;
                    }
                    break;
                case 2043376075:
                    if (str.equals("Delete")) {
                        b2 = 1;
                    }
                    break;
            }
            if (b2 == 0) {
                iSync.onAdd(action, actionResult);
            } else if (b2 == 1) {
                iSync.onDelete(action, actionResult);
            } else if (b2 == 2) {
                iSync.onUpdate(action, actionResult);
            } else if (b2 == 3) {
                iSync.onQuery(action, actionResult);
            }
        } catch (Exception e) {
            Log.d(g, "OnSyncErr " + action.toStringShort(), e);
            actionResult.fail();
        }
        if (!actionResult.isFinish()) {
            DoLooper.doLoop(new d(actionResult), 100, 5);
        }
        if (!actionResult.isFinish()) {
            actionResult.fail(-12);
        }
        d(actionResult);
        Callback<Action, ActionResult> callback = this.a;
        if (callback != null) {
            try {
                callback.accept(action, actionResult);
            } catch (Exception e2) {
                Log.e(g, "OnSyncCallbackErr", e2, new Object[0]);
            }
        }
    }

    public void addSync(String str, ISync<? extends Action> iSync) {
        this.b.put(str, iSync);
    }

    @Nullable
    public abstract Action dataToAction(DataBundle dataBundle, Action action);

    public void init(Context context, Callback<Action, ActionResult> callback, Transporter transporter) {
        this.a = callback;
        this.e = transporter;
        transporter.addDataListener(this.f);
        this.e.connectTransportService();
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    public ActionResult sync(@NonNull Action action) {
        action.timestamp = System.currentTimeMillis();
        Log.d(g, "Sync: " + action, new Object[0]);
        return syncToWatch(action);
    }

    public ActionResult syncToWatch(@NonNull Action action) {
        this.e.send(i, action.toWatchData(), new b(action));
        DoLooper.doLoop(new c(action), 100, 5);
        ActionResult actionResultRemove = this.c.remove(Long.valueOf(action.timestamp));
        if (actionResultRemove == null) {
            actionResultRemove = new ActionResult(action).fail(-11);
        }
        Log.d(g, "Sync: " + action.toStringShort() + "\n\t\tResult: " + actionResultRemove.toStringShort(), new Object[0]);
        return actionResultRemove;
    }
}
