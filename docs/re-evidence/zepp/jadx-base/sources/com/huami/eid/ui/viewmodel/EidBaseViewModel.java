package com.huami.eid.ui.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.arch.core.Fail;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.watch.notification.TransportUri;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0015JV\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0004*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/eid/ui/viewmodel/EidBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", TransportUri.ACTION_BLOCK, "startWithLoading", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Function0;", WebConstant.QueryParam.LAUNCH, "<init>", "()V", "eid_release"}, k = 1, mv = {1, 5, 1})
public class EidBaseViewModel extends ViewModel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidBaseViewModel$launch$1", f = "EidBaseViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function0<State<T>> c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: com.huami.eid.ui.viewmodel.EidBaseViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/arch/core/State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidBaseViewModel$launch$1$1$1", f = "EidBaseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0383a<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super State<? extends T>>, Object> {
            public int a;
            public final /* synthetic */ Function0<State<T>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0383a(Function0<? extends State<? extends T>> function0, Continuation<? super C0383a> continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0383a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super State<? extends T>> continuation) {
                return ((C0383a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.invoke();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Object> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return "onFailure:" + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends State<? extends T>> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function0<State<T>> function0 = this.c;
                    Result.Companion companion = Result.Companion;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0383a c0383a = new C0383a(function0, null);
                    this.a = 1;
                    obj = BuildersKt.withContext(io2, c0383a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM3845constructorimpl = Result.m3845constructorimpl((State) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                LogcatKt.info$default(Logcat.INSTANCE, null, new b(thM3848exceptionOrNullimpl), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidBaseViewModel$startWithLoading$1", f = "EidBaseViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ MutableLiveData<State<T>> c;
        public final /* synthetic */ Function1<Continuation<? super State<? extends T>>, Object> d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/arch/core/State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.eid.ui.viewmodel.EidBaseViewModel$startWithLoading$1$1$1", f = "EidBaseViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
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
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
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
        public b(MutableLiveData<State<T>> mutableLiveData, Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = mutableLiveData;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, continuation);
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
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                mutableLiveData3.setValue(new Fail(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final <T> void launch(@NotNull ViewModel viewModel, @NotNull Function0<? extends State<? extends T>> function0) {
        e.f(ViewModelKt.getViewModelScope(viewModel), null, null, new a(function0, null), 3, null);
    }

    @Override // androidx.p008lifecycle.ViewModel
    @ExperimentalCoroutinesApi
    public void onCleared() {
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    @NotNull
    public final <T> MutableLiveData<State<T>> startWithLoading(@NotNull MutableLiveData<State<T>> mutableLiveData, @NotNull Function1<? super Continuation<? super State<? extends T>>, ? extends Object> function1) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new b(mutableLiveData, function1, null), 3, null);
        return mutableLiveData;
    }
}
