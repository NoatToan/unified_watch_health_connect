package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class exy {
    private static final Handler e = new Handler(Looper.getMainLooper()) { // from class: exy.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: exy.2.3
                @Override // java.lang.Runnable
                public void run() {
                    exy.b();
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && !allStackTraces.isEmpty()) {
                LogUtil.w("H5PRO_WebViewWhiteScreenTracking", "javaBridgeStackTraces: ----------------------------------start");
                for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                    Thread key = entry.getKey();
                    if (key != null && "JavaBridge".equals(key.getName())) {
                        StackTraceElement[] value = entry.getValue();
                        if (value == null || value.length == 0) {
                            LogUtil.w("H5PRO_WebViewWhiteScreenTracking", "javaBridgeStackTraces: no stack info, " + key);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(key);
                            sb.append(" ");
                            sb.append(key.getState());
                            sb.append(System.lineSeparator());
                            for (StackTraceElement stackTraceElement : value) {
                                if (stackTraceElement != null) {
                                    sb.append('\t');
                                    sb.append(stackTraceElement);
                                    sb.append(System.lineSeparator());
                                }
                            }
                            LogUtil.w("H5PRO_WebViewWhiteScreenTracking", "javaBridgeStackTraces: stackTrace -> " + ((Object) sb));
                        }
                    }
                }
                LogUtil.w("H5PRO_WebViewWhiteScreenTracking", "javaBridgeStackTraces: ----------------------------------end");
                LogUtil.logCacheFlushing();
                return;
            }
            LogUtil.w("H5PRO_WebViewWhiteScreenTracking", "javaBridgeStackTraces: allStackTraces is empty");
        } catch (Exception e2) {
            LogUtil.e("H5PRO_WebViewWhiteScreenTracking", "javaBridgeStackTraces: Error occurred", e2);
        }
    }

    public static void a() {
        if (EnvironmentHelper.BuildType.RELEASE == EnvironmentHelper.getInstance().getBuildType()) {
            return;
        }
        Handler handler = e;
        handler.removeMessages(0);
        handler.sendEmptyMessageDelayed(0, 500L);
    }

    public static void d() {
        if (EnvironmentHelper.BuildType.RELEASE == EnvironmentHelper.getInstance().getBuildType()) {
            return;
        }
        e.removeMessages(0);
    }
}
