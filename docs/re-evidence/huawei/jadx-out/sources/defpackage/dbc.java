package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.huawei.hwcommonmodel.application.RunningForegroundListener;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ThirdLoginFreshAccessToken;

/* JADX INFO: loaded from: classes.dex */
public class dbc extends BroadcastReceiver {
    private RunningForegroundListener e;

    public void e(RunningForegroundListener runningForegroundListener) {
        this.e = runningForegroundListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
        LogUtil.b("ForegroundSwitchReceiver", "foreground state changed, isForeground: " + booleanExtra);
        if (booleanExtra) {
            ThirdLoginDataStorageUtil.getAccessTokenFromDb();
            lmf.c(System.currentTimeMillis());
            ThirdLoginFreshAccessToken.c();
        }
        RunningForegroundListener runningForegroundListener = this.e;
        if (runningForegroundListener == null) {
            LogUtil.b("ForegroundSwitchReceiver", "runningForegroundListener is null, return");
            return;
        }
        long longExtra = intent.getLongExtra("time", 0L);
        if (booleanExtra) {
            runningForegroundListener.goForegroundTime(longExtra);
        } else {
            runningForegroundListener.goBackgroundTime(longExtra);
        }
        LogUtil.b("ForegroundSwitchReceiver", "onReceive finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }
}
