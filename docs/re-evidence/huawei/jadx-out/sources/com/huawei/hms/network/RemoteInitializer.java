package com.huawei.hms.network;

import android.content.Context;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteInitializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14454b = "RemoteInitializer";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f14455c = "huawei_module_networkkit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14456a;

    /* JADX INFO: loaded from: classes34.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f14462a = "req_start_time";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f14463b = "total_time";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f14464c = "error_code";
        private static final String d = "exception_name";
        private static final String e = "message";
        private static final String f = "split_modules_msg";
        private static final String g = "split_module";
        public static final String h = "kit_version";
        public static final String i = "network_load_analytics";
        private static final int j = 10000900;
        private static final int k = 10000901;
    }

    boolean isInited() {
        return this.f14456a != null;
    }

    public Future init(Context context) {
        Future<?> futureSubmit;
        synchronized (this) {
            ExecutorService executorServiceNewSingleThreadExecutor = ExecutorsUtils.newSingleThreadExecutor("Loading_NetworkKit");
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new a(context, executorServiceNewSingleThreadExecutor));
        }
        return futureSubmit;
    }

    Context getRemoteContext() {
        return this.f14456a;
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f14458b;

        /* JADX INFO: renamed from: com.huawei.hms.network.RemoteInitializer$a$a, reason: collision with other inner class name */
        class RunnableC0158a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ LinkedHashMapPack f14460a;

            @Override // java.lang.Runnable
            public void run() {
                PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(a.this.f14457a, b.i);
                for (Map.Entry<String, String> entry : this.f14460a.getAll().entrySet()) {
                    pLSharedPreferences.putString(entry.getKey(), entry.getValue());
                }
            }

            RunnableC0158a(LinkedHashMapPack linkedHashMapPack) {
                this.f14460a = linkedHashMapPack;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
            linkedHashMapPack.put("req_start_time", Utils.getCurrentTime(false));
            long currentTime = Utils.getCurrentTime(true);
            RemoteInitializer remoteInitializer = RemoteInitializer.this;
            remoteInitializer.f14456a = remoteInitializer.a(RemoteInitializer.f14455c, this.f14457a, linkedHashMapPack);
            linkedHashMapPack.put("total_time", Utils.getCurrentTime(true) - currentTime);
            this.f14458b.execute(new RunnableC0158a(linkedHashMapPack));
        }

        a(Context context, ExecutorService executorService) {
            this.f14457a = context;
            this.f14458b = executorService;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context a(String str, Context context, LinkedHashMapPack linkedHashMapPack) {
        DynamicModule.enable3rdPhone(str, true);
        DynamicModule.enableLowEMUI(str, true);
        try {
            Context moduleContext = DynamicModule.loadV2(context, DynamicModule.PREFER_REMOTE, str).getModuleContext();
            linkedHashMapPack.put("error_code", 10000900L);
            return moduleContext;
        } catch (DynamicModule.LoadingException e) {
            linkedHashMapPack.put("exception_name", e.getClass().getName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(e.getMessage()));
            linkedHashMapPack.put("error_code", 10000901L);
            Logger.w(f14454b, " load module " + str + " failed " + StringUtils.anonymizeMessage(e.getMessage()));
            return null;
        }
    }

    RemoteInitializer() {
    }
}
