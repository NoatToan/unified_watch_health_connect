package com.huawei.health.icommon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseSyncManager {
    private static final String TAG = "Step_SyncManager";
    private static ExtendHandler sExtendHandler = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.health.icommon.BaseSyncManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }, TAG);
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.health.icommon.BaseSyncManager.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            final int intExtra = intent.getIntExtra("refresh_type", 0);
            if (intExtra == 7) {
                BaseSyncManager.sExtendHandler.execute(new Runnable() { // from class: com.huawei.health.icommon.BaseSyncManager.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        BaseSyncManager.this.handleWorkerMessage(intExtra);
                    }
                });
            } else {
                LogUtil.j(BaseSyncManager.TAG, "not recognized type");
            }
        }
    };
    private Context mContext;

    protected abstract boolean handleWorkerMessage(int i);

    public BaseSyncManager(Context context) {
        this.mContext = null;
        if (context != null) {
            this.mContext = context;
        } else {
            this.mContext = BaseApplication.getContext();
        }
        LocalBroadcastManager.getInstance().registerReceiver(this.mBroadcastReceiver, new IntentFilter("DaemonService_LocalBroadcast"));
    }

    public static Executor getExecutor() {
        return sExtendHandler;
    }
}
