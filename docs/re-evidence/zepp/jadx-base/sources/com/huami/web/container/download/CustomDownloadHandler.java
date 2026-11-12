package com.huami.web.container.download;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.web.container.IWeb;
import com.huami.web.container.R;
import com.huami.web.container.WebExternalsKt;
import com.huami.web.container.utils.UtilsKt;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;

/* JADX INFO: loaded from: classes17.dex */
public class CustomDownloadHandler implements DownloadListener {
    private WebItem a;
    private Context b;

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            CustomDownloadHandler.this.b(this.a);
        }
    }

    public CustomDownloadHandler(WebItem webItem, Context context) {
        this.a = webItem;
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Uri uri;
        Toast.makeText(this.b, R.string.start_download, 0).show();
        if (!Environment.getExternalStorageState().equals("mounted")) {
            Context context = this.b;
            IconToast.showError(context, context.getString(R.string.sdcarderror));
            return;
        }
        String string = null;
        try {
            uri = Uri.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            uri = null;
        }
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setAllowedNetworkTypes(3);
        request.setAllowedOverRoaming(false);
        request.setNotificationVisibility(0);
        request.setVisibleInDownloadsUi(true);
        try {
            if (this.a.isFromVirtualWatch()) {
                StringBuilder sb = new StringBuilder();
                Context context2 = this.b;
                int i = R.string.amazfit_watch_app;
                sb.append(context2.getString(i));
                sb.append("_");
                sb.append(System.currentTimeMillis());
                sb.append(".apk");
                string = sb.toString();
                IWeb webInjectDelegate = WebExternalsKt.getWebInjectDelegate();
                Context context3 = this.b;
                webInjectDelegate.downloadSuccessStrKeeper(context3.getString(R.string.amazfit_app_download_ok, context3.getString(i)));
            } else if (this.a.isFromCCBGuide()) {
                string = "ccb_" + System.currentTimeMillis() + ".apk";
                WebExternalsKt.getWebInjectDelegate().downloadSuccessStrKeeper(this.b.getString(R.string.ccb_download_success));
            }
            request.setDestinationInExternalPublicDir("mi_file", string);
            long jEnqueue = ((DownloadManager) this.b.getSystemService(WatchFaceApi.SORT_DOWNLOAD)).enqueue(request);
            WebExternalsKt.getWebInjectDelegate().keepDownloadApkId(jEnqueue);
            WebExternalsKt.getWebInjectDelegate().downloadManagerPut(jEnqueue, string);
        } catch (Exception e2) {
            HMLog.i("", "Exception = " + e2.toString(), new Object[0]);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String string;
        HMLog.d("CustomDownloadHandler", "onDownloadStart :", new Object[0]);
        if (ContextCompat.checkSelfPermission(this.b, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            UtilsKt.showNoSdcardPermissionDialog((AppCompatActivity) this.b);
            return;
        }
        if (!NetUtil.isNetworkConnected(this.b)) {
            Toast.makeText(this.b, R.string.no_network_connection, 0).show();
            return;
        }
        if (!this.a.isFromVirtualWatch() && !this.a.isFromCCBGuide()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.b.startActivity(intent);
        } else {
            if (NetUtil.isWifiConnected(this.b)) {
                b(str);
                return;
            }
            String str5 = this.a.from;
            str5.hashCode();
            if (str5.equals("FROM_VIRTUAL_WATCH")) {
                string = this.b.getString(R.string.amazfit_watch_app);
            } else {
                string = !str5.equals("FROM_CCB_GUIDE") ? null : this.b.getString(R.string.ccb_app_name);
            }
            new AlertDialogFragment.Builder(this.b).setCancelable(false).setTitle(string).setMessage(R.string.apk_force_upgrade_wifi_status).setPositiveButton(R.string.continue_update, new a(str)).setNegativeButton(R.string.exit, (DialogInterface.OnClickListener) null).show(((AppCompatActivity) this.b).getSupportFragmentManager());
        }
    }
}
