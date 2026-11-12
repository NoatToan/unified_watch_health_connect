package defpackage;

import android.app.Activity;
import androidx.media3.common.C;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class tfv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f49084b;
    private String d;
    private boolean e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f49083c = {"value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f49082a = {"watchface_enable"};

    public tfv(Activity activity, String str) {
        this.f49084b = activity;
        this.d = str;
        LogUtil.j("PluginOperation_ShowPrivacyDialogHelper", "ShowPrivacyDialogHelper mFrom:", str);
    }

    public void c(int i) {
        if (this.f49084b == null) {
            LogUtil.j("PluginOperation_ShowPrivacyDialogHelper", "gotoWatchFace mActivity is null");
        } else {
            a(i);
        }
    }

    public void e(int i, boolean z) {
        LogUtil.j("PluginOperation_ShowPrivacyDialogHelper", "gotoWatchFace isNeedFinish ", Boolean.valueOf(z));
        this.e = z;
        c(i);
    }

    public void a(int i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String string = Arrays.toString(Thread.currentThread().getStackTrace());
        ThreadPoolManager.c().a("PluginOperation_ShowPrivacyDialogHelper", new Runnable() { // from class: tfv.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.e("PluginOperation_ShowPrivacyDialogHelper", "execute init adapter");
                mca.a(BaseApplication.getContext());
                countDownLatch.countDown();
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("watchFaceInitAar", "stackTraceMessage :" + string);
            }
        });
        try {
            try {
                if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                    LogUtil.e("PluginOperation_ShowPrivacyDialogHelper", "init adapter failed, time is out");
                }
            } catch (InterruptedException unused) {
                LogUtil.e("PluginOperation_ShowPrivacyDialogHelper", "init adapter is interrupted");
                LogUtil.e("PluginOperation_ShowPrivacyDialogHelper", "init adapter failed, time is out");
            }
            mca.b(this.f49084b, i);
            if (!this.e || this.f49084b.isFinishing()) {
                return;
            }
            LogUtil.a("PluginOperation_ShowPrivacyDialogHelper", "gotoDetailOrMarket finish");
            this.f49084b.finish();
        } catch (Throwable th) {
            LogUtil.e("PluginOperation_ShowPrivacyDialogHelper", "init adapter failed, time is out");
            throw th;
        }
    }
}
