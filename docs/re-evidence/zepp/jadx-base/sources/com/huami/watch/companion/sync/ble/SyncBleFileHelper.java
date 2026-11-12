package com.huami.watch.companion.sync.ble;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.sync.BaseSyncHelper;
import com.huami.watch.companion.sync.ble.SyncBleFileHelper;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class SyncBleFileHelper extends BaseSyncHelper {
    private static final String f = "Sync-BLE-File";
    private String e;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(DoLooper.Result result, DataTransportResult dataTransportResult) {
        result.finish = true;
        result.success = dataTransportResult.getResultCode() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result d(DoLooper.Result result) throws Exception {
        return result;
    }

    public static SyncBleFileHelper getHelper(Context context) {
        return (SyncBleFileHelper) BaseSyncHelper.getHelper(null, Transporter.get(context, "com.huami.watch.companion"), SyncBleFileHelper.class);
    }

    public SyncBleFileHelper file(String str) {
        this.e = str;
        return this;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        File file;
        byte[] bytesSafe;
        Log.d(f, "Sync File[" + this.e + "] To Watch...", new Object[0]);
        if (TextUtils.isEmpty(this.e) || (bytesSafe = FilesUtil.readBytesSafe((file = new File(this.e)))) == null) {
            return false;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("FileName", file.getName());
        dataBundle.putByteArray("Bytes", bytesSafe);
        final DoLooper.Result result = new DoLooper.Result();
        this.mTransporter.send(CompanionModule.ACTION_SYNC_FILE, dataBundle, new Transporter.DataSendResultCallback() { // from class: bj7
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                SyncBleFileHelper.c(result, dataTransportResult);
            }
        });
        DoLooper.doLoop(new DoLooper.Function() { // from class: cj7
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return SyncBleFileHelper.d(result);
            }
        }, 1000, 120);
        return result.success;
    }
}
