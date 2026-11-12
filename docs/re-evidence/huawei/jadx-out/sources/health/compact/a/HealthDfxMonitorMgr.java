package health.compact.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.apms.APMS;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.dfx.DfxMonitorMgr;
import com.huawei.haf.common.dfx.block.MainThreadMonitor;
import com.huawei.haf.common.dfx.block.ThreadPoolMonitor;
import com.huawei.haf.common.dfx.crash.CrashMonitor;
import com.huawei.haf.common.dfx.memory.MemoryMonitor;
import com.huawei.haf.common.dfx.process.ProcessMonitor;
import com.huawei.haf.common.dfx.storage.StorageMonitor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwappdfxmgr.crashmgr.HealthAnrHandler;
import com.huawei.hwappdfxmgr.crashmgr.HealthCrashHandler;
import com.huawei.hwappdfxmgr.crashmgr.HealthMemoryHandler;
import com.huawei.hwappdfxmgr.crashmgr.HealthThreadPoolHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import defpackage.llg;
import defpackage.llh;
import defpackage.llk;
import defpackage.llp;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HealthDfxMonitorMgr implements DfxMonitorMgr {
    @Override // com.huawei.haf.common.dfx.DfxMonitorMgr
    public void onTrimMemory(Context context, String str, int i) {
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorMgr
    public void installMonitor(Context context) {
        DfxBaseHandler.setLogRootDir(new File(CommonUtil.m(context)));
        HealthCrashHandler healthCrashHandler = new HealthCrashHandler();
        healthCrashHandler.c();
        CrashMonitor.d(healthCrashHandler);
        ThreadPoolMonitor.e(new HealthThreadPoolHandler());
        if (!EnvironmentUtils.d()) {
            MainThreadMonitor.e(new HealthAnrHandler());
        } else {
            StorageMonitor.a(new llk());
        }
        MemoryMonitor.a(new HealthMemoryHandler());
        if (com.huawei.hwlogsmodel.common.LogConfig.a()) {
            MemoryMonitor.e();
        }
        llp.c(new llh());
        List<String> listC = llg.c();
        if (listC.contains(ProcessUtil.c()) && AuthorizationUtils.c(BaseApplication.getContext())) {
            ProcessMonitor.c(listC, new llg());
        }
        e();
        c();
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorMgr
    public void uninstallMonitor(Context context) {
        MemoryMonitor.c();
        MainThreadMonitor.e();
        ThreadPoolMonitor.c();
        StorageMonitor.a();
        CrashMonitor.b();
        llp.c();
        ProcessMonitor.a();
        e();
    }

    private boolean a() {
        boolean zO = Utils.o();
        boolean z = CommonUtil.ao() || CommonUtil.ap() || CommonUtil.bu();
        boolean zB = EnvironmentUtils.b();
        boolean zC = AuthorizationUtils.c(null);
        boolean zG = Utils.g();
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_HealthDfxMonitorMgr", "checkIfEnableApms isAgcApmsEnabled: ", true, " isNotOversea:", Boolean.valueOf(!zO), " isVersionOk:", Boolean.valueOf(z), " isNotDaemonServiceProcess:", Boolean.valueOf(!zB), " isAuthorized:", Boolean.valueOf(zC), " isConfigSupportApms:", Boolean.valueOf(zG));
        return z && !zB && zC && zG;
    }

    private void c() {
        if (a()) {
            if (AGConnectInstance.getInstance() == null) {
                AGConnectInstance.initialize(com.huawei.haf.application.BaseApplication.b());
            }
            APMS.getInstance().start(com.huawei.haf.application.BaseApplication.b());
            ThreadPoolManager.c().execute(new Runnable() { // from class: health.compact.a.HealthDfxMonitorMgr.2
                @Override // java.lang.Runnable
                public void run() {
                    APMS.getInstance().setCollectionUrl(GRSManager.c(BaseApplication.getContext()).getUrl("biOperation"));
                    APMS.getInstance().enableAnrMonitor(true);
                    APMS.getInstance().enableCollection(true);
                    String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011);
                    if (TextUtils.isEmpty(accountInfo)) {
                        return;
                    }
                    String strD = Sha256.d(accountInfo, "SHA-256");
                    com.huawei.hwlogsmodel.LogUtil.a("HealthDfxMonitorMgr", "For AiOps, user huid is ", strD);
                    APMS.getInstance().setUserIdentifier(strD);
                }
            });
        }
    }

    private void e() {
        if (a()) {
            if (AGConnectInstance.getInstance() == null) {
                AGConnectInstance.initialize(com.huawei.haf.application.BaseApplication.b());
            }
            APMS.getInstance().enableAnrMonitor(false);
            APMS.getInstance().enableCollection(false);
        }
    }
}
