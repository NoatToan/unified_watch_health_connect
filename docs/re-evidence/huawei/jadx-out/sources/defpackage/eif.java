package defpackage;

import android.content.Context;
import com.huawei.btsportdevice.callback.DataLifecycle;
import com.huawei.health.device.PluginDeviceAdapter;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes7.dex */
public class eif implements PluginDeviceAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SportDataOutputApi f33022b;

    private eif() {
        this.f33022b = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static eif f33025b = new eif();
    }

    public static eif a() {
        return b.f33025b;
    }

    @Override // com.huawei.health.device.PluginDeviceAdapter
    public void deviceToSportStrack(Context context) {
        ive.c().e(0, 258, -1, -1.0f, (ISportDataCallback) null, context);
    }

    @Override // com.huawei.health.device.PluginDeviceAdapter
    public void registerStatusFromService(final DataLifecycle dataLifecycle) {
        SportDataOutputApi sportDataOutputApi;
        if (dataLifecycle == null || (sportDataOutputApi = this.f33022b) == null || sportDataOutputApi.getDataSource() != 5) {
            return;
        }
        this.f33022b.registerSportStatus("PluginDeviceAdapterImpl", new SportLifecycle() { // from class: eif.5
            @Override // com.huawei.health.sportservice.SportLifecycle
            public void onPreSport() {
                LogUtil.a("PluginDeviceAdapterImpl", "onPreSport ");
                DataLifecycle dataLifecycle2 = dataLifecycle;
                if (dataLifecycle2 != null) {
                    dataLifecycle2.init();
                }
            }

            @Override // com.huawei.health.sportservice.SportLifecycle
            public void onCountDown() {
                LogUtil.a("PluginDeviceAdapterImpl", "onCountDown ");
            }

            @Override // com.huawei.health.sportservice.SportLifecycle
            public void onStartSport() {
                LogUtil.a("PluginDeviceAdapterImpl", "onStartSport isRestart: " + eif.this.f33022b.isRestart());
                if (dataLifecycle == null || eif.this.f33022b.isRestart()) {
                    return;
                }
                dataLifecycle.onStart();
            }

            @Override // com.huawei.health.sportservice.SportLifecycle
            public void onResumeSport() {
                LogUtil.a("PluginDeviceAdapterImpl", "onResumeSport ");
                DataLifecycle dataLifecycle2 = dataLifecycle;
                if (dataLifecycle2 != null) {
                    dataLifecycle2.onResume();
                }
            }

            @Override // com.huawei.health.sportservice.SportLifecycle
            public void onPauseSport() {
                LogUtil.a("PluginDeviceAdapterImpl", "onPauseSport ");
                DataLifecycle dataLifecycle2 = dataLifecycle;
                if (dataLifecycle2 != null) {
                    dataLifecycle2.onPause();
                }
            }

            @Override // com.huawei.health.sportservice.SportLifecycle
            /* JADX INFO: renamed from: onStopSport */
            public void m825x32b3e3a1() {
                LogUtil.a("PluginDeviceAdapterImpl", "onStopSport ");
                DataLifecycle dataLifecycle2 = dataLifecycle;
                if (dataLifecycle2 != null) {
                    dataLifecycle2.onDestroy();
                }
            }
        });
    }

    @Override // com.huawei.health.device.PluginDeviceAdapter
    public void unregisterStatusFromService() {
        SportDataOutputApi sportDataOutputApi = this.f33022b;
        if (sportDataOutputApi == null || sportDataOutputApi.getDataSource() != 5) {
            return;
        }
        this.f33022b.unRegisterSportStatus("PluginDeviceAdapterImpl");
    }

    @Override // com.huawei.health.device.PluginDeviceAdapter
    public void checkAutoTrackStatus() {
        ive.c();
        ive.e(true);
    }
}
