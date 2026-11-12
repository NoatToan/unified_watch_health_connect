package defpackage;

import android.os.Looper;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class mba extends AppCheckNewVersionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<HwUpdateService> f41313b;
    private String d;
    private int e;

    public mba(String str, int i, Looper looper, HwUpdateService hwUpdateService) {
        super(looper);
        this.d = str;
        this.e = i;
        this.f41313b = new WeakReference<>(hwUpdateService);
    }

    @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
    public void handleCheckSuccess(nuf nufVar) {
        LogUtil.a("R_OTA_BandCheckNewVersionToActivateHandler", "bandCheckNewVersionToActivate: handleCheckSuccess");
        max.c().a(this.d, true);
        HwUpdateService hwUpdateService = this.f41313b.get();
        if (hwUpdateService == null) {
            LogUtil.j("BandCheckNewVersionToActivateHandler", "service is null");
        } else {
            hwUpdateService.a(this.e, "BandCheckNewVersionToActivateHandler handleCheckSuccess");
        }
    }

    @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
    public void handleCheckFailed(int i) {
        LogUtil.a("R_OTA_BandCheckNewVersionToActivateHandler", "bandCheckNewVersionToActivate: handleCheckFailed");
        if (i == 0) {
            LogUtil.a("R_OTA_BandCheckNewVersionToActivateHandler", "bandCheckNewVersionToActivate: FAILED_REASON_NOT_FOUND");
            max.c().a(this.d, true);
        }
        HwUpdateService hwUpdateService = this.f41313b.get();
        if (hwUpdateService == null) {
            LogUtil.j("BandCheckNewVersionToActivateHandler", "service is null");
        } else {
            hwUpdateService.a(this.e, "BandCheckNewVersionToActivateHandler handleCheckFailed");
        }
    }
}
