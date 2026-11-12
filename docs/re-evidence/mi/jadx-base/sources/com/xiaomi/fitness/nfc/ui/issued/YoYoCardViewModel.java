package com.xiaomi.fitness.nfc.ui.issued;

import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.apdu.ApduManager;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBean;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoRequest;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.CommandRequest;
import com.xiaomi.fitness.nfc.request.YoYoCardRequest;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.o63;
import defpackage.qrk;
import defpackage.s3q;
import defpackage.vqg;
import defpackage.yl3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tJ.\u0010\r\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tJ*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J(\u0010\u0012\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "yoYoCardRequest", "Lcom/xiaomi/fitness/nfc/request/YoYoCardRequest;", "loadCard", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoBean;", "error", "", "createNewCard", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CommandRequest;", "issue", "commandRequest", "Lkotlin/Function0;", "removeCard", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YoYoCardViewModel extends AbsViewModel {

    @NotNull
    private YoYoCardRequest yoYoCardRequest = new YoYoCardRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1", f = "YoYoCardViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $error;
        final /* synthetic */ Function1<CommandRequest, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $error;
            final /* synthetic */ Function1<CommandRequest, Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CommandRequest $commandRequest;
                final /* synthetic */ Function1<CommandRequest, Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07061(Function1<? super CommandRequest, Unit> function1, CommandRequest commandRequest, Continuation<? super C07061> continuation) {
                    super(2, continuation);
                    this.$success = function1;
                    this.$commandRequest = commandRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07061(this.$success, this.$commandRequest, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success.invoke2(this.$commandRequest);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$createNewCard$1$1$2", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Exception $e;
                final /* synthetic */ Function1<String, Unit> $error;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super String, Unit> function1, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$error = function1;
                    this.$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$error, this.$e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function1<String, Unit> function1 = this.$error;
                    String message = this.$e.getMessage();
                    Intrinsics.checkNotNull(message);
                    function1.invoke2(message);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07051(Function1<? super CommandRequest, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C07051> continuation) {
                super(2, continuation);
                this.$success = function1;
                this.$error = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07051(this.$success, this.$error, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    CardInfoRequest cardInfoRequestBuildCardInfo = NfcUtils.buildCardInfo();
                    AnyExtKt.main$default(null, new C07061(this.$success, new CommandRequest(cardInfoRequestBuildCardInfo.getCplc(), cardInfoRequestBuildCardInfo.getDevice_id(), cardInfoRequestBuildCardInfo.getDevice_model()), null), 1, null);
                } catch (Exception e) {
                    AnyExtKt.main$default(null, new AnonymousClass2(this.$error, e, null), 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super CommandRequest, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function1;
            this.$error = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$success, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07051 c07051 = new C07051(this.$success, this.$error, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07051, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$issue$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$issue$1", f = "YoYoCardViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandRequest $commandRequest;
        final /* synthetic */ Function0<Unit> $error;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$issue$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$issue$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CommandRequest $commandRequest;
            final /* synthetic */ Function0<Unit> $error;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$issue$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$issue$1$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $error;
                final /* synthetic */ qrk $response;
                final /* synthetic */ Function0<Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07081(qrk qrkVar, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super C07081> continuation) {
                    super(2, continuation);
                    this.$response = qrkVar;
                    this.$success = function0;
                    this.$error = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07081(this.$response, this.$success, this.$error, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$response.a()) {
                        o63.b(new yl3(true));
                        ltg.c().s(6, 1);
                        ltg.c().w(false);
                        this.$success.invoke();
                    } else {
                        ltg.c().s(6, 2);
                        this.$error.invoke();
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07071(CommandRequest commandRequest, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super C07071> continuation) {
                super(2, continuation);
                this.$commandRequest = commandRequest;
                this.$success = function0;
                this.$error = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07071(this.$commandRequest, this.$success, this.$error, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ltg.c().s(6, 0);
                    ApduManager apduManager = ApduManager.INSTANCE;
                    CommandRequest commandRequest = this.$commandRequest;
                    this.label = 1;
                    obj = apduManager.startAction(0, commandRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                qrk qrkVar = (qrk) obj;
                vqg.d("YoYoCardViewModel issue result " + qrkVar.a());
                AnyExtKt.main$default(null, new C07081(qrkVar, this.$success, this.$error, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27081(CommandRequest commandRequest, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super C27081> continuation) {
            super(2, continuation);
            this.$commandRequest = commandRequest;
            this.$success = function0;
            this.$error = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27081(this.$commandRequest, this.$success, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07071 c07071 = new C07071(this.$commandRequest, this.$success, this.$error, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07071, this) == coroutine_suspended) {
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
            return ((C27081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1", f = "YoYoCardViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $error;
        final /* synthetic */ Function1<CardInfoBean, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $error;
            final /* synthetic */ Function1<CardInfoBean, Unit> $success;
            int label;
            final /* synthetic */ YoYoCardViewModel this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CardInfoBean $cardInfo;
                final /* synthetic */ Function1<CardInfoBean, Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07101(Function1<? super CardInfoBean, Unit> function1, CardInfoBean cardInfoBean, Continuation<? super C07101> continuation) {
                    super(2, continuation);
                    this.$success = function1;
                    this.$cardInfo = cardInfoBean;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07101(this.$success, this.$cardInfo, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success.invoke2(this.$cardInfo);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$loadCard$1$1$2", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Exception $e;
                final /* synthetic */ Function1<String, Unit> $error;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super String, Unit> function1, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$error = function1;
                    this.$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$error, this.$e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function1<String, Unit> function1 = this.$error;
                    String message = this.$e.getMessage();
                    Intrinsics.checkNotNull(message);
                    function1.invoke2(message);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07091(YoYoCardViewModel yoYoCardViewModel, Function1<? super CardInfoBean, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C07091> continuation) {
                super(2, continuation);
                this.this$0 = yoYoCardViewModel;
                this.$success = function1;
                this.$error = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07091(this.this$0, this.$success, this.$error, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CardInfoRequest cardInfoRequestBuildCardInfo = NfcUtils.buildCardInfo();
                        YoYoCardRequest yoYoCardRequest = this.this$0.yoYoCardRequest;
                        this.label = 1;
                        obj = yoYoCardRequest.cardInfo(cardInfoRequestBuildCardInfo, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CardInfoBean cardInfo = ((CardInfoResponse) obj).getCardInfo();
                    if (Intrinsics.areEqual(cardInfo.getCardStatus(), "00") || Intrinsics.areEqual(cardInfo.getCardStatus(), CardInfoBeanKt.sStatusDisableCard)) {
                        vqg.d("YoYoCardViewModel loadCard cardStatus is " + cardInfo.getCardStatus() + " cardNo:" + cardInfo.getFaceNo());
                        ltg.c().w(true);
                    } else if (Intrinsics.areEqual(cardInfo.getCardStatus(), "01")) {
                        ltg.c().y();
                    }
                    if (Intrinsics.areEqual(cardInfo.getCardStatus(), "00")) {
                        cardInfo.setBalance(ltg.c().a("A000000322100701"));
                        vqg.d("YoYoCardViewModel loadCard getBalance:" + cardInfo.getBalance());
                    }
                    AnyExtKt.main$default(null, new C07101(this.$success, cardInfo, null), 1, null);
                } catch (Exception e) {
                    AnyExtKt.main$default(null, new AnonymousClass2(this.$error, e, null), 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27091(Function1<? super CardInfoBean, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C27091> continuation) {
            super(2, continuation);
            this.$success = function1;
            this.$error = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return YoYoCardViewModel.this.new C27091(this.$success, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07091 c07091 = new C07091(YoYoCardViewModel.this, this.$success, this.$error, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07091, this) == coroutine_suspended) {
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
            return ((C27091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1", f = "YoYoCardViewModel.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $error;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $error;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1$1$1", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<String, Unit> $error;
                final /* synthetic */ qrk $response;
                final /* synthetic */ Function0<Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07121(qrk qrkVar, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C07121> continuation) {
                    super(2, continuation);
                    this.$response = qrkVar;
                    this.$success = function0;
                    this.$error = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07121(this.$response, this.$success, this.$error, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$response.a()) {
                        ltg.c().x();
                        this.$success.invoke();
                    } else {
                        this.$error.invoke2(ResourceExtKt.getString(o0j.common_delete_failure));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel$removeCard$1$1$2", f = "YoYoCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Exception $e;
                final /* synthetic */ Function1<String, Unit> $error;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Function1<? super String, Unit> function1, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$error = function1;
                    this.$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$error, this.$e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Function1<String, Unit> function1 = this.$error;
                    String message = this.$e.getMessage();
                    Intrinsics.checkNotNull(message);
                    function1.invoke2(message);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07111(Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C07111> continuation) {
                super(2, continuation);
                this.$success = function0;
                this.$error = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07111(this.$success, this.$error, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        vqg.d("YoYoCardViewModel removeCard start");
                        CardInfoRequest cardInfoRequestBuildCardInfo = NfcUtils.buildCardInfo();
                        CommandRequest commandRequest = new CommandRequest(cardInfoRequestBuildCardInfo.getCplc(), cardInfoRequestBuildCardInfo.getDevice_id(), cardInfoRequestBuildCardInfo.getDevice_model());
                        ApduManager apduManager = ApduManager.INSTANCE;
                        this.label = 1;
                        obj = apduManager.startAction(1, commandRequest, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    qrk qrkVar = (qrk) obj;
                    vqg.d("YoYoCardViewModel removeCard result " + qrkVar.a());
                    AnyExtKt.main$default(null, new C07121(qrkVar, this.$success, this.$error, null), 1, null);
                } catch (Exception e) {
                    AnyExtKt.main$default(null, new AnonymousClass2(this.$error, e, null), 1, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27101(Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C27101> continuation) {
            super(2, continuation);
            this.$success = function0;
            this.$error = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27101(this.$success, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07111 c07111 = new C07111(this.$success, this.$error, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07111, this) == coroutine_suspended) {
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
            return ((C27101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void createNewCard(@NotNull Function1<? super CommandRequest, Unit> success, @NotNull Function1<? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(success, error, null), 3, null);
    }

    public final void issue(@NotNull CommandRequest commandRequest, @NotNull Function0<Unit> success, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(commandRequest, "commandRequest");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27081(commandRequest, success, error, null), 3, null);
    }

    public final void loadCard(@NotNull Function1<? super CardInfoBean, Unit> success, @NotNull Function1<? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            s3q.f0().t0(wearableDeviceModel);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27091(success, error, null), 3, null);
    }

    public final void removeCard(@NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27101(success, error, null), 3, null);
    }
}
