package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.service.mi.BankCard;
import com.service.mi.entity.BaseResponse;
import com.service.mi.wallet.entity.resp.CardListResp;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.rvf;
import defpackage.vqg;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J.\u0010\b\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\"\u0010\u000f\u001a\u00020\u00052\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0011J*\u0010\u0014\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\nJ\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadList", "callBack", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "fail", "Lkotlin/Function0;", "checkPreAccountData", "callback", "Lkotlin/Function2;", "", "", "blePrepare", "success", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MasterCardListViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$blePrepare$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$blePrepare$1", f = "MasterCardListViewModel.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$blePrepare$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$blePrepare$1$1", f = "MasterCardListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$blePrepare$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$blePrepare$1$1$1", f = "MasterCardListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<String, Unit> $fail;
                final /* synthetic */ BaseResponse $response;
                final /* synthetic */ Function0<Unit> $success;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07021(BaseResponse baseResponse, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C07021> continuation) {
                    super(2, continuation);
                    this.$response = baseResponse;
                    this.$success = function0;
                    this.$fail = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07021(this.$response, this.$success, this.$fail, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$response.isStatusOK()) {
                        this.$success.invoke();
                    } else {
                        this.$fail.invoke2(NfcUtils.getMasterErrorMsg(this.$response.getResultCode(), this.$response.getSpErrors()));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07011(Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C07011> continuation) {
                super(2, continuation);
                this.$success = function0;
                this.$fail = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07011(this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BaseResponse baseResponseI = rvf.i();
                vqg.d("MiPayService.prepare() code:" + baseResponseI.getResultCode() + "  msg:" + baseResponseI.getMsg());
                AnyExtKt.main$default(null, new C07021(baseResponseI, this.$success, this.$fail, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function0;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07011 c07011 = new C07011(this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07011, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$checkPreAccountData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$checkPreAccountData$1", f = "MasterCardListViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, String, Unit> $callback;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$checkPreAccountData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$checkPreAccountData$1$1", f = "MasterCardListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<Boolean, String, Unit> $callback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07031(Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C07031> continuation) {
                super(2, continuation);
                this.$callback = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07031(this.$callback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                vqg.d("checkPreAccountData pre");
                BaseResponse baseResponseB = new rvf().b();
                vqg.d("checkUserBind code:" + baseResponseB.getResultCode() + "  msg:" + baseResponseB.getMsg());
                if (baseResponseB.isStatusOK()) {
                    BaseResponse baseResponseP = new rvf().p();
                    vqg.d("syncSe code:" + baseResponseP.getResultCode() + "  msg:" + baseResponseP.getMsg());
                    if (baseResponseP.isStatusOK()) {
                        this.$callback.invoke(Boxing.boxBoolean(true), null);
                    } else {
                        this.$callback.invoke(Boxing.boxBoolean(false), NfcUtils.getMasterErrorMsg(baseResponseP.getResultCode(), baseResponseP.getSpErrors()));
                    }
                } else {
                    this.$callback.invoke(Boxing.boxBoolean(false), NfcUtils.getMasterErrorMsg(baseResponseB.getResultCode(), baseResponseB.getSpErrors()));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27031(Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C27031> continuation) {
            super(2, continuation);
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27031(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07031 c07031 = new C07031(this.$callback, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07031, this) == coroutine_suspended) {
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
            return ((C27031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$loadList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$loadList$1", f = "MasterCardListViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<CardWrapper>, Unit> $callBack;
        final /* synthetic */ Function0<Unit> $fail;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$loadList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel$loadList$1$1", f = "MasterCardListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMasterCardListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MasterCardListViewModel.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterCardListViewModel$loadList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1863#2,2:181\n*S KotlinDebug\n*F\n+ 1 MasterCardListViewModel.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterCardListViewModel$loadList$1$1\n*L\n42#1:181,2\n*E\n"})
        public static final class C07041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<CardWrapper>, Unit> $callBack;
            final /* synthetic */ Function0<Unit> $fail;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07041(Function1<? super List<CardWrapper>, Unit> function1, Function0<Unit> function0, Continuation<? super C07041> continuation) {
                super(2, continuation);
                this.$callBack = function1;
                this.$fail = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07041(this.$callBack, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BaseResponse baseResponseF = new rvf().f();
                vqg.d("MiPayService().cardList code:" + baseResponseF.getResultCode() + "  msg:" + baseResponseF.getMsg());
                if (baseResponseF.isStatusOK()) {
                    ArrayList arrayList = new ArrayList();
                    Object data = baseResponseF.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.CardListResp");
                    List<BankCard> cardList = ((CardListResp) data).getCardList();
                    Intrinsics.checkNotNull(cardList);
                    Iterator<T> it = cardList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CardWrapper((BankCard) it.next()));
                    }
                    zl3.g().j.clear();
                    zl3.g().j.addAll(arrayList);
                    zl3.g().q();
                    vqg.d("MiPayService().cardList size:" + arrayList.size());
                    this.$callBack.invoke2(arrayList);
                } else {
                    vqg.d("MiPayService().cardList error:" + NfcUtils.getMasterErrorMsg(baseResponseF.getResultCode(), baseResponseF.getSpErrors()));
                    this.$fail.invoke();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27041(Function1<? super List<CardWrapper>, Unit> function1, Function0<Unit> function0, Continuation<? super C27041> continuation) {
            super(2, continuation);
            this.$callBack = function1;
            this.$fail = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27041(this.$callBack, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07041 c07041 = new C07041(this.$callBack, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07041, this) == coroutine_suspended) {
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
            return ((C27041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void blePrepare(@NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(success, fail, null), 3, null);
    }

    public final void checkPreAccountData(@NotNull Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27031(callback, null), 3, null);
    }

    public final void loadList(@NotNull Function1<? super List<CardWrapper>, Unit> callBack, @NotNull Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27041(callBack, fail, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }
}
