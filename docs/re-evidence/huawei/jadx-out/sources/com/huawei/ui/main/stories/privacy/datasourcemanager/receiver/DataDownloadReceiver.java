package com.huawei.ui.main.stories.privacy.datasourcemanager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataDownloadListener;

/* JADX INFO: loaded from: classes19.dex */
public class DataDownloadReceiver extends BroadcastReceiver {
    private DataDownloadListener d;

    public DataDownloadReceiver(DataDownloadListener dataDownloadListener) {
        this.d = dataDownloadListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            LogUtil.e("DataDownloadReceiver", "action is null or is empty");
            return;
        }
        if (!"com.huawei.hihealth.action_sync".equals(action)) {
            LogUtil.e("DataDownloadReceiver", "action is not action_sync");
            return;
        }
        try {
            this.d.dataDownloadListener(intent.getIntExtra("com.huawei.hihealth.action_sync_status", -1));
        } catch (Exception unused) {
            LogUtil.e("DataDownloadReceiver", "getDataFromIntent Exception");
        }
    }
}
