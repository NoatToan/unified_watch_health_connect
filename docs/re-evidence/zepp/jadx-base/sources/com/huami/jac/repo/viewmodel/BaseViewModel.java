package com.huami.jac.repo.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.arch.core.Fail;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.jac.repo.config.JacConfig;
import com.huami.jac.repo.exception.JacExceptionHandlerApi;
import com.huami.jac.repo.exception.JacNetException;
import com.huami.jac.repo.utils.NetUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0015JV\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/jac/repo/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", TransportUri.ACTION_BLOCK, "startWithLoading", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/MutableLiveData;", "", "time", "Lkotlin/Function0;", "delayed", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "a", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "exceptionHandler", "<init>", "(Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;)V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public class BaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JacExceptionHandlerApi exceptionHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.BaseViewModel$delayed$1", f = "BaseViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Function0<Unit> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = j;
            this.c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.b;
                this.a = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.BaseViewModel$startWithLoading$1", f = "BaseViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ MutableLiveData<State<T>> c;
        public final /* synthetic */ Function1<Continuation<? super State<? extends T>>, Object> d;
        public final /* synthetic */ BaseViewModel e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/arch/core/State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.jac.repo.viewmodel.BaseViewModel$startWithLoading$1$1$1", f = "BaseViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
        public static final class a<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super State<? extends T>>, Object> {
            public int a;
            public final /* synthetic */ Function1<Continuation<? super State<? extends T>>, Object> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super State<? extends T>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws JacNetException {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!NetUtils.INSTANCE.isNetworkConnected(JacConfig.INSTANCE.getApplication().invoke())) {
                        throw new JacNetException(null, null, 3, null);
                    }
                    Function1<Continuation<? super State<? extends T>>, Object> function1 = this.b;
                    this.a = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MutableLiveData<State<T>> mutableLiveData, Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1, BaseViewModel baseViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = mutableLiveData;
            this.d = function1;
            this.e = baseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c.setValue(new Loading());
                    MutableLiveData mutableLiveData2 = this.c;
                    Function1<Continuation<? super State<? extends T>>, Object> function1 = this.d;
                    Result.Companion companion = Result.Companion;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(function1, null);
                    this.b = mutableLiveData2;
                    this.a = 1;
                    Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    obj = objWithContext;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.setValue(obj);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            MutableLiveData<State<T>> mutableLiveData3 = this.c;
            BaseViewModel baseViewModel = this.e;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                StringWriter stringWriter = new StringWriter();
                thM3848exceptionOrNullimpl.printStackTrace(new PrintWriter(stringWriter));
                HMLog.e("onFailure", "---" + stringWriter + "---", new Object[0]);
                mutableLiveData3.setValue(new Fail(thM3848exceptionOrNullimpl));
                baseViewModel.exceptionHandler.handle(thM3848exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public BaseViewModel(@NotNull JacExceptionHandlerApi jacExceptionHandlerApi) {
        this.exceptionHandler = jacExceptionHandlerApi;
    }

    public final void delayed(long time, @NotNull Function0<Unit> block) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(time, block, null), 3, null);
    }

    @Override // androidx.p008lifecycle.ViewModel
    @ExperimentalCoroutinesApi
    public void onCleared() {
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    @NotNull
    public final <T> MutableLiveData<State<T>> startWithLoading(@NotNull MutableLiveData<State<T>> mutableLiveData, @NotNull Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new b(mutableLiveData, function1, this, null), 3, null);
        return mutableLiveData;
    }
}
