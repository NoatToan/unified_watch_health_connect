package defpackage;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.activity.DownloadInterface;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import com.huawei.pluginsocialshare.cloud.bean.ShareDataCallBack;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class pmb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomProgressDialog f45635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<DownloadInterface> f45636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f45637c;
    private CustomProgressDialog.Builder d;
    private pko e = null;
    private gyg g;
    private int h;
    private c i;
    private boolean j;

    public pmb(DownloadInterface downloadInterface) {
        this.f45636b = new WeakReference<>(downloadInterface);
    }

    public pmb() {
    }

    public void a(boolean z, Activity activity, int i) {
        d(z, activity, i, false);
    }

    public void d(boolean z, Activity activity, int i, boolean z2) {
        LogUtil.a("Share_ShareSourceDownloadManager", "updateShareData add healthData");
        this.f45637c = new WeakReference<>(activity);
        this.h = i;
        this.j = z;
        this.g = new gyg();
        this.i = new c(this);
        ShareDataCallBack shareDataCallBack = new ShareDataCallBack() { // from class: pmb.3
            @Override // com.huawei.pluginsocialshare.cloud.bean.ShareDataCallBack
            public void onFailure(int i2, String str) {
                LogUtil.e("Share_ShareSourceDownloadManager", "updateShareData onFailure errorCode: ", Integer.valueOf(i2), " errorInfo:", str);
                if (pmb.this.j) {
                    pmb.this.i.sendEmptyMessage(105);
                }
            }

            @Override // com.huawei.pluginsocialshare.cloud.bean.ShareDataCallBack
            public void onSuccess(int i2, gyg gygVar) {
                LogUtil.a("Share_ShareSourceDownloadManager", "onSuccess resultCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    pmb.this.g = gygVar;
                    final List<ShareDataInfo> listA = pmb.this.c(gygVar).a();
                    if (!pmb.this.g.a().isEmpty() && listA.isEmpty()) {
                        pmb.this.i.sendEmptyMessage(102);
                    }
                    if (listA.isEmpty()) {
                        return;
                    }
                    final Activity activity2 = (Activity) pmb.this.f45637c.get();
                    if (activity2 == null || !CommonUtil.ah(activity2) || !pmb.this.j) {
                        pmb.this.b(listA);
                    } else {
                        activity2.runOnUiThread(new Runnable() { // from class: pmb.3.2
                            @Override // java.lang.Runnable
                            public void run() {
                                pmb.this.b(pmb.this.d((List<ShareDataInfo>) listA), listA, activity2);
                            }
                        });
                    }
                }
            }
        };
        if (z2) {
            pme.a().c(this.h, shareDataCallBack);
        } else {
            pme.a().d(this.h, shareDataCallBack);
        }
    }

    public void c(boolean z, Activity activity, int i) {
        this.f45637c = new WeakReference<>(activity);
        this.h = i;
        this.j = z;
        this.g = new gyg();
        this.i = new c(this);
        if (!CommonUtil.ab(BaseApplication.b())) {
            this.i.sendEmptyMessage(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        } else {
            final ShareDataCallBack shareDataCallBack = new ShareDataCallBack() { // from class: pmb.4
                @Override // com.huawei.pluginsocialshare.cloud.bean.ShareDataCallBack
                public void onFailure(int i2, String str) {
                    LogUtil.e("Share_ShareSourceDownloadManager", "updateShareData onFailure errorCode: ", Integer.valueOf(i2), " errorInfo:", str);
                    if (pmb.this.j) {
                        pmb.this.i.sendEmptyMessage(108);
                    }
                }

                @Override // com.huawei.pluginsocialshare.cloud.bean.ShareDataCallBack
                public void onSuccess(int i2, gyg gygVar) {
                    LogUtil.a("Share_ShareSourceDownloadManager", "onSuccess resultCode:", Integer.valueOf(i2));
                    if (i2 == 0) {
                        pmb.this.g = gygVar;
                        pmb.this.i.sendEmptyMessage(103);
                    }
                }
            };
            ThreadPoolManager.c().execute(new Runnable() { // from class: pmb.2
                @Override // java.lang.Runnable
                public void run() {
                    pme.a().e(pmb.this.h, shareDataCallBack);
                }
            });
        }
    }

    public void d(List<ShareDataInfo> list, boolean z, Activity activity, DownloadCallback downloadCallback) {
        this.j = z;
        this.f45637c = new WeakReference<>(activity);
        this.i = new c(this);
        if (list == null || list.size() == 0) {
            return;
        }
        a(list, downloadCallback);
    }

    private void a(List<ShareDataInfo> list, DownloadCallback downloadCallback) {
        ThreadPoolManager.c().execute(new pko(list, downloadCallback, this.h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(List<ShareDataInfo> list) {
        int imageSize = 0;
        for (ShareDataInfo shareDataInfo : list) {
            if (shareDataInfo != null) {
                imageSize += shareDataInfo.getImageSize();
            }
        }
        return imageSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<ShareDataInfo> list) {
        this.e = new pko(list, this.j ? new d(list.size()) : null, this.h);
        this.i.sendEmptyMessage(100);
        ThreadPoolManager.c().execute(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        CustomProgressDialog customProgressDialog = this.f45635a;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.e("Share_ShareSourceDownloadManager", "startDownloadProgress progress exist");
            return;
        }
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(activity);
        this.d = builder;
        builder.e(activity.getString(R.string.IDS_hwh_health_share_source_downloading)).e(new View.OnClickListener() { // from class: ply
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45625a.e(view);
            }
        });
        CustomProgressDialog customProgressDialogC = this.d.c();
        this.f45635a = customProgressDialogC;
        customProgressDialogC.setCanceledOnTouchOutside(false);
        this.f45635a.show();
        this.d.b(0);
        this.d.b(ltc.c(0.0d, 2, 0));
        this.d.d();
        LogUtil.a("Share_ShareSourceDownloadManager", "mCustomProgressDialog.show()");
        this.i.sendMessageDelayed(this.i.obtainMessage(110), 30000L);
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("Share_ShareSourceDownloadManager", "startDownLoadProgress onclick cancel");
        this.e.d(true);
        pkl.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        CustomProgressDialog.Builder builder;
        CustomProgressDialog customProgressDialog = this.f45635a;
        if (customProgressDialog == null || !customProgressDialog.isShowing() || (builder = this.d) == null) {
            return;
        }
        builder.b(i);
        this.d.b(ltc.c(i, 2, 0));
    }

    public void c(Activity activity) {
        if (this.f45635a != null && activity != null) {
            LogUtil.a("Share_ShareSourceDownloadManager", "closeDownloadProgress mCustomProgressDialog dismiss");
            this.f45635a.dismiss();
            this.f45635a = null;
        }
        CustomProgressDialog.Builder builder = this.d;
        if (builder != null) {
            builder.e((View.OnClickListener) null);
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gyg c(gyg gygVar) {
        gyg gygVar2 = new gyg();
        List<ShareDataInfo> listD = pme.a().d(2, gygVar);
        List<ShareDataInfo> listD2 = pme.a().d(1, gygVar);
        List<ShareDataInfo> listD3 = pme.a().d(3, gygVar);
        List<ShareDataInfo> listD4 = pme.a().d(4, gygVar);
        gygVar2.a(listD);
        gygVar2.i(listD2);
        gygVar2.g(listD3);
        gygVar2.f(listD4);
        return gygVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, List<ShareDataInfo> list, Activity activity) {
        String strE = SharedPreferenceManager.e(activity, Integer.toString(20002), "lastTimeShowDialog");
        if (!TextUtils.isEmpty(strE) && "-1".equals(strE)) {
            b(list);
            return;
        }
        double d2 = ((double) i) / 1048576.0d;
        if (d2 < 0.1d) {
            d2 = 0.1d;
        }
        a(String.format(Locale.ENGLISH, activity.getString(R.string.IDS_watchface_install_prompt), activity.getString(R.string.IDS_device_upgrade_file_size_mb, new Object[]{UnitUtil.e(d2, 1, 1)})), list, activity);
    }

    private void a(String str, final List<ShareDataInfo> list, final Activity activity) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(str).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: pmb.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(activity, Integer.toString(20002), "lastTimeShowDialog", "-1", new StorageParams());
                pmb.this.b((List<ShareDataInfo>) list);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: pmb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    class d implements DownloadCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45646c;
        private int e = 0;

        d(int i) {
            this.f45646c = i;
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
        public void onSuccess(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
            synchronized (this) {
                int i = this.e + 1;
                this.e = i;
                int i2 = (i * 100) / this.f45646c;
                Message messageObtainMessage = pmb.this.i.obtainMessage(101);
                messageObtainMessage.arg1 = i2;
                pmb.this.i.sendMessage(messageObtainMessage);
                LogUtil.a("Share_ShareSourceDownloadManager", "mDownloadNum: ", Integer.valueOf(this.f45646c), " finish num: ", Integer.valueOf(this.e), " progress:", Integer.valueOf(i2));
            }
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
        public void onFailure(int i, String str) {
            synchronized (this) {
                LogUtil.a("Share_ShareSourceDownloadManager", "ShareFileCallback onFailure errCode:", Integer.valueOf(i), "errorInfo:", str);
                pmb.this.i.sendMessage(pmb.this.i.obtainMessage(104));
            }
        }
    }

    static class c extends BaseHandler<pmb> {
        c(pmb pmbVar) {
            super(pmbVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(pmb pmbVar, Message message) {
            if (message != null && pmbVar.f45636b != null) {
                Activity activity = (Activity) pmbVar.f45637c.get();
                DownloadInterface downloadInterface = (DownloadInterface) pmbVar.f45636b.get();
                int i = message.what;
                if (i == 100) {
                    if (!pmbVar.j || activity == null) {
                        return;
                    }
                    pmbVar.b(activity);
                    return;
                }
                if (i == 109) {
                    LogUtil.a("Share_ShareSourceDownloadManager", "handleMessage MSG_NETWORK_FAIL");
                    if (activity != null) {
                        qpx.b(activity.getApplicationContext(), R.string.IDS_connect_error);
                    }
                    if (downloadInterface != null) {
                        downloadInterface.notifyBackgroudFail();
                        return;
                    }
                    return;
                }
                if (i != 110) {
                    switch (i) {
                        case 104:
                            if (pmbVar.j) {
                                pmbVar.c(activity);
                            }
                            d(downloadInterface);
                            break;
                        case 105:
                            d(downloadInterface);
                            break;
                        case 106:
                            if (downloadInterface != null) {
                                downloadInterface.refreshShareLayoutNoRecommend();
                            }
                            break;
                        case 107:
                            LogUtil.a("Share_ShareSourceDownloadManager", "handleMessage MSG_DOWNLOAD_THEME_FAIL");
                            if (activity != null) {
                                qpx.b(activity.getApplicationContext(), R.string.IDS_hwh_edit_share_error);
                            }
                            break;
                        default:
                            if (downloadInterface != null) {
                                e(pmbVar, message, activity, downloadInterface);
                            }
                            break;
                    }
                    return;
                }
                if (pmbVar.f45635a == null || !pmbVar.f45635a.isShowing()) {
                    return;
                }
                ReleaseLogUtil.e("Share_ShareSourceDownloadManager", "ProgressHandler MSG_DOWNLOAD_OVERTIME");
                pmbVar.c(activity);
                downloadInterface.notifyDownloadDataFail();
                return;
            }
            LogUtil.j("Share_ShareSourceDownloadManager", "handleMessage in createInstanceOfHandler, no msg is received.");
        }

        private void e(pmb pmbVar, Message message, Activity activity, DownloadInterface downloadInterface) {
            LogUtil.a("Share_ShareSourceDownloadManager", "updateStatus to enter");
            int i = message.what;
            if (i != 108) {
                switch (i) {
                    case 101:
                        pmbVar.e(message.arg1);
                        if (message.arg1 == 100) {
                            pmbVar.c(activity);
                            List<ShareDataInfo> listC = pnq.c(pmbVar.g.d());
                            pnq.d(listC);
                            downloadInterface.notifyShareDataChanged(pmbVar.g);
                            downloadInterface.refreshDataMark(listC);
                        }
                        break;
                    case 102:
                        downloadInterface.notifyShareDataChanged(pmbVar.g);
                        break;
                    case 103:
                        LogUtil.a("Share_ShareSourceDownloadManager", "updateStatus MSG_UPDATE_BACKGROUD :", pmbVar.g.b(), ", size: ", Integer.valueOf(pmbVar.g.b().size()));
                        downloadInterface.notifyBackgroudChanged(pmbVar.g);
                        break;
                    default:
                        LogUtil.j("Share_ShareSourceDownloadManager", "updateStatus is default");
                        break;
                }
                return;
            }
            LogUtil.a("Share_ShareSourceDownloadManager", "updateStatus MSG_UPDATE_FAIL");
            if (activity != null) {
                qpx.b(activity.getApplicationContext(), R.string.IDS_hwh_edit_share_error);
            }
            downloadInterface.notifyBackgroudFail();
        }

        private void d(DownloadInterface downloadInterface) {
            if (downloadInterface != null) {
                downloadInterface.showDownloadError();
                downloadInterface.notifyDownloadDataFail();
            }
        }
    }

    public void c() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
    }
}
