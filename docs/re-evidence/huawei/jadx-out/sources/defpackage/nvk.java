package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class nvk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43814b;
    private String d;

    public nvk(Context context, String str, String str2) {
        this.f43814b = context;
        this.d = str;
        this.f43813a = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtil.d("AppInstallThread", "run mPath=", this.d, ", mPackageName=", this.f43813a);
        if (this.d == null) {
            LogUtil.e("AppInstallThread", "run mPath is null");
        } else {
            c();
        }
    }

    private void c() {
        String strC = CommonUtil.c(this.d);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("AppInstallThread", "installApkByGuide safePath is null");
            return;
        }
        File file = new File(strC);
        if (file.exists()) {
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            LogUtil.a("AppInstallThread", "installApkByGuide more than Android N");
            Uri uriForFile = FileProvider.getUriForFile(this.f43814b, lrp.f40730c, file);
            LogUtil.a("AppInstallThread", "installApkByGuide content uri is : ", uriForFile);
            intent.setFlags(268435456);
            intent.addFlags(1);
            intent.addFlags(2);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            try {
                intent.putExtra("android.intent.extra.ORIGINATING_UID", BaseApplication.getContext().getPackageManager().getApplicationInfo(BaseApplication.getContext().getPackageName(), 128).uid);
            } catch (PackageManager.NameNotFoundException e) {
                ReleaseLogUtil.d("R_AppInstallThread", "install err:", ExceptionUtils.c(e));
            }
            Activity activityJ = com.huawei.haf.application.BaseApplication.j();
            if (activityJ != null) {
                c(activityJ, intent);
                return;
            } else {
                LogUtil.j("AppInstallThread", "installApkByGuide topActivity is null");
                this.f43814b.startActivity(intent);
                return;
            }
        }
        LogUtil.e("AppInstallThread", "installApkByGuide file not exist");
    }

    private void c(final Activity activity, final Intent intent) {
        activity.runOnUiThread(new Runnable() { // from class: nvk.1
            @Override // java.lang.Runnable
            public void run() {
                activity.startActivityForResult(intent, 0);
            }
        });
    }

    public void a() {
        Thread thread = new Thread(this);
        thread.setName("Ver-AppInstall");
        thread.start();
    }
}
