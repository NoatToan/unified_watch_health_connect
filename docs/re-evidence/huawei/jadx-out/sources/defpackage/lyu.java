package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;

/* JADX INFO: loaded from: classes10.dex */
public class lyu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41161b = 1;

    public long a(lxg lxgVar) {
        try {
            if (lxgVar == null) {
                LogUtil.j("SyncOptimization", "getLastSyncSecondStageTime fitnessManager is null");
                return 0L;
            }
            String sharedPreference = lxgVar.getSharedPreference("sync_sample_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + mga.e());
            if (TextUtils.isEmpty(sharedPreference)) {
                return -1L;
            }
            return Long.parseLong(sharedPreference, 10);
        } catch (NumberFormatException e) {
            LogUtil.e("SyncOptimization", "getLastSyncSecondStageTime Exception : ", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public void d(lxg lxgVar, long j) {
        if (lxgVar == null) {
            LogUtil.j("SyncOptimization", "setLastSyncSecondStageTime fitnessManager is null");
            return;
        }
        lxgVar.setSharedPreference("sync_sample_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + mga.e(), j + "", null);
    }

    public long e(lxg lxgVar) {
        try {
            if (lxgVar == null) {
                LogUtil.j("SyncOptimization", "getLastSyncStatusSecondStageTime fitnessManager is null");
                return 0L;
            }
            String sharedPreference = lxgVar.getSharedPreference("sync_status_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + mga.e());
            if (TextUtils.isEmpty(sharedPreference)) {
                return -1L;
            }
            return Long.parseLong(sharedPreference, 10);
        } catch (NumberFormatException e) {
            LogUtil.e("SyncOptimization", "getLastSyncSecondStageTime Exception : ", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public void a(lxg lxgVar, long j) {
        if (lxgVar == null) {
            LogUtil.j("SyncOptimization", "setLastSyncStatusSecondStageTime fitnessManager is null");
            return;
        }
        lxgVar.setSharedPreference("sync_status_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + mga.e(), j + "", null);
    }

    public void d(int i) {
        this.f41161b = i;
    }

    public int c() {
        return this.f41161b;
    }
}
