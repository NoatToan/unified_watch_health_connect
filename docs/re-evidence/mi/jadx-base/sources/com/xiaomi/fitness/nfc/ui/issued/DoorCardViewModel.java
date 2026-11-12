package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.CloudKeyCardOperation;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel;
import defpackage.bg4;
import defpackage.gmg;
import defpackage.ltg;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J2\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ6\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ0\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ0\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ.\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ\"\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000eJ\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/DoorCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "backup2cloud", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "success", "Lkotlin/Function0;", "fail", "Lkotlin/Function1;", "", "removeBackupCloudCard", "updateCard", "setDefailtCard", "removeCard", "getDefaultAid", "loadCardSwitchList", "supportCallback", "", "cardSwitchRet", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "getCardSwitchRet", "()Landroidx/lifecycle/MutableLiveData;", "cardSwitchRet$delegate", "Lkotlin/Lazy;", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DoorCardViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: cardSwitchRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardSwitchRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o27
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DoorCardViewModel.cardSwitchRet_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1", f = "DoorCardViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06941(Function0<Unit> function0, Continuation<? super C06941> continuation) {
                    super(2, continuation);
                    this.$success = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06941(this.$success, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success.invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$backup2cloud$1$1$2", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ BaseResponse $baseResponse;
                final /* synthetic */ Function1<String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super String, Unit> function1, BaseResponse baseResponse, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$fail = function1;
                    this.$baseResponse = baseResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$fail, this.$baseResponse, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke2(this.$baseResponse.mMsg);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06931(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C06931> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$success = function0;
                this.$fail = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06931(this.$cardWrapper, this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BaseResponse baseResponseBackup = this.$cardWrapper.mSeCard.backup();
                vqg.d("backup2cloud baseResponse:" + baseResponseBackup.mResultCode + " mMsg:" + baseResponseBackup.mMsg);
                if (baseResponseBackup.isSuccess()) {
                    AnyExtKt.main$default(null, new C06941(this.$success, null), 1, null);
                } else {
                    AnyExtKt.main$default(null, new AnonymousClass2(this.$fail, baseResponseBackup, null), 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$success = function0;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cardWrapper, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06931 c06931 = new C06931(this.$cardWrapper, this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06931, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$getDefaultAid$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$getDefaultAid$1", f = "DoorCardViewModel.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function1<String, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$getDefaultAid$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$getDefaultAid$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function1<String, Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06951(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C06951> continuation) {
                super(2, continuation);
                this.$success = function1;
                this.$fail = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06951(this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String strC;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    String strB = ltg.c().b();
                    Function1<String, Unit> function1 = this.$success;
                    Intrinsics.checkNotNull(strB);
                    function1.invoke2(strB);
                } catch (Exception e) {
                    vqg.c("defaultCard", e);
                    if (e instanceof AuthApiException) {
                        AuthApiException authApiException = (AuthApiException) e;
                        strC = authApiException.mErrorCode + ", " + authApiException.mErrorMsg;
                    } else {
                        strC = gmg.c(e);
                    }
                    Function1<String, Unit> function2 = this.$fail;
                    Intrinsics.checkNotNull(strC);
                    function2.invoke2(strC);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26971(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C26971> continuation) {
            super(2, continuation);
            this.$success = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26971(this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06951 c06951 = new C06951(this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06951, this) == coroutine_suspended) {
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
            return ((C26971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$loadCardSwitchList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$loadCardSwitchList$1", f = "DoorCardViewModel.kt", i = {}, l = {233, 239}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<Boolean, Unit> $supportCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26981(Function1<? super Boolean, Unit> function1, CardWrapper cardWrapper, Continuation<? super C26981> continuation) {
            super(2, continuation);
            this.$supportCallback = function1;
            this.$cardWrapper = cardWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DoorCardViewModel.this.new C26981(this.$supportCallback, this.$cardWrapper, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x0053, B:23:0x0057, B:24:0x0060, B:18:0x003f), top: B:30:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CardSwitcherBean cardSwitcherBean;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cardSwitcherBean = (CardSwitcherBean) obj;
                    if (cardSwitcherBean != null) {
                        DoorCardViewModel.this.getCardSwitchRet().postValue(cardSwitcherBean);
                    }
                    this.$supportCallback.invoke2(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                DoorCardViewModel$loadCardSwitchList$1$isSupport$1 doorCardViewModel$loadCardSwitchList$1$isSupport$1 = new DoorCardViewModel$loadCardSwitchList$1$isSupport$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, doorCardViewModel$loadCardSwitchList$1$isSupport$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    CoroutineDispatcher io3 = Dispatchers.getIO();
                    DoorCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1 doorCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1 = new DoorCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1(this.$cardWrapper, null);
                    this.label = 2;
                    obj = BuildersKt.withContext(io3, doorCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cardSwitcherBean = (CardSwitcherBean) obj;
                    if (cardSwitcherBean != null) {
                        DoorCardViewModel.this.getCardSwitchRet().postValue(cardSwitcherBean);
                    }
                    this.$supportCallback.invoke2(Boxing.boxBoolean(true));
                } else {
                    this.$supportCallback.invoke2(Boxing.boxBoolean(false));
                }
            } catch (Exception e) {
                vqg.c("isSupportCardSwitch", e);
                e.printStackTrace();
                this.$supportCallback.invoke2(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1", f = "DoorCardViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06971(Function0<Unit> function0, Continuation<? super C06971> continuation) {
                    super(2, continuation);
                    this.$success = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06971(this.$success, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success.invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeBackupCloudCard$1$1$2", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ BaseResponse $baseResponse;
                final /* synthetic */ Function1<String, Unit> $fail;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super String, Unit> function1, BaseResponse baseResponse, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$fail = function1;
                    this.$baseResponse = baseResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$fail, this.$baseResponse, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fail.invoke2(this.$baseResponse.mMsg);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06961(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C06961> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$success = function0;
                this.$fail = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06961(this.$cardWrapper, this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BaseResponse baseResponseDelete = new CloudKeyCardOperation(this.$cardWrapper.mSeCard).delete();
                vqg.d("removeBackupCloudCard delete:" + baseResponseDelete.mResultCode + " mMsg:" + baseResponseDelete.mMsg);
                if (baseResponseDelete.isSuccess()) {
                    AnyExtKt.main$default(null, new C06971(this.$success, null), 1, null);
                } else {
                    AnyExtKt.main$default(null, new AnonymousClass2(this.$fail, baseResponseDelete, null), 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26991(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C26991> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$success = function0;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26991(this.$cardWrapper, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06961 c06961 = new C06961(this.$cardWrapper, this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06961, this) == coroutine_suspended) {
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
            return ((C26991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeCard$1", f = "DoorCardViewModel.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$removeCard$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06981(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C06981> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$success = function0;
                this.$fail = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function0 function0, Function1 function1, BaseResponse baseResponse) {
                AnyExtKt.main$default(null, new DoorCardViewModel$removeCard$1$1$1$1(baseResponse, function0, function1, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(Function1 function1, Throwable th) {
                vqg.c("deleteCard", th);
                AnyExtKt.main$default(null, new DoorCardViewModel$removeCard$1$1$2$1(function1, th, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06981(this.$cardWrapper, this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o4h<BaseResponse> o4hVarQ = s3q.f0().Q(this.$cardWrapper);
                final Function0<Unit> function0 = this.$success;
                final Function1<String, Unit> function1 = this.$fail;
                final Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DoorCardViewModel.C27001.C06981.invokeSuspend$lambda$0(function0, function1, (BaseResponse) obj2);
                    }
                };
                bg4<? super BaseResponse> bg4Var = new bg4() { // from class: com.xiaomi.fitness.nfc.ui.issued.f
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function2.invoke2(obj2);
                    }
                };
                final Function1<String, Unit> function3 = this.$fail;
                final Function1 function4 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.g
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DoorCardViewModel.C27001.C06981.invokeSuspend$lambda$2(function3, (Throwable) obj2);
                    }
                };
                o4hVarQ.O(bg4Var, new bg4() { // from class: com.xiaomi.fitness.nfc.ui.issued.h
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function4.invoke2(obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27001(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C27001> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$success = function0;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27001(this.$cardWrapper, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06981 c06981 = new C06981(this.$cardWrapper, this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06981, this) == coroutine_suspended) {
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
            return ((C27001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$setDefailtCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$setDefailtCard$1", f = "DoorCardViewModel.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$setDefailtCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$setDefailtCard$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06991(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C06991> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$success = function0;
                this.$fail = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function0 function0, Function1 function1, Boolean bool) {
                AnyExtKt.main$default(null, new DoorCardViewModel$setDefailtCard$1$1$1$1(bool, function0, function1, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(Function1 function1, Throwable th) {
                vqg.c("setDefaultCard", th);
                AnyExtKt.main$default(null, new DoorCardViewModel$setDefailtCard$1$1$2$1(function1, th, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06991(this.$cardWrapper, this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o4h<Boolean> o4hVarS1 = s3q.f0().s1(this.$cardWrapper);
                final Function0<Unit> function0 = this.$success;
                final Function1<String, Unit> function1 = this.$fail;
                final Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.i
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DoorCardViewModel.C27011.C06991.invokeSuspend$lambda$0(function0, function1, (Boolean) obj2);
                    }
                };
                bg4<? super Boolean> bg4Var = new bg4() { // from class: com.xiaomi.fitness.nfc.ui.issued.j
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function2.invoke2(obj2);
                    }
                };
                final Function1<String, Unit> function3 = this.$fail;
                final Function1 function4 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.k
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DoorCardViewModel.C27011.C06991.invokeSuspend$lambda$2(function3, (Throwable) obj2);
                    }
                };
                o4hVarS1.O(bg4Var, new bg4() { // from class: com.xiaomi.fitness.nfc.ui.issued.l
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function4.invoke2(obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27011(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C27011> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$success = function0;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27011(this.$cardWrapper, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06991 c06991 = new C06991(this.$cardWrapper, this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06991, this) == coroutine_suspended) {
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
            return ((C27011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$updateCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$updateCard$1", f = "DoorCardViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function1<CardWrapper, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$updateCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel$updateCard$1$1", f = "DoorCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function1<CardWrapper, Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07001(CardWrapper cardWrapper, Function1<? super CardWrapper, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C07001> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$success = function1;
                this.$fail = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function1 function1, CardWrapper cardWrapper) {
                AnyExtKt.main$default(null, new DoorCardViewModel$updateCard$1$1$1$1(function1, cardWrapper, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(Function1 function1, Throwable th) {
                AnyExtKt.main$default(null, new DoorCardViewModel$updateCard$1$1$2$1(function1, th, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07001(this.$cardWrapper, this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(this.$cardWrapper);
                final Function1<CardWrapper, Unit> function1 = this.$success;
                final Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.m
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DoorCardViewModel.C27021.C07001.invokeSuspend$lambda$0(function1, (CardWrapper) obj2);
                    }
                };
                bg4<? super CardWrapper> bg4Var = new bg4() { // from class: com.xiaomi.fitness.nfc.ui.issued.n
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function2.invoke2(obj2);
                    }
                };
                final Function1<String, Unit> function3 = this.$fail;
                final Function1 function4 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.o
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DoorCardViewModel.C27021.C07001.invokeSuspend$lambda$2(function3, (Throwable) obj2);
                    }
                };
                o4hVarZ1.O(bg4Var, new bg4() { // from class: com.xiaomi.fitness.nfc.ui.issued.p
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function4.invoke2(obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27021(CardWrapper cardWrapper, Function1<? super CardWrapper, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C27021> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$success = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27021(this.$cardWrapper, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07001 c07001 = new C07001(this.$cardWrapper, this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07001, this) == coroutine_suspended) {
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
            return ((C27021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData cardSwitchRet_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void backup2cloud(@NotNull CardWrapper cardWrapper, @NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(cardWrapper, success, fail, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<CardSwitcherBean> getCardSwitchRet() {
        return (MutableLiveData) this.cardSwitchRet.getValue();
    }

    public final void getDefaultAid(@NotNull Function1<? super String, Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26971(success, fail, null), 3, null);
    }

    public final void loadCardSwitchList(@NotNull CardWrapper cardWrapper, @NotNull Function1<? super Boolean, Unit> supportCallback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(supportCallback, "supportCallback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26981(supportCallback, cardWrapper, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }

    public final void removeBackupCloudCard(@NotNull CardWrapper cardWrapper, @NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26991(cardWrapper, success, fail, null), 3, null);
    }

    public final void removeCard(@NotNull CardWrapper cardWrapper, @NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27001(cardWrapper, success, fail, null), 3, null);
    }

    public final void setDefailtCard(@NotNull CardWrapper cardWrapper, @NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27011(cardWrapper, success, fail, null), 3, null);
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull Function1<? super CardWrapper, Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27021(cardWrapper, success, fail, null), 3, null);
    }
}
