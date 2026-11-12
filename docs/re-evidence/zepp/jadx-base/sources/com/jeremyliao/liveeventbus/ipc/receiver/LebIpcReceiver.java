package com.jeremyliao.liveeventbus.ipc.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.ipc.consts.IpcConst;
import com.jeremyliao.liveeventbus.ipc.core.ProcessorManager;

/* JADX INFO: loaded from: classes18.dex */
public class LebIpcReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (IpcConst.ACTION.equals(intent.getAction())) {
            try {
                String stringExtra = intent.getStringExtra(IpcConst.KEY);
                Object objCreateFrom = ProcessorManager.getManager().createFrom(intent);
                if (stringExtra == null || objCreateFrom == null) {
                    return;
                }
                LiveEventBus.get(stringExtra).post(objCreateFrom);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
