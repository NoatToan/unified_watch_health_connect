package defpackage;

import android.content.Context;
import android.net.Uri;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.service.SleepServiceImpl;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class uit {
    private final Uri f;
    private final Context j;
    private final String d = "from";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50198b = WebViewHelp.BI_KEY_PULL_FROM;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50199c = "resourceName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50197a = "resourceId";
    private final String e = "pullOrder";
    private volatile Boolean h = false;
    private final long i = 120;
    private final WeakReference<uit> g = new WeakReference<>(this);

    public uit(Context context, Uri uri) {
        this.j = context;
        this.f = uri;
    }

    public void c() {
        if (VersionControlUtil.isShowSmartSleepImprovement()) {
            this.h = uag.c((Boolean) null);
            ThreadPoolManager.c().execute(new Runnable() { // from class: uir
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e();
                }
            });
        } else {
            SleepServiceImpl.a(this.j, this.f);
        }
    }

    /* synthetic */ void e() {
        if (this.h == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            uag.e(new d(this.j, this.g, countDownLatch));
            try {
                countDownLatch.await(120L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                LogUtil.e("IntelSleepJumpManager", "open status InterruptedException occurs");
            }
        }
        LogUtil.a("IntelSleepJumpManager", "get open status :", this.h);
        c(this.j, this.f);
    }

    private void c(Context context, Uri uri) {
        if (Boolean.TRUE.equals(this.h)) {
            SleepServiceImpl.a(context, uri);
        } else {
            SleepServiceImpl.a(d("#/distribute", 2));
        }
    }

    private String d(String str, int i) {
        return String.format("%s?%s=%s&%s=%s&%s=%s&%s=%s&%s=%s", str, "from", Integer.valueOf(i), WebViewHelp.BI_KEY_PULL_FROM, this.f.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM), "resourceName", this.f.getQueryParameter("resourceName"), "resourceId", this.f.getQueryParameter("resourceId"), "pullOrder", this.f.getQueryParameter("pullOrder"));
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f50200a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f50201c;
        private final WeakReference<uit> e;

        public d(Context context, WeakReference<uit> weakReference, CountDownLatch countDownLatch) {
            this.f50200a = new WeakReference<>(context);
            this.e = weakReference;
            this.f50201c = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            uit uitVar = this.e.get();
            Context context = this.f50200a.get();
            if (uitVar == null || context == null) {
                LogUtil.e("IntelSleepJumpManager", "KnitSleepDetailActivity is null or context is null");
                CountDownLatch countDownLatch = this.f50201c;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    return;
                }
                return;
            }
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                uitVar.h = bool;
            } else if (i == 23030) {
                uitVar.h = false;
            }
            LogUtil.a("IntelSleepJumpManager", "errorCode: ", Integer.valueOf(i), " isOpen: ", uitVar.h);
            CountDownLatch countDownLatch2 = this.f50201c;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }
}
