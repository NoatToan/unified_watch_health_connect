package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homewear21.wearjoin.JoinRuleParse;
import com.huawei.ui.main.stories.lightcloud.service.LightCloudCallBack;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class soz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private tas f48482b;

    public void b() {
        LogUtil.a("LightCloudInteractor", "refreshServiceProcess begin");
        ThreadPoolManager.c().b("LightCloudInteractor", new Runnable() { // from class: soz.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (soz.this.f48482b == null) {
                    soz.this.f48482b = new tas();
                }
                soz.this.f48482b.a();
            }
        });
    }

    public void e(boolean z) {
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.a("LightCloudInteractor", "no net to lightcloud");
        } else {
            vse.d(BaseApplication.b()).b(new LightCloudCallBack() { // from class: soz.5
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:28:0x005b  */
                @Override // com.huawei.ui.main.stories.lightcloud.service.LightCloudCallBack
                public void onResponce(String str, int i) throws Throwable {
                    byte b2;
                    LogUtil.a("LightCloudInteractor", "LightCloud doRefreshBatch ", str, " resCode = ", Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    str.hashCode();
                    switch (str) {
                        case "servicefwo_v1":
                            b2 = 0;
                            break;
                        case "ecg_blocklist":
                            b2 = 1;
                            break;
                        case "servicefw_v1":
                            b2 = 2;
                            break;
                        case "healthconfig":
                            b2 = 3;
                            break;
                        case "oversea_app_update":
                            b2 = 4;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        soz.this.c("servicefwo_v1", i);
                        return;
                    }
                    if (b2 == 1) {
                        tej.a(i);
                        return;
                    }
                    if (b2 == 2) {
                        soz.this.c("servicefw_v1", i);
                        return;
                    }
                    if (b2 == 3) {
                        if (CommonUtil.ck()) {
                            JoinRuleParse.parseResult(BaseApplication.b());
                        }
                    } else if (b2 == 4) {
                        nur.b(i);
                    } else {
                        LogUtil.e("LightCloudInteractor", "Unrecognized id");
                    }
                }
            }, a(z));
        }
    }

    private List<String> a(boolean z) {
        ArrayList arrayList = new ArrayList(6);
        if (z) {
            arrayList.add("servicefwo_v1");
            return arrayList;
        }
        arrayList.add("servicefw_v1");
        arrayList.add("ecg_blocklist");
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        if (i == 0) {
            c();
            e(str, "1");
        } else {
            e(str, "0");
        }
    }

    private void e(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10000), str, str2, null);
    }

    private void c() {
        LogUtil.a("LightCloudInteractor", "initServiceFW begin");
        ThreadPoolManager.c().b("LightCloudInteractor", new Runnable() { // from class: soz.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (soz.this.f48482b == null) {
                    soz.this.f48482b = new tas();
                }
                soz.this.f48482b.e();
            }
        });
    }
}
