package com.huami.watch.transdata.transport;

import android.content.Context;
import com.huami.watch.transdata.DataService;
import com.huami.watch.transdata.DataTrans;
import com.huami.watch.transdata.TLog;
import com.huami.watch.transport.DataBundle;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DataSyncClient implements DataSyncSender.Sender {
    private static final String e = "DataSyncClient";
    private int a;
    private Context b;
    private DataService.ClientListener c = null;
    private DataSyncSender d;

    public DataSyncClient(Context context) {
        this.b = context;
        a();
    }

    private void a() {
        this.d = new DataSyncSender(this.b, this.a, this);
    }

    private void b(DataBundle dataBundle) {
        try {
            byte[] byteArray = dataBundle.getByteArray("data");
            if (byteArray == null) {
                return;
            }
            RequestData requestData = new RequestData((LinkedHashMap) dataBundle.getSerializable("header"), new String(byteArray, "UTF-8"));
            TLog.data(requestData.getSessionId(), "request user data");
            String sessionId = requestData.getSessionId();
            DataTrans data = this.c.getData(String.valueOf(sessionId), requestData.getDataType(), requestData.getRequestInfo());
            HashMap<String, String> mapAddPublicHeaders = data.addPublicHeaders(String.valueOf(sessionId));
            TLog.data(requestData.getSessionId(), "get data from " + requestData.getPkgName());
            DataBundle dataBundle2 = new DataBundle();
            dataBundle2.putByteArray("data", data.getData());
            dataBundle2.putSerializable(Actions.KEY_HEADERS, mapAddPublicHeaders);
            this.d.sendDataToBle(sessionId, Actions.ACTION_USER_SEND_DATA, dataBundle2);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }

    private void c(DataBundle dataBundle) {
        try {
            byte[] byteArray = dataBundle.getByteArray("data");
            if (byteArray == null) {
                return;
            }
            ResultData resultData = new ResultData((LinkedHashMap) dataBundle.getSerializable("header"), new String(byteArray, "UTF-8"));
            TLog.data(resultData.getSessionId(), "result user data");
            DataService.ClientListener clientListener = this.c;
            if (clientListener != null) {
                clientListener.onDataResult(String.valueOf(resultData.getSessionId()), resultData.getDataType(), resultData.getResultInfo());
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
    }

    private void d(String str) {
        DataBundle dataBundle = new DataBundle();
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("sessionId", jCurrentTimeMillis);
            dataBundle.putByteArray("data", jSONObject.toString().getBytes());
            this.d.sendDataToBle(String.valueOf(jCurrentTimeMillis), Actions.ACTION_TRIGGER, dataBundle);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void onDestory() {
    }

    public void registerListener(DataService.ClientListener clientListener) {
        TLog.pro("registerListener:" + this.b.getPackageName());
        this.c = clientListener;
    }

    @Override // com.huami.watch.transdata.transport.DataSyncSender.Sender
    public void requestUserData(DataBundle dataBundle) {
        b(dataBundle);
    }

    @Override // com.huami.watch.transdata.transport.DataSyncSender.Sender
    public void requestUserDataResult(DataBundle dataBundle) {
        c(dataBundle);
    }

    public void triggerSync(Map map) {
        d(this.b.getPackageName());
    }

    public void unRegisterListener() {
    }
}
