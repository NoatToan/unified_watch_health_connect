package com.huawei.health.manager;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class AccountSyncService extends Service {
    private SyncAdapter e = null;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ReleaseLogUtil.d("R_AccountSyncService", "AccountSyncService onCreate");
        if ("OPPO".equalsIgnoreCase(Build.BRAND) || "OnePlus".equalsIgnoreCase(Build.BRAND)) {
            ReleaseLogUtil.d("R_AccountSyncService", "Skip AccountSyncService on ColorOS devices");
            return;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new SyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        SyncAdapter syncAdapter = this.e;
        if (syncAdapter == null) {
            return null;
        }
        return syncAdapter.getSyncAdapterBinder();
    }

    public static class SyncAdapter extends AbstractThreadedSyncAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f8015b;

        public SyncAdapter(Context context, boolean z) {
            super(context, z);
            this.f8015b = context.getApplicationContext();
        }

        @Override // android.content.AbstractThreadedSyncAdapter
        public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
            ReleaseLogUtil.d("R_AccountSyncService", "AccountSyncService onPerformSync: " + System.currentTimeMillis(), "processName:", ProcessUtil.c());
            a();
        }

        private void a() {
            try {
                if (this.f8015b == null) {
                    ReleaseLogUtil.e("R_AccountSyncService", "startService mContext == null");
                    return;
                }
                Intent intent = new Intent(this.f8015b, (Class<?>) DaemonService.class);
                intent.putExtra("START_SOURCE_KEY", "account_sync");
                intent.putExtra("START_SERVICE_TIME", System.currentTimeMillis());
                intent.setPackage(this.f8015b.getPackageName());
                this.f8015b.startService(intent);
                ReleaseLogUtil.d("R_AccountSyncService", "startService success");
            } catch (Exception e) {
                ReleaseLogUtil.a("R_AccountSyncService", "startService exception:", ExceptionUtils.c(e));
            }
        }
    }
}
