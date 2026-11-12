package com.huami.watch.companion.sync;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.huami.watch.companion.R;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class SyncManager {
    private static final String f = "Sync-Manager";
    private static SyncManager g;
    private boolean a;
    private DataBundle b;
    private boolean c;
    private boolean d;
    private Transporter.DataListener e = new a();

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            String action = transportDataItem.getAction();
            if (CompanionModule.ACTION_BACKUP_DATA.equals(action)) {
                SyncManager.this.b = transportDataItem.getData();
            } else if (CompanionModule.ACTION_BACKUP_FINISH.equals(action)) {
                SyncManager.this.c = true;
                SyncManager.this.d = transportDataItem.getData().getBoolean("Result");
            }
        }
    }

    public class b implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Transporter b;

        public class a implements Transporter.DataSendResultCallback {
            public a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                if (dataTransportResult.getResultCode() != 0) {
                    SyncManager.this.c = true;
                    SyncManager.this.d = false;
                }
            }
        }

        public b(Context context, Transporter transporter) {
            this.a = context;
            this.b = transporter;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() throws Exception {
            DoLooper.Result result = new DoLooper.Result();
            if (SyncManager.this.b != null) {
                String string = SyncManager.this.b.getString(CompanionModule.KEY_USER_SETTINGS);
                Log.d(SyncManager.f, "Backup UserSettings FromWatch : " + string, new Object[0]);
                boolean zSyncToCloud = SyncUserSettingsHelper.getHelper(this.a).syncToCloud(string);
                Log.d(SyncManager.f, "Backup UserSettings To Cloud : " + zSyncToCloud, new Object[0]);
                SyncManager.this.b = null;
                if (!zSyncToCloud) {
                    result.finish = true;
                    result.success = false;
                    return result;
                }
                this.b.send(CompanionModule.ACTION_BACKUP_APPS_START, new a());
            }
            Log.d(SyncManager.f, "BackupFromWatch Finish : " + SyncManager.this.c, new Object[0]);
            Log.d(SyncManager.f, "BackupFromWatch Success : " + SyncManager.this.d, new Object[0]);
            if (SyncManager.this.c) {
                result.finish = true;
                result.success = SyncManager.this.d;
            }
            return result;
        }
    }

    public static SyncManager getManager() {
        if (g == null) {
            g = new SyncManager();
        }
        return g;
    }

    public static void showSyncFailTip(Activity activity, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.setTitle(activity.getString(R.string.sync_failed_tip_title)).setMessage(str).setPositiveBtn(str2, onClickListener).setNegativeBtn(activity.getString(R.string.dialog_cancel), onClickListener2).show(activity, "SyncFailedTip");
    }

    public boolean backupFromWatch(Context context, Transporter transporter) {
        Log.d(f, "BackupFromWatch is Already Syncing : " + this.a, new Object[0]);
        if (this.a) {
            return false;
        }
        this.a = true;
        Log.d(f, "BackupFromWatch Start!!", new Object[0]);
        this.b = null;
        this.c = false;
        this.d = false;
        transporter.addDataListener(this.e);
        transporter.send(CompanionModule.ACTION_BACKUP_START);
        boolean zDoLoop = DoLooper.doLoop(new b(context, transporter), 1000, 15);
        transporter.removeDataListener(this.e);
        Log.d(f, "BackupFromWatch End : " + zDoLoop, new Object[0]);
        this.a = false;
        return zDoLoop;
    }
}
