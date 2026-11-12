package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.RefundAuthorizationInfo;
import com.miui.tsmclient.entity.RefundChannelInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.RefundAuthorizationOperation;
import com.miui.tsmclient.sesdk.SeCard;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.jtk;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.o63;
import defpackage.s3q;
import defpackage.stk;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b>\u0010?J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u000b0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0016\u0010\u0017JU\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u001b\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J[\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2&\u0010)\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020'\u0018\u00010&j\n\u0012\u0004\u0012\u00020'\u0018\u0001`(\u0012\u0004\u0012\u00020\u000b0\u00102\u0014\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b+\u0010,JQ\u00100\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0014\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u000b0\u00102\u0014\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b0\u00101J;\u00105\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u00102\u001a\u00020\u00142\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/content/Context;", "context", "Lcom/miui/tsmclient/entity/CardInfo;", "mCardInfo", "Lcom/miui/tsmclient/model/BaseResponse;", "queryRefundChannels", "(Landroid/content/Context;Lcom/miui/tsmclient/entity/CardInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "", "Lstk;", "success", "", "fail", "getReturnReasons", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "name", "alipy", "phone", "returnCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_TYPE, TSMAuthContants.PARAM_AUTH_CODE, "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/miui/tsmclient/sesdk/SeCard;", "mSeCard", "Ljava/util/ArrayList;", "Lcom/miui/tsmclient/entity/RefundChannelInfo;", "Lkotlin/collections/ArrayList;", "refundChannelInfos", "error", "refundChannels", "(Landroid/content/Context;Lcom/miui/tsmclient/sesdk/SeCard;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", TSMAuthContants.EXTRA_REFUND_CHANNEL_INFO, "Lcom/miui/tsmclient/entity/RefundAuthorizationInfo;", "refundAuthorizationInfo", "authInfo", "(Landroid/content/Context;Lcom/miui/tsmclient/entity/RefundChannelInfo;Lcom/miui/tsmclient/sesdk/SeCard;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "code", "", "isSuc", "bindAuthorization", "(Lcom/miui/tsmclient/entity/RefundChannelInfo;Lcom/miui/tsmclient/sesdk/SeCard;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardReturnNoticeViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$authInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$authInfo$1", f = "CardReturnNoticeViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $error;
        final /* synthetic */ SeCard $mSeCard;
        final /* synthetic */ Function1<RefundAuthorizationInfo, Unit> $refundAuthorizationInfo;
        final /* synthetic */ RefundChannelInfo $refundChannelInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super RefundAuthorizationInfo, Unit> function1, Function1<? super String, Unit> function2, SeCard seCard, RefundChannelInfo refundChannelInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$refundAuthorizationInfo = function1;
            this.$error = function2;
            this.$mSeCard = seCard;
            this.$refundChannelInfo = refundChannelInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$refundAuthorizationInfo, this.$error, this.$mSeCard, this.$refundChannelInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CardReturnNoticeViewModel$authInfo$1$response$1 cardReturnNoticeViewModel$authInfo$1$response$1 = new CardReturnNoticeViewModel$authInfo$1$response$1(this.$mSeCard, this.$refundChannelInfo, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, cardReturnNoticeViewModel$authInfo$1$response$1, this);
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
                this.$refundAuthorizationInfo.invoke2(null);
                this.$error.invoke2(baseResponse.mMsg);
            } else {
                Logger.i("TSM", "getAuthInfo = " + objArr[0]);
                Object obj2 = baseResponse.mDatas[0];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.miui.tsmclient.entity.RefundAuthorizationInfo");
                this.$refundAuthorizationInfo.invoke2((RefundAuthorizationInfo) obj2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$bindAuthorization$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$bindAuthorization$1", f = "CardReturnNoticeViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        final /* synthetic */ Function1<Boolean, Unit> $isSuc;
        final /* synthetic */ SeCard $mSeCard;
        final /* synthetic */ RefundChannelInfo $refundChannelInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26921(Function1<? super Boolean, Unit> function1, SeCard seCard, RefundChannelInfo refundChannelInfo, String str, Continuation<? super C26921> continuation) {
            super(2, continuation);
            this.$isSuc = function1;
            this.$mSeCard = seCard;
            this.$refundChannelInfo = refundChannelInfo;
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26921(this.$isSuc, this.$mSeCard, this.$refundChannelInfo, this.$code, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CardReturnNoticeViewModel$bindAuthorization$1$response$1 cardReturnNoticeViewModel$bindAuthorization$1$response$1 = new CardReturnNoticeViewModel$bindAuthorization$1$response$1(this.$mSeCard, this.$refundChannelInfo, this.$code, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, cardReturnNoticeViewModel$bindAuthorization$1$response$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((BaseResponse) obj).isSuccess()) {
                this.$isSuc.invoke2(Boxing.boxBoolean(true));
            } else {
                this.$isSuc.invoke2(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$queryRefundChannels$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel", f = "CardReturnNoticeViewModel.kt", i = {}, l = {134}, m = "queryRefundChannels", n = {}, s = {})
    public static final class C26931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26931(Continuation<? super C26931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardReturnNoticeViewModel.this.queryRefundChannels(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$refundChannels$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$refundChannels$1", f = "CardReturnNoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $error;
        final /* synthetic */ SeCard $mSeCard;
        final /* synthetic */ Function1<ArrayList<RefundChannelInfo>, Unit> $refundChannelInfos;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26941(SeCard seCard, Function1<? super ArrayList<RefundChannelInfo>, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C26941> continuation) {
            super(2, continuation);
            this.$mSeCard = seCard;
            this.$refundChannelInfos = function1;
            this.$error = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26941(this.$mSeCard, this.$refundChannelInfos, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseResponse baseResponseQueryRefundChannels = new RefundAuthorizationOperation(this.$mSeCard).queryRefundChannels();
            if (!baseResponseQueryRefundChannels.isSuccess() || (objArr = baseResponseQueryRefundChannels.mDatas) == null || objArr.length == 0) {
                this.$refundChannelInfos.invoke2(null);
                this.$error.invoke2(baseResponseQueryRefundChannels.mMsg);
            } else {
                Object obj2 = objArr[0];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.miui.tsmclient.entity.RefundChannelInfo>");
                this.$refundChannelInfos.invoke2((ArrayList) obj2);
                this.$error.invoke2(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReturnReasons$lambda$0(Function1 success, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(list);
        success.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getReturnReasons$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReturnReasons$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("getReturnReasons", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getReturnReasons$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object queryRefundChannels(Context context, CardInfo cardInfo, Continuation<? super BaseResponse> continuation) {
        C26931 c26931;
        if (continuation instanceof C26931) {
            c26931 = (C26931) continuation;
            int i = c26931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26931.label = i - Integer.MIN_VALUE;
            } else {
                c26931 = new C26931(continuation);
            }
        } else {
            c26931 = new C26931(continuation);
        }
        Object objWithContext = c26931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CardReturnNoticeViewModel$queryRefundChannels$result$1 cardReturnNoticeViewModel$queryRefundChannels$result$1 = new CardReturnNoticeViewModel$queryRefundChannels$result$1(context, cardInfo, null);
            c26931.label = 1;
            objWithContext = BuildersKt.withContext(io2, cardReturnNoticeViewModel$queryRefundChannels$result$1, c26931);
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
    public static final Unit returnCard$lambda$10(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("returnCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnCard$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnCard$lambda$4(Function1 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (baseResponse.isSuccess()) {
            String mMsg = baseResponse.mMsg;
            Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
            success.invoke2(mMsg);
            o63.b(new jtk());
        } else {
            String string = baseResponse.mMsg;
            if (string == null) {
                string = ResourceExtKt.getString(o0j.o4);
            }
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnCard$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnCard$lambda$6(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("returnCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnCard$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnCard$lambda$8(Function1 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (baseResponse.isSuccess()) {
            String mMsg = baseResponse.mMsg;
            Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
            success.invoke2(mMsg);
            o63.b(new jtk());
        } else {
            String string = baseResponse.mMsg;
            if (string == null) {
                string = ResourceExtKt.getString(o0j.o4);
            }
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnCard$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void authInfo(@NotNull Context context, @NotNull RefundChannelInfo refundChannelInfo, @NotNull SeCard mSeCard, @NotNull Function1<? super RefundAuthorizationInfo, Unit> refundAuthorizationInfo, @NotNull Function1<? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(refundChannelInfo, "refundChannelInfo");
        Intrinsics.checkNotNullParameter(mSeCard, "mSeCard");
        Intrinsics.checkNotNullParameter(refundAuthorizationInfo, "refundAuthorizationInfo");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(refundAuthorizationInfo, error, mSeCard, refundChannelInfo, null), 3, null);
    }

    public final void bindAuthorization(@NotNull RefundChannelInfo refundChannelInfo, @NotNull SeCard mSeCard, @NotNull String code, @NotNull Function1<? super Boolean, Unit> isSuc) {
        Intrinsics.checkNotNullParameter(refundChannelInfo, "refundChannelInfo");
        Intrinsics.checkNotNullParameter(mSeCard, "mSeCard");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(isSuc, "isSuc");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26921(isSuc, mSeCard, refundChannelInfo, code, null), 3, null);
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void getReturnReasons(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super List<? extends stk>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<List<stk>> o4hVarK0 = s3q.f0().k0(cardWrapper);
        final Function1 function1 = new Function1() { // from class: dr3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeViewModel.getReturnReasons$lambda$0(success, (List) obj);
            }
        };
        bg4<? super List<stk>> bg4Var = new bg4() { // from class: er3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardReturnNoticeViewModel.getReturnReasons$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: fr3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeViewModel.getReturnReasons$lambda$2(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarK0.O(bg4Var, new bg4() { // from class: gr3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardReturnNoticeViewModel.getReturnReasons$lambda$3(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void refundChannels(@NotNull Context context, @NotNull SeCard mSeCard, @NotNull Function1<? super ArrayList<RefundChannelInfo>, Unit> refundChannelInfos, @NotNull Function1<? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mSeCard, "mSeCard");
        Intrinsics.checkNotNullParameter(refundChannelInfos, "refundChannelInfos");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C26941(mSeCard, refundChannelInfos, error, null), 2, null);
    }

    public final void returnCard(@NotNull CardWrapper cardWrapper, @NotNull String name, @NotNull String alipy, @NotNull String phone, @NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alipy, "alipy");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarQ1 = s3q.f0().q1(cardWrapper, name, alipy, phone);
        final Function1 function1 = new Function1() { // from class: hr3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeViewModel.returnCard$lambda$4(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: ir3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardReturnNoticeViewModel.returnCard$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: yq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeViewModel.returnCard$lambda$6(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarQ1.O(bg4Var, new bg4() { // from class: zq3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardReturnNoticeViewModel.returnCard$lambda$7(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void returnCard(@NotNull CardWrapper cardWrapper, @NotNull String payAccountType, @NotNull String authCode, @NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(payAccountType, "payAccountType");
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarP1 = s3q.f0().p1(cardWrapper, payAccountType, authCode);
        final Function1 function1 = new Function1() { // from class: xq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeViewModel.returnCard$lambda$8(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: ar3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardReturnNoticeViewModel.returnCard$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: br3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeViewModel.returnCard$lambda$10(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarP1.O(bg4Var, new bg4() { // from class: cr3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardReturnNoticeViewModel.returnCard$lambda$11(function2, obj);
            }
        }));
    }
}
