package com.huami.watch.companion.sync;

import android.content.Context;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class SyncUnbindHelper extends BaseSyncHelper {
    private static final String e = "SyncHelper-Unbind";

    public class a implements Transporter.DataSendResultCallback {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (dataTransportResult.getResultCode() != 0) {
                Log.w(SyncUnbindHelper.e, "Sync Unbind to Watch Fail!!", new Object[0]);
                SyncUnbindHelper syncUnbindHelper = SyncUnbindHelper.this;
                syncUnbindHelper.a = false;
                syncUnbindHelper.b = false;
            }
        }
    }

    public static BaseSyncHelper getHelper(Context context, Transporter transporter) {
        return BaseSyncHelper.getHelper(context, transporter, SyncUnbindHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public void onDataReceived(String str, DataBundle dataBundle) {
        if (CompanionModule.ACTION_UNBIND.equals(str)) {
            this.a = false;
            this.b = true;
        }
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        SyncUtil.syncUnbindToWatch(this.mTransporter, new a());
        boolean zDoSync = doSync(500, 15);
        if (zDoSync) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return zDoSync;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return e;
    }
}
