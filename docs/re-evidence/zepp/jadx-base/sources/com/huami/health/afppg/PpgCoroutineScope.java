package com.huami.health.afppg;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001d\u0010\u000b\u001a\u00020\u00068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\u00020\u00068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/huami/health/afppg/PpgCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "", "a", LogUtil.I, "AVAILABLE_PROCESSORS", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "b", "Lkotlin/Lazy;", "getDEFAULT_DISPATCHER", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "DEFAULT_DISPATCHER", "c", "getNETWORK_DISPATCHER", "NETWORK_DISPATCHER", "Lkotlin/coroutines/CoroutineContext;", GoogleApiAvailabilityLight.a, "()Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "getCoroutineContext", "coroutineContext", "<init>", "()V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PpgCoroutineScope implements CoroutineScope {
    public static final int THREAD_NUM = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy DEFAULT_DISPATCHER = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy NETWORK_DISPATCHER = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy context = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorCoroutineDispatcher invoke() {
            return ExecutorsKt.from(Executors.newSingleThreadExecutor());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorCoroutineDispatcher invoke() {
            return ExecutorsKt.from(Executors.newSingleThreadExecutor());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<CoroutineContext> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineContext invoke() {
            return SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO());
        }
    }

    private final CoroutineContext a() {
        return (CoroutineContext) this.context.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a();
    }

    @NotNull
    public final ExecutorCoroutineDispatcher getDEFAULT_DISPATCHER() {
        return (ExecutorCoroutineDispatcher) this.DEFAULT_DISPATCHER.getValue();
    }

    @NotNull
    public final ExecutorCoroutineDispatcher getNETWORK_DISPATCHER() {
        return (ExecutorCoroutineDispatcher) this.NETWORK_DISPATCHER.getValue();
    }
}
