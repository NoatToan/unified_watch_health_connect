package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.huawei.haf.download.DownloadPluginCallback;
import com.huawei.haf.language.LanguageManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.up.request.HttpRequestBase;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class iqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile iqb f37954a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37955c;
    private e e;

    private iqb() {
        if (LanguageManager.a()) {
            LanguageManager.a(true);
        }
    }

    public static iqb b() {
        if (f37954a == null) {
            synchronized (iqb.class) {
                if (f37954a == null) {
                    f37954a = new iqb();
                }
            }
        }
        return f37954a;
    }

    public void b(Context context, boolean z) {
        if (LanguageManager.a() && !LanguageManager.c() && this.e == null) {
            if (!CommonUtil.ab(context)) {
                ReleaseLogUtil.e("Login_LanguageUpdate", "isNetworkConnected=false");
                this.f37955c = 6;
                return;
            }
            this.f37955c = 0;
            e eVar = new e(z);
            this.e = eVar;
            int iA = LanguageManager.a(10000, eVar);
            ReleaseLogUtil.d("Login_LanguageUpdate", "start updateLanguagePackage taskNo=", Integer.valueOf(iA));
            if (iA <= 0) {
                this.e = null;
                this.f37955c = 3;
            }
        }
    }

    public void c(int i) {
        boolean z;
        if (LanguageManager.a()) {
            e eVar = this.e;
            boolean z2 = false;
            if (eVar == null) {
                if (this.f37955c == 0) {
                    this.f37955c = b(false, false, 3);
                    return;
                }
                return;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                LogUtil.j("Login_LanguageUpdate", "this is mainThread, waitUpdate thread error.");
                throw new IllegalThreadStateException("waitUpdate not allow InMainThread, please use this in new thread!");
            }
            try {
                try {
                    CountDownLatch countDownLatch = eVar.f37960b;
                    if (LanguageManager.c() || countDownLatch == null) {
                        z = false;
                    } else {
                        z = !countDownLatch.await(i < 0 ? 10000L : i, TimeUnit.MILLISECONDS);
                    }
                    try {
                        ReleaseLogUtil.d("Login_LanguageUpdate", "wait language package update complete. isTimeout=", Boolean.valueOf(z));
                    } catch (InterruptedException e2) {
                        z2 = z;
                        e = e2;
                        LogUtil.e("Login_LanguageUpdate", e.toString());
                        z = z2;
                    }
                } catch (Throwable th) {
                    this.e = null;
                    throw th;
                }
            } catch (InterruptedException e3) {
                e = e3;
            }
            this.e = null;
            this.f37955c = b(z, eVar.f37961c, eVar.d);
        }
    }

    private int b(boolean z, boolean z2, int i) {
        if (LanguageManager.c()) {
            return 0;
        }
        if (z) {
            return z2 ? 8 : 4;
        }
        if (i < 0) {
            return 3;
        }
        return i;
    }

    public void c(Context context, final Handler handler) {
        if (!LanguageManager.a() || context == null || handler == null) {
            return;
        }
        int i = this.f37955c;
        this.f37955c = 0;
        if (i == 0) {
            return;
        }
        ReleaseLogUtil.d("Login_LanguageUpdate", "checkUpdateStatus=", Integer.valueOf(i));
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_service_area_notice_title).a(context.getString(R.string.IDS_download_language_fail, context.getString(R.string.IDS_device_upgrade_file_size_kb, Integer.toString(300)))).a(R.string.IDS_now_retry, new View.OnClickListener() { // from class: iqb.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("Login_LanguageUpdate", "finish MainActivity for cause: DownloadLanguage reStart");
                handler.sendEmptyMessage(12);
            }
        }).e(R.string.IDS_settings_close, new View.OnClickListener() { // from class: iqb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
        c(i + 100, 0, 0L);
    }

    public void a() {
        LanguageManager.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i, int i2, long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("locale=");
        sb.append(Locale.getDefault());
        sb.append(", lang=");
        sb.append(LanguageManager.e(null, true));
        if (i2 > 0) {
            sb.append(", taskNo=");
            sb.append(i2);
            sb.append(", costTime=");
            sb.append(j);
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
        linkedHashMap.put("errorCode", Integer.toString(i));
        linkedHashMap.put(HttpRequestBase.TAG_ERROR_DESC, sb.toString());
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_LANGUAGE_DOWNLOAD_85070031.value(), linkedHashMap);
    }

    static class e implements DownloadPluginCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f37959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f37960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37961c;
        private int d = -1;

        e(boolean z) {
            this.f37960b = z ? new CountDownLatch(1) : null;
            this.f37959a = System.currentTimeMillis();
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public boolean onDownloadPluginResult(int i, String str, int i2) {
            ReleaseLogUtil.d("Login_LanguageUpdate", "onDownloadPluginResult taskNo=", Integer.valueOf(i), ", fileId=", str, ", result=", Integer.valueOf(i2));
            LanguageManager.c(str);
            CountDownLatch countDownLatch = this.f37960b;
            if (countDownLatch == null) {
                return false;
            }
            countDownLatch.countDown();
            return false;
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void startDownloadProgress(int i) {
            this.f37961c = true;
            ReleaseLogUtil.d("Login_LanguageUpdate", "startDownloadProgress taskNo=", Integer.valueOf(i));
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void showDownloadProgress(int i, int i2, int i3) {
            ReleaseLogUtil.d("Login_LanguageUpdate", "showDownloadProgress taskNo=", Integer.valueOf(i), ", progress=", Integer.valueOf(i3));
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void onDownloadResult(int i, int i2) {
            boolean zC = LanguageManager.c();
            if (zC) {
                i2 = 0;
            }
            this.d = i2;
            ReleaseLogUtil.d("Login_LanguageUpdate", "onDownloadResult taskNo=", Integer.valueOf(i), ", reason=", Integer.valueOf(i2), ", result=", Boolean.valueOf(zC));
            iqb.c(this.d, i, System.currentTimeMillis() - this.f37959a);
        }
    }
}
