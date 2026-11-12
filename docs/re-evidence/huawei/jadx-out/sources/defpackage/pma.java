package defpackage;

import android.app.Activity;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.activity.SportDownloadInterface;
import com.huawei.pluginsocialshare.cloud.bean.ContinuesSportCallback;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import com.huawei.pluginsocialshare.cloud.bean.SportShareDataCallBack;
import health.compact.a.KeyValDbManager;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class pma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pks f45630a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f45631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gyf f45632c;
    private b d;
    private WeakReference<SportDownloadInterface> e;
    private int i;

    public pma(SportDownloadInterface sportDownloadInterface) {
        this.e = new WeakReference<>(sportDownloadInterface);
    }

    public void e(Activity activity, int i) {
        LogUtil.a("Share_SportShareSourceDownloadManager", "updateShareData add healthData");
        this.f45631b = new WeakReference<>(activity);
        this.i = i;
        this.f45632c = new gyf();
        this.d = new b(this);
        pme.a().e(this.i, new SportShareDataCallBack() { // from class: pma.3
            @Override // com.huawei.pluginsocialshare.cloud.bean.SportShareDataCallBack
            public void onSuccess(int i2, int i3, gyf gyfVar) {
                LogUtil.a("Share_SportShareSourceDownloadManager", "onSuccess resultCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    pma.this.f45632c = gyfVar;
                    List<ShareDataInfo> listE = pma.this.e(gyfVar).e();
                    if (!pma.this.f45632c.a().isEmpty() && listE.isEmpty()) {
                        LogUtil.j("Share_SportShareSourceDownloadManager", "updateShareData downloadList:isEmpty");
                        pma.this.d.sendEmptyMessageDelayed(102, 200L);
                    } else {
                        if (listE.isEmpty()) {
                            return;
                        }
                        pma.this.d(listE);
                    }
                }
            }

            @Override // com.huawei.pluginsocialshare.cloud.bean.SportShareDataCallBack
            public void onFailure(int i2, String str) {
                pma.this.d.sendEmptyMessageDelayed(102, 200L);
                LogUtil.e("Share_SportShareSourceDownloadManager", "updateShareData onFailure errorCode: ", Integer.valueOf(i2), " errorInfo:", str);
            }
        });
    }

    public void d(String str, int i, ContinuesSportCallback continuesSportCallback) {
        String strC = KeyValDbManager.d(BaseApplication.b()).c("cloud_user_privacy3");
        String strC2 = KeyValDbManager.d(BaseApplication.b()).c("cloud_user_privacy7");
        if ("true".equals(strC) && "true".equals(strC2)) {
            pme.a().a(str, i, continuesSportCallback);
        }
    }

    public void b(Activity activity, int i) {
        LogUtil.a("Share_SportShareSourceDownloadManager", "downloadAllShareStickerData add healthData");
        this.f45631b = new WeakReference<>(activity);
        this.i = i;
        this.f45632c = new gyf();
        this.d = new b(this);
        pme.a().b(this.i, new SportShareDataCallBack() { // from class: pma.5
            @Override // com.huawei.pluginsocialshare.cloud.bean.SportShareDataCallBack
            public void onSuccess(int i2, int i3, gyf gyfVar) {
                LogUtil.a("Share_SportShareSourceDownloadManager", "onSuccess resultCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    pma.this.f45632c = gyfVar;
                    List<ShareDataInfo> listC = pma.this.a(gyfVar).c();
                    if ((pma.this.f45632c.a().isEmpty() || !listC.isEmpty()) && !listC.isEmpty()) {
                        pma.this.e(listC);
                    }
                }
            }

            @Override // com.huawei.pluginsocialshare.cloud.bean.SportShareDataCallBack
            public void onFailure(int i2, String str) {
                LogUtil.e("Share_SportShareSourceDownloadManager", "updateShareData onFailure errorCode: ", Integer.valueOf(i2), " errorInfo:", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<ShareDataInfo> list) {
        ThreadPoolManager.c().execute(new pkr(list, new e(this.d, list.size()), this.i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<ShareDataInfo> list) {
        this.f45630a = new pks(list, new e(this.d, list.size()), this.i);
        ThreadPoolManager.c().execute(this.f45630a);
    }

    public void d(ShareDataInfo shareDataInfo) {
        ThreadPoolManager.c().execute(new pkq(shareDataInfo, new DownloadCallback() { // from class: pma.1
            @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
            public void onFailure(int i, String str) {
            }

            @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
            public void onSuccess(JSONObject jSONObject, ShareDataInfo shareDataInfo2) {
                Message messageObtainMessage = pma.this.d.obtainMessage(99);
                messageObtainMessage.obj = shareDataInfo2;
                pma.this.d.sendMessage(messageObtainMessage);
            }
        }, this.i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gyf e(gyf gyfVar) {
        gyf gyfVar2 = new gyf();
        gyfVar2.c(pme.a().c(2, gyfVar));
        return gyfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gyf a(gyf gyfVar) {
        gyf gyfVar2 = new gyf();
        gyfVar2.d(pme.a().c(4, gyfVar));
        return gyfVar2;
    }

    static class e implements DownloadCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f45633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45634c = 0;
        private int d;

        e(b bVar, int i) {
            this.d = i;
            this.f45633b = bVar;
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
        public void onSuccess(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
            if (this.f45633b == null) {
                return;
            }
            synchronized (this) {
                int i = this.f45634c + 1;
                this.f45634c = i;
                int i2 = (i * 100) / this.d;
                Message messageObtainMessage = this.f45633b.obtainMessage(101);
                messageObtainMessage.arg1 = i2;
                this.f45633b.sendMessage(messageObtainMessage);
                LogUtil.a("Share_SportShareSourceDownloadManager", "mDownloadNum: ", Integer.valueOf(this.d), " finish num: ", Integer.valueOf(this.f45634c), " progress:", Integer.valueOf(i2));
            }
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
        public void onFailure(int i, String str) {
            synchronized (this) {
                LogUtil.a("Share_SportShareSourceDownloadManager", "ShareFileCallback onFailure errCode:", Integer.valueOf(i), "errorInfo:", str);
                this.f45633b.sendMessage(this.f45633b.obtainMessage(104));
            }
        }
    }

    static class b extends BaseHandler<pma> {
        b(pma pmaVar) {
            super(pmaVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(pma pmaVar, Message message) {
            if (message != null && pmaVar.e != null) {
                SportDownloadInterface sportDownloadInterface = (SportDownloadInterface) pmaVar.e.get();
                if (sportDownloadInterface == null) {
                    return;
                }
                int i = message.what;
                if (i == 99) {
                    sportDownloadInterface.downloadedSingleCallback((ShareDataInfo) message.obj);
                    return;
                }
                if (i == 101) {
                    if (message.arg1 == 100) {
                        sportDownloadInterface.downloadedAllShareDataCallback(pmaVar.f45632c);
                        return;
                    }
                    return;
                } else if (i == 102) {
                    sportDownloadInterface.downloadedAllShareDataCallback(pmaVar.f45632c);
                    return;
                } else {
                    LogUtil.j("Share_SportShareSourceDownloadManager", "updateStatus is default");
                    return;
                }
            }
            LogUtil.j("Share_SportShareSourceDownloadManager", "handleMessage in createInstanceOfHandler, no msg is received.");
        }
    }
}
