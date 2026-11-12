package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.cloud.bean.DataCallback;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class pkr implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile DownloadCallback f45559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45560c;
    private List<ShareDataInfo> d;

    public pkr(List<ShareDataInfo> list, DownloadCallback downloadCallback, int i) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(list);
        this.f45559b = downloadCallback;
        this.f45560c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (njy.e(this.d)) {
            return;
        }
        LogUtil.a("SportStickerDownloadThread", "start download resource.", Integer.valueOf(this.d.size()));
        for (final ShareDataInfo shareDataInfo : this.d) {
            if (shareDataInfo instanceof gyi) {
                gyi gyiVar = (gyi) shareDataInfo;
                String url = gyiVar.getUrl();
                String path = gyiVar.getPath();
                LogUtil.a("SportStickerDownloadThread", "path:", path, " type:", Integer.valueOf(shareDataInfo.getType()));
                pkl.b(url, path, new DataCallback() { // from class: pkr.3
                    @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
                    public void onSuccess(JSONObject jSONObject) {
                        LogUtil.a("SportStickerDownloadThread", "download success.");
                        pkr.this.b(jSONObject, shareDataInfo);
                    }

                    @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("SportStickerDownloadThread", "errorCode:", Integer.valueOf(i), "errorMsg:", str);
                        if (pkr.this.f45559b != null) {
                            pkr.this.f45559b.onFailure(i, str);
                            LogUtil.a("SportStickerDownloadThread", "mCallback :", pkr.this.f45559b);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
        pmn.e().e(this.f45560c, shareDataInfo, shareDataInfo.getType());
        if (this.f45559b != null) {
            this.f45559b.onSuccess(jSONObject, shareDataInfo);
        }
    }
}
