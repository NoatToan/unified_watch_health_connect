package com.huami.watch.transport.httpsupport.client;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.Utils;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.translogutils.DataParser;
import com.huami.watch.transport.httpsupport.translogutils.TransLogs;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class TransportManager implements WearHttpClient.OnCustomCommandListener, WearHttpClient.OnQueryCommandListener {
    private Context b;
    private OnCmdArrivalListener c;
    private OnDataArrivalListener d;
    private WearHttpClient a = null;
    private AtomicBoolean e = new AtomicBoolean(false);
    private TaskManager f = new TaskManager("file-manage");

    public interface OnCmdArrivalListener {
        void onCmdArrival(DataItem dataItem);
    }

    public interface OnDataArrivalListener {
        void onDataArrival(DataItem dataItem);
    }

    public class a extends WearHttpClient {
        public a(Context context) {
            super(context);
        }

        @Override // com.huami.watch.transport.httpsupport.client.WearHttpClient
        public void B(DataItem dataItem) {
            TransportManager.this.triggerPoorEnergy(dataItem);
        }

        @Override // com.huami.watch.transport.httpsupport.client.WearHttpClient
        public void q(String str) {
            super.q(str);
            DataItem dataItemFrom = DataItem.from(str);
            if (Command.isInternal(dataItemFrom.getAction())) {
                this.d.addActionAndExecute(dataItemFrom);
                return;
            }
            String extraValByKey = dataItemFrom.getExtraValByKey("d-path");
            if (!TextUtils.isEmpty(extraValByKey)) {
                TransportManager.this.d(extraValByKey, dataItemFrom);
            }
            if (TransportManager.this.d != null) {
                if (GlobalDefine.DEBUG_CLIENT) {
                    Log.i(GlobalDefine.TAG_CLIENT, "onDataArrival for : " + dataItemFrom.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "onDataArrival for : " + dataItemFrom.getIdentifier());
                TransportManager.this.d.onDataArrival(dataItemFrom);
                TransLogs.i(new DataParser(dataItemFrom, 2).getImportanceInfo());
            }
        }
    }

    public class b extends Task {
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task.RunningStatus runningStatus, String str) {
            super(runningStatus);
            this.g = str;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            new File(this.g).delete();
            return null;
        }
    }

    public TransportManager(Context context) {
        Objects.requireNonNull(context, "Context is NULL for transport manager.");
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        if (applicationContext == null) {
            this.b = context;
        }
        SolidLogger.withContext(context);
        e(context);
    }

    private boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, DataItem dataItem) {
        String fileToString = Utils.readFileToString(str);
        dataItem.removeExtraPairByKey("d-path");
        dataItem.setData(fileToString);
        this.f.next(new b(Task.RunningStatus.WORK_THREAD, str)).execute();
    }

    private void e(Context context) {
        if (this.a == null) {
            this.a = new a(context.getApplicationContext());
        }
        this.a.y(this);
        this.a.z(this);
    }

    private void f(DataItem dataItem) {
        if (this.e.get()) {
            dataItem.addFlags(16384);
        } else {
            dataItem.clearFlags(16384);
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, ".2 Send Req for " + dataItem.toShortString() + "...");
        if (c()) {
            dataItem.setFlags(dataItem.getFlags() | 1);
            if (this.a == null) {
                e(this.b);
            }
            if (this.a != null) {
                String owner = dataItem.getOwner();
                if (!TextUtils.isEmpty(owner)) {
                    this.a.p(owner, dataItem);
                    return;
                }
                if (GlobalDefine.DEBUG_CLIENT) {
                    Log.i(GlobalDefine.TAG_CLIENT, " pkg is null for sender...");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, " pkg is null for sender...");
            }
        }
    }

    public boolean doRemainsDataTrans() {
        return false;
    }

    @Override // com.huami.watch.transport.httpsupport.client.WearHttpClient.OnCustomCommandListener
    public void onCustomCommand(DataItem dataItem) {
        if (TextUtils.equals(dataItem.getAction(), Command.DATA_SYNC_TRIGGER)) {
            boolean zDoRemainsDataTrans = doRemainsDataTrans();
            Log.i("test_trans_log", "doRemainsDataTrans()..." + zDoRemainsDataTrans);
            if (zDoRemainsDataTrans) {
                return;
            }
            tellUploadResultForMe(true, null, null);
            return;
        }
        if (!TextUtils.equals(dataItem.getAction(), Command.CMD_ARRIVAL_TOKEN) || this.c == null) {
            return;
        }
        Log.i("wifi_trans", "trans---onCustomCommand--" + dataItem.toString());
        this.c.onCmdArrival(dataItem);
    }

    @Override // com.huami.watch.transport.httpsupport.client.WearHttpClient.OnQueryCommandListener
    public void onQueryCommand(DataItem dataItem) {
    }

    public final int query(String str) {
        if (!c()) {
            return -1;
        }
        try {
            return this.a.v(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final void sendAsync(DataItem dataItem) {
        f(dataItem);
    }

    public final void sendSync(DataItem dataItem) {
        f(dataItem);
    }

    public void setAsSerialMode(boolean z) {
        this.e.set(z);
    }

    public void setOnCmdArrivalListener(OnCmdArrivalListener onCmdArrivalListener) {
        this.c = onCmdArrivalListener;
    }

    public void setOnDataArrivalListener(OnDataArrivalListener onDataArrivalListener) {
        this.d = onDataArrivalListener;
    }

    public void setOnServiceStateChangeListener(OnServiceStateChangeListener onServiceStateChangeListener) {
        if (this.a == null) {
            e(this.b);
        }
        this.a.A(onServiceStateChangeListener);
    }

    public final void tellResponseInvalidFromCloud(DataItem dataItem) {
        if (dataItem == null || TextUtils.isEmpty(dataItem.getOwner())) {
            return;
        }
        String owner = dataItem.getOwner();
        if (GlobalDefine.DEBUG_CLIENT) {
            Log.i(GlobalDefine.TAG_CLIENT, "'" + owner + "' SAYS SERVER GIVE BACK BUT RESPONSE IS INVALID!");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "'" + owner + "' SAYS SERVER GIVE BACK BUT RESPONSE IS INVALID!");
    }

    public final void tellUploadResultForMe(boolean z, String str, String str2) {
        DataItem dataItemGenInternalSyncAction = GlobalDataSyncKicker.getInstance().genInternalSyncAction(this.b.getPackageName(), Command.DATA_SYNC_TELL_RESULT);
        dataItemGenInternalSyncAction.addExtraPair("time", str);
        dataItemGenInternalSyncAction.addExtraPair("data", str2);
        dataItemGenInternalSyncAction.addExtraPair("res", String.valueOf(z));
        dataItemGenInternalSyncAction.setState(5);
    }

    public void triggerPoorEnergy(DataItem dataItem) {
    }

    public final void triggerUploadManual(String str) {
        triggerUploadManual(this.b.getPackageName(), str);
    }

    public final void triggerUploadManual(String str, String str2) {
        try {
            GlobalDataSyncKicker.getInstance().genInternalEnumCollectAction(str, str2, Command.CMD_TRIGGER_REPORT_FROM_CLIENT).setOwner(this.b.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
