package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import com.huawei.hwversionmgr.utils.handler.AppDownloadHandler;
import com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler;
import health.compact.a.CommonUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public class nux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ExecutorService f43780a = Executors.newFixedThreadPool(3);

    public void e(Context context, AppPullChangeLogHandler appPullChangeLogHandler, boolean z, boolean z2, boolean z3) {
        nvl.e(false);
        new nvl(context, appPullChangeLogHandler, z, z2, z3).e();
    }

    public void d(Context context, AppPullChangeLogHandler appPullChangeLogHandler, boolean z, String str, String str2) {
        LogUtil.a("HwSelfUpdate", "startAw70SaveChangeLog: ", str2);
        nvl.e(false);
        nvl.b(str2);
        nvl.e(str);
        new nvl(context, appPullChangeLogHandler, z, true, false).e();
    }

    public void c(Context context, AppPullChangeLogHandler appPullChangeLogHandler, boolean z, String str, String str2) {
        LogUtil.a("HwSelfUpdate", "startSaveChangeLog: ", str2);
        nvl.e(false);
        nvl.b(str2);
        nvl.e(str);
        new nvl(context, appPullChangeLogHandler, z, false, false).e();
    }

    public void b(Context context, String str, String str2) {
        nuw.e(context, str, str2);
    }

    public void a(Context context, AppDownloadHandler appDownloadHandler, boolean z, boolean z2, boolean z3) {
        c(Boolean.valueOf(z), z2, z3);
        f43780a.execute(new nvw(context, appDownloadHandler, z, z2, z3));
        nun nunVar = new nun();
        nunVar.e(1);
        if (CommonUtil.bt()) {
            nunVar.d(CommonUtil.q());
        } else {
            nunVar.d(CommonUtil.k(context));
        }
        if (z) {
            if (nuw.b() != null) {
                nunVar.e(nuw.b().w());
            }
        } else if (z2) {
            if (nuw.c() != null) {
                nunVar.e(nuw.c().w());
            }
        } else if (z3) {
            if (nuw.o() != null) {
                nunVar.e(nuw.o().w());
            }
        } else if (nuw.a() != null) {
            nunVar.e(nuw.a().w());
        }
        if (z2) {
            nunVar.b(nuw.c(nuw.d(), context));
        } else if (z3) {
            nunVar.b(nuw.c(nuw.n(), context));
        } else {
            nunVar.b(nuw.c(nuw.h(), context));
        }
        nunVar.c("");
        f43780a.execute(new nvt(nunVar, z, z3));
    }

    private void c(Boolean bool, boolean z, boolean z2) {
        LogUtil.d("HwSelfUpdate", "startDownloadApp isApp:", bool, " isAW70:", Boolean.valueOf(z), " isScale ", Boolean.valueOf(z2));
        long jF = nuw.f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.d("HwSelfUpdate", "downloadStartTime = ", Long.valueOf(jF), "; currentTime = ", Long.valueOf(jCurrentTimeMillis));
        LogUtil.d("HwSelfUpdate", "start download");
        nvu.a(true);
        nuw.b(jCurrentTimeMillis);
    }

    public void b(PackageInfo packageInfo, nus nusVar, Context context, AppCheckNewVersionHandler appCheckNewVersionHandler) {
        LogUtil.d("HwSelfUpdate", "startCheckNewVersionForBone");
        if (nusVar == null) {
            LogUtil.j("HwSelfUpdate", "versionForBoneInfo is null");
            return;
        }
        nvq nvqVar = new nvq(context, packageInfo.packageName, appCheckNewVersionHandler, nusVar);
        nvqVar.b(packageInfo);
        nvqVar.e(nusVar.h());
        nvq.a(false);
        f43780a.execute(nvqVar);
    }

    public void c(PackageInfo packageInfo, Context context, AppCheckNewVersionHandler appCheckNewVersionHandler, String str, String str2) {
        LogUtil.d("HwSelfUpdate", "startCheckScaleNewVersionForBone");
        nvv nvvVar = new nvv(context, packageInfo.packageName, appCheckNewVersionHandler, str, str2);
        nvvVar.c(packageInfo);
        nvq.a(false);
        f43780a.execute(nvvVar);
    }

    public void e() {
        LogUtil.d("HwSelfUpdate", "cancelDownloadApp");
        nuw.b(-1L);
        nvu.a(true);
    }
}
