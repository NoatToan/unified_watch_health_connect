package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;

/* JADX INFO: loaded from: classes11.dex */
public class mpd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42109c = 1;

    public long a(mpg mpgVar) {
        try {
            if (mpgVar == null) {
                LogUtil.j("SyncOptimization", "getLastSyncSecondStageTime fitnessManager is null");
                return 0L;
            }
            String sharedPreference = mpgVar.getSharedPreference("sync_sample_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + myo.b());
            if (TextUtils.isEmpty(sharedPreference)) {
                return -1L;
            }
            return Long.parseLong(sharedPreference, 10);
        } catch (NumberFormatException e) {
            LogUtil.e("SyncOptimization", "getLastSyncSecondStageTime Exception : ", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public void c(mpg mpgVar, long j) {
        if (mpgVar == null) {
            LogUtil.j("SyncOptimization", "setLastSyncSecondStageTime fitnessManager is null");
            return;
        }
        mpgVar.setSharedPreference("sync_sample_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + myo.b(), j + "", null);
    }

    public long c(mpg mpgVar) {
        try {
            if (mpgVar == null) {
                LogUtil.j("SyncOptimization", "getLastSyncStatusSecondStageTime fitnessManager is null");
                return 0L;
            }
            String sharedPreference = mpgVar.getSharedPreference("sync_status_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + myo.b());
            if (TextUtils.isEmpty(sharedPreference)) {
                return -1L;
            }
            return Long.parseLong(sharedPreference, 10);
        } catch (NumberFormatException e) {
            LogUtil.e("SyncOptimization", "getLastSyncSecondStageTime Exception : ", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public void a(mpg mpgVar, long j) {
        if (mpgVar == null) {
            LogUtil.j("SyncOptimization", "setLastSyncStatusSecondStageTime fitnessManager is null");
            return;
        }
        mpgVar.setSharedPreference("sync_status_stage_2_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "_" + myo.b(), j + "", null);
    }

    public void c(int i) {
        this.f42109c = i;
    }

    public int b() {
        return this.f42109c;
    }
}
