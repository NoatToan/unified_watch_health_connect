package defpackage;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.courseplanservice.api.OnStateListener;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.pluginfitnessadvice.FitWorkout;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = SportServiceApi.class)
@Singleton
public class ghb implements SportServiceApi {
    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public void syncData() {
        gls.b().syncData();
    }

    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public void startDeviceRecordSyncService(OnStateListener onStateListener) {
        glr.b(onStateListener);
    }

    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public void setLastUseOrWatchCourse(String str, long j, FitWorkout fitWorkout) {
        gnr.c(str, j, fitWorkout);
    }

    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public void updateAll() {
        glw.c().b();
    }

    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public FitWorkout getWorkout(String str) {
        return gmc.g().o().a(str);
    }

    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public boolean addUpdateFeedback(String str, pec pecVar) {
        return gmc.g().n().b(str, pecVar);
    }

    @Override // com.huawei.health.courseplanservice.api.SportServiceApi
    public void getFilterTab(String str, UiCallback<Boolean> uiCallback) {
        gls.b().getFilterTab(str, uiCallback);
    }
}
