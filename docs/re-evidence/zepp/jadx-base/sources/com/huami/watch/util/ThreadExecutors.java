package com.huami.watch.util;

import androidx.annotation.NonNull;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes11.dex */
public class ThreadExecutors {
    private static final Map<String, ExecutorService> a = new HashMap();

    public class a implements d {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.huami.watch.util.ThreadExecutors.d
        public ExecutorService create() {
            return Executors.newCachedThreadPool(ThreadExecutors.c(this.a));
        }
    }

    public class b implements d {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.huami.watch.util.ThreadExecutors.d
        public ExecutorService create() {
            return Executors.newSingleThreadExecutor(ThreadExecutors.c(this.a));
        }
    }

    public class c implements ThreadFactory {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName(this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + threadNewThread.getName());
            return threadNewThread;
        }
    }

    public interface d {
        ExecutorService create();
    }

    @NonNull
    private static ExecutorService b(String str, d dVar) {
        ExecutorService executorServiceCreate;
        Map<String, ExecutorService> map = a;
        synchronized (map) {
            executorServiceCreate = map.get(str);
            if (executorServiceCreate == null) {
                executorServiceCreate = dVar.create();
                map.put(str, executorServiceCreate);
            }
        }
        return executorServiceCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static ThreadFactory c(String str) {
        return new c(str);
    }

    public static ExecutorService fixed(String str, int i) {
        return b(str, new a(str));
    }

    public static ExecutorService single(String str) {
        return b(str, new b(str));
    }
}
