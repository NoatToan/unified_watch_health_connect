package defpackage;

import com.huawei.health.hwhealthlinkage.interactors.BaseInteractor;
import com.huawei.health.suggestion.util.HeartRateGetterUtil;
import com.huawei.hwbasemgr.IHeartRateCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class fhw extends BaseInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34067a;

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fhw f34069b = new fhw();
    }

    private fhw() {
        this.f34067a = 0;
        this.mStatusCallback = new IHeartRateCallback() { // from class: fhw.1
            @Override // com.huawei.hwbasemgr.IHeartRateCallback
            public void startHeartRateMeasure() {
                fhw.this.start();
            }

            @Override // com.huawei.hwbasemgr.IHeartRateCallback
            public void stopHeartRateMeasure() {
                fhw.this.stop();
            }
        };
    }

    public static final fhw d() {
        return a.f34069b;
    }

    @Override // com.huawei.health.hwhealthlinkage.interactors.BaseInteractor
    public void unRegisterStatusListener() {
        super.unRegisterStatusListener();
        LogUtil.a("HWhealthLinkage_PSInteractor", "unRegisterStatusListener enter");
    }

    @Override // com.huawei.health.hwhealthlinkage.interactors.BaseInteractor
    public void registerStatusListener() {
        LogUtil.a("HWhealthLinkage_PSInteractor", "registerStatusListener enter");
        HeartRateGetterUtil.d().d(this.mStatusCallback);
    }

    @Override // com.huawei.health.hwhealthlinkage.interactors.BaseInteractor
    public void start() {
        LogUtil.a("HWhealthLinkage_PSInteractor", "start enter");
        this.f34067a = 1;
        fhz.d().e(true);
        fic.e().h();
    }

    @Override // com.huawei.health.hwhealthlinkage.interactors.BaseInteractor
    public void stop() {
        LogUtil.a("HWhealthLinkage_PSInteractor", "stop enter");
        this.f34067a = 0;
        fhz.d().e(false);
        fic.e().b();
    }

    public int b() {
        return this.f34067a;
    }
}
