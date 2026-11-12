package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.cloud.bean.DataCallback;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class pko implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ShareDataInfo> f45549a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile DownloadCallback f45551c;
    private int e;
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45550b = false;

    public pko(List<ShareDataInfo> list, DownloadCallback downloadCallback, int i) {
        ArrayList arrayList = new ArrayList();
        this.f45549a = arrayList;
        arrayList.addAll(list);
        this.f45551c = downloadCallback;
        this.e = i;
    }

    public void d(boolean z) {
        this.d = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (njy.e(this.f45549a)) {
            return;
        }
        LogUtil.a("TAG_DownloadThread", "start download resource.", Integer.valueOf(this.f45549a.size()));
        this.f45550b = false;
        for (final ShareDataInfo shareDataInfo : this.f45549a) {
            if (this.d) {
                LogUtil.a("TAG_DownloadThread", "download is cancel");
                return;
            } else if (shareDataInfo != null) {
                String strC = shareDataInfo instanceof plg ? ((plg) shareDataInfo).c() : shareDataInfo.getUrl();
                String path = shareDataInfo.getPath();
                LogUtil.a("TAG_DownloadThread", "path:", path, " type:", Integer.valueOf(shareDataInfo.getType()));
                pkl.b(strC, path, new DataCallback() { // from class: pko.5
                    @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("TAG_DownloadThread", "errorCode:", Integer.valueOf(i), "errorMsg:", str);
                        ShareDataInfo shareDataInfo2 = shareDataInfo;
                        if (shareDataInfo2 instanceof plg) {
                            ((plg) shareDataInfo2).a(false);
                        }
                        if (!pko.this.d || !pko.this.f45550b) {
                            pko.this.f45550b = true;
                            if (pko.this.f45551c != null) {
                                pko.this.f45551c.onFailure(i, str);
                                LogUtil.a("TAG_DownloadThread", "mCallback :", pko.this.f45551c);
                                return;
                            } else {
                                LogUtil.j("TAG_DownloadThread", " mCallback is null");
                                return;
                            }
                        }
                        LogUtil.a("TAG_DownloadThread", "callback is too much");
                        pko.this.f45551c = null;
                    }

                    @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
                    public void onSuccess(JSONObject jSONObject) {
                        LogUtil.a("TAG_DownloadThread", "download success.");
                        ShareDataInfo shareDataInfo2 = shareDataInfo;
                        if (shareDataInfo2 instanceof plg) {
                            ((plg) shareDataInfo2).e(true);
                            ((plg) shareDataInfo).a(false);
                        }
                        if (shareDataInfo.getType() != 3) {
                            pko.this.a(jSONObject, shareDataInfo);
                            return;
                        }
                        gyj gyjVar = (gyj) shareDataInfo;
                        if (StringUtils.g(gyjVar.c())) {
                            pko.this.a(jSONObject, shareDataInfo);
                        } else {
                            pko.this.c(gyjVar);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final gyj gyjVar) {
        pkl.b(gyjVar.c(), gyjVar.e(), new DataCallback() { // from class: pko.2
            @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("TAG_DownloadThread", "download alter imagine errorCode:", Integer.valueOf(i), "errorMsg:", str);
                if (pko.this.f45551c != null) {
                    pko.this.f45551c.onFailure(i, str);
                }
            }

            @Override // com.huawei.pluginsocialshare.cloud.bean.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("TAG_DownloadThread", "download alter imagine success.");
                pko.this.a(jSONObject, gyjVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
        pmc.a().c(this.e, shareDataInfo, shareDataInfo.getType());
        if (this.f45551c != null) {
            this.f45551c.onSuccess(jSONObject, shareDataInfo);
        }
    }
}
