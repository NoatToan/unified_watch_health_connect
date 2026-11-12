package defpackage;

import android.os.Bundle;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.sportservice.SportComponent;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ixn implements SportComponent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38168b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportLaunchParams f38169a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Observer f38170c = new Observer() { // from class: ixp
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            HandlerExecutor.b(new Runnable() { // from class: ixo
                @Override // java.lang.Runnable
                public final void run() {
                    ixn.b(str, objArr);
                }
            });
        }
    };
    private final SportDataOutputApi d = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
    protected SportLifecycle e = (SportLifecycle) Services.d("SportService", SportLifecycle.class);
    private int g;

    static /* synthetic */ void b(String str, Object[] objArr) {
        ReleaseLogUtil.d("Track_SportServiceHelper", "login status changed label = ", str, ", args = ", objArr);
        if (str != null && "com.huawei.plugin.account.logout".equals(str)) {
            iwy iwyVarA = iwy.a(BaseApplication.getContext());
            ivm.e().b(BaseApplication.getContext());
            iwyVarA.m(false);
        }
    }

    @Override // com.huawei.health.sportservice.SportComponent
    public void init() {
        iwy iwyVarA = iwy.a(BaseApplication.getContext());
        int iK = iwyVarA.k();
        this.g = iK;
        ReleaseLogUtil.d("Track_SportServiceHelper", "init mSportType = ", Integer.valueOf(iK));
        c(this.g, iwyVarA.ac());
        ObserverManagerUtil.d(this.f38170c, "com.huawei.plugin.account.logout");
        if (!this.d.isAlreadyInit()) {
            this.d.initModel(a());
        } else if (this.f38169a != null) {
            this.d.setParas(SportParamsType.SPORT_LAUNCH_PARAS, this.f38169a);
        }
    }

    protected void c(int i, int i2) {
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        this.f38169a = sportLaunchParams;
        sportLaunchParams.setSportType(i);
        this.f38169a.setDataSource(i2);
        this.f38169a.setNeedRestart(true);
        ReleaseLogUtil.d("Track_SportServiceHelper", "mSportLaunchParams=", this.f38169a);
    }

    public void c(SportBeat sportBeat) {
        this.d.setParas(SportParamsType.SPORT_BEAT_CHANGE, sportBeat);
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        SportLaunchParams sportLaunchParams = this.f38169a;
        if (sportLaunchParams != null) {
            bundle.putParcelable("bundle_key_sport_launch_paras", sportLaunchParams);
        }
        return bundle;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        if (this.d.getStatus() != 7) {
            ReleaseLogUtil.d("Track_SportServiceHelper", "onPreSport()");
            this.e.onPreSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown() {
        if (this.d.getStatus() != 6) {
            ReleaseLogUtil.d("Track_SportServiceHelper", "onCountDown()");
            this.e.onCountDown();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        if (this.d.getStatus() != 1) {
            ReleaseLogUtil.d("Track_SportServiceHelper", "onStartSport()");
            this.e.onStartSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        if (this.d.getStatus() == 2) {
            ReleaseLogUtil.d("Track_SportServiceHelper", "onResumeSport()");
            this.e.onResumeSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        if (this.d.getStatus() == 1) {
            ReleaseLogUtil.d("Track_SportServiceHelper", "onPauseSport()");
            this.e.onPauseSport();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        if (this.d.getStatus() != 3) {
            ReleaseLogUtil.d("Track_SportServiceHelper", "onStopSport()");
            this.e.m825x32b3e3a1();
        }
    }

    @Override // com.huawei.health.sportservice.SportComponent
    public void destroy() {
        this.d.onDestroy();
        this.d.destroyModel();
        ObserverManagerUtil.a(this.f38170c, "com.huawei.plugin.account.logout");
    }
}
