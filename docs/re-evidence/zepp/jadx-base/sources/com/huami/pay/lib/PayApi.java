package com.huami.pay.lib;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.pay.lib.web.PayWebApiUseCase;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.ProductParam;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0014J\u001e\u0010\u000e\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH'R\u001c\u0010\u0014\u001a\u00020\u000f8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u00020\u001e8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/pay/lib/PayApi;", "", "Lkotlin/Function1;", "Lcom/huami/pay/service/PayProgress;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "payProgress", "notifyProgress", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/huami/pay/service/ProductParam;", "productParam", "pay", "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/pay/lib/web/PayWebApiUseCase;", "b", "Lcom/huami/pay/lib/web/PayWebApiUseCase;", "getPayWebApiUseCase", "()Lcom/huami/pay/lib/web/PayWebApiUseCase;", "payWebApiUseCase", "c", "Lkotlin/jvm/functions/Function1;", "payProgressListener", "Landroid/content/Context;", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class PayApi {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super PayProgress, Unit> payProgressListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PayWebApiUseCase payWebApiUseCase = new PayWebApiUseCase();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Context applicationContext = (Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.PayApi$notifyProgress$1", f = "PayApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PayProgress c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PayProgress payProgress, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = payProgress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PayApi.this.new a(this.c, continuation);
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
            Function1 function1 = PayApi.this.payProgressListener;
            if (function1 != null) {
                function1.invoke(this.c);
            }
            if (this.c instanceof PayProgress.PayEnd) {
                PayApi.this.setListener(null);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @NotNull
    public final PayWebApiUseCase getPayWebApiUseCase() {
        return this.payWebApiUseCase;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }

    public void notifyProgress(@NotNull PayProgress payProgress) {
        e.f(this.scope, Dispatchers.getMain(), null, new a(payProgress, null), 2, null);
    }

    @WorkerThread
    public abstract void pay(@NotNull WeakReference<Activity> weakReferenceActivity, @NotNull ProductParam productParam);

    public final void setListener(@Nullable Function1<? super PayProgress, Unit> listener) {
        this.payProgressListener = listener;
    }
}
