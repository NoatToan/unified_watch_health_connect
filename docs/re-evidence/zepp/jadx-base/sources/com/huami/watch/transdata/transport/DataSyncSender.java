package com.huami.watch.transdata.transport;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transdata.TLog;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;

/* JADX INFO: loaded from: classes16.dex */
public class DataSyncSender implements Transporter.DataListener, Transporter.ChannelListener, Transporter.ServiceConnectionListener {
    private int a;
    private Context b;
    private Transporter c;
    private Sender d;
    private TaskManager e;

    public interface Sender {
        void requestUserData(DataBundle dataBundle);

        void requestUserDataResult(DataBundle dataBundle);
    }

    public class a extends Task {
        public final /* synthetic */ DataBundle g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, DataBundle dataBundle) {
            super(runningStatus);
            this.g = dataBundle;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            DataSyncSender.this.d.requestUserData(this.g);
            return null;
        }
    }

    public class b extends Task {
        public final /* synthetic */ DataBundle g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task.RunningStatus runningStatus, DataBundle dataBundle) {
            super(runningStatus);
            this.g = dataBundle;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            DataSyncSender.this.d.requestUserDataResult(this.g);
            return null;
        }
    }

    public class c implements Transporter.DataSendResultCallback {
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (dataTransportResult.getResultCode() == 0) {
                TLog.data(this.b, "send data to ble successful");
                return;
            }
            TLog.data(this.b, "send data to ble failed ,code:" + dataTransportResult.getResultCode());
        }
    }

    public DataSyncSender(Context context, int i, Sender sender) {
        this.b = context;
        this.a = i;
        this.d = sender;
        b();
    }

    private void b() {
        this.e = new TaskManager("data_transporter_tasks");
        Transporter transporter = Transporter.get(this.b, String.valueOf(this.a));
        this.c = transporter;
        transporter.addDataListener(this);
        this.c.connectTransportService();
        this.c.addChannelListener(this);
        this.c.addServiceConnectionListener(this);
    }

    @Override // com.huami.watch.transport.Transporter.ChannelListener
    public void onChannelChanged(boolean z) {
        if (z) {
            return;
        }
        TLog.pro("transporter onChannelChanged :false");
    }

    @Override // com.huami.watch.transport.Transporter.DataListener
    public void onDataReceived(TransportDataItem transportDataItem) {
        TaskManager taskManager;
        Task bVar;
        String action = transportDataItem.getAction();
        DataBundle data = transportDataItem.getData();
        if (action == null && data == null) {
            return;
        }
        if (TextUtils.equals(action, Actions.ACTION_USER_RECEIVE_DATA)) {
            taskManager = this.e;
            bVar = new a(Task.RunningStatus.WORK_THREAD, data);
        } else {
            if (!TextUtils.equals(action, Actions.ACTION_USER_RECEIVE_DATA_RESULT)) {
                return;
            }
            taskManager = this.e;
            bVar = new b(Task.RunningStatus.WORK_THREAD, data);
        }
        taskManager.next(bVar).execute();
    }

    @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
    public void onServiceConnected(Bundle bundle) {
        TLog.pro("transporter onServiceConnected");
    }

    @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
    public void onServiceConnectionFailed(Transporter.ConnectionResult connectionResult) {
        TLog.pro("transporter onServiceConnectionFailed");
    }

    @Override // com.huami.watch.transport.Transporter.ServiceConnectionListener
    public void onServiceDisconnected(Transporter.ConnectionResult connectionResult) {
        TLog.pro("transporter onServiceDisconnected");
    }

    public void sendDataToBle(String str, String str2, DataBundle dataBundle) {
        Transporter transporter = this.c;
        if (transporter == null) {
            return;
        }
        transporter.send(str2, dataBundle, new c(str));
        TLog.data(str, "send data to ble ...");
    }
}
