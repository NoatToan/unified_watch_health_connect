package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.cloud.bean.DataCallback;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class pkq implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ShareDataInfo f45557c;
    private volatile DownloadCallback d;
    private int e;

    public pkq(ShareDataInfo shareDataInfo, DownloadCallback downloadCallback, int i) {
        this.f45557c = shareDataInfo;
        this.d = downloadCallback;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        ShareDataInfo shareDataInfo = this.f45557c;
        if (shareDataInfo != null && (shareDataInfo instanceof gye)) {
            gye gyeVar = (gye) shareDataInfo;
            String url = gyeVar.getUrl();
            String path = gyeVar.getPath();
            int id = gyeVar.getId();
            LogUtil.a("SportBigBgDownloadThread", "downBigBg info id=", Integer.valueOf(id), " name=", gyeVar.d());
            pkl.b(url, path, new DataCallback() { // from class: pkq.2
                @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("SportBigBgDownloadThread", "download success.");
                    pkq pkqVar = pkq.this;
                    pkqVar.a(jSONObject, pkqVar.f45557c);
                }

                @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("SportBigBgDownloadThread", "errorCode:", Integer.valueOf(i), "errorMsg:", str);
                    if (pkq.this.d != null) {
                        pkq.this.d.onFailure(i, str);
                        LogUtil.a("SportBigBgDownloadThread", "mCallback :", pkq.this.d);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
        pmn.e().e(this.e, shareDataInfo, shareDataInfo.getType());
        if (this.d != null) {
            this.d.onSuccess(jSONObject, shareDataInfo);
        }
    }
}
