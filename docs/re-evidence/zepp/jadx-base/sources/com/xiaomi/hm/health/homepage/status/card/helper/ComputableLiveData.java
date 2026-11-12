package com.xiaomi.hm.health.homepage.status.card.helper;

import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/helper/ComputableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/LiveData;", "asLiveData", "", "invalidate", "compute", "()Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "liveData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", GoogleApiAvailabilityLight.a, "computing", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getRefreshRunnable", "()Lkotlin/jvm/functions/Function0;", "refreshRunnable", "f", "invalidationRunnable", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class ComputableLiveData<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<T> liveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean invalid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean computing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> refreshRunnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> invalidationRunnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData$invalidate$1", f = "ComputableLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ComputableLiveData<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComputableLiveData<T> computableLiveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = computableLiveData;
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
            ((ComputableLiveData) this.b).invalidationRunnable.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ComputableLiveData<T> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData$invalidationRunnable$1$1", f = "ComputableLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ComputableLiveData<T> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ComputableLiveData<T> computableLiveData, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = computableLiveData;
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
                this.b.getRefreshRunnable().invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComputableLiveData<T> computableLiveData) {
            super(0);
            this.a = computableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            boolean zHasActiveObservers = ((ComputableLiveData) this.a).liveData.hasActiveObservers();
            if (((ComputableLiveData) this.a).invalid.compareAndSet(false, true) && zHasActiveObservers) {
                e.f(((ComputableLiveData) this.a).coroutineScope, null, null, new a(this.a, null), 3, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ComputableLiveData<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComputableLiveData<T> computableLiveData) {
            super(0);
            this.a = computableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                boolean z = false;
                if (((ComputableLiveData) this.a).computing.compareAndSet(false, true)) {
                    T tCompute = null;
                    boolean z2 = false;
                    while (((ComputableLiveData) this.a).invalid.compareAndSet(true, false)) {
                        try {
                            tCompute = this.a.compute();
                            z2 = true;
                        } catch (Throwable th) {
                            ((ComputableLiveData) this.a).computing.set(false);
                            throw th;
                        }
                    }
                    if (z2) {
                        ((ComputableLiveData) this.a).liveData.postValue(tCompute);
                    }
                    ((ComputableLiveData) this.a).computing.set(false);
                    z = z2;
                }
                if (!z) {
                    return;
                }
            } while (((ComputableLiveData) this.a).invalid.get());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ComputableLiveData(@NotNull CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
        this.liveData = new MutableLiveData<T>(this) { // from class: com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData$liveData$1
            public final /* synthetic */ ComputableLiveData<T> a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData$liveData$1$onActive$1", f = "ComputableLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ ComputableLiveData<T> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ComputableLiveData<T> computableLiveData, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = computableLiveData;
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
                    this.b.getRefreshRunnable().invoke();
                    return Unit.INSTANCE;
                }
            }

            {
                this.a = this;
            }

            @Override // androidx.p008lifecycle.LiveData
            public void onActive() {
                e.f(((ComputableLiveData) this.a).coroutineScope, null, null, new a(this.a, null), 3, null);
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new c(this);
        this.invalidationRunnable = new b(this);
    }

    @NotNull
    public final LiveData<T> asLiveData() {
        return this.liveData;
    }

    @WorkerThread
    @Nullable
    public abstract T compute();

    @NotNull
    public final Function0<Unit> getRefreshRunnable() {
        return this.refreshRunnable;
    }

    public final void invalidate() {
        e.f(this.coroutineScope, Dispatchers.getMain(), null, new a(this, null), 2, null);
    }

    public /* synthetic */ ComputableLiveData(CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GlobalScope.INSTANCE : coroutineScope);
    }
}
