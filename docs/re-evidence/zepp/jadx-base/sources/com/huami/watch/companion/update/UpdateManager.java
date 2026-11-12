package com.huami.watch.companion.update;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.api.AppUpgradeAPI;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.util.NetworkTip;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.watch.util.Rx;
import com.huami.watch.util.StorageUtil;
import com.xiaomi.market.sdk.UpdateResponse;
import com.xiaomi.market.sdk.XiaomiUpdateAgent;
import com.xiaomi.market.sdk.XiaomiUpdateListener;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.lang.ref.WeakReference;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateManager {
    private static final String k = "UpdateManager";
    private static final int l = 5000;
    private static UpdateManager m = new UpdateManager();
    private AlertDialogFragment a;
    private DownloadManager f;
    private long g;
    private Context h;
    private boolean b = false;
    private boolean d = false;
    private String e = "";
    private WeakReference<Activity> i = null;
    private Runnable j = new c();
    private Handler c = new Handler();

    public static class RedPointEvent {
    }

    public class a implements XiaomiUpdateListener {
        public final /* synthetic */ com.huami.watch.hmwatchmanager.view.AlertDialogFragment a;
        public final /* synthetic */ WeakReference b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: renamed from: com.huami.watch.companion.update.UpdateManager$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0661a implements View.OnClickListener {
            public final /* synthetic */ com.huami.watch.hmwatchmanager.view.AlertDialogFragment a;

            public ViewOnClickListenerC0661a(com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment) {
                this.a = alertDialogFragment;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.a.dismiss();
            }
        }

        public a(com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment, WeakReference weakReference, boolean z, boolean z2) {
            this.a = alertDialogFragment;
            this.b = weakReference;
            this.c = z;
            this.d = z2;
        }

        @Override // com.xiaomi.market.sdk.XiaomiUpdateListener
        public void onUpdateReturned(int i, UpdateResponse updateResponse) {
            com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment = this.a;
            if (alertDialogFragment != null) {
                try {
                    alertDialogFragment.dismissAllowingStateLoss();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Activity activity = (Activity) this.b.get();
            if (activity != null && activity.isFinishing()) {
                Log.w(UpdateManager.k, "Activity no longer exists!!", new Object[0]);
                return;
            }
            Log.d(UpdateManager.k, "UpdateStatus : " + i + ", UpdateInfo : " + updateResponse.versionName + ", " + updateResponse.updateLog, new Object[0]);
            if (i != 0) {
                if (i == 1) {
                    if (this.d) {
                        Toast.makeText(activity, activity.getString(R.string.update_up_to_date), 0).show();
                    }
                    UpdateManager.this.d = false;
                    return;
                }
                if (i == 2) {
                    if (this.d) {
                        Toast.makeText(activity, activity.getString(R.string.update_wifi_unavailable), 0).show();
                        return;
                    }
                    return;
                } else {
                    if (i == 3 && this.d) {
                        com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragmentNewInstance = com.huami.watch.hmwatchmanager.view.AlertDialogFragment.newInstance(1);
                        alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.update_net_error));
                        alertDialogFragmentNewInstance.setNeutral(activity.getString(R.string.btn_known), new ViewOnClickListenerC0661a(alertDialogFragmentNewInstance));
                        try {
                            alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "updateDialog");
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
            }
            int versionCode = AppUtil.getVersionCode(activity);
            if (updateResponse.versionCode > versionCode) {
                UpdateManager.this.d = true;
            }
            if (this.c) {
                Log.d(UpdateManager.k, "Force Update : " + updateResponse.path, new Object[0]);
                UpdateManager.this.e = updateResponse.path;
                UpdateManager.this.E(updateResponse, true);
                return;
            }
            long lastUpgradeCheckTime = Box.getLastUpgradeCheckTime();
            if ((updateResponse.versionCode <= versionCode || lastUpgradeCheckTime / 86400000 == System.currentTimeMillis() / 86400000) && !this.d) {
                return;
            }
            Log.d(UpdateManager.k, "Normal Update : " + updateResponse.path, new Object[0]);
            UpdateManager.this.e = updateResponse.path;
            UpdateManager.this.E(updateResponse, false);
        }
    }

    public class b extends BroadcastReceiver {
        public final /* synthetic */ long a;

        public b(long j) {
            this.a = j;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            Log.d(UpdateManager.k, "DownloadReceive : " + intent, new Object[0]);
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                if (longExtra == -1 || longExtra != this.a) {
                    return;
                }
                Box.putLastDownloadId(-1L);
                UpdateManager.this.b = false;
                UpdateManager.this.c.removeCallbacks(UpdateManager.this.j);
                UpdateManager.F(context, this.a);
                context.unregisterReceiver(this);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterByStatus(31);
            Cursor cursor = null;
            try {
                try {
                    Cursor cursorQuery = UpdateManager.this.f.query(query);
                    while (true) {
                        if (cursorQuery != null && cursorQuery.moveToNext()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                            if (Long.toString(UpdateManager.this.g).equals(string)) {
                                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                                Log.d(UpdateManager.k, string + " download status : " + i, new Object[0]);
                                z = true;
                                if (i != 1) {
                                    if (i == 2) {
                                        Log.d(UpdateManager.k, string + " Still downloading, recheck later : 5" + SOAP.XMLNS, new Object[0]);
                                        UpdateManager.this.c.postDelayed(this, 5000L);
                                        break;
                                    }
                                    if (i != 4) {
                                        if (i != 8 && i != 16) {
                                            break;
                                        }
                                        Log.d(UpdateManager.k, string + " Download finished, reset download state", new Object[0]);
                                        UpdateManager.this.b = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            cursor.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                Log.e(UpdateManager.k, "QueryDownloadingStateErr", e3, new Object[0]);
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                z = false;
            }
            if (z || !UpdateManager.this.b) {
                return;
            }
            Log.w(UpdateManager.k, "Download cancelled, reset download state!!", new Object[0]);
            UpdateManager.this.b = false;
            UpdateManager updateManager = UpdateManager.this;
            updateManager.w(updateManager.h);
        }
    }

    private UpdateManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Context context, DialogInterface dialogInterface, int i) {
        u(context);
        Analytics.event(context, AnalyticsEvents.EVENT_UPGRADE_WITHOUT_WIFI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(boolean z, final Context context, DialogInterface dialogInterface, int i) {
        Activity activityX = x();
        if (activityX == null) {
            return;
        }
        if (z) {
            Analytics.event(context, AnalyticsEvents.EVENT_FORCE_UPGRADE_CONFIRMED);
        } else {
            Analytics.event(context, AnalyticsEvents.EVENT_UPGRADE_CONFIRMED);
        }
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        if (!NetworkUtil.isOnline(context)) {
            NetworkTip.checkIsOffline((Activity) context);
        } else if (networkInfo != null && networkInfo.isConnected()) {
            u(context);
        } else {
            Log.d(k, "No Wifi, Show Dialog!!", new Object[0]);
            AlertDialog.setMessage(context.getString(R.string.update_net_no_wifi)).setPositiveBtn(context.getString(R.string.update_keep_update_no_wifi), new DialogInterface.OnClickListener() { // from class: f38
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i2) {
                    this.a.A(context, dialogInterface2, i2);
                }
            }).setNegativeBtn(context.getString(R.string.btn_cancel), new DialogInterface.OnClickListener() { // from class: d38
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i2) {
                    Analytics.event(context, AnalyticsEvents.EVENT_CANCEL_UPGRADE_WITHOUT_WIFI, 1);
                }
            }).show(activityX, "UpdateNoWifiDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Context context, DialogInterface dialogInterface, int i) {
        Analytics.event(context, AnalyticsEvents.EVENT_UPGRADE_LATER, 1);
        Box.putLastUpgradeCheckTime(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(UpdateResponse updateResponse, final boolean z) {
        AlertDialogFragment alertDialogFragment;
        if (z && (alertDialogFragment = this.a) != null && "forceUpgradeConfirmDialog".equals(alertDialogFragment.getTag())) {
            Log.d(k, "Dialog exist, ignore!!", new Object[0]);
            return;
        }
        try {
            this.a.dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
        final Context context = this.h;
        Activity activityX = x();
        if (activityX instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityX;
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(fragmentActivity);
            builder.setCancelable(false);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: g38
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.C(z, context, dialogInterface, i);
                }
            };
            String str = updateResponse.updateLog;
            String str2 = updateResponse.versionName;
            if (z) {
                AlertDialogFragment alertDialogFragmentCreate = builder.setTitle(context.getString(R.string.update_force_tip)).setMessage(str).setNeutralButton(context.getString(R.string.update_now), onClickListener).create();
                this.a = alertDialogFragmentCreate;
                alertDialogFragmentCreate.show(fragmentActivity.getSupportFragmentManager(), "ForceUpdateConfirmDialog");
            } else {
                AlertDialogFragment alertDialogFragmentCreate2 = builder.setTitle(context.getString(R.string.update_new_version_found_tip, str2)).setMessage(str).setPositiveButton(context.getString(R.string.update_now), onClickListener).setNegativeButton(context.getString(R.string.update_later), new DialogInterface.OnClickListener() { // from class: e38
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        UpdateManager.D(context, dialogInterface, i);
                    }
                }).create();
                this.a = alertDialogFragmentCreate2;
                alertDialogFragmentCreate2.show(fragmentActivity.getSupportFragmentManager(), "UpdateConfirmDialog");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00f0 A[Catch: all -> 0x00ea, Exception -> 0x00ed, TRY_LEAVE, TryCatch #4 {Exception -> 0x00ed, all -> 0x00ea, blocks: (B:6:0x0020, B:8:0x0026, B:10:0x002c, B:12:0x004e, B:16:0x00b8, B:18:0x00d0, B:20:0x00e3, B:21:0x00e6, B:13:0x0081, B:15:0x00a3, B:26:0x00f0), top: B:42:0x0020 }] */
    public static void F(@NonNull Context context, long j) throws Throwable {
        Cursor cursor = null;
        uriForFile = null;
        Uri uriForFile = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = ((DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD)).query(new DownloadManager.Query().setFilterById(j));
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 24) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
                                Log.d(k, "OnDownloaded LocalUri : " + string, new Object[0]);
                                if (string != null) {
                                    String absolutePath = new File(Uri.parse(string).getPath()).getAbsolutePath();
                                    Log.d(k, "OnDownloaded File : " + absolutePath, new Object[0]);
                                    uriForFile = FileProvider.getUriForFile(context, StorageUtil.FILE_PROVIDER_AUTH, new File(absolutePath));
                                }
                            } else {
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("local_filename"));
                                Log.d(k, "OnDownload LocalFile : " + string2, new Object[0]);
                                if (string2 != null) {
                                    uriForFile = Uri.parse("file://" + string2);
                                }
                            }
                            Log.d(k, "OnDownloaded : " + uriForFile, new Object[0]);
                            if (uriForFile != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                                intent.setFlags(268435456);
                                if (i >= 24) {
                                    intent.addFlags(1);
                                }
                                context.startActivity(intent);
                            }
                        } else {
                            Log.w(k, "Unable to parse downloaded file!!", new Object[0]);
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = cursorQuery;
                        e.printStackTrace();
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    Log.w(k, "Unable to parse downloaded file!!", new Object[0]);
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void G(@NonNull Context context, long j) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        intentFilter.addAction("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED");
        context.registerReceiver(new b(j), intentFilter);
    }

    public static UpdateManager getInstance() {
        return m;
    }

    private void s(final boolean z, final com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment) {
        Rx.io(new Runnable() { // from class: i38
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z(alertDialogFragment, z);
            }
        }).safeSubscribe();
    }

    private void t(boolean z, Activity activity, boolean z2, com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment) {
        Log.d(k, "Checking MI Update, isForce : " + z2, new Object[0]);
        WeakReference weakReference = new WeakReference(activity);
        XiaomiUpdateAgent.setUpdateAutoPopup(false);
        XiaomiUpdateAgent.setUpdateListener(new a(alertDialogFragment, weakReference, z2, z));
        XiaomiUpdateAgent.update(this.h, false);
    }

    private void u(@NonNull Context context) {
        Toast.makeText(context, context.getString(R.string.update_downloading), 0).show();
        try {
            v(context);
            this.b = true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(k, "DownloadErr", e, new Object[0]);
            Toast.makeText(context, R.string.app_upgrade_down_fail_without_manager, 1).show();
            this.b = false;
            w(context);
        }
    }

    private void v(@NonNull Context context) {
        Log.d(k, "Start Download!!", new Object[0]);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.e));
        request.setAllowedNetworkTypes(3);
        request.setAllowedOverRoaming(false);
        request.setVisibleInDownloadsUi(true);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, Uri.parse(this.e).getLastPathSegment());
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD);
        this.f = downloadManager;
        long jEnqueue = downloadManager.enqueue(request);
        this.g = jEnqueue;
        Box.putLastDownloadId(jEnqueue);
        this.c.postDelayed(this.j, 5000L);
        G(context, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Context context) {
        Log.d(k, "Start Download By Browser!!", new Object[0]);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.e));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(k, "DownloadByBrowserErr", e, new Object[0]);
        }
    }

    @Nullable
    private synchronized Activity x() {
        WeakReference<Activity> weakReference = this.i;
        if (weakReference == null) {
            return null;
        }
        Activity activity = weakReference.get();
        if (activity == null || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(AppUpgradeAPI.AppUpgradeResult appUpgradeResult, com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment, boolean z, Activity activity) {
        if (!appUpgradeResult.success || appUpgradeResult.upgradeInfo == null) {
            try {
                t(z, activity, false, alertDialogFragment);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (alertDialogFragment != null) {
            alertDialogFragment.dismissAllowingStateLoss();
        }
        UpdateResponse updateResponse = new UpdateResponse();
        updateResponse.versionCode = appUpgradeResult.upgradeInfo.getVersionCode();
        updateResponse.versionName = appUpgradeResult.upgradeInfo.getVersionName() == null ? "" : appUpgradeResult.upgradeInfo.getVersionName();
        updateResponse.path = appUpgradeResult.upgradeInfo.getChannelUrl();
        updateResponse.updateLog = appUpgradeResult.upgradeInfo.getChangeLog();
        boolean z2 = appUpgradeResult.upgradeInfo.getForceUpgrade() == 1;
        this.d = true;
        EventBus.getDefault().post(new RedPointEvent());
        if (z2) {
            Log.d(k, "Force Update : " + updateResponse.path, new Object[0]);
            this.e = updateResponse.path;
            E(updateResponse, true);
            return;
        }
        if (Box.getLastUpgradeCheckTime() / 86400000 != System.currentTimeMillis() / 86400000 || z) {
            Log.d(k, "Normal Update : " + updateResponse.path, new Object[0]);
            this.e = updateResponse.path;
            E(updateResponse, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(final com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragment, final boolean z) {
        final Activity activityX = x();
        if (activityX == null) {
            Log.w(k, "Activity no longer exists!!", new Object[0]);
            return;
        }
        Log.d(k, "Checking Gray Update...", new Object[0]);
        final AppUpgradeAPI.AppUpgradeResult appUpgrade = AppUpgradeAPI.getAppUpgrade(activityX);
        Rx.mainThread(new Runnable() { // from class: h38
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y(appUpgrade, alertDialogFragment, z, activityX);
            }
        });
    }

    public void cancelCheckUpdate() {
        if (Config.isBuildOversea()) {
            return;
        }
        XiaomiUpdateAgent.setUpdateListener(null);
    }

    public void checkUpdate(boolean z, Activity activity) {
        com.huami.watch.hmwatchmanager.view.AlertDialogFragment alertDialogFragmentNewInstance;
        if (Config.isBuildOversea()) {
            return;
        }
        Log.i(k, "Checking Update...", new Object[0]);
        this.h = activity.getApplicationContext();
        this.i = new WeakReference<>(activity);
        if (z) {
            alertDialogFragmentNewInstance = com.huami.watch.hmwatchmanager.view.AlertDialogFragment.newInstance(2);
            alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.update_checking));
            alertDialogFragmentNewInstance.setCancelable(true);
            alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "CheckingUpdate");
        } else {
            this.d = false;
            alertDialogFragmentNewInstance = null;
        }
        s(z, alertDialogFragmentNewInstance);
    }

    public boolean isUpdating(Context context) {
        long lastDownloadId = Box.getLastDownloadId();
        if (lastDownloadId == -1) {
            return false;
        }
        Cursor cursorQuery = null;
        int i = 16;
        try {
            try {
                cursorQuery = ((DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD)).query(new DownloadManager.Query().setFilterById(lastDownloadId));
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorQuery != null) {
                }
            }
            if (i == 2) {
                G(context, lastDownloadId);
            }
            return i == 2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public boolean shouldRedDotDisplay() {
        return this.d;
    }
}
