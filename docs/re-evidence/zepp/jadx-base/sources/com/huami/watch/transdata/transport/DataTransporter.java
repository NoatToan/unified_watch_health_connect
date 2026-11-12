package com.huami.watch.transdata.transport;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transdata.DataService;
import com.huami.watch.transdata.DataTrans;
import com.huami.watch.transdata.IDataListener;
import com.huami.watch.transdata.RegisterNewListener;
import com.huami.watch.transdata.TLog;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class DataTransporter implements Transporter.DataListener, Transporter.ChannelListener, Transporter.ServiceConnectionListener, RegisterNewListener {
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 15;
    private static final String j = "com.huami.watch.http-support.userdata_trans";
    private DataService a;
    private int b = 0;
    private long c = 0;
    private RequestData d = null;
    private Transporter e;
    private TaskManager f;

    public class a implements Transporter.DataSendResultCallback {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2) {
            this.c = str;
            this.b = str2;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (dataTransportResult.getResultCode() == 0) {
                TLog.data(this.c, "send data to ble successful," + this.b);
                return;
            }
            TLog.data(this.c, "send data to ble failed ,code:" + dataTransportResult.getResultCode() + ",client:" + this.b);
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
            DataTransporter.this.f(this.g);
            return null;
        }
    }

    public class c extends Task {
        public final /* synthetic */ DataBundle g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task.RunningStatus runningStatus, DataBundle dataBundle) {
            super(runningStatus);
            this.g = dataBundle;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            DataTransporter.this.g(this.g);
            return null;
        }
    }

    public DataTransporter(DataService dataService) {
        this.a = dataService;
        d();
    }

    private void c() {
        this.b = 0;
        this.d = null;
    }

    private void d() {
        this.f = new TaskManager("data_transporter_tasks");
        Transporter transporter = Transporter.get(this.a, j);
        this.e = transporter;
        transporter.addDataListener(this);
        this.e.addChannelListener(this);
        this.e.addServiceConnectionListener(this);
        this.e.connectTransportService();
    }

    private void e(RequestData requestData, IDataListener iDataListener) {
        try {
            String sessionId = requestData.getSessionId();
            DataTrans data = iDataListener.getData(String.valueOf(sessionId), requestData.getDataType(), requestData.getRequestInfo());
            data.addPublicHeaders(String.valueOf(sessionId));
            TLog.data(requestData.getSessionId(), "get data from " + requestData.getPkgName());
            LinkedHashMap sendHeaders = data.getSendHeaders();
            DataBundle dataBundle = new DataBundle();
            dataBundle.putByteArray("data", data.getData());
            dataBundle.putSerializable(Actions.KEY_HEADERS, sendHeaders);
            StringBuilder sb = new StringBuilder();
            sb.append("ACTION_USER_SEND_DATA---Header:");
            sb.append(sendHeaders.toString());
            sb.append(" ,data_length:");
            sb.append(data.getData() == null ? 0 : data.getData().length);
            TLog.data(sessionId, sb.toString());
            h(sessionId, Actions.ACTION_USER_SEND_DATA, dataBundle, requestData.getPkgName());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(DataBundle dataBundle) {
        c();
        try {
            byte[] byteArray = dataBundle.getByteArray("data");
            if (byteArray == null) {
                return;
            }
            RequestData requestData = new RequestData((HashMap) dataBundle.getSerializable(Actions.KEY_HEADERS), new String(byteArray, "UTF-8"));
            String dataType = requestData.getDataType();
            if (TextUtils.equals(dataType, DataTransHelper.TYPE_TRIGGER)) {
                TLog.data(requestData.getSessionId(), "---TRIGGER FROM ASSIST---");
                this.a.sendBroadcast(new Intent(DataTransHelper.TRIGGER_BROADCAST_ACTION));
                return;
            }
            TLog.data(requestData.getSessionId(), "request user data:" + dataType + ":::" + requestData.getPkgName());
            IDataListener clientForPkg = this.a.getClientForPkg(requestData.getPkgName());
            if (clientForPkg != null) {
                e(requestData, clientForPkg);
                return;
            }
            TLog.data(requestData.getSessionId(), dataType + ": no client ...and save ...");
            this.d = requestData;
            this.b = 1;
            this.c = System.currentTimeMillis() / 1000;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(DataBundle dataBundle) {
        try {
            byte[] byteArray = dataBundle.getByteArray("data");
            if (byteArray == null) {
                return;
            }
            ResultData resultData = new ResultData((HashMap) dataBundle.getSerializable(Actions.KEY_HEADERS), new String(byteArray, "UTF-8"));
            TLog.data(resultData.getSessionId(), "result user data," + resultData.getPkgName());
            IDataListener clientForPkg = this.a.getClientForPkg(resultData.getPkgName());
            if (clientForPkg != null) {
                try {
                    clientForPkg.onDataResult(String.valueOf(resultData.getSessionId()), resultData.getDataType(), resultData.getResultInfo());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            this.b = 0;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }

    private void h(String str, String str2, DataBundle dataBundle, String str3) {
        Transporter transporter = this.e;
        if (transporter == null) {
            return;
        }
        transporter.send(str2, dataBundle, new a(str, str3));
        TLog.data(str, "send data to ble ..., client:" + str3);
    }

    @Override // com.huami.watch.transport.Transporter.ChannelListener
    public void onChannelChanged(boolean z) {
        TLog.pro("transporter onChannelChanged :" + z);
    }

    @Override // com.huami.watch.transport.Transporter.DataListener
    public void onDataReceived(TransportDataItem transportDataItem) {
        TaskManager taskManager;
        Task cVar;
        String action = transportDataItem.getAction();
        DataBundle data = transportDataItem.getData();
        if (action == null && data == null) {
            return;
        }
        if (TextUtils.equals(action, Actions.ACTION_USER_RECEIVE_DATA)) {
            taskManager = this.f;
            cVar = new b(Task.RunningStatus.WORK_THREAD, data);
        } else {
            if (!TextUtils.equals(action, Actions.ACTION_USER_RECEIVE_DATA_RESULT)) {
                return;
            }
            taskManager = this.f;
            cVar = new c(Task.RunningStatus.WORK_THREAD, data);
        }
        taskManager.next(cVar).execute();
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

    public void reRequestUserData() {
        if (this.b != 1) {
            return;
        }
        if ((System.currentTimeMillis() / 1000) - this.c > 15) {
            c();
            return;
        }
        RequestData requestData = this.d;
        if (requestData == null) {
            c();
            return;
        }
        IDataListener clientForPkg = this.a.getClientForPkg(requestData.getPkgName());
        if (clientForPkg != null) {
            TLog.data(requestData.getSessionId(), requestData.getDataType() + "--- send again ...");
            e(requestData, clientForPkg);
            c();
        }
    }

    @Override // com.huami.watch.transdata.RegisterNewListener
    public void registerNew(String str) {
        reRequestUserData();
    }

    public void sendTrigger(String str) {
        DataBundle dataBundle = new DataBundle();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sessionId", String.valueOf(jCurrentTimeMillis));
        dataBundle.putSerializable(Actions.KEY_HEADERS, linkedHashMap);
        TLog.data(String.valueOf(jCurrentTimeMillis), "Trigger:" + str);
        h(String.valueOf(jCurrentTimeMillis), Actions.ACTION_TRIGGER, dataBundle, str);
    }
}
