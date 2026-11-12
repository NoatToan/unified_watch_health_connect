package defpackage;

import android.os.Looper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jxb {
    public static void e() {
        ReleaseLogUtil.d("R_SportRecordImageDownloadUtil", "enter downloadSportRecordImage");
        ThreadPoolManager.c().execute(new Runnable() { // from class: jxd
            @Override // java.lang.Runnable
            public final void run() {
                jxb.d();
            }
        });
    }

    public static void b() {
        ReleaseLogUtil.d("R_SportRecordImageDownloadUtil", "enter downloadSportRecordImage");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jxc
                @Override // java.lang.Runnable
                public final void run() {
                    jxb.b();
                }
            });
        } else if (a(86400000L)) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        HashMap map = new HashMap(10);
        map.put("configType", "SportRecord");
        if (CommonUtil.bu()) {
            map.put("configVersion", "Release_001");
        } else {
            map.put("configVersion", "Beta_001");
        }
        fda fdaVar = new fda("com.huawei.health_Sport_Common", map);
        fdy.c(new fdc.b().b(fdaVar).b("sport_record_image").a(fdy.d("com.huawei.health_Sport_Common", "sport_record_image", ".zip")).e(true).a(new DownloadCallback<fcz>() { // from class: jxb.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFinish(fcz fczVar) {
                ReleaseLogUtil.d("R_SportRecordImageDownloadUtil", "downloadSportRecordImage finish isFromCloud = ", Boolean.valueOf(fczVar.b()));
                if (fczVar.b()) {
                    jxb.d(fdy.d("com.huawei.health_Sport_Common", "sport_record_image", ".zip"), fdy.d("com.huawei.health_Sport_Common", "", (String) null));
                    fdy.c(System.currentTimeMillis(), "com.huawei.health_Sport_Common_sport_record_image");
                }
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.e("R_SportRecordImageDownloadUtil", "downloadSportRecordImage fail errCode = ", Integer.valueOf(i));
            }
        }).a());
    }

    private static boolean a(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - fdy.c("com.huawei.health_Sport_Common_sport_record_image");
        if (jCurrentTimeMillis >= j || jCurrentTimeMillis <= 0) {
            return true;
        }
        ReleaseLogUtil.d("R_SportRecordImageDownloadUtil", "isLastUpdateExpire = false");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str, String str2) {
        if (fek.a(str, str2) != -1) {
            LogUtil.a("SportRecordImageDownloadUtil", "unzipFile success");
            b(str);
            return true;
        }
        LogUtil.j("SportRecordImageDownloadUtil", "unzipFile fail");
        return false;
    }

    private static boolean b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.j("SportRecordImageDownloadUtil", "removeFile file is not exist");
            return false;
        }
        if (file.isDirectory()) {
            LogUtil.j("SportRecordImageDownloadUtil", "removeFile file is directory");
            return false;
        }
        return file.delete();
    }
}
