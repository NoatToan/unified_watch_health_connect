package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.cloud.bean.DataCallback;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes42.dex */
public class pks implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ShareDataInfo> f45563c;
    private volatile DownloadCallback e;

    public pks(List<ShareDataInfo> list, DownloadCallback downloadCallback, int i) {
        ArrayList arrayList = new ArrayList();
        this.f45563c = arrayList;
        arrayList.addAll(list);
        this.e = downloadCallback;
        this.f45562b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (njy.e(this.f45563c)) {
            return;
        }
        for (int i = 0; i < this.f45563c.size(); i++) {
            ShareDataInfo shareDataInfo = this.f45563c.get(i);
            if (shareDataInfo instanceof gye) {
                gye gyeVar = (gye) shareDataInfo;
                String strA = gyeVar.a();
                String strH = gyeVar.h();
                int id = gyeVar.getId();
                LogUtil.a("SportSmallBgDownloadThread", "downloadSmallResource info id=", Integer.valueOf(id), " name=", gyeVar.d(), "path:", strH);
                e(strA, strH, gyeVar);
            }
        }
    }

    private void e(String str, String str2, final gye gyeVar) {
        pkl.b(str, str2, new DataCallback() { // from class: pks.4
            @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("SportSmallBgDownloadThread", "download success.");
                pks.this.e(jSONObject, gyeVar);
            }

            @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
            public void onFailure(int i, String str3) {
                LogUtil.e("SportSmallBgDownloadThread", "errorCode:", Integer.valueOf(i), "errorMsg:", str3);
                if (pks.this.e != null) {
                    pks.this.e.onFailure(i, str3);
                    LogUtil.a("SportSmallBgDownloadThread", "mCallback :", pks.this.e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
        pmn.e().e(this.f45562b, shareDataInfo, shareDataInfo.getType());
        if (this.e != null) {
            this.e.onSuccess(jSONObject, shareDataInfo);
        }
    }
}
