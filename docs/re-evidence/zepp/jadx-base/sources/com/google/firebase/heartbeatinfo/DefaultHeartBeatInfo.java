package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo;
import com.google.firebase.heartbeatinfo.c;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultHeartBeatInfo implements HeartBeatInfo {
    private static final ThreadFactory d = new ThreadFactory() { // from class: v51
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return DefaultHeartBeatInfo.i(runnable);
        }
    };
    private Provider<c> a;
    private final Set<HeartBeatConsumer> b;
    private final Executor c;

    private DefaultHeartBeatInfo(final Context context, Set<HeartBeatConsumer> set) {
        this(new Lazy(new Provider() { // from class: s51
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return c.d(context);
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), d));
    }

    @NonNull
    public static Component<HeartBeatInfo> component() {
        return Component.builder(HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.setOf(HeartBeatConsumer.class)).factory(new ComponentFactory() { // from class: r51
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatInfo.f(componentContainer);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HeartBeatInfo f(ComponentContainer componentContainer) {
        return new DefaultHeartBeatInfo((Context) componentContainer.get(Context.class), componentContainer.setOf(HeartBeatConsumer.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g() throws Exception {
        ArrayList arrayList = new ArrayList();
        c cVar = this.a.get();
        List<SdkHeartBeatResult> listF = cVar.f(true);
        long jE = cVar.e();
        for (SdkHeartBeatResult sdkHeartBeatResult : listF) {
            boolean zG = c.g(jE, sdkHeartBeatResult.getMillis());
            HeartBeatInfo.HeartBeat heartBeat = zG ? HeartBeatInfo.HeartBeat.COMBINED : HeartBeatInfo.HeartBeat.SDK;
            if (zG) {
                jE = sdkHeartBeatResult.getMillis();
            }
            arrayList.add(HeartBeatResult.create(sdkHeartBeatResult.getSdkName(), sdkHeartBeatResult.getMillis(), heartBeat));
        }
        if (jE > 0) {
            cVar.k(jE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread i(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void j(String str) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.a.get().i(str, jCurrentTimeMillis)) {
            return null;
        }
        this.a.get().j(str, jCurrentTimeMillis);
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public Task<List<HeartBeatResult>> getAndClearStoredHeartBeatInfo() {
        return Tasks.call(this.c, new Callable() { // from class: t51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.g();
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public HeartBeatInfo.HeartBeat getHeartBeatCode(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zI = this.a.get().i(str, jCurrentTimeMillis);
        boolean zH = this.a.get().h(jCurrentTimeMillis);
        if (zI && zH) {
            return HeartBeatInfo.HeartBeat.COMBINED;
        }
        if (zH) {
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return zI ? HeartBeatInfo.HeartBeat.SDK : HeartBeatInfo.HeartBeat.NONE;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public Task<Void> storeHeartBeatInfo(@NonNull final String str) {
        return this.b.size() <= 0 ? Tasks.forResult(null) : Tasks.call(this.c, new Callable() { // from class: u51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.j(str);
            }
        });
    }

    @VisibleForTesting
    public DefaultHeartBeatInfo(Provider<c> provider, Set<HeartBeatConsumer> set, Executor executor) {
        this.a = provider;
        this.b = set;
        this.c = executor;
    }
}
