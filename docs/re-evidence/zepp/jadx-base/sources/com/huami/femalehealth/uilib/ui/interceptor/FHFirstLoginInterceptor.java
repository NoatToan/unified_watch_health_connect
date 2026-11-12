package com.huami.femalehealth.uilib.ui.interceptor;

import android.content.Context;
import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteResponse;
import com.chenenyu.router.RouteStatus;
import com.chenenyu.router.annotation.Interceptor;
import com.huami.femalehealth.uilib.helper.ContextHolder;
import com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt;
import com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity;
import com.huami.femalehealth.uilib.ui.activity.FemaleStartActivity;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes4.dex */
@Interceptor("fh_interceptor_first_login")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/interceptor/FHFirstLoginInterceptor;", "Lcom/chenenyu/router/RouteInterceptor;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/chenenyu/router/RouteInterceptor$Chain;", "chain", "Lcom/chenenyu/router/RouteResponse;", "intercept", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FHFirstLoginInterceptor implements RouteInterceptor {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.ui.interceptor.FHFirstLoginInterceptor", f = "FHFirstLoginInterceptor.kt", i = {}, l = {59}, m = "isFirstTime", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return FHFirstLoginInterceptor.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.ui.interceptor.FHFirstLoginInterceptor$jumpToFemaleHealth$1", f = "FHFirstLoginInterceptor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FHFirstLoginInterceptor.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FHFirstLoginInterceptor fHFirstLoginInterceptor = FHFirstLoginInterceptor.this;
                this.a = 1;
                obj = fHFirstLoginInterceptor.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    Context context = this.c;
                    if (context != null) {
                        FemaleStartActivity.INSTANCE.start(context);
                    }
                } else {
                    Context context2 = this.c;
                    if (context2 != null) {
                        FemaleHealthActivity.INSTANCE.startNewTask(context2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objIsFirstTime = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsFirstTime);
            FemaleMifitViewModel femaleMifitViewModel = (FemaleMifitViewModel) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(FemaleMifitViewModel.class), null, null);
            if (femaleMifitViewModel == null) {
                return null;
            }
            aVar.c = 1;
            objIsFirstTime = femaleMifitViewModel.isFirstTime(aVar);
            if (objIsFirstTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIsFirstTime);
        }
        return (Boolean) objIsFirstTime;
    }

    private final void b(Context context) {
        e.f(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new b(context, null), 2, null);
    }

    @Override // com.chenenyu.router.RouteInterceptor
    @NotNull
    public RouteResponse intercept(@Nullable RouteInterceptor.Chain chain) {
        ContextHolder contextHolder = (ContextHolder) ScopesAndQualifersKt.femaleHealthContextScope(GlobalContext.INSTANCE.get()).getOrNull(Reflection.getOrCreateKotlinClass(ContextHolder.class), null, null);
        b(contextHolder == null ? null : contextHolder.getApp());
        return RouteResponse.assemble(RouteStatus.FAILED, null);
    }
}
