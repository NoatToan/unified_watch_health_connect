package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.CardCategory;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.IssuerViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.na4;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssuerViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "", "productId", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "success", "fail", "findSeCardBydProductId", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "targetProductId", "Lkotlin/Function0;", "findMiCard", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "findPrivateSeCard", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIssuerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerViewModel.kt\ncom/xiaomi/fitness/nfc/ui/IssuerViewModel\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,83:1\n629#2,8:84\n*S KotlinDebug\n*F\n+ 1 IssuerViewModel.kt\ncom/xiaomi/fitness/nfc/ui/IssuerViewModel\n*L\n52#1:84,8\n*E\n"})
public final class IssuerViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.IssuerViewModel$findPrivateSeCard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.IssuerViewModel$findPrivateSeCard$1", f = "IssuerViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $productId;
        final /* synthetic */ Function1<CardWrapper, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.IssuerViewModel$findPrivateSeCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.IssuerViewModel$findPrivateSeCard$1$1", f = "IssuerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $productId;
            final /* synthetic */ Function1<CardWrapper, Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.IssuerViewModel$findPrivateSeCard$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.IssuerViewModel$findPrivateSeCard$1$1$1", f = "IssuerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CardWrapper $cardWrapper;
                final /* synthetic */ Function1<CardWrapper, Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C06791(Function1<? super CardWrapper, Unit> function1, CardWrapper cardWrapper, Continuation<? super C06791> continuation) {
                    super(2, continuation);
                    this.$success = function1;
                    this.$cardWrapper = cardWrapper;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06791(this.$success, this.$cardWrapper, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success.invoke2(this.$cardWrapper);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06781(String str, Function1<? super CardWrapper, Unit> function1, Continuation<? super C06781> continuation) {
                super(2, continuation);
                this.$productId = str;
                this.$success = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06781(this.$productId, this.$success, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws AuthApiException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AnyExtKt.main$default(null, new C06791(this.$success, s3q.f0().V(this.$productId, CardCategory.PROPRIETARY_CAR_KEY), null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super CardWrapper, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$productId = str;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$productId, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06781 c06781 = new C06781(this.$productId, this.$success, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06781, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findMiCard$lambda$5(Function1 success, String targetProductId, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(targetProductId, "$targetProductId");
        Intrinsics.checkNotNull(list);
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        for (Object obj : list) {
            if (StringsKt__StringsJVMKt.equals(targetProductId, ((CardWrapper) obj).getProductId(), true)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                TypeIntrinsics.asMutableList(listEmptyList).add(obj);
            }
        }
        success.invoke2((CardWrapper) CollectionsKt___CollectionsKt.firstOrNull(listEmptyList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findMiCard$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findMiCard$lambda$7(Function0 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("findMiCard err ", th);
        fail.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findMiCard$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findSeCardBydProductId$lambda$0(Function1 success, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findSeCardBydProductId$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findSeCardBydProductId$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("CardIntroFragment updateCard err ", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findSeCardBydProductId$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void findMiCard(@NotNull final String targetProductId, @NotNull final Function1<? super CardWrapper, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(targetProductId, "targetProductId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<List<CardWrapper>> o4hVarD0 = s3q.f0().d0();
        final Function1 function1 = new Function1() { // from class: xmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerViewModel.findMiCard$lambda$5(success, targetProductId, (List) obj);
            }
        };
        bg4<? super List<CardWrapper>> bg4Var = new bg4() { // from class: ymd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerViewModel.findMiCard$lambda$6(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: zmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerViewModel.findMiCard$lambda$7(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarD0.O(bg4Var, new bg4() { // from class: and
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerViewModel.findMiCard$lambda$8(function2, obj);
            }
        }));
    }

    public final void findPrivateSeCard(@NotNull String productId, @NotNull Function1<? super CardWrapper, Unit> success) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(success, "success");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(productId, success, null), 3, null);
    }

    public final void findSeCardBydProductId(@NotNull String productId, @NotNull final Function1<? super CardWrapper, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<CardWrapper> o4hVarR = s3q.f0().R(productId);
        final Function1 function1 = new Function1() { // from class: bnd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerViewModel.findSeCardBydProductId$lambda$0(success, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: cnd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerViewModel.findSeCardBydProductId$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: dnd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerViewModel.findSeCardBydProductId$lambda$2(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarR.O(bg4Var, new bg4() { // from class: end
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerViewModel.findSeCardBydProductId$lambda$3(function2, obj);
            }
        }));
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
