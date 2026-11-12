package com.xiaomi.hm.health.devicex.manage.coroutines;

import android.content.res.Resources;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.facebook.appevents.UserDataStore;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u001aB\u0010\r\u001a\u00020\u0004*\u00020\u00002)\b\u0004\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aL\u0010\r\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012)\b\u0004\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000f\u001a:\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0014H\u0086\bø\u0001\u0000\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0016\"\u0019\u0010\u001e\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/Function0;", "", UserDataStore.FIRST_NAME, "safeLaunchOther", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "safeLaunch", "(Landroidx/lifecycle/ViewModel;Lkotlin/jvm/functions/Function2;)V", "(Landroidx/lifecycle/ViewModel;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)V", "K", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LifecycleOwner;", "liveOwner", "Lkotlin/Function1;", "observeNotNull", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/content/res/Resources;", "resource", "Lcom/xiaomi/hm/health/devicex/manage/coroutines/GlobalCoroutineExceptionHandler;", "a", "Lcom/xiaomi/hm/health/devicex/manage/coroutines/GlobalCoroutineExceptionHandler;", "getExceptionHandler", "()Lcom/xiaomi/hm/health/devicex/manage/coroutines/GlobalCoroutineExceptionHandler;", "exceptionHandler", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ExtKt {

    @NotNull
    private static final GlobalCoroutineExceptionHandler a = new GlobalCoroutineExceptionHandler();

    /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt$safeLaunch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt$safeLaunch$1", f = "ext.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16181(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C16181> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C16181 c16181 = new C16181(this.c, continuation);
            c16181.b = obj;
            return c16181;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            this.c.invoke((CoroutineScope) this.b, this);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt$safeLaunch$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt$safeLaunch$2", f = "ext.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, continuation);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            this.c.invoke((CoroutineScope) this.b, this);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt$safeLaunchOther$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt$safeLaunchOther$1", f = "ext.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16191(Function0<Unit> function0, Continuation<? super C16191> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C16191(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                this.b.invoke();
            } catch (Throwable th) {
                HMLog.e("HealthDataViewModel", "error", th);
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            try {
                this.b.invoke();
            } catch (Throwable th) {
                HMLog.e("HealthDataViewModel", "error", th);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final GlobalCoroutineExceptionHandler getExceptionHandler() {
        return a;
    }

    public static final <K> void observeNotNull(@NotNull LiveData<K> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super K, Unit> function1) {
        liveData.observe(lifecycleOwner, new Observer() { // from class: com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt.observeNotNull.1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(K k) {
                if (k == 0) {
                    return;
                }
                try {
                    function1.invoke(k);
                } catch (Exception e) {
                    HMLog.e("ObserveError", e);
                }
            }
        });
    }

    @NotNull
    public static final Resources resource(@NotNull AndroidViewModel androidViewModel) {
        return androidViewModel.getApplication().getResources();
    }

    public static final void safeLaunch(@NotNull ViewModel viewModel, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        e.f(ViewModelKt.getViewModelScope(viewModel), getExceptionHandler(), null, new C16181(function2, null), 2, null);
    }

    public static /* synthetic */ void safeLaunch$default(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        e.f(ViewModelKt.getViewModelScope(viewModel), getExceptionHandler().plus(coroutineDispatcher), null, new AnonymousClass2(function2, null), 2, null);
    }

    public static final void safeLaunchOther(@NotNull ViewModel viewModel, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function0<Unit> function0) {
        e.f(ViewModelKt.getViewModelScope(viewModel), coroutineDispatcher, null, new C16191(function0, null), 2, null);
    }

    public static /* synthetic */ void safeLaunchOther$default(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        e.f(ViewModelKt.getViewModelScope(viewModel), coroutineDispatcher, null, new C16191(function0, null), 2, null);
    }

    public static final void safeLaunch(@NotNull ViewModel viewModel, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        e.f(ViewModelKt.getViewModelScope(viewModel), getExceptionHandler().plus(coroutineDispatcher), null, new AnonymousClass2(function2, null), 2, null);
    }
}
