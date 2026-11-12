package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.RefundInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.UncompletedOrderList;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.gzp;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\t0\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardOrderDetailViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lcom/miui/tsmclient/model/BaseResponse;", "getUncompletedOrderList", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "", "orderId", "Lkotlin/Function1;", "Lcom/miui/tsmclient/sesdk/OrderData$OrderRecordDetail;", "success", "fail", "loadOrderDetail", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "orderRecordDetail", "Lcom/miui/tsmclient/entity/RefundInfo;", "refound", "(Lcom/miui/tsmclient/sesdk/OrderData$OrderRecordDetail;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "recharge", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "remindMessage", "checkUncompletedTypeCanReturn", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardOrderDetailViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel$checkUncompletedTypeCanReturn$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel$checkUncompletedTypeCanReturn$1", f = "CardOrderDetailViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCardOrderDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardOrderDetailViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardOrderDetailViewModel$checkUncompletedTypeCanReturn$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1863#2,2:131\n1#3:133\n*S KotlinDebug\n*F\n+ 1 CardOrderDetailViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardOrderDetailViewModel$checkUncompletedTypeCanReturn$1\n*L\n106#1:131,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $remindMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CardWrapper cardWrapper, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$remindMessage = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardOrderDetailViewModel.this.new AnonymousClass1(this.$cardWrapper, this.$remindMessage, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.String] */
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
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardOrderDetailViewModel cardOrderDetailViewModel = CardOrderDetailViewModel.this;
                CardWrapper cardWrapper = this.$cardWrapper;
                this.label = 1;
                obj = cardOrderDetailViewModel.getUncompletedOrderList(cardWrapper, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            if (!baseResponse.isSuccess() || (objArr = baseResponse.mDatas) == null || objArr.length == 0) {
                Function1<String, Unit> function1 = this.$remindMessage;
                String string = baseResponse.mMsg;
                if (string.length() == 0) {
                    string = ApplicationExtKt.getApplication().getString(o0j.t2);
                }
                function1.invoke2(string);
            } else {
                Object obj2 = objArr[0];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.miui.tsmclient.sesdk.UncompletedOrderList");
                UncompletedOrderList uncompletedOrderList = (UncompletedOrderList) obj2;
                if (uncompletedOrderList.isEmpty()) {
                    this.$remindMessage.invoke2(null);
                } else {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    List<UncompletedOrderList.UncompletedOrder> list = uncompletedOrderList.getList();
                    Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
                    CardWrapper cardWrapper2 = this.$cardWrapper;
                    for (UncompletedOrderList.UncompletedOrder uncompletedOrder : list) {
                        vqg.d("uncompletedOrderList = " + uncompletedOrder.getType() + "SeCard.aid =  " + cardWrapper2.mSeCard.getAid() + " it.aid =  " + uncompletedOrder.getAid());
                        if (StringsKt__StringsJVMKt.equals(cardWrapper2.mSeCard.getAid(), uncompletedOrder.getAid(), true) && uncompletedOrder.getType() == 4) {
                            objectRef.element = ApplicationExtKt.getApplication().getString(o0j.c2);
                        }
                    }
                    this.$remindMessage.invoke2(objectRef.element);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel$getUncompletedOrderList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel", f = "CardOrderDetailViewModel.kt", i = {}, l = {122}, m = "getUncompletedOrderList", n = {}, s = {})
    public static final class C26761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26761(Continuation<? super C26761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardOrderDetailViewModel.this.getUncompletedOrderList(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUncompletedOrderList(CardWrapper cardWrapper, Continuation<? super BaseResponse> continuation) {
        C26761 c26761;
        if (continuation instanceof C26761) {
            c26761 = (C26761) continuation;
            int i = c26761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26761.label = i - Integer.MIN_VALUE;
            } else {
                c26761 = new C26761(continuation);
            }
        } else {
            c26761 = new C26761(continuation);
        }
        Object objWithContext = c26761.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CardOrderDetailViewModel$getUncompletedOrderList$response$1 cardOrderDetailViewModel$getUncompletedOrderList$response$1 = new CardOrderDetailViewModel$getUncompletedOrderList$response$1(cardWrapper, null);
            c26761.label = 1;
            objWithContext = BuildersKt.withContext(io2, cardOrderDetailViewModel$getUncompletedOrderList$response$1, c26761);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        BaseResponse baseResponse = (BaseResponse) objWithContext;
        Intrinsics.checkNotNull(baseResponse);
        return baseResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOrderDetail$lambda$0(Function1 success, OrderData.OrderRecordDetail orderRecordDetail) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke2(orderRecordDetail);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadOrderDetail$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOrderDetail$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("getOrderDetailById", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadOrderDetail$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recharge$lambda$10(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("recharge", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recharge$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recharge$lambda$8(CardWrapper cardWrapper, Function0 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (baseResponse.isSuccess()) {
            cardWrapper.mOrderInfo = null;
            success.invoke();
        } else if (gzp.c(cardWrapper)) {
            String strD = fmg.d(baseResponse.mMsg);
            Intrinsics.checkNotNullExpressionValue(strD, "getRechargeErrorMsg(...)");
            fail.invoke2(strD);
        } else {
            String mMsg = baseResponse.mMsg;
            Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
            fail.invoke2(mMsg);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recharge$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refound$lambda$4(Function1 success, RefundInfo refundInfo) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke2(refundInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refound$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refound$lambda$6(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("getOrderDetailById", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refound$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkUncompletedTypeCanReturn(@NotNull CardWrapper cardWrapper, @NotNull Function1<? super String, Unit> remindMessage) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(remindMessage, "remindMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(cardWrapper, remindMessage, null), 3, null);
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void loadOrderDetail(@NotNull CardWrapper cardWrapper, @NotNull String orderId, @NotNull final Function1<? super OrderData.OrderRecordDetail, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<OrderData.OrderRecordDetail> o4hVarI0 = s3q.f0().i0(cardWrapper, orderId);
        final Function1 function1 = new Function1() { // from class: gp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailViewModel.loadOrderDetail$lambda$0(success, (OrderData.OrderRecordDetail) obj);
            }
        };
        bg4<? super OrderData.OrderRecordDetail> bg4Var = new bg4() { // from class: hp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardOrderDetailViewModel.loadOrderDetail$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ip3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailViewModel.loadOrderDetail$lambda$2(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarI0.O(bg4Var, new bg4() { // from class: jp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardOrderDetailViewModel.loadOrderDetail$lambda$3(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void recharge(@NotNull final CardWrapper cardWrapper, @NotNull String orderId, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarL1 = s3q.f0().l1(cardWrapper, orderId);
        final Function1 function1 = new Function1() { // from class: kp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailViewModel.recharge$lambda$8(cardWrapper, success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: lp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardOrderDetailViewModel.recharge$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: bp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailViewModel.recharge$lambda$10(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarL1.O(bg4Var, new bg4() { // from class: cp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardOrderDetailViewModel.recharge$lambda$11(function2, obj);
            }
        }));
    }

    public final void refound(@NotNull OrderData.OrderRecordDetail orderRecordDetail, @NotNull final Function1<? super RefundInfo, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(orderRecordDetail, "orderRecordDetail");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<RefundInfo> o4hVarM1 = s3q.f0().m1(orderRecordDetail);
        final Function1 function1 = new Function1() { // from class: ap3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailViewModel.refound$lambda$4(success, (RefundInfo) obj);
            }
        };
        bg4<? super RefundInfo> bg4Var = new bg4() { // from class: dp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardOrderDetailViewModel.refound$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ep3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardOrderDetailViewModel.refound$lambda$6(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarM1.O(bg4Var, new bg4() { // from class: fp3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardOrderDetailViewModel.refound$lambda$7(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
