package com.huami.pai.livedata;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import com.huami.pai.livedata.LoadOnActiveLiveData;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/pai/livedata/LoadOnActiveLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "", "onActive", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "loader", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", SnoreMonitorActivity.PAGE_STARTED, "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LoadOnActiveLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<T> loader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean started = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/pai/livedata/LoadOnActiveLiveData$Companion;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/concurrent/Executor;", "b", ExifInterface.GPS_DIRECTION_TRUE, "executor", "Lkotlin/Function0;", "loader", "Lcom/huami/pai/livedata/LoadOnActiveLiveData;", "create", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.pai.livedata.LoadOnActiveLiveData$Companion$coroutineExecutor$1$1", f = "LoadOnActiveLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Runnable b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Runnable runnable, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = runnable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.run();
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Executor b(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext) {
            return new Executor() { // from class: wp4
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    LoadOnActiveLiveData.Companion.c(coroutineScope, coroutineContext, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Runnable runnable) {
            e.f(coroutineScope, coroutineContext, null, new a(runnable, null), 2, null);
        }

        public static /* synthetic */ LoadOnActiveLiveData create$default(Companion companion, CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                coroutineScope = GlobalScope.INSTANCE;
            }
            if ((i & 2) != 0) {
                coroutineContext = Dispatchers.getDefault();
            }
            return companion.create(coroutineScope, coroutineContext, function0);
        }

        @NotNull
        public final <T> LoadOnActiveLiveData<T> create(@NotNull Executor executor, @NotNull Function0<? extends T> loader) {
            return new LoadOnActiveLiveData<>(executor, loader);
        }

        @NotNull
        public final <T> LoadOnActiveLiveData<T> create(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> loader) {
            return create(b(coroutineScope, coroutineContext), loader);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoadOnActiveLiveData(@NotNull Executor executor, @NotNull Function0<? extends T> function0) {
        this.executor = executor;
        this.loader = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LoadOnActiveLiveData loadOnActiveLiveData) {
        loadOnActiveLiveData.postValue(loadOnActiveLiveData.loader.invoke());
    }

    @Override // androidx.p008lifecycle.LiveData
    public void onActive() {
        super.onActive();
        if (this.started.compareAndSet(false, true)) {
            this.executor.execute(new Runnable() { // from class: tp4
                @Override // java.lang.Runnable
                public final void run() {
                    LoadOnActiveLiveData.b(this.a);
                }
            });
        }
    }
}
