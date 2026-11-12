package com.huami.watch.hmwatchmanager.bt_connect;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.huami.watch.datatrans.CMyTransObj;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.tekartik.sqflite.Constant;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class BGService_msg extends Service implements DataTransactor.DataTransactorCallback {
    public static boolean bSendflag = false;
    public static Context mService;
    private final String a = "TransactorService";
    private String b = "a1dc19e2-17a4-0797-9362-68a0dd4bfb61";
    private DataTransactor c;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onChannelAvailable(boolean z) {
        bSendflag = z;
        CMyTransObj cMyTransObjPacking = DataPackingManager.packing(DataPackingManager.ACTION_REQUEST_STATUS, null, null);
        DataTransactor dataTransactor = this.c;
        if (dataTransactor != null) {
            dataTransactor.send(cMyTransObjPacking);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.c == null) {
            DataTransactor dataTransactor = new DataTransactor(this, this, this.b);
            this.c = dataTransactor;
            dataTransactor.start();
        }
        mService = this;
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) {
        CMyTransObj cMyTransObj = (CMyTransObj) obj;
        ArrivedDataUnpackingManager.unpacking(this, cMyTransObj.mUrl, cMyTransObj.mBundle);
    }

    @Override // android.app.Service
    public void onDestroy() {
        DataTransactor dataTransactor = this.c;
        if (dataTransactor != null) {
            dataTransactor.stop();
            this.c = null;
        }
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onRecvFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        String action = intent.getAction();
        Log.d("TransactorService", "FLAG : " + bSendflag + " " + action);
        if (!bSendflag || action == null) {
            return 1;
        }
        CMyTransObj cMyTransObjPacking = DataPackingManager.packing(action, intent.getStringExtra("url"), intent.getBundleExtra("bd"));
        DataTransactor dataTransactor = this.c;
        if (dataTransactor != null && cMyTransObjPacking != null) {
            dataTransactor.send(cMyTransObjPacking);
        }
        return 1;
    }

    public void queryWatchApp() {
        Bundle bundle = new Bundle();
        bundle.putString(Constant.h, "query");
        this.c.send(DataPackingManager.packing(DataPackingManager.ACTION_HUAMI_DATASEND, "android.intent.action.APPReceiver", bundle));
    }
}
