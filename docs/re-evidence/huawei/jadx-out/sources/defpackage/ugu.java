package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class ugu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UiCallback<String> f50066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ugv> f50068c;
    private volatile List<ugv> d;
    private long f;
    private long h;
    private volatile boolean i;
    private Handler e = new Handler(Looper.getMainLooper()) { // from class: ugu.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (ugu.this.i) {
                LogUtil.j("Stress_DownloadTask", "cancel task!");
                return;
            }
            int i = message.what;
            if (i == 1) {
                removeCallbacksAndMessages(null);
                ugu.this.f50066a.onSuccess(null);
                return;
            }
            if (i == 2) {
                ugu.this.i = true;
                removeCallbacksAndMessages(null);
                ugu.this.f50066a.onFailure(message.arg1, String.valueOf(message.obj));
                return;
            }
            if (i == 3) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - ugu.this.f;
                if (j < 0 || j > 10) {
                    ugu.this.f = jCurrentTimeMillis;
                    ugu.this.f50066a.onProgress(ugq.d(ugu.this.f50068c), ugu.this.h);
                    return;
                } else {
                    LogUtil.a("Stress_DownloadTask", "dTime !< 0 or dTime !> 10");
                    return;
                }
            }
            if (i != 4) {
                if (i == 5) {
                    ugu.this.d((ugv) message.obj);
                    return;
                } else {
                    LogUtil.a("Stress_DownloadTask", "DownloadTask handleMessage default");
                    return;
                }
            }
            ugu.this.i = true;
            removeCallbacksAndMessages(null);
            LogUtil.a("Stress_DownloadTask", "DownloadTask cancle");
            ugu.this.f50066a.onSuccess("cancel");
            ugu.this.f50066a = null;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile List<ugv> f50067b = new LinkedList();
    private AtomicInteger g = new AtomicInteger();

    public ugu(List<ugv> list, long j, UiCallback<String> uiCallback) {
        this.f50068c = list;
        this.d = a(list);
        this.h = j;
        this.f50066a = new a(uiCallback);
    }

    public void b() {
        LogUtil.a("Stress_DownloadTask", "run() = ", 0);
        UiCallback<String> uiCallback = this.f50066a;
        if (uiCallback == null || uiCallback.isCanceled()) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        ugv ugvVarE = e();
        if (ugvVarE == null) {
            return false;
        }
        LogUtil.a("Stress_DownloadTask", "getDownloadFlag() in");
        UiCallback<String> uiCallback = this.f50066a;
        if (uiCallback != null && uiCallback.isCanceled()) {
            this.e.obtainMessage(4, -2, 0, ugz.b(-2)).sendToTarget();
            return false;
        }
        d(ugvVarE);
        return true;
    }

    private ugv e() {
        ugv ugvVar;
        synchronized (this) {
            if (this.d.size() != 0) {
                ugvVar = this.d.get(0);
                this.d.remove(ugvVar);
                this.f50067b.add(ugvVar);
            } else {
                ugvVar = null;
            }
        }
        return ugvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ugv ugvVar) {
        synchronized (this) {
            this.f50067b.remove(ugvVar);
            return this.f50067b.size() == 0 && this.d.size() == 0;
        }
    }

    private List<ugv> a(List<ugv> list) {
        LinkedList linkedList = new LinkedList();
        for (ugv ugvVar : list) {
            if (!ugvVar.b()) {
                linkedList.add(ugvVar);
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ugv ugvVar) {
        if (this.i) {
            return;
        }
        if (this.f50066a.isCanceled()) {
            this.e.obtainMessage(4, -2, 0, ugz.b(-2)).sendToTarget();
        } else {
            LogUtil.a("Stress_DownloadTask", "startDownload() in");
            ugs.e().downloadFile(ugvVar.d(), ugvVar.c(), new DataCallback() { // from class: ugu.1
                @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
                public void onFailure(int i, String str) {
                    if (ugu.this.f50066a.isCanceled()) {
                        return;
                    }
                    if (ugu.this.g.addAndGet(1) > 3 || i == -2) {
                        ugu.this.e.obtainMessage(2, i, 0, str).sendToTarget();
                    } else {
                        ugvVar.b(0L);
                        ugu.this.e.sendMessageDelayed(ugu.this.e.obtainMessage(5, ugvVar), 1000L);
                    }
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    ugvVar.e(true);
                    ugv ugvVar2 = ugvVar;
                    ugvVar2.b(ugvVar2.e());
                    LogUtil.a("Stress_DownloadTask", "startDownload() ", ugvVar.d(), " downLoadSuccess");
                    if (ugu.this.f50066a != null) {
                        ugu.this.e.sendEmptyMessage(3);
                        if (!ugu.this.b(ugvVar)) {
                            LogUtil.a("Stress_DownloadTask", "startDownload() no end，keep on");
                            ugu.this.d();
                        } else {
                            LogUtil.a("Stress_DownloadTask", "startDownload() all downLoad end");
                            ugu.this.e.sendEmptyMessage(1);
                        }
                    }
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
                public void onProgress(long j, long j2, boolean z) {
                    ugv ugvVar2 = ugvVar;
                    ugvVar2.b(Math.min(j, ugvVar2.e()));
                    ugu.this.e.sendEmptyMessage(3);
                }
            });
        }
    }

    static class a extends UiCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UiCallback f50070b;

        a(UiCallback uiCallback) {
            this.f50070b = uiCallback;
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public void onFailure(int i, String str) {
            if (this.f50070b.isCanceled()) {
                return;
            }
            this.f50070b.onFailure(i, str);
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public void onSuccess(Object obj) {
            if (this.f50070b.isCanceled()) {
                return;
            }
            this.f50070b.onSuccess(obj);
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public void onProgress(long j, long j2) {
            if (this.f50070b.isCanceled()) {
                return;
            }
            this.f50070b.onProgress(j, j2);
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public boolean isCanceled() {
            return this.f50070b.isCanceled();
        }
    }
}
